package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityArmorStand extends net.minecraft.entity.EntityLivingBase {

private static final net.minecraft.util.Rotations bC;

private static final net.minecraft.util.Rotations bD;

private static final net.minecraft.util.Rotations bE;

private static final net.minecraft.util.Rotations bF;

private static final net.minecraft.util.Rotations bG;

private static final net.minecraft.util.Rotations bH;

private final net.minecraft.item.ItemStack[] bI;

private boolean bJ;

private long bK;

private int bL;

private boolean bM;

private net.minecraft.util.Rotations bN;

private net.minecraft.util.Rotations bO;

private net.minecraft.util.Rotations bP;

private net.minecraft.util.Rotations bQ;

private net.minecraft.util.Rotations bR;

private net.minecraft.util.Rotations bS;

private static final long cb;

private static final long[] db;

private static final java.lang.Integer[] eb;

private static final java.util.Map gb;

private static final long ib;

public EntityArmorStand(net.minecraft.world.World p0) {
super(p0);
    this.bI = new net.minecraft.item.ItemStack[5];
    this.bN = net.minecraft.entity.item.EntityArmorStand.bC;
    this.bO = net.minecraft.entity.item.EntityArmorStand.bD;
    this.bP = net.minecraft.entity.item.EntityArmorStand.bE;
    this.bQ = net.minecraft.entity.item.EntityArmorStand.bF;
    this.bR = net.minecraft.entity.item.EntityArmorStand.bG;
    this.bS = net.minecraft.entity.item.EntityArmorStand.bH;
    (this).a__Void(true);
    this.Q = (this).N__Boolean();
    (this).a__Void(0x1.0000000000000p-1f, 0x1.f9999a0000000p+0f);
}


public EntityArmorStand(net.minecraft.world.World p0, double p1, double p2, double p3) {
this(p0);
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(130459465586547816L)), ((long)(-1679926169096005691L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147955541667858L)))));
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 139766404230103L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill1191_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1191_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1191_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1191_14 = new byte[8];
    (__sourceSpill1191_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill1191_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation1191_16 = __sourceSpill1191_14;
    ((javax.crypto.Cipher)(__sourceSpill1191_11)).init(((int)(__sourceSpill1191_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1191_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1191_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[24];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "Éïuö\037Ð+¤?ß]VÀOháÞ\f¦\013Ý2\006c~ÿ¯¿Ñ:>Ó\tîëÍÐýUXTÓHËc;JÍ\032B]¹ØyËEÊx×Ý\021à\000\020¹µ¾ºXf½ÊJ\004gE¤ã!\016\016\t41zÃIâÙ¬F\"=ò\033\r:R¸3,\000(Û\002ÑH#ÀÓx\005â½í Ï!Õ|D}K\003e\031®\036¦°Ò#(Êû\037öÜO¶Å|»ÉJ,í\024\024Å{2¼\1771¬©ö\037\007»"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1191_25 = local11_life21;
        int __sourceSpill1191_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1191_25)).substring(((int)(__sourceSpill1191_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1191_30 = local13_life19;
        int __sourceSpill1191_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill1191_33 = new byte[8];
        (__sourceSpill1191_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill1191_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill1191_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill1191_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill1191_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill1191_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill1191_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill1191_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill1191_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill1191_34)).doFinal(((byte[])(__sourceSpill1191_33)));
        (__sourceSpill1191_30)[__sourceSpill1191_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "\036³È<\t\023¾õC[°/@qfl"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1191_38 = local11_life21;
        int __sourceSpill1191_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1191_38)).substring(((int)(__sourceSpill1191_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1191_43 = local13_life19;
        int __sourceSpill1191_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill1191_46 = new byte[8];
        (__sourceSpill1191_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill1191_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill1191_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill1191_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill1191_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill1191_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill1191_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill1191_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill1191_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill1191_47)).doFinal(((byte[])(__sourceSpill1191_46)));
        (__sourceSpill1191_43)[__sourceSpill1191_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    db = ((long[])(local13_life19));
    eb = ((java.lang.Integer[])(new java.lang.Integer[24]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill1191_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1191_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1191_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1191_58 = new byte[8];
    (__sourceSpill1191_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill1191_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation1191_60 = __sourceSpill1191_58;
    ((javax.crypto.Cipher)(__sourceSpill1191_55)).init(((int)(__sourceSpill1191_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1191_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1191_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = 3973784090387419261L;
    byte[] __sourceSpill1191_64 = new byte[8];
    (__sourceSpill1191_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill1191_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill1191_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill1191_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill1191_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill1191_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill1191_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill1191_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill1191_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill1191_65)).doFinal(((byte[])(__sourceSpill1191_64)));
    ib = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
    bC = ((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(0x0.0p0f, 0x0.0p0f, 0x0.0p0f)));
    bD = ((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(0x0.0p0f, 0x0.0p0f, 0x0.0p0f)));
    bE = ((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(-0x1.4p3f, 0x0.0p0f, -0x1.4p3f)));
    bF = ((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(-0x1.ep3f, 0x0.0p0f, 0x1.4p3f)));
    bG = ((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(-0x1.0p0f, 0x0.0p0f, -0x1.0p0f)));
    bH = ((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(0x1.0p0f, 0x0.0p0f, 0x1.0p0f)));
}


protected void I() {
java.util.List lexicalValue1569_18_0;
    java.util.List lexicalValue1569_23_0;
    net.minecraft.entity.Entity lexicalValue1569_38_0;
    net.minecraft.entity.Entity lexicalValue1569_51_0;
    int spill1569_0;
    java.util.List spill1569_1;
    net.minecraft.entity.Entity spill1569_2;
    net.minecraft.entity.item.EntityArmorStand spill1569_3;
    long life1_3;
    java.util.List life4_11;
    int life3_12;
    java.util.Iterator life5_33;
    net.minecraft.entity.Entity life6_40;
    lexical_join_55: {
    lexical_join_23: {
    lexical_join_18: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 16827340768031L);
    spill1569_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_11 = ((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.item.EntityArmorStand)(this)).b())));
    life3_12 = spill1569_0;
    spill1569_1 = life4_11;
    if (!((life3_12 == 0))) {
        lexicalValue1569_18_0 = spill1569_1;
        break lexical_join_18;
    }
    if (!((spill1569_1 != null))) {
        break lexical_join_55;
    }
    lexicalValue1569_18_0 = life4_11;
    }
    if (!((life3_12 == 0))) {
        lexicalValue1569_23_0 = lexicalValue1569_18_0;
        break lexical_join_23;
    }
    if (!((!((java.util.List)(lexicalValue1569_18_0)).isEmpty()))) {
        break lexical_join_55;
    }
    lexicalValue1569_23_0 = life4_11;
    }
    life5_33 = ((java.util.List)(lexicalValue1569_23_0)).iterator();
    lexical_cycle_25: while (true) {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_38: {
    if (!(((java.util.Iterator)(life5_33)).hasNext())) {
        break lexical_join_55;
    }
    life6_40 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life5_33)).next()));
    spill1569_2 = life6_40;
    if (!((life3_12 == 0))) {
        lexicalValue1569_38_0 = spill1569_2;
        break lexical_join_38;
    }
    if (!((((spill1569_2 instanceof net.minecraft.entity.item.EntityMinecart) ? 1 : 0) != 0))) {
        break lexical_join_53;
    }
    lexicalValue1569_38_0 = life6_40;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(((net.minecraft.entity.item.EntityMinecart)(lexicalValue1569_38_0)))).a__aT() == net.minecraft.entity.item.EntityMinecart$EnumMinecartType.RIDEABLE))) {
        break lexical_join_53;
    }
    spill1569_3 = this;
    if (!((life3_12 == 0))) {
        lexicalValue1569_51_0 = spill1569_3;
        break lexical_join_51;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.item.EntityArmorStand)(spill1569_3)).a(((net.minecraft.entity.Entity)(life6_40))))), ((double)(0x1.999999999999ap-3d))) <= 0))) {
        break lexical_join_53;
    }
    lexicalValue1569_51_0 = life6_40;
    }
    ((net.minecraft.entity.Entity)(lexicalValue1569_51_0)).a__Void(((net.minecraft.entity.Entity)(this)));
    }
    if (!((life3_12 != 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return;
}


private void i(boolean p0) {
long life2_3;
    double life5_7;
    double life7_10;
    double life9_13;
    int life4_14;
    forward_join_29: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 43624796292758L);
    int spill5681_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_7 = this.n;
    life7_10 = this.o;
    life9_13 = this.p;
    life4_14 = spill5681_0;
    if (!((life4_14 == 0))) { break forward_join_23; }
    if (!(p0)) { break forward_join_25; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a__Void(((float)(0x1.0p-1f)), ((float)(0x1.f9999ap0f)));
    }
    if (!((life4_14 != 0))) { break forward_join_29; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a__Void(((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a__Void(((double)(life5_7)), ((double)(life7_10)), ((double)(life9_13)));
    return;
}


public void b(net.minecraft.util.Rotations p0) {
long local2 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 36603711022279L);
    this.bO = ((net.minecraft.util.Rotations)(p0));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_6f1936852fa2_originalDynamicSite1895_3(16001, (5980687939512525346L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


public boolean b__Boolean(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5034_27_0;
    int forwardValue5034_27_1;
    int forwardValue5034_41_0;
    net.minecraft.item.ItemStack forwardValue5034_47_0;
    int forwardValue5034_64_0;
    int forwardValue5034_70_0;
    int spill5034_0;
    int spill5034_1;
    int spill5034_2;
    int spill5034_3;
    net.minecraft.item.ItemStack spill5034_4;
    int spill5034_5;
    int spill5034_6;
    int spill5034_7;
    long life3_3;
    int life5_5;
    int life6_19;
    forward_join_70: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_47: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_27: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 31640635255325L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5034_0 = p0;
    spill5034_1 = __sourceIntrinsic_7722627b66bb_invokedynamic5034_2(20498, (5932092923870888575L ^ life3_3));
    if (!((life5_5 != 0))) {
        forwardValue5034_27_0 = spill5034_0;
        forwardValue5034_27_1 = spill5034_1;
        break forward_join_27;
    }
    if (!((spill5034_0 == spill5034_1))) {
        break forward_join_19;
    }
    life6_19 = 0;
    if (!((life5_5 == 0))) {
        break forward_join_42;
    }
    }
    forwardValue5034_27_0 = (p0 - __sourceIntrinsic_7722627b66bb_invokedynamic5034_3(17315, (4699010664288309711L ^ life3_3)));
    forwardValue5034_27_1 = 1;
    }
    life6_19 = (forwardValue5034_27_0 + forwardValue5034_27_1);
    spill5034_2 = life6_19;
    if (!((life5_5 != 0))) {
        forwardValue5034_41_0 = spill5034_2;
        break forward_join_41;
    }
    if (!((spill5034_2 >= 0))) {
        break forward_join_40;
    }
    spill5034_3 = life6_19;
    if (!((life5_5 != 0))) {
        forwardValue5034_41_0 = spill5034_3;
        break forward_join_41;
    }
    if (!((spill5034_3 >= (this.bI).length))) {
        break forward_join_42;
    }
    }
    forwardValue5034_41_0 = 0;
    }
    return ((forwardValue5034_41_0) != 0);
    }
    spill5034_4 = p1;
    if (!((life5_5 != 0))) {
        forwardValue5034_47_0 = spill5034_4;
        break forward_join_47;
    }
    if (!((spill5034_4 != null))) {
        break forward_join_65;
    }
    forwardValue5034_47_0 = p1;
    }
    spill5034_5 = net.minecraft.entity.EntityLiving.a(((net.minecraft.item.ItemStack)(forwardValue5034_47_0)));
    if (!((life5_5 != 0))) {
        forwardValue5034_70_0 = spill5034_5;
        break forward_join_70;
    }
    if (!((spill5034_5 != life6_19))) {
        break forward_join_65;
    }
    spill5034_6 = life6_19;
    if (!((life5_5 != 0))) {
        forwardValue5034_64_0 = spill5034_6;
        break forward_join_64;
    }
    if (!((spill5034_6 == 4))) {
        break forward_join_63;
    }
    spill5034_7 = ((((net.minecraft.item.ItemStack)(p1)).a__wQ() instanceof moom.wU) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5034_70_0 = spill5034_7;
        break forward_join_70;
    }
    if (!((spill5034_7 == 0))) {
        break forward_join_65;
    }
    }
    forwardValue5034_64_0 = 0;
    }
    return ((forwardValue5034_64_0) != 0);
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((int)(life6_19)), ((net.minecraft.item.ItemStack)(p1)));
    forwardValue5034_70_0 = 1;
    }
    return ((forwardValue5034_70_0) != 0);
}


