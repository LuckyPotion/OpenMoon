package moom;


public class jH implements moom.Fn {

private static final org.apache.logging.log4j.Logger a;

private final net.minecraft.world.chunk.Chunk b;

public moom.Do<net.minecraft.world.chunk.Chunk> c;

private final java.util.List<net.minecraft.world.chunk.Chunk> d;

private final net.minecraft.world.World e;

private static final long f;

private static final long[] g;

private static final java.lang.Long[] h;

private static final java.util.Map i;

public jH(net.minecraft.world.World p0) {
super();
    this.c = new moom.Do();
    this.d = com.google.common.collect.Lists.newArrayList();
    this.b = new moom.Fl(p0, 0, 0);
    this.e = p0;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-6795843531615930967L)), ((long)(7774880179175746764L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(198203201753570L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jH.f ^ 67410325117721L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill891_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill891_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill891_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill891_14 = new byte[8];
    (__sourceSpill891_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill891_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation891_16 = __sourceSpill891_14;
    ((javax.crypto.Cipher)(__sourceSpill891_11)).init(((int)(__sourceSpill891_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill891_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation891_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "eA+\006;;ÙÇ)Ô·6\005ý[\n"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill891_25 = local6_life21;
        int __sourceSpill891_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill891_25)).substring(((int)(__sourceSpill891_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill891_30 = local8_life19;
        int __sourceSpill891_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill891_33 = new byte[8];
        (__sourceSpill891_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill891_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill891_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill891_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill891_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill891_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill891_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill891_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill891_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill891_34)).doFinal(((byte[])(__sourceSpill891_33)));
        (__sourceSpill891_30)[__sourceSpill891_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public boolean b__Boolean() {
return ((0) != 0);
}


public net.minecraft.world.chunk.Chunk b(int p0, int p1) {
net.minecraft.world.chunk.Chunk local3 = new net.minecraft.world.chunk.Chunk(this.e, p0, p1);
    ((moom.Do)(this.c)).a(((long)(moom.Ee.a(((int)(p0)), ((int)(p1))))), ((java.lang.Object)(local3)));
    ((java.util.List)(this.d)).add(((java.lang.Object)(local3)));
    ((net.minecraft.world.chunk.Chunk)(local3)).c(((boolean)(true)));
    return local3;
}


public void a(net.minecraft.world.chunk.Chunk p0, int p1, int p2) {
return;
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) {
return null;
}


public int a() {
return ((java.util.List)(this.d)).size();
}


public moom.DT a(net.minecraft.world.World p0, java.lang.String p1, moom.DT p2) {
return null;
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.jH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long a(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29681);
    if (((moom.jH.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.jH.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.jH.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.jH.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/jH", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.jH.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.jH.h)[life3_8])).longValue();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8111_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.world.chunk.Chunk a(moom.DT p0) {
return this.a(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


public void a__Void() {
return;
}


public boolean a(boolean p0, net.minecraft.util.IProgressUpdate p1) {
return ((1) != 0);
}


public net.minecraft.world.chunk.Chunk a(int p0, int p1) {
net.minecraft.world.chunk.Chunk forwardValue3660_20_0;
    net.minecraft.world.chunk.Chunk forwardValue3660_22_0;
    net.minecraft.entity.Entity[] spill3660_0;
    net.minecraft.world.chunk.Chunk spill3660_1;
    long life3_3;
    net.minecraft.world.chunk.Chunk life6_12;
    net.minecraft.entity.Entity[] life5_13;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.jH.f ^ 79575604971466L);
    spill3660_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    life6_12 = ((net.minecraft.world.chunk.Chunk)(((moom.Do)(this.c)).a__Object(((long)(moom.Ee.a(((int)(p0)), ((int)(p1))))))));
    life5_13 = spill3660_0;
    spill3660_1 = life6_12;
    if (!((life5_13 == null))) {
        forwardValue3660_20_0 = spill3660_1;
        break forward_join_20;
    }
    if (!((spill3660_1 == null))) {
        break forward_join_21;
    }
    forwardValue3660_20_0 = this.b;
    }
    forwardValue3660_22_0 = forwardValue3660_20_0;
    break forward_join_22;
    }
    forwardValue3660_22_0 = life6_12;
    }
    return forwardValue3660_22_0;
}


public void a__Void(int p0, int p1) {
int forwardValue3662_29_0;
    net.minecraft.entity.Entity[] spill3662_0;
    boolean spill3662_1;
    long life3_3;
    net.minecraft.world.chunk.Chunk life6_9;
    net.minecraft.entity.Entity[] life5_10;
    forward_join_29: {
    forward_join_18: {
    life3_3 = (moom.jH.f ^ 112566793291226L);
    spill3662_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    life6_9 = this.a(((int)(p0)), ((int)(p1)));
    life5_10 = spill3662_0;
    spill3662_1 = ((net.minecraft.world.chunk.Chunk)(life6_9)).a__Boolean();
    if (!((life5_10 == null))) {
        forwardValue3662_29_0 = ((spill3662_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill3662_1))) {
        break forward_join_18;
    }
    ((net.minecraft.world.chunk.Chunk)(life6_9)).d();
    }
    ((moom.Do)(this.c)).b(((long)(moom.Ee.a(((int)(p0)), ((int)(p1))))));
    forwardValue3662_29_0 = ((((java.util.List)(this.d)).remove(((java.lang.Object)(life6_9)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3662_29_0);
    return;
}


public boolean a__Boolean(int p0, int p1) {
return ((1) != 0);
}


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite1529_4(((moom.Do)(this.c)).a__Int(), ((java.util.List)(this.d)).size());
}


public boolean a(moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) {
return ((0) != 0);
}


public void a(moom.Fn p0, int p1, int p2) {
return;
}


public boolean a__Boolean() {
net.minecraft.world.chunk.Chunk lexicalValue1214_35_0;
    int lexicalValue1214_35_1;
    net.minecraft.world.chunk.Chunk lexicalValue1214_36_0;
    net.minecraft.world.chunk.Chunk lexicalValue1214_37_0;
    int lexicalValue1214_37_1;
    int lexicalValue1214_65_0;
    net.minecraft.entity.Entity[] spill1214_0;
    net.minecraft.world.chunk.Chunk spill1214_1;
    int spill1214_2;
    int spill1214_3;
    long life1_3;
    long life4_6;
    net.minecraft.entity.Entity[] life3_7;
    java.util.Iterator life6_11;
    net.minecraft.world.chunk.Chunk life7_18;
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_40: {
    life1_3 = (moom.jH.f ^ 55818398630885L);
    spill1214_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    life4_6 = java.lang.System.currentTimeMillis();
    life3_7 = spill1214_0;
    life6_11 = ((java.util.List)(this.d)).iterator();
    lexical_cycle_12: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_35: {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_40;
    }
    life7_18 = ((net.minecraft.world.chunk.Chunk)(((java.util.Iterator)(life6_11)).next()));
    if (!((life3_7 == null))) {
        break lexical_join_64;
    }
    spill1214_1 = life7_18;
    spill1214_2 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - life4_6))), ((long)(__sourceIntrinsic_1a14968dced5_invokedynamic1214_9(55, (8175267247121713833L ^ life1_3)))));
    if (!((life3_7 == null))) {
        lexicalValue1214_35_0 = spill1214_1;
        lexicalValue1214_35_1 = spill1214_2;
        break lexical_join_35;
    }
    if (!((spill1214_2 > 0))) {
        lexicalValue1214_36_0 = spill1214_1;
        break lexical_join_36;
    }
    lexicalValue1214_35_0 = spill1214_1;
    lexicalValue1214_35_1 = 1;
    }
    lexicalValue1214_37_0 = lexicalValue1214_35_0;
    lexicalValue1214_37_1 = lexicalValue1214_35_1;
    break lexical_join_37;
    }
    lexicalValue1214_37_0 = lexicalValue1214_36_0;
    lexicalValue1214_37_1 = 0;
    }
    ((net.minecraft.world.chunk.Chunk)(lexicalValue1214_37_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1214_37_1))));
    if (!((life3_7 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    spill1214_3 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - life4_6))), ((long)(__sourceIntrinsic_1a14968dced5_invokedynamic1214_13(12188, (6504921337212265731L ^ life1_3)))));
    if (!((life3_7 == null))) {
        lexicalValue1214_65_0 = spill1214_3;
        break lexical_join_65;
    }
    if (!((spill1214_3 > 0))) {
        break lexical_join_64;
    }
    ((org.apache.logging.log4j.Logger)(moom.jH.a)).info(((java.lang.String)("Warning: Clientside chunk ticking took {} ms")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Long.valueOf(((long)((java.lang.System.currentTimeMillis() - life4_6))))})));
    }
    lexicalValue1214_65_0 = 0;
    }
    return ((lexicalValue1214_65_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8111_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1529_4(int a0, int a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_1a14968dced5_invokedynamic1214_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_1a14968dced5_invokedynamic1214_13(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
