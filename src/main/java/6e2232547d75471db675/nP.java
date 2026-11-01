package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nP implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.monster.EntityEnderman> {

private final moom.m5 a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public nP(moom.m5 p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(4202928795976174577L)), ((long)(3398411179328619513L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27733702468463L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.nP.b ^ 126551018363699L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill941_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill941_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill941_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill941_14 = new byte[8];
    (__sourceSpill941_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill941_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation941_16 = __sourceSpill941_14;
    ((javax.crypto.Cipher)(__sourceSpill941_11)).init(((int)(__sourceSpill941_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill941_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation941_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "í¦ÃBm\017ã:XÐï\fO0"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill941_25 = local6_life21;
        int __sourceSpill941_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill941_25)).substring(((int)(__sourceSpill941_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill941_30 = local8_life19;
        int __sourceSpill941_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill941_33 = new byte[8];
        (__sourceSpill941_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill941_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill941_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill941_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill941_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill941_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill941_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill941_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill941_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill941_34)).doFinal(((byte[])(__sourceSpill941_33)));
        (__sourceSpill941_30)[__sourceSpill941_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8496_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.nP.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7DAB;
        if (d[n8] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = c[n8];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/nP", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nP.d[n8] = n10;
        }
        return d[n8];
}


public void a(net.minecraft.entity.monster.EntityEnderman p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long life9_3;
    net.minecraft.block.state.IBlockState life11_6;
    net.minecraft.client.renderer.BlockRendererDispatcher life12_14;
    float life13_36;
    int life14_46;
    int life15_54;
    int life16_62;
    life9_3 = (moom.nP.b ^ 101828658223119L);
    life11_6 = ((net.minecraft.entity.monster.EntityEnderman)(p0)).a__sourceReturn_474a78d617();
    if ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life11_6)).a__ch())).a__fn() != moom.fn.a)) {
        life12_14 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP();
        moom.kZ.y();
        moom.kZ.B();
        moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.6p-1f)), ((float)(-0x1.8p-1f)));
        moom.kZ.b(((float)(0x1.4p4f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(0x1.68p5f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(0x1.0p-2f)), ((float)(0x1.8p-3f)), ((float)(0x1.0p-2f)));
        life13_36 = 0x1.0p-1f;
        moom.kZ.a(((float)((-life13_36))), ((float)((-life13_36))), ((float)(life13_36)));
        life14_46 = ((net.minecraft.entity.monster.EntityEnderman)(p0)).a__Int(((float)(p3)));
        life15_54 = (life14_46 % __sourceIntrinsic_0e90e0bf07b4_invokedynamic6917_15(15057, (4709326465189794353L ^ life9_3)));
        life16_62 = (life14_46 / __sourceIntrinsic_0e90e0bf07b4_invokedynamic6917_16(9238, (8125754111286365431L ^ life9_3)));
        net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) life15_54))), ((float)(((float) life16_62))));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((moom.m5)(this.a)).b(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
        ((net.minecraft.client.renderer.BlockRendererDispatcher)(life12_14)).a(((net.minecraft.block.state.IBlockState)(life11_6)), ((float)(0x1.0p0f)));
        moom.kZ.C();
        moom.kZ.z();
    }
    return;
}


public void a__sourceBridge_a569c1ca8a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((moom.nP)(this)).a(((net.minecraft.entity.monster.EntityEnderman)(((net.minecraft.entity.monster.EntityEnderman)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8496_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e90e0bf07b4_invokedynamic6917_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e90e0bf07b4_invokedynamic6917_16(int a0, long a1) throws E;


}