public net.minecraft.util.Rotations b__sourceReturn_6a331ccf0b() {
return this.bO;
}


private net.minecraft.nbt.NBTTagCompound b__yw() {
int forwardValue5035_27_0;
    int forwardValue5035_40_0;
    int forwardValue5035_53_0;
    int forwardValue5035_66_0;
    int forwardValue5035_79_0;
    int spill5035_0;
    boolean spill5035_1;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_8;
    int life3_9;
    forward_join_86: {
    forward_join_79: {
    forward_join_75: {
    forward_join_66: {
    forward_join_62: {
    forward_join_53: {
    forward_join_49: {
    forward_join_40: {
    forward_join_36: {
    forward_join_27: {
    forward_join_23: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 105254688332697L);
    spill5035_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_8 = new net.minecraft.nbt.NBTTagCompound();
    life3_9 = spill5035_0;
    spill5035_1 = ((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bC)).equals(((java.lang.Object)(this.bN)));
    if (!((life3_9 == 0))) {
        forwardValue5035_27_0 = ((spill5035_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!((!spill5035_1))) {
        break forward_join_23;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("Head")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.util.Rotations)(this.bN)).a__yz())));
    }
    forwardValue5035_27_0 = ((((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bD)).equals(((java.lang.Object)(this.bO)))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue5035_40_0 = forwardValue5035_27_0;
        break forward_join_40;
    }
    if (!((forwardValue5035_27_0 == 0))) {
        break forward_join_36;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("Body")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.util.Rotations)(this.bO)).a__yz())));
    }
    forwardValue5035_40_0 = ((((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bE)).equals(((java.lang.Object)(this.bP)))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue5035_53_0 = forwardValue5035_40_0;
        break forward_join_53;
    }
    if (!((forwardValue5035_40_0 == 0))) {
        break forward_join_49;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("LeftArm")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.util.Rotations)(this.bP)).a__yz())));
    }
    forwardValue5035_53_0 = ((((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bF)).equals(((java.lang.Object)(this.bQ)))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue5035_66_0 = forwardValue5035_53_0;
        break forward_join_66;
    }
    if (!((forwardValue5035_53_0 == 0))) {
        break forward_join_62;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("RightArm")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.util.Rotations)(this.bQ)).a__yz())));
    }
    forwardValue5035_66_0 = ((((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bG)).equals(((java.lang.Object)(this.bR)))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue5035_79_0 = forwardValue5035_66_0;
        break forward_join_79;
    }
    if (!((forwardValue5035_66_0 == 0))) {
        break forward_join_75;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("LeftLeg")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.util.Rotations)(this.bR)).a__yz())));
    }
    forwardValue5035_79_0 = ((((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bH)).equals(((java.lang.Object)(this.bS)))) ? 1 : 0);
    }
    if (!((forwardValue5035_79_0 == 0))) {
        break forward_join_86;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("RightLeg")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.util.Rotations)(this.bS)).a__yz())));
    }
    return life4_8;
}


public void b(int p0, net.minecraft.item.ItemStack p1) {
(this.bI)[p0] = p1;
    return;
}


public net.minecraft.item.ItemStack b__sourceReturn_7f6f0b7f03(int p0) {
return (this.bI)[(p0 + 1)];
}


public float e__Float() {
net.minecraft.entity.item.EntityArmorStand forwardValue5039_17_0;
    float forwardValue5039_20_0;
    net.minecraft.entity.item.EntityArmorStand spill5039_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 54873466041444L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5039_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5039_17_0 = spill5039_0;
        break forward_join_17;
    }
    if (!(((net.minecraft.entity.item.EntityArmorStand)(spill5039_0)).c__Boolean())) {
        break forward_join_16;
    }
    forwardValue5039_20_0 = (this.H * 0x1.0p-1f);
    break forward_join_20;
    }
    forwardValue5039_17_0 = this;
    }
    forwardValue5039_20_0 = (((net.minecraft.entity.item.EntityArmorStand)(forwardValue5039_17_0)).H * 0x1.ccccccp-1f);
    }
    return forwardValue5039_20_0;
}


public void e(float p0, float p1) {
net.minecraft.entity.item.EntityArmorStand forwardValue5038_12_0;
    net.minecraft.entity.item.EntityArmorStand spill5038_0;
    long life3_3;
    int life5_5;
    forward_join_15: {
    forward_join_12: {
    life3_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 136752800845042L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5038_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5038_12_0 = spill5038_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.entity.item.EntityArmorStand)(spill5038_0)).N__Boolean()))) {
        break forward_join_15;
    }
    forwardValue5038_12_0 = this;
    }
    __sourceIntrinsic_c23f50d43b1e_call5038_3(forwardValue5038_12_0, p0, p1);
    }
    return;
}


public net.minecraft.util.Rotations e__DF() {
return this.bR;
}


public void e(net.minecraft.util.Rotations p0) {
long local2 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 13346489081722L);
    this.bR = ((net.minecraft.util.Rotations)(p0));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_9db2f8c4e3f7_originalDynamicSite1896_3(30844, (4924256175832653664L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


protected void x() {
((net.minecraft.entity.item.EntityArmorStand)(this)).d(((boolean)__sourceIntrinsic_integerToBoolean((((this.bJ) ? 1 : 0)))));
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral11313_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.item.EntityArmorStand.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8450;
      if (eb[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])gb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               gb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


public void c(net.minecraft.util.Rotations p0) {
long local2 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 121476662693652L);
    this.bP = ((net.minecraft.util.Rotations)(p0));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_04856e8b6ecf_originalDynamicSite1897_3(16103, (3972837587651299712L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


public void c__Void() {
((net.minecraft.entity.item.EntityArmorStand)(this)).f__Void();
    return;
}


public net.minecraft.util.Rotations c__sourceReturn_6a331ccf0b() {
return this.bP;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.item.EntityArmorStand)(this)).M())) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.item.EntityArmorStand lexicalValue1571_91_0;
    int lexicalValue1571_91_1;
    net.minecraft.entity.item.EntityArmorStand lexicalValue1571_92_0;
    net.minecraft.entity.item.EntityArmorStand lexicalValue1571_93_0;
    int lexicalValue1571_93_1;
    int spill1571_0;
    net.minecraft.entity.item.EntityArmorStand spill1571_1;
    boolean spill1571_2;
    long life2_3;
    int life4_8;
    net.minecraft.nbt.NBTTagList life5_31;
    int life6_33;
    net.minecraft.nbt.NBTTagCompound life5_110;
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_91: {
    lexical_join_84: {
    lexical_join_49: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 86896204900330L);
    spill1571_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill1571_0;
    if (!((life4_8 != 0))) {
        break lexical_join_84;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Equipment")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1571_3(1607, (6340653357237197268L ^ life2_3))))))) {
        break lexical_join_49;
    }
    life5_31 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Equipment")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1571_5(20034, (1359739397809574344L ^ life2_3)))));
    life6_33 = 0;
    lexical_cycle_31: while (true) {
    if (!((life6_33 < (this.bI).length))) {
        break lexical_join_49;
    }
    (this.bI)[life6_33] = net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_31)).a__yw(((int)(life6_33))))));
    life6_33 += 1;
    if (!((life4_8 != 0))) {
        break lexical_join_84;
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).d(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Invisible"))))));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).j(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Small"))))));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).l(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("ShowArms"))))));
    this.bL = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("DisabledSlots")))));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).k(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("NoGravity"))))));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).m(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("NoBasePlate"))))));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).n(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Marker"))))));
    }
    spill1571_1 = this;
    spill1571_2 = ((net.minecraft.entity.item.EntityArmorStand)(this)).Q();
    if (!((life4_8 != 0))) {
        lexicalValue1571_91_0 = spill1571_1;
        lexicalValue1571_91_1 = ((spill1571_2) ? 1 : 0);
        break lexical_join_91;
    }
    if (!((!spill1571_2))) {
        lexicalValue1571_92_0 = spill1571_1;
        break lexical_join_92;
    }
    lexicalValue1571_91_0 = spill1571_1;
    lexicalValue1571_91_1 = 1;
    }
    lexicalValue1571_93_0 = lexicalValue1571_91_0;
    lexicalValue1571_93_1 = lexicalValue1571_91_1;
    break lexical_join_93;
    }
    lexicalValue1571_93_0 = lexicalValue1571_92_0;
    lexicalValue1571_93_1 = 0;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(lexicalValue1571_93_0)).bM = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1571_93_1)));
    this.Q = ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).N__Boolean()));
    life5_110 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Pose")));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f(((net.minecraft.nbt.NBTTagCompound)(life5_110)));
    return;
}


public boolean n__Boolean() {
return ((0) != 0);
}


