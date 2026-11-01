package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nS implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.monster.EntityIronGolem> {

private final moom.na a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public nS(moom.na p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-3241541584464148488L)), ((long)(-6236190345110352964L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(41256011210065L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.nS.b ^ 60340902087749L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill942_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill942_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill942_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill942_14 = new byte[8];
    (__sourceSpill942_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill942_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation942_16 = __sourceSpill942_14;
    ((javax.crypto.Cipher)(__sourceSpill942_11)).init(((int)(__sourceSpill942_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill942_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation942_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ø»2â[µêê ß±Q\023ã\026\037"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill942_25 = local6_life21;
        int __sourceSpill942_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill942_25)).substring(((int)(__sourceSpill942_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill942_30 = local8_life19;
        int __sourceSpill942_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill942_33 = new byte[8];
        (__sourceSpill942_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill942_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill942_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill942_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill942_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill942_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill942_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill942_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill942_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill942_34)).doFinal(((byte[])(__sourceSpill942_33)));
        (__sourceSpill942_30)[__sourceSpill942_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8498_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.nS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7BF9;
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
                throw new RuntimeException("moom/nS", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nS.d[n8] = n10;
        }
        return d[n8];
}


public void a(net.minecraft.entity.monster.EntityIronGolem p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long life9_3;
    net.minecraft.client.renderer.BlockRendererDispatcher life11_9;
    float life12_38;
    int life13_47;
    int life14_55;
    int life15_63;
    life9_3 = (moom.nS.b ^ 1084014426952L);
    if ((((net.minecraft.entity.monster.EntityIronGolem)(p0)).r__sourceReturn_8abf5c6871() != 0)) {
        life11_9 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP();
        moom.kZ.y();
        moom.kZ.B();
        moom.kZ.b(((float)((0x1.4p2f + ((0x1.68p7f * ((moom.jD)(((moom.jd)(((moom.jd)(((moom.na)(this.a)).a__iQ())))).k)).h) / 0x1.921fb6p1f)))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(-0x1.ep-1f)), ((float)(-0x1.4p-1f)), ((float)(-0x1.ep-1f)));
        life12_38 = 0x1.0p-1f;
        moom.kZ.a(((float)(life12_38)), ((float)((-life12_38))), ((float)(life12_38)));
        life13_47 = ((net.minecraft.entity.monster.EntityIronGolem)(p0)).a__Int(((float)(p3)));
        life14_55 = (life13_47 % __sourceIntrinsic_dd63f5543b9a_invokedynamic6918_16(18280, (1064305305391774192L ^ life9_3)));
        life15_63 = (life13_47 / __sourceIntrinsic_dd63f5543b9a_invokedynamic6918_17(28965, (1228471501350047676L ^ life9_3)));
        net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) life14_55))), ((float)(((float) life15_63))));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((moom.na)(this.a)).b(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
        ((net.minecraft.client.renderer.BlockRendererDispatcher)(life11_9)).a(((net.minecraft.block.state.IBlockState)(((moom.cA)(net.minecraft.init.Blocks.O)).a__fE())), ((float)(0x1.0p0f)));
        moom.kZ.C();
        moom.kZ.z();
    }
    return;
}


public void a__sourceBridge_a569c1ca8a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((moom.nS)(this)).a(((net.minecraft.entity.monster.EntityIronGolem)(((net.minecraft.entity.monster.EntityIronGolem)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8498_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dd63f5543b9a_invokedynamic6918_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dd63f5543b9a_invokedynamic6918_17(int a0, long a1) throws E;


}
