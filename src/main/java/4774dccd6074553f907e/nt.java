package com.moon;


public abstract class nt {

private final java.lang.String a;

private com.moon.module.impl.ClickGUI b;

private static int[] c;

private static final long e;

private static final long g;

public nt(java.lang.String p0) {
super();
    this.a = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(8079353391122535777L)), ((long)(-884776544357125883L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122835497396003L)))));
    int[] __sourceSpill318_6 = new int[2];
    long local0_life7 = (com.moon.nt.e ^ 130670174616385L);
    com.moon.nt.b(((int[])(__sourceSpill318_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill318_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill318_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill318_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill318_15 = new byte[8];
    (__sourceSpill318_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill318_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation318_17 = __sourceSpill318_15;
    ((javax.crypto.Cipher)(__sourceSpill318_12)).init(((int)(__sourceSpill318_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill318_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation318_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -4513887549797094725L;
    byte[] __sourceSpill318_21 = new byte[8];
    (__sourceSpill318_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill318_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill318_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill318_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill318_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill318_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill318_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill318_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill318_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill318_22)).doFinal(((byte[])(__sourceSpill318_21)));
    g = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static int[] b() {
return com.moon.nt.c;
}


public static void b(int[] p0) {
com.moon.nt.c = ((int[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, int p1) {
com.moon.nt forwardValue1131_19_0;
    int forwardValue1131_87_0;
    int forwardValue1131_89_0;
    int forwardValue1131_102_0;
    float forwardValue1131_105_0;
    com.moon.nt spill1131_0;
    int spill1131_1;
    int spill1131_2;
    long life3_3;
    int[] life5_5;
    moom.ir life6_28;
    com.moon.jm life7_33;
    float life8_35;
    float life9_37;
    float life10_39;
    float life11_49;
    float life12_59;
    float life13_61;
    com.moon.hW life14_66;
    com.moon.hW life15_71;
    com.moon.hW life16_78;
    int life17_98;
    float life18_119;
    forward_join_165: {
    forward_join_105: {
    forward_join_102: {
    forward_join_101: {
    forward_join_89: {
    forward_join_88: {
    forward_join_87: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (com.moon.nt.e ^ 10925664506636L);
    life5_5 = com.moon.nt.b();
    spill1131_0 = this;
    if (!((life5_5 != null))) {
        forwardValue1131_19_0 = spill1131_0;
        break forward_join_19;
    }
    if (!((((com.moon.nt)(spill1131_0)).b == null))) {
        break forward_join_18;
    }
    this.b = ((com.moon.module.impl.ClickGUI)(((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))))));
    }
    forwardValue1131_19_0 = this;
    }
    if (!(((com.moon.nt)(forwardValue1131_19_0)).a())) {
        break forward_join_165;
    }
    life6_28 = com.moon.nS.a();
    life7_33 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life8_35 = 0x1.dp2f;
    life9_37 = 0x1.cp1f;
    life10_39 = 0x1.4p1f;
    life11_49 = (((com.moon.jm)(life7_33)).a(((java.lang.String)(this.a)), ((float)(life8_35))) + (life9_37 * 0x1.0p1f));
    life12_59 = (((com.moon.jm)(life7_33)).b(((java.lang.String)(this.a)), ((float)(life8_35))) + (life10_39 * 0x1.0p1f));
    life13_61 = 0x1.0p3f;
    life14_66 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life15_71 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a();
    life16_78 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_33))))).a();
    spill1131_1 = recovery.source.CarrierOps.fcmpl(((float)(((((float) p0) + life13_61) + life11_49))), ((float)(((float) ((moom.ir)(life6_28)).a__Int()))));
    if (!((life5_5 != null))) {
        forwardValue1131_87_0 = spill1131_1;
        break forward_join_87;
    }
    if (!((spill1131_1 > 0))) {
        break forward_join_88;
    }
    forwardValue1131_87_0 = 1;
    }
    forwardValue1131_89_0 = forwardValue1131_87_0;
    break forward_join_89;
    }
    forwardValue1131_89_0 = 0;
    }
    life17_98 = forwardValue1131_89_0;
    spill1131_2 = life17_98;
    if (!((life5_5 != null))) {
        forwardValue1131_102_0 = spill1131_2;
        break forward_join_102;
    }
    if (!((spill1131_2 != 0))) {
        break forward_join_101;
    }
    forwardValue1131_105_0 = ((((float) p0) - life13_61) - life11_49);
    break forward_join_105;
    }
    forwardValue1131_102_0 = p0;
    }
    forwardValue1131_105_0 = (((float) forwardValue1131_102_0) + life13_61);
    }
    life18_119 = forwardValue1131_105_0;
    ((com.moon.hW)(life14_66)).a(((com.moon.iX)(com.moon.i3.a(((float)(life18_119)), ((float)(((float) (p1 - 2)))), ((float)(life11_49)), ((float)(life12_59)), ((float)(0x1.0p2f)), ((int)(((int) com.moon.nt.g)))))));
    ((com.moon.hW)(life15_71)).a(((com.moon.iX)(com.moon.i1.a(((float)((life18_119 - 0x1.0p0f))), ((float)((((float) p1) - 0x1.8p1f))), ((float)((life11_49 + 0x1.0p1f))), ((float)((life12_59 + 0x1.0p1f))), ((float)(0x1.0p2f)), ((float)(0x1.0p-1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(this.b)).a__kX())).getValue())))).intValue()))))));
    ((com.moon.jm)(life7_33)).b(((com.moon.hW)(life16_78)), ((java.lang.String)(this.a)), ((float)(life8_35)), ((float)((life18_119 + life9_37))), ((float)(((((float) p1) - 0x1.8p0f) + life10_39))), ((int)(-1)));
    ((com.moon.hW)(life14_66)).b();
    ((com.moon.hW)(life15_71)).b();
    ((com.moon.hW)(life16_78)).b();
    }
    return;
}


public abstract boolean a();
}