private void n(boolean p0) {
int forwardValue5046_38_0;
    int spill5046_0;
    boolean spill5046_1;
    long life2_3;
    int life5_13;
    int life4_14;
    forward_join_39: {
    forward_join_38: {
    forward_join_30: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 131957576102719L);
    spill5046_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_1b79f0ed2644_invokedynamic5046_3(20034, (1359793298492163357L ^ life2_3)))));
    life4_14 = spill5046_0;
    spill5046_1 = p0;
    if (!((life4_14 == 0))) {
        forwardValue5046_38_0 = ((spill5046_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill5046_1)) {
        break forward_join_30;
    }
    life5_13 = ((byte) (life5_13 | __sourceIntrinsic_1b79f0ed2644_invokedynamic5046_6(31009, (5268511610830303841L ^ life2_3))));
    if (!((life4_14 != 0))) {
        break forward_join_39;
    }
    }
    forwardValue5046_38_0 = ((int)(((byte) (life5_13 & __sourceIntrinsic_1b79f0ed2644_invokedynamic5046_7(7570, (6725762762603288279L ^ life2_3))))));
    }
    life5_13 = forwardValue5046_38_0;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_1b79f0ed2644_invokedynamic5046_10(20034, (1359793298492163357L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(life5_13))))));
    return;
}


private void h(float p0) {
long life2_3;
    float life5_7;
    int life4_8;
    float life5_12;
    forward_join_28: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 39544034263586L);
    int spill5680_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_7 = ((net.minecraft.entity.item.EntityArmorStand)(this)).b__sourceReturn_bc607678b6();
    life4_8 = spill5680_0;
    life5_12 = (life5_7 - p0);
    if (!((life4_8 == 0))) { break forward_join_23; }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life5_12)), ((float)(0x1.0p-1f))) <= 0))) { break forward_join_25; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).P();
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f__Void();
    }
    if (!((life4_8 != 0))) { break forward_join_28; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).d(((float)(life5_12)));
    }
    return;
}


protected void h(net.minecraft.entity.Entity p0) {
return;
}


public void f(net.minecraft.util.Rotations p0) {
long local2 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 28518145131416L);
    this.bS = ((net.minecraft.util.Rotations)(p0));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_6877e24a3a4d_originalDynamicSite1898_3(31009, (5268616218525582022L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


public net.minecraft.util.Rotations f__sourceReturn_6a331ccf0b() {
return this.bS;
}


private void f(net.minecraft.nbt.NBTTagCompound p0) {
long life2_3;
    net.minecraft.nbt.NBTTagList life5_9;
    int life4_10;
    net.minecraft.nbt.NBTTagList life6_40;
    net.minecraft.nbt.NBTTagList life7_70;
    net.minecraft.nbt.NBTTagList life8_100;
    net.minecraft.nbt.NBTTagList life9_130;
    net.minecraft.nbt.NBTTagList life10_160;
    forward_join_132: {
    forward_join_129: {
    forward_join_127: {
    forward_join_111: {
    forward_join_108: {
    forward_join_106: {
    forward_join_90: {
    forward_join_87: {
    forward_join_85: {
    forward_join_69: {
    forward_join_66: {
    forward_join_64: {
    forward_join_48: {
    forward_join_45: {
    forward_join_43: {
    forward_join_27: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 79319750583860L);
    int spill5678_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_9 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Head")), ((int)(5)));
    life4_10 = spill5678_0;
    if (!((life4_10 == 0))) { break forward_join_22; }
    if (!((((net.minecraft.nbt.NBTTagList)(life5_9)).a__Int() > 0))) { break forward_join_24; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a(((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(life5_9))));
    }
    if (!((life4_10 != 0))) { break forward_join_27; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a(((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bC)));
    }
    life6_40 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Body")), ((int)(5)));
    if (!((life4_10 == 0))) { break forward_join_43; }
    if (!((((net.minecraft.nbt.NBTTagList)(life6_40)).a__Int() > 0))) { break forward_join_45; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(life6_40))));
    }
    if (!((life4_10 != 0))) { break forward_join_48; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bD)));
    }
    life7_70 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("LeftArm")), ((int)(5)));
    if (!((life4_10 == 0))) { break forward_join_64; }
    if (!((((net.minecraft.nbt.NBTTagList)(life7_70)).a__Int() > 0))) { break forward_join_66; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).c(((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(life7_70))));
    }
    if (!((life4_10 != 0))) { break forward_join_69; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).c(((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bE)));
    }
    life8_100 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("RightArm")), ((int)(5)));
    if (!((life4_10 == 0))) { break forward_join_85; }
    if (!((((net.minecraft.nbt.NBTTagList)(life8_100)).a__Int() > 0))) { break forward_join_87; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).d(((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(life8_100))));
    }
    if (!((life4_10 != 0))) { break forward_join_90; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).d(((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bF)));
    }
    life9_130 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("LeftLeg")), ((int)(5)));
    if (!((life4_10 == 0))) { break forward_join_106; }
    if (!((((net.minecraft.nbt.NBTTagList)(life9_130)).a__Int() > 0))) { break forward_join_108; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).e(((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(life9_130))));
    }
    if (!((life4_10 != 0))) { break forward_join_111; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).e(((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bG)));
    }
    life10_160 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("RightLeg")), ((int)(5)));
    if (!((life4_10 == 0))) { break forward_join_127; }
    if (!((((net.minecraft.nbt.NBTTagList)(life10_160)).a__Int() > 0))) { break forward_join_129; }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f(((net.minecraft.util.Rotations)(new net.minecraft.util.Rotations(life10_160))));
    }
    if (!((life4_10 != 0))) { break forward_join_132; }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f(((net.minecraft.util.Rotations)(net.minecraft.entity.item.EntityArmorStand.bH)));
    }
    return;
}


private void l(boolean p0) {
int forwardValue5043_34_0;
    int spill5043_0;
    boolean spill5043_1;
    long life2_3;
    int life5_13;
    int life4_14;
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 77544558475561L);
    spill5043_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic5043_3(20034, (1359746554931138315L ^ life2_3)))));
    life4_14 = spill5043_0;
    spill5043_1 = p0;
    if (!((life4_14 == 0))) {
        forwardValue5043_34_0 = ((spill5043_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill5043_1)) {
        break forward_join_26;
    }
    life5_13 = ((byte) (life5_13 | 4));
    if (!((life4_14 != 0))) {
        break forward_join_35;
    }
    }
    forwardValue5043_34_0 = ((int)(((byte) (life5_13 & __sourceIntrinsic_93fe014f0768_invokedynamic5043_6(19542, (4366327524892069128L ^ life2_3))))));
    }
    life5_13 = forwardValue5043_34_0;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic5043_9(20034, (1359746554931138315L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(life5_13))))));
    return;
}


public void d(net.minecraft.util.Rotations p0) {
long local2 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 112166689478817L);
    this.bQ = ((net.minecraft.util.Rotations)(p0));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_06b9782bf474_originalDynamicSite1899_3(7564, (1976571193758137683L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


public void d(boolean p0) {
this.bJ = ((boolean)(p0));
    super.d(((boolean)(p0)));
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 64888296250297L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_3(20034, (1359726227857796507L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_7(23192, (298638772576811347L ^ local1)))), ((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.bC)));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_11(6222, (1410630260110736274L ^ local1)))), ((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.bD)));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_15(19749, (874286828419903201L ^ local1)))), ((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.bE)));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_19(4171, (1589407904921629584L ^ local1)))), ((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.bF)));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_23(21748, (897736456690169654L ^ local1)))), ((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.bG)));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_27(31009, (5268578680411806439L ^ local1)))), ((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.bH)));
    return;
}


