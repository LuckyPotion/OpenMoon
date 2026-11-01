package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iH implements moom.iz, moom.ix {

private final java.util.List<moom.ix> a;

private static int b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public iH() {
super();
    this.a = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    net.minecraft.client.Minecraft local1_life4 = net.minecraft.client.Minecraft.a__fM();
    java.util.Iterator local2_life9 = ((java.util.Collection)(((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(local1_life4)).I)).a__Bh())).e())).iterator();
    while (((java.util.Iterator)(local2_life9)).hasNext()) {
        moom.Bk local3_life13 = ((moom.Bk)(((java.util.Iterator)(local2_life9)).next()));
        ((java.util.List)(this.a)).add(((java.lang.Object)(new moom.iI(local3_life13))));
    }
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-6950575959355304535L)), ((long)(-7497484791938206636L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36793207228312L)))));
    int __sourceSpill876_6 = 109;
    f = ((java.util.Map)(new java.util.HashMap(13)));
    moom.iH.b(((int)(__sourceSpill876_6)));
    long local0_life9 = (moom.iH.c ^ 9278461089797L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill876_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill876_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill876_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill876_16 = new byte[8];
    (__sourceSpill876_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill876_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation876_18 = __sourceSpill876_16;
    ((javax.crypto.Cipher)(__sourceSpill876_13)).init(((int)(__sourceSpill876_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill876_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation876_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "0\007|[ÿÅF¥^\023\023pÂ-²"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill876_27 = local6_life23;
        int __sourceSpill876_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill876_27)).substring(((int)(__sourceSpill876_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill876_32 = local8_life21;
        int __sourceSpill876_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill876_35 = new byte[8];
        (__sourceSpill876_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill876_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill876_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill876_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill876_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill876_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill876_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill876_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill876_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill876_36)).doFinal(((byte[])(__sourceSpill876_35)));
        (__sourceSpill876_32)[__sourceSpill876_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    d = ((long[])(local8_life21));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public static void b(int p0) {
moom.iH.b = ((int)(p0));
    return;
}


public static int b() {
return moom.iH.b;
}


public net.minecraft.util.IChatComponent b__C5() {
return new moom.CM("Select a team to teleport to");
}


public static int c() {
int local0 = moom.iH.b();
    if ((local0 == 0)) {
        return 26;
    }
    return 0;
}


public java.util.List<moom.ix> a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6A18;
        if (e[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n4];
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
                throw new RuntimeException("moom/iH", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iH.e[n4] = n6;
        }
        return e[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8008_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, int p1) {
long local3 = (moom.iH.c ^ 64423161051536L);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).a__Void(((moom.DD)(moom.hI.g)));
    net.minecraft.client.gui.Gui.a(((int)(0)), ((int)(0)), ((float)(0x1.0p4f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_829be77b853c_originalDynamicSite1513_5(5570, (8851076767062742565L ^ local3)))), ((int)(__sourceIntrinsic_829be77b853c_originalDynamicSite1513_6(18455, (3443453160762149873L ^ local3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    return;
}


public boolean a__Boolean() {
java.util.Iterator local1 = ((java.util.List)(this.a)).iterator();
    while (((java.util.Iterator)(local1)).hasNext()) {
        moom.ix local2 = ((moom.ix)(((java.util.Iterator)(local1)).next()));
        if (((moom.ix)(local2)).a__Boolean()) {
        return true;
    }
    }
    return false;
}


public void a(moom.iB p0) {
((moom.iB)(p0)).a(((moom.iz)(this)));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
return new moom.CM("Teleport to team member");
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8008_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_originalDynamicSite1513_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_originalDynamicSite1513_6(int a0, long a1) throws E;
}
