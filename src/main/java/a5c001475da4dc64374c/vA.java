package moom;


public class vA {

private static moom.DR a;

private static final long b;

private static final long c;

public vA() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1544621489646456328L)), ((long)(-1312354007419066232L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(123662675096037L)))));
    long local0_life6 = (moom.vA.b ^ 33884297032156L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1069_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1069_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1069_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1069_13 = new byte[8];
    (__sourceSpill1069_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1069_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1069_15 = __sourceSpill1069_13;
    ((javax.crypto.Cipher)(__sourceSpill1069_10)).init(((int)(__sourceSpill1069_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1069_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1069_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6766546919864648210L;
    byte[] __sourceSpill1069_19 = new byte[8];
    (__sourceSpill1069_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1069_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1069_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1069_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1069_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1069_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1069_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1069_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1069_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1069_20)).doFinal(((byte[])(__sourceSpill1069_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((moom.DR)(new moom.DR(0x0.0p0d, 0x0.0p0d, 0x0.0p0d)));
}


public static moom.DR b(moom.sI p0, int p1, int p2, moom.DR p3) {
moom.vA.a = ((moom.DR)(((moom.DR)(new moom.DR(((moom.sI)(p0)).n, ((moom.sI)(p0)).o, ((moom.sI)(p0)).p))).c__DR(((moom.DR)(p3)))));
    return moom.vA.c(((moom.sI)(p0)), ((int)(p1)), ((int)(p2)), ((moom.DR)(moom.vA.a)));
}


private static moom.DR c(moom.sI p0, int p1, int p2, moom.DR p3) {
int lexicalValue1350_58_0;
    int lexicalValue1350_60_0;
    int lexicalValue1350_64_0;
    int lexicalValue1350_123_0;
    int lexicalValue1350_160_0;
    int lexicalValue1350_187_0;
    int lexicalValue1350_204_0;
    int lexicalValue1350_204_1;
    int lexicalValue1350_205_0;
    int lexicalValue1350_222_0;
    moom.sI lexicalValue1350_225_0;
    moom.DT lexicalValue1350_225_1;
    moom.DR lexicalValue1350_257_0;
    boolean spill1350_0;
    boolean spill1350_1;
    int spill1350_2;
    moom.DR spill1350_3;
    int spill1350_4;
    int spill1350_5;
    int spill1350_6;
    int spill1350_7;
    int spill1350_8;
    int spill1350_9;
    moom.sI spill1350_10;
    moom.DT spill1350_11;
    long life4_3;
    java.util.Random life7_6;
    int life8_9;
    int life6_10;
    int life9_12;
    int life10_14;
    int life11_16;
    float life12_18;
    double life14_44;
    double life16_51;
    int life13_66;
    int life14_75;
    int life15_89;
    int life16_99;
    int life17_109;
    moom.DT life18_163;
    int life17_247;
    moom.DT life18_254;
    float life19_280;
    lexical_join_258: {
    lexical_join_257: {
    lexical_join_246: {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_58: {
    life4_3 = (moom.vA.b ^ 123765523959932L);
    life7_6 = ((moom.sI)(p0)).a__Random();
    spill1350_0 = moom.uc.e();
    life8_9 = 0;
    life6_10 = ((spill1350_0) ? 1 : 0);
    life9_12 = 0;
    life10_14 = 0;
    life11_16 = 0;
    life12_18 = -0x1.869fp16f;
    spill1350_1 = ((moom.sI)(p0)).aa();
    if (!((life6_10 == 0))) {
        lexicalValue1350_64_0 = ((spill1350_1) ? 1 : 0);
        break lexical_join_64;
    }
    if (!(spill1350_1)) {
        break lexical_join_63;
    }
    life14_44 = (((moom.DT)(((moom.sI)(p0)).b__sourceReturn_f4db834595())).a(((double)(((double) moom.Dr.b__Int(((double)(((moom.sI)(p0)).n)))))), ((double)(((double) moom.Dr.b__Int(((double)(((moom.sI)(p0)).o)))))), ((double)(((double) moom.Dr.b__Int(((double)(((moom.sI)(p0)).p))))))) + 0x1.0p2d);
    life16_51 = ((double) (((moom.sI)(p0)).l__sourceReturn_bc607678b6() + ((float) p1)));
    spill1350_2 = recovery.source.CarrierOps.dcmpg(((double)(life14_44)), ((double)((life16_51 * life16_51))));
    if (!((life6_10 == 0))) {
        lexicalValue1350_58_0 = spill1350_2;
        break lexical_join_58;
    }
    if (!((spill1350_2 < 0))) {
        break lexical_join_59;
    }
    lexicalValue1350_58_0 = 1;
    }
    lexicalValue1350_60_0 = lexicalValue1350_58_0;
    break lexical_join_60;
    }
    lexicalValue1350_60_0 = 0;
    }
    life13_66 = lexicalValue1350_60_0;
    if (!((life6_10 != 0))) {
        break lexical_join_65;
    }
    }
    lexicalValue1350_64_0 = 0;
    }
    life13_66 = lexicalValue1350_64_0;
    }
    life14_75 = 0;
    lexical_cycle_67: while (true) {
    lexical_join_244: {
    lexical_join_243: {
    lexical_join_225: {
    lexical_join_223: {
    lexical_join_222: {
    lexical_join_205: {
    lexical_join_204: {
    lexical_join_188: {
    lexical_join_187: {
    lexical_join_180: {
    lexical_join_161: {
    lexical_join_160: {
    lexical_join_153: {
    lexical_join_123: {
    lexical_join_121: {
    if (!((life14_75 < ((int) moom.vA.c)))) {
        break lexical_join_246;
    }
    life15_89 = (((java.util.Random)(life7_6)).nextInt(((int)(((2 * p1) + 1)))) - p1);
    life16_99 = (((java.util.Random)(life7_6)).nextInt(((int)(((2 * p2) + 1)))) - p2);
    life17_109 = (((java.util.Random)(life7_6)).nextInt(((int)(((2 * p1) + 1)))) - p1);
    spill1350_3 = p3;
    if (!((life6_10 == 0))) {
        lexicalValue1350_257_0 = spill1350_3;
        break lexical_join_257;
    }
    if (!((spill1350_3 != null))) {
        break lexical_join_121;
    }
    spill1350_4 = recovery.source.CarrierOps.dcmpl(((double)(((((double) life15_89) * ((moom.DR)(p3)).a) + (((double) life17_109) * ((moom.DR)(p3)).c)))), ((double)(0x0.0p0d)));
    if (!((life6_10 == 0))) {
        lexicalValue1350_123_0 = spill1350_4;
        break lexical_join_123;
    }
    if (!((spill1350_4 >= 0))) {
        break lexical_join_243;
    }
    }
    lexicalValue1350_123_0 = ((((moom.sI)(p0)).aa()) ? 1 : 0);
    }
    if (!((life6_10 == 0))) {
        lexicalValue1350_205_0 = lexicalValue1350_123_0;
        break lexical_join_205;
    }
    if (!((lexicalValue1350_123_0 != 0))) {
        break lexical_join_188;
    }
    spill1350_5 = p1;
    spill1350_6 = 1;
    if (!((life6_10 == 0))) {
        lexicalValue1350_204_0 = spill1350_5;
        lexicalValue1350_204_1 = spill1350_6;
        break lexical_join_204;
    }
    if (!((spill1350_5 > spill1350_6))) {
        break lexical_join_188;
    }
    life18_163 = ((moom.sI)(p0)).b__sourceReturn_f4db834595();
    spill1350_7 = recovery.source.CarrierOps.dcmpl(((double)(((moom.sI)(p0)).n)), ((double)(((double) ((moom.DT)(life18_163)).a()))));
    if (!((life6_10 == 0))) {
        lexicalValue1350_160_0 = spill1350_7;
        break lexical_join_160;
    }
    if (!((spill1350_7 > 0))) {
        break lexical_join_153;
    }
    life15_89 = (life15_89 - ((java.util.Random)(life7_6)).nextInt(((int)((p1 / 2)))));
    if (!((life6_10 != 0))) {
        break lexical_join_161;
    }
    }
    lexicalValue1350_160_0 = (life15_89 + ((java.util.Random)(life7_6)).nextInt(((int)((p1 / 2)))));
    }
    life15_89 = lexicalValue1350_160_0;
    }
    spill1350_8 = recovery.source.CarrierOps.dcmpl(((double)(((moom.sI)(p0)).p)), ((double)(((double) ((moom.DT)(life18_163)).c()))));
    if (!((life6_10 == 0))) {
        lexicalValue1350_187_0 = spill1350_8;
        break lexical_join_187;
    }
    if (!((spill1350_8 > 0))) {
        break lexical_join_180;
    }
    life17_109 = (life17_109 - ((java.util.Random)(life7_6)).nextInt(((int)((p1 / 2)))));
    if (!((life6_10 != 0))) {
        break lexical_join_188;
    }
    }
    lexicalValue1350_187_0 = (life17_109 + ((java.util.Random)(life7_6)).nextInt(((int)((p1 / 2)))));
    }
    life17_109 = lexicalValue1350_187_0;
    }
    life15_89 = (life15_89 + moom.Dr.b__Int(((double)(((moom.sI)(p0)).n))));
    life16_99 = (life16_99 + moom.Dr.b__Int(((double)(((moom.sI)(p0)).o))));
    lexicalValue1350_204_0 = life17_109;
    lexicalValue1350_204_1 = moom.Dr.b__Int(((double)(((moom.sI)(p0)).p)));
    }
    lexicalValue1350_205_0 = (lexicalValue1350_204_0 + lexicalValue1350_204_1);
    }
    life17_247 = lexicalValue1350_205_0;
    life18_254 = new moom.DT(life15_89, life16_99, life17_247);
    spill1350_9 = life13_66;
    if (!((life6_10 == 0))) {
        lexicalValue1350_222_0 = spill1350_9;
        break lexical_join_222;
    }
    if (!((spill1350_9 != 0))) {
        break lexical_join_223;
    }
    spill1350_10 = p0;
    spill1350_11 = life18_254;
    if (!((life6_10 == 0))) {
        lexicalValue1350_225_0 = spill1350_10;
        lexicalValue1350_225_1 = spill1350_11;
        break lexical_join_225;
    }
    lexicalValue1350_222_0 = ((((moom.sI)(spill1350_10)).a__Boolean(((moom.DT)(spill1350_11)))) ? 1 : 0);
    }
    if (!((lexicalValue1350_222_0 != 0))) {
        break lexical_join_243;
    }
    }
    lexicalValue1350_225_0 = p0;
    lexicalValue1350_225_1 = life18_254;
    }
    life19_280 = ((moom.sI)(lexicalValue1350_225_0)).a__sourceReturn_8d24afb582(((moom.DT)(lexicalValue1350_225_1)));
    if (!((life6_10 == 0))) {
        break lexical_join_244;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life19_280)), ((float)(life12_18))) > 0))) {
        break lexical_join_243;
    }
    life12_18 = life19_280;
    life9_12 = life15_89;
    life10_14 = life16_99;
    life11_16 = life17_247;
    life8_9 = 1;
    }
    life14_75 += 1;
    }
    if (!((life6_10 != 0))) { continue lexical_cycle_67; }
    break lexical_cycle_67;
    }
    }
    if (!((life8_9 != 0))) {
        break lexical_join_258;
    }
    lexicalValue1350_257_0 = new moom.DR(((double) life9_12), ((double) life10_14), ((double) life11_16));
    }
    return lexicalValue1350_257_0;
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.DR a(moom.sI p0, int p1, int p2) {
return moom.vA.c(((moom.sI)(p0)), ((int)(p1)), ((int)(p2)), ((moom.DR)(null)));
}


public static moom.DR a(moom.sI p0, int p1, int p2, moom.DR p3) {
moom.vA.a = ((moom.DR)(((moom.DR)(p3)).a(((double)(((moom.sI)(p0)).n)), ((double)(((moom.sI)(p0)).o)), ((double)(((moom.sI)(p0)).p)))));
    return moom.vA.c(((moom.sI)(p0)), ((int)(p1)), ((int)(p2)), ((moom.DR)(moom.vA.a)));
}

}
