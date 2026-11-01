package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class m3 extends moom.mU<net.minecraft.entity.monster.EntityCreeper> {

private static final moom.DD C;

private static final long D;

private static final long[] E;

private static final java.lang.Integer[] F;

private static final java.util.Map G;

public m3(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.i7(), 0x1.0000000000000p-1f);
    (this).a(new moom.nJ(this));
}


static {
D = ((long)(((moom._a)(moom._c.a(((long)(3264456119775163563L)), ((long)(-3944766026720086651L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(124801352271034L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.m3.D ^ 58922548828384L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill928_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill928_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill928_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill928_14 = new byte[8];
    (__sourceSpill928_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill928_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation928_16 = __sourceSpill928_14;
    ((javax.crypto.Cipher)(__sourceSpill928_11)).init(((int)(__sourceSpill928_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill928_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation928_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "}¾ý½ÎÙ/³ \035åÌg\034ªH°¸\nôãÖ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill928_25 = local6_life21;
        int __sourceSpill928_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill928_25)).substring(((int)(__sourceSpill928_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill928_30 = local8_life19;
        int __sourceSpill928_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill928_33 = new byte[8];
        (__sourceSpill928_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill928_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill928_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill928_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill928_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill928_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill928_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill928_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill928_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill928_34)).doFinal(((byte[])(__sourceSpill928_33)));
        (__sourceSpill928_30)[__sourceSpill928_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    E = ((long[])(local8_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[3]));
    C = ((moom.DD)(new moom.DD("textures/entity/creeper/creeper.png")));
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8373_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/m3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9463;
      if (F[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = E[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/m3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.m3.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected int a(net.minecraft.entity.monster.EntityCreeper p0, float p1, float p2) {
long local4 = (moom.m3.D ^ 33982665673933L);
    float local6 = ((net.minecraft.entity.monster.EntityCreeper)(p0)).c__sourceReturn_f6c4892e39(((float)(p2)));
    if (((((int) (local6 * 0x1.4p3f)) % 2) == 0)) {
        return 0;
    }
    int local7 = ((int) ((local6 * 0x1.99999ap-3f) * 0x1.fep7f));
    local7 = moom.Dr.a(((int)(local7)), ((int)(0)), ((int)(__sourceIntrinsic_b77ab00734fe_invokedynamic8374_2(17567, (2558999960999035966L ^ local4)))));
    return ((local7 << __sourceIntrinsic_b77ab00734fe_invokedynamic8374_4(9694, (126251667444983165L ^ local4))) | __sourceIntrinsic_b77ab00734fe_invokedynamic8374_5(19551, (8982118986719169791L ^ local4)));
}


protected void a__sourceReturn_22014d7849(net.minecraft.entity.monster.EntityCreeper p0, float p1) {
float local3 = ((net.minecraft.entity.monster.EntityCreeper)(p0)).c__sourceReturn_f6c4892e39(((float)(p1)));
    float local4 = (0x1.0p0f + ((moom.Dr.a(((float)((local3 * 0x1.9p6f)))) * local3) * 0x1.47ae14p-7f));
    local3 = moom.Dr.a(((float)(local3)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    local3 = (local3 * local3);
    local3 = (local3 * local3);
    float local5 = ((0x1.0p0f + (local3 * 0x1.99999ap-2f)) * local4);
    float local6 = ((0x1.0p0f + (local3 * 0x1.99999ap-4f)) / local4);
    moom.kZ.a(((float)(local5)), ((float)(local6)), ((float)(local5)));
    return;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m3)(this)).a__sourceReturn_3a08b8469f(((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.entity.monster.EntityCreeper)(p0)))));
}


protected moom.DD a__sourceReturn_3a08b8469f(net.minecraft.entity.monster.EntityCreeper p0) {
return moom.m3.C;
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.m3)(this)).a__sourceReturn_22014d7849(((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.entity.monster.EntityCreeper)(p0)))), ((float)(p1)));
}


protected int a__sourceBridge_853ab378e4(net.minecraft.entity.EntityLivingBase p0, float p1, float p2) {
return ((moom.m3)(this)).a(((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.entity.monster.EntityCreeper)(p0)))), ((float)(p1)), ((float)(p2)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8373_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b77ab00734fe_invokedynamic8374_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b77ab00734fe_invokedynamic8374_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b77ab00734fe_invokedynamic8374_5(int a0, long a1) throws E;

public void a__Void(net.minecraft.entity.monster.EntityCreeper __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.monster.EntityCreeper __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

}

