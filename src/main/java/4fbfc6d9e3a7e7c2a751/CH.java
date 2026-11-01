package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CH {

public static final char[] a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public CH() {
super();
}


static {
javax.crypto.Cipher forestValue383_36_0;
    int forestValue383_36_1;
    javax.crypto.SecretKeyFactory forestValue383_36_2;
    byte[] forestValue383_36_3;
    javax.crypto.Cipher forestValue383_53_0;
    int forestValue383_53_1;
    javax.crypto.SecretKeyFactory forestValue383_53_2;
    byte[] forestValue383_53_3;
    long[] forestValue383_157_0;
    int forestValue383_157_1;
    long forestValue383_157_2;
    int forestValue383_157_3;
    long[] forestValue383_300_0;
    int forestValue383_300_1;
    long forestValue383_300_2;
    long[] forestValue383_312_0;
    int forestValue383_312_1;
    long forestValue383_312_2;
    javax.crypto.Cipher spill383_0;
    int spill383_1;
    javax.crypto.SecretKeyFactory spill383_2;
    byte[] spill383_3;
    byte[] spill383_4;
    java.lang.String spill383_5;
    int spill383_6;
    int spill383_7;
    long spill383_8;
    byte[] spill383_9;
    byte[] spill383_10;
    byte[] spill383_11;
    byte[] spill383_12;
    byte[] spill383_13;
    byte[] spill383_14;
    byte[] spill383_15;
    byte[] spill383_16;
    long spill383_17;
    int spill383_18;
    java.lang.String spill383_19;
    int spill383_20;
    long[] spill383_21;
    int spill383_22;
    long spill383_23;
    int spill383_24;
    char[] spill383_25;
    char[] spill383_26;
    char[] spill383_27;
    char[] spill383_28;
    char[] spill383_29;
    char[] spill383_30;
    char[] spill383_31;
    char[] spill383_32;
    char[] spill383_33;
    char[] spill383_34;
    char[] spill383_35;
    char[] spill383_36;
    char[] spill383_37;
    char[] spill383_38;
    char[] spill383_39;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    forest_join_399: {
    forest_join_53: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-2293658541020796479L)), ((long)(7267893564335662548L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240707967996273L)))));
    life11_11 = (moom.CH.b ^ 38445384499249L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    spill383_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill383_1 = 2;
    spill383_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp383_9_0 = new byte[8];
    spill383_3 = __stackOp383_9_0;
    (__stackOp383_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue383_36_0 = spill383_0;
    forestValue383_36_1 = spill383_1;
    forestValue383_36_2 = spill383_2;
    forestValue383_36_3 = spill383_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue383_53_0 = forestValue383_36_0;
        forestValue383_53_1 = forestValue383_36_1;
        forestValue383_53_2 = forestValue383_36_2;
        forestValue383_53_3 = forestValue383_36_3;
        break forest_join_53;
    }
    byte[] __stackOp383_10_0 = forestValue383_36_3;
    spill383_4 = __stackOp383_10_0;
    (__stackOp383_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue383_36_3 = spill383_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue383_53_0)).init(((int)(forestValue383_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue383_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue383_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[27];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "u²-;gûÎªZfàÏzì[ÓpÆ\007ÞM*¢Us?ôæe[2\026°¿6µÌõò¢âÑñîÝ\033Gc¬!wÍW¶Ðv7ãù'\001Ó#Z\005\177\0265êK|&sHáàÃ±?å\021e\025h\020(üäs;\005ÓÊ:©ÈÏH¦;\030âÓae\021§6ô\006O>å\030!@FònïÔ¢#ã-A]Æ³9Ì«\033<¶\007ÇôýèêRaÓï38e²\004),Ë¶°în,Nô\n¦ù¹Òö=#*Åhí\003G"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill383_5 = life4_71;
    spill383_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill383_5)).substring(((int)(spill383_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue383_157_0 = life6_66;
    forestValue383_157_1 = (life3_68++);
    forestValue383_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue383_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp383_16_0 = forestValue383_157_2;
    int __stackOp383_16_1 = forestValue383_157_3;
    spill383_7 = __stackOp383_16_1;
    spill383_8 = __stackOp383_16_0;
    recovery.source.CarrierOps.discard(__stackOp383_16_1);
    life8_160 = spill383_8;
    byte[] __stackOp383_18_0 = new byte[8];
    spill383_9 = __stackOp383_18_0;
    (__stackOp383_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp383_19_0 = spill383_9;
    spill383_10 = __stackOp383_19_0;
    (__stackOp383_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp383_20_0 = spill383_10;
    spill383_11 = __stackOp383_20_0;
    (__stackOp383_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp383_21_0 = spill383_11;
    spill383_12 = __stackOp383_21_0;
    (__stackOp383_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp383_22_0 = spill383_12;
    spill383_13 = __stackOp383_22_0;
    (__stackOp383_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp383_23_0 = spill383_13;
    spill383_14 = __stackOp383_23_0;
    (__stackOp383_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp383_24_0 = spill383_14;
    spill383_15 = __stackOp383_24_0;
    (__stackOp383_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp383_25_0 = spill383_15;
    spill383_16 = __stackOp383_25_0;
    (__stackOp383_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp383_26_0 = spill383_16;
    javax.crypto.Cipher __stackOp383_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp383_26_1)).doFinal(((byte[])(__stackOp383_26_0)));
    int __stackOp383_28_0 = spill383_7;
    long __stackOp383_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill383_17 = __stackOp383_28_1;
    spill383_18 = __stackOp383_28_0;
    recovery.source.CarrierOps.discard(__stackOp383_28_1);
    switch (spill383_18) {
default:
{
        forestValue383_300_0 = forestValue383_157_0;
        forestValue383_300_1 = forestValue383_157_1;
        forestValue383_300_2 = spill383_17;
        break forest_join_300;
    }
case 0:
{
        forestValue383_312_0 = forestValue383_157_0;
        forestValue383_312_1 = forestValue383_157_1;
        forestValue383_312_2 = spill383_17;
        break forest_join_312;
    }
}
    }
    (forestValue383_300_0)[forestValue383_300_1] = forestValue383_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = ")E½r\017Ê¯ =<ZÐ+"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue383_312_0)[forestValue383_312_1] = forestValue383_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill383_19 = life4_71;
    spill383_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill383_19)).substring(((int)(spill383_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill383_21 = life6_66;
    spill383_22 = (life3_68++);
    spill383_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill383_24 = 0;
    forestValue383_157_0 = spill383_21;
    forestValue383_157_1 = spill383_22;
    forestValue383_157_2 = spill383_23;
    forestValue383_157_3 = spill383_24;
    continue forest_cycle_157;
    }
    }
    }
    c = ((long[])(life6_66));
    d = ((java.lang.Integer[])(new java.lang.Integer[27]));
    char[] __stackOp383_36_0 = new char[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_35(23361, (8789202714316928865L ^ life11_11))];
    spill383_25 = __stackOp383_36_0;
    (__stackOp383_36_0)[0] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_37(6926, (4269920855561975605L ^ life11_11))));
    char[] __stackOp383_39_0 = spill383_25;
    spill383_26 = __stackOp383_39_0;
    (__stackOp383_39_0)[1] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_40(12436, (3263915578653318325L ^ life11_11))));
    char[] __stackOp383_42_0 = spill383_26;
    spill383_27 = __stackOp383_42_0;
    (__stackOp383_42_0)[2] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_43(110, (2896952627194932308L ^ life11_11))));
    char[] __stackOp383_45_0 = spill383_27;
    spill383_28 = __stackOp383_45_0;
    (__stackOp383_45_0)[3] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_46(21196, (831743038301732591L ^ life11_11))));
    char[] __stackOp383_48_0 = spill383_28;
    spill383_29 = __stackOp383_48_0;
    (__stackOp383_48_0)[4] = ((char)(0));
    char[] __stackOp383_50_0 = spill383_29;
    spill383_30 = __stackOp383_50_0;
    (__stackOp383_50_0)[5] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_51(5341, (8047216958548130017L ^ life11_11))));
    char[] __stackOp383_53_0 = spill383_30;
    spill383_31 = __stackOp383_53_0;
    (__stackOp383_53_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_54(26647, (1354136407079994414L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_55(2714, (7394370089750144696L ^ life11_11))));
    char[] __stackOp383_57_0 = spill383_31;
    spill383_32 = __stackOp383_57_0;
    (__stackOp383_57_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_58(16536, (2666014011041672381L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_59(13496, (4859165242126932110L ^ life11_11))));
    char[] __stackOp383_61_0 = spill383_32;
    spill383_33 = __stackOp383_61_0;
    (__stackOp383_61_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_62(2285, (1350401740319565010L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_63(9738, (5348396711061981754L ^ life11_11))));
    char[] __stackOp383_65_0 = spill383_33;
    spill383_34 = __stackOp383_65_0;
    (__stackOp383_65_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_66(29853, (2371972861696530597L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_67(27311, (141684726524102283L ^ life11_11))));
    char[] __stackOp383_69_0 = spill383_34;
    spill383_35 = __stackOp383_69_0;
    (__stackOp383_69_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_70(23339, (3889420425086138125L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_71(2712, (1481655738399958698L ^ life11_11))));
    char[] __stackOp383_73_0 = spill383_35;
    spill383_36 = __stackOp383_73_0;
    (__stackOp383_73_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_74(11825, (4807494275510567430L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_75(16979, (543207391937588858L ^ life11_11))));
    char[] __stackOp383_77_0 = spill383_36;
    spill383_37 = __stackOp383_77_0;
    (__stackOp383_77_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_78(21530, (8551604677113116708L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_79(2077, (6674703073446077480L ^ life11_11))));
    char[] __stackOp383_81_0 = spill383_37;
    spill383_38 = __stackOp383_81_0;
    (__stackOp383_81_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_82(26996, (6056611842146649436L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_83(5638, (1382182217220766253L ^ life11_11))));
    char[] __stackOp383_85_0 = spill383_38;
    spill383_39 = __stackOp383_85_0;
    (__stackOp383_85_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic383_86(27165, (7662203340706399785L ^ life11_11))] = ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic383_87(15970, (7037522345516765765L ^ life11_11))));
    a = ((char[])(spill383_39));
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x724B;
        if (d[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = c[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/CH", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CH.d[n4] = n6;
        }
        return d[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.CH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4029_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/CH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.lang.String a(java.lang.String p0) {
boolean spill523_0;
    long life1_3;
    java.lang.StringBuilder life4_8;
    char[] life5_11;
    int life6_14;
    int life7_16;
    int life3_17;
    int life8_24;
    lexical_join_37: {
    life1_3 = (moom.CH.b ^ 129534532272584L);
    spill523_0 = moom.DS.b__Boolean();
    life4_8 = new java.lang.StringBuilder();
    life5_11 = ((java.lang.String)(p0)).toCharArray();
    life6_14 = (life5_11).length;
    life7_16 = 0;
    life3_17 = ((spill523_0) ? 1 : 0);
    lexical_cycle_18: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    if (!((life7_16 < life6_14))) {
        break lexical_join_37;
    }
    life8_24 = ((int)((life5_11)[life7_16]));
    if (!((life3_17 == 0))) {
        break lexical_join_35;
    }
    if (!(moom.CH.a(((char)(life8_24))))) {
        break lexical_join_34;
    }
    ((java.lang.StringBuilder)(life4_8)).append(((char)(life8_24)));
    }
    life7_16 += 1;
    }
    if (!((life3_17 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return ((java.lang.StringBuilder)(life4_8)).toString();
}


public static boolean a(char p0) {
int forestValue595_21_0;
    int forestValue595_21_1;
    int forestValue595_32_0;
    int forestValue595_32_1;
    int forestValue595_34_0;
    int forestValue595_36_0;
    char spill595_0;
    int spill595_1;
    char spill595_2;
    long life1_3;
    int life3_5;
    forest_join_36: {
    forest_join_35: {
    forest_join_34: {
    forest_join_32: {
    forest_join_21: {
    life1_3 = (moom.CH.b ^ 102939319136420L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill595_0 = p0;
    spill595_1 = __sourceIntrinsic_bb2e52fac247_invokedynamic595_3(1295, (584184706641385895L ^ life1_3));
    if (!((life3_5 == 0))) {
        forestValue595_21_0 = ((int)(spill595_0));
        forestValue595_21_1 = spill595_1;
        break forest_join_21;
    }
    if (!((spill595_0 != spill595_1))) {
        break forest_join_35;
    }
    forestValue595_21_0 = ((int)(p0));
    forestValue595_21_1 = __sourceIntrinsic_bb2e52fac247_invokedynamic595_5(3734, (2717087803365511730L ^ life1_3));
    }
    if (!((life3_5 == 0))) {
        forestValue595_32_0 = forestValue595_21_0;
        forestValue595_32_1 = forestValue595_21_1;
        break forest_join_32;
    }
    if (!((forestValue595_21_0 >= forestValue595_21_1))) {
        break forest_join_35;
    }
    spill595_2 = p0;
    if (!((life3_5 == 0))) {
        forestValue595_34_0 = ((int)(spill595_2));
        break forest_join_34;
    }
    forestValue595_32_0 = ((int)(spill595_2));
    forestValue595_32_1 = __sourceIntrinsic_bb2e52fac247_invokedynamic595_8(24399, (8812030020460708841L ^ life1_3));
    }
    if (!((forestValue595_32_0 != forestValue595_32_1))) {
        break forest_join_35;
    }
    forestValue595_34_0 = 1;
    }
    forestValue595_36_0 = forestValue595_34_0;
    break forest_join_36;
    }
    forestValue595_36_0 = 0;
    }
    return ((forestValue595_36_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic383_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb2e52fac247_invokedynamic595_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb2e52fac247_invokedynamic595_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb2e52fac247_invokedynamic595_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4029_0() throws E;
}
