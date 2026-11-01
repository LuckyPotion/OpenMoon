package com.moon;


public class jU extends com.moon.jN {

private com.moon.j3 c;

private static int[] d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

public jU() { super((java.lang.String)null); }


private static void __sourceConstructorBody_74a769336faefab8(com.moon.jU receiver) throws Throwable {

long local1 = (com.moon.jU.e ^ 75475955453266L);

    com.moon.jU.__sourceConstructorInit_74a769336faefab8_0(((com.moon.jU)(receiver)), ((java.lang.String)(__sourceIntrinsic_74a769336faefab8_originalDynamicSite1094_1(31007, (7228075661675495666L ^ local1)))));

    ((com.moon.jU)(receiver)).c = ((com.moon.j3)(new com.moon.j3()));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(8345115164507265653L)), ((long)(2856229473299189209L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18907839514703L)))));
    int[] __sourceSpill191_6 = new int[5];
    h = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.jU.b(((int[])(__sourceSpill191_6)));
    long local0_life9 = (com.moon.jU.e ^ 55729379988748L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill191_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill191_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill191_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill191_16 = new byte[8];
    (__sourceSpill191_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill191_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation191_18 = __sourceSpill191_16;
    ((javax.crypto.Cipher)(__sourceSpill191_13)).init(((int)(__sourceSpill191_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill191_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation191_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[76];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "Hfìa=²­ûv\037á©Ö&¤wñ<?wÃ(ÂÖtÛà$¬Ð(\003ÃIAõMpÆSê±~û8\034å²ÌÆÇõ\"l\fÀ`>wÚwâTÃf\t sÌ#\034õB\025©tT÷ò±\026^×Í:~ø£4óÚ\022ë5Ï\020=gÔ¸g\001(¶Z­WÁÄ(W\030\003ªì\rÉÚêV\017NkåuCDµ<Mjêí \013;¶}[Ù¹Ðn\022û@f\013Íþ©Rï\026<]ð'ðñ¿\032\030Ä\031\026²@g\b@%!\006\020Fúd¬\034xÇ\0279ø(ÃÍX$ b\001ºA3¥è\033Ü#9,&[÷«\000J\013 dÜÛÝÎþ0¥(d\031ýÄ(W®¢kHWØq!\022\n:C-©¿\031\024ÁüY½p/ð\r\024õ\033jQ\020×(©\030ÕÍS 0ñ8 Lbo\025\027~¯||]í2ý \033ù´xÌWßI\022\007uøUã¾àI\024á>­ÿä7ÿ­Ç\030\\Bxóº\f'\013\0056è»-·ÑîIü1¶ma ÖY\020GQ\033SRù\f¥íó}}¡ÙÖ¯²djÆ[®¢ü{\026 «ñ(Ë1ÔºTRjÙ \002/à­ß\001>Ì\000\016\031ýÝ\032¤ >\031\007Ì¹\026¼e*¯;ÏNèV)²ÁÖQ\0044bP¶©c®sæq î\nh\177³$\005s\023Ì±Ð_,\001\035Ý0\034hO_¹æà©Bô\b\020a\f;¤\032ï6f\r¤BýWN [¯\002 ßÇ®\f\016<³fÖÚq\017¿b'¶I®×F\trî\007V(x#ñÌF\fn\006þÿµ\000Ié* ß³\031¡ZdÚ¯\033x§&hÏÄÇP²XÞ\030Bq¹M\tÜJº ^\002:]ªÕ¹YA\013ÂÎ\020þ\020¯\025¬(mY¸O+LË®\030S{l±õ1²)HÈ/Ô*¸û\003Ã7\f¤fº\030øxÞ\034Ô\013Üåð!âL»Î×²\177\026Íøv(\037ªVc\021ô\025«%°­Ã3ë\0050\000\0377ÇødðXpÏ¼2ÛaSþõ\023(} \036(ýalÛ=\004zñ4h´\032;S5ô3«R¿\037\bÁy\n\030T÷ jn\\H4Ôa7a,;jò\004;ÞE9\024m¾íAàõÉxÎ S\020M/{Bóµ£kuçî¿ô|7ú®wUUÂZàö\017 .}\t-^\034\005GB¼X_·\022 ZSú\017ÛgÓ\006UÌÇ[\032Eÿõ\030ÄÓï\007cÏ¼IZÑ\f£å°Ð¸c[{T\030ò3;³åCx+©c§­DîEÛSrç«½K\030\034\020\rÿÚµ®]£y´WÒÙ2´ÌÍ6\000 £®¹äÊFUrí\004\t}*ú®l´Óøpe¶n\007­g&¢÷ýv\030uÅqSg7H;ªa¬\001,\n¨ø(2Y î(=§A¾(\\\037U¦­íUóx¼£AV·\031w¡ ûj<ñ\037\rg<þ ¶þ\037V;Qýâÿ\033j¨/ +ìRÎ=K÷àëñ\004Öy\020\"º(¡ÒÔ;¾l\020\n|ÿ\026¬=­¡N½Gì¶¢ì®\t²Æ_++\rdBw\030VI½{\030\004ºW\026×Ô3ç'â\002¦\032áõÒ\035À\" aï%½o±\033ûr`¨ÒØjo_²ò°è\001E >^·Ì\030\030<]ùGr~\031X\007\023ìfÿ¤®ïs\020 °\030wÐÃ!½Ó=vÀ´\\#mÛ\007çÇ«v²Ú Z\026Ñ\n¦§¨GúsF[ð\003\177¿[^gÌ\000\"²C\001\032nòð¬\030\n£W}ÄÇ}jb6ý]£\006-|ß¨¸RªvD\030EcÜîq!ø=\r 9Û?IO\036\025(ÁhL\004¸(7ÃµR\024¬¯^È'Oµ\002\\¸ÉÛ#L`qöÍ­Í½(\t\033\004ø°\030âú4yÑÞ?W*äK#$6T{\032*È¢´¾\030&µdVÅ\005â¼ÃéãQ M/¾­#ï\000y¡ ÑÕ¶Ë­\027T=bÉæÒkôxîBe¯²À¯à?'\031\035M\"\020¥yÙ\035C\037·¬ªÕ­<Ìöí A\0275\021]Õß »¸¶(xê0ÀpãvK\023\004úþï¨+éD û<\005êci·-â\000={«$Mó19¬\017mNêM#\030Û1£ðÕcº?©qá\023\036\rZÀ\037+å8,(CõïSÙÔ\"od\016\034ù\bJ\000ç¨É»òdVâriÌ\000â­by¯¶ ¥0Â¿^\023Y² µòï=¦\r´ê\005öÐÎ§]Ô\"ù¯\020Ø´ðÕóT÷Ä=ø\017:7¨á Z_ØCS×Æ}­y:pÂc6« JsÐ#Àü$3uÑCÝ} HEY®jp\rq\036àõoÖ¬q¦¾ìU\b\020\026\037ÞÌyo;çSÇ #-Ö®Øt\177Ä{Gu*0\f\177ý[\020dÆ\b*y!ÇD«(\f\034Û£#w\bEË«ÏzaºJ­È\037·\fcoµ#áé\005[\016>\020/Fö<\021ÿ\013¾ó/\000¿\025W(J\033\037MÚ´­\035\016{À\råeJ-ÏÅ/\035Ïr4\rô$é)«¥¢­@gX\" ·­ùúqõÊ±öøä¤PÜÐ[\000/y¾ï\007îòèR\022W\030 àín±E\n¥K\035°bÌÛÍiÄßo4\n(¦~êgQÓ8xÙ÷<R\034OkÔ\032Âé\020¦ÞKáØI0úð\0166½'0Û\030P@\035\016²Ýà\022?wÎ?ÏR\r þ\003Té ðùåSåqùr\"±h½¨f\021!ÞSjá\004Ma+Åé\030t\006\\¤ç}§FÇC±lvÍù\017°Y ð\034x\f¦\\Mò´\b&|Os*\000\017\025\031\034í|\0204ù¸l\030ÒgFö¹\005N}¡\013WO¹ñ÷¤jT¥y yr\035UÓ\020m_V{£¤\016ù\004&\r22²¥¢?_\025* údÀº¶\"\037Híâ\025bÆ\001Ì|FÚ\037*àCúS©\030ºW \017\027\177^Í¥´D°Ä\f®\004)A\fàC\037Ðãi{\017O¹»\000(ÙjRn\007Ï¢Ô\004Ñt¢\bE¹·5,\033+BùBºÉïë3YÁ÷1#-ä(?{\021¼bîf6\002\007S}»ðßlÁqÍ¹.\003I¼\017£óÙÃýilÁÇÔI ¥íÚWw¬VL\030×Uù\b\033!gÕ¯^gÞ²\b\007RDX"))).length();
    int local5_life26 = 32;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill191_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill191_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill191_31)).doFinal(((byte[])(__sourceSpill191_30)));
        java.lang.String __sourceSpill191_36 = ((java.lang.String)(com.moon.jU.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill191_37 = local9_life21;
        int __sourceSpill191_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill191_37)[__sourceSpill191_38] = __sourceSpill191_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "m\026­>ï\\]¡;zÑ\022[kë´ßÑz-v|Ö\023k\fmg# o\000ûfð\026²¸Uò»x¾¿#Ï~W1å¹d`dlØÇ,"))).length();
    local5_life26 = 32;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill191_43 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill191_44 = local2_life11;
        byte[] local10_life46 = ((javax.crypto.Cipher)(__sourceSpill191_44)).doFinal(((byte[])(__sourceSpill191_43)));
        java.lang.String __sourceSpill191_49 = ((java.lang.String)(com.moon.jU.a(((byte[])(local10_life46))))).intern();
        java.lang.String[] __sourceSpill191_50 = local9_life21;
        int __sourceSpill191_51 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill191_50)[__sourceSpill191_51] = __sourceSpill191_49;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    f = ((java.lang.String[])(local9_life21));
    g = ((java.lang.String[])(new java.lang.String[76]));
}

