package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntitySlime extends net.minecraft.entity.EntityLiving implements moom.vP {

public float bX;

public float bY;

public float bZ;

private boolean b0;

private static final long db;

private static final long[] eb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

private static final long vb;

public EntitySlime(net.minecraft.world.World p0) {
super(p0);
    this.bF = new moom.vx(this);
    (this.bJ).a(1, new moom.vl(this));
    (this.bJ).a(2, new moom.vj(this));
    (this.bJ).a(3, new moom.vk(this));
    (this.bJ).a(5, new moom.vm(this));
    (this.bK).a(1, new moom.ur(this));
    (this.bK).a(3, new moom.uq(this, net.minecraft.entity.monster.EntityIronGolem.class));
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(8368350035080485487L)), ((long)(-6766025849902623483L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272814411234044L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (net.minecraft.entity.monster.EntitySlime.db ^ 91964366453782L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill1195_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1195_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1195_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1195_14 = new byte[8];
    (__sourceSpill1195_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill1195_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation1195_16 = __sourceSpill1195_14;
    ((javax.crypto.Cipher)(__sourceSpill1195_11)).init(((int)(__sourceSpill1195_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1195_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1195_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[8];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = ".í¬ò¶7b)ïÛiuM©`P°ªz^²îLãÖÁÙê\013aà\001\004\003*¼Í¹\031v\003É\020"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1195_25 = local11_life21;
        int __sourceSpill1195_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1195_25)).substring(((int)(__sourceSpill1195_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1195_30 = local13_life19;
        int __sourceSpill1195_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill1195_33 = new byte[8];
        (__sourceSpill1195_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill1195_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill1195_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill1195_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill1195_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill1195_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill1195_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill1195_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill1195_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill1195_34)).doFinal(((byte[])(__sourceSpill1195_33)));
        (__sourceSpill1195_30)[__sourceSpill1195_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "ýTl_kô>C¢éOV?Rß\b"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1195_38 = local11_life21;
        int __sourceSpill1195_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1195_38)).substring(((int)(__sourceSpill1195_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1195_43 = local13_life19;
        int __sourceSpill1195_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill1195_46 = new byte[8];
        (__sourceSpill1195_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill1195_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill1195_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill1195_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill1195_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill1195_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill1195_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill1195_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill1195_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill1195_47)).doFinal(((byte[])(__sourceSpill1195_46)));
        (__sourceSpill1195_43)[__sourceSpill1195_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    eb = ((long[])(local13_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[8]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill1195_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1195_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1195_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1195_58 = new byte[8];
    (__sourceSpill1195_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill1195_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation1195_60 = __sourceSpill1195_58;
    ((javax.crypto.Cipher)(__sourceSpill1195_55)).init(((int)(__sourceSpill1195_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1195_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1195_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -8827740734769768221L;
    byte[] __sourceSpill1195_64 = new byte[8];
    (__sourceSpill1195_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill1195_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill1195_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill1195_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill1195_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill1195_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill1195_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill1195_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill1195_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill1195_65)).doFinal(((byte[])(__sourceSpill1195_64)));
    vb = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}


protected void D__sourceReturn_da8c82d5d4() {
this.u = ((double)(0x1.ae147ap-2d));
    this.ad = ((boolean)(true));
    return;
}


protected boolean Z() {
int forwardValue5186_12_0;
    int forwardValue5186_14_0;
    int spill5186_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 139906434405314L);
    life3_5 = moom.vN.b();
    spill5186_0 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    if (!((life3_5 == null))) {
        forwardValue5186_12_0 = spill5186_0;
        break forward_join_12;
    }
    if (!((spill5186_0 > 0))) {
        break forward_join_13;
    }
    forwardValue5186_12_0 = 1;
    }
    forwardValue5186_14_0 = forwardValue5186_12_0;
    break forward_join_14;
    }
    forwardValue5186_14_0 = 0;
    }
    return ((forwardValue5186_14_0) != 0);
}


protected java.lang.String b__sourceReturn_0e30dfc966() {
long local1 = (net.minecraft.entity.monster.EntitySlime.db ^ 28350440830942L);
    return __sourceIntrinsic_d5893d8e80ad_invokedynamic11501_2(((((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871() > 1) ? "big" : "small"));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float e__Float() {
return (0x1.4p-1f * this.H);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
long life2_3;
    int life5_11;
    net.minecraft.entity.Entity[] life4_12;
    life2_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 120231827994851L);
    net.minecraft.entity.Entity[] spill9447_0 = moom.vN.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_11 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Size")));
    life4_12 = spill9447_0;
    if ((life4_12 == null)) {
        if ((life5_11 < 0)) {
        life5_11 = 0;
    }
        ((net.minecraft.entity.monster.EntitySlime)(this)).j(((int)((life5_11 + 1))));
        this.b0 = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("wasOnGround")))));
    }
    return;
}


protected java.lang.String c__String() {
long local1 = (net.minecraft.entity.monster.EntitySlime.db ^ 74698044339760L);
    return __sourceIntrinsic_1b9166c333f3_invokedynamic11503_2(((((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871() > 1) ? "big" : "small"));
}


protected java.lang.String h__String() {
long local1 = (net.minecraft.entity.monster.EntitySlime.db ^ 57385900086597L);
    return __sourceIntrinsic_177375e0f408_invokedynamic11504_2(((((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871() > 1) ? "big" : "small"));
}


public void f(int p0) {
net.minecraft.entity.monster.EntitySlime forwardValue5192_55_0;
    net.minecraft.entity.monster.EntitySlime spill5192_0;
    net.minecraft.entity.monster.EntitySlime spill5192_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_20;
    forward_join_57: {
    forward_join_55: {
    forward_join_54: {
    life2_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 91000468222243L);
    life4_5 = moom.vN.b();
    if (!((life4_5 == null))) {
        break forward_join_57;
    }
    if (!((p0 == __sourceIntrinsic_aefe61b07874_invokedynamic5192_2(2890, (1437758274186638131L ^ life2_3))))) {
        break forward_join_54;
    }
    life5_20 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    ((net.minecraft.entity.monster.EntitySlime)(this)).a__Void(((float)((0x1.051ebap-1f * ((float) life5_20)))), ((float)((0x1.051ebap-1f * ((float) life5_20)))));
    this.w = ((float)(this.a4));
    this.a2 = ((float)(this.a4));
    spill5192_0 = this;
    if (!((life4_5 == null))) {
        forwardValue5192_55_0 = spill5192_0;
        break forward_join_55;
    }
    if (!(((net.minecraft.entity.monster.EntitySlime)(spill5192_0)).j__Boolean())) {
        break forward_join_54;
    }
    spill5192_1 = this;
    if (!((life4_5 == null))) {
        forwardValue5192_55_0 = spill5192_1;
        break forward_join_55;
    }
    if (!((((java.util.Random)(((net.minecraft.entity.monster.EntitySlime)(spill5192_1)).ah)).nextInt(((int)(__sourceIntrinsic_aefe61b07874_invokedynamic5192_11(23482, (3597947487165981633L ^ life2_3))))) == 0))) {
        break forward_join_54;
    }
    ((net.minecraft.entity.monster.EntitySlime)(this)).n__Void();
    }
    forwardValue5192_55_0 = this;
    }
    __sourceIntrinsic_aefe61b07874_call5192_14(forwardValue5192_55_0, p0);
    }
    return;
}


public void f__Void() {
int lexicalValue1591_26_0;
    int lexicalValue1591_79_0;
    int lexicalValue1591_115_0;
    net.minecraft.entity.monster.EntitySlime lexicalValue1591_120_0;
    net.minecraft.entity.Entity[] spill1591_0;
    net.minecraft.entity.monster.EntitySlime spill1591_1;
    int spill1591_2;
    net.minecraft.entity.monster.EntitySlime spill1591_3;
    net.minecraft.entity.monster.EntitySlime spill1591_4;
    boolean spill1591_5;
    long life1_3;
    int life4_7;
    net.minecraft.entity.Entity[] life3_8;
    int life5_48;
    int life6_50;
    float life7_65;
    float life8_77;
    net.minecraft.entity.monster.EntitySlime life9_80;
    lexical_join_120: {
    lexical_join_119: {
    lexical_join_26: {
    life1_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 128925929558861L);
    spill1591_0 = moom.vN.b();
    life4_7 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    life3_8 = spill1591_0;
    spill1591_1 = this;
    if (!((life3_8 == null))) {
        lexicalValue1591_120_0 = spill1591_1;
        break lexical_join_120;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.monster.EntitySlime)(spill1591_1)).i)).G))) {
        break lexical_join_119;
    }
    spill1591_2 = life4_7;
    if (!((life3_8 == null))) {
        lexicalValue1591_26_0 = spill1591_2;
        break lexical_join_26;
    }
    if (!((spill1591_2 > 1))) {
        break lexical_join_119;
    }
    spill1591_3 = this;
    if (!((life3_8 == null))) {
        lexicalValue1591_120_0 = spill1591_3;
        break lexical_join_120;
    }
    lexicalValue1591_26_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.monster.EntitySlime)(spill1591_3)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue1591_26_0 <= 0))) {
        break lexical_join_119;
    }
    life5_48 = (2 + ((java.util.Random)(this.ah)).nextInt(((int)(3))));
    life6_50 = 0;
    lexical_cycle_36: while (true) {
    lexical_join_115: {
    lexical_join_84: {
    lexical_join_79: {
    lexical_join_77: {
    if (!((life6_50 < life5_48))) {
        break lexical_join_119;
    }
    life7_65 = (((((float) (life6_50 % 2)) - 0x1.0p-1f) * ((float) life4_7)) / 0x1.0p2f);
    life8_77 = (((((float) (life6_50 / 2)) - 0x1.0p-1f) * ((float) life4_7)) / 0x1.0p2f);
    life9_80 = ((net.minecraft.entity.monster.EntitySlime)(this)).a__tg();
    spill1591_4 = this;
    if (!((life3_8 == null))) {
        lexicalValue1591_120_0 = spill1591_4;
        break lexical_join_120;
    }
    spill1591_5 = ((net.minecraft.entity.monster.EntitySlime)(spill1591_4)).e__Boolean();
    if (!((life3_8 == null))) {
        lexicalValue1591_79_0 = ((spill1591_5) ? 1 : 0);
        break lexical_join_79;
    }
    if (!(spill1591_5)) {
        break lexical_join_77;
    }
    ((net.minecraft.entity.monster.EntitySlime)(life9_80)).a(((java.lang.String)(((net.minecraft.entity.monster.EntitySlime)(this)).g__String())));
    }
    lexicalValue1591_79_0 = ((((net.minecraft.entity.monster.EntitySlime)(this)).R__Boolean()) ? 1 : 0);
    }
    if (!((life3_8 == null))) {
        lexicalValue1591_115_0 = lexicalValue1591_79_0;
        break lexical_join_115;
    }
    if (!((lexicalValue1591_79_0 != 0))) {
        break lexical_join_84;
    }
    ((net.minecraft.entity.monster.EntitySlime)(life9_80)).S();
    }
    ((net.minecraft.entity.monster.EntitySlime)(life9_80)).j(((int)((life4_7 / 2))));
    ((net.minecraft.entity.monster.EntitySlime)(life9_80)).c(((double)((this.n + ((double) life7_65)))), ((double)((this.o + 0x1.0p-1d))), ((double)((this.p + ((double) life8_77)))), ((float)((((java.util.Random)(this.ah)).nextFloat() * 0x1.68p8f))), ((float)(0x0.0p0f)));
    lexicalValue1591_115_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life9_80)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1591_115_0);
    life6_50 += 1;
    if (!((life3_8 != null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    lexicalValue1591_120_0 = this;
    }
    __sourceIntrinsic_93a5090229a0_call1591_28(lexicalValue1591_120_0);
    return;
}


protected float f__sourceReturn_bc607678b6() {
return (0x1.99999ap-2f * ((float) ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871()));
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11507_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntitySlime.db ^ 27841149273264L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1951_3(2890, (1437697325056181920L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(1))))));
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntitySlime.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Size")), ((int)((((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871() - 1))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("wasOnGround")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.b0) ? 1 : 0)))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20262;
      if (ib[var3] == null) {
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
         long var5 = eb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


protected void d(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue5190_28_0;
    int forwardValue5190_38_0;
    net.minecraft.entity.Entity[] spill5190_0;
    boolean spill5190_1;
    long life2_3;
    int life5_7;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_58: {
    forward_join_38: {
    forward_join_28: {
    life2_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 123540269688316L);
    spill5190_0 = moom.vN.b();
    life5_7 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    life4_8 = spill5190_0;
    spill5190_1 = ((net.minecraft.entity.monster.EntitySlime)(this)).d__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_8 == null))) {
        forwardValue5190_28_0 = ((spill5190_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill5190_1)) {
        break forward_join_58;
    }
    forwardValue5190_28_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.monster.EntitySlime)(this)).a(((net.minecraft.entity.Entity)(p0))))), ((double)((((0x1.3333333333333p-1d * ((double) life5_7)) * 0x1.3333333333333p-1d) * ((double) life5_7)))));
    }
    if (!((life4_8 == null))) {
        forwardValue5190_38_0 = forwardValue5190_28_0;
        break forward_join_38;
    }
    if (!((forwardValue5190_28_0 < 0))) {
        break forward_join_58;
    }
    forwardValue5190_38_0 = ((((net.minecraft.entity.EntityLivingBase)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(((float) ((net.minecraft.entity.monster.EntitySlime)(this)).q__sourceReturn_8abf5c6871()))))) ? 1 : 0);
    }
    if (!((forwardValue5190_38_0 != 0))) {
        break forward_join_58;
    }
    ((net.minecraft.entity.monster.EntitySlime)(this)).a(((java.lang.String)("mob.attack")), ((float)(0x1.0p0f)), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    ((net.minecraft.entity.monster.EntitySlime)(this)).a(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.Entity)(p0)));
    }
    return;
}


