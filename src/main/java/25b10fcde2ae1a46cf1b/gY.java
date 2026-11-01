package com.moon;


class gY {

private final long[] a;

private int b;

private static final long c;

private static final long d;

public gY(int p0) {
super();
    this.a = new long[p0];
    this.b = 0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7008059037200241517L)), ((long)(-3842396401682438112L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(20740660555652L)))));
    long local0_life6 = (com.moon.gY.c ^ 22177504478919L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill115_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill115_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill115_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill115_13 = new byte[8];
    (__sourceSpill115_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill115_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation115_15 = __sourceSpill115_13;
    ((javax.crypto.Cipher)(__sourceSpill115_10)).init(((int)(__sourceSpill115_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill115_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation115_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6809799140235932828L;
    byte[] __sourceSpill115_19 = new byte[8];
    (__sourceSpill115_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill115_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill115_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill115_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill115_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill115_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill115_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill115_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill115_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill115_20)).doFinal(((byte[])(__sourceSpill115_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(long p0) {
long[] spill36_0;
    int spill36_1;
    spill36_0 = this.a;
    com.moon.gY __stackOp36_1_0 = this;
    com.moon.gY __stackOp36_3_0 = __stackOp36_1_0;
    int __stackOp36_3_1 = ((com.moon.gY)(__stackOp36_1_0)).b;
    spill36_1 = __stackOp36_3_1;
    ((com.moon.gY)(__stackOp36_3_0)).b = ((int)((__stackOp36_3_1 + 1)));
    (spill36_0)[(spill36_1 % (this.a).length)] = p0;
    com.moon.gY __stackOp36_6_0 = this;
    ((com.moon.gY)(__stackOp36_6_0)).b = ((int)((((com.moon.gY)(__stackOp36_6_0)).b % (this.a).length)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
int lexicalValue53_14_0;
    int spill53_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_17;
    lexical_join_33: {
    lexical_join_14: {
    life1_3 = (com.moon.gY.c ^ 126753581427512L);
    life3_5 = com.moon.gX.b();
    spill53_0 = recovery.source.CarrierOps.lcmp(((long)(this.a())), ((long)(com.moon.gY.d)));
    if (!((life3_5 != null))) {
        lexicalValue53_14_0 = spill53_0;
        break lexical_join_14;
    }
    if (!((spill53_0 > 0))) {
        break lexical_join_33;
    }
    lexicalValue53_14_0 = 0;
    }
    life4_17 = lexicalValue53_14_0;
    lexical_cycle_15: while (true) {
    if (!((life4_17 < (this.a).length))) {
        break lexical_join_33;
    }
    long[] __stackOp53_7_0 = this.a;
    int __stackOp53_7_1 = life4_17;
    (__stackOp53_7_0)[__stackOp53_7_1] = ((long) (((float) (__stackOp53_7_0)[__stackOp53_7_1]) * 0x1.ccccccp-1f));
    life4_17 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


public long a() {
long lexicalValue51_38_0;
    net.minecraft.entity.Entity[] spill51_0;
    long spill51_1;
    long life1_3;
    long life4_5;
    long[] life6_9;
    net.minecraft.entity.Entity[] life3_10;
    int life7_13;
    int life8_15;
    long life9_22;
    lexical_join_38: {
    lexical_join_32: {
    life1_3 = (com.moon.gY.c ^ 12177478808337L);
    life4_5 = 0L;
    spill51_0 = com.moon.gX.b();
    life6_9 = this.a;
    life3_10 = spill51_0;
    life7_13 = (life6_9).length;
    life8_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life8_15 < life7_13))) {
        break lexical_join_32;
    }
    life9_22 = (life6_9)[life8_15];
    spill51_1 = (life4_5 + life9_22);
    if (!((life3_10 != null))) {
        lexicalValue51_38_0 = spill51_1;
        break lexical_join_38;
    }
    life4_5 = spill51_1;
    life8_15 += 1;
    if (!((life3_10 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue51_38_0 = (life4_5 / ((long) (this.a).length));
    }
    return lexicalValue51_38_0;
}


public void a(long p0) {
long[] spill52_0;
    int spill52_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    lexical_join_25: {
    life3_3 = (com.moon.gY.c ^ 62150975502341L);
    life5_5 = com.moon.gX.b();
    lexical_cycle_6: while (true) {
    if (!((this.b < (this.a).length))) {
        break lexical_join_25;
    }
    spill52_0 = this.a;
    com.moon.gY __stackOp52_5_0 = this;
    com.moon.gY __stackOp52_7_0 = __stackOp52_5_0;
    int __stackOp52_7_1 = ((com.moon.gY)(__stackOp52_5_0)).b;
    spill52_1 = __stackOp52_7_1;
    ((com.moon.gY)(__stackOp52_7_0)).b = ((int)((__stackOp52_7_1 + 1)));
    (spill52_0)[spill52_1] = p0;
    if (!((life5_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    return;
}

}
