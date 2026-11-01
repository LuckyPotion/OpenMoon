package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bX extends sourcebuild.EnumConstructor<moom.bX> implements moom.Lv {

public static moom.bX IS_ALIVE;

public static moom.bX IS_BURNING;

public static moom.bX IS_CHILD;

public static moom.bX IS_HURT;

public static moom.bX IS_IN_LAVA;

public static moom.bX IS_IN_WATER;

public static moom.bX IS_INVISIBLE;

public static moom.bX IS_ON_GROUND;

public static moom.bX IS_RIDDEN;

public static moom.bX IS_RIDING;

public static moom.bX IS_SNEAKING;

public static moom.bX IS_SPRINTING;

public static moom.bX IS_WET;

private java.lang.String a;

private net.minecraft.client.renderer.entity.RenderManager b;

private static moom.bX[] c;

private static moom.bX[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private bX(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
    this.b = (net.minecraft.client.Minecraft.a__fM()).a__nw();
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-1949862722794352167L)), ((long)(3153624345324992840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(13361979657647L)))));
    long local20_life6 = (moom.bX.e ^ 32475088011502L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill774_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill774_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill774_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill774_13 = new byte[8];
    (__sourceSpill774_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill774_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation774_15 = __sourceSpill774_13;
    ((javax.crypto.Cipher)(__sourceSpill774_10)).init(((int)(__sourceSpill774_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill774_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation774_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[26];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "\005\022\013ameR±®#æ¼Eô\020Û¡Ý\036\033Pª\031çaÕn¢4óê\020ØÁ\023¬­Õ\026à<_y\026\020TA\033­\"EÉt\rEHl¿\0206ä\025Ñ_ÙuÞ8\031dN­^\037\020©¸ù¯,Z×mñ,_§[@àJ\bâésÔ¥­\b5¡ó­\031(Ã\020~¾\023.3~Û\024Çmö¿Z'U4\020Ð]ÓúØÑDÒ\\\030cÚx~\020ªÖ\0311e\003jóW[ÕÛªÅ~\020»ÀÜ'\030À¤#,¸SSY\035\020.Y¹Ó\033î\033Ç¸×fª¢/\020øÔ¹\004Ë¸oX©7'Ø\\´;\020.p¦IYé\016NªQÛ=ÞÁ\006\020JÜ)ú\013L´ÈF\fÔé\001\020¡>6×õ\016ã{ÔJó\035QO\båQ»p\037¿\020ëD8\027\004\026\033¦Á+¼,óº\020aTÄ\023/\001¾5anâ&Ù\020P)Q®èâRïC-áÏ\001:\020º\021\005Ñ ¯*¼Ë\001Áj\t\0203Æs³¿^Ä?½\027ûÜA±\b+\f\bj~\031\017}"))).length();
    int local15_life23 = 16;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill774_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill774_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill774_28)).doFinal(((byte[])(__sourceSpill774_27)));
        java.lang.String __sourceSpill774_33 = ((java.lang.String)(moom.bX.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill774_34 = local11_life18;
        int __sourceSpill774_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill774_34)[__sourceSpill774_35] = __sourceSpill774_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "|Z®®}Â^ºMÅnH|\020Æ\020ñý>FqP¡â\005ÞÝÑ"))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill774_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill774_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill774_41)).doFinal(((byte[])(__sourceSpill774_40)));
        java.lang.String __sourceSpill774_46 = ((java.lang.String)(moom.bX.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill774_47 = local11_life18;
        int __sourceSpill774_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill774_47)[__sourceSpill774_48] = __sourceSpill774_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill774_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill774_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill774_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill774_57 = new byte[8];
    (__sourceSpill774_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill774_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation774_59 = __sourceSpill774_57;
    ((javax.crypto.Cipher)(__sourceSpill774_54)).init(((int)(__sourceSpill774_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill774_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation774_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[15];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "Ï¦Ê\b!\0164xÎ\037åB\fçeH}×E\035;ó\036:Uþ\033Üd\000r¹ÜeÒÙù©\033f5Ú6À\"u5'Çô^eü¾B³èÆ0ycz+`è¥ÜÍ\\ä´\013ÅëÑýÄ\037\036\t\007ó8÷äÒv¼¥"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill774_68 = local4_life64;
        int __sourceSpill774_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill774_68)).substring(((int)(__sourceSpill774_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill774_73 = local6_life62;
        int __sourceSpill774_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill774_76 = new byte[8];
        (__sourceSpill774_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill774_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill774_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill774_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill774_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill774_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill774_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill774_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill774_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill774_77)).doFinal(((byte[])(__sourceSpill774_76)));
        (__sourceSpill774_73)[__sourceSpill774_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "î\023ã£Ç®& \036Â\033°Úú"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill774_81 = local4_life64;
        int __sourceSpill774_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill774_81)).substring(((int)(__sourceSpill774_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill774_86 = local6_life62;
        int __sourceSpill774_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill774_89 = new byte[8];
        (__sourceSpill774_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill774_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill774_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill774_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill774_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill774_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill774_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill774_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill774_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill774_90)).doFinal(((byte[])(__sourceSpill774_89)));
        (__sourceSpill774_86)[__sourceSpill774_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    f = ((long[])(local6_life62));
    g = ((java.lang.Integer[])(new java.lang.Integer[15]));
    IS_ALIVE = ((moom.bX)(new moom.bX((local11_life18)[22], 0, (local11_life18)[15])));
    IS_BURNING = ((moom.bX)(new moom.bX((local11_life18)[8], 1, (local11_life18)[16])));
    IS_CHILD = ((moom.bX)(new moom.bX((local11_life18)[12], 2, (local11_life18)[18])));
    IS_HURT = ((moom.bX)(new moom.bX((local11_life18)[6], 3, (local11_life18)[17])));
    IS_IN_LAVA = ((moom.bX)(new moom.bX((local11_life18)[11], 4, (local11_life18)[13])));
    IS_IN_WATER = ((moom.bX)(new moom.bX((local11_life18)[4], 5, (local11_life18)[20])));
    IS_INVISIBLE = ((moom.bX)(new moom.bX((local11_life18)[19], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_101(20553, (6020509901774409108L ^ local20_life6)), (local11_life18)[2])));
    IS_ON_GROUND = ((moom.bX)(new moom.bX((local11_life18)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_103(17529, (2682001923806747048L ^ local20_life6)), (local11_life18)[21])));
    IS_RIDDEN = ((moom.bX)(new moom.bX((local11_life18)[0], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_105(3461, (3423750373471424598L ^ local20_life6)), (local11_life18)[9])));
    IS_RIDING = ((moom.bX)(new moom.bX((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_107(13898, (5472195926637489041L ^ local20_life6)), (local11_life18)[10])));
    IS_SNEAKING = ((moom.bX)(new moom.bX((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_109(552, (6949695135731818492L ^ local20_life6)), (local11_life18)[24])));
    IS_SPRINTING = ((moom.bX)(new moom.bX((local11_life18)[25], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_111(22292, (7730925699285797570L ^ local20_life6)), (local11_life18)[14])));
    IS_WET = ((moom.bX)(new moom.bX((local11_life18)[23], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_113(21946, (404011620195387493L ^ local20_life6)), (local11_life18)[7])));
    d = ((moom.bX[])(moom.bX.a__ArraybX()));
    c = ((moom.bX[])(moom.bX.values()));
}


public static moom.bX[] values() {
return ((moom.bX[])(((moom.bX[])(moom.bX.d)).clone()));
}


public static moom.bX valueOf(java.lang.String p0) {
return ((moom.bX)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bX.class)), ((java.lang.String)(p0)))));
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
        byte[] spill3529_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3529_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3529_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3529_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3529_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3529_2)[life4_9];
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


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27899;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/bX", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bX.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6962_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a() {
return this.a;
}


public boolean a__Boolean() {
int forestValue394_39_0;
    int forestValue394_41_0;
    int forestValue394_60_0;
    int forestValue394_74_0;
    java.lang.String spill394_0;
    int spill394_1;
    int spill394_2;
    int spill394_3;
    long life1_3;
    net.minecraft.entity.Entity life4_7;
    java.lang.String life3_8;
    net.minecraft.entity.EntityLivingBase life5_17;
    forest_join_74: {
    forest_join_73: {
    forest_join_70: {
    forest_join_67: {
    forest_join_64: {
    forest_join_61: {
    forest_join_60: {
    forest_join_59: {
    forest_join_54: {
    forest_join_51: {
    forest_join_48: {
    forest_join_45: {
    forest_join_42: {
    forest_join_41: {
    forest_join_40: {
    forest_join_39: {
    forest_join_33: {
    forest_join_30: {
    forest_join_27: {
    forest_join_24: {
    life1_3 = (moom.bX.e ^ 133679642102114L);
    spill394_0 = moom.Nq.b__String();
    life4_7 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__r3();
    life3_8 = spill394_0;
    spill394_1 = ((life4_7 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life3_8 != null))) {
        forestValue394_74_0 = spill394_1;
        break forest_join_74;
    }
    if (!((spill394_1 != 0))) {
        break forest_join_73;
    }
    life5_17 = ((net.minecraft.entity.EntityLivingBase)(life4_7));
    spill394_2 = (moom.Nn.a)[((moom.bX)(this)).ordinal()];
    if (!((life3_8 != null))) {
        forestValue394_74_0 = spill394_2;
        break forest_join_74;
    }
    switch (spill394_2) {
case 1:
{
        break forest_join_24;
    }
case 2:
{
        break forest_join_27;
    }
case 3:
{
        break forest_join_30;
    }
case 4:
{
        break forest_join_33;
    }
case 5:
{
        break forest_join_42;
    }
case 6:
{
        break forest_join_45;
    }
case 7:
{
        break forest_join_48;
    }
case 8:
{
        break forest_join_51;
    }
case 9:
{
        break forest_join_54;
    }
case 10:
{
        break forest_join_61;
    }
case 11:
{
        break forest_join_64;
    }
case 12:
{
        break forest_join_67;
    }
case 13:
{
        break forest_join_70;
    }
default:
{
        break forest_join_73;
    }
}
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).p__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).r__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).c__Boolean();
    }
    spill394_3 = ((net.minecraft.entity.EntityLivingBase)(life5_17)).aO;
    if (!((life3_8 != null))) {
        forestValue394_39_0 = spill394_3;
        break forest_join_39;
    }
    if (!((spill394_3 > 0))) {
        break forest_join_40;
    }
    forestValue394_39_0 = 1;
    }
    forestValue394_41_0 = forestValue394_39_0;
    break forest_join_41;
    }
    forestValue394_41_0 = 0;
    }
    return ((forestValue394_41_0) != 0);
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).l__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).j__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).v__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).A;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(life5_17)).f != null))) {
        break forest_join_59;
    }
    forestValue394_60_0 = 1;
    break forest_join_60;
    }
    forestValue394_60_0 = 0;
    }
    return ((forestValue394_60_0) != 0);
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).s__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).t__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).u__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life5_17)).i__Boolean();
    }
    forestValue394_74_0 = 0;
    }
    return ((forestValue394_74_0) != 0);
}


