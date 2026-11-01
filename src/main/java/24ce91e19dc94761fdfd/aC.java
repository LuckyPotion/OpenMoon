package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class aC extends sourcebuild.EnumConstructor<moom.aC> {

public static moom.aC DOWN;

public static moom.aC UP;

public static moom.aC NORTH;

public static moom.aC SOUTH;

public static moom.aC WEST;

public static moom.aC EAST;

private int a;

private int b;

private int c;

private int d;

private static moom.aC[] e;

private static moom.aC[] f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

private aC(java.lang.String p0, int p1, int p2, int p3, int p4, int p5) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
    this.d = p5;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(-3161335256823800599L)), ((long)(-4057793987421949071L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193407487705701L)))));
    long local11_life6 = (moom.aC.g ^ 44493175370317L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill756_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill756_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill756_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill756_14 = new byte[8];
    (__sourceSpill756_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill756_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation756_16 = __sourceSpill756_14;
    ((javax.crypto.Cipher)(__sourceSpill756_11)).init(((int)(__sourceSpill756_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill756_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation756_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "5s>F2Rë3\002¼Î\004I§N"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill756_25 = local4_life21;
        int __sourceSpill756_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill756_25)).substring(((int)(__sourceSpill756_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill756_30 = local6_life19;
        int __sourceSpill756_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill756_33 = new byte[8];
        (__sourceSpill756_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill756_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill756_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill756_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill756_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill756_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill756_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill756_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill756_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill756_34)).doFinal(((byte[])(__sourceSpill756_33)));
        (__sourceSpill756_30)[__sourceSpill756_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    h = ((long[])(local6_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
    DOWN = ((moom.aC)(new moom.aC("DOWN", 0, 0, 1, 2, 3)));
    UP = ((moom.aC)(new moom.aC("UP", 1, 2, 3, 0, 1)));
    NORTH = ((moom.aC)(new moom.aC("NORTH", 2, 3, 0, 1, 2)));
    SOUTH = ((moom.aC)(new moom.aC("SOUTH", 3, 0, 1, 2, 3)));
    WEST = ((moom.aC)(new moom.aC("WEST", 4, 3, 0, 1, 2)));
    EAST = ((moom.aC)(new moom.aC("EAST", 5, 1, 2, 3, 0)));
    f = ((moom.aC[])(moom.aC.a()));
    e = ((moom.aC[])(new moom.aC[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite756_47(26370, (4801094610597962720L ^ local11_life6))]));
    (moom.aC.e)[((moom.bs)(moom.bs.DOWN)).a()] = moom.aC.DOWN;
    (moom.aC.e)[((moom.bs)(moom.bs.UP)).a()] = moom.aC.UP;
    (moom.aC.e)[((moom.bs)(moom.bs.NORTH)).a()] = moom.aC.NORTH;
    (moom.aC.e)[((moom.bs)(moom.bs.SOUTH)).a()] = moom.aC.SOUTH;
    (moom.aC.e)[((moom.bs)(moom.bs.WEST)).a()] = moom.aC.WEST;
    (moom.aC.e)[((moom.bs)(moom.bs.EAST)).a()] = moom.aC.EAST;
}


public static moom.aC[] values() {
return ((moom.aC[])(((moom.aC[])(moom.aC.f)).clone()));
}


public static moom.aC valueOf(java.lang.String p0) {
return ((moom.aC)(java.lang.Enum.valueOf(((java.lang.Class)(moom.aC.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4A01;
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
                throw new RuntimeException("moom/aC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            aC.i[n2] = n3;
        }
        return i[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.aC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6902_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.aC[] a() {
long local0_life1 = (moom.aC.g ^ 133326210604166L);
    moom.aC[] __sourceSharedArray745_4 = new moom.aC[__sourceIntrinsic_6980e3b512cc_originalDynamicSite745_2(21008, (3367964797785012280L ^ local0_life1))];
    __sourceSharedArray745_4[0] = moom.aC.DOWN;
    __sourceSharedArray745_4[1] = moom.aC.UP;
    __sourceSharedArray745_4[2] = moom.aC.NORTH;
    __sourceSharedArray745_4[3] = moom.aC.SOUTH;
    __sourceSharedArray745_4[4] = moom.aC.WEST;
    __sourceSharedArray745_4[5] = moom.aC.EAST;
    return __sourceSharedArray745_4;
}


public static moom.aC a(moom.bs p0) {
return (moom.aC.e)[((moom.bs)(p0)).a()];
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite756_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6902_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6980e3b512cc_originalDynamicSite745_2(int a0, long a1) throws E;
}
