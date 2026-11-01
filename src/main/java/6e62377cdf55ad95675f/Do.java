package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Do<V> {

private transient moom.Dp<V>[] a;

private transient int b;

private int c;

private int d;

private float e;

private volatile transient int f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public Do() { super(); }


private static void __sourceConstructorBody_795427101100e04b(moom.Do receiver) throws Throwable {

long local1 = (moom.Do.g ^ 24634216606749L);

    moom.Do.__sourceConstructorInit_795427101100e04b_0(((moom.Do)(receiver)));

    ((moom.Do)(receiver)).a = ((moom.Dp[])(new moom.Dp[__sourceIntrinsic_795427101100e04b_originalDynamicSite1927_2(26399, (7146985421992112137L ^ local1))]));

    ((moom.Do)(receiver)).d = ((int)(__sourceIntrinsic_795427101100e04b_originalDynamicSite1927_4(8124, (1756045911013312684L ^ local1))));

    ((moom.Do)(receiver)).e = ((float)(0x1.8p-1f));

    ((moom.Do)(receiver)).c = ((int)(((((moom.Do)(receiver)).a).length - 1)));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-2488848019960057296L)), ((long)(3602954455906901532L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(275958941113414L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Do.g ^ 82113386457196L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill696_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill696_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill696_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill696_14 = new byte[8];
    (__sourceSpill696_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill696_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation696_16 = __sourceSpill696_14;
    ((javax.crypto.Cipher)(__sourceSpill696_11)).init(((int)(__sourceSpill696_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill696_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation696_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "gþí@fà©H=Fk}ËWÒ+cVãþ!ð Õ£º9ïl+§ì\036\026öN½%Alåd \023q"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill696_25 = local6_life21;
        int __sourceSpill696_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill696_25)).substring(((int)(__sourceSpill696_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill696_30 = local8_life19;
        int __sourceSpill696_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill696_33 = new byte[8];
        (__sourceSpill696_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill696_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill696_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill696_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill696_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill696_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill696_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill696_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill696_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill696_34)).doFinal(((byte[])(__sourceSpill696_33)));
        (__sourceSpill696_30)[__sourceSpill696_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\005¶HÝ?Ý¬PêÓ\006ÈÑµ6"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill696_38 = local6_life21;
        int __sourceSpill696_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill696_38)).substring(((int)(__sourceSpill696_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill696_43 = local8_life19;
        int __sourceSpill696_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill696_46 = new byte[8];
        (__sourceSpill696_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill696_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill696_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill696_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill696_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill696_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill696_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill696_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill696_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill696_47)).doFinal(((byte[])(__sourceSpill696_46)));
        (__sourceSpill696_43)[__sourceSpill696_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_795427101100e04b_0(moom.Do a0) throws E;

final moom.Dp<V> b__Dp(long p0) {
moom.Dp lexicalValue566_61_0;
    moom.Dp lexicalValue566_61_1;
    moom.Dp lexicalValue566_67_0;
    moom.Dp lexicalValue566_71_0;
    boolean spill566_0;
    moom.Dp spill566_1;
    moom.Dp spill566_2;
    moom.Dp spill566_3;
    long life3_3;
    int life6_7;
    int life5_8;
    int life7_13;
    moom.Dp life8_18;
    moom.Dp life9_20;
    moom.Dp life10_25;
    lexical_join_71: {
    lexical_join_70: {
    life3_3 = (moom.Do.g ^ 120496894012173L);
    spill566_0 = moom.DS.b__Boolean();
    life6_7 = __sourceExactCall_c00653f984226d(((long)(p0)));
    life5_8 = ((spill566_0) ? 1 : 0);
    life7_13 = __sourceExactCall_5330543039a8e2(((int)(life6_7)), ((int)(this.c)));
    life8_18 = (this.a)[life7_13];
    life9_20 = life8_18;
    lexical_cycle_21: while (true) {
    lexical_join_67: {
    lexical_join_64: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_59: {
    if (!((life9_20 != null))) {
        break lexical_join_70;
    }
    life10_25 = ((moom.Dp)(life9_20)).c;
    spill566_1 = life9_20;
    if (!((life5_8 == 0))) {
        lexicalValue566_71_0 = spill566_1;
        break lexical_join_71;
    }
    if (!((life5_8 == 0))) {
        lexicalValue566_67_0 = spill566_1;
        break lexical_join_67;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.Dp)(spill566_1)).a)), ((long)(p0))) == 0))) {
        break lexical_join_64;
    }
    moom.Do __stackOp566_10_0 = this;
    ((moom.Do)(__stackOp566_10_0)).f = ((int)((((moom.Do)(__stackOp566_10_0)).f + 1)));
    moom.Do __stackOp566_13_0 = this;
    ((moom.Do)(__stackOp566_13_0)).b = ((int)((((moom.Do)(__stackOp566_13_0)).b - 1)));
    spill566_2 = life8_18;
    spill566_3 = life9_20;
    if (!((life5_8 == 0))) {
        lexicalValue566_61_0 = spill566_2;
        lexicalValue566_61_1 = spill566_3;
        break lexical_join_61;
    }
    if (!((spill566_2 == spill566_3))) {
        break lexical_join_59;
    }
    (this.a)[life7_13] = life10_25;
    if (!((life5_8 != 0))) {
        break lexical_join_62;
    }
    }
    lexicalValue566_61_0 = life8_18;
    lexicalValue566_61_1 = life10_25;
    }
    ((moom.Dp)(lexicalValue566_61_0)).c = ((moom.Dp)(lexicalValue566_61_1));
    }
    return life9_20;
    }
    life8_18 = life9_20;
    lexicalValue566_67_0 = life10_25;
    }
    life9_20 = lexicalValue566_67_0;
    if (!((life5_8 != 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue566_71_0 = life9_20;
    }
    return lexicalValue566_71_0;
}


public V b(long p0) {
moom.Dp forwardValue1746_17_0;
    java.lang.Object forwardValue1746_18_0;
    boolean spill1746_0;
    moom.Dp spill1746_1;
    long life3_3;
    moom.Dp life6_8;
    int life5_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.Do.g ^ 91054152916205L);
    spill1746_0 = moom.DS.b__Boolean();
    life6_8 = ((moom.Do)(this)).b__Dp(((long)(p0)));
    life5_9 = ((spill1746_0) ? 1 : 0);
    spill1746_1 = life6_8;
    if (!((life5_9 == 0))) {
        forwardValue1746_17_0 = spill1746_1;
        break forward_join_17;
    }
    if (!((spill1746_1 == null))) {
        break forward_join_16;
    }
    forwardValue1746_18_0 = null;
    break forward_join_18;
    }
    forwardValue1746_17_0 = life6_8;
    }
    forwardValue1746_18_0 = ((moom.Dp)(forwardValue1746_17_0)).b;
    }
    return ((V)(forwardValue1746_18_0));
}