public net.minecraft.util.Rotations d__sourceReturn_6a331ccf0b() {
return this.bQ;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
java.lang.String lexicalValue1572_64_0;
    int lexicalValue1572_107_0;
    int spill1572_0;
    boolean spill1572_1;
    java.lang.String spill1572_2;
    int spill1572_3;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_10;
    net.minecraft.item.ItemStack[] life6_14;
    int life7_17;
    int life8_19;
    int life4_20;
    net.minecraft.item.ItemStack life9_27;
    net.minecraft.nbt.NBTTagCompound life10_31;
    lexical_join_118: {
    lexical_join_113: {
    lexical_join_107: {
    lexical_join_73: {
    lexical_join_68: {
    lexical_join_64: {
    lexical_join_52: {
    lexical_join_48: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 125812057832673L);
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_10 = new net.minecraft.nbt.NBTTagList();
    spill1572_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life6_14 = this.bI;
    life7_17 = (life6_14).length;
    life8_19 = 0;
    life4_20 = spill1572_0;
    lexical_cycle_21: while (true) {
    lexical_join_46: {
    lexical_join_42: {
    if (!((life8_19 < life7_17))) {
        break lexical_join_48;
    }
    life9_27 = (life6_14)[life8_19];
    life10_31 = new net.minecraft.nbt.NBTTagCompound();
    if (!((life4_20 == 0))) {
        break lexical_join_52;
    }
    if (!((life4_20 == 0))) {
        break lexical_join_46;
    }
    if (!((life9_27 != null))) {
        break lexical_join_42;
    }
    ((net.minecraft.item.ItemStack)(life9_27)).a__yw(((net.minecraft.nbt.NBTTagCompound)(life10_31)));
    }
    ((net.minecraft.nbt.NBTTagList)(life5_10)).a(((net.minecraft.nbt.NBTBase)(life10_31)));
    life8_19 += 1;
    }
    if (!((life4_20 != 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Equipment")), ((net.minecraft.nbt.NBTBase)(life5_10)));
    }
    spill1572_1 = ((net.minecraft.entity.item.EntityArmorStand)(this)).B();
    if (!((life4_20 == 0))) {
        lexicalValue1572_107_0 = ((spill1572_1) ? 1 : 0);
        break lexical_join_107;
    }
    if (!(spill1572_1)) {
        break lexical_join_73;
    }
    spill1572_2 = ((net.minecraft.entity.item.EntityArmorStand)(this)).g__String();
    if (!((life4_20 == 0))) {
        lexicalValue1572_64_0 = spill1572_2;
        break lexical_join_64;
    }
    if (!((spill1572_2 != null))) {
        break lexical_join_68;
    }
    lexicalValue1572_64_0 = ((net.minecraft.entity.item.EntityArmorStand)(this)).g__String();
    }
    spill1572_3 = ((java.lang.String)(lexicalValue1572_64_0)).length();
    if (!((life4_20 == 0))) {
        lexicalValue1572_107_0 = spill1572_3;
        break lexical_join_107;
    }
    if (!((spill1572_3 == 0))) {
        break lexical_join_73;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CustomNameVisible")), ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).B())));
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Invisible")), ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).v__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Small")), ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).M())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ShowArms")), ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).O__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("DisabledSlots")), ((int)(this.bL)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("NoGravity")), ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).N__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("NoBasePlate")), ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).P__Boolean())));
    if (!((life4_20 == 0))) {
        break lexical_join_118;
    }
    lexicalValue1572_107_0 = ((((net.minecraft.entity.item.EntityArmorStand)(this)).Q()) ? 1 : 0);
    }
    if (!((lexicalValue1572_107_0 != 0))) {
        break lexical_join_113;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Marker")), ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(this)).Q())));
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Pose")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.entity.item.EntityArmorStand)(this)).b__yw())));
    }
    return;
}


public net.minecraft.util.Rotations a__sourceReturn_6a331ccf0b() {
return this.bN;
}


public void a(net.minecraft.util.Rotations p0) {
long local2 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 97270088931969L);
    this.bN = ((net.minecraft.util.Rotations)(p0));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_a5b1251bf743_originalDynamicSite1901_3(28891, (5830511717559259707L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


public net.minecraft.item.ItemStack[] a__ArrayxW() {
return this.bI;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.bI)[p0];
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, moom.DR p1) {
int forwardValue5032_16_0;
    int forwardValue5032_34_0;
    int forwardValue5032_63_0;
    int forwardValue5032_63_1;
    int forwardValue5032_75_0;
    int forwardValue5032_75_1;
    int forwardValue5032_82_0;
    int forwardValue5032_88_0;
    net.minecraft.item.Item forwardValue5032_99_0;
    net.minecraft.item.Item forwardValue5032_99_1;
    double forwardValue5032_124_0;
    double forwardValue5032_137_0;
    double forwardValue5032_137_1;
    double forwardValue5032_138_0;
    double forwardValue5032_138_1;
    double forwardValue5032_138_2;
    double forwardValue5032_154_0;
    double forwardValue5032_154_1;
    double forwardValue5032_158_0;
    double forwardValue5032_158_1;
    double forwardValue5032_159_0;
    double forwardValue5032_159_1;
    double forwardValue5032_159_2;
    double forwardValue5032_170_0;
    double forwardValue5032_170_1;
    double forwardValue5032_171_0;
    double forwardValue5032_171_1;
    double forwardValue5032_171_2;
    int forwardValue5032_188_0;
    double forwardValue5032_197_0;
    double forwardValue5032_197_1;
    double forwardValue5032_198_0;
    double forwardValue5032_198_1;
    double forwardValue5032_198_2;
    int forwardValue5032_215_0;
    net.minecraft.item.ItemStack forwardValue5032_229_0;
    int forwardValue5032_233_0;
    int forwardValue5032_260_0;
    int forwardValue5032_273_0;
    int forwardValue5032_275_0;
    int forwardValue5032_290_0;
    int forwardValue5032_300_0;
    int forwardValue5032_308_0;
    int forwardValue5032_310_0;
    boolean spill5032_0;
    boolean spill5032_1;
    int spill5032_2;
    int spill5032_3;
    int spill5032_4;
    int spill5032_5;
    int spill5032_6;
    net.minecraft.item.Item spill5032_7;
    net.minecraft.item.Item spill5032_8;
    double spill5032_9;
    double spill5032_10;
    double spill5032_11;
    double spill5032_12;
    double spill5032_13;
    int spill5032_14;
    double spill5032_15;
    double spill5032_16;
    int spill5032_17;
    double spill5032_18;
    double spill5032_19;
    int spill5032_20;
    net.minecraft.item.ItemStack spill5032_21;
    int spill5032_22;
    int spill5032_23;
    int spill5032_24;
    int spill5032_25;
    boolean spill5032_26;
    long life3_3;
    int life5_5;
    int life6_39;
    net.minecraft.item.ItemStack life7_42;
    int life8_50;
    net.minecraft.item.Item life10_60;
    net.minecraft.item.ItemArmor life9_71;
    double life9_155;
    double life11_157;
    double life13_159;
    double life15_161;
    int life17_163;
    int life18_166;
    double life19_178;
    int life21_348;
    forward_join_310: {
    forward_join_309: {
    forward_join_308: {
    forward_join_307: {
    forward_join_300: {
    forward_join_299: {
    forward_join_290: {
    forward_join_289: {
    forward_join_275: {
    forward_join_274: {
    forward_join_273: {
    forward_join_272: {
    forward_join_260: {
    forward_join_252: {
    forward_join_233: {
    forward_join_232: {
    forward_join_229: {
    forward_join_225: {
    forward_join_215: {
    forward_join_212: {
    forward_join_198: {
    forward_join_197: {
    forward_join_188: {
    forward_join_185: {
    forward_join_171: {
    forward_join_170: {
    forward_join_159: {
    forward_join_158: {
    forward_join_154: {
    forward_join_152: {
    forward_join_138: {
    forward_join_137: {
    forward_join_124: {
    forward_join_122: {
    forward_join_102: {
    forward_join_100: {
    forward_join_99: {
    forward_join_88: {
    forward_join_87: {
    forward_join_82: {
    forward_join_80: {
    forward_join_75: {
    forward_join_70: {
    forward_join_63: {
    forward_join_60: {
    forward_join_34: {
    forward_join_33: {
    forward_join_16: {
    forward_join_13: {
    life3_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 39504832396904L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5032_0 = ((net.minecraft.entity.item.EntityArmorStand)(this)).Q();
    if (!((life5_5 != 0))) {
        forwardValue5032_16_0 = ((spill5032_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5032_0)) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue5032_16_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_310_0 = forwardValue5032_16_0;
        break forward_join_310;
    }
    if (!((forwardValue5032_16_0 == 0))) {
        break forward_join_309;
    }
    spill5032_1 = ((net.minecraft.entity.player.EntityPlayer)(p0)).U__Boolean();
    if (!((life5_5 != 0))) {
        forwardValue5032_310_0 = ((spill5032_1) ? 1 : 0);
        break forward_join_310;
    }
    if (!((!spill5032_1))) {
        break forward_join_309;
    }
    life6_39 = 0;
    life7_42 = ((net.minecraft.entity.player.EntityPlayer)(p0)).c__xW();
    if (!((life7_42 != null))) {
        break forward_join_33;
    }
    forwardValue5032_34_0 = 1;
    break forward_join_34;
    }
    forwardValue5032_34_0 = 0;
    }
    life8_50 = forwardValue5032_34_0;
    spill5032_2 = life8_50;
    if (!((life5_5 != 0))) {
        forwardValue5032_88_0 = spill5032_2;
        break forward_join_88;
    }
    if (!((spill5032_2 != 0))) {
        break forward_join_87;
    }
    life10_60 = ((net.minecraft.item.ItemStack)(life7_42)).a__wQ();
    spill5032_3 = ((life10_60 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5032_88_0 = spill5032_3;
        break forward_join_88;
    }
    if (!((spill5032_3 != 0))) {
        break forward_join_87;
    }
    life9_71 = ((net.minecraft.item.ItemArmor)(life10_60));
    spill5032_4 = ((net.minecraft.item.ItemArmor)(life9_71)).q;
    spill5032_5 = 3;
    if (!((life5_5 != 0))) {
        forwardValue5032_63_0 = spill5032_4;
        forwardValue5032_63_1 = spill5032_5;
        break forward_join_63;
    }
    if (!((spill5032_4 == spill5032_5))) {
        break forward_join_60;
    }
    life6_39 = 1;
    if (!((life5_5 == 0))) {
        break forward_join_87;
    }
    }
    forwardValue5032_63_0 = ((net.minecraft.item.ItemArmor)(life9_71)).q;
    forwardValue5032_63_1 = 2;
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_75_0 = forwardValue5032_63_0;
        forwardValue5032_75_1 = forwardValue5032_63_1;
        break forward_join_75;
    }
    if (!((forwardValue5032_63_0 == forwardValue5032_63_1))) {
        break forward_join_70;
    }
    life6_39 = 2;
    if (!((life5_5 == 0))) {
        break forward_join_87;
    }
    }
    spill5032_6 = ((net.minecraft.item.ItemArmor)(life9_71)).q;
    if (!((life5_5 != 0))) {
        forwardValue5032_82_0 = spill5032_6;
        break forward_join_82;
    }
    forwardValue5032_75_0 = spill5032_6;
    forwardValue5032_75_1 = 1;
    }
    if (!((forwardValue5032_75_0 == forwardValue5032_75_1))) {
        break forward_join_80;
    }
    life6_39 = 3;
    if (!((life5_5 == 0))) {
        break forward_join_87;
    }
    }
    forwardValue5032_82_0 = ((net.minecraft.item.ItemArmor)(life9_71)).q;
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_88_0 = forwardValue5032_82_0;
        break forward_join_88;
    }
    if (!((forwardValue5032_82_0 == 0))) {
        break forward_join_87;
    }
    life6_39 = 4;
    }
    forwardValue5032_88_0 = life8_50;
    }
    if (!((forwardValue5032_88_0 != 0))) {
        break forward_join_102;
    }
    spill5032_7 = ((net.minecraft.item.ItemStack)(life7_42)).a__wQ();
    spill5032_8 = net.minecraft.init.Items.bM;
    if (!((life5_5 != 0))) {
        forwardValue5032_99_0 = spill5032_7;
        forwardValue5032_99_1 = spill5032_8;
        break forward_join_99;
    }
    if (!((spill5032_7 != spill5032_8))) {
        break forward_join_100;
    }
    forwardValue5032_99_0 = ((net.minecraft.item.ItemStack)(life7_42)).a__wQ();
    forwardValue5032_99_1 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)));
    }
    if (!((forwardValue5032_99_0 == forwardValue5032_99_1))) {
        break forward_join_102;
    }
    }
    life6_39 = 4;
    }
    life9_155 = 0x1.999999999999ap-4d;
    life11_157 = 0x1.ccccccccccccdp-1d;
    life13_159 = 0x1.999999999999ap-2d;
    life15_161 = 0x1.999999999999ap0d;
    life17_163 = 0;
    life18_166 = ((((net.minecraft.entity.item.EntityArmorStand)(this)).M()) ? 1 : 0);
    if (!((life18_166 != 0))) {
        break forward_join_122;
    }
    forwardValue5032_124_0 = (((moom.DR)(p1)).b * 0x1.0p1d);
    break forward_join_124;
    }
    forwardValue5032_124_0 = ((moom.DR)(p1)).b;
    }
    life19_178 = forwardValue5032_124_0;
    spill5032_9 = life19_178;
    spill5032_10 = 0x1.999999999999ap-4d;
    if (!((life5_5 != 0))) {
        forwardValue5032_154_0 = spill5032_9;
        forwardValue5032_154_1 = spill5032_10;
        break forward_join_154;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill5032_9)), ((double)(spill5032_10))) >= 0))) {
        break forward_join_152;
    }
    spill5032_11 = life19_178;
    spill5032_12 = 0x1.999999999999ap-4d;
    if (!((life18_166 != 0))) {
        forwardValue5032_137_0 = spill5032_11;
        forwardValue5032_137_1 = spill5032_12;
        break forward_join_137;
    }
    forwardValue5032_138_0 = spill5032_11;
    forwardValue5032_138_1 = spill5032_12;
    forwardValue5032_138_2 = 0x1.999999999999ap-1d;
    break forward_join_138;
    }
    forwardValue5032_138_0 = forwardValue5032_137_0;
    forwardValue5032_138_1 = forwardValue5032_137_1;
    forwardValue5032_138_2 = 0x1.ccccccccccccdp-2d;
    }
    spill5032_13 = (forwardValue5032_138_1 + forwardValue5032_138_2);
    if (!((life5_5 != 0))) {
        forwardValue5032_154_0 = forwardValue5032_138_0;
        forwardValue5032_154_1 = spill5032_13;
        break forward_join_154;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(forwardValue5032_138_0)), ((double)(spill5032_13))) < 0))) {
        break forward_join_152;
    }
    if (!(((this.bI)[1] != null))) {
        break forward_join_152;
    }
    life17_163 = 1;
    if (!((life5_5 == 0))) {
        break forward_join_225;
    }
    }
    forwardValue5032_154_0 = life19_178;
    forwardValue5032_154_1 = 0x1.ccccccccccccdp-1d;
    }
    if (!((life18_166 != 0))) {
        forwardValue5032_158_0 = forwardValue5032_154_0;
        forwardValue5032_158_1 = forwardValue5032_154_1;
        break forward_join_158;
    }
    forwardValue5032_159_0 = forwardValue5032_154_0;
    forwardValue5032_159_1 = forwardValue5032_154_1;
    forwardValue5032_159_2 = 0x1.3333333333333p-2d;
    break forward_join_159;
    }
    forwardValue5032_159_0 = forwardValue5032_158_0;
    forwardValue5032_159_1 = forwardValue5032_158_1;
    forwardValue5032_159_2 = 0x0.0p0d;
    }
    spill5032_14 = recovery.source.CarrierOps.dcmpl(((double)(forwardValue5032_159_0)), ((double)((forwardValue5032_159_1 + forwardValue5032_159_2))));
    if (!((life5_5 != 0))) {
        forwardValue5032_188_0 = spill5032_14;
        break forward_join_188;
    }
    if (!((spill5032_14 >= 0))) {
        break forward_join_185;
    }
    spill5032_15 = life19_178;
    spill5032_16 = 0x1.ccccccccccccdp-1d;
    if (!((life18_166 != 0))) {
        forwardValue5032_170_0 = spill5032_15;
        forwardValue5032_170_1 = spill5032_16;
        break forward_join_170;
    }
    forwardValue5032_171_0 = spill5032_15;
    forwardValue5032_171_1 = spill5032_16;
    forwardValue5032_171_2 = 0x1.0p0d;
    break forward_join_171;
    }
    forwardValue5032_171_0 = forwardValue5032_170_0;
    forwardValue5032_171_1 = forwardValue5032_170_1;
    forwardValue5032_171_2 = 0x1.6666666666666p-1d;
    }
    spill5032_17 = recovery.source.CarrierOps.dcmpg(((double)(forwardValue5032_171_0)), ((double)((forwardValue5032_171_1 + forwardValue5032_171_2))));
    if (!((life5_5 != 0))) {
        forwardValue5032_188_0 = spill5032_17;
        break forward_join_188;
    }
    if (!((spill5032_17 < 0))) {
        break forward_join_185;
    }
    if (!(((this.bI)[3] != null))) {
        break forward_join_185;
    }
    life17_163 = 3;
    if (!((life5_5 == 0))) {
        break forward_join_225;
    }
    }
    forwardValue5032_188_0 = recovery.source.CarrierOps.dcmpl(((double)(life19_178)), ((double)(0x1.999999999999ap-2d)));
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_215_0 = forwardValue5032_188_0;
        break forward_join_215;
    }
    if (!((forwardValue5032_188_0 >= 0))) {
        break forward_join_212;
    }
    spill5032_18 = life19_178;
    spill5032_19 = 0x1.999999999999ap-2d;
    if (!((life18_166 != 0))) {
        forwardValue5032_197_0 = spill5032_18;
        forwardValue5032_197_1 = spill5032_19;
        break forward_join_197;
    }
    forwardValue5032_198_0 = spill5032_18;
    forwardValue5032_198_1 = spill5032_19;
    forwardValue5032_198_2 = 0x1.0p0d;
    break forward_join_198;
    }
    forwardValue5032_198_0 = forwardValue5032_197_0;
    forwardValue5032_198_1 = forwardValue5032_197_1;
    forwardValue5032_198_2 = 0x1.999999999999ap-1d;
    }
    spill5032_20 = recovery.source.CarrierOps.dcmpg(((double)(forwardValue5032_198_0)), ((double)((forwardValue5032_198_1 + forwardValue5032_198_2))));
    if (!((life5_5 != 0))) {
        forwardValue5032_215_0 = spill5032_20;
        break forward_join_215;
    }
    if (!((spill5032_20 < 0))) {
        break forward_join_212;
    }
    if (!(((this.bI)[2] != null))) {
        break forward_join_212;
    }
    life17_163 = 2;
    if (!((life5_5 == 0))) {
        break forward_join_225;
    }
    }
    forwardValue5032_215_0 = recovery.source.CarrierOps.dcmpl(((double)(life19_178)), ((double)(0x1.999999999999ap0d)));
    }
    if (!((forwardValue5032_215_0 >= 0))) {
        break forward_join_225;
    }
    spill5032_21 = (this.bI)[4];
    if (!((life5_5 != 0))) {
        forwardValue5032_229_0 = spill5032_21;
        break forward_join_229;
    }
    if (!((spill5032_21 != null))) {
        break forward_join_225;
    }
    life17_163 = 4;
    }
    forwardValue5032_229_0 = (this.bI)[life17_163];
    }
    if (!((forwardValue5032_229_0 != null))) {
        break forward_join_232;
    }
    forwardValue5032_233_0 = 1;
    break forward_join_233;
    }
    forwardValue5032_233_0 = 0;
    }
    life21_348 = forwardValue5032_233_0;
    spill5032_22 = (this.bL & (1 << life17_163));
    if (!((life5_5 != 0))) {
        forwardValue5032_260_0 = spill5032_22;
        break forward_join_260;
    }
    if (!((spill5032_22 == 0))) {
        break forward_join_252;
    }
    spill5032_23 = (this.bL & (1 << life6_39));
    if (!((life5_5 != 0))) {
        forwardValue5032_275_0 = spill5032_23;
        break forward_join_275;
    }
    if (!((spill5032_23 != 0))) {
        break forward_join_274;
    }
    }
    life17_163 = life6_39;
    forwardValue5032_260_0 = (this.bL & (1 << life6_39));
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_275_0 = forwardValue5032_260_0;
        break forward_join_275;
    }
    if (!((forwardValue5032_260_0 != 0))) {
        break forward_join_274;
    }
    spill5032_24 = (this.bL & 1);
    if (!((life5_5 != 0))) {
        forwardValue5032_273_0 = spill5032_24;
        break forward_join_273;
    }
    if (!((spill5032_24 != 0))) {
        break forward_join_272;
    }
    return ((1) != 0);
    }
    forwardValue5032_273_0 = 0;
    }
    life17_163 = forwardValue5032_273_0;
    }
    forwardValue5032_275_0 = life8_50;
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_290_0 = forwardValue5032_275_0;
        break forward_join_290;
    }
    if (!((forwardValue5032_275_0 != 0))) {
        break forward_join_289;
    }
    spill5032_25 = life6_39;
    if (!((life5_5 != 0))) {
        forwardValue5032_290_0 = spill5032_25;
        break forward_join_290;
    }
    if (!((spill5032_25 == 0))) {
        break forward_join_289;
    }
    spill5032_26 = ((net.minecraft.entity.item.EntityArmorStand)(this)).O__Boolean();
    if (!((life5_5 != 0))) {
        forwardValue5032_290_0 = ((spill5032_26) ? 1 : 0);
        break forward_join_290;
    }
    if (!((!spill5032_26))) {
        break forward_join_289;
    }
    return ((1) != 0);
    }
    forwardValue5032_290_0 = life8_50;
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_300_0 = forwardValue5032_290_0;
        break forward_join_300;
    }
    if (!((forwardValue5032_290_0 != 0))) {
        break forward_join_299;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((int)(life6_39)));
    if (!((life5_5 == 0))) {
        break forward_join_307;
    }
    }
    forwardValue5032_300_0 = life21_348;
    }
    if (!((life5_5 != 0))) {
        forwardValue5032_308_0 = forwardValue5032_300_0;
        break forward_join_308;
    }
    if (!((forwardValue5032_300_0 != 0))) {
        break forward_join_307;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((int)(life17_163)));
    }
    forwardValue5032_308_0 = 1;
    }
    return ((forwardValue5032_308_0) != 0);
    }
    forwardValue5032_310_0 = 1;
    }
    return ((forwardValue5032_310_0) != 0);
}


