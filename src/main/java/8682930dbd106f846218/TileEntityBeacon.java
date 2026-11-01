package net.minecraft.tileentity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TileEntityBeacon extends moom.Ci implements net.minecraft.util.ITickable, net.minecraft.inventory.IInventory {

public static final net.minecraft.potion.Potion[][] n;

private final java.util.List<moom.Cv> o;

private long p;

private float q;

private boolean r;

private int s;

private int t;

private int u;

private net.minecraft.item.ItemStack v;

public java.lang.String w;

private static final long x;

private static final long[] y;

private static final java.lang.Integer[] A;

private static final java.util.Map C;

private static final long D;

public TileEntityBeacon() {
super();
    this.o = com.google.common.collect.Lists.newArrayList();
    this.s = -1;
}


static {
javax.crypto.Cipher forestValue576_36_0;
    int forestValue576_36_1;
    javax.crypto.SecretKeyFactory forestValue576_36_2;
    byte[] forestValue576_36_3;
    javax.crypto.Cipher forestValue576_53_0;
    int forestValue576_53_1;
    javax.crypto.SecretKeyFactory forestValue576_53_2;
    byte[] forestValue576_53_3;
    long[] forestValue576_157_0;
    int forestValue576_157_1;
    long forestValue576_157_2;
    int forestValue576_157_3;
    long[] forestValue576_300_0;
    int forestValue576_300_1;
    long forestValue576_300_2;
    long[] forestValue576_312_0;
    int forestValue576_312_1;
    long forestValue576_312_2;
    javax.crypto.Cipher forestValue576_423_0;
    int forestValue576_423_1;
    javax.crypto.SecretKeyFactory forestValue576_423_2;
    byte[] forestValue576_423_3;
    javax.crypto.Cipher forestValue576_440_0;
    int forestValue576_440_1;
    javax.crypto.SecretKeyFactory forestValue576_440_2;
    byte[] forestValue576_440_3;
    javax.crypto.Cipher spill576_0;
    int spill576_1;
    javax.crypto.SecretKeyFactory spill576_2;
    byte[] spill576_3;
    byte[] spill576_4;
    java.lang.String spill576_5;
    int spill576_6;
    int spill576_7;
    long spill576_8;
    byte[] spill576_9;
    byte[] spill576_10;
    byte[] spill576_11;
    byte[] spill576_12;
    byte[] spill576_13;
    byte[] spill576_14;
    byte[] spill576_15;
    byte[] spill576_16;
    long spill576_17;
    int spill576_18;
    java.lang.String spill576_19;
    int spill576_20;
    long[] spill576_21;
    int spill576_22;
    long spill576_23;
    int spill576_24;
    javax.crypto.Cipher spill576_25;
    int spill576_26;
    javax.crypto.SecretKeyFactory spill576_27;
    byte[] spill576_28;
    byte[] spill576_29;
    int spill576_30;
    long spill576_31;
    byte[] spill576_32;
    byte[] spill576_33;
    byte[] spill576_34;
    byte[] spill576_35;
    byte[] spill576_36;
    byte[] spill576_37;
    byte[] spill576_38;
    byte[] spill576_39;
    long spill576_40;
    int spill576_41;
    net.minecraft.potion.Potion[][] spill576_42;
    net.minecraft.potion.Potion[][] spill576_43;
    int spill576_44;
    net.minecraft.potion.Potion[] spill576_45;
    net.minecraft.potion.Potion[] spill576_46;
    net.minecraft.potion.Potion[][] spill576_47;
    net.minecraft.potion.Potion[][] spill576_48;
    int spill576_49;
    net.minecraft.potion.Potion[] spill576_50;
    net.minecraft.potion.Potion[] spill576_51;
    net.minecraft.potion.Potion[][] spill576_52;
    net.minecraft.potion.Potion[][] spill576_53;
    int spill576_54;
    net.minecraft.potion.Potion[] spill576_55;
    net.minecraft.potion.Potion[][] spill576_56;
    net.minecraft.potion.Potion[][] spill576_57;
    int spill576_58;
    net.minecraft.potion.Potion[] spill576_59;
    long life5_16;
    javax.crypto.Cipher life7_20;
    int life8_35;
    long[] life13_66;
    int life10_68;
    java.lang.String life11_71;
    int life12_73;
    int life9_75;
    byte[] life14_83;
    long life15_160;
    byte[] life17_228;
    byte[] life14_325;
    javax.crypto.Cipher life0_409;
    int life1_424;
    long life2_458;
    byte[] life4_526;
    forest_join_440: {
    forest_join_399: {
    forest_join_53: {
    x = ((long)(((moom._a)(moom._c.a(((long)(-6222851952539200487L)), ((long)(8605907051530900777L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12117836380540L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    life5_16 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 47920085457181L);
    spill576_0 = (life7_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill576_1 = 2;
    spill576_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp576_9_0 = new byte[8];
    spill576_3 = __stackOp576_9_0;
    (__stackOp576_9_0)[0] = ((byte) ((int) (life5_16 >>> 56)));
    life8_35 = 1;
    forestValue576_36_0 = spill576_0;
    forestValue576_36_1 = spill576_1;
    forestValue576_36_2 = spill576_2;
    forestValue576_36_3 = spill576_3;
    forest_cycle_36: while (true) {
    if (!((life8_35 < 8))) {
        forestValue576_53_0 = forestValue576_36_0;
        forestValue576_53_1 = forestValue576_36_1;
        forestValue576_53_2 = forestValue576_36_2;
        forestValue576_53_3 = forestValue576_36_3;
        break forest_join_53;
    }
    byte[] __stackOp576_10_0 = forestValue576_36_3;
    spill576_4 = __stackOp576_10_0;
    (__stackOp576_10_0)[life8_35] = ((byte) ((int) ((life5_16 << (life8_35 * 8)) >>> 56)));
    life8_35 += 1;
    forestValue576_36_3 = spill576_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue576_53_0)).init(((int)(forestValue576_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue576_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue576_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life13_66 = new long[6];
    life10_68 = 0;
    life12_73 = ((java.lang.String)((life11_71 = "þä±fù\027\020 Õ@\027ù\032ße\"\034PVïçr1güF<Â"))).length();
    life9_75 = 0;
    forest_cycle_76: while (true) {
    spill576_5 = life11_71;
    spill576_6 = life9_75;
    life9_75 += 8;
    life14_83 = ((java.lang.String)(((java.lang.String)(spill576_5)).substring(((int)(spill576_6)), ((int)(life9_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue576_157_0 = life13_66;
    forestValue576_157_1 = (life10_68++);
    forestValue576_157_2 = (((((((((((long) (life14_83)[0]) & 255L) << 56) | ((((long) (life14_83)[1]) & 255L) << 48)) | ((((long) (life14_83)[2]) & 255L) << 40)) | ((((long) (life14_83)[3]) & 255L) << 32)) | ((((long) (life14_83)[4]) & 255L) << 24)) | ((((long) (life14_83)[5]) & 255L) << 16)) | ((((long) (life14_83)[6]) & 255L) << 8)) | (((long) (life14_83)[7]) & 255L));
    forestValue576_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp576_16_0 = forestValue576_157_2;
    int __stackOp576_16_1 = forestValue576_157_3;
    spill576_7 = __stackOp576_16_1;
    spill576_8 = __stackOp576_16_0;
    recovery.source.CarrierOps.discard(__stackOp576_16_1);
    life15_160 = spill576_8;
    byte[] __stackOp576_18_0 = new byte[8];
    spill576_9 = __stackOp576_18_0;
    (__stackOp576_18_0)[0] = ((byte) ((int) (life15_160 >>> 56)));
    byte[] __stackOp576_19_0 = spill576_9;
    spill576_10 = __stackOp576_19_0;
    (__stackOp576_19_0)[1] = ((byte) ((int) (life15_160 >>> 48)));
    byte[] __stackOp576_20_0 = spill576_10;
    spill576_11 = __stackOp576_20_0;
    (__stackOp576_20_0)[2] = ((byte) ((int) (life15_160 >>> 40)));
    byte[] __stackOp576_21_0 = spill576_11;
    spill576_12 = __stackOp576_21_0;
    (__stackOp576_21_0)[3] = ((byte) ((int) (life15_160 >>> 32)));
    byte[] __stackOp576_22_0 = spill576_12;
    spill576_13 = __stackOp576_22_0;
    (__stackOp576_22_0)[4] = ((byte) ((int) (life15_160 >>> 24)));
    byte[] __stackOp576_23_0 = spill576_13;
    spill576_14 = __stackOp576_23_0;
    (__stackOp576_23_0)[5] = ((byte) ((int) (life15_160 >>> 16)));
    byte[] __stackOp576_24_0 = spill576_14;
    spill576_15 = __stackOp576_24_0;
    (__stackOp576_24_0)[6] = ((byte) ((int) (life15_160 >>> 8)));
    byte[] __stackOp576_25_0 = spill576_15;
    spill576_16 = __stackOp576_25_0;
    (__stackOp576_25_0)[7] = ((byte) ((int) life15_160));
    byte[] __stackOp576_26_0 = spill576_16;
    javax.crypto.Cipher __stackOp576_26_1 = life7_20;
    life17_228 = ((javax.crypto.Cipher)(__stackOp576_26_1)).doFinal(((byte[])(__stackOp576_26_0)));
    int __stackOp576_28_0 = spill576_7;
    long __stackOp576_28_1 = (((((((((((long) (life17_228)[0]) & 255L) << 56) | ((((long) (life17_228)[1]) & 255L) << 48)) | ((((long) (life17_228)[2]) & 255L) << 40)) | ((((long) (life17_228)[3]) & 255L) << 32)) | ((((long) (life17_228)[4]) & 255L) << 24)) | ((((long) (life17_228)[5]) & 255L) << 16)) | ((((long) (life17_228)[6]) & 255L) << 8)) | (((long) (life17_228)[7]) & 255L));
    spill576_17 = __stackOp576_28_1;
    spill576_18 = __stackOp576_28_0;
    recovery.source.CarrierOps.discard(__stackOp576_28_1);
    switch (spill576_18) {
default:
{
        forestValue576_300_0 = forestValue576_157_0;
        forestValue576_300_1 = forestValue576_157_1;
        forestValue576_300_2 = spill576_17;
        break forest_join_300;
    }
case 0:
{
        forestValue576_312_0 = forestValue576_157_0;
        forestValue576_312_1 = forestValue576_157_1;
        forestValue576_312_2 = spill576_17;
        break forest_join_312;
    }
}
    }
    (forestValue576_300_0)[forestValue576_300_1] = forestValue576_300_2;
    if (!((life9_75 >= life12_73))) {
        continue forest_cycle_76;
    }
    life12_73 = ((java.lang.String)((life11_71 = "çÊ¢ø\002ñ\023Áèêüd1'o¸"))).length();
    life9_75 = 0;
    break forest_join_317;
    }
    (forestValue576_312_0)[forestValue576_312_1] = forestValue576_312_2;
    if (!((life9_75 >= life12_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill576_19 = life11_71;
    spill576_20 = life9_75;
    life9_75 += 8;
    life14_325 = ((java.lang.String)(((java.lang.String)(spill576_19)).substring(((int)(spill576_20)), ((int)(life9_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill576_21 = life13_66;
    spill576_22 = (life10_68++);
    spill576_23 = (((((((((((long) (life14_325)[0]) & 255L) << 56) | ((((long) (life14_325)[1]) & 255L) << 48)) | ((((long) (life14_325)[2]) & 255L) << 40)) | ((((long) (life14_325)[3]) & 255L) << 32)) | ((((long) (life14_325)[4]) & 255L) << 24)) | ((((long) (life14_325)[5]) & 255L) << 16)) | ((((long) (life14_325)[6]) & 255L) << 8)) | (((long) (life14_325)[7]) & 255L));
    spill576_24 = 0;
    forestValue576_157_0 = spill576_21;
    forestValue576_157_1 = spill576_22;
    forestValue576_157_2 = spill576_23;
    forestValue576_157_3 = spill576_24;
    continue forest_cycle_157;
    }
    }
    }
    y = ((long[])(life13_66));
    A = ((java.lang.Integer[])(new java.lang.Integer[6]));
    spill576_25 = (life0_409 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill576_26 = 2;
    spill576_27 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp576_37_0 = new byte[8];
    spill576_28 = __stackOp576_37_0;
    (__stackOp576_37_0)[0] = ((byte) ((int) (life5_16 >>> 56)));
    life1_424 = 1;
    forestValue576_423_0 = spill576_25;
    forestValue576_423_1 = spill576_26;
    forestValue576_423_2 = spill576_27;
    forestValue576_423_3 = spill576_28;
    forest_cycle_423: while (true) {
    if (!((life1_424 < 8))) {
        forestValue576_440_0 = forestValue576_423_0;
        forestValue576_440_1 = forestValue576_423_1;
        forestValue576_440_2 = forestValue576_423_2;
        forestValue576_440_3 = forestValue576_423_3;
        break forest_join_440;
    }
    byte[] __stackOp576_38_0 = forestValue576_423_3;
    spill576_29 = __stackOp576_38_0;
    (__stackOp576_38_0)[life1_424] = ((byte) ((int) ((life5_16 << (life1_424 * 8)) >>> 56)));
    life1_424 += 1;
    forestValue576_423_3 = spill576_29;
    continue forest_cycle_423;
    }
    }
    ((javax.crypto.Cipher)(forestValue576_440_0)).init(((int)(forestValue576_440_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue576_440_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue576_440_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp576_41_0 = -1334189841792664933L;
    int __stackOp576_41_1 = -1;
    spill576_30 = __stackOp576_41_1;
    spill576_31 = __stackOp576_41_0;
    recovery.source.CarrierOps.discard(__stackOp576_41_1);
    life2_458 = spill576_31;
    byte[] __stackOp576_43_0 = new byte[8];
    spill576_32 = __stackOp576_43_0;
    (__stackOp576_43_0)[0] = ((byte) ((int) (life2_458 >>> 56)));
    byte[] __stackOp576_44_0 = spill576_32;
    spill576_33 = __stackOp576_44_0;
    (__stackOp576_44_0)[1] = ((byte) ((int) (life2_458 >>> 48)));
    byte[] __stackOp576_45_0 = spill576_33;
    spill576_34 = __stackOp576_45_0;
    (__stackOp576_45_0)[2] = ((byte) ((int) (life2_458 >>> 40)));
    byte[] __stackOp576_46_0 = spill576_34;
    spill576_35 = __stackOp576_46_0;
    (__stackOp576_46_0)[3] = ((byte) ((int) (life2_458 >>> 32)));
    byte[] __stackOp576_47_0 = spill576_35;
    spill576_36 = __stackOp576_47_0;
    (__stackOp576_47_0)[4] = ((byte) ((int) (life2_458 >>> 24)));
    byte[] __stackOp576_48_0 = spill576_36;
    spill576_37 = __stackOp576_48_0;
    (__stackOp576_48_0)[5] = ((byte) ((int) (life2_458 >>> 16)));
    byte[] __stackOp576_49_0 = spill576_37;
    spill576_38 = __stackOp576_49_0;
    (__stackOp576_49_0)[6] = ((byte) ((int) (life2_458 >>> 8)));
    byte[] __stackOp576_50_0 = spill576_38;
    spill576_39 = __stackOp576_50_0;
    (__stackOp576_50_0)[7] = ((byte) ((int) life2_458));
    byte[] __stackOp576_51_0 = spill576_39;
    javax.crypto.Cipher __stackOp576_51_1 = life0_409;
    life4_526 = ((javax.crypto.Cipher)(__stackOp576_51_1)).doFinal(((byte[])(__stackOp576_51_0)));
    int __stackOp576_53_0 = spill576_30;
    long __stackOp576_53_1 = (((((((((((long) (life4_526)[0]) & 255L) << 56) | ((((long) (life4_526)[1]) & 255L) << 48)) | ((((long) (life4_526)[2]) & 255L) << 40)) | ((((long) (life4_526)[3]) & 255L) << 32)) | ((((long) (life4_526)[4]) & 255L) << 24)) | ((((long) (life4_526)[5]) & 255L) << 16)) | ((((long) (life4_526)[6]) & 255L) << 8)) | (((long) (life4_526)[7]) & 255L));
    spill576_40 = __stackOp576_53_1;
    spill576_41 = __stackOp576_53_0;
    recovery.source.CarrierOps.discard(__stackOp576_53_1);
    recovery.source.CarrierOps.discard(spill576_41);
    D = ((long)(spill576_40));
    net.minecraft.potion.Potion[][] __stackOp576_57_0 = new net.minecraft.potion.Potion[4][];
    spill576_42 = __stackOp576_57_0;
    spill576_43 = __stackOp576_57_0;
    spill576_44 = 0;
    net.minecraft.potion.Potion[] __stackOp576_58_0 = new net.minecraft.potion.Potion[2];
    spill576_45 = __stackOp576_58_0;
    (__stackOp576_58_0)[0] = net.minecraft.potion.Potion.d;
    net.minecraft.potion.Potion[] __stackOp576_60_0 = spill576_45;
    spill576_46 = __stackOp576_60_0;
    (__stackOp576_60_0)[1] = net.minecraft.potion.Potion.f;
    (spill576_43)[spill576_44] = spill576_46;
    net.minecraft.potion.Potion[][] __stackOp576_62_0 = spill576_42;
    spill576_47 = __stackOp576_62_0;
    spill576_48 = __stackOp576_62_0;
    spill576_49 = 1;
    net.minecraft.potion.Potion[] __stackOp576_63_0 = new net.minecraft.potion.Potion[2];
    spill576_50 = __stackOp576_63_0;
    (__stackOp576_63_0)[0] = net.minecraft.potion.Potion.n;
    net.minecraft.potion.Potion[] __stackOp576_65_0 = spill576_50;
    spill576_51 = __stackOp576_65_0;
    (__stackOp576_65_0)[1] = net.minecraft.potion.Potion.k;
    (spill576_48)[spill576_49] = spill576_51;
    net.minecraft.potion.Potion[][] __stackOp576_67_0 = spill576_47;
    spill576_52 = __stackOp576_67_0;
    spill576_53 = __stackOp576_67_0;
    spill576_54 = 2;
    net.minecraft.potion.Potion[] __stackOp576_68_0 = new net.minecraft.potion.Potion[1];
    spill576_55 = __stackOp576_68_0;
    (__stackOp576_68_0)[0] = net.minecraft.potion.Potion.h;
    (spill576_53)[spill576_54] = spill576_55;
    net.minecraft.potion.Potion[][] __stackOp576_70_0 = spill576_52;
    spill576_56 = __stackOp576_70_0;
    spill576_57 = __stackOp576_70_0;
    spill576_58 = 3;
    net.minecraft.potion.Potion[] __stackOp576_71_0 = new net.minecraft.potion.Potion[1];
    spill576_59 = __stackOp576_71_0;
    (__stackOp576_71_0)[0] = net.minecraft.potion.Potion.m;
    (spill576_57)[spill576_58] = spill576_59;
    n = ((net.minecraft.potion.Potion[][])(spill576_56));
}


private void i() {
net.minecraft.block.Block lexicalValue1689_87_0;
    net.minecraft.block.Block lexicalValue1689_102_0;
    net.minecraft.block.state.IBlockState lexicalValue1689_117_0;
    int lexicalValue1689_172_0;
    int lexicalValue1689_188_0;
    int lexicalValue1689_217_0;
    net.minecraft.block.Block lexicalValue1689_267_0;
    net.minecraft.block.Block lexicalValue1689_267_1;
    net.minecraft.block.Block lexicalValue1689_272_0;
    net.minecraft.block.Block lexicalValue1689_272_1;
    int lexicalValue1689_284_0;
    int lexicalValue1689_295_0;
    int lexicalValue1689_304_0;
    int lexicalValue1689_309_0;
    int lexicalValue1689_316_0;
    int lexicalValue1689_316_1;
    java.lang.String[] spill1689_0;
    net.minecraft.block.Block spill1689_1;
    net.minecraft.block.state.IBlockState spill1689_2;
    net.minecraft.block.Block spill1689_3;
    int spill1689_4;
    boolean spill1689_5;
    int spill1689_6;
    int spill1689_7;
    net.minecraft.block.Block spill1689_8;
    net.minecraft.block.Block spill1689_9;
    int spill1689_10;
    long life1_3;
    int life4_6;
    int life5_11;
    java.lang.String[] life3_12;
    int life6_16;
    int life7_20;
    moom.Cv life8_35;
    int life9_42;
    moom.DU life10_46;
    int life11_50;
    net.minecraft.block.state.IBlockState life12_66;
    float[] life13_86;
    int life11_242;
    int life12_249;
    int life13_271;
    int life14_275;
    int life15_296;
    net.minecraft.block.Block life16_312;
    java.util.Iterator life11_451;
    net.minecraft.entity.player.EntityPlayer life12_458;
    lexical_join_356: {
    lexical_join_316: {
    lexical_join_309: {
    lexical_join_304: {
    lexical_join_301: {
    lexical_join_295: {
    lexical_join_293: {
    lexical_join_194: {
    life1_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 44963753293509L);
    life4_6 = this.s;
    spill1689_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life5_11 = ((moom.DT)(this.e)).a();
    life3_12 = spill1689_0;
    life6_16 = ((moom.DT)(this.e)).b();
    life7_20 = ((moom.DT)(this.e)).c();
    this.s = ((int)(0));
    ((java.util.List)(this.o)).clear();
    this.r = ((boolean)(true));
    life8_35 = new moom.Cv(net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE))));
    ((java.util.List)(this.o)).add(((java.lang.Object)(life8_35)));
    life9_42 = 1;
    life10_46 = new moom.DU();
    life11_50 = (life6_16 + 1);
    lexical_cycle_51: while (true) {
    lexical_join_191: {
    lexical_join_189: {
    lexical_join_188: {
    lexical_join_179: {
    lexical_join_172: {
    lexical_join_168: {
    lexical_join_122: {
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_112: {
    lexical_join_102: {
    lexical_join_87: {
    lexical_join_83: {
    if (!((life11_50 < __sourceIntrinsic_c85abf990348_invokedynamic1689_17(32661, (7562267034989380883L ^ life1_3))))) {
        break lexical_join_194;
    }
    life12_66 = ((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(((moom.DU)(life10_46)).a(((int)(life5_11)), ((int)(life11_50)), ((int)(life7_20))))));
    if (!((life3_12 != null))) {
        break lexical_join_301;
    }
    spill1689_1 = ((net.minecraft.block.state.IBlockState)(life12_66)).a__ch();
    if (!((life3_12 != null))) {
        lexicalValue1689_87_0 = spill1689_1;
        break lexical_join_87;
    }
    if (!((spill1689_1 == net.minecraft.init.Blocks.ck))) {
        break lexical_join_83;
    }
    life13_86 = net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(life12_66)).a(((net.minecraft.block.properties.IProperty)(moom.ct.R))))))));
    if (!((life3_12 == null))) {
        break lexical_join_122;
    }
    }
    spill1689_2 = life12_66;
    if (!((life3_12 != null))) {
        lexicalValue1689_117_0 = spill1689_2;
        break lexical_join_117;
    }
    lexicalValue1689_87_0 = ((net.minecraft.block.state.IBlockState)(spill1689_2)).a__ch();
    }
    if (!((lexicalValue1689_87_0 != net.minecraft.init.Blocks.cl))) {
        break lexical_join_116;
    }
    spill1689_3 = ((net.minecraft.block.state.IBlockState)(life12_66)).a__ch();
    if (!((life3_12 != null))) {
        lexicalValue1689_102_0 = spill1689_3;
        break lexical_join_102;
    }
    if (!((((net.minecraft.block.Block)(spill1689_3)).a__Int() >= __sourceIntrinsic_c85abf990348_invokedynamic1689_31(28438, (3847980651660531092L ^ life1_3))))) {
        break lexical_join_112;
    }
    lexicalValue1689_102_0 = ((net.minecraft.block.state.IBlockState)(life12_66)).a__ch();
    }
    if (!((lexicalValue1689_102_0 != net.minecraft.init.Blocks.h))) {
        break lexical_join_112;
    }
    this.r = ((boolean)(false));
    ((java.util.List)(this.o)).clear();
    if (!((life3_12 == null))) {
        break lexical_join_194;
    }
    }
    ((moom.Cv)(life8_35)).a__Void();
    if (!((life3_12 == null))) {
        break lexical_join_191;
    }
    }
    lexicalValue1689_117_0 = life12_66;
    }
    life13_86 = net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(lexicalValue1689_117_0)).a(((net.minecraft.block.properties.IProperty)(moom.dW.V))))))));
    }
    spill1689_4 = life9_42;
    if (!((life3_12 != null))) {
        lexicalValue1689_172_0 = spill1689_4;
        break lexical_join_172;
    }
    if (!((spill1689_4 == 0))) {
        break lexical_join_168;
    }
    life13_86 = new float[] {(((((moom.Cv)(life8_35)).a__ArrayFloat())[0] + (life13_86)[0]) / 0x1.0p1f), (((((moom.Cv)(life8_35)).a__ArrayFloat())[1] + (life13_86)[1]) / 0x1.0p1f), (((((moom.Cv)(life8_35)).a__ArrayFloat())[2] + (life13_86)[2]) / 0x1.0p1f)};
    }
    lexicalValue1689_172_0 = ((java.util.Arrays.equals(((float[])(life13_86)), ((float[])(((moom.Cv)(life8_35)).a__ArrayFloat())))) ? 1 : 0);
    }
    if (!((life3_12 != null))) {
        lexicalValue1689_188_0 = lexicalValue1689_172_0;
        break lexical_join_188;
    }
    if (!((lexicalValue1689_172_0 != 0))) {
        break lexical_join_179;
    }
    ((moom.Cv)(life8_35)).a__Void();
    if (!((life3_12 == null))) {
        break lexical_join_189;
    }
    }
    life8_35 = new moom.Cv(life13_86);
    lexicalValue1689_188_0 = ((((java.util.List)(this.o)).add(((java.lang.Object)(life8_35)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1689_188_0);
    }
    life9_42 = 0;
    }
    life11_50 += 1;
    if (!((life3_12 == null))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    spill1689_5 = this.r;
    if (!((life3_12 != null))) {
        lexicalValue1689_304_0 = ((spill1689_5) ? 1 : 0);
        break lexical_join_304;
    }
    if (!(spill1689_5)) {
        break lexical_join_301;
    }
    life11_242 = 1;
    lexical_cycle_201: while (true) {
    lexical_join_287: {
    lexical_join_284: {
    lexical_join_283: {
    lexical_join_217: {
    lexical_join_216: {
    if (!((life11_242 <= 4))) {
        break lexical_join_293;
    }
    life12_249 = (life6_16 - life11_242);
    spill1689_6 = life12_249;
    if (!((life3_12 != null))) {
        lexicalValue1689_295_0 = spill1689_6;
        break lexical_join_295;
    }
    if (!((life3_12 != null))) {
        lexicalValue1689_217_0 = spill1689_6;
        break lexical_join_217;
    }
    if (!((spill1689_6 < 0))) {
        break lexical_join_216;
    }
    if (!((life3_12 == null))) {
        break lexical_join_293;
    }
    }
    lexicalValue1689_217_0 = 1;
    }
    life13_271 = lexicalValue1689_217_0;
    life14_275 = (life5_11 - life11_242);
    lexical_cycle_222: while (true) {
    lexical_join_281: {
    lexical_join_280: {
    if (!((life14_275 <= (life5_11 + life11_242)))) {
        break lexical_join_283;
    }
    spill1689_7 = life13_271;
    if (!((life3_12 != null))) {
        lexicalValue1689_284_0 = spill1689_7;
        break lexical_join_284;
    }
    if (!((life3_12 != null))) {
        lexicalValue1689_284_0 = spill1689_7;
        break lexical_join_284;
    }
    if (!((spill1689_7 != 0))) {
        break lexical_join_283;
    }
    life15_296 = (life7_20 - life11_242);
    lexical_cycle_237: while (true) {
    lexical_join_278: {
    lexical_join_277: {
    lexical_join_272: {
    lexical_join_267: {
    if (!((life15_296 <= (life7_20 + life11_242)))) {
        break lexical_join_280;
    }
    life16_312 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(new moom.DT(life14_275, life12_249, life15_296)))))).a__ch();
    if (!((life3_12 != null))) {
        break lexical_join_281;
    }
    if (!((life3_12 != null))) {
        break lexical_join_278;
    }
    if (!((life16_312 != net.minecraft.init.Blocks.bI))) {
        break lexical_join_277;
    }
    spill1689_8 = life16_312;
    spill1689_9 = net.minecraft.init.Blocks.R;
    if (!((life3_12 != null))) {
        lexicalValue1689_267_0 = spill1689_8;
        lexicalValue1689_267_1 = spill1689_9;
        break lexical_join_267;
    }
    if (!((spill1689_8 != spill1689_9))) {
        break lexical_join_277;
    }
    lexicalValue1689_267_0 = life16_312;
    lexicalValue1689_267_1 = net.minecraft.init.Blocks.ah;
    }
    if (!((life3_12 != null))) {
        lexicalValue1689_272_0 = lexicalValue1689_267_0;
        lexicalValue1689_272_1 = lexicalValue1689_267_1;
        break lexical_join_272;
    }
    if (!((lexicalValue1689_267_0 != lexicalValue1689_267_1))) {
        break lexical_join_277;
    }
    lexicalValue1689_272_0 = life16_312;
    lexicalValue1689_272_1 = net.minecraft.init.Blocks.S;
    }
    if (!((lexicalValue1689_272_0 != lexicalValue1689_272_1))) {
        break lexical_join_277;
    }
    life13_271 = 0;
    if (!((life3_12 == null))) {
        break lexical_join_280;
    }
    }
    life15_296 += 1;
    }
    if (!((life3_12 == null))) { continue lexical_cycle_237; }
    break lexical_cycle_237;
    }
    }
    life14_275 += 1;
    }
    if (!((life3_12 == null))) { continue lexical_cycle_222; }
    break lexical_cycle_222;
    }
    }
    lexicalValue1689_284_0 = life13_271;
    }
    if (!((lexicalValue1689_284_0 == 0))) {
        break lexical_join_287;
    }
    if (!((life3_12 == null))) {
        break lexical_join_293;
    }
    }
    this.s = ((int)((life11_242++)));
    if (!((life3_12 == null))) { continue lexical_cycle_201; }
    break lexical_cycle_201;
    }
    }
    lexicalValue1689_295_0 = this.s;
    }
    if (!((life3_12 != null))) {
        lexicalValue1689_304_0 = lexicalValue1689_295_0;
        break lexical_join_304;
    }
    if (!((lexicalValue1689_295_0 == 0))) {
        break lexical_join_301;
    }
    this.r = ((boolean)(false));
    }
    lexicalValue1689_304_0 = ((((net.minecraft.world.World)(this.d)).G) ? 1 : 0);
    }
    if (!((life3_12 != null))) {
        lexicalValue1689_309_0 = lexicalValue1689_304_0;
        break lexical_join_309;
    }
    if (!((lexicalValue1689_304_0 == 0))) {
        break lexical_join_356;
    }
    lexicalValue1689_309_0 = this.s;
    }
    spill1689_10 = 4;
    if (!((life3_12 != null))) {
        lexicalValue1689_316_0 = lexicalValue1689_309_0;
        lexicalValue1689_316_1 = spill1689_10;
        break lexical_join_316;
    }
    if (!((lexicalValue1689_309_0 == spill1689_10))) {
        break lexical_join_356;
    }
    lexicalValue1689_316_0 = life4_6;
    lexicalValue1689_316_1 = this.s;
    }
    if (!((lexicalValue1689_316_0 < lexicalValue1689_316_1))) {
        break lexical_join_356;
    }
    life11_451 = ((java.util.List)(((net.minecraft.world.World)(this.d)).a(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer.class)), ((moom.CA)(((moom.CA)(new moom.CA(((double) life5_11), ((double) life6_16), ((double) life7_20), ((double) life5_11), ((double) (life6_16 - 4)), ((double) life7_20)))).b(((double)(0x1.4p3d)), ((double)(0x1.4p2d)), ((double)(0x1.4p3d)))))))).iterator();
    lexical_cycle_344: while (true) {
    if (!(((java.util.Iterator)(life11_451)).hasNext())) {
        break lexical_join_356;
    }
    life12_458 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life11_451)).next()));
    ((net.minecraft.entity.player.EntityPlayer)(life12_458)).a(((moom.BY)(net.minecraft.stats.AchievementList.K)));
    if (!((life3_12 == null))) { continue lexical_cycle_344; }
    break lexical_cycle_344;
    }
    }
    return;
}


public int b__Int() {
return 1;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue5649_15_0;
    net.minecraft.item.ItemStack spill5649_0;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.item.ItemStack life5_24;
    forward_join_21: {
    forward_join_15: {
    life2_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 9348611397301L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((p0 == 0))) {
        break forward_join_21;
    }
    spill5649_0 = this.v;
    if (!((life4_5 != null))) {
        forwardValue5649_15_0 = spill5649_0;
        break forward_join_15;
    }
    if (!((spill5649_0 != null))) {
        break forward_join_21;
    }
    forwardValue5649_15_0 = this.v;
    }
    life5_24 = forwardValue5649_15_0;
    this.v = ((net.minecraft.item.ItemStack)(null));
    return life5_24;
    }
    return null;
}


private int b__sourceReturn_0f7a48eca2(int p0) {
net.minecraft.potion.Potion forwardValue5648_25_0;
    net.minecraft.potion.Potion forwardValue5648_33_0;
    net.minecraft.potion.Potion forwardValue5648_33_1;
    net.minecraft.potion.Potion forwardValue5648_38_0;
    net.minecraft.potion.Potion forwardValue5648_38_1;
    net.minecraft.potion.Potion forwardValue5648_43_0;
    net.minecraft.potion.Potion forwardValue5648_43_1;
    net.minecraft.potion.Potion forwardValue5648_48_0;
    net.minecraft.potion.Potion forwardValue5648_48_1;
    net.minecraft.potion.Potion forwardValue5648_53_0;
    net.minecraft.potion.Potion forwardValue5648_53_1;
    int forwardValue5648_57_0;
    int forwardValue5648_59_0;
    int spill5648_0;
    int spill5648_1;
    net.minecraft.potion.Potion spill5648_2;
    net.minecraft.potion.Potion spill5648_3;
    net.minecraft.potion.Potion spill5648_4;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.potion.Potion life5_43;
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_53: {
    forward_join_48: {
    forward_join_43: {
    forward_join_38: {
    forward_join_33: {
    forward_join_25: {
    life2_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 45942424432888L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5648_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue5648_59_0 = spill5648_0;
        break forward_join_59;
    }
    if (!((spill5648_0 >= 0))) {
        break forward_join_58;
    }
    spill5648_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue5648_59_0 = spill5648_1;
        break forward_join_59;
    }
    if (!((spill5648_1 < (net.minecraft.potion.Potion.a).length))) {
        break forward_join_58;
    }
    spill5648_2 = (net.minecraft.potion.Potion.a)[p0];
    if (!((life4_5 != null))) {
        forwardValue5648_25_0 = spill5648_2;
        break forward_join_25;
    }
    if (!((spill5648_2 != null))) {
        break forward_join_58;
    }
    forwardValue5648_25_0 = (net.minecraft.potion.Potion.a)[p0];
    }
    life5_43 = forwardValue5648_25_0;
    spill5648_3 = life5_43;
    spill5648_4 = net.minecraft.potion.Potion.d;
    if (!((life4_5 != null))) {
        forwardValue5648_33_0 = spill5648_3;
        forwardValue5648_33_1 = spill5648_4;
        break forward_join_33;
    }
    if (!((spill5648_3 != spill5648_4))) {
        break forward_join_56;
    }
    forwardValue5648_33_0 = life5_43;
    forwardValue5648_33_1 = net.minecraft.potion.Potion.f;
    }
    if (!((life4_5 != null))) {
        forwardValue5648_38_0 = forwardValue5648_33_0;
        forwardValue5648_38_1 = forwardValue5648_33_1;
        break forward_join_38;
    }
    if (!((forwardValue5648_33_0 != forwardValue5648_33_1))) {
        break forward_join_56;
    }
    forwardValue5648_38_0 = life5_43;
    forwardValue5648_38_1 = net.minecraft.potion.Potion.n;
    }
    if (!((life4_5 != null))) {
        forwardValue5648_43_0 = forwardValue5648_38_0;
        forwardValue5648_43_1 = forwardValue5648_38_1;
        break forward_join_43;
    }
    if (!((forwardValue5648_38_0 != forwardValue5648_38_1))) {
        break forward_join_56;
    }
    forwardValue5648_43_0 = life5_43;
    forwardValue5648_43_1 = net.minecraft.potion.Potion.k;
    }
    if (!((life4_5 != null))) {
        forwardValue5648_48_0 = forwardValue5648_43_0;
        forwardValue5648_48_1 = forwardValue5648_43_1;
        break forward_join_48;
    }
    if (!((forwardValue5648_43_0 != forwardValue5648_43_1))) {
        break forward_join_56;
    }
    forwardValue5648_48_0 = life5_43;
    forwardValue5648_48_1 = net.minecraft.potion.Potion.h;
    }
    if (!((life4_5 != null))) {
        forwardValue5648_53_0 = forwardValue5648_48_0;
        forwardValue5648_53_1 = forwardValue5648_48_1;
        break forward_join_53;
    }
    if (!((forwardValue5648_48_0 != forwardValue5648_48_1))) {
        break forward_join_56;
    }
    forwardValue5648_53_0 = life5_43;
    forwardValue5648_53_1 = net.minecraft.potion.Potion.m;
    }
    if (!((forwardValue5648_53_0 != forwardValue5648_53_1))) {
        break forward_join_56;
    }
    forwardValue5648_57_0 = 0;
    break forward_join_57;
    }
    forwardValue5648_57_0 = p0;
    }
    return forwardValue5648_57_0;
    }
    forwardValue5648_59_0 = 0;
    }
    return forwardValue5648_59_0;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Primary")), ((int)(this.t)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Secondary")), ((int)(this.u)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Levels")), ((int)(this.s)));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public void b__Void() {
this.v = ((net.minecraft.item.ItemStack)(null));
    return;
}


