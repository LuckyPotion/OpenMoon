package moom;


public class MT {

private static final long a;

private static final long b;

public MT() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-7909311090684463807L)), ((long)(-5406997604709184556L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78885680020861L)))));
    long local0_life6 = (moom.MT.a ^ 100405180715093L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill696_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill696_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill696_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill696_13 = new byte[8];
    (__sourceSpill696_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill696_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation696_15 = __sourceSpill696_13;
    ((javax.crypto.Cipher)(__sourceSpill696_10)).init(((int)(__sourceSpill696_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill696_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation696_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3448576185638652545L;
    byte[] __sourceSpill696_19 = new byte[8];
    (__sourceSpill696_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill696_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill696_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill696_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill696_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill696_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill696_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill696_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill696_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill696_20)).doFinal(((byte[])(__sourceSpill696_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public static java.util.Iterator<moom.mp> a(net.minecraft.client.multiplayer.WorldClient p0, double p1, net.minecraft.entity.Entity p2, int p3, moom.lv p4) {
int forwardValue2693_23_0;
    int forwardValue2693_32_0;
    int forwardValue2693_55_0;
    float forwardValue2693_58_0;
    float forwardValue2693_58_1;
    float forwardValue2693_61_0;
    int spill2693_0;
    int spill2693_1;
    int spill2693_2;
    float spill2693_3;
    float spill2693_4;
    long life6_3;
    float life9_6;
    int life8_7;
    int life10_44;
    float life11_49;
    float life12_53;
    float life13_85;
    float life14_89;
    float life15_95;
    float life16_102;
    moom.DT life17_121;
    moom.DT life18_142;
    moom.DT life19_160;
    java.util.List life10_173;
    forward_join_146: {
    forward_join_61: {
    forward_join_60: {
    forward_join_58: {
    forward_join_55: {
    forward_join_32: {
    forward_join_23: {
    life6_3 = (moom.MT.a ^ 32731940237964L);
    spill2693_0 = moom.MS.b();
    life9_6 = moom.MP.a();
    life8_7 = spill2693_0;
    spill2693_1 = recovery.source.CarrierOps.fcmpl(((float)(life9_6)), ((float)(0x0.0p0f)));
    if (!((life8_7 == 0))) {
        forwardValue2693_23_0 = spill2693_1;
        break forward_join_23;
    }
    if (!((spill2693_1 > 0))) {
        break forward_join_146;
    }
    forwardValue2693_23_0 = recovery.source.CarrierOps.fcmpg(((float)(life9_6)), ((float)(((float) ((p3 - 1) * ((int) moom.MT.b))))));
    }
    if (!((life8_7 == 0))) {
        forwardValue2693_32_0 = forwardValue2693_23_0;
        break forward_join_32;
    }
    if (!((forwardValue2693_23_0 < 0))) {
        break forward_join_146;
    }
    forwardValue2693_32_0 = (moom.Dr.b__Int(((float)((life9_6 / 0x1.0p4f)))) + 1);
    }
    life10_44 = forwardValue2693_32_0;
    life11_49 = ((net.minecraft.client.multiplayer.WorldClient)(p0)).c(((float)(((float) p1))));
    life12_53 = (moom.MP.ey * moom.Dr.f);
    spill2693_2 = recovery.source.CarrierOps.fcmpl(((float)(life11_49)), ((float)(moom.Dr.d)));
    if (!((life8_7 == 0))) {
        forwardValue2693_55_0 = spill2693_2;
        break forward_join_55;
    }
    if (!((spill2693_2 > 0))) {
        break forward_join_60;
    }
    spill2693_3 = life11_49;
    spill2693_4 = (0x1.8p1f * moom.Dr.d);
    if (!((life8_7 == 0))) {
        forwardValue2693_58_0 = spill2693_3;
        forwardValue2693_58_1 = spill2693_4;
        break forward_join_58;
    }
    forwardValue2693_55_0 = recovery.source.CarrierOps.fcmpg(((float)(spill2693_3)), ((float)(spill2693_4)));
    }
    if (!((forwardValue2693_55_0 < 0))) {
        break forward_join_60;
    }
    forwardValue2693_58_0 = life11_49;
    forwardValue2693_58_1 = moom.Dr.b;
    }
    forwardValue2693_61_0 = (forwardValue2693_58_0 + forwardValue2693_58_1);
    break forward_join_61;
    }
    forwardValue2693_61_0 = life11_49;
    }
    life13_85 = forwardValue2693_61_0;
    life14_89 = (-moom.Dr.a(((float)(life13_85))));
    life15_95 = (moom.Dr.b(((float)(life13_85))) * moom.Dr.b(((float)(life12_53))));
    life16_102 = ((-moom.Dr.b(((float)(life13_85)))) * moom.Dr.a(((float)(life12_53))));
    life17_121 = new moom.DT((moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p2)).n))) >> 4), (moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p2)).o))) >> 4), (moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p2)).p))) >> 4));
    life18_142 = __sourceExactCall_85f83ee78344f7(((moom.DT)(life17_121)), ((double)(((double) ((-life14_89) * ((float) life10_44))))), ((double)(((double) ((-life15_95) * ((float) life10_44))))), ((double)(((double) ((-life16_102) * ((float) life10_44))))));
    life19_160 = __sourceExactCall_85f83ee78344f7(((moom.DT)(life17_121)), ((double)(((double) (life14_89 * ((float) p3))))), ((double)(((double) (life15_95 * ((float) p3))))), ((double)(((double) (life16_102 * ((float) p3))))));
    return new moom.Mz(p4, life18_142, life19_160, life10_44, life10_44);
    }
    life10_173 = java.util.Arrays.asList(((java.lang.Object[])(((moom.lv)(p4)).f)));
    return ((java.util.List)(life10_173)).iterator();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native moom.DT __sourceExactCall_85f83ee78344f7(moom.DT p0, double p1, double p2, double p3);
}
