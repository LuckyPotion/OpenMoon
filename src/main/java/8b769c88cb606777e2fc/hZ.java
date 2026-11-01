package com.moon;


public class hZ {

private static final org.tinylog.TaggedLogger a;

private static final org.tinylog.TaggedLogger b;

private final int c;

private final com.moon.b_ d;

private java.lang.String e;

private com.moon.jD f;

private int g;

private int h;

private int i;

private com.moon.h3 j;

private int k;

private static final long l;

private static final java.lang.String[] m;

private static final java.lang.String[] n;

private static final java.util.Map o;

hZ(int p0, com.moon.b_ p1, java.lang.String p2, com.moon.jD p3, int p4, int p5, int p6, com.moon.h3 p7, int p8) {
super();
    this.c = p0;
    this.d = p1;
    this.e = p2;
    this.f = p3;
    this.g = p4;
    this.h = p5;
    this.i = p6;
    this.j = p7;
    this.k = p8;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(1398201989870837092L)), ((long)(8185321567345298052L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(85578695605624L)))));

    long local9_life6 = (com.moon.hZ.l ^ 15634982132405L);

    o = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill196_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill196_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill196_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill196_14 = new byte[8];

    (__sourceSpill196_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill196_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation196_16 = __sourceSpill196_14;

    ((javax.crypto.Cipher)(__sourceSpill196_11)).init(((int)(__sourceSpill196_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill196_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation196_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[8];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "&fÄôd£YýØfí_X\023¢û¦\rÝUq\021\006²A>\n«):Ò§¸O;\025Ér\036*[ÄþSÍ¹\001ì\021\025 s\000ÎW BîN0)\007½BÁ\000ê¹hÉbôèÆ\007\025\tçp®\034²ñó¯Ñ2\033\t¬3y\r*}õmö\026þ:\017ùÀÖO­ÈûÇø\004'j;È¶çñ4Z±{£.\004×!\000ò\013¸«Z+\007\016ã¼ý\004-ó.°\017yÖH\bÁ\002¯³5[_ä\006dª'¶}§1\017ÿø°îöåÀ\004`\016[Ò¾7üw\007ù)½ÈüôÁ\0341 ÝôÝ\004¥ùE;©W´vÒ7Îf¡\0002:«g1X\022ÍYJÅ\023¼qÑbwuÅ\\j\031¹¿\005P©2`}\\·|^\ba\006W'TXÍ'\023S¹8\030\022ú\016Î¬Øß^\021zv+\032Gm|ÁÑ%ÔÜ°M\"É2xøÊJñº\024`'ª\036±(jÎ§£5çàøï¡B]E2x\022ª]K0¿úbÙâxû\003E\0068ºó·íŠ?Fï¡ùß¥MÀm>ìh!©n·M¯Û\022ÔÆ\027\002\004¼¥\004ò2¶\n¯Ä¬íZå¢íËv°ÄòbXâ¡Àúé*\nïÔ\f¥¥\\4©*\007 ¹@îv\030iJ\0255ÄØOup©®\006¼\017ÿ\f(&0·\r`ÇÌ@0\025Ã\037BE,\001¡`Ñ\"ý®£\031@H\177£AÀ`³?-L\023ÒÆoæZcØÚ1BÝ}¶pµ·-=\"5ê/\032î²Üzò\032¹\002UéKÿÕo¶ ã®¸Êûþå\005íT\t6«;èà¬\tS%Îo\027\021V¯gË\0261,^µÊz¡C{bÎ½:\017µ6ÝÍ\fÚÝá6U9GË8I-­f^Üyû\fµ£¤~A4N}ù7±i³Oaè\021r\030\032V\027Fj\016áE\n>dÃJ àSc\007JÙ6tø¼ZÇú)YÆf»\177×.è,ô\004Sý\0316¿6ýÅáá\033Aà\030Ñ¿ì2b\022cEÃx´ÉÊ\033È£\007'ËÀ P-°ºËË&ÊN\031¨\033æôÖMíSJsd¾D ^$\026&ÅþwÐÄKN¿\026\024Pü\006\032\001Ýë|\f8´ú7mwÁ\020ôií_^\005\006ßlÍ\020¹ÊÞ½ú×âÿ)Àt\026.+dðð¯\177ÈåMo%\031ØNA\013¡</okuÏµ8\013§j\177»!Î\021²ó\001\"d¾\031\r-\"\016Q\020ÄS`D aÁí¦¸"))).length();

    int local3_life24 = 240;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill196_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill196_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill196_29)).doFinal(((byte[])(__sourceSpill196_28)));

        java.lang.String __sourceSpill196_34 = ((java.lang.String)(com.moon.hZ.a(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill196_35 = local7_life19;

        int __sourceSpill196_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill196_35)[__sourceSpill196_36] = __sourceSpill196_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "$üAcÚ$T\001åÅJ³\025eÏ¢[ÿÕó6ø\"1\177PÑP9Ü4­Çñ8SÕ¾röñn¨¦ÝÔbq°1DÊ§§5\027\by¿z¨ö-\003\032þ÷¤¨r4\024¶ã\033ê\003¹\025bÅî=¹sÇ¸eØò\027ý\02784±Uô8DäÎ2J·¨\005\017¸~Sötÿ\017»\021Z²\177ëºUç2J­ÐEV'ï}\0211*\017­\025>¼()û_ó\f\022\036\036ÕØËµÖ¢ÅµÊ0¦iû\007±õ\034Ä\023Ãü(*É@a\"\0170ýßiÌ\fÚ)æ#@ªü\026[\036ô\0178\0219\005\f\027×èr_\nÍÁª\025~ìNp¶Fs\004ÊÀ»½£^¢®ÍËÔ¢Öø\fMºéoaªM@òL\022ðöë,Õ\nÃe:kÎ%¨¤®<p/£úkeO2KRÉ®¿ ÆÎ{Þ¥·ù_\035Öï3TÌJ_Òù\tÝ8èçNçâj²úåÓu/Vâ\037Ó²ÀvÝ-Ý½Ç÷\rÏ&2\031ÈÚ\002Æ§ö^´M6\b¸Øü±"))).length();

    local3_life24 = 176;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill196_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill196_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill196_43)).doFinal(((byte[])(__sourceSpill196_42)));

        java.lang.String __sourceSpill196_48 = ((java.lang.String)(com.moon.hZ.a(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill196_49 = local7_life19;

        int __sourceSpill196_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill196_49)[__sourceSpill196_50] = __sourceSpill196_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    m = ((java.lang.String[])(local7_life19));

    n = ((java.lang.String[])(new java.lang.String[8]));

    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite196_55(10679, (5492808019275189723L ^ local9_life6)))))));

    b = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite196_58(16371, (1133607060207672217L ^ local9_life6)))))));
}