public boolean e__Boolean() {
java.lang.String forwardValue5651_13_0;
    int forwardValue5651_18_0;
    int forwardValue5651_20_0;
    java.lang.String spill5651_0;
    int spill5651_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 98238804429838L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5651_0 = this.w;
    if (!((life3_5 != null))) {
        forwardValue5651_13_0 = spill5651_0;
        break forward_join_13;
    }
    if (!((spill5651_0 != null))) {
        break forward_join_19;
    }
    forwardValue5651_13_0 = this.w;
    }
    spill5651_1 = ((java.lang.String)(forwardValue5651_13_0)).length();
    if (!((life3_5 != null))) {
        forwardValue5651_18_0 = spill5651_1;
        break forward_join_18;
    }
    if (!((spill5651_1 > 0))) {
        break forward_join_19;
    }
    forwardValue5651_18_0 = 1;
    }
    forwardValue5651_20_0 = forwardValue5651_18_0;
    break forward_join_20;
    }
    forwardValue5651_20_0 = 0;
    }
    return ((forwardValue5651_20_0) != 0);
}


public void c__Void() {
net.minecraft.tileentity.TileEntityBeacon forwardValue5650_17_0;
    net.minecraft.tileentity.TileEntityBeacon spill5650_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 25162798704296L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5650_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5650_17_0 = spill5650_0;
        break forward_join_17;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityBeacon)(spill5650_0)).d)).b__Long() % net.minecraft.tileentity.TileEntityBeacon.D))), ((long)(0L))) == 0))) {
        break forward_join_18;
    }
    forwardValue5650_17_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityBeacon)(forwardValue5650_17_0)).g__sourceReturn_da8c82d5d4();
    }
    return;
}


