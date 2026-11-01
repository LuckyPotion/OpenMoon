package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mQ extends net.minecraft.client.renderer.entity.Render<moom.tK> {

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public mQ(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.c = 0x1.0000000000000p-1f;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-6394828716253574887L)), ((long)(-7705988222837691L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(115796258629484L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.mQ.h ^ 139881536285045L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill933_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill933_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill933_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill933_14 = new byte[8];
    (__sourceSpill933_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill933_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation933_16 = __sourceSpill933_14;
    ((javax.crypto.Cipher)(__sourceSpill933_11)).init(((int)(__sourceSpill933_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill933_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation933_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "§Òb\037|xÙ{#4D\003÷é"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill933_25 = local6_life21;
        int __sourceSpill933_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill933_25)).substring(((int)(__sourceSpill933_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill933_30 = local8_life19;
        int __sourceSpill933_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill933_33 = new byte[8];
        (__sourceSpill933_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill933_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill933_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill933_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill933_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill933_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill933_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill933_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill933_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill933_34)).doFinal(((byte[])(__sourceSpill933_33)));
        (__sourceSpill933_30)[__sourceSpill933_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int b(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x72E6;
        if (j[n8] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n8];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/mQ", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mQ.j[n8] = n10;
        }
        return j[n8];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mQ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8396_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected moom.DD a(moom.tK p0) {
return net.minecraft.client.renderer.texture.TextureMap.k;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.tK p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    net.minecraft.client.renderer.BlockRendererDispatcher life12_6;
    float life13_38;
    float life13_43;
    float life13_47;
    float life13_51;
    float life14_57;
    float life13_75;
    life10_3 = (moom.mQ.h ^ 1839971833992L);
    life12_6 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP();
    moom.kZ.B();
    __sourceExactCall_f6b60eb6b2432b(((float)(((float) p1))), ((float)((((float) p2) + 0x1.0p-1f))), ((float)(((float) p3))));
    if ((((((float) ((moom.tK)(p0)).aE) - p5) + 0x1.0p0f) < 0x1.4p3f)) {
        life13_38 = (0x1.0p0f - (((((float) ((moom.tK)(p0)).aE) - p5) + 0x1.0p0f) / 0x1.4p3f));
        life13_43 = __sourceExactCall_5f163e617def0f(((float)(life13_38)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
        life13_47 = (life13_43 * life13_43);
        life13_51 = (life13_47 * life13_47);
        life14_57 = (0x1.0p0f + (life13_51 * 0x1.333334p-2f));
        __sourceExactCall_c87cfdff997c62(((float)(life14_57)), ((float)(life14_57)), ((float)(life14_57)));
    }
    life13_75 = ((0x1.0p0f - (((((float) ((moom.tK)(p0)).aE) - p5) + 0x1.0p0f) / 0x1.9p6f)) * 0x1.99999ap-1f);
    __sourceExactCall_d3027d320f3073(((moom.mQ)(this)), ((net.minecraft.entity.Entity)(p0)));
    __sourceExactCall_f6b60eb6b2432b(((float)(-0x1.0p-1f)), ((float)(-0x1.0p-1f)), ((float)(0x1.0p-1f)));
    __sourceExactCall_7b2008fbe26362(((net.minecraft.client.renderer.BlockRendererDispatcher)(life12_6)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W)).a__fE())), ((float)(__sourceExactCall_cbd6d29b547c02(((moom.tK)(p0)), ((float)(p5))))));
    __sourceExactCall_f6b60eb6b2432b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    if ((((((moom.tK)(p0)).aE / 5) % 2) == 0)) {
        moom.kZ.v();
        int spill6856_0 = 27075;
        moom.kZ.f();
        long spill6856_1 = (2104068523824927429L ^ life10_3);
        moom.kZ.l();
        __sourceExactCall_b81ed7f8f640c1(((int)(__sourceIntrinsic_d4c7d4a34925_invokedynamic6856_21(spill6856_0, spill6856_1))), ((int)(__sourceIntrinsic_d4c7d4a34925_invokedynamic6856_22(104, (2383006355146357615L ^ life10_3)))));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life13_75)));
        __sourceExactCall_d0f2996c581096(((float)(-0x1.8p1f)), ((float)(-0x1.8p1f)));
        moom.kZ.q();
        __sourceExactCall_7b2008fbe26362(((net.minecraft.client.renderer.BlockRendererDispatcher)(life12_6)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W)).a__fE())), ((float)(0x1.0p0f)));
        __sourceExactCall_d0f2996c581096(((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.r();
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.k();
        moom.kZ.e();
        moom.kZ.u();
    }
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mQ)(this)).a(((moom.tK)(((moom.tK)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mQ)(this)).a(((moom.tK)(((moom.tK)(p0)))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8396_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4c7d4a34925_invokedynamic6856_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4c7d4a34925_invokedynamic6856_22(int a0, long a1) throws E;



private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native float __sourceExactCall_5f163e617def0f(float p0, float p1, float p2);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native boolean __sourceExactCall_d3027d320f3073(moom.mQ p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_7b2008fbe26362(net.minecraft.client.renderer.BlockRendererDispatcher p0, net.minecraft.block.state.IBlockState p1, float p2);
private static native float __sourceExactCall_cbd6d29b547c02(moom.tK p0, float p1);
private static native void __sourceExactCall_b81ed7f8f640c1(int p0, int p1);
private static native void __sourceExactCall_d0f2996c581096(float p0, float p1);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
