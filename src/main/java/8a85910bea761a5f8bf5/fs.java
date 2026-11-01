package com.moon;


public class fs extends com.moon.e2<com.moon.module.impl.Flight> {

private final java.util.LinkedList<moom.DN<moom.yK<?>, java.lang.Long>> e;

private com.moon.n5 f;

private static final long g;

private static final long h;

public fs() {
super(com.moon.module.impl.Flight.class);
    this.e = new java.util.LinkedList();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(6687740808243303764L)), ((long)(-4627661542670788904L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155356176636813L)))));
    long local0_life6 = (com.moon.fs.g ^ 78757791171393L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill99_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill99_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill99_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill99_13 = new byte[8];
    (__sourceSpill99_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill99_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation99_15 = __sourceSpill99_13;
    ((javax.crypto.Cipher)(__sourceSpill99_10)).init(((int)(__sourceSpill99_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill99_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation99_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5407196550113354685L;
    byte[] __sourceSpill99_19 = new byte[8];
    (__sourceSpill99_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill99_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill99_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill99_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill99_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill99_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill99_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill99_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill99_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill99_20)).doFinal(((byte[])(__sourceSpill99_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
((com.moon.fs)(this)).a(((long)(0L)));
    return;
}


public void c() {
((com.moon.fs)(this)).a(((long)(0L)));
    this.f = ((com.moon.n5)(null));
    return;
}


public void a(com.moon.event.MotionEvent p0) {
return;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.client.Minecraft forwardValue185_36_0;
    net.minecraft.client.Minecraft spill185_0;
    long life2_3;
    java.lang.String[] life4_5;
    moom.zL life5_31;
    forward_join_38: {
    forward_join_36: {
    forward_join_11: {
    life2_3 = (com.moon.fs.g ^ 39894613374848L);
    life4_5 = moom.Dr.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() != com.moon.event.MovePhase.PRE))) {
        break forward_join_11;
    }
    return;
    }
    if (!((this.f != null))) {
        break forward_join_38;
    }
    life5_31 = new moom.zL(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fs.a)).K)).e__Int(), ((com.moon.n5)(this.f)).e(), ((com.moon.n5)(this.f)).f(), ((com.moon.n5)(this.f)).g());
    spill185_0 = com.moon.fs.a;
    if (!((life4_5 != null))) {
        forwardValue185_36_0 = spill185_0;
        break forward_join_36;
    }
    if (!((((net.minecraft.client.Minecraft)(spill185_0)).a__jS() != null))) {
        break forward_join_38;
    }
    forwardValue185_36_0 = com.moon.fs.a;
    }
    ((net.minecraft.client.Minecraft)(forwardValue185_36_0)).a(((moom.yK)(life5_31)));
    }
    return;
}


public void a(com.moon.eQ p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue184_23_0;
    int forwardValue184_31_0;
    net.minecraft.client.entity.EntityPlayerSP spill184_0;
    int spill184_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_36: {
    forward_join_32: {
    forward_join_31: {
    forward_join_23: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (com.moon.fs.g ^ 51335518623063L);
    life4_5 = moom.Dr.b();
    if (!((((com.moon.eQ)(p0)).a() != com.moon.a1.PRE))) {
        break forward_join_11;
    }
    return;
    }
    if (!(((java.util.LinkedList)(this.e)).isEmpty())) {
        break forward_join_16;
    }
    return;
    }
    spill184_0 = ((net.minecraft.client.Minecraft)(com.moon.fs.a)).K;
    if (!((life4_5 != null))) {
        forwardValue184_23_0 = spill184_0;
        break forward_join_23;
    }
    if (!((spill184_0 != null))) {
        break forward_join_32;
    }
    forwardValue184_23_0 = ((net.minecraft.client.Minecraft)(com.moon.fs.a)).K;
    }
    spill184_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue184_23_0)).S;
    if (!((life4_5 != null))) {
        forwardValue184_31_0 = spill184_1;
        break forward_join_31;
    }
    if (!((spill184_1 > 1))) {
        break forward_join_32;
    }
    forwardValue184_31_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fs.a)).K)).F) ? 1 : 0);
    }
    if (!((forwardValue184_31_0 != 0))) {
        break forward_join_36;
    }
    }
    ((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.fs)(this)).a())))).toggle();
    }
    ((com.moon.fs)(this)).a(((long)(com.moon.fs.h)));
    return;
}