public int c__Int() {
return 1;
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public java.lang.String c__String() {
return "minecraft:beacon";
}


private void h() {
int lexicalValue1688_13_0;
    int lexicalValue1688_19_0;
    int lexicalValue1688_24_0;
    int lexicalValue1688_41_0;
    int lexicalValue1688_63_0;
    int lexicalValue1688_152_0;
    int lexicalValue1688_152_1;
    int lexicalValue1688_155_0;
    boolean spill1688_0;
    int spill1688_1;
    int spill1688_2;
    int spill1688_3;
    int spill1688_4;
    int spill1688_5;
    long life1_3;
    java.lang.String[] life3_5;
    double life4_66;
    int life6_68;
    int life7_96;
    int life8_100;
    int life9_104;
    moom.CA life10_137;
    java.util.List life11_143;
    java.util.Iterator life12_146;
    net.minecraft.entity.player.EntityPlayer life13_153;
    java.util.Iterator life12_206;
    net.minecraft.entity.player.EntityPlayer life13_213;
    lexical_join_183: {
    lexical_join_155: {
    lexical_join_152: {
    lexical_join_140: {
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_41: {
    lexical_join_24: {
    lexical_join_19: {
    lexical_join_13: {
    life1_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 90436867197607L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1688_0 = this.r;
    if (!((life3_5 != null))) {
        lexicalValue1688_13_0 = ((spill1688_0) ? 1 : 0);
        break lexical_join_13;
    }
    if (!(spill1688_0)) {
        break lexical_join_183;
    }
    lexicalValue1688_13_0 = this.s;
    }
    if (!((life3_5 != null))) {
        lexicalValue1688_19_0 = lexicalValue1688_13_0;
        break lexical_join_19;
    }
    if (!((lexicalValue1688_13_0 > 0))) {
        break lexical_join_183;
    }
    lexicalValue1688_19_0 = ((((net.minecraft.world.World)(this.d)).G) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1688_24_0 = lexicalValue1688_19_0;
        break lexical_join_24;
    }
    if (!((lexicalValue1688_19_0 == 0))) {
        break lexical_join_183;
    }
    lexicalValue1688_24_0 = this.t;
    }
    if (!((life3_5 != null))) {
        lexicalValue1688_41_0 = lexicalValue1688_24_0;
        break lexical_join_41;
    }
    if (!((lexicalValue1688_24_0 > 0))) {
        break lexical_join_183;
    }
    lexicalValue1688_41_0 = ((this.s * __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_10(31853, (8442200415016336015L ^ life1_3))) + __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_11(78, (2557640568069867179L ^ life1_3)));
    }
    life4_66 = ((double) lexicalValue1688_41_0);
    life6_68 = 0;
    spill1688_1 = this.s;
    if (!((life3_5 != null))) {
        lexicalValue1688_63_0 = spill1688_1;
        break lexical_join_63;
    }
    if (!((spill1688_1 >= 4))) {
        break lexical_join_60;
    }
    spill1688_2 = this.t;
    if (!((life3_5 != null))) {
        lexicalValue1688_63_0 = spill1688_2;
        break lexical_join_63;
    }
    if (!((spill1688_2 == this.u))) {
        break lexical_join_60;
    }
    life6_68 = 1;
    }
    lexicalValue1688_63_0 = ((moom.DT)(this.e)).a();
    }
    life7_96 = lexicalValue1688_63_0;
    life8_100 = ((moom.DT)(this.e)).b();
    life9_104 = ((moom.DT)(this.e)).c();
    life10_137 = ((moom.CA)(((moom.CA)(new moom.CA(((double) life7_96), ((double) life8_100), ((double) life9_104), ((double) (life7_96 + 1)), ((double) (life8_100 + 1)), ((double) (life9_104 + 1))))).b(((double)(life4_66)), ((double)(life4_66)), ((double)(life4_66))))).a(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.world.World)(this.d)).d()))), ((double)(0x0.0p0d)));
    life11_143 = ((net.minecraft.world.World)(this.d)).a(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer.class)), ((moom.CA)(life10_137)));
    life12_146 = ((java.util.List)(life11_143)).iterator();
    lexical_cycle_114: while (true) {
    if (!(((java.util.Iterator)(life12_146)).hasNext())) {
        break lexical_join_140;
    }
    life13_153 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life12_146)).next()));
    ((net.minecraft.entity.player.EntityPlayer)(life13_153)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(this.t, __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_33(19126, (2741491409660021847L ^ life1_3)), life6_68, true, true))));
    if (!((life3_5 != null))) {
        break lexical_join_183;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_114; }
    break lexical_cycle_114;
    }
    }
    spill1688_3 = this.s;
    spill1688_4 = 4;
    if (!((life3_5 != null))) {
        lexicalValue1688_152_0 = spill1688_3;
        lexicalValue1688_152_1 = spill1688_4;
        break lexical_join_152;
    }
    if (!((spill1688_3 >= spill1688_4))) {
        break lexical_join_183;
    }
    spill1688_5 = this.t;
    if (!((life3_5 != null))) {
        lexicalValue1688_155_0 = spill1688_5;
        break lexical_join_155;
    }
    lexicalValue1688_152_0 = spill1688_5;
    lexicalValue1688_152_1 = this.u;
    }
    if (!((lexicalValue1688_152_0 != lexicalValue1688_152_1))) {
        break lexical_join_183;
    }
    lexicalValue1688_155_0 = this.u;
    }
    if (!((lexicalValue1688_155_0 > 0))) {
        break lexical_join_183;
    }
    life12_206 = ((java.util.List)(life11_143)).iterator();
    lexical_cycle_159: while (true) {
    if (!(((java.util.Iterator)(life12_206)).hasNext())) {
        break lexical_join_183;
    }
    life13_213 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life12_206)).next()));
    ((net.minecraft.entity.player.EntityPlayer)(life13_213)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(this.u, __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_44(32050, (4473524357307546577L ^ life1_3)), 0, true, true))));
    if (!((life3_5 == null))) { continue lexical_cycle_159; }
    break lexical_cycle_159;
    }
    }
    return;
}