public void d(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.monster.EntitySlime forwardValue5191_12_0;
    net.minecraft.entity.monster.EntitySlime spill5191_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 25592318452741L);
    life4_5 = moom.vN.b();
    spill5191_0 = this;
    if (!((life4_5 == null))) {
        forwardValue5191_12_0 = spill5191_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.entity.monster.EntitySlime)(spill5191_0)).Y())) {
        break forward_join_14;
    }
    forwardValue5191_12_0 = this;
    }
    ((net.minecraft.entity.monster.EntitySlime)(forwardValue5191_12_0)).d(((net.minecraft.entity.EntityLivingBase)(p0)));
    }
    return;
}


public void a__Void(net.minecraft.entity.Entity p0) {
int forwardValue5188_18_0;
    net.minecraft.entity.monster.EntitySlime forwardValue5188_20_0;
    net.minecraft.entity.Entity[] spill5188_0;
    int spill5188_1;
    net.minecraft.entity.monster.EntitySlime spill5188_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_23: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 73617092877717L);
    spill5188_0 = moom.vN.b();
    super.a__Void(((net.minecraft.entity.Entity)(p0)));
    life4_8 = spill5188_0;
    spill5188_1 = ((p0 instanceof net.minecraft.entity.monster.EntityIronGolem) ? 1 : 0);
    if (!((life4_8 == null))) {
        forwardValue5188_18_0 = spill5188_1;
        break forward_join_18;
    }
    if (!((spill5188_1 != 0))) {
        break forward_join_23;
    }
    spill5188_2 = this;
    if (!((life4_8 == null))) {
        forwardValue5188_20_0 = spill5188_2;
        break forward_join_20;
    }
    forwardValue5188_18_0 = ((((net.minecraft.entity.monster.EntitySlime)(spill5188_2)).Y()) ? 1 : 0);
    }
    if (!((forwardValue5188_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue5188_20_0 = this;
    }
    ((net.minecraft.entity.monster.EntitySlime)(forwardValue5188_20_0)).d(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))));
    }
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
int forwardValue5187_30_0;
    int forwardValue5187_30_1;
    int forwardValue5187_31_0;
    net.minecraft.entity.Entity[] spill5187_0;
    int spill5187_1;
    int spill5187_2;
    int spill5187_3;
    long life3_3;
    int life6_9;
    net.minecraft.entity.Entity[] life5_10;
    int life7_40;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    life3_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 71550855090412L);
    spill5187_0 = moom.vN.b();
    life6_9 = ((java.util.Random)(this.ah)).nextInt(((int)(3)));
    life5_10 = spill5187_0;
    spill5187_1 = life6_9;
    spill5187_2 = 2;
    if (!((life5_10 == null))) {
        forwardValue5187_30_0 = spill5187_1;
        forwardValue5187_30_1 = spill5187_2;
        break forward_join_30;
    }
    if (!((spill5187_1 < spill5187_2))) {
        break forward_join_28;
    }
    spill5187_3 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)((0x1.0p-1f * ((moom.Eh)(p0)).b()))));
    if (!((life5_10 == null))) {
        forwardValue5187_31_0 = spill5187_3;
        break forward_join_31;
    }
    if (!((spill5187_3 < 0))) {
        break forward_join_28;
    }
    life6_9 += 1;
    }
    forwardValue5187_30_0 = 1;
    forwardValue5187_30_1 = life6_9;
    }
    forwardValue5187_31_0 = (forwardValue5187_30_0 << forwardValue5187_30_1);
    }
    life7_40 = forwardValue5187_31_0;
    ((net.minecraft.entity.monster.EntitySlime)(this)).j(((int)(life7_40)));
    return super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
}