private void a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
net.minecraft.item.ItemStack forwardValue5031_29_0;
    int forwardValue5031_48_0;
    net.minecraft.item.ItemStack forwardValue5031_70_0;
    net.minecraft.item.ItemStack forwardValue5031_86_0;
    net.minecraft.item.ItemStack forwardValue5031_90_0;
    net.minecraft.item.ItemStack forwardValue5031_96_0;
    net.minecraft.item.ItemStack forwardValue5031_101_0;
    int spill5031_0;
    net.minecraft.item.ItemStack spill5031_1;
    int spill5031_2;
    net.minecraft.item.ItemStack spill5031_3;
    net.minecraft.item.ItemStack spill5031_4;
    long life3_3;
    net.minecraft.item.ItemStack life6_9;
    int life5_10;
    int life7_66;
    net.minecraft.item.ItemStack life8_71;
    net.minecraft.item.ItemStack life9_111;
    net.minecraft.item.ItemStack life9_155;
    forward_join_126: {
    forward_join_117: {
    forward_join_101: {
    forward_join_96: {
    forward_join_90: {
    forward_join_86: {
    forward_join_85: {
    forward_join_70: {
    forward_join_69: {
    forward_join_48: {
    forward_join_45: {
    forward_join_29: {
    forward_join_28: {
    life3_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 44100005809457L);
    spill5031_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life6_9 = (this.bI)[p1];
    life5_10 = spill5031_0;
    spill5031_1 = life6_9;
    if (!((life5_10 != 0))) {
        forwardValue5031_29_0 = spill5031_1;
        break forward_join_29;
    }
    if (!((spill5031_1 != null))) {
        break forward_join_28;
    }
    if (!(((this.bL & (1 << (p1 + __sourceIntrinsic_db072f44042f_invokedynamic5031_4(20593, (5850690536340727075L ^ life3_3))))) == 0))) {
        break forward_join_126;
    }
    }
    forwardValue5031_29_0 = life6_9;
    }
    if (!((forwardValue5031_29_0 == null))) {
        break forward_join_45;
    }
    spill5031_2 = (this.bL & (1 << (p1 + __sourceIntrinsic_db072f44042f_invokedynamic5031_6(31009, (5268599674592496751L ^ life3_3)))));
    if (!((life5_10 != 0))) {
        forwardValue5031_48_0 = spill5031_2;
        break forward_join_48;
    }
    if (!((spill5031_2 == 0))) {
        break forward_join_126;
    }
    }
    forwardValue5031_48_0 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c;
    }
    life7_66 = forwardValue5031_48_0;
    life8_71 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW(((int)(life7_66)));
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d)) {
        break forward_join_85;
    }
    spill5031_3 = life6_9;
    if (!((life5_10 != 0))) {
        forwardValue5031_70_0 = spill5031_3;
        break forward_join_70;
    }
    if (!((spill5031_3 != null))) {
        break forward_join_69;
    }
    spill5031_4 = life6_9;
    if (!((life5_10 != 0))) {
        forwardValue5031_86_0 = spill5031_4;
        break forward_join_86;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5031_4)).a__wQ() == net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)))))) {
        break forward_join_85;
    }
    }
    forwardValue5031_70_0 = life8_71;
    }
    if (!((life5_10 != 0))) {
        forwardValue5031_86_0 = forwardValue5031_70_0;
        break forward_join_86;
    }
    if (!((forwardValue5031_70_0 != null))) {
        break forward_join_85;
    }
    life9_111 = ((net.minecraft.item.ItemStack)(life8_71)).a__xW();
    ((net.minecraft.item.ItemStack)(life9_111)).b = ((int)(1));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((int)(p1)), ((net.minecraft.item.ItemStack)(life9_111)));
    if (!((life5_10 == 0))) {
        break forward_join_126;
    }
    }
    forwardValue5031_86_0 = life8_71;
    }
    if (!((life5_10 != 0))) {
        forwardValue5031_90_0 = forwardValue5031_86_0;
        break forward_join_90;
    }
    if (!((forwardValue5031_86_0 != null))) {
        break forward_join_117;
    }
    forwardValue5031_90_0 = life8_71;
    }
    if (!((life5_10 != 0))) {
        forwardValue5031_96_0 = forwardValue5031_90_0;
        break forward_join_96;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5031_90_0)).b > 1))) {
        break forward_join_117;
    }
    forwardValue5031_96_0 = life6_9;
    }
    if (!((life5_10 != 0))) {
        forwardValue5031_101_0 = forwardValue5031_96_0;
        break forward_join_101;
    }
    if (!((forwardValue5031_96_0 == null))) {
        break forward_join_126;
    }
    forwardValue5031_101_0 = ((net.minecraft.item.ItemStack)(life8_71)).a__xW();
    }
    life9_155 = forwardValue5031_101_0;
    ((net.minecraft.item.ItemStack)(life9_155)).b = ((int)(1));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((int)(p1)), ((net.minecraft.item.ItemStack)(life9_155)));
    net.minecraft.item.ItemStack __stackOp5031_23_0 = life8_71;
    ((net.minecraft.item.ItemStack)(__stackOp5031_23_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5031_23_0)).b - 1)));
    if (!((life5_10 == 0))) {
        break forward_join_126;
    }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((int)(p1)), ((net.minecraft.item.ItemStack)(life8_71)));
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(life7_66)), ((net.minecraft.item.ItemStack)(life6_9)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5033_17_0;
    int forwardValue5033_27_0;
    int forwardValue5033_54_0;
    net.minecraft.entity.item.EntityArmorStand forwardValue5033_68_0;
    int forwardValue5033_75_0;
    int forwardValue5033_94_0;
    int forwardValue5033_113_0;
    int forwardValue5033_122_0;
    int forwardValue5033_137_0;
    int forwardValue5033_145_0;
    int forwardValue5033_175_0;
    boolean spill5033_0;
    boolean spill5033_1;
    boolean spill5033_2;
    boolean spill5033_3;
    net.minecraft.entity.item.EntityArmorStand spill5033_4;
    int spill5033_5;
    int spill5033_6;
    int spill5033_7;
    boolean spill5033_8;
    long life3_3;
    int life5_5;
    int life6_153;
    int life7_158;
    long life8_242;
    forward_join_175: {
    forward_join_174: {
    forward_join_172: {
    forward_join_170: {
    forward_join_166: {
    forward_join_146: {
    forward_join_145: {
    forward_join_137: {
    forward_join_135: {
    forward_join_122: {
    forward_join_119: {
    forward_join_113: {
    forward_join_110: {
    forward_join_94: {
    forward_join_90: {
    forward_join_75: {
    forward_join_72: {
    forward_join_70: {
    forward_join_68: {
    forward_join_67: {
    forward_join_54: {
    forward_join_51: {
    forward_join_27: {
    forward_join_24: {
    forward_join_17: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 44806818391912L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5033_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 != 0))) {
        forwardValue5033_17_0 = ((spill5033_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill5033_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue5033_17_0 = ((((java.lang.Object)(net.minecraft.util.DamageSource.j)).equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5033_27_0 = forwardValue5033_17_0;
        break forward_join_27;
    }
    if (!((forwardValue5033_17_0 != 0))) {
        break forward_join_24;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f__Void();
    return ((0) != 0);
    }
    forwardValue5033_27_0 = ((((net.minecraft.entity.item.EntityArmorStand)(this)).a(((net.minecraft.util.DamageSource)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5033_175_0 = forwardValue5033_27_0;
        break forward_join_175;
    }
    if (!((forwardValue5033_27_0 == 0))) {
        break forward_join_174;
    }
    spill5033_1 = this.bJ;
    if (!((life5_5 != 0))) {
        forwardValue5033_175_0 = ((spill5033_1) ? 1 : 0);
        break forward_join_175;
    }
    if (!((!spill5033_1))) {
        break forward_join_174;
    }
    spill5033_2 = ((net.minecraft.entity.item.EntityArmorStand)(this)).Q();
    if (!((life5_5 != 0))) {
        forwardValue5033_175_0 = ((spill5033_2) ? 1 : 0);
        break forward_join_175;
    }
    if (!((!spill5033_2))) {
        break forward_join_174;
    }
    spill5033_3 = ((net.minecraft.util.DamageSource)(p0)).b__Boolean();
    if (!((life5_5 != 0))) {
        forwardValue5033_54_0 = ((spill5033_3) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill5033_3)) {
        break forward_join_51;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).P();
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f__Void();
    return ((0) != 0);
    }
    forwardValue5033_54_0 = ((((java.lang.Object)(net.minecraft.util.DamageSource.a)).equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5033_75_0 = forwardValue5033_54_0;
        break forward_join_75;
    }
    if (!((forwardValue5033_54_0 != 0))) {
        break forward_join_72;
    }
    spill5033_4 = this;
    if (!((life5_5 != 0))) {
        forwardValue5033_68_0 = spill5033_4;
        break forward_join_68;
    }
    if (!((!((net.minecraft.entity.item.EntityArmorStand)(spill5033_4)).r__Boolean()))) {
        break forward_join_67;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((int)(5)));
    if (!((life5_5 == 0))) {
        break forward_join_70;
    }
    }
    forwardValue5033_68_0 = this;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(forwardValue5033_68_0)).h(((float)(0x1.333334p-3f)));
    }
    return ((0) != 0);
    }
    forwardValue5033_75_0 = ((((java.lang.Object)(net.minecraft.util.DamageSource.c)).equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5033_94_0 = forwardValue5033_75_0;
        break forward_join_94;
    }
    if (!((forwardValue5033_75_0 != 0))) {
        break forward_join_90;
    }
    spill5033_5 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.item.EntityArmorStand)(this)).b__sourceReturn_bc607678b6())), ((float)(0x1.0p-1f)));
    if (!((life5_5 != 0))) {
        forwardValue5033_94_0 = spill5033_5;
        break forward_join_94;
    }
    if (!((spill5033_5 > 0))) {
        break forward_join_90;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).h(((float)(0x1.0p2f)));
    return ((0) != 0);
    }
    forwardValue5033_94_0 = ((((java.lang.String)("arrow")).equals(((java.lang.Object)(((net.minecraft.util.DamageSource)(p0)).a__String())))) ? 1 : 0);
    }
    life6_153 = forwardValue5033_94_0;
    life7_158 = ((((java.lang.String)("player")).equals(((java.lang.Object)(((net.minecraft.util.DamageSource)(p0)).a__String())))) ? 1 : 0);
    spill5033_6 = life7_158;
    if (!((life5_5 != 0))) {
        forwardValue5033_113_0 = spill5033_6;
        break forward_join_113;
    }
    if (!((spill5033_6 == 0))) {
        break forward_join_110;
    }
    spill5033_7 = life6_153;
    if (!((life5_5 != 0))) {
        forwardValue5033_113_0 = spill5033_7;
        break forward_join_113;
    }
    if (!((spill5033_7 == 0))) {
        break forward_join_110;
    }
    return ((0) != 0);
    }
    forwardValue5033_113_0 = ((((net.minecraft.util.DamageSource)(p0)).a__r3() instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5033_122_0 = forwardValue5033_113_0;
        break forward_join_122;
    }
    if (!((forwardValue5033_113_0 != 0))) {
        break forward_join_119;
    }
    ((net.minecraft.entity.Entity)(((net.minecraft.util.DamageSource)(p0)).a__r3())).f__Void();
    }
    forwardValue5033_122_0 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5033_137_0 = forwardValue5033_122_0;
        break forward_join_137;
    }
    if (!((forwardValue5033_122_0 != 0))) {
        break forward_join_135;
    }
    spill5033_8 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.util.DamageSource)(p0)).b__r3())))).b1)).e;
    if (!((life5_5 != 0))) {
        forwardValue5033_137_0 = ((spill5033_8) ? 1 : 0);
        break forward_join_137;
    }
    if (!((!spill5033_8))) {
        break forward_join_135;
    }
    return ((0) != 0);
    }
    forwardValue5033_137_0 = ((((net.minecraft.util.DamageSource)(p0)).i()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5033_145_0 = forwardValue5033_137_0;
        break forward_join_145;
    }
    if (!((forwardValue5033_137_0 != 0))) {
        break forward_join_146;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).N();
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f__Void();
    forwardValue5033_145_0 = 0;
    }
    return ((forwardValue5033_145_0) != 0);
    }
    life8_242 = ((net.minecraft.world.World)(this.i)).b__Long();
    if (!((life5_5 != 0))) {
        break forward_join_170;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((life8_242 - this.bK))), ((long)(net.minecraft.entity.item.EntityArmorStand.ib))) > 0))) {
        break forward_join_166;
    }
    if (!((life6_153 == 0))) {
        break forward_join_166;
    }
    this.bK = ((long)(life8_242));
    if (!((life5_5 == 0))) {
        break forward_join_172;
    }
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).O();
    ((net.minecraft.entity.item.EntityArmorStand)(this)).N();
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f__Void();
    }
    return ((0) != 0);
    }
    forwardValue5033_175_0 = 0;
    }
    return ((forwardValue5033_175_0) != 0);
}


