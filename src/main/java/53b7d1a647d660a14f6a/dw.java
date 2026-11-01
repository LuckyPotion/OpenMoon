package moom;


public class dw extends moom.du {

private static final long R;

private static final long S;

public dw() {
super();
}


static {
javax.crypto.Cipher forestValue445_31_0;
    int forestValue445_31_1;
    javax.crypto.SecretKeyFactory forestValue445_31_2;
    byte[] forestValue445_31_3;
    javax.crypto.Cipher forestValue445_48_0;
    int forestValue445_48_1;
    javax.crypto.SecretKeyFactory forestValue445_48_2;
    byte[] forestValue445_48_3;
    javax.crypto.Cipher spill445_0;
    int spill445_1;
    javax.crypto.SecretKeyFactory spill445_2;
    byte[] spill445_3;
    byte[] spill445_4;
    int spill445_5;
    long spill445_6;
    byte[] spill445_7;
    byte[] spill445_8;
    byte[] spill445_9;
    byte[] spill445_10;
    byte[] spill445_11;
    byte[] spill445_12;
    byte[] spill445_13;
    byte[] spill445_14;
    long spill445_15;
    int spill445_16;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    long life4_64;
    byte[] life6_132;
    forest_join_48: {
    R = ((long)(((moom._a)(moom._c.a(((long)(-4570855932711848341L)), ((long)(-4298838917303454315L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(8100312641334L)))));
    life0_11 = (moom.dw.R ^ 45809260006544L);
    spill445_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill445_1 = 2;
    spill445_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp445_8_0 = new byte[8];
    spill445_3 = __stackOp445_8_0;
    (__stackOp445_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue445_31_0 = spill445_0;
    forestValue445_31_1 = spill445_1;
    forestValue445_31_2 = spill445_2;
    forestValue445_31_3 = spill445_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue445_48_0 = forestValue445_31_0;
        forestValue445_48_1 = forestValue445_31_1;
        forestValue445_48_2 = forestValue445_31_2;
        forestValue445_48_3 = forestValue445_31_3;
        break forest_join_48;
    }
    byte[] __stackOp445_9_0 = forestValue445_31_3;
    spill445_4 = __stackOp445_9_0;
    (__stackOp445_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue445_31_3 = spill445_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue445_48_0)).init(((int)(forestValue445_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue445_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue445_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp445_12_0 = 8916564804448756240L;
    int __stackOp445_12_1 = -1;
    spill445_5 = __stackOp445_12_1;
    spill445_6 = __stackOp445_12_0;
    recovery.source.CarrierOps.discard(__stackOp445_12_1);
    life4_64 = spill445_6;
    byte[] __stackOp445_14_0 = new byte[8];
    spill445_7 = __stackOp445_14_0;
    (__stackOp445_14_0)[0] = ((byte) ((int) (life4_64 >>> 56)));
    byte[] __stackOp445_15_0 = spill445_7;
    spill445_8 = __stackOp445_15_0;
    (__stackOp445_15_0)[1] = ((byte) ((int) (life4_64 >>> 48)));
    byte[] __stackOp445_16_0 = spill445_8;
    spill445_9 = __stackOp445_16_0;
    (__stackOp445_16_0)[2] = ((byte) ((int) (life4_64 >>> 40)));
    byte[] __stackOp445_17_0 = spill445_9;
    spill445_10 = __stackOp445_17_0;
    (__stackOp445_17_0)[3] = ((byte) ((int) (life4_64 >>> 32)));
    byte[] __stackOp445_18_0 = spill445_10;
    spill445_11 = __stackOp445_18_0;
    (__stackOp445_18_0)[4] = ((byte) ((int) (life4_64 >>> 24)));
    byte[] __stackOp445_19_0 = spill445_11;
    spill445_12 = __stackOp445_19_0;
    (__stackOp445_19_0)[5] = ((byte) ((int) (life4_64 >>> 16)));
    byte[] __stackOp445_20_0 = spill445_12;
    spill445_13 = __stackOp445_20_0;
    (__stackOp445_20_0)[6] = ((byte) ((int) (life4_64 >>> 8)));
    byte[] __stackOp445_21_0 = spill445_13;
    spill445_14 = __stackOp445_21_0;
    (__stackOp445_21_0)[7] = ((byte) ((int) life4_64));
    byte[] __stackOp445_22_0 = spill445_14;
    javax.crypto.Cipher __stackOp445_22_1 = life2_15;
    life6_132 = ((javax.crypto.Cipher)(__stackOp445_22_1)).doFinal(((byte[])(__stackOp445_22_0)));
    int __stackOp445_24_0 = spill445_5;
    long __stackOp445_24_1 = (((((((((((long) (life6_132)[0]) & 255L) << 56) | ((((long) (life6_132)[1]) & 255L) << 48)) | ((((long) (life6_132)[2]) & 255L) << 40)) | ((((long) (life6_132)[3]) & 255L) << 32)) | ((((long) (life6_132)[4]) & 255L) << 24)) | ((((long) (life6_132)[5]) & 255L) << 16)) | ((((long) (life6_132)[6]) & 255L) << 8)) | (((long) (life6_132)[7]) & 255L));
    spill445_15 = __stackOp445_24_1;
    spill445_16 = __stackOp445_24_0;
    recovery.source.CarrierOps.discard(__stackOp445_24_1);
    recovery.source.CarrierOps.discard(spill445_16);
    S = ((long)(spill445_15));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
int forwardValue333_21_0;
    net.minecraft.item.Item forwardValue333_26_0;
    int spill333_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_21: {
    forward_join_13: {
    life4_3 = (moom.dw.R ^ 137831650150683L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill333_0 = p2;
    if (!((life6_5 != null))) {
        forwardValue333_21_0 = spill333_0;
        break forward_join_21;
    }
    if (!((spill333_0 > 3))) {
        break forward_join_13;
    }
    p2 = 3;
    }
    forwardValue333_21_0 = ((java.util.Random)(p1)).nextInt(((int)((((int) moom.dw.S) - (p2 * 3)))));
    }
    if (!((forwardValue333_21_0 == 0))) {
        break forward_join_24;
    }
    forwardValue333_26_0 = net.minecraft.init.Items.ak;
    break forward_join_26;
    }
    forwardValue333_26_0 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(this)));
    }
    return forwardValue333_26_0;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return moom.fm.m;
}

}
