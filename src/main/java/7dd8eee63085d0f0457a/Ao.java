package moom;


public class Ao implements moom.yK<moom.y2> {

private java.util.Map<moom.BY, java.lang.Integer> a;

private static final long b;

private static final long c;

public Ao() {
super();
}


public Ao(java.util.Map<moom.BY, java.lang.Integer> p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-6023375762874124411L)), ((long)(323032527777436829L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(246105501271079L)))));
    long local0_life6 = (moom.Ao.b ^ 119448044684376L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill477_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill477_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill477_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill477_13 = new byte[8];
    (__sourceSpill477_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill477_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation477_15 = __sourceSpill477_13;
    ((javax.crypto.Cipher)(__sourceSpill477_10)).init(((int)(__sourceSpill477_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill477_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation477_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6591683901468871312L;
    byte[] __sourceSpill477_19 = new byte[8];
    (__sourceSpill477_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill477_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill477_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill477_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill477_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill477_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill477_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill477_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill477_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill477_20)).doFinal(((byte[])(__sourceSpill477_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill487_0;
    long life2_3;
    java.util.Iterator life5_14;
    int[] life4_15;
    java.util.Map.Entry life6_22;
    lexical_join_38: {
    life2_3 = (moom.Ao.b ^ 93854865553671L);
    spill487_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((java.util.Map)(this.a)).size())));
    life5_14 = ((java.util.Set)(((java.util.Map)(this.a)).entrySet())).iterator();
    life4_15 = spill487_0;
    lexical_cycle_16: while (true) {
    if (!(((java.util.Iterator)(life5_14)).hasNext())) {
        break lexical_join_38;
    }
    life6_22 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_14)).next()));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((moom.BY)(((moom.BY)(((java.util.Map.Entry)(life6_22)).getKey())))).a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((java.lang.Integer)(((java.lang.Integer)(((java.util.Map.Entry)(life6_22)).getValue())))).intValue())));
    if (!((life4_15 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ao)(this)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Ao)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public java.util.Map<moom.BY, java.lang.Integer> a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill486_0;
    long life2_3;
    int life5_7;
    int[] life4_11;
    int life6_13;
    moom.BY life7_22;
    int life8_25;
    lexical_join_40: {
    life2_3 = (moom.Ao.b ^ 39074467064462L);
    spill486_0 = moom.zN.b__ArrayInt();
    life5_7 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    this.a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    life4_11 = spill486_0;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_13 < life5_7))) {
        break lexical_join_40;
    }
    life7_22 = net.minecraft.stats.StatList.a(((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.Ao.c)))))));
    life8_25 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    if (!((life4_11 == null))) {
        break lexical_join_38;
    }
    if (!((life7_22 != null))) {
        break lexical_join_37;
    }
    ((java.util.Map)(this.a)).put(((java.lang.Object)(life7_22)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life8_25))))));
    }
    life6_13 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}



}
