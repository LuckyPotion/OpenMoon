package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
abstract class ig extends moom.h1 {

protected int y;

protected java.util.List<moom.B1> z;

protected java.util.Comparator<moom.B1> A;

protected int B;

protected int C;

net.minecraft.client.gui.achievement.GuiStats D;

private static long F;

private static long[] L;

private static java.lang.Integer[] M;

private static java.util.Map N;

protected ig(net.minecraft.client.gui.achievement.GuiStats p0, net.minecraft.client.Minecraft p1) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_2a326d4268805fcc(moom.ig receiver, net.minecraft.client.gui.achievement.GuiStats p0, net.minecraft.client.Minecraft p1) throws Throwable {

long local3 = (moom.ig.F ^ 121890581093616L);

    ((moom.ig)(receiver)).D = ((net.minecraft.client.gui.achievement.GuiStats)(p0));

    moom.ig.__sourceConstructorInit_2a326d4268805fcc_0(((moom.ig)(receiver)), ((net.minecraft.client.Minecraft)(p1)), ((int)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).k)), ((int)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).l)), ((int)(__sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_4(26616, (7949904744553670685L ^ local3)))), ((int)((((net.minecraft.client.gui.achievement.GuiStats)(p0)).l - __sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_6(21362, (8982196816156351646L ^ local3))))), ((int)(__sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_7(31650, (8896978598907245633L ^ local3)))));

    ((moom.ig)(receiver)).y = ((int)(-1));

    ((moom.ig)(receiver)).B = ((int)(-1));

    ((moom.ig)(receiver)).a(((boolean)(false)));

    ((moom.ig)(receiver)).a(((boolean)(true)), ((int)(__sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_12(31650, (8896978598907245633L ^ local3)))));

    return;

}



