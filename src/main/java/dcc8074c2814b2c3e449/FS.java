package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FS extends net.minecraft.world.gen.structure.MapGenStructure {

private int g;

private int h;

public static java.util.List<net.minecraft.world.biome.BiomeGenBase> i;

private static java.util.List<moom.D7> j;

private static long k;

private static long[] m;

private static java.lang.Integer[] s;

private static java.util.Map t;

public FS() { super(); }


private static void __sourceConstructorBody_3ce520f0ee7cf453(moom.FS receiver) throws Throwable {

long local1 = (moom.FS.k ^ 86830325302792L);

    moom.FS.__sourceConstructorInit_3ce520f0ee7cf453_0(((moom.FS)(receiver)));

    ((moom.FS)(receiver)).g = ((int)(__sourceIntrinsic_3ce520f0ee7cf453_originalDynamicSite2019_2(28151, (167845405003223654L ^ local1))));

    ((moom.FS)(receiver)).h = ((int)(__sourceIntrinsic_3ce520f0ee7cf453_originalDynamicSite2019_4(3903, (7383972706715463849L ^ local1))));

    return;

}



public FS(java.util.Map<java.lang.String, java.lang.String> p0) { this(); }


private static void __sourceConstructorBody_d9f9586499bd4b7b(moom.FS receiver, java.util.Map p0) throws Throwable {

boolean __initValue489_43_0;

    long local2_life2;

    net.minecraft.entity.Entity[] local4_life6;

    java.util.Iterator local5_life9;

    java.util.Map.Entry local6_life13;

    init_join_55: {

    local2_life2 = (moom.FS.k ^ 13149021374805L);

    net.minecraft.entity.Entity[] __sourceSpill489_4 = moom.G4.b();

    moom.FS.__sourceConstructorInit_d9f9586499bd4b7b_0(((moom.FS)(receiver)));

    local4_life6 = __sourceSpill489_4;

    local5_life9 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();

    init_cycle_12: while (true) {

    init_join_53: {

    init_join_43: {

    init_join_38: {

    if (!(((java.util.Iterator)(local5_life9)).hasNext())) {

        break init_join_55;

    }

    local6_life13 = ((java.util.Map.Entry)(((java.util.Iterator)(local5_life9)).next()));

    boolean __sourceSpill489_17 = ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("spacing")));

    if (!((local4_life6 != null))) {

        __initValue489_43_0 = __sourceSpill489_17;

        break init_join_43;

    }

    if (!(__sourceSpill489_17)) {

        break init_join_38;

    }

    ((moom.FS)(receiver)).g = ((int)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((int)(((moom.FS)(receiver)).g)), ((int)(1)))));

    if (!((local4_life6 == null))) {

        break init_join_53;

    }

    }

    __initValue489_43_0 = ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("separation")));

    }

    if (!(__initValue489_43_0)) {

        break init_join_53;

    }

    ((moom.FS)(receiver)).h = ((int)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((int)(((moom.FS)(receiver)).h)), ((int)(1)))));

    }

    if (!((local4_life6 == null))) { continue init_cycle_12; }

    break init_cycle_12;

    }

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(1256269037106489876L)), ((long)(-7192435173814831647L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(218740525715066L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FS.k ^ 125841293532265L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill749_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill749_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill749_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill749_14 = new byte[8];
    (__sourceSpill749_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill749_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation749_16 = __sourceSpill749_14;
    ((javax.crypto.Cipher)(__sourceSpill749_11)).init(((int)(__sourceSpill749_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill749_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation749_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¹·\001¬¾Ñý¦êaôH;Ûþ-W½Ìº«¡\f¶ÏÍ>¥p«6Í?-¢\003vÀ\005\032UÏö:ë\024"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill749_25 = local6_life21;
        int __sourceSpill749_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill749_25)).substring(((int)(__sourceSpill749_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill749_30 = local8_life19;
        int __sourceSpill749_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill749_33 = new byte[8];
        (__sourceSpill749_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill749_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill749_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill749_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill749_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill749_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill749_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill749_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill749_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill749_34)).doFinal(((byte[])(__sourceSpill749_33)));
        (__sourceSpill749_30)[__sourceSpill749_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ªOVq},2[¾ÿ¾oµ\r"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill749_38 = local6_life21;
        int __sourceSpill749_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill749_38)).substring(((int)(__sourceSpill749_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill749_43 = local8_life19;
        int __sourceSpill749_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill749_46 = new byte[8];
        (__sourceSpill749_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill749_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill749_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill749_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill749_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill749_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill749_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill749_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill749_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill749_47)).doFinal(((byte[])(__sourceSpill749_46)));
        (__sourceSpill749_43)[__sourceSpill749_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[9]));
    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill749_53 = new net.minecraft.world.biome.BiomeGenBase[5];
    (__sourceSpill749_53)[0] = net.minecraft.world.biome.BiomeGenBase.r;
    (__sourceSpill749_53)[1] = net.minecraft.world.biome.BiomeGenBase.P;
    (__sourceSpill749_53)[2] = net.minecraft.world.biome.BiomeGenBase.y;
    (__sourceSpill749_53)[3] = net.minecraft.world.biome.BiomeGenBase.B;
    (__sourceSpill749_53)[4] = net.minecraft.world.biome.BiomeGenBase.C;
    i = ((java.util.List)(java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill749_53)))));
    j = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((java.util.List)(moom.FS.j)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityGuardian.class, 1, 2, 4))));
}

