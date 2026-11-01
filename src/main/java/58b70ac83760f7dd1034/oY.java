package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class oY implements moom.hO {

private static final moom.DD a;

private static final net.minecraft.util.IChatComponent b;

private static final net.minecraft.util.IChatComponent c;

private static final net.minecraft.util.IChatComponent d;

protected final net.minecraft.client.Minecraft e;

protected final net.minecraft.client.gui.GuiScreenResourcePacks f;

private static final long j;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public oY(net.minecraft.client.gui.GuiScreenResourcePacks p0) {
super();
    this.f = p0;
    this.e = net.minecraft.client.Minecraft.a__fM();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(8874073139881913460L)), ((long)(4033898007561033536L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175747858711386L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.oY.j ^ 27145711598742L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1441_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1441_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1441_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1441_14 = new byte[8];
    (__sourceSpill1441_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1441_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1441_16 = __sourceSpill1441_14;
    ((javax.crypto.Cipher)(__sourceSpill1441_11)).init(((int)(__sourceSpill1441_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1441_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1441_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ãº ºªÖü!x(H\021ÀÏ\020n²Ê?1\004¡«\025#û\017¿\\c\033gGQ¦$Oxé¹¥*R¶\b\bXÆ\020\024;ä¶\032¹JZIòGêkµAÍ,r·_á¾NåGÖA\007"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1441_25 = local6_life21;
        int __sourceSpill1441_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1441_25)).substring(((int)(__sourceSpill1441_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1441_30 = local8_life19;
        int __sourceSpill1441_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1441_33 = new byte[8];
        (__sourceSpill1441_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1441_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1441_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1441_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1441_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1441_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1441_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1441_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1441_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1441_34)).doFinal(((byte[])(__sourceSpill1441_33)));
        (__sourceSpill1441_30)[__sourceSpill1441_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "fc¸õ\033\023zà <É\035\021õL"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1441_38 = local6_life21;
        int __sourceSpill1441_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1441_38)).substring(((int)(__sourceSpill1441_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1441_43 = local8_life19;
        int __sourceSpill1441_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1441_46 = new byte[8];
        (__sourceSpill1441_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1441_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1441_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1441_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1441_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1441_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1441_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1441_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1441_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1441_47)).doFinal(((byte[])(__sourceSpill1441_46)));
        (__sourceSpill1441_43)[__sourceSpill1441_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[13]));
    a = ((moom.DD)(new moom.DD("textures/gui/resource_packs.png")));
    b = ((net.minecraft.util.IChatComponent)(new moom.CN("resourcePack.incompatible", new java.lang.Object[0])));
    c = ((net.minecraft.util.IChatComponent)(new moom.CN("resourcePack.incompatible.old", new java.lang.Object[0])));
    d = ((net.minecraft.util.IChatComponent)(new moom.CN("resourcePack.incompatible.new", new java.lang.Object[0])));
}


protected boolean b__Boolean() {
int forwardValue3814_14_0;
    int forwardValue3814_16_0;
    boolean spill3814_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.oY.j ^ 13194754828248L);
    life3_5 = moom.oO.b();
    spill3814_0 = ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a__Boolean(((moom.oY)(this)));
    if (!((life3_5 != null))) {
        forwardValue3814_14_0 = ((spill3814_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill3814_0))) {
        break forward_join_15;
    }
    forwardValue3814_14_0 = 1;
    }
    forwardValue3814_16_0 = forwardValue3814_14_0;
    break forward_join_16;
    }
    forwardValue3814_16_0 = 0;
    }
    return ((forwardValue3814_16_0) != 0);
}


protected abstract java.lang.String b();

protected boolean e() {
int forwardValue3816_20_0;
    int forwardValue3816_34_0;
    int forwardValue3816_38_0;
    int forwardValue3816_40_0;
    java.lang.String[] spill3816_0;
    int spill3816_1;
    long life1_3;
    java.util.List life4_9;
    int life5_13;
    java.lang.String[] life3_14;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_34: {
    forward_join_20: {
    life1_3 = (moom.oY.j ^ 73662915050396L);
    spill3816_0 = moom.oO.b();
    life4_9 = ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a(((moom.oY)(this)));
    life5_13 = ((java.util.List)(life4_9)).indexOf(((java.lang.Object)(this)));
    life3_14 = spill3816_0;
    spill3816_1 = life5_13;
    if (!((life3_14 != null))) {
        forwardValue3816_20_0 = spill3816_1;
        break forward_join_20;
    }
    if (!((spill3816_1 >= 0))) {
        break forward_join_39;
    }
    forwardValue3816_20_0 = life5_13;
    }
    if (!((life3_14 != null))) {
        forwardValue3816_34_0 = forwardValue3816_20_0;
        break forward_join_34;
    }
    if (!((forwardValue3816_20_0 < (((java.util.List)(life4_9)).size() - 1)))) {
        break forward_join_39;
    }
    forwardValue3816_34_0 = ((((moom.oY)(((moom.oY)(((java.util.List)(life4_9)).get(((int)((life5_13 + 1)))))))).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_14 != null))) {
        forwardValue3816_38_0 = forwardValue3816_34_0;
        break forward_join_38;
    }
    if (!((forwardValue3816_34_0 != 0))) {
        break forward_join_39;
    }
    forwardValue3816_38_0 = 1;
    }
    forwardValue3816_40_0 = forwardValue3816_38_0;
    break forward_join_40;
    }
    forwardValue3816_40_0 = 0;
    }
    return ((forwardValue3816_40_0) != 0);
}