static {
F = ((long)(((moom._a)(moom._c.a(((long)(7624375666921219332L)), ((long)(-1530560040540697028L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16803541003574L)))));
    N = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ig.F ^ 133788696498214L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1307_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1307_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1307_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1307_14 = new byte[8];
    (__sourceSpill1307_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1307_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1307_16 = __sourceSpill1307_14;
    ((javax.crypto.Cipher)(__sourceSpill1307_11)).init(((int)(__sourceSpill1307_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1307_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1307_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[34];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\001!³¯\020É\027ÉÊ¿äç\\ñ\005êÊá^èÄÆE$Gå\020²Õß\"NÆ¼\032µ\037#<XÜáP\035FÒ)w'OtüC©ow\000½o(\023×±V1û`¿«I(½-\026w`kÃñ[c¿ZL}J½­wf×\016g¢«\004Yðë':¢\020XEk)AnËÎ\nõvÝÎü¾;Mw©¥\037lww\0264L{üZÂSb*\020Øu^:*Ã=,NhËìSÄxÜ4¥æ+È9qoFÆI\\Ý|û\017w}×dD\0332¨+´EçÉp®«\020]t´twJÐv ­tµ'À lçõ\013­FXãlÎ°±ÉÆ>ð_\003í¾¶H\022'\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1307_25 = local6_life21;
        int __sourceSpill1307_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1307_25)).substring(((int)(__sourceSpill1307_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1307_30 = local8_life19;
        int __sourceSpill1307_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1307_33 = new byte[8];
        (__sourceSpill1307_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1307_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1307_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1307_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1307_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1307_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1307_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1307_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1307_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1307_34)).doFinal(((byte[])(__sourceSpill1307_33)));
        (__sourceSpill1307_30)[__sourceSpill1307_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "!ë\004(Q\\Xl©\fù©téÇ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1307_38 = local6_life21;
        int __sourceSpill1307_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1307_38)).substring(((int)(__sourceSpill1307_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1307_43 = local8_life19;
        int __sourceSpill1307_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1307_46 = new byte[8];
        (__sourceSpill1307_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1307_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1307_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1307_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1307_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1307_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1307_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1307_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1307_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1307_47)).doFinal(((byte[])(__sourceSpill1307_46)));
        (__sourceSpill1307_43)[__sourceSpill1307_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    L = ((long[])(local8_life19));
    M = ((java.lang.Integer[])(new java.lang.Integer[34]));
}

private static native <E extends Throwable> void __sourceConstructorInit_2a326d4268805fcc_0(moom.ig a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0, int p1) {
long life3_3;
    int life5_19;
    int life6_36;
    moom.B1 life7_75;
    java.lang.String life7_83;
    java.lang.String life7_114;
    java.lang.String life7_188;
    int life8_199;
    int life9_207;
    int life10_213;
    forward_join_236: {
    forward_join_160: {
    forward_join_156: {
    forward_join_155: {
    forward_join_131: {
    forward_join_102: {
    forward_join_71: {
    forward_join_61: {
    forward_join_60: {
    life3_3 = (moom.ig.F ^ 67547877660611L);
    if (!((p1 >= this.d))) { break forward_join_236; }
    if (!((p1 <= this.e))) { break forward_join_236; }
    life5_19 = ((moom.ig)(this)).a(((int)(p0)), ((int)(p1)));
    life6_36 = (((this.b / 2) - __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_5(15657, (2766620109565131260L ^ life3_3))) - __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_6(28734, (5272252872485942516L ^ life3_3)));
    if (!((life5_19 >= 0))) { break forward_join_71; }
    if (!((p0 >= (life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_7(7646, (4662560175583385884L ^ life3_3)))))) { break forward_join_60; }
    if (!((p0 > ((life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_8(29089, (6360661651099366761L ^ life3_3))) + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_9(16724, (2377228458946200979L ^ life3_3)))))) { break forward_join_61; }
    }
    return;
    }
    life7_75 = ((moom.ig)(this)).a__B1(((int)(life5_19)));
    ((moom.ig)(this)).a(((moom.B1)(life7_75)), ((int)(p0)), ((int)(p1)));
    break forward_join_236;
    }
    life7_83 = "";
    if (!((p0 >= ((life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_12(14444, (5784917886281415840L ^ life3_3))) - __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_13(19686, (282794310968543279L ^ life3_3)))))) { break forward_join_102; }
    if (!((p0 <= (life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_14(9067, (1519412474010363821L ^ life3_3)))))) { break forward_join_102; }
    life7_114 = ((moom.ig)(this)).a__sourceReturn_b52d34d971(((int)(0)));
    break forward_join_160;
    }
    if (!((p0 >= ((life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_16(5298, (533435332108472424L ^ life3_3))) - __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_17(13105, (5903208960040892397L ^ life3_3)))))) { break forward_join_131; }
    if (!((p0 <= (life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_18(14345, (5602315241095068866L ^ life3_3)))))) { break forward_join_131; }
    life7_114 = ((moom.ig)(this)).a__sourceReturn_b52d34d971(((int)(1)));
    break forward_join_160;
    }
    if (!((p0 >= ((life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_20(21761, (6231886968997908949L ^ life3_3))) - __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_21(13105, (5903208960040892397L ^ life3_3)))))) { break forward_join_155; }
    if (!((p0 > (life6_36 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_22(21812, (4952704058241552887L ^ life3_3)))))) { break forward_join_156; }
    }
    return;
    }
    life7_114 = ((moom.ig)(this)).a__sourceReturn_b52d34d971(((int)(2)));
    }
    life7_188 = ((java.lang.String)(__sourceIntrinsic_45fde0f4e55e_invokedynamic4222_25(moom.oO.a(((java.lang.String)(life7_114)), ((java.lang.Object[])(new java.lang.Object[0])))))).trim();
    if (!((((java.lang.String)(life7_188)).length() > 0))) { break forward_join_236; }
    life8_199 = (p0 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_28(23522, (4949751863668023099L ^ life3_3)));
    life9_207 = (p1 - __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_29(23522, (4949751863668023099L ^ life3_3)));
    life10_213 = ((net.minecraft.client.gui.FontRenderer)(__sourceExactCall_c7607d6e5cd0b1(((net.minecraft.client.gui.achievement.GuiStats)(this.D))))).a(((java.lang.String)(life7_188)));
    net.minecraft.client.gui.achievement.GuiStats.a(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)((life8_199 - 3))), ((int)((life9_207 - 3))), ((int)(((life8_199 + life10_213) + 3))), ((int)(((life9_207 + __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_34(30740, (4075166380781911259L ^ life3_3))) + 3))), ((int)(__sourceIntrinsic_45fde0f4e55e_invokedynamic4222_35(16850, (2911057842835162377L ^ life3_3)))), ((int)(__sourceIntrinsic_45fde0f4e55e_invokedynamic4222_36(16850, (2911057842835162377L ^ life3_3)))));
    ((net.minecraft.client.gui.FontRenderer)(__sourceExactCall_8c5379b6c4058b(((net.minecraft.client.gui.achievement.GuiStats)(this.D))))).a(((java.lang.String)(life7_188)), ((float)(((float) life8_199))), ((float)(((float) life9_207))), ((int)(-1)));
    }
    return;
}


protected void c(int p0) {
if ((p0 != this.B)) {
        this.B = ((int)(p0));
        this.C = ((int)(-1));
    } else {
        if ((this.C == -1)) {
        this.C = ((int)(1));
    } else {
        this.B = ((int)(-1));
        this.C = ((int)(0));
    }
    }
    ((java.util.List)(this.z)).sort(((java.util.Comparator)(this.A)));
    return;
}


protected void a(moom.BY p0, int p1, int p2, boolean p3) {
long life5_3;
    java.lang.String life7_13;
    java.lang.String life7_48;
    life5_3 = (moom.ig.F ^ 106755094179552L);
    if ((p0 != null)) {
        life7_13 = ((moom.BY)(p0)).a(((int)(((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(this.D)).C)).a(((moom.BY)(p0))))));
        net.minecraft.client.gui.achievement.GuiStats spill4220_0 = this.D;
        net.minecraft.client.gui.FontRenderer spill4220_1 = __sourceExactCall_174ab810a8d53a(((net.minecraft.client.gui.achievement.GuiStats)(this.D)));
        java.lang.String spill4220_2 = life7_13;
        int spill4220_3 = (p1 - ((net.minecraft.client.gui.FontRenderer)(__sourceExactCall_af056d06970148(((net.minecraft.client.gui.achievement.GuiStats)(this.D))))).a(((java.lang.String)(life7_13))));
        int spill4220_4 = (p2 + 5);
        ((net.minecraft.client.gui.achievement.GuiStats)(spill4220_0)).b(((net.minecraft.client.gui.FontRenderer)(spill4220_1)), ((java.lang.String)(spill4220_2)), ((int)(spill4220_3)), ((int)(spill4220_4)), ((int)((p3 ? __sourceIntrinsic_63c19ec62da8_invokedynamic4220_11(5691, (2121277747897199590L ^ life5_3)) : __sourceIntrinsic_63c19ec62da8_invokedynamic4220_12(1592, (1044499015390231497L ^ life5_3))))));
    } else {
        life7_48 = "-";
        net.minecraft.client.gui.achievement.GuiStats spill4220_5 = this.D;
        net.minecraft.client.gui.FontRenderer spill4220_6 = __sourceExactCall_bef9dea9fbe952(((net.minecraft.client.gui.achievement.GuiStats)(this.D)));
        java.lang.String spill4220_7 = life7_48;
        int spill4220_8 = (p1 - ((net.minecraft.client.gui.FontRenderer)(__sourceExactCall_bc7fa88c099a33(((net.minecraft.client.gui.achievement.GuiStats)(this.D))))).a(((java.lang.String)(life7_48))));
        int spill4220_9 = (p2 + 5);
        ((net.minecraft.client.gui.achievement.GuiStats)(spill4220_5)).b(((net.minecraft.client.gui.FontRenderer)(spill4220_6)), ((java.lang.String)(spill4220_7)), ((int)(spill4220_8)), ((int)(spill4220_9)), ((int)((p3 ? __sourceIntrinsic_63c19ec62da8_invokedynamic4220_20(15053, (9077105511737444150L ^ life5_3)) : __sourceIntrinsic_63c19ec62da8_invokedynamic4220_21(21416, (8839356647709912666L ^ life5_3))))));
    }
    return;
}


protected void a(moom.B1 p0, int p1, int p2) {
long life4_3;
    net.minecraft.item.Item life6_8;
    net.minecraft.item.ItemStack life7_13;
    java.lang.String life8_16;
    java.lang.String life9_24;
    int life10_35;
    int life11_43;
    int life12_49;
    life4_3 = (moom.ig.F ^ 37413959498531L);
    if ((p0 != null)) {
        life6_8 = ((moom.B1)(p0)).a__sourceReturn_e516839077();
        life7_13 = new net.minecraft.item.ItemStack(life6_8);
        life8_16 = ((net.minecraft.item.ItemStack)(life7_13)).a__String();
        life9_24 = ((java.lang.String)(__sourceIntrinsic_492ff9f03964_invokedynamic6648_5(moom.oO.a(((java.lang.String)(__sourceIntrinsic_492ff9f03964_invokedynamic6648_3(life8_16))), ((java.lang.Object[])(new java.lang.Object[0])))))).trim();
        if ((((java.lang.String)(life9_24)).length() > 0)) {
        life10_35 = (p1 + __sourceIntrinsic_492ff9f03964_invokedynamic6648_8(16712, (1638043045347305833L ^ life4_3)));
        life11_43 = (p2 - __sourceIntrinsic_492ff9f03964_invokedynamic6648_9(23522, (4949757739627819995L ^ life4_3)));
        life12_49 = ((net.minecraft.client.gui.FontRenderer)(__sourceExactCall_43d24c8504546a(((net.minecraft.client.gui.achievement.GuiStats)(this.D))))).a(((java.lang.String)(life9_24)));
        net.minecraft.client.gui.achievement.GuiStats.b(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)((life10_35 - 3))), ((int)((life11_43 - 3))), ((int)(((life10_35 + life12_49) + 3))), ((int)(((life11_43 + __sourceIntrinsic_492ff9f03964_invokedynamic6648_14(879, (1588439849515248458L ^ life4_3))) + 3))), ((int)(__sourceIntrinsic_492ff9f03964_invokedynamic6648_15(665, (6675724070875163310L ^ life4_3)))), ((int)(__sourceIntrinsic_492ff9f03964_invokedynamic6648_16(16850, (2911076638241139177L ^ life4_3)))));
        ((net.minecraft.client.gui.FontRenderer)(__sourceExactCall_e3ea8b264f0b15(((net.minecraft.client.gui.achievement.GuiStats)(this.D))))).a(((java.lang.String)(life9_24)), ((float)(((float) life10_35))), ((float)(((float) life11_43))), ((int)(-1)));
    }
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_bf32a0d0e79a82(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8050_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ig"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31085;
      if (M[var3] == null) {
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
         long var5 = L[var3];
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
         Object[] var9 = (Object[])N.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               N.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ig", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         M[var3] = var15;
      }

      return M[var3];
}


protected void a(int p0, int p1, net.minecraft.client.renderer.Tessellator p2) {
long life4_3;
    int life6_180;
    int life7_186;
    life4_3 = (moom.ig.F ^ 133320546404689L);
    if ((!org.lwjgl.input.Mouse.isButtonDown(((int)(0))))) {
        this.y = ((int)(-1));
    }
    if ((this.y == 0)) {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_5(9067, (1519487369976281407L ^ life4_3))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_6(13105, (5903143153030687103L ^ life4_3))))), ((int)((p1 + 1))), ((int)(0)), ((int)(0)));
    } else {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_9(9067, (1519487369976281407L ^ life4_3))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_10(13105, (5903143153030687103L ^ life4_3))))), ((int)((p1 + 1))), ((int)(0)), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic3638_11(13105, (5903143153030687103L ^ life4_3)))));
    }
    if ((this.y == 1)) {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_15(14345, (5602240620811117136L ^ life4_3))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_16(13105, (5903143153030687103L ^ life4_3))))), ((int)((p1 + 1))), ((int)(0)), ((int)(0)));
    } else {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_19(14345, (5602240620811117136L ^ life4_3))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_20(13105, (5903143153030687103L ^ life4_3))))), ((int)((p1 + 1))), ((int)(0)), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic3638_21(13105, (5903143153030687103L ^ life4_3)))));
    }
    if ((this.y == 2)) {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_25(21812, (4952778953418870629L ^ life4_3))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_26(13105, (5903143153030687103L ^ life4_3))))), ((int)((p1 + 1))), ((int)(0)), ((int)(0)));
    } else {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_29(21812, (4952778953418870629L ^ life4_3))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_30(13105, (5903143153030687103L ^ life4_3))))), ((int)((p1 + 1))), ((int)(0)), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic3638_31(13105, (5903143153030687103L ^ life4_3)))));
    }
    if ((this.B != -1)) {
        life6_180 = __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_34(4542, (5187332587986275308L ^ life4_3));
        life7_186 = __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_35(13105, (5903143153030687103L ^ life4_3));
        if ((this.B == 1)) {
        life6_180 = __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_37(11124, (9078764727443747128L ^ life4_3));
    } else {
        if ((this.B == 2)) {
        life6_180 = __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_39(12642, (6299724412328373007L ^ life4_3));
    }
    }
        if ((this.C == 1)) {
        life7_186 = __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_41(28456, (7615945917133206900L ^ life4_3));
    }
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.D)), ((int)((p0 + life6_180))), ((int)((p1 + 1))), ((int)(life7_186)), ((int)(0)));
    }
    return;
}