public boolean a(double p0) {
double forwardValue5030_24_0;
    int forwardValue5030_34_0;
    int forwardValue5030_38_0;
    int forwardValue5030_40_0;
    int spill5030_0;
    double spill5030_1;
    int spill5030_2;
    long life3_3;
    double life6_10;
    int life5_11;
    double life6_37;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_34: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life3_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 33180189283271L);
    spill5030_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life6_10 = (((moom.CA)(((net.minecraft.entity.item.EntityArmorStand)(this)).b())).a() * 0x1.0p2d);
    life5_11 = spill5030_0;
    spill5030_1 = life6_10;
    if (!((life5_11 != 0))) {
        forwardValue5030_24_0 = spill5030_1;
        break forward_join_24;
    }
    if (!((!java.lang.Double.isNaN(((double)(spill5030_1)))))) {
        break forward_join_23;
    }
    spill5030_2 = recovery.source.CarrierOps.dcmpl(((double)(life6_10)), ((double)(0x0.0p0d)));
    if (!((life5_11 != 0))) {
        forwardValue5030_34_0 = spill5030_2;
        break forward_join_34;
    }
    if (!((spill5030_2 == 0))) {
        break forward_join_25;
    }
    }
    forwardValue5030_24_0 = 0x1.0p2d;
    }
    life6_10 = forwardValue5030_24_0;
    }
    life6_37 = (life6_10 * 0x1.0p6d);
    forwardValue5030_34_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)((life6_37 * life6_37))));
    }
    if (!((life5_11 != 0))) {
        forwardValue5030_38_0 = forwardValue5030_34_0;
        break forward_join_38;
    }
    if (!((forwardValue5030_34_0 < 0))) {
        break forward_join_39;
    }
    forwardValue5030_38_0 = 1;
    }
    forwardValue5030_40_0 = forwardValue5030_38_0;
    break forward_join_40;
    }
    forwardValue5030_40_0 = 0;
    }
    return ((forwardValue5030_40_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a__xW() {
return (this.bI)[0];
}


protected float a__sourceReturn_e70c882bc6(float p0, float p1) {
this.a3 = ((float)(this.y));
    this.a2 = ((float)(this.w));
    return 0x0.0p0f;
}


public boolean m__Boolean() {
int forwardValue5045_13_0;
    int forwardValue5045_17_0;
    int forwardValue5045_19_0;
    boolean spill5045_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 86291882749690L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5045_0 = super.m__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue5045_13_0 = ((spill5045_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill5045_0)) {
        break forward_join_18;
    }
    forwardValue5045_13_0 = ((((net.minecraft.entity.item.EntityArmorStand)(this)).Q()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue5045_17_0 = forwardValue5045_13_0;
        break forward_join_17;
    }
    if (!((forwardValue5045_13_0 == 0))) {
        break forward_join_18;
    }
    forwardValue5045_17_0 = 1;
    }
    forwardValue5045_19_0 = forwardValue5045_17_0;
    break forward_join_19;
    }
    forwardValue5045_19_0 = 0;
    }
    return ((forwardValue5045_19_0) != 0);
}