private void a(long p0) {
java.lang.Object lexicalValue35_43_0;
    java.lang.String[] spill35_0;
    net.minecraft.client.network.NetHandlerPlayClient spill35_1;
    long life3_3;
    long life6_6;
    java.lang.String[] life5_7;
    moom.DN life8_13;
    moom.yK life9_18;
    long life10_23;
    lexical_join_46: {
    life3_3 = (com.moon.fs.g ^ 94501090795389L);
    spill35_0 = moom.Dr.b();
    life6_6 = java.lang.System.currentTimeMillis();
    life5_7 = spill35_0;
    lexical_cycle_8: while (true) {
    lexical_join_43: {
    lexical_join_40: {
    lexical_join_32: {
    if (!(((life8_13 = ((moom.DN)(((java.util.LinkedList)(this.e)).peek()))) != null))) {
        break lexical_join_46;
    }
    life9_18 = ((moom.yK)(((moom.DN)(life8_13)).a()));
    life10_23 = ((java.lang.Long)(((java.lang.Long)(((moom.DN)(life8_13)).b())))).longValue();
    if (!((recovery.source.CarrierOps.lcmp(((long)((life6_6 - life10_23))), ((long)(p0))) < 0))) {
        break lexical_join_32;
    }
    if (!((life5_7 == null))) {
        break lexical_join_46;
    }
    }
    spill35_1 = ((net.minecraft.client.Minecraft)(com.moon.fs.a)).a__jS();
    if (!((life5_7 != null))) {
        lexicalValue35_43_0 = spill35_1;
        break lexical_join_43;
    }
    if (!((spill35_1 != null))) {
        break lexical_join_40;
    }
    ((net.minecraft.client.Minecraft)(com.moon.fs.a)).a(((moom.yK)(life9_18)));
    }
    lexicalValue35_43_0 = ((java.util.LinkedList)(this.e)).poll();
    }
    recovery.source.CarrierOps.discard(lexicalValue35_43_0);
    if (!((life5_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forestValue32_66_0;
    int spill32_0;
    int spill32_1;
    int spill32_2;
    long life2_3;
    java.lang.String[] life4_5;
    moom.yK life6_15;
    moom.zL life5_24;
    com.moon.n5 life6_52;
    double life7_55;
    moom.yK life5_74;
    long life6_76;
    moom.DN life8_83;
    forest_join_68: {
    forest_join_67: {
    forest_join_66: {
    forest_join_63: {
    forest_join_10: {
    life2_3 = (com.moon.fs.g ^ 119765818257739L);
    life4_5 = moom.Dr.b();
    if (!(((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a())) {
        break forest_join_10;
    }
    return;
    }
    if (!((this.f == null))) {
        break forest_join_68;
    }
    life6_15 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill32_0 = ((life6_15 instanceof moom.zL) ? 1 : 0);
    if (!((life4_5 != null))) {
        forestValue32_66_0 = spill32_0;
        break forest_join_66;
    }
    if (!((spill32_0 != 0))) {
        break forest_join_63;
    }
    life5_24 = ((moom.zL)(life6_15));
    spill32_1 = ((moom.zL)(life5_24)).a();
    if (!((life4_5 != null))) {
        forestValue32_66_0 = spill32_1;
        break forest_join_66;
    }
    if (!((spill32_1 == ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fs.a)).K)).e__Int()))) {
        break forest_join_63;
    }
    life6_52 = new com.moon.n5((((double) ((moom.zL)(life5_24)).b()) / 0x1.f4p12d), (((double) ((moom.zL)(life5_24)).c()) / 0x1.f4p12d), (((double) ((moom.zL)(life5_24)).d()) / 0x1.f4p12d));
    life7_55 = ((com.moon.n5)(life6_52)).a();
    spill32_2 = recovery.source.CarrierOps.dcmpl(((double)(life7_55)), ((double)(0x1.999999999999ap-5d)));
    if (!((life4_5 != null))) {
        forestValue32_66_0 = spill32_2;
        break forest_join_66;
    }
    if (!((spill32_2 > 0))) {
        break forest_join_63;
    }
    this.f = ((com.moon.n5)(life6_52));
    }
    forestValue32_66_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.Aj) ? 1 : 0);
    }
    if (!((forestValue32_66_0 != 0))) {
        break forest_join_67;
    }
    }
    return;
    }
    life5_74 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    life6_76 = java.lang.System.currentTimeMillis();
    life8_83 = new moom.DN(life5_74, java.lang.Long.valueOf(((long)(life6_76))));
    ((java.util.LinkedList)(this.e)).add(((java.lang.Object)(life8_83)));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    return;
}


public void a(com.moon.dW p0) {
long local2 = (com.moon.fs.g ^ 54200219806578L);
    if ((__sourceIntrinsic_booleanComparison(((com.moon.dW)(p0)).b__sourceReturn_aae029aa0a()) != 0)) {
        return;
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
