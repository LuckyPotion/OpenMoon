package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bR extends sourcebuild.EnumConstructor<moom.bR> implements moom.Lx {

public static moom.bR LIMB_SWING;

public static moom.bR LIMB_SWING_SPEED;

public static moom.bR AGE;

public static moom.bR HEAD_YAW;

public static moom.bR HEAD_PITCH;

public static moom.bR SCALE;

public static moom.bR HEALTH;

public static moom.bR HURT_TIME;

public static moom.bR IDLE_TIME;

public static moom.bR MAX_HEALTH;

public static moom.bR MOVE_FORWARD;

public static moom.bR MOVE_STRAFING;

public static moom.bR PARTIAL_TICKS;

public static moom.bR POS_X;

public static moom.bR POS_Y;

public static moom.bR POS_Z;

public static moom.bR REVENGE_TIME;

public static moom.bR SWING_PROGRESS;

private java.lang.String a;

private net.minecraft.client.renderer.entity.RenderManager b;

private static moom.bR[] c;

private static moom.bR[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private bR(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
    this.b = (net.minecraft.client.Minecraft.a__fM()).a__nw();
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(4897941398952308857L)), ((long)(5237915923214399832L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(246695805158861L)))));
    long local20_life6 = (moom.bR.e ^ 32896899375641L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill770_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill770_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill770_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill770_13 = new byte[8];
    (__sourceSpill770_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill770_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation770_15 = __sourceSpill770_13;
    ((javax.crypto.Cipher)(__sourceSpill770_10)).init(((int)(__sourceSpill770_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill770_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation770_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[36];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "j:ªõ\016Ö¼LJåPÀ\b¡ÒIéZ÷\bk\004HüTÃy´\020d4ª³llWUá\023¢D\021ñ\020-f\035µw\002\037wGíIXGÕ±\020\022ú)Ã\030¡\002Óäf¶cõ*]\035\020\027AZ\002=ÖüÇ`ì\\\020\017Iïas\001\0006\020£²D=ïW\b$«Þ½ \bÿ\013Å\004³ñS\020\004ûûRG?üÏy\"-0ÜÄ\b÷ä\fuFlC\030+² #\017ÊMX\000\020EÖ£aÞIZ\024áøT\020hLy©Ú\003±ÊÅîyQºX\bèéw_Ð\0203\004Û\1772\007ÿàjÌ8dÑÇ©\020ðÌëµ*.îaÓ\022ÈeÖZ¨\020\001Ü%XÍÓ+euB\021et|'Ô\020\031¦çJúÉ4\036Y¯^-A\f\bÎ.¾ÄoÖ5\020+² #\017Ê/R§\b\035¯\021¿\020×ú1J3Ü]«êµ/&J'è\020ª\n£lcnnxR1/=6à:\b¹,©ÂòÄÄ!\020ÝÝ÷kð³±ô¸®\1773Â\020éZj¡\n~G&µ¿Be\000z£\bà]Õ»s],\020¥zÕ\005IÎ\033.\027\000\021\000ê\020Îsw8Ô[8\025(ÂHbîø4^\020.±\021¼Íûíï\005½ð{Hë\b ~m\000xÈæ\b\017äm\"\në¥\020Æ_'0SLÎ\031×%½Mú\020\033 L\025\025¥;_{Ô ë\032>k"))).length();
    int local15_life23 = 16;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill770_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill770_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill770_28)).doFinal(((byte[])(__sourceSpill770_27)));
        java.lang.String __sourceSpill770_33 = ((java.lang.String)(moom.bR.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill770_34 = local11_life18;
        int __sourceSpill770_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill770_34)[__sourceSpill770_35] = __sourceSpill770_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "\025F}/®m×l¿®2öÚ8¡\020\b®§×ÛÄ;a"))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill770_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill770_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill770_41)).doFinal(((byte[])(__sourceSpill770_40)));
        java.lang.String __sourceSpill770_46 = ((java.lang.String)(moom.bR.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill770_47 = local11_life18;
        int __sourceSpill770_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill770_47)[__sourceSpill770_48] = __sourceSpill770_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill770_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill770_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill770_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill770_57 = new byte[8];
    (__sourceSpill770_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill770_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation770_59 = __sourceSpill770_57;
    ((javax.crypto.Cipher)(__sourceSpill770_54)).init(((int)(__sourceSpill770_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill770_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation770_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[25];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "\037lÅ4×)óiº9\\úµÆEò¤WRÃ©\026²D7\036§Â¢Þó\020\021v¼\021oAæU&\032_z¯ÉJ\bäÍíGa\037xÀÀä\001\016ÎÞEG\023\003Ho5Ø&:ÍÈ\024;êiµ\0045ÂV*I8¦%\037\007|¦µë\001\"÷Ú#ÝQ.÷\030år½¨ÏÆj¸ï$sZ\007};l3ç\004Ô[\022-í×\007Kùw\036g/dÿ[¤*¯k\034\020âX¼ád\033Û\031¸`r\037'Þ[\031+òO"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill770_68 = local4_life64;
        int __sourceSpill770_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill770_68)).substring(((int)(__sourceSpill770_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill770_73 = local6_life62;
        int __sourceSpill770_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill770_76 = new byte[8];
        (__sourceSpill770_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill770_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill770_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill770_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill770_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill770_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill770_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill770_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill770_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill770_77)).doFinal(((byte[])(__sourceSpill770_76)));
        (__sourceSpill770_73)[__sourceSpill770_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "À<\\è%Ó\026v»czºç"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill770_81 = local4_life64;
        int __sourceSpill770_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill770_81)).substring(((int)(__sourceSpill770_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill770_86 = local6_life62;
        int __sourceSpill770_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill770_89 = new byte[8];
        (__sourceSpill770_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill770_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill770_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill770_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill770_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill770_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill770_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill770_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill770_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill770_90)).doFinal(((byte[])(__sourceSpill770_89)));
        (__sourceSpill770_86)[__sourceSpill770_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    f = ((long[])(local6_life62));
    g = ((java.lang.Integer[])(new java.lang.Integer[25]));
    LIMB_SWING = ((moom.bR)(new moom.bR((local11_life18)[20], 0, (local11_life18)[28])));
    LIMB_SWING_SPEED = ((moom.bR)(new moom.bR((local11_life18)[12], 1, (local11_life18)[34])));
    AGE = ((moom.bR)(new moom.bR((local11_life18)[8], 2, (local11_life18)[2])));
    HEAD_YAW = ((moom.bR)(new moom.bR((local11_life18)[25], 3, (local11_life18)[5])));
    HEAD_PITCH = ((moom.bR)(new moom.bR((local11_life18)[29], 4, (local11_life18)[22])));
    SCALE = ((moom.bR)(new moom.bR((local11_life18)[30], 5, (local11_life18)[9])));
    HEALTH = ((moom.bR)(new moom.bR((local11_life18)[26], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_101(12912, (729117414962934944L ^ local20_life6)), (local11_life18)[35])));
    HURT_TIME = ((moom.bR)(new moom.bR((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_103(4180, (4641583106828441224L ^ local20_life6)), (local11_life18)[18])));
    IDLE_TIME = ((moom.bR)(new moom.bR((local11_life18)[4], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_105(10085, (13128395760902580L ^ local20_life6)), (local11_life18)[0])));
    MAX_HEALTH = ((moom.bR)(new moom.bR((local11_life18)[24], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_107(16327, (7269625573225249031L ^ local20_life6)), (local11_life18)[13])));
    MOVE_FORWARD = ((moom.bR)(new moom.bR((local11_life18)[10], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_109(21266, (7614476809124304336L ^ local20_life6)), (local11_life18)[16])));
    MOVE_STRAFING = ((moom.bR)(new moom.bR((local11_life18)[21], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_111(7744, (8407898865219639430L ^ local20_life6)), (local11_life18)[7])));
    PARTIAL_TICKS = ((moom.bR)(new moom.bR((local11_life18)[15], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_113(955, (7629713107858752864L ^ local20_life6)), (local11_life18)[32])));
    POS_X = ((moom.bR)(new moom.bR((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_115(31050, (7141487665702403986L ^ local20_life6)), (local11_life18)[14])));
    POS_Y = ((moom.bR)(new moom.bR((local11_life18)[31], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_117(11805, (2606758067081455838L ^ local20_life6)), (local11_life18)[11])));
    POS_Z = ((moom.bR)(new moom.bR((local11_life18)[23], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_119(22557, (4949680999681253080L ^ local20_life6)), (local11_life18)[19])));
    REVENGE_TIME = ((moom.bR)(new moom.bR((local11_life18)[17], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_121(3444, (355222502969641914L ^ local20_life6)), (local11_life18)[33])));
    SWING_PROGRESS = ((moom.bR)(new moom.bR((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_123(14958, (6223551052986301609L ^ local20_life6)), (local11_life18)[27])));
    d = ((moom.bR[])(moom.bR.a__ArraybR()));
    c = ((moom.bR[])(moom.bR.values()));
}


public static moom.bR[] values() {
return ((moom.bR[])(((moom.bR[])(moom.bR.d)).clone()));
}


public static moom.bR valueOf(java.lang.String p0) {
return ((moom.bR)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bR.class)), ((java.lang.String)(p0)))));
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
        byte[] spill3514_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3514_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3514_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3514_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3514_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3514_2)[life4_9];
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


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bR.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27816;
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
            throw new RuntimeException("moom/bR", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6941_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String() {
return this.a;
}


public moom.bS a__bS() {
return moom.bS.FLOAT;
}


public float a() {
net.minecraft.client.renderer.entity.Render forwardValue307_15_0;
    net.minecraft.client.renderer.entity.Render forwardValue307_20_0;
    int[] spill307_0;
    net.minecraft.client.renderer.entity.Render spill307_1;
    long life1_3;
    net.minecraft.client.renderer.entity.Render life4_8;
    int[] life3_9;
    moom.mS life5_30;
    net.minecraft.entity.EntityLivingBase life6_58;
    forward_join_98: {
    forward_join_93: {
    forward_join_89: {
    forward_join_85: {
    forward_join_81: {
    forward_join_77: {
    forward_join_74: {
    forward_join_71: {
    forward_join_68: {
    forward_join_64: {
    forward_join_60: {
    forward_join_57: {
    forward_join_52: {
    forward_join_45: {
    forward_join_42: {
    forward_join_39: {
    forward_join_36: {
    forward_join_33: {
    forward_join_30: {
    forward_join_27: {
    forward_join_20: {
    forward_join_15: {
    life1_3 = (moom.bR.e ^ 121043341152002L);
    spill307_0 = moom.Lg.b();
    life4_8 = ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).m;
    life3_9 = spill307_0;
    spill307_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue307_15_0 = spill307_1;
        break forward_join_15;
    }
    if (!((spill307_1 != null))) {
        break forward_join_98;
    }
    forwardValue307_15_0 = life4_8;
    }
    if (!((life3_9 == null))) {
        forwardValue307_20_0 = forwardValue307_15_0;
        break forward_join_20;
    }
    if (!((((forwardValue307_15_0 instanceof moom.mS) ? 1 : 0) != 0))) {
        break forward_join_98;
    }
    forwardValue307_20_0 = life4_8;
    }
    life5_30 = ((moom.mS)(forwardValue307_20_0));
    switch ((moom.Li.a)[((moom.bR)(this)).ordinal()]) {
case 12:
{
        break forward_join_27;
    }
case 13:
{
        break forward_join_30;
    }
case 14:
{
        break forward_join_33;
    }
case 15:
{
        break forward_join_36;
    }
case 16:
{
        break forward_join_39;
    }
case 17:
{
        break forward_join_42;
    }
default:
{
        break forward_join_45;
    }
}
    }
    return ((moom.mS)(life5_30)).o;
    }
    return ((moom.mS)(life5_30)).p;
    }
    return ((moom.mS)(life5_30)).q;
    }
    return ((moom.mS)(life5_30)).r;
    }
    return ((moom.mS)(life5_30)).s;
    }
    return ((moom.mS)(life5_30)).t;
    }
    life6_58 = ((moom.mS)(life5_30)).n;
    if (!((life6_58 == null))) {
        break forward_join_52;
    }
    return 0x0.0p0f;
    }
    switch ((moom.Li.a)[((moom.bR)(this)).ordinal()]) {
case 1:
{
        break forward_join_57;
    }
case 2:
{
        break forward_join_60;
    }
case 3:
{
        break forward_join_64;
    }
case 4:
{
        break forward_join_68;
    }
case 5:
{
        break forward_join_71;
    }
case 6:
{
        break forward_join_74;
    }
case 7:
{
        break forward_join_77;
    }
case 8:
{
        break forward_join_81;
    }
case 9:
{
        break forward_join_85;
    }
case 10:
{
        break forward_join_89;
    }
case 11:
{
        break forward_join_93;
    }
default:
{
        break forward_join_98;
    }
}
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_58)).b__sourceReturn_bc607678b6();
    }
    return ((float) ((net.minecraft.entity.EntityLivingBase)(life6_58)).aO);
    }
    return ((float) ((net.minecraft.entity.EntityLivingBase)(life6_58)).c__sourceReturn_8abf5c6871());
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_58)).a();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_58)).bk;
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_58)).bj;
    }
    return ((float) ((net.minecraft.entity.EntityLivingBase)(life6_58)).n);
    }
    return ((float) ((net.minecraft.entity.EntityLivingBase)(life6_58)).o);
    }
    return ((float) ((net.minecraft.entity.EntityLivingBase)(life6_58)).p);
    }
    return ((float) ((net.minecraft.entity.EntityLivingBase)(life6_58)).a__Int());
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_58)).b__sourceReturn_f6c4892e39(((float)(((moom.mS)(life5_30)).u)));
    }
    return 0x0.0p0f;
}


