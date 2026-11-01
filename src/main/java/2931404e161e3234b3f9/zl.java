package moom;


public class zl implements moom.yK<moom.y3> {

private moom.DT a;

private net.minecraft.util.IChatComponent[] b;

private static final long c;

private static final long d;

public zl() {
super();
}


public zl(moom.DT p0, net.minecraft.util.IChatComponent[] p1) {
super();
    this.a = ((moom.DT)(p0));
    this.b = ((net.minecraft.util.IChatComponent[])(new net.minecraft.util.IChatComponent[] {(p1)[0], (p1)[1], (p1)[2], (p1)[3]}));
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4113608435027531032L)), ((long)(-1459515420189085559L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12493664819453L)))));
    long local0_life6 = (moom.zl.c ^ 62784893751315L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1146_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1146_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1146_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1146_13 = new byte[8];
    (__sourceSpill1146_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1146_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1146_15 = __sourceSpill1146_13;
    ((javax.crypto.Cipher)(__sourceSpill1146_10)).init(((int)(__sourceSpill1146_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1146_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1146_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3634267905196207518L;
    byte[] __sourceSpill1146_19 = new byte[8];
    (__sourceSpill1146_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1146_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1146_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1146_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1146_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1146_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1146_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1146_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1146_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1146_20)).doFinal(((byte[])(__sourceSpill1146_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
boolean spill1450_0;
    long life2_3;
    int life5_10;
    int life4_11;
    net.minecraft.util.IChatComponent life6_19;
    java.lang.String life7_22;
    lexical_join_30: {
    life2_3 = (moom.zl.c ^ 119669139567070L);
    spill1450_0 = moom.y7.j();
    ((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.a)));
    life5_10 = 0;
    life4_11 = ((spill1450_0) ? 1 : 0);
    lexical_cycle_12: while (true) {
    if (!((life5_10 < 4))) {
        break lexical_join_30;
    }
    life6_19 = (this.b)[life5_10];
    life7_22 = net.minecraft.util.IChatComponent$Serializer.a(((net.minecraft.util.IChatComponent)(life6_19)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(life7_22)));
    life5_10 += 1;
    if (!((life4_11 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}


public net.minecraft.util.IChatComponent[] a__ArrayC5() {
return this.b;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zl)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zl)(this)));
    return;
}


public moom.DT a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
boolean spill1449_0;
    long life2_3;
    int life4_13;
    int life5_15;
    java.lang.String life6_23;
    net.minecraft.util.IChatComponent life7_26;
    lexical_join_35: {
    life2_3 = (moom.zl.c ^ 28601644524119L);
    this.a = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    spill1449_0 = moom.y7.i();
    this.b = ((net.minecraft.util.IChatComponent[])(new net.minecraft.util.IChatComponent[4]));
    life4_13 = ((spill1449_0) ? 1 : 0);
    life5_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life5_15 < 4))) {
        break lexical_join_35;
    }
    life6_23 = ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.zl.d))));
    life7_26 = net.minecraft.util.IChatComponent$Serializer.a(((java.lang.String)(life6_23)));
    (this.b)[life5_15] = life7_26;
    life5_15 += 1;
    if (!((life4_13 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}



}