protected boolean c() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a__Boolean(((moom.oY)(this))))) != 0);
}


protected boolean d() {
int forwardValue3815_26_0;
    int forwardValue3815_30_0;
    int forwardValue3815_32_0;
    java.lang.String[] spill3815_0;
    int spill3815_1;
    long life1_3;
    java.util.List life4_9;
    java.lang.String[] life3_10;
    int life5_14;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    life1_3 = (moom.oY.j ^ 48018693781382L);
    spill3815_0 = moom.oO.b();
    life4_9 = ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a(((moom.oY)(this)));
    life3_10 = spill3815_0;
    life5_14 = ((java.util.List)(life4_9)).indexOf(((java.lang.Object)(this)));
    spill3815_1 = life5_14;
    if (!((life3_10 != null))) {
        forwardValue3815_26_0 = spill3815_1;
        break forward_join_26;
    }
    if (!((spill3815_1 > 0))) {
        break forward_join_31;
    }
    forwardValue3815_26_0 = ((((moom.oY)(((moom.oY)(((java.util.List)(life4_9)).get(((int)((life5_14 - 1)))))))).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forwardValue3815_30_0 = forwardValue3815_26_0;
        break forward_join_30;
    }
    if (!((forwardValue3815_26_0 != 0))) {
        break forward_join_31;
    }
    forwardValue3815_30_0 = 1;
    }
    forwardValue3815_32_0 = forwardValue3815_30_0;
    break forward_join_32;
    }
    forwardValue3815_32_0 = 0;
    }
    return ((forwardValue3815_32_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
int lexicalValue1258_54_0;
    int lexicalValue1258_54_1;
    int lexicalValue1258_88_0;
    int lexicalValue1258_151_0;
    int lexicalValue1258_151_1;
    int lexicalValue1258_160_0;
    int lexicalValue1258_193_0;
    int lexicalValue1258_193_1;
    int lexicalValue1258_212_0;
    int lexicalValue1258_245_0;
    int lexicalValue1258_245_1;
    int lexicalValue1258_262_0;
    int lexicalValue1258_313_0;
    int lexicalValue1258_313_1;
    int lexicalValue1258_330_0;
    int lexicalValue1258_381_0;
    int lexicalValue1258_381_1;
    int lexicalValue1258_401_0;
    int lexicalValue1258_403_0;
    int lexicalValue1258_453_0;
    int lexicalValue1258_515_0;
    java.lang.String[] spill1258_0;
    int spill1258_1;
    int spill1258_2;
    boolean spill1258_3;
    boolean spill1258_4;
    int spill1258_5;
    int spill1258_6;
    int spill1258_7;
    int spill1258_8;
    int spill1258_9;
    int spill1258_10;
    int spill1258_11;
    int spill1258_12;
    int spill1258_13;
    int spill1258_14;
    int spill1258_15;
    int spill1258_16;
    int spill1258_17;
    int spill1258_18;
    int spill1258_19;
    int spill1258_20;
    int spill1258_21;
    int spill1258_22;
    int spill1258_23;
    int spill1258_24;
    long life9_3;
    int life12_7;
    java.lang.String[] life11_8;
    java.lang.String life13_77;
    java.lang.String life14_80;
    int life15_147;
    int life16_151;
    int life15_518;
    java.util.List life16_584;
    int life17_586;
    lexical_join_519: {
    lexical_join_453: {
    lexical_join_429: {
    lexical_join_403: {
    lexical_join_401: {
    lexical_join_396: {
    lexical_join_381: {
    lexical_join_379: {
    lexical_join_330: {
    lexical_join_328: {
    lexical_join_313: {
    lexical_join_311: {
    lexical_join_262: {
    lexical_join_260: {
    lexical_join_245: {
    lexical_join_243: {
    lexical_join_212: {
    lexical_join_210: {
    lexical_join_193: {
    lexical_join_191: {
    lexical_join_160: {
    lexical_join_158: {
    lexical_join_151: {
    lexical_join_147: {
    lexical_join_88: {
    lexical_join_86: {
    lexical_join_54: {
    lexical_join_45: {
    life9_3 = (moom.oY.j ^ 113847357943074L);
    spill1258_0 = moom.oO.b();
    life12_7 = this.a();
    life11_8 = spill1258_0;
    spill1258_1 = life12_7;
    spill1258_2 = 1;
    if (!((life11_8 != null))) {
        lexicalValue1258_54_0 = spill1258_1;
        lexicalValue1258_54_1 = spill1258_2;
        break lexical_join_54;
    }
    if (!((spill1258_1 != spill1258_2))) {
        break lexical_join_45;
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    __sourceExactCall_59ecc0fbc4abfb(((int)((p1 - 1))), ((int)((p2 - 1))), ((int)(((p1 + p3) - __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_4(6485, (3970152294032066925L ^ life9_3))))), ((int)(((p2 + p4) + 1))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_5(11359, (8547817505777810534L ^ life9_3)))));
    }
    ((moom.oY)(this)).a__Void();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    lexicalValue1258_54_0 = p1;
    lexicalValue1258_54_1 = p2;
    }
    net.minecraft.client.gui.Gui.a(((int)(lexicalValue1258_54_0)), ((int)(lexicalValue1258_54_1)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_9(3528, (1548743356041059827L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_10(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p5f)), ((float)(0x1.0p5f)));
    life13_77 = this.b();
    life14_80 = ((moom.oY)(this)).a__String();
    spill1258_3 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.e)).W)).M;
    if (!((life11_8 != null))) {
        lexicalValue1258_88_0 = ((spill1258_3) ? 1 : 0);
        break lexical_join_88;
    }
    if (!((!spill1258_3))) {
        break lexical_join_86;
    }
    spill1258_4 = p7;
    if (!((life11_8 != null))) {
        lexicalValue1258_401_0 = ((spill1258_4) ? 1 : 0);
        break lexical_join_401;
    }
    if (!(spill1258_4)) {
        break lexical_join_396;
    }
    }
    lexicalValue1258_88_0 = ((((moom.oY)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life11_8 != null))) {
        lexicalValue1258_401_0 = lexicalValue1258_88_0;
        break lexical_join_401;
    }
    if (!((lexicalValue1258_88_0 != 0))) {
        break lexical_join_396;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.e)).a__ok())).a__Void(((moom.DD)(moom.oY.a)));
    __sourceExactCall_59ecc0fbc4abfb(((int)(p1)), ((int)(p2)), ((int)((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_25(23530, (7614034823204506583L ^ life9_3))))), ((int)((p2 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_26(23530, (7614034823204506583L ^ life9_3))))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_27(19506, (6296914368281025550L ^ life9_3)))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    life15_147 = (p5 - p1);
    life16_151 = (p6 - p2);
    spill1258_5 = life12_7;
    spill1258_6 = 1;
    if (!((life11_8 != null))) {
        lexicalValue1258_151_0 = spill1258_5;
        lexicalValue1258_151_1 = spill1258_6;
        break lexical_join_151;
    }
    if (!((spill1258_5 < spill1258_6))) {
        break lexical_join_147;
    }
    life13_77 = ((net.minecraft.util.IChatComponent)(moom.oY.b)).c();
    life14_80 = ((net.minecraft.util.IChatComponent)(moom.oY.c)).c();
    if (!((life11_8 == null))) {
        break lexical_join_158;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[5])));
    }
    spill1258_7 = life12_7;
    if (!((life11_8 != null))) {
        lexicalValue1258_160_0 = spill1258_7;
        break lexical_join_160;
    }
    lexicalValue1258_151_0 = spill1258_7;
    lexicalValue1258_151_1 = 1;
    }
    if (!((lexicalValue1258_151_0 > lexicalValue1258_151_1))) {
        break lexical_join_158;
    }
    life13_77 = ((net.minecraft.util.IChatComponent)(moom.oY.b)).c();
    life14_80 = ((net.minecraft.util.IChatComponent)(moom.oY.d)).c();
    }
    lexicalValue1258_160_0 = ((((moom.oY)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life11_8 != null))) {
        lexicalValue1258_212_0 = lexicalValue1258_160_0;
        break lexical_join_212;
    }
    if (!((lexicalValue1258_160_0 != 0))) {
        break lexical_join_210;
    }
    spill1258_8 = life15_147;
    spill1258_9 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_41(23530, (7614034823204506583L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_193_0 = spill1258_8;
        lexicalValue1258_193_1 = spill1258_9;
        break lexical_join_193;
    }
    if (!((spill1258_8 < spill1258_9))) {
        break lexical_join_191;
    }
    net.minecraft.client.gui.Gui.a(((int)(p1)), ((int)(p2)), ((float)(0x0.0p0f)), ((float)(0x1.0p5f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_42(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_43(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    if (!((life11_8 == null))) {
        break lexical_join_396;
    }
    }
    lexicalValue1258_193_0 = p1;
    lexicalValue1258_193_1 = p2;
    }
    net.minecraft.client.gui.Gui.a(((int)(lexicalValue1258_193_0)), ((int)(lexicalValue1258_193_1)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_45(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_46(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    if (!((life11_8 == null))) {
        break lexical_join_396;
    }
    }
    lexicalValue1258_212_0 = ((this.c()) ? 1 : 0);
    }
    if (!((life11_8 != null))) {
        lexicalValue1258_262_0 = lexicalValue1258_212_0;
        break lexical_join_262;
    }
    if (!((lexicalValue1258_212_0 != 0))) {
        break lexical_join_260;
    }
    spill1258_10 = life15_147;
    spill1258_11 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_50(25768, (6228489820393125021L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_245_0 = spill1258_10;
        lexicalValue1258_245_1 = spill1258_11;
        break lexical_join_245;
    }
    if (!((spill1258_10 < spill1258_11))) {
        break lexical_join_243;
    }
    net.minecraft.client.gui.Gui.a(((int)(p1)), ((int)(p2)), ((float)(0x1.0p5f)), ((float)(0x1.0p5f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_51(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_52(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    if (!((life11_8 == null))) {
        break lexical_join_260;
    }
    }
    lexicalValue1258_245_0 = p1;
    lexicalValue1258_245_1 = p2;
    }
    net.minecraft.client.gui.Gui.a(((int)(lexicalValue1258_245_0)), ((int)(lexicalValue1258_245_1)), ((float)(0x1.0p5f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_54(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_55(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    }
    lexicalValue1258_262_0 = ((this.d()) ? 1 : 0);
    }
    if (!((life11_8 != null))) {
        lexicalValue1258_330_0 = lexicalValue1258_262_0;
        break lexical_join_330;
    }
    if (!((lexicalValue1258_262_0 != 0))) {
        break lexical_join_328;
    }
    spill1258_12 = life15_147;
    spill1258_13 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_59(23530, (7614034823204506583L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_313_0 = spill1258_12;
        lexicalValue1258_313_1 = spill1258_13;
        break lexical_join_313;
    }
    if (!((spill1258_12 < spill1258_13))) {
        break lexical_join_311;
    }
    spill1258_14 = life15_147;
    spill1258_15 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_60(7009, (2677737126849268571L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_313_0 = spill1258_14;
        lexicalValue1258_313_1 = spill1258_15;
        break lexical_join_313;
    }
    if (!((spill1258_14 > spill1258_15))) {
        break lexical_join_311;
    }
    spill1258_16 = life16_151;
    spill1258_17 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_61(7009, (2677737126849268571L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_313_0 = spill1258_16;
        lexicalValue1258_313_1 = spill1258_17;
        break lexical_join_313;
    }
    if (!((spill1258_16 < spill1258_17))) {
        break lexical_join_311;
    }
    net.minecraft.client.gui.Gui.a(((int)(p1)), ((int)(p2)), ((float)(0x1.8p6f)), ((float)(0x1.0p5f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_62(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_63(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    if (!((life11_8 == null))) {
        break lexical_join_328;
    }
    }
    lexicalValue1258_313_0 = p1;
    lexicalValue1258_313_1 = p2;
    }
    net.minecraft.client.gui.Gui.a(((int)(lexicalValue1258_313_0)), ((int)(lexicalValue1258_313_1)), ((float)(0x1.8p6f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_65(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_66(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    }
    lexicalValue1258_330_0 = ((this.e()) ? 1 : 0);
    }
    if (!((life11_8 != null))) {
        lexicalValue1258_403_0 = lexicalValue1258_330_0;
        break lexical_join_403;
    }
    if (!((lexicalValue1258_330_0 != 0))) {
        break lexical_join_396;
    }
    spill1258_18 = life15_147;
    spill1258_19 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_70(23530, (7614034823204506583L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_381_0 = spill1258_18;
        lexicalValue1258_381_1 = spill1258_19;
        break lexical_join_381;
    }
    if (!((spill1258_18 < spill1258_19))) {
        break lexical_join_379;
    }
    spill1258_20 = life15_147;
    spill1258_21 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_71(7009, (2677737126849268571L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_381_0 = spill1258_20;
        lexicalValue1258_381_1 = spill1258_21;
        break lexical_join_381;
    }
    if (!((spill1258_20 > spill1258_21))) {
        break lexical_join_379;
    }
    spill1258_22 = life16_151;
    spill1258_23 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_72(7009, (2677737126849268571L ^ life9_3));
    if (!((life11_8 != null))) {
        lexicalValue1258_381_0 = spill1258_22;
        lexicalValue1258_381_1 = spill1258_23;
        break lexical_join_381;
    }
    if (!((spill1258_22 > spill1258_23))) {
        break lexical_join_379;
    }
    net.minecraft.client.gui.Gui.a(((int)(p1)), ((int)(p2)), ((float)(0x1.0p6f)), ((float)(0x1.0p5f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_73(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_74(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    if (!((life11_8 == null))) {
        break lexical_join_396;
    }
    }
    lexicalValue1258_381_0 = p1;
    lexicalValue1258_381_1 = p2;
    }
    net.minecraft.client.gui.Gui.a(((int)(lexicalValue1258_381_0)), ((int)(lexicalValue1258_381_1)), ((float)(0x1.0p6f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_76(23530, (7614034823204506583L ^ life9_3)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_77(23530, (7614034823204506583L ^ life9_3)))), ((float)(0x1.0p8f)), ((float)(0x1.0p8f)));
    }
    lexicalValue1258_401_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.e)).N)).a(((java.lang.String)(life13_77)));
    }
    life15_518 = lexicalValue1258_401_0;
    lexicalValue1258_403_0 = life15_518;
    }
    if (!((life11_8 != null))) {
        lexicalValue1258_453_0 = lexicalValue1258_403_0;
        break lexical_join_453;
    }
    if (!((lexicalValue1258_403_0 > __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_82(7751, (7347791207608634993L ^ life9_3))))) {
        break lexical_join_429;
    }
    life13_77 = __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_90(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.e)).N)).a__String(((java.lang.String)(life13_77)), ((int)((__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_85(9147, (1777792488467100548L ^ life9_3)) - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.e)).N)).a(((java.lang.String)("..."))))))));
    }
    lexicalValue1258_453_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.e)).N)).a(((java.lang.String)(life13_77)), ((float)(((float) ((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_93(23530, (7614034823204506583L ^ life9_3))) + 2)))), ((float)(((float) (p2 + 1)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_94(1812, (6083704637100349223L ^ life9_3)))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1258_453_0);
    life16_584 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.e)).N)).a__List(((java.lang.String)(life14_80)), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_99(9147, (1777792488467100548L ^ life9_3)))));
    life17_586 = 0;
    lexical_cycle_467: while (true) {
    lexical_join_515: {
    if (!((life17_586 < 2))) {
        break lexical_join_519;
    }
    spill1258_24 = life17_586;
    if (!((life11_8 != null))) {
        lexicalValue1258_515_0 = spill1258_24;
        break lexical_join_515;
    }
    if (!((spill1258_24 < ((java.util.List)(life16_584)).size()))) {
        break lexical_join_519;
    }
    lexicalValue1258_515_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.e)).N)).a(((java.lang.String)(((java.lang.String)(((java.util.List)(life16_584)).get(((int)(life17_586))))))), ((float)(((float) ((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_106(23530, (7614034823204506583L ^ life9_3))) + 2)))), ((float)(((float) ((p2 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_107(5832, (4421353602700789500L ^ life9_3))) + (__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_108(23751, (811783346945428720L ^ life9_3)) * life17_586))))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_109(31746, (2326172724158868540L ^ life9_3)))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1258_515_0);
    life17_586 += 1;
    if (!((life11_8 == null))) { continue lexical_cycle_467; }
    break lexical_cycle_467;
    }
    }
    return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8579_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x758B;
        if (m[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = oY.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])oY.n.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    oY.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/oY", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            oY.m[n2] = n4;
        }
        return m[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected abstract int a();

protected abstract java.lang.String a__String();

protected boolean a__Boolean() {
return ((1) != 0);
}


protected abstract void a__Void();

public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) {
java.lang.String forwardValue3813_47_0;
    int forwardValue3813_71_0;
    int forwardValue3813_81_0;
    int forwardValue3813_113_0;
    int forwardValue3813_118_0;
    int forwardValue3813_118_1;
    int forwardValue3813_160_0;
    int forwardValue3813_167_0;
    int forwardValue3813_167_1;
    int forwardValue3813_207_0;
    boolean spill3813_0;
    int spill3813_1;
    boolean spill3813_2;
    int spill3813_3;
    int spill3813_4;
    boolean spill3813_5;
    int spill3813_6;
    int spill3813_7;
    boolean spill3813_8;
    int spill3813_9;
    boolean spill3813_10;
    long life7_3;
    java.lang.String[] life9_5;
    int life10_45;
    java.lang.String life11_58;
    java.lang.String life12_71;
    java.util.List life10_188;
    int life11_192;
    java.util.List life10_250;
    int life11_254;
    forward_join_207: {
    forward_join_206: {
    forward_join_167: {
    forward_join_160: {
    forward_join_159: {
    forward_join_118: {
    forward_join_113: {
    forward_join_112: {
    forward_join_81: {
    forward_join_80: {
    forward_join_78: {
    forward_join_71: {
    forward_join_65: {
    forward_join_47: {
    forward_join_46: {
    life7_3 = (moom.oY.j ^ 96538268540213L);
    life9_5 = moom.oO.b();
    spill3813_0 = ((moom.oY)(this)).a__Boolean();
    if (!((life9_5 != null))) {
        forwardValue3813_207_0 = ((spill3813_0) ? 1 : 0);
        break forward_join_207;
    }
    if (!(spill3813_0)) {
        break forward_join_206;
    }
    spill3813_1 = p4;
    if (!((life9_5 != null))) {
        forwardValue3813_207_0 = spill3813_1;
        break forward_join_207;
    }
    if (!((spill3813_1 <= __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_4(23530, (7613981762480192448L ^ life7_3))))) {
        break forward_join_206;
    }
    spill3813_2 = ((moom.oY)(this)).b__Boolean();
    if (!((life9_5 != null))) {
        forwardValue3813_81_0 = ((spill3813_2) ? 1 : 0);
        break forward_join_81;
    }
    if (!(spill3813_2)) {
        break forward_join_80;
    }
    ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a__Void();
    life10_45 = this.a();
    spill3813_3 = life10_45;
    if (!((life9_5 != null))) {
        forwardValue3813_71_0 = spill3813_3;
        break forward_join_71;
    }
    if (!((spill3813_3 != 1))) {
        break forward_join_65;
    }
    life11_58 = moom.oO.a(((java.lang.String)("resourcePack.incompatible.confirm.title")), ((java.lang.Object[])(new java.lang.Object[0])));
    if (!((life10_45 > 1))) {
        break forward_join_46;
    }
    forwardValue3813_47_0 = "new";
    break forward_join_47;
    }
    forwardValue3813_47_0 = "old";
    }
    life12_71 = moom.oO.a(((java.lang.String)(__sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_11(forwardValue3813_47_0))), ((java.lang.Object[])(new java.lang.Object[0])));
    ((net.minecraft.client.Minecraft)(this.e)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hb(__sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_14(this), life11_58, life12_71, 0))));
    if (!((life9_5 == null))) {
        break forward_join_78;
    }
    }
    forwardValue3813_71_0 = ((((java.util.List)(((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a(((moom.oY)(this))))).remove(((java.lang.Object)(this)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3813_71_0);
    ((java.util.List)(((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).b())).add(((int)(0)), ((java.lang.Object)(this)));
    }
    return ((1) != 0);
    }
    forwardValue3813_81_0 = p4;
    }
    spill3813_4 = __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_25(7009, (2677684634465729356L ^ life7_3));
    if (!((life9_5 != null))) {
        forwardValue3813_118_0 = forwardValue3813_81_0;
        forwardValue3813_118_1 = spill3813_4;
        break forward_join_118;
    }
    if (!((forwardValue3813_81_0 < spill3813_4))) {
        break forward_join_112;
    }
    spill3813_5 = this.c();
    if (!((life9_5 != null))) {
        forwardValue3813_113_0 = ((spill3813_5) ? 1 : 0);
        break forward_join_113;
    }
    if (!(spill3813_5)) {
        break forward_join_112;
    }
    ((java.util.List)(((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a(((moom.oY)(this))))).remove(((java.lang.Object)(this)));
    ((java.util.List)(((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a())).add(((int)(0)), ((java.lang.Object)(this)));
    ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a__Void();
    return ((1) != 0);
    }
    forwardValue3813_113_0 = p4;
    }
    forwardValue3813_118_0 = forwardValue3813_113_0;
    forwardValue3813_118_1 = __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_37(7009, (2677684634465729356L ^ life7_3));
    }
    if (!((life9_5 != null))) {
        forwardValue3813_167_0 = forwardValue3813_118_0;
        forwardValue3813_167_1 = forwardValue3813_118_1;
        break forward_join_167;
    }
    if (!((forwardValue3813_118_0 > forwardValue3813_118_1))) {
        break forward_join_159;
    }
    spill3813_6 = p5;
    spill3813_7 = __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_38(7009, (2677684634465729356L ^ life7_3));
    if (!((life9_5 != null))) {
        forwardValue3813_167_0 = spill3813_6;
        forwardValue3813_167_1 = spill3813_7;
        break forward_join_167;
    }
    if (!((spill3813_6 < spill3813_7))) {
        break forward_join_159;
    }
    spill3813_8 = this.d();
    if (!((life9_5 != null))) {
        forwardValue3813_160_0 = ((spill3813_8) ? 1 : 0);
        break forward_join_160;
    }
    if (!(spill3813_8)) {
        break forward_join_159;
    }
    life10_188 = ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a(((moom.oY)(this)));
    life11_192 = ((java.util.List)(life10_188)).indexOf(((java.lang.Object)(this)));
    ((java.util.List)(life10_188)).remove(((java.lang.Object)(this)));
    ((java.util.List)(life10_188)).add(((int)((life11_192 - 1))), ((java.lang.Object)(this)));
    ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a__Void();
    return ((1) != 0);
    }
    forwardValue3813_160_0 = p4;
    }
    if (!((life9_5 != null))) {
        forwardValue3813_207_0 = forwardValue3813_160_0;
        break forward_join_207;
    }
    forwardValue3813_167_0 = forwardValue3813_160_0;
    forwardValue3813_167_1 = __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_49(7009, (2677684634465729356L ^ life7_3));
    }
    if (!((forwardValue3813_167_0 > forwardValue3813_167_1))) {
        break forward_join_206;
    }
    spill3813_9 = p5;
    if (!((life9_5 != null))) {
        forwardValue3813_207_0 = spill3813_9;
        break forward_join_207;
    }
    if (!((spill3813_9 > __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_50(7009, (2677684634465729356L ^ life7_3))))) {
        break forward_join_206;
    }
    spill3813_10 = this.e();
    if (!((life9_5 != null))) {
        forwardValue3813_207_0 = ((spill3813_10) ? 1 : 0);
        break forward_join_207;
    }
    if (!(spill3813_10)) {
        break forward_join_206;
    }
    life10_250 = ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a(((moom.oY)(this)));
    life11_254 = ((java.util.List)(life10_250)).indexOf(((java.lang.Object)(this)));
    ((java.util.List)(life10_250)).remove(((java.lang.Object)(this)));
    ((java.util.List)(life10_250)).add(((int)((life11_254 + 1))), ((java.lang.Object)(this)));
    ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a__Void();
    return ((1) != 0);
    }
    forwardValue3813_207_0 = 0;
    }
    return ((forwardValue3813_207_0) != 0);
}


public void a(int p0, int p1, int p2) {
return;
}


private void lambda$mousePressed$0(boolean p0, int p1) {
int forwardValue3817_23_0;
    java.lang.String[] spill3817_0;
    boolean spill3817_1;
    long life3_3;
    java.util.List life6_9;
    java.lang.String[] life5_10;
    forward_join_30: {
    forward_join_23: {
    life3_3 = (moom.oY.j ^ 24987787922178L);
    spill3817_0 = moom.oO.b();
    life6_9 = ((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).a(((moom.oY)(this)));
    life5_10 = spill3817_0;
    ((net.minecraft.client.Minecraft)(this.e)).a(((net.minecraft.client.gui.GuiScreen)(this.f)));
    spill3817_1 = p0;
    if (!((life5_10 != null))) {
        forwardValue3817_23_0 = ((spill3817_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3817_1)) {
        break forward_join_30;
    }
    forwardValue3817_23_0 = ((((java.util.List)(life6_9)).remove(((java.lang.Object)(this)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3817_23_0);
    ((java.util.List)(((net.minecraft.client.gui.GuiScreenResourcePacks)(this.f)).b())).add(((int)(0)), ((java.lang.Object)(this)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_90(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic1258_109(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8579_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_11(java.lang.String a0) throws E;

private static native <E extends Throwable> net.minecraft.client.gui.GuiYesNoCallback __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_14(moom.oY a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_77d9fb3e1c9a_invokedynamic3813_50(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_59ecc0fbc4abfb(int p0, int p1, int p2, int p3, int p4);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
