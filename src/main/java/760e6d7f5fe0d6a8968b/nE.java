package com.moon;


public class nE {

private static final net.minecraft.client.Minecraft a;

public static float b;

public static float c;

public static float d;

private com.moon.module.impl.AntiBot e;

private static final long f;

public nE() {
super();
    this.e = ((com.moon.module.impl.AntiBot) (((com.moon.runtime.ClientContext.getInstance()).a__fU()).a(com.moon.module.impl.AntiBot.class)));
}


static {
f = (moom._c.a(786576393866713885L, -6782808280101960087L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(81816139722205L);
    a = net.minecraft.client.Minecraft.a__fM();
    b = 0x1.921fb60000000p+1f;
    c = (com.moon.nE.b / 0x1.6800000000000p+7f);
    d = (0x1.6800000000000p+7f / com.moon.nE.b);
}


public static float b() {
float local0 = ((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).W)).l * 0x1.333334p-1f) + 0x1.99999ap-3f);
    return (((local0 * local0) * local0) * 0x1.0p3f);
}


public static double b(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.EntityLivingBase forwardValue1024_11_0;
    double forwardValue1024_57_0;
    double forwardValue1024_57_1;
    double forwardValue1024_60_0;
    net.minecraft.entity.EntityLivingBase spill1024_0;
    double spill1024_1;
    double spill1024_2;
    long life1_3;
    int life3_5;
    moom.DR life4_34;
    double life5_51;
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_57: {
    forward_join_11: {
    life1_3 = (com.moon.nE.f ^ 96348425361602L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1024_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue1024_11_0 = spill1024_0;
        break forward_join_11;
    }
    if (!((spill1024_0 != null))) {
        break forward_join_61;
    }
    forwardValue1024_11_0 = p0;
    }
    life4_34 = ((moom.DR)(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(forwardValue1024_11_0)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) (((net.minecraft.entity.EntityLivingBase)(p0)).e__Float() / 0x1.0p1f)))), ((double)(0x0.0p0d))))).c__DR(((moom.DR)(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).e__Float()))), ((double)(0x0.0p0d))))));
    life5_51 = (java.lang.Math.abs(((double)((((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).w) - (java.lang.Math.toDegrees(((double)(java.lang.Math.atan2(((double)(((moom.DR)(life4_34)).c)), ((double)(((moom.DR)(life4_34)).a)))))) - 0x1.68p6d))))) % 0x1.68p8d);
    spill1024_1 = life5_51;
    spill1024_2 = 0x1.68p7d;
    if (!((life3_5 == 0))) {
        forwardValue1024_57_0 = spill1024_1;
        forwardValue1024_57_1 = spill1024_2;
        break forward_join_57;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1024_1)), ((double)(spill1024_2))) > 0))) {
        break forward_join_59;
    }
    forwardValue1024_57_0 = 0x1.68p8d;
    forwardValue1024_57_1 = life5_51;
    }
    forwardValue1024_60_0 = (forwardValue1024_57_0 - forwardValue1024_57_1);
    break forward_join_60;
    }
    forwardValue1024_60_0 = life5_51;
    }
    return forwardValue1024_60_0;
    }
    return 0x0.0p0d;
}


public static double c(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.EntityLivingBase forwardValue1025_11_0;
    double forwardValue1025_57_0;
    double forwardValue1025_57_1;
    double forwardValue1025_60_0;
    net.minecraft.entity.EntityLivingBase spill1025_0;
    double spill1025_1;
    double spill1025_2;
    long life1_3;
    int life3_5;
    moom.DR life4_34;
    double life5_51;
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_57: {
    forward_join_11: {
    life1_3 = (com.moon.nE.f ^ 59133041684573L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1025_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue1025_11_0 = spill1025_0;
        break forward_join_11;
    }
    if (!((spill1025_0 != null))) {
        break forward_join_61;
    }
    forwardValue1025_11_0 = p0;
    }
    life4_34 = ((moom.DR)(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(forwardValue1025_11_0)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) (((net.minecraft.entity.EntityLivingBase)(p0)).e__Float() / 0x1.0p1f)))), ((double)(0x0.0p0d))))).c__DR(((moom.DR)(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).e__Float()))), ((double)(0x0.0p0d))))));
    life5_51 = (java.lang.Math.abs(((double)((((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).cw) - (java.lang.Math.toDegrees(((double)(java.lang.Math.atan2(((double)(((moom.DR)(life4_34)).c)), ((double)(((moom.DR)(life4_34)).a)))))) - 0x1.68p6d))))) % 0x1.68p8d);
    spill1025_1 = life5_51;
    spill1025_2 = 0x1.68p7d;
    if (!((life3_5 == 0))) {
        forwardValue1025_57_0 = spill1025_1;
        forwardValue1025_57_1 = spill1025_2;
        break forward_join_57;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1025_1)), ((double)(spill1025_2))) > 0))) {
        break forward_join_59;
    }
    forwardValue1025_57_0 = 0x1.68p8d;
    forwardValue1025_57_1 = life5_51;
    }
    forwardValue1025_60_0 = (forwardValue1025_57_0 - forwardValue1025_57_1);
    break forward_join_60;
    }
    forwardValue1025_60_0 = life5_51;
    }
    return forwardValue1025_60_0;
    }
    return 0x0.0p0d;
}