protected net.minecraft.util.EnumParticleTypes a__sourceReturn_9e1ef7b70b() {
return net.minecraft.util.EnumParticleTypes.SLIME;
}


protected net.minecraft.entity.monster.EntitySlime a__tg() {
return new net.minecraft.entity.monster.EntitySlime(this.i);
}


protected net.minecraft.item.Item a__wQ() {
long local1 = (net.minecraft.entity.monster.EntitySlime.db ^ 59875977865281L);
    return ((((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871() == 1) ? net.minecraft.init.Items.aM : null);
}


public int m__Int() {
return 0;
}


public int o__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.monster.EntitySlime.db ^ 29801009062413L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_dfa328755c60_originalDynamicSite1952_2(2890, (1437695365198372893L ^ local1)))));
}


protected int p__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.monster.EntitySlime.db ^ 114812706191245L);
    return (((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_27980f560860_originalDynamicSite1953_2(10482, (2090302540737156644L ^ local1))))) + __sourceIntrinsic_27980f560860_originalDynamicSite1953_4(27320, (6970670091163096170L ^ local1)));
}


public void g__Void() {
net.minecraft.entity.monster.EntitySlime lexicalValue1592_46_0;
    int lexicalValue1592_47_0;
    net.minecraft.entity.monster.EntitySlime lexicalValue1592_166_0;
    int lexicalValue1592_174_0;
    net.minecraft.entity.monster.EntitySlime lexicalValue1592_188_0;
    boolean spill1592_0;
    net.minecraft.entity.monster.EntitySlime spill1592_1;
    int spill1592_2;
    boolean spill1592_3;
    net.minecraft.entity.monster.EntitySlime spill1592_4;
    net.minecraft.entity.monster.EntitySlime spill1592_5;
    net.minecraft.entity.monster.EntitySlime spill1592_6;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_84;
    int life5_86;
    float life6_103;
    float life7_111;
    float life8_121;
    float life9_131;
    net.minecraft.world.World life10_134;
    net.minecraft.util.EnumParticleTypes life11_137;
    double life12_143;
    double life14_149;
    lexical_join_188: {
    lexical_join_183: {
    lexical_join_174: {
    lexical_join_170: {
    lexical_join_168: {
    lexical_join_166: {
    lexical_join_165: {
    lexical_join_141: {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_27: {
    life1_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 98590548727703L);
    life3_5 = moom.vN.b();
    spill1592_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == null))) {
        lexicalValue1592_47_0 = ((spill1592_0) ? 1 : 0);
        break lexical_join_47;
    }
    if (!((!spill1592_0))) {
        break lexical_join_27;
    }
    spill1592_1 = this;
    if (!((life3_5 == null))) {
        lexicalValue1592_46_0 = spill1592_1;
        break lexical_join_46;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntitySlime)(spill1592_1)).i)).a__bB() == net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break lexical_join_27;
    }
    spill1592_2 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    if (!((life3_5 == null))) {
        lexicalValue1592_47_0 = spill1592_2;
        break lexical_join_47;
    }
    if (!((spill1592_2 > 0))) {
        break lexical_join_27;
    }
    this.F = ((boolean)(true));
    }
    net.minecraft.entity.monster.EntitySlime __stackOp1592_10_0 = this;
    ((net.minecraft.entity.monster.EntitySlime)(__stackOp1592_10_0)).bY = ((float)((((net.minecraft.entity.monster.EntitySlime)(__stackOp1592_10_0)).bY + ((this.bX - this.bY) * 0x1.0p-1f))));
    this.bZ = ((float)(this.bY));
    super.g__Void();
    lexicalValue1592_46_0 = this;
    }
    lexicalValue1592_47_0 = ((((net.minecraft.entity.monster.EntitySlime)(lexicalValue1592_46_0)).A) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        lexicalValue1592_174_0 = lexicalValue1592_47_0;
        break lexical_join_174;
    }
    if (!((lexicalValue1592_47_0 != 0))) {
        break lexical_join_170;
    }
    spill1592_3 = this.b0;
    if (!((life3_5 == null))) {
        lexicalValue1592_174_0 = ((spill1592_3) ? 1 : 0);
        break lexical_join_174;
    }
    if (!((!spill1592_3))) {
        break lexical_join_170;
    }
    life4_84 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    life5_86 = 0;
    lexical_cycle_60: while (true) {
    if (!((life5_86 < (life4_84 * __sourceIntrinsic_736a66cda11e_invokedynamic1592_23(23575, (1809129180404351705L ^ life1_3)))))) {
        break lexical_join_141;
    }
    life6_103 = ((((java.util.Random)(this.ah)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    life7_111 = ((((java.util.Random)(this.ah)).nextFloat() * 0x1.0p-1f) + 0x1.0p-1f);
    life8_121 = (((moom.Dr.a(((float)(life6_103))) * ((float) life4_84)) * 0x1.0p-1f) * life7_111);
    life9_131 = (((moom.Dr.b(((float)(life6_103))) * ((float) life4_84)) * 0x1.0p-1f) * life7_111);
    life10_134 = this.i;
    life11_137 = ((net.minecraft.entity.monster.EntitySlime)(this)).a__sourceReturn_9e1ef7b70b();
    life12_143 = (this.n + ((double) life8_121));
    life14_149 = (this.p + ((double) life9_131));
    ((net.minecraft.world.World)(life10_134)).a(((net.minecraft.util.EnumParticleTypes)(life11_137)), ((double)(life12_143)), ((double)(((moom.CA)(((net.minecraft.entity.monster.EntitySlime)(this)).b())).c)), ((double)(life14_149)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life5_86 += 1;
    if (!((life3_5 == null))) {
        break lexical_join_168;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    spill1592_4 = this;
    if (!((life3_5 == null))) {
        lexicalValue1592_166_0 = spill1592_4;
        break lexical_join_166;
    }
    if (!(((net.minecraft.entity.monster.EntitySlime)(spill1592_4)).aa())) {
        break lexical_join_165;
    }
    ((net.minecraft.entity.monster.EntitySlime)(this)).a(((java.lang.String)(((net.minecraft.entity.monster.EntitySlime)(this)).b__sourceReturn_0e30dfc966())), ((float)(((net.minecraft.entity.monster.EntitySlime)(this)).f__sourceReturn_bc607678b6())), ((float)(((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f) / 0x1.99999ap-1f))));
    }
    lexicalValue1592_166_0 = this;
    }
    ((net.minecraft.entity.monster.EntitySlime)(lexicalValue1592_166_0)).bX = ((float)(-0x1.0p-1f));
    }
    if (!((life3_5 != null))) {
        break lexical_join_183;
    }
    }
    spill1592_5 = this;
    if (!((life3_5 == null))) {
        lexicalValue1592_188_0 = spill1592_5;
        break lexical_join_188;
    }
    lexicalValue1592_174_0 = ((((net.minecraft.entity.monster.EntitySlime)(spill1592_5)).A) ? 1 : 0);
    }
    if (!((lexicalValue1592_174_0 == 0))) {
        break lexical_join_183;
    }
    spill1592_6 = this;
    if (!((life3_5 == null))) {
        lexicalValue1592_188_0 = spill1592_6;
        break lexical_join_188;
    }
    if (!(((net.minecraft.entity.monster.EntitySlime)(spill1592_6)).b0)) {
        break lexical_join_183;
    }
    this.bX = ((float)(0x1.0p0f));
    }
    this.b0 = ((boolean)(this.A));
    lexicalValue1592_188_0 = this;
    }
    ((net.minecraft.entity.monster.EntitySlime)(lexicalValue1592_188_0)).W__sourceReturn_da8c82d5d4();
    return;
}


