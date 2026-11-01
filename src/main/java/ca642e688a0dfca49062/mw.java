package com.moon;


public class mw implements com.moon.mo {

private final com.moon.module.Module a;

private final java.util.List<com.moon.mo> b;

private static final long c;

private static final java.lang.String d;

public mw(com.moon.module.Module p0) {
super();
    this.b = new java.util.ArrayList();
    this.a = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3558049887175806852L)), ((long)(-5179779701880660036L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132414798145074L)))));
    long local0_life6 = (com.moon.mw.c ^ 108163780045688L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill298_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill298_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill298_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill298_13 = new byte[8];
    (__sourceSpill298_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill298_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation298_15 = __sourceSpill298_13;
    ((javax.crypto.Cipher)(__sourceSpill298_10)).init(((int)(__sourceSpill298_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill298_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation298_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill298_19 = ((java.lang.String)("Lðú~|\177\022")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill298_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill298_20)).doFinal(((byte[])(__sourceSpill298_19)));
    d = ((java.lang.String)(((java.lang.String)(com.moon.mw.a(((byte[])(local4_life22))))).intern()));
}


public void b() {
int lexicalValue263_20_0;
    boolean spill263_0;
    long life1_3;
    int[] life3_5;
    java.util.Iterator life4_36;
    com.moon.mo life5_43;
    lexical_join_39: {
    lexical_join_24: {
    lexical_join_20: {
    life1_3 = (com.moon.mw.c ^ 18556970119761L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill263_0 = imgui.ImGui.collapsingHeader(((java.lang.String)(((com.moon.module.Module)(this.a)).getName())));
    if (!((life3_5 != null))) {
        lexicalValue263_20_0 = ((spill263_0) ? 1 : 0);
        break lexical_join_20;
    }
    if (!(spill263_0)) {
        break lexical_join_39;
    }
    imgui.ImGui.checkbox(((java.lang.String)(com.moon.mw.d)), ((boolean)(((com.moon.module.Module)(this.a)).isEnabled())));
    lexicalValue263_20_0 = ((imgui.ImGui.isItemClicked()) ? 1 : 0);
    }
    if (!((lexicalValue263_20_0 != 0))) {
        break lexical_join_24;
    }
    ((com.moon.module.Module)(this.a)).toggle();
    }
    life4_36 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_28: while (true) {
    if (!(((java.util.Iterator)(life4_36)).hasNext())) {
        break lexical_join_39;
    }
    life5_43 = ((com.moon.mo)(((java.util.Iterator)(life4_36)).next()));
    ((com.moon.mo)(life5_43)).b();
    if (!((life3_5 == null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill1270_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1270_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1270_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1270_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1270_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1270_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
int forestValue133_29_0;
    int forestValue133_47_0;
    int forestValue133_65_0;
    int forestValue133_83_0;
    int forestValue133_101_0;
    int forestValue133_119_0;
    int forestValue133_137_0;
    int forestValue133_155_0;
    int forestValue133_175_0;
    com.moon.setting.Setting forestValue133_177_0;
    int forestValue133_205_0;
    int[] spill133_0;
    boolean spill133_1;
    com.moon.setting.Setting spill133_2;
    boolean spill133_3;
    long life1_3;
    java.util.Iterator life4_9;
    int[] life3_10;
    com.moon.setting.Setting life5_19;
    com.moon.setting.SettingGroup life6_47;
    com.moon.setting.BooleanSetting life7_70;
    com.moon.setting.IntegerSetting life8_93;
    com.moon.setting.FloatSetting life9_116;
    com.moon.setting.ColorSetting life10_139;
    com.moon.setting.ModeSetting life11_162;
    com.moon.setting.EnumSetting life12_185;
    com.moon.setting.MultiSelectSetting life13_208;
    com.moon.k5 life14_232;
    java.util.Iterator life4_248;
    com.moon.mo life5_258;
    com.moon.mo life5_269;
    forest_join_218: {
    forest_join_205: {
    forest_join_189: {
    life1_3 = (com.moon.mw.c ^ 140283405490705L);
    spill133_0 = com.moon.my.b__ArrayInt();
    life4_9 = ((java.util.List)(((com.moon.module.Module)(this.a)).getSettings())).iterator();
    life3_10 = spill133_0;
    forest_cycle_11: while (true) {
    forest_join_187: {
    forest_join_177: {
    forest_join_175: {
    forest_join_171: {
    forest_join_155: {
    forest_join_153: {
    forest_join_137: {
    forest_join_135: {
    forest_join_119: {
    forest_join_117: {
    forest_join_101: {
    forest_join_99: {
    forest_join_83: {
    forest_join_81: {
    forest_join_65: {
    forest_join_63: {
    forest_join_47: {
    forest_join_45: {
    forest_join_29: {
    forest_join_27: {
    if (!(((java.util.Iterator)(life4_9)).hasNext())) {
        break forest_join_189;
    }
    life5_19 = ((com.moon.setting.Setting)(((java.util.Iterator)(life4_9)).next()));
    spill133_1 = ((com.moon.setting.Setting)(life5_19)).isGrouped();
    if (!((life3_10 != null))) {
        forestValue133_205_0 = ((spill133_1) ? 1 : 0);
        break forest_join_205;
    }
    if (!((life3_10 != null))) {
        forestValue133_29_0 = ((spill133_1) ? 1 : 0);
        break forest_join_29;
    }
    if (!(spill133_1)) {
        break forest_join_27;
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_11;
    }
    }
    forestValue133_29_0 = ((life5_19 instanceof com.moon.setting.SettingGroup) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_47_0 = forestValue133_29_0;
        break forest_join_47;
    }
    if (!((forestValue133_29_0 != 0))) {
        break forest_join_45;
    }
    life6_47 = ((com.moon.setting.SettingGroup)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mt(life6_47))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    forestValue133_47_0 = ((life5_19 instanceof com.moon.setting.BooleanSetting) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_65_0 = forestValue133_47_0;
        break forest_join_65;
    }
    if (!((forestValue133_47_0 != 0))) {
        break forest_join_63;
    }
    life7_70 = ((com.moon.setting.BooleanSetting)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mp(life7_70))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    forestValue133_65_0 = ((life5_19 instanceof com.moon.setting.IntegerSetting) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_83_0 = forestValue133_65_0;
        break forest_join_83;
    }
    if (!((forestValue133_65_0 != 0))) {
        break forest_join_81;
    }
    life8_93 = ((com.moon.setting.IntegerSetting)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mu(life8_93))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    forestValue133_83_0 = ((life5_19 instanceof com.moon.setting.FloatSetting) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_101_0 = forestValue133_83_0;
        break forest_join_101;
    }
    if (!((forestValue133_83_0 != 0))) {
        break forest_join_99;
    }
    life9_116 = ((com.moon.setting.FloatSetting)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.ms(life9_116))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    forestValue133_101_0 = ((life5_19 instanceof com.moon.setting.ColorSetting) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_119_0 = forestValue133_101_0;
        break forest_join_119;
    }
    if (!((forestValue133_101_0 != 0))) {
        break forest_join_117;
    }
    life10_139 = ((com.moon.setting.ColorSetting)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mq(life10_139))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    forestValue133_119_0 = ((life5_19 instanceof com.moon.setting.ModeSetting) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_137_0 = forestValue133_119_0;
        break forest_join_137;
    }
    if (!((forestValue133_119_0 != 0))) {
        break forest_join_135;
    }
    life11_162 = ((com.moon.setting.ModeSetting)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mr(life11_162))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    forestValue133_137_0 = ((life5_19 instanceof com.moon.setting.EnumSetting) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_155_0 = forestValue133_137_0;
        break forest_join_155;
    }
    if (!((forestValue133_137_0 != 0))) {
        break forest_join_153;
    }
    life12_185 = ((com.moon.setting.EnumSetting)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mv(life12_185))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    forestValue133_155_0 = ((life5_19 instanceof com.moon.setting.MultiSelectSetting) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forestValue133_175_0 = forestValue133_155_0;
        break forest_join_175;
    }
    if (!((forestValue133_155_0 != 0))) {
        break forest_join_171;
    }
    life13_208 = ((com.moon.setting.MultiSelectSetting)(life5_19));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mx(life13_208))));
    if (!((life3_10 == null))) {
        break forest_join_187;
    }
    }
    spill133_2 = life5_19;
    if (!((life3_10 != null))) {
        forestValue133_177_0 = spill133_2;
        break forest_join_177;
    }
    forestValue133_175_0 = ((spill133_2 instanceof com.moon.k5) ? 1 : 0);
    }
    if (!((forestValue133_175_0 != 0))) {
        break forest_join_187;
    }
    forestValue133_177_0 = life5_19;
    }
    life14_232 = ((com.moon.k5)(forestValue133_177_0));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.my(life14_232))));
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    life4_248 = ((java.util.List)(this.b)).iterator();
    forest_cycle_193: while (true) {
    if (!(((java.util.Iterator)(life4_248)).hasNext())) {
        break forest_join_218;
    }
    life5_258 = ((com.moon.mo)(((java.util.Iterator)(life4_248)).next()));
    ((com.moon.mo)(life5_258)).a();
    if (!((life3_10 == null))) {
        continue forest_cycle_193;
    }
    break forest_cycle_193;
    }
    break forest_join_218;
    }
    forest_cycle_205: while (true) {
    forest_join_215: {
    if (!((forestValue133_205_0 != 0))) {
        break forest_join_218;
    }
    life5_269 = ((com.moon.mo)(((java.util.Iterator)(life4_9)).next()));
    ((com.moon.mo)(life5_269)).a();
    if (!((life3_10 == null))) {
        break forest_join_215;
    }
    break forest_join_218;
    }
    spill133_3 = ((java.util.Iterator)(life4_9)).hasNext();
    forestValue133_205_0 = ((spill133_3) ? 1 : 0);
    continue forest_cycle_205;
    }
    }
    return;
}

}
