package net.minecraft.item;


public class ItemArmor$ArmorMaterial extends sourcebuild.EnumConstructor<net.minecraft.item.ItemArmor$ArmorMaterial> {

public static net.minecraft.item.ItemArmor$ArmorMaterial LEATHER;

public static net.minecraft.item.ItemArmor$ArmorMaterial CHAIN;

public static net.minecraft.item.ItemArmor$ArmorMaterial IRON;

public static net.minecraft.item.ItemArmor$ArmorMaterial GOLD;

public static net.minecraft.item.ItemArmor$ArmorMaterial DIAMOND;

private java.lang.String a;

private int b;

private int[] c;

private int d;

private static net.minecraft.item.ItemArmor$ArmorMaterial[] e;

private static long f;

private ItemArmor$ArmorMaterial(java.lang.String p0, int p1, java.lang.String p2, int p3, int[] p4, int p5) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
    this.d = p5;
}


private static void initialize() {
javax.crypto.Cipher forestValue400026_31_0;
    int forestValue400026_31_1;
    javax.crypto.SecretKeyFactory forestValue400026_31_2;
    byte[] forestValue400026_31_3;
    javax.crypto.Cipher forestValue400026_48_0;
    int forestValue400026_48_1;
    javax.crypto.SecretKeyFactory forestValue400026_48_2;
    byte[] forestValue400026_48_3;
    long[] forestValue400026_152_0;
    int forestValue400026_152_1;
    long forestValue400026_152_2;
    int forestValue400026_152_3;
    long[] forestValue400026_295_0;
    int forestValue400026_295_1;
    long forestValue400026_295_2;
    long[] forestValue400026_307_0;
    int forestValue400026_307_1;
    long forestValue400026_307_2;
    javax.crypto.Cipher spill400026_0;
    int spill400026_1;
    javax.crypto.SecretKeyFactory spill400026_2;
    byte[] spill400026_3;
    byte[] spill400026_4;
    java.lang.String spill400026_5;
    int spill400026_6;
    int spill400026_7;
    long spill400026_8;
    long spill400026_9;
    int spill400026_10;
    java.lang.String spill400026_11;
    int spill400026_12;
    long[] spill400026_13;
    int spill400026_14;
    long spill400026_15;
    int spill400026_16;
    long life11_11;
    javax.crypto.Cipher life1_15;
    int life2_30;
    long[] life0_61;
    int life4_63;
    java.lang.String life5_66;
    int life6_68;
    int life3_70;
    byte[] life7_78;
    long life8_155;
    byte[] life10_223;
    byte[] life7_320;
    forest_join_394: {
    forest_join_48: {
    f = ((long)(((moom._a)(moom._c.a(((long)(2734163455971121993L)), ((long)(4901737680053399673L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(56826501524127L)))));
    life11_11 = (net.minecraft.item.ItemArmor$ArmorMaterial.f ^ 134906079819993L);
    spill400026_0 = (life1_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill400026_1 = 2;
    spill400026_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400026_8_0 = new byte[8];
    spill400026_3 = __stackOp400026_8_0;
    (__stackOp400026_8_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life2_30 = 1;
    forestValue400026_31_0 = spill400026_0;
    forestValue400026_31_1 = spill400026_1;
    forestValue400026_31_2 = spill400026_2;
    forestValue400026_31_3 = spill400026_3;
    forest_cycle_31: while (true) {
    if (!((life2_30 < 8))) {
        forestValue400026_48_0 = forestValue400026_31_0;
        forestValue400026_48_1 = forestValue400026_31_1;
        forestValue400026_48_2 = forestValue400026_31_2;
        forestValue400026_48_3 = forestValue400026_31_3;
        break forest_join_48;
    }
    byte[] __stackOp400026_9_0 = forestValue400026_31_3;
    spill400026_4 = __stackOp400026_9_0;
    (__stackOp400026_9_0)[life2_30] = ((byte) ((int) ((life11_11 << (life2_30 * 8)) >>> 56)));
    life2_30 += 1;
    forestValue400026_31_3 = spill400026_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue400026_48_0)).init(((int)(forestValue400026_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400026_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400026_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life0_61 = new long[11];
    life4_63 = 0;
    life6_68 = ((java.lang.String)((life5_66 = "\030\013\r6Â±wdcºßIÃR0`!ìA¤¨Ôöàa;\005Ô[\000Úùv\007ä3\031Þî\f|\\¶Ò3äI\032\006Ã\003]í\017ëüñ\022  ºNÈÅªR"))).length();
    life3_70 = 0;
    forest_cycle_71: while (true) {
    spill400026_5 = life5_66;
    spill400026_6 = life3_70;
    life3_70 += 8;
    life7_78 = ((java.lang.String)(((java.lang.String)(spill400026_5)).substring(((int)(spill400026_6)), ((int)(life3_70))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue400026_152_0 = life0_61;
    forestValue400026_152_1 = (life4_63++);
    forestValue400026_152_2 = (((((((((((long) (life7_78)[0]) & 255L) << 56) | ((((long) (life7_78)[1]) & 255L) << 48)) | ((((long) (life7_78)[2]) & 255L) << 40)) | ((((long) (life7_78)[3]) & 255L) << 32)) | ((((long) (life7_78)[4]) & 255L) << 24)) | ((((long) (life7_78)[5]) & 255L) << 16)) | ((((long) (life7_78)[6]) & 255L) << 8)) | (((long) (life7_78)[7]) & 255L));
    forestValue400026_152_3 = -1;
    forest_cycle_152: while (true) {
    forest_join_312: {
    forest_join_307: {
    forest_join_295: {
    long __stackOp400026_15_0 = forestValue400026_152_2;
    int __stackOp400026_15_1 = forestValue400026_152_3;
    spill400026_7 = __stackOp400026_15_1;
    spill400026_8 = __stackOp400026_15_0;
    recovery.source.CarrierOps.discard(__stackOp400026_15_1);
    life8_155 = spill400026_8;
    byte[] __stackOp400026_17_0 = new byte[] {((byte) ((int) (life8_155 >>> 56))), ((byte) ((int) (life8_155 >>> 48))), ((byte) ((int) (life8_155 >>> 40))), ((byte) ((int) (life8_155 >>> 32))), ((byte) ((int) (life8_155 >>> 24))), ((byte) ((int) (life8_155 >>> 16))), ((byte) ((int) (life8_155 >>> 8))), ((byte) ((int) life8_155))};
    javax.crypto.Cipher __stackOp400026_17_1 = life1_15;
    life10_223 = ((javax.crypto.Cipher)(__stackOp400026_17_1)).doFinal(((byte[])(__stackOp400026_17_0)));
    int __stackOp400026_19_0 = spill400026_7;
    long __stackOp400026_19_1 = (((((((((((long) (life10_223)[0]) & 255L) << 56) | ((((long) (life10_223)[1]) & 255L) << 48)) | ((((long) (life10_223)[2]) & 255L) << 40)) | ((((long) (life10_223)[3]) & 255L) << 32)) | ((((long) (life10_223)[4]) & 255L) << 24)) | ((((long) (life10_223)[5]) & 255L) << 16)) | ((((long) (life10_223)[6]) & 255L) << 8)) | (((long) (life10_223)[7]) & 255L));
    spill400026_9 = __stackOp400026_19_1;
    spill400026_10 = __stackOp400026_19_0;
    recovery.source.CarrierOps.discard(__stackOp400026_19_1);
    switch (spill400026_10) {
default:
{
        forestValue400026_295_0 = forestValue400026_152_0;
        forestValue400026_295_1 = forestValue400026_152_1;
        forestValue400026_295_2 = spill400026_9;
        break forest_join_295;
    }
case 0:
{
        forestValue400026_307_0 = forestValue400026_152_0;
        forestValue400026_307_1 = forestValue400026_152_1;
        forestValue400026_307_2 = spill400026_9;
        break forest_join_307;
    }
}
    }
    (forestValue400026_295_0)[forestValue400026_295_1] = forestValue400026_295_2;
    if (!((life3_70 >= life6_68))) {
        continue forest_cycle_71;
    }
    life6_68 = ((java.lang.String)((life5_66 = "\"51Ü\020ÅßB-\016Ä\013EÁ"))).length();
    life3_70 = 0;
    break forest_join_312;
    }
    (forestValue400026_307_0)[forestValue400026_307_1] = forestValue400026_307_2;
    if (!((life3_70 >= life6_68))) {
        break forest_join_312;
    }
    break forest_join_394;
    }
    spill400026_11 = life5_66;
    spill400026_12 = life3_70;
    life3_70 += 8;
    life7_320 = ((java.lang.String)(((java.lang.String)(spill400026_11)).substring(((int)(spill400026_12)), ((int)(life3_70))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill400026_13 = life0_61;
    spill400026_14 = (life4_63++);
    spill400026_15 = (((((((((((long) (life7_320)[0]) & 255L) << 56) | ((((long) (life7_320)[1]) & 255L) << 48)) | ((((long) (life7_320)[2]) & 255L) << 40)) | ((((long) (life7_320)[3]) & 255L) << 32)) | ((((long) (life7_320)[4]) & 255L) << 24)) | ((((long) (life7_320)[5]) & 255L) << 16)) | ((((long) (life7_320)[6]) & 255L) << 8)) | (((long) (life7_320)[7]) & 255L));
    spill400026_16 = 0;
    forestValue400026_152_0 = spill400026_13;
    forestValue400026_152_1 = spill400026_14;
    forestValue400026_152_2 = spill400026_15;
    forestValue400026_152_3 = spill400026_16;
    continue forest_cycle_152;
    }
    }
    }
    LEATHER = ((net.minecraft.item.ItemArmor$ArmorMaterial)(new net.minecraft.item.ItemArmor$ArmorMaterial("LEATHER", 0, "leather", 5, new int[] {1, 3, 2, 1}, ((int) (life0_61)[9]))));
    CHAIN = ((net.minecraft.item.ItemArmor$ArmorMaterial)(new net.minecraft.item.ItemArmor$ArmorMaterial("CHAIN", 1, "chainmail", ((int) (life0_61)[0]), new int[] {2, 5, 4, 1}, ((int) (life0_61)[7]))));
    IRON = ((net.minecraft.item.ItemArmor$ArmorMaterial)(new net.minecraft.item.ItemArmor$ArmorMaterial("IRON", 2, "iron", ((int) (life0_61)[0]), new int[] {2, ((int) (life0_61)[3]), 5, 2}, ((int) (life0_61)[1]))));
    GOLD = ((net.minecraft.item.ItemArmor$ArmorMaterial)(new net.minecraft.item.ItemArmor$ArmorMaterial("GOLD", 3, "gold", ((int) (life0_61)[4]), new int[] {2, 5, 3, 1}, ((int) (life0_61)[2]))));
    DIAMOND = ((net.minecraft.item.ItemArmor$ArmorMaterial)(new net.minecraft.item.ItemArmor$ArmorMaterial("DIAMOND", 4, "diamond", ((int) (life0_61)[6]), new int[] {3, ((int) (life0_61)[8]), ((int) (life0_61)[5]), 3}, ((int) (life0_61)[10]))));
    e = ((net.minecraft.item.ItemArmor$ArmorMaterial[])(net.minecraft.item.ItemArmor$ArmorMaterial.a__Arraya5()));
}


public static net.minecraft.item.ItemArmor$ArmorMaterial[] values() {
return ((net.minecraft.item.ItemArmor$ArmorMaterial[])(((net.minecraft.item.ItemArmor$ArmorMaterial[])(net.minecraft.item.ItemArmor$ArmorMaterial.e)).clone()));
}


public static net.minecraft.item.ItemArmor$ArmorMaterial valueOf(java.lang.String p0) {
return ((net.minecraft.item.ItemArmor$ArmorMaterial)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.item.ItemArmor$ArmorMaterial.class)), ((java.lang.String)(p0)))));
}


public int b(int p0) {
return (this.c)[p0];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.item.ItemArmor$ArmorMaterial[] a__Arraya5() {
return new net.minecraft.item.ItemArmor$ArmorMaterial[] {net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER, net.minecraft.item.ItemArmor$ArmorMaterial.CHAIN, net.minecraft.item.ItemArmor$ArmorMaterial.IRON, net.minecraft.item.ItemArmor$ArmorMaterial.GOLD, net.minecraft.item.ItemArmor$ArmorMaterial.DIAMOND};
}


public java.lang.String a__String() {
return this.a;
}


public net.minecraft.item.Item a__wQ() {
net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_15_0;
    net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_15_1;
    net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_22_0;
    net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_22_1;
    net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_29_0;
    net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_29_1;
    net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_36_0;
    net.minecraft.item.ItemArmor$ArmorMaterial forwardValue5471_36_1;
    net.minecraft.item.Item forwardValue5471_40_0;
    net.minecraft.item.ItemArmor$ArmorMaterial spill5471_0;
    net.minecraft.item.ItemArmor$ArmorMaterial spill5471_1;
    long life1_3;
    int life3_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_36: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    forward_join_22: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.item.ItemArmor$ArmorMaterial.f ^ 122417117320677L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5471_0 = this;
    spill5471_1 = net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER;
    if (!((life3_5 == 0))) {
        forwardValue5471_15_0 = spill5471_0;
        forwardValue5471_15_1 = spill5471_1;
        break forward_join_15;
    }
    if (!((spill5471_0 == spill5471_1))) {
        break forward_join_13;
    }
    forwardValue5471_40_0 = net.minecraft.init.Items.aF;
    break forward_join_40;
    }
    forwardValue5471_15_0 = this;
    forwardValue5471_15_1 = net.minecraft.item.ItemArmor$ArmorMaterial.CHAIN;
    }
    if (!((life3_5 == 0))) {
        forwardValue5471_22_0 = forwardValue5471_15_0;
        forwardValue5471_22_1 = forwardValue5471_15_1;
        break forward_join_22;
    }
    if (!((forwardValue5471_15_0 == forwardValue5471_15_1))) {
        break forward_join_20;
    }
    forwardValue5471_40_0 = net.minecraft.init.Items.j;
    break forward_join_40;
    }
    forwardValue5471_22_0 = this;
    forwardValue5471_22_1 = net.minecraft.item.ItemArmor$ArmorMaterial.GOLD;
    }
    if (!((life3_5 == 0))) {
        forwardValue5471_29_0 = forwardValue5471_22_0;
        forwardValue5471_29_1 = forwardValue5471_22_1;
        break forward_join_29;
    }
    if (!((forwardValue5471_22_0 == forwardValue5471_22_1))) {
        break forward_join_27;
    }
    forwardValue5471_40_0 = net.minecraft.init.Items.k;
    break forward_join_40;
    }
    forwardValue5471_29_0 = this;
    forwardValue5471_29_1 = net.minecraft.item.ItemArmor$ArmorMaterial.IRON;
    }
    if (!((life3_5 == 0))) {
        forwardValue5471_36_0 = forwardValue5471_29_0;
        forwardValue5471_36_1 = forwardValue5471_29_1;
        break forward_join_36;
    }
    if (!((forwardValue5471_29_0 == forwardValue5471_29_1))) {
        break forward_join_34;
    }
    forwardValue5471_40_0 = net.minecraft.init.Items.j;
    break forward_join_40;
    }
    forwardValue5471_36_0 = this;
    forwardValue5471_36_1 = net.minecraft.item.ItemArmor$ArmorMaterial.DIAMOND;
    }
    if (!((forwardValue5471_36_0 == forwardValue5471_36_1))) {
        break forward_join_39;
    }
    forwardValue5471_40_0 = net.minecraft.init.Items.i;
    break forward_join_40;
    }
    forwardValue5471_40_0 = null;
    }
    return forwardValue5471_40_0;
}


public int a() {
return this.d;
}


public int a(int p0) {
return ((net.minecraft.item.ItemArmor.n)[p0] * this.b);
}

}