public int d__Int() {
return 3;
}


public double d__sourceReturn_fedcb3e4d3() {
return 0x1.0p16d;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
int forwardValue575_20_0;
    int spill575_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_16: {
    forward_join_13: {
    forward_join_10: {
    life2_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 11039588159299L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill575_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue575_20_0 = spill575_0;
        break forward_join_20;
    }
    switch (spill575_0) {
case 0:
{
        break forward_join_10;
    }
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_16;
    }
default:
{
        break forward_join_19;
    }
}
    }
    return this.s;
    }
    return this.t;
    }
    return this.u;
    }
    forwardValue575_20_0 = 0;
    }
    return forwardValue575_20_0;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wa(p0, this);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12255_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Cj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(int p0, int p1) {
int forwardValue5644_19_0;
    int spill5644_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_19: {
    forward_join_15: {
    life3_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 17327668745242L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5644_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue5644_19_0 = spill5644_0;
        break forward_join_19;
    }
    if (!((spill5644_0 == 1))) {
        break forward_join_15;
    }
    ((net.minecraft.tileentity.TileEntityBeacon)(this)).g__sourceReturn_da8c82d5d4();
    return ((1) != 0);
    }
    forwardValue5644_19_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)))) ? 1 : 0);
    }
    return ((forwardValue5644_19_0) != 0);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1581;
      if (A[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = y[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Cj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


public void a__Void(int p0, int p1) {
long life3_3;
    java.lang.String[] life5_5;
    forward_join_27: {
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    forward_join_10: {
    life3_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 22023058188868L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((life5_5 != null))) {
        break forward_join_13;
    }
    switch (p0) {
case 0:
{
        break forward_join_10;
    }
case 1:
{
        break forward_join_15;
    }
case 2:
{
        break forward_join_22;
    }
default:
{
        break forward_join_27;
    }
}
    }
    this.s = ((int)(p1));
    }
    if (!((life5_5 == null))) {
        break forward_join_27;
    }
    }
    this.t = ((int)(((net.minecraft.tileentity.TileEntityBeacon)(this)).b__sourceReturn_0f7a48eca2(((int)(p1)))));
    if (!((life5_5 == null))) {
        break forward_join_27;
    }
    }
    this.u = ((int)(((net.minecraft.tileentity.TileEntityBeacon)(this)).b__sourceReturn_0f7a48eca2(((int)(p1)))));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.tileentity.TileEntityBeacon.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
net.minecraft.tileentity.TileEntityBeacon forwardValue5646_12_0;
    java.lang.String forwardValue5646_15_0;
    net.minecraft.tileentity.TileEntityBeacon spill5646_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 21065542992656L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5646_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5646_12_0 = spill5646_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityBeacon)(spill5646_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue5646_12_0 = this;
    }
    forwardValue5646_15_0 = ((net.minecraft.tileentity.TileEntityBeacon)(forwardValue5646_12_0)).w;
    break forward_join_15;
    }
    forwardValue5646_15_0 = "container.beacon";
    }
    return forwardValue5646_15_0;
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
long local3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 85103350742990L);
    if ((p0 == 0)) {
        this.v = ((net.minecraft.item.ItemStack)(p1));
    }
    return;
}