public com.moon.hZ b(int p0) {
this.h = ((int)(p0));
    return this;
}


public int b() {
return this.g;
}


public void b__Void() {
org.tinylog.TaggedLogger spill73_0;
    java.lang.String spill73_1;
    java.lang.Object[] spill73_2;
    java.lang.Object[] spill73_3;
    java.lang.Object[] spill73_4;
    org.tinylog.TaggedLogger spill73_5;
    java.lang.String spill73_6;
    java.lang.Object[] spill73_7;
    java.lang.Object[] spill73_8;
    org.tinylog.TaggedLogger spill73_9;
    java.lang.String spill73_10;
    java.lang.Object[] spill73_11;
    java.lang.Object[] spill73_12;
    java.lang.Object[] spill73_13;
    java.lang.Object[] spill73_14;
    java.lang.Object[] spill73_15;
    long life1_3;
    int life3_19;
    forest_join_107: {
    forest_join_70: {
    forest_join_50: {
    forest_join_24: {
    life1_3 = (com.moon.hZ.l ^ 73168559598405L);
    org.lwjgl.opengl.GL20.glVertexAttribPointer(((int)(this.k)), ((int)(this.c)), ((int)(((com.moon.b_)(this.d)).a())), ((boolean)(false)), ((int)(this.h)), ((long)(((long) this.i))));
    life3_19 = org.lwjgl.opengl.GL11.glGetError();
    if (!((life3_19 != 0))) {
        break forest_join_107;
    }
    switch (life3_19) {
case 1281:
{
        break forest_join_24;
    }
case 1280:
{
        break forest_join_50;
    }
case 1282:
{
        break forest_join_70;
    }
default:
{
        break forest_join_107;
    }
}
    }
    spill73_0 = com.moon.hZ.b;
    spill73_1 = __sourceIntrinsic_9bf881b104f5_invokedynamic73_10(395, (3010256836150531088L ^ life1_3));
    java.lang.Object[] __stackOp73_11_0 = new java.lang.Object[3];
    spill73_2 = __stackOp73_11_0;
    (__stackOp73_11_0)[0] = this.e;
    java.lang.Object[] __stackOp73_13_0 = spill73_2;
    spill73_3 = __stackOp73_13_0;
    (__stackOp73_13_0)[1] = this.d;
    java.lang.Object[] __stackOp73_15_0 = spill73_3;
    spill73_4 = __stackOp73_15_0;
    (__stackOp73_15_0)[2] = java.lang.Integer.valueOf(((int)(this.h)));
    ((org.tinylog.TaggedLogger)(spill73_0)).error(((java.lang.String)(spill73_1)), ((java.lang.Object[])(spill73_4)));
    break forest_join_107;
    }
    spill73_5 = com.moon.hZ.b;
    spill73_6 = __sourceIntrinsic_9bf881b104f5_invokedynamic73_20(31919, (2691479088644385073L ^ life1_3));
    java.lang.Object[] __stackOp73_21_0 = new java.lang.Object[2];
    spill73_7 = __stackOp73_21_0;
    (__stackOp73_21_0)[0] = this.e;
    java.lang.Object[] __stackOp73_23_0 = spill73_7;
    spill73_8 = __stackOp73_23_0;
    (__stackOp73_23_0)[1] = this.d;
    ((org.tinylog.TaggedLogger)(spill73_5)).error(((java.lang.String)(spill73_6)), ((java.lang.Object[])(spill73_8)));
    break forest_join_107;
    }
    spill73_9 = com.moon.hZ.b;
    spill73_10 = __sourceIntrinsic_9bf881b104f5_invokedynamic73_27(11256, (6232921607187152480L ^ life1_3));
    java.lang.Object[] __stackOp73_28_0 = new java.lang.Object[5];
    spill73_11 = __stackOp73_28_0;
    (__stackOp73_28_0)[0] = this.e;
    java.lang.Object[] __stackOp73_30_0 = spill73_11;
    spill73_12 = __stackOp73_30_0;
    (__stackOp73_30_0)[1] = java.lang.Integer.valueOf(((int)(this.c)));
    java.lang.Object[] __stackOp73_33_0 = spill73_12;
    spill73_13 = __stackOp73_33_0;
    (__stackOp73_33_0)[2] = this.d;
    java.lang.Object[] __stackOp73_35_0 = spill73_13;
    spill73_14 = __stackOp73_35_0;
    (__stackOp73_35_0)[3] = java.lang.Integer.valueOf(((int)(this.h)));
    java.lang.Object[] __stackOp73_38_0 = spill73_14;
    spill73_15 = __stackOp73_38_0;
    (__stackOp73_38_0)[4] = java.lang.Integer.valueOf(((int)(this.i)));
    ((org.tinylog.TaggedLogger)(spill73_9)).error(((java.lang.String)(spill73_10)), ((java.lang.Object[])(spill73_15)));
    }
    return;
}