protected void j(int p0) {
long local2 = (net.minecraft.entity.monster.EntitySlime.db ^ 50517449608475L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_29d5bbbacb40_originalDynamicSite1954_2(18678, (2196044179018452147L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) p0)))))));
    ((net.minecraft.entity.monster.EntitySlime)(this)).a__Void(((float)((0x1.051ebap-1f * ((float) p0)))), ((float)((0x1.051ebap-1f * ((float) p0)))));
    ((net.minecraft.entity.monster.EntitySlime)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntitySlime)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(((double) (p0 * p0)))));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntitySlime)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(((double) (0x1.99999ap-3f + (0x1.99999ap-4f * ((float) p0)))))));
    ((net.minecraft.entity.monster.EntitySlime)(this)).d(((float)(((net.minecraft.entity.monster.EntitySlime)(this)).a())));
    this.bD = ((int)(p0));
    return;
}


protected int q__sourceReturn_8abf5c6871() {
return ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
}


public boolean N__Boolean() {
net.minecraft.entity.monster.EntitySlime forwardValue5184_41_0;
    net.minecraft.world.World forwardValue5184_42_0;
    net.minecraft.world.World forwardValue5184_49_0;
    int forwardValue5184_116_0;
    int forwardValue5184_142_0;
    net.minecraft.entity.Entity[] spill5184_0;
    net.minecraft.world.World spill5184_1;
    net.minecraft.entity.monster.EntitySlime spill5184_2;
    int spill5184_3;
    int spill5184_4;
    int spill5184_5;
    int spill5184_6;
    int spill5184_7;
    int spill5184_8;
    int spill5184_9;
    long life1_3;
    moom.DT life4_15;
    net.minecraft.entity.Entity[] life3_16;
    net.minecraft.world.chunk.Chunk life5_21;
    net.minecraft.world.biome.BiomeGenBase life6_68;
    forward_join_142: {
    forward_join_141: {
    forward_join_116: {
    forward_join_108: {
    forward_join_49: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life1_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 37544713512733L);
    spill5184_0 = moom.vN.b();
    life4_15 = new moom.DT(moom.Dr.b__Int(((double)(this.n))), 0, moom.Dr.b__Int(((double)(this.p))));
    life3_16 = spill5184_0;
    life5_21 = ((net.minecraft.world.World)(this.i)).a__Fk(((moom.DT)(life4_15)));
    spill5184_1 = this.i;
    if (!((life3_16 == null))) {
        forwardValue5184_42_0 = spill5184_1;
        break forward_join_42;
    }
    if (!((((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(spill5184_1)).a__IX())).a__EL() == net.minecraft.world.WorldType.c))) {
        break forward_join_40;
    }
    spill5184_2 = this;
    if (!((life3_16 == null))) {
        forwardValue5184_41_0 = spill5184_2;
        break forward_join_41;
    }
    if (!((((java.util.Random)(((net.minecraft.entity.monster.EntitySlime)(spill5184_2)).ah)).nextInt(((int)(4))) != 1))) {
        break forward_join_40;
    }
    return ((0) != 0);
    }
    forwardValue5184_41_0 = this;
    }
    forwardValue5184_42_0 = ((net.minecraft.entity.monster.EntitySlime)(forwardValue5184_41_0)).i;
    }
    if (!((life3_16 == null))) {
        forwardValue5184_49_0 = forwardValue5184_42_0;
        break forward_join_49;
    }
    if (!((((net.minecraft.world.World)(forwardValue5184_42_0)).a__bB() != net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break forward_join_141;
    }
    forwardValue5184_49_0 = this.i;
    }
    life6_68 = ((net.minecraft.world.World)(forwardValue5184_49_0)).a__ES(((moom.DT)(life4_15)));
    if (!((life6_68 == net.minecraft.world.biome.BiomeGenBase.x))) {
        break forward_join_108;
    }
    spill5184_3 = recovery.source.CarrierOps.dcmpl(((double)(this.o)), ((double)(0x1.9p5d)));
    if (!((life3_16 == null))) {
        forwardValue5184_116_0 = spill5184_3;
        break forward_join_116;
    }
    if (!((spill5184_3 > 0))) {
        break forward_join_108;
    }
    spill5184_4 = recovery.source.CarrierOps.dcmpg(((double)(this.o)), ((double)(0x1.18p6d)));
    if (!((life3_16 == null))) {
        forwardValue5184_116_0 = spill5184_4;
        break forward_join_116;
    }
    if (!((spill5184_4 < 0))) {
        break forward_join_108;
    }
    spill5184_5 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.0p-1f)));
    if (!((life3_16 == null))) {
        forwardValue5184_116_0 = spill5184_5;
        break forward_join_116;
    }
    if (!((spill5184_5 < 0))) {
        break forward_join_108;
    }
    spill5184_6 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(((net.minecraft.world.World)(this.i)).a__Float())));
    if (!((life3_16 == null))) {
        forwardValue5184_116_0 = spill5184_6;
        break forward_join_116;
    }
    if (!((spill5184_6 < 0))) {
        break forward_join_108;
    }
    spill5184_7 = ((net.minecraft.world.World)(this.i)).b(((moom.DT)(new moom.DT(this))));
    if (!((life3_16 == null))) {
        forwardValue5184_116_0 = spill5184_7;
        break forward_join_116;
    }
    if (!((spill5184_7 <= ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_a97bfb6c3ddd_invokedynamic5184_36(4185, (920347570783534617L ^ life1_3)))))))) {
        break forward_join_108;
    }
    return super.N__Boolean();
    }
    forwardValue5184_116_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_a97bfb6c3ddd_invokedynamic5184_40(15223, (8091677609930102070L ^ life1_3)))));
    }
    if (!((life3_16 == null))) {
        forwardValue5184_142_0 = forwardValue5184_116_0;
        break forward_join_142;
    }
    if (!((forwardValue5184_116_0 == 0))) {
        break forward_join_141;
    }
    spill5184_8 = ((java.util.Random)(((net.minecraft.world.chunk.Chunk)(life5_21)).a(((long)(net.minecraft.entity.monster.EntitySlime.vb))))).nextInt(((int)(__sourceIntrinsic_a97bfb6c3ddd_invokedynamic5184_44(15223, (8091677609930102070L ^ life1_3)))));
    if (!((life3_16 == null))) {
        forwardValue5184_142_0 = spill5184_8;
        break forward_join_142;
    }
    if (!((spill5184_8 == 0))) {
        break forward_join_141;
    }
    spill5184_9 = recovery.source.CarrierOps.dcmpg(((double)(this.o)), ((double)(0x1.4p5d)));
    if (!((life3_16 == null))) {
        forwardValue5184_142_0 = spill5184_9;
        break forward_join_142;
    }
    if (!((spill5184_9 < 0))) {
        break forward_join_141;
    }
    return super.N__Boolean();
    }
    forwardValue5184_142_0 = 0;
    }
    return ((forwardValue5184_142_0) != 0);
}