protected void a__Void() {
__sourceExactCall_f8dc4a76681f74(((net.minecraft.client.gui.achievement.GuiStats)(this.D)));
    return;
}


protected boolean a__Boolean(int p0) {
return ((0) != 0);
}


protected void a(int p0, boolean p1, int p2, int p3) {
return;
}


protected abstract java.lang.String a__sourceReturn_b52d34d971(int p0);

protected final moom.B1 a__B1(int p0) {
return ((moom.B1)(((java.util.List)(this.z)).get(((int)(p0)))));
}


protected final int a() {
return ((java.util.List)(this.z)).size();
}


protected void a__Void(int p0, int p1) {
long life3_3;
    forward_join_81: {
    forward_join_64: {
    forward_join_43: {
    forward_join_25: {
    life3_3 = (moom.ig.F ^ 122496498042445L);
    this.y = ((int)(-1));
    if (!((p0 >= __sourceIntrinsic_02b72693edd3_invokedynamic4221_2(19298, (4686584493346512417L ^ life3_3))))) { break forward_join_25; }
    if (!((p0 < __sourceIntrinsic_02b72693edd3_invokedynamic4221_3(9067, (1519502665085564451L ^ life3_3))))) { break forward_join_25; }
    this.y = ((int)(0));
    break forward_join_64;
    }
    if (!((p0 >= __sourceIntrinsic_02b72693edd3_invokedynamic4221_5(15955, (7587950033016466190L ^ life3_3))))) { break forward_join_43; }
    if (!((p0 < __sourceIntrinsic_02b72693edd3_invokedynamic4221_6(14345, (5602264632505544012L ^ life3_3))))) { break forward_join_43; }
    this.y = ((int)(1));
    break forward_join_64;
    }
    if (!((p0 >= __sourceIntrinsic_02b72693edd3_invokedynamic4221_8(3186, (4982505977285646648L ^ life3_3))))) { break forward_join_64; }
    if (!((p0 < __sourceIntrinsic_02b72693edd3_invokedynamic4221_9(21812, (4952789840499294329L ^ life3_3))))) { break forward_join_64; }
    this.y = ((int)(__sourceIntrinsic_02b72693edd3_invokedynamic4221_10(27859, (4472187883337546112L ^ life3_3))));
    }
    if (!((this.y >= 0))) { break forward_join_81; }
    ((moom.ig)(this)).c(((int)(this.y)));
    ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.a)).a__f1())).a(((net.minecraft.client.audio.ISound)(moom.fY.a(((moom.DD)(new moom.DD("gui.button.press"))), ((float)(0x1.0p0f))))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a326d4268805fcc_originalDynamicSite2440_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic3638_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8050_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_492ff9f03964_invokedynamic6648_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_492ff9f03964_invokedynamic6648_5(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_492ff9f03964_invokedynamic6648_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_492ff9f03964_invokedynamic6648_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_492ff9f03964_invokedynamic6648_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_492ff9f03964_invokedynamic6648_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_492ff9f03964_invokedynamic6648_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63c19ec62da8_invokedynamic4220_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63c19ec62da8_invokedynamic4220_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63c19ec62da8_invokedynamic4220_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63c19ec62da8_invokedynamic4220_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4221_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4221_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4221_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4221_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4221_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4221_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4221_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_25(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic4222_36(int a0, long a1) throws E;

private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_8c5379b6c4058b(net.minecraft.client.gui.achievement.GuiStats p0);
private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_174ab810a8d53a(net.minecraft.client.gui.achievement.GuiStats p0);
private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_af056d06970148(net.minecraft.client.gui.achievement.GuiStats p0);
private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_bef9dea9fbe952(net.minecraft.client.gui.achievement.GuiStats p0);
private static native int __sourceExactCall_bf32a0d0e79a82(int p0, long p1);

private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_c7607d6e5cd0b1(net.minecraft.client.gui.achievement.GuiStats p0);
private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_bc7fa88c099a33(net.minecraft.client.gui.achievement.GuiStats p0);
private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_43d24c8504546a(net.minecraft.client.gui.achievement.GuiStats p0);
private static native net.minecraft.client.gui.FontRenderer __sourceExactCall_e3ea8b264f0b15(net.minecraft.client.gui.achievement.GuiStats p0);
private static native void __sourceExactCall_6bfe5e6b27f3ff(net.minecraft.client.gui.achievement.GuiStats p0, int p1, int p2, int p3, int p4);
private static native void __sourceExactCall_f8dc4a76681f74(net.minecraft.client.gui.achievement.GuiStats p0);
}
