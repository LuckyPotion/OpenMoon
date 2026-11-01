package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tL extends net.minecraft.entity.Entity {

public int aE;

public int aF;

public int aG;

private int aH;

private int aI;

private net.minecraft.entity.player.EntityPlayer aJ;

private int aK;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public tL(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_ba775ff4225e40d5(moom.tL receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (moom.tL.bb ^ 36210914667727L);

    moom.tL.__sourceConstructorInit_ba775ff4225e40d5_0(((moom.tL)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.tL)(receiver)).aH = ((int)(__sourceIntrinsic_ba775ff4225e40d5_originalDynamicSite3349_2(21089, (3486960930266133580L ^ local2))));

    ((moom.tL)(receiver)).a__Void(((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ba775ff4225e40d5_0(moom.tL a0, net.minecraft.world.World a1) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_02642c6c7bbee7cd_0(moom.tL a0, net.minecraft.world.World a1) throws E;

public tL(net.minecraft.world.World p0, double p1, double p2, double p3, int p4) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_02642c6c7bbee7cd(moom.tL receiver, net.minecraft.world.World p0, double p1, double p2, double p3, int p4) throws Throwable {

long local9 = (moom.tL.bb ^ 123783286716279L);

    moom.tL.__sourceConstructorInit_02642c6c7bbee7cd_0(((moom.tL)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.tL)(receiver)).aH = ((int)(__sourceIntrinsic_02642c6c7bbee7cd_originalDynamicSite3350_2(15939, (6471395210572170178L ^ local9))));

    ((moom.tL)(receiver)).a__Void(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)));

    ((moom.tL)(receiver)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));

    ((moom.tL)(receiver)).w = ((float)(((float) (java.lang.Math.random() * 0x1.68p8d))));

    ((moom.tL)(receiver)).t = ((double)(((double) (((float) ((java.lang.Math.random() * 0x1.99999ap-3d) - 0x1.99999ap-4d)) * 0x1.0p1f))));

    ((moom.tL)(receiver)).u = ((double)(((double) (((float) (java.lang.Math.random() * 0x1.999999999999ap-3d)) * 0x1.0p1f))));

    ((moom.tL)(receiver)).v = ((double)(((double) (((float) ((java.lang.Math.random() * 0x1.99999ap-3d) - 0x1.99999ap-4d)) * 0x1.0p1f))));

    ((moom.tL)(receiver)).aI = ((int)(p4));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-3013626996166220555L)), ((long)(5804764935814867468L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18880538328598L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tL.bb ^ 6321702617777L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1557_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1557_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1557_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1557_14 = new byte[8];
    (__sourceSpill1557_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1557_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1557_16 = __sourceSpill1557_14;
    ((javax.crypto.Cipher)(__sourceSpill1557_11)).init(((int)(__sourceSpill1557_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1557_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1557_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[34];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ")Þ¶\f¤Ï$\037¯iæ¡B+\031\001ÄÉÕ \036öÿY\nD¿t\025n\034\bgà·\020á\032\002¼PkbÉ&\025ëd4g=¶lsk^å³äjðô|V§Öì.\002p¦$\b=tû\024|Ð[j×zLÉµ\024Ù\bö\035/\027äàáÞ\bÆÿ]Í]G\r\024\004Jyl.\024Ef4Çhï¯[Zùà\0077(\032\027\nåNµ¤~x\004çµ0M5Ëÿ«­ÅÎí\013\021\034NÇø§}ICýêÅÿÒÏË¨\022ß\023»Ö\027i=öó3ïÊ¬\033¦ø£9DSÇPuO[e¹Þ;â\035Ã¯¿8z´\000ýgf&-òé\024IÉIìtó$0÷`r"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1557_25 = local6_life21;
        int __sourceSpill1557_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1557_25)).substring(((int)(__sourceSpill1557_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1557_30 = local8_life19;
        int __sourceSpill1557_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1557_33 = new byte[8];
        (__sourceSpill1557_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1557_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1557_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1557_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1557_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1557_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1557_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1557_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1557_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1557_34)).doFinal(((byte[])(__sourceSpill1557_33)));
        (__sourceSpill1557_30)[__sourceSpill1557_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "hx]¢RacZëe"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1557_38 = local6_life21;
        int __sourceSpill1557_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1557_38)).substring(((int)(__sourceSpill1557_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1557_43 = local8_life19;
        int __sourceSpill1557_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1557_46 = new byte[8];
        (__sourceSpill1557_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1557_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1557_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1557_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1557_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1557_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1557_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1557_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1557_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1557_47)).doFinal(((byte[])(__sourceSpill1557_46)));
        (__sourceSpill1557_43)[__sourceSpill1557_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[34]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9155_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b__sourceReturn_8abf5c6871() {
int forwardValue4059_29_0;
    int forwardValue4059_29_1;
    int forwardValue4059_45_0;
    int forwardValue4059_45_1;
    int forwardValue4059_61_0;
    int forwardValue4059_61_1;
    int forwardValue4059_77_0;
    int forwardValue4059_77_1;
    int forwardValue4059_93_0;
    int forwardValue4059_93_1;
    int forwardValue4059_105_0;
    int forwardValue4059_105_1;
    int forwardValue4059_117_0;
    int forwardValue4059_117_1;
    int forwardValue4059_129_0;
    int forwardValue4059_129_1;
    int forwardValue4059_139_0;
    int forwardValue4059_139_1;
    int forwardValue4059_141_0;
    int forwardValue4059_143_0;
    int spill4059_0;
    int spill4059_1;
    int spill4059_2;
    long life1_3;
    int life3_5;
    forward_join_143: {
    forward_join_142: {
    forward_join_141: {
    forward_join_139: {
    forward_join_134: {
    forward_join_129: {
    forward_join_122: {
    forward_join_117: {
    forward_join_110: {
    forward_join_105: {
    forward_join_98: {
    forward_join_93: {
    forward_join_86: {
    forward_join_77: {
    forward_join_70: {
    forward_join_61: {
    forward_join_54: {
    forward_join_45: {
    forward_join_38: {
    forward_join_29: {
    forward_join_22: {
    life1_3 = (moom.tL.bb ^ 10155356808888L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4059_0 = this.aI;
    spill4059_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_3(26702, (2223559142868272171L ^ life1_3));
    if (!((life3_5 != 0))) {
        forwardValue4059_29_0 = spill4059_0;
        forwardValue4059_29_1 = spill4059_1;
        break forward_join_29;
    }
    if (!((spill4059_0 >= spill4059_1))) {
        break forward_join_22;
    }
    forwardValue4059_143_0 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_4(6713, (2137331704809993833L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4059_29_0 = this.aI;
    forwardValue4059_29_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_6(19385, (4824647198135511035L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_45_0 = forwardValue4059_29_0;
        forwardValue4059_45_1 = forwardValue4059_29_1;
        break forward_join_45;
    }
    if (!((forwardValue4059_29_0 >= forwardValue4059_29_1))) {
        break forward_join_38;
    }
    forwardValue4059_143_0 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_7(2589, (4645180252468749888L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4059_45_0 = this.aI;
    forwardValue4059_45_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_9(19324, (2294699942982117174L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_61_0 = forwardValue4059_45_0;
        forwardValue4059_61_1 = forwardValue4059_45_1;
        break forward_join_61;
    }
    if (!((forwardValue4059_45_0 >= forwardValue4059_45_1))) {
        break forward_join_54;
    }
    forwardValue4059_143_0 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_10(14287, (3700297978281171850L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4059_61_0 = this.aI;
    forwardValue4059_61_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_12(22011, (1541723285724985769L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_77_0 = forwardValue4059_61_0;
        forwardValue4059_77_1 = forwardValue4059_61_1;
        break forward_join_77;
    }
    if (!((forwardValue4059_61_0 >= forwardValue4059_61_1))) {
        break forward_join_70;
    }
    forwardValue4059_143_0 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_13(17685, (1302268034731010389L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4059_77_0 = this.aI;
    forwardValue4059_77_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_15(15475, (4830415064719462455L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_93_0 = forwardValue4059_77_0;
        forwardValue4059_93_1 = forwardValue4059_77_1;
        break forward_join_93;
    }
    if (!((forwardValue4059_77_0 >= forwardValue4059_77_1))) {
        break forward_join_86;
    }
    forwardValue4059_143_0 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_16(29712, (322304183117928524L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4059_93_0 = this.aI;
    forwardValue4059_93_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_18(26772, (3760356407690478785L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_105_0 = forwardValue4059_93_0;
        forwardValue4059_105_1 = forwardValue4059_93_1;
        break forward_join_105;
    }
    if (!((forwardValue4059_93_0 >= forwardValue4059_93_1))) {
        break forward_join_98;
    }
    forwardValue4059_143_0 = 5;
    break forward_join_143;
    }
    forwardValue4059_105_0 = this.aI;
    forwardValue4059_105_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_20(25550, (5499069022681681801L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_117_0 = forwardValue4059_105_0;
        forwardValue4059_117_1 = forwardValue4059_105_1;
        break forward_join_117;
    }
    if (!((forwardValue4059_105_0 >= forwardValue4059_105_1))) {
        break forward_join_110;
    }
    forwardValue4059_143_0 = 4;
    break forward_join_143;
    }
    forwardValue4059_117_0 = this.aI;
    forwardValue4059_117_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_22(23501, (6230729614865987486L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_129_0 = forwardValue4059_117_0;
        forwardValue4059_129_1 = forwardValue4059_117_1;
        break forward_join_129;
    }
    if (!((forwardValue4059_117_0 >= forwardValue4059_117_1))) {
        break forward_join_122;
    }
    forwardValue4059_143_0 = 3;
    break forward_join_143;
    }
    forwardValue4059_129_0 = this.aI;
    forwardValue4059_129_1 = __sourceIntrinsic_e1958f95391c_invokedynamic4059_24(30706, (4999971809704238004L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4059_139_0 = forwardValue4059_129_0;
        forwardValue4059_139_1 = forwardValue4059_129_1;
        break forward_join_139;
    }
    if (!((forwardValue4059_129_0 >= forwardValue4059_129_1))) {
        break forward_join_134;
    }
    forwardValue4059_143_0 = 2;
    break forward_join_143;
    }
    spill4059_2 = this.aI;
    if (!((life3_5 != 0))) {
        forwardValue4059_141_0 = spill4059_2;
        break forward_join_141;
    }
    forwardValue4059_139_0 = spill4059_2;
    forwardValue4059_139_1 = 3;
    }
    if (!((forwardValue4059_139_0 >= forwardValue4059_139_1))) {
        break forward_join_142;
    }
    forwardValue4059_141_0 = 1;
    }
    forwardValue4059_143_0 = forwardValue4059_141_0;
    break forward_join_143;
    }
    forwardValue4059_143_0 = 0;
    }
    return forwardValue4059_143_0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7248;
        if (db[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = cb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/tL", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            tL.db[n2] = n4;
        }
        return db[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tL.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean x__Boolean() {
return ((0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (moom.tL.bb ^ 97133496714792L);
    this.aH = ((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Health"))) & __sourceIntrinsic_01f4e1cd062e_originalDynamicSite1651_2(23037, (8386097637813114149L ^ local2)))));
    this.aF = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Age")))));
    this.aI = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Value")))));
    return;
}


protected void c(int p0) {
((moom.tL)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a)), ((float)(((float) p0))));
    return;
}


protected void d__Void() {
return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Health")), ((short)(((short) ((byte) this.aH)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Age")), ((short)(((short) this.aF))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Value")), ((short)(((short) this.aI))));
    return;
}


public void d(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4060_14_0;
    int forwardValue4060_21_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4060_53_0;
    boolean spill4060_0;
    net.minecraft.entity.player.EntityPlayer spill4060_1;
    long life2_3;
    int life4_5;
    forward_join_58: {
    forward_join_53: {
    forward_join_21: {
    forward_join_14: {
    life2_3 = (moom.tL.bb ^ 37695551724238L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4060_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 == 0))) {
        forwardValue4060_14_0 = ((spill4060_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4060_0))) {
        break forward_join_58;
    }
    forwardValue4060_14_0 = this.aG;
    }
    if (!((life4_5 == 0))) {
        forwardValue4060_21_0 = forwardValue4060_14_0;
        break forward_join_21;
    }
    if (!((forwardValue4060_14_0 == 0))) {
        break forward_join_58;
    }
    spill4060_1 = p0;
    if (!((life4_5 == 0))) {
        forwardValue4060_53_0 = spill4060_1;
        break forward_join_53;
    }
    forwardValue4060_21_0 = ((net.minecraft.entity.player.EntityPlayer)(spill4060_1)).bL;
    }
    if (!((forwardValue4060_21_0 == 0))) {
        break forward_join_58;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).bL = ((int)(__sourceIntrinsic_8bd60d12af02_invokedynamic4060_7(28525, (4001075281854955338L ^ life2_3))));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(p0)), ((java.lang.String)("random.orb")), ((float)(0x1.99999ap-4f)), ((float)((0x1.0p-1f * (((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.666666p-1f) + 0x1.ccccccp0f)))));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).b(((net.minecraft.entity.Entity)(this)), ((int)(1)));
    forwardValue4060_53_0 = p0;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4060_53_0)).l(((int)(this.aI)));
    ((moom.tL)(this)).f__Void();
    }
    return;
}


public static int a__sourceReturn_0f7a48eca2(int p0) {
int forwardValue4056_27_0;
    int forwardValue4056_27_1;
    int forwardValue4056_42_0;
    int forwardValue4056_42_1;
    int forwardValue4056_57_0;
    int forwardValue4056_57_1;
    int forwardValue4056_72_0;
    int forwardValue4056_72_1;
    int forwardValue4056_87_0;
    int forwardValue4056_87_1;
    int forwardValue4056_102_0;
    int forwardValue4056_102_1;
    int forwardValue4056_117_0;
    int forwardValue4056_117_1;
    int forwardValue4056_132_0;
    int forwardValue4056_132_1;
    int forwardValue4056_145_0;
    int forwardValue4056_145_1;
    int forwardValue4056_147_0;
    int forwardValue4056_149_0;
    int spill4056_0;
    int spill4056_1;
    int spill4056_2;
    long life1_3;
    int life3_5;
    forward_join_149: {
    forward_join_148: {
    forward_join_147: {
    forward_join_145: {
    forward_join_141: {
    forward_join_132: {
    forward_join_126: {
    forward_join_117: {
    forward_join_111: {
    forward_join_102: {
    forward_join_96: {
    forward_join_87: {
    forward_join_81: {
    forward_join_72: {
    forward_join_66: {
    forward_join_57: {
    forward_join_51: {
    forward_join_42: {
    forward_join_36: {
    forward_join_27: {
    forward_join_21: {
    life1_3 = (moom.tL.bb ^ 111083787810922L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4056_0 = p0;
    spill4056_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_2(9255, (8408657040864482987L ^ life1_3));
    if (!((life3_5 != 0))) {
        forwardValue4056_27_0 = spill4056_0;
        forwardValue4056_27_1 = spill4056_1;
        break forward_join_27;
    }
    if (!((spill4056_0 >= spill4056_1))) {
        break forward_join_21;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_3(9255, (8408657040864482987L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_27_0 = p0;
    forwardValue4056_27_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_4(18416, (1712916563380237638L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_42_0 = forwardValue4056_27_0;
        forwardValue4056_42_1 = forwardValue4056_27_1;
        break forward_join_42;
    }
    if (!((forwardValue4056_27_0 >= forwardValue4056_27_1))) {
        break forward_join_36;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_5(18416, (1712916563380237638L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_42_0 = p0;
    forwardValue4056_42_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_6(20653, (2094639099578049078L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_57_0 = forwardValue4056_42_0;
        forwardValue4056_57_1 = forwardValue4056_42_1;
        break forward_join_57;
    }
    if (!((forwardValue4056_42_0 >= forwardValue4056_42_1))) {
        break forward_join_51;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_7(20653, (2094639099578049078L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_57_0 = p0;
    forwardValue4056_57_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_8(16292, (8773007078353505577L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_72_0 = forwardValue4056_57_0;
        forwardValue4056_72_1 = forwardValue4056_57_1;
        break forward_join_72;
    }
    if (!((forwardValue4056_57_0 >= forwardValue4056_57_1))) {
        break forward_join_66;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_9(16292, (8773007078353505577L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_72_0 = p0;
    forwardValue4056_72_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_10(32051, (6836723450077171637L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_87_0 = forwardValue4056_72_0;
        forwardValue4056_87_1 = forwardValue4056_72_1;
        break forward_join_87;
    }
    if (!((forwardValue4056_72_0 >= forwardValue4056_72_1))) {
        break forward_join_81;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_11(32051, (6836723450077171637L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_87_0 = p0;
    forwardValue4056_87_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_12(19333, (4364203665667127566L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_102_0 = forwardValue4056_87_0;
        forwardValue4056_102_1 = forwardValue4056_87_1;
        break forward_join_102;
    }
    if (!((forwardValue4056_87_0 >= forwardValue4056_87_1))) {
        break forward_join_96;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_13(19333, (4364203665667127566L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_102_0 = p0;
    forwardValue4056_102_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_14(14151, (2643092811708335582L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_117_0 = forwardValue4056_102_0;
        forwardValue4056_117_1 = forwardValue4056_102_1;
        break forward_join_117;
    }
    if (!((forwardValue4056_102_0 >= forwardValue4056_102_1))) {
        break forward_join_111;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_15(14151, (2643092811708335582L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_117_0 = p0;
    forwardValue4056_117_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_16(23493, (9175415725695068481L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_132_0 = forwardValue4056_117_0;
        forwardValue4056_132_1 = forwardValue4056_117_1;
        break forward_join_132;
    }
    if (!((forwardValue4056_117_0 >= forwardValue4056_117_1))) {
        break forward_join_126;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_17(23493, (9175415725695068481L ^ life1_3));
    break forward_join_149;
    }
    forwardValue4056_132_0 = p0;
    forwardValue4056_132_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_18(30706, (4999870683748648294L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        forwardValue4056_145_0 = forwardValue4056_132_0;
        forwardValue4056_145_1 = forwardValue4056_132_1;
        break forward_join_145;
    }
    if (!((forwardValue4056_132_0 >= forwardValue4056_132_1))) {
        break forward_join_141;
    }
    forwardValue4056_149_0 = __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_19(30706, (4999870683748648294L ^ life1_3));
    break forward_join_149;
    }
    spill4056_2 = p0;
    if (!((life3_5 != 0))) {
        forwardValue4056_147_0 = spill4056_2;
        break forward_join_147;
    }
    forwardValue4056_145_0 = spill4056_2;
    forwardValue4056_145_1 = 3;
    }
    if (!((forwardValue4056_145_0 >= forwardValue4056_145_1))) {
        break forward_join_148;
    }
    forwardValue4056_147_0 = 3;
    }
    forwardValue4056_149_0 = forwardValue4056_147_0;
    break forward_join_149;
    }
    forwardValue4056_149_0 = 1;
    }
    return forwardValue4056_149_0;
}


public int a__Int(float p0) {
int forwardValue4058_71_0;
    int forwardValue4058_71_1;
    int spill4058_0;
    int spill4058_1;
    int spill4058_2;
    long life2_3;
    float life5_5;
    float life5_10;
    int life6_15;
    int life7_23;
    int life8_37;
    int life7_46;
    int life4_47;
    forward_join_71: {
    forward_join_63: {
    life2_3 = (moom.tL.bb ^ 64327261897442L);
    life5_5 = 0x1.0p-1f;
    life5_10 = moom.Dr.a(((float)(life5_5)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    spill4058_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life6_15 = super.a__Int(((float)(p0)));
    life7_23 = (life6_15 & __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_4(6174, (2850368091692273671L ^ life2_3)));
    life8_37 = ((life6_15 >> __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_5(3311, (686397360270705901L ^ life2_3))) & __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_6(6174, (2850368091692273671L ^ life2_3)));
    life7_46 = (life7_23 + ((int) ((life5_10 * 0x1.ep3f) * 0x1.0p4f)));
    life4_47 = spill4058_0;
    spill4058_1 = life7_46;
    spill4058_2 = __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_7(9769, (8510647899633856040L ^ life2_3));
    if (!((life4_47 != 0))) {
        forwardValue4058_71_0 = spill4058_1;
        forwardValue4058_71_1 = spill4058_2;
        break forward_join_71;
    }
    if (!((spill4058_1 > spill4058_2))) {
        break forward_join_63;
    }
    life7_46 = __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_8(21288, (1914770725423962941L ^ life2_3));
    }
    forwardValue4058_71_0 = life7_46;
    forwardValue4058_71_1 = (life8_37 << __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_9(24671, (1116591459610126418L ^ life2_3)));
    }
    return (forwardValue4058_71_0 | forwardValue4058_71_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.aI;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4057_26_0;
    int forwardValue4057_32_0;
    boolean spill4057_0;
    long life3_3;
    int life5_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_26: {
    forward_join_14: {
    life3_3 = (moom.tL.bb ^ 69955764864682L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4057_0 = ((moom.tL)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue4057_26_0 = ((spill4057_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill4057_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    ((moom.tL)(this)).q();
    this.aH = ((int)(((int) (((float) this.aH) - p1))));
    forwardValue4057_26_0 = this.aH;
    }
    if (!((life5_5 == 0))) {
        forwardValue4057_32_0 = forwardValue4057_26_0;
        break forward_join_32;
    }
    if (!((forwardValue4057_26_0 <= 0))) {
        break forward_join_31;
    }
    ((moom.tL)(this)).f__Void();
    }
    forwardValue4057_32_0 = 0;
    }
    return ((forwardValue4057_32_0) != 0);
}


public boolean k__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this.i)).a(((moom.CA)(((moom.tL)(this)).b())), ((moom.fn)(moom.fn.h)), ((net.minecraft.entity.Entity)(this))))) != 0);
}


public void g__Void() {
moom.tL forwardValue4061_38_0;
    moom.tL forwardValue4061_89_0;
    moom.tL forwardValue4061_145_0;
    moom.tL forwardValue4061_152_0;
    moom.tL forwardValue4061_156_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4061_173_0;
    moom.tL forwardValue4061_270_0;
    int forwardValue4061_329_0;
    int forwardValue4061_354_0;
    moom.tL forwardValue4061_361_0;
    int spill4061_0;
    moom.tL spill4061_1;
    moom.tL spill4061_2;
    moom.tL spill4061_3;
    moom.tL spill4061_4;
    net.minecraft.entity.player.EntityPlayer spill4061_5;
    net.minecraft.entity.player.EntityPlayer spill4061_6;
    moom.tL spill4061_7;
    boolean spill4061_8;
    moom.tL spill4061_9;
    long life1_3;
    int life3_7;
    double life4_117;
    double life6_227;
    double life8_241;
    double life10_250;
    double life12_263;
    double life14_267;
    double life14_280;
    float life6_326;
    forward_join_362: {
    forward_join_361: {
    forward_join_354: {
    forward_join_338: {
    forward_join_329: {
    forward_join_307: {
    forward_join_277: {
    forward_join_270: {
    forward_join_269: {
    forward_join_173: {
    forward_join_169: {
    forward_join_156: {
    forward_join_155: {
    forward_join_152: {
    forward_join_151: {
    forward_join_145: {
    forward_join_144: {
    forward_join_89: {
    forward_join_88: {
    forward_join_38: {
    forward_join_19: {
    life1_3 = (moom.tL.bb ^ 119455494842716L);
    spill4061_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    super.g__Void();
    life3_7 = spill4061_0;
    spill4061_1 = this;
    if (!((life3_7 == 0))) {
        forwardValue4061_38_0 = spill4061_1;
        break forward_join_38;
    }
    if (!((((moom.tL)(spill4061_1)).aG > 0))) {
        break forward_join_19;
    }
    moom.tL __stackOp4061_4_0 = this;
    ((moom.tL)(__stackOp4061_4_0)).aG = ((int)((((moom.tL)(__stackOp4061_4_0)).aG - 1)));
    }
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.tL __stackOp4061_13_0 = this;
    ((moom.tL)(__stackOp4061_13_0)).u = ((double)((((moom.tL)(__stackOp4061_13_0)).u - 0x1.eb851ep-6d)));
    forwardValue4061_38_0 = this;
    }
    if (!((life3_7 == 0))) {
        forwardValue4061_89_0 = forwardValue4061_38_0;
        break forward_join_89;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.tL)(forwardValue4061_38_0)).i)).a__fE(((moom.DT)(new moom.DT(this)))))).a__ch())).a__fn() == moom.fn.i))) {
        break forward_join_88;
    }
    this.u = ((double)(0x1.99999ap-3d));
    this.t = ((double)(((double) ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f))));
    this.v = ((double)(((double) ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f))));
    ((moom.tL)(this)).a(((java.lang.String)("random.fizz")), ((float)(0x1.99999ap-2f)), ((float)((0x1.0p1f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-2f)))));
    }
    forwardValue4061_89_0 = this;
    }
    ((moom.tL)(forwardValue4061_89_0)).c__Boolean(((double)(this.n)), ((double)(((((moom.CA)(((moom.tL)(this)).b())).c + ((moom.CA)(((moom.tL)(this)).b())).f) / 0x1.0p1d))), ((double)(this.p)));
    life4_117 = 0x1.0p3d;
    spill4061_2 = this;
    if (!((life3_7 == 0))) {
        forwardValue4061_156_0 = spill4061_2;
        break forward_join_156;
    }
    if (!((((moom.tL)(spill4061_2)).aK < ((this.aE - __sourceIntrinsic_736a66cda11e_invokedynamic4061_44(19270, (3135153475018238191L ^ life1_3))) + (((moom.tL)(this)).e__Int() % __sourceIntrinsic_736a66cda11e_invokedynamic4061_46(15294, (538792965157279771L ^ life1_3))))))) {
        break forward_join_155;
    }
    spill4061_3 = this;
    if (!((life3_7 == 0))) {
        forwardValue4061_145_0 = spill4061_3;
        break forward_join_145;
    }
    if (!((((moom.tL)(spill4061_3)).aJ != null))) {
        break forward_join_144;
    }
    spill4061_4 = this;
    if (!((life3_7 == 0))) {
        forwardValue4061_152_0 = spill4061_4;
        break forward_join_152;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.player.EntityPlayer)(((moom.tL)(spill4061_4)).aJ)).a(((net.minecraft.entity.Entity)(this))))), ((double)((life4_117 * life4_117)))) > 0))) {
        break forward_join_151;
    }
    }
    forwardValue4061_145_0 = this;
    }
    ((moom.tL)(forwardValue4061_145_0)).aJ = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(life4_117)))));
    }
    forwardValue4061_152_0 = this;
    }
    ((moom.tL)(forwardValue4061_152_0)).aK = ((int)(this.aE));
    }
    forwardValue4061_156_0 = this;
    }
    spill4061_5 = ((moom.tL)(forwardValue4061_156_0)).aJ;
    if (!((life3_7 == 0))) {
        forwardValue4061_173_0 = spill4061_5;
        break forward_join_173;
    }
    if (!((spill4061_5 != null))) {
        break forward_join_169;
    }
    spill4061_6 = this.aJ;
    if (!((life3_7 == 0))) {
        forwardValue4061_173_0 = spill4061_6;
        break forward_join_173;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill4061_6)).U__Boolean())) {
        break forward_join_169;
    }
    this.aJ = ((net.minecraft.entity.player.EntityPlayer)(null));
    }
    spill4061_7 = this;
    if (!((life3_7 == 0))) {
        forwardValue4061_270_0 = spill4061_7;
        break forward_join_270;
    }
    forwardValue4061_173_0 = ((moom.tL)(spill4061_7)).aJ;
    }
    if (!((forwardValue4061_173_0 != null))) {
        break forward_join_269;
    }
    life6_227 = ((((net.minecraft.entity.player.EntityPlayer)(this.aJ)).n - this.n) / life4_117);
    life8_241 = (((((net.minecraft.entity.player.EntityPlayer)(this.aJ)).o + ((double) ((net.minecraft.entity.player.EntityPlayer)(this.aJ)).e__Float())) - this.o) / life4_117);
    life10_250 = ((((net.minecraft.entity.player.EntityPlayer)(this.aJ)).p - this.p) / life4_117);
    life12_263 = java.lang.Math.sqrt(((double)((((life6_227 * life6_227) + (life8_241 * life8_241)) + (life10_250 * life10_250)))));
    life14_267 = (0x1.0p0d - life12_263);
    if (!((life3_7 == 0))) {
        break forward_join_277;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life14_267)), ((double)(0x0.0p0d))) > 0))) {
        break forward_join_269;
    }
    life14_280 = (life14_267 * life14_267);
    moom.tL __stackOp4061_74_0 = this;
    ((moom.tL)(__stackOp4061_74_0)).t = ((double)((((moom.tL)(__stackOp4061_74_0)).t + (((life6_227 / life12_263) * life14_280) * 0x1.999999999999ap-4d))));
    moom.tL __stackOp4061_77_0 = this;
    ((moom.tL)(__stackOp4061_77_0)).u = ((double)((((moom.tL)(__stackOp4061_77_0)).u + (((life8_241 / life12_263) * life14_280) * 0x1.999999999999ap-4d))));
    moom.tL __stackOp4061_80_0 = this;
    ((moom.tL)(__stackOp4061_80_0)).v = ((double)((((moom.tL)(__stackOp4061_80_0)).v + (((life10_250 / life12_263) * life14_280) * 0x1.999999999999ap-4d))));
    }
    forwardValue4061_270_0 = this;
    }
    ((moom.tL)(forwardValue4061_270_0)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    }
    life6_326 = 0x1.f5c29p-1f;
    spill4061_8 = this.A;
    if (!((life3_7 == 0))) {
        forwardValue4061_329_0 = ((spill4061_8) ? 1 : 0);
        break forward_join_329;
    }
    if (!(spill4061_8)) {
        break forward_join_307;
    }
    life6_326 = (((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(this.n))), (moom.Dr.b__Int(((double)(((moom.CA)(((moom.tL)(this)).b())).c))) - 1), moom.Dr.b__Int(((double)(this.p))))))))).a__ch())).L * 0x1.f5c29p-1f);
    }
    moom.tL __stackOp4061_100_0 = this;
    ((moom.tL)(__stackOp4061_100_0)).t = ((double)((((moom.tL)(__stackOp4061_100_0)).t * ((double) life6_326))));
    moom.tL __stackOp4061_103_0 = this;
    ((moom.tL)(__stackOp4061_103_0)).u = ((double)((((moom.tL)(__stackOp4061_103_0)).u * 0x1.f5c29p-1d)));
    moom.tL __stackOp4061_106_0 = this;
    ((moom.tL)(__stackOp4061_106_0)).v = ((double)((((moom.tL)(__stackOp4061_106_0)).v * ((double) life6_326))));
    forwardValue4061_329_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        forwardValue4061_354_0 = forwardValue4061_329_0;
        break forward_join_354;
    }
    if (!((forwardValue4061_329_0 != 0))) {
        break forward_join_338;
    }
    moom.tL __stackOp4061_111_0 = this;
    ((moom.tL)(__stackOp4061_111_0)).u = ((double)((((moom.tL)(__stackOp4061_111_0)).u * -0x1.ccccccp-1d)));
    }
    moom.tL __stackOp4061_114_0 = this;
    ((moom.tL)(__stackOp4061_114_0)).aE = ((int)((((moom.tL)(__stackOp4061_114_0)).aE + 1)));
    moom.tL __stackOp4061_117_0 = this;
    ((moom.tL)(__stackOp4061_117_0)).aF = ((int)((((moom.tL)(__stackOp4061_117_0)).aF + 1)));
    spill4061_9 = this;
    if (!((life3_7 == 0))) {
        forwardValue4061_361_0 = spill4061_9;
        break forward_join_361;
    }
    forwardValue4061_354_0 = ((moom.tL)(spill4061_9)).aF;
    }
    if (!((forwardValue4061_354_0 >= __sourceIntrinsic_736a66cda11e_invokedynamic4061_121(3470, (678327920079957542L ^ life1_3))))) {
        break forward_join_362;
    }
    forwardValue4061_361_0 = this;
    }
    ((moom.tL)(forwardValue4061_361_0)).f__Void();
    }
    return;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_ba775ff4225e40d5_originalDynamicSite3349_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02642c6c7bbee7cd_originalDynamicSite3350_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9155_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic4059_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_originalDynamicSite1651_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bd60d12af02_invokedynamic4060_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic4056_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic4058_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic4061_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic4061_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic4061_121(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
