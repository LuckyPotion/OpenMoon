package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hB extends net.minecraft.client.gui.GuiScreen {

private static final net.minecraft.client.settings.GameSettings$Options[] w;

private final net.minecraft.client.gui.GuiScreen x;

private final net.minecraft.client.settings.GameSettings y;

private final moom.LI z;

protected java.lang.String A;

private static final long B;

private static final java.lang.String[] C;

private static final java.lang.String[] D;

private static final java.util.Map E;

private static final long[] F;

private static final java.lang.Integer[] G;

private static final java.util.Map H;

public hB(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.z = new moom.LI(this, new moom.LL());
    this.x = p0;
    this.y = p1;
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(-5230205239679199886L)), ((long)(3954213978743082025L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(224957549329413L)))));
    long local20_life6 = (moom.hB.B ^ 46962247696732L);
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill859_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill859_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill859_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill859_14 = new byte[8];
    (__sourceSpill859_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill859_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation859_16 = __sourceSpill859_14;
    ((javax.crypto.Cipher)(__sourceSpill859_11)).init(((int)(__sourceSpill859_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill859_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation859_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[2];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "]µ3´~\"ZÔÑJ\b\177ËiáÞl½?\034ºáf\032¾å^ÈÚ'\\þô\036\016ìrçIO][ï\006\035/¼ WA]¼\016v·Iì/+Ý¥PÄ\016\025y>µÏ´\020\000Z,X"))).length();
    int local14_life24 = 56;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill859_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill859_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill859_29)).doFinal(((byte[])(__sourceSpill859_28)));
        java.lang.String __sourceSpill859_34 = ((java.lang.String)(moom.hB.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill859_35 = local18_life19;
        int __sourceSpill859_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill859_35)[__sourceSpill859_36] = __sourceSpill859_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    C = ((java.lang.String[])(local18_life19));
    D = ((java.lang.String[])(new java.lang.String[2]));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill859_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill859_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill859_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill859_47 = new byte[8];
    (__sourceSpill859_47)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill859_47)[local1_life48] = ((byte) ((int) ((local20_life6 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation859_49 = __sourceSpill859_47;
    ((javax.crypto.Cipher)(__sourceSpill859_44)).init(((int)(__sourceSpill859_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill859_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation859_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[15];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "p\017?7ÕÆ+,\r<lû#2î l\034ãÍ³\002ô[Pýæx¯ã\023lwÉér\027¹Åó\001âV?\025\005å\024û´(aßÄuGûÄØlÞ:³»VÚ^ëlDÎÁDx\003g´\000,<õó\036nGfL\032*\f#\\e"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill859_58 = local4_life54;
        int __sourceSpill859_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill859_58)).substring(((int)(__sourceSpill859_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill859_63 = local6_life52;
        int __sourceSpill859_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill859_66 = new byte[8];
        (__sourceSpill859_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill859_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill859_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill859_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill859_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill859_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill859_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill859_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill859_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill859_67)).doFinal(((byte[])(__sourceSpill859_66)));
        (__sourceSpill859_63)[__sourceSpill859_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "ø½¸¨ç¯\bJfUèiñ"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill859_71 = local4_life54;
        int __sourceSpill859_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill859_71)).substring(((int)(__sourceSpill859_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill859_76 = local6_life52;
        int __sourceSpill859_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill859_79 = new byte[8];
        (__sourceSpill859_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill859_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill859_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill859_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill859_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill859_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill859_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill859_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill859_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill859_80)).doFinal(((byte[])(__sourceSpill859_79)));
        (__sourceSpill859_76)[__sourceSpill859_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    F = ((long[])(local6_life52));
    G = ((java.lang.Integer[])(new java.lang.Integer[15]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill859_87 = new net.minecraft.client.settings.GameSettings$Options[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite859_85(22875, (3356274630308973537L ^ local20_life6))];
    (__sourceSpill859_87)[0] = net.minecraft.client.settings.GameSettings$Options.SMOOTH_FPS;
    (__sourceSpill859_87)[1] = net.minecraft.client.settings.GameSettings$Options.SMOOTH_WORLD;
    (__sourceSpill859_87)[2] = net.minecraft.client.settings.GameSettings$Options.FAST_MATH;
    (__sourceSpill859_87)[3] = net.minecraft.client.settings.GameSettings$Options.CHUNK_UPDATES;
    (__sourceSpill859_87)[4] = net.minecraft.client.settings.GameSettings$Options.CHUNK_UPDATES_DYNAMIC;
    (__sourceSpill859_87)[5] = net.minecraft.client.settings.GameSettings$Options.RENDER_REGIONS;
    (__sourceSpill859_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite859_93(25684, (2879492162280322791L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.LAZY_CHUNK_LOADING;
    (__sourceSpill859_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite859_95(4108, (3065573210600997560L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.SMART_ANIMATIONS;
    w = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill859_87));
}


public void c__Void() {
int lexicalValue1184_111_0;
    int lexicalValue1184_164_0;
    int[] spill1184_0;
    boolean spill1184_1;
    long life1_3;
    int[] life3_18;
    int life4_20;
    net.minecraft.client.settings.GameSettings$Options life5_28;
    int life6_49;
    int life7_74;
    lexical_join_164: {
    lexical_join_115: {
    life1_3 = (moom.hB.B ^ 21453339389198L);
    spill1184_0 = moom.LL.b();
    this.A = ((java.lang.String)(moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1184_2(24398, (2025099845638371114L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))));
    ((java.util.List)(((moom.hB)(this)).m)).clear();
    life3_18 = spill1184_0;
    life4_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_100: {
    if (!((life4_20 < (moom.hB.w).length))) {
        break lexical_join_115;
    }
    life5_28 = (moom.hB.w)[life4_20];
    life6_49 = (((((moom.hB)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_10(6291, (4664925005066233463L ^ life1_3))) + ((life4_20 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_11(23248, (6645194376143578174L ^ life1_3))));
    life7_74 = (((((moom.hB)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_13(20807, (4515093946234351527L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1184_14(24433, (1672055366582149531L ^ life1_3)) * (life4_20 / 2))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_15(32591, (7015951645056762276L ^ life1_3)));
    spill1184_1 = ((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Boolean();
    if (!((life3_18 == null))) {
        lexicalValue1184_164_0 = ((spill1184_1) ? 1 : 0);
        break lexical_join_164;
    }
    if (!((life3_18 == null))) {
        lexicalValue1184_111_0 = ((spill1184_1) ? 1 : 0);
        break lexical_join_111;
    }
    if (!((!spill1184_1))) {
        break lexical_join_100;
    }
    ((java.util.List)(((moom.hB)(this)).m)).add(((java.lang.Object)(new moom.gj(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28, ((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(life5_28)))))));
    if (!((life3_18 != null))) {
        break lexical_join_112;
    }
    }
    lexicalValue1184_111_0 = ((((java.util.List)(((moom.hB)(this)).m)).add(((java.lang.Object)(new moom.gl(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1184_111_0);
    }
    life4_20 += 1;
    if (!((life3_18 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue1184_164_0 = ((((java.util.List)(((moom.hB)(this)).m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1184_30(17942, (9169305710385182963L ^ life1_3)), ((((moom.hB)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_32(5509, (2569221861345061736L ^ life1_3))), (((((moom.hB)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_34(20807, (4515093946234351527L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_35(32389, (2820497840865935468L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_36(15253, (1918535503646344567L ^ life1_3))), moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1184_37(11232, (4809150136997266309L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1184_164_0);
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7824_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2D9B;
        if (G[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = F[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])H.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    H.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/hB", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hB.G[n2] = n4;
        }
        return G[n2];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hB.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7825_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.hB.B ^ 51533138749576L);
    ((moom.hB)(this)).i();
    ((moom.hB)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.hB)(this)).p)), ((java.lang.String)(this.A)), ((int)((((moom.hB)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1482_5(9349, (5384650639591432175L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1482_6(18850, (4643279892237791939L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.LI)(this.z)).a(((int)(p0)), ((int)(p1)), ((java.util.List)(((moom.hB)(this)).m)));
    return;
}


protected void a__Void(moom.gc p0) {
int forwardValue3588_13_0;
    int forwardValue3588_43_0;
    int forwardValue3588_48_0;
    int forwardValue3588_48_1;
    boolean spill3588_0;
    int spill3588_1;
    int spill3588_2;
    long life2_3;
    int[] life4_5;
    forward_join_58: {
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    forward_join_13: {
    life2_3 = (moom.hB.B ^ 88024600804591L);
    life4_5 = moom.LL.b();
    spill3588_0 = ((moom.gc)(p0)).m;
    if (!((life4_5 == null))) {
        forwardValue3588_13_0 = ((spill3588_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill3588_0)) {
        break forward_join_58;
    }
    forwardValue3588_13_0 = ((moom.gc)(p0)).l;
    }
    spill3588_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3588_5(26924, (2112845260897486370L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue3588_48_0 = forwardValue3588_13_0;
        forwardValue3588_48_1 = spill3588_1;
        break forward_join_48;
    }
    if (!((forwardValue3588_13_0 < spill3588_1))) {
        break forward_join_41;
    }
    spill3588_2 = ((p0 instanceof moom.gi) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue3588_43_0 = spill3588_2;
        break forward_join_43;
    }
    if (!((spill3588_2 != 0))) {
        break forward_join_41;
    }
    ((net.minecraft.client.settings.GameSettings)(this.y)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(p0)))).b())), ((int)(1)));
    ((moom.gc)(p0)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.a(((int)(((moom.gc)(p0)).l))))))));
    }
    forwardValue3588_43_0 = ((moom.gc)(p0)).l;
    }
    forwardValue3588_48_0 = forwardValue3588_43_0;
    forwardValue3588_48_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3588_17(17942, (9169233708972747026L ^ life2_3));
    }
    if (!((forwardValue3588_48_0 == forwardValue3588_48_1))) {
        break forward_join_58;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hB)(this)).i)).W)).b();
    ((net.minecraft.client.Minecraft)(((moom.hB)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.x)));
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
        byte[] spill4158_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4158_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4158_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4158_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4158_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4158_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.hB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15123);
    if (((moom.hB.D)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.hB.E)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hB.E)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/hB", life9_51);
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
        life9_116 = ((java.lang.String)((moom.hB.C)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.hB.D)[life5_8] = moom.hB.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.hB.D)[life5_8];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite859_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite859_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite859_95(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1184_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7824_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7825_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1482_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1482_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3588_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3588_17(int a0, long a1) throws E;
}
