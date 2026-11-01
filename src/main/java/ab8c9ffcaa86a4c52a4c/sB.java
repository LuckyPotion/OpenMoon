package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sB extends net.minecraft.client.particle.EntityFX {

private net.minecraft.entity.EntityLivingBase aV;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sB(net.minecraft.world.World p0, double p1, double p2, double p3) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_010f5618ad285f38(moom.sB receiver, net.minecraft.world.World p0, double p1, double p2, double p3) throws Throwable {

moom.sB spill495_0;

    moom.sB spill495_1;

    float spill495_2;

    float spill495_3;

    moom.sB spill495_4;

    moom.sB spill495_5;

    double spill495_6;

    double spill495_7;

    long life8_3;

    life8_3 = (moom.sB.bb ^ 120626205703928L);

    moom.sB.__sourceConstructorInit_010f5618ad285f38_0(((moom.sB)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    spill495_0 = receiver;

    spill495_1 = receiver;

    moom.sB __stackOp495_2_0 = receiver;

    float __stackOp495_2_1 = 0x1.0p0f;

    spill495_2 = __stackOp495_2_1;

    ((moom.sB)(__stackOp495_2_0)).aO = ((float)(__stackOp495_2_1));

    moom.sB __stackOp495_4_0 = spill495_1;

    float __stackOp495_4_1 = spill495_2;

    spill495_3 = __stackOp495_4_1;

    ((moom.sB)(__stackOp495_4_0)).aN = ((float)(__stackOp495_4_1));

    ((moom.sB)(spill495_0)).aM = ((float)(spill495_3));

    spill495_4 = receiver;

    spill495_5 = receiver;

    moom.sB __stackOp495_7_0 = receiver;

    double __stackOp495_7_1 = 0x0.0p0d;

    spill495_6 = __stackOp495_7_1;

    ((moom.sB)(__stackOp495_7_0)).v = ((double)(__stackOp495_7_1));

    moom.sB __stackOp495_9_0 = spill495_5;

    double __stackOp495_9_1 = spill495_6;

    spill495_7 = __stackOp495_9_1;

    ((moom.sB)(__stackOp495_9_0)).u = ((double)(__stackOp495_9_1));

    ((moom.sB)(spill495_4)).t = ((double)(spill495_7));

    ((moom.sB)(receiver)).aL = ((float)(0x0.0p0f));

    ((moom.sB)(receiver)).aJ = ((int)(__sourceIntrinsic_010f5618ad285f38_invokedynamic495_13(21925, (7828542142848792467L ^ life8_3))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-6835722162509203923L)), ((long)(492726643696336597L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239562956999559L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sB.bb ^ 42462463108686L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1007_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1007_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1007_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1007_14 = new byte[8];
    (__sourceSpill1007_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1007_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1007_16 = __sourceSpill1007_14;
    ((javax.crypto.Cipher)(__sourceSpill1007_11)).init(((int)(__sourceSpill1007_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1007_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1007_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¹@pÒÜ,\023\005Ï%î\rö^¡}kVR\177^zà"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1007_25 = local6_life21;
        int __sourceSpill1007_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1007_25)).substring(((int)(__sourceSpill1007_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1007_30 = local8_life19;
        int __sourceSpill1007_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1007_33 = new byte[8];
        (__sourceSpill1007_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1007_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1007_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1007_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1007_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1007_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1007_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1007_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1007_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1007_34)).doFinal(((byte[])(__sourceSpill1007_33)));
        (__sourceSpill1007_30)[__sourceSpill1007_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_010f5618ad285f38_0(moom.sB a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sB.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8988_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2472;
        if (ib[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = hb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/sB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            sB.ib[n2] = n3;
        }
        return ib[n2];
}


public int a__Int() {
return 3;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long life9_3;
    net.minecraft.client.renderer.entity.RenderManager life11_9;
    float life12_20;
    float life13_30;
    float life14_43;
    float life15_57;
    life9_3 = (moom.sB.bb ^ 99351656421177L);
    if ((this.aV != null)) {
        life11_9 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
        int spill3944_0 = 2343;
        ((net.minecraft.client.renderer.entity.RenderManager)(life11_9)).a__Void(((double)(net.minecraft.client.particle.EntityFX.aR)), ((double)(net.minecraft.client.particle.EntityFX.aS)), ((double)(net.minecraft.client.particle.EntityFX.aT)));
        long spill3944_1 = (3516339869438952146L ^ life9_3);
        life12_20 = 0x1.b3bea4p-2f;
        life13_30 = ((((float) this.aI) + p2) / ((float) this.aJ));
        moom.kZ.a(((boolean)(true)));
        moom.kZ.l();
        moom.kZ.j();
        moom.kZ.b(((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic3944_13(spill3944_0, spill3944_1))), ((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic3944_14(6973, (6331578544556396747L ^ life9_3)))));
        life14_43 = 0x1.ep7f;
        net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(life14_43)), ((float)(life14_43)));
        moom.kZ.B();
        life15_57 = (0x1.99999ap-5f + (0x1.0p-1f * moom.Dr.a(((float)((life13_30 * 0x1.921fb6p1f))))));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life15_57)));
        moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.ccccccp0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((0x1.68p7f - ((net.minecraft.entity.Entity)(p1)).w))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(((0x1.ep5f - (0x1.2cp7f * life13_30)) - ((net.minecraft.entity.Entity)(p1)).x))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.99999ap-2f)), ((float)(-0x1.8p0f)));
        moom.kZ.a(((float)(life12_20)), ((float)(life12_20)), ((float)(life12_20)));
        net.minecraft.entity.EntityLivingBase spill3944_2 = this.aV;
        net.minecraft.entity.EntityLivingBase __stackOp3944_30_0 = this.aV;
        float __stackOp3944_30_1 = 0x0.0p0f;
        float spill3944_3 = __stackOp3944_30_1;
        ((net.minecraft.entity.EntityLivingBase)(__stackOp3944_30_0)).y = ((float)(__stackOp3944_30_1));
        ((net.minecraft.entity.EntityLivingBase)(spill3944_2)).w = ((float)(spill3944_3));
        net.minecraft.entity.EntityLivingBase spill3944_4 = this.aV;
        net.minecraft.entity.EntityLivingBase __stackOp3944_35_0 = this.aV;
        float __stackOp3944_35_1 = 0x0.0p0f;
        float spill3944_5 = __stackOp3944_35_1;
        ((net.minecraft.entity.EntityLivingBase)(__stackOp3944_35_0)).a5 = ((float)(__stackOp3944_35_1));
        ((net.minecraft.entity.EntityLivingBase)(spill3944_4)).a4 = ((float)(spill3944_5));
        ((net.minecraft.client.renderer.entity.RenderManager)(life11_9)).a__Boolean(((net.minecraft.entity.Entity)(this.aV)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((float)(0x0.0p0f)), ((float)(p2)));
        moom.kZ.C();
        moom.kZ.j();
    }
    return;
}


public void g__Void() {
net.minecraft.entity.monster.EntityGuardian life1_10;
    super.g__Void();
    if ((this.aV == null)) {
        life1_10 = new net.minecraft.entity.monster.EntityGuardian(this.i);
        ((net.minecraft.entity.monster.EntityGuardian)(life1_10)).X__sourceReturn_da8c82d5d4();
        this.aV = ((net.minecraft.entity.EntityLivingBase)(life1_10));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_010f5618ad285f38_invokedynamic495_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic3944_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic3944_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8988_0() throws E;
}