public double d(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.EntityLivingBase forwardValue1026_11_0;
    double forwardValue1026_57_0;
    double forwardValue1026_57_1;
    double forwardValue1026_60_0;
    net.minecraft.entity.EntityLivingBase spill1026_0;
    double spill1026_1;
    double spill1026_2;
    long life2_3;
    int life4_5;
    moom.DR life5_34;
    double life6_51;
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_57: {
    forward_join_11: {
    life2_3 = (com.moon.nE.f ^ 79564136004907L);
    life4_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1026_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1026_11_0 = spill1026_0;
        break forward_join_11;
    }
    if (!((spill1026_0 != null))) {
        break forward_join_61;
    }
    forwardValue1026_11_0 = p0;
    }
    life5_34 = ((moom.DR)(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(forwardValue1026_11_0)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) (((net.minecraft.entity.EntityLivingBase)(p0)).e__Float() / 0x1.0p1f)))), ((double)(0x0.0p0d))))).c__DR(((moom.DR)(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).e__Float()))), ((double)(0x0.0p0d))))));
    life6_51 = (java.lang.Math.abs(((double)((((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).w) - (java.lang.Math.toDegrees(((double)(java.lang.Math.atan2(((double)(((moom.DR)(life5_34)).c)), ((double)(((moom.DR)(life5_34)).a)))))) - 0x1.68p6d))))) % 0x1.68p8d);
    spill1026_1 = life6_51;
    spill1026_2 = 0x1.68p7d;
    if (!((life4_5 == 0))) {
        forwardValue1026_57_0 = spill1026_1;
        forwardValue1026_57_1 = spill1026_2;
        break forward_join_57;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1026_1)), ((double)(spill1026_2))) > 0))) {
        break forward_join_59;
    }
    forwardValue1026_57_0 = 0x1.68p8d;
    forwardValue1026_57_1 = life6_51;
    }
    forwardValue1026_60_0 = (forwardValue1026_57_0 - forwardValue1026_57_1);
    break forward_join_60;
    }
    forwardValue1026_60_0 = life6_51;
    }
    return forwardValue1026_60_0;
    }
    return 0x0.0p0d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static float a() {
float local0 = moom.Dr.a(((float)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).w * com.moon.nE.c))));
    float local1 = moom.Dr.b(((float)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).w * com.moon.nE.c))));
    float local2 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).bj * local1) - (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).bk * local0));
    float local3 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).bk * local1) + (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).bj * local0));
    return ((moom.Dr.a(((float)(local3)), ((float)(local2))) * com.moon.nE.d) - 0x1.68p6f);
}


public static double a(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.EntityLivingBase forwardValue1023_11_0;
    double forwardValue1023_57_0;
    double forwardValue1023_57_1;
    double forwardValue1023_60_0;
    net.minecraft.entity.EntityLivingBase spill1023_0;
    double spill1023_1;
    double spill1023_2;
    long life1_3;
    int life3_5;
    moom.DR life4_34;
    double life5_51;
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_57: {
    forward_join_11: {
    life1_3 = (com.moon.nE.f ^ 122090246871501L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1023_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue1023_11_0 = spill1023_0;
        break forward_join_11;
    }
    if (!((spill1023_0 != null))) {
        break forward_join_61;
    }
    forwardValue1023_11_0 = p0;
    }
    life4_34 = ((moom.DR)(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(forwardValue1023_11_0)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) (((net.minecraft.entity.EntityLivingBase)(p0)).e__Float() / 0x1.0p1f)))), ((double)(0x0.0p0d))))).c__DR(((moom.DR)(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).e__Float()))), ((double)(0x0.0p0d))))));
    life5_51 = (java.lang.Math.abs(((double)((((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).w) - (java.lang.Math.toDegrees(((double)(java.lang.Math.atan2(((double)(((moom.DR)(life4_34)).c)), ((double)(((moom.DR)(life4_34)).a)))))) - 0x1.68p6d))))) % 0x1.68p8d);
    spill1023_1 = life5_51;
    spill1023_2 = 0x1.68p7d;
    if (!((life3_5 == 0))) {
        forwardValue1023_57_0 = spill1023_1;
        forwardValue1023_57_1 = spill1023_2;
        break forward_join_57;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1023_1)), ((double)(spill1023_2))) > 0))) {
        break forward_join_59;
    }
    forwardValue1023_57_0 = 0x1.68p8d;
    forwardValue1023_57_1 = life5_51;
    }
    forwardValue1023_60_0 = (forwardValue1023_57_0 - forwardValue1023_57_1);
    break forward_join_60;
    }
    forwardValue1023_60_0 = life5_51;
    }
    return forwardValue1023_60_0;
    }
    return 0x0.0p0d;
}