public moom.yK a__yK() {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.tileentity.TileEntityBeacon)(this)).b(((net.minecraft.nbt.NBTTagCompound)(local1)));
    return new moom.Am(this.e, 3, local1);
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
long life3_3;
    net.minecraft.item.ItemStack life5_22;
    life3_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 105823807756285L);
    if ((p0 == 0)) {
        if ((this.v != null)) {
        if ((p1 >= ((net.minecraft.item.ItemStack)(this.v)).b)) {
        life5_22 = this.v;
        this.v = ((net.minecraft.item.ItemStack)(null));
        return life5_22;
    }
        net.minecraft.item.ItemStack __stackOp5642_7_0 = this.v;
        ((net.minecraft.item.ItemStack)(__stackOp5642_7_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5642_7_0)).b - p1)));
        return new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(this.v)).a__wQ(), p1, ((net.minecraft.item.ItemStack)(this.v)).c());
    }
    }
    return null;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
long local2 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 62742253634510L);
    return ((p0 == 0) ? this.v : null);
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.t = ((int)(((net.minecraft.tileentity.TileEntityBeacon)(this)).b__sourceReturn_0f7a48eca2(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Primary"))))))));
    this.u = ((int)(((net.minecraft.tileentity.TileEntityBeacon)(this)).b__sourceReturn_0f7a48eca2(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Secondary"))))))));
    this.s = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Levels")))));
    return;
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.Item forwardValue5645_15_0;
    net.minecraft.item.Item forwardValue5645_15_1;
    net.minecraft.item.Item forwardValue5645_21_0;
    net.minecraft.item.Item forwardValue5645_21_1;
    net.minecraft.item.Item forwardValue5645_27_0;
    net.minecraft.item.Item forwardValue5645_27_1;
    int forwardValue5645_31_0;
    net.minecraft.item.Item spill5645_0;
    net.minecraft.item.Item spill5645_1;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    forward_join_27: {
    forward_join_21: {
    forward_join_15: {
    life3_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 50933665059879L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5645_0 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    spill5645_1 = net.minecraft.init.Items.bD;
    if (!((life5_5 != null))) {
        forwardValue5645_15_0 = spill5645_0;
        forwardValue5645_15_1 = spill5645_1;
        break forward_join_15;
    }
    if (!((spill5645_0 != spill5645_1))) {
        break forward_join_28;
    }
    forwardValue5645_15_0 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    forwardValue5645_15_1 = net.minecraft.init.Items.i;
    }
    if (!((life5_5 != null))) {
        forwardValue5645_21_0 = forwardValue5645_15_0;
        forwardValue5645_21_1 = forwardValue5645_15_1;
        break forward_join_21;
    }
    if (!((forwardValue5645_15_0 != forwardValue5645_15_1))) {
        break forward_join_28;
    }
    forwardValue5645_21_0 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    forwardValue5645_21_1 = net.minecraft.init.Items.k;
    }
    if (!((life5_5 != null))) {
        forwardValue5645_27_0 = forwardValue5645_21_0;
        forwardValue5645_27_1 = forwardValue5645_21_1;
        break forward_join_27;
    }
    if (!((forwardValue5645_21_0 != forwardValue5645_21_1))) {
        break forward_join_28;
    }
    forwardValue5645_27_0 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    forwardValue5645_27_1 = net.minecraft.init.Items.j;
    }
    if (!((forwardValue5645_27_0 == forwardValue5645_27_1))) {
        break forward_join_30;
    }
    }
    forwardValue5645_31_0 = 1;
    break forward_join_31;
    }
    forwardValue5645_31_0 = 0;
    }
    return ((forwardValue5645_31_0) != 0);
}


public java.util.List<moom.Cv> a__List() {
return this.o;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5643_39_0;
    int forwardValue5643_41_0;
    int spill5643_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    life2_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 56185333265729L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.world.World)(this.d)).a__B9(((moom.DT)(this.e))) == this))) {
        break forward_join_40;
    }
    spill5643_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(this.e)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.e)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.e)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 != null))) {
        forwardValue5643_39_0 = spill5643_0;
        break forward_join_39;
    }
    if (!((spill5643_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue5643_39_0 = 1;
    }
    forwardValue5643_41_0 = forwardValue5643_39_0;
    break forward_join_41;
    }
    forwardValue5643_41_0 = 0;
    }
    return ((forwardValue5643_41_0) != 0);
}