private void m(boolean p0) {
int forwardValue5044_38_0;
    int spill5044_0;
    boolean spill5044_1;
    long life2_3;
    int life5_13;
    int life4_14;
    forward_join_39: {
    forward_join_38: {
    forward_join_30: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 55073516478331L);
    spill5044_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_65541a581e64_invokedynamic5044_3(20034, (1359733980580358489L ^ life2_3)))));
    life4_14 = spill5044_0;
    spill5044_1 = p0;
    if (!((life4_14 == 0))) {
        forwardValue5044_38_0 = ((spill5044_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill5044_1)) {
        break forward_join_30;
    }
    life5_13 = ((byte) (life5_13 | __sourceIntrinsic_65541a581e64_invokedynamic5044_6(3961, (7980889267144910966L ^ life2_3))));
    if (!((life4_14 != 0))) {
        break forward_join_39;
    }
    }
    forwardValue5044_38_0 = ((int)(((byte) (life5_13 & __sourceIntrinsic_65541a581e64_invokedynamic5044_7(9129, (5411610730277487790L ^ life2_3))))));
    }
    life5_13 = forwardValue5044_38_0;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_65541a581e64_invokedynamic5044_10(20034, (1359733980580358489L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(life5_13))))));
    return;
}


private void k(boolean p0) {
int forwardValue5042_34_0;
    int spill5042_0;
    boolean spill5042_1;
    long life2_3;
    int life5_13;
    int life4_14;
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 85979996211652L);
    spill5042_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_fcfe10acf4be_invokedynamic5042_3(20034, (1359738533417730022L ^ life2_3)))));
    life4_14 = spill5042_0;
    spill5042_1 = p0;
    if (!((life4_14 != 0))) {
        forwardValue5042_34_0 = ((spill5042_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill5042_1)) {
        break forward_join_26;
    }
    life5_13 = ((byte) (life5_13 | 2));
    if (!((life4_14 == 0))) {
        break forward_join_35;
    }
    }
    forwardValue5042_34_0 = ((int)(((byte) (life5_13 & __sourceIntrinsic_fcfe10acf4be_invokedynamic5042_6(4591, (6109672474687365214L ^ life2_3))))));
    }
    life5_13 = forwardValue5042_34_0;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_fcfe10acf4be_invokedynamic5042_9(20034, (1359738533417730022L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(life5_13))))));
    return;
}


public void g__Void() {
net.minecraft.util.Rotations forwardValue5040_35_0;
    net.minecraft.util.Rotations forwardValue5040_54_0;
    net.minecraft.util.Rotations forwardValue5040_73_0;
    net.minecraft.util.Rotations forwardValue5040_92_0;
    net.minecraft.util.Rotations forwardValue5040_111_0;
    int forwardValue5040_124_0;
    int forwardValue5040_141_0;
    int forwardValue5040_145_0;
    int spill5040_0;
    net.minecraft.util.Rotations spill5040_1;
    net.minecraft.util.Rotations spill5040_2;
    net.minecraft.util.Rotations spill5040_3;
    net.minecraft.util.Rotations spill5040_4;
    net.minecraft.util.Rotations spill5040_5;
    boolean spill5040_6;
    boolean spill5040_7;
    int spill5040_8;
    long life1_3;
    net.minecraft.util.Rotations life4_15;
    int life3_16;
    net.minecraft.util.Rotations life5_41;
    net.minecraft.util.Rotations life6_66;
    net.minecraft.util.Rotations life7_91;
    net.minecraft.util.Rotations life8_116;
    net.minecraft.util.Rotations life9_141;
    int life10_160;
    forward_join_150: {
    forward_join_147: {
    forward_join_146: {
    forward_join_145: {
    forward_join_141: {
    forward_join_139: {
    forward_join_124: {
    forward_join_122: {
    forward_join_111: {
    forward_join_103: {
    forward_join_92: {
    forward_join_84: {
    forward_join_73: {
    forward_join_65: {
    forward_join_54: {
    forward_join_46: {
    forward_join_35: {
    forward_join_27: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 136319454644382L);
    spill5040_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    super.g__Void();
    life4_15 = ((net.minecraft.entity.DataWatcher)(this.al)).a__DF(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5040_4(28891, (5830472702656102436L ^ life1_3)))));
    life3_16 = spill5040_0;
    spill5040_1 = this.bN;
    if (!((life3_16 == 0))) {
        forwardValue5040_35_0 = spill5040_1;
        break forward_join_35;
    }
    if (!((!((net.minecraft.util.Rotations)(spill5040_1)).equals(((java.lang.Object)(life4_15)))))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).a(((net.minecraft.util.Rotations)(life4_15)));
    }
    forwardValue5040_35_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a__DF(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5040_10(16001, (5980764153328012923L ^ life1_3)))));
    }
    life5_41 = forwardValue5040_35_0;
    spill5040_2 = this.bO;
    if (!((life3_16 == 0))) {
        forwardValue5040_54_0 = spill5040_2;
        break forward_join_54;
    }
    if (!((!((net.minecraft.util.Rotations)(spill5040_2)).equals(((java.lang.Object)(life5_41)))))) {
        break forward_join_46;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).b(((net.minecraft.util.Rotations)(life5_41)));
    }
    forwardValue5040_54_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a__DF(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5040_16(16103, (3972824942822100490L ^ life1_3)))));
    }
    life6_66 = forwardValue5040_54_0;
    spill5040_3 = this.bP;
    if (!((life3_16 == 0))) {
        forwardValue5040_73_0 = spill5040_3;
        break forward_join_73;
    }
    if (!((!((net.minecraft.util.Rotations)(spill5040_3)).equals(((java.lang.Object)(life6_66)))))) {
        break forward_join_65;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).c(((net.minecraft.util.Rotations)(life6_66)));
    }
    forwardValue5040_73_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a__DF(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5040_22(7564, (1976566763583450476L ^ life1_3)))));
    }
    life7_91 = forwardValue5040_73_0;
    spill5040_4 = this.bQ;
    if (!((life3_16 == 0))) {
        forwardValue5040_92_0 = spill5040_4;
        break forward_join_92;
    }
    if (!((!((net.minecraft.util.Rotations)(spill5040_4)).equals(((java.lang.Object)(life7_91)))))) {
        break forward_join_84;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).d(((net.minecraft.util.Rotations)(life7_91)));
    }
    forwardValue5040_92_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a__DF(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5040_28(30844, (4924140005021010052L ^ life1_3)))));
    }
    life8_116 = forwardValue5040_92_0;
    spill5040_5 = this.bR;
    if (!((life3_16 == 0))) {
        forwardValue5040_111_0 = spill5040_5;
        break forward_join_111;
    }
    if (!((!((net.minecraft.util.Rotations)(spill5040_5)).equals(((java.lang.Object)(life8_116)))))) {
        break forward_join_103;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).e(((net.minecraft.util.Rotations)(life8_116)));
    }
    forwardValue5040_111_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a__DF(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5040_34(31009, (5268508554890234304L ^ life1_3)))));
    }
    life9_141 = forwardValue5040_111_0;
    spill5040_6 = ((net.minecraft.util.Rotations)(this.bS)).equals(((java.lang.Object)(life9_141)));
    if (!((life3_16 == 0))) {
        forwardValue5040_124_0 = ((spill5040_6) ? 1 : 0);
        break forward_join_124;
    }
    if (!((!spill5040_6))) {
        break forward_join_122;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).f(((net.minecraft.util.Rotations)(life9_141)));
    }
    forwardValue5040_124_0 = ((((net.minecraft.entity.item.EntityArmorStand)(this)).Q()) ? 1 : 0);
    }
    life10_160 = forwardValue5040_124_0;
    spill5040_7 = this.bM;
    if (!((life3_16 == 0))) {
        forwardValue5040_141_0 = ((spill5040_7) ? 1 : 0);
        break forward_join_141;
    }
    if (!((!spill5040_7))) {
        break forward_join_139;
    }
    spill5040_8 = life10_160;
    if (!((life3_16 == 0))) {
        forwardValue5040_141_0 = spill5040_8;
        break forward_join_141;
    }
    if (!((spill5040_8 != 0))) {
        break forward_join_139;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).i(((boolean)(false)));
    if (!((life3_16 != 0))) {
        break forward_join_150;
    }
    }
    forwardValue5040_141_0 = ((this.bM) ? 1 : 0);
    }
    if (!((life3_16 == 0))) {
        forwardValue5040_145_0 = forwardValue5040_141_0;
        break forward_join_145;
    }
    if (!((forwardValue5040_141_0 != 0))) {
        break forward_join_146;
    }
    forwardValue5040_145_0 = life10_160;
    }
    if (!((forwardValue5040_145_0 != 0))) {
        break forward_join_147;
    }
    }
    return;
    }
    ((net.minecraft.entity.item.EntityArmorStand)(this)).i(((boolean)(true)));
    }
    this.bM = ((boolean)__sourceIntrinsic_integerToBoolean((life10_160)));
    return;
}