private static native <E extends Throwable> void __sourceConstructorInit_3ce520f0ee7cf453_0(moom.FS a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_d9f9586499bd4b7b_0(moom.FS a0) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FS.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6C16;
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
                throw new RuntimeException("moom/FS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FS.s[n2] = n3;
        }
        return s[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4510_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.List<moom.D7> b__sourceReturn_3f0615080b() {
return moom.FS.j;
}


public java.lang.String a() {
return "Monument";
}


protected boolean a__Boolean(int p0, int p1) {
int forwardValue1922_22_0;
    int forwardValue1922_36_0;
    net.minecraft.world.biome.WorldChunkManager forwardValue1922_161_0;
    int forwardValue1922_196_0;
    net.minecraft.entity.Entity[] spill1922_0;
    int spill1922_1;
    int spill1922_2;
    int spill1922_3;
    net.minecraft.world.biome.WorldChunkManager spill1922_4;
    long life3_3;
    int life6_5;
    int life7_8;
    net.minecraft.entity.Entity[] life5_9;
    int life8_42;
    int life9_47;
    java.util.Random life10_58;
    int life8_63;
    int life9_68;
    int life8_88;
    int life9_108;
    forward_join_196: {
    forward_join_195: {
    forward_join_161: {
    forward_join_158: {
    forward_join_36: {
    forward_join_32: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (moom.FS.k ^ 115751791513208L);
    life6_5 = p0;
    spill1922_0 = moom.G4.b();
    life7_8 = p1;
    life5_9 = spill1922_0;
    spill1922_1 = p0;
    if (!((life5_9 != null))) {
        forwardValue1922_22_0 = spill1922_1;
        break forward_join_22;
    }
    if (!((spill1922_1 < 0))) {
        break forward_join_21;
    }
    p0 = (p0 - (this.g - 1));
    }
    forwardValue1922_22_0 = p1;
    }
    if (!((life5_9 != null))) {
        forwardValue1922_36_0 = forwardValue1922_22_0;
        break forward_join_36;
    }
    if (!((forwardValue1922_22_0 < 0))) {
        break forward_join_32;
    }
    p1 = (p1 - (this.g - 1));
    }
    forwardValue1922_36_0 = (p0 / this.g);
    }
    life8_42 = forwardValue1922_36_0;
    life9_47 = (p1 / this.g);
    life10_58 = ((net.minecraft.world.World)(this.c)).a(((int)(life8_42)), ((int)(life9_47)), ((int)(__sourceIntrinsic_c86802429962_invokedynamic1922_7(13400, (5582220225967293371L ^ life3_3)))));
    life8_63 = (life8_42 * this.g);
    life9_68 = (life9_47 * this.g);
    life8_88 = (life8_63 + ((((java.util.Random)(life10_58)).nextInt(((int)((this.g - this.h)))) + ((java.util.Random)(life10_58)).nextInt(((int)((this.g - this.h))))) / 2));
    life9_108 = (life9_68 + ((((java.util.Random)(life10_58)).nextInt(((int)((this.g - this.h)))) + ((java.util.Random)(life10_58)).nextInt(((int)((this.g - this.h))))) / 2));
    spill1922_2 = life6_5;
    if (!((life5_9 != null))) {
        forwardValue1922_196_0 = spill1922_2;
        break forward_join_196;
    }
    if (!((spill1922_2 == life8_88))) {
        break forward_join_195;
    }
    spill1922_3 = life7_8;
    if (!((life5_9 != null))) {
        forwardValue1922_196_0 = spill1922_3;
        break forward_join_196;
    }
    if (!((spill1922_3 == life9_108))) {
        break forward_join_195;
    }
    spill1922_4 = ((net.minecraft.world.World)(this.c)).a__Ff();
    if (!((life5_9 != null))) {
        forwardValue1922_161_0 = spill1922_4;
        break forward_join_161;
    }
    if (!((((net.minecraft.world.biome.WorldChunkManager)(spill1922_4)).a(((moom.DT)(new moom.DT(((life6_5 * __sourceIntrinsic_c86802429962_invokedynamic1922_25(17709, (624831588310184650L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic1922_26(10730, (6561466285969874446L ^ life3_3))), __sourceIntrinsic_c86802429962_invokedynamic1922_27(24648, (4742390727457200045L ^ life3_3)), ((life7_8 * __sourceIntrinsic_c86802429962_invokedynamic1922_28(961, (5860305986889659425L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic1922_29(23257, (1658958912102296891L ^ life3_3)))))), ((net.minecraft.world.biome.BiomeGenBase)(null))) != net.minecraft.world.biome.BiomeGenBase.P))) {
        break forward_join_158;
    }
    return ((0) != 0);
    }
    forwardValue1922_161_0 = ((net.minecraft.world.World)(this.c)).a__Ff();
    }
    return ((net.minecraft.world.biome.WorldChunkManager)(forwardValue1922_161_0)).a(((int)(((life6_5 * __sourceIntrinsic_c86802429962_invokedynamic1922_35(961, (5860305986889659425L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic1922_36(23257, (1658958912102296891L ^ life3_3))))), ((int)(((life7_8 * __sourceIntrinsic_c86802429962_invokedynamic1922_37(961, (5860305986889659425L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic1922_38(23257, (1658958912102296891L ^ life3_3))))), ((int)(__sourceIntrinsic_c86802429962_invokedynamic1922_39(27487, (188557418771078320L ^ life3_3)))), ((java.util.List)(moom.FS.i)));
    }
    forwardValue1922_196_0 = 0;
    }
    return ((forwardValue1922_196_0) != 0);
}


protected moom.Ir a(int p0, int p1) {
return new moom.Ix(this.c, this.b, p0, p1);
}


private static native <E extends Throwable> int __sourceIntrinsic_3ce520f0ee7cf453_originalDynamicSite2019_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3ce520f0ee7cf453_originalDynamicSite2019_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1922_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4510_0() throws E;
}