public void a(java.lang.String p0) {
this.w = ((java.lang.String)(p0));
    return;
}


public float a__sourceReturn_bc607678b6() {
int forwardValue5640_20_0;
    int forwardValue5640_62_0;
    float forwardValue5640_68_0;
    boolean spill5640_0;
    int spill5640_1;
    int spill5640_2;
    float spill5640_3;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_25;
    forward_join_68: {
    forward_join_66: {
    forward_join_62: {
    forward_join_50: {
    forward_join_20: {
    forward_join_13: {
    life1_3 = (net.minecraft.tileentity.TileEntityBeacon.x ^ 64926723704450L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5640_0 = this.r;
    if (!((life3_5 != null))) {
        forwardValue5640_20_0 = ((spill5640_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill5640_0))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue5640_20_0 = ((int) (((net.minecraft.world.World)(this.d)).b__Long() - this.p));
    }
    life4_25 = forwardValue5640_20_0;
    this.p = ((long)(((net.minecraft.world.World)(this.d)).b__Long()));
    spill5640_1 = life4_25;
    if (!((life3_5 != null))) {
        forwardValue5640_62_0 = spill5640_1;
        break forward_join_62;
    }
    if (!((spill5640_1 > 1))) {
        break forward_join_50;
    }
    net.minecraft.tileentity.TileEntityBeacon __stackOp5640_10_0 = this;
    ((net.minecraft.tileentity.TileEntityBeacon)(__stackOp5640_10_0)).q = ((float)((((net.minecraft.tileentity.TileEntityBeacon)(__stackOp5640_10_0)).q - (((float) life4_25) / 0x1.4p5f))));
    spill5640_2 = recovery.source.CarrierOps.fcmpg(((float)(this.q)), ((float)(0x0.0p0f)));
    if (!((life3_5 != null))) {
        forwardValue5640_62_0 = spill5640_2;
        break forward_join_62;
    }
    if (!((spill5640_2 < 0))) {
        break forward_join_50;
    }
    this.q = ((float)(0x0.0p0f));
    }
    net.minecraft.tileentity.TileEntityBeacon __stackOp5640_16_0 = this;
    ((net.minecraft.tileentity.TileEntityBeacon)(__stackOp5640_16_0)).q = ((float)((((net.minecraft.tileentity.TileEntityBeacon)(__stackOp5640_16_0)).q + 0x1.99999ap-6f)));
    spill5640_3 = this.q;
    if (!((life3_5 != null))) {
        forwardValue5640_68_0 = spill5640_3;
        break forward_join_68;
    }
    forwardValue5640_62_0 = recovery.source.CarrierOps.fcmpl(((float)(spill5640_3)), ((float)(0x1.0p0f)));
    }
    if (!((forwardValue5640_62_0 > 0))) {
        break forward_join_66;
    }
    this.q = ((float)(0x1.0p0f));
    }
    forwardValue5640_68_0 = this.q;
    }
    return forwardValue5640_68_0;
}


public void g__sourceReturn_da8c82d5d4() {
((net.minecraft.tileentity.TileEntityBeacon)(this)).i();
    ((net.minecraft.tileentity.TileEntityBeacon)(this)).h();
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12255_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a33ceaa00d22_invokedynamic1688_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c85abf990348_invokedynamic1689_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c85abf990348_invokedynamic1689_31(int a0, long a1) throws E;
}
