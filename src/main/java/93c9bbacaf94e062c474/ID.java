package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ID {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public ID() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(6010749500756907360L)), ((long)(-8006617017773091320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81078626208469L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ID.a ^ 105357729841540L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill855_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill855_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill855_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill855_14 = new byte[8];
    (__sourceSpill855_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill855_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation855_16 = __sourceSpill855_14;
    ((javax.crypto.Cipher)(__sourceSpill855_11)).init(((int)(__sourceSpill855_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill855_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation855_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ë³\013À7ÒHn>è%5c¡\035§àÿ¥\tnÃí´_î\016µv\016z{\023Ì\"¸'\035Q|\007$3X~"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill855_25 = local6_life21;
        int __sourceSpill855_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill855_25)).substring(((int)(__sourceSpill855_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill855_30 = local8_life19;
        int __sourceSpill855_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill855_33 = new byte[8];
        (__sourceSpill855_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill855_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill855_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill855_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill855_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill855_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill855_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill855_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill855_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill855_34)).doFinal(((byte[])(__sourceSpill855_33)));
        (__sourceSpill855_30)[__sourceSpill855_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "å*åJ\177\031\027\033)c\020²"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill855_38 = local6_life21;
        int __sourceSpill855_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill855_38)).substring(((int)(__sourceSpill855_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill855_43 = local8_life19;
        int __sourceSpill855_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill855_46 = new byte[8];
        (__sourceSpill855_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill855_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill855_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill855_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill855_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill855_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill855_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill855_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill855_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill855_47)).doFinal(((byte[])(__sourceSpill855_46)));
        (__sourceSpill855_43)[__sourceSpill855_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


private static moom.G4 b(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
int forwardValue2185_27_0;
    int forwardValue2185_27_1;
    int forwardValue2185_41_0;
    int forwardValue2185_41_1;
    moom.G2 forwardValue2185_56_0;
    int forwardValue2185_134_0;
    int spill2185_0;
    int spill2185_1;
    moom.G2 spill2185_2;
    boolean spill2185_3;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    moom.G2 life11_61;
    moom.H3 life12_85;
    int life13_95;
    int life14_105;
    int life15_113;
    int life16_121;
    int life17_125;
    forward_join_139: {
    forward_join_137: {
    forward_join_134: {
    forward_join_56: {
    forward_join_41: {
    forward_join_27: {
    forward_join_16: {
    life8_3 = (moom.ID.a ^ 70470480398615L);
    life10_5 = moom.G4.b();
    spill2185_0 = p7;
    spill2185_1 = (3 + ((moom.H6)(p0)).j);
    if (!((life10_5 != null))) {
        forwardValue2185_27_0 = spill2185_0;
        forwardValue2185_27_1 = spill2185_1;
        break forward_join_27;
    }
    if (!((spill2185_0 > spill2185_1))) {
        break forward_join_16;
    }
    return null;
    }
    forwardValue2185_27_0 = java.lang.Math.abs(((int)((p3 - ((moom.G2)(((moom.H6)(p0)).a__G2())).a))));
    forwardValue2185_27_1 = __sourceIntrinsic_323bef16c4a9_invokedynamic2185_6(17370, (1636975360444376657L ^ life8_3));
    }
    if (!((life10_5 != null))) {
        forwardValue2185_41_0 = forwardValue2185_27_0;
        forwardValue2185_41_1 = forwardValue2185_27_1;
        break forward_join_41;
    }
    if (!((forwardValue2185_27_0 <= forwardValue2185_27_1))) {
        break forward_join_139;
    }
    forwardValue2185_41_0 = java.lang.Math.abs(((int)((p5 - ((moom.G2)(((moom.H6)(p0)).a__G2())).c))));
    forwardValue2185_41_1 = __sourceIntrinsic_323bef16c4a9_invokedynamic2185_10(27496, (2449335062669790948L ^ life8_3));
    }
    if (!((forwardValue2185_41_0 <= forwardValue2185_41_1))) {
        break forward_join_139;
    }
    life11_61 = moom.H3.a(((moom.H6)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)));
    spill2185_2 = life11_61;
    if (!((life10_5 != null))) {
        forwardValue2185_56_0 = spill2185_2;
        break forward_join_56;
    }
    if (!((spill2185_2 != null))) {
        break forward_join_137;
    }
    forwardValue2185_56_0 = life11_61;
    }
    if (!((((moom.G2)(forwardValue2185_56_0)).b > __sourceIntrinsic_323bef16c4a9_invokedynamic2185_13(3929, (8619697193927633620L ^ life8_3))))) {
        break forward_join_137;
    }
    life12_85 = new moom.H3(p0, p7, p2, life11_61, p6);
    life13_95 = ((((moom.G2)(((moom.G4)(life12_85)).a)).a + ((moom.G2)(((moom.G4)(life12_85)).a)).d) / 2);
    life14_105 = ((((moom.G2)(((moom.G4)(life12_85)).a)).c + ((moom.G2)(((moom.G4)(life12_85)).a)).f) / 2);
    life15_113 = (((moom.G2)(((moom.G4)(life12_85)).a)).d - ((moom.G2)(((moom.G4)(life12_85)).a)).a);
    life16_121 = (((moom.G2)(((moom.G4)(life12_85)).a)).f - ((moom.G2)(((moom.G4)(life12_85)).a)).c);
    life17_125 = java.lang.Math.max(((int)(life15_113)), ((int)(life16_121)));
    spill2185_3 = ((net.minecraft.world.biome.WorldChunkManager)(((moom.H6)(p0)).a__sourceReturn_e6477e9aa2())).a(((int)(life13_95)), ((int)(life14_105)), ((int)(((life17_125 / 2) + 4))), ((java.util.List)(moom.FR.g)));
    if (!((life10_5 != null))) {
        forwardValue2185_134_0 = ((spill2185_3) ? 1 : 0);
        break forward_join_134;
    }
    if (!(spill2185_3)) {
        break forward_join_137;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(life12_85)));
    forwardValue2185_134_0 = ((((java.util.List)(((moom.H6)(p0)).n)).add(((java.lang.Object)(life12_85)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue2185_134_0);
    return life12_85;
    }
    return null;
    }
    return null;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4914_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ID"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a() {
moom.G1.b(((java.lang.Class)(moom.HY.class)), ((java.lang.String)("ViBH")));
    moom.G1.b(((java.lang.Class)(moom.HV.class)), ((java.lang.String)("ViDF")));
    moom.G1.b(((java.lang.Class)(moom.HW.class)), ((java.lang.String)("ViF")));
    moom.G1.b(((java.lang.Class)(moom.H4.class)), ((java.lang.String)("ViL")));
    moom.G1.b(((java.lang.Class)(moom.HX.class)), ((java.lang.String)("ViPH")));
    moom.G1.b(((java.lang.Class)(moom.H1.class)), ((java.lang.String)("ViSH")));
    moom.G1.b(((java.lang.Class)(moom.H7.class)), ((java.lang.String)("ViSmH")));
    moom.G1.b(((java.lang.Class)(moom.HU.class)), ((java.lang.String)("ViST")));
    moom.G1.b(((java.lang.Class)(moom.HZ.class)), ((java.lang.String)("ViS")));
    moom.G1.b(((java.lang.Class)(moom.H6.class)), ((java.lang.String)("ViStart")));
    moom.G1.b(((java.lang.Class)(moom.H3.class)), ((java.lang.String)("ViSR")));
    moom.G1.b(((java.lang.Class)(moom.H0.class)), ((java.lang.String)("ViTRH")));
    moom.G1.b(((java.lang.Class)(moom.H5.class)), ((java.lang.String)("ViW")));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x212F;
        if (c[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = b[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/ID", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ID.c[n4] = n6;
        }
        return c[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ID.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(java.util.List<moom.IF> p0) {
int lexicalValue787_39_0;
    int lexicalValue787_39_1;
    int lexicalValue787_40_0;
    int lexicalValue787_44_0;
    int lexicalValue787_48_0;
    int lexicalValue787_50_0;
    net.minecraft.entity.Entity[] spill787_0;
    int spill787_1;
    int spill787_2;
    int spill787_3;
    long life1_3;
    int life4_6;
    int life5_8;
    java.util.Iterator life6_11;
    net.minecraft.entity.Entity[] life3_12;
    moom.IF life7_19;
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_44: {
    lexical_join_43: {
    life1_3 = (moom.ID.a ^ 79209643984021L);
    spill787_0 = moom.G4.b();
    life4_6 = 0;
    life5_8 = 0;
    life6_11 = ((java.util.List)(p0)).iterator();
    life3_12 = spill787_0;
    lexical_cycle_13: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_36: {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_43;
    }
    life7_19 = ((moom.IF)(((java.util.Iterator)(life6_11)).next()));
    spill787_1 = ((moom.IF)(life7_19)).d;
    if (!((life3_12 != null))) {
        lexicalValue787_44_0 = spill787_1;
        break lexical_join_44;
    }
    if (!((life3_12 != null))) {
        lexicalValue787_40_0 = spill787_1;
        break lexical_join_40;
    }
    if (!((spill787_1 > 0))) {
        break lexical_join_36;
    }
    spill787_2 = ((moom.IF)(life7_19)).c;
    spill787_3 = ((moom.IF)(life7_19)).d;
    if (!((life3_12 != null))) {
        lexicalValue787_39_0 = spill787_2;
        lexicalValue787_39_1 = spill787_3;
        break lexical_join_39;
    }
    if (!((spill787_2 < spill787_3))) {
        break lexical_join_36;
    }
    life4_6 = 1;
    }
    lexicalValue787_39_0 = life5_8;
    lexicalValue787_39_1 = ((moom.IF)(life7_19)).b;
    }
    lexicalValue787_40_0 = (lexicalValue787_39_0 + lexicalValue787_39_1);
    }
    life5_8 = lexicalValue787_40_0;
    if (!((life3_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue787_44_0 = life4_6;
    }
    if (!((life3_12 != null))) {
        lexicalValue787_48_0 = lexicalValue787_44_0;
        break lexical_join_48;
    }
    if (!((lexicalValue787_44_0 != 0))) {
        break lexical_join_49;
    }
    lexicalValue787_48_0 = life5_8;
    }
    lexicalValue787_50_0 = lexicalValue787_48_0;
    break lexical_join_50;
    }
    lexicalValue787_50_0 = -1;
    }
    return lexicalValue787_50_0;
}


private static moom.HT a(moom.H6 p0, moom.IF p1, java.util.List<moom.G4> p2, java.util.Random p3, int p4, int p5, int p6, moom.bs p7, int p8) {
java.lang.Class forestValue4_29_0;
    java.lang.Class forestValue4_29_1;
    java.lang.Class forestValue4_45_0;
    java.lang.Class forestValue4_45_1;
    java.lang.Class forestValue4_61_0;
    java.lang.Class forestValue4_61_1;
    java.lang.Class forestValue4_77_0;
    java.lang.Class forestValue4_77_1;
    java.lang.Class forestValue4_93_0;
    java.lang.Class forestValue4_93_1;
    java.lang.Class forestValue4_109_0;
    java.lang.Class forestValue4_109_1;
    java.lang.Class forestValue4_125_0;
    java.lang.Class forestValue4_125_1;
    java.lang.Class forestValue4_141_0;
    java.lang.Class forestValue4_141_1;
    net.minecraft.entity.Entity[] spill4_0;
    java.lang.Class spill4_1;
    java.lang.Class spill4_2;
    long life9_3;
    java.lang.Class life12_7;
    net.minecraft.entity.Entity[] life11_8;
    moom.HT life13_10;
    forest_join_152: {
    forest_join_141: {
    forest_join_139: {
    forest_join_125: {
    forest_join_123: {
    forest_join_109: {
    forest_join_107: {
    forest_join_93: {
    forest_join_91: {
    forest_join_77: {
    forest_join_75: {
    forest_join_61: {
    forest_join_59: {
    forest_join_45: {
    forest_join_43: {
    forest_join_29: {
    forest_join_27: {
    life9_3 = (moom.ID.a ^ 23537694236128L);
    spill4_0 = moom.G4.b();
    life12_7 = ((moom.IF)(p1)).a;
    life11_8 = spill4_0;
    life13_10 = null;
    spill4_1 = life12_7;
    spill4_2 = moom.H1.class;
    if (!((life11_8 != null))) {
        forestValue4_29_0 = spill4_1;
        forestValue4_29_1 = spill4_2;
        break forest_join_29;
    }
    if (!((spill4_1 == spill4_2))) {
        break forest_join_27;
    }
    life13_10 = moom.H1.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_29_0 = life12_7;
    forestValue4_29_1 = moom.HU.class;
    }
    if (!((life11_8 != null))) {
        forestValue4_45_0 = forestValue4_29_0;
        forestValue4_45_1 = forestValue4_29_1;
        break forest_join_45;
    }
    if (!((forestValue4_29_0 == forestValue4_29_1))) {
        break forest_join_43;
    }
    life13_10 = moom.HU.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_45_0 = life12_7;
    forestValue4_45_1 = moom.HY.class;
    }
    if (!((life11_8 != null))) {
        forestValue4_61_0 = forestValue4_45_0;
        forestValue4_61_1 = forestValue4_45_1;
        break forest_join_61;
    }
    if (!((forestValue4_45_0 == forestValue4_45_1))) {
        break forest_join_59;
    }
    life13_10 = moom.HY.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_61_0 = life12_7;
    forestValue4_61_1 = moom.H7.class;
    }
    if (!((life11_8 != null))) {
        forestValue4_77_0 = forestValue4_61_0;
        forestValue4_77_1 = forestValue4_61_1;
        break forest_join_77;
    }
    if (!((forestValue4_61_0 == forestValue4_61_1))) {
        break forest_join_75;
    }
    life13_10 = moom.H7.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_77_0 = life12_7;
    forestValue4_77_1 = moom.HX.class;
    }
    if (!((life11_8 != null))) {
        forestValue4_93_0 = forestValue4_77_0;
        forestValue4_93_1 = forestValue4_77_1;
        break forest_join_93;
    }
    if (!((forestValue4_77_0 == forestValue4_77_1))) {
        break forest_join_91;
    }
    life13_10 = moom.HX.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_93_0 = life12_7;
    forestValue4_93_1 = moom.HV.class;
    }
    if (!((life11_8 != null))) {
        forestValue4_109_0 = forestValue4_93_0;
        forestValue4_109_1 = forestValue4_93_1;
        break forest_join_109;
    }
    if (!((forestValue4_93_0 == forestValue4_93_1))) {
        break forest_join_107;
    }
    life13_10 = moom.HV.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_109_0 = life12_7;
    forestValue4_109_1 = moom.HW.class;
    }
    if (!((life11_8 != null))) {
        forestValue4_125_0 = forestValue4_109_0;
        forestValue4_125_1 = forestValue4_109_1;
        break forest_join_125;
    }
    if (!((forestValue4_109_0 == forestValue4_109_1))) {
        break forest_join_123;
    }
    life13_10 = moom.HW.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_125_0 = life12_7;
    forestValue4_125_1 = moom.HZ.class;
    }
    if (!((life11_8 != null))) {
        forestValue4_141_0 = forestValue4_125_0;
        forestValue4_141_1 = forestValue4_125_1;
        break forest_join_141;
    }
    if (!((forestValue4_125_0 == forestValue4_125_1))) {
        break forest_join_139;
    }
    life13_10 = moom.HZ.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    break forest_join_152;
    }
    forestValue4_141_0 = life12_7;
    forestValue4_141_1 = moom.H0.class;
    }
    if (!((forestValue4_141_0 == forestValue4_141_1))) {
        break forest_join_152;
    }
    life13_10 = moom.H0.a(((moom.H6)(p0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    }
    return life13_10;
}


private static moom.HT a__HT(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
int forestValue678_17_0;
    int forestValue678_19_0;
    int forestValue678_55_0;
    moom.IF forestValue678_57_0;
    moom.HT forestValue678_79_0;
    moom.HT forestValue678_110_0;
    moom.H6 forestValue678_112_0;
    net.minecraft.entity.Entity[] spill678_0;
    int spill678_1;
    moom.H6 spill678_2;
    int spill678_3;
    moom.IF spill678_4;
    moom.H6 spill678_5;
    moom.H6 spill678_6;
    long life8_3;
    int life11_8;
    net.minecraft.entity.Entity[] life10_9;
    int life12_18;
    int life13_26;
    java.util.Iterator life14_32;
    moom.IF life15_39;
    moom.HT life16_87;
    moom.G2 life13_131;
    forest_join_131: {
    forest_join_112: {
    forest_join_111: {
    forest_join_110: {
    forest_join_109: {
    forest_join_101: {
    forest_join_90: {
    forest_join_17: {
    forest_join_16: {
    life8_3 = (moom.ID.a ^ 9768019032936L);
    spill678_0 = moom.G4.b();
    life11_8 = moom.ID.a(((java.util.List)(((moom.H6)(p0)).l)));
    life10_9 = spill678_0;
    spill678_1 = life11_8;
    if (!((life10_9 != null))) {
        forestValue678_17_0 = spill678_1;
        break forest_join_17;
    }
    if (!((spill678_1 <= 0))) {
        break forest_join_16;
    }
    return null;
    }
    forestValue678_17_0 = 0;
    }
    life12_18 = forestValue678_17_0;
    forest_cycle_18: while (true) {
    forest_join_87: {
    forestValue678_19_0 = life12_18;
    forest_cycle_19: while (true) {
    if (!((forestValue678_19_0 < 5))) {
        break forest_join_111;
    }
    life12_18 += 1;
    life13_26 = ((java.util.Random)(p2)).nextInt(((int)(life11_8)));
    spill678_2 = p0;
    if (!((life10_9 != null))) {
        forestValue678_112_0 = spill678_2;
        break forest_join_112;
    }
    life14_32 = ((java.util.List)(((moom.H6)(spill678_2)).l)).iterator();
    forest_cycle_32: while (true) {
    forest_join_85: {
    forest_join_79: {
    forest_join_69: {
    forest_join_57: {
    forest_join_55: {
    if (!(((java.util.Iterator)(life14_32)).hasNext())) {
        break forest_join_87;
    }
    life15_39 = ((moom.IF)(((java.util.Iterator)(life14_32)).next()));
    life13_26 = (life13_26 - ((moom.IF)(life15_39)).b);
    spill678_3 = life13_26;
    if (!((life10_9 != null))) {
        forestValue678_19_0 = spill678_3;
        continue forest_cycle_19;
    }
    if (!((life10_9 != null))) {
        forestValue678_55_0 = spill678_3;
        break forest_join_55;
    }
    if (!((spill678_3 < 0))) {
        break forest_join_85;
    }
    spill678_4 = life15_39;
    if (!((life10_9 != null))) {
        forestValue678_57_0 = spill678_4;
        break forest_join_57;
    }
    forestValue678_55_0 = ((((moom.IF)(spill678_4)).a(((int)(p7)))) ? 1 : 0);
    }
    if (!((forestValue678_55_0 != 0))) {
        break forest_join_87;
    }
    forestValue678_57_0 = life15_39;
    }
    if (!((forestValue678_57_0 == ((moom.H6)(p0)).k))) {
        break forest_join_69;
    }
    spill678_5 = p0;
    if (!((life10_9 != null))) {
        forestValue678_79_0 = spill678_5;
        break forest_join_79;
    }
    if (!((((java.util.List)(((moom.H6)(spill678_5)).l)).size() > 1))) {
        break forest_join_69;
    }
    if (!((life10_9 == null))) {
        break forest_join_87;
    }
    }
    forestValue678_79_0 = moom.ID.a(((moom.H6)(p0)), ((moom.IF)(life15_39)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    }
    life16_87 = forestValue678_79_0;
    if (!((life10_9 != null))) {
        break forest_join_101;
    }
    if (!((life16_87 != null))) {
        break forest_join_85;
    }
    break forest_join_90;
    }
    if (!((life10_9 == null))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    break forest_cycle_19;
    }
    }
    if (!((life10_9 == null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    break forest_join_111;
    }
    moom.IF __stackOp678_17_0 = life15_39;
    ((moom.IF)(__stackOp678_17_0)).c = ((int)((((moom.IF)(__stackOp678_17_0)).c + 1)));
    spill678_6 = p0;
    if (!((life10_9 != null))) {
        forestValue678_110_0 = spill678_6;
        break forest_join_110;
    }
    ((moom.H6)(spill678_6)).k = ((moom.IF)(life15_39));
    }
    if (!((!((moom.IF)(life15_39)).a()))) {
        break forest_join_109;
    }
    ((java.util.List)(((moom.H6)(p0)).l)).remove(((java.lang.Object)(life15_39)));
    }
    forestValue678_110_0 = life16_87;
    }
    return forestValue678_110_0;
    }
    forestValue678_112_0 = p0;
    }
    life13_131 = moom.H4.a(((moom.H6)(forestValue678_112_0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)));
    if (!((life13_131 != null))) {
        break forest_join_131;
    }
    return new moom.H4(p0, p7, p2, life13_131, p6);
    }
    return null;
}


private static moom.G4 a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
int forwardValue2182_28_0;
    int forwardValue2182_28_1;
    int forwardValue2182_42_0;
    int forwardValue2182_42_1;
    moom.HT forwardValue2182_60_0;
    int forwardValue2182_121_0;
    int spill2182_0;
    int spill2182_1;
    moom.HT spill2182_2;
    boolean spill2182_3;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    moom.HT life11_65;
    int life12_82;
    int life13_92;
    int life14_100;
    int life15_108;
    int life16_112;
    forward_join_126: {
    forward_join_124: {
    forward_join_121: {
    forward_join_60: {
    forward_join_42: {
    forward_join_28: {
    forward_join_17: {
    life8_3 = (moom.ID.a ^ 119354620603330L);
    life10_5 = moom.G4.b();
    spill2182_0 = p7;
    spill2182_1 = __sourceIntrinsic_2428f73bee30_invokedynamic2182_2(29939, (8764603564565787566L ^ life8_3));
    if (!((life10_5 != null))) {
        forwardValue2182_28_0 = spill2182_0;
        forwardValue2182_28_1 = spill2182_1;
        break forward_join_28;
    }
    if (!((spill2182_0 > spill2182_1))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue2182_28_0 = java.lang.Math.abs(((int)((p3 - ((moom.G2)(((moom.H6)(p0)).a__G2())).a))));
    forwardValue2182_28_1 = __sourceIntrinsic_2428f73bee30_invokedynamic2182_6(27496, (2449366496496282673L ^ life8_3));
    }
    if (!((life10_5 != null))) {
        forwardValue2182_42_0 = forwardValue2182_28_0;
        forwardValue2182_42_1 = forwardValue2182_28_1;
        break forward_join_42;
    }
    if (!((forwardValue2182_28_0 <= forwardValue2182_28_1))) {
        break forward_join_126;
    }
    forwardValue2182_42_0 = java.lang.Math.abs(((int)((p5 - ((moom.G2)(((moom.H6)(p0)).a__G2())).c))));
    forwardValue2182_42_1 = __sourceIntrinsic_2428f73bee30_invokedynamic2182_10(27496, (2449366496496282673L ^ life8_3));
    }
    if (!((forwardValue2182_42_0 <= forwardValue2182_42_1))) {
        break forward_join_126;
    }
    life11_65 = moom.ID.a__HT(((moom.H6)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)((p7 + 1))));
    spill2182_2 = life11_65;
    if (!((life10_5 != null))) {
        forwardValue2182_60_0 = spill2182_2;
        break forward_join_60;
    }
    if (!((spill2182_2 != null))) {
        break forward_join_124;
    }
    forwardValue2182_60_0 = life11_65;
    }
    life12_82 = ((((moom.G2)(((moom.G4)(forwardValue2182_60_0)).a)).a + ((moom.G2)(((moom.G4)(life11_65)).a)).d) / 2);
    life13_92 = ((((moom.G2)(((moom.G4)(life11_65)).a)).c + ((moom.G2)(((moom.G4)(life11_65)).a)).f) / 2);
    life14_100 = (((moom.G2)(((moom.G4)(life11_65)).a)).d - ((moom.G2)(((moom.G4)(life11_65)).a)).a);
    life15_108 = (((moom.G2)(((moom.G4)(life11_65)).a)).f - ((moom.G2)(((moom.G4)(life11_65)).a)).c);
    life16_112 = java.lang.Math.max(((int)(life14_100)), ((int)(life15_108)));
    spill2182_3 = ((net.minecraft.world.biome.WorldChunkManager)(((moom.H6)(p0)).a__sourceReturn_e6477e9aa2())).a(((int)(life12_82)), ((int)(life13_92)), ((int)(((life16_112 / 2) + 4))), ((java.util.List)(moom.FR.g)));
    if (!((life10_5 != null))) {
        forwardValue2182_121_0 = ((spill2182_3) ? 1 : 0);
        break forward_join_121;
    }
    if (!(spill2182_3)) {
        break forward_join_124;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(life11_65)));
    forwardValue2182_121_0 = ((((java.util.List)(((moom.H6)(p0)).m)).add(((java.lang.Object)(life11_65)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue2182_121_0);
    return life11_65;
    }
    return null;
    }
    return null;
}


public static java.util.List<moom.IF> a(java.util.Random p0, int p1) {
long local2 = (moom.ID.a ^ 84431057793367L);
    java.util.ArrayList local4 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.H1.class, 4, moom.Dr.a(((java.util.Random)(p0)), ((int)((2 + p1))), ((int)((4 + (p1 * 2)))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.HU.class, __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_6(20069, (7680506405840196523L ^ local2)), moom.Dr.a(((java.util.Random)(p0)), ((int)(p1)), ((int)((1 + p1))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.HY.class, __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_10(3412, (4095221943250997403L ^ local2)), moom.Dr.a(((java.util.Random)(p0)), ((int)(p1)), ((int)((2 + p1))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.H7.class, 3, moom.Dr.a(((java.util.Random)(p0)), ((int)((2 + p1))), ((int)((5 + (p1 * 3)))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.HX.class, __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_17(23221, (2839827622888802166L ^ local2)), moom.Dr.a(((java.util.Random)(p0)), ((int)(p1)), ((int)((2 + p1))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.HV.class, 3, moom.Dr.a(((java.util.Random)(p0)), ((int)((1 + p1))), ((int)((4 + p1))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.HW.class, 3, moom.Dr.a(((java.util.Random)(p0)), ((int)((2 + p1))), ((int)((4 + (p1 * 2)))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.HZ.class, __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_27(27950, (3321811114004230375L ^ local2)), moom.Dr.a(((java.util.Random)(p0)), ((int)(0)), ((int)((1 + p1))))))));
    ((java.util.List)(local4)).add(((java.lang.Object)(new moom.IF(moom.H0.class, __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_31(17088, (806908377471098634L ^ local2)), moom.Dr.a(((java.util.Random)(p0)), ((int)(p1)), ((int)((3 + (p1 * 2)))))))));
    ((java.util.List)(local4)).removeIf(((java.util.function.Predicate)(__sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_34())));
    return local4;
}


private static boolean lambda$getStructureVillageWeightedPieceList$0(moom.IF p0) {
int forwardValue2186_12_0;
    int forwardValue2186_14_0;
    int spill2186_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.ID.a ^ 99996154026245L);
    life3_5 = moom.G4.b();
    spill2186_0 = ((moom.IF)(p0)).d;
    if (!((life3_5 != null))) {
        forwardValue2186_12_0 = spill2186_0;
        break forward_join_12;
    }
    if (!((spill2186_0 == 0))) {
        break forward_join_13;
    }
    forwardValue2186_12_0 = 1;
    }
    forwardValue2186_14_0 = forwardValue2186_12_0;
    break forward_join_14;
    }
    forwardValue2186_14_0 = 0;
    }
    return ((forwardValue2186_14_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4914_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_2c014b3d0360_originalDynamicSite1655_34() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2428f73bee30_invokedynamic2182_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2428f73bee30_invokedynamic2182_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2428f73bee30_invokedynamic2182_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_323bef16c4a9_invokedynamic2185_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_323bef16c4a9_invokedynamic2185_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_323bef16c4a9_invokedynamic2185_13(int a0, long a1) throws E;
}
