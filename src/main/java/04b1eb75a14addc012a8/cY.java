package com.moon;


public class cY {

private final java.util.List<com.moon.cZ> a;

private static final long b;

private static final long c;

public cY(java.util.List<com.moon.cZ> p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(5509419427304134609L)), ((long)(-7384275893685749743L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(26073865858718L)))));
    long local0_life6 = (com.moon.cY.b ^ 62167631457930L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill48_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill48_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill48_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill48_13 = new byte[8];
    (__sourceSpill48_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill48_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation48_15 = __sourceSpill48_13;
    ((javax.crypto.Cipher)(__sourceSpill48_10)).init(((int)(__sourceSpill48_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill48_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation48_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6016831431994804382L;
    byte[] __sourceSpill48_19 = new byte[8];
    (__sourceSpill48_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill48_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill48_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill48_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill48_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill48_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill48_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill48_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill48_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill48_20)).doFinal(((byte[])(__sourceSpill48_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.eI p0) {
int lexicalValue5_30_0;
    int lexicalValue5_34_0;
    int lexicalValue5_36_0;
    com.moon.cZ lexicalValue5_58_0;
    int lexicalValue5_66_0;
    int lexicalValue5_74_0;
    int lexicalValue5_76_0;
    boolean spill5_0;
    boolean spill5_1;
    boolean spill5_2;
    com.moon.cZ spill5_3;
    int spill5_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_60;
    java.util.Iterator life6_69;
    com.moon.cZ life7_76;
    int life8_123;
    lexical_join_86: {
    lexical_join_40: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_30: {
    lexical_join_25: {
    life2_3 = (com.moon.cY.b ^ 67814931729213L);
    life4_5 = com.moon.cX.b();
    spill5_0 = ((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")));
    if (!((life4_5 != null))) {
        lexicalValue5_30_0 = ((spill5_0) ? 1 : 0);
        break lexical_join_30;
    }
    if (!(spill5_0)) {
        break lexical_join_25;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() != null))) {
        break lexical_join_25;
    }
    spill5_1 = com.moon.runtime.LocalClientState.c;
    if (!((life4_5 != null))) {
        lexicalValue5_30_0 = ((spill5_1) ? 1 : 0);
        break lexical_join_30;
    }
    if (!(spill5_1)) {
        break lexical_join_25;
    }
    spill5_2 = ((com.moon.runtime.LocalClientProfile)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c())).a__Boolean();
    if (!((life4_5 != null))) {
        lexicalValue5_30_0 = ((spill5_2) ? 1 : 0);
        break lexical_join_30;
    }
    if (!((!spill5_2))) {
        break lexical_join_35;
    }
    }
    lexicalValue5_30_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(com.moon.cY.c)));
    }
    if (!((life4_5 != null))) {
        lexicalValue5_34_0 = lexicalValue5_30_0;
        break lexical_join_34;
    }
    if (!((lexicalValue5_30_0 > 0))) {
        break lexical_join_35;
    }
    lexicalValue5_34_0 = 1;
    }
    lexicalValue5_36_0 = lexicalValue5_34_0;
    break lexical_join_36;
    }
    lexicalValue5_36_0 = 0;
    }
    life5_60 = lexicalValue5_36_0;
    if (!((life5_60 != 0))) {
        break lexical_join_40;
    }
    return;
    }
    life6_69 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_44: while (true) {
    lexical_join_81: {
    lexical_join_76: {
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_66: {
    lexical_join_58: {
    if (!(((java.util.Iterator)(life6_69)).hasNext())) {
        break lexical_join_86;
    }
    life7_76 = ((com.moon.cZ)(((java.util.Iterator)(life6_69)).next()));
    spill5_3 = life7_76;
    if (!((life4_5 != null))) {
        lexicalValue5_58_0 = spill5_3;
        break lexical_join_58;
    }
    if (!((((com.moon.cZ)(spill5_3)).getInputSource() == com.moon.module.InputSource.KEYBOARD))) {
        break lexical_join_75;
    }
    lexicalValue5_58_0 = life7_76;
    }
    spill5_4 = ((com.moon.cZ)(lexicalValue5_58_0)).getKeyCode();
    if (!((life4_5 != null))) {
        lexicalValue5_66_0 = spill5_4;
        break lexical_join_66;
    }
    if (!((spill5_4 == ((com.moon.eI)(p0)).a()))) {
        break lexical_join_75;
    }
    lexicalValue5_66_0 = ((((com.moon.eI)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue5_74_0 = lexicalValue5_66_0;
        break lexical_join_74;
    }
    if (!((lexicalValue5_66_0 == 0))) {
        break lexical_join_73;
    }
    if (!((((com.moon.cZ)(life7_76)).getPressType() == com.moon.module.PressType.HOLD))) {
        break lexical_join_75;
    }
    }
    lexicalValue5_74_0 = 1;
    }
    lexicalValue5_76_0 = lexicalValue5_74_0;
    break lexical_join_76;
    }
    lexicalValue5_76_0 = 0;
    }
    life8_123 = lexicalValue5_76_0;
    if (!((life8_123 != 0))) {
        break lexical_join_81;
    }
    ((com.moon.cZ)(life7_76)).a__Void();
    }
    if (!((life4_5 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}


public void a(com.moon.eJ p0) {
com.moon.cZ lexicalValue6_24_0;
    int lexicalValue6_32_0;
    int lexicalValue6_40_0;
    int lexicalValue6_42_0;
    net.minecraft.entity.Entity[] spill6_0;
    com.moon.cZ spill6_1;
    int spill6_2;
    long life2_3;
    java.util.Iterator life5_8;
    net.minecraft.entity.Entity[] life4_9;
    com.moon.cZ life6_16;
    int life7_63;
    lexical_join_49: {
    life2_3 = (com.moon.cY.b ^ 76571507481922L);
    spill6_0 = com.moon.cX.b();
    life5_8 = ((java.util.List)(this.a)).iterator();
    life4_9 = spill6_0;
    lexical_cycle_10: while (true) {
    lexical_join_47: {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_32: {
    lexical_join_24: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_49;
    }
    life6_16 = ((com.moon.cZ)(((java.util.Iterator)(life5_8)).next()));
    spill6_1 = life6_16;
    if (!((life4_9 != null))) {
        lexicalValue6_24_0 = spill6_1;
        break lexical_join_24;
    }
    if (!((((com.moon.cZ)(spill6_1)).getInputSource() == com.moon.module.InputSource.MOUSE))) {
        break lexical_join_41;
    }
    lexicalValue6_24_0 = life6_16;
    }
    spill6_2 = ((com.moon.cZ)(lexicalValue6_24_0)).getKeyCode();
    if (!((life4_9 != null))) {
        lexicalValue6_32_0 = spill6_2;
        break lexical_join_32;
    }
    if (!((spill6_2 == ((com.moon.eJ)(p0)).a()))) {
        break lexical_join_41;
    }
    lexicalValue6_32_0 = ((((com.moon.eJ)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 != null))) {
        lexicalValue6_40_0 = lexicalValue6_32_0;
        break lexical_join_40;
    }
    if (!((lexicalValue6_32_0 == 0))) {
        break lexical_join_39;
    }
    if (!((((com.moon.cZ)(life6_16)).getPressType() == com.moon.module.PressType.HOLD))) {
        break lexical_join_41;
    }
    }
    lexicalValue6_40_0 = 1;
    }
    lexicalValue6_42_0 = lexicalValue6_40_0;
    break lexical_join_42;
    }
    lexicalValue6_42_0 = 0;
    }
    life7_63 = lexicalValue6_42_0;
    if (!((life7_63 != 0))) {
        break lexical_join_47;
    }
    ((com.moon.cZ)(life6_16)).a__Void();
    }
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}

}
