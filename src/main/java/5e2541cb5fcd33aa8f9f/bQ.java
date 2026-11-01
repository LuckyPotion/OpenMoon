package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bQ extends sourcebuild.EnumConstructor<moom.bQ> implements moom.Lv {

public static moom.bQ IS_ALIVE;

public static moom.bQ IS_BURNING;

public static moom.bQ IS_CHILD;

public static moom.bQ IS_GLOWING;

public static moom.bQ IS_HURT;

public static moom.bQ IS_IN_LAVA;

public static moom.bQ IS_IN_WATER;

public static moom.bQ IS_INVISIBLE;

public static moom.bQ IS_ON_GROUND;

public static moom.bQ IS_RIDDEN;

public static moom.bQ IS_RIDING;

public static moom.bQ IS_SNEAKING;

public static moom.bQ IS_SPRINTING;

public static moom.bQ IS_WET;

private java.lang.String a;

private net.minecraft.client.renderer.entity.RenderManager b;

private static moom.bQ[] c;

private static moom.bQ[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private bQ(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
    this.b = (net.minecraft.client.Minecraft.a__fM()).a__nw();
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-5610485862636937868L)), ((long)(-6800092748714918207L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74945293517812L)))));
    long local20_life6 = (moom.bQ.e ^ 123569143704952L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill769_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill769_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill769_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill769_13 = new byte[8];
    (__sourceSpill769_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill769_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation769_15 = __sourceSpill769_13;
    ((javax.crypto.Cipher)(__sourceSpill769_10)).init(((int)(__sourceSpill769_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill769_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation769_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[28];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "\téçÅì\025kª\020\025Þî¥\037í\b\\iÛK9JD\020·Þp§vÖgí4\007Z\002%Í\0205Ééxî\035Ì=¶«Mñ\036\020ñÑÁ®®p(·Vé¡_Va\020õh¿ó¶ú¡éÿÅOü£CíÁ\020dµ8ÄÖ8\025Ò9ÇÔAÀ#\020ä\022\\óÐ\0236pCOO\001Cä\020\020}`{Ô\022Ü:?½ímCnæ\020Ñîþ¤b\\&a®bo×«ª\"¬\020N:X#,i5\"A*\b\007\020beJó\027çÿÖê\007UjVÜl\020Úá\0019ÔMtKg%LZj\031¯\020«\n\007ôoúeÅùÚ]\027ó\177B\bE.ö¢¶êæë\bÉ#)äP?\n\020Í5â¾ï\036ëö\003ØÅGTÕ¯¦\bÛ8É\fpki\020G9ý§}Uî\005^z#²\024Æ\020È-½¤\020BgD\177ø%\020ð\020b>\036°ãtyI½}5\017I\020æKÔýC\007æ0ÞOé\016¿\020öaUWP÷\001\006ü°W^\bm\020\020Í¯)\031~F7½\027O8é\\\024\020³Y\020¾ÙÔ³è)ðMçyúC\020K£\023?ÇWÔq\\W£C\030L\005"))).length();
    int local15_life23 = 16;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill769_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill769_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill769_28)).doFinal(((byte[])(__sourceSpill769_27)));
        java.lang.String __sourceSpill769_33 = ((java.lang.String)(moom.bQ.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill769_34 = local11_life18;
        int __sourceSpill769_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill769_34)[__sourceSpill769_35] = __sourceSpill769_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "(¤þ\024\005\020#cg¶ë¤2\"\020\017×¦_T\027\034.Q}\t®"))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill769_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill769_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill769_41)).doFinal(((byte[])(__sourceSpill769_40)));
        java.lang.String __sourceSpill769_46 = ((java.lang.String)(moom.bQ.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill769_47 = local11_life18;
        int __sourceSpill769_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill769_47)[__sourceSpill769_48] = __sourceSpill769_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill769_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill769_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill769_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill769_57 = new byte[8];
    (__sourceSpill769_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill769_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation769_59 = __sourceSpill769_57;
    ((javax.crypto.Cipher)(__sourceSpill769_54)).init(((int)(__sourceSpill769_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill769_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation769_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[17];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "ôz\034\013nR½Ó\025æRî±A1w¢ú\024.·J\007ô/à\023å\fd\013;m¬grSdÔX¢#ò.f6çî¬øÑ\016=¿v9ç\031]<iHJ¦ÌL*ô\nûØÜ62qc´×Ë\004\006 \007\017\tß£q,1\nÖ\"^)æµ\003\031þSå"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill769_68 = local4_life64;
        int __sourceSpill769_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill769_68)).substring(((int)(__sourceSpill769_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill769_73 = local6_life62;
        int __sourceSpill769_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill769_76 = new byte[8];
        (__sourceSpill769_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill769_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill769_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill769_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill769_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill769_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill769_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill769_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill769_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill769_77)).doFinal(((byte[])(__sourceSpill769_76)));
        (__sourceSpill769_73)[__sourceSpill769_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "ÿ\007û\fàì~§ÕòÃ_\004ä$"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill769_81 = local4_life64;
        int __sourceSpill769_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill769_81)).substring(((int)(__sourceSpill769_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill769_86 = local6_life62;
        int __sourceSpill769_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill769_89 = new byte[8];
        (__sourceSpill769_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill769_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill769_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill769_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill769_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill769_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill769_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill769_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill769_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill769_90)).doFinal(((byte[])(__sourceSpill769_89)));
        (__sourceSpill769_86)[__sourceSpill769_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    f = ((long[])(local6_life62));
    g = ((java.lang.Integer[])(new java.lang.Integer[17]));
    IS_ALIVE = ((moom.bQ)(new moom.bQ((local11_life18)[6], 0, (local11_life18)[2])));
    IS_BURNING = ((moom.bQ)(new moom.bQ((local11_life18)[25], 1, (local11_life18)[19])));
    IS_CHILD = ((moom.bQ)(new moom.bQ((local11_life18)[26], 2, (local11_life18)[9])));
    IS_GLOWING = ((moom.bQ)(new moom.bQ((local11_life18)[13], 3, (local11_life18)[4])));
    IS_HURT = ((moom.bQ)(new moom.bQ((local11_life18)[17], 4, (local11_life18)[15])));
    IS_IN_LAVA = ((moom.bQ)(new moom.bQ((local11_life18)[11], 5, (local11_life18)[23])));
    IS_IN_WATER = ((moom.bQ)(new moom.bQ((local11_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_101(30175, (7827793524840891467L ^ local20_life6)), (local11_life18)[10])));
    IS_INVISIBLE = ((moom.bQ)(new moom.bQ((local11_life18)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_103(6021, (302342566544401951L ^ local20_life6)), (local11_life18)[18])));
    IS_ON_GROUND = ((moom.bQ)(new moom.bQ((local11_life18)[27], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_105(1650, (7081850119146993639L ^ local20_life6)), (local11_life18)[8])));
    IS_RIDDEN = ((moom.bQ)(new moom.bQ((local11_life18)[20], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_107(17892, (1230196138141070447L ^ local20_life6)), (local11_life18)[21])));
    IS_RIDING = ((moom.bQ)(new moom.bQ((local11_life18)[24], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_109(9193, (8763680046097158782L ^ local20_life6)), (local11_life18)[12])));
    IS_SNEAKING = ((moom.bQ)(new moom.bQ((local11_life18)[0], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_111(13460, (6293752265931212041L ^ local20_life6)), (local11_life18)[22])));
    IS_SPRINTING = ((moom.bQ)(new moom.bQ((local11_life18)[16], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_113(4947, (7042982658657247938L ^ local20_life6)), (local11_life18)[3])));
    IS_WET = ((moom.bQ)(new moom.bQ((local11_life18)[14], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_115(8040, (6669411960040058616L ^ local20_life6)), (local11_life18)[1])));
    d = ((moom.bQ[])(moom.bQ.a__ArraybQ()));
    c = ((moom.bQ[])(moom.bQ.values()));
}


public static moom.bQ[] values() {
return ((moom.bQ[])(((moom.bQ[])(moom.bQ.d)).clone()));
}


public static moom.bQ valueOf(java.lang.String p0) {
return ((moom.bQ)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bQ.class)), ((java.lang.String)(p0)))));
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
        byte[] spill3510_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3510_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3510_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3510_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3510_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3510_2)[life4_9];
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
    int local7 = moom.bQ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x73D7;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/bQ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bQ.g[n2] = n4;
        }
        return g[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6937_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a() {
return this.a;
}


public moom.bS a__bS() {
return moom.bS.BOOL;
}


public boolean a__Boolean() {
net.minecraft.client.renderer.entity.Render forestValue390_15_0;
    int forestValue390_51_0;
    int forestValue390_53_0;
    int forestValue390_72_0;
    int forestValue390_86_0;
    int[] spill390_0;
    net.minecraft.client.renderer.entity.Render spill390_1;
    int spill390_2;
    int spill390_3;
    int spill390_4;
    long life1_3;
    net.minecraft.client.renderer.entity.Render life4_8;
    int[] life3_9;
    moom.mS life5_23;
    net.minecraft.entity.EntityLivingBase life6_26;
    forest_join_86: {
    forest_join_85: {
    forest_join_82: {
    forest_join_79: {
    forest_join_76: {
    forest_join_73: {
    forest_join_72: {
    forest_join_71: {
    forest_join_66: {
    forest_join_63: {
    forest_join_60: {
    forest_join_57: {
    forest_join_54: {
    forest_join_53: {
    forest_join_52: {
    forest_join_51: {
    forest_join_45: {
    forest_join_42: {
    forest_join_39: {
    forest_join_36: {
    forest_join_29: {
    forest_join_15: {
    life1_3 = (moom.bQ.e ^ 117134013896592L);
    spill390_0 = moom.Lg.b();
    life4_8 = ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).m;
    life3_9 = spill390_0;
    spill390_1 = life4_8;
    if (!((life3_9 == null))) {
        forestValue390_15_0 = spill390_1;
        break forest_join_15;
    }
    if (!((spill390_1 != null))) {
        break forest_join_85;
    }
    forestValue390_15_0 = life4_8;
    }
    spill390_2 = ((forestValue390_15_0 instanceof moom.mS) ? 1 : 0);
    if (!((life3_9 == null))) {
        forestValue390_86_0 = spill390_2;
        break forest_join_86;
    }
    if (!((spill390_2 != 0))) {
        break forest_join_85;
    }
    life5_23 = ((moom.mS)(life4_8));
    life6_26 = ((moom.mS)(life5_23)).n;
    if (!((life6_26 == null))) {
        break forest_join_29;
    }
    return ((0) != 0);
    }
    spill390_3 = (moom.Lh.a)[((moom.bQ)(this)).ordinal()];
    if (!((life3_9 == null))) {
        forestValue390_86_0 = spill390_3;
        break forest_join_86;
    }
    switch (spill390_3) {
case 1:
{
        break forest_join_36;
    }
case 2:
{
        break forest_join_39;
    }
case 3:
{
        break forest_join_42;
    }
case 4:
{
        break forest_join_45;
    }
case 5:
{
        break forest_join_54;
    }
case 6:
{
        break forest_join_57;
    }
case 7:
{
        break forest_join_60;
    }
case 8:
{
        break forest_join_63;
    }
case 9:
{
        break forest_join_66;
    }
case 10:
{
        break forest_join_73;
    }
case 11:
{
        break forest_join_76;
    }
case 12:
{
        break forest_join_79;
    }
case 13:
{
        break forest_join_82;
    }
default:
{
        break forest_join_85;
    }
}
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).p__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).r__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).c__Boolean();
    }
    spill390_4 = ((net.minecraft.entity.EntityLivingBase)(life6_26)).aO;
    if (!((life3_9 == null))) {
        forestValue390_51_0 = spill390_4;
        break forest_join_51;
    }
    if (!((spill390_4 > 0))) {
        break forest_join_52;
    }
    forestValue390_51_0 = 1;
    }
    forestValue390_53_0 = forestValue390_51_0;
    break forest_join_53;
    }
    forestValue390_53_0 = 0;
    }
    return ((forestValue390_53_0) != 0);
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).l__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).j__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).v__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).A;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(life6_26)).f != null))) {
        break forest_join_71;
    }
    forestValue390_72_0 = 1;
    break forest_join_72;
    }
    forestValue390_72_0 = 0;
    }
    return ((forestValue390_72_0) != 0);
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).s__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).t__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).u__Boolean();
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_26)).i__Boolean();
    }
    forestValue390_86_0 = 0;
    }
    return ((forestValue390_86_0) != 0);
}


