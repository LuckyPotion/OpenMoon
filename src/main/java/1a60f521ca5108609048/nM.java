package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nM implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.boss.EntityDragon> {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

private static final long e;

public nM() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(8435648676690331669L)), ((long)(6421137080109247112L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(71990741870061L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.nM.a ^ 47894457205157L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill939_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill939_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill939_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill939_14 = new byte[8];
    (__sourceSpill939_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill939_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation939_16 = __sourceSpill939_14;
    ((javax.crypto.Cipher)(__sourceSpill939_11)).init(((int)(__sourceSpill939_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill939_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation939_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[6];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "ZLÜWYcZK©>ú/rßú Eh*ÿöhgèÃ´Ì$"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill939_25 = local11_life21;
        int __sourceSpill939_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill939_25)).substring(((int)(__sourceSpill939_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill939_30 = local13_life19;
        int __sourceSpill939_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill939_33 = new byte[8];
        (__sourceSpill939_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill939_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill939_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill939_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill939_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill939_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill939_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill939_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill939_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill939_34)).doFinal(((byte[])(__sourceSpill939_33)));
        (__sourceSpill939_30)[__sourceSpill939_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "\020L#Y{²yÜs«¯Å¯"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill939_38 = local11_life21;
        int __sourceSpill939_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill939_38)).substring(((int)(__sourceSpill939_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill939_43 = local13_life19;
        int __sourceSpill939_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill939_46 = new byte[8];
        (__sourceSpill939_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill939_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill939_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill939_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill939_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill939_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill939_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill939_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill939_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill939_47)).doFinal(((byte[])(__sourceSpill939_46)));
        (__sourceSpill939_43)[__sourceSpill939_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    b = ((long[])(local13_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[6]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill939_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill939_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill939_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill939_58 = new byte[8];
    (__sourceSpill939_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill939_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation939_60 = __sourceSpill939_58;
    ((javax.crypto.Cipher)(__sourceSpill939_55)).init(((int)(__sourceSpill939_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill939_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation939_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -223401009060764594L;
    byte[] __sourceSpill939_64 = new byte[8];
    (__sourceSpill939_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill939_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill939_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill939_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill939_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill939_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill939_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill939_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill939_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill939_65)).doFinal(((byte[])(__sourceSpill939_64)));
    e = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3BAB;
        if (c[n8] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = b[n8];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/nM", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nM.c[n8] = n10;
        }
        return c[n8];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.nM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8490_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.entity.boss.EntityDragon p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long life9_3;
    net.minecraft.client.renderer.Tessellator life11_15;
    moom.lw life12_18;
    float life13_27;
    float life14_29;
    java.util.Random life15_44;
    int life16_70;
    float life17_146;
    float life18_157;
    life9_3 = (moom.nM.a ^ 96219543044811L);
    if (((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw())).c__Boolean()) {
        return;
    }
    if ((((net.minecraft.entity.boss.EntityDragon)(p0)).ce > 0)) {
        life11_15 = net.minecraft.client.renderer.Tessellator.a();
        life12_18 = ((net.minecraft.client.renderer.Tessellator)(life11_15)).a__lw();
        moom.lt.a();
        life13_27 = ((((float) ((net.minecraft.entity.boss.EntityDragon)(p0)).ce) + p3) / 0x1.9p7f);
        life14_29 = 0x0.0p0f;
        if ((life13_27 > 0x1.99999ap-1f)) {
        life14_29 = ((life13_27 - 0x1.99999ap-1f) / 0x1.99999ap-3f);
    }
        life15_44 = new java.util.Random(moom.nM.e);
        int spill6916_0 = 18984;
        moom.kZ.v();
        moom.kZ.j(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_11(spill6916_0, (485772214432518022L ^ life9_3)))));
        int spill6916_1 = 23478;
        moom.kZ.l();
        moom.kZ.b(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_14(spill6916_1, (5408515237255994908L ^ life9_3)))), ((int)(1)));
        moom.kZ.c__Void();
        moom.kZ.o();
        moom.kZ.a(((boolean)(false)));
        moom.kZ.B();
        moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(-0x1.0p1f)));
        life16_70 = 0;
        while ((((float) life16_70) < (((life13_27 + (life13_27 * life13_27)) / 0x1.0p1f) * 0x1.ep5f))) {
        moom.kZ.b(((float)((((java.util.Random)(life15_44)).nextFloat() * 0x1.68p8f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((((java.util.Random)(life15_44)).nextFloat() * 0x1.68p8f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((((java.util.Random)(life15_44)).nextFloat() * 0x1.68p8f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.b(((float)((((java.util.Random)(life15_44)).nextFloat() * 0x1.68p8f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((((java.util.Random)(life15_44)).nextFloat() * 0x1.68p8f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(((((java.util.Random)(life15_44)).nextFloat() * 0x1.68p8f) + (life13_27 * 0x1.68p6f)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
        life17_146 = (((((java.util.Random)(life15_44)).nextFloat() * 0x1.4p4f) + 0x1.4p2f) + (life14_29 * 0x1.4p3f));
        life18_157 = (((((java.util.Random)(life15_44)).nextFloat() * 0x1.0p1f) + 0x1.0p0f) + (life14_29 * 0x1.0p1f));
        ((moom.lw)(life12_18)).a(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_35(22964, (425074720493067295L ^ life9_3)))), ((moom.oD)(moom.oB.h)));
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_18)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_39(26635, (1800409577436704166L ^ life9_3)))), ((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_40(22615, (5634120986930798072L ^ life9_3)))), ((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_41(22615, (5634120986930798072L ^ life9_3)))), ((int)(((int) (0x1.fep7f * (0x1.0p0f - life14_29)))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_18)).a(((double)((-0x1.bb645a1cac083p-1d * ((double) life18_157)))), ((double)(((double) life17_146))), ((double)(((double) (-0x1.0p-1f * life18_157))))))).a(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_45(22615, (5634120986930798072L ^ life9_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_46(22615, (5634120986930798072L ^ life9_3)))), ((int)(0))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_18)).a(((double)((0x1.bb645a1cac083p-1d * ((double) life18_157)))), ((double)(((double) life17_146))), ((double)(((double) (-0x1.0p-1f * life18_157))))))).a(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_50(22615, (5634120986930798072L ^ life9_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_51(22615, (5634120986930798072L ^ life9_3)))), ((int)(0))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_18)).a(((double)(0x0.0p0d)), ((double)(((double) life17_146))), ((double)(((double) life18_157)))))).a(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_55(22615, (5634120986930798072L ^ life9_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_56(22615, (5634120986930798072L ^ life9_3)))), ((int)(0))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_18)).a(((double)((-0x1.bb645a1cac083p-1d * ((double) life18_157)))), ((double)(((double) life17_146))), ((double)(((double) (-0x1.0p-1f * life18_157))))))).a(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_60(22615, (5634120986930798072L ^ life9_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_61(22615, (5634120986930798072L ^ life9_3)))), ((int)(0))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life11_15)).a__Void();
        life16_70 += 1;
    }
        moom.kZ.C();
        int spill6916_2 = 18957;
        moom.kZ.a(((boolean)(true)));
        long spill6916_3 = (5438175186665295777L ^ life9_3);
        moom.kZ.p();
        moom.kZ.k();
        moom.kZ.j(((int)(__sourceIntrinsic_5a59d73fcf97_invokedynamic6916_69(spill6916_2, spill6916_3))));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.u();
        moom.kZ.d__Void();
        moom.lt.b();
    }
    return;
}


public void a__sourceBridge_a569c1ca8a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((moom.nM)(this)).a(((net.minecraft.entity.boss.EntityDragon)(((net.minecraft.entity.boss.EntityDragon)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8490_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a59d73fcf97_invokedynamic6916_69(int a0, long a1) throws E;


}