protected boolean Y() {
int forwardValue5185_13_0;
    int forwardValue5185_15_0;
    int spill5185_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 113432724487096L);
    life3_5 = moom.vN.b();
    spill5185_0 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    if (!((life3_5 == null))) {
        forwardValue5185_13_0 = spill5185_0;
        break forward_join_13;
    }
    if (!((spill5185_0 > 1))) {
        break forward_join_14;
    }
    forwardValue5185_13_0 = 1;
    }
    forwardValue5185_15_0 = forwardValue5185_13_0;
    break forward_join_15;
    }
    forwardValue5185_15_0 = 0;
    }
    return ((forwardValue5185_15_0) != 0);
}


protected void W__sourceReturn_da8c82d5d4() {
this.bX *= 0x1.333334p-1f;
    return;
}


protected boolean aa() {
int forwardValue5189_13_0;
    int forwardValue5189_15_0;
    int spill5189_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntitySlime.db ^ 87995155525328L);
    life3_5 = moom.vN.b();
    spill5189_0 = ((net.minecraft.entity.monster.EntitySlime)(this)).o__sourceReturn_8abf5c6871();
    if (!((life3_5 == null))) {
        forwardValue5189_13_0 = spill5189_0;
        break forward_join_13;
    }
    if (!((spill5189_0 > 2))) {
        break forward_join_14;
    }
    forwardValue5189_13_0 = 1;
    }
    forwardValue5189_15_0 = forwardValue5189_13_0;
    break forward_join_15;
    }
    forwardValue5189_15_0 = 0;
    }
    return ((forwardValue5189_15_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d5893d8e80ad_invokedynamic11501_2(java.lang.Object a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b9166c333f3_invokedynamic11503_2(java.lang.Object a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_177375e0f408_invokedynamic11504_2(java.lang.Object a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aefe61b07874_invokedynamic5192_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aefe61b07874_invokedynamic5192_11(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_aefe61b07874_call5192_14(net.minecraft.entity.monster.EntitySlime a0, int a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_93a5090229a0_call1591_28(net.minecraft.entity.monster.EntitySlime a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11507_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1951_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dfa328755c60_originalDynamicSite1952_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_27980f560860_originalDynamicSite1953_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_27980f560860_originalDynamicSite1953_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1592_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_29d5bbbacb40_originalDynamicSite1954_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5184_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5184_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5184_44(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