private void a(int p0, long p1, V p2, int p3) {
moom.Do forestValue235_40_0;
    int forestValue235_40_1;
    boolean spill235_0;
    moom.Do spill235_1;
    int spill235_2;
    int spill235_3;
    long life6_3;
    moom.Dp life9_9;
    int life8_10;
    forest_join_41: {
    forest_join_40: {
    life6_3 = (moom.Do.g ^ 111130011689739L);
    spill235_0 = moom.DS.c__Boolean();
    life9_9 = (this.a)[p3];
    life8_10 = ((spill235_0) ? 1 : 0);
    (this.a)[p3] = new moom.Dp(p0, p1, p2, life9_9);
    moom.Do __stackOp235_5_0 = this;
    spill235_1 = __stackOp235_5_0;
    spill235_2 = ((moom.Do)(__stackOp235_5_0)).b;
    if (!((life8_10 != 0))) {
        forestValue235_40_0 = spill235_1;
        forestValue235_40_1 = spill235_2;
        break forest_join_40;
    }
    moom.Do __stackOp235_7_0 = spill235_1;
    int __stackOp235_7_1 = spill235_2;
    spill235_3 = __stackOp235_7_1;
    ((moom.Do)(__stackOp235_7_0)).b = ((int)((__stackOp235_7_1 + 1)));
    if (!((spill235_3 >= this.d))) {
        break forest_join_41;
    }
    forestValue235_40_0 = this;
    forestValue235_40_1 = (2 * (this.a).length);
    }
    ((moom.Do)(forestValue235_40_0)).a__Void(((int)(forestValue235_40_1)));
    }
    return;
}


