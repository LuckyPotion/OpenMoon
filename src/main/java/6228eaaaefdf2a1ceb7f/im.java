package moom;


public class im {

private static final long a;

private static final long b;

public im() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-2940852715452892787L)), ((long)(289842606099863836L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(87888640538678L)))));
    long local0_life6 = (moom.im.a ^ 85580134562047L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill884_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill884_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill884_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill884_13 = new byte[8];
    (__sourceSpill884_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill884_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation884_15 = __sourceSpill884_13;
    ((javax.crypto.Cipher)(__sourceSpill884_10)).init(((int)(__sourceSpill884_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill884_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation884_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6779066550044556121L;
    byte[] __sourceSpill884_19 = new byte[8];
    (__sourceSpill884_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill884_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill884_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill884_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill884_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill884_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill884_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill884_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill884_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill884_20)).doFinal(((byte[])(__sourceSpill884_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.util.List<net.minecraft.util.IChatComponent> a(net.minecraft.util.IChatComponent p0, int p1, net.minecraft.client.gui.FontRenderer p2, boolean p3, boolean p4, boolean p5, com.moon.jm p6) {
java.lang.String lexicalValue1204_94_0;
    int lexicalValue1204_106_0;
    java.lang.String lexicalValue1204_141_0;
    java.lang.String lexicalValue1204_153_0;
    int lexicalValue1204_182_0;
    int lexicalValue1204_235_0;
    long life7_3;
    int life9_5;
    moom.CM life10_10;
    java.util.ArrayList life11_12;
    java.util.ArrayList life12_15;
    int life13_17;
    net.minecraft.util.IChatComponent life14_26;
    java.lang.String life15_29;
    int life16_31;
    int life17_40;
    java.lang.String life18_46;
    moom.CM life19_58;
    java.lang.String life17_80;
    java.lang.String life18_96;
    int life19_110;
    moom.CM life20_115;
    java.lang.String life21_150;
    java.lang.String life22_164;
    int life23_176;
    moom.CM life24_235;
    lexical_join_280: {
    life7_3 = (moom.im.a ^ 102295234444008L);
    life9_5 = 0;
    life10_10 = new moom.CM("");
    life11_12 = com.google.common.collect.Lists.newArrayList();
    life12_15 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(p0)));
    life13_17 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_278: {
    lexical_join_265: {
    lexical_join_263: {
    lexical_join_249: {
    lexical_join_235: {
    lexical_join_232: {
    lexical_join_223: {
    lexical_join_206: {
    lexical_join_196: {
    lexical_join_191: {
    lexical_join_182: {
    lexical_join_176: {
    lexical_join_153: {
    lexical_join_152: {
    lexical_join_141: {
    lexical_join_134: {
    lexical_join_106: {
    lexical_join_103: {
    lexical_join_94: {
    lexical_join_93: {
    lexical_join_73: {
    if (!((life13_17 < ((java.util.List)(life12_15)).size()))) {
        break lexical_join_280;
    }
    life14_26 = ((net.minecraft.util.IChatComponent)(((java.util.List)(life12_15)).get(((int)(life13_17)))));
    life15_29 = ((net.minecraft.util.IChatComponent)(life14_26)).a();
    life16_31 = 0;
    if (!(((java.lang.String)(life15_29)).contains(((java.lang.CharSequence)("\n"))))) {
        break lexical_join_73;
    }
    life17_40 = ((java.lang.String)(life15_29)).indexOf(((int)(((int) moom.im.b))));
    life18_46 = ((java.lang.String)(life15_29)).substring(((int)((life17_40 + 1))));
    life15_29 = ((java.lang.String)(life15_29)).substring(((int)(0)), ((int)((life17_40 + 1))));
    life19_58 = new moom.CM(life18_46);
    ((moom.CM)(life19_58)).a(((moom.CO)(((moom.CO)(((net.minecraft.util.IChatComponent)(life14_26)).a__CO())).b__CO())));
    ((java.util.List)(life12_15)).add(((int)((life13_17 + 1))), ((java.lang.Object)(life19_58)));
    life16_31 = 1;
    }
    life17_80 = moom.im.a(((java.lang.String)(__sourceIntrinsic_3750b5c14470_invokedynamic1204_18(((moom.CO)(((net.minecraft.util.IChatComponent)(life14_26)).a__CO())).b(), life15_29))), ((boolean)(p4)));
    if (!(((java.lang.String)(life17_80)).endsWith(((java.lang.String)("\n"))))) {
        break lexical_join_93;
    }
    lexicalValue1204_94_0 = ((java.lang.String)(life17_80)).substring(((int)(0)), ((int)((((java.lang.String)(life17_80)).length() - 1))));
    break lexical_join_94;
    }
    lexicalValue1204_94_0 = life17_80;
    }
    life18_96 = lexicalValue1204_94_0;
    if (!(p5)) {
        break lexical_join_103;
    }
    lexicalValue1204_106_0 = ((int) ((com.moon.jm)(p6)).a(((java.lang.String)(life18_96)), ((float)(0x1.2p3f))));
    break lexical_join_106;
    }
    lexicalValue1204_106_0 = ((net.minecraft.client.gui.FontRenderer)(p2)).a(((java.lang.String)(life18_96)));
    }
    life19_110 = lexicalValue1204_106_0;
    life20_115 = new moom.CM(life18_96);
    ((moom.CM)(life20_115)).a(((moom.CO)(((moom.CO)(((net.minecraft.util.IChatComponent)(life14_26)).a__CO())).b__CO())));
    if (!(((life9_5 + life19_110) > p1))) {
        break lexical_join_249;
    }
    if (!(p5)) {
        break lexical_join_134;
    }
    lexicalValue1204_141_0 = ((com.moon.jm)(p6)).a(((java.lang.String)(life17_80)), ((int)((p1 - life9_5))), ((float)(0x1.2p3f)), ((boolean)(false)));
    break lexical_join_141;
    }
    lexicalValue1204_141_0 = ((net.minecraft.client.gui.FontRenderer)(p2)).a(((java.lang.String)(life17_80)), ((int)((p1 - life9_5))), ((boolean)(false)));
    }
    life21_150 = lexicalValue1204_141_0;
    if (!((((java.lang.String)(life21_150)).length() < ((java.lang.String)(life17_80)).length()))) {
        break lexical_join_152;
    }
    lexicalValue1204_153_0 = ((java.lang.String)(life17_80)).substring(((int)(((java.lang.String)(life21_150)).length())));
    break lexical_join_153;
    }
    lexicalValue1204_153_0 = null;
    }
    life22_164 = lexicalValue1204_153_0;
    if (!((life22_164 != null))) {
        break lexical_join_223;
    }
    if (!((((java.lang.String)(life22_164)).length() > 0))) {
        break lexical_join_223;
    }
    life23_176 = ((java.lang.String)(life21_150)).lastIndexOf(((java.lang.String)(" ")));
    if (!((life23_176 >= 0))) {
        break lexical_join_196;
    }
    if (!(p5)) {
        break lexical_join_176;
    }
    lexicalValue1204_182_0 = moom.Dr.b__Int(((float)(((com.moon.jm)(p6)).a(((java.lang.String)(((java.lang.String)(life17_80)).substring(((int)(0)), ((int)(life23_176))))), ((float)(0x1.2p3f))))));
    break lexical_join_182;
    }
    lexicalValue1204_182_0 = ((net.minecraft.client.gui.FontRenderer)(p2)).a(((java.lang.String)(((java.lang.String)(life17_80)).substring(((int)(0)), ((int)(life23_176))))));
    }
    if (!((lexicalValue1204_182_0 > 0))) {
        break lexical_join_196;
    }
    life21_150 = ((java.lang.String)(life17_80)).substring(((int)(0)), ((int)(life23_176)));
    if (!(p3)) {
        break lexical_join_191;
    }
    life23_176 += 1;
    }
    life22_164 = ((java.lang.String)(life17_80)).substring(((int)(life23_176)));
    break lexical_join_206;
    }
    if (!((life9_5 > 0))) {
        break lexical_join_206;
    }
    if (!((!((java.lang.String)(life17_80)).contains(((java.lang.CharSequence)(" ")))))) {
        break lexical_join_206;
    }
    life21_150 = "";
    life22_164 = life17_80;
    }
    life24_235 = new moom.CM(life22_164);
    ((moom.CM)(life24_235)).a(((moom.CO)(((moom.CO)(((net.minecraft.util.IChatComponent)(life14_26)).a__CO())).b__CO())));
    ((java.util.List)(life12_15)).add(((int)((life13_17 + 1))), ((java.lang.Object)(life24_235)));
    }
    if (!(p5)) {
        break lexical_join_232;
    }
    lexicalValue1204_235_0 = moom.Dr.d(((double)(((double) ((com.moon.jm)(p6)).a(((java.lang.String)(life21_150)), ((float)(0x1.2p3f)))))));
    break lexical_join_235;
    }
    lexicalValue1204_235_0 = ((net.minecraft.client.gui.FontRenderer)(p2)).a(((java.lang.String)(life21_150)));
    }
    life19_110 = lexicalValue1204_235_0;
    life20_115 = new moom.CM(life21_150);
    ((moom.CM)(life20_115)).a(((moom.CO)(((moom.CO)(((net.minecraft.util.IChatComponent)(life14_26)).a__CO())).b__CO())));
    life16_31 = 1;
    }
    if (!(((life9_5 + life19_110) <= p1))) {
        break lexical_join_263;
    }
    life9_5 = (life9_5 + life19_110);
    ((net.minecraft.util.IChatComponent)(life10_10)).a(((net.minecraft.util.IChatComponent)(life20_115)));
    break lexical_join_265;
    }
    life16_31 = 1;
    }
    if (!((life16_31 != 0))) {
        break lexical_join_278;
    }
    ((java.util.List)(life11_12)).add(((java.lang.Object)(life10_10)));
    life9_5 = 0;
    life10_10 = new moom.CM("");
    }
    life13_17 += 1;
    continue lexical_cycle_18;
    }
    }
    ((java.util.List)(life11_12)).add(((java.lang.Object)(life10_10)));
    return life11_12;
}


public static java.lang.String a(java.lang.String p0, boolean p1) {
java.lang.String forwardValue3644_10_0;
    forward_join_10: {
    forward_join_9: {
    if (!((!p1))) {
        break forward_join_9;
    }
    if (!((!((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).W)).y))) {
        break forward_join_9;
    }
    forwardValue3644_10_0 = net.minecraft.util.EnumChatFormatting.b(((java.lang.String)(p0)));
    break forward_join_10;
    }
    forwardValue3644_10_0 = p0;
    }
    return forwardValue3644_10_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3750b5c14470_invokedynamic1204_18(java.lang.String a0, java.lang.String a1) throws E;
}
