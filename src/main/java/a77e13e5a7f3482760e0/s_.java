package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class s_ extends moom.s9 {

private static final long cb;

private static final long[] zb;

private static final java.lang.Integer[] Ab;

private static final java.util.Map Bb;

public s_(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.6666660000000p-1f, 0x1.0000000000000p-1f);
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(6061223155552625475L)), ((long)(8899856959457111673L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201497162513569L)))));
    Bb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.s_.cb ^ 94465222688162L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1012_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1012_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1012_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1012_14 = new byte[8];
    (__sourceSpill1012_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1012_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1012_16 = __sourceSpill1012_14;
    ((javax.crypto.Cipher)(__sourceSpill1012_11)).init(((int)(__sourceSpill1012_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1012_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1012_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ïß\027pì#)']#kÊ¾ö*\031°ûÃNá\000Âù"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1012_25 = local6_life21;
        int __sourceSpill1012_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1012_25)).substring(((int)(__sourceSpill1012_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1012_30 = local8_life19;
        int __sourceSpill1012_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1012_33 = new byte[8];
        (__sourceSpill1012_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1012_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1012_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1012_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1012_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1012_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1012_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1012_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1012_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1012_34)).doFinal(((byte[])(__sourceSpill1012_33)));
        (__sourceSpill1012_30)[__sourceSpill1012_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    zb = ((long[])(local8_life19));
    Ab = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public float e__Float() {
return 0x1.ccccccp-2f;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
net.minecraft.world.EnumDifficulty forwardValue3991_38_0;
    net.minecraft.world.EnumDifficulty forwardValue3991_38_1;
    int forwardValue3991_66_0;
    int forwardValue3991_68_0;
    boolean spill3991_0;
    int spill3991_1;
    net.minecraft.world.EnumDifficulty spill3991_2;
    net.minecraft.world.EnumDifficulty spill3991_3;
    int spill3991_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_27;
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_45: {
    forward_join_38: {
    forward_join_34: {
    life2_3 = (moom.s_.cb ^ 29020749132885L);
    life4_5 = moom.vN.b();
    spill3991_0 = super.c__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_5 == null))) {
        forwardValue3991_68_0 = ((spill3991_0) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill3991_0)) {
        break forward_join_67;
    }
    spill3991_1 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue3991_66_0 = spill3991_1;
        break forward_join_66;
    }
    if (!((spill3991_1 != 0))) {
        break forward_join_65;
    }
    life5_27 = 0;
    spill3991_2 = ((net.minecraft.world.World)(((moom.s_)(this)).i)).a__bB();
    spill3991_3 = net.minecraft.world.EnumDifficulty.NORMAL;
    if (!((life4_5 == null))) {
        forwardValue3991_38_0 = spill3991_2;
        forwardValue3991_38_1 = spill3991_3;
        break forward_join_38;
    }
    if (!((spill3991_2 == spill3991_3))) {
        break forward_join_34;
    }
    life5_27 = __sourceIntrinsic_e42ce9941c53_invokedynamic3991_8(19452, (770571967988229081L ^ life2_3));
    if (!((life4_5 != null))) {
        break forward_join_45;
    }
    }
    forwardValue3991_38_0 = ((net.minecraft.world.World)(((moom.s_)(this)).i)).a__bB();
    forwardValue3991_38_1 = net.minecraft.world.EnumDifficulty.HARD;
    }
    if (!((forwardValue3991_38_0 == forwardValue3991_38_1))) {
        break forward_join_45;
    }
    life5_27 = __sourceIntrinsic_e42ce9941c53_invokedynamic3991_12(18408, (3459359483318169551L ^ life2_3));
    }
    spill3991_4 = life5_27;
    if (!((life4_5 == null))) {
        forwardValue3991_66_0 = spill3991_4;
        break forward_join_66;
    }
    if (!((spill3991_4 > 0))) {
        break forward_join_65;
    }
    ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).I, (life5_27 * __sourceIntrinsic_e42ce9941c53_invokedynamic3991_16(13229, (6494136255402941321L ^ life2_3))), 0))));
    }
    forwardValue3991_66_0 = 1;
    }
    return ((forwardValue3991_66_0) != 0);
    }
    forwardValue3991_68_0 = 0;
    }
    return ((forwardValue3991_68_0) != 0);
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral9050_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.s_.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int f(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13011;
      if (Ab[var3] == null) {
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
         long var5 = zb[var3];
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
         Object[] var9 = (Object[])Bb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Bb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/s_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Ab[var3] = var15;
      }

      return Ab[var3];
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.s_)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.8p3d)));
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
return p1;
}


private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic3991_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic3991_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic3991_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral9050_0() throws E;
}