public double a() {
boolean spill561_0;
    long life1_3;
    int life4_6;
    int life3_7;
    moom.Dp[] life5_10;
    int life6_13;
    int life7_15;
    moom.Dp life8_22;
    lexical_join_31: {
    life1_3 = (moom.Do.g ^ 70505238214139L);
    spill561_0 = moom.DS.b__Boolean();
    life4_6 = 0;
    life3_7 = ((spill561_0) ? 1 : 0);
    life5_10 = this.a;
    life6_13 = (life5_10).length;
    life7_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_29: {
    lexical_join_28: {
    if (!((life7_15 < life6_13))) {
        break lexical_join_31;
    }
    life8_22 = (life5_10)[life7_15];
    if (!((life3_7 == 0))) {
        break lexical_join_29;
    }
    if (!((life8_22 != null))) {
        break lexical_join_28;
    }
    life4_6 += 1;
    }
    life7_15 += 1;
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return (((double) life4_6) / ((double) this.b));
}


private void a(moom.Dp<V>[] p0) {
boolean spill563_0;
    long life2_3;
    moom.Dp[] life5_6;
    int life6_10;
    int life7_12;
    int life4_13;
    moom.Dp life8_21;
    moom.Dp life9_38;
    int life10_45;
    lexical_join_60: {
    life2_3 = (moom.Do.g ^ 106721879122860L);
    life5_6 = this.a;
    spill563_0 = moom.DS.c__Boolean();
    life6_10 = (p0).length;
    life7_12 = 0;
    life4_13 = ((spill563_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_58: {
    lexical_join_57: {
    if (!((life7_12 < (life5_6).length))) {
        break lexical_join_60;
    }
    life8_21 = (life5_6)[life7_12];
    if (!((life4_13 != 0))) {
        break lexical_join_58;
    }
    if (!((life8_21 != null))) {
        break lexical_join_57;
    }
    (life5_6)[life7_12] = null;
    lexical_cycle_30: while (true) {
    lexical_join_55: {
    life9_38 = ((moom.Dp)(life8_21)).c;
    life10_45 = __sourceExactCall_5330543039a8e2(((int)(((moom.Dp)(life8_21)).d)), ((int)((life6_10 - 1))));
    ((moom.Dp)(life8_21)).c = ((moom.Dp)((p0)[life10_45]));
    (p0)[life10_45] = life8_21;
    life8_21 = life9_38;
    if (!((life9_38 == null))) {
        break lexical_join_55;
    }
    if (!((life4_13 == 0))) {
        break lexical_join_57;
    }
    }
    if (!((life4_13 == 0))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    life7_12 += 1;
    }
    if (!((life4_13 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_9f389a43d862e0(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x667E;
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
                throw new RuntimeException("moom/Do", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Do.i[n2] = n4;
        }
        return i[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4234_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Do"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public V a__Object(long p0) {
moom.Dp lexicalValue565_31_0;
    boolean spill565_0;
    moom.Dp spill565_1;
    long life3_3;
    int life6_7;
    int life5_8;
    moom.Dp life7_16;
    lexical_join_34: {
    life3_3 = (moom.Do.g ^ 46617420431769L);
    spill565_0 = moom.DS.c__Boolean();
    life6_7 = __sourceExactCall_c00653f984226d(((long)(p0)));
    life5_8 = ((spill565_0) ? 1 : 0);
    life7_16 = (this.a)[__sourceExactCall_5330543039a8e2(((int)(life6_7)), ((int)(this.c)))];
    lexical_cycle_17: while (true) {
    lexical_join_31: {
    lexical_join_29: {
    if (!((life7_16 != null))) {
        break lexical_join_34;
    }
    spill565_1 = life7_16;
    if (!((life5_8 != 0))) {
        lexicalValue565_31_0 = spill565_1;
        break lexical_join_31;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.Dp)(spill565_1)).a)), ((long)(p0))) == 0))) {
        break lexical_join_29;
    }
    return ((V)(((moom.Dp)(life7_16)).b));
    }
    lexicalValue565_31_0 = ((moom.Dp)(life7_16)).c;
    }
    life7_16 = lexicalValue565_31_0;
    if (!((life5_8 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}


public int a__Int() {
return this.b;
}


private static int a(int p0, int p1) {
return (p0 & p1);
}


private static int a(int p0) {
long local1 = (moom.Do.g ^ 26389172726397L);
    p0 = ((p0 ^ (p0 >>> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1110_1(18778, (5163993884747880494L ^ local1)))) ^ (p0 >>> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1110_2(9125, (402359774923829974L ^ local1))));
    return ((p0 ^ (p0 >>> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1110_3(24281, (1276237846754316206L ^ local1)))) ^ (p0 >>> 4));
}


private static int a(long p0) {
long local2 = (moom.Do.g ^ 117841010631388L);
    return ((int) (p0 ^ (p0 >>> __sourceIntrinsic_17f83508ed96_originalDynamicSite1111_1(24076, (6521528789898971096L ^ local2)))));
}


private void a__Void(int p0) {
int forwardValue1745_31_0;
    boolean spill1745_0;
    int spill1745_1;
    long life2_3;
    moom.Dp[] life5_6;
    int life6_10;
    int life4_11;
    moom.Dp[] life7_41;
    float life8_57;
    forward_join_58: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (moom.Do.g ^ 20584749691795L);
    life5_6 = this.a;
    spill1745_0 = moom.DS.b__Boolean();
    life6_10 = (life5_6).length;
    life4_11 = ((spill1745_0) ? 1 : 0);
    spill1745_1 = life6_10;
    if (!((life4_11 == 0))) {
        forwardValue1745_31_0 = spill1745_1;
        break forward_join_31;
    }
    if (!((spill1745_1 == __sourceIntrinsic_6fc3381d0590_invokedynamic1745_4(25482, (3382059248047958805L ^ life2_3))))) {
        break forward_join_30;
    }
    this.d = ((int)(__sourceIntrinsic_6fc3381d0590_invokedynamic1745_5(23576, (4366234214516200580L ^ life2_3))));
    if (!((life4_11 != 0))) {
        break forward_join_58;
    }
    }
    forwardValue1745_31_0 = p0;
    }
    life7_41 = new moom.Dp[forwardValue1745_31_0];
    ((moom.Do)(this)).a(((moom.Dp[])(life7_41)));
    this.a = ((moom.Dp[])(life7_41));
    this.c = ((int)(((this.a).length - 1)));
    life8_57 = ((float) p0);
    ((java.lang.Object)(this)).getClass();
    this.d = ((int)(((int) (life8_57 * 0x1.8p-1f))));
    }
    return;
}


public void a(long p0, V p1) {
moom.Dp lexicalValue562_36_0;
    boolean spill562_0;
    moom.Dp spill562_1;
    long life4_3;
    int life7_6;
    int life8_12;
    int life6_13;
    moom.Dp life9_18;
    lexical_join_51: {
    lexical_join_39: {
    life4_3 = (moom.Do.g ^ 105769818274530L);
    life7_6 = __sourceExactCall_c00653f984226d(((long)(p0)));
    spill562_0 = moom.DS.b__Boolean();
    life8_12 = __sourceExactCall_5330543039a8e2(((int)(life7_6)), ((int)(this.c)));
    life6_13 = ((spill562_0) ? 1 : 0);
    life9_18 = (this.a)[life8_12];
    lexical_cycle_19: while (true) {
    lexical_join_36: {
    lexical_join_34: {
    if (!((life9_18 != null))) {
        break lexical_join_39;
    }
    if (!((life6_13 == 0))) {
        break lexical_join_51;
    }
    spill562_1 = life9_18;
    if (!((life6_13 == 0))) {
        lexicalValue562_36_0 = spill562_1;
        break lexical_join_36;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.Dp)(spill562_1)).a)), ((long)(p0))) == 0))) {
        break lexical_join_34;
    }
    ((moom.Dp)(life9_18)).b = ((java.lang.Object)(p1));
    return;
    }
    lexicalValue562_36_0 = ((moom.Dp)(life9_18)).c;
    }
    life9_18 = lexicalValue562_36_0;
    if (!((life6_13 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    moom.Do __stackOp562_11_0 = this;
    ((moom.Do)(__stackOp562_11_0)).f = ((int)((((moom.Do)(__stackOp562_11_0)).f + 1)));
    ((moom.Do)(this)).a(((int)(life7_6)), ((long)(p0)), ((java.lang.Object)(p1)), ((int)(life8_12)));
    }
    return;
}


final moom.Dp<V> a__Dp(long p0) {
moom.Dp lexicalValue564_30_0;
    boolean spill564_0;
    moom.Dp spill564_1;
    long life3_3;
    int life6_7;
    int life5_8;
    moom.Dp life7_16;
    lexical_join_33: {
    life3_3 = (moom.Do.g ^ 64937741433823L);
    spill564_0 = moom.DS.c__Boolean();
    life6_7 = __sourceExactCall_c00653f984226d(((long)(p0)));
    life5_8 = ((spill564_0) ? 1 : 0);
    life7_16 = (this.a)[__sourceExactCall_5330543039a8e2(((int)(life6_7)), ((int)(this.c)))];
    lexical_cycle_17: while (true) {
    lexical_join_30: {
    lexical_join_28: {
    if (!((life7_16 != null))) {
        break lexical_join_33;
    }
    spill564_1 = life7_16;
    if (!((life5_8 != 0))) {
        lexicalValue564_30_0 = spill564_1;
        break lexical_join_30;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.Dp)(spill564_1)).a)), ((long)(p0))) == 0))) {
        break lexical_join_28;
    }
    return life7_16;
    }
    lexicalValue564_30_0 = ((moom.Dp)(life7_16)).c;
    }
    life7_16 = lexicalValue564_30_0;
    if (!((life5_8 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}


public boolean a__Boolean(long p0) {
long local3 = (moom.Do.g ^ 62812565054068L);
    return ((((((moom.Do)(this)).a__Dp(((long)(p0))) != null) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_795427101100e04b_originalDynamicSite1927_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_795427101100e04b_originalDynamicSite1927_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1110_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1110_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1110_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_17f83508ed96_originalDynamicSite1111_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4234_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic1745_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic1745_5(int a0, long a1) throws E;

private static native int __sourceExactCall_c00653f984226d(long p0);
private static native int __sourceExactCall_5330543039a8e2(int p0, int p1);
private static native int __sourceExactCall_9f389a43d862e0(int p0, long p1);
}
