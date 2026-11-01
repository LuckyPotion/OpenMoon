package net.minecraft.world;


public class WorldType {

public static final net.minecraft.world.WorldType[] a;

public static final net.minecraft.world.WorldType b;

public static final net.minecraft.world.WorldType c;

public static final net.minecraft.world.WorldType d;

public static final net.minecraft.world.WorldType e;

public static final net.minecraft.world.WorldType f;

public static final net.minecraft.world.WorldType g;

public static final net.minecraft.world.WorldType h;

private final int i;

private final java.lang.String j;

private final int k;

private boolean l;

private boolean m;

private boolean n;

private static final long o;

private WorldType(int p0, java.lang.String p1) {
this(((int)(p0)), ((java.lang.String)(p1)), ((int)(0)));
    return;
}


private WorldType(int p0, java.lang.String p1, int p2) {
super();
    this.j = ((java.lang.String)(p1));
    this.k = ((int)(p2));
    this.l = ((boolean)(true));
    this.i = ((int)(p0));
    (net.minecraft.world.WorldType.a)[p0] = this;
    return;
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(238084283663567568L)), ((long)(-5190429359160465244L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257023578665710L)))));
    long local11_life6 = (net.minecraft.world.WorldType.o ^ 109868319575529L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1214_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1214_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1214_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1214_13 = new byte[8];
    (__sourceSpill1214_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1214_13)[local2_life14] = ((byte) ((int) ((local11_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1214_15 = __sourceSpill1214_13;
    ((javax.crypto.Cipher)(__sourceSpill1214_10)).init(((int)(__sourceSpill1214_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1214_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1214_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[2];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "~R02Þ4Ä3ä¿³a\030ý"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1214_24 = local5_life20;
        int __sourceSpill1214_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill1214_24)).substring(((int)(__sourceSpill1214_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1214_29 = local0_life18;
        int __sourceSpill1214_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill1214_32 = new byte[8];
        (__sourceSpill1214_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill1214_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill1214_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill1214_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill1214_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill1214_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill1214_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill1214_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill1214_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill1214_33)).doFinal(((byte[])(__sourceSpill1214_32)));
        (__sourceSpill1214_29)[__sourceSpill1214_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    a = ((net.minecraft.world.WorldType[])(new net.minecraft.world.WorldType[((int) (local0_life18)[1])]));
    b = ((net.minecraft.world.WorldType)(((net.minecraft.world.WorldType)(new net.minecraft.world.WorldType(0, "default", 1))).a__EL()));
    c = ((net.minecraft.world.WorldType)(new net.minecraft.world.WorldType(1, "flat")));
    d = ((net.minecraft.world.WorldType)(new net.minecraft.world.WorldType(2, "largeBiomes")));
    e = ((net.minecraft.world.WorldType)(((net.minecraft.world.WorldType)(new net.minecraft.world.WorldType(3, "amplified"))).b__EL()));
    f = ((net.minecraft.world.WorldType)(new net.minecraft.world.WorldType(4, "customized")));
    g = ((net.minecraft.world.WorldType)(new net.minecraft.world.WorldType(5, "debug_all_block_states")));
    h = ((net.minecraft.world.WorldType)(((net.minecraft.world.WorldType)(new net.minecraft.world.WorldType(((int) (local0_life18)[0]), "default_1_1", 0))).a(((boolean)(false)))));
}


public int b() {
return this.i;
}


public boolean b__Boolean() {
return ((((this.m) ? 1 : 0)) != 0);
}


private net.minecraft.world.WorldType b__EL() {
this.n = ((boolean)(true));
    return this;
}


public java.lang.String b__String() {
return __sourceIntrinsic_d1398b4921c0_originalDynamicSite2068_1(this.j);
}


public boolean c__Boolean() {
return ((((this.n) ? 1 : 0)) != 0);
}


public java.lang.String c() {
return __sourceIntrinsic_fe670a2392c4_originalDynamicSite2069_1(((net.minecraft.world.WorldType)(this)).b__String());
}


public static net.minecraft.world.WorldType a(java.lang.String p0) {
net.minecraft.world.WorldType lexicalValue1743_32_0;
    java.lang.String spill1743_0;
    net.minecraft.world.WorldType spill1743_1;
    long life1_3;
    net.minecraft.world.WorldType[] life4_5;
    int life5_9;
    int life6_11;
    java.lang.String life3_12;
    net.minecraft.world.WorldType life7_19;
    lexical_join_36: {
    life1_3 = (net.minecraft.world.WorldType.o ^ 112253106964054L);
    life4_5 = net.minecraft.world.WorldType.a;
    spill1743_0 = net.minecraft.world.World.c__String();
    life5_9 = (life4_5).length;
    life6_11 = 0;
    life3_12 = spill1743_0;
    lexical_cycle_13: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life6_11 < life5_9))) {
        break lexical_join_36;
    }
    life7_19 = (life4_5)[life6_11];
    if (!((life3_12 == null))) {
        break lexical_join_34;
    }
    if (!((life7_19 != null))) {
        break lexical_join_33;
    }
    spill1743_1 = life7_19;
    if (!((life3_12 == null))) {
        lexicalValue1743_32_0 = spill1743_1;
        break lexical_join_32;
    }
    if (!(((java.lang.String)(((net.minecraft.world.WorldType)(spill1743_1)).j)).equalsIgnoreCase(((java.lang.String)(p0))))) {
        break lexical_join_33;
    }
    lexicalValue1743_32_0 = life7_19;
    }
    return lexicalValue1743_32_0;
    }
    life6_11 += 1;
    }
    if (!((life3_12 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.j;
}


public int a() {
return this.k;
}


public net.minecraft.world.WorldType a(int p0) {
net.minecraft.world.WorldType forwardValue5801_12_0;
    long life2_3;
    forward_join_12: {
    forward_join_11: {
    life2_3 = (net.minecraft.world.WorldType.o ^ 86786575192894L);
    if (!((this == net.minecraft.world.WorldType.b))) {
        break forward_join_11;
    }
    if (!((p0 == 0))) {
        break forward_join_11;
    }
    forwardValue5801_12_0 = net.minecraft.world.WorldType.h;
    break forward_join_12;
    }
    forwardValue5801_12_0 = this;
    }
    return forwardValue5801_12_0;
}


private net.minecraft.world.WorldType a(boolean p0) {
this.l = ((boolean)(p0));
    return this;
}


public boolean a__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


private net.minecraft.world.WorldType a__EL() {
this.m = ((boolean)(true));
    return this;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1398b4921c0_originalDynamicSite2068_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_originalDynamicSite2069_1(java.lang.String a0) throws E;
}