public int e() {
return this.k;
}


public int c() {
return this.h;
}


public com.moon.hZ c(int p0) {
this.i = ((int)(p0));
    return this;
}


public int d() {
return this.i;
}


public com.moon.hZ d(int p0) {
this.k = ((int)(p0));
    return this;
}


public com.moon.hZ a(com.moon.h3 p0) {
this.j = ((com.moon.h3)(p0));
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1416_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18290);
    if (((com.moon.hZ.n)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hZ.o)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hZ.o)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hZ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hZ.m)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hZ.n)[life5_8] = com.moon.hZ.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hZ.n)[life5_8];
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
        byte[] spill500_0 = p0;
        life4_9 += 1;
        life5_44 = (spill500_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill500_1 = p0;
        life4_9 += 1;
        life5_76 = (spill500_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill500_2 = p0;
        life4_9 += 1;
        life5_91 = (spill500_2)[life4_9];
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


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
return this.e;
}


public com.moon.b_ a__b_() {
return this.d;
}


public int a() {
return this.c;
}


public static com.moon.h0 a__h0() {
return new com.moon.h0();
}


public void a__Void() {
long life1_3;
    int life3_29;
    life1_3 = (com.moon.hZ.l ^ 137482856684189L);
    if ((this.f == null)) {
        ((org.tinylog.TaggedLogger)(com.moon.hZ.a)).error(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic339_3(7510, (8086182578312657171L ^ life1_3)))));
        return;
    }
    this.k = ((int)(org.lwjgl.opengl.GL20.glGetAttribLocation(((int)(((com.moon.jD)(this.f)).a())), ((java.lang.CharSequence)(this.e)))));
    org.lwjgl.opengl.GL20.glEnableVertexAttribArray(((int)(this.k)));
    life3_29 = org.lwjgl.opengl.GL11.glGetError();
    if ((life3_29 != 0)) {
        ((org.tinylog.TaggedLogger)(com.moon.hZ.a)).error(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic339_14(198, (5664118500227163265L ^ life1_3)))));
        return;
    }
    ((org.tinylog.TaggedLogger)(com.moon.hZ.a)).info(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic339_17(21525, (7124760438911299668L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[] {this.e})));
    return;
}


public com.moon.hZ a(int p0) {
this.g = ((int)(p0));
    return this;
}


public com.moon.hZ a(com.moon.jD p0) {
this.f = ((com.moon.jD)(p0));
    return this;
}


public com.moon.hZ a(java.lang.String p0) {
this.e = ((java.lang.String)(p0));
    return this;
}


public com.moon.h3 a__h3() {
return this.j;
}


public com.moon.jD a__jD() {
return this.f;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite196_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite196_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1416_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic339_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic339_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic339_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic73_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic73_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic73_27(int a0, long a1) throws E;
}
