package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LI {

private final net.minecraft.client.gui.GuiScreen a;

private final moom.LJ b;

private int c;

private int d;

private long e;

private static final long f;

private static final java.lang.String g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public LI(net.minecraft.client.gui.GuiScreen p0, moom.LJ p1) {
super();
    this.c = 0;
    this.d = 0;
    this.e = 0L;
    this.a = p0;
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-8233060806223069028L)), ((long)(-2855507153173170532L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(243445498832611L)))));
    long local11_life6 = (moom.LI.f ^ 40313340263960L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill668_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill668_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill668_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill668_13 = new byte[8];
    (__sourceSpill668_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill668_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation668_15 = __sourceSpill668_13;
    ((javax.crypto.Cipher)(__sourceSpill668_10)).init(((int)(__sourceSpill668_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill668_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation668_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill668_19 = ((java.lang.String)("syÇõÀ8=")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill668_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill668_20)).doFinal(((byte[])(__sourceSpill668_19)));
    g = ((java.lang.String)(((java.lang.String)(moom.LI.a(((byte[])(local15_life22))))).intern()));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill668_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill668_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill668_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill668_33 = new byte[8];
    (__sourceSpill668_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill668_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation668_35 = __sourceSpill668_33;
    ((javax.crypto.Cipher)(__sourceSpill668_30)).init(((int)(__sourceSpill668_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill668_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation668_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[8];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "NxiÑGÈ\002³¢1¹Ô]ãw\"^¤%·\013ÚÓ½lèÇRá÷E1x\034Ð\005gæw§NÌ(&\177"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill668_44 = local4_life40;
        int __sourceSpill668_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill668_44)).substring(((int)(__sourceSpill668_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill668_49 = local6_life38;
        int __sourceSpill668_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill668_52 = new byte[8];
        (__sourceSpill668_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill668_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill668_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill668_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill668_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill668_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill668_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill668_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill668_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill668_53)).doFinal(((byte[])(__sourceSpill668_52)));
        (__sourceSpill668_49)[__sourceSpill668_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "zsg/G§\007À\b\t^6"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill668_57 = local4_life40;
        int __sourceSpill668_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill668_57)).substring(((int)(__sourceSpill668_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill668_62 = local6_life38;
        int __sourceSpill668_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill668_65 = new byte[8];
        (__sourceSpill668_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill668_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill668_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill668_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill668_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill668_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill668_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill668_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill668_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill668_66)).doFinal(((byte[])(__sourceSpill668_65)));
        (__sourceSpill668_62)[__sourceSpill668_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    h = ((long[])(local6_life38));
    i = ((java.lang.Integer[])(new java.lang.Integer[8]));
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
        byte[] spill3008_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3008_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3008_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3008_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3008_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3008_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6392;
        if (i[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/LI", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            LI.i[n4] = n8;
        }
        return i[n4];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5876_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LI.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(int p0, int p1, int p2, int p3, int p4) {
net.minecraft.client.gui.Gui.a(((int)(p0)), ((int)((p1 - 1))), ((int)(p2)), ((int)(p1)), ((int)(p4)));
    net.minecraft.client.gui.Gui.a(((int)(p0)), ((int)(p3)), ((int)(p2)), ((int)((p3 + 1))), ((int)(p4)));
    net.minecraft.client.gui.Gui.a(((int)((p0 - 1))), ((int)(p1)), ((int)(p0)), ((int)(p3)), ((int)(p4)));
    net.minecraft.client.gui.Gui.a(((int)(p2)), ((int)(p1)), ((int)((p2 + 1))), ((int)(p3)), ((int)(p4)));
    return;
}


public void a(int p0, int p1, java.util.List p2) {
int lexicalValue917_29_0;
    int lexicalValue917_41_0;
    java.lang.String[] lexicalValue917_67_0;
    int lexicalValue917_102_0;
    int lexicalValue917_149_0;
    int lexicalValue917_177_0;
    int spill917_0;
    int spill917_1;
    java.lang.String[] spill917_2;
    int spill917_3;
    boolean spill917_4;
    long life4_3;
    int[] life6_5;
    int life7_41;
    moom.gc life8_59;
    java.awt.Rectangle life9_69;
    java.lang.String[] life10_76;
    int life11_134;
    int life11_173;
    java.lang.String life12_181;
    int life13_187;
    net.minecraft.client.gui.FontRenderer life14_210;
    lexical_join_218: {
    lexical_join_215: {
    lexical_join_209: {
    lexical_join_207: {
    lexical_join_149: {
    lexical_join_128: {
    lexical_join_102: {
    lexical_join_99: {
    lexical_join_67: {
    lexical_join_41: {
    lexical_join_29: {
    life4_3 = (moom.LI.f ^ 107667316974758L);
    life6_5 = moom.LL.b();
    if (!((life6_5 == null))) {
        break lexical_join_215;
    }
    if (!((java.lang.Math.abs(((int)((p0 - this.c)))) <= 5))) {
        break lexical_join_209;
    }
    spill917_0 = java.lang.Math.abs(((int)((p1 - this.d))));
    if (!((life6_5 == null))) {
        lexicalValue917_29_0 = spill917_0;
        break lexical_join_29;
    }
    if (!((spill917_0 <= 5))) {
        break lexical_join_209;
    }
    lexicalValue917_29_0 = __sourceIntrinsic_57f387817a46_invokedynamic917_6(15089, (5220996125318842299L ^ life4_3));
    }
    life7_41 = lexicalValue917_29_0;
    spill917_1 = recovery.source.CarrierOps.lcmp(((long)(java.lang.System.currentTimeMillis())), ((long)((this.e + ((long) life7_41)))));
    if (!((life6_5 == null))) {
        lexicalValue917_41_0 = spill917_1;
        break lexical_join_41;
    }
    if (!((spill917_1 >= 0))) {
        break lexical_join_207;
    }
    lexicalValue917_41_0 = p0;
    }
    life8_59 = moom.hD.a(((int)(lexicalValue917_41_0)), ((int)(p1)), ((java.util.List)(p2)));
    if (!((life8_59 != null))) {
        break lexical_join_207;
    }
    life9_69 = ((moom.LJ)(this.b)).a(((net.minecraft.client.gui.GuiScreen)(this.a)), ((int)(p0)), ((int)(p1)));
    life10_76 = ((moom.LJ)(this.b)).a(((moom.gc)(life8_59)), ((int)(((java.awt.Rectangle)(life9_69)).width)));
    spill917_2 = life10_76;
    if (!((life6_5 == null))) {
        lexicalValue917_67_0 = spill917_2;
        break lexical_join_67;
    }
    if (!((spill917_2 != null))) {
        break lexical_join_207;
    }
    lexicalValue917_67_0 = life10_76;
    }
    spill917_3 = (lexicalValue917_67_0).length;
    if (!((life6_5 == null))) {
        lexicalValue917_102_0 = spill917_3;
        break lexical_join_102;
    }
    if (!((spill917_3 > __sourceIntrinsic_57f387817a46_invokedynamic917_17(21808, (3954145109689788542L ^ life4_3))))) {
        break lexical_join_99;
    }
    life10_76 = ((java.lang.String[])(java.util.Arrays.copyOf(((java.lang.Object[])(life10_76)), ((int)(__sourceIntrinsic_57f387817a46_invokedynamic917_18(28893, (9112312681579367824L ^ life4_3)))))));
    (life10_76)[((life10_76).length - 1)] = __sourceIntrinsic_57f387817a46_invokedynamic917_22((life10_76)[((life10_76).length - 1)], moom.LI.g);
    }
    lexicalValue917_102_0 = ((((moom.LJ)(this.b)).a()) ? 1 : 0);
    }
    if (!((life6_5 == null))) {
        lexicalValue917_149_0 = lexicalValue917_102_0;
        break lexical_join_149;
    }
    if (!((lexicalValue917_102_0 != 0))) {
        break lexical_join_128;
    }
    life11_134 = __sourceIntrinsic_57f387817a46_invokedynamic917_26(14535, (1704856056790386063L ^ life4_3));
    this.a(((int)(((java.awt.Rectangle)(life9_69)).x)), ((int)(((java.awt.Rectangle)(life9_69)).y)), ((int)((((java.awt.Rectangle)(life9_69)).x + ((java.awt.Rectangle)(life9_69)).width))), ((int)((((java.awt.Rectangle)(life9_69)).y + ((java.awt.Rectangle)(life9_69)).height))), ((int)(life11_134)));
    }
    net.minecraft.client.gui.Gui.a(((int)(((java.awt.Rectangle)(life9_69)).x)), ((int)(((java.awt.Rectangle)(life9_69)).y)), ((int)((((java.awt.Rectangle)(life9_69)).x + ((java.awt.Rectangle)(life9_69)).width))), ((int)((((java.awt.Rectangle)(life9_69)).y + ((java.awt.Rectangle)(life9_69)).height))), ((int)(__sourceIntrinsic_57f387817a46_invokedynamic917_40(6419, (1387149546392822874L ^ life4_3)))));
    lexicalValue917_149_0 = 0;
    }
    life11_173 = lexicalValue917_149_0;
    lexical_cycle_150: while (true) {
    lexical_join_178: {
    lexical_join_177: {
    if (!((life11_173 < (life10_76).length))) {
        break lexical_join_207;
    }
    life12_181 = (life10_76)[life11_173];
    life13_187 = __sourceIntrinsic_57f387817a46_invokedynamic917_42(24537, (1298922938667426450L ^ life4_3));
    if (!((life6_5 == null))) {
        break lexical_join_218;
    }
    spill917_4 = ((java.lang.String)(life12_181)).endsWith(((java.lang.String)("!")));
    if (!((life6_5 == null))) {
        lexicalValue917_177_0 = ((spill917_4) ? 1 : 0);
        break lexical_join_177;
    }
    if (!(spill917_4)) {
        break lexical_join_178;
    }
    lexicalValue917_177_0 = __sourceIntrinsic_57f387817a46_invokedynamic917_45(16908, (2352283704365154115L ^ life4_3));
    }
    life13_187 = lexicalValue917_177_0;
    }
    life14_210 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).N;
    ((net.minecraft.client.gui.FontRenderer)(life14_210)).a(((java.lang.String)(life12_181)), ((float)(((float) (((java.awt.Rectangle)(life9_69)).x + 5)))), ((float)(((float) ((((java.awt.Rectangle)(life9_69)).y + 5) + (life11_173 * __sourceIntrinsic_57f387817a46_invokedynamic917_50(30403, (3684174231753739151L ^ life4_3))))))), ((int)(life13_187)));
    life11_173 += 1;
    if (!((life6_5 != null))) { continue lexical_cycle_150; }
    break lexical_cycle_150;
    }
    }
    if (!((life6_5 != null))) {
        break lexical_join_218;
    }
    }
    this.c = ((int)(p0));
    this.d = ((int)(p1));
    }
    this.e = ((long)(java.lang.System.currentTimeMillis()));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5876_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_57f387817a46_invokedynamic917_22(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57f387817a46_invokedynamic917_50(int a0, long a1) throws E;
}
