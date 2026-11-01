package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EB extends moom.EA {

private static final long l;

private static final long[] p;

private static final java.lang.Integer[] q;

private static final java.util.Map r;

public EB() {
super();
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(7328519014336572588L)), ((long)(-298746645994235879L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274815097757518L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.EB.l ^ 95485526046390L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill704_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill704_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill704_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill704_14 = new byte[8];
    (__sourceSpill704_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill704_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation704_16 = __sourceSpill704_14;
    ((javax.crypto.Cipher)(__sourceSpill704_11)).init(((int)(__sourceSpill704_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill704_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation704_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "YÎ\007µóüc\\\t\013®7\037Æ`Q»\016Ý­\022ÔKÆ|¿\005C«\0064~Úì\nòµ>\0314õ£þ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill704_25 = local6_life21;
        int __sourceSpill704_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill704_25)).substring(((int)(__sourceSpill704_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill704_30 = local8_life19;
        int __sourceSpill704_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill704_33 = new byte[8];
        (__sourceSpill704_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill704_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill704_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill704_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill704_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill704_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill704_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill704_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill704_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill704_34)).doFinal(((byte[])(__sourceSpill704_33)));
        (__sourceSpill704_30)[__sourceSpill704_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "m~â\034²h¾\013ml\033gX%"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill704_38 = local6_life21;
        int __sourceSpill704_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill704_38)).substring(((int)(__sourceSpill704_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill704_43 = local8_life19;
        int __sourceSpill704_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill704_46 = new byte[8];
        (__sourceSpill704_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill704_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill704_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill704_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill704_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill704_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill704_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill704_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill704_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill704_47)).doFinal(((byte[])(__sourceSpill704_46)));
        (__sourceSpill704_43)[__sourceSpill704_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public boolean b(int p0, int p1) {
return ((1) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4301_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b__Boolean() {
return ((0) != 0);
}


public java.lang.String b__String() {
return "_end";
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x62B8;
        if (q[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = p[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/EB", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EB.q[n2] = n4;
        }
        return q[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.EB.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void() {
((moom.EB)(this)).e = ((net.minecraft.world.biome.WorldChunkManager)(new moom.Fg(net.minecraft.world.biome.BiomeGenBase.A, 0x0.0p0f)));
    ((moom.EB)(this)).i = ((int)(1));
    ((moom.EB)(this)).g = ((boolean)(true));
    return;
}


public boolean c() {
return ((0) != 0);
}


public float[] a__ArrayFloat(float p0, float p1) {
return null;
}


public float a(long p0, float p1) {
return 0x0.0p0f;
}


public java.lang.String a__String() {
return "The End";
}


public moom.Fn a__Fn() {
return new moom.Fy(((moom.EB)(this)).b, ((net.minecraft.world.World)(((moom.EB)(this)).b)).a__Long());
}


public boolean a(int p0, int p1) {
return ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.world.World)(((moom.EB)(this)).b)).a__ch(((moom.DT)(new moom.DT(p0, 0, p1)))))).a__fn())).d__Boolean();
}


public boolean a__Boolean() {
return ((0) != 0);
}


public float a__Float() {
return 0x1.0p3f;
}


public moom.DT a__DT() {
long local1 = (moom.EB.l ^ 86569510778463L);
    return new moom.DT(__sourceIntrinsic_47f181ab3bf8_originalDynamicSite1125_1(12321, (8524582277508885167L ^ local1)), __sourceIntrinsic_47f181ab3bf8_originalDynamicSite1125_2(21418, (5851613288861829415L ^ local1)), 0);
}


public int a__Int() {
long local1 = (moom.EB.l ^ 53483742377571L);
    return __sourceIntrinsic_0bbed5b41c99_originalDynamicSite1126_1(31874, (8802655240148919858L ^ local1));
}


public moom.DR a(float p0, float p1) {
long local3 = (moom.EB.l ^ 9618230332063L);
    int local5 = __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_1(19357, (5637395752954523093L ^ local3));
    float local6 = ((moom.Dr.b(((float)(((p0 * 0x1.921fb6p1f) * 0x1.0p1f)))) * 0x1.0p1f) + 0x1.0p-1f);
    local6 = moom.Dr.a(((float)(local6)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    float local7 = (((float) ((local5 >> __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_4(812, (5973047943792076134L ^ local3))) & __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_5(2470, (1026138775894601705L ^ local3)))) / 0x1.fep7f);
    float local8 = (((float) ((local5 >> __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_6(27485, (8304931931784138004L ^ local3))) & __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_7(11636, (4160457930792700735L ^ local3)))) / 0x1.fep7f);
    float local9 = (((float) (local5 & __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_8(11636, (4160457930792700735L ^ local3)))) / 0x1.fep7f);
    local7 = (local7 * ((local6 * 0x0.0p0f) + 0x1.333334p-3f));
    local8 = (local8 * ((local6 * 0x0.0p0f) + 0x1.333334p-3f));
    local9 = (local9 * ((local6 * 0x0.0p0f) + 0x1.333334p-3f));
    return new moom.DR(((double) local7), ((double) local8), ((double) local9));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4301_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47f181ab3bf8_originalDynamicSite1125_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47f181ab3bf8_originalDynamicSite1125_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bbed5b41c99_originalDynamicSite1126_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_09a3050e3207_originalDynamicSite1127_8(int a0, long a1) throws E;
}
