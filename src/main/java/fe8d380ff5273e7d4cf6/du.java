package moom;


public class du extends net.minecraft.block.Block {

public static boolean Q;

private static final long U;

private static final long V;

public du() {
super(moom.fn.p);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


public du(moom.fn p0) {
super(p0);
}


static {
javax.crypto.Cipher forestValue443_31_0;
    int forestValue443_31_1;
    javax.crypto.SecretKeyFactory forestValue443_31_2;
    byte[] forestValue443_31_3;
    javax.crypto.Cipher forestValue443_48_0;
    int forestValue443_48_1;
    javax.crypto.SecretKeyFactory forestValue443_48_2;
    byte[] forestValue443_48_3;
    javax.crypto.Cipher spill443_0;
    int spill443_1;
    javax.crypto.SecretKeyFactory spill443_2;
    byte[] spill443_3;
    byte[] spill443_4;
    int spill443_5;
    long spill443_6;
    byte[] spill443_7;
    byte[] spill443_8;
    byte[] spill443_9;
    byte[] spill443_10;
    byte[] spill443_11;
    byte[] spill443_12;
    byte[] spill443_13;
    byte[] spill443_14;
    long spill443_15;
    int spill443_16;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    long life4_64;
    byte[] life6_132;
    forest_join_48: {
    U = ((long)(((moom._a)(moom._c.a(((long)(-4286281753213102269L)), ((long)(-5887693597032308543L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9924714878005L)))));
    life0_11 = (moom.du.U ^ 72801414037275L);
    spill443_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill443_1 = 2;
    spill443_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp443_8_0 = new byte[8];
    spill443_3 = __stackOp443_8_0;
    (__stackOp443_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue443_31_0 = spill443_0;
    forestValue443_31_1 = spill443_1;
    forestValue443_31_2 = spill443_2;
    forestValue443_31_3 = spill443_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue443_48_0 = forestValue443_31_0;
        forestValue443_48_1 = forestValue443_31_1;
        forestValue443_48_2 = forestValue443_31_2;
        forestValue443_48_3 = forestValue443_31_3;
        break forest_join_48;
    }
    byte[] __stackOp443_9_0 = forestValue443_31_3;
    spill443_4 = __stackOp443_9_0;
    (__stackOp443_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue443_31_3 = spill443_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue443_48_0)).init(((int)(forestValue443_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue443_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue443_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp443_12_0 = -579891073508317430L;
    int __stackOp443_12_1 = -1;
    spill443_5 = __stackOp443_12_1;
    spill443_6 = __stackOp443_12_0;
    recovery.source.CarrierOps.discard(__stackOp443_12_1);
    life4_64 = spill443_6;
    byte[] __stackOp443_14_0 = new byte[8];
    spill443_7 = __stackOp443_14_0;
    (__stackOp443_14_0)[0] = ((byte) ((int) (life4_64 >>> 56)));
    byte[] __stackOp443_15_0 = spill443_7;
    spill443_8 = __stackOp443_15_0;
    (__stackOp443_15_0)[1] = ((byte) ((int) (life4_64 >>> 48)));
    byte[] __stackOp443_16_0 = spill443_8;
    spill443_9 = __stackOp443_16_0;
    (__stackOp443_16_0)[2] = ((byte) ((int) (life4_64 >>> 40)));
    byte[] __stackOp443_17_0 = spill443_9;
    spill443_10 = __stackOp443_17_0;
    (__stackOp443_17_0)[3] = ((byte) ((int) (life4_64 >>> 32)));
    byte[] __stackOp443_18_0 = spill443_10;
    spill443_11 = __stackOp443_18_0;
    (__stackOp443_18_0)[4] = ((byte) ((int) (life4_64 >>> 24)));
    byte[] __stackOp443_19_0 = spill443_11;
    spill443_12 = __stackOp443_19_0;
    (__stackOp443_19_0)[5] = ((byte) ((int) (life4_64 >>> 16)));
    byte[] __stackOp443_20_0 = spill443_12;
    spill443_13 = __stackOp443_20_0;
    (__stackOp443_20_0)[6] = ((byte) ((int) (life4_64 >>> 8)));
    byte[] __stackOp443_21_0 = spill443_13;
    spill443_14 = __stackOp443_21_0;
    (__stackOp443_21_0)[7] = ((byte) ((int) life4_64));
    byte[] __stackOp443_22_0 = spill443_14;
    javax.crypto.Cipher __stackOp443_22_1 = life2_15;
    life6_132 = ((javax.crypto.Cipher)(__stackOp443_22_1)).doFinal(((byte[])(__stackOp443_22_0)));
    int __stackOp443_24_0 = spill443_5;
    long __stackOp443_24_1 = (((((((((((long) (life6_132)[0]) & 255L) << 56) | ((((long) (life6_132)[1]) & 255L) << 48)) | ((((long) (life6_132)[2]) & 255L) << 40)) | ((((long) (life6_132)[3]) & 255L) << 32)) | ((((long) (life6_132)[4]) & 255L) << 24)) | ((((long) (life6_132)[5]) & 255L) << 16)) | ((((long) (life6_132)[6]) & 255L) << 8)) | (((long) (life6_132)[7]) & 255L));
    spill443_15 = __stackOp443_24_1;
    spill443_16 = __stackOp443_24_0;
    recovery.source.CarrierOps.discard(__stackOp443_24_1);
    recovery.source.CarrierOps.discard(spill443_16);
    V = ((long)(spill443_15));
}


private void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1124_15_0;
    int lexicalValue1124_20_0;
    int lexicalValue1124_79_0;
    int lexicalValue1124_101_0;
    int lexicalValue1124_110_0;
    boolean spill1124_0;
    boolean spill1124_1;
    boolean spill1124_2;
    int spill1124_3;
    long life3_3;
    int[] life5_5;
    int life6_29;
    net.minecraft.entity.item.EntityFallingBlock life7_87;
    moom.DT life7_106;
    lexical_join_111: {
    lexical_join_110: {
    lexical_join_101: {
    lexical_join_99: {
    lexical_join_79: {
    lexical_join_76: {
    lexical_join_20: {
    lexical_join_15: {
    life3_3 = (moom.du.U ^ 16534407345284L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1124_0 = moom.du.c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life5_5 != null))) {
        lexicalValue1124_15_0 = ((spill1124_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!(spill1124_0)) {
        break lexical_join_111;
    }
    lexicalValue1124_15_0 = ((moom.DT)(p1)).b();
    }
    if (!((life5_5 != null))) {
        lexicalValue1124_20_0 = lexicalValue1124_15_0;
        break lexical_join_20;
    }
    if (!((lexicalValue1124_15_0 >= 0))) {
        break lexical_join_111;
    }
    lexicalValue1124_20_0 = ((int) moom.du.V);
    }
    life6_29 = lexicalValue1124_20_0;
    spill1124_1 = moom.du.Q;
    if (!((life5_5 != null))) {
        lexicalValue1124_79_0 = ((spill1124_1) ? 1 : 0);
        break lexical_join_79;
    }
    if (!((!spill1124_1))) {
        break lexical_join_76;
    }
    spill1124_2 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p1)).a(((int)((-life6_29))), ((int)((-life6_29))), ((int)((-life6_29)))))), ((moom.DT)(((moom.DT)(p1)).a(((int)(life6_29)), ((int)(life6_29)), ((int)(life6_29))))));
    if (!((life5_5 != null))) {
        lexicalValue1124_79_0 = ((spill1124_2) ? 1 : 0);
        break lexical_join_79;
    }
    if (!(spill1124_2)) {
        break lexical_join_76;
    }
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break lexical_join_111;
    }
    life7_87 = new net.minecraft.entity.item.EntityFallingBlock(p0, (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d), ((double) ((moom.DT)(p1)).b()), (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d), ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))));
    ((moom.du)(this)).a(((net.minecraft.entity.item.EntityFallingBlock)(life7_87)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life7_87)));
    if (!((life5_5 == null))) {
        break lexical_join_111;
    }
    }
    lexicalValue1124_79_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1124_79_0);
    life7_106 = ((moom.DT)(p1)).b__DT();
    lexical_cycle_83: while (true) {
    if (!(moom.du.c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life7_106))))) {
        break lexical_join_99;
    }
    spill1124_3 = ((moom.DT)(life7_106)).b();
    if (!((life5_5 != null))) {
        lexicalValue1124_101_0 = spill1124_3;
        break lexical_join_101;
    }
    if (!((life5_5 != null))) {
        lexicalValue1124_101_0 = spill1124_3;
        break lexical_join_101;
    }
    if (!((spill1124_3 > 0))) {
        break lexical_join_99;
    }
    life7_106 = ((moom.DT)(life7_106)).b__DT();
    if (!((life5_5 == null))) { continue lexical_cycle_83; }
    break lexical_cycle_83;
    }
    }
    lexicalValue1124_101_0 = ((moom.DT)(life7_106)).b();
    }
    if (!((life5_5 != null))) {
        lexicalValue1124_110_0 = lexicalValue1124_101_0;
        break lexical_join_110;
    }
    if (!((lexicalValue1124_101_0 > 0))) {
        break lexical_join_111;
    }
    lexicalValue1124_110_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(life7_106)).a__DT())), ((net.minecraft.block.state.IBlockState)(((moom.du)(this)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1124_110_0);
    }
    return;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
long local5 = (moom.du.U ^ 36999643454044L);
    if ((((((net.minecraft.world.World)(p0)).G) ? 1 : 0) == 0)) {
        ((moom.du)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.du)(this)).a(((net.minecraft.world.World)(p0))))));
    return;
}


