package com.moon;


public class nN {

private static final net.minecraft.client.Minecraft a;

private float b;

private final java.util.LinkedList<java.lang.Long> c;

private static final long d;

private static final long e;

public nN() {
super();
    this.c = new java.util.LinkedList();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(3236322804597491768L)), ((long)(2076450662082494933L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(159308016987207L)))));
    long local0_life6 = (com.moon.nN.d ^ 105220929247605L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill306_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill306_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill306_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill306_13 = new byte[8];
    (__sourceSpill306_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill306_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation306_15 = __sourceSpill306_13;
    ((javax.crypto.Cipher)(__sourceSpill306_10)).init(((int)(__sourceSpill306_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill306_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation306_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 8024849833877863738L;
    byte[] __sourceSpill306_19 = new byte[8];
    (__sourceSpill306_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill306_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill306_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill306_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill306_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill306_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill306_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill306_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill306_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill306_20)).doFinal(((byte[])(__sourceSpill306_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.LinkedList<java.lang.Long> a__LinkedList() {
return this.c;
}


public float a() {
return this.b;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.client.Minecraft forwardValue1061_14_0;
    net.minecraft.client.Minecraft forwardValue1061_19_0;
    boolean spill1061_0;
    net.minecraft.client.Minecraft spill1061_1;
    long life2_3;
    int life4_7;
    float life5_63;
    forward_join_61: {
    forward_join_19: {
    forward_join_14: {
    life2_3 = (com.moon.nN.d ^ 88115255000110L);
    spill1061_0 = com.moon.aO.b__Boolean();
    ((com.moon.nN)(this)).a__Void();
    life4_7 = ((spill1061_0) ? 1 : 0);
    spill1061_1 = com.moon.nN.a;
    if (!((life4_7 == 0))) {
        forwardValue1061_14_0 = spill1061_1;
        break forward_join_14;
    }
    if (!((((net.minecraft.client.Minecraft)(spill1061_1)).K != null))) {
        break forward_join_61;
    }
    forwardValue1061_14_0 = com.moon.nN.a;
    }
    if (!((life4_7 == 0))) {
        forwardValue1061_19_0 = forwardValue1061_14_0;
        break forward_join_19;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue1061_14_0)).I != null))) {
        break forward_join_61;
    }
    forwardValue1061_19_0 = com.moon.nN.a;
    }
    life5_63 = ((float) java.lang.Math.sqrt(((double)((((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(forwardValue1061_19_0)).K)).n - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).K)).k) * (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).K)).n - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).K)).k)) + ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).K)).p - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).K)).m) * (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).K)).p - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).K)).m)))))));
    this.b = ((float)(((life5_63 * 0x1.4p4f) * ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.nN.a)).l)).c)));
    }
    return;
}


public int a__Int() {
return ((java.util.LinkedList)(this.c)).size();
}


private void a__Void() {
boolean spill295_0;
    long life1_3;
    long life4_6;
    int life3_7;
    lexical_join_28: {
    life1_3 = (com.moon.nN.d ^ 102083876832406L);
    spill295_0 = com.moon.aO.c();
    life4_6 = java.lang.System.currentTimeMillis();
    life3_7 = ((spill295_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    if (!((((java.util.LinkedList)(this.c)).peek() != null))) {
        break lexical_join_28;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(life4_6)), ((long)((((java.lang.Long)(((java.lang.Long)(((java.util.LinkedList)(this.c)).peek())))).longValue() + com.moon.nN.e)))) > 0))) {
        break lexical_join_28;
    }
    ((java.util.LinkedList)(this.c)).poll();
    if (!((life3_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue1062_17_0;
    int spill1062_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (com.moon.nN.d ^ 67720263068969L);
    life4_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1062_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zd) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue1062_17_0 = spill1062_0;
        break forward_join_17;
    }
    if (!((spill1062_0 != 0))) {
        break forward_join_18;
    }
    forwardValue1062_17_0 = ((((java.util.LinkedList)(this.c)).add(((java.lang.Object)(java.lang.Long.valueOf(((long)(java.lang.System.currentTimeMillis()))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1062_17_0);
    }
    return;
}

}