private void j(boolean p0) {
int forwardValue5041_34_0;
    int spill5041_0;
    boolean spill5041_1;
    long life2_3;
    int life5_13;
    int life4_14;
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 4462011768445L);
    spill5041_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_b5913f5f2202_invokedynamic5041_3(20034, (1359674503449782367L ^ life2_3)))));
    life4_14 = spill5041_0;
    spill5041_1 = p0;
    if (!((life4_14 == 0))) {
        forwardValue5041_34_0 = ((spill5041_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill5041_1)) {
        break forward_join_26;
    }
    life5_13 = ((byte) (life5_13 | 1));
    if (!((life4_14 != 0))) {
        break forward_join_35;
    }
    }
    forwardValue5041_34_0 = ((int)(((byte) (life5_13 & __sourceIntrinsic_b5913f5f2202_invokedynamic5041_6(18217, (2961175579893834028L ^ life2_3))))));
    }
    life5_13 = forwardValue5041_34_0;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_b5913f5f2202_invokedynamic5041_9(20034, (1359674503449782367L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(life5_13))))));
    return;
}


public boolean E__sourceReturn_aae029aa0a() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.item.EntityArmorStand)(this)).v__Boolean())) != 0);
}


public boolean L__Boolean() {
int forwardValue5022_13_0;
    int forwardValue5022_17_0;
    int forwardValue5022_19_0;
    boolean spill5022_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 12037643968298L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5022_0 = super.L__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue5022_13_0 = ((spill5022_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill5022_0)) {
        break forward_join_18;
    }
    forwardValue5022_13_0 = ((((net.minecraft.entity.item.EntityArmorStand)(this)).N__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5022_17_0 = forwardValue5022_13_0;
        break forward_join_17;
    }
    if (!((forwardValue5022_13_0 == 0))) {
        break forward_join_18;
    }
    forwardValue5022_17_0 = 1;
    }
    forwardValue5022_19_0 = forwardValue5022_17_0;
    break forward_join_19;
    }
    forwardValue5022_19_0 = 0;
    }
    return ((forwardValue5022_19_0) != 0);
}


private void N() {
net.minecraft.world.World forwardValue5024_14_0;
    net.minecraft.world.World spill5024_0;
    long life1_3;
    int life3_5;
    forward_join_58: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 128964917950573L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5024_0 = this.i;
    if (!((life3_5 != 0))) {
        forwardValue5024_14_0 = spill5024_0;
        break forward_join_14;
    }
    if (!((((spill5024_0 instanceof net.minecraft.world.WorldServer) ? 1 : 0) != 0))) {
        break forward_join_58;
    }
    forwardValue5024_14_0 = this.i;
    }
    ((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(forwardValue5024_14_0)))).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BLOCK_DUST)), ((double)(this.n)), ((double)((this.o + (((double) this.H) / 0x1.8p0d)))), ((double)(this.p)), ((int)(__sourceIntrinsic_1064005e14b6_invokedynamic5024_11(20034, (1359798490711494223L ^ life1_3)))), ((double)(((double) (this.G / 0x1.0p2f)))), ((double)(((double) (this.H / 0x1.0p2f)))), ((double)(((double) (this.G / 0x1.0p2f)))), ((double)(0x1.999999999999ap-5d)), ((int[])(new int[] {net.minecraft.block.Block.a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())))})));
    }
    return;
}


public boolean N__Boolean() {
int forwardValue5025_20_0;
    int forwardValue5025_22_0;
    int spill5025_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 14938025603206L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5025_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a97bfb6c3ddd_invokedynamic5025_3(3262, (8542440505419367502L ^ life1_3))))) & 2);
    if (!((life3_5 == 0))) {
        forwardValue5025_20_0 = spill5025_0;
        break forward_join_20;
    }
    if (!((spill5025_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5025_20_0 = 1;
    }
    forwardValue5025_22_0 = forwardValue5025_20_0;
    break forward_join_22;
    }
    forwardValue5025_22_0 = 0;
    }
    return ((forwardValue5025_22_0) != 0);
}


public boolean M() {
int forwardValue5023_20_0;
    int forwardValue5023_22_0;
    int spill5023_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 46189709349186L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5023_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_d3c1d2a43577_invokedynamic5023_3(20034, (1359707538149353312L ^ life1_3))))) & 1);
    if (!((life3_5 == 0))) {
        forwardValue5023_20_0 = spill5023_0;
        break forward_join_20;
    }
    if (!((spill5023_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5023_20_0 = 1;
    }
    forwardValue5023_22_0 = forwardValue5023_20_0;
    break forward_join_22;
    }
    forwardValue5023_22_0 = 0;
    }
    return ((forwardValue5023_22_0) != 0);
}


public boolean P__Boolean() {
int forwardValue5028_24_0;
    int forwardValue5028_26_0;
    int spill5028_0;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 108287808956386L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5028_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_08575ba482f4_invokedynamic5028_3(20034, (1359786592503665088L ^ life1_3))))) & __sourceIntrinsic_08575ba482f4_invokedynamic5028_5(3961, (7980801759518281967L ^ life1_3)));
    if (!((life3_5 == 0))) {
        forwardValue5028_24_0 = spill5028_0;
        break forward_join_24;
    }
    if (!((spill5028_0 != 0))) {
        break forward_join_25;
    }
    forwardValue5028_24_0 = 1;
    }
    forwardValue5028_26_0 = forwardValue5028_24_0;
    break forward_join_26;
    }
    forwardValue5028_26_0 = 0;
    }
    return ((forwardValue5028_26_0) != 0);
}


private void P() {
net.minecraft.item.ItemStack lexicalValue1570_24_0;
    net.minecraft.item.ItemStack lexicalValue1570_34_0;
    net.minecraft.item.ItemStack[] lexicalValue1570_50_0;
    int lexicalValue1570_50_1;
    int spill1570_0;
    net.minecraft.item.ItemStack spill1570_1;
    net.minecraft.item.ItemStack[] spill1570_2;
    int spill1570_3;
    long life1_3;
    int life4_6;
    int life3_7;
    lexical_join_55: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 111964392943136L);
    spill1570_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_6 = 0;
    life3_7 = spill1570_0;
    lexical_cycle_8: while (true) {
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_47: {
    lexical_join_34: {
    lexical_join_24: {
    if (!((life4_6 < (this.bI).length))) {
        break lexical_join_55;
    }
    spill1570_1 = (this.bI)[life4_6];
    if (!((life3_7 == 0))) {
        lexicalValue1570_24_0 = spill1570_1;
        break lexical_join_24;
    }
    if (!((spill1570_1 != null))) {
        break lexical_join_52;
    }
    lexicalValue1570_24_0 = (this.bI)[life4_6];
    }
    if (!((life3_7 == 0))) {
        lexicalValue1570_34_0 = lexicalValue1570_24_0;
        break lexical_join_34;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1570_24_0)).b > 0))) {
        break lexical_join_52;
    }
    spill1570_2 = this.bI;
    spill1570_3 = life4_6;
    if (!((life3_7 == 0))) {
        lexicalValue1570_50_0 = spill1570_2;
        lexicalValue1570_50_1 = spill1570_3;
        break lexical_join_50;
    }
    lexicalValue1570_34_0 = (spill1570_2)[spill1570_3];
    }
    if (!((lexicalValue1570_34_0 != null))) {
        break lexical_join_47;
    }
    net.minecraft.block.Block.a(((net.minecraft.world.World)(this.i)), ((moom.DT)(((moom.DT)(new moom.DT(this))).a__DT())), ((net.minecraft.item.ItemStack)((this.bI)[life4_6])));
    }
    lexicalValue1570_50_0 = this.bI;
    lexicalValue1570_50_1 = life4_6;
    }
    (lexicalValue1570_50_0)[lexicalValue1570_50_1] = null;
    }
    life4_6 += 1;
    if (!((life3_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public boolean Q() {
int forwardValue5029_24_0;
    int forwardValue5029_26_0;
    int spill5029_0;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 33950016563362L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5029_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_1c9f2e1ff763_invokedynamic5029_3(20034, (1359684871064821376L ^ life1_3))))) & __sourceIntrinsic_1c9f2e1ff763_invokedynamic5029_5(10571, (2837628275735460238L ^ life1_3)));
    if (!((life3_5 == 0))) {
        forwardValue5029_24_0 = spill5029_0;
        break forward_join_24;
    }
    if (!((spill5029_0 != 0))) {
        break forward_join_25;
    }
    forwardValue5029_24_0 = 1;
    }
    forwardValue5029_26_0 = forwardValue5029_24_0;
    break forward_join_26;
    }
    forwardValue5029_26_0 = 0;
    }
    return ((forwardValue5029_26_0) != 0);
}


private void O() {
net.minecraft.block.Block.a(((net.minecraft.world.World)(this.i)), ((moom.DT)(new moom.DT(this))), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bY))));
    ((net.minecraft.entity.item.EntityArmorStand)(this)).P();
    return;
}


public boolean O__Boolean() {
int forwardValue5026_20_0;
    int forwardValue5026_22_0;
    int spill5026_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.item.EntityArmorStand.cb ^ 57902425382623L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5026_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_bfe3460f001c_invokedynamic5026_3(20034, (1359726887308945661L ^ life1_3))))) & 4);
    if (!((life3_5 == 0))) {
        forwardValue5026_20_0 = spill5026_0;
        break forward_join_20;
    }
    if (!((spill5026_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5026_20_0 = 1;
    }
    forwardValue5026_22_0 = forwardValue5026_20_0;
    break forward_join_22;
    }
    forwardValue5026_22_0 = 0;
    }
    return ((forwardValue5026_22_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_6f1936852fa2_originalDynamicSite1895_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5034_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5034_3(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c23f50d43b1e_call5038_3(net.minecraft.entity.item.EntityArmorStand a0, float a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9db2f8c4e3f7_originalDynamicSite1896_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral11313_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04856e8b6ecf_originalDynamicSite1897_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1571_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1571_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5046_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5046_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5046_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5046_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6877e24a3a4d_originalDynamicSite1898_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5043_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5043_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5043_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_06b9782bf474_originalDynamicSite1899_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1900_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a5b1251bf743_originalDynamicSite1901_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db072f44042f_invokedynamic5031_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db072f44042f_invokedynamic5031_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5044_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5044_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5044_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5044_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fcfe10acf4be_invokedynamic5042_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fcfe10acf4be_invokedynamic5042_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fcfe10acf4be_invokedynamic5042_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5040_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5040_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5040_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5040_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5040_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5040_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5913f5f2202_invokedynamic5041_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5913f5f2202_invokedynamic5041_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5913f5f2202_invokedynamic5041_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1064005e14b6_invokedynamic5024_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5025_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3c1d2a43577_invokedynamic5023_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_08575ba482f4_invokedynamic5028_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_08575ba482f4_invokedynamic5028_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1c9f2e1ff763_invokedynamic5029_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1c9f2e1ff763_invokedynamic5029_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfe3460f001c_invokedynamic5026_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
