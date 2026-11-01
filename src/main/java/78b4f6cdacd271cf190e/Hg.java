package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hg extends moom.Hc {

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public Hg() {
super();
}


public Hg(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-993746179940365736L)), ((long)(-2250285284753320707L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260110197471456L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hg.f ^ 51254669825336L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill834_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill834_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill834_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill834_14 = new byte[8];
    (__sourceSpill834_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill834_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation834_16 = __sourceSpill834_14;
    ((javax.crypto.Cipher)(__sourceSpill834_11)).init(((int)(__sourceSpill834_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill834_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation834_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "[\037./®U´\024Øß|Ãc\027\025\037M»\037ktPB0:2ÁW¢Z)b\023\016:_4ìú^á4b@Äh¯ñf³ô"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill834_25 = local6_life21;
        int __sourceSpill834_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill834_25)).substring(((int)(__sourceSpill834_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill834_30 = local8_life19;
        int __sourceSpill834_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill834_33 = new byte[8];
        (__sourceSpill834_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill834_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill834_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill834_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill834_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill834_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill834_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill834_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill834_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill834_34)).doFinal(((byte[])(__sourceSpill834_33)));
        (__sourceSpill834_30)[__sourceSpill834_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "§5L¼\177Ð¸\031*Õ¹,"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill834_38 = local6_life21;
        int __sourceSpill834_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill834_38)).substring(((int)(__sourceSpill834_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill834_43 = local8_life19;
        int __sourceSpill834_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill834_46 = new byte[8];
        (__sourceSpill834_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill834_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill834_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill834_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill834_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill834_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill834_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill834_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill834_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill834_47)).doFinal(((byte[])(__sourceSpill834_46)));
        (__sourceSpill834_43)[__sourceSpill834_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hg.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6397;
        if (h[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n2];
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
                throw new RuntimeException("moom/Hg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hg.h[n2] = n3;
        }
        return h[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4833_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static moom.Hg a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.Hg forwardValue2132_48_0;
    long life7_3;
    moom.G2 life9_31;
    forward_join_48: {
    forward_join_47: {
    life7_3 = (moom.Hg.f ^ 86186025336853L);
    life9_31 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_85949fe3f57d_invokedynamic2132_1(30789, (4303859340556187070L ^ life7_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_85949fe3f57d_invokedynamic2132_2(19876, (4618143844236984408L ^ life7_3)))), ((int)(__sourceIntrinsic_85949fe3f57d_invokedynamic2132_3(13476, (1695225805503428953L ^ life7_3)))), ((int)(__sourceIntrinsic_85949fe3f57d_invokedynamic2132_4(31739, (6804477615739057666L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.Hg.a(((moom.G2)(life9_31))))) {
        break forward_join_47;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_31))) == null))) {
        break forward_join_47;
    }
    forwardValue2132_48_0 = new moom.Hg(p6, p1, life9_31, p5);
    break forward_join_48;
    }
    forwardValue2132_48_0 = null;
    }
    return forwardValue2132_48_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
moom.bs forwardValue2133_19_0;
    moom.bs forwardValue2133_19_1;
    moom.Hg forwardValue2133_23_0;
    moom.Hg forwardValue2133_40_0;
    moom.Hl forwardValue2133_40_1;
    java.util.List forwardValue2133_40_2;
    java.util.Random forwardValue2133_40_3;
    int forwardValue2133_40_4;
    int forwardValue2133_40_5;
    int forwardValue2133_40_6;
    moom.Hg forwardValue2133_41_0;
    moom.Hl forwardValue2133_41_1;
    java.util.List forwardValue2133_41_2;
    java.util.Random forwardValue2133_41_3;
    int forwardValue2133_41_4;
    int forwardValue2133_41_5;
    moom.Hg forwardValue2133_42_0;
    moom.Hl forwardValue2133_42_1;
    java.util.List forwardValue2133_42_2;
    java.util.Random forwardValue2133_42_3;
    int forwardValue2133_42_4;
    int forwardValue2133_42_5;
    int forwardValue2133_42_6;
    moom.Hg forwardValue2133_62_0;
    moom.Hl forwardValue2133_62_1;
    java.util.List forwardValue2133_62_2;
    java.util.Random forwardValue2133_62_3;
    int forwardValue2133_62_4;
    int forwardValue2133_62_5;
    int forwardValue2133_62_6;
    moom.Hg forwardValue2133_63_0;
    moom.Hl forwardValue2133_63_1;
    java.util.List forwardValue2133_63_2;
    java.util.Random forwardValue2133_63_3;
    int forwardValue2133_63_4;
    int forwardValue2133_63_5;
    moom.Hg forwardValue2133_64_0;
    moom.Hl forwardValue2133_64_1;
    java.util.List forwardValue2133_64_2;
    java.util.Random forwardValue2133_64_3;
    int forwardValue2133_64_4;
    int forwardValue2133_64_5;
    int forwardValue2133_64_6;
    net.minecraft.entity.Entity[] spill2133_0;
    moom.bs spill2133_1;
    moom.bs spill2133_2;
    moom.Hg spill2133_3;
    moom.Hl spill2133_4;
    java.util.List spill2133_5;
    java.util.Random spill2133_6;
    int spill2133_7;
    int spill2133_8;
    int spill2133_9;
    moom.Hg spill2133_10;
    moom.Hl spill2133_11;
    java.util.List spill2133_12;
    java.util.Random spill2133_13;
    int spill2133_14;
    int spill2133_15;
    int spill2133_16;
    long life4_3;
    int life7_6;
    net.minecraft.entity.Entity[] life6_7;
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    life4_3 = (moom.Hg.f ^ 99381117503376L);
    spill2133_0 = moom.G4.b();
    life7_6 = 1;
    life6_7 = spill2133_0;
    spill2133_1 = ((moom.Hg)(this)).b;
    spill2133_2 = moom.bs.WEST;
    if (!((life6_7 != null))) {
        forwardValue2133_19_0 = spill2133_1;
        forwardValue2133_19_1 = spill2133_2;
        break forward_join_19;
    }
    if (!((spill2133_1 != spill2133_2))) {
        break forward_join_20;
    }
    spill2133_3 = this;
    if (!((life6_7 != null))) {
        forwardValue2133_23_0 = spill2133_3;
        break forward_join_23;
    }
    forwardValue2133_19_0 = ((moom.Hg)(spill2133_3)).b;
    forwardValue2133_19_1 = moom.bs.NORTH;
    }
    if (!((forwardValue2133_19_0 == forwardValue2133_19_1))) {
        break forward_join_22;
    }
    }
    life7_6 = 5;
    }
    forwardValue2133_23_0 = this;
    }
    spill2133_4 = ((moom.Hl)(p0));
    spill2133_5 = p1;
    spill2133_6 = p2;
    spill2133_7 = 0;
    spill2133_8 = life7_6;
    spill2133_9 = ((java.util.Random)(p2)).nextInt(((int)(__sourceIntrinsic_0f75cc6dd3c5_invokedynamic2133_7(22944, (1264745399429174235L ^ life4_3)))));
    if (!((life6_7 != null))) {
        forwardValue2133_40_0 = forwardValue2133_23_0;
        forwardValue2133_40_1 = spill2133_4;
        forwardValue2133_40_2 = spill2133_5;
        forwardValue2133_40_3 = spill2133_6;
        forwardValue2133_40_4 = spill2133_7;
        forwardValue2133_40_5 = spill2133_8;
        forwardValue2133_40_6 = spill2133_9;
        break forward_join_40;
    }
    if (!((spill2133_9 > 0))) {
        forwardValue2133_41_0 = forwardValue2133_23_0;
        forwardValue2133_41_1 = spill2133_4;
        forwardValue2133_41_2 = spill2133_5;
        forwardValue2133_41_3 = spill2133_6;
        forwardValue2133_41_4 = spill2133_7;
        forwardValue2133_41_5 = spill2133_8;
        break forward_join_41;
    }
    forwardValue2133_40_0 = forwardValue2133_23_0;
    forwardValue2133_40_1 = spill2133_4;
    forwardValue2133_40_2 = spill2133_5;
    forwardValue2133_40_3 = spill2133_6;
    forwardValue2133_40_4 = spill2133_7;
    forwardValue2133_40_5 = spill2133_8;
    forwardValue2133_40_6 = 1;
    }
    forwardValue2133_42_0 = forwardValue2133_40_0;
    forwardValue2133_42_1 = forwardValue2133_40_1;
    forwardValue2133_42_2 = forwardValue2133_40_2;
    forwardValue2133_42_3 = forwardValue2133_40_3;
    forwardValue2133_42_4 = forwardValue2133_40_4;
    forwardValue2133_42_5 = forwardValue2133_40_5;
    forwardValue2133_42_6 = forwardValue2133_40_6;
    break forward_join_42;
    }
    forwardValue2133_42_0 = forwardValue2133_41_0;
    forwardValue2133_42_1 = forwardValue2133_41_1;
    forwardValue2133_42_2 = forwardValue2133_41_2;
    forwardValue2133_42_3 = forwardValue2133_41_3;
    forwardValue2133_42_4 = forwardValue2133_41_4;
    forwardValue2133_42_5 = forwardValue2133_41_5;
    forwardValue2133_42_6 = 0;
    }
    ((moom.Hg)(forwardValue2133_42_0)).b(((moom.Hl)(forwardValue2133_42_1)), ((java.util.List)(forwardValue2133_42_2)), ((java.util.Random)(forwardValue2133_42_3)), ((int)(forwardValue2133_42_4)), ((int)(forwardValue2133_42_5)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2133_42_6))));
    spill2133_10 = this;
    spill2133_11 = ((moom.Hl)(p0));
    spill2133_12 = p1;
    spill2133_13 = p2;
    spill2133_14 = 0;
    spill2133_15 = life7_6;
    spill2133_16 = ((java.util.Random)(p2)).nextInt(((int)(__sourceIntrinsic_0f75cc6dd3c5_invokedynamic2133_11(31287, (6606562156625965128L ^ life4_3)))));
    if (!((life6_7 != null))) {
        forwardValue2133_62_0 = spill2133_10;
        forwardValue2133_62_1 = spill2133_11;
        forwardValue2133_62_2 = spill2133_12;
        forwardValue2133_62_3 = spill2133_13;
        forwardValue2133_62_4 = spill2133_14;
        forwardValue2133_62_5 = spill2133_15;
        forwardValue2133_62_6 = spill2133_16;
        break forward_join_62;
    }
    if (!((spill2133_16 > 0))) {
        forwardValue2133_63_0 = spill2133_10;
        forwardValue2133_63_1 = spill2133_11;
        forwardValue2133_63_2 = spill2133_12;
        forwardValue2133_63_3 = spill2133_13;
        forwardValue2133_63_4 = spill2133_14;
        forwardValue2133_63_5 = spill2133_15;
        break forward_join_63;
    }
    forwardValue2133_62_0 = spill2133_10;
    forwardValue2133_62_1 = spill2133_11;
    forwardValue2133_62_2 = spill2133_12;
    forwardValue2133_62_3 = spill2133_13;
    forwardValue2133_62_4 = spill2133_14;
    forwardValue2133_62_5 = spill2133_15;
    forwardValue2133_62_6 = 1;
    }
    forwardValue2133_64_0 = forwardValue2133_62_0;
    forwardValue2133_64_1 = forwardValue2133_62_1;
    forwardValue2133_64_2 = forwardValue2133_62_2;
    forwardValue2133_64_3 = forwardValue2133_62_3;
    forwardValue2133_64_4 = forwardValue2133_62_4;
    forwardValue2133_64_5 = forwardValue2133_62_5;
    forwardValue2133_64_6 = forwardValue2133_62_6;
    break forward_join_64;
    }
    forwardValue2133_64_0 = forwardValue2133_63_0;
    forwardValue2133_64_1 = forwardValue2133_63_1;
    forwardValue2133_64_2 = forwardValue2133_63_2;
    forwardValue2133_64_3 = forwardValue2133_63_3;
    forwardValue2133_64_4 = forwardValue2133_63_4;
    forwardValue2133_64_5 = forwardValue2133_63_5;
    forwardValue2133_64_6 = 0;
    }
    ((moom.Hg)(forwardValue2133_64_0)).c(((moom.Hl)(forwardValue2133_64_1)), ((java.util.List)(forwardValue2133_64_2)), ((java.util.Random)(forwardValue2133_64_3)), ((int)(forwardValue2133_64_4)), ((int)(forwardValue2133_64_5)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2133_64_6))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue761_445_0;
    net.minecraft.entity.Entity[] spill761_0;
    int spill761_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_28;
    int life7_412;
    int life8_419;
    lexical_join_445: {
    lexical_join_444: {
    life4_3 = (moom.Hg.f ^ 48285988556118L);
    spill761_0 = moom.G4.b();
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_2(31287, (6606579235647421070L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_3(31287, (6606579235647421070L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life6_28 = spill761_0;
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_9(31287, (6606579235647421070L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_10(31287, (6606579235647421070L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_16(9334, (6064375273704236237L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_17(31287, (6606579235647421070L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_18(12613, (107034982311866873L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(2)), ((int)(5)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_29(12613, (107034982311866873L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_30(31287, (6606579235647421070L ^ life4_3)))), ((int)(5)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(1)), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_41(30124, (3541068979666154776L ^ life4_3)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_42(30124, (3541068979666154776L ^ life4_3)))), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_48(31287, (6606579235647421070L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_49(31287, (6606579235647421070L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(4)), ((int)(2)), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_60(12613, (107034982311866873L ^ life4_3)))), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_61(30124, (3541068979666154776L ^ life4_3)))), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_67(31287, (6606579235647421070L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_68(31287, (6606579235647421070L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_69(31287, (6606579235647421070L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_75(12613, (107034982311866873L ^ life4_3)))), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_76(30124, (3541068979666154776L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_82(31287, (6606579235647421070L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_83(12613, (107034982311866873L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_84(31287, (6606579235647421070L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_85(30124, (3541068979666154776L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(4)), ((int)(0)), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_96(31287, (6606579235647421070L ^ life4_3)))), ((int)(3)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_97(31287, (6606579235647421070L ^ life4_3)))), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(5)), ((int)(2)), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_108(12613, (107034982311866873L ^ life4_3)))), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_109(30124, (3541068979666154776L ^ life4_3)))), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(5)), ((int)(1)), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hg)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_120(30124, (3541068979666154776L ^ life4_3)))), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic761_121(30124, (3541068979666154776L ^ life4_3)))), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    life7_412 = 0;
    lexical_cycle_413: while (true) {
    lexical_join_442: {
    lexical_join_441: {
    if (!((life7_412 <= 5))) {
        break lexical_join_444;
    }
    spill761_1 = 0;
    if (!((life6_28 != null))) {
        lexicalValue761_445_0 = spill761_1;
        break lexical_join_445;
    }
    life8_419 = spill761_1;
    lexical_cycle_420: while (true) {
    if (!((life8_419 <= __sourceIntrinsic_5ac1d031d896_invokedynamic761_127(31287, (6606579235647421070L ^ life4_3))))) {
        break lexical_join_441;
    }
    ((moom.Hg)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life8_419)), ((int)(-1)), ((int)(life7_412)), ((moom.G2)(p2)));
    life8_419 += 1;
    if (!((life6_28 != null))) {
        break lexical_join_442;
    }
    if (!((life6_28 == null))) { continue lexical_cycle_420; }
    break lexical_cycle_420;
    }
    }
    life7_412 += 1;
    }
    if (!((life6_28 == null))) { continue lexical_cycle_413; }
    break lexical_cycle_413;
    }
    }
    lexicalValue761_445_0 = 1;
    }
    return ((lexicalValue761_445_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_85949fe3f57d_invokedynamic2132_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85949fe3f57d_invokedynamic2132_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85949fe3f57d_invokedynamic2132_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85949fe3f57d_invokedynamic2132_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic2133_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic2133_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic761_127(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4833_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
