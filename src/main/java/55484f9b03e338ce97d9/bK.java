package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bK extends sourcebuild.EnumConstructor<moom.bK> {

public static moom.bK DOWN;

public static moom.bK UP;

public static moom.bK NORTH;

public static moom.bK SOUTH;

public static moom.bK WEST;

public static moom.bK EAST;

public static moom.bK NORTH_WEST;

public static moom.bK NORTH_EAST;

public static moom.bK SOUTH_WEST;

public static moom.bK SOUTH_EAST;

public static moom.bK DOWN_NORTH;

public static moom.bK DOWN_SOUTH;

public static moom.bK UP_NORTH;

public static moom.bK UP_SOUTH;

public static moom.bK DOWN_WEST;

public static moom.bK DOWN_EAST;

public static moom.bK UP_WEST;

public static moom.bK UP_EAST;

private moom.bs a;

private moom.bs b;

private static moom.bK[] c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private bK(java.lang.String p0, int p1, moom.bs p2, moom.bs p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private bK(java.lang.String p0, int p1, moom.bs p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(4489073738886483561L)), ((long)(4111091227791086049L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91890966866080L)))));
    long local20_life6 = (moom.bK.d ^ 60274046335421L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill763_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill763_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill763_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill763_13 = new byte[8];
    (__sourceSpill763_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill763_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation763_15 = __sourceSpill763_13;
    ((javax.crypto.Cipher)(__sourceSpill763_10)).init(((int)(__sourceSpill763_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill763_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation763_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[18];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "ÈÎ lth\037\020§ÁuzñÔÜ¿\017~rç\037\bz\021¯e\004,\020.9¼\bÚÃ\025æò/DPV\020££µEö\001~F*·ÝXÐ\033\020eoñ¦Ð\032\024\f{n\037\004R\0204\017\nùÕ\033%A\017Ó_ã=,ÉÂ\020©f#Ðý¾¶\000\r\\Qw\bÕè\024;»YX\r\020\016ü~âËT·Îíªmo2\020\f<?\0258[\177bì$ü;Ç±O\b\rE³goÁö\020ï*á`W·\177bû5'´i·\bd>ìò9\026å\bB»\n_84\003\bnp¨}¢Ñº"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill763_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill763_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill763_28)).doFinal(((byte[])(__sourceSpill763_27)));
        java.lang.String __sourceSpill763_33 = ((java.lang.String)(moom.bK.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill763_34 = local11_life18;
        int __sourceSpill763_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill763_34)[__sourceSpill763_35] = __sourceSpill763_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "Ø2Ëqu­m\020>îvòñ|íç@­\034\021¸"))).length();
    local15_life23 = 8;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill763_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill763_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill763_41)).doFinal(((byte[])(__sourceSpill763_40)));
        java.lang.String __sourceSpill763_46 = ((java.lang.String)(moom.bK.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill763_47 = local11_life18;
        int __sourceSpill763_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill763_47)[__sourceSpill763_48] = __sourceSpill763_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill763_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill763_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill763_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill763_57 = new byte[8];
    (__sourceSpill763_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill763_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation763_59 = __sourceSpill763_57;
    ((javax.crypto.Cipher)(__sourceSpill763_54)).init(((int)(__sourceSpill763_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill763_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation763_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[25];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "0û´W\020á_\t\004òÉÊÆí*Ç3Kòë²³¹ÞÊ7\t$D¤X¯JÜqu+Â4\037¬í\031±\0008ÛÞRØV\rgé¬ÿ\024\020Ôu¥y?\007ÿY\023ÿ\031\007ºâ^sôcÞ\nOÒ\003ó\003ÇæÔê)6h¦¦±ÝºåÝÀp\000·wÛË\033zàfÑ~8´½\\!Äÿ)V8 k\\^ûù¤\n2]Ôb\0134\t9~¯®çtý_!\002|!rË\020q£ A\0069¯F4\031cF=VÌo"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill763_68 = local4_life64;
        int __sourceSpill763_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill763_68)).substring(((int)(__sourceSpill763_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill763_73 = local6_life62;
        int __sourceSpill763_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill763_76 = new byte[8];
        (__sourceSpill763_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill763_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill763_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill763_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill763_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill763_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill763_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill763_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill763_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill763_77)).doFinal(((byte[])(__sourceSpill763_76)));
        (__sourceSpill763_73)[__sourceSpill763_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "$\025ç_ª¦ã¦K\025Ë!\b"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill763_81 = local4_life64;
        int __sourceSpill763_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill763_81)).substring(((int)(__sourceSpill763_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill763_86 = local6_life62;
        int __sourceSpill763_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill763_89 = new byte[8];
        (__sourceSpill763_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill763_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill763_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill763_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill763_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill763_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill763_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill763_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill763_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill763_90)).doFinal(((byte[])(__sourceSpill763_89)));
        (__sourceSpill763_86)[__sourceSpill763_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    e = ((long[])(local6_life62));
    f = ((java.lang.Integer[])(new java.lang.Integer[25]));
    DOWN = ((moom.bK)(new moom.bK((local11_life18)[16], 0, moom.bs.DOWN)));
    UP = ((moom.bK)(new moom.bK((local11_life18)[8], 1, moom.bs.UP)));
    NORTH = ((moom.bK)(new moom.bK((local11_life18)[13], 2, moom.bs.NORTH)));
    SOUTH = ((moom.bK)(new moom.bK((local11_life18)[15], 3, moom.bs.SOUTH)));
    WEST = ((moom.bK)(new moom.bK((local11_life18)[11], 4, moom.bs.WEST)));
    EAST = ((moom.bK)(new moom.bK((local11_life18)[0], 5, moom.bs.EAST)));
    NORTH_WEST = ((moom.bK)(new moom.bK((local11_life18)[9], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_107(19734, (860752719045656267L ^ local20_life6)), moom.bs.NORTH, moom.bs.WEST)));
    NORTH_EAST = ((moom.bK)(new moom.bK((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_111(5353, (8122681280297576248L ^ local20_life6)), moom.bs.NORTH, moom.bs.EAST)));
    SOUTH_WEST = ((moom.bK)(new moom.bK((local11_life18)[17], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_115(14863, (1260522246702762440L ^ local20_life6)), moom.bs.SOUTH, moom.bs.WEST)));
    SOUTH_EAST = ((moom.bK)(new moom.bK((local11_life18)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_119(3987, (366315689057729604L ^ local20_life6)), moom.bs.SOUTH, moom.bs.EAST)));
    DOWN_NORTH = ((moom.bK)(new moom.bK((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_123(18230, (6781362960993187062L ^ local20_life6)), moom.bs.DOWN, moom.bs.NORTH)));
    DOWN_SOUTH = ((moom.bK)(new moom.bK((local11_life18)[4], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_127(19272, (3676013814215637131L ^ local20_life6)), moom.bs.DOWN, moom.bs.SOUTH)));
    UP_NORTH = ((moom.bK)(new moom.bK((local11_life18)[10], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_131(21273, (5635743498088571099L ^ local20_life6)), moom.bs.UP, moom.bs.NORTH)));
    UP_SOUTH = ((moom.bK)(new moom.bK((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_135(6894, (2704748621549119805L ^ local20_life6)), moom.bs.UP, moom.bs.SOUTH)));
    DOWN_WEST = ((moom.bK)(new moom.bK((local11_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_139(11053, (601622689199495423L ^ local20_life6)), moom.bs.DOWN, moom.bs.WEST)));
    DOWN_EAST = ((moom.bK)(new moom.bK((local11_life18)[12], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_143(11619, (595890874063756986L ^ local20_life6)), moom.bs.DOWN, moom.bs.EAST)));
    UP_WEST = ((moom.bK)(new moom.bK((local11_life18)[2], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_147(23388, (2071993744323995785L ^ local20_life6)), moom.bs.UP, moom.bs.WEST)));
    UP_EAST = ((moom.bK)(new moom.bK((local11_life18)[14], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_151(22199, (7470444384955262305L ^ local20_life6)), moom.bs.UP, moom.bs.EAST)));
    c = ((moom.bK[])(moom.bK.a__ArraybK()));
}


public static moom.bK[] values() {
return ((moom.bK[])(((moom.bK[])(moom.bK.c)).clone()));
}


public static moom.bK valueOf(java.lang.String p0) {
return ((moom.bK)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bK.class)), ((java.lang.String)(p0)))));
}


public int b() {
long local1 = (moom.bK.d ^ 17137646530693L);
    int local3 = ((moom.bs)(this.a)).d();
    if ((this.b != null)) {
        local3 = (local3 + ((moom.bs)(this.b)).d());
    }
    return local3;
}


public moom.bs b__bs() {
return this.b;
}


public int c() {
long local1 = (moom.bK.d ^ 117331721989810L);
    int local3 = ((moom.bs)(this.a)).e();
    if ((this.b != null)) {
        local3 = (local3 + ((moom.bs)(this.b)).e());
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill3499_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3499_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3499_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3499_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3499_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3499_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28295;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/bK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6920_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a() {
long local1 = (moom.bK.d ^ 31004766428308L);
    int local3 = ((moom.bs)(this.a)).c();
    if ((this.b != null)) {
        local3 = (local3 + ((moom.bs)(this.b)).c());
    }
    return local3;
}


moom.DT a(moom.DT p0) {
moom.DT forwardValue2957_24_0;
    moom.DT spill2957_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.DT life1_13;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (moom.bK.d ^ 75348400292087L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2957_0 = ((moom.DT)(p0)).a(((moom.bs)(this.a)), ((int)(1)));
    if (!((life4_5 != null))) {
        forwardValue2957_24_0 = spill2957_0;
        break forward_join_24;
    }
    life1_13 = spill2957_0;
    if (!((this.b != null))) {
        break forward_join_23;
    }
    life1_13 = ((moom.DT)(life1_13)).a(((moom.bs)(this.b)), ((int)(1)));
    }
    forwardValue2957_24_0 = life1_13;
    }
    return forwardValue2957_24_0;
}


public boolean a__Boolean() {
long local1 = (moom.bK.d ^ 114923692524420L);
    return ((((this.b != null) ? 1 : 0)) != 0);
}


private static moom.bK[] a__ArraybK() {
long local0_life1 = (moom.bK.d ^ 12137554948529L);
    moom.bK[] __sourceSharedArray753_4 = new moom.bK[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_2(28157, (4824054829863867945L ^ local0_life1))];
    __sourceSharedArray753_4[0] = moom.bK.DOWN;
    __sourceSharedArray753_4[1] = moom.bK.UP;
    __sourceSharedArray753_4[2] = moom.bK.NORTH;
    __sourceSharedArray753_4[3] = moom.bK.SOUTH;
    __sourceSharedArray753_4[4] = moom.bK.WEST;
    __sourceSharedArray753_4[5] = moom.bK.EAST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_10(16427, (1164479638810377211L ^ local0_life1))] = moom.bK.NORTH_WEST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_12(22975, (4286206266552001150L ^ local0_life1))] = moom.bK.NORTH_EAST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_14(15878, (8687708708885448144L ^ local0_life1))] = moom.bK.SOUTH_WEST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_16(16222, (3103790480624993421L ^ local0_life1))] = moom.bK.SOUTH_EAST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_18(14046, (7153907167880072457L ^ local0_life1))] = moom.bK.DOWN_NORTH;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_20(2333, (6241371540996747989L ^ local0_life1))] = moom.bK.DOWN_SOUTH;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_22(24175, (5711310315905721783L ^ local0_life1))] = moom.bK.UP_NORTH;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_24(12011, (8207615901476902177L ^ local0_life1))] = moom.bK.UP_SOUTH;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_26(12639, (163629634561395331L ^ local0_life1))] = moom.bK.DOWN_WEST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_28(11872, (8154655749121365421L ^ local0_life1))] = moom.bK.DOWN_EAST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_30(10525, (7250350942907945679L ^ local0_life1))] = moom.bK.UP_WEST;
    __sourceSharedArray753_4[__sourceIntrinsic_b9ae688da80e_originalDynamicSite753_32(21701, (3343580988553735948L ^ local0_life1))] = moom.bK.UP_EAST;
    return __sourceSharedArray753_4;
}


public moom.bs a__bs() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite763_151(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6920_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9ae688da80e_originalDynamicSite753_32(int a0, long a1) throws E;
}