public static boolean c__Boolean(net.minecraft.world.World p0, moom.DT p1) {
moom.fn forwardValue330_24_0;
    moom.fn forwardValue330_24_1;
    moom.fn forwardValue330_29_0;
    moom.fn forwardValue330_29_1;
    int forwardValue330_33_0;
    int[] spill330_0;
    moom.fn spill330_1;
    moom.fn spill330_2;
    long life2_3;
    net.minecraft.block.Block life5_9;
    moom.fn life6_12;
    int[] life4_13;
    forward_join_33: {
    forward_join_32: {
    forward_join_30: {
    forward_join_29: {
    forward_join_24: {
    life2_3 = (moom.du.U ^ 1812307038995L);
    spill330_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life6_12 = ((net.minecraft.block.Block)(life5_9)).J;
    life4_13 = spill330_0;
    if (!((life5_9 != net.minecraft.init.Blocks.ab))) {
        break forward_join_30;
    }
    spill330_1 = life6_12;
    spill330_2 = moom.fn.a;
    if (!((life4_13 != null))) {
        forwardValue330_24_0 = spill330_1;
        forwardValue330_24_1 = spill330_2;
        break forward_join_24;
    }
    if (!((spill330_1 != spill330_2))) {
        break forward_join_30;
    }
    forwardValue330_24_0 = life6_12;
    forwardValue330_24_1 = moom.fn.h;
    }
    if (!((life4_13 != null))) {
        forwardValue330_29_0 = forwardValue330_24_0;
        forwardValue330_29_1 = forwardValue330_24_1;
        break forward_join_29;
    }
    if (!((forwardValue330_24_0 != forwardValue330_24_1))) {
        break forward_join_30;
    }
    forwardValue330_29_0 = life6_12;
    forwardValue330_29_1 = moom.fn.i;
    }
    if (!((forwardValue330_29_0 == forwardValue330_29_1))) {
        break forward_join_32;
    }
    }
    forwardValue330_33_0 = 1;
    break forward_join_33;
    }
    forwardValue330_33_0 = 0;
    }
    return ((forwardValue330_33_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.world.World p0) {
return 2;
}


protected void a(net.minecraft.entity.item.EntityFallingBlock p0) {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.du)(this)).a(((net.minecraft.world.World)(p0))))));
    return;
}

}
