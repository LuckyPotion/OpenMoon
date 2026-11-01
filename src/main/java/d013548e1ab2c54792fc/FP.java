package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FP extends net.minecraft.world.gen.structure.MapGenStructure {

private static java.util.List<net.minecraft.world.biome.BiomeGenBase> g;

private java.util.List<moom.D7> h;

private int i;

private int j;

private static long k;

private static long[] m;

private static java.lang.Integer[] s;

private static java.util.Map t;

public FP() { super(); }


private static void __sourceConstructorBody_7831afc1a4c8a136(moom.FP receiver) throws Throwable {

long local1 = (moom.FP.k ^ 14766783640942L);

    moom.FP.__sourceConstructorInit_7831afc1a4c8a136_0(((moom.FP)(receiver)));

    ((moom.FP)(receiver)).h = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.FP)(receiver)).i = ((int)(__sourceIntrinsic_7831afc1a4c8a136_originalDynamicSite1507_4(24739, (3695918937376948492L ^ local1))));

    ((moom.FP)(receiver)).j = ((int)(__sourceIntrinsic_7831afc1a4c8a136_originalDynamicSite1507_6(16955, (3848820532862002070L ^ local1))));

    ((java.util.List)(((moom.FP)(receiver)).h)).add(((java.lang.Object)(new moom.D7(moom.ta.class, 1, 1, 1))));

    return;

}



public FP(java.util.Map<java.lang.String, java.lang.String> p0) { this(); }