public static float a(float p0, float p1, float p2) {
int forwardValue1022_25_0;
    float forwardValue1022_31_0;
    float forwardValue1022_31_1;
    boolean spill1022_0;
    int spill1022_1;
    float spill1022_2;
    float spill1022_3;
    long life3_3;
    float life6_9;
    int life5_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life3_3 = (com.moon.nE.f ^ 4424454961973L);
    spill1022_0 = com.moon.aO.b__Boolean();
    life6_9 = moom.Dr.e(((float)((p1 - p0))));
    life5_10 = ((spill1022_0) ? 1 : 0);
    spill1022_1 = recovery.source.CarrierOps.fcmpl(((float)(life6_9)), ((float)(p2)));
    if (!((life5_10 == 0))) {
        forwardValue1022_25_0 = spill1022_1;
        break forward_join_25;
    }
    if (!((spill1022_1 > 0))) {
        break forward_join_19;
    }
    life6_9 = p2;
    }
    spill1022_2 = life6_9;
    spill1022_3 = (-p2);
    if (!((life5_10 == 0))) {
        forwardValue1022_31_0 = spill1022_2;
        forwardValue1022_31_1 = spill1022_3;
        break forward_join_31;
    }
    forwardValue1022_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1022_2)), ((float)(spill1022_3)));
    }
    if (!((forwardValue1022_25_0 < 0))) {
        break forward_join_29;
    }
    life6_9 = (-p2);
    }
    forwardValue1022_31_0 = p0;
    forwardValue1022_31_1 = life6_9;
    }
    return (forwardValue1022_31_0 + forwardValue1022_31_1);
}


public static float[] a(float p0, float p1) {
int forwardValue1021_25_0;
    float forwardValue1021_27_0;
    float forwardValue1021_29_0;
    int forwardValue1021_49_0;
    float forwardValue1021_51_0;
    float forwardValue1021_53_0;
    int spill1021_0;
    float spill1021_1;
    int spill1021_2;
    float spill1021_3;
    long life2_3;
    int life4_5;
    float life5_37;
    float life6_69;
    double life7_85;
    double life9_101;
    double[] life11_106;
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_49: {
    forward_join_41: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_25: {
    forward_join_17: {
    life2_3 = (com.moon.nE.f ^ 112970953262868L);
    life4_5 = ((com.moon.aO.c()) ? 1 : 0);
    spill1021_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.MovementInput)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).co)).b)), ((float)(0x0.0p0f)));
    if (!((life4_5 != 0))) {
        forwardValue1021_25_0 = spill1021_0;
        break forward_join_25;
    }
    if (!((spill1021_0 > 0))) {
        break forward_join_17;
    }
    forwardValue1021_29_0 = 0x1.0p0f;
    break forward_join_29;
    }
    spill1021_1 = ((net.minecraft.util.MovementInput)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).co)).b;
    if (!((life4_5 != 0))) {
        forwardValue1021_27_0 = spill1021_1;
        break forward_join_27;
    }
    forwardValue1021_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1021_1)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue1021_25_0 < 0))) {
        break forward_join_28;
    }
    forwardValue1021_27_0 = -0x1.0p0f;
    }
    forwardValue1021_29_0 = forwardValue1021_27_0;
    break forward_join_29;
    }
    forwardValue1021_29_0 = 0x0.0p0f;
    }
    life5_37 = forwardValue1021_29_0;
    spill1021_2 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.MovementInput)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).co)).a)), ((float)(0x0.0p0f)));
    if (!((life4_5 != 0))) {
        forwardValue1021_49_0 = spill1021_2;
        break forward_join_49;
    }
    if (!((spill1021_2 > 0))) {
        break forward_join_41;
    }
    forwardValue1021_53_0 = 0x1.0p0f;
    break forward_join_53;
    }
    spill1021_3 = ((net.minecraft.util.MovementInput)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nE.a)).K)).co)).a;
    if (!((life4_5 != 0))) {
        forwardValue1021_51_0 = spill1021_3;
        break forward_join_51;
    }
    forwardValue1021_49_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1021_3)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue1021_49_0 < 0))) {
        break forward_join_52;
    }
    forwardValue1021_51_0 = -0x1.0p0f;
    }
    forwardValue1021_53_0 = forwardValue1021_51_0;
    break forward_join_53;
    }
    forwardValue1021_53_0 = 0x0.0p0f;
    }
    life6_69 = forwardValue1021_53_0;
    life7_85 = ((((double) life6_69) * java.lang.Math.cos(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))) - (((double) life5_37) * java.lang.Math.sin(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))));
    life9_101 = ((((double) life5_37) * java.lang.Math.cos(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))) + (((double) life6_69) * java.lang.Math.sin(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))));
    life11_106 = com.moon.nE.a(((float)(p1)), ((double)(life7_85)), ((double)(life9_101)));
    return new float[] {((float) (life11_106)[1]), ((float) (life11_106)[2])};
}


