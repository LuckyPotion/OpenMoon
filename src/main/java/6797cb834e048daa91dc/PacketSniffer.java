package com.moon.module.impl;


public class PacketSniffer extends com.moon.module.Module {

private static java.util.Map<java.lang.Class<?>, java.lang.String> s;

public com.moon.setting.MultiSelectSetting<com.moon.bo> t;

public com.moon.setting.MultiSelectSetting<com.moon.bn> u;

private java.util.function.Predicate<moom.yK<?>> v;

private static long w;

private static java.lang.String[] x;

private static java.lang.String[] y;

private static java.util.Map z;

public PacketSniffer(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_be794b266bca19e7(com.moon.module.impl.PacketSniffer receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.PacketSniffer.w ^ 116482962128154L);

    com.moon.module.impl.PacketSniffer.__sourceConstructorInit_be794b266bca19e7_0(((com.moon.module.impl.PacketSniffer)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.PacketSniffer)(receiver)).t = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_2(8791, (8788762619187314715L ^ local5)))), ((java.lang.Class)(com.moon.bo.class))))).a(((java.lang.String)(__sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_5(3620, (1933467050550160471L ^ local5)))), ((java.lang.Enum[])(new com.moon.bo[] {com.moon.bo.GAME_CHAT}))))).a()));

    ((com.moon.module.impl.PacketSniffer)(receiver)).u = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_10(18864, (7491690166052465656L ^ local5)))), ((java.lang.Class)(com.moon.bn.class))))).a(((java.lang.String)(__sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_13(2934, (3884021740638529833L ^ local5)))), ((java.lang.Enum[])(new com.moon.bn[] {com.moon.bn.KEEPALIVE, com.moon.bn.TRANSACTION, com.moon.bn.VELOCITY, com.moon.bn.TELEPORT}))))).a()));

    ((com.moon.module.impl.PacketSniffer)(receiver)).v = ((java.util.function.Predicate)(__sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_21(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_be794b266bca19e7_0(com.moon.module.impl.PacketSniffer a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
w = ((long)(((moom._a)(moom._c.a(((long)(5481168173459184238L)), ((long)(8950536228294052076L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195469974833675L)))));

    long local9_life6 = (com.moon.module.impl.PacketSniffer.w ^ 51870861298135L);

    z = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill379_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill379_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill379_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill379_14 = new byte[8];

    (__sourceSpill379_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill379_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation379_16 = __sourceSpill379_14;

    ((javax.crypto.Cipher)(__sourceSpill379_11)).init(((int)(__sourceSpill379_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill379_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation379_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[59];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "\t¾ ~\fþ+z¦4\r3\004í(AÉ\035\026ÌÂÜâÔÎ±kà¢q¹rl¬[u\177ËÜ§Z}LMuáX\fQ\030X\\°WO~TdºqË-Ó±\030\036H¾Ù$wÍ Äò\024\001\007\007õëYós£®åPmÿï×ÞO3W¬@\036{\002Ç î\177\035ç´<%%Î\024^£2\021õ÷{\005&*»pmZ§Ì-\020_\031G¢É.:\"×øXXÃ<ê\t Ö¾á{m[\034äÔE«\034úY°\\Ð\033AJ½´·\013È(úÒÌkË«\001°á,^£ô;TpQu`L½tü÷\t0­Xª«´(¬¸Ú\030vµ\013ïuR\030\017su\0316\024ø:ÇF5y\026á .@©Ær\016=ìrwZ!\035ÏÌ\035KªëS,¾*h:âjV\0300AÛþ÷¬^±'ò¨ÚýL\nIdÕÁe½\030ÅrÁÒû|fãh2ZOÜo£ò\177_4 ©­|\030\020ßB\004bÑ\0309ê±Sa@Í²Fes\030dßÞh0\000 Ï\025/cº+ÓQ\037eJ,zq×¸·<\021ú®\021\034àÆ\020 õÉç'\000g÷\b\005ªß-òIÃ\r^\006T\030¡¢£­h(QØJÊ ÂAVâ%\022\033@¿Ë\001y\035ð×\003\020%rV\002£;w\024\030\025(S\017Ñv?ÑEÌCPÖAÕ6\025¦QÅMu7t\032\007lÎÜ`çr¯hh|ÇÛW\027 \t\001ÝA\0316ñ·\035èmØE¢×Áó0\021\027Öü\017Àö @DÀÓÜ\004Ó\024BïÖ\002¶æU±^ú\rüEí=P8½2N\030ëSÂòzDJ ßCJ#n¼_:§e6~<Ï÷\030\004w>I? &Í\nÌ\035´WçUL]\031¢DHòßF ÛOP\\^ò\\þ°µê÷írO\034<j¤\016O¾\000\005D]MjÄ\030\033ªãrAá&©¬\fÉ@:êW ðÔ L«åþ(\033Ç\035\t\0259Üd[\013\016Þv²Z6]\031«KÙë\016¥®\rtç{¡÷\035Ô\035*ÞÝ(çÙRVl\033z¦\\<¿Yéó9ºÖÁá\037\003\031çÇ\013¦¹çÏD§(t\033»í]ù\031\177>ªá´Óã,)\"\000,WÊQÑÙ\023\003µÎzÅàÎ\fU iN3GÐt½I~_¬ß\033bÃA\tóÕûå\030ËSV ¢' Ý°3!!ÄãØ\013D[ó\tV£¬çêTÇìOt9á0\030Aß îÏ}8\013øû±ëh+ÐÑûÔí\r\\\r\f]e¥,é;\033ÁÈ¿ ê>\004Lå!\004¨\"¹5àä'¤Qüº\000kOÍ.\024µ(3wN*Ï6Ï\026*Á.TZÈÉøw\037<¹Ó8Ýï¤\030p\032Ò¦o­Ê} )\021¾HÂï/_;*l\00742UA\016jå[ÔißÀE¿e\030\004ÊÇ\027z\026¦Àe\004Sm;ñ®ìF*ªÊgú(ôÿF2ÁHVùC\025§/l^¤}\024)&-Ê\tõÔqY´ø#ê»\032É ÆÈ4+Ìáp\023'îlÊk\r'Ã[Â\037ÃL6¼x\020Øüës@ÿ(\024%µq#ù[jaÓ\007Çh8{\0361#¦\025;DkbúàÇðÆ:\033BÆþ®±y­<µÿb_|\006®:\026\002x\036]mÅJ(V®Q´\025·\000®ôk±^\026ÁÕÿ¦;{£cÒ`Óë.Ä)åfÓnûÙØ+ \017ö¦k2Ä\025lÐ\râw |\022öå>J6ßÈ\"hi5·ê@ \\ÝgT9)V\005Xñ:ªpÝyçë\023éwlDÒê¾Ôö¿å\\ ÜIðRpcj6\006¹ÒsÿEe\024A\017UñÝ³¸\021ò\020_8ò\023ÈS®¾!(×§'²¬0^\023Ã§?PÊOgqâ~QÜ$\026Âq×\002èÀ\bì¨\025\007ï#Wte¿¾öÕµd\n`V¬ \0255Á\030ò\000H\001ú[ÈH\022PÂ¢\025`Ë\026wT:NJñé (½ âºö\023\031\0168ª¤\021³Î\026Á¨\035ä ßVn½©\030je«M6Ý¤÷;=¬ÿ\\U\006Eüïg\030¡IÙ[Ö©\017víÃM¬O_¥2\006>¦Ñ\036G\030©'iDÊÀ\033p%£z»Æ ~\rJ\b(÷Öj{R\026&÷OIuYþôÛ\001»Tæ\007·ÀUjJmÃ¼Aji×2\023pSZî üé0°á#Â\006\031ßeö5Þ1âü3@¬\"n\">\0005`\005 k[èÖ,\023Ë.$\031èV·ttï_ò]ÎH\027|\031\177îC ¦Ó®\013^5¸î+\027v\034U\020\033\002?Q8åX.´hAË\nªê\021\0226\030-µ[ÈÙÀ÷½c§8¶¸){í\013Ë²g ù®|¡H¶µGÿ$g/Î@ã¸\\1¿iW\032¹rõ¡\020ÀÆt\035Ã¡6Cõ¬¡Æ+\023 §µß&\002/È÷;\013\031\0210;ÆPi;Rß5u\0271P1I·\030¶5ÕL}[\020HÉ\001Æ\001ªÄL\030nnp­Þ(\030ð}i9I\020A×\004Ñ4@Jì2ù÷ç\027ÖI¡GëÌÍñä/r¢Ñ"))).length();

    int local3_life24 = 16;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill379_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill379_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill379_29)).doFinal(((byte[])(__sourceSpill379_28)));

        java.lang.String __sourceSpill379_34 = ((java.lang.String)(com.moon.module.impl.PacketSniffer.c(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill379_35 = local7_life19;

        int __sourceSpill379_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill379_35)[__sourceSpill379_36] = __sourceSpill379_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "°ôo6MÖÍXßEvó\001 °ÝñPa^ª\017N.1T\020øû{Ö\035£ê\rô³*}¯`o"))).length();

    local3_life24 = 32;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill379_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill379_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill379_43)).doFinal(((byte[])(__sourceSpill379_42)));

        java.lang.String __sourceSpill379_48 = ((java.lang.String)(com.moon.module.impl.PacketSniffer.c(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill379_49 = local7_life19;

        int __sourceSpill379_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill379_49)[__sourceSpill379_50] = __sourceSpill379_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    x = ((java.lang.String[])(local7_life19));

    y = ((java.lang.String[])(new java.lang.String[59]));

    s = ((java.util.Map)(new java.util.HashMap()));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zt.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_58(8784, (8761445581436597464L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Aj.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_62(20680, (9199162881131955817L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zL.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_66(3742, (6864235910503471113L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.z9.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_70(11495, (3956763562025859708L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zB.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_74(13757, (6089514974231372584L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zR.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_78(31430, (3589637420540587072L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zN.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_82(32760, (594773776673958258L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zO.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_86(1235, (1942117929001620060L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zP.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_90(1235, (1942117929001620060L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zQ.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_94(1235, (1942117929001620060L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zS.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_98(29229, (5135000438674023554L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zF.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_102(4653, (1727195583059559588L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zH.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_106(8397, (1619723156381873767L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zI.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_110(24614, (2724174851709892245L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zJ.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_114(19014, (794555220527275216L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zK.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_118(21569, (5441525876242105036L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zM.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_122(17335, (6194432306852910383L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zU.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_126(1656, (9113438864079458517L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zV.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_130(31333, (528482320084987125L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zW.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_134(20631, (3573592273113957913L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zX.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_138(14357, (1986267032817774223L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zY.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_142(7045, (1087204185636179245L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zZ.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_146(31559, (6590473131999784404L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Ad.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_150(21099, (2678191486062773448L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Am.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_154(11105, (850332863487360458L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.AK.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_158(16169, (5032740888425114026L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zT.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_162(201, (700238595046413940L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.z1.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_166(16870, (504059854600296258L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.z3.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_170(27151, (8742182425051069572L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.z5.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_174(3475, (6531104484522564403L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.z6.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_178(32472, (6931329560590575684L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.z7.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_182(1155, (2249547208899891715L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.z8.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_186(13451, (8772966130790212105L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Ak.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_190(3217, (1558625544801131050L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.An.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_194(15978, (129025533238978774L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.AE.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_198(6163, (7162696486927666858L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Ac.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_202(17302, (7296186708782273838L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Ae.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_206(19956, (4490024304567081840L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Af.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_210(24351, (240138688752339334L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Ag.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_214(32206, (7157432341861788529L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Ah.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_218(9950, (3829941329406537817L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.Ai.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_222(31603, (3835342683630923221L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.As.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_226(19951, (7694088374003882878L ^ local9_life6)))));

    ((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).put(((java.lang.Object)(moom.zy.class)), ((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_230(25775, (7242037758942409224L ^ local9_life6)))));
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1162_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1162_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1162_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1162_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1162_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1162_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1030);
    if (((com.moon.module.impl.PacketSniffer.y)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.PacketSniffer.z)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.PacketSniffer.z)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lj", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.module.impl.PacketSniffer.x)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.PacketSniffer.y)[life5_8] = com.moon.module.impl.PacketSniffer.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.PacketSniffer.y)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.PacketSniffer.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2581_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(moom.yK<?> p0, boolean p1) {
((com.moon.module.impl.PacketSniffer)(this)).a(((moom.yK)(p0)), ((java.lang.String)("")), ((boolean)(p1)));
    return;
}


private void a(moom.yK<?> p0, java.lang.String p1, boolean p2) {
java.lang.String forwardValue892_22_0;
    java.lang.String forwardValue892_38_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue892_46_0;
    int forwardValue892_49_0;
    int forwardValue892_89_0;
    int spill892_0;
    java.lang.String spill892_1;
    net.minecraft.client.entity.EntityPlayerSP spill892_2;
    boolean spill892_3;
    long life4_3;
    java.lang.String life7_15;
    int life6_16;
    java.lang.String life8_24;
    int life9_63;
    java.lang.String life10_99;
    java.lang.String life10_132;
    forward_join_119: {
    forward_join_89: {
    forward_join_85: {
    forward_join_49: {
    forward_join_48: {
    forward_join_46: {
    forward_join_39: {
    forward_join_38: {
    forward_join_22: {
    forward_join_21: {
    life4_3 = (com.moon.module.impl.PacketSniffer.w ^ 27958805972916L);
    spill892_0 = com.moon.bk.b();
    life7_15 = ((java.lang.String)(((java.util.Map)(com.moon.module.impl.PacketSniffer.s)).getOrDefault(((java.lang.Object)(((java.lang.Object)(p0)).getClass())), ((java.lang.Object)(__sourceIntrinsic_9514b7c99258_invokedynamic892_4(1728, (8989710136964898329L ^ life4_3)))))));
    life6_16 = spill892_0;
    if (!(p2)) {
        break forward_join_21;
    }
    forwardValue892_22_0 = "I";
    break forward_join_22;
    }
    forwardValue892_22_0 = "O";
    }
    life8_24 = forwardValue892_22_0;
    spill892_1 = life7_15;
    if (!((life6_16 == 0))) {
        forwardValue892_38_0 = spill892_1;
        break forward_join_38;
    }
    if (!(((java.lang.String)(spill892_1)).startsWith(((java.lang.String)(__sourceIntrinsic_9514b7c99258_invokedynamic892_7(3886, (3855240014840387538L ^ life4_3))))))) {
        break forward_join_39;
    }
    forwardValue892_38_0 = __sourceIntrinsic_9514b7c99258_invokedynamic892_9(1283, (2511012117038685644L ^ life4_3));
    }
    life7_15 = forwardValue892_38_0;
    }
    spill892_2 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.PacketSniffer.d)).K;
    if (!((life6_16 == 0))) {
        forwardValue892_46_0 = spill892_2;
        break forward_join_46;
    }
    if (!((spill892_2 != null))) {
        break forward_join_48;
    }
    forwardValue892_46_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.PacketSniffer.d)).K;
    }
    forwardValue892_49_0 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue892_46_0)).S;
    break forward_join_49;
    }
    forwardValue892_49_0 = 0;
    }
    life9_63 = forwardValue892_49_0;
    spill892_3 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bo.GAME_CHAT)));
    if (!((life6_16 == 0))) {
        forwardValue892_89_0 = ((spill892_3) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill892_3)) {
        break forward_join_85;
    }
    life10_99 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_9514b7c99258_invokedynamic892_19(15835, (7357437557188814097L ^ life4_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(life9_63))), life8_24, life7_15, p1})));
    com.moon.nC.c(((java.lang.String)(life10_99)));
    }
    forwardValue892_89_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bo.CONSOLE)))) ? 1 : 0);
    }
    if (!((forwardValue892_89_0 != 0))) {
        break forward_join_119;
    }
    life10_132 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_9514b7c99258_invokedynamic892_27(8273, (8927068904144533660L ^ life4_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(life9_63))), life8_24, life7_15, p1})));
    ((java.io.PrintStream)(java.lang.System.out)).println(((java.lang.String)(life10_132)));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
moom.yK forwardValue891_20_0;
    com.moon.event.PacketEvent forwardValue891_44_0;
    int forwardValue891_56_0;
    com.moon.module.impl.PacketSniffer forwardValue891_84_0;
    moom.yK forwardValue891_84_1;
    java.lang.String forwardValue891_84_2;
    int forwardValue891_84_3;
    com.moon.module.impl.PacketSniffer forwardValue891_85_0;
    moom.yK forwardValue891_85_1;
    java.lang.String forwardValue891_85_2;
    com.moon.module.impl.PacketSniffer forwardValue891_86_0;
    moom.yK forwardValue891_86_1;
    java.lang.String forwardValue891_86_2;
    int forwardValue891_86_3;
    int forwardValue891_91_0;
    com.moon.module.impl.PacketSniffer forwardValue891_119_0;
    moom.yK forwardValue891_119_1;
    java.lang.String forwardValue891_119_2;
    int forwardValue891_119_3;
    com.moon.module.impl.PacketSniffer forwardValue891_120_0;
    moom.yK forwardValue891_120_1;
    java.lang.String forwardValue891_120_2;
    com.moon.module.impl.PacketSniffer forwardValue891_121_0;
    moom.yK forwardValue891_121_1;
    java.lang.String forwardValue891_121_2;
    int forwardValue891_121_3;
    int forwardValue891_126_0;
    com.moon.module.impl.PacketSniffer forwardValue891_160_0;
    moom.yK forwardValue891_160_1;
    java.lang.String forwardValue891_160_2;
    int forwardValue891_160_3;
    com.moon.module.impl.PacketSniffer forwardValue891_161_0;
    moom.yK forwardValue891_161_1;
    java.lang.String forwardValue891_161_2;
    com.moon.module.impl.PacketSniffer forwardValue891_162_0;
    moom.yK forwardValue891_162_1;
    java.lang.String forwardValue891_162_2;
    int forwardValue891_162_3;
    int forwardValue891_167_0;
    com.moon.module.impl.PacketSniffer forwardValue891_207_0;
    moom.yK forwardValue891_207_1;
    java.lang.String forwardValue891_207_2;
    int forwardValue891_207_3;
    com.moon.module.impl.PacketSniffer forwardValue891_208_0;
    moom.yK forwardValue891_208_1;
    java.lang.String forwardValue891_208_2;
    com.moon.module.impl.PacketSniffer forwardValue891_209_0;
    moom.yK forwardValue891_209_1;
    java.lang.String forwardValue891_209_2;
    int forwardValue891_209_3;
    int forwardValue891_214_0;
    com.moon.module.impl.PacketSniffer forwardValue891_282_0;
    moom.yK forwardValue891_282_1;
    java.lang.String forwardValue891_282_2;
    int forwardValue891_282_3;
    com.moon.module.impl.PacketSniffer forwardValue891_283_0;
    moom.yK forwardValue891_283_1;
    java.lang.String forwardValue891_283_2;
    com.moon.module.impl.PacketSniffer forwardValue891_284_0;
    moom.yK forwardValue891_284_1;
    java.lang.String forwardValue891_284_2;
    int forwardValue891_284_3;
    int forwardValue891_289_0;
    com.moon.module.impl.PacketSniffer forwardValue891_317_0;
    moom.yK forwardValue891_317_1;
    java.lang.String forwardValue891_317_2;
    int forwardValue891_317_3;
    com.moon.module.impl.PacketSniffer forwardValue891_318_0;
    moom.yK forwardValue891_318_1;
    java.lang.String forwardValue891_318_2;
    com.moon.module.impl.PacketSniffer forwardValue891_319_0;
    moom.yK forwardValue891_319_1;
    java.lang.String forwardValue891_319_2;
    int forwardValue891_319_3;
    int forwardValue891_326_0;
    moom.yK forwardValue891_328_0;
    com.moon.module.impl.PacketSniffer forwardValue891_358_0;
    moom.yK forwardValue891_358_1;
    java.lang.String forwardValue891_358_2;
    int forwardValue891_358_3;
    com.moon.module.impl.PacketSniffer forwardValue891_359_0;
    moom.yK forwardValue891_359_1;
    java.lang.String forwardValue891_359_2;
    com.moon.module.impl.PacketSniffer forwardValue891_360_0;
    moom.yK forwardValue891_360_1;
    java.lang.String forwardValue891_360_2;
    int forwardValue891_360_3;
    com.moon.module.impl.PacketSniffer forwardValue891_371_0;
    moom.yK forwardValue891_371_1;
    int forwardValue891_371_2;
    com.moon.module.impl.PacketSniffer forwardValue891_372_0;
    moom.yK forwardValue891_372_1;
    com.moon.module.impl.PacketSniffer forwardValue891_373_0;
    moom.yK forwardValue891_373_1;
    int forwardValue891_373_2;
    com.moon.event.PacketEvent spill891_0;
    moom.yK spill891_1;
    boolean spill891_2;
    com.moon.module.impl.PacketSniffer spill891_3;
    moom.yK spill891_4;
    java.lang.String spill891_5;
    boolean spill891_6;
    com.moon.module.impl.PacketSniffer spill891_7;
    moom.yK spill891_8;
    java.lang.String spill891_9;
    boolean spill891_10;
    com.moon.module.impl.PacketSniffer spill891_11;
    moom.yK spill891_12;
    java.lang.String spill891_13;
    boolean spill891_14;
    com.moon.module.impl.PacketSniffer spill891_15;
    moom.yK spill891_16;
    java.lang.String spill891_17;
    boolean spill891_18;
    com.moon.module.impl.PacketSniffer spill891_19;
    moom.yK spill891_20;
    java.lang.String spill891_21;
    boolean spill891_22;
    com.moon.module.impl.PacketSniffer spill891_23;
    moom.yK spill891_24;
    java.lang.String spill891_25;
    boolean spill891_26;
    moom.yK spill891_27;
    com.moon.module.impl.PacketSniffer spill891_28;
    moom.yK spill891_29;
    java.lang.String spill891_30;
    boolean spill891_31;
    com.moon.module.impl.PacketSniffer spill891_32;
    moom.yK spill891_33;
    boolean spill891_34;
    long life2_3;
    int life4_5;
    moom.yK life6_16;
    com.moon.hS life5_30;
    moom.yK life5_54;
    moom.zR life6_76;
    moom.zS life7_120;
    moom.zN life8_164;
    moom.zB life9_214;
    moom.zL life10_270;
    com.moon.n5 life13_301;
    moom.zt life11_357;
    moom.Aj life12_401;
    forward_join_374: {
    forward_join_373: {
    forward_join_372: {
    forward_join_371: {
    forward_join_363: {
    forward_join_360: {
    forward_join_359: {
    forward_join_358: {
    forward_join_328: {
    forward_join_326: {
    forward_join_322: {
    forward_join_319: {
    forward_join_318: {
    forward_join_317: {
    forward_join_289: {
    forward_join_287: {
    forward_join_284: {
    forward_join_283: {
    forward_join_282: {
    forward_join_214: {
    forward_join_212: {
    forward_join_209: {
    forward_join_208: {
    forward_join_207: {
    forward_join_167: {
    forward_join_165: {
    forward_join_162: {
    forward_join_161: {
    forward_join_160: {
    forward_join_126: {
    forward_join_124: {
    forward_join_121: {
    forward_join_120: {
    forward_join_119: {
    forward_join_91: {
    forward_join_89: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_56: {
    forward_join_54: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_20: {
    life2_3 = (com.moon.module.impl.PacketSniffer.w ^ 99658650103190L);
    life4_5 = com.moon.bk.b();
    spill891_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue891_44_0 = spill891_0;
        break forward_join_44;
    }
    if (!(((com.moon.event.PacketEvent)(spill891_0)).b__sourceReturn_aae029aa0a())) {
        break forward_join_43;
    }
    life6_16 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill891_1 = life6_16;
    if (!((life4_5 == 0))) {
        forwardValue891_20_0 = spill891_1;
        break forward_join_20;
    }
    if (!((((spill891_1 instanceof com.moon.hS) ? 1 : 0) != 0))) {
        break forward_join_42;
    }
    forwardValue891_20_0 = life6_16;
    }
    life5_30 = ((com.moon.hS)(forwardValue891_20_0));
    ((com.moon.module.impl.PacketSniffer)(this)).a(((moom.yK)(new moom.Aj())), ((java.lang.String)(java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_6(2847, (8043251884804651516L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((com.moon.hS)(life5_30)).b__sourceReturn_8abf5c6871())))}))))), ((boolean)(false)));
    }
    return;
    }
    forwardValue891_44_0 = p0;
    }
    life5_54 = ((com.moon.event.PacketEvent)(forwardValue891_44_0)).getPacket();
    spill891_2 = ((java.util.function.Predicate)(this.v)).test(((java.lang.Object)(life5_54)));
    if (!((life4_5 == 0))) {
        forwardValue891_56_0 = ((spill891_2) ? 1 : 0);
        break forward_join_56;
    }
    if (!((!spill891_2))) {
        break forward_join_54;
    }
    return;
    }
    forwardValue891_56_0 = ((life5_54 instanceof moom.zR) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue891_91_0 = forwardValue891_56_0;
        break forward_join_91;
    }
    if (!((forwardValue891_56_0 != 0))) {
        break forward_join_89;
    }
    life6_76 = ((moom.zR)(life5_54));
    spill891_3 = this;
    spill891_4 = life5_54;
    spill891_5 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_17(3791, (6154499427211426832L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((moom.zR)(life6_76)).e())))})));
    spill891_6 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_84_0 = spill891_3;
        forwardValue891_84_1 = spill891_4;
        forwardValue891_84_2 = spill891_5;
        forwardValue891_84_3 = ((spill891_6) ? 1 : 0);
        break forward_join_84;
    }
    if (!((!spill891_6))) {
        forwardValue891_85_0 = spill891_3;
        forwardValue891_85_1 = spill891_4;
        forwardValue891_85_2 = spill891_5;
        break forward_join_85;
    }
    forwardValue891_84_0 = spill891_3;
    forwardValue891_84_1 = spill891_4;
    forwardValue891_84_2 = spill891_5;
    forwardValue891_84_3 = 1;
    }
    forwardValue891_86_0 = forwardValue891_84_0;
    forwardValue891_86_1 = forwardValue891_84_1;
    forwardValue891_86_2 = forwardValue891_84_2;
    forwardValue891_86_3 = forwardValue891_84_3;
    break forward_join_86;
    }
    forwardValue891_86_0 = forwardValue891_85_0;
    forwardValue891_86_1 = forwardValue891_85_1;
    forwardValue891_86_2 = forwardValue891_85_2;
    forwardValue891_86_3 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_86_0)).a(((moom.yK)(forwardValue891_86_1)), ((java.lang.String)(forwardValue891_86_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_86_3))));
    if (!((life4_5 != 0))) {
        break forward_join_374;
    }
    }
    forwardValue891_91_0 = ((life5_54 instanceof moom.zS) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue891_126_0 = forwardValue891_91_0;
        break forward_join_126;
    }
    if (!((forwardValue891_91_0 != 0))) {
        break forward_join_124;
    }
    life7_120 = ((moom.zS)(life5_54));
    spill891_7 = this;
    spill891_8 = life5_54;
    spill891_9 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_26(31247, (5363808310426847426L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((moom.zS)(life7_120)).a__Int())))})));
    spill891_10 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_119_0 = spill891_7;
        forwardValue891_119_1 = spill891_8;
        forwardValue891_119_2 = spill891_9;
        forwardValue891_119_3 = ((spill891_10) ? 1 : 0);
        break forward_join_119;
    }
    if (!((!spill891_10))) {
        forwardValue891_120_0 = spill891_7;
        forwardValue891_120_1 = spill891_8;
        forwardValue891_120_2 = spill891_9;
        break forward_join_120;
    }
    forwardValue891_119_0 = spill891_7;
    forwardValue891_119_1 = spill891_8;
    forwardValue891_119_2 = spill891_9;
    forwardValue891_119_3 = 1;
    }
    forwardValue891_121_0 = forwardValue891_119_0;
    forwardValue891_121_1 = forwardValue891_119_1;
    forwardValue891_121_2 = forwardValue891_119_2;
    forwardValue891_121_3 = forwardValue891_119_3;
    break forward_join_121;
    }
    forwardValue891_121_0 = forwardValue891_120_0;
    forwardValue891_121_1 = forwardValue891_120_1;
    forwardValue891_121_2 = forwardValue891_120_2;
    forwardValue891_121_3 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_121_0)).a(((moom.yK)(forwardValue891_121_1)), ((java.lang.String)(forwardValue891_121_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_121_3))));
    if (!((life4_5 != 0))) {
        break forward_join_374;
    }
    }
    forwardValue891_126_0 = ((life5_54 instanceof moom.zN) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue891_167_0 = forwardValue891_126_0;
        break forward_join_167;
    }
    if (!((forwardValue891_126_0 != 0))) {
        break forward_join_165;
    }
    life8_164 = ((moom.zN)(life5_54));
    spill891_11 = this;
    spill891_12 = life5_54;
    spill891_13 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_35(9640, (224111760354744140L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((moom.zN)(life8_164)).a__Int()))), java.lang.Boolean.valueOf(((boolean)(((moom.zN)(life8_164)).c__Boolean())))})));
    spill891_14 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_160_0 = spill891_11;
        forwardValue891_160_1 = spill891_12;
        forwardValue891_160_2 = spill891_13;
        forwardValue891_160_3 = ((spill891_14) ? 1 : 0);
        break forward_join_160;
    }
    if (!((!spill891_14))) {
        forwardValue891_161_0 = spill891_11;
        forwardValue891_161_1 = spill891_12;
        forwardValue891_161_2 = spill891_13;
        break forward_join_161;
    }
    forwardValue891_160_0 = spill891_11;
    forwardValue891_160_1 = spill891_12;
    forwardValue891_160_2 = spill891_13;
    forwardValue891_160_3 = 1;
    }
    forwardValue891_162_0 = forwardValue891_160_0;
    forwardValue891_162_1 = forwardValue891_160_1;
    forwardValue891_162_2 = forwardValue891_160_2;
    forwardValue891_162_3 = forwardValue891_160_3;
    break forward_join_162;
    }
    forwardValue891_162_0 = forwardValue891_161_0;
    forwardValue891_162_1 = forwardValue891_161_1;
    forwardValue891_162_2 = forwardValue891_161_2;
    forwardValue891_162_3 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_162_0)).a(((moom.yK)(forwardValue891_162_1)), ((java.lang.String)(forwardValue891_162_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_162_3))));
    if (!((life4_5 != 0))) {
        break forward_join_374;
    }
    }
    forwardValue891_167_0 = ((life5_54 instanceof moom.zB) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue891_214_0 = forwardValue891_167_0;
        break forward_join_214;
    }
    if (!((forwardValue891_167_0 != 0))) {
        break forward_join_212;
    }
    life9_214 = ((moom.zB)(life5_54));
    spill891_15 = this;
    spill891_16 = life5_54;
    spill891_17 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_46(2762, (4220609527220844601L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Double.valueOf(((double)(((moom.zB)(life9_214)).a()))), java.lang.Double.valueOf(((double)(((moom.zB)(life9_214)).b()))), java.lang.Double.valueOf(((double)(((moom.zB)(life9_214)).c())))})));
    spill891_18 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_207_0 = spill891_15;
        forwardValue891_207_1 = spill891_16;
        forwardValue891_207_2 = spill891_17;
        forwardValue891_207_3 = ((spill891_18) ? 1 : 0);
        break forward_join_207;
    }
    if (!((!spill891_18))) {
        forwardValue891_208_0 = spill891_15;
        forwardValue891_208_1 = spill891_16;
        forwardValue891_208_2 = spill891_17;
        break forward_join_208;
    }
    forwardValue891_207_0 = spill891_15;
    forwardValue891_207_1 = spill891_16;
    forwardValue891_207_2 = spill891_17;
    forwardValue891_207_3 = 1;
    }
    forwardValue891_209_0 = forwardValue891_207_0;
    forwardValue891_209_1 = forwardValue891_207_1;
    forwardValue891_209_2 = forwardValue891_207_2;
    forwardValue891_209_3 = forwardValue891_207_3;
    break forward_join_209;
    }
    forwardValue891_209_0 = forwardValue891_208_0;
    forwardValue891_209_1 = forwardValue891_208_1;
    forwardValue891_209_2 = forwardValue891_208_2;
    forwardValue891_209_3 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_209_0)).a(((moom.yK)(forwardValue891_209_1)), ((java.lang.String)(forwardValue891_209_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_209_3))));
    if (!((life4_5 != 0))) {
        break forward_join_374;
    }
    }
    forwardValue891_214_0 = ((life5_54 instanceof moom.zL) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue891_289_0 = forwardValue891_214_0;
        break forward_join_289;
    }
    if (!((forwardValue891_214_0 != 0))) {
        break forward_join_287;
    }
    life10_270 = ((moom.zL)(life5_54));
    if (!((((net.minecraft.client.Minecraft)(com.moon.module.impl.PacketSniffer.d)).K != null))) {
        break forward_join_374;
    }
    if (!((((moom.zL)(life10_270)).a() == ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.PacketSniffer.d)).K)).e__Int()))) {
        break forward_join_374;
    }
    life13_301 = new com.moon.n5((((double) ((moom.zL)(life10_270)).b()) / 0x1.f4p12d), (((double) ((moom.zL)(life10_270)).c()) / 0x1.f4p12d), (((double) ((moom.zL)(life10_270)).d()) / 0x1.f4p12d));
    spill891_19 = this;
    spill891_20 = life5_54;
    spill891_21 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_68(13948, (5684124660193920169L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Double.valueOf(((double)(((com.moon.n5)(life13_301)).e()))), java.lang.Double.valueOf(((double)(((com.moon.n5)(life13_301)).f()))), java.lang.Double.valueOf(((double)(((com.moon.n5)(life13_301)).g())))})));
    spill891_22 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_282_0 = spill891_19;
        forwardValue891_282_1 = spill891_20;
        forwardValue891_282_2 = spill891_21;
        forwardValue891_282_3 = ((spill891_22) ? 1 : 0);
        break forward_join_282;
    }
    if (!((!spill891_22))) {
        forwardValue891_283_0 = spill891_19;
        forwardValue891_283_1 = spill891_20;
        forwardValue891_283_2 = spill891_21;
        break forward_join_283;
    }
    forwardValue891_282_0 = spill891_19;
    forwardValue891_282_1 = spill891_20;
    forwardValue891_282_2 = spill891_21;
    forwardValue891_282_3 = 1;
    }
    forwardValue891_284_0 = forwardValue891_282_0;
    forwardValue891_284_1 = forwardValue891_282_1;
    forwardValue891_284_2 = forwardValue891_282_2;
    forwardValue891_284_3 = forwardValue891_282_3;
    break forward_join_284;
    }
    forwardValue891_284_0 = forwardValue891_283_0;
    forwardValue891_284_1 = forwardValue891_283_1;
    forwardValue891_284_2 = forwardValue891_283_2;
    forwardValue891_284_3 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_284_0)).a(((moom.yK)(forwardValue891_284_1)), ((java.lang.String)(forwardValue891_284_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_284_3))));
    if (!((life4_5 != 0))) {
        break forward_join_374;
    }
    }
    forwardValue891_289_0 = ((life5_54 instanceof moom.zt) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue891_326_0 = forwardValue891_289_0;
        break forward_join_326;
    }
    if (!((forwardValue891_289_0 != 0))) {
        break forward_join_322;
    }
    life11_357 = ((moom.zt)(life5_54));
    spill891_23 = this;
    spill891_24 = life5_54;
    spill891_25 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_81(30942, (8838535795126258223L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((moom.zt)(life11_357)).b())))})));
    spill891_26 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_317_0 = spill891_23;
        forwardValue891_317_1 = spill891_24;
        forwardValue891_317_2 = spill891_25;
        forwardValue891_317_3 = ((spill891_26) ? 1 : 0);
        break forward_join_317;
    }
    if (!((!spill891_26))) {
        forwardValue891_318_0 = spill891_23;
        forwardValue891_318_1 = spill891_24;
        forwardValue891_318_2 = spill891_25;
        break forward_join_318;
    }
    forwardValue891_317_0 = spill891_23;
    forwardValue891_317_1 = spill891_24;
    forwardValue891_317_2 = spill891_25;
    forwardValue891_317_3 = 1;
    }
    forwardValue891_319_0 = forwardValue891_317_0;
    forwardValue891_319_1 = forwardValue891_317_1;
    forwardValue891_319_2 = forwardValue891_317_2;
    forwardValue891_319_3 = forwardValue891_317_3;
    break forward_join_319;
    }
    forwardValue891_319_0 = forwardValue891_318_0;
    forwardValue891_319_1 = forwardValue891_318_1;
    forwardValue891_319_2 = forwardValue891_318_2;
    forwardValue891_319_3 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_319_0)).a(((moom.yK)(forwardValue891_319_1)), ((java.lang.String)(forwardValue891_319_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_319_3))));
    if (!((life4_5 != 0))) {
        break forward_join_374;
    }
    }
    spill891_27 = life5_54;
    if (!((life4_5 == 0))) {
        forwardValue891_328_0 = spill891_27;
        break forward_join_328;
    }
    forwardValue891_326_0 = ((spill891_27 instanceof moom.Aj) ? 1 : 0);
    }
    if (!((forwardValue891_326_0 != 0))) {
        break forward_join_363;
    }
    forwardValue891_328_0 = life5_54;
    }
    life12_401 = ((moom.Aj)(forwardValue891_328_0));
    spill891_28 = this;
    spill891_29 = life5_54;
    spill891_30 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic891_90(12035, (9039625487179029983L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Short.valueOf(((short)(((moom.Aj)(life12_401)).a__Short()))), java.lang.Integer.valueOf(((int)(((moom.Aj)(life12_401)).a())))})));
    spill891_31 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_358_0 = spill891_28;
        forwardValue891_358_1 = spill891_29;
        forwardValue891_358_2 = spill891_30;
        forwardValue891_358_3 = ((spill891_31) ? 1 : 0);
        break forward_join_358;
    }
    if (!((!spill891_31))) {
        forwardValue891_359_0 = spill891_28;
        forwardValue891_359_1 = spill891_29;
        forwardValue891_359_2 = spill891_30;
        break forward_join_359;
    }
    forwardValue891_358_0 = spill891_28;
    forwardValue891_358_1 = spill891_29;
    forwardValue891_358_2 = spill891_30;
    forwardValue891_358_3 = 1;
    }
    forwardValue891_360_0 = forwardValue891_358_0;
    forwardValue891_360_1 = forwardValue891_358_1;
    forwardValue891_360_2 = forwardValue891_358_2;
    forwardValue891_360_3 = forwardValue891_358_3;
    break forward_join_360;
    }
    forwardValue891_360_0 = forwardValue891_359_0;
    forwardValue891_360_1 = forwardValue891_359_1;
    forwardValue891_360_2 = forwardValue891_359_2;
    forwardValue891_360_3 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_360_0)).a(((moom.yK)(forwardValue891_360_1)), ((java.lang.String)(forwardValue891_360_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_360_3))));
    if (!((life4_5 != 0))) {
        break forward_join_374;
    }
    }
    spill891_32 = this;
    spill891_33 = life5_54;
    spill891_34 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == 0))) {
        forwardValue891_371_0 = spill891_32;
        forwardValue891_371_1 = spill891_33;
        forwardValue891_371_2 = ((spill891_34) ? 1 : 0);
        break forward_join_371;
    }
    if (!((!spill891_34))) {
        forwardValue891_372_0 = spill891_32;
        forwardValue891_372_1 = spill891_33;
        break forward_join_372;
    }
    forwardValue891_371_0 = spill891_32;
    forwardValue891_371_1 = spill891_33;
    forwardValue891_371_2 = 1;
    }
    forwardValue891_373_0 = forwardValue891_371_0;
    forwardValue891_373_1 = forwardValue891_371_1;
    forwardValue891_373_2 = forwardValue891_371_2;
    break forward_join_373;
    }
    forwardValue891_373_0 = forwardValue891_372_0;
    forwardValue891_373_1 = forwardValue891_372_1;
    forwardValue891_373_2 = 0;
    }
    ((com.moon.module.impl.PacketSniffer)(forwardValue891_373_0)).a(((moom.yK)(forwardValue891_373_1)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue891_373_2))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean lambda$new$0(moom.yK p0) {
int forwardValue893_20_0;
    int forwardValue893_32_0;
    int forwardValue893_37_0;
    int forwardValue893_49_0;
    int forwardValue893_54_0;
    int forwardValue893_66_0;
    int forwardValue893_158_0;
    int forwardValue893_163_0;
    int forwardValue893_175_0;
    int forwardValue893_222_0;
    int forwardValue893_227_0;
    int forwardValue893_269_0;
    int forwardValue893_273_0;
    int forwardValue893_275_0;
    int spill893_0;
    boolean spill893_1;
    int spill893_2;
    int spill893_3;
    boolean spill893_4;
    int spill893_5;
    int spill893_6;
    int spill893_7;
    int spill893_8;
    int spill893_9;
    int spill893_10;
    int spill893_11;
    int spill893_12;
    int spill893_13;
    int spill893_14;
    int spill893_15;
    int spill893_16;
    int spill893_17;
    int spill893_18;
    int spill893_19;
    int spill893_20;
    int spill893_21;
    boolean spill893_22;
    int spill893_23;
    int spill893_24;
    int spill893_25;
    int spill893_26;
    int spill893_27;
    int spill893_28;
    int spill893_29;
    int spill893_30;
    int spill893_31;
    int spill893_32;
    int spill893_33;
    int spill893_34;
    int spill893_35;
    int spill893_36;
    int spill893_37;
    long life2_3;
    int life4_5;
    forward_join_275: {
    forward_join_274: {
    forward_join_273: {
    forward_join_272: {
    forward_join_269: {
    forward_join_265: {
    forward_join_227: {
    forward_join_225: {
    forward_join_222: {
    forward_join_218: {
    forward_join_175: {
    forward_join_173: {
    forward_join_163: {
    forward_join_161: {
    forward_join_158: {
    forward_join_154: {
    forward_join_66: {
    forward_join_64: {
    forward_join_54: {
    forward_join_52: {
    forward_join_49: {
    forward_join_45: {
    forward_join_37: {
    forward_join_35: {
    forward_join_32: {
    forward_join_28: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (com.moon.module.impl.PacketSniffer.w ^ 103135304399617L);
    life4_5 = com.moon.bk.c();
    spill893_0 = ((p0 instanceof moom.zt) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_20_0 = spill893_0;
        break forward_join_20;
    }
    if (!((spill893_0 != 0))) {
        break forward_join_18;
    }
    spill893_1 = ((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.KEEPALIVE)));
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = ((spill893_1) ? 1 : 0);
        break forward_join_273;
    }
    if (!((!spill893_1))) {
        break forward_join_272;
    }
    }
    forwardValue893_20_0 = ((p0 instanceof moom.Aj) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_32_0 = forwardValue893_20_0;
        break forward_join_32;
    }
    if (!((forwardValue893_20_0 == 0))) {
        break forward_join_28;
    }
    spill893_2 = ((p0 instanceof com.moon.hS) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_37_0 = spill893_2;
        break forward_join_37;
    }
    if (!((spill893_2 != 0))) {
        break forward_join_35;
    }
    }
    forwardValue893_32_0 = ((((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.TRANSACTION)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = forwardValue893_32_0;
        break forward_join_273;
    }
    if (!((forwardValue893_32_0 == 0))) {
        break forward_join_272;
    }
    }
    forwardValue893_37_0 = ((p0 instanceof moom.zL) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_49_0 = forwardValue893_37_0;
        break forward_join_49;
    }
    if (!((forwardValue893_37_0 == 0))) {
        break forward_join_45;
    }
    spill893_3 = ((p0 instanceof moom.z9) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_54_0 = spill893_3;
        break forward_join_54;
    }
    if (!((spill893_3 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue893_49_0 = ((((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.VELOCITY)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = forwardValue893_49_0;
        break forward_join_273;
    }
    if (!((forwardValue893_49_0 == 0))) {
        break forward_join_272;
    }
    }
    forwardValue893_54_0 = ((p0 instanceof moom.zB) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_66_0 = forwardValue893_54_0;
        break forward_join_66;
    }
    if (!((forwardValue893_54_0 != 0))) {
        break forward_join_64;
    }
    spill893_4 = ((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.TELEPORT)));
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = ((spill893_4) ? 1 : 0);
        break forward_join_273;
    }
    if (!((!spill893_4))) {
        break forward_join_272;
    }
    }
    forwardValue893_66_0 = ((p0 instanceof moom.zR) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = forwardValue893_66_0;
        break forward_join_158;
    }
    if (!((forwardValue893_66_0 == 0))) {
        break forward_join_154;
    }
    spill893_5 = ((p0 instanceof moom.zN) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_5;
        break forward_join_158;
    }
    if (!((spill893_5 == 0))) {
        break forward_join_154;
    }
    spill893_6 = ((p0 instanceof moom.zS) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_6;
        break forward_join_158;
    }
    if (!((spill893_6 == 0))) {
        break forward_join_154;
    }
    spill893_7 = ((p0 instanceof moom.zF) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_7;
        break forward_join_158;
    }
    if (!((spill893_7 == 0))) {
        break forward_join_154;
    }
    spill893_8 = ((p0 instanceof moom.zH) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_8;
        break forward_join_158;
    }
    if (!((spill893_8 == 0))) {
        break forward_join_154;
    }
    spill893_9 = ((p0 instanceof moom.zI) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_9;
        break forward_join_158;
    }
    if (!((spill893_9 == 0))) {
        break forward_join_154;
    }
    spill893_10 = ((p0 instanceof moom.zJ) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_10;
        break forward_join_158;
    }
    if (!((spill893_10 == 0))) {
        break forward_join_154;
    }
    spill893_11 = ((p0 instanceof moom.zK) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_11;
        break forward_join_158;
    }
    if (!((spill893_11 == 0))) {
        break forward_join_154;
    }
    spill893_12 = ((p0 instanceof moom.zM) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_12;
        break forward_join_158;
    }
    if (!((spill893_12 == 0))) {
        break forward_join_154;
    }
    spill893_13 = ((p0 instanceof moom.zU) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_13;
        break forward_join_158;
    }
    if (!((spill893_13 == 0))) {
        break forward_join_154;
    }
    spill893_14 = ((p0 instanceof moom.zV) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_14;
        break forward_join_158;
    }
    if (!((spill893_14 == 0))) {
        break forward_join_154;
    }
    spill893_15 = ((p0 instanceof moom.zW) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_15;
        break forward_join_158;
    }
    if (!((spill893_15 == 0))) {
        break forward_join_154;
    }
    spill893_16 = ((p0 instanceof moom.zX) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_16;
        break forward_join_158;
    }
    if (!((spill893_16 == 0))) {
        break forward_join_154;
    }
    spill893_17 = ((p0 instanceof moom.zY) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_17;
        break forward_join_158;
    }
    if (!((spill893_17 == 0))) {
        break forward_join_154;
    }
    spill893_18 = ((p0 instanceof moom.zZ) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_18;
        break forward_join_158;
    }
    if (!((spill893_18 == 0))) {
        break forward_join_154;
    }
    spill893_19 = ((p0 instanceof moom.Ad) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_19;
        break forward_join_158;
    }
    if (!((spill893_19 == 0))) {
        break forward_join_154;
    }
    spill893_20 = ((p0 instanceof moom.Am) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_158_0 = spill893_20;
        break forward_join_158;
    }
    if (!((spill893_20 == 0))) {
        break forward_join_154;
    }
    spill893_21 = ((p0 instanceof moom.AK) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_163_0 = spill893_21;
        break forward_join_163;
    }
    if (!((spill893_21 != 0))) {
        break forward_join_161;
    }
    }
    forwardValue893_158_0 = ((((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.ENTITIES)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = forwardValue893_158_0;
        break forward_join_273;
    }
    if (!((forwardValue893_158_0 == 0))) {
        break forward_join_272;
    }
    }
    forwardValue893_163_0 = ((p0 instanceof moom.zT) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_175_0 = forwardValue893_163_0;
        break forward_join_175;
    }
    if (!((forwardValue893_163_0 != 0))) {
        break forward_join_173;
    }
    spill893_22 = ((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.ENTITIES_STATUS)));
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = ((spill893_22) ? 1 : 0);
        break forward_join_273;
    }
    if (!((!spill893_22))) {
        break forward_join_272;
    }
    }
    forwardValue893_175_0 = ((p0 instanceof moom.z1) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = forwardValue893_175_0;
        break forward_join_222;
    }
    if (!((forwardValue893_175_0 == 0))) {
        break forward_join_218;
    }
    spill893_23 = ((p0 instanceof moom.z3) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = spill893_23;
        break forward_join_222;
    }
    if (!((spill893_23 == 0))) {
        break forward_join_218;
    }
    spill893_24 = ((p0 instanceof moom.z5) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = spill893_24;
        break forward_join_222;
    }
    if (!((spill893_24 == 0))) {
        break forward_join_218;
    }
    spill893_25 = ((p0 instanceof moom.z6) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = spill893_25;
        break forward_join_222;
    }
    if (!((spill893_25 == 0))) {
        break forward_join_218;
    }
    spill893_26 = ((p0 instanceof moom.z7) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = spill893_26;
        break forward_join_222;
    }
    if (!((spill893_26 == 0))) {
        break forward_join_218;
    }
    spill893_27 = ((p0 instanceof moom.z8) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = spill893_27;
        break forward_join_222;
    }
    if (!((spill893_27 == 0))) {
        break forward_join_218;
    }
    spill893_28 = ((p0 instanceof moom.Ak) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = spill893_28;
        break forward_join_222;
    }
    if (!((spill893_28 == 0))) {
        break forward_join_218;
    }
    spill893_29 = ((p0 instanceof moom.An) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_222_0 = spill893_29;
        break forward_join_222;
    }
    if (!((spill893_29 == 0))) {
        break forward_join_218;
    }
    spill893_30 = ((p0 instanceof moom.AE) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_227_0 = spill893_30;
        break forward_join_227;
    }
    if (!((spill893_30 != 0))) {
        break forward_join_225;
    }
    }
    forwardValue893_222_0 = ((((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.CHUNK)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = forwardValue893_222_0;
        break forward_join_273;
    }
    if (!((forwardValue893_222_0 == 0))) {
        break forward_join_272;
    }
    }
    forwardValue893_227_0 = ((p0 instanceof moom.Ac) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = forwardValue893_227_0;
        break forward_join_269;
    }
    if (!((forwardValue893_227_0 == 0))) {
        break forward_join_265;
    }
    spill893_31 = ((p0 instanceof moom.Ae) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = spill893_31;
        break forward_join_269;
    }
    if (!((spill893_31 == 0))) {
        break forward_join_265;
    }
    spill893_32 = ((p0 instanceof moom.Af) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = spill893_32;
        break forward_join_269;
    }
    if (!((spill893_32 == 0))) {
        break forward_join_265;
    }
    spill893_33 = ((p0 instanceof moom.Ag) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = spill893_33;
        break forward_join_269;
    }
    if (!((spill893_33 == 0))) {
        break forward_join_265;
    }
    spill893_34 = ((p0 instanceof moom.Ah) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = spill893_34;
        break forward_join_269;
    }
    if (!((spill893_34 == 0))) {
        break forward_join_265;
    }
    spill893_35 = ((p0 instanceof moom.Ai) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = spill893_35;
        break forward_join_269;
    }
    if (!((spill893_35 == 0))) {
        break forward_join_265;
    }
    spill893_36 = ((p0 instanceof moom.As) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = spill893_36;
        break forward_join_269;
    }
    if (!((spill893_36 == 0))) {
        break forward_join_265;
    }
    spill893_37 = ((p0 instanceof moom.zy) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue893_269_0 = spill893_37;
        break forward_join_269;
    }
    if (!((spill893_37 != 0))) {
        break forward_join_274;
    }
    }
    forwardValue893_269_0 = ((((com.moon.setting.MultiSelectSetting)(this.u)).isSelected(((java.lang.Enum)(com.moon.bn.GAME_STATE)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue893_273_0 = forwardValue893_269_0;
        break forward_join_273;
    }
    if (!((forwardValue893_269_0 != 0))) {
        break forward_join_274;
    }
    }
    forwardValue893_273_0 = 1;
    }
    forwardValue893_275_0 = forwardValue893_273_0;
    break forward_join_275;
    }
    forwardValue893_275_0 = 0;
    }
    return ((forwardValue893_275_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_be794b266bca19e7_originalDynamicSite1274_21(com.moon.module.impl.PacketSniffer a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_70(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_86(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_90(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_102(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_106(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_110(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_114(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_118(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_122(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_126(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_130(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_134(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_138(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_142(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_146(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_150(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_154(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_158(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_162(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_166(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_170(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_174(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_178(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_182(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_186(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_190(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_194(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_198(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_202(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_206(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_210(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_214(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_218(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_222(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_226(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite379_230(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2581_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9514b7c99258_invokedynamic892_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9514b7c99258_invokedynamic892_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9514b7c99258_invokedynamic892_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9514b7c99258_invokedynamic892_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9514b7c99258_invokedynamic892_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic891_90(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