private static void __sourceConstructorBody_1cdbf8c78091162e(moom.FP receiver, java.util.Map p0) throws Throwable {

init_join_39: {

    long local2_life2 = (moom.FP.k ^ 134001639716343L);

    moom.FP.__sourceConstructorInit_1cdbf8c78091162e_0(((moom.FP)(receiver)));

    net.minecraft.entity.Entity[] __sourceSpill485_7 = moom.G4.b();

    java.util.Iterator local5_life8 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();

    net.minecraft.entity.Entity[] local4_life9 = __sourceSpill485_7;

    init_cycle_12: while (true) {

    init_join_37: {

    if (!(((java.util.Iterator)(local5_life8)).hasNext())) {

        break init_join_39;

    }

    java.util.Map.Entry local6_life13 = ((java.util.Map.Entry)(((java.util.Iterator)(local5_life8)).next()));

    if (!(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("distance"))))) {

        break init_join_37;

    }

    ((moom.FP)(receiver)).i = ((int)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((int)(((moom.FP)(receiver)).i)), ((int)((((moom.FP)(receiver)).j + 1))))));

    }

    if (!((local4_life9 == null))) { continue init_cycle_12; }

    break init_cycle_12;

    }

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(7606344644916802034L)), ((long)(-1527599982648117188L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256431848466798L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FP.k ^ 55081188491011L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill746_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill746_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill746_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill746_14 = new byte[8];
    (__sourceSpill746_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill746_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation746_16 = __sourceSpill746_14;
    ((javax.crypto.Cipher)(__sourceSpill746_11)).init(((int)(__sourceSpill746_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill746_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation746_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Eb°D\031\035òSÃó:\1774\r¹\034]Qé?4léÓ\007@"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill746_25 = local6_life21;
        int __sourceSpill746_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill746_25)).substring(((int)(__sourceSpill746_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill746_30 = local8_life19;
        int __sourceSpill746_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill746_33 = new byte[8];
        (__sourceSpill746_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill746_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill746_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill746_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill746_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill746_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill746_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill746_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill746_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill746_34)).doFinal(((byte[])(__sourceSpill746_33)));
        (__sourceSpill746_30)[__sourceSpill746_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ë»\0062T\001\025û&Ã<XÃt"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill746_38 = local6_life21;
        int __sourceSpill746_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill746_38)).substring(((int)(__sourceSpill746_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill746_43 = local8_life19;
        int __sourceSpill746_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill746_46 = new byte[8];
        (__sourceSpill746_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill746_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill746_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill746_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill746_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill746_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill746_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill746_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill746_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill746_47)).doFinal(((byte[])(__sourceSpill746_46)));
        (__sourceSpill746_43)[__sourceSpill746_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[6]));
    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill746_53 = new net.minecraft.world.biome.BiomeGenBase[5];
    (__sourceSpill746_53)[0] = net.minecraft.world.biome.BiomeGenBase.t;
    (__sourceSpill746_53)[1] = net.minecraft.world.biome.BiomeGenBase.I;
    (__sourceSpill746_53)[2] = net.minecraft.world.biome.BiomeGenBase.M;
    (__sourceSpill746_53)[3] = net.minecraft.world.biome.BiomeGenBase.N;
    (__sourceSpill746_53)[4] = net.minecraft.world.biome.BiomeGenBase.x;
    g = ((java.util.List)(java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill746_53)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_7831afc1a4c8a136_0(moom.FP a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_1cdbf8c78091162e_0(moom.FP a0) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FP.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3B8A;
        if (s[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/FP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FP.s[n2] = n3;
        }
        return s[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4501_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.List<moom.D7> b__sourceReturn_3f0615080b() {
return this.h;
}


public boolean b(moom.DT p0) {
int forwardValue1917_30_0;
    net.minecraft.entity.Entity[] spill1917_0;
    int spill1917_1;
    boolean spill1917_2;
    long life2_3;
    moom.Ir life5_8;
    net.minecraft.entity.Entity[] life4_9;
    moom.G4 life6_34;
    forward_join_30: {
    forward_join_29: {
    life2_3 = (moom.FP.k ^ 65014256961370L);
    spill1917_0 = moom.G4.b();
    life5_8 = ((moom.FP)(this)).a(((moom.DT)(p0)));
    life4_9 = spill1917_0;
    spill1917_1 = ((life5_8 instanceof moom.It) ? 1 : 0);
    if (!((life4_9 != null))) {
        forwardValue1917_30_0 = spill1917_1;
        break forward_join_30;
    }
    if (!((spill1917_1 != 0))) {
        break forward_join_29;
    }
    spill1917_2 = ((java.util.LinkedList)(((moom.Ir)(life5_8)).a)).isEmpty();
    if (!((life4_9 != null))) {
        forwardValue1917_30_0 = ((spill1917_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!((!spill1917_2))) {
        break forward_join_29;
    }
    life6_34 = ((moom.G4)(((java.util.LinkedList)(((moom.Ir)(life5_8)).a)).getFirst()));
    return ((((life6_34 instanceof moom.G8) ? 1 : 0)) != 0);
    }
    forwardValue1917_30_0 = 0;
    }
    return ((forwardValue1917_30_0) != 0);
}


protected boolean a__Boolean(int p0, int p1) {
int lexicalValue645_22_0;
    int lexicalValue645_36_0;
    int lexicalValue645_150_0;
    net.minecraft.entity.Entity[] spill645_0;
    int spill645_1;
    int spill645_2;
    int spill645_3;
    long life3_3;
    int life6_6;
    net.minecraft.entity.Entity[] life5_7;
    int life7_9;
    int life8_42;
    int life9_47;
    java.util.Random life10_58;
    int life8_63;
    int life9_68;
    int life8_78;
    int life9_88;
    net.minecraft.world.biome.BiomeGenBase life11_142;
    java.util.Iterator life12_151;
    net.minecraft.world.biome.BiomeGenBase life13_158;
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_132: {
    lexical_join_36: {
    lexical_join_32: {
    lexical_join_22: {
    lexical_join_21: {
    life3_3 = (moom.FP.k ^ 113571576231099L);
    spill645_0 = moom.G4.b();
    life6_6 = p0;
    life5_7 = spill645_0;
    life7_9 = p1;
    spill645_1 = p0;
    if (!((life5_7 != null))) {
        lexicalValue645_22_0 = spill645_1;
        break lexical_join_22;
    }
    if (!((spill645_1 < 0))) {
        break lexical_join_21;
    }
    p0 = (p0 - (this.i - 1));
    }
    lexicalValue645_22_0 = p1;
    }
    if (!((life5_7 != null))) {
        lexicalValue645_36_0 = lexicalValue645_22_0;
        break lexical_join_36;
    }
    if (!((lexicalValue645_22_0 < 0))) {
        break lexical_join_32;
    }
    p1 = (p1 - (this.i - 1));
    }
    lexicalValue645_36_0 = (p0 / this.i);
    }
    life8_42 = lexicalValue645_36_0;
    life9_47 = (p1 / this.i);
    life10_58 = ((net.minecraft.world.World)(this.c)).a(((int)(life8_42)), ((int)(life9_47)), ((int)(__sourceIntrinsic_c86802429962_invokedynamic645_7(6504, (4290748626794838289L ^ life3_3)))));
    life8_63 = (life8_42 * this.i);
    life9_68 = (life9_47 * this.i);
    life8_78 = (life8_63 + ((java.util.Random)(life10_58)).nextInt(((int)((this.i - this.j)))));
    life9_88 = (life9_68 + ((java.util.Random)(life10_58)).nextInt(((int)((this.i - this.j)))));
    spill645_2 = life6_6;
    if (!((life5_7 != null))) {
        lexicalValue645_150_0 = spill645_2;
        break lexical_join_150;
    }
    if (!((spill645_2 == life8_78))) {
        break lexical_join_149;
    }
    spill645_3 = life7_9;
    if (!((life5_7 != null))) {
        lexicalValue645_150_0 = spill645_3;
        break lexical_join_150;
    }
    if (!((spill645_3 == life9_88))) {
        break lexical_join_149;
    }
    life11_142 = ((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.c)).a__Ff())).a(((moom.DT)(new moom.DT(((life6_6 * __sourceIntrinsic_c86802429962_invokedynamic645_19(9843, (2769946851689448973L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic645_20(15852, (2238229159819730323L ^ life3_3))), 0, ((life7_9 * __sourceIntrinsic_c86802429962_invokedynamic645_21(11353, (1344893016194665506L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic645_22(15852, (2238229159819730323L ^ life3_3)))))));
    if (!((life11_142 == null))) {
        break lexical_join_132;
    }
    return ((0) != 0);
    }
    life12_151 = ((java.util.List)(moom.FP.g)).iterator();
    lexical_cycle_135: while (true) {
    lexical_join_147: {
    if (!(((java.util.Iterator)(life12_151)).hasNext())) {
        break lexical_join_149;
    }
    life13_158 = ((net.minecraft.world.biome.BiomeGenBase)(((java.util.Iterator)(life12_151)).next()));
    if (!((life11_142 == life13_158))) {
        break lexical_join_147;
    }
    return ((1) != 0);
    }
    if (!((life5_7 == null))) { continue lexical_cycle_135; }
    break lexical_cycle_135;
    }
    }
    lexicalValue645_150_0 = 0;
    }
    return ((lexicalValue645_150_0) != 0);
}


public java.lang.String a() {
return "Temple";
}


protected moom.Ir a(int p0, int p1) {
return new moom.It(this.c, this.b, p0, p1);
}


private static native <E extends Throwable> int __sourceIntrinsic_7831afc1a4c8a136_originalDynamicSite1507_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7831afc1a4c8a136_originalDynamicSite1507_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic645_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic645_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic645_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic645_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic645_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4501_0() throws E;
}
