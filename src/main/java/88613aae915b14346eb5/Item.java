package net.minecraft.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Item {

public static moom.DB<moom.DD, net.minecraft.item.Item> a;

private static java.util.Map<net.minecraft.block.Block, net.minecraft.item.Item> b;

protected static java.util.UUID c;

private net.minecraft.creativetab.CreativeTabs d;

protected static java.util.Random e;

protected int f;

private int g;

protected boolean h;

protected boolean i;

private net.minecraft.item.Item j;

private java.lang.String k;

private java.lang.String l;

private static int m;

private static long y;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public Item() { super(); }

private static void __sourceConstructorBody_32bcc6eeb11fdd2e(net.minecraft.item.Item receiver) throws Throwable {
long local1 = (net.minecraft.item.Item.y ^ 38425638351197L);
    net.minecraft.item.Item.__sourceConstructorInit_32bcc6eeb11fdd2e_0(((net.minecraft.item.Item)(receiver)));
    ((net.minecraft.item.Item)(receiver)).f = ((int)(__sourceIntrinsic_32bcc6eeb11fdd2e_originalDynamicSite3914_2(11543, (5376806812287088633L ^ local1))));
    return;
}


static {
y = ((long)(((moom._a)(moom._c.a(((long)(-6942387794740073211L)), ((long)(6138304612954457169L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227810808377051L)))));
    int __sourceSpill1896_6 = 48;
    D = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.item.Item.b__Void(((int)(__sourceSpill1896_6)));
    long local0_life9 = (net.minecraft.item.Item.y ^ 90987118247894L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1896_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1896_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1896_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1896_16 = new byte[8];
    (__sourceSpill1896_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1896_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1896_18 = __sourceSpill1896_16;
    ((javax.crypto.Cipher)(__sourceSpill1896_13)).init(((int)(__sourceSpill1896_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1896_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1896_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[198];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "RÛ\036fé$¤« ý©×.H\036\005¿Ê\000/°¦ÉiÝ.rGÌÌ²ì±ýç¨´\037\030\017\033\035À¡¶kGã\006Óçïª¢\020Ëè)^#\035RÇÛ(Õ/{[É0¼Ml¾\bÊ¬Ï¯$§ó{»Åé¾P8ÚNö¹>á×\025.]ÿÌb\017äô96*P=ÿuEp\035EeC·à\036d\016ó\006Ú\007Sû½x2\n×ü¨0£¼öf\002ÚÝ \030 3lô¥\031I´\003kGUy´AÀ9^J)3\f¯Y¦MðBv\023SMyÈ\021>¶¿fýQºê^à¹\177?n¡»·îÚÚ6Üø¾n§ý ÉÃ`ÜË7\001/Ï¾¦£[ïxLú_Oá3¼¿É^|xÙ©-ÞAäh\\\020ºk6,²åü¤§Þ\031X¥gBF_ê\034ÂWá6mqáÑ |\024ôÏ­K§w\013>-àºröã\tLX\004¥\nÝ¥\036G³:\000BZ0#áñåã\001|yLVÞLk\0069[ÝþO¾\021oI\002k4ÙW_P6¦\005\030.ddýÍW\013N+:\016_éb32%ÞÇà=+õûÀÎÑ>`»¤ù\002Ù3\005ç¯Þ¶ØÑð²Þ<ýú´K©~I\037úl§&wñÖ]q\031Ì¬<;\027e +ÍA>ý£û\031[íd-À\013÷Î6\032¼9Ðº\023érU\025i<¿)æßqY\005ð~kÌ ]¯×ÓiÈ\r¨\021îoÈÜO\017D!²ß\004óò,ýr¥b7Ä®¿µ\n(2\rK\t!_¸Û/Ó\f\033ªpýµ¾Ë\024\"¼\016OX,­9>¥ö?6n\031\035pÊ{¾ViºôÚÔ\034CIÈP`É\034½N\035ÞµárIÙfEÀ\nÚ¨çï£Â+î§åÂ&áTP´`U¤«¢@\022\"ÇV`)ÕéÍfaK.øJS/\033Jv¹\b%Þ¥\032=ïsò¢ô\030ÆRR»lJ3L\034\007!ûâÄóD+¨üAù\016ppI\002)ÍºÅ ¹Í£ª¸\031êUß\001£ã§Lu\032R\t±5B³dG\177¸É{Ì@uÇVpÓ¬Æ\031TÍ_êç^BÎñ­.Éûeê;u\0030m=x0@5Ð³ÆQK¼&W)õ}£EªçÁàdkªÏZó\017&éÕT¦\0075½ÂÞ\031\016TApÏèí6Û\032MÛ¯åì\023=£ó!\006r©\007~©C5ÅW\tòÊìòvµ\"-H+ÝûíN·}ìã\r\006i·\035eYTvÃ*¤. ÖÏ\\Èø#\017Å8¥?wÏÈ2ã\003ròÎ¡Á±UmwÜX³Zã´ýÑ\024è3{\031¯G\031\000ê¶VÅá8\037àüËöÌ=¨ÔBÆZÃNB}ÃDín\\¼\005È \033üJèÔ*»áé\021Ì\036\030-\nÕ*\026Ioññ²-@V+PÉö²!#öRÊh*a±\023«åÑd\003_0`\"\030y=L\036Dª3õ\013.â*D\001ðE~ES@\033ß?Û1ð×Ýø\026\027\002úq!{Är¥\020úv)E_zÔhkl¸#.Ü×wp\0226ê\020$¼^v¡)vNmJ )7a\025­êzáÕ\026v³â¾¶°àØ\t>ØDØy¢^I|ðÐYúb¤OZR¢¾L\\^©\002IÃÙ\016sfÄâ¼\032\031=6éQ7ù4r'¸\037xµÁ+è±è\002\022¬<èD\016Ûä¶ð=RØZùiF¿\000Ø\031\032öÁdl1Å8{Ü8@\177}ÿ2OÉýk\037ýþ°[»VR\n\024ca\017#TV(\f wi¤5>\000c5\034´të\rrúúìL¥^äz\021\003Ó¤D \02515Y:Ï^½Ë>áBÌ\036ßHø\nïåÞµri\n`\tFÄvâ.\bû~½ð¯î\030ê\002ã¤Å¸/±T+û\035xìü\030$ËuÄ\036¢nïFX}åê¾\fÏÕS$xo¼Íê\025£Àµ\177ÖÉ\036ä»×âTdÖ~'2/Ah>÷\025Õ8ê+þ7@Y^\nEø¶ç0ç7ë\000IðL\035bÞ²q\017§{dn%)¯&úÊo»\003xfÎ¾µIM\013aªâ}Ñ÷(\032ñ0ÅµåæIÉ\"àg\007¨ëh°@B;¯ÕÔ\034_\024P¨ÏF£Aª%âT¾~ùÔÉ¿\030\nä«\037IL)ïþ3øòr\177cóöè-'Zg,ó¢Ï\026ì"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1896_27 = local6_life23;
        int __sourceSpill1896_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1896_27)).substring(((int)(__sourceSpill1896_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1896_32 = local8_life21;
        int __sourceSpill1896_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1896_35 = new byte[8];
        (__sourceSpill1896_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1896_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1896_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1896_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1896_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1896_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1896_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1896_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1896_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1896_36)).doFinal(((byte[])(__sourceSpill1896_35)));
        (__sourceSpill1896_32)[__sourceSpill1896_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ªSWNý®Â.bÓt\f[\f"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1896_40 = local6_life23;
        int __sourceSpill1896_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1896_40)).substring(((int)(__sourceSpill1896_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1896_45 = local8_life21;
        int __sourceSpill1896_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1896_48 = new byte[8];
        (__sourceSpill1896_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1896_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1896_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1896_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1896_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1896_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1896_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1896_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1896_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1896_49)).doFinal(((byte[])(__sourceSpill1896_48)));
        (__sourceSpill1896_45)[__sourceSpill1896_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    B = ((long[])(local8_life21));
    C = ((java.lang.Integer[])(new java.lang.Integer[198]));
    a = ((moom.DB)(new moom.DB()));
    b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    c = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)("CB3F55D3-645C-4F38-A497-9C13A33DB5CF")))));
    e = ((java.util.Random)(new java.util.Random()));
}

private static native <E extends Throwable> void __sourceConstructorInit_32bcc6eeb11fdd2e_0(net.minecraft.item.Item a0) throws E;
private static native <E extends Throwable> net.minecraft.item.Item __sourceHandlerCall_5b36eec9bead5fd52f25(java.lang.String a0) throws E;
private static final class __SourceHandler_5b36eec9bead5fd52f25 {

public static net.minecraft.item.Item f255(java.lang.String p0) throws Throwable {
    net.minecraft.item.Item forwardValue255_23_0;
    boolean spill255_0;
    net.minecraft.item.Item spill255_1;
    long life1_3;
    net.minecraft.item.Item life4_12;
    int life3_13;
    forward_join_23: {
    forward_join_22: {
    life1_3 = (__fieldRead255_0() ^ 11380933977337L);
    spill255_0 = __call255_1();
    life4_12 = __cast255_4(__call255_3(__fieldRead255_2(), new moom.DD(p0)));
    life3_13 = __integerCategory255_5(spill255_0);
    spill255_1 = life4_12;
    if (!((life3_13 == 0))) {
        forwardValue255_23_0 = spill255_1;
        break forward_join_23;
    }
    if (!((spill255_1 == null))) {
        break forward_join_22;
    }
    return __call255_7(__call255_6(p0));
    }
    forwardValue255_23_0 = life4_12;
    }
    return forwardValue255_23_0;
}
public static net.minecraft.item.Item h255_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2025500_0(p0);
}
public static net.minecraft.item.Item h255_1(moom.Oo p0) throws Throwable {
    throw __call2025501_0(p0);
}
public static net.minecraft.item.Item h255_2(java.lang.NumberFormatException p0, net.minecraft.item.Item p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native long __fieldRead255_0() throws Throwable;
private static native boolean __call255_1() throws Throwable;
private static native moom.DB __fieldRead255_2() throws Throwable;
private static native java.lang.Object __call255_3(moom.DB a0, moom.DD a1) throws Throwable;
private static native net.minecraft.item.Item __cast255_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory255_5(boolean value) throws Throwable;
private static native int __call255_6(java.lang.String a0) throws Throwable;
private static native net.minecraft.item.Item __call255_7(int a0) throws Throwable;
private static native java.lang.RuntimeException __call2025500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call2025501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_f2cce05cd4611b5688f3(net.minecraft.item.Item a0) throws E;
private static final class __SourceHandler_f2cce05cd4611b5688f3 {

public static int f2870(net.minecraft.item.Item p0) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2870_0() ^ 58272965370008L);
    return ((p0 == null) ? 0 : __call2870_2(__fieldRead2870_1(), p0));
}
public static void h2870_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1287000_0(p0);
}
private static native long __fieldRead2870_0() throws Throwable;
private static native moom.DB __fieldRead2870_1() throws Throwable;
private static native int __call2870_2(moom.DB a0, net.minecraft.item.Item a1) throws Throwable;
private static native java.lang.RuntimeException __call1287000_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.MovingObjectPosition __sourceHandlerCall_5ff46852e86904676ffe(net.minecraft.item.Item a0, net.minecraft.world.World a1, net.minecraft.entity.player.EntityPlayer a2, boolean a3) throws E;
private static final class __SourceHandler_5ff46852e86904676ffe {

public static net.minecraft.util.MovingObjectPosition f683(net.minecraft.item.Item receiver, net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, boolean p2) throws Throwable {
    net.minecraft.world.World forestValue683_95_0;
    moom.DR forestValue683_95_1;
    moom.DR forestValue683_95_2;
    int forestValue683_95_3;
    int forestValue683_95_4;
    net.minecraft.world.World forestValue683_96_0;
    moom.DR forestValue683_96_1;
    moom.DR forestValue683_96_2;
    int forestValue683_96_3;
    net.minecraft.world.World forestValue683_97_0;
    moom.DR forestValue683_97_1;
    moom.DR forestValue683_97_2;
    int forestValue683_97_3;
    int forestValue683_97_4;
    boolean spill683_0;
    net.minecraft.world.World spill683_1;
    moom.DR spill683_2;
    moom.DR spill683_3;
    boolean spill683_4;
    boolean spill683_5;
    long life4_3;
    float life7_6;
    float life8_9;
    double life9_12;
    double life11_19;
    double life13_23;
    moom.DR life15_30;
    float life16_38;
    float life17_46;
    float life18_53;
    float life19_59;
    float life20_63;
    float life21_67;
    double life22_69;
    moom.DR life24_84;
    int life6_85;
    forest_join_97: {
    forest_join_96: {
    forest_join_95: {
    life4_3 = (__fieldRead683_0() ^ 139958177734174L);
    life7_6 = __fieldRead683_1(p1);
    life8_9 = __fieldRead683_2(p1);
    life9_12 = __fieldRead683_3(p1);
    life11_19 = (__fieldRead683_4(p1) + ((double) __call683_5(p1)));
    spill683_0 = __call683_6();
    life13_23 = __fieldRead683_7(p1);
    life15_30 = new moom.DR(life9_12, life11_19, life13_23);
    life16_38 = __call683_8((((-life8_9) * 0x1.1df46ap-6f) - 0x1.921fb6p1f));
    life17_46 = __call683_9((((-life8_9) * 0x1.1df46ap-6f) - 0x1.921fb6p1f));
    life18_53 = (-__call683_10(((-life7_6) * 0x1.1df46ap-6f)));
    life19_59 = __call683_11(((-life7_6) * 0x1.1df46ap-6f));
    life20_63 = (life17_46 * life18_53);
    life21_67 = (life16_38 * life18_53);
    life22_69 = 0x1.4p2d;
    life24_84 = __call683_12(life15_30, (((double) life20_63) * life22_69), (((double) life19_59) * life22_69), (((double) life21_67) * life22_69));
    life6_85 = __integerCategory683_13(spill683_0);
    spill683_1 = p0;
    spill683_2 = life15_30;
    spill683_3 = life24_84;
    spill683_4 = p2;
    spill683_5 = p2;
    if (!((life6_85 != 0))) {
        forestValue683_95_0 = spill683_1;
        forestValue683_95_1 = spill683_2;
        forestValue683_95_2 = spill683_3;
        forestValue683_95_3 = __integerCategory683_14(spill683_4);
        forestValue683_95_4 = __integerCategory683_15(spill683_5);
        break forest_join_95;
    }
    if (!((!spill683_5))) {
        forestValue683_96_0 = spill683_1;
        forestValue683_96_1 = spill683_2;
        forestValue683_96_2 = spill683_3;
        forestValue683_96_3 = __integerCategory683_16(spill683_4);
        break forest_join_96;
    }
    forestValue683_95_0 = spill683_1;
    forestValue683_95_1 = spill683_2;
    forestValue683_95_2 = spill683_3;
    forestValue683_95_3 = __integerCategory683_17(spill683_4);
    forestValue683_95_4 = 1;
    }
    forestValue683_97_0 = forestValue683_95_0;
    forestValue683_97_1 = forestValue683_95_1;
    forestValue683_97_2 = forestValue683_95_2;
    forestValue683_97_3 = forestValue683_95_3;
    forestValue683_97_4 = forestValue683_95_4;
    break forest_join_97;
    }
    forestValue683_97_0 = forestValue683_96_0;
    forestValue683_97_1 = forestValue683_96_1;
    forestValue683_97_2 = forestValue683_96_2;
    forestValue683_97_3 = forestValue683_96_3;
    forestValue683_97_4 = 0;
    }
    return __call683_18(forestValue683_97_0, forestValue683_97_1, forestValue683_97_2, forestValue683_97_3, forestValue683_97_4, 0);
}
public static net.minecraft.util.MovingObjectPosition h683_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3068300_0(p0);
}
private static native long __fieldRead683_0() throws Throwable;
private static native float __fieldRead683_1(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native float __fieldRead683_2(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead683_3(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead683_4(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native float __call683_5(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __call683_6() throws Throwable;
private static native double __fieldRead683_7(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native float __call683_8(float a0) throws Throwable;
private static native float __call683_9(float a0) throws Throwable;
private static native float __call683_10(float a0) throws Throwable;
private static native float __call683_11(float a0) throws Throwable;
private static native moom.DR __call683_12(moom.DR a0, double a1, double a2, double a3) throws Throwable;
private static native int __integerCategory683_13(boolean value) throws Throwable;
private static native int __integerCategory683_14(boolean value) throws Throwable;
private static native int __integerCategory683_15(boolean value) throws Throwable;
private static native int __integerCategory683_16(boolean value) throws Throwable;
private static native int __integerCategory683_17(boolean value) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call683_18(net.minecraft.world.World a0, moom.DR a1, moom.DR a2, int a3, int a4, int a5) throws Throwable;
private static native java.lang.RuntimeException __call3068300_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d3236d9290bd58e0a785(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_d3236d9290bd58e0a785 {

public static boolean f2872(net.minecraft.item.Item receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead2872_0() ^ 1797280828252L);
    return ((__call2872_1(receiver, p0) != null) ? true : false);
}
public static void h2872_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1287200_0(p0);
}
private static native long __fieldRead2872_0() throws Throwable;
private static native java.lang.String __call2872_1(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native java.lang.RuntimeException __call1287200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_5c064ef1e0c8bd002ad9(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_5c064ef1e0c8bd002ad9 {

public static java.lang.String f1600(net.minecraft.item.Item receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    java.lang.String forwardValue1600_17_0;
    java.lang.String forwardValue1600_18_0;
    boolean spill1600_0;
    java.lang.String spill1600_1;
    long life2_3;
    java.lang.String life5_8;
    int life4_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (__fieldRead1600_0() ^ 53933654198124L);
    spill1600_0 = __call1600_1();
    life5_8 = __call1600_2(receiver, p0);
    life4_9 = __integerCategory1600_3(spill1600_0);
    spill1600_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1600_17_0 = spill1600_1;
        break forward_join_17;
    }
    if (!((spill1600_1 == null))) {
        break forward_join_16;
    }
    forwardValue1600_18_0 = "";
    break forward_join_18;
    }
    forwardValue1600_17_0 = life5_8;
    }
    forwardValue1600_18_0 = __call1600_4(forwardValue1600_17_0);
    }
    return forwardValue1600_18_0;
}
public static void h1600_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160000_0(p0);
}
public static void h1600_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160001_0(p0);
}
private static native long __fieldRead1600_0() throws Throwable;
private static native boolean __call1600_1() throws Throwable;
private static native java.lang.String __call1600_2(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory1600_3(boolean value) throws Throwable;
private static native java.lang.String __call1600_4(java.lang.String a0) throws Throwable;
private static native java.lang.RuntimeException __call1160000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call1160001_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_674645d5150aab628536() throws E;
private static final class __SourceHandler_674645d5150aab628536 {

public static void f684() throws Throwable {
    net.minecraft.block.Block spill684_0;
    moom.w0 spill684_1;
    moom.dC spill684_2;
    moom.wX spill684_3;
    net.minecraft.block.Block spill684_4;
    moom.w0 spill684_5;
    net.minecraft.block.Block spill684_6;
    moom.w0 spill684_7;
    net.minecraft.block.Block spill684_8;
    moom.w0 spill684_9;
    moom.dx spill684_10;
    moom.w0 spill684_11;
    net.minecraft.block.Block spill684_12;
    moom.w0 spill684_13;
    net.minecraft.block.Block spill684_14;
    moom.w0 spill684_15;
    moom.dH spill684_16;
    moom.wZ spill684_17;
    moom.dH spill684_18;
    moom.wZ spill684_19;
    net.minecraft.block.Block spill684_20;
    moom.w0 spill684_21;
    net.minecraft.block.Block spill684_22;
    moom.w0 spill684_23;
    net.minecraft.block.BlockPistonBase spill684_24;
    moom.w3 spill684_25;
    moom.cI spill684_26;
    moom.wX spill684_27;
    java.lang.String[] spill684_28;
    java.lang.String[] spill684_29;
    java.lang.String[] spill684_30;
    net.minecraft.block.BlockPistonBase spill684_31;
    moom.w3 spill684_32;
    net.minecraft.block.Block spill684_33;
    moom.wW spill684_34;
    moom.cA spill684_35;
    moom.w0 spill684_36;
    moom.cA spill684_37;
    moom.w0 spill684_38;
    moom.ei spill684_39;
    moom.w4 spill684_40;
    net.minecraft.block.Block spill684_41;
    moom.w5 spill684_42;
    boolean spill684_43;
    net.minecraft.block.Block spill684_44;
    moom.w0 spill684_45;
    net.minecraft.block.Block spill684_46;
    moom.w0 spill684_47;
    net.minecraft.block.Block spill684_48;
    moom.wX spill684_49;
    net.minecraft.block.Block spill684_50;
    moom.wY spill684_51;
    moom.ei spill684_52;
    moom.w4 spill684_53;
    net.minecraft.block.Block spill684_54;
    moom.w0 spill684_55;
    net.minecraft.block.Block spill684_56;
    net.minecraft.item.ItemAnvilBlock spill684_57;
    net.minecraft.block.Block spill684_58;
    moom.w0 spill684_59;
    moom.w0 spill684_60;
    net.minecraft.block.Block spill684_61;
    net.minecraft.block.Block spill684_62;
    java.lang.String[] spill684_63;
    java.lang.String[] spill684_64;
    java.lang.String[] spill684_65;
    net.minecraft.block.Block spill684_66;
    moom.wW spill684_67;
    net.minecraft.block.Block spill684_68;
    moom.wW spill684_69;
    moom.cz spill684_70;
    moom.w2 spill684_71;
    moom.ct spill684_72;
    moom.wW spill684_73;
    moom.dW spill684_74;
    moom.wW spill684_75;
    net.minecraft.block.Block spill684_76;
    moom.w0 spill684_77;
    net.minecraft.block.Block spill684_78;
    moom.w0 spill684_79;
    moom.ei spill684_80;
    moom.w4 spill684_81;
    int spill684_82;
    java.lang.String spill684_83;
    moom.xT spill684_84;
    int spill684_85;
    java.lang.String spill684_86;
    moom.xS spill684_87;
    int spill684_88;
    java.lang.String spill684_89;
    moom.xR spill684_90;
    int spill684_91;
    java.lang.String spill684_92;
    moom.xo spill684_93;
    int spill684_94;
    java.lang.String spill684_95;
    moom.xp spill684_96;
    int spill684_97;
    java.lang.String spill684_98;
    net.minecraft.item.ItemBow spill684_99;
    int spill684_100;
    java.lang.String spill684_101;
    net.minecraft.item.Item spill684_102;
    int spill684_103;
    java.lang.String spill684_104;
    moom.xb spill684_105;
    int spill684_106;
    java.lang.String spill684_107;
    net.minecraft.item.Item spill684_108;
    int spill684_109;
    java.lang.String spill684_110;
    net.minecraft.item.Item spill684_111;
    int spill684_112;
    java.lang.String spill684_113;
    net.minecraft.item.Item spill684_114;
    int spill684_115;
    java.lang.String spill684_116;
    moom.xP spill684_117;
    int spill684_118;
    java.lang.String spill684_119;
    moom.xP spill684_120;
    int spill684_121;
    java.lang.String spill684_122;
    moom.xT spill684_123;
    int spill684_124;
    java.lang.String spill684_125;
    moom.xS spill684_126;
    int spill684_127;
    java.lang.String spill684_128;
    moom.xR spill684_129;
    int spill684_130;
    java.lang.String spill684_131;
    moom.xP spill684_132;
    int spill684_133;
    java.lang.String spill684_134;
    moom.xT spill684_135;
    int spill684_136;
    java.lang.String spill684_137;
    moom.xS spill684_138;
    int spill684_139;
    java.lang.String spill684_140;
    moom.xR spill684_141;
    int spill684_142;
    java.lang.String spill684_143;
    moom.xP spill684_144;
    int spill684_145;
    java.lang.String spill684_146;
    moom.xT spill684_147;
    int spill684_148;
    java.lang.String spill684_149;
    moom.xS spill684_150;
    int spill684_151;
    java.lang.String spill684_152;
    moom.xR spill684_153;
    int spill684_154;
    java.lang.String spill684_155;
    net.minecraft.item.Item spill684_156;
    int spill684_157;
    java.lang.String spill684_158;
    net.minecraft.item.Item spill684_159;
    int spill684_160;
    java.lang.String spill684_161;
    moom.xt spill684_162;
    int spill684_163;
    java.lang.String spill684_164;
    moom.xP spill684_165;
    int spill684_166;
    java.lang.String spill684_167;
    moom.xT spill684_168;
    int spill684_169;
    java.lang.String spill684_170;
    moom.xS spill684_171;
    int spill684_172;
    java.lang.String spill684_173;
    moom.xR spill684_174;
    int spill684_175;
    java.lang.String spill684_176;
    moom.xH spill684_177;
    int spill684_178;
    java.lang.String spill684_179;
    net.minecraft.item.Item spill684_180;
    int spill684_181;
    java.lang.String spill684_182;
    net.minecraft.item.Item spill684_183;
    int spill684_184;
    java.lang.String spill684_185;
    moom.xw spill684_186;
    int spill684_187;
    java.lang.String spill684_188;
    moom.xw spill684_189;
    int spill684_190;
    java.lang.String spill684_191;
    moom.xw spill684_192;
    int spill684_193;
    java.lang.String spill684_194;
    moom.xw spill684_195;
    int spill684_196;
    java.lang.String spill684_197;
    moom.xw spill684_198;
    int spill684_199;
    java.lang.String spill684_200;
    moom.xJ spill684_201;
    int spill684_202;
    java.lang.String spill684_203;
    net.minecraft.item.Item spill684_204;
    int spill684_205;
    java.lang.String spill684_206;
    moom.xp spill684_207;
    int spill684_208;
    java.lang.String spill684_209;
    net.minecraft.item.ItemArmor spill684_210;
    int spill684_211;
    java.lang.String spill684_212;
    net.minecraft.item.ItemArmor spill684_213;
    int spill684_214;
    java.lang.String spill684_215;
    net.minecraft.item.ItemArmor spill684_216;
    int spill684_217;
    java.lang.String spill684_218;
    net.minecraft.item.ItemArmor spill684_219;
    int spill684_220;
    java.lang.String spill684_221;
    net.minecraft.item.ItemArmor spill684_222;
    int spill684_223;
    java.lang.String spill684_224;
    net.minecraft.item.ItemArmor spill684_225;
    int spill684_226;
    java.lang.String spill684_227;
    net.minecraft.item.ItemArmor spill684_228;
    int spill684_229;
    java.lang.String spill684_230;
    net.minecraft.item.ItemArmor spill684_231;
    int spill684_232;
    java.lang.String spill684_233;
    net.minecraft.item.ItemArmor spill684_234;
    int spill684_235;
    java.lang.String spill684_236;
    net.minecraft.item.ItemArmor spill684_237;
    int spill684_238;
    java.lang.String spill684_239;
    net.minecraft.item.ItemArmor spill684_240;
    int spill684_241;
    java.lang.String spill684_242;
    net.minecraft.item.ItemArmor spill684_243;
    int spill684_244;
    java.lang.String spill684_245;
    net.minecraft.item.ItemArmor spill684_246;
    int spill684_247;
    java.lang.String spill684_248;
    net.minecraft.item.ItemArmor spill684_249;
    int spill684_250;
    java.lang.String spill684_251;
    net.minecraft.item.ItemArmor spill684_252;
    int spill684_253;
    java.lang.String spill684_254;
    net.minecraft.item.ItemArmor spill684_255;
    int spill684_256;
    java.lang.String spill684_257;
    net.minecraft.item.ItemArmor spill684_258;
    int spill684_259;
    java.lang.String spill684_260;
    net.minecraft.item.ItemArmor spill684_261;
    int spill684_262;
    java.lang.String spill684_263;
    net.minecraft.item.ItemArmor spill684_264;
    int spill684_265;
    java.lang.String spill684_266;
    net.minecraft.item.ItemArmor spill684_267;
    int spill684_268;
    java.lang.String spill684_269;
    net.minecraft.item.Item spill684_270;
    int spill684_271;
    java.lang.String spill684_272;
    moom.xp spill684_273;
    int spill684_274;
    java.lang.String spill684_275;
    moom.xp spill684_276;
    int spill684_277;
    java.lang.String spill684_278;
    moom.xv spill684_279;
    int spill684_280;
    java.lang.String spill684_281;
    moom.xq spill684_282;
    int spill684_283;
    java.lang.String spill684_284;
    moom.xL spill684_285;
    int spill684_286;
    java.lang.String spill684_287;
    moom.xc spill684_288;
    moom.w9 spill684_289;
    int spill684_290;
    java.lang.String spill684_291;
    moom.w9 spill684_292;
    int spill684_293;
    java.lang.String spill684_294;
    moom.w9 spill684_295;
    int spill684_296;
    java.lang.String spill684_297;
    moom.xB spill684_298;
    int spill684_299;
    java.lang.String spill684_300;
    moom.xI spill684_301;
    int spill684_302;
    java.lang.String spill684_303;
    moom.xc spill684_304;
    int spill684_305;
    java.lang.String spill684_306;
    moom.xG spill684_307;
    int spill684_308;
    java.lang.String spill684_309;
    moom.xO spill684_310;
    int spill684_311;
    java.lang.String spill684_312;
    moom.w6 spill684_313;
    int spill684_314;
    java.lang.String spill684_315;
    net.minecraft.item.Item spill684_316;
    int spill684_317;
    java.lang.String spill684_318;
    moom.w_ spill684_319;
    int spill684_320;
    java.lang.String spill684_321;
    net.minecraft.item.Item spill684_322;
    int spill684_323;
    java.lang.String spill684_324;
    net.minecraft.item.Item spill684_325;
    int spill684_326;
    java.lang.String spill684_327;
    moom.xH spill684_328;
    int spill684_329;
    java.lang.String spill684_330;
    net.minecraft.item.Item spill684_331;
    int spill684_332;
    java.lang.String spill684_333;
    moom.w7 spill684_334;
    int spill684_335;
    java.lang.String spill684_336;
    net.minecraft.item.Item spill684_337;
    int spill684_338;
    java.lang.String spill684_339;
    moom.xB spill684_340;
    int spill684_341;
    java.lang.String spill684_342;
    moom.xB spill684_343;
    int spill684_344;
    java.lang.String spill684_345;
    moom.xf spill684_346;
    int spill684_347;
    java.lang.String spill684_348;
    net.minecraft.item.Item spill684_349;
    int spill684_350;
    java.lang.String spill684_351;
    moom.xn spill684_352;
    int spill684_353;
    java.lang.String spill684_354;
    net.minecraft.item.Item spill684_355;
    int spill684_356;
    java.lang.String spill684_357;
    net.minecraft.item.Item spill684_358;
    int spill684_359;
    java.lang.String spill684_360;
    moom.xr spill684_361;
    int spill684_362;
    java.lang.String spill684_363;
    moom.xr spill684_364;
    int spill684_365;
    java.lang.String spill684_366;
    moom.xd spill684_367;
    int spill684_368;
    java.lang.String spill684_369;
    net.minecraft.item.Item spill684_370;
    int spill684_371;
    java.lang.String spill684_372;
    net.minecraft.item.Item spill684_373;
    int spill684_374;
    java.lang.String spill684_375;
    moom.xH spill684_376;
    int spill684_377;
    java.lang.String spill684_378;
    moom.wT spill684_379;
    int spill684_380;
    java.lang.String spill684_381;
    moom.xH spill684_382;
    int spill684_383;
    java.lang.String spill684_384;
    moom.xp spill684_385;
    int spill684_386;
    java.lang.String spill684_387;
    moom.xA spill684_388;
    int spill684_389;
    java.lang.String spill684_390;
    moom.xK spill684_391;
    int spill684_392;
    java.lang.String spill684_393;
    moom.xp spill684_394;
    int spill684_395;
    java.lang.String spill684_396;
    moom.xJ spill684_397;
    int spill684_398;
    java.lang.String spill684_399;
    moom.xJ spill684_400;
    int spill684_401;
    java.lang.String spill684_402;
    moom.xp spill684_403;
    int spill684_404;
    java.lang.String spill684_405;
    moom.xp spill684_406;
    int spill684_407;
    java.lang.String spill684_408;
    moom.xp spill684_409;
    int spill684_410;
    java.lang.String spill684_411;
    moom.xp spill684_412;
    int spill684_413;
    java.lang.String spill684_414;
    moom.xp spill684_415;
    int spill684_416;
    java.lang.String spill684_417;
    moom.xi spill684_418;
    int spill684_419;
    java.lang.String spill684_420;
    net.minecraft.item.Item spill684_421;
    int spill684_422;
    java.lang.String spill684_423;
    net.minecraft.item.Item spill684_424;
    int spill684_425;
    java.lang.String spill684_426;
    net.minecraft.item.Item spill684_427;
    int spill684_428;
    java.lang.String spill684_429;
    moom.xJ spill684_430;
    int spill684_431;
    java.lang.String spill684_432;
    net.minecraft.item.ItemPotion spill684_433;
    int spill684_434;
    java.lang.String spill684_435;
    moom.xu spill684_436;
    int spill684_437;
    java.lang.String spill684_438;
    moom.xp spill684_439;
    int spill684_440;
    java.lang.String spill684_441;
    net.minecraft.item.Item spill684_442;
    int spill684_443;
    java.lang.String spill684_444;
    net.minecraft.item.Item spill684_445;
    int spill684_446;
    java.lang.String spill684_447;
    net.minecraft.item.Item spill684_448;
    int spill684_449;
    java.lang.String spill684_450;
    moom.xH spill684_451;
    int spill684_452;
    java.lang.String spill684_453;
    moom.xH spill684_454;
    int spill684_455;
    java.lang.String spill684_456;
    moom.xh spill684_457;
    int spill684_458;
    java.lang.String spill684_459;
    net.minecraft.item.Item spill684_460;
    int spill684_461;
    java.lang.String spill684_462;
    moom.xC spill684_463;
    int spill684_464;
    java.lang.String spill684_465;
    moom.xj spill684_466;
    int spill684_467;
    java.lang.String spill684_468;
    moom.xk spill684_469;
    int spill684_470;
    java.lang.String spill684_471;
    moom.xU spill684_472;
    int spill684_473;
    java.lang.String spill684_474;
    moom.xe spill684_475;
    int spill684_476;
    java.lang.String spill684_477;
    net.minecraft.item.Item spill684_478;
    int spill684_479;
    java.lang.String spill684_480;
    moom.xv spill684_481;
    int spill684_482;
    java.lang.String spill684_483;
    moom.xH spill684_484;
    int spill684_485;
    java.lang.String spill684_486;
    moom.xs spill684_487;
    int spill684_488;
    java.lang.String spill684_489;
    moom.xs spill684_490;
    int spill684_491;
    java.lang.String spill684_492;
    moom.xp spill684_493;
    int spill684_494;
    java.lang.String spill684_495;
    moom.xp spill684_496;
    int spill684_497;
    java.lang.String spill684_498;
    moom.xz spill684_499;
    int spill684_500;
    java.lang.String spill684_501;
    moom.xp spill684_502;
    int spill684_503;
    java.lang.String spill684_504;
    net.minecraft.item.ItemSkull spill684_505;
    int spill684_506;
    java.lang.String spill684_507;
    moom.xa spill684_508;
    int spill684_509;
    java.lang.String spill684_510;
    net.minecraft.item.ItemSimpleFoiled spill684_511;
    int spill684_512;
    java.lang.String spill684_513;
    moom.xp spill684_514;
    int spill684_515;
    java.lang.String spill684_516;
    moom.xl spill684_517;
    int spill684_518;
    java.lang.String spill684_519;
    moom.xm spill684_520;
    int spill684_521;
    java.lang.String spill684_522;
    moom.xg spill684_523;
    int spill684_524;
    java.lang.String spill684_525;
    moom.xH spill684_526;
    int spill684_527;
    java.lang.String spill684_528;
    net.minecraft.item.Item spill684_529;
    int spill684_530;
    java.lang.String spill684_531;
    net.minecraft.item.Item spill684_532;
    int spill684_533;
    java.lang.String spill684_534;
    moom.xB spill684_535;
    int spill684_536;
    java.lang.String spill684_537;
    moom.xB spill684_538;
    int spill684_539;
    java.lang.String spill684_540;
    net.minecraft.item.Item spill684_541;
    int spill684_542;
    java.lang.String spill684_543;
    net.minecraft.item.Item spill684_544;
    int spill684_545;
    java.lang.String spill684_546;
    moom.xp spill684_547;
    int spill684_548;
    java.lang.String spill684_549;
    moom.xp spill684_550;
    int spill684_551;
    java.lang.String spill684_552;
    moom.xt spill684_553;
    int spill684_554;
    java.lang.String spill684_555;
    net.minecraft.item.Item spill684_556;
    int spill684_557;
    java.lang.String spill684_558;
    net.minecraft.item.Item spill684_559;
    int spill684_560;
    java.lang.String spill684_561;
    moom.wS spill684_562;
    int spill684_563;
    java.lang.String spill684_564;
    net.minecraft.item.Item spill684_565;
    int spill684_566;
    java.lang.String spill684_567;
    net.minecraft.item.Item spill684_568;
    int spill684_569;
    java.lang.String spill684_570;
    net.minecraft.item.Item spill684_571;
    int spill684_572;
    java.lang.String spill684_573;
    moom.xx spill684_574;
    int spill684_575;
    java.lang.String spill684_576;
    moom.xD spill684_577;
    int spill684_578;
    java.lang.String spill684_579;
    moom.xB spill684_580;
    int spill684_581;
    java.lang.String spill684_582;
    moom.xp spill684_583;
    int spill684_584;
    java.lang.String spill684_585;
    moom.xp spill684_586;
    int spill684_587;
    java.lang.String spill684_588;
    moom.wV spill684_589;
    int spill684_590;
    java.lang.String spill684_591;
    moom.xc spill684_592;
    int spill684_593;
    java.lang.String spill684_594;
    moom.xc spill684_595;
    int spill684_596;
    java.lang.String spill684_597;
    moom.xc spill684_598;
    int spill684_599;
    java.lang.String spill684_600;
    moom.xc spill684_601;
    int spill684_602;
    java.lang.String spill684_603;
    moom.xc spill684_604;
    int spill684_605;
    java.lang.String spill684_606;
    moom.xF spill684_607;
    int spill684_608;
    java.lang.String spill684_609;
    moom.xF spill684_610;
    int spill684_611;
    java.lang.String spill684_612;
    moom.xF spill684_613;
    int spill684_614;
    java.lang.String spill684_615;
    moom.xF spill684_616;
    int spill684_617;
    java.lang.String spill684_618;
    moom.xF spill684_619;
    int spill684_620;
    java.lang.String spill684_621;
    moom.xF spill684_622;
    int spill684_623;
    java.lang.String spill684_624;
    moom.xF spill684_625;
    int spill684_626;
    java.lang.String spill684_627;
    moom.xF spill684_628;
    int spill684_629;
    java.lang.String spill684_630;
    moom.xF spill684_631;
    int spill684_632;
    java.lang.String spill684_633;
    moom.xF spill684_634;
    int spill684_635;
    java.lang.String spill684_636;
    moom.xF spill684_637;
    int spill684_638;
    java.lang.String spill684_639;
    moom.xF spill684_640;
    long life0_3;
    int life2_1326;
    net.minecraft.item.Item life3_1567;
    forest_join_3282: {
    life0_3 = (__fieldRead684_0() ^ 87206567074729L);
    spill684_0 = __fieldRead684_1();
    moom.w0 __stackOp684_3_0 = __sourceUninitializedNEW684_2();
    spill684_1 = __stackOp684_3_0;
    __explicitNewInit684_7(__stackOp684_3_0, __fieldRead684_4(), __fieldRead684_5(), __invokedynamic684_6());
    __call684_9(spill684_0, __call684_8(spill684_1, "stone"));
    spill684_2 = __fieldRead684_10();
    moom.wX __stackOp684_12_0 = __sourceUninitializedNEW684_11();
    spill684_3 = __stackOp684_12_0;
    __explicitNewInit684_14(__stackOp684_12_0, __fieldRead684_13(), false);
    __call684_15(spill684_2, spill684_3);
    spill684_4 = __fieldRead684_16();
    moom.w0 __stackOp684_18_0 = __sourceUninitializedNEW684_17();
    spill684_5 = __stackOp684_18_0;
    __explicitNewInit684_22(__stackOp684_18_0, __fieldRead684_19(), __fieldRead684_20(), __invokedynamic684_21());
    __call684_24(spill684_4, __call684_23(spill684_5, "dirt"));
    __call684_26(__fieldRead684_25());
    spill684_6 = __fieldRead684_27();
    moom.w0 __stackOp684_29_0 = __sourceUninitializedNEW684_28();
    spill684_7 = __stackOp684_29_0;
    __explicitNewInit684_33(__stackOp684_29_0, __fieldRead684_30(), __fieldRead684_31(), __invokedynamic684_32());
    __call684_35(spill684_6, __call684_34(spill684_7, "wood"));
    spill684_8 = __fieldRead684_36();
    moom.w0 __stackOp684_38_0 = __sourceUninitializedNEW684_37();
    spill684_9 = __stackOp684_38_0;
    __explicitNewInit684_42(__stackOp684_38_0, __fieldRead684_39(), __fieldRead684_40(), __invokedynamic684_41());
    __call684_44(spill684_8, __call684_43(spill684_9, "sapling"));
    __call684_46(__fieldRead684_45());
    spill684_10 = __fieldRead684_47();
    moom.w0 __stackOp684_49_0 = __sourceUninitializedNEW684_48();
    spill684_11 = __stackOp684_49_0;
    __explicitNewInit684_53(__stackOp684_49_0, __fieldRead684_50(), __fieldRead684_51(), __invokedynamic684_52());
    __call684_55(spill684_10, __call684_54(spill684_11, "sand"));
    __call684_57(__fieldRead684_56());
    __call684_59(__fieldRead684_58());
    __call684_61(__fieldRead684_60());
    __call684_63(__fieldRead684_62());
    spill684_12 = __fieldRead684_64();
    moom.w0 __stackOp684_66_0 = __sourceUninitializedNEW684_65();
    spill684_13 = __stackOp684_66_0;
    __explicitNewInit684_70(__stackOp684_66_0, __fieldRead684_67(), __fieldRead684_68(), __invokedynamic684_69());
    __call684_72(spill684_12, __call684_71(spill684_13, "log"));
    spill684_14 = __fieldRead684_73();
    moom.w0 __stackOp684_75_0 = __sourceUninitializedNEW684_74();
    spill684_15 = __stackOp684_75_0;
    __explicitNewInit684_79(__stackOp684_75_0, __fieldRead684_76(), __fieldRead684_77(), __invokedynamic684_78());
    __call684_81(spill684_14, __call684_80(spill684_15, "log"));
    spill684_16 = __fieldRead684_82();
    moom.wZ __stackOp684_84_0 = __sourceUninitializedNEW684_83();
    spill684_17 = __stackOp684_84_0;
    __explicitNewInit684_86(__stackOp684_84_0, __fieldRead684_85());
    __call684_88(spill684_16, __call684_87(spill684_17, "leaves"));
    spill684_18 = __fieldRead684_89();
    moom.wZ __stackOp684_91_0 = __sourceUninitializedNEW684_90();
    spill684_19 = __stackOp684_91_0;
    __explicitNewInit684_93(__stackOp684_91_0, __fieldRead684_92());
    __call684_95(spill684_18, __call684_94(spill684_19, "leaves"));
    spill684_20 = __fieldRead684_96();
    moom.w0 __stackOp684_98_0 = __sourceUninitializedNEW684_97();
    spill684_21 = __stackOp684_98_0;
    __explicitNewInit684_102(__stackOp684_98_0, __fieldRead684_99(), __fieldRead684_100(), __invokedynamic684_101());
    __call684_104(spill684_20, __call684_103(spill684_21, "sponge"));
    __call684_106(__fieldRead684_105());
    __call684_108(__fieldRead684_107());
    __call684_110(__fieldRead684_109());
    __call684_112(__fieldRead684_111());
    spill684_22 = __fieldRead684_113();
    moom.w0 __stackOp684_115_0 = __sourceUninitializedNEW684_114();
    spill684_23 = __stackOp684_115_0;
    __explicitNewInit684_119(__stackOp684_115_0, __fieldRead684_116(), __fieldRead684_117(), __invokedynamic684_118());
    __call684_121(spill684_22, __call684_120(spill684_23, "sandStone"));
    __call684_123(__fieldRead684_122());
    __call684_125(__fieldRead684_124());
    __call684_127(__fieldRead684_126());
    spill684_24 = __fieldRead684_128();
    moom.w3 __stackOp684_130_0 = __sourceUninitializedNEW684_129();
    spill684_25 = __stackOp684_130_0;
    __explicitNewInit684_132(__stackOp684_130_0, __fieldRead684_131());
    __call684_133(spill684_24, spill684_25);
    __call684_135(__fieldRead684_134());
    spill684_26 = __fieldRead684_136();
    moom.wX __stackOp684_138_0 = __sourceUninitializedNEW684_137();
    spill684_27 = __stackOp684_138_0;
    __explicitNewInit684_140(__stackOp684_138_0, __fieldRead684_139(), true);
    java.lang.String[] __stackOp684_141_0 = new java.lang.String[3];
    spill684_28 = __stackOp684_141_0;
    (__stackOp684_141_0)[0] = "shrub";
    java.lang.String[] __stackOp684_142_0 = spill684_28;
    spill684_29 = __stackOp684_142_0;
    (__stackOp684_142_0)[1] = "grass";
    java.lang.String[] __stackOp684_143_0 = spill684_29;
    spill684_30 = __stackOp684_143_0;
    (__stackOp684_143_0)[2] = "fern";
    __call684_145(spill684_26, __call684_144(spill684_27, spill684_30));
    __call684_147(__fieldRead684_146());
    spill684_31 = __fieldRead684_148();
    moom.w3 __stackOp684_150_0 = __sourceUninitializedNEW684_149();
    spill684_32 = __stackOp684_150_0;
    __explicitNewInit684_152(__stackOp684_150_0, __fieldRead684_151());
    __call684_153(spill684_31, spill684_32);
    spill684_33 = __fieldRead684_154();
    moom.wW __stackOp684_156_0 = __sourceUninitializedNEW684_155();
    spill684_34 = __stackOp684_156_0;
    __explicitNewInit684_158(__stackOp684_156_0, __fieldRead684_157());
    __call684_160(spill684_33, __call684_159(spill684_34, "cloth"));
    spill684_35 = __fieldRead684_161();
    moom.w0 __stackOp684_163_0 = __sourceUninitializedNEW684_162();
    spill684_36 = __stackOp684_163_0;
    __explicitNewInit684_167(__stackOp684_163_0, __fieldRead684_164(), __fieldRead684_165(), __invokedynamic684_166());
    __call684_169(spill684_35, __call684_168(spill684_36, "flower"));
    spill684_37 = __fieldRead684_170();
    moom.w0 __stackOp684_172_0 = __sourceUninitializedNEW684_171();
    spill684_38 = __stackOp684_172_0;
    __explicitNewInit684_176(__stackOp684_172_0, __fieldRead684_173(), __fieldRead684_174(), __invokedynamic684_175());
    __call684_178(spill684_37, __call684_177(spill684_38, "rose"));
    __call684_180(__fieldRead684_179());
    __call684_182(__fieldRead684_181());
    __call684_184(__fieldRead684_183());
    __call684_186(__fieldRead684_185());
    spill684_39 = __fieldRead684_187();
    moom.w4 __stackOp684_189_0 = __sourceUninitializedNEW684_188();
    spill684_40 = __stackOp684_189_0;
    __explicitNewInit684_193(__stackOp684_189_0, __fieldRead684_190(), __fieldRead684_191(), __fieldRead684_192());
    __call684_195(spill684_39, __call684_194(spill684_40, "stoneSlab"));
    __call684_197(__fieldRead684_196());
    __call684_199(__fieldRead684_198());
    __call684_201(__fieldRead684_200());
    __call684_203(__fieldRead684_202());
    __call684_205(__fieldRead684_204());
    __call684_207(__fieldRead684_206());
    __call684_209(__fieldRead684_208());
    __call684_211(__fieldRead684_210());
    __call684_213(__fieldRead684_212());
    __call684_215(__fieldRead684_214());
    __call684_217(__fieldRead684_216());
    __call684_219(__fieldRead684_218());
    __call684_221(__fieldRead684_220());
    __call684_223(__fieldRead684_222());
    __call684_225(__fieldRead684_224());
    __call684_227(__fieldRead684_226());
    __call684_229(__fieldRead684_228());
    __call684_231(__fieldRead684_230());
    __call684_233(__fieldRead684_232());
    __call684_235(__fieldRead684_234());
    __call684_237(__fieldRead684_236());
    __call684_239(__fieldRead684_238());
    __call684_241(__fieldRead684_240());
    __call684_243(__fieldRead684_242());
    spill684_41 = __fieldRead684_244();
    moom.w5 __stackOp684_246_0 = __sourceUninitializedNEW684_245();
    spill684_42 = __stackOp684_246_0;
    __explicitNewInit684_248(__stackOp684_246_0, __fieldRead684_247());
    __call684_249(spill684_41, spill684_42);
    __call684_251(__fieldRead684_250());
    __call684_253(__fieldRead684_252());
    __call684_255(__fieldRead684_254());
    __call684_257(__fieldRead684_256());
    __call684_259(__fieldRead684_258());
    __call684_261(__fieldRead684_260());
    __call684_263(__fieldRead684_262());
    __call684_265(__fieldRead684_264());
    spill684_43 = __call684_266();
    __call684_268(__fieldRead684_267());
    __call684_270(__fieldRead684_269());
    __call684_272(__fieldRead684_271());
    __call684_274(__fieldRead684_273());
    __call684_276(__fieldRead684_275());
    __call684_278(__fieldRead684_277());
    __call684_280(__fieldRead684_279());
    __call684_282(__fieldRead684_281());
    __call684_284(__fieldRead684_283());
    spill684_44 = __fieldRead684_285();
    moom.w0 __stackOp684_287_0 = __sourceUninitializedNEW684_286();
    spill684_45 = __stackOp684_287_0;
    __explicitNewInit684_291(__stackOp684_287_0, __fieldRead684_288(), __fieldRead684_289(), __invokedynamic684_290());
    __call684_293(spill684_44, __call684_292(spill684_45, "monsterStoneEgg"));
    spill684_46 = __fieldRead684_294();
    moom.w0 __stackOp684_296_0 = __sourceUninitializedNEW684_295();
    spill684_47 = __stackOp684_296_0;
    __explicitNewInit684_300(__stackOp684_296_0, __fieldRead684_297(), __fieldRead684_298(), __invokedynamic684_299());
    __call684_302(spill684_46, __call684_301(spill684_47, "stonebricksmooth"));
    __call684_304(__fieldRead684_303());
    __call684_306(__fieldRead684_305());
    __call684_308(__fieldRead684_307());
    __call684_310(__fieldRead684_309());
    __call684_312(__fieldRead684_311());
    spill684_48 = __fieldRead684_313();
    moom.wX __stackOp684_315_0 = __sourceUninitializedNEW684_314();
    spill684_49 = __stackOp684_315_0;
    __explicitNewInit684_317(__stackOp684_315_0, __fieldRead684_316(), false);
    __call684_318(spill684_48, spill684_49);
    __call684_320(__fieldRead684_319());
    __call684_322(__fieldRead684_321());
    __call684_324(__fieldRead684_323());
    __call684_326(__fieldRead684_325());
    __call684_328(__fieldRead684_327());
    __call684_330(__fieldRead684_329());
    __call684_332(__fieldRead684_331());
    __call684_334(__fieldRead684_333());
    __call684_336(__fieldRead684_335());
    spill684_50 = __fieldRead684_337();
    moom.wY __stackOp684_339_0 = __sourceUninitializedNEW684_338();
    spill684_51 = __stackOp684_339_0;
    __explicitNewInit684_341(__stackOp684_339_0, __fieldRead684_340());
    __call684_342(spill684_50, spill684_51);
    __call684_344(__fieldRead684_343());
    __call684_346(__fieldRead684_345());
    __call684_348(__fieldRead684_347());
    __call684_350(__fieldRead684_349());
    __call684_352(__fieldRead684_351());
    __call684_354(__fieldRead684_353());
    __call684_356(__fieldRead684_355());
    __call684_358(__fieldRead684_357());
    spill684_52 = __fieldRead684_359();
    moom.w4 __stackOp684_361_0 = __sourceUninitializedNEW684_360();
    spill684_53 = __stackOp684_361_0;
    __explicitNewInit684_365(__stackOp684_361_0, __fieldRead684_362(), __fieldRead684_363(), __fieldRead684_364());
    __call684_367(spill684_52, __call684_366(spill684_53, "woodSlab"));
    __call684_369(__fieldRead684_368());
    __call684_371(__fieldRead684_370());
    __call684_373(__fieldRead684_372());
    __call684_375(__fieldRead684_374());
    __call684_377(__fieldRead684_376());
    __call684_379(__fieldRead684_378());
    __call684_381(__fieldRead684_380());
    __call684_383(__fieldRead684_382());
    __call684_385(__fieldRead684_384());
    __call684_387(__fieldRead684_386());
    spill684_54 = __fieldRead684_388();
    moom.w0 __stackOp684_390_0 = __sourceUninitializedNEW684_389();
    spill684_55 = __stackOp684_390_0;
    __explicitNewInit684_394(__stackOp684_390_0, __fieldRead684_391(), __fieldRead684_392(), __invokedynamic684_393());
    __call684_396(spill684_54, __call684_395(spill684_55, "cobbleWall"));
    __call684_398(__fieldRead684_397());
    spill684_56 = __fieldRead684_399();
    net.minecraft.item.ItemAnvilBlock __stackOp684_401_0 = __sourceUninitializedNEW684_400();
    spill684_57 = __stackOp684_401_0;
    __explicitNewInit684_403(__stackOp684_401_0, __fieldRead684_402());
    __call684_405(spill684_56, __call684_404(spill684_57, "anvil"));
    __call684_407(__fieldRead684_406());
    __call684_409(__fieldRead684_408());
    __call684_411(__fieldRead684_410());
    __call684_413(__fieldRead684_412());
    __call684_415(__fieldRead684_414());
    __call684_417(__fieldRead684_416());
    __call684_419(__fieldRead684_418());
    spill684_58 = __fieldRead684_420();
    moom.w0 __stackOp684_422_0 = __sourceUninitializedNEW684_421();
    spill684_59 = __stackOp684_422_0;
    spill684_60 = __stackOp684_422_0;
    spill684_61 = __fieldRead684_423();
    spill684_62 = __fieldRead684_424();
    java.lang.String[] __stackOp684_425_0 = new java.lang.String[3];
    spill684_63 = __stackOp684_425_0;
    (__stackOp684_425_0)[0] = "default";
    java.lang.String[] __stackOp684_426_0 = spill684_63;
    spill684_64 = __stackOp684_426_0;
    (__stackOp684_426_0)[1] = "chiseled";
    java.lang.String[] __stackOp684_427_0 = spill684_64;
    spill684_65 = __stackOp684_427_0;
    (__stackOp684_427_0)[2] = "lines";
    __explicitNewInit684_428(spill684_60, spill684_61, spill684_62, spill684_65);
    __call684_430(spill684_58, __call684_429(spill684_59, "quartzBlock"));
    __call684_432(__fieldRead684_431());
    __call684_434(__fieldRead684_433());
    __call684_436(__fieldRead684_435());
    spill684_66 = __fieldRead684_437();
    moom.wW __stackOp684_439_0 = __sourceUninitializedNEW684_438();
    spill684_67 = __stackOp684_439_0;
    __explicitNewInit684_441(__stackOp684_439_0, __fieldRead684_440());
    __call684_443(spill684_66, __call684_442(spill684_67, "clayHardenedStained"));
    __call684_445(__fieldRead684_444());
    __call684_447(__fieldRead684_446());
    __call684_449(__fieldRead684_448());
    spill684_68 = __fieldRead684_450();
    moom.wW __stackOp684_452_0 = __sourceUninitializedNEW684_451();
    spill684_69 = __stackOp684_452_0;
    __explicitNewInit684_454(__stackOp684_452_0, __fieldRead684_453());
    __call684_456(spill684_68, __call684_455(spill684_69, "woolCarpet"));
    __call684_458(__fieldRead684_457());
    __call684_460(__fieldRead684_459());
    __call684_462(__fieldRead684_461());
    __call684_464(__fieldRead684_463());
    __call684_466(__fieldRead684_465());
    __call684_468(__fieldRead684_467());
    spill684_70 = __fieldRead684_469();
    moom.w2 __stackOp684_471_0 = __sourceUninitializedNEW684_470();
    spill684_71 = __stackOp684_471_0;
    __explicitNewInit684_475(__stackOp684_471_0, __fieldRead684_472(), __fieldRead684_473(), __invokedynamic684_474());
    __call684_477(spill684_70, __call684_476(spill684_71, "doublePlant"));
    spill684_72 = __fieldRead684_478();
    moom.wW __stackOp684_480_0 = __sourceUninitializedNEW684_479();
    spill684_73 = __stackOp684_480_0;
    __explicitNewInit684_482(__stackOp684_480_0, __fieldRead684_481());
    __call684_484(spill684_72, __call684_483(spill684_73, "stainedGlass"));
    spill684_74 = __fieldRead684_485();
    moom.wW __stackOp684_487_0 = __sourceUninitializedNEW684_486();
    spill684_75 = __stackOp684_487_0;
    __explicitNewInit684_489(__stackOp684_487_0, __fieldRead684_488());
    __call684_491(spill684_74, __call684_490(spill684_75, "stainedGlassPane"));
    spill684_76 = __fieldRead684_492();
    moom.w0 __stackOp684_494_0 = __sourceUninitializedNEW684_493();
    spill684_77 = __stackOp684_494_0;
    __explicitNewInit684_498(__stackOp684_494_0, __fieldRead684_495(), __fieldRead684_496(), __invokedynamic684_497());
    __call684_500(spill684_76, __call684_499(spill684_77, "prismarine"));
    __call684_502(__fieldRead684_501());
    spill684_78 = __fieldRead684_503();
    moom.w0 __stackOp684_505_0 = __sourceUninitializedNEW684_504();
    spill684_79 = __stackOp684_505_0;
    __explicitNewInit684_509(__stackOp684_505_0, __fieldRead684_506(), __fieldRead684_507(), __invokedynamic684_508());
    __call684_511(spill684_78, __call684_510(spill684_79, "redSandStone"));
    __call684_513(__fieldRead684_512());
    spill684_80 = __fieldRead684_514();
    moom.w4 __stackOp684_516_0 = __sourceUninitializedNEW684_515();
    spill684_81 = __stackOp684_516_0;
    __explicitNewInit684_520(__stackOp684_516_0, __fieldRead684_517(), __fieldRead684_518(), __fieldRead684_519());
    __call684_522(spill684_80, __call684_521(spill684_81, "stoneSlab2"));
    spill684_82 = __invokedynamic684_523(21703, (3297378655126168803L ^ life0_3));
    spill684_83 = "iron_shovel";
    moom.xT __stackOp684_525_0 = __sourceUninitializedNEW684_524();
    spill684_84 = __stackOp684_525_0;
    __explicitNewInit684_527(__stackOp684_525_0, __fieldRead684_526());
    __call684_529(spill684_82, spill684_83, __call684_528(spill684_84, "shovelIron"));
    spill684_85 = __invokedynamic684_530(22829, (1350991389302499680L ^ life0_3));
    spill684_86 = "iron_pickaxe";
    moom.xS __stackOp684_532_0 = __sourceUninitializedNEW684_531();
    spill684_87 = __stackOp684_532_0;
    __explicitNewInit684_534(__stackOp684_532_0, __fieldRead684_533());
    __call684_536(spill684_85, spill684_86, __call684_535(spill684_87, "pickaxeIron"));
    spill684_88 = __invokedynamic684_537(20077, (652656311841865329L ^ life0_3));
    spill684_89 = "iron_axe";
    moom.xR __stackOp684_539_0 = __sourceUninitializedNEW684_538();
    spill684_90 = __stackOp684_539_0;
    __explicitNewInit684_541(__stackOp684_539_0, __fieldRead684_540());
    __call684_543(spill684_88, spill684_89, __call684_542(spill684_90, "hatchetIron"));
    spill684_91 = __invokedynamic684_544(29740, (2074139193068815565L ^ life0_3));
    spill684_92 = "flint_and_steel";
    moom.xo __stackOp684_546_0 = __sourceUninitializedNEW684_545();
    spill684_93 = __stackOp684_546_0;
    __explicitNewInit684_547(__stackOp684_546_0);
    __call684_549(spill684_91, spill684_92, __call684_548(spill684_93, "flintAndSteel"));
    spill684_94 = __invokedynamic684_550(1346, (4241306491318138207L ^ life0_3));
    spill684_95 = "apple";
    moom.xp __stackOp684_552_0 = __sourceUninitializedNEW684_551();
    spill684_96 = __stackOp684_552_0;
    __explicitNewInit684_553(__stackOp684_552_0, 4, 0x1.333334p-2f, false);
    __call684_555(spill684_94, spill684_95, __call684_554(spill684_96, "apple"));
    spill684_97 = __invokedynamic684_556(23774, (4210080399907597314L ^ life0_3));
    spill684_98 = "bow";
    net.minecraft.item.ItemBow __stackOp684_558_0 = __sourceUninitializedNEW684_557();
    spill684_99 = __stackOp684_558_0;
    __explicitNewInit684_559(__stackOp684_558_0);
    __call684_561(spill684_97, spill684_98, __call684_560(spill684_99, "bow"));
    spill684_100 = __invokedynamic684_562(16760, (8519700090481783054L ^ life0_3));
    spill684_101 = "arrow";
    net.minecraft.item.Item __stackOp684_564_0 = __sourceUninitializedNEW684_563();
    spill684_102 = __stackOp684_564_0;
    __explicitNewInit684_565(__stackOp684_564_0);
    __call684_569(spill684_100, spill684_101, __call684_568(__call684_566(spill684_102, "arrow"), __fieldRead684_567()));
    spill684_103 = __invokedynamic684_570(9984, (1720105695959471964L ^ life0_3));
    spill684_104 = "coal";
    moom.xb __stackOp684_572_0 = __sourceUninitializedNEW684_571();
    spill684_105 = __stackOp684_572_0;
    __explicitNewInit684_573(__stackOp684_572_0);
    __call684_575(spill684_103, spill684_104, __call684_574(spill684_105, "coal"));
    spill684_106 = __invokedynamic684_576(19104, (4202689989553568396L ^ life0_3));
    spill684_107 = "diamond";
    net.minecraft.item.Item __stackOp684_578_0 = __sourceUninitializedNEW684_577();
    spill684_108 = __stackOp684_578_0;
    __explicitNewInit684_579(__stackOp684_578_0);
    __call684_583(spill684_106, spill684_107, __call684_582(__call684_580(spill684_108, "diamond"), __fieldRead684_581()));
    spill684_109 = __invokedynamic684_584(16380, (6482826275915878379L ^ life0_3));
    spill684_110 = "iron_ingot";
    net.minecraft.item.Item __stackOp684_586_0 = __sourceUninitializedNEW684_585();
    spill684_111 = __stackOp684_586_0;
    __explicitNewInit684_587(__stackOp684_586_0);
    __call684_591(spill684_109, spill684_110, __call684_590(__call684_588(spill684_111, "ingotIron"), __fieldRead684_589()));
    spill684_112 = __invokedynamic684_592(400, (2768774380055654906L ^ life0_3));
    spill684_113 = "gold_ingot";
    net.minecraft.item.Item __stackOp684_594_0 = __sourceUninitializedNEW684_593();
    spill684_114 = __stackOp684_594_0;
    __explicitNewInit684_595(__stackOp684_594_0);
    __call684_599(spill684_112, spill684_113, __call684_598(__call684_596(spill684_114, "ingotGold"), __fieldRead684_597()));
    spill684_115 = __invokedynamic684_600(22631, (2073605310552221881L ^ life0_3));
    spill684_116 = "iron_sword";
    moom.xP __stackOp684_602_0 = __sourceUninitializedNEW684_601();
    spill684_117 = __stackOp684_602_0;
    __explicitNewInit684_604(__stackOp684_602_0, __fieldRead684_603());
    __call684_606(spill684_115, spill684_116, __call684_605(spill684_117, "swordIron"));
    spill684_118 = __invokedynamic684_607(5628, (4541949370060236180L ^ life0_3));
    spill684_119 = "wooden_sword";
    moom.xP __stackOp684_609_0 = __sourceUninitializedNEW684_608();
    spill684_120 = __stackOp684_609_0;
    __explicitNewInit684_611(__stackOp684_609_0, __fieldRead684_610());
    __call684_613(spill684_118, spill684_119, __call684_612(spill684_120, "swordWood"));
    spill684_121 = __invokedynamic684_614(13406, (7343753443566208064L ^ life0_3));
    spill684_122 = "wooden_shovel";
    moom.xT __stackOp684_616_0 = __sourceUninitializedNEW684_615();
    spill684_123 = __stackOp684_616_0;
    __explicitNewInit684_618(__stackOp684_616_0, __fieldRead684_617());
    __call684_620(spill684_121, spill684_122, __call684_619(spill684_123, "shovelWood"));
    spill684_124 = __invokedynamic684_621(9818, (2609502031620626010L ^ life0_3));
    spill684_125 = "wooden_pickaxe";
    moom.xS __stackOp684_623_0 = __sourceUninitializedNEW684_622();
    spill684_126 = __stackOp684_623_0;
    __explicitNewInit684_625(__stackOp684_623_0, __fieldRead684_624());
    __call684_627(spill684_124, spill684_125, __call684_626(spill684_126, "pickaxeWood"));
    spill684_127 = __invokedynamic684_628(13807, (4105644251102659849L ^ life0_3));
    spill684_128 = "wooden_axe";
    moom.xR __stackOp684_630_0 = __sourceUninitializedNEW684_629();
    spill684_129 = __stackOp684_630_0;
    __explicitNewInit684_632(__stackOp684_630_0, __fieldRead684_631());
    __call684_634(spill684_127, spill684_128, __call684_633(spill684_129, "hatchetWood"));
    spill684_130 = __invokedynamic684_635(21687, (8035009073305363664L ^ life0_3));
    spill684_131 = "stone_sword";
    moom.xP __stackOp684_637_0 = __sourceUninitializedNEW684_636();
    spill684_132 = __stackOp684_637_0;
    __explicitNewInit684_639(__stackOp684_637_0, __fieldRead684_638());
    __call684_641(spill684_130, spill684_131, __call684_640(spill684_132, "swordStone"));
    spill684_133 = __invokedynamic684_642(9509, (8439076065056118085L ^ life0_3));
    spill684_134 = "stone_shovel";
    moom.xT __stackOp684_644_0 = __sourceUninitializedNEW684_643();
    spill684_135 = __stackOp684_644_0;
    __explicitNewInit684_646(__stackOp684_644_0, __fieldRead684_645());
    __call684_648(spill684_133, spill684_134, __call684_647(spill684_135, "shovelStone"));
    spill684_136 = __invokedynamic684_649(30951, (6018303626456926241L ^ life0_3));
    spill684_137 = "stone_pickaxe";
    moom.xS __stackOp684_651_0 = __sourceUninitializedNEW684_650();
    spill684_138 = __stackOp684_651_0;
    __explicitNewInit684_653(__stackOp684_651_0, __fieldRead684_652());
    __call684_655(spill684_136, spill684_137, __call684_654(spill684_138, "pickaxeStone"));
    spill684_139 = __invokedynamic684_656(26909, (2023856376818080201L ^ life0_3));
    spill684_140 = "stone_axe";
    moom.xR __stackOp684_658_0 = __sourceUninitializedNEW684_657();
    spill684_141 = __stackOp684_658_0;
    __explicitNewInit684_660(__stackOp684_658_0, __fieldRead684_659());
    __call684_662(spill684_139, spill684_140, __call684_661(spill684_141, "hatchetStone"));
    spill684_142 = __invokedynamic684_663(19661, (749463936112114839L ^ life0_3));
    spill684_143 = "diamond_sword";
    moom.xP __stackOp684_665_0 = __sourceUninitializedNEW684_664();
    spill684_144 = __stackOp684_665_0;
    __explicitNewInit684_667(__stackOp684_665_0, __fieldRead684_666());
    __call684_669(spill684_142, spill684_143, __call684_668(spill684_144, "swordDiamond"));
    spill684_145 = __invokedynamic684_670(12505, (1672958483258753153L ^ life0_3));
    spill684_146 = "diamond_shovel";
    moom.xT __stackOp684_672_0 = __sourceUninitializedNEW684_671();
    spill684_147 = __stackOp684_672_0;
    __explicitNewInit684_674(__stackOp684_672_0, __fieldRead684_673());
    __call684_676(spill684_145, spill684_146, __call684_675(spill684_147, "shovelDiamond"));
    spill684_148 = __invokedynamic684_677(29201, (5816738724308157182L ^ life0_3));
    spill684_149 = "diamond_pickaxe";
    moom.xS __stackOp684_679_0 = __sourceUninitializedNEW684_678();
    spill684_150 = __stackOp684_679_0;
    __explicitNewInit684_681(__stackOp684_679_0, __fieldRead684_680());
    __call684_683(spill684_148, spill684_149, __call684_682(spill684_150, "pickaxeDiamond"));
    spill684_151 = __invokedynamic684_684(17720, (7626396160127808999L ^ life0_3));
    spill684_152 = "diamond_axe";
    moom.xR __stackOp684_686_0 = __sourceUninitializedNEW684_685();
    spill684_153 = __stackOp684_686_0;
    __explicitNewInit684_688(__stackOp684_686_0, __fieldRead684_687());
    __call684_690(spill684_151, spill684_152, __call684_689(spill684_153, "hatchetDiamond"));
    spill684_154 = __invokedynamic684_691(10722, (5419310735853869465L ^ life0_3));
    spill684_155 = "stick";
    net.minecraft.item.Item __stackOp684_693_0 = __sourceUninitializedNEW684_692();
    spill684_156 = __stackOp684_693_0;
    __explicitNewInit684_694(__stackOp684_693_0);
    __call684_699(spill684_154, spill684_155, __call684_698(__call684_696(__call684_695(spill684_156), "stick"), __fieldRead684_697()));
    spill684_157 = __invokedynamic684_700(8370, (4064898400501584089L ^ life0_3));
    spill684_158 = "bowl";
    net.minecraft.item.Item __stackOp684_702_0 = __sourceUninitializedNEW684_701();
    spill684_159 = __stackOp684_702_0;
    __explicitNewInit684_703(__stackOp684_702_0);
    __call684_707(spill684_157, spill684_158, __call684_706(__call684_704(spill684_159, "bowl"), __fieldRead684_705()));
    spill684_160 = __invokedynamic684_708(6298, (8710125323335329875L ^ life0_3));
    spill684_161 = "mushroom_stew";
    moom.xt __stackOp684_710_0 = __sourceUninitializedNEW684_709();
    spill684_162 = __stackOp684_710_0;
    __explicitNewInit684_712(__stackOp684_710_0, __invokedynamic684_711(4479, (5463191031378075986L ^ life0_3)));
    __call684_714(spill684_160, spill684_161, __call684_713(spill684_162, "mushroomStew"));
    spill684_163 = __invokedynamic684_715(2853, (6302224755973716962L ^ life0_3));
    spill684_164 = "golden_sword";
    moom.xP __stackOp684_717_0 = __sourceUninitializedNEW684_716();
    spill684_165 = __stackOp684_717_0;
    __explicitNewInit684_719(__stackOp684_717_0, __fieldRead684_718());
    __call684_721(spill684_163, spill684_164, __call684_720(spill684_165, "swordGold"));
    spill684_166 = __invokedynamic684_722(14394, (272947411623561411L ^ life0_3));
    spill684_167 = "golden_shovel";
    moom.xT __stackOp684_724_0 = __sourceUninitializedNEW684_723();
    spill684_168 = __stackOp684_724_0;
    __explicitNewInit684_726(__stackOp684_724_0, __fieldRead684_725());
    __call684_728(spill684_166, spill684_167, __call684_727(spill684_168, "shovelGold"));
    spill684_169 = __invokedynamic684_729(30072, (7962718601541977419L ^ life0_3));
    spill684_170 = "golden_pickaxe";
    moom.xS __stackOp684_731_0 = __sourceUninitializedNEW684_730();
    spill684_171 = __stackOp684_731_0;
    __explicitNewInit684_733(__stackOp684_731_0, __fieldRead684_732());
    __call684_735(spill684_169, spill684_170, __call684_734(spill684_171, "pickaxeGold"));
    spill684_172 = __invokedynamic684_736(29244, (3945926387522667047L ^ life0_3));
    spill684_173 = "golden_axe";
    moom.xR __stackOp684_738_0 = __sourceUninitializedNEW684_737();
    spill684_174 = __stackOp684_738_0;
    __explicitNewInit684_740(__stackOp684_738_0, __fieldRead684_739());
    __call684_742(spill684_172, spill684_173, __call684_741(spill684_174, "hatchetGold"));
    spill684_175 = __invokedynamic684_743(28026, (8954011170913164672L ^ life0_3));
    spill684_176 = "string";
    moom.xH __stackOp684_745_0 = __sourceUninitializedNEW684_744();
    spill684_177 = __stackOp684_745_0;
    __explicitNewInit684_747(__stackOp684_745_0, __fieldRead684_746());
    __call684_751(spill684_175, spill684_176, __call684_750(__call684_748(spill684_177, "string"), __fieldRead684_749()));
    spill684_178 = __invokedynamic684_752(14157, (8887784437748189048L ^ life0_3));
    spill684_179 = "feather";
    net.minecraft.item.Item __stackOp684_754_0 = __sourceUninitializedNEW684_753();
    spill684_180 = __stackOp684_754_0;
    __explicitNewInit684_755(__stackOp684_754_0);
    __call684_759(spill684_178, spill684_179, __call684_758(__call684_756(spill684_180, "feather"), __fieldRead684_757()));
    spill684_181 = __invokedynamic684_760(25383, (347345387716252501L ^ life0_3));
    spill684_182 = "gunpowder";
    net.minecraft.item.Item __stackOp684_762_0 = __sourceUninitializedNEW684_761();
    spill684_183 = __stackOp684_762_0;
    __explicitNewInit684_763(__stackOp684_762_0);
    __call684_768(spill684_181, spill684_182, __call684_767(__call684_765(__call684_764(spill684_183, "sulphur"), "+14&13-13"), __fieldRead684_766()));
    spill684_184 = __invokedynamic684_769(30655, (5879486586506413906L ^ life0_3));
    spill684_185 = "wooden_hoe";
    moom.xw __stackOp684_771_0 = __sourceUninitializedNEW684_770();
    spill684_186 = __stackOp684_771_0;
    __explicitNewInit684_773(__stackOp684_771_0, __fieldRead684_772());
    __call684_775(spill684_184, spill684_185, __call684_774(spill684_186, "hoeWood"));
    spill684_187 = __invokedynamic684_776(10695, (4169451926821886392L ^ life0_3));
    spill684_188 = "stone_hoe";
    moom.xw __stackOp684_778_0 = __sourceUninitializedNEW684_777();
    spill684_189 = __stackOp684_778_0;
    __explicitNewInit684_780(__stackOp684_778_0, __fieldRead684_779());
    __call684_782(spill684_187, spill684_188, __call684_781(spill684_189, "hoeStone"));
    spill684_190 = __invokedynamic684_783(14475, (5559644627737135274L ^ life0_3));
    spill684_191 = "iron_hoe";
    moom.xw __stackOp684_785_0 = __sourceUninitializedNEW684_784();
    spill684_192 = __stackOp684_785_0;
    __explicitNewInit684_787(__stackOp684_785_0, __fieldRead684_786());
    __call684_789(spill684_190, spill684_191, __call684_788(spill684_192, "hoeIron"));
    spill684_193 = __invokedynamic684_790(6202, (6916327216381421671L ^ life0_3));
    spill684_194 = "diamond_hoe";
    moom.xw __stackOp684_792_0 = __sourceUninitializedNEW684_791();
    spill684_195 = __stackOp684_792_0;
    __explicitNewInit684_794(__stackOp684_792_0, __fieldRead684_793());
    __call684_796(spill684_193, spill684_194, __call684_795(spill684_195, "hoeDiamond"));
    spill684_196 = __invokedynamic684_797(18771, (6705921448739223890L ^ life0_3));
    spill684_197 = "golden_hoe";
    moom.xw __stackOp684_799_0 = __sourceUninitializedNEW684_798();
    spill684_198 = __stackOp684_799_0;
    __explicitNewInit684_801(__stackOp684_799_0, __fieldRead684_800());
    __call684_803(spill684_196, spill684_197, __call684_802(spill684_198, "hoeGold"));
    spill684_199 = __invokedynamic684_804(11644, (1443167281017609514L ^ life0_3));
    spill684_200 = "wheat_seeds";
    moom.xJ __stackOp684_806_0 = __sourceUninitializedNEW684_805();
    spill684_201 = __stackOp684_806_0;
    __explicitNewInit684_809(__stackOp684_806_0, __fieldRead684_807(), __fieldRead684_808());
    __call684_811(spill684_199, spill684_200, __call684_810(spill684_201, "seeds"));
    spill684_202 = __invokedynamic684_812(26617, (5338132948961531901L ^ life0_3));
    spill684_203 = "wheat";
    net.minecraft.item.Item __stackOp684_814_0 = __sourceUninitializedNEW684_813();
    spill684_204 = __stackOp684_814_0;
    __explicitNewInit684_815(__stackOp684_814_0);
    __call684_819(spill684_202, spill684_203, __call684_818(__call684_816(spill684_204, "wheat"), __fieldRead684_817()));
    spill684_205 = __invokedynamic684_820(14463, (5069839794028496983L ^ life0_3));
    spill684_206 = "bread";
    moom.xp __stackOp684_822_0 = __sourceUninitializedNEW684_821();
    spill684_207 = __stackOp684_822_0;
    __explicitNewInit684_823(__stackOp684_822_0, 5, 0x1.333334p-1f, false);
    __call684_825(spill684_205, spill684_206, __call684_824(spill684_207, "bread"));
    spill684_208 = __invokedynamic684_826(20635, (4215900412215632107L ^ life0_3));
    spill684_209 = "leather_helmet";
    net.minecraft.item.ItemArmor __stackOp684_828_0 = __sourceUninitializedNEW684_827();
    spill684_210 = __stackOp684_828_0;
    __explicitNewInit684_830(__stackOp684_828_0, __fieldRead684_829(), 0, 0);
    __call684_832(spill684_208, spill684_209, __call684_831(spill684_210, "helmetCloth"));
    spill684_211 = __invokedynamic684_833(22814, (9153760480793733428L ^ life0_3));
    spill684_212 = "leather_chestplate";
    net.minecraft.item.ItemArmor __stackOp684_835_0 = __sourceUninitializedNEW684_834();
    spill684_213 = __stackOp684_835_0;
    __explicitNewInit684_837(__stackOp684_835_0, __fieldRead684_836(), 0, 1);
    __call684_839(spill684_211, spill684_212, __call684_838(spill684_213, "chestplateCloth"));
    spill684_214 = __invokedynamic684_840(26849, (5762895419013601305L ^ life0_3));
    spill684_215 = "leather_leggings";
    net.minecraft.item.ItemArmor __stackOp684_842_0 = __sourceUninitializedNEW684_841();
    spill684_216 = __stackOp684_842_0;
    __explicitNewInit684_844(__stackOp684_842_0, __fieldRead684_843(), 0, 2);
    __call684_846(spill684_214, spill684_215, __call684_845(spill684_216, "leggingsCloth"));
    spill684_217 = __invokedynamic684_847(5840, (2470361859984746020L ^ life0_3));
    spill684_218 = "leather_boots";
    net.minecraft.item.ItemArmor __stackOp684_849_0 = __sourceUninitializedNEW684_848();
    spill684_219 = __stackOp684_849_0;
    __explicitNewInit684_851(__stackOp684_849_0, __fieldRead684_850(), 0, 3);
    __call684_853(spill684_217, spill684_218, __call684_852(spill684_219, "bootsCloth"));
    spill684_220 = __invokedynamic684_854(26890, (1515739795005872405L ^ life0_3));
    spill684_221 = "chainmail_helmet";
    net.minecraft.item.ItemArmor __stackOp684_856_0 = __sourceUninitializedNEW684_855();
    spill684_222 = __stackOp684_856_0;
    __explicitNewInit684_858(__stackOp684_856_0, __fieldRead684_857(), 1, 0);
    __call684_860(spill684_220, spill684_221, __call684_859(spill684_222, "helmetChain"));
    spill684_223 = __invokedynamic684_861(7687, (5320783272439803619L ^ life0_3));
    spill684_224 = "chainmail_chestplate";
    net.minecraft.item.ItemArmor __stackOp684_863_0 = __sourceUninitializedNEW684_862();
    spill684_225 = __stackOp684_863_0;
    __explicitNewInit684_865(__stackOp684_863_0, __fieldRead684_864(), 1, 1);
    __call684_867(spill684_223, spill684_224, __call684_866(spill684_225, "chestplateChain"));
    spill684_226 = __invokedynamic684_868(1091, (1194912061729600515L ^ life0_3));
    spill684_227 = "chainmail_leggings";
    net.minecraft.item.ItemArmor __stackOp684_870_0 = __sourceUninitializedNEW684_869();
    spill684_228 = __stackOp684_870_0;
    __explicitNewInit684_872(__stackOp684_870_0, __fieldRead684_871(), 1, 2);
    __call684_874(spill684_226, spill684_227, __call684_873(spill684_228, "leggingsChain"));
    spill684_229 = __invokedynamic684_875(12382, (5810897978560856112L ^ life0_3));
    spill684_230 = "chainmail_boots";
    net.minecraft.item.ItemArmor __stackOp684_877_0 = __sourceUninitializedNEW684_876();
    spill684_231 = __stackOp684_877_0;
    __explicitNewInit684_879(__stackOp684_877_0, __fieldRead684_878(), 1, 3);
    __call684_881(spill684_229, spill684_230, __call684_880(spill684_231, "bootsChain"));
    spill684_232 = __invokedynamic684_882(31538, (3566371772872919934L ^ life0_3));
    spill684_233 = "iron_helmet";
    net.minecraft.item.ItemArmor __stackOp684_884_0 = __sourceUninitializedNEW684_883();
    spill684_234 = __stackOp684_884_0;
    __explicitNewInit684_886(__stackOp684_884_0, __fieldRead684_885(), 2, 0);
    __call684_888(spill684_232, spill684_233, __call684_887(spill684_234, "helmetIron"));
    spill684_235 = __invokedynamic684_889(8270, (5631327096846602382L ^ life0_3));
    spill684_236 = "iron_chestplate";
    net.minecraft.item.ItemArmor __stackOp684_891_0 = __sourceUninitializedNEW684_890();
    spill684_237 = __stackOp684_891_0;
    __explicitNewInit684_893(__stackOp684_891_0, __fieldRead684_892(), 2, 1);
    __call684_895(spill684_235, spill684_236, __call684_894(spill684_237, "chestplateIron"));
    spill684_238 = __invokedynamic684_896(29948, (3127348388326212664L ^ life0_3));
    spill684_239 = "iron_leggings";
    net.minecraft.item.ItemArmor __stackOp684_898_0 = __sourceUninitializedNEW684_897();
    spill684_240 = __stackOp684_898_0;
    __explicitNewInit684_900(__stackOp684_898_0, __fieldRead684_899(), 2, 2);
    __call684_902(spill684_238, spill684_239, __call684_901(spill684_240, "leggingsIron"));
    spill684_241 = __invokedynamic684_903(17560, (2705462855782970571L ^ life0_3));
    spill684_242 = "iron_boots";
    net.minecraft.item.ItemArmor __stackOp684_905_0 = __sourceUninitializedNEW684_904();
    spill684_243 = __stackOp684_905_0;
    __explicitNewInit684_907(__stackOp684_905_0, __fieldRead684_906(), 2, 3);
    __call684_909(spill684_241, spill684_242, __call684_908(spill684_243, "bootsIron"));
    life2_1326 = __integerCategory684_910(spill684_43);
    spill684_244 = __invokedynamic684_911(14430, (7615321851043694643L ^ life0_3));
    spill684_245 = "diamond_helmet";
    net.minecraft.item.ItemArmor __stackOp684_913_0 = __sourceUninitializedNEW684_912();
    spill684_246 = __stackOp684_913_0;
    __explicitNewInit684_915(__stackOp684_913_0, __fieldRead684_914(), 3, 0);
    __call684_917(spill684_244, spill684_245, __call684_916(spill684_246, "helmetDiamond"));
    spill684_247 = __invokedynamic684_918(27858, (1103115951062654007L ^ life0_3));
    spill684_248 = "diamond_chestplate";
    net.minecraft.item.ItemArmor __stackOp684_920_0 = __sourceUninitializedNEW684_919();
    spill684_249 = __stackOp684_920_0;
    __explicitNewInit684_922(__stackOp684_920_0, __fieldRead684_921(), 3, 1);
    __call684_924(spill684_247, spill684_248, __call684_923(spill684_249, "chestplateDiamond"));
    spill684_250 = __invokedynamic684_925(6, (1701117602244358233L ^ life0_3));
    spill684_251 = "diamond_leggings";
    net.minecraft.item.ItemArmor __stackOp684_927_0 = __sourceUninitializedNEW684_926();
    spill684_252 = __stackOp684_927_0;
    __explicitNewInit684_929(__stackOp684_927_0, __fieldRead684_928(), 3, 2);
    __call684_931(spill684_250, spill684_251, __call684_930(spill684_252, "leggingsDiamond"));
    spill684_253 = __invokedynamic684_932(7352, (1533290406345731168L ^ life0_3));
    spill684_254 = "diamond_boots";
    net.minecraft.item.ItemArmor __stackOp684_934_0 = __sourceUninitializedNEW684_933();
    spill684_255 = __stackOp684_934_0;
    __explicitNewInit684_936(__stackOp684_934_0, __fieldRead684_935(), 3, 3);
    __call684_938(spill684_253, spill684_254, __call684_937(spill684_255, "bootsDiamond"));
    spill684_256 = __invokedynamic684_939(17386, (3523332285913641892L ^ life0_3));
    spill684_257 = "golden_helmet";
    net.minecraft.item.ItemArmor __stackOp684_941_0 = __sourceUninitializedNEW684_940();
    spill684_258 = __stackOp684_941_0;
    __explicitNewInit684_943(__stackOp684_941_0, __fieldRead684_942(), 4, 0);
    __call684_945(spill684_256, spill684_257, __call684_944(spill684_258, "helmetGold"));
    spill684_259 = __invokedynamic684_946(17183, (697842992128897804L ^ life0_3));
    spill684_260 = "golden_chestplate";
    net.minecraft.item.ItemArmor __stackOp684_948_0 = __sourceUninitializedNEW684_947();
    spill684_261 = __stackOp684_948_0;
    __explicitNewInit684_950(__stackOp684_948_0, __fieldRead684_949(), 4, 1);
    __call684_952(spill684_259, spill684_260, __call684_951(spill684_261, "chestplateGold"));
    spill684_262 = __invokedynamic684_953(31675, (574823694218333105L ^ life0_3));
    spill684_263 = "golden_leggings";
    net.minecraft.item.ItemArmor __stackOp684_955_0 = __sourceUninitializedNEW684_954();
    spill684_264 = __stackOp684_955_0;
    __explicitNewInit684_957(__stackOp684_955_0, __fieldRead684_956(), 4, 2);
    __call684_959(spill684_262, spill684_263, __call684_958(spill684_264, "leggingsGold"));
    spill684_265 = __invokedynamic684_960(3817, (6107580550819741436L ^ life0_3));
    spill684_266 = "golden_boots";
    net.minecraft.item.ItemArmor __stackOp684_962_0 = __sourceUninitializedNEW684_961();
    spill684_267 = __stackOp684_962_0;
    __explicitNewInit684_964(__stackOp684_962_0, __fieldRead684_963(), 4, 3);
    __call684_966(spill684_265, spill684_266, __call684_965(spill684_267, "bootsGold"));
    spill684_268 = __invokedynamic684_967(28041, (8603315111075978613L ^ life0_3));
    spill684_269 = "flint";
    net.minecraft.item.Item __stackOp684_969_0 = __sourceUninitializedNEW684_968();
    spill684_270 = __stackOp684_969_0;
    __explicitNewInit684_970(__stackOp684_969_0);
    __call684_974(spill684_268, spill684_269, __call684_973(__call684_971(spill684_270, "flint"), __fieldRead684_972()));
    spill684_271 = __invokedynamic684_975(16034, (597314265767136916L ^ life0_3));
    spill684_272 = "porkchop";
    moom.xp __stackOp684_977_0 = __sourceUninitializedNEW684_976();
    spill684_273 = __stackOp684_977_0;
    __explicitNewInit684_978(__stackOp684_977_0, 3, 0x1.333334p-2f, true);
    __call684_980(spill684_271, spill684_272, __call684_979(spill684_273, "porkchopRaw"));
    spill684_274 = __invokedynamic684_981(2075, (3417490209778825241L ^ life0_3));
    spill684_275 = "cooked_porkchop";
    moom.xp __stackOp684_983_0 = __sourceUninitializedNEW684_982();
    spill684_276 = __stackOp684_983_0;
    __explicitNewInit684_985(__stackOp684_983_0, __invokedynamic684_984(6090, (2379607257588951020L ^ life0_3)), 0x1.99999ap-1f, true);
    __call684_987(spill684_274, spill684_275, __call684_986(spill684_276, "porkchopCooked"));
    spill684_277 = __invokedynamic684_988(11874, (5116763871547645620L ^ life0_3));
    spill684_278 = "painting";
    moom.xv __stackOp684_990_0 = __sourceUninitializedNEW684_989();
    spill684_279 = __stackOp684_990_0;
    __explicitNewInit684_992(__stackOp684_990_0, __classLiteral684_991());
    __call684_994(spill684_277, spill684_278, __call684_993(spill684_279, "painting"));
    spill684_280 = __invokedynamic684_995(21961, (7707733477527528923L ^ life0_3));
    spill684_281 = "golden_apple";
    moom.xq __stackOp684_997_0 = __sourceUninitializedNEW684_996();
    spill684_282 = __stackOp684_997_0;
    __explicitNewInit684_998(__stackOp684_997_0, 4, 0x1.333334p0f, false);
    __call684_1004(spill684_280, spill684_281, __call684_1003(__call684_1002(__call684_999(spill684_282), __fieldRead684_1001(__fieldRead684_1000()), 5, 1, 0x1.0p0f), "appleGold"));
    spill684_283 = __invokedynamic684_1005(7437, (8534064483869453589L ^ life0_3));
    spill684_284 = "sign";
    moom.xL __stackOp684_1007_0 = __sourceUninitializedNEW684_1006();
    spill684_285 = __stackOp684_1007_0;
    __explicitNewInit684_1008(__stackOp684_1007_0);
    __call684_1010(spill684_283, spill684_284, __call684_1009(spill684_285, "sign"));
    spill684_286 = __invokedynamic684_1011(8460, (133735931648627136L ^ life0_3));
    spill684_287 = "wooden_door";
    moom.xc __stackOp684_1013_0 = __sourceUninitializedNEW684_1012();
    spill684_288 = __stackOp684_1013_0;
    __explicitNewInit684_1015(__stackOp684_1013_0, __fieldRead684_1014());
    __call684_1017(spill684_286, spill684_287, __call684_1016(spill684_288, "doorOak"));
    moom.w9 __stackOp684_1019_0 = __sourceUninitializedNEW684_1018();
    spill684_289 = __stackOp684_1019_0;
    __explicitNewInit684_1021(__stackOp684_1019_0, __fieldRead684_1020());
    life3_1567 = __call684_1024(__call684_1022(spill684_289, "bucket"), __invokedynamic684_1023(1297, (8477087535002187124L ^ life0_3)));
    __call684_1026(__invokedynamic684_1025(20032, (60606381249150480L ^ life0_3)), "bucket", life3_1567);
    spill684_290 = __invokedynamic684_1027(15847, (4843955873182797061L ^ life0_3));
    spill684_291 = "water_bucket";
    moom.w9 __stackOp684_1029_0 = __sourceUninitializedNEW684_1028();
    spill684_292 = __stackOp684_1029_0;
    __explicitNewInit684_1031(__stackOp684_1029_0, __fieldRead684_1030());
    __call684_1034(spill684_290, spill684_291, __call684_1033(__call684_1032(spill684_292, "bucketWater"), life3_1567));
    spill684_293 = __invokedynamic684_1035(24347, (2979691943493545820L ^ life0_3));
    spill684_294 = "lava_bucket";
    moom.w9 __stackOp684_1037_0 = __sourceUninitializedNEW684_1036();
    spill684_295 = __stackOp684_1037_0;
    __explicitNewInit684_1039(__stackOp684_1037_0, __fieldRead684_1038());
    __call684_1042(spill684_293, spill684_294, __call684_1041(__call684_1040(spill684_295, "bucketLava"), life3_1567));
    spill684_296 = __invokedynamic684_1043(11995, (56963714310168258L ^ life0_3));
    spill684_297 = "minecart";
    moom.xB __stackOp684_1045_0 = __sourceUninitializedNEW684_1044();
    spill684_298 = __stackOp684_1045_0;
    __explicitNewInit684_1047(__stackOp684_1045_0, __fieldRead684_1046());
    __call684_1049(spill684_296, spill684_297, __call684_1048(spill684_298, "minecart"));
    spill684_299 = __invokedynamic684_1050(12064, (779761412364623718L ^ life0_3));
    spill684_300 = "saddle";
    moom.xI __stackOp684_1052_0 = __sourceUninitializedNEW684_1051();
    spill684_301 = __stackOp684_1052_0;
    __explicitNewInit684_1053(__stackOp684_1052_0);
    __call684_1055(spill684_299, spill684_300, __call684_1054(spill684_301, "saddle"));
    spill684_302 = __invokedynamic684_1056(6973, (6567836695679822814L ^ life0_3));
    spill684_303 = "iron_door";
    moom.xc __stackOp684_1058_0 = __sourceUninitializedNEW684_1057();
    spill684_304 = __stackOp684_1058_0;
    __explicitNewInit684_1060(__stackOp684_1058_0, __fieldRead684_1059());
    __call684_1062(spill684_302, spill684_303, __call684_1061(spill684_304, "doorIron"));
    spill684_305 = __invokedynamic684_1063(2776, (8505225202148112934L ^ life0_3));
    spill684_306 = "redstone";
    moom.xG __stackOp684_1065_0 = __sourceUninitializedNEW684_1064();
    spill684_307 = __stackOp684_1065_0;
    __explicitNewInit684_1066(__stackOp684_1065_0);
    __call684_1069(spill684_305, spill684_306, __call684_1068(__call684_1067(spill684_307, "redstone"), "-5+6-7"));
    spill684_308 = __invokedynamic684_1070(30849, (1761419457242400931L ^ life0_3));
    spill684_309 = "snowball";
    moom.xO __stackOp684_1072_0 = __sourceUninitializedNEW684_1071();
    spill684_310 = __stackOp684_1072_0;
    __explicitNewInit684_1073(__stackOp684_1072_0);
    __call684_1075(spill684_308, spill684_309, __call684_1074(spill684_310, "snowball"));
    spill684_311 = __invokedynamic684_1076(30679, (1975863294290724771L ^ life0_3));
    spill684_312 = "boat";
    moom.w6 __stackOp684_1078_0 = __sourceUninitializedNEW684_1077();
    spill684_313 = __stackOp684_1078_0;
    __explicitNewInit684_1079(__stackOp684_1078_0);
    __call684_1081(spill684_311, spill684_312, __call684_1080(spill684_313, "boat"));
    spill684_314 = __invokedynamic684_1082(630, (2841610940394173112L ^ life0_3));
    spill684_315 = "leather";
    net.minecraft.item.Item __stackOp684_1084_0 = __sourceUninitializedNEW684_1083();
    spill684_316 = __stackOp684_1084_0;
    __explicitNewInit684_1085(__stackOp684_1084_0);
    __call684_1089(spill684_314, spill684_315, __call684_1088(__call684_1086(spill684_316, "leather"), __fieldRead684_1087()));
    spill684_317 = __invokedynamic684_1090(6575, (3099020516631898569L ^ life0_3));
    spill684_318 = "milk_bucket";
    moom.w_ __stackOp684_1092_0 = __sourceUninitializedNEW684_1091();
    spill684_319 = __stackOp684_1092_0;
    __explicitNewInit684_1093(__stackOp684_1092_0);
    __call684_1096(spill684_317, spill684_318, __call684_1095(__call684_1094(spill684_319, "milk"), life3_1567));
    spill684_320 = __invokedynamic684_1097(28695, (3864235972839833754L ^ life0_3));
    spill684_321 = "brick";
    net.minecraft.item.Item __stackOp684_1099_0 = __sourceUninitializedNEW684_1098();
    spill684_322 = __stackOp684_1099_0;
    __explicitNewInit684_1100(__stackOp684_1099_0);
    __call684_1104(spill684_320, spill684_321, __call684_1103(__call684_1101(spill684_322, "brick"), __fieldRead684_1102()));
    spill684_323 = __invokedynamic684_1105(10177, (7176599355251021616L ^ life0_3));
    spill684_324 = "clay_ball";
    net.minecraft.item.Item __stackOp684_1107_0 = __sourceUninitializedNEW684_1106();
    spill684_325 = __stackOp684_1107_0;
    __explicitNewInit684_1108(__stackOp684_1107_0);
    __call684_1112(spill684_323, spill684_324, __call684_1111(__call684_1109(spill684_325, "clay"), __fieldRead684_1110()));
    spill684_326 = __invokedynamic684_1113(4335, (8460422202784080021L ^ life0_3));
    spill684_327 = "reeds";
    moom.xH __stackOp684_1115_0 = __sourceUninitializedNEW684_1114();
    spill684_328 = __stackOp684_1115_0;
    __explicitNewInit684_1117(__stackOp684_1115_0, __fieldRead684_1116());
    __call684_1121(spill684_326, spill684_327, __call684_1120(__call684_1118(spill684_328, "reeds"), __fieldRead684_1119()));
    spill684_329 = __invokedynamic684_1122(18677, (9123291123616331976L ^ life0_3));
    spill684_330 = "paper";
    net.minecraft.item.Item __stackOp684_1124_0 = __sourceUninitializedNEW684_1123();
    spill684_331 = __stackOp684_1124_0;
    __explicitNewInit684_1125(__stackOp684_1124_0);
    __call684_1129(spill684_329, spill684_330, __call684_1128(__call684_1126(spill684_331, "paper"), __fieldRead684_1127()));
    spill684_332 = __invokedynamic684_1130(17895, (5804777956155536828L ^ life0_3));
    spill684_333 = "book";
    moom.w7 __stackOp684_1132_0 = __sourceUninitializedNEW684_1131();
    spill684_334 = __stackOp684_1132_0;
    __explicitNewInit684_1133(__stackOp684_1132_0);
    __call684_1137(spill684_332, spill684_333, __call684_1136(__call684_1134(spill684_334, "book"), __fieldRead684_1135()));
    spill684_335 = __invokedynamic684_1138(27861, (1171475527196712124L ^ life0_3));
    spill684_336 = "slime_ball";
    net.minecraft.item.Item __stackOp684_1140_0 = __sourceUninitializedNEW684_1139();
    spill684_337 = __stackOp684_1140_0;
    __explicitNewInit684_1141(__stackOp684_1140_0);
    __call684_1145(spill684_335, spill684_336, __call684_1144(__call684_1142(spill684_337, "slimeball"), __fieldRead684_1143()));
    spill684_338 = __invokedynamic684_1146(1910, (4004668022901864212L ^ life0_3));
    spill684_339 = "chest_minecart";
    moom.xB __stackOp684_1148_0 = __sourceUninitializedNEW684_1147();
    spill684_340 = __stackOp684_1148_0;
    __explicitNewInit684_1150(__stackOp684_1148_0, __fieldRead684_1149());
    __call684_1152(spill684_338, spill684_339, __call684_1151(spill684_340, "minecartChest"));
    spill684_341 = __invokedynamic684_1153(7748, (3111387248546213524L ^ life0_3));
    spill684_342 = "furnace_minecart";
    moom.xB __stackOp684_1155_0 = __sourceUninitializedNEW684_1154();
    spill684_343 = __stackOp684_1155_0;
    __explicitNewInit684_1157(__stackOp684_1155_0, __fieldRead684_1156());
    __call684_1159(spill684_341, spill684_342, __call684_1158(spill684_343, "minecartFurnace"));
    spill684_344 = __invokedynamic684_1160(4003, (2730256819953106733L ^ life0_3));
    spill684_345 = "egg";
    moom.xf __stackOp684_1162_0 = __sourceUninitializedNEW684_1161();
    spill684_346 = __stackOp684_1162_0;
    __explicitNewInit684_1163(__stackOp684_1162_0);
    __call684_1165(spill684_344, spill684_345, __call684_1164(spill684_346, "egg"));
    spill684_347 = __invokedynamic684_1166(30449, (1776326574180599297L ^ life0_3));
    spill684_348 = "compass";
    net.minecraft.item.Item __stackOp684_1168_0 = __sourceUninitializedNEW684_1167();
    spill684_349 = __stackOp684_1168_0;
    __explicitNewInit684_1169(__stackOp684_1168_0);
    __call684_1173(spill684_347, spill684_348, __call684_1172(__call684_1170(spill684_349, "compass"), __fieldRead684_1171()));
    spill684_350 = __invokedynamic684_1174(12159, (5257192972821520205L ^ life0_3));
    spill684_351 = "fishing_rod";
    moom.xn __stackOp684_1176_0 = __sourceUninitializedNEW684_1175();
    spill684_352 = __stackOp684_1176_0;
    __explicitNewInit684_1177(__stackOp684_1176_0);
    __call684_1179(spill684_350, spill684_351, __call684_1178(spill684_352, "fishingRod"));
    spill684_353 = __invokedynamic684_1180(6026, (2540851586847401823L ^ life0_3));
    spill684_354 = "clock";
    net.minecraft.item.Item __stackOp684_1182_0 = __sourceUninitializedNEW684_1181();
    spill684_355 = __stackOp684_1182_0;
    __explicitNewInit684_1183(__stackOp684_1182_0);
    __call684_1187(spill684_353, spill684_354, __call684_1186(__call684_1184(spill684_355, "clock"), __fieldRead684_1185()));
    spill684_356 = __invokedynamic684_1188(30217, (8919830028735448650L ^ life0_3));
    spill684_357 = "glowstone_dust";
    net.minecraft.item.Item __stackOp684_1190_0 = __sourceUninitializedNEW684_1189();
    spill684_358 = __stackOp684_1190_0;
    __explicitNewInit684_1191(__stackOp684_1190_0);
    __call684_1196(spill684_356, spill684_357, __call684_1195(__call684_1193(__call684_1192(spill684_358, "yellowDust"), "+5-6-7"), __fieldRead684_1194()));
    spill684_359 = __invokedynamic684_1197(7288, (2524901191418801199L ^ life0_3));
    spill684_360 = "fish";
    moom.xr __stackOp684_1199_0 = __sourceUninitializedNEW684_1198();
    spill684_361 = __stackOp684_1199_0;
    __explicitNewInit684_1200(__stackOp684_1199_0, false);
    __call684_1203(spill684_359, spill684_360, __call684_1202(__call684_1201(spill684_361, "fish"), 1));
    spill684_362 = __invokedynamic684_1204(11544, (2767507294133738959L ^ life0_3));
    spill684_363 = "cooked_fish";
    moom.xr __stackOp684_1206_0 = __sourceUninitializedNEW684_1205();
    spill684_364 = __stackOp684_1206_0;
    __explicitNewInit684_1207(__stackOp684_1206_0, true);
    __call684_1210(spill684_362, spill684_363, __call684_1209(__call684_1208(spill684_364, "fish"), 1));
    spill684_365 = __invokedynamic684_1211(10866, (6429936923250088492L ^ life0_3));
    spill684_366 = "dye";
    moom.xd __stackOp684_1213_0 = __sourceUninitializedNEW684_1212();
    spill684_367 = __stackOp684_1213_0;
    __explicitNewInit684_1214(__stackOp684_1213_0);
    __call684_1216(spill684_365, spill684_366, __call684_1215(spill684_367, "dyePowder"));
    spill684_368 = __invokedynamic684_1217(31436, (7918188782852934390L ^ life0_3));
    spill684_369 = "bone";
    net.minecraft.item.Item __stackOp684_1219_0 = __sourceUninitializedNEW684_1218();
    spill684_370 = __stackOp684_1219_0;
    __explicitNewInit684_1220(__stackOp684_1219_0);
    __call684_1225(spill684_368, spill684_369, __call684_1224(__call684_1222(__call684_1221(spill684_370, "bone")), __fieldRead684_1223()));
    spill684_371 = __invokedynamic684_1226(2889, (4564855578788756341L ^ life0_3));
    spill684_372 = "sugar";
    net.minecraft.item.Item __stackOp684_1228_0 = __sourceUninitializedNEW684_1227();
    spill684_373 = __stackOp684_1228_0;
    __explicitNewInit684_1229(__stackOp684_1228_0);
    __call684_1234(spill684_371, spill684_372, __call684_1233(__call684_1231(__call684_1230(spill684_373, "sugar"), "-0+1-2-3&4-4+13"), __fieldRead684_1232()));
    spill684_374 = __invokedynamic684_1235(22601, (4893917871887034470L ^ life0_3));
    spill684_375 = "cake";
    moom.xH __stackOp684_1237_0 = __sourceUninitializedNEW684_1236();
    spill684_376 = __stackOp684_1237_0;
    __explicitNewInit684_1239(__stackOp684_1237_0, __fieldRead684_1238());
    __call684_1244(spill684_374, spill684_375, __call684_1243(__call684_1241(__call684_1240(spill684_376, 1), "cake"), __fieldRead684_1242()));
    spill684_377 = __invokedynamic684_1245(25459, (2258492335311524863L ^ life0_3));
    spill684_378 = "bed";
    moom.wT __stackOp684_1247_0 = __sourceUninitializedNEW684_1246();
    spill684_379 = __stackOp684_1247_0;
    __explicitNewInit684_1248(__stackOp684_1247_0);
    __call684_1251(spill684_377, spill684_378, __call684_1250(__call684_1249(spill684_379, 1), "bed"));
    spill684_380 = __invokedynamic684_1252(29639, (5914456842325787586L ^ life0_3));
    spill684_381 = "repeater";
    moom.xH __stackOp684_1254_0 = __sourceUninitializedNEW684_1253();
    spill684_382 = __stackOp684_1254_0;
    __explicitNewInit684_1256(__stackOp684_1254_0, __fieldRead684_1255());
    __call684_1260(spill684_380, spill684_381, __call684_1259(__call684_1257(spill684_382, "diode"), __fieldRead684_1258()));
    spill684_383 = __invokedynamic684_1261(3380, (1565996013651164668L ^ life0_3));
    spill684_384 = "cookie";
    moom.xp __stackOp684_1263_0 = __sourceUninitializedNEW684_1262();
    spill684_385 = __stackOp684_1263_0;
    __explicitNewInit684_1264(__stackOp684_1263_0, 2, 0x1.99999ap-4f, false);
    __call684_1266(spill684_383, spill684_384, __call684_1265(spill684_385, "cookie"));
    spill684_386 = __invokedynamic684_1267(10383, (8747027679860512845L ^ life0_3));
    spill684_387 = "filled_map";
    moom.xA __stackOp684_1269_0 = __sourceUninitializedNEW684_1268();
    spill684_388 = __stackOp684_1269_0;
    __explicitNewInit684_1270(__stackOp684_1269_0);
    __call684_1272(spill684_386, spill684_387, __call684_1271(spill684_388, "map"));
    spill684_389 = __invokedynamic684_1273(29443, (4930745404247900943L ^ life0_3));
    spill684_390 = "shears";
    moom.xK __stackOp684_1275_0 = __sourceUninitializedNEW684_1274();
    spill684_391 = __stackOp684_1275_0;
    __explicitNewInit684_1276(__stackOp684_1275_0);
    __call684_1278(spill684_389, spill684_390, __call684_1277(spill684_391, "shears"));
    spill684_392 = __invokedynamic684_1279(32012, (4791919133397355845L ^ life0_3));
    spill684_393 = "melon";
    moom.xp __stackOp684_1281_0 = __sourceUninitializedNEW684_1280();
    spill684_394 = __stackOp684_1281_0;
    __explicitNewInit684_1282(__stackOp684_1281_0, 2, 0x1.333334p-2f, false);
    __call684_1284(spill684_392, spill684_393, __call684_1283(spill684_394, "melon"));
    spill684_395 = __invokedynamic684_1285(4828, (4829744756361650848L ^ life0_3));
    spill684_396 = "pumpkin_seeds";
    moom.xJ __stackOp684_1287_0 = __sourceUninitializedNEW684_1286();
    spill684_397 = __stackOp684_1287_0;
    __explicitNewInit684_1290(__stackOp684_1287_0, __fieldRead684_1288(), __fieldRead684_1289());
    __call684_1292(spill684_395, spill684_396, __call684_1291(spill684_397, "seeds_pumpkin"));
    spill684_398 = __invokedynamic684_1293(12932, (1705448804837900889L ^ life0_3));
    spill684_399 = "melon_seeds";
    moom.xJ __stackOp684_1295_0 = __sourceUninitializedNEW684_1294();
    spill684_400 = __stackOp684_1295_0;
    __explicitNewInit684_1298(__stackOp684_1295_0, __fieldRead684_1296(), __fieldRead684_1297());
    __call684_1300(spill684_398, spill684_399, __call684_1299(spill684_400, "seeds_melon"));
    spill684_401 = __invokedynamic684_1301(22974, (2899800405627218260L ^ life0_3));
    spill684_402 = "beef";
    moom.xp __stackOp684_1303_0 = __sourceUninitializedNEW684_1302();
    spill684_403 = __stackOp684_1303_0;
    __explicitNewInit684_1304(__stackOp684_1303_0, 3, 0x1.333334p-2f, true);
    __call684_1306(spill684_401, spill684_402, __call684_1305(spill684_403, "beefRaw"));
    spill684_404 = __invokedynamic684_1307(19484, (777167581994630256L ^ life0_3));
    spill684_405 = "cooked_beef";
    moom.xp __stackOp684_1309_0 = __sourceUninitializedNEW684_1308();
    spill684_406 = __stackOp684_1309_0;
    __explicitNewInit684_1311(__stackOp684_1309_0, __invokedynamic684_1310(22609, (1347430575897847993L ^ life0_3)), 0x1.99999ap-1f, true);
    __call684_1313(spill684_404, spill684_405, __call684_1312(spill684_406, "beefCooked"));
    spill684_407 = __invokedynamic684_1314(13971, (7149832355727132333L ^ life0_3));
    spill684_408 = "chicken";
    moom.xp __stackOp684_1316_0 = __sourceUninitializedNEW684_1315();
    spill684_409 = __stackOp684_1316_0;
    __explicitNewInit684_1317(__stackOp684_1316_0, 2, 0x1.333334p-2f, true);
    __call684_1323(spill684_407, spill684_408, __call684_1322(__call684_1321(spill684_409, __fieldRead684_1319(__fieldRead684_1318()), __invokedynamic684_1320(17562, (3441003737222231266L ^ life0_3)), 0, 0x1.333334p-2f), "chickenRaw"));
    spill684_410 = __invokedynamic684_1324(19414, (8431450587180415961L ^ life0_3));
    spill684_411 = "cooked_chicken";
    moom.xp __stackOp684_1326_0 = __sourceUninitializedNEW684_1325();
    spill684_412 = __stackOp684_1326_0;
    __explicitNewInit684_1328(__stackOp684_1326_0, __invokedynamic684_1327(27127, (159383747123911042L ^ life0_3)), 0x1.333334p-1f, true);
    __call684_1330(spill684_410, spill684_411, __call684_1329(spill684_412, "chickenCooked"));
    spill684_413 = __invokedynamic684_1331(13917, (7483214650552174212L ^ life0_3));
    spill684_414 = "rotten_flesh";
    moom.xp __stackOp684_1333_0 = __sourceUninitializedNEW684_1332();
    spill684_415 = __stackOp684_1333_0;
    __explicitNewInit684_1334(__stackOp684_1333_0, 4, 0x1.99999ap-4f, true);
    __call684_1340(spill684_413, spill684_414, __call684_1339(__call684_1338(spill684_415, __fieldRead684_1336(__fieldRead684_1335()), __invokedynamic684_1337(30517, (13936373317437250L ^ life0_3)), 0, 0x1.99999ap-1f), "rottenFlesh"));
    spill684_416 = __invokedynamic684_1341(3884, (5085092956263907295L ^ life0_3));
    spill684_417 = "ender_pearl";
    moom.xi __stackOp684_1343_0 = __sourceUninitializedNEW684_1342();
    spill684_418 = __stackOp684_1343_0;
    __explicitNewInit684_1344(__stackOp684_1343_0);
    __call684_1346(spill684_416, spill684_417, __call684_1345(spill684_418, "enderPearl"));
    spill684_419 = __invokedynamic684_1347(15126, (3995726436994632535L ^ life0_3));
    spill684_420 = "blaze_rod";
    net.minecraft.item.Item __stackOp684_1349_0 = __sourceUninitializedNEW684_1348();
    spill684_421 = __stackOp684_1349_0;
    __explicitNewInit684_1350(__stackOp684_1349_0);
    __call684_1355(spill684_419, spill684_420, __call684_1354(__call684_1353(__call684_1351(spill684_421, "blazeRod"), __fieldRead684_1352())));
    spill684_422 = __invokedynamic684_1356(3412, (1338125406524800367L ^ life0_3));
    spill684_423 = "ghast_tear";
    net.minecraft.item.Item __stackOp684_1358_0 = __sourceUninitializedNEW684_1357();
    spill684_424 = __stackOp684_1358_0;
    __explicitNewInit684_1359(__stackOp684_1358_0);
    __call684_1364(spill684_422, spill684_423, __call684_1363(__call684_1361(__call684_1360(spill684_424, "ghastTear"), "+0-1-2-3&4-4+13"), __fieldRead684_1362()));
    spill684_425 = __invokedynamic684_1365(49, (7647226831559389190L ^ life0_3));
    spill684_426 = "gold_nugget";
    net.minecraft.item.Item __stackOp684_1367_0 = __sourceUninitializedNEW684_1366();
    spill684_427 = __stackOp684_1367_0;
    __explicitNewInit684_1368(__stackOp684_1367_0);
    __call684_1372(spill684_425, spill684_426, __call684_1371(__call684_1369(spill684_427, "goldNugget"), __fieldRead684_1370()));
    spill684_428 = __invokedynamic684_1373(14832, (145328506070649305L ^ life0_3));
    spill684_429 = "nether_wart";
    moom.xJ __stackOp684_1375_0 = __sourceUninitializedNEW684_1374();
    spill684_430 = __stackOp684_1375_0;
    __explicitNewInit684_1378(__stackOp684_1375_0, __fieldRead684_1376(), __fieldRead684_1377());
    __call684_1381(spill684_428, spill684_429, __call684_1380(__call684_1379(spill684_430, "netherStalkSeeds"), "+4"));
    spill684_431 = __invokedynamic684_1382(29786, (180786945078854734L ^ life0_3));
    spill684_432 = "potion";
    net.minecraft.item.ItemPotion __stackOp684_1384_0 = __sourceUninitializedNEW684_1383();
    spill684_433 = __stackOp684_1384_0;
    __explicitNewInit684_1385(__stackOp684_1384_0);
    __call684_1387(spill684_431, spill684_432, __call684_1386(spill684_433, "potion"));
    spill684_434 = __invokedynamic684_1388(29502, (6565307764727448336L ^ life0_3));
    spill684_435 = "glass_bottle";
    moom.xu __stackOp684_1390_0 = __sourceUninitializedNEW684_1389();
    spill684_436 = __stackOp684_1390_0;
    __explicitNewInit684_1391(__stackOp684_1390_0);
    __call684_1393(spill684_434, spill684_435, __call684_1392(spill684_436, "glassBottle"));
    spill684_437 = __invokedynamic684_1394(26758, (880055796121770060L ^ life0_3));
    spill684_438 = "spider_eye";
    moom.xp __stackOp684_1396_0 = __sourceUninitializedNEW684_1395();
    spill684_439 = __stackOp684_1396_0;
    __explicitNewInit684_1397(__stackOp684_1396_0, 2, 0x1.99999ap-1f, false);
    __call684_1403(spill684_437, spill684_438, __call684_1402(__call684_1401(__call684_1400(spill684_439, __fieldRead684_1399(__fieldRead684_1398()), 5, 0, 0x1.0p0f), "spiderEye"), "-0-1+2-3&4-4+13"));
    spill684_440 = __invokedynamic684_1404(1553, (2562280420177245932L ^ life0_3));
    spill684_441 = "fermented_spider_eye";
    net.minecraft.item.Item __stackOp684_1406_0 = __sourceUninitializedNEW684_1405();
    spill684_442 = __stackOp684_1406_0;
    __explicitNewInit684_1407(__stackOp684_1406_0);
    __call684_1412(spill684_440, spill684_441, __call684_1411(__call684_1409(__call684_1408(spill684_442, "fermentedSpiderEye"), "-0+3-4+13"), __fieldRead684_1410()));
    spill684_443 = __invokedynamic684_1413(24133, (3468667968009973427L ^ life0_3));
    spill684_444 = "blaze_powder";
    net.minecraft.item.Item __stackOp684_1415_0 = __sourceUninitializedNEW684_1414();
    spill684_445 = __stackOp684_1415_0;
    __explicitNewInit684_1416(__stackOp684_1415_0);
    __call684_1421(spill684_443, spill684_444, __call684_1420(__call684_1418(__call684_1417(spill684_445, "blazePowder"), "+0-1-2+3&4-4+13"), __fieldRead684_1419()));
    spill684_446 = __invokedynamic684_1422(21741, (8503249436468225208L ^ life0_3));
    spill684_447 = "magma_cream";
    net.minecraft.item.Item __stackOp684_1424_0 = __sourceUninitializedNEW684_1423();
    spill684_448 = __stackOp684_1424_0;
    __explicitNewInit684_1425(__stackOp684_1424_0);
    __call684_1430(spill684_446, spill684_447, __call684_1429(__call684_1427(__call684_1426(spill684_448, "magmaCream"), "+0+1-2-3&4-4+13"), __fieldRead684_1428()));
    spill684_449 = __invokedynamic684_1431(32327, (3070682664279903747L ^ life0_3));
    spill684_450 = "brewing_stand";
    moom.xH __stackOp684_1433_0 = __sourceUninitializedNEW684_1432();
    spill684_451 = __stackOp684_1433_0;
    __explicitNewInit684_1435(__stackOp684_1433_0, __fieldRead684_1434());
    __call684_1439(spill684_449, spill684_450, __call684_1438(__call684_1436(spill684_451, "brewingStand"), __fieldRead684_1437()));
    spill684_452 = __invokedynamic684_1440(25291, (5539599829843546628L ^ life0_3));
    spill684_453 = "cauldron";
    moom.xH __stackOp684_1442_0 = __sourceUninitializedNEW684_1441();
    spill684_454 = __stackOp684_1442_0;
    __explicitNewInit684_1444(__stackOp684_1442_0, __fieldRead684_1443());
    __call684_1448(spill684_452, spill684_453, __call684_1447(__call684_1445(spill684_454, "cauldron"), __fieldRead684_1446()));
    spill684_455 = __invokedynamic684_1449(4441, (7444520677013512579L ^ life0_3));
    spill684_456 = "ender_eye";
    moom.xh __stackOp684_1451_0 = __sourceUninitializedNEW684_1450();
    spill684_457 = __stackOp684_1451_0;
    __explicitNewInit684_1452(__stackOp684_1451_0);
    __call684_1454(spill684_455, spill684_456, __call684_1453(spill684_457, "eyeOfEnder"));
    spill684_458 = __invokedynamic684_1455(7241, (1909694327323815066L ^ life0_3));
    spill684_459 = "speckled_melon";
    net.minecraft.item.Item __stackOp684_1457_0 = __sourceUninitializedNEW684_1456();
    spill684_460 = __stackOp684_1457_0;
    __explicitNewInit684_1458(__stackOp684_1457_0);
    __call684_1463(spill684_458, spill684_459, __call684_1462(__call684_1460(__call684_1459(spill684_460, "speckledMelon"), "+0-1+2-3&4-4+13"), __fieldRead684_1461()));
    spill684_461 = __invokedynamic684_1464(9664, (2917970300271777096L ^ life0_3));
    spill684_462 = "spawn_egg";
    moom.xC __stackOp684_1466_0 = __sourceUninitializedNEW684_1465();
    spill684_463 = __stackOp684_1466_0;
    __explicitNewInit684_1467(__stackOp684_1466_0);
    __call684_1469(spill684_461, spill684_462, __call684_1468(spill684_463, "monsterPlacer"));
    spill684_464 = __invokedynamic684_1470(24180, (8575861432561053271L ^ life0_3));
    spill684_465 = "experience_bottle";
    moom.xj __stackOp684_1472_0 = __sourceUninitializedNEW684_1471();
    spill684_466 = __stackOp684_1472_0;
    __explicitNewInit684_1473(__stackOp684_1472_0);
    __call684_1475(spill684_464, spill684_465, __call684_1474(spill684_466, "expBottle"));
    spill684_467 = __invokedynamic684_1476(13011, (4440282263374053889L ^ life0_3));
    spill684_468 = "fire_charge";
    moom.xk __stackOp684_1478_0 = __sourceUninitializedNEW684_1477();
    spill684_469 = __stackOp684_1478_0;
    __explicitNewInit684_1479(__stackOp684_1478_0);
    __call684_1481(spill684_467, spill684_468, __call684_1480(spill684_469, "fireball"));
    spill684_470 = __invokedynamic684_1482(21656, (6064485556976166072L ^ life0_3));
    spill684_471 = "writable_book";
    moom.xU __stackOp684_1484_0 = __sourceUninitializedNEW684_1483();
    spill684_472 = __stackOp684_1484_0;
    __explicitNewInit684_1485(__stackOp684_1484_0);
    __call684_1489(spill684_470, spill684_471, __call684_1488(__call684_1486(spill684_472, "writingBook"), __fieldRead684_1487()));
    spill684_473 = __invokedynamic684_1490(23476, (7238023506940865471L ^ life0_3));
    spill684_474 = "written_book";
    moom.xe __stackOp684_1492_0 = __sourceUninitializedNEW684_1491();
    spill684_475 = __stackOp684_1492_0;
    __explicitNewInit684_1493(__stackOp684_1492_0);
    __call684_1497(spill684_473, spill684_474, __call684_1496(__call684_1494(spill684_475, "writtenBook"), __invokedynamic684_1495(2199, (8288042390219683936L ^ life0_3))));
    spill684_476 = __invokedynamic684_1498(18974, (8608625497640090145L ^ life0_3));
    spill684_477 = "emerald";
    net.minecraft.item.Item __stackOp684_1500_0 = __sourceUninitializedNEW684_1499();
    spill684_478 = __stackOp684_1500_0;
    __explicitNewInit684_1501(__stackOp684_1500_0);
    __call684_1505(spill684_476, spill684_477, __call684_1504(__call684_1502(spill684_478, "emerald"), __fieldRead684_1503()));
    spill684_479 = __invokedynamic684_1506(15598, (3824675322664930519L ^ life0_3));
    spill684_480 = "item_frame";
    moom.xv __stackOp684_1508_0 = __sourceUninitializedNEW684_1507();
    spill684_481 = __stackOp684_1508_0;
    __explicitNewInit684_1510(__stackOp684_1508_0, __classLiteral684_1509());
    __call684_1512(spill684_479, spill684_480, __call684_1511(spill684_481, "frame"));
    spill684_482 = __invokedynamic684_1513(3088, (4988181625816218859L ^ life0_3));
    spill684_483 = "flower_pot";
    moom.xH __stackOp684_1515_0 = __sourceUninitializedNEW684_1514();
    spill684_484 = __stackOp684_1515_0;
    __explicitNewInit684_1517(__stackOp684_1515_0, __fieldRead684_1516());
    __call684_1521(spill684_482, spill684_483, __call684_1520(__call684_1518(spill684_484, "flowerPot"), __fieldRead684_1519()));
    spill684_485 = __invokedynamic684_1522(17649, (5842088772046206004L ^ life0_3));
    spill684_486 = "carrot";
    moom.xs __stackOp684_1524_0 = __sourceUninitializedNEW684_1523();
    spill684_487 = __stackOp684_1524_0;
    __explicitNewInit684_1527(__stackOp684_1524_0, 3, 0x1.333334p-1f, __fieldRead684_1525(), __fieldRead684_1526());
    __call684_1529(spill684_485, spill684_486, __call684_1528(spill684_487, "carrots"));
    spill684_488 = __invokedynamic684_1530(6886, (5523230766805543607L ^ life0_3));
    spill684_489 = "potato";
    moom.xs __stackOp684_1532_0 = __sourceUninitializedNEW684_1531();
    spill684_490 = __stackOp684_1532_0;
    __explicitNewInit684_1535(__stackOp684_1532_0, 1, 0x1.333334p-2f, __fieldRead684_1533(), __fieldRead684_1534());
    __call684_1537(spill684_488, spill684_489, __call684_1536(spill684_490, "potato"));
    spill684_491 = __invokedynamic684_1538(21626, (3655511556033782917L ^ life0_3));
    spill684_492 = "baked_potato";
    moom.xp __stackOp684_1540_0 = __sourceUninitializedNEW684_1539();
    spill684_493 = __stackOp684_1540_0;
    __explicitNewInit684_1541(__stackOp684_1540_0, 5, 0x1.333334p-1f, false);
    __call684_1543(spill684_491, spill684_492, __call684_1542(spill684_493, "potatoBaked"));
    spill684_494 = __invokedynamic684_1544(1299, (4603590149083100472L ^ life0_3));
    spill684_495 = "poisonous_potato";
    moom.xp __stackOp684_1546_0 = __sourceUninitializedNEW684_1545();
    spill684_496 = __stackOp684_1546_0;
    __explicitNewInit684_1547(__stackOp684_1546_0, 2, 0x1.333334p-2f, false);
    __call684_1552(spill684_494, spill684_495, __call684_1551(__call684_1550(spill684_496, __fieldRead684_1549(__fieldRead684_1548()), 5, 0, 0x1.333334p-1f), "potatoPoisonous"));
    spill684_497 = __invokedynamic684_1553(5552, (7296067407964562893L ^ life0_3));
    spill684_498 = "map";
    moom.xz __stackOp684_1555_0 = __sourceUninitializedNEW684_1554();
    spill684_499 = __stackOp684_1555_0;
    __explicitNewInit684_1556(__stackOp684_1555_0);
    __call684_1558(spill684_497, spill684_498, __call684_1557(spill684_499, "emptyMap"));
    spill684_500 = __invokedynamic684_1559(8591, (5096567457701220798L ^ life0_3));
    spill684_501 = "golden_carrot";
    moom.xp __stackOp684_1561_0 = __sourceUninitializedNEW684_1560();
    spill684_502 = __stackOp684_1561_0;
    __explicitNewInit684_1563(__stackOp684_1561_0, __invokedynamic684_1562(27127, (159383747123911042L ^ life0_3)), 0x1.333334p0f, false);
    __call684_1568(spill684_500, spill684_501, __call684_1567(__call684_1565(__call684_1564(spill684_502, "carrotGolden"), "-0+1+2-3+13&4-4"), __fieldRead684_1566()));
    spill684_503 = __invokedynamic684_1569(11332, (4961018000306396342L ^ life0_3));
    spill684_504 = "skull";
    net.minecraft.item.ItemSkull __stackOp684_1571_0 = __sourceUninitializedNEW684_1570();
    spill684_505 = __stackOp684_1571_0;
    __explicitNewInit684_1572(__stackOp684_1571_0);
    __call684_1574(spill684_503, spill684_504, __call684_1573(spill684_505, "skull"));
    spill684_506 = __invokedynamic684_1575(20743, (7659281475579650327L ^ life0_3));
    spill684_507 = "carrot_on_a_stick";
    moom.xa __stackOp684_1577_0 = __sourceUninitializedNEW684_1576();
    spill684_508 = __stackOp684_1577_0;
    __explicitNewInit684_1578(__stackOp684_1577_0);
    __call684_1580(spill684_506, spill684_507, __call684_1579(spill684_508, "carrotOnAStick"));
    spill684_509 = __invokedynamic684_1581(13661, (4504985884043494741L ^ life0_3));
    spill684_510 = "nether_star";
    net.minecraft.item.ItemSimpleFoiled __stackOp684_1583_0 = __sourceUninitializedNEW684_1582();
    spill684_511 = __stackOp684_1583_0;
    __explicitNewInit684_1584(__stackOp684_1583_0);
    __call684_1588(spill684_509, spill684_510, __call684_1587(__call684_1585(spill684_511, "netherStar"), __fieldRead684_1586()));
    spill684_512 = __invokedynamic684_1589(12321, (1611304644194811959L ^ life0_3));
    spill684_513 = "pumpkin_pie";
    moom.xp __stackOp684_1591_0 = __sourceUninitializedNEW684_1590();
    spill684_514 = __stackOp684_1591_0;
    __explicitNewInit684_1593(__stackOp684_1591_0, __invokedynamic684_1592(22609, (1347430575897847993L ^ life0_3)), 0x1.333334p-2f, false);
    __call684_1597(spill684_512, spill684_513, __call684_1596(__call684_1594(spill684_514, "pumpkinPie"), __fieldRead684_1595()));
    spill684_515 = __invokedynamic684_1598(19267, (3367237593515473690L ^ life0_3));
    spill684_516 = "fireworks";
    moom.xl __stackOp684_1600_0 = __sourceUninitializedNEW684_1599();
    spill684_517 = __stackOp684_1600_0;
    __explicitNewInit684_1601(__stackOp684_1600_0);
    __call684_1603(spill684_515, spill684_516, __call684_1602(spill684_517, "fireworks"));
    spill684_518 = __invokedynamic684_1604(19632, (4195760897998306453L ^ life0_3));
    spill684_519 = "firework_charge";
    moom.xm __stackOp684_1606_0 = __sourceUninitializedNEW684_1605();
    spill684_520 = __stackOp684_1606_0;
    __explicitNewInit684_1607(__stackOp684_1606_0);
    __call684_1611(spill684_518, spill684_519, __call684_1610(__call684_1608(spill684_520, "fireworksCharge"), __fieldRead684_1609()));
    spill684_521 = __invokedynamic684_1612(3237, (7974972558670527668L ^ life0_3));
    spill684_522 = "enchanted_book";
    moom.xg __stackOp684_1614_0 = __sourceUninitializedNEW684_1613();
    spill684_523 = __stackOp684_1614_0;
    __explicitNewInit684_1615(__stackOp684_1614_0);
    __call684_1618(spill684_521, spill684_522, __call684_1617(__call684_1616(spill684_523, 1), "enchantedBook"));
    spill684_524 = __invokedynamic684_1619(19208, (5653285358345993073L ^ life0_3));
    spill684_525 = "comparator";
    moom.xH __stackOp684_1621_0 = __sourceUninitializedNEW684_1620();
    spill684_526 = __stackOp684_1621_0;
    __explicitNewInit684_1623(__stackOp684_1621_0, __fieldRead684_1622());
    __call684_1627(spill684_524, spill684_525, __call684_1626(__call684_1624(spill684_526, "comparator"), __fieldRead684_1625()));
    spill684_527 = __invokedynamic684_1628(21733, (6853887878212428934L ^ life0_3));
    spill684_528 = "netherbrick";
    net.minecraft.item.Item __stackOp684_1630_0 = __sourceUninitializedNEW684_1629();
    spill684_529 = __stackOp684_1630_0;
    __explicitNewInit684_1631(__stackOp684_1630_0);
    __call684_1635(spill684_527, spill684_528, __call684_1634(__call684_1632(spill684_529, "netherbrick"), __fieldRead684_1633()));
    spill684_530 = __invokedynamic684_1636(6175, (5156801655304874225L ^ life0_3));
    spill684_531 = "quartz";
    net.minecraft.item.Item __stackOp684_1638_0 = __sourceUninitializedNEW684_1637();
    spill684_532 = __stackOp684_1638_0;
    __explicitNewInit684_1639(__stackOp684_1638_0);
    __call684_1643(spill684_530, spill684_531, __call684_1642(__call684_1640(spill684_532, "netherquartz"), __fieldRead684_1641()));
    spill684_533 = __invokedynamic684_1644(21521, (5736864465176536314L ^ life0_3));
    spill684_534 = "tnt_minecart";
    moom.xB __stackOp684_1646_0 = __sourceUninitializedNEW684_1645();
    spill684_535 = __stackOp684_1646_0;
    __explicitNewInit684_1648(__stackOp684_1646_0, __fieldRead684_1647());
    __call684_1650(spill684_533, spill684_534, __call684_1649(spill684_535, "minecartTnt"));
    spill684_536 = __invokedynamic684_1651(11737, (7465569562856217995L ^ life0_3));
    spill684_537 = "hopper_minecart";
    moom.xB __stackOp684_1653_0 = __sourceUninitializedNEW684_1652();
    spill684_538 = __stackOp684_1653_0;
    __explicitNewInit684_1655(__stackOp684_1653_0, __fieldRead684_1654());
    __call684_1657(spill684_536, spill684_537, __call684_1656(spill684_538, "minecartHopper"));
    spill684_539 = __invokedynamic684_1658(9047, (968046158856049591L ^ life0_3));
    spill684_540 = "prismarine_shard";
    net.minecraft.item.Item __stackOp684_1660_0 = __sourceUninitializedNEW684_1659();
    spill684_541 = __stackOp684_1660_0;
    __explicitNewInit684_1661(__stackOp684_1660_0);
    __call684_1665(spill684_539, spill684_540, __call684_1664(__call684_1662(spill684_541, "prismarineShard"), __fieldRead684_1663()));
    spill684_542 = __invokedynamic684_1666(30069, (660103664128427325L ^ life0_3));
    spill684_543 = "prismarine_crystals";
    net.minecraft.item.Item __stackOp684_1668_0 = __sourceUninitializedNEW684_1667();
    spill684_544 = __stackOp684_1668_0;
    __explicitNewInit684_1669(__stackOp684_1668_0);
    __call684_1673(spill684_542, spill684_543, __call684_1672(__call684_1670(spill684_544, "prismarineCrystals"), __fieldRead684_1671()));
    spill684_545 = __invokedynamic684_1674(12906, (4988431262497522405L ^ life0_3));
    spill684_546 = "rabbit";
    moom.xp __stackOp684_1676_0 = __sourceUninitializedNEW684_1675();
    spill684_547 = __stackOp684_1676_0;
    __explicitNewInit684_1677(__stackOp684_1676_0, 3, 0x1.333334p-2f, true);
    __call684_1679(spill684_545, spill684_546, __call684_1678(spill684_547, "rabbitRaw"));
    spill684_548 = __invokedynamic684_1680(22741, (235785673463638175L ^ life0_3));
    spill684_549 = "cooked_rabbit";
    moom.xp __stackOp684_1682_0 = __sourceUninitializedNEW684_1681();
    spill684_550 = __stackOp684_1682_0;
    __explicitNewInit684_1683(__stackOp684_1682_0, 5, 0x1.333334p-1f, true);
    __call684_1685(spill684_548, spill684_549, __call684_1684(spill684_550, "rabbitCooked"));
    spill684_551 = __invokedynamic684_1686(26934, (316029230092917108L ^ life0_3));
    spill684_552 = "rabbit_stew";
    moom.xt __stackOp684_1688_0 = __sourceUninitializedNEW684_1687();
    spill684_553 = __stackOp684_1688_0;
    __explicitNewInit684_1690(__stackOp684_1688_0, __invokedynamic684_1689(16770, (6234566607849009609L ^ life0_3)));
    __call684_1692(spill684_551, spill684_552, __call684_1691(spill684_553, "rabbitStew"));
    spill684_554 = __invokedynamic684_1693(24592, (4662607563500622045L ^ life0_3));
    spill684_555 = "rabbit_foot";
    net.minecraft.item.Item __stackOp684_1695_0 = __sourceUninitializedNEW684_1694();
    spill684_556 = __stackOp684_1695_0;
    __explicitNewInit684_1696(__stackOp684_1695_0);
    __call684_1701(spill684_554, spill684_555, __call684_1700(__call684_1698(__call684_1697(spill684_556, "rabbitFoot"), "+0+1-2+3&4-4+13"), __fieldRead684_1699()));
    spill684_557 = __invokedynamic684_1702(20376, (3626874479656386553L ^ life0_3));
    spill684_558 = "rabbit_hide";
    net.minecraft.item.Item __stackOp684_1704_0 = __sourceUninitializedNEW684_1703();
    spill684_559 = __stackOp684_1704_0;
    __explicitNewInit684_1705(__stackOp684_1704_0);
    __call684_1709(spill684_557, spill684_558, __call684_1708(__call684_1706(spill684_559, "rabbitHide"), __fieldRead684_1707()));
    spill684_560 = __invokedynamic684_1710(3614, (7210502274256830165L ^ life0_3));
    spill684_561 = "armor_stand";
    moom.wS __stackOp684_1712_0 = __sourceUninitializedNEW684_1711();
    spill684_562 = __stackOp684_1712_0;
    __explicitNewInit684_1713(__stackOp684_1712_0);
    __call684_1717(spill684_560, spill684_561, __call684_1716(__call684_1714(spill684_562, "armorStand"), __invokedynamic684_1715(2199, (8288042390219683936L ^ life0_3))));
    spill684_563 = __invokedynamic684_1718(32410, (6491527805617049301L ^ life0_3));
    spill684_564 = "iron_horse_armor";
    net.minecraft.item.Item __stackOp684_1720_0 = __sourceUninitializedNEW684_1719();
    spill684_565 = __stackOp684_1720_0;
    __explicitNewInit684_1721(__stackOp684_1720_0);
    __call684_1726(spill684_563, spill684_564, __call684_1725(__call684_1723(__call684_1722(spill684_565, "horsearmormetal"), 1), __fieldRead684_1724()));
    spill684_566 = __invokedynamic684_1727(29734, (8979999982705870035L ^ life0_3));
    spill684_567 = "golden_horse_armor";
    net.minecraft.item.Item __stackOp684_1729_0 = __sourceUninitializedNEW684_1728();
    spill684_568 = __stackOp684_1729_0;
    __explicitNewInit684_1730(__stackOp684_1729_0);
    __call684_1735(spill684_566, spill684_567, __call684_1734(__call684_1732(__call684_1731(spill684_568, "horsearmorgold"), 1), __fieldRead684_1733()));
    spill684_569 = __invokedynamic684_1736(8857, (7953479030201733885L ^ life0_3));
    spill684_570 = "diamond_horse_armor";
    net.minecraft.item.Item __stackOp684_1738_0 = __sourceUninitializedNEW684_1737();
    spill684_571 = __stackOp684_1738_0;
    __explicitNewInit684_1739(__stackOp684_1738_0);
    __call684_1744(spill684_569, spill684_570, __call684_1743(__call684_1741(__call684_1740(spill684_571, "horsearmordiamond"), 1), __fieldRead684_1742()));
    spill684_572 = __invokedynamic684_1745(13034, (2642513099680236242L ^ life0_3));
    spill684_573 = "lead";
    moom.xx __stackOp684_1747_0 = __sourceUninitializedNEW684_1746();
    spill684_574 = __stackOp684_1747_0;
    __explicitNewInit684_1748(__stackOp684_1747_0);
    __call684_1750(spill684_572, spill684_573, __call684_1749(spill684_574, "leash"));
    spill684_575 = __invokedynamic684_1751(23638, (9036513200659278887L ^ life0_3));
    spill684_576 = "name_tag";
    moom.xD __stackOp684_1753_0 = __sourceUninitializedNEW684_1752();
    spill684_577 = __stackOp684_1753_0;
    __explicitNewInit684_1754(__stackOp684_1753_0);
    __call684_1756(spill684_575, spill684_576, __call684_1755(spill684_577, "nameTag"));
    spill684_578 = __invokedynamic684_1757(30611, (8253149388478351267L ^ life0_3));
    spill684_579 = "command_block_minecart";
    moom.xB __stackOp684_1759_0 = __sourceUninitializedNEW684_1758();
    spill684_580 = __stackOp684_1759_0;
    __explicitNewInit684_1761(__stackOp684_1759_0, __fieldRead684_1760());
    __call684_1764(spill684_578, spill684_579, __call684_1763(__call684_1762(spill684_580, "minecartCommandBlock"), null));
    spill684_581 = __invokedynamic684_1765(32699, (9175177613605048264L ^ life0_3));
    spill684_582 = "mutton";
    moom.xp __stackOp684_1767_0 = __sourceUninitializedNEW684_1766();
    spill684_583 = __stackOp684_1767_0;
    __explicitNewInit684_1768(__stackOp684_1767_0, 2, 0x1.333334p-2f, true);
    __call684_1770(spill684_581, spill684_582, __call684_1769(spill684_583, "muttonRaw"));
    spill684_584 = __invokedynamic684_1771(1014, (7714192118006838055L ^ life0_3));
    spill684_585 = "cooked_mutton";
    moom.xp __stackOp684_1773_0 = __sourceUninitializedNEW684_1772();
    spill684_586 = __stackOp684_1773_0;
    __explicitNewInit684_1775(__stackOp684_1773_0, __invokedynamic684_1774(27127, (159383747123911042L ^ life0_3)), 0x1.99999ap-1f, true);
    __call684_1777(spill684_584, spill684_585, __call684_1776(spill684_586, "muttonCooked"));
    spill684_587 = __invokedynamic684_1778(9279, (6975493502200927288L ^ life0_3));
    spill684_588 = "banner";
    moom.wV __stackOp684_1780_0 = __sourceUninitializedNEW684_1779();
    spill684_589 = __stackOp684_1780_0;
    __explicitNewInit684_1781(__stackOp684_1780_0);
    __call684_1783(spill684_587, spill684_588, __call684_1782(spill684_589, "banner"));
    spill684_590 = __invokedynamic684_1784(16919, (3272379078520550128L ^ life0_3));
    spill684_591 = "spruce_door";
    moom.xc __stackOp684_1786_0 = __sourceUninitializedNEW684_1785();
    spill684_592 = __stackOp684_1786_0;
    __explicitNewInit684_1788(__stackOp684_1786_0, __fieldRead684_1787());
    __call684_1790(spill684_590, spill684_591, __call684_1789(spill684_592, "doorSpruce"));
    spill684_593 = __invokedynamic684_1791(25341, (4546725369158308592L ^ life0_3));
    spill684_594 = "birch_door";
    moom.xc __stackOp684_1793_0 = __sourceUninitializedNEW684_1792();
    spill684_595 = __stackOp684_1793_0;
    __explicitNewInit684_1795(__stackOp684_1793_0, __fieldRead684_1794());
    __call684_1797(spill684_593, spill684_594, __call684_1796(spill684_595, "doorBirch"));
    spill684_596 = __invokedynamic684_1798(15644, (216443171746794773L ^ life0_3));
    spill684_597 = "jungle_door";
    moom.xc __stackOp684_1800_0 = __sourceUninitializedNEW684_1799();
    spill684_598 = __stackOp684_1800_0;
    __explicitNewInit684_1802(__stackOp684_1800_0, __fieldRead684_1801());
    __call684_1804(spill684_596, spill684_597, __call684_1803(spill684_598, "doorJungle"));
    spill684_599 = __invokedynamic684_1805(25261, (8643835302829003513L ^ life0_3));
    spill684_600 = "acacia_door";
    moom.xc __stackOp684_1807_0 = __sourceUninitializedNEW684_1806();
    spill684_601 = __stackOp684_1807_0;
    __explicitNewInit684_1809(__stackOp684_1807_0, __fieldRead684_1808());
    __call684_1811(spill684_599, spill684_600, __call684_1810(spill684_601, "doorAcacia"));
    spill684_602 = __invokedynamic684_1812(30129, (5325658925746292190L ^ life0_3));
    spill684_603 = "dark_oak_door";
    moom.xc __stackOp684_1814_0 = __sourceUninitializedNEW684_1813();
    spill684_604 = __stackOp684_1814_0;
    __explicitNewInit684_1816(__stackOp684_1814_0, __fieldRead684_1815());
    __call684_1818(spill684_602, spill684_603, __call684_1817(spill684_604, "doorDarkOak"));
    spill684_605 = __invokedynamic684_1819(586, (7573881778883752521L ^ life0_3));
    spill684_606 = "record_13";
    moom.xF __stackOp684_1821_0 = __sourceUninitializedNEW684_1820();
    spill684_607 = __stackOp684_1821_0;
    __explicitNewInit684_1822(__stackOp684_1821_0, "13");
    __call684_1824(spill684_605, spill684_606, __call684_1823(spill684_607, "record"));
    spill684_608 = __invokedynamic684_1825(16248, (8527793552327921556L ^ life0_3));
    spill684_609 = "record_cat";
    moom.xF __stackOp684_1827_0 = __sourceUninitializedNEW684_1826();
    spill684_610 = __stackOp684_1827_0;
    __explicitNewInit684_1828(__stackOp684_1827_0, "cat");
    __call684_1830(spill684_608, spill684_609, __call684_1829(spill684_610, "record"));
    spill684_611 = __invokedynamic684_1831(8896, (8636744395607364097L ^ life0_3));
    spill684_612 = "record_blocks";
    moom.xF __stackOp684_1833_0 = __sourceUninitializedNEW684_1832();
    spill684_613 = __stackOp684_1833_0;
    __explicitNewInit684_1834(__stackOp684_1833_0, "blocks");
    __call684_1836(spill684_611, spill684_612, __call684_1835(spill684_613, "record"));
    spill684_614 = __invokedynamic684_1837(15738, (2764927726180027833L ^ life0_3));
    spill684_615 = "record_chirp";
    moom.xF __stackOp684_1839_0 = __sourceUninitializedNEW684_1838();
    spill684_616 = __stackOp684_1839_0;
    __explicitNewInit684_1840(__stackOp684_1839_0, "chirp");
    __call684_1842(spill684_614, spill684_615, __call684_1841(spill684_616, "record"));
    spill684_617 = __invokedynamic684_1843(23360, (8350073400845609790L ^ life0_3));
    spill684_618 = "record_far";
    moom.xF __stackOp684_1845_0 = __sourceUninitializedNEW684_1844();
    spill684_619 = __stackOp684_1845_0;
    __explicitNewInit684_1846(__stackOp684_1845_0, "far");
    __call684_1848(spill684_617, spill684_618, __call684_1847(spill684_619, "record"));
    spill684_620 = __invokedynamic684_1849(21335, (1389228492944450416L ^ life0_3));
    spill684_621 = "record_mall";
    moom.xF __stackOp684_1851_0 = __sourceUninitializedNEW684_1850();
    spill684_622 = __stackOp684_1851_0;
    __explicitNewInit684_1852(__stackOp684_1851_0, "mall");
    __call684_1854(spill684_620, spill684_621, __call684_1853(spill684_622, "record"));
    spill684_623 = __invokedynamic684_1855(14765, (8594375190019656107L ^ life0_3));
    spill684_624 = "record_mellohi";
    moom.xF __stackOp684_1857_0 = __sourceUninitializedNEW684_1856();
    spill684_625 = __stackOp684_1857_0;
    __explicitNewInit684_1858(__stackOp684_1857_0, "mellohi");
    __call684_1860(spill684_623, spill684_624, __call684_1859(spill684_625, "record"));
    spill684_626 = __invokedynamic684_1861(27609, (6624958556474940208L ^ life0_3));
    spill684_627 = "record_stal";
    moom.xF __stackOp684_1863_0 = __sourceUninitializedNEW684_1862();
    spill684_628 = __stackOp684_1863_0;
    __explicitNewInit684_1864(__stackOp684_1863_0, "stal");
    __call684_1866(spill684_626, spill684_627, __call684_1865(spill684_628, "record"));
    spill684_629 = __invokedynamic684_1867(24176, (5329467401615879929L ^ life0_3));
    spill684_630 = "record_strad";
    moom.xF __stackOp684_1869_0 = __sourceUninitializedNEW684_1868();
    spill684_631 = __stackOp684_1869_0;
    __explicitNewInit684_1870(__stackOp684_1869_0, "strad");
    __call684_1872(spill684_629, spill684_630, __call684_1871(spill684_631, "record"));
    spill684_632 = __invokedynamic684_1873(18742, (8743648292220123394L ^ life0_3));
    spill684_633 = "record_ward";
    moom.xF __stackOp684_1875_0 = __sourceUninitializedNEW684_1874();
    spill684_634 = __stackOp684_1875_0;
    __explicitNewInit684_1876(__stackOp684_1875_0, "ward");
    __call684_1878(spill684_632, spill684_633, __call684_1877(spill684_634, "record"));
    spill684_635 = __invokedynamic684_1879(6668, (5696870136367835863L ^ life0_3));
    spill684_636 = "record_11";
    moom.xF __stackOp684_1881_0 = __sourceUninitializedNEW684_1880();
    spill684_637 = __stackOp684_1881_0;
    __explicitNewInit684_1882(__stackOp684_1881_0, "11");
    __call684_1884(spill684_635, spill684_636, __call684_1883(spill684_637, "record"));
    spill684_638 = __invokedynamic684_1885(31927, (602150275521580274L ^ life0_3));
    spill684_639 = "record_wait";
    moom.xF __stackOp684_1887_0 = __sourceUninitializedNEW684_1886();
    spill684_640 = __stackOp684_1887_0;
    __explicitNewInit684_1888(__stackOp684_1887_0, "wait");
    __call684_1890(spill684_638, spill684_639, __call684_1889(spill684_640, "record"));
    if (!((life2_1326 != 0))) {
        break forest_join_3282;
    }
    __call684_1891(new java.lang.String[5]);
    }
    return;
}
public static void h684_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3068400_0(p0);
}
private static native long __fieldRead684_0() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_2() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_4() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_5() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_6() throws Throwable;
private static native void __explicitNewInit684_7(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_8(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_9(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native moom.dC __fieldRead684_10() throws Throwable;
private static native moom.wX __sourceUninitializedNEW684_11() throws Throwable;
private static native moom.dC __fieldRead684_13() throws Throwable;
private static native void __explicitNewInit684_14(moom.wX a0, net.minecraft.block.Block a1, boolean a2) throws Throwable;
private static native void __call684_15(moom.dC a0, moom.wX a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_16() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_17() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_19() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_20() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_21() throws Throwable;
private static native void __explicitNewInit684_22(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_23(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_24(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_25() throws Throwable;
private static native void __call684_26(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_27() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_28() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_30() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_31() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_32() throws Throwable;
private static native void __explicitNewInit684_33(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_34(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_35(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_36() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_37() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_39() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_40() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_41() throws Throwable;
private static native void __explicitNewInit684_42(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_43(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_44(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_45() throws Throwable;
private static native void __call684_46(net.minecraft.block.Block a0) throws Throwable;
private static native moom.dx __fieldRead684_47() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_48() throws Throwable;
private static native moom.dx __fieldRead684_50() throws Throwable;
private static native moom.dx __fieldRead684_51() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_52() throws Throwable;
private static native void __explicitNewInit684_53(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_54(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_55(moom.dx a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_56() throws Throwable;
private static native void __call684_57(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_58() throws Throwable;
private static native void __call684_59(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_60() throws Throwable;
private static native void __call684_61(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_62() throws Throwable;
private static native void __call684_63(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_64() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_65() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_67() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_68() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_69() throws Throwable;
private static native void __explicitNewInit684_70(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_71(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_72(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_73() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_74() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_76() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_77() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_78() throws Throwable;
private static native void __explicitNewInit684_79(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_80(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_81(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native moom.dH __fieldRead684_82() throws Throwable;
private static native moom.wZ __sourceUninitializedNEW684_83() throws Throwable;
private static native moom.dH __fieldRead684_85() throws Throwable;
private static native void __explicitNewInit684_86(moom.wZ a0, moom.dH a1) throws Throwable;
private static native moom.wU __call684_87(moom.wZ a0, java.lang.String a1) throws Throwable;
private static native void __call684_88(moom.dH a0, moom.wU a1) throws Throwable;
private static native moom.dH __fieldRead684_89() throws Throwable;
private static native moom.wZ __sourceUninitializedNEW684_90() throws Throwable;
private static native moom.dH __fieldRead684_92() throws Throwable;
private static native void __explicitNewInit684_93(moom.wZ a0, moom.dH a1) throws Throwable;
private static native moom.wU __call684_94(moom.wZ a0, java.lang.String a1) throws Throwable;
private static native void __call684_95(moom.dH a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_96() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_97() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_99() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_100() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_101() throws Throwable;
private static native void __explicitNewInit684_102(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_103(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_104(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_105() throws Throwable;
private static native void __call684_106(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_107() throws Throwable;
private static native void __call684_108(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_109() throws Throwable;
private static native void __call684_110(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_111() throws Throwable;
private static native void __call684_112(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_113() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_114() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_116() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_117() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_118() throws Throwable;
private static native void __explicitNewInit684_119(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_120(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_121(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_122() throws Throwable;
private static native void __call684_123(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_124() throws Throwable;
private static native void __call684_125(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_126() throws Throwable;
private static native void __call684_127(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.BlockPistonBase __fieldRead684_128() throws Throwable;
private static native moom.w3 __sourceUninitializedNEW684_129() throws Throwable;
private static native net.minecraft.block.BlockPistonBase __fieldRead684_131() throws Throwable;
private static native void __explicitNewInit684_132(moom.w3 a0, net.minecraft.block.Block a1) throws Throwable;
private static native void __call684_133(net.minecraft.block.BlockPistonBase a0, moom.w3 a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_134() throws Throwable;
private static native void __call684_135(net.minecraft.block.Block a0) throws Throwable;
private static native moom.cI __fieldRead684_136() throws Throwable;
private static native moom.wX __sourceUninitializedNEW684_137() throws Throwable;
private static native moom.cI __fieldRead684_139() throws Throwable;
private static native void __explicitNewInit684_140(moom.wX a0, net.minecraft.block.Block a1, boolean a2) throws Throwable;
private static native moom.wX __call684_144(moom.wX a0, java.lang.String[] a1) throws Throwable;
private static native void __call684_145(moom.cI a0, moom.wX a1) throws Throwable;
private static native moom.cy __fieldRead684_146() throws Throwable;
private static native void __call684_147(moom.cy a0) throws Throwable;
private static native net.minecraft.block.BlockPistonBase __fieldRead684_148() throws Throwable;
private static native moom.w3 __sourceUninitializedNEW684_149() throws Throwable;
private static native net.minecraft.block.BlockPistonBase __fieldRead684_151() throws Throwable;
private static native void __explicitNewInit684_152(moom.w3 a0, net.minecraft.block.Block a1) throws Throwable;
private static native void __call684_153(net.minecraft.block.BlockPistonBase a0, moom.w3 a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_154() throws Throwable;
private static native moom.wW __sourceUninitializedNEW684_155() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_157() throws Throwable;
private static native void __explicitNewInit684_158(moom.wW a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.wU __call684_159(moom.wW a0, java.lang.String a1) throws Throwable;
private static native void __call684_160(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native moom.cA __fieldRead684_161() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_162() throws Throwable;
private static native moom.cA __fieldRead684_164() throws Throwable;
private static native moom.cA __fieldRead684_165() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_166() throws Throwable;
private static native void __explicitNewInit684_167(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_168(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_169(moom.cA a0, moom.wU a1) throws Throwable;
private static native moom.cA __fieldRead684_170() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_171() throws Throwable;
private static native moom.cA __fieldRead684_173() throws Throwable;
private static native moom.cA __fieldRead684_174() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_175() throws Throwable;
private static native void __explicitNewInit684_176(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_177(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_178(moom.cA a0, moom.wU a1) throws Throwable;
private static native moom.cu __fieldRead684_179() throws Throwable;
private static native void __call684_180(moom.cu a0) throws Throwable;
private static native moom.cu __fieldRead684_181() throws Throwable;
private static native void __call684_182(moom.cu a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_183() throws Throwable;
private static native void __call684_184(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_185() throws Throwable;
private static native void __call684_186(net.minecraft.block.Block a0) throws Throwable;
private static native moom.ei __fieldRead684_187() throws Throwable;
private static native moom.w4 __sourceUninitializedNEW684_188() throws Throwable;
private static native moom.ei __fieldRead684_190() throws Throwable;
private static native moom.ei __fieldRead684_191() throws Throwable;
private static native moom.ei __fieldRead684_192() throws Throwable;
private static native void __explicitNewInit684_193(moom.w4 a0, net.minecraft.block.Block a1, moom.ei a2, moom.ei a3) throws Throwable;
private static native moom.wU __call684_194(moom.w4 a0, java.lang.String a1) throws Throwable;
private static native void __call684_195(moom.ei a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_196() throws Throwable;
private static native void __call684_197(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_198() throws Throwable;
private static native void __call684_199(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_200() throws Throwable;
private static native void __call684_201(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_202() throws Throwable;
private static native void __call684_203(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_204() throws Throwable;
private static native void __call684_205(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_206() throws Throwable;
private static native void __call684_207(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_208() throws Throwable;
private static native void __call684_209(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_210() throws Throwable;
private static native void __call684_211(net.minecraft.block.Block a0) throws Throwable;
private static native moom.cZ __fieldRead684_212() throws Throwable;
private static native void __call684_213(moom.cZ a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_214() throws Throwable;
private static native void __call684_215(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_216() throws Throwable;
private static native void __call684_217(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_218() throws Throwable;
private static native void __call684_219(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_220() throws Throwable;
private static native void __call684_221(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_222() throws Throwable;
private static native void __call684_223(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_224() throws Throwable;
private static native void __call684_225(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_226() throws Throwable;
private static native void __call684_227(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_228() throws Throwable;
private static native void __call684_229(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_230() throws Throwable;
private static native void __call684_231(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_232() throws Throwable;
private static native void __call684_233(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_234() throws Throwable;
private static native void __call684_235(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_236() throws Throwable;
private static native void __call684_237(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_238() throws Throwable;
private static native void __call684_239(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_240() throws Throwable;
private static native void __call684_241(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_242() throws Throwable;
private static native void __call684_243(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_244() throws Throwable;
private static native moom.w5 __sourceUninitializedNEW684_245() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_247() throws Throwable;
private static native void __explicitNewInit684_248(moom.w5 a0, net.minecraft.block.Block a1) throws Throwable;
private static native void __call684_249(net.minecraft.block.Block a0, moom.w5 a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_250() throws Throwable;
private static native void __call684_251(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_252() throws Throwable;
private static native void __call684_253(net.minecraft.block.Block a0) throws Throwable;
private static native moom.cM __fieldRead684_254() throws Throwable;
private static native void __call684_255(moom.cM a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_256() throws Throwable;
private static native void __call684_257(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_258() throws Throwable;
private static native void __call684_259(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_260() throws Throwable;
private static native void __call684_261(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_262() throws Throwable;
private static native void __call684_263(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_264() throws Throwable;
private static native void __call684_265(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call684_266() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_267() throws Throwable;
private static native void __call684_268(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_269() throws Throwable;
private static native void __call684_270(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_271() throws Throwable;
private static native void __call684_272(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_273() throws Throwable;
private static native void __call684_274(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_275() throws Throwable;
private static native void __call684_276(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_277() throws Throwable;
private static native void __call684_278(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_279() throws Throwable;
private static native void __call684_280(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_281() throws Throwable;
private static native void __call684_282(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_283() throws Throwable;
private static native void __call684_284(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_285() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_286() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_288() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_289() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_290() throws Throwable;
private static native void __explicitNewInit684_291(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_292(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_293(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_294() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_295() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_297() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_298() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_299() throws Throwable;
private static native void __explicitNewInit684_300(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_301(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_302(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_303() throws Throwable;
private static native void __call684_304(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_305() throws Throwable;
private static native void __call684_306(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_307() throws Throwable;
private static native void __call684_308(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_309() throws Throwable;
private static native void __call684_310(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_311() throws Throwable;
private static native void __call684_312(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_313() throws Throwable;
private static native moom.wX __sourceUninitializedNEW684_314() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_316() throws Throwable;
private static native void __explicitNewInit684_317(moom.wX a0, net.minecraft.block.Block a1, boolean a2) throws Throwable;
private static native void __call684_318(net.minecraft.block.Block a0, moom.wX a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_319() throws Throwable;
private static native void __call684_320(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_321() throws Throwable;
private static native void __call684_322(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_323() throws Throwable;
private static native void __call684_324(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_325() throws Throwable;
private static native void __call684_326(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_327() throws Throwable;
private static native void __call684_328(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_329() throws Throwable;
private static native void __call684_330(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_331() throws Throwable;
private static native void __call684_332(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_333() throws Throwable;
private static native void __call684_334(net.minecraft.block.Block a0) throws Throwable;
private static native moom.dP __fieldRead684_335() throws Throwable;
private static native void __call684_336(moom.dP a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_337() throws Throwable;
private static native moom.wY __sourceUninitializedNEW684_338() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_340() throws Throwable;
private static native void __explicitNewInit684_341(moom.wY a0, net.minecraft.block.Block a1) throws Throwable;
private static native void __call684_342(net.minecraft.block.Block a0, moom.wY a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_343() throws Throwable;
private static native void __call684_344(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_345() throws Throwable;
private static native void __call684_346(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_347() throws Throwable;
private static native void __call684_348(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_349() throws Throwable;
private static native void __call684_350(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_351() throws Throwable;
private static native void __call684_352(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_353() throws Throwable;
private static native void __call684_354(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_355() throws Throwable;
private static native void __call684_356(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_357() throws Throwable;
private static native void __call684_358(net.minecraft.block.Block a0) throws Throwable;
private static native moom.ei __fieldRead684_359() throws Throwable;
private static native moom.w4 __sourceUninitializedNEW684_360() throws Throwable;
private static native moom.ei __fieldRead684_362() throws Throwable;
private static native moom.ei __fieldRead684_363() throws Throwable;
private static native moom.ei __fieldRead684_364() throws Throwable;
private static native void __explicitNewInit684_365(moom.w4 a0, net.minecraft.block.Block a1, moom.ei a2, moom.ei a3) throws Throwable;
private static native moom.wU __call684_366(moom.w4 a0, java.lang.String a1) throws Throwable;
private static native void __call684_367(moom.ei a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_368() throws Throwable;
private static native void __call684_369(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_370() throws Throwable;
private static native void __call684_371(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_372() throws Throwable;
private static native void __call684_373(net.minecraft.block.Block a0) throws Throwable;
private static native moom.eE __fieldRead684_374() throws Throwable;
private static native void __call684_375(moom.eE a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_376() throws Throwable;
private static native void __call684_377(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_378() throws Throwable;
private static native void __call684_379(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_380() throws Throwable;
private static native void __call684_381(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_382() throws Throwable;
private static native void __call684_383(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_384() throws Throwable;
private static native void __call684_385(net.minecraft.block.Block a0) throws Throwable;
private static native moom.cX __fieldRead684_386() throws Throwable;
private static native void __call684_387(moom.cX a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_388() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_389() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_391() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_392() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_393() throws Throwable;
private static native void __explicitNewInit684_394(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_395(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_396(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_397() throws Throwable;
private static native void __call684_398(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_399() throws Throwable;
private static native net.minecraft.item.ItemAnvilBlock __sourceUninitializedNEW684_400() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_402() throws Throwable;
private static native void __explicitNewInit684_403(net.minecraft.item.ItemAnvilBlock a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.wU __call684_404(net.minecraft.item.ItemAnvilBlock a0, java.lang.String a1) throws Throwable;
private static native void __call684_405(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_406() throws Throwable;
private static native void __call684_407(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_408() throws Throwable;
private static native void __call684_409(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_410() throws Throwable;
private static native void __call684_411(net.minecraft.block.Block a0) throws Throwable;
private static native moom.c1 __fieldRead684_412() throws Throwable;
private static native void __call684_413(moom.c1 a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_414() throws Throwable;
private static native void __call684_415(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_416() throws Throwable;
private static native void __call684_417(net.minecraft.block.Block a0) throws Throwable;
private static native moom.c9 __fieldRead684_418() throws Throwable;
private static native void __call684_419(moom.c9 a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_420() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_421() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_423() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_424() throws Throwable;
private static native void __explicitNewInit684_428(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, java.lang.String[] a3) throws Throwable;
private static native moom.wU __call684_429(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_430(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_431() throws Throwable;
private static native void __call684_432(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_433() throws Throwable;
private static native void __call684_434(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_435() throws Throwable;
private static native void __call684_436(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_437() throws Throwable;
private static native moom.wW __sourceUninitializedNEW684_438() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_440() throws Throwable;
private static native void __explicitNewInit684_441(moom.wW a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.wU __call684_442(moom.wW a0, java.lang.String a1) throws Throwable;
private static native void __call684_443(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_444() throws Throwable;
private static native void __call684_445(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_446() throws Throwable;
private static native void __call684_447(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_448() throws Throwable;
private static native void __call684_449(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_450() throws Throwable;
private static native moom.wW __sourceUninitializedNEW684_451() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_453() throws Throwable;
private static native void __explicitNewInit684_454(moom.wW a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.wU __call684_455(moom.wW a0, java.lang.String a1) throws Throwable;
private static native void __call684_456(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_457() throws Throwable;
private static native void __call684_458(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_459() throws Throwable;
private static native void __call684_460(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_461() throws Throwable;
private static native void __call684_462(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_463() throws Throwable;
private static native void __call684_464(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_465() throws Throwable;
private static native void __call684_466(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_467() throws Throwable;
private static native void __call684_468(net.minecraft.block.Block a0) throws Throwable;
private static native moom.cz __fieldRead684_469() throws Throwable;
private static native moom.w2 __sourceUninitializedNEW684_470() throws Throwable;
private static native moom.cz __fieldRead684_472() throws Throwable;
private static native moom.cz __fieldRead684_473() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_474() throws Throwable;
private static native void __explicitNewInit684_475(moom.w2 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_476(moom.w2 a0, java.lang.String a1) throws Throwable;
private static native void __call684_477(moom.cz a0, moom.wU a1) throws Throwable;
private static native moom.ct __fieldRead684_478() throws Throwable;
private static native moom.wW __sourceUninitializedNEW684_479() throws Throwable;
private static native moom.ct __fieldRead684_481() throws Throwable;
private static native void __explicitNewInit684_482(moom.wW a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.wU __call684_483(moom.wW a0, java.lang.String a1) throws Throwable;
private static native void __call684_484(moom.ct a0, moom.wU a1) throws Throwable;
private static native moom.dW __fieldRead684_485() throws Throwable;
private static native moom.wW __sourceUninitializedNEW684_486() throws Throwable;
private static native moom.dW __fieldRead684_488() throws Throwable;
private static native void __explicitNewInit684_489(moom.wW a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.wU __call684_490(moom.wW a0, java.lang.String a1) throws Throwable;
private static native void __call684_491(moom.dW a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_492() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_493() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_495() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_496() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_497() throws Throwable;
private static native void __explicitNewInit684_498(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_499(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_500(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_501() throws Throwable;
private static native void __call684_502(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_503() throws Throwable;
private static native moom.w0 __sourceUninitializedNEW684_504() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_506() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_507() throws Throwable;
private static native com.google.common.base.Function __invokedynamic684_508() throws Throwable;
private static native void __explicitNewInit684_509(moom.w0 a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2, com.google.common.base.Function a3) throws Throwable;
private static native moom.wU __call684_510(moom.w0 a0, java.lang.String a1) throws Throwable;
private static native void __call684_511(net.minecraft.block.Block a0, moom.wU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_512() throws Throwable;
private static native void __call684_513(net.minecraft.block.Block a0) throws Throwable;
private static native moom.ei __fieldRead684_514() throws Throwable;
private static native moom.w4 __sourceUninitializedNEW684_515() throws Throwable;
private static native moom.ei __fieldRead684_517() throws Throwable;
private static native moom.ei __fieldRead684_518() throws Throwable;
private static native moom.ei __fieldRead684_519() throws Throwable;
private static native void __explicitNewInit684_520(moom.w4 a0, net.minecraft.block.Block a1, moom.ei a2, moom.ei a3) throws Throwable;
private static native moom.wU __call684_521(moom.w4 a0, java.lang.String a1) throws Throwable;
private static native void __call684_522(moom.ei a0, moom.wU a1) throws Throwable;
private static native int __invokedynamic684_523(int a0, long a1) throws Throwable;
private static native moom.xT __sourceUninitializedNEW684_524() throws Throwable;
private static native moom.a4 __fieldRead684_526() throws Throwable;
private static native void __explicitNewInit684_527(moom.xT a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_528(moom.xT a0, java.lang.String a1) throws Throwable;
private static native void __call684_529(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_530(int a0, long a1) throws Throwable;
private static native moom.xS __sourceUninitializedNEW684_531() throws Throwable;
private static native moom.a4 __fieldRead684_533() throws Throwable;
private static native void __explicitNewInit684_534(moom.xS a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_535(moom.xS a0, java.lang.String a1) throws Throwable;
private static native void __call684_536(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_537(int a0, long a1) throws Throwable;
private static native moom.xR __sourceUninitializedNEW684_538() throws Throwable;
private static native moom.a4 __fieldRead684_540() throws Throwable;
private static native void __explicitNewInit684_541(moom.xR a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_542(moom.xR a0, java.lang.String a1) throws Throwable;
private static native void __call684_543(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_544(int a0, long a1) throws Throwable;
private static native moom.xo __sourceUninitializedNEW684_545() throws Throwable;
private static native void __explicitNewInit684_547(moom.xo a0) throws Throwable;
private static native net.minecraft.item.Item __call684_548(moom.xo a0, java.lang.String a1) throws Throwable;
private static native void __call684_549(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_550(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_551() throws Throwable;
private static native void __explicitNewInit684_553(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_554(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_555(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_556(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemBow __sourceUninitializedNEW684_557() throws Throwable;
private static native void __explicitNewInit684_559(net.minecraft.item.ItemBow a0) throws Throwable;
private static native net.minecraft.item.Item __call684_560(net.minecraft.item.ItemBow a0, java.lang.String a1) throws Throwable;
private static native void __call684_561(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_562(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_563() throws Throwable;
private static native void __explicitNewInit684_565(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_566(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_567() throws Throwable;
private static native net.minecraft.item.Item __call684_568(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_569(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_570(int a0, long a1) throws Throwable;
private static native moom.xb __sourceUninitializedNEW684_571() throws Throwable;
private static native void __explicitNewInit684_573(moom.xb a0) throws Throwable;
private static native net.minecraft.item.Item __call684_574(moom.xb a0, java.lang.String a1) throws Throwable;
private static native void __call684_575(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_576(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_577() throws Throwable;
private static native void __explicitNewInit684_579(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_580(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_581() throws Throwable;
private static native net.minecraft.item.Item __call684_582(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_583(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_584(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_585() throws Throwable;
private static native void __explicitNewInit684_587(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_588(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_589() throws Throwable;
private static native net.minecraft.item.Item __call684_590(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_591(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_592(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_593() throws Throwable;
private static native void __explicitNewInit684_595(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_596(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_597() throws Throwable;
private static native net.minecraft.item.Item __call684_598(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_599(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_600(int a0, long a1) throws Throwable;
private static native moom.xP __sourceUninitializedNEW684_601() throws Throwable;
private static native moom.a4 __fieldRead684_603() throws Throwable;
private static native void __explicitNewInit684_604(moom.xP a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_605(moom.xP a0, java.lang.String a1) throws Throwable;
private static native void __call684_606(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_607(int a0, long a1) throws Throwable;
private static native moom.xP __sourceUninitializedNEW684_608() throws Throwable;
private static native moom.a4 __fieldRead684_610() throws Throwable;
private static native void __explicitNewInit684_611(moom.xP a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_612(moom.xP a0, java.lang.String a1) throws Throwable;
private static native void __call684_613(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_614(int a0, long a1) throws Throwable;
private static native moom.xT __sourceUninitializedNEW684_615() throws Throwable;
private static native moom.a4 __fieldRead684_617() throws Throwable;
private static native void __explicitNewInit684_618(moom.xT a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_619(moom.xT a0, java.lang.String a1) throws Throwable;
private static native void __call684_620(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_621(int a0, long a1) throws Throwable;
private static native moom.xS __sourceUninitializedNEW684_622() throws Throwable;
private static native moom.a4 __fieldRead684_624() throws Throwable;
private static native void __explicitNewInit684_625(moom.xS a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_626(moom.xS a0, java.lang.String a1) throws Throwable;
private static native void __call684_627(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_628(int a0, long a1) throws Throwable;
private static native moom.xR __sourceUninitializedNEW684_629() throws Throwable;
private static native moom.a4 __fieldRead684_631() throws Throwable;
private static native void __explicitNewInit684_632(moom.xR a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_633(moom.xR a0, java.lang.String a1) throws Throwable;
private static native void __call684_634(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_635(int a0, long a1) throws Throwable;
private static native moom.xP __sourceUninitializedNEW684_636() throws Throwable;
private static native moom.a4 __fieldRead684_638() throws Throwable;
private static native void __explicitNewInit684_639(moom.xP a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_640(moom.xP a0, java.lang.String a1) throws Throwable;
private static native void __call684_641(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_642(int a0, long a1) throws Throwable;
private static native moom.xT __sourceUninitializedNEW684_643() throws Throwable;
private static native moom.a4 __fieldRead684_645() throws Throwable;
private static native void __explicitNewInit684_646(moom.xT a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_647(moom.xT a0, java.lang.String a1) throws Throwable;
private static native void __call684_648(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_649(int a0, long a1) throws Throwable;
private static native moom.xS __sourceUninitializedNEW684_650() throws Throwable;
private static native moom.a4 __fieldRead684_652() throws Throwable;
private static native void __explicitNewInit684_653(moom.xS a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_654(moom.xS a0, java.lang.String a1) throws Throwable;
private static native void __call684_655(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_656(int a0, long a1) throws Throwable;
private static native moom.xR __sourceUninitializedNEW684_657() throws Throwable;
private static native moom.a4 __fieldRead684_659() throws Throwable;
private static native void __explicitNewInit684_660(moom.xR a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_661(moom.xR a0, java.lang.String a1) throws Throwable;
private static native void __call684_662(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_663(int a0, long a1) throws Throwable;
private static native moom.xP __sourceUninitializedNEW684_664() throws Throwable;
private static native moom.a4 __fieldRead684_666() throws Throwable;
private static native void __explicitNewInit684_667(moom.xP a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_668(moom.xP a0, java.lang.String a1) throws Throwable;
private static native void __call684_669(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_670(int a0, long a1) throws Throwable;
private static native moom.xT __sourceUninitializedNEW684_671() throws Throwable;
private static native moom.a4 __fieldRead684_673() throws Throwable;
private static native void __explicitNewInit684_674(moom.xT a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_675(moom.xT a0, java.lang.String a1) throws Throwable;
private static native void __call684_676(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_677(int a0, long a1) throws Throwable;
private static native moom.xS __sourceUninitializedNEW684_678() throws Throwable;
private static native moom.a4 __fieldRead684_680() throws Throwable;
private static native void __explicitNewInit684_681(moom.xS a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_682(moom.xS a0, java.lang.String a1) throws Throwable;
private static native void __call684_683(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_684(int a0, long a1) throws Throwable;
private static native moom.xR __sourceUninitializedNEW684_685() throws Throwable;
private static native moom.a4 __fieldRead684_687() throws Throwable;
private static native void __explicitNewInit684_688(moom.xR a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_689(moom.xR a0, java.lang.String a1) throws Throwable;
private static native void __call684_690(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_691(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_692() throws Throwable;
private static native void __explicitNewInit684_694(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_695(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_696(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_697() throws Throwable;
private static native net.minecraft.item.Item __call684_698(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_699(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_700(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_701() throws Throwable;
private static native void __explicitNewInit684_703(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_704(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_705() throws Throwable;
private static native net.minecraft.item.Item __call684_706(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_707(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_708(int a0, long a1) throws Throwable;
private static native moom.xt __sourceUninitializedNEW684_709() throws Throwable;
private static native int __invokedynamic684_711(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_712(moom.xt a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call684_713(moom.xt a0, java.lang.String a1) throws Throwable;
private static native void __call684_714(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_715(int a0, long a1) throws Throwable;
private static native moom.xP __sourceUninitializedNEW684_716() throws Throwable;
private static native moom.a4 __fieldRead684_718() throws Throwable;
private static native void __explicitNewInit684_719(moom.xP a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_720(moom.xP a0, java.lang.String a1) throws Throwable;
private static native void __call684_721(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_722(int a0, long a1) throws Throwable;
private static native moom.xT __sourceUninitializedNEW684_723() throws Throwable;
private static native moom.a4 __fieldRead684_725() throws Throwable;
private static native void __explicitNewInit684_726(moom.xT a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_727(moom.xT a0, java.lang.String a1) throws Throwable;
private static native void __call684_728(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_729(int a0, long a1) throws Throwable;
private static native moom.xS __sourceUninitializedNEW684_730() throws Throwable;
private static native moom.a4 __fieldRead684_732() throws Throwable;
private static native void __explicitNewInit684_733(moom.xS a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_734(moom.xS a0, java.lang.String a1) throws Throwable;
private static native void __call684_735(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_736(int a0, long a1) throws Throwable;
private static native moom.xR __sourceUninitializedNEW684_737() throws Throwable;
private static native moom.a4 __fieldRead684_739() throws Throwable;
private static native void __explicitNewInit684_740(moom.xR a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_741(moom.xR a0, java.lang.String a1) throws Throwable;
private static native void __call684_742(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_743(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_744() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_746() throws Throwable;
private static native void __explicitNewInit684_747(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_748(moom.xH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_749() throws Throwable;
private static native net.minecraft.item.Item __call684_750(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_751(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_752(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_753() throws Throwable;
private static native void __explicitNewInit684_755(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_756(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_757() throws Throwable;
private static native net.minecraft.item.Item __call684_758(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_759(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_760(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_761() throws Throwable;
private static native void __explicitNewInit684_763(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_764(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_765(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_766() throws Throwable;
private static native net.minecraft.item.Item __call684_767(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_768(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_769(int a0, long a1) throws Throwable;
private static native moom.xw __sourceUninitializedNEW684_770() throws Throwable;
private static native moom.a4 __fieldRead684_772() throws Throwable;
private static native void __explicitNewInit684_773(moom.xw a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_774(moom.xw a0, java.lang.String a1) throws Throwable;
private static native void __call684_775(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_776(int a0, long a1) throws Throwable;
private static native moom.xw __sourceUninitializedNEW684_777() throws Throwable;
private static native moom.a4 __fieldRead684_779() throws Throwable;
private static native void __explicitNewInit684_780(moom.xw a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_781(moom.xw a0, java.lang.String a1) throws Throwable;
private static native void __call684_782(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_783(int a0, long a1) throws Throwable;
private static native moom.xw __sourceUninitializedNEW684_784() throws Throwable;
private static native moom.a4 __fieldRead684_786() throws Throwable;
private static native void __explicitNewInit684_787(moom.xw a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_788(moom.xw a0, java.lang.String a1) throws Throwable;
private static native void __call684_789(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_790(int a0, long a1) throws Throwable;
private static native moom.xw __sourceUninitializedNEW684_791() throws Throwable;
private static native moom.a4 __fieldRead684_793() throws Throwable;
private static native void __explicitNewInit684_794(moom.xw a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_795(moom.xw a0, java.lang.String a1) throws Throwable;
private static native void __call684_796(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_797(int a0, long a1) throws Throwable;
private static native moom.xw __sourceUninitializedNEW684_798() throws Throwable;
private static native moom.a4 __fieldRead684_800() throws Throwable;
private static native void __explicitNewInit684_801(moom.xw a0, moom.a4 a1) throws Throwable;
private static native net.minecraft.item.Item __call684_802(moom.xw a0, java.lang.String a1) throws Throwable;
private static native void __call684_803(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_804(int a0, long a1) throws Throwable;
private static native moom.xJ __sourceUninitializedNEW684_805() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_807() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_808() throws Throwable;
private static native void __explicitNewInit684_809(moom.xJ a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.item.Item __call684_810(moom.xJ a0, java.lang.String a1) throws Throwable;
private static native void __call684_811(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_812(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_813() throws Throwable;
private static native void __explicitNewInit684_815(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_816(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_817() throws Throwable;
private static native net.minecraft.item.Item __call684_818(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_819(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_820(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_821() throws Throwable;
private static native void __explicitNewInit684_823(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_824(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_825(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_826(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_827() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_829() throws Throwable;
private static native void __explicitNewInit684_830(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_831(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_832(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_833(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_834() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_836() throws Throwable;
private static native void __explicitNewInit684_837(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_838(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_839(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_840(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_841() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_843() throws Throwable;
private static native void __explicitNewInit684_844(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_845(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_846(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_847(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_848() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_850() throws Throwable;
private static native void __explicitNewInit684_851(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_852(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_853(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_854(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_855() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_857() throws Throwable;
private static native void __explicitNewInit684_858(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_859(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_860(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_861(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_862() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_864() throws Throwable;
private static native void __explicitNewInit684_865(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_866(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_867(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_868(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_869() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_871() throws Throwable;
private static native void __explicitNewInit684_872(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_873(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_874(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_875(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_876() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_878() throws Throwable;
private static native void __explicitNewInit684_879(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_880(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_881(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_882(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_883() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_885() throws Throwable;
private static native void __explicitNewInit684_886(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_887(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_888(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_889(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_890() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_892() throws Throwable;
private static native void __explicitNewInit684_893(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_894(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_895(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_896(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_897() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_899() throws Throwable;
private static native void __explicitNewInit684_900(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_901(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_902(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_903(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_904() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_906() throws Throwable;
private static native void __explicitNewInit684_907(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_908(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_909(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __integerCategory684_910(boolean value) throws Throwable;
private static native int __invokedynamic684_911(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_912() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_914() throws Throwable;
private static native void __explicitNewInit684_915(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_916(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_917(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_918(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_919() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_921() throws Throwable;
private static native void __explicitNewInit684_922(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_923(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_924(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_925(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_926() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_928() throws Throwable;
private static native void __explicitNewInit684_929(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_930(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_931(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_932(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_933() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_935() throws Throwable;
private static native void __explicitNewInit684_936(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_937(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_938(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_939(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_940() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_942() throws Throwable;
private static native void __explicitNewInit684_943(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_944(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_945(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_946(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_947() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_949() throws Throwable;
private static native void __explicitNewInit684_950(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_951(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_952(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_953(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_954() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_956() throws Throwable;
private static native void __explicitNewInit684_957(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_958(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_959(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_960(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemArmor __sourceUninitializedNEW684_961() throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __fieldRead684_963() throws Throwable;
private static native void __explicitNewInit684_964(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemArmor$ArmorMaterial a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.Item __call684_965(net.minecraft.item.ItemArmor a0, java.lang.String a1) throws Throwable;
private static native void __call684_966(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_967(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_968() throws Throwable;
private static native void __explicitNewInit684_970(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_971(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_972() throws Throwable;
private static native net.minecraft.item.Item __call684_973(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_974(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_975(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_976() throws Throwable;
private static native void __explicitNewInit684_978(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_979(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_980(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_981(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_982() throws Throwable;
private static native int __invokedynamic684_984(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_985(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_986(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_987(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_988(int a0, long a1) throws Throwable;
private static native moom.xv __sourceUninitializedNEW684_989() throws Throwable;
private static native java.lang.Class __classLiteral684_991() throws Throwable;
private static native void __explicitNewInit684_992(moom.xv a0, java.lang.Class a1) throws Throwable;
private static native net.minecraft.item.Item __call684_993(moom.xv a0, java.lang.String a1) throws Throwable;
private static native void __call684_994(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_995(int a0, long a1) throws Throwable;
private static native moom.xq __sourceUninitializedNEW684_996() throws Throwable;
private static native void __explicitNewInit684_998(moom.xq a0, int a1, float a2, boolean a3) throws Throwable;
private static native moom.xp __call684_999(moom.xq a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead684_1000() throws Throwable;
private static native int __fieldRead684_1001(net.minecraft.potion.Potion a0) throws Throwable;
private static native moom.xp __call684_1002(moom.xp a0, int a1, int a2, int a3, float a4) throws Throwable;
private static native net.minecraft.item.Item __call684_1003(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1004(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1005(int a0, long a1) throws Throwable;
private static native moom.xL __sourceUninitializedNEW684_1006() throws Throwable;
private static native void __explicitNewInit684_1008(moom.xL a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1009(moom.xL a0, java.lang.String a1) throws Throwable;
private static native void __call684_1010(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1011(int a0, long a1) throws Throwable;
private static native moom.xc __sourceUninitializedNEW684_1012() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1014() throws Throwable;
private static native void __explicitNewInit684_1015(moom.xc a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1016(moom.xc a0, java.lang.String a1) throws Throwable;
private static native void __call684_1017(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native moom.w9 __sourceUninitializedNEW684_1018() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1020() throws Throwable;
private static native void __explicitNewInit684_1021(moom.w9 a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1022(moom.w9 a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic684_1023(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1024(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native int __invokedynamic684_1025(int a0, long a1) throws Throwable;
private static native void __call684_1026(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1027(int a0, long a1) throws Throwable;
private static native moom.w9 __sourceUninitializedNEW684_1028() throws Throwable;
private static native moom.dM __fieldRead684_1030() throws Throwable;
private static native void __explicitNewInit684_1031(moom.w9 a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1032(moom.w9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1033(net.minecraft.item.Item a0, net.minecraft.item.Item a1) throws Throwable;
private static native void __call684_1034(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1035(int a0, long a1) throws Throwable;
private static native moom.w9 __sourceUninitializedNEW684_1036() throws Throwable;
private static native moom.dM __fieldRead684_1038() throws Throwable;
private static native void __explicitNewInit684_1039(moom.w9 a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1040(moom.w9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1041(net.minecraft.item.Item a0, net.minecraft.item.Item a1) throws Throwable;
private static native void __call684_1042(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1043(int a0, long a1) throws Throwable;
private static native moom.xB __sourceUninitializedNEW684_1044() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead684_1046() throws Throwable;
private static native void __explicitNewInit684_1047(moom.xB a0, net.minecraft.entity.item.EntityMinecart$EnumMinecartType a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1048(moom.xB a0, java.lang.String a1) throws Throwable;
private static native void __call684_1049(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1050(int a0, long a1) throws Throwable;
private static native moom.xI __sourceUninitializedNEW684_1051() throws Throwable;
private static native void __explicitNewInit684_1053(moom.xI a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1054(moom.xI a0, java.lang.String a1) throws Throwable;
private static native void __call684_1055(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1056(int a0, long a1) throws Throwable;
private static native moom.xc __sourceUninitializedNEW684_1057() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1059() throws Throwable;
private static native void __explicitNewInit684_1060(moom.xc a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1061(moom.xc a0, java.lang.String a1) throws Throwable;
private static native void __call684_1062(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1063(int a0, long a1) throws Throwable;
private static native moom.xG __sourceUninitializedNEW684_1064() throws Throwable;
private static native void __explicitNewInit684_1066(moom.xG a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1067(moom.xG a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1068(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native void __call684_1069(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1070(int a0, long a1) throws Throwable;
private static native moom.xO __sourceUninitializedNEW684_1071() throws Throwable;
private static native void __explicitNewInit684_1073(moom.xO a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1074(moom.xO a0, java.lang.String a1) throws Throwable;
private static native void __call684_1075(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1076(int a0, long a1) throws Throwable;
private static native moom.w6 __sourceUninitializedNEW684_1077() throws Throwable;
private static native void __explicitNewInit684_1079(moom.w6 a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1080(moom.w6 a0, java.lang.String a1) throws Throwable;
private static native void __call684_1081(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1082(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1083() throws Throwable;
private static native void __explicitNewInit684_1085(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1086(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1087() throws Throwable;
private static native net.minecraft.item.Item __call684_1088(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1089(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1090(int a0, long a1) throws Throwable;
private static native moom.w_ __sourceUninitializedNEW684_1091() throws Throwable;
private static native void __explicitNewInit684_1093(moom.w_ a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1094(moom.w_ a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1095(net.minecraft.item.Item a0, net.minecraft.item.Item a1) throws Throwable;
private static native void __call684_1096(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1097(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1098() throws Throwable;
private static native void __explicitNewInit684_1100(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1101(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1102() throws Throwable;
private static native net.minecraft.item.Item __call684_1103(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1104(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1105(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1106() throws Throwable;
private static native void __explicitNewInit684_1108(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1109(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1110() throws Throwable;
private static native net.minecraft.item.Item __call684_1111(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1112(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1113(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_1114() throws Throwable;
private static native moom.d_ __fieldRead684_1116() throws Throwable;
private static native void __explicitNewInit684_1117(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1118(moom.xH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1119() throws Throwable;
private static native net.minecraft.item.Item __call684_1120(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1121(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1122(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1123() throws Throwable;
private static native void __explicitNewInit684_1125(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1126(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1127() throws Throwable;
private static native net.minecraft.item.Item __call684_1128(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1129(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1130(int a0, long a1) throws Throwable;
private static native moom.w7 __sourceUninitializedNEW684_1131() throws Throwable;
private static native void __explicitNewInit684_1133(moom.w7 a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1134(moom.w7 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1135() throws Throwable;
private static native net.minecraft.item.Item __call684_1136(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1137(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1138(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1139() throws Throwable;
private static native void __explicitNewInit684_1141(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1142(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1143() throws Throwable;
private static native net.minecraft.item.Item __call684_1144(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1145(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1146(int a0, long a1) throws Throwable;
private static native moom.xB __sourceUninitializedNEW684_1147() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead684_1149() throws Throwable;
private static native void __explicitNewInit684_1150(moom.xB a0, net.minecraft.entity.item.EntityMinecart$EnumMinecartType a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1151(moom.xB a0, java.lang.String a1) throws Throwable;
private static native void __call684_1152(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1153(int a0, long a1) throws Throwable;
private static native moom.xB __sourceUninitializedNEW684_1154() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead684_1156() throws Throwable;
private static native void __explicitNewInit684_1157(moom.xB a0, net.minecraft.entity.item.EntityMinecart$EnumMinecartType a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1158(moom.xB a0, java.lang.String a1) throws Throwable;
private static native void __call684_1159(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1160(int a0, long a1) throws Throwable;
private static native moom.xf __sourceUninitializedNEW684_1161() throws Throwable;
private static native void __explicitNewInit684_1163(moom.xf a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1164(moom.xf a0, java.lang.String a1) throws Throwable;
private static native void __call684_1165(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1166(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1167() throws Throwable;
private static native void __explicitNewInit684_1169(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1170(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1171() throws Throwable;
private static native net.minecraft.item.Item __call684_1172(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1173(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1174(int a0, long a1) throws Throwable;
private static native moom.xn __sourceUninitializedNEW684_1175() throws Throwable;
private static native void __explicitNewInit684_1177(moom.xn a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1178(moom.xn a0, java.lang.String a1) throws Throwable;
private static native void __call684_1179(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1180(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1181() throws Throwable;
private static native void __explicitNewInit684_1183(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1184(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1185() throws Throwable;
private static native net.minecraft.item.Item __call684_1186(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1187(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1188(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1189() throws Throwable;
private static native void __explicitNewInit684_1191(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1192(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1193(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1194() throws Throwable;
private static native net.minecraft.item.Item __call684_1195(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1196(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1197(int a0, long a1) throws Throwable;
private static native moom.xr __sourceUninitializedNEW684_1198() throws Throwable;
private static native void __explicitNewInit684_1200(moom.xr a0, boolean a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1201(moom.xr a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1202(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native void __call684_1203(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1204(int a0, long a1) throws Throwable;
private static native moom.xr __sourceUninitializedNEW684_1205() throws Throwable;
private static native void __explicitNewInit684_1207(moom.xr a0, boolean a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1208(moom.xr a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1209(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native void __call684_1210(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1211(int a0, long a1) throws Throwable;
private static native moom.xd __sourceUninitializedNEW684_1212() throws Throwable;
private static native void __explicitNewInit684_1214(moom.xd a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1215(moom.xd a0, java.lang.String a1) throws Throwable;
private static native void __call684_1216(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1217(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1218() throws Throwable;
private static native void __explicitNewInit684_1220(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1221(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1222(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1223() throws Throwable;
private static native net.minecraft.item.Item __call684_1224(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1225(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1226(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1227() throws Throwable;
private static native void __explicitNewInit684_1229(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1230(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1231(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1232() throws Throwable;
private static native net.minecraft.item.Item __call684_1233(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1234(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1235(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_1236() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1238() throws Throwable;
private static native void __explicitNewInit684_1239(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1240(moom.xH a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1241(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1242() throws Throwable;
private static native net.minecraft.item.Item __call684_1243(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1244(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1245(int a0, long a1) throws Throwable;
private static native moom.wT __sourceUninitializedNEW684_1246() throws Throwable;
private static native void __explicitNewInit684_1248(moom.wT a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1249(moom.wT a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1250(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native void __call684_1251(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1252(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_1253() throws Throwable;
private static native net.minecraft.block.BlockRedstoneRepeater __fieldRead684_1255() throws Throwable;
private static native void __explicitNewInit684_1256(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1257(moom.xH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1258() throws Throwable;
private static native net.minecraft.item.Item __call684_1259(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1260(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1261(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1262() throws Throwable;
private static native void __explicitNewInit684_1264(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1265(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1266(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1267(int a0, long a1) throws Throwable;
private static native moom.xA __sourceUninitializedNEW684_1268() throws Throwable;
private static native void __explicitNewInit684_1270(moom.xA a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1271(moom.xA a0, java.lang.String a1) throws Throwable;
private static native void __call684_1272(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1273(int a0, long a1) throws Throwable;
private static native moom.xK __sourceUninitializedNEW684_1274() throws Throwable;
private static native void __explicitNewInit684_1276(moom.xK a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1277(moom.xK a0, java.lang.String a1) throws Throwable;
private static native void __call684_1278(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1279(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1280() throws Throwable;
private static native void __explicitNewInit684_1282(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1283(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1284(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1285(int a0, long a1) throws Throwable;
private static native moom.xJ __sourceUninitializedNEW684_1286() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1288() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1289() throws Throwable;
private static native void __explicitNewInit684_1290(moom.xJ a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.item.Item __call684_1291(moom.xJ a0, java.lang.String a1) throws Throwable;
private static native void __call684_1292(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1293(int a0, long a1) throws Throwable;
private static native moom.xJ __sourceUninitializedNEW684_1294() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1296() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1297() throws Throwable;
private static native void __explicitNewInit684_1298(moom.xJ a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.item.Item __call684_1299(moom.xJ a0, java.lang.String a1) throws Throwable;
private static native void __call684_1300(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1301(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1302() throws Throwable;
private static native void __explicitNewInit684_1304(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1305(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1306(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1307(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1308() throws Throwable;
private static native int __invokedynamic684_1310(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_1311(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1312(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1313(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1314(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1315() throws Throwable;
private static native void __explicitNewInit684_1317(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead684_1318() throws Throwable;
private static native int __fieldRead684_1319(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __invokedynamic684_1320(int a0, long a1) throws Throwable;
private static native moom.xp __call684_1321(moom.xp a0, int a1, int a2, int a3, float a4) throws Throwable;
private static native net.minecraft.item.Item __call684_1322(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1323(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1324(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1325() throws Throwable;
private static native int __invokedynamic684_1327(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_1328(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1329(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1330(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1331(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1332() throws Throwable;
private static native void __explicitNewInit684_1334(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead684_1335() throws Throwable;
private static native int __fieldRead684_1336(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __invokedynamic684_1337(int a0, long a1) throws Throwable;
private static native moom.xp __call684_1338(moom.xp a0, int a1, int a2, int a3, float a4) throws Throwable;
private static native net.minecraft.item.Item __call684_1339(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1340(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1341(int a0, long a1) throws Throwable;
private static native moom.xi __sourceUninitializedNEW684_1342() throws Throwable;
private static native void __explicitNewInit684_1344(moom.xi a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1345(moom.xi a0, java.lang.String a1) throws Throwable;
private static native void __call684_1346(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1347(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1348() throws Throwable;
private static native void __explicitNewInit684_1350(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1351(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1352() throws Throwable;
private static native net.minecraft.item.Item __call684_1353(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1354(net.minecraft.item.Item a0) throws Throwable;
private static native void __call684_1355(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1356(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1357() throws Throwable;
private static native void __explicitNewInit684_1359(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1360(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1361(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1362() throws Throwable;
private static native net.minecraft.item.Item __call684_1363(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1364(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1365(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1366() throws Throwable;
private static native void __explicitNewInit684_1368(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1369(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1370() throws Throwable;
private static native net.minecraft.item.Item __call684_1371(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1372(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1373(int a0, long a1) throws Throwable;
private static native moom.xJ __sourceUninitializedNEW684_1374() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1376() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1377() throws Throwable;
private static native void __explicitNewInit684_1378(moom.xJ a0, net.minecraft.block.Block a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.item.Item __call684_1379(moom.xJ a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1380(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native void __call684_1381(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1382(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemPotion __sourceUninitializedNEW684_1383() throws Throwable;
private static native void __explicitNewInit684_1385(net.minecraft.item.ItemPotion a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1386(net.minecraft.item.ItemPotion a0, java.lang.String a1) throws Throwable;
private static native void __call684_1387(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1388(int a0, long a1) throws Throwable;
private static native moom.xu __sourceUninitializedNEW684_1389() throws Throwable;
private static native void __explicitNewInit684_1391(moom.xu a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1392(moom.xu a0, java.lang.String a1) throws Throwable;
private static native void __call684_1393(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1394(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1395() throws Throwable;
private static native void __explicitNewInit684_1397(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead684_1398() throws Throwable;
private static native int __fieldRead684_1399(net.minecraft.potion.Potion a0) throws Throwable;
private static native moom.xp __call684_1400(moom.xp a0, int a1, int a2, int a3, float a4) throws Throwable;
private static native net.minecraft.item.Item __call684_1401(moom.xp a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1402(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native void __call684_1403(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1404(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1405() throws Throwable;
private static native void __explicitNewInit684_1407(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1408(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1409(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1410() throws Throwable;
private static native net.minecraft.item.Item __call684_1411(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1412(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1413(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1414() throws Throwable;
private static native void __explicitNewInit684_1416(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1417(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1418(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1419() throws Throwable;
private static native net.minecraft.item.Item __call684_1420(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1421(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1422(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1423() throws Throwable;
private static native void __explicitNewInit684_1425(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1426(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1427(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1428() throws Throwable;
private static native net.minecraft.item.Item __call684_1429(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1430(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1431(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_1432() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1434() throws Throwable;
private static native void __explicitNewInit684_1435(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1436(moom.xH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1437() throws Throwable;
private static native net.minecraft.item.Item __call684_1438(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1439(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1440(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_1441() throws Throwable;
private static native moom.cP __fieldRead684_1443() throws Throwable;
private static native void __explicitNewInit684_1444(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1445(moom.xH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1446() throws Throwable;
private static native net.minecraft.item.Item __call684_1447(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1448(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1449(int a0, long a1) throws Throwable;
private static native moom.xh __sourceUninitializedNEW684_1450() throws Throwable;
private static native void __explicitNewInit684_1452(moom.xh a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1453(moom.xh a0, java.lang.String a1) throws Throwable;
private static native void __call684_1454(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1455(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1456() throws Throwable;
private static native void __explicitNewInit684_1458(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1459(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1460(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1461() throws Throwable;
private static native net.minecraft.item.Item __call684_1462(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1463(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1464(int a0, long a1) throws Throwable;
private static native moom.xC __sourceUninitializedNEW684_1465() throws Throwable;
private static native void __explicitNewInit684_1467(moom.xC a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1468(moom.xC a0, java.lang.String a1) throws Throwable;
private static native void __call684_1469(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1470(int a0, long a1) throws Throwable;
private static native moom.xj __sourceUninitializedNEW684_1471() throws Throwable;
private static native void __explicitNewInit684_1473(moom.xj a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1474(moom.xj a0, java.lang.String a1) throws Throwable;
private static native void __call684_1475(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1476(int a0, long a1) throws Throwable;
private static native moom.xk __sourceUninitializedNEW684_1477() throws Throwable;
private static native void __explicitNewInit684_1479(moom.xk a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1480(moom.xk a0, java.lang.String a1) throws Throwable;
private static native void __call684_1481(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1482(int a0, long a1) throws Throwable;
private static native moom.xU __sourceUninitializedNEW684_1483() throws Throwable;
private static native void __explicitNewInit684_1485(moom.xU a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1486(moom.xU a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1487() throws Throwable;
private static native net.minecraft.item.Item __call684_1488(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1489(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1490(int a0, long a1) throws Throwable;
private static native moom.xe __sourceUninitializedNEW684_1491() throws Throwable;
private static native void __explicitNewInit684_1493(moom.xe a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1494(moom.xe a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic684_1495(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1496(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native void __call684_1497(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1498(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1499() throws Throwable;
private static native void __explicitNewInit684_1501(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1502(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1503() throws Throwable;
private static native net.minecraft.item.Item __call684_1504(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1505(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1506(int a0, long a1) throws Throwable;
private static native moom.xv __sourceUninitializedNEW684_1507() throws Throwable;
private static native java.lang.Class __classLiteral684_1509() throws Throwable;
private static native void __explicitNewInit684_1510(moom.xv a0, java.lang.Class a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1511(moom.xv a0, java.lang.String a1) throws Throwable;
private static native void __call684_1512(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1513(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_1514() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1516() throws Throwable;
private static native void __explicitNewInit684_1517(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1518(moom.xH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1519() throws Throwable;
private static native net.minecraft.item.Item __call684_1520(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1521(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1522(int a0, long a1) throws Throwable;
private static native moom.xs __sourceUninitializedNEW684_1523() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1525() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1526() throws Throwable;
private static native void __explicitNewInit684_1527(moom.xs a0, int a1, float a2, net.minecraft.block.Block a3, net.minecraft.block.Block a4) throws Throwable;
private static native net.minecraft.item.Item __call684_1528(moom.xs a0, java.lang.String a1) throws Throwable;
private static native void __call684_1529(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1530(int a0, long a1) throws Throwable;
private static native moom.xs __sourceUninitializedNEW684_1531() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1533() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1534() throws Throwable;
private static native void __explicitNewInit684_1535(moom.xs a0, int a1, float a2, net.minecraft.block.Block a3, net.minecraft.block.Block a4) throws Throwable;
private static native net.minecraft.item.Item __call684_1536(moom.xs a0, java.lang.String a1) throws Throwable;
private static native void __call684_1537(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1538(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1539() throws Throwable;
private static native void __explicitNewInit684_1541(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1542(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1543(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1544(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1545() throws Throwable;
private static native void __explicitNewInit684_1547(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead684_1548() throws Throwable;
private static native int __fieldRead684_1549(net.minecraft.potion.Potion a0) throws Throwable;
private static native moom.xp __call684_1550(moom.xp a0, int a1, int a2, int a3, float a4) throws Throwable;
private static native net.minecraft.item.Item __call684_1551(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1552(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1553(int a0, long a1) throws Throwable;
private static native moom.xz __sourceUninitializedNEW684_1554() throws Throwable;
private static native void __explicitNewInit684_1556(moom.xz a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1557(moom.xz a0, java.lang.String a1) throws Throwable;
private static native void __call684_1558(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1559(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1560() throws Throwable;
private static native int __invokedynamic684_1562(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_1563(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1564(moom.xp a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1565(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1566() throws Throwable;
private static native net.minecraft.item.Item __call684_1567(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1568(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1569(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemSkull __sourceUninitializedNEW684_1570() throws Throwable;
private static native void __explicitNewInit684_1572(net.minecraft.item.ItemSkull a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1573(net.minecraft.item.ItemSkull a0, java.lang.String a1) throws Throwable;
private static native void __call684_1574(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1575(int a0, long a1) throws Throwable;
private static native moom.xa __sourceUninitializedNEW684_1576() throws Throwable;
private static native void __explicitNewInit684_1578(moom.xa a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1579(moom.xa a0, java.lang.String a1) throws Throwable;
private static native void __call684_1580(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1581(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemSimpleFoiled __sourceUninitializedNEW684_1582() throws Throwable;
private static native void __explicitNewInit684_1584(net.minecraft.item.ItemSimpleFoiled a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1585(net.minecraft.item.ItemSimpleFoiled a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1586() throws Throwable;
private static native net.minecraft.item.Item __call684_1587(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1588(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1589(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1590() throws Throwable;
private static native int __invokedynamic684_1592(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_1593(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1594(moom.xp a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1595() throws Throwable;
private static native net.minecraft.item.Item __call684_1596(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1597(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1598(int a0, long a1) throws Throwable;
private static native moom.xl __sourceUninitializedNEW684_1599() throws Throwable;
private static native void __explicitNewInit684_1601(moom.xl a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1602(moom.xl a0, java.lang.String a1) throws Throwable;
private static native void __call684_1603(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1604(int a0, long a1) throws Throwable;
private static native moom.xm __sourceUninitializedNEW684_1605() throws Throwable;
private static native void __explicitNewInit684_1607(moom.xm a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1608(moom.xm a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1609() throws Throwable;
private static native net.minecraft.item.Item __call684_1610(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1611(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1612(int a0, long a1) throws Throwable;
private static native moom.xg __sourceUninitializedNEW684_1613() throws Throwable;
private static native void __explicitNewInit684_1615(moom.xg a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1616(moom.xg a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1617(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native void __call684_1618(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1619(int a0, long a1) throws Throwable;
private static native moom.xH __sourceUninitializedNEW684_1620() throws Throwable;
private static native net.minecraft.block.BlockRedstoneComparator __fieldRead684_1622() throws Throwable;
private static native void __explicitNewInit684_1623(moom.xH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1624(moom.xH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1625() throws Throwable;
private static native net.minecraft.item.Item __call684_1626(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1627(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1628(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1629() throws Throwable;
private static native void __explicitNewInit684_1631(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1632(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1633() throws Throwable;
private static native net.minecraft.item.Item __call684_1634(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1635(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1636(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1637() throws Throwable;
private static native void __explicitNewInit684_1639(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1640(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1641() throws Throwable;
private static native net.minecraft.item.Item __call684_1642(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1643(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1644(int a0, long a1) throws Throwable;
private static native moom.xB __sourceUninitializedNEW684_1645() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead684_1647() throws Throwable;
private static native void __explicitNewInit684_1648(moom.xB a0, net.minecraft.entity.item.EntityMinecart$EnumMinecartType a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1649(moom.xB a0, java.lang.String a1) throws Throwable;
private static native void __call684_1650(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1651(int a0, long a1) throws Throwable;
private static native moom.xB __sourceUninitializedNEW684_1652() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead684_1654() throws Throwable;
private static native void __explicitNewInit684_1655(moom.xB a0, net.minecraft.entity.item.EntityMinecart$EnumMinecartType a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1656(moom.xB a0, java.lang.String a1) throws Throwable;
private static native void __call684_1657(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1658(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1659() throws Throwable;
private static native void __explicitNewInit684_1661(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1662(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1663() throws Throwable;
private static native net.minecraft.item.Item __call684_1664(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1665(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1666(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1667() throws Throwable;
private static native void __explicitNewInit684_1669(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1670(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1671() throws Throwable;
private static native net.minecraft.item.Item __call684_1672(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1673(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1674(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1675() throws Throwable;
private static native void __explicitNewInit684_1677(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1678(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1679(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1680(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1681() throws Throwable;
private static native void __explicitNewInit684_1683(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1684(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1685(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1686(int a0, long a1) throws Throwable;
private static native moom.xt __sourceUninitializedNEW684_1687() throws Throwable;
private static native int __invokedynamic684_1689(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_1690(moom.xt a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1691(moom.xt a0, java.lang.String a1) throws Throwable;
private static native void __call684_1692(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1693(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1694() throws Throwable;
private static native void __explicitNewInit684_1696(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1697(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1698(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1699() throws Throwable;
private static native net.minecraft.item.Item __call684_1700(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1701(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1702(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1703() throws Throwable;
private static native void __explicitNewInit684_1705(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1706(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1707() throws Throwable;
private static native net.minecraft.item.Item __call684_1708(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1709(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1710(int a0, long a1) throws Throwable;
private static native moom.wS __sourceUninitializedNEW684_1711() throws Throwable;
private static native void __explicitNewInit684_1713(moom.wS a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1714(moom.wS a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic684_1715(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1716(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native void __call684_1717(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1718(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1719() throws Throwable;
private static native void __explicitNewInit684_1721(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1722(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1723(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1724() throws Throwable;
private static native net.minecraft.item.Item __call684_1725(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1726(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1727(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1728() throws Throwable;
private static native void __explicitNewInit684_1730(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1731(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1732(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1733() throws Throwable;
private static native net.minecraft.item.Item __call684_1734(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1735(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1736(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __sourceUninitializedNEW684_1737() throws Throwable;
private static native void __explicitNewInit684_1739(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1740(net.minecraft.item.Item a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1741(net.minecraft.item.Item a0, int a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead684_1742() throws Throwable;
private static native net.minecraft.item.Item __call684_1743(net.minecraft.item.Item a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call684_1744(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1745(int a0, long a1) throws Throwable;
private static native moom.xx __sourceUninitializedNEW684_1746() throws Throwable;
private static native void __explicitNewInit684_1748(moom.xx a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1749(moom.xx a0, java.lang.String a1) throws Throwable;
private static native void __call684_1750(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1751(int a0, long a1) throws Throwable;
private static native moom.xD __sourceUninitializedNEW684_1752() throws Throwable;
private static native void __explicitNewInit684_1754(moom.xD a0) throws Throwable;
private static native net.minecraft.item.Item __call684_1755(moom.xD a0, java.lang.String a1) throws Throwable;
private static native void __call684_1756(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1757(int a0, long a1) throws Throwable;
private static native moom.xB __sourceUninitializedNEW684_1758() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead684_1760() throws Throwable;
private static native void __explicitNewInit684_1761(moom.xB a0, net.minecraft.entity.item.EntityMinecart$EnumMinecartType a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1762(moom.xB a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1763(net.minecraft.item.Item a0, java.lang.Object a1) throws Throwable;
private static native void __call684_1764(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1765(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1766() throws Throwable;
private static native void __explicitNewInit684_1768(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1769(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1770(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1771(int a0, long a1) throws Throwable;
private static native moom.xp __sourceUninitializedNEW684_1772() throws Throwable;
private static native int __invokedynamic684_1774(int a0, long a1) throws Throwable;
private static native void __explicitNewInit684_1775(moom.xp a0, int a1, float a2, boolean a3) throws Throwable;
private static native net.minecraft.item.Item __call684_1776(moom.xp a0, java.lang.String a1) throws Throwable;
private static native void __call684_1777(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1778(int a0, long a1) throws Throwable;
private static native moom.wV __sourceUninitializedNEW684_1779() throws Throwable;
private static native void __explicitNewInit684_1781(moom.wV a0) throws Throwable;
private static native moom.wU __call684_1782(moom.wV a0, java.lang.String a1) throws Throwable;
private static native void __call684_1783(int a0, java.lang.String a1, moom.wU a2) throws Throwable;
private static native int __invokedynamic684_1784(int a0, long a1) throws Throwable;
private static native moom.xc __sourceUninitializedNEW684_1785() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1787() throws Throwable;
private static native void __explicitNewInit684_1788(moom.xc a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1789(moom.xc a0, java.lang.String a1) throws Throwable;
private static native void __call684_1790(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1791(int a0, long a1) throws Throwable;
private static native moom.xc __sourceUninitializedNEW684_1792() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1794() throws Throwable;
private static native void __explicitNewInit684_1795(moom.xc a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1796(moom.xc a0, java.lang.String a1) throws Throwable;
private static native void __call684_1797(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1798(int a0, long a1) throws Throwable;
private static native moom.xc __sourceUninitializedNEW684_1799() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1801() throws Throwable;
private static native void __explicitNewInit684_1802(moom.xc a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1803(moom.xc a0, java.lang.String a1) throws Throwable;
private static native void __call684_1804(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1805(int a0, long a1) throws Throwable;
private static native moom.xc __sourceUninitializedNEW684_1806() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1808() throws Throwable;
private static native void __explicitNewInit684_1809(moom.xc a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1810(moom.xc a0, java.lang.String a1) throws Throwable;
private static native void __call684_1811(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1812(int a0, long a1) throws Throwable;
private static native moom.xc __sourceUninitializedNEW684_1813() throws Throwable;
private static native net.minecraft.block.Block __fieldRead684_1815() throws Throwable;
private static native void __explicitNewInit684_1816(moom.xc a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1817(moom.xc a0, java.lang.String a1) throws Throwable;
private static native void __call684_1818(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1819(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1820() throws Throwable;
private static native void __explicitNewInit684_1822(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1823(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1824(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1825(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1826() throws Throwable;
private static native void __explicitNewInit684_1828(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1829(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1830(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1831(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1832() throws Throwable;
private static native void __explicitNewInit684_1834(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1835(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1836(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1837(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1838() throws Throwable;
private static native void __explicitNewInit684_1840(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1841(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1842(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1843(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1844() throws Throwable;
private static native void __explicitNewInit684_1846(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1847(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1848(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1849(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1850() throws Throwable;
private static native void __explicitNewInit684_1852(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1853(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1854(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1855(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1856() throws Throwable;
private static native void __explicitNewInit684_1858(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1859(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1860(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1861(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1862() throws Throwable;
private static native void __explicitNewInit684_1864(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1865(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1866(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1867(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1868() throws Throwable;
private static native void __explicitNewInit684_1870(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1871(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1872(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1873(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1874() throws Throwable;
private static native void __explicitNewInit684_1876(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1877(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1878(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1879(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1880() throws Throwable;
private static native void __explicitNewInit684_1882(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1883(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1884(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native int __invokedynamic684_1885(int a0, long a1) throws Throwable;
private static native moom.xF __sourceUninitializedNEW684_1886() throws Throwable;
private static native void __explicitNewInit684_1888(moom.xF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call684_1889(moom.xF a0, java.lang.String a1) throws Throwable;
private static native void __call684_1890(int a0, java.lang.String a1, net.minecraft.item.Item a2) throws Throwable;
private static native void __call684_1891(java.lang.String[] a0) throws Throwable;
private static native java.lang.RuntimeException __call3068400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.EnumRarity __sourceHandlerCall_a4cb26b12bd788e7ae4f(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_a4cb26b12bd788e7ae4f {

public static net.minecraft.item.EnumRarity f2875(net.minecraft.item.Item receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead2875_0() ^ 136891268373216L);
    return (__call2875_1(p0) ? __fieldRead2875_2() : __fieldRead2875_3());
}
public static void h2875_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1287500_0(p0);
}
private static native long __fieldRead2875_0() throws Throwable;
private static native boolean __call2875_1(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.EnumRarity __fieldRead2875_2() throws Throwable;
private static native net.minecraft.item.EnumRarity __fieldRead2875_3() throws Throwable;
private static native java.lang.RuntimeException __call1287500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7e4daf1911e97f0c364e(net.minecraft.item.Item a0) throws E;
private static final class __SourceHandler_7e4daf1911e97f0c364e {

public static boolean f1601(net.minecraft.item.Item receiver) throws Throwable {
    int forwardValue1601_13_0;
    int forwardValue1601_17_0;
    int forwardValue1601_19_0;
    int spill1601_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (__fieldRead1601_0() ^ 38791657997264L);
    life3_5 = __integerCategory1601_2(__call1601_1());
    spill1601_0 = __fieldRead1601_3(receiver);
    if (!((life3_5 != 0))) {
        forwardValue1601_13_0 = spill1601_0;
        break forward_join_13;
    }
    if (!((spill1601_0 > 0))) {
        break forward_join_18;
    }
    forwardValue1601_13_0 = __integerCategory1601_5(__fieldRead1601_4(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue1601_17_0 = forwardValue1601_13_0;
        break forward_join_17;
    }
    if (!((forwardValue1601_13_0 == 0))) {
        break forward_join_18;
    }
    forwardValue1601_17_0 = 1;
    }
    forwardValue1601_19_0 = forwardValue1601_17_0;
    break forward_join_19;
    }
    forwardValue1601_19_0 = 0;
    }
    return __integerCategory1601_6(forwardValue1601_19_0);
}
public static void h1601_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160100_0(p0);
}
public static void h1601_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160101_0(p0);
}
public static void h1601_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160102_0(p0);
}
private static native long __fieldRead1601_0() throws Throwable;
private static native boolean __call1601_1() throws Throwable;
private static native int __integerCategory1601_2(boolean value) throws Throwable;
private static native int __fieldRead1601_3(net.minecraft.item.Item a0) throws Throwable;
private static native boolean __fieldRead1601_4(net.minecraft.item.Item a0) throws Throwable;
private static native int __integerCategory1601_5(boolean value) throws Throwable;
private static native boolean __integerCategory1601_6(int value) throws Throwable;
private static native java.lang.RuntimeException __call1160100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call1160101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call1160102_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_041a1d75b1dcc8c1aefd(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_041a1d75b1dcc8c1aefd {

public static boolean f1602(net.minecraft.item.Item receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    int forwardValue1602_14_0;
    int forwardValue1602_18_0;
    int forwardValue1602_20_0;
    int spill1602_0;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life2_3 = (__fieldRead1602_0() ^ 62924855709938L);
    life4_5 = __integerCategory1602_2(__call1602_1());
    spill1602_0 = __call1602_3(receiver);
    if (!((life4_5 != 0))) {
        forwardValue1602_14_0 = spill1602_0;
        break forward_join_14;
    }
    if (!((spill1602_0 == 1))) {
        break forward_join_19;
    }
    forwardValue1602_14_0 = __integerCategory1602_5(__call1602_4(receiver));
    }
    if (!((life4_5 != 0))) {
        forwardValue1602_18_0 = forwardValue1602_14_0;
        break forward_join_18;
    }
    if (!((forwardValue1602_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue1602_18_0 = 1;
    }
    forwardValue1602_20_0 = forwardValue1602_18_0;
    break forward_join_20;
    }
    forwardValue1602_20_0 = 0;
    }
    return __integerCategory1602_6(forwardValue1602_20_0);
}
public static void h1602_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160200_0(p0);
}
public static void h1602_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160201_0(p0);
}
public static void h1602_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1160202_0(p0);
}
private static native long __fieldRead1602_0() throws Throwable;
private static native boolean __call1602_1() throws Throwable;
private static native int __integerCategory1602_2(boolean value) throws Throwable;
private static native int __call1602_3(net.minecraft.item.Item a0) throws Throwable;
private static native boolean __call1602_4(net.minecraft.item.Item a0) throws Throwable;
private static native int __integerCategory1602_5(boolean value) throws Throwable;
private static native boolean __integerCategory1602_6(int value) throws Throwable;
private static native java.lang.RuntimeException __call1160200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call1160201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call1160202_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_e854e1fbe915339f532d() throws E;
private static final class __SourceHandler_e854e1fbe915339f532d {

public static int f2878() throws Throwable {
    int life0_1;
    life0_1 = __call2878_0();
    if ((life0_1 == 0)) {
        return 7;
    }
    return 0;
}
public static void h2878_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1287800_0(p0);
}
private static native int __call2878_0() throws Throwable;
private static native java.lang.RuntimeException __call1287800_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e924b3b60b43868374a0(net.minecraft.item.Item a0) throws E;
private static final class __SourceHandler_e924b3b60b43868374a0 {

public static boolean f2879(net.minecraft.item.Item receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2879_0() ^ 63465705794668L);
    return ((__fieldRead2879_1(receiver) != null) ? true : false);
}
public static void h2879_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1287900_0(p0);
}
private static native long __fieldRead2879_0() throws Throwable;
private static native net.minecraft.item.Item __fieldRead2879_1(net.minecraft.item.Item a0) throws Throwable;
private static native java.lang.RuntimeException __call1287900_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_f1ed085c4f0112ef5cc4(net.minecraft.item.ItemStack a0) throws E;
private static final class __SourceHandler_f1ed085c4f0112ef5cc4 {

public static java.lang.String f2880(net.minecraft.item.ItemStack p0) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2880_0() ^ 46743539665776L);
    return (((__call2880_1(p0) & 1) == 1) ? "wet" : "dry");
}
public static void h2880_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1288000_0(p0);
}
private static native long __fieldRead2880_0() throws Throwable;
private static native int __call2880_1(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.RuntimeException __call1288000_0(java.lang.NumberFormatException a0) throws Throwable;

}


public static void b__Void(int p0) {
m = ((int)(p0));
    return;
}


public net.minecraft.item.ItemStack b(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
return p0;
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
return __sourceIntrinsic_33df8f166dd6_originalDynamicSite2020_1(this.l);
}


public net.minecraft.item.Item b(java.lang.String p0) {
this.l = ((java.lang.String)(p0));
    return this;
}


public int b() {
return this.g;
}


public boolean b__Boolean() { return __sourceHandlerCall_7e4daf1911e97f0c364e(this); }


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.item.ItemStack)(p0)).i())) != 0);
}


public net.minecraft.item.Item b(int p0) {
this.f = ((int)(p0));
    return this;
}


public net.minecraft.item.Item b__wQ() {
return this.j;
}


public boolean e__Boolean() {
return ((1) != 0);
}


public static int e() { return __sourceHandlerCall_e854e1fbe915339f532d(); }


protected net.minecraft.item.Item c(java.lang.String p0) {
this.k = ((java.lang.String)(p0));
    return this;
}


public java.lang.String c(net.minecraft.item.ItemStack p0) {
return this.k;
}


public boolean c__Boolean(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_041a1d75b1dcc8c1aefd(this, p0); }


public boolean c__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public int c() {
return 0;
}


protected net.minecraft.item.Item c(int p0) {
this.g = ((int)(p0));
    return this;
}


public boolean h() {
return ((0) != 0);
}


public boolean f() { return __sourceHandlerCall_e924b3b60b43868374a0(this); }


public boolean d__Boolean() {
return ((0) != 0);
}


public static int d() {
return net.minecraft.item.Item.m;
}


public java.lang.String d(net.minecraft.item.ItemStack p0) {
return ((java.lang.String)(__sourceIntrinsic_480a975002ff_originalDynamicSite2021_3(net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_480a975002ff_originalDynamicSite2021_1(((net.minecraft.item.Item)(this)).a__String(((net.minecraft.item.ItemStack)(p0)))))))))).trim();
}


public com.google.common.collect.Multimap<java.lang.String, moom.vB> a__Multimap() {
return com.google.common.collect.HashMultimap.create();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.Item.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.item.EnumRarity a__a3(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_a4cb26b12bd788e7ae4f(this, p0); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5545;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wQ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


protected net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, boolean p2) { return __sourceHandlerCall_5ff46852e86904676ffe(this, p0, p1, p2); }


public static void a__Void() { __sourceHandlerCall_674645d5150aab628536(); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11897_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_d3236d9290bd58e0a785(this, p0); }


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
return;
}


private static void a(int p0, java.lang.String p1, net.minecraft.item.Item p2) {
net.minecraft.item.Item.a(((int)(p0)), ((moom.DD)(new moom.DD(p1))), ((net.minecraft.item.Item)(p2)));
    return;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 0))));
    return;
}


public net.minecraft.creativetab.CreativeTabs a__q1() {
return this.d;
}


protected static void a(net.minecraft.block.Block p0, net.minecraft.item.Item p1) {
net.minecraft.item.Item.a(((int)(net.minecraft.block.Block.a(((net.minecraft.block.Block)(p0))))), ((moom.DD)(((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(p0))))))), ((net.minecraft.item.Item)(p1)));
    ((java.util.Map)(net.minecraft.item.Item.b)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}


private static void a__Void(net.minecraft.block.Block p0) {
net.minecraft.item.Item.a(((net.minecraft.block.Block)(p0)), ((net.minecraft.item.Item)(new moom.wU(p0))));
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
return ((0) != 0);
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public net.minecraft.item.Item a(net.minecraft.creativetab.CreativeTabs p0) {
this.d = ((net.minecraft.creativetab.CreativeTabs)(p0));
    return this;
}


private static void a(int p0, moom.DD p1, net.minecraft.item.Item p2) {
((moom.DB)(net.minecraft.item.Item.a)).a(((int)(p0)), ((java.lang.Object)(p1)), ((java.lang.Object)(p2)));
    return;
}


public boolean a__Boolean() {
return ((((this.i) ? 1 : 0)) != 0);
}


public int a(int p0) {
return 0;
}


public int a() {
return this.f;
}


public static int a(net.minecraft.item.Item p0) { return __sourceHandlerCall_f2cce05cd4611b5688f3(p0); }


protected net.minecraft.item.Item a(boolean p0) {
this.i = ((boolean)(p0));
    return this;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.entity.EntityLivingBase p2) {
return ((0) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.block.Block p2, moom.DT p3, net.minecraft.entity.EntityLivingBase p4) {
return ((0) != 0);
}


public boolean a(net.minecraft.nbt.NBTTagCompound p0) {
return ((0) != 0);
}


public static net.minecraft.item.Item a(java.lang.String p0) { return __sourceHandlerCall_5b36eec9bead5fd52f25(p0); }


public static net.minecraft.item.Item a(net.minecraft.block.Block p0) {
return ((net.minecraft.item.Item)(((java.util.Map)(net.minecraft.item.Item.b)).get(((java.lang.Object)(p0)))));
}


public static net.minecraft.item.Item a__wQ(int p0) {
return ((net.minecraft.item.Item)(((moom.DB)(net.minecraft.item.Item.a)).a(((int)(p0)))));
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
return ((0) != 0);
}


public float a(net.minecraft.item.ItemStack p0, net.minecraft.block.Block p1) {
return 0x1.0p0f;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
return p0;
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
long local3 = (net.minecraft.item.Item.y ^ 76576214593048L);
    return __sourceIntrinsic_3a92510638ee_originalDynamicSite2022_1(25847, (4585071944336466248L ^ local3));
}


public int a__Int(net.minecraft.item.ItemStack p0) {
return 0;
}


public net.minecraft.item.Item a__wQ(net.minecraft.item.Item p0) {
this.j = ((net.minecraft.item.Item)(p0));
    return this;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.Entity p2, int p3, boolean p4) {
return;
}


public moom.a1 a__a1(net.minecraft.item.ItemStack p0) {
return moom.a1.NONE;
}


public void a__Void(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.entity.EntityLivingBase p2) {
return ((0) != 0);
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
return ((0) != 0);
}


public net.minecraft.item.Item a__wQ() {
this.h = ((boolean)(true));
    return this;
}


public java.lang.String a__String(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_5c064ef1e0c8bd002ad9(this, p0); }


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite2023_1(this.l);
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2, int p3) {
return;
}


public boolean g() {
return ((0) != 0);
}


private static java.lang.String lambda$registerItems$11(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$2(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$9(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.a(((moom.M)(moom.M.YELLOW)), ((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$12(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$15(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockPrismarine$EnumType)(net.minecraft.block.BlockPrismarine$EnumType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$5(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$13(net.minecraft.item.ItemStack p0) {
return ((moom.at)(moom.at.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$1(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$7(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_f1ed085c4f0112ef5cc4(p0); }


private static java.lang.String lambda$registerItems$3(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$16(net.minecraft.item.ItemStack p0) {
return ((moom.Y)(moom.Y.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$8(net.minecraft.item.ItemStack p0) {
return ((moom.ac)(moom.ac.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$6(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.a(((int)((((net.minecraft.item.ItemStack)(p0)).c() + 4)))))).b();
}


private static java.lang.String lambda$registerItems$0(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$14(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$10(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.a(((moom.M)(moom.M.RED)), ((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static java.lang.String lambda$registerItems$4(net.minecraft.item.ItemStack p0) {
return ((moom.ab)(moom.ab.a(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b();
}


private static native <E extends Throwable> int __sourceIntrinsic_32bcc6eeb11fdd2e_originalDynamicSite3914_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11897_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_originalDynamicSite2022_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite2023_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_originalDynamicSite2020_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_originalDynamicSite2021_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_originalDynamicSite2021_3(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