public static moom.bX a(java.lang.String p0) {
long life1_3;
    java.lang.String life3_5;
    moom.bX[] life4_9;
    int life5_12;
    int life6_14;
    moom.bX life7_21;
    lexical_join_34: {
    life1_3 = (moom.bX.e ^ 130922853812299L);
    life3_5 = moom.Nq.b__String();
    if (!((p0 != null))) {
        break lexical_join_34;
    }
    life4_9 = moom.bX.c;
    life5_12 = (life4_9).length;
    life6_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life6_14 < life5_12))) {
        break lexical_join_34;
    }
    life7_21 = (life4_9)[life6_14];
    if (!((life3_5 != null))) {
        break lexical_join_32;
    }
    if (!(((java.lang.String)(((moom.bX)(life7_21)).a())).equals(((java.lang.Object)(p0))))) {
        break lexical_join_31;
    }
    return life7_21;
    }
    life6_14 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return null;
}


private static moom.bX[] a__ArraybX() {
long local0_life1 = (moom.bX.e ^ 105713832024757L);
    moom.bX[] __sourceSharedArray765_4 = new moom.bX[__sourceIntrinsic_597590b4025a_originalDynamicSite765_2(16257, (8062613904436869135L ^ local0_life1))];
    __sourceSharedArray765_4[0] = moom.bX.IS_ALIVE;
    __sourceSharedArray765_4[1] = moom.bX.IS_BURNING;
    __sourceSharedArray765_4[2] = moom.bX.IS_CHILD;
    __sourceSharedArray765_4[3] = moom.bX.IS_HURT;
    __sourceSharedArray765_4[4] = moom.bX.IS_IN_LAVA;
    __sourceSharedArray765_4[5] = moom.bX.IS_IN_WATER;
    __sourceSharedArray765_4[__sourceIntrinsic_597590b4025a_originalDynamicSite765_10(32642, (3350235889290246144L ^ local0_life1))] = moom.bX.IS_INVISIBLE;
    __sourceSharedArray765_4[__sourceIntrinsic_597590b4025a_originalDynamicSite765_12(19162, (7459504002110836057L ^ local0_life1))] = moom.bX.IS_ON_GROUND;
    __sourceSharedArray765_4[__sourceIntrinsic_597590b4025a_originalDynamicSite765_14(5210, (5191623077010510815L ^ local0_life1))] = moom.bX.IS_RIDDEN;
    __sourceSharedArray765_4[__sourceIntrinsic_597590b4025a_originalDynamicSite765_16(21992, (5220637306227806817L ^ local0_life1))] = moom.bX.IS_RIDING;
    __sourceSharedArray765_4[__sourceIntrinsic_597590b4025a_originalDynamicSite765_18(9753, (5846684926318813586L ^ local0_life1))] = moom.bX.IS_SNEAKING;
    __sourceSharedArray765_4[__sourceIntrinsic_597590b4025a_originalDynamicSite765_20(14709, (5096831010567438068L ^ local0_life1))] = moom.bX.IS_SPRINTING;
    __sourceSharedArray765_4[__sourceIntrinsic_597590b4025a_originalDynamicSite765_22(25239, (9079037566995457307L ^ local0_life1))] = moom.bX.IS_WET;
    return __sourceSharedArray765_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite774_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6962_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_597590b4025a_originalDynamicSite765_22(int a0, long a1) throws E;
}