private static native <E extends Throwable> void __sourceConstructorInit_74a769336faefab8_0(com.moon.jU a0, java.lang.String a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(int[] p0) {
d = ((int[])(p0));
    return;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5713);
    if (((com.moon.jU.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jU.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jU.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jU", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jU.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jU.g)[life5_8] = com.moon.jU.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jU.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1927_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill584_0 = p0;
        life4_9 += 1;
        life5_44 = (spill584_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill584_1 = p0;
        life4_9 += 1;
        life5_76 = (spill584_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill584_2 = p0;
        life4_9 += 1;
        life5_91 = (spill584_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) {
int spill100016_0;
    long life2_3;
    int life4_577;
    forest_join_836: {
    life2_3 = (com.moon.jU.e ^ 130456215740006L);
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_1(2873, (6861687273633227227L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rF(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_3(17857, (6095458284302197L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rQ(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_5(2389, (3891157366187271103L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r1(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_7(15706, (1173326138242799594L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sb(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_9(9875, (2120940970835446896L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sm(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_11(27881, (6203033149818914390L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sq(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_13(7664, (8603466981251987276L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sr(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_15(25638, (3756316016078507754L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.ss(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_17(24775, (1382686079740299889L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.st(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_19(11287, (4510601710410041071L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rG(this))));
    spill100016_0 = com.moon.jN.b();
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_22(19804, (6658489156441761774L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rH(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_24(9796, (2521695838594141352L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rI(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_26(5261, (304985774993391162L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rJ(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_28(215, (5542295309598730798L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rK(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_30(13949, (921054126056021198L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rL(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_32(9052, (8828826655416093095L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rM(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_34(12567, (7778153180844563425L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rN(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_36(23305, (512606481859244513L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rO(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_38(27511, (7588614340215292288L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rP(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_40(9724, (8937816624944025373L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rR(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_42(5061, (6264057371691989248L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rS(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_44(8857, (1893513142246836311L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rT(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_46(19649, (4711529911735477793L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rU(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_48(3326, (1961688327635379739L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rV(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_50(8669, (1321729606841928463L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rW(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_52(9655, (8593668086594867047L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rX(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_54(26951, (1897392331616535468L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rY(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_56(13165, (5004268094432549295L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rZ(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_58(22164, (9047146368623639673L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r0(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_60(7251, (2095191919777789573L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r2(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_62(6105, (4500182098915441968L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r3(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_64(19793, (1167987034616883085L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r4(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_66(8034, (1397372672593245591L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r5(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_68(23951, (2442772875198723919L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r6(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_70(23003, (171165933121368861L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r7(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_72(28514, (2193039799867164115L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r8(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_74(29943, (961275502720245290L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r9(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_76(7443, (1965617207399528429L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.r_(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_78(28128, (1724172979472582451L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sa(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_80(15162, (5201810204935885295L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sc(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_82(28121, (6252611838166026045L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sd(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_84(30936, (790053264745452041L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.se(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_86(32378, (7621429916453295252L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sf(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_88(1412, (7742369214437666686L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sg(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_90(5931, (1541541969827642847L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sh(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_92(5549, (7980087751239647058L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.si(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_94(31715, (3066881634491224413L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sj(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_96(22883, (1663148854390748093L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sk(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_98(14938, (8020749326889226393L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sl(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_100(11478, (7622572701454992932L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sn(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_102(5711, (4877337233943346354L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.so(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_104(29139, (1002448867632143131L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sp(this))));
    life4_577 = spill100016_0;
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_106(13750, (2123800553650626423L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.pU(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_108(20859, (6275191470458993614L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.pV(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_110(28423, (641939022225589728L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qS(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_112(3727, (6163066270891353176L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.pW(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_114(26346, (2536567867982597153L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rm(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_116(15978, (8468693332220581079L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qL(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_118(15626, (2308230536941377516L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.pX(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_120(22291, (5653586778426801611L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.pY(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_122(17121, (7158281689493137466L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.pZ(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_124(29332, (1901016836860237917L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p0(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_126(14133, (6744558631861951969L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p1(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_128(13091, (6787746568075024848L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p2(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_130(23598, (712170081415689962L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p3(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_132(21450, (1368663386427128122L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p4(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_134(2140, (4081251618734219931L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p5(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_136(14691, (4589722775543354286L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p6(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_138(7881, (6994183556333810710L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p7(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_140(8399, (929988006819269171L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rn(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_142(2993, (2228386080035086718L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.ro(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_144(879, (3330197719760939429L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qM(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_146(25635, (4964565443671051980L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p8(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_148(2652, (220094111483863213L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p9(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100016_150(7000, (6394952924167156098L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.p_(this))));
    if (!((life4_577 == 0))) {
        break forest_join_836;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public static int[] a__sourceReturn_d4d28024c9() {
return com.moon.jU.d;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_74a769336faefab8_originalDynamicSite1094_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1927_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_70(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_84(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_86(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_90(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_92(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_96(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_102(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_104(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_106(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_110(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_112(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_114(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_118(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_120(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_122(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_124(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_126(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_128(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_130(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_132(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_134(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_136(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_138(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_140(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_142(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_144(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_146(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_148(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100016_150(int a0, long a1) throws E;
}
