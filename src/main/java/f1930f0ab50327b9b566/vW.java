package moom;


class vW implements net.minecraft.entity.passive.EntityVillager$ITradeList {

public net.minecraft.item.ItemStack a;

public moom.DO b;

private static final long c;

private static final long d;

public vW(net.minecraft.item.Item p0, moom.DO p1) {
super();
    this.a = new net.minecraft.item.ItemStack(p0);
    this.b = p1;
}


static {
javax.crypto.Cipher forestValue511_31_0;
    int forestValue511_31_1;
    javax.crypto.SecretKeyFactory forestValue511_31_2;
    byte[] forestValue511_31_3;
    javax.crypto.Cipher forestValue511_48_0;
    int forestValue511_48_1;
    javax.crypto.SecretKeyFactory forestValue511_48_2;
    byte[] forestValue511_48_3;
    javax.crypto.Cipher spill511_0;
    int spill511_1;
    javax.crypto.SecretKeyFactory spill511_2;
    byte[] spill511_3;
    byte[] spill511_4;
    int spill511_5;
    long spill511_6;
    byte[] spill511_7;
    byte[] spill511_8;
    byte[] spill511_9;
    byte[] spill511_10;
    byte[] spill511_11;
    byte[] spill511_12;
    byte[] spill511_13;
    byte[] spill511_14;
    long spill511_15;
    int spill511_16;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    long life4_64;
    byte[] life6_132;
    forest_join_48: {
    c = ((long)(((moom._a)(moom._c.a(((long)(-4486760753982656235L)), ((long)(8941900532781459156L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(59781223478614L)))));
    life0_11 = (moom.vW.c ^ 24379135092319L);
    spill511_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill511_1 = 2;
    spill511_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp511_8_0 = new byte[8];
    spill511_3 = __stackOp511_8_0;
    (__stackOp511_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue511_31_0 = spill511_0;
    forestValue511_31_1 = spill511_1;
    forestValue511_31_2 = spill511_2;
    forestValue511_31_3 = spill511_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue511_48_0 = forestValue511_31_0;
        forestValue511_48_1 = forestValue511_31_1;
        forestValue511_48_2 = forestValue511_31_2;
        forestValue511_48_3 = forestValue511_31_3;
        break forest_join_48;
    }
    byte[] __stackOp511_9_0 = forestValue511_31_3;
    spill511_4 = __stackOp511_9_0;
    (__stackOp511_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue511_31_3 = spill511_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue511_48_0)).init(((int)(forestValue511_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue511_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue511_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp511_12_0 = 7677068998234094660L;
    int __stackOp511_12_1 = -1;
    spill511_5 = __stackOp511_12_1;
    spill511_6 = __stackOp511_12_0;
    recovery.source.CarrierOps.discard(__stackOp511_12_1);
    life4_64 = spill511_6;
    byte[] __stackOp511_14_0 = new byte[8];
    spill511_7 = __stackOp511_14_0;
    (__stackOp511_14_0)[0] = ((byte) ((int) (life4_64 >>> 56)));
    byte[] __stackOp511_15_0 = spill511_7;
    spill511_8 = __stackOp511_15_0;
    (__stackOp511_15_0)[1] = ((byte) ((int) (life4_64 >>> 48)));
    byte[] __stackOp511_16_0 = spill511_8;
    spill511_9 = __stackOp511_16_0;
    (__stackOp511_16_0)[2] = ((byte) ((int) (life4_64 >>> 40)));
    byte[] __stackOp511_17_0 = spill511_9;
    spill511_10 = __stackOp511_17_0;
    (__stackOp511_17_0)[3] = ((byte) ((int) (life4_64 >>> 32)));
    byte[] __stackOp511_18_0 = spill511_10;
    spill511_11 = __stackOp511_18_0;
    (__stackOp511_18_0)[4] = ((byte) ((int) (life4_64 >>> 24)));
    byte[] __stackOp511_19_0 = spill511_11;
    spill511_12 = __stackOp511_19_0;
    (__stackOp511_19_0)[5] = ((byte) ((int) (life4_64 >>> 16)));
    byte[] __stackOp511_20_0 = spill511_12;
    spill511_13 = __stackOp511_20_0;
    (__stackOp511_20_0)[6] = ((byte) ((int) (life4_64 >>> 8)));
    byte[] __stackOp511_21_0 = spill511_13;
    spill511_14 = __stackOp511_21_0;
    (__stackOp511_21_0)[7] = ((byte) ((int) life4_64));
    byte[] __stackOp511_22_0 = spill511_14;
    javax.crypto.Cipher __stackOp511_22_1 = life2_15;
    life6_132 = ((javax.crypto.Cipher)(__stackOp511_22_1)).doFinal(((byte[])(__stackOp511_22_0)));
    int __stackOp511_24_0 = spill511_5;
    long __stackOp511_24_1 = (((((((((((long) (life6_132)[0]) & 255L) << 56) | ((((long) (life6_132)[1]) & 255L) << 48)) | ((((long) (life6_132)[2]) & 255L) << 40)) | ((((long) (life6_132)[3]) & 255L) << 32)) | ((((long) (life6_132)[4]) & 255L) << 24)) | ((((long) (life6_132)[5]) & 255L) << 16)) | ((((long) (life6_132)[6]) & 255L) << 8)) | (((long) (life6_132)[7]) & 255L));
    spill511_15 = __stackOp511_24_1;
    spill511_16 = __stackOp511_24_0;
    recovery.source.CarrierOps.discard(__stackOp511_24_1);
    recovery.source.CarrierOps.discard(spill511_16);
    d = ((long)(spill511_15));
}


public void a(moom.OF p0, java.util.Random p1) {
moom.DO forwardValue448_15_0;
    int spill448_0;
    moom.DO spill448_1;
    long life3_3;
    int life6_6;
    int life5_7;
    net.minecraft.item.ItemStack life7_30;
    net.minecraft.item.ItemStack life8_41;
    net.minecraft.item.ItemStack life8_51;
    forward_join_18: {
    forward_join_15: {
    life3_3 = (moom.vW.c ^ 58790396916465L);
    spill448_0 = moom.vR.c();
    life6_6 = 1;
    life5_7 = spill448_0;
    spill448_1 = this.b;
    if (!((life5_7 == 0))) {
        forwardValue448_15_0 = spill448_1;
        break forward_join_15;
    }
    if (!((spill448_1 != null))) {
        break forward_join_18;
    }
    forwardValue448_15_0 = this.b;
    }
    life6_6 = ((moom.DO)(forwardValue448_15_0)).a(((java.util.Random)(p1)));
    }
    life7_30 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bD, life6_6, 0);
    life8_41 = new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(this.a)).a__wQ(), 1, ((net.minecraft.item.ItemStack)(this.a)).c());
    life8_51 = moom.rV.a__xW(((java.util.Random)(p1)), ((net.minecraft.item.ItemStack)(life8_41)), ((int)((5 + ((java.util.Random)(p1)).nextInt(((int)(((int) moom.vW.d))))))));
    ((moom.OF)(p0)).add(((new net.minecraft.village.MerchantRecipe(life7_30, life8_51))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