public static moom.bR a(java.lang.String p0) {
long life1_3;
    int[] life3_5;
    moom.bR[] life4_9;
    int life5_12;
    int life6_14;
    moom.bR life7_21;
    lexical_join_34: {
    life1_3 = (moom.bR.e ^ 66596884513098L);
    life3_5 = moom.Lg.b();
    if (!((p0 != null))) {
        break lexical_join_34;
    }
    life4_9 = moom.bR.c;
    life5_12 = (life4_9).length;
    life6_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life6_14 < life5_12))) {
        break lexical_join_34;
    }
    life7_21 = (life4_9)[life6_14];
    if (!((life3_5 == null))) {
        break lexical_join_32;
    }
    if (!(((java.lang.String)(((moom.bR)(life7_21)).a__String())).equals(((java.lang.Object)(p0))))) {
        break lexical_join_31;
    }
    return life7_21;
    }
    life6_14 += 1;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return null;
}


private static moom.bR[] a__ArraybR() {
long local0_life1 = (moom.bR.e ^ 41534059730100L);
    moom.bR[] __sourceSharedArray759_4 = new moom.bR[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_2(11509, (2279645344662264961L ^ local0_life1))];
    __sourceSharedArray759_4[0] = moom.bR.LIMB_SWING;
    __sourceSharedArray759_4[1] = moom.bR.LIMB_SWING_SPEED;
    __sourceSharedArray759_4[2] = moom.bR.AGE;
    __sourceSharedArray759_4[3] = moom.bR.HEAD_YAW;
    __sourceSharedArray759_4[4] = moom.bR.HEAD_PITCH;
    __sourceSharedArray759_4[5] = moom.bR.SCALE;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_10(8148, (3332297377890086830L ^ local0_life1))] = moom.bR.HEALTH;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_12(2830, (5714217168446634873L ^ local0_life1))] = moom.bR.HURT_TIME;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_14(25130, (1640828275759272518L ^ local0_life1))] = moom.bR.IDLE_TIME;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_16(23442, (2161510487501204461L ^ local0_life1))] = moom.bR.MAX_HEALTH;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_18(31382, (7836763903112596198L ^ local0_life1))] = moom.bR.MOVE_FORWARD;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_20(32139, (2282644320527502841L ^ local0_life1))] = moom.bR.MOVE_STRAFING;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_22(25753, (1995376741679518946L ^ local0_life1))] = moom.bR.PARTIAL_TICKS;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_24(13964, (8374588782248855269L ^ local0_life1))] = moom.bR.POS_X;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_26(4760, (3733313191451861728L ^ local0_life1))] = moom.bR.POS_Y;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_28(1078, (365363901145101381L ^ local0_life1))] = moom.bR.POS_Z;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_30(31814, (184968330659777592L ^ local0_life1))] = moom.bR.REVENGE_TIME;
    __sourceSharedArray759_4[__sourceIntrinsic_e57455a3061f_originalDynamicSite759_32(13961, (529305981350250224L ^ local0_life1))] = moom.bR.SWING_PROGRESS;
    return __sourceSharedArray759_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite770_123(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6941_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e57455a3061f_originalDynamicSite759_32(int a0, long a1) throws E;
}