public static moom.bQ a(java.lang.String p0) {
long life1_3;
    int[] life3_5;
    moom.bQ[] life4_9;
    int life5_12;
    int life6_14;
    moom.bQ life7_21;
    lexical_join_34: {
    life1_3 = (moom.bQ.e ^ 39001345500687L);
    life3_5 = moom.Lg.b();
    if (!((p0 != null))) {
        break lexical_join_34;
    }
    life4_9 = moom.bQ.c;
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
    if (!(((java.lang.String)(((moom.bQ)(life7_21)).a())).equals(((java.lang.Object)(p0))))) {
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


private static moom.bQ[] a__ArraybQ() {
long local0_life1 = (moom.bQ.e ^ 87580078139888L);
    moom.bQ[] __sourceSharedArray758_4 = new moom.bQ[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_2(24258, (9191682415404461010L ^ local0_life1))];
    __sourceSharedArray758_4[0] = moom.bQ.IS_ALIVE;
    __sourceSharedArray758_4[1] = moom.bQ.IS_BURNING;
    __sourceSharedArray758_4[2] = moom.bQ.IS_CHILD;
    __sourceSharedArray758_4[3] = moom.bQ.IS_GLOWING;
    __sourceSharedArray758_4[4] = moom.bQ.IS_HURT;
    __sourceSharedArray758_4[5] = moom.bQ.IS_IN_LAVA;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_10(31486, (6360273077368426472L ^ local0_life1))] = moom.bQ.IS_IN_WATER;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_12(26540, (7529442455656895167L ^ local0_life1))] = moom.bQ.IS_INVISIBLE;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_14(15725, (4011321604540385399L ^ local0_life1))] = moom.bQ.IS_ON_GROUND;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_16(26506, (4006202979910816411L ^ local0_life1))] = moom.bQ.IS_RIDDEN;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_18(9203, (9039208329968965357L ^ local0_life1))] = moom.bQ.IS_RIDING;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_20(14787, (2706449631074995416L ^ local0_life1))] = moom.bQ.IS_SNEAKING;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_22(27619, (2633886169541746420L ^ local0_life1))] = moom.bQ.IS_SPRINTING;
    __sourceSharedArray758_4[__sourceIntrinsic_97d6934a26ad_originalDynamicSite758_24(9798, (3288571594046526290L ^ local0_life1))] = moom.bQ.IS_WET;
    return __sourceSharedArray758_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite769_115(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6937_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_97d6934a26ad_originalDynamicSite758_24(int a0, long a1) throws E;
}
