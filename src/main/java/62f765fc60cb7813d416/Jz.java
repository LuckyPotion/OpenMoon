package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jz {

private static moom.Jy[] a;

private static int b;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public Jz() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(5398002503220554741L)), ((long)(3789486762943952813L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99566301463466L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Jz.c ^ 107339837564177L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill618_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill618_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill618_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill618_14 = new byte[8];
    (__sourceSpill618_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill618_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation618_16 = __sourceSpill618_14;
    ((javax.crypto.Cipher)(__sourceSpill618_11)).init(((int)(__sourceSpill618_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill618_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation618_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[8];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = ",â\006\02235~/Å¶àqßÜ3T^Pð8áEL¶?¼û8%\"´½öß×0;«î}r<ÃxÔ\027´ RÆadUñS\035¹$É¿\t+\"×> \r_ë\026:\004·ÀwhfTÚ\020\020\023rÃ\riÖ1ÊÛ#\001<\003(:hÿßÈòµ\035é¯À#\016Ceéô]~{ÕôLÑ\020>n\036ÓA\026\034`â\031iV(hpÃ\006K!Cp@\f5@¯\n@¼¯¤p\n»7Ë÷¾´r\013`lé¸z\b\002ð±dóH!\000'/Ê°\f`-\035L¿á+Hò\031h°ï\016Pú*\020Y\tr\034:\025¹©Ì¢{Ö\034¡Ä×+gprYñD\005+&0ÃÓ{ \006àpx0\177"))).length();
    int local16_life24 = 40;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill618_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill618_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill618_29)).doFinal(((byte[])(__sourceSpill618_28)));
        java.lang.String __sourceSpill618_34 = ((java.lang.String)(moom.Jz.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill618_35 = local20_life19;
        int __sourceSpill618_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill618_35)[__sourceSpill618_36] = __sourceSpill618_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "\017LýãÛï\027¢wÙÂ¶©4E\0010V \rmsgM(­È`àK(\025h\016îí.ïÍ\002<ñN1ä\177êÔóüÔµ¡ %Â\0172Ý\001Ð\rwA9Ñ&"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill618_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill618_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill618_42)).doFinal(((byte[])(__sourceSpill618_41)));
        java.lang.String __sourceSpill618_47 = ((java.lang.String)(moom.Jz.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill618_48 = local20_life19;
        int __sourceSpill618_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill618_48)[__sourceSpill618_49] = __sourceSpill618_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    d = ((java.lang.String[])(local20_life19));
    e = ((java.lang.String[])(new java.lang.String[8]));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill618_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill618_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill618_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill618_60 = new byte[8];
    (__sourceSpill618_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill618_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation618_62 = __sourceSpill618_60;
    ((javax.crypto.Cipher)(__sourceSpill618_57)).init(((int)(__sourceSpill618_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill618_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation618_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ÊVÉ\031aû¨8^k\0162"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill618_71 = local4_life67;
        int __sourceSpill618_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill618_71)).substring(((int)(__sourceSpill618_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill618_76 = local6_life65;
        int __sourceSpill618_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill618_79 = new byte[8];
        (__sourceSpill618_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill618_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill618_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill618_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill618_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill618_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill618_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill618_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill618_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill618_80)).doFinal(((byte[])(__sourceSpill618_79)));
        (__sourceSpill618_76)[__sourceSpill618_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    g = ((long[])(local6_life65));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((moom.Jy[])(null));
    b = ((int)(0));
}


public static void b(java.lang.String p0) {
long local1_life2 = (moom.Jz.c ^ 139734349332533L);
    java.lang.String __stackOp551_5_0 = p0;
    java.lang.String __stackOp551_5_1 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite551_4(21629, (7105298207557754214L ^ local1_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite551_6(__stackOp551_5_1, __stackOp551_5_0))));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5555_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7ECF;
        if (h[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Jz", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jz.h[n4] = n8;
        }
        return h[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jz.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5556_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a__Void() {
moom.Jz.a = ((moom.Jy[])(null));
    moom.Jz.b = ((int)(0));
    java.lang.Object local0 = moom.Jz.a__Pair();
    moom.Jz.a = ((moom.Jy[])(((moom.Jy[])(((org.apache.commons.lang3.tuple.Pair)(local0)).getLeft()))));
    moom.Jz.b = ((int)(((java.lang.Integer)(((java.lang.Integer)(((org.apache.commons.lang3.tuple.Pair)(local0)).getRight())))).intValue()));
    return;
}


public static moom.Jy a() {
int forwardValue2452_23_0;
    int spill2452_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    int life3_13;
    int life4_17;
    moom.Jy life5_19;
    forward_join_30: {
    forward_join_23: {
    forward_join_10: {
    life0_3 = (moom.Jz.c ^ 14085508222576L);
    life2_5 = moom.JM.b__Arrayr3();
    if (!((moom.Jz.a == null))) {
        break forward_join_10;
    }
    return null;
    }
    life3_13 = moom.yL.a;
    life4_17 = (life3_13 - moom.Jz.b);
    life5_19 = null;
    spill2452_0 = life4_17;
    if (!((life2_5 != null))) {
        forwardValue2452_23_0 = spill2452_0;
        break forward_join_23;
    }
    if (!((spill2452_0 >= 0))) {
        break forward_join_30;
    }
    forwardValue2452_23_0 = life4_17;
    }
    if (!((forwardValue2452_23_0 < (moom.Jz.a).length))) {
        break forward_join_30;
    }
    life5_19 = (moom.Jz.a)[life4_17];
    }
    return life5_19;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(java.lang.String p0) {
long local1_life2 = (moom.Jz.c ^ 126783181735058L);
    java.lang.String __stackOp550_5_0 = p0;
    java.lang.String __stackOp550_5_1 = __sourceIntrinsic_474b89cf9bbb_originalDynamicSite550_4(8592, (4515579231333444651L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite550_6(__stackOp550_5_1, __stackOp550_5_0))));
    return;
}


private static org.apache.commons.lang3.tuple.Pair<moom.Jy[], java.lang.Integer> a__Pair() {
net.minecraft.entity.Entity[] spill886_0;
    java.lang.String spill886_1;
    java.lang.String spill886_2;
    java.lang.String spill886_3;
    long life0_3;
    java.lang.String life3_9;
    java.lang.String life4_15;
    java.lang.String[] life5_20;
    java.util.HashMap life6_24;
    java.lang.String[] life7_26;
    int life8_29;
    net.minecraft.entity.Entity[] life2_30;
    int life9_32;
    java.lang.String life10_39;
    java.lang.String life11_44;
    int life12_52;
    java.util.Set life7_101;
    java.lang.Integer[] life8_107;
    java.lang.String life9_127;
    java.util.Properties life10_135;
    int life11_140;
    int life12_148;
    int life13_154;
    moom.Jy[] life14_157;
    java.lang.Integer[] life15_159;
    int life16_162;
    int life17_164;
    java.lang.Integer life18_171;
    java.lang.String life19_176;
    lexical_join_180: {
    lexical_join_111: {
    lexical_join_90: {
    life0_3 = (moom.Jz.c ^ 50810313085460L);
    life3_9 = __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_1(11852, (1349044415645889904L ^ life0_3));
    life4_15 = __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_2(18393, (7372317960111283430L ^ life0_3));
    spill886_0 = moom.JM.b__Arrayr3();
    life5_20 = moom.N_.a__ArrayString(((java.lang.String)(life3_9)), ((java.lang.String)(life4_15)));
    life6_24 = new java.util.HashMap();
    life7_26 = life5_20;
    life8_29 = (life7_26).length;
    life2_30 = spill886_0;
    life9_32 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_87: {
    lexical_join_81: {
    lexical_join_79: {
    if (!((life9_32 < life8_29))) {
        break lexical_join_90;
    }
    life10_39 = (life7_26)[life9_32];
    life11_44 = moom.Ob.c(((java.lang.String)(life10_39)), ((java.lang.String)(life3_9)), ((java.lang.String)(life4_15)));
    life12_52 = moom.BU.a(((java.lang.String)(life11_44)), ((int)(__sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_6(8433, (2603194579063382862L ^ life0_3)))));
    if (!((life2_30 != null))) {
        break lexical_join_79;
    }
    if (!((life12_52 == __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_8(724, (4113739110058197354L ^ life0_3))))) {
        break lexical_join_81;
    }
    java.lang.String __stackOp886_10_0 = life11_44;
    java.lang.String __stackOp886_10_1 = life10_39;
    java.lang.String __stackOp886_10_2 = __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_9(12780, (8548305840438782674L ^ life0_3));
    spill886_1 = __stackOp886_10_2;
    spill886_2 = __stackOp886_10_0;
    spill886_3 = __stackOp886_10_1;
    recovery.source.CarrierOps.discard(__stackOp886_10_2);
    java.lang.String __stackOp886_13_0 = spill886_3;
    java.lang.String __stackOp886_13_1 = __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_12(27424, (7148361711057858587L ^ life0_3));
    moom.Jz.a(((java.lang.String)(__sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_14(spill886_1, spill886_2, __stackOp886_13_1, __stackOp886_13_0))));
    }
    if (!((life2_30 == null))) {
        break lexical_join_87;
    }
    }
    ((java.util.Map)(life6_24)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life12_52))))), ((java.lang.Object)(life10_39)));
    }
    life9_32 += 1;
    if (!((life2_30 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    life7_101 = ((java.util.Map)(life6_24)).keySet();
    life8_107 = ((java.lang.Integer[])(((java.util.Set)(life7_101)).toArray(((java.lang.Object[])(new java.lang.Integer[0])))));
    java.util.Arrays.sort(((java.lang.Object[])(life8_107)));
    if (!(((life8_107).length == 0))) {
        break lexical_join_111;
    }
    return new org.apache.commons.lang3.tuple.ImmutablePair(null, java.lang.Integer.valueOf(((int)(0))));
    }
    life9_127 = __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_23(9918, (6108346504357330310L ^ life0_3));
    life10_135 = moom.N_.a(((java.lang.String)(life9_127)), ((java.lang.String)(__sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_24(606, (7845281281835800935L ^ life0_3)))));
    life11_140 = ((java.lang.Integer)((life8_107)[0])).intValue();
    life12_148 = ((java.lang.Integer)((life8_107)[((life8_107).length - 1)])).intValue();
    life13_154 = ((life12_148 - life11_140) + 1);
    life14_157 = new moom.Jy[life13_154];
    life15_159 = life8_107;
    life16_162 = (life15_159).length;
    life17_164 = 0;
    lexical_cycle_154: while (true) {
    if (!((life17_164 < life16_162))) {
        break lexical_join_180;
    }
    life18_171 = (life15_159)[life17_164];
    life19_176 = ((java.lang.String)(((java.util.Map)(life6_24)).get(((java.lang.Object)(life18_171)))));
    (life14_157)[(((java.lang.Integer)(life18_171)).intValue() - life11_140)] = moom.Jy.a__Jy(((java.lang.String)(life19_176)), ((int)(((java.lang.Integer)(life18_171)).intValue())), ((java.util.Properties)(life10_135)));
    life17_164 += 1;
    if (!((life2_30 == null))) { continue lexical_cycle_154; }
    break lexical_cycle_154;
    }
    }
    return new org.apache.commons.lang3.tuple.ImmutablePair(life14_157, java.lang.Integer.valueOf(((int)(life11_140))));
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
        byte[] spill2838_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2838_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2838_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2838_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2838_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2838_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26188);
    if (((moom.Jz.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jz.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jz.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jz", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jz.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jz.e)[life5_8] = moom.Jz.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jz.e)[life5_8];
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite551_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite551_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5555_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5556_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite550_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite550_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_14(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4adcbaeb6c3_invokedynamic886_24(int a0, long a1) throws E;
}