private static double[] a(float p0, double p1, double p2) {
int lexicalValue275_82_0;
    double[] lexicalValue275_97_0;
    double[] lexicalValue275_105_0;
    boolean spill275_0;
    double[] spill275_1;
    int spill275_2;
    double[] spill275_3;
    double[] spill275_4;
    double[] spill275_5;
    long life5_3;
    double[] life8_6;
    int life9_8;
    int life7_9;
    int life10_14;
    double life11_33;
    double life13_49;
    double life15_53;
    double life17_57;
    double life19_66;
    lexical_join_105: {
    lexical_join_104: {
    life5_3 = (com.moon.nE.f ^ 14847796118520L);
    spill275_0 = com.moon.aO.c();
    life8_6 = null;
    life9_8 = -1;
    life7_9 = ((spill275_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_101: {
    if (!((life9_8 <= 1))) {
        break lexical_join_104;
    }
    life10_14 = -1;
    lexical_cycle_15: while (true) {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_82: {
    lexical_join_81: {
    if (!((life10_14 <= 1))) {
        break lexical_join_101;
    }
    life11_33 = ((((double) life10_14) * java.lang.Math.cos(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))) - (((double) life9_8) * java.lang.Math.sin(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))));
    life13_49 = ((((double) life9_8) * java.lang.Math.cos(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))) + (((double) life10_14) * java.lang.Math.sin(((double)(java.lang.Math.toRadians(((double)(((double) p0)))))))));
    life15_53 = (life11_33 - p1);
    life17_57 = (life13_49 - p2);
    life19_66 = java.lang.Math.sqrt(((double)(((life15_53 * life15_53) + (life17_57 * life17_57)))));
    spill275_1 = life8_6;
    if (!((life7_9 != 0))) {
        lexicalValue275_105_0 = spill275_1;
        break lexical_join_105;
    }
    if (!((life7_9 != 0))) {
        lexicalValue275_97_0 = spill275_1;
        break lexical_join_97;
    }
    if (!((spill275_1 != null))) {
        break lexical_join_81;
    }
    spill275_2 = recovery.source.CarrierOps.dcmpl(((double)((life8_6)[0])), ((double)(life19_66)));
    if (!((life7_9 != 0))) {
        lexicalValue275_82_0 = spill275_2;
        break lexical_join_82;
    }
    if (!((spill275_2 > 0))) {
        break lexical_join_98;
    }
    }
    lexicalValue275_82_0 = 3;
    }
    double[] __stackOp275_13_0 = new double[lexicalValue275_82_0];
    spill275_3 = __stackOp275_13_0;
    (__stackOp275_13_0)[0] = life19_66;
    double[] __stackOp275_14_0 = spill275_3;
    spill275_4 = __stackOp275_14_0;
    (__stackOp275_14_0)[1] = ((double) life9_8);
    double[] __stackOp275_15_0 = spill275_4;
    spill275_5 = __stackOp275_15_0;
    (__stackOp275_15_0)[2] = ((double) life10_14);
    lexicalValue275_97_0 = spill275_5;
    }
    life8_6 = lexicalValue275_97_0;
    }
    life10_14 += 1;
    if (!((life7_9 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    life9_8 += 1;
    if (!((life7_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue275_105_0 = life8_6;
    }
    return lexicalValue275_105_0;
}

}
