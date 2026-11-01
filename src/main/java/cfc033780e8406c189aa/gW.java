package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gW extends net.minecraft.client.gui.GuiScreen {

private static final long w;

private static final long[] x;

private static final java.lang.Integer[] y;

private static final java.util.Map z;

public gW() {
super();
}


static {
w = ((long)(((moom._a)(moom._c.a(((long)(6556199912167248083L)), ((long)(-6418735833875425383L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(100239133495518L)))));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gW.w ^ 4269496617150L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1221_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1221_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1221_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1221_14 = new byte[8];
    (__sourceSpill1221_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1221_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1221_16 = __sourceSpill1221_14;
    ((javax.crypto.Cipher)(__sourceSpill1221_11)).init(((int)(__sourceSpill1221_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1221_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1221_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[22];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "s#$@H¶7\021>·p³ññª\034HÞ),ûÂ;«1Ú\036\035ç\031»ñlL]Yð'\023\f¹\006B}\013¸>4\037ÒLOöÃwfÈÍÖãi¬\"xóxÃ²ÆÎPDëÍJRÜ4>E°7CñÇûé!ÂÓ4\033M6Þf\026Ò.\006\033¤ù7³Ùn&W\tÇ\\x18\023¼/{7|SÅ«Z³içTò¾©-K:ßfk£"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1221_25 = local6_life21;
        int __sourceSpill1221_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1221_25)).substring(((int)(__sourceSpill1221_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1221_30 = local8_life19;
        int __sourceSpill1221_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1221_33 = new byte[8];
        (__sourceSpill1221_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1221_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1221_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1221_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1221_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1221_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1221_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1221_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1221_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1221_34)).doFinal(((byte[])(__sourceSpill1221_33)));
        (__sourceSpill1221_30)[__sourceSpill1221_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "3-u\034<|ïn½ë6ïY¹Zp"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1221_38 = local6_life21;
        int __sourceSpill1221_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1221_38)).substring(((int)(__sourceSpill1221_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1221_43 = local8_life19;
        int __sourceSpill1221_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1221_46 = new byte[8];
        (__sourceSpill1221_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1221_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1221_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1221_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1221_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1221_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1221_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1221_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1221_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1221_47)).doFinal(((byte[])(__sourceSpill1221_46)));
        (__sourceSpill1221_43)[__sourceSpill1221_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    x = ((long[])(local8_life19));
    y = ((java.lang.Integer[])(new java.lang.Integer[22]));
}


public void c__Void() {
long local1 = (moom.gW.w ^ 61329294328280L);
    ((java.util.List)(((moom.gW)(this)).m)).clear();
    ((java.util.List)(((moom.gW)(this)).m)).add(((java.lang.Object)(new moom.gi(0, ((((moom.gW)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_5(11951, (6775422219233293788L ^ local1))), (((((moom.gW)(this)).l / 4) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_7(30673, (7406088720574360751L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_8(21679, (3689741055268884446L ^ local1))), moom.oO.a(((java.lang.String)("gui.toTitle")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(((moom.gW)(this)).m)).add(((java.lang.Object)(new moom.gi(1, (((((moom.gW)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_13(12283, (1820427220383036545L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_14(13911, (626258929600097579L ^ local1))), (((((moom.gW)(this)).l / 4) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_16(15007, (4975384539156505072L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_17(8149, (2057706472394245287L ^ local1))), moom.oO.a(((java.lang.String)("menu.quit")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x80C;
        if (y[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = x[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/gW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gW.y[n2] = n3;
        }
        return y[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7747_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.gW.w ^ 11664427320414L);
    ((moom.gW)(this)).i();
    ((moom.gW)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("Out of memory!")), ((int)((((moom.gW)(this)).k / 2))), ((int)((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_5(13710, (6384525936455707489L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_6(32203, (779800416168190759L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_7(14184, (3996603418390096256L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("Minecraft has run out of memory.")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_11(4242, (4057993062010965601L ^ local4))))), ((int)((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_13(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_14(31201, (5349011854903846673L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_15(28309, (8020524022924685412L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("This could be caused by a bug in the game or by the")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_19(22168, (2382431798512257130L ^ local4))))), ((int)(((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_21(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_22(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_23(6103, (8468395572292700458L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_24(25149, (2326273097769499842L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("Java Virtual Machine not being allocated enough")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_28(22168, (2382431798512257130L ^ local4))))), ((int)(((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_30(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_31(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_32(29258, (6421143912949165244L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_33(25149, (2326273097769499842L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("memory.")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_37(22168, (2382431798512257130L ^ local4))))), ((int)(((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_39(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_40(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_41(2562, (5064917268192843004L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_42(25149, (2326273097769499842L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("To prevent level corruption, the current game has quit.")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_46(22168, (2382431798512257130L ^ local4))))), ((int)(((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_48(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_49(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_50(7313, (5322777462862692988L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_51(25149, (2326273097769499842L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("We've tried to free up enough memory to let you go back to")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_55(22168, (2382431798512257130L ^ local4))))), ((int)(((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_57(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_58(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_59(8006, (4072161641020965311L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_60(25149, (2326273097769499842L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("the main menu and back to playing, but this may not have worked.")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_64(22168, (2382431798512257130L ^ local4))))), ((int)(((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_66(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_67(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_68(26243, (5712707996984457336L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_69(25149, (2326273097769499842L ^ local4)))));
    ((moom.gW)(this)).b(((net.minecraft.client.gui.FontRenderer)(((moom.gW)(this)).p)), ((java.lang.String)("Please restart the game if you see this message again.")), ((int)(((((moom.gW)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_73(22168, (2382431798512257130L ^ local4))))), ((int)(((((((moom.gW)(this)).l / 4) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_75(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_76(31201, (5349011854903846673L ^ local4))) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_77(24039, (7894349095055786761L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_78(25149, (2326273097769499842L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a(char p0, int p1) throws java.io.IOException {
return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
if ((((moom.gc)(p0)).l == 0)) {
        ((net.minecraft.client.Minecraft)(((moom.gW)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiMainMenu())));
    } else {
        if ((((moom.gc)(p0)).l == 1)) {
        ((net.minecraft.client.Minecraft)(((moom.gW)(this)).i)).p();
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1459_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7747_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1460_78(int a0, long a1) throws E;
}
