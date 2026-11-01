package moom;


class j0 implements moom.AM {

private boolean a;

private boolean b;

private long c;

net.minecraft.network.NetworkManager d;

moom.jL e;

moom.jZ f;

private static long g;

j0(moom.jZ p0, net.minecraft.network.NetworkManager p1, moom.jL p2) { super(); }


private static void __sourceConstructorBody_6fd4ef0b62083ef2(moom.j0 receiver, moom.jZ p0, net.minecraft.network.NetworkManager p1, moom.jL p2) throws Throwable {

((moom.j0)(receiver)).f = ((moom.jZ)(p0));

    ((moom.j0)(receiver)).d = ((net.minecraft.network.NetworkManager)(p1));

    ((moom.j0)(receiver)).e = ((moom.jL)(p2));

    moom.j0.__sourceConstructorInit_6fd4ef0b62083ef2_0(((moom.j0)(receiver)));

    ((moom.j0)(receiver)).a = ((boolean)(false));

    ((moom.j0)(receiver)).b = ((boolean)(false));

    ((moom.j0)(receiver)).c = ((long)(0L));

    return;

}



static {
moom.j0.g = (moom._c.a(-5312728187548503926L, 4616262790119785392L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(116385659906861L);
}

private static native <E extends Throwable> void __sourceConstructorInit_6fd4ef0b62083ef2_0(moom.j0 a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.util.IChatComponent p0) {
moom.j0 forwardValue3648_29_0;
    moom.j0 spill3648_0;
    long life2_3;
    int life4_5;
    forward_join_33: {
    forward_join_29: {
    life2_3 = (moom.j0.g ^ 68725599409913L);
    life4_5 = ((net.minecraft.client.network.NetHandlerPlayClient.c()) ? 1 : 0);
    spill3648_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue3648_29_0 = spill3648_0;
        break forward_join_29;
    }
    if (!((!((moom.j0)(spill3648_0)).a))) {
        break forward_join_33;
    }
    ((org.apache.logging.log4j.Logger)(moom.jZ.b)).error(((java.lang.String)(__sourceIntrinsic_2586c2e710d8_invokedynamic3648_8(((moom.jL)(this.e)).b, __sourceExactCall_ecc91eedf396a9(((net.minecraft.util.IChatComponent)(p0)))))));
    ((moom.jL)(this.e)).d = ((java.lang.String)(__sourceIntrinsic_2586c2e710d8_invokedynamic3648_12(net.minecraft.util.EnumChatFormatting.DARK_RED)));
    ((moom.jL)(this.e)).c = ((java.lang.String)(""));
    forwardValue3648_29_0 = this;
    }
    __sourceExactCall_c84eaeabefe110(((moom.jZ)(((moom.j0)(forwardValue3648_29_0)).f)), ((moom.jL)(this.e)));
    }
    return;
}


public void a(moom.AR p0) {
long local2 = this.c;
    long local4 = net.minecraft.client.Minecraft.a__Long();
    ((moom.jL)(this.e)).e = ((long)((local4 - local2)));
    ((net.minecraft.network.NetworkManager)(this.d)).a(((net.minecraft.util.IChatComponent)(new moom.CM("Finished"))));
    return;
}


public void a(moom.AQ p0) {
moom.j0 lexicalValue1206_21_0;
    net.minecraft.network.ServerStatusResponse$PlayerCountData lexicalValue1206_90_0;
    java.lang.StringBuilder lexicalValue1206_128_0;
    int lexicalValue1206_136_0;
    int lexicalValue1206_146_0;
    java.lang.StringBuilder lexicalValue1206_165_0;
    net.minecraft.network.ServerStatusResponse lexicalValue1206_179_0;
    java.lang.String lexicalValue1206_185_0;
    moom.j0 spill1206_0;
    net.minecraft.network.ServerStatusResponse$PlayerCountData spill1206_1;
    net.minecraft.network.ServerStatusResponse spill1206_2;
    java.lang.StringBuilder spill1206_3;
    int spill1206_4;
    java.lang.StringBuilder spill1206_5;
    java.lang.String spill1206_6;
    long life2_3;
    int life4_5;
    net.minecraft.network.ServerStatusResponse life5_34;
    java.lang.StringBuilder life6_129;
    com.mojang.authlib.GameProfile[] life7_133;
    int life8_136;
    int life9_138;
    com.mojang.authlib.GameProfile life10_145;
    java.lang.String life6_248;
    lexical_join_224: {
    lexical_join_210: {
    lexical_join_206: {
    lexical_join_204: {
    lexical_join_201: {
    lexical_join_199: {
    lexical_join_185: {
    lexical_join_179: {
    lexical_join_178: {
    lexical_join_173: {
    lexical_join_166: {
    lexical_join_165: {
    lexical_join_151: {
    lexical_join_146: {
    lexical_join_136: {
    lexical_join_132: {
    lexical_join_90: {
    lexical_join_68: {
    lexical_join_60: {
    lexical_join_43: {
    lexical_join_39: {
    lexical_join_37: {
    lexical_join_21: {
    lexical_join_20: {
    life2_3 = (moom.j0.g ^ 8343465233558L);
    life4_5 = ((net.minecraft.client.network.NetHandlerPlayClient.b()) ? 1 : 0);
    spill1206_0 = this;
    if (!((life4_5 == 0))) {
        lexicalValue1206_21_0 = spill1206_0;
        break lexical_join_21;
    }
    if (!(((moom.j0)(spill1206_0)).b)) {
        break lexical_join_20;
    }
    ((net.minecraft.network.NetworkManager)(this.d)).a(((net.minecraft.util.IChatComponent)(new moom.CM("Received unrequested status"))));
    if (!((life4_5 != 0))) {
        break lexical_join_224;
    }
    }
    lexicalValue1206_21_0 = this;
    }
    ((moom.j0)(lexicalValue1206_21_0)).b = ((boolean)(true));
    life5_34 = ((moom.AQ)(p0)).a();
    if (!((life4_5 == 0))) {
        break lexical_join_37;
    }
    if (!((((net.minecraft.network.ServerStatusResponse)(life5_34)).a__C5() != null))) {
        break lexical_join_39;
    }
    ((moom.jL)(this.e)).d = ((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__C5())).c()));
    }
    if (!((life4_5 != 0))) {
        break lexical_join_43;
    }
    }
    ((moom.jL)(this.e)).d = ((java.lang.String)(""));
    }
    if (!((((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yN() != null))) {
        break lexical_join_60;
    }
    ((moom.jL)(this.e)).g = ((java.lang.String)(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yN())).a__String()));
    ((moom.jL)(this.e)).f = ((int)(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yN())).a()));
    if (!((life4_5 != 0))) {
        break lexical_join_68;
    }
    }
    ((moom.jL)(this.e)).g = ((java.lang.String)("Old"));
    ((moom.jL)(this.e)).f = ((int)(0));
    }
    spill1206_1 = ((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP();
    if (!((life4_5 == 0))) {
        lexicalValue1206_90_0 = spill1206_1;
        break lexical_join_90;
    }
    if (!((spill1206_1 != null))) {
        break lexical_join_173;
    }
    ((moom.jL)(this.e)).c = ((java.lang.String)(__sourceIntrinsic_a828e318c9a5_invokedynamic1206_37(net.minecraft.util.EnumChatFormatting.GRAY, ((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP())).b(), net.minecraft.util.EnumChatFormatting.DARK_GRAY, net.minecraft.util.EnumChatFormatting.GRAY, ((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP())).a())));
    spill1206_2 = life5_34;
    if (!((life4_5 == 0))) {
        lexicalValue1206_179_0 = spill1206_2;
        break lexical_join_179;
    }
    lexicalValue1206_90_0 = ((net.minecraft.network.ServerStatusResponse)(spill1206_2)).a__yP();
    }
    if (!(org.apache.commons.lang3.ArrayUtils.isNotEmpty(((java.lang.Object[])(((net.minecraft.network.ServerStatusResponse$PlayerCountData)(lexicalValue1206_90_0)).a__ArrayGameProfile()))))) {
        break lexical_join_178;
    }
    life6_129 = new java.lang.StringBuilder();
    life7_133 = ((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP())).a__ArrayGameProfile();
    life8_136 = (life7_133).length;
    life9_138 = 0;
    lexical_cycle_106: while (true) {
    lexical_join_128: {
    lexical_join_124: {
    if (!((life9_138 < life8_136))) {
        break lexical_join_132;
    }
    life10_145 = (life7_133)[life9_138];
    spill1206_3 = life6_129;
    if (!((life4_5 == 0))) {
        lexicalValue1206_128_0 = spill1206_3;
        break lexical_join_128;
    }
    spill1206_4 = ((java.lang.StringBuilder)(spill1206_3)).length();
    if (!((life4_5 == 0))) {
        lexicalValue1206_136_0 = spill1206_4;
        break lexical_join_136;
    }
    if (!((spill1206_4 > 0))) {
        break lexical_join_124;
    }
    ((java.lang.StringBuilder)(life6_129)).append(((java.lang.String)("\n")));
    }
    lexicalValue1206_128_0 = ((java.lang.StringBuilder)(life6_129)).append(((java.lang.String)(((com.mojang.authlib.GameProfile)(life10_145)).getName())));
    }
    recovery.source.CarrierOps.discard(lexicalValue1206_128_0);
    life9_138 += 1;
    if (!((life4_5 != 0))) { continue lexical_cycle_106; }
    break lexical_cycle_106;
    }
    }
    lexicalValue1206_136_0 = (((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP())).a__ArrayGameProfile()).length;
    }
    if (!((life4_5 == 0))) {
        lexicalValue1206_146_0 = lexicalValue1206_136_0;
        break lexical_join_146;
    }
    if (!((lexicalValue1206_136_0 < ((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP())).b()))) {
        break lexical_join_166;
    }
    spill1206_5 = life6_129;
    if (!((life4_5 == 0))) {
        lexicalValue1206_165_0 = spill1206_5;
        break lexical_join_165;
    }
    lexicalValue1206_146_0 = ((java.lang.StringBuilder)(spill1206_5)).length();
    }
    if (!((lexicalValue1206_146_0 > 0))) {
        break lexical_join_151;
    }
    ((java.lang.StringBuilder)(life6_129)).append(((java.lang.String)("\n")));
    }
    lexicalValue1206_165_0 = ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(life6_129)).append(((java.lang.String)("... and "))))).append(((int)((((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP())).b() - (((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse)(life5_34)).a__yP())).a__ArrayGameProfile()).length)))))).append(((java.lang.String)(" more ...")));
    }
    recovery.source.CarrierOps.discard(lexicalValue1206_165_0);
    }
    ((moom.jL)(this.e)).i = ((java.lang.String)(((java.lang.StringBuilder)(life6_129)).toString()));
    if (!((life4_5 != 0))) {
        break lexical_join_178;
    }
    }
    ((moom.jL)(this.e)).c = ((java.lang.String)(__sourceIntrinsic_a828e318c9a5_invokedynamic1206_68(net.minecraft.util.EnumChatFormatting.DARK_GRAY)));
    }
    lexicalValue1206_179_0 = life5_34;
    }
    spill1206_6 = ((net.minecraft.network.ServerStatusResponse)(lexicalValue1206_179_0)).a();
    if (!((life4_5 == 0))) {
        lexicalValue1206_185_0 = spill1206_6;
        break lexical_join_185;
    }
    if (!((spill1206_6 != null))) {
        break lexical_join_206;
    }
    lexicalValue1206_185_0 = ((net.minecraft.network.ServerStatusResponse)(life5_34)).a();
    }
    life6_248 = lexicalValue1206_185_0;
    if (!((life4_5 == 0))) {
        break lexical_join_199;
    }
    if (!(((java.lang.String)(life6_248)).startsWith(((java.lang.String)("data:image/png;base64,"))))) {
        break lexical_join_201;
    }
    ((moom.jL)(this.e)).a(((java.lang.String)(((java.lang.String)(life6_248)).substring(((int)(((java.lang.String)("data:image/png;base64,")).length()))))));
    }
    if (!((life4_5 != 0))) {
        break lexical_join_204;
    }
    }
    ((org.apache.logging.log4j.Logger)(moom.jZ.b)).error(((java.lang.String)("Invalid server icon (unknown format)")));
    }
    if (!((life4_5 != 0))) {
        break lexical_join_210;
    }
    }
    ((moom.jL)(this.e)).a(((java.lang.String)(null)));
    }
    this.c = ((long)(net.minecraft.client.Minecraft.a__Long()));
    ((net.minecraft.network.NetworkManager)(this.d)).a(((moom.yK)(new moom.AP(this.c))));
    this.a = ((boolean)(true));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a828e318c9a5_invokedynamic1206_37(net.minecraft.util.EnumChatFormatting a0, int a1, net.minecraft.util.EnumChatFormatting a2, net.minecraft.util.EnumChatFormatting a3, int a4) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a828e318c9a5_invokedynamic1206_68(net.minecraft.util.EnumChatFormatting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2586c2e710d8_invokedynamic3648_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2586c2e710d8_invokedynamic3648_12(net.minecraft.util.EnumChatFormatting a0) throws E;

private static native java.lang.String __sourceExactCall_ecc91eedf396a9(net.minecraft.util.IChatComponent p0);
private static native void __sourceExactCall_c84eaeabefe110(moom.jZ p0, moom.jL p1);
}
