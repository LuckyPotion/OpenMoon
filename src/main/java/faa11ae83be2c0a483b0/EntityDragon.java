package net.minecraft.entity.boss;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityDragon extends net.minecraft.entity.EntityLiving implements net.minecraft.entity.boss.IBossDisplayData, moom.t5, moom.vP {

public double bX;

public double bY;

public double bZ;

public double[][] b0;

public int b1;

public moom.ts[] b2;

public moom.ts b3;

public moom.ts b4;

public moom.ts b5;

public moom.ts b6;

public moom.ts b7;

public moom.ts b8;

public moom.ts b9;

public float b_;

public float ca;

public boolean cb;

public boolean cc;

private net.minecraft.entity.Entity cd;

public int ce;

public moom.tw cf;

private static long db;

private static long[] eb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

public EntityDragon(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); __sourceHandlerCall_362b4cde120c42f865c1(this, p0); }


static {
db = ((long)(((moom._a)(moom._c.a(((long)(7537309062674241480L)), ((long)(-736782239974311647L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116499567047934L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.boss.EntityDragon.db ^ 34619744838155L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1856_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1856_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1856_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1856_14 = new byte[8];
    (__sourceSpill1856_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1856_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1856_16 = __sourceSpill1856_14;
    ((javax.crypto.Cipher)(__sourceSpill1856_11)).init(((int)(__sourceSpill1856_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1856_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1856_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "±¸r\004çZ\017\026Æ«üËV×\\¥!ÁËõ|;|@\003\003|¹i\032\0343(PJA±ÇSl~\002ôöR\177©Èb©ë*G=ÒÉ \004\017«Ñ\017\024<¶Ñ-iáÌéªDmÕ-[WÜk¢\005í\017\n\003¾Á­©¾\\Í\016ù\017Qs§°!õ§ ×E\036\006<½q<ì~#"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1856_25 = local6_life21;
        int __sourceSpill1856_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1856_25)).substring(((int)(__sourceSpill1856_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1856_30 = local8_life19;
        int __sourceSpill1856_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1856_33 = new byte[8];
        (__sourceSpill1856_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1856_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1856_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1856_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1856_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1856_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1856_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1856_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1856_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1856_34)).doFinal(((byte[])(__sourceSpill1856_33)));
        (__sourceSpill1856_30)[__sourceSpill1856_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÛRÀ¥1ñXÐ¯ø#1 Ì"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1856_38 = local6_life21;
        int __sourceSpill1856_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1856_38)).substring(((int)(__sourceSpill1856_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1856_43 = local8_life19;
        int __sourceSpill1856_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1856_46 = new byte[8];
        (__sourceSpill1856_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1856_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1856_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1856_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1856_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1856_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1856_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1856_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1856_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1856_47)).doFinal(((byte[])(__sourceSpill1856_46)));
        (__sourceSpill1856_43)[__sourceSpill1856_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    eb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[18]));
}

private static native <E extends Throwable> void __sourceHandlerCall_362b4cde120c42f865c1(net.minecraft.entity.boss.EntityDragon a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_362b4cde120c42f865c1 {

public static void f480(net.minecraft.entity.boss.EntityDragon receiver, net.minecraft.world.World p0) throws Throwable {
    long local2_life2 = (__fieldRead480_0() ^ __originalNumericLdc480_1());
    __directSuperInit480_3(receiver, p0);
    __fieldWrite480_7(receiver, __multiArray480_6(__originalDynamicSite480_5(27661, (__originalNumericLdc480_4() ^ local2_life2)), 3));
    __fieldWrite480_8(receiver, -1);
    net.minecraft.entity.Entity[] __sourceSpill480_12 = __call480_9();
    net.minecraft.entity.boss.EntityDragon __sourceSpill480_13 = receiver;
    moom.ts[] __stackOp480_14_0 = new moom.ts[__originalDynamicSite480_11(9837, (__originalNumericLdc480_10() ^ local2_life2))];
    moom.ts[] __sourceSpill480_17 = __stackOp480_14_0;
    moom.ts[] __sourceSpill480_18 = __stackOp480_14_0;
    int __sourceSpill480_19 = 0;
    net.minecraft.entity.boss.EntityDragon __stackOp480_20_0 = receiver;
    moom.ts __stackOp480_20_1 = new moom.ts(((moom.t5) receiver), "head", __originalNumericLdc480_15(), __originalNumericLdc480_16());
    moom.ts __sourceSpill480_22 = __stackOp480_20_1;
    __fieldWrite480_21(__stackOp480_20_0, __stackOp480_20_1);
    (__sourceSpill480_18)[__sourceSpill480_19] = __sourceSpill480_22;
    moom.ts[] __stackOp480_23_0 = __sourceSpill480_17;
    moom.ts[] __sourceSpill480_26 = __stackOp480_23_0;
    moom.ts[] __sourceSpill480_27 = __stackOp480_23_0;
    int __sourceSpill480_28 = 1;
    net.minecraft.entity.boss.EntityDragon __stackOp480_29_0 = receiver;
    moom.ts __stackOp480_29_1 = new moom.ts(((moom.t5) receiver), "body", __originalNumericLdc480_24(), __originalNumericLdc480_25());
    moom.ts __sourceSpill480_31 = __stackOp480_29_1;
    __fieldWrite480_30(__stackOp480_29_0, __stackOp480_29_1);
    (__sourceSpill480_27)[__sourceSpill480_28] = __sourceSpill480_31;
    moom.ts[] __stackOp480_32_0 = __sourceSpill480_26;
    moom.ts[] __sourceSpill480_35 = __stackOp480_32_0;
    moom.ts[] __sourceSpill480_36 = __stackOp480_32_0;
    int __sourceSpill480_37 = 2;
    net.minecraft.entity.boss.EntityDragon __stackOp480_38_0 = receiver;
    moom.ts __stackOp480_38_1 = new moom.ts(((moom.t5) receiver), "tail", __originalNumericLdc480_33(), __originalNumericLdc480_34());
    moom.ts __sourceSpill480_40 = __stackOp480_38_1;
    __fieldWrite480_39(__stackOp480_38_0, __stackOp480_38_1);
    (__sourceSpill480_36)[__sourceSpill480_37] = __sourceSpill480_40;
    moom.ts[] __stackOp480_41_0 = __sourceSpill480_35;
    moom.ts[] __sourceSpill480_44 = __stackOp480_41_0;
    moom.ts[] __sourceSpill480_45 = __stackOp480_41_0;
    int __sourceSpill480_46 = 3;
    net.minecraft.entity.boss.EntityDragon __stackOp480_47_0 = receiver;
    moom.ts __stackOp480_47_1 = new moom.ts(((moom.t5) receiver), "tail", __originalNumericLdc480_42(), __originalNumericLdc480_43());
    moom.ts __sourceSpill480_49 = __stackOp480_47_1;
    __fieldWrite480_48(__stackOp480_47_0, __stackOp480_47_1);
    (__sourceSpill480_45)[__sourceSpill480_46] = __sourceSpill480_49;
    moom.ts[] __stackOp480_50_0 = __sourceSpill480_44;
    moom.ts[] __sourceSpill480_53 = __stackOp480_50_0;
    moom.ts[] __sourceSpill480_54 = __stackOp480_50_0;
    int __sourceSpill480_55 = 4;
    net.minecraft.entity.boss.EntityDragon __stackOp480_56_0 = receiver;
    moom.ts __stackOp480_56_1 = new moom.ts(((moom.t5) receiver), "tail", __originalNumericLdc480_51(), __originalNumericLdc480_52());
    moom.ts __sourceSpill480_58 = __stackOp480_56_1;
    __fieldWrite480_57(__stackOp480_56_0, __stackOp480_56_1);
    (__sourceSpill480_54)[__sourceSpill480_55] = __sourceSpill480_58;
    moom.ts[] __stackOp480_59_0 = __sourceSpill480_53;
    moom.ts[] __sourceSpill480_62 = __stackOp480_59_0;
    moom.ts[] __sourceSpill480_63 = __stackOp480_59_0;
    int __sourceSpill480_64 = 5;
    net.minecraft.entity.boss.EntityDragon __stackOp480_65_0 = receiver;
    moom.ts __stackOp480_65_1 = new moom.ts(((moom.t5) receiver), "wing", __originalNumericLdc480_60(), __originalNumericLdc480_61());
    moom.ts __sourceSpill480_67 = __stackOp480_65_1;
    __fieldWrite480_66(__stackOp480_65_0, __stackOp480_65_1);
    (__sourceSpill480_63)[__sourceSpill480_64] = __sourceSpill480_67;
    moom.ts[] __stackOp480_68_0 = __sourceSpill480_62;
    moom.ts[] __sourceSpill480_73 = __stackOp480_68_0;
    moom.ts[] __sourceSpill480_74 = __stackOp480_68_0;
    int __sourceSpill480_75 = __originalDynamicSite480_70(7059, (__originalNumericLdc480_69() ^ local2_life2));
    net.minecraft.entity.boss.EntityDragon __stackOp480_76_0 = receiver;
    moom.ts __stackOp480_76_1 = new moom.ts(((moom.t5) receiver), "wing", __originalNumericLdc480_71(), __originalNumericLdc480_72());
    moom.ts __sourceSpill480_78 = __stackOp480_76_1;
    __fieldWrite480_77(__stackOp480_76_0, __stackOp480_76_1);
    (__sourceSpill480_74)[__sourceSpill480_75] = __sourceSpill480_78;
    __fieldWrite480_79(__sourceSpill480_13, __sourceSpill480_73);
    __call480_81(receiver, __call480_80(receiver));
    __call480_84(receiver, __originalNumericLdc480_82(), __originalNumericLdc480_83());
    __fieldWrite480_85(receiver, 1);
    net.minecraft.entity.Entity[] local4_life86 = __sourceSpill480_12;
    __fieldWrite480_87(receiver, 1);
    __fieldWrite480_89(receiver, __originalNumericLdc480_88());
    __fieldWrite480_90(receiver, 1);
    if ((local4_life86 != null)) {
        __call480_91(new java.lang.String[2]);
    }
    return;
}
private static native long __fieldRead480_0() throws Throwable;
private static native long __originalNumericLdc480_1() throws Throwable;
private static native void __directSuperInit480_3(net.minecraft.entity.boss.EntityDragon a0, net.minecraft.world.World a1) throws Throwable;
private static native long __originalNumericLdc480_4() throws Throwable;
private static native int __originalDynamicSite480_5(int a0, long a1) throws Throwable;
private static native double[][] __multiArray480_6(int a0, int a1) throws Throwable;
private static native void __fieldWrite480_7(net.minecraft.entity.boss.EntityDragon a0, double[][] a1) throws Throwable;
private static native void __fieldWrite480_8(net.minecraft.entity.boss.EntityDragon a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call480_9() throws Throwable;
private static native long __originalNumericLdc480_10() throws Throwable;
private static native int __originalDynamicSite480_11(int a0, long a1) throws Throwable;
private static native float __originalNumericLdc480_15() throws Throwable;
private static native float __originalNumericLdc480_16() throws Throwable;
private static native void __fieldWrite480_21(net.minecraft.entity.boss.EntityDragon a0, moom.ts a1) throws Throwable;
private static native float __originalNumericLdc480_24() throws Throwable;
private static native float __originalNumericLdc480_25() throws Throwable;
private static native void __fieldWrite480_30(net.minecraft.entity.boss.EntityDragon a0, moom.ts a1) throws Throwable;
private static native float __originalNumericLdc480_33() throws Throwable;
private static native float __originalNumericLdc480_34() throws Throwable;
private static native void __fieldWrite480_39(net.minecraft.entity.boss.EntityDragon a0, moom.ts a1) throws Throwable;
private static native float __originalNumericLdc480_42() throws Throwable;
private static native float __originalNumericLdc480_43() throws Throwable;
private static native void __fieldWrite480_48(net.minecraft.entity.boss.EntityDragon a0, moom.ts a1) throws Throwable;
private static native float __originalNumericLdc480_51() throws Throwable;
private static native float __originalNumericLdc480_52() throws Throwable;
private static native void __fieldWrite480_57(net.minecraft.entity.boss.EntityDragon a0, moom.ts a1) throws Throwable;
private static native float __originalNumericLdc480_60() throws Throwable;
private static native float __originalNumericLdc480_61() throws Throwable;
private static native void __fieldWrite480_66(net.minecraft.entity.boss.EntityDragon a0, moom.ts a1) throws Throwable;
private static native long __originalNumericLdc480_69() throws Throwable;
private static native int __originalDynamicSite480_70(int a0, long a1) throws Throwable;
private static native float __originalNumericLdc480_71() throws Throwable;
private static native float __originalNumericLdc480_72() throws Throwable;
private static native void __fieldWrite480_77(net.minecraft.entity.boss.EntityDragon a0, moom.ts a1) throws Throwable;
private static native void __fieldWrite480_79(net.minecraft.entity.boss.EntityDragon a0, moom.ts[] a1) throws Throwable;
private static native float __call480_80(net.minecraft.entity.boss.EntityDragon a0) throws Throwable;
private static native void __call480_81(net.minecraft.entity.boss.EntityDragon a0, float a1) throws Throwable;
private static native float __originalNumericLdc480_82() throws Throwable;
private static native float __originalNumericLdc480_83() throws Throwable;
private static native void __call480_84(net.minecraft.entity.boss.EntityDragon a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite480_85(net.minecraft.entity.boss.EntityDragon a0, int a1) throws Throwable;
private static native void __fieldWrite480_87(net.minecraft.entity.boss.EntityDragon a0, int a1) throws Throwable;
private static native double __originalNumericLdc480_88() throws Throwable;
private static native void __fieldWrite480_89(net.minecraft.entity.boss.EntityDragon a0, double a1) throws Throwable;
private static native void __fieldWrite480_90(net.minecraft.entity.boss.EntityDragon a0, int a1) throws Throwable;
private static native void __call480_91(java.lang.String[] a0) throws Throwable;

}


protected java.lang.String i__String() {
return "mob.enderdragon.growl";
}


protected void b__Void() {
int lexicalValue1564_87_0;
    int lexicalValue1564_152_0;
    int lexicalValue1564_153_0;
    int lexicalValue1564_153_1;
    int lexicalValue1564_185_0;
    int lexicalValue1564_192_0;
    int lexicalValue1564_192_1;
    int lexicalValue1564_196_0;
    int lexicalValue1564_200_0;
    int lexicalValue1564_208_0;
    net.minecraft.entity.Entity[] spill1564_0;
    int spill1564_1;
    int spill1564_2;
    boolean spill1564_3;
    int spill1564_4;
    int spill1564_5;
    int spill1564_6;
    int spill1564_7;
    net.minecraft.entity.boss.EntityDragon spill1564_8;
    float spill1564_9;
    long life1_3;
    net.minecraft.entity.Entity[] life3_11;
    float life4_48;
    float life5_56;
    float life6_64;
    int life4_96;
    int life5_150;
    int life6_155;
    int life5_259;
    int life6_264;
    lexical_join_250: {
    lexical_join_248: {
    lexical_join_238: {
    lexical_join_208: {
    lexical_join_200: {
    lexical_join_196: {
    lexical_join_192: {
    lexical_join_185: {
    lexical_join_183: {
    lexical_join_169: {
    lexical_join_153: {
    lexical_join_152: {
    lexical_join_150: {
    lexical_join_87: {
    lexical_join_82: {
    life1_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 44158273099382L);
    spill1564_0 = moom.vJ.b();
    net.minecraft.entity.boss.EntityDragon __stackOp1564_2_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1564_2_0)).ce = ((int)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1564_2_0)).ce + 1)));
    life3_11 = spill1564_0;
    spill1564_1 = this.ce;
    if (!((life3_11 == null))) {
        lexicalValue1564_87_0 = spill1564_1;
        break lexical_join_87;
    }
    if (!((spill1564_1 >= __sourceIntrinsic_9bf881b104f5_invokedynamic1564_6(21521, (3618277531063172411L ^ life1_3))))) {
        break lexical_join_82;
    }
    spill1564_2 = this.ce;
    if (!((life3_11 == null))) {
        lexicalValue1564_87_0 = spill1564_2;
        break lexical_join_87;
    }
    if (!((spill1564_2 <= __sourceIntrinsic_9bf881b104f5_invokedynamic1564_8(29072, (6922183072601479351L ^ life1_3))))) {
        break lexical_join_82;
    }
    life4_48 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p3f);
    life5_56 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p2f);
    life6_64 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p3f);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_HUGE)), ((double)((this.n + ((double) life4_48)))), ((double)(((this.o + 0x1.0p1d) + ((double) life5_56)))), ((double)((this.p + ((double) life6_64)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    lexicalValue1564_87_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("doMobLoot")))) ? 1 : 0);
    }
    life4_96 = lexicalValue1564_87_0;
    spill1564_3 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_11 == null))) {
        lexicalValue1564_185_0 = ((spill1564_3) ? 1 : 0);
        break lexical_join_185;
    }
    if (!((!spill1564_3))) {
        break lexical_join_169;
    }
    spill1564_4 = this.ce;
    spill1564_5 = __sourceIntrinsic_9bf881b104f5_invokedynamic1564_29(29556, (5858531650734037588L ^ life1_3));
    if (!((life3_11 == null))) {
        lexicalValue1564_153_0 = spill1564_4;
        lexicalValue1564_153_1 = spill1564_5;
        break lexical_join_153;
    }
    if (!((spill1564_4 > spill1564_5))) {
        break lexical_join_150;
    }
    spill1564_6 = (this.ce % 5);
    if (!((life3_11 == null))) {
        lexicalValue1564_152_0 = spill1564_6;
        break lexical_join_152;
    }
    if (!((spill1564_6 == 0))) {
        break lexical_join_150;
    }
    spill1564_7 = life4_96;
    if (!((life3_11 == null))) {
        lexicalValue1564_152_0 = spill1564_7;
        break lexical_join_152;
    }
    if (!((spill1564_7 != 0))) {
        break lexical_join_150;
    }
    life5_150 = __sourceIntrinsic_9bf881b104f5_invokedynamic1564_31(22002, (1670914041101509L ^ life1_3));
    lexical_cycle_121: while (true) {
    if (!((life5_150 > 0))) {
        break lexical_join_150;
    }
    life6_155 = __sourceExactCall_d69b06941ddd75(((int)(life5_150)));
    life5_150 = (life5_150 - life6_155);
    ((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(this.i, this.n, this.o, this.p, life6_155))));
    if (!((life3_11 == null))) {
        break lexical_join_183;
    }
    if (!((life3_11 != null))) { continue lexical_cycle_121; }
    break lexical_cycle_121;
    }
    }
    lexicalValue1564_152_0 = this.ce;
    }
    lexicalValue1564_153_0 = lexicalValue1564_152_0;
    lexicalValue1564_153_1 = 1;
    }
    if (!((life3_11 == null))) {
        lexicalValue1564_192_0 = lexicalValue1564_153_0;
        lexicalValue1564_192_1 = lexicalValue1564_153_1;
        break lexical_join_192;
    }
    if (!((lexicalValue1564_153_0 == lexicalValue1564_153_1))) {
        break lexical_join_169;
    }
    ((net.minecraft.world.World)(this.i)).a(((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic1564_41(20252, (908710983597073982L ^ life1_3)))), ((moom.DT)(new moom.DT(this))), ((int)(0)));
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).b__Void(((double)(0x0.0p0d)), ((double)(0x1.99999ap-4d)), ((double)(0x0.0p0d)));
    spill1564_8 = this;
    net.minecraft.entity.boss.EntityDragon __stackOp1564_44_0 = this;
    net.minecraft.entity.boss.EntityDragon __stackOp1564_46_0 = __stackOp1564_44_0;
    float __stackOp1564_46_1 = (((net.minecraft.entity.boss.EntityDragon)(__stackOp1564_44_0)).w + 0x1.4p4f);
    spill1564_9 = __stackOp1564_46_1;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1564_46_0)).w = ((float)(__stackOp1564_46_1));
    ((net.minecraft.entity.boss.EntityDragon)(spill1564_8)).a2 = ((float)(spill1564_9));
    }
    lexicalValue1564_185_0 = this.ce;
    }
    if (!((life3_11 == null))) {
        lexicalValue1564_196_0 = lexicalValue1564_185_0;
        break lexical_join_196;
    }
    lexicalValue1564_192_0 = lexicalValue1564_185_0;
    lexicalValue1564_192_1 = __sourceIntrinsic_9bf881b104f5_invokedynamic1564_50(538, (3879084661318314806L ^ life1_3));
    }
    if (!((lexicalValue1564_192_0 == lexicalValue1564_192_1))) {
        break lexical_join_250;
    }
    lexicalValue1564_196_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_11 == null))) {
        lexicalValue1564_200_0 = lexicalValue1564_196_0;
        break lexical_join_200;
    }
    if (!((lexicalValue1564_196_0 == 0))) {
        break lexical_join_250;
    }
    lexicalValue1564_200_0 = life4_96;
    }
    if (!((life3_11 == null))) {
        lexicalValue1564_208_0 = lexicalValue1564_200_0;
        break lexical_join_208;
    }
    if (!((lexicalValue1564_200_0 != 0))) {
        break lexical_join_238;
    }
    lexicalValue1564_208_0 = __sourceIntrinsic_9bf881b104f5_invokedynamic1564_54(22423, (202212811962891953L ^ life1_3));
    }
    life5_259 = lexicalValue1564_208_0;
    lexical_cycle_209: while (true) {
    if (!((life5_259 > 0))) {
        break lexical_join_238;
    }
    life6_264 = __sourceExactCall_d69b06941ddd75(((int)(life5_259)));
    life5_259 = (life5_259 - life6_264);
    ((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(this.i, this.n, this.o, this.p, life6_264))));
    if (!((life3_11 == null))) {
        break lexical_join_248;
    }
    if (!((life3_11 != null))) { continue lexical_cycle_209; }
    break lexical_cycle_209;
    }
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).b__sourceReturn_8356fc462d(((moom.DT)(new moom.DT(this.n, 0x1.0p6d, this.p))));
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).f__Void();
    }
    return;
}


private void b(java.util.List<net.minecraft.entity.Entity> p0) {
int lexicalValue1561_26_0;
    net.minecraft.entity.Entity[] spill1561_0;
    int spill1561_1;
    long life2_3;
    java.util.Iterator life5_7;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.entity.Entity life6_15;
    lexical_join_33: {
    life2_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 137996758261069L);
    spill1561_0 = moom.vJ.b();
    life5_7 = ((java.util.List)(p0)).iterator();
    life4_8 = spill1561_0;
    lexical_cycle_9: while (true) {
    lexical_join_31: {
    lexical_join_26: {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_33;
    }
    life6_15 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life5_7)).next()));
    spill1561_1 = ((life6_15 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_8 == null))) {
        lexicalValue1561_26_0 = spill1561_1;
        break lexical_join_26;
    }
    if (!((spill1561_1 != 0))) {
        break lexical_join_31;
    }
    lexicalValue1561_26_0 = ((((net.minecraft.entity.Entity)(life6_15)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(0x1.4p3f)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1561_26_0);
    ((net.minecraft.entity.boss.EntityDragon)(this)).a(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.Entity)(life6_15)));
    }
    if (!((life4_8 != null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


private boolean b(moom.CA p0) {
int forestValue1108_37_0;
    net.minecraft.block.Block forestValue1108_81_0;
    net.minecraft.block.Block forestValue1108_81_1;
    net.minecraft.block.Block forestValue1108_86_0;
    net.minecraft.block.Block forestValue1108_86_1;
    net.minecraft.block.Block forestValue1108_91_0;
    net.minecraft.block.Block forestValue1108_91_1;
    net.minecraft.block.Block forestValue1108_96_0;
    net.minecraft.block.Block forestValue1108_96_1;
    int forestValue1108_117_0;
    int forestValue1108_119_0;
    int forestValue1108_123_0;
    int forestValue1108_134_0;
    int forestValue1108_192_0;
    net.minecraft.entity.Entity[] spill1108_0;
    int spill1108_1;
    int spill1108_2;
    net.minecraft.block.Block spill1108_3;
    net.minecraft.block.Block spill1108_4;
    boolean spill1108_5;
    boolean spill1108_6;
    int spill1108_7;
    long life2_3;
    int life5_8;
    int life6_12;
    int life7_16;
    int life8_20;
    int life9_24;
    int life10_28;
    net.minecraft.entity.Entity[] life4_29;
    int life11_31;
    int life12_33;
    int life13_35;
    int life14_42;
    int life15_49;
    moom.DT life16_59;
    net.minecraft.block.Block life17_65;
    double life13_169;
    double life15_183;
    double life17_197;
    forest_join_192: {
    forest_join_191: {
    forest_join_134: {
    forest_join_133: {
    life2_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 35374248308790L);
    spill1108_0 = moom.vJ.b();
    life5_8 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).b)));
    life6_12 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).c)));
    life7_16 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).d)));
    life8_20 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).e)));
    life9_24 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).f)));
    life10_28 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).g)));
    life4_29 = spill1108_0;
    life11_31 = 0;
    life12_33 = 0;
    life13_35 = life5_8;
    forest_cycle_36: while (true) {
    forest_join_130: {
    forestValue1108_37_0 = life13_35;
    forest_cycle_37: while (true) {
    if (!((forestValue1108_37_0 <= life8_20))) {
        break forest_join_133;
    }
    spill1108_1 = life6_12;
    if (!((life4_29 == null))) {
        forestValue1108_134_0 = spill1108_1;
        break forest_join_134;
    }
    life14_42 = spill1108_1;
    forest_cycle_43: while (true) {
    forest_join_128: {
    forest_join_127: {
    if (!((life14_42 <= life9_24))) {
        break forest_join_130;
    }
    spill1108_2 = life7_16;
    if (!((life4_29 == null))) {
        forestValue1108_37_0 = spill1108_2;
        continue forest_cycle_37;
    }
    life15_49 = spill1108_2;
    forest_cycle_50: while (true) {
    forest_join_125: {
    forest_join_124: {
    forest_join_123: {
    forest_join_122: {
    forest_join_119: {
    forest_join_118: {
    forest_join_117: {
    forest_join_116: {
    forest_join_96: {
    forest_join_91: {
    forest_join_86: {
    forest_join_81: {
    if (!((life15_49 <= life10_28))) {
        break forest_join_127;
    }
    life16_59 = new moom.DT(life13_35, life14_42, life15_49);
    life17_65 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life16_59))))).a__ch();
    if (!((life4_29 == null))) {
        break forest_join_128;
    }
    if (!((life4_29 == null))) {
        break forest_join_125;
    }
    if (!((((net.minecraft.block.Block)(life17_65)).a__fn() != moom.fn.a))) {
        break forest_join_124;
    }
    spill1108_3 = life17_65;
    spill1108_4 = net.minecraft.init.Blocks.b_;
    if (!((life4_29 == null))) {
        forestValue1108_81_0 = spill1108_3;
        forestValue1108_81_1 = spill1108_4;
        break forest_join_81;
    }
    if (!((spill1108_3 != spill1108_4))) {
        break forest_join_122;
    }
    forestValue1108_81_0 = life17_65;
    forestValue1108_81_1 = net.minecraft.init.Blocks.Z;
    }
    if (!((life4_29 == null))) {
        forestValue1108_86_0 = forestValue1108_81_0;
        forestValue1108_86_1 = forestValue1108_81_1;
        break forest_join_86;
    }
    if (!((forestValue1108_81_0 != forestValue1108_81_1))) {
        break forest_join_122;
    }
    forestValue1108_86_0 = life17_65;
    forestValue1108_86_1 = net.minecraft.init.Blocks.bw;
    }
    if (!((life4_29 == null))) {
        forestValue1108_91_0 = forestValue1108_86_0;
        forestValue1108_91_1 = forestValue1108_86_1;
        break forest_join_91;
    }
    if (!((forestValue1108_86_0 != forestValue1108_86_1))) {
        break forest_join_122;
    }
    forestValue1108_91_0 = life17_65;
    forestValue1108_91_1 = net.minecraft.init.Blocks.h;
    }
    if (!((life4_29 == null))) {
        forestValue1108_96_0 = forestValue1108_91_0;
        forestValue1108_96_1 = forestValue1108_91_1;
        break forest_join_96;
    }
    if (!((forestValue1108_91_0 != forestValue1108_91_1))) {
        break forest_join_122;
    }
    forestValue1108_96_0 = life17_65;
    forestValue1108_96_1 = net.minecraft.init.Blocks.bM;
    }
    if (!((forestValue1108_96_0 != forestValue1108_96_1))) {
        break forest_join_122;
    }
    spill1108_5 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")));
    if (!((life4_29 == null))) {
        forestValue1108_123_0 = ((spill1108_5) ? 1 : 0);
        break forest_join_123;
    }
    if (!(spill1108_5)) {
        break forest_join_122;
    }
    spill1108_6 = ((net.minecraft.world.World)(this.i)).d__Boolean(((moom.DT)(life16_59)));
    if (!((life4_29 == null))) {
        forestValue1108_117_0 = ((spill1108_6) ? 1 : 0);
        break forest_join_117;
    }
    if (!((!spill1108_6))) {
        break forest_join_116;
    }
    spill1108_7 = life12_33;
    if (!((life4_29 == null))) {
        forestValue1108_117_0 = spill1108_7;
        break forest_join_117;
    }
    if (!((spill1108_7 != 0))) {
        break forest_join_118;
    }
    }
    forestValue1108_117_0 = 1;
    }
    forestValue1108_119_0 = forestValue1108_117_0;
    break forest_join_119;
    }
    forestValue1108_119_0 = 0;
    }
    life12_33 = forestValue1108_119_0;
    if (!((life4_29 != null))) {
        break forest_join_124;
    }
    }
    forestValue1108_123_0 = 1;
    }
    life11_31 = forestValue1108_123_0;
    }
    life15_49 += 1;
    }
    if (!((life4_29 != null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    life14_42 += 1;
    }
    if (!((life4_29 != null))) {
        continue forest_cycle_43;
    }
    break forest_cycle_43;
    }
    break forest_cycle_37;
    }
    }
    life13_35 += 1;
    if (!((life4_29 != null))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    }
    forestValue1108_134_0 = life12_33;
    }
    if (!((life4_29 == null))) {
        forestValue1108_192_0 = forestValue1108_134_0;
        break forest_join_192;
    }
    if (!((forestValue1108_134_0 != 0))) {
        break forest_join_191;
    }
    life13_169 = (((moom.CA)(p0)).b + ((((moom.CA)(p0)).e - ((moom.CA)(p0)).b) * ((double) ((java.util.Random)(this.ah)).nextFloat())));
    life15_183 = (((moom.CA)(p0)).c + ((((moom.CA)(p0)).f - ((moom.CA)(p0)).c) * ((double) ((java.util.Random)(this.ah)).nextFloat())));
    life17_197 = (((moom.CA)(p0)).d + ((((moom.CA)(p0)).g - ((moom.CA)(p0)).d) * ((double) ((java.util.Random)(this.ah)).nextFloat())));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_LARGE)), ((double)(life13_169)), ((double)(life15_183)), ((double)(life17_197)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    forestValue1108_192_0 = life11_31;
    }
    return ((forestValue1108_192_0) != 0);
}


protected boolean b__sourceReturn_26a3987c76(net.minecraft.util.DamageSource p0, float p1) {
return (__sourceIntrinsic_booleanComparison((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1))))) != 0);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.world.World b__sourceReturn_818f27b2a7() {
return this.i;
}


private void b__sourceReturn_8356fc462d(moom.DT p0) {
int forestValue1109_15_0;
    int forestValue1109_30_0;
    int forestValue1109_82_0;
    int forestValue1109_86_0;
    int forestValue1109_101_0;
    int forestValue1109_119_0;
    int forestValue1109_143_0;
    net.minecraft.entity.Entity[] spill1109_0;
    int spill1109_1;
    int spill1109_2;
    int spill1109_3;
    int spill1109_4;
    int spill1109_5;
    long life2_3;
    int life5_5;
    double life6_7;
    double life8_9;
    int life10_12;
    net.minecraft.entity.Entity[] life4_13;
    int life11_28;
    int life12_39;
    double life13_51;
    moom.DT life15_66;
    moom.DT life10_159;
    forest_join_143: {
    forest_join_129: {
    life2_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 95057302950987L);
    life5_5 = 4;
    life6_7 = 0x1.88p3d;
    life8_9 = 0x1.9p2d;
    spill1109_0 = moom.vJ.b();
    life10_12 = -1;
    life4_13 = spill1109_0;
    forest_cycle_14: while (true) {
    forest_join_126: {
    forestValue1109_15_0 = life10_12;
    forest_cycle_15: while (true) {
    if (!((forestValue1109_15_0 <= __sourceIntrinsic_0dd38c3318e1_invokedynamic1109_2(16252, (1595639242376991849L ^ life2_3))))) {
        break forest_join_129;
    }
    spill1109_1 = __sourceIntrinsic_0dd38c3318e1_invokedynamic1109_3(26272, (2171604816849374648L ^ life2_3));
    if (!((life4_13 == null))) {
        forestValue1109_143_0 = spill1109_1;
        break forest_join_143;
    }
    life11_28 = spill1109_1;
    forest_cycle_29: while (true) {
    forest_join_123: {
    forestValue1109_30_0 = life11_28;
    forest_cycle_30: while (true) {
    if (!((forestValue1109_30_0 <= 4))) {
        break forest_join_126;
    }
    spill1109_2 = __sourceIntrinsic_0dd38c3318e1_invokedynamic1109_4(24359, (3619370188206388279L ^ life2_3));
    if (!((life4_13 == null))) {
        forestValue1109_15_0 = spill1109_2;
        continue forest_cycle_15;
    }
    life12_39 = spill1109_2;
    forest_cycle_40: while (true) {
    forest_join_121: {
    forest_join_120: {
    forest_join_119: {
    forest_join_113: {
    forest_join_101: {
    forest_join_98: {
    forest_join_86: {
    forest_join_85: {
    forest_join_82: {
    if (!((life12_39 <= 4))) {
        break forest_join_123;
    }
    life13_51 = ((double) ((life11_28 * life11_28) + (life12_39 * life12_39)));
    if (!((life4_13 == null))) {
        break forest_join_121;
    }
    spill1109_3 = recovery.source.CarrierOps.dcmpg(((double)(life13_51)), ((double)(0x1.88p3d)));
    if (!((life4_13 == null))) {
        forestValue1109_30_0 = spill1109_3;
        continue forest_cycle_30;
    }
    if (!((spill1109_3 <= 0))) {
        break forest_join_120;
    }
    life15_66 = ((moom.DT)(p0)).a(((int)(life11_28)), ((int)(life10_12)), ((int)(life12_39)));
    spill1109_4 = life10_12;
    if (!((life4_13 == null))) {
        forestValue1109_86_0 = spill1109_4;
        break forest_join_86;
    }
    if (!((spill1109_4 < 0))) {
        break forest_join_85;
    }
    spill1109_5 = recovery.source.CarrierOps.dcmpg(((double)(life13_51)), ((double)(0x1.9p2d)));
    if (!((life4_13 == null))) {
        forestValue1109_82_0 = spill1109_5;
        break forest_join_82;
    }
    if (!((spill1109_5 <= 0))) {
        break forest_join_120;
    }
    forestValue1109_82_0 = ((((net.minecraft.world.World)(this.i)).a(((moom.DT)(life15_66)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue1109_82_0);
    if (!((life4_13 != null))) {
        break forest_join_120;
    }
    }
    forestValue1109_86_0 = life10_12;
    }
    if (!((life4_13 == null))) {
        forestValue1109_101_0 = forestValue1109_86_0;
        break forest_join_101;
    }
    if (!((forestValue1109_86_0 > 0))) {
        break forest_join_98;
    }
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(life15_66)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())));
    if (!((life4_13 != null))) {
        break forest_join_120;
    }
    }
    forestValue1109_101_0 = recovery.source.CarrierOps.dcmpl(((double)(life13_51)), ((double)(0x1.9p2d)));
    }
    if (!((life4_13 == null))) {
        forestValue1109_119_0 = forestValue1109_101_0;
        break forest_join_119;
    }
    if (!((forestValue1109_101_0 > 0))) {
        break forest_join_113;
    }
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(life15_66)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())));
    if (!((life4_13 != null))) {
        break forest_join_120;
    }
    }
    forestValue1109_119_0 = ((((net.minecraft.world.World)(this.i)).a(((moom.DT)(life15_66)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bu)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue1109_119_0);
    }
    life12_39 += 1;
    }
    if (!((life4_13 != null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    break forest_cycle_30;
    }
    }
    life11_28 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    break forest_cycle_15;
    }
    }
    life10_12 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_14;
    }
    break forest_cycle_14;
    }
    }
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())));
    forestValue1109_143_0 = ((((net.minecraft.world.World)(this.i)).a(((moom.DT)(((moom.DT)(p0)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue1109_143_0);
    life10_159 = ((moom.DT)(p0)).a(((int)(2)));
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(life10_159)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())));
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(((moom.DT)(life10_159)).e())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.EAST))))));
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(((moom.DT)(life10_159)).f())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.WEST))))));
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(((moom.DT)(life10_159)).c__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.SOUTH))))));
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(((moom.DT)(life10_159)).d__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.NORTH))))));
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(((moom.DT)(p0)).a(((int)(3))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())));
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(((moom.DT)(p0)).a(((int)(4))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bx)).a__fE())));
    return;
}


protected java.lang.String c__String() {
return "mob.enderdragon.hit";
}


public void c__Void() {
((net.minecraft.entity.boss.EntityDragon)(this)).f__Void();
    return;
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.4p2f;
}


protected void d__Void() {
super.d__Void();
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5565;
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
            throw new RuntimeException("moom/tf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11286_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_e4228a48c13c7a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public double[] a__sourceReturn_59e90b7c78(int p0, float p1) {
int forwardValue5003_29_0;
    int spill5003_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_32;
    int life7_45;
    double[] life8_48;
    double life9_55;
    double life11_65;
    double life9_81;
    double life11_90;
    forward_join_29: {
    forward_join_15: {
    life3_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 91647521710217L);
    life5_5 = moom.vJ.b();
    spill5003_0 = recovery.source.CarrierOps.fcmpg(((float)(__sourceExactCall_9750978342591c(((net.minecraft.entity.boss.EntityDragon)(this))))), ((float)(0x0.0p0f)));
    if (!((life5_5 == null))) {
        forwardValue5003_29_0 = spill5003_0;
        break forward_join_29;
    }
    if (!((spill5003_0 <= 0))) {
        break forward_join_15;
    }
    p1 = 0x0.0p0f;
    }
    p1 = (0x1.0p0f - p1);
    forwardValue5003_29_0 = ((this.b1 - p0) & __sourceIntrinsic_f8707f95b411_invokedynamic5003_5(5798, (5682912875774118269L ^ life3_3)));
    }
    life6_32 = forwardValue5003_29_0;
    life7_45 = (((this.b1 - p0) - 1) & __sourceIntrinsic_f8707f95b411_invokedynamic5003_7(29411, (5554797478782070071L ^ life3_3)));
    life8_48 = new double[3];
    life9_55 = ((this.b0)[life6_32])[0];
    life11_65 = moom.Dr.a(((double)((((this.b0)[life7_45])[0] - life9_55))));
    (life8_48)[0] = (life9_55 + (life11_65 * ((double) p1)));
    life9_81 = ((this.b0)[life6_32])[1];
    life11_90 = (((this.b0)[life7_45])[1] - life9_81);
    (life8_48)[1] = (life9_81 + (life11_90 * ((double) p1)));
    (life8_48)[2] = (((this.b0)[life6_32])[2] + ((((this.b0)[life7_45])[2] - ((this.b0)[life6_32])[2]) * ((double) p1)));
    return life8_48;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5006_23_0;
    int spill5006_0;
    boolean spill5006_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_23: {
    forward_join_22: {
    life3_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 67268237563123L);
    life5_5 = moom.vJ.b();
    spill5006_0 = ((p0 instanceof moom.CV) ? 1 : 0);
    if (!((life5_5 == null))) {
        forwardValue5006_23_0 = spill5006_0;
        break forward_join_23;
    }
    if (!((spill5006_0 != 0))) {
        break forward_join_22;
    }
    spill5006_1 = ((moom.CV)(((moom.CV)(p0)))).j();
    if (!((life5_5 == null))) {
        forwardValue5006_23_0 = ((spill5006_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill5006_1)) {
        break forward_join_22;
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).b__sourceReturn_26a3987c76(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
    }
    forwardValue5006_23_0 = 0;
    }
    return ((forwardValue5006_23_0) != 0);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.boss.EntityDragon)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.9p7d)));
    return;
}


private float a__sourceReturn_44b37c2d95(double p0) {
return ((float) moom.Dr.a(((double)(p0))));
}


public net.minecraft.entity.Entity[] a__Arrayr3() {
return this.b2;
}


public boolean a(moom.ts p0, net.minecraft.util.DamageSource p1, float p2) {
int forwardValue5005_96_0;
    int forwardValue5005_98_0;
    int spill5005_0;
    boolean spill5005_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    float life7_22;
    float life8_25;
    float life9_28;
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_92: {
    forward_join_16: {
    life4_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 92119299585737L);
    life6_5 = moom.vJ.b();
    if (!((p0 != this.b3))) {
        break forward_join_16;
    }
    p2 = ((p2 / 0x1.0p2f) + 0x1.0p0f);
    }
    life7_22 = ((this.w * 0x1.921fb6p1f) / 0x1.68p7f);
    life8_25 = moom.Dr.a(((float)(life7_22)));
    life9_28 = moom.Dr.b(((float)(life7_22)));
    this.bX = ((double)(((this.n + ((double) (life8_25 * 0x1.4p2f))) + ((double) ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p1f)))));
    this.bY = ((double)(((this.o + ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.8p1f))) + 0x1.0p0d)));
    this.bZ = ((double)(((this.p - ((double) (life9_28 * 0x1.4p2f))) + ((double) ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p1f)))));
    this.cd = ((net.minecraft.entity.Entity)(null));
    spill5005_0 = ((((net.minecraft.util.DamageSource)(p1)).b__r3() instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life6_5 == null))) {
        forwardValue5005_96_0 = spill5005_0;
        break forward_join_96;
    }
    if (!((spill5005_0 == 0))) {
        break forward_join_92;
    }
    spill5005_1 = ((net.minecraft.util.DamageSource)(p1)).b__Boolean();
    if (!((life6_5 == null))) {
        forwardValue5005_98_0 = ((spill5005_1) ? 1 : 0);
        break forward_join_98;
    }
    if (!(spill5005_1)) {
        break forward_join_97;
    }
    }
    forwardValue5005_96_0 = ((((net.minecraft.entity.boss.EntityDragon)(this)).b__sourceReturn_26a3987c76(((net.minecraft.util.DamageSource)(p1)), ((float)(p2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5005_96_0);
    }
    forwardValue5005_98_0 = 1;
    }
    return ((forwardValue5005_98_0) != 0);
}


private void a(java.util.List<net.minecraft.entity.Entity> p0) {
net.minecraft.entity.Entity lexicalValue1560_46_0;
    net.minecraft.entity.Entity[] spill1560_0;
    net.minecraft.entity.Entity spill1560_1;
    long life2_3;
    double life5_16;
    double life7_28;
    net.minecraft.entity.Entity[] life4_29;
    java.util.Iterator life9_32;
    net.minecraft.entity.Entity life10_39;
    double life11_55;
    double life13_60;
    double life15_68;
    lexical_join_78: {
    life2_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 3625652151753L);
    spill1560_0 = moom.vJ.b();
    life5_16 = ((((moom.CA)(((moom.ts)(this.b4)).b())).b + ((moom.CA)(((moom.ts)(this.b4)).b())).e) / 0x1.0p1d);
    life7_28 = ((((moom.CA)(((moom.ts)(this.b4)).b())).d + ((moom.CA)(((moom.ts)(this.b4)).b())).g) / 0x1.0p1d);
    life4_29 = spill1560_0;
    life9_32 = ((java.util.List)(p0)).iterator();
    lexical_cycle_33: while (true) {
    lexical_join_76: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life9_32)).hasNext())) {
        break lexical_join_78;
    }
    life10_39 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life9_32)).next()));
    spill1560_1 = life10_39;
    if (!((life4_29 == null))) {
        lexicalValue1560_46_0 = spill1560_1;
        break lexical_join_46;
    }
    if (!((((spill1560_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break lexical_join_76;
    }
    lexicalValue1560_46_0 = life10_39;
    }
    life11_55 = (((net.minecraft.entity.Entity)(lexicalValue1560_46_0)).n - life5_16);
    life13_60 = (((net.minecraft.entity.Entity)(life10_39)).p - life7_28);
    life15_68 = ((life11_55 * life11_55) + (life13_60 * life13_60));
    ((net.minecraft.entity.Entity)(life10_39)).c(((double)(((life11_55 / life15_68) * 0x1.0p2d))), ((double)(0x1.99999ap-3d)), ((double)(((life13_60 / life15_68) * 0x1.0p2d))));
    }
    if (!((life4_29 != null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    return;
}


public boolean m__Boolean() {
return ((0) != 0);
}


private void X__sourceReturn_da8c82d5d4() {
int forestValue660_119_0;
    net.minecraft.entity.boss.EntityDragon forestValue660_127_0;
    int forestValue660_163_0;
    net.minecraft.entity.Entity[] spill660_0;
    net.minecraft.entity.boss.EntityDragon spill660_1;
    int spill660_2;
    int spill660_3;
    net.minecraft.entity.boss.EntityDragon spill660_4;
    long life1_3;
    java.util.ArrayList life4_12;
    net.minecraft.entity.Entity[] life3_17;
    double life5_95;
    double life7_101;
    double life9_107;
    int life11_131;
    double life5_146;
    double life7_152;
    double life9_158;
    int life11_182;
    forest_join_218: {
    forest_join_215: {
    forest_join_127: {
    forest_join_40: {
    life1_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 51082846192919L);
    this.cb = ((boolean)(false));
    spill660_0 = moom.vJ.b();
    life4_12 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.world.World)(this.i)).i)));
    ((java.util.List)(life4_12)).removeIf(((java.util.function.Predicate)(__sourceIntrinsic_296ab52b3f54_invokedynamic660_6())));
    life3_17 = spill660_0;
    spill660_1 = this;
    if (!((life3_17 == null))) {
        forestValue660_127_0 = spill660_1;
        break forest_join_127;
    }
    if (!((((java.util.Random)(((net.minecraft.entity.boss.EntityDragon)(spill660_1)).ah)).nextInt(((int)(2))) == 0))) {
        break forest_join_40;
    }
    if (!((!((java.util.List)(life4_12)).isEmpty()))) {
        break forest_join_40;
    }
    this.cd = ((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(((java.util.List)(life4_12)).get(((int)(((java.util.Random)(this.ah)).nextInt(((int)(((java.util.List)(life4_12)).size()))))))))));
    if (!((life3_17 != null))) {
        break forest_join_218;
    }
    }
    forest_cycle_40: while (true) {
    forest_join_124: {
    forest_join_119: {
    forest_join_118: {
    this.bX = ((double)(0x0.0p0d));
    this.bY = ((double)(((double) (0x1.18p6f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.9p5f)))));
    this.bZ = ((double)(0x0.0p0d));
    net.minecraft.entity.boss.EntityDragon __stackOp660_22_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp660_22_0)).bX = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp660_22_0)).bX + ((double) ((((java.util.Random)(this.ah)).nextFloat() * 0x1.ep6f) - 0x1.ep5f)))));
    net.minecraft.entity.boss.EntityDragon __stackOp660_27_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp660_27_0)).bZ = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp660_27_0)).bZ + ((double) ((((java.util.Random)(this.ah)).nextFloat() * 0x1.ep6f) - 0x1.ep5f)))));
    life5_95 = (this.n - this.bX);
    life7_101 = (this.o - this.bY);
    life9_107 = (this.p - this.bZ);
    if (!((recovery.source.CarrierOps.dcmpl(((double)((((life5_95 * life5_95) + (life7_101 * life7_101)) + (life9_107 * life9_107)))), ((double)(0x1.9p6d))) > 0))) {
        break forest_join_118;
    }
    spill660_2 = 1;
    if (!((life3_17 == null))) {
        forestValue660_119_0 = spill660_2;
        break forest_join_119;
    }
    forestValue660_119_0 = spill660_2;
    break forest_join_119;
    }
    forestValue660_119_0 = 0;
    }
    life11_131 = forestValue660_119_0;
    if (!((life11_131 != 0))) {
        break forest_join_124;
    }
    if (!((life3_17 != null))) {
        break forest_join_215;
    }
    }
    if (!((life3_17 != null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    break forest_join_215;
    }
    forest_cycle_127: while (true) {
    forest_join_171: {
    forest_join_168: {
    forest_join_163: {
    forest_join_162: {
    life5_146 = (((net.minecraft.entity.boss.EntityDragon)(forestValue660_127_0)).n - this.bX);
    life7_152 = (this.o - this.bY);
    life9_158 = (this.p - this.bZ);
    if (!((recovery.source.CarrierOps.dcmpl(((double)((((life5_146 * life5_146) + (life7_152 * life7_152)) + (life9_158 * life9_158)))), ((double)(0x1.9p6d))) > 0))) {
        break forest_join_162;
    }
    spill660_3 = 1;
    if (!((life3_17 == null))) {
        forestValue660_163_0 = spill660_3;
        break forest_join_163;
    }
    forestValue660_163_0 = spill660_3;
    break forest_join_163;
    }
    forestValue660_163_0 = 0;
    }
    life11_182 = forestValue660_163_0;
    if (!((life11_182 != 0))) {
        break forest_join_168;
    }
    if (!((life3_17 != null))) {
        break forest_join_215;
    }
    }
    if (!((life3_17 != null))) {
        break forest_join_171;
    }
    break forest_join_215;
    }
    this.bX = ((double)(0x0.0p0d));
    this.bY = ((double)(((double) (0x1.18p6f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.9p5f)))));
    this.bZ = ((double)(0x0.0p0d));
    net.minecraft.entity.boss.EntityDragon __stackOp660_51_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp660_51_0)).bX = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp660_51_0)).bX + ((double) ((((java.util.Random)(this.ah)).nextFloat() * 0x1.ep6f) - 0x1.ep5f)))));
    net.minecraft.entity.boss.EntityDragon __stackOp660_56_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp660_56_0)).bZ = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp660_56_0)).bZ + ((double) ((((java.util.Random)(this.ah)).nextFloat() * 0x1.ep6f) - 0x1.ep5f)))));
    spill660_4 = this;
    forestValue660_127_0 = spill660_4;
    continue forest_cycle_127;
    }
    }
    this.cd = ((net.minecraft.entity.Entity)(null));
    }
    return;
}


private void W__sourceReturn_da8c82d5d4() {
net.minecraft.entity.boss.EntityDragon lexicalValue1558_32_0;
    int lexicalValue1558_44_0;
    net.minecraft.entity.boss.EntityDragon lexicalValue1558_62_0;
    int lexicalValue1558_69_0;
    double lexicalValue1558_113_0;
    net.minecraft.entity.boss.EntityDragon spill1558_0;
    boolean spill1558_1;
    net.minecraft.entity.boss.EntityDragon spill1558_2;
    int spill1558_3;
    double spill1558_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    float life4_104;
    java.util.List life5_118;
    moom.tw life6_120;
    double life7_122;
    java.util.Iterator life9_125;
    moom.tw life10_132;
    double life11_136;
    lexical_join_121: {
    lexical_join_118: {
    lexical_join_69: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_44: {
    lexical_join_36: {
    lexical_join_32: {
    lexical_join_31: {
    life1_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 34986760847750L);
    life3_5 = moom.vJ.b();
    spill1558_0 = this;
    if (!((life3_5 == null))) {
        lexicalValue1558_62_0 = spill1558_0;
        break lexical_join_62;
    }
    if (!((((net.minecraft.entity.boss.EntityDragon)(spill1558_0)).cf != null))) {
        break lexical_join_61;
    }
    spill1558_1 = ((moom.tw)(this.cf)).F;
    if (!((life3_5 == null))) {
        lexicalValue1558_44_0 = ((spill1558_1) ? 1 : 0);
        break lexical_join_44;
    }
    if (!(spill1558_1)) {
        break lexical_join_36;
    }
    spill1558_2 = this;
    if (!((life3_5 == null))) {
        lexicalValue1558_32_0 = spill1558_2;
        break lexical_join_32;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.boss.EntityDragon)(spill1558_2)).i)).G))) {
        break lexical_join_31;
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).a(((moom.ts)(this.b3)), ((net.minecraft.util.DamageSource)(__sourceExactCall_c4aa3d32e9e90d(((moom.Ei)(null))))), ((float)(0x1.4p3f)));
    }
    lexicalValue1558_32_0 = this;
    }
    ((net.minecraft.entity.boss.EntityDragon)(lexicalValue1558_32_0)).cf = ((moom.tw)(null));
    if (!((life3_5 != null))) {
        break lexical_join_61;
    }
    }
    lexicalValue1558_44_0 = (this.S % __sourceIntrinsic_c791a6088d77_invokedynamic1558_13(18171, (6237532642754852925L ^ life1_3)));
    }
    if (!((life3_5 == null))) {
        lexicalValue1558_69_0 = lexicalValue1558_44_0;
        break lexical_join_69;
    }
    if (!((lexicalValue1558_44_0 == 0))) {
        break lexical_join_61;
    }
    spill1558_3 = recovery.source.CarrierOps.fcmpg(((float)(__sourceExactCall_9750978342591c(((net.minecraft.entity.boss.EntityDragon)(this))))), ((float)(((net.minecraft.entity.boss.EntityDragon)(this)).a())));
    if (!((life3_5 == null))) {
        lexicalValue1558_69_0 = spill1558_3;
        break lexical_join_69;
    }
    if (!((spill1558_3 < 0))) {
        break lexical_join_61;
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).d(((float)((__sourceExactCall_9750978342591c(((net.minecraft.entity.boss.EntityDragon)(this))) + 0x1.0p0f))));
    }
    lexicalValue1558_62_0 = this;
    }
    lexicalValue1558_69_0 = ((java.util.Random)(((net.minecraft.entity.boss.EntityDragon)(lexicalValue1558_62_0)).ah)).nextInt(((int)(__sourceIntrinsic_c791a6088d77_invokedynamic1558_20(18171, (6237532642754852925L ^ life1_3)))));
    }
    if (!((lexicalValue1558_69_0 == 0))) {
        break lexical_join_121;
    }
    life4_104 = 0x1.0p5f;
    life5_118 = ((net.minecraft.world.World)(this.i)).a(((java.lang.Class)(moom.tw.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.boss.EntityDragon)(this)).b())).b(((double)(((double) life4_104))), ((double)(((double) life4_104))), ((double)(((double) life4_104)))))));
    life6_120 = null;
    life7_122 = 0x1.fffffffffffffp1023d;
    life9_125 = ((java.util.List)(life5_118)).iterator();
    lexical_cycle_93: while (true) {
    lexical_join_116: {
    lexical_join_113: {
    if (!(((java.util.Iterator)(life9_125)).hasNext())) {
        break lexical_join_118;
    }
    life10_132 = ((moom.tw)(((java.util.Iterator)(life9_125)).next()));
    life11_136 = ((moom.tw)(life10_132)).a(((net.minecraft.entity.Entity)(this)));
    if (!((life3_5 == null))) {
        break lexical_join_121;
    }
    spill1558_4 = life11_136;
    if (!((life3_5 == null))) {
        lexicalValue1558_113_0 = spill1558_4;
        break lexical_join_113;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1558_4)), ((double)(life7_122))) < 0))) {
        break lexical_join_116;
    }
    lexicalValue1558_113_0 = life11_136;
    }
    life7_122 = lexicalValue1558_113_0;
    life6_120 = life10_132;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_93; }
    break lexical_cycle_93;
    }
    }
    this.cf = ((moom.tw)(life6_120));
    }
    return;
}


protected void Q() {
return;
}


public void G() {
int lexicalValue1557_74_0;
    float lexicalValue1557_146_0;
    float lexicalValue1557_146_1;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_172_0;
    int lexicalValue1557_194_0;
    int lexicalValue1557_233_0;
    int lexicalValue1557_266_0;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_368_0;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_470_0;
    int lexicalValue1557_493_0;
    int lexicalValue1557_500_0;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_507_0;
    int lexicalValue1557_573_0;
    double lexicalValue1557_575_0;
    float lexicalValue1557_658_0;
    float lexicalValue1557_658_1;
    double lexicalValue1557_711_0;
    double lexicalValue1557_711_1;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_751_0;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_865_0;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_1044_0;
    int lexicalValue1557_1144_0;
    int lexicalValue1557_1144_1;
    int lexicalValue1557_1256_0;
    net.minecraft.entity.boss.EntityDragon lexicalValue1557_1258_0;
    boolean spill1557_0;
    int spill1557_1;
    int spill1557_2;
    boolean spill1557_3;
    float spill1557_4;
    float spill1557_5;
    net.minecraft.entity.boss.EntityDragon spill1557_6;
    boolean spill1557_7;
    int spill1557_8;
    net.minecraft.entity.boss.EntityDragon spill1557_9;
    net.minecraft.entity.boss.EntityDragon spill1557_10;
    net.minecraft.entity.boss.EntityDragon spill1557_11;
    net.minecraft.entity.boss.EntityDragon spill1557_12;
    int spill1557_13;
    net.minecraft.entity.boss.EntityDragon spill1557_14;
    net.minecraft.entity.boss.EntityDragon spill1557_15;
    int spill1557_16;
    double spill1557_17;
    float spill1557_18;
    float spill1557_19;
    double spill1557_20;
    double spill1557_21;
    net.minecraft.entity.boss.EntityDragon spill1557_22;
    moom.ts spill1557_23;
    float spill1557_24;
    moom.ts spill1557_25;
    float spill1557_26;
    moom.ts spill1557_27;
    float spill1557_28;
    moom.ts spill1557_29;
    float spill1557_30;
    net.minecraft.entity.boss.EntityDragon spill1557_31;
    net.minecraft.entity.boss.EntityDragon spill1557_32;
    int spill1557_33;
    int spill1557_34;
    int spill1557_35;
    net.minecraft.entity.boss.EntityDragon spill1557_36;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    float life4_22;
    float life5_30;
    float life4_106;
    float life5_114;
    float life6_122;
    float life4_174;
    float life4_182;
    int life5_246;
    double life5_350;
    double life7_363;
    double life9_376;
    double life11_384;
    double life5_441;
    double life7_447;
    double life9_453;
    double life11_465;
    double life13_489;
    double life15_495;
    double life17_504;
    double life19_512;
    double life7_627;
    float life13_629;
    double life7_637;
    double life14_660;
    double life16_667;
    moom.DR life18_709;
    double life19_719;
    moom.DR life21_735;
    float life22_744;
    float life23_776;
    double life24_791;
    float life26_833;
    float life27_835;
    moom.DR life28_897;
    float life29_906;
    float life29_912;
    float life5_1017;
    float life6_1020;
    float life7_1024;
    float life8_1031;
    float life9_1034;
    float life10_1037;
    double[] life11_1188;
    double[] life12_1193;
    float life13_1206;
    float life14_1219;
    int life15_1262;
    moom.ts life16_1267;
    double[] life17_1307;
    float life18_1328;
    float life19_1331;
    float life20_1334;
    float life21_1336;
    float life22_1343;
    lexical_join_1270: {
    lexical_join_1258: {
    lexical_join_1256: {
    lexical_join_1251: {
    lexical_join_1044: {
    lexical_join_1043: {
    lexical_join_865: {
    lexical_join_804: {
    lexical_join_758: {
    lexical_join_751: {
    lexical_join_750: {
    lexical_join_711: {
    lexical_join_683: {
    lexical_join_658: {
    lexical_join_639: {
    lexical_join_576: {
    lexical_join_575: {
    lexical_join_573: {
    lexical_join_568: {
    lexical_join_508: {
    lexical_join_507: {
    lexical_join_506: {
    lexical_join_500: {
    lexical_join_493: {
    lexical_join_479: {
    lexical_join_470: {
    lexical_join_459: {
    lexical_join_457: {
    lexical_join_449: {
    lexical_join_368: {
    lexical_join_367: {
    lexical_join_266: {
    lexical_join_261: {
    lexical_join_242: {
    lexical_join_233: {
    lexical_join_226: {
    lexical_join_194: {
    lexical_join_192: {
    lexical_join_177: {
    lexical_join_172: {
    lexical_join_171: {
    lexical_join_146: {
    lexical_join_127: {
    lexical_join_74: {
    lexical_join_64: {
    life1_3 = (net.minecraft.entity.boss.EntityDragon.db ^ 39791526182521L);
    life3_5 = __sourceExactCall_48f34d8f310a4f();
    spill1557_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == null))) {
        lexicalValue1557_74_0 = ((spill1557_0) ? 1 : 0);
        break lexical_join_74;
    }
    if (!(spill1557_0)) {
        break lexical_join_64;
    }
    life4_22 = moom.Dr.b(((float)(((this.ca * 0x1.921fb6p1f) * 0x1.0p1f))));
    life5_30 = moom.Dr.b(((float)(((this.b_ * 0x1.921fb6p1f) * 0x1.0p1f))));
    spill1557_1 = recovery.source.CarrierOps.fcmpg(((float)(life5_30)), ((float)(-0x1.333334p-2f)));
    if (!((life3_5 == null))) {
        lexicalValue1557_74_0 = spill1557_1;
        break lexical_join_74;
    }
    if (!((spill1557_1 <= 0))) {
        break lexical_join_64;
    }
    spill1557_2 = recovery.source.CarrierOps.fcmpl(((float)(life4_22)), ((float)(-0x1.333334p-2f)));
    if (!((life3_5 == null))) {
        lexicalValue1557_74_0 = spill1557_2;
        break lexical_join_74;
    }
    if (!((spill1557_2 >= 0))) {
        break lexical_join_64;
    }
    spill1557_3 = ((net.minecraft.entity.boss.EntityDragon)(this)).f__Boolean();
    if (!((life3_5 == null))) {
        lexicalValue1557_74_0 = ((spill1557_3) ? 1 : 0);
        break lexical_join_74;
    }
    if (!((!spill1557_3))) {
        break lexical_join_64;
    }
    ((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((java.lang.String)("mob.enderdragon.wings")), ((float)(0x1.4p2f)), ((float)((0x1.99999ap-1f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.333334p-2f)))), ((boolean)(false)));
    }
    this.b_ = ((float)(this.ca));
    spill1557_4 = __sourceExactCall_9750978342591c(((net.minecraft.entity.boss.EntityDragon)(this)));
    spill1557_5 = 0x0.0p0f;
    if (!((life3_5 == null))) {
        lexicalValue1557_146_0 = spill1557_4;
        lexicalValue1557_146_1 = spill1557_5;
        break lexical_join_146;
    }
    lexicalValue1557_74_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1557_4)), ((float)(spill1557_5)));
    }
    if (!((lexicalValue1557_74_0 <= 0))) {
        break lexical_join_127;
    }
    life4_106 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p3f);
    life5_114 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p2f);
    life6_122 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.0p3f);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_LARGE)), ((double)((this.n + ((double) life4_106)))), ((double)(((this.o + 0x1.0p1d) + ((double) life5_114)))), ((double)((this.p + ((double) life6_122)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life3_5 != null))) {
        break lexical_join_1270;
    }
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).W__sourceReturn_da8c82d5d4();
    lexicalValue1557_146_0 = 0x1.99999ap-3f;
    lexicalValue1557_146_1 = ((moom.Dr.a__Float(((double)(((this.t * this.t) + (this.v * this.v))))) * 0x1.4p3f) + 0x1.0p0f);
    }
    life4_174 = (lexicalValue1557_146_0 / lexicalValue1557_146_1);
    life4_182 = (life4_174 * ((float) java.lang.Math.pow(((double)(0x1.0p1d)), ((double)(this.u)))));
    spill1557_6 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_172_0 = spill1557_6;
        break lexical_join_172;
    }
    if (!(((net.minecraft.entity.boss.EntityDragon)(spill1557_6)).cc)) {
        break lexical_join_171;
    }
    net.minecraft.entity.boss.EntityDragon __stackOp1557_45_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_45_0)).ca = ((float)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_45_0)).ca + (life4_182 * 0x1.0p-1f))));
    if (!((life3_5 != null))) {
        break lexical_join_177;
    }
    }
    lexicalValue1557_172_0 = this;
    }
    net.minecraft.entity.boss.EntityDragon __stackOp1557_48_0 = lexicalValue1557_172_0;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_48_0)).ca = ((float)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_48_0)).ca + life4_182)));
    }
    this.w = ((float)(moom.Dr.e(((float)(this.w)))));
    spill1557_7 = ((net.minecraft.entity.boss.EntityDragon)(this)).U__Boolean();
    if (!((life3_5 == null))) {
        lexicalValue1557_194_0 = ((spill1557_7) ? 1 : 0);
        break lexical_join_194;
    }
    if (!(spill1557_7)) {
        break lexical_join_192;
    }
    this.ca = ((float)(0x1.0p-1f));
    if (!((life3_5 != null))) {
        break lexical_join_1270;
    }
    }
    lexicalValue1557_194_0 = this.b1;
    }
    if (!((life3_5 == null))) {
        lexicalValue1557_233_0 = lexicalValue1557_194_0;
        break lexical_join_233;
    }
    if (!((lexicalValue1557_194_0 < 0))) {
        break lexical_join_226;
    }
    life5_246 = 0;
    lexical_cycle_199: while (true) {
    if (!((life5_246 < (this.b0).length))) {
        break lexical_join_226;
    }
    ((this.b0)[life5_246])[0] = ((double) this.w);
    ((this.b0)[life5_246])[1] = this.o;
    life5_246 += 1;
    if (!((life3_5 == null))) {
        break lexical_join_261;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_199; }
    break lexical_cycle_199;
    }
    }
    net.minecraft.entity.boss.EntityDragon __stackOp1557_63_0 = this;
    net.minecraft.entity.boss.EntityDragon __stackOp1557_65_0 = __stackOp1557_63_0;
    int __stackOp1557_65_1 = (((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_63_0)).b1 + 1);
    spill1557_8 = __stackOp1557_65_1;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_65_0)).b1 = ((int)(__stackOp1557_65_1));
    lexicalValue1557_233_0 = spill1557_8;
    }
    if (!((life3_5 == null))) {
        lexicalValue1557_266_0 = lexicalValue1557_233_0;
        break lexical_join_266;
    }
    if (!((lexicalValue1557_233_0 == (this.b0).length))) {
        break lexical_join_242;
    }
    this.b1 = ((int)(0));
    }
    ((this.b0)[this.b1])[0] = ((double) this.w);
    ((this.b0)[this.b1])[1] = this.o;
    }
    spill1557_9 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_368_0 = spill1557_9;
        break lexical_join_368;
    }
    lexicalValue1557_266_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.boss.EntityDragon)(spill1557_9)).i)).G) ? 1 : 0);
    }
    if (!((lexicalValue1557_266_0 != 0))) {
        break lexical_join_367;
    }
    spill1557_10 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_865_0 = spill1557_10;
        break lexical_join_865;
    }
    if (!((((net.minecraft.entity.boss.EntityDragon)(spill1557_10)).bm > 0))) {
        break lexical_join_804;
    }
    life5_350 = (this.n + ((this.bn - this.n) / ((double) this.bm)));
    life7_363 = (this.o + ((this.bo - this.o) / ((double) this.bm)));
    life9_376 = (this.p + ((this.bp - this.p) / ((double) this.bm)));
    life11_384 = moom.Dr.a(((double)((this.bq - ((double) this.w)))));
    this.w = ((float)(((float) (((double) this.w) + (life11_384 / ((double) this.bm))))));
    this.x = ((float)(((float) (((double) this.x) + ((this.br - ((double) this.x)) / ((double) this.bm))))));
    net.minecraft.entity.boss.EntityDragon __stackOp1557_102_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_102_0)).bm = ((int)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_102_0)).bm - 1)));
    ((net.minecraft.entity.boss.EntityDragon)(this)).a__Void(((double)(life5_350)), ((double)(life7_363)), ((double)(life9_376)));
    ((net.minecraft.entity.boss.EntityDragon)(this)).b(((float)(this.w)), ((float)(this.x)));
    if (!((life3_5 != null))) {
        break lexical_join_804;
    }
    }
    lexicalValue1557_368_0 = this;
    }
    life5_441 = (((net.minecraft.entity.boss.EntityDragon)(lexicalValue1557_368_0)).bX - this.n);
    life7_447 = (this.bY - this.o);
    life9_453 = (this.bZ - this.p);
    life11_465 = (((life5_441 * life5_441) + (life7_447 * life7_447)) + (life9_453 * life9_453));
    spill1557_11 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_470_0 = spill1557_11;
        break lexical_join_470;
    }
    if (!((((net.minecraft.entity.boss.EntityDragon)(spill1557_11)).cd != null))) {
        break lexical_join_459;
    }
    this.bX = ((double)(((net.minecraft.entity.Entity)(this.cd)).n));
    this.bZ = ((double)(((net.minecraft.entity.Entity)(this.cd)).p));
    life13_489 = (this.bX - this.n);
    life15_495 = (this.bZ - this.p);
    life17_504 = java.lang.Math.sqrt(((double)(((life13_489 * life13_489) + (life15_495 * life15_495)))));
    life19_512 = ((0x1.99999ap-2d + (life17_504 / 0x1.4p6d)) - 0x1.0p0d);
    if (!((life3_5 == null))) {
        break lexical_join_457;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life19_512)), ((double)(0x1.4p3d))) > 0))) {
        break lexical_join_449;
    }
    life19_512 = 0x1.4p3d;
    }
    this.bY = ((double)((((moom.CA)(__sourceExactCall_5f0a1ab2f67043(((net.minecraft.entity.Entity)(this.cd))))).c + life19_512)));
    }
    if (!((life3_5 != null))) {
        break lexical_join_479;
    }
    }
    net.minecraft.entity.boss.EntityDragon __stackOp1557_132_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_132_0)).bX = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_132_0)).bX + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.0p1d))));
    lexicalValue1557_470_0 = this;
    }
    net.minecraft.entity.boss.EntityDragon __stackOp1557_137_0 = lexicalValue1557_470_0;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_137_0)).bZ = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_137_0)).bZ + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.0p1d))));
    }
    spill1557_12 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_507_0 = spill1557_12;
        break lexical_join_507;
    }
    if (!((!((net.minecraft.entity.boss.EntityDragon)(spill1557_12)).cb))) {
        break lexical_join_506;
    }
    spill1557_13 = recovery.source.CarrierOps.dcmpg(((double)(life11_465)), ((double)(0x1.9p6d)));
    if (!((life3_5 == null))) {
        lexicalValue1557_493_0 = spill1557_13;
        break lexical_join_493;
    }
    if (!((spill1557_13 >= 0))) {
        break lexical_join_506;
    }
    lexicalValue1557_493_0 = recovery.source.CarrierOps.dcmpl(((double)(life11_465)), ((double)(0x1.5f9p14d)));
    }
    if (!((life3_5 == null))) {
        lexicalValue1557_500_0 = lexicalValue1557_493_0;
        break lexical_join_500;
    }
    if (!((lexicalValue1557_493_0 <= 0))) {
        break lexical_join_506;
    }
    spill1557_14 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_507_0 = spill1557_14;
        break lexical_join_507;
    }
    lexicalValue1557_500_0 = ((((net.minecraft.entity.boss.EntityDragon)(spill1557_14)).B) ? 1 : 0);
    }
    if (!((lexicalValue1557_500_0 == 0))) {
        break lexical_join_506;
    }
    spill1557_15 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_507_0 = spill1557_15;
        break lexical_join_507;
    }
    if (!(((net.minecraft.entity.boss.EntityDragon)(spill1557_15)).C)) {
        break lexical_join_508;
    }
    }
    lexicalValue1557_507_0 = this;
    }
    ((net.minecraft.entity.boss.EntityDragon)(lexicalValue1557_507_0)).X__sourceReturn_da8c82d5d4();
    }
    life7_627 = (life7_447 / ((double) moom.Dr.a__Float(((double)(((life5_441 * life5_441) + (life9_453 * life9_453)))))));
    life13_629 = 0x1.333334p-1f;
    life7_637 = moom.Dr.a(((double)(life7_627)), ((double)(((double) (-life13_629)))), ((double)(((double) life13_629))));
    net.minecraft.entity.boss.EntityDragon __stackOp1557_151_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_151_0)).u = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_151_0)).u + (life7_637 * 0x1.99999ap-4d))));
    this.w = ((float)(moom.Dr.e(((float)(this.w)))));
    life14_660 = (0x1.68p7d - ((moom.Dr.b(((double)(life5_441)), ((double)(life9_453))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    life16_667 = moom.Dr.a(((double)((life14_660 - ((double) this.w)))));
    spill1557_16 = recovery.source.CarrierOps.dcmpl(((double)(life16_667)), ((double)(0x1.9p5d)));
    if (!((life3_5 == null))) {
        lexicalValue1557_573_0 = spill1557_16;
        break lexical_join_573;
    }
    if (!((spill1557_16 > 0))) {
        break lexical_join_568;
    }
    life16_667 = 0x1.9p5d;
    }
    spill1557_17 = life16_667;
    if (!((life3_5 == null))) {
        lexicalValue1557_575_0 = spill1557_17;
        break lexical_join_575;
    }
    lexicalValue1557_573_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1557_17)), ((double)(-0x1.9p5d)));
    }
    if (!((lexicalValue1557_573_0 < 0))) {
        break lexical_join_576;
    }
    lexicalValue1557_575_0 = -0x1.9p5d;
    }
    life16_667 = lexicalValue1557_575_0;
    }
    life18_709 = ((moom.DR)(new moom.DR((this.bX - this.n), (this.bY - this.o), (this.bZ - this.p)))).a__DR();
    life19_719 = ((double) (-moom.Dr.b(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f))))));
    life21_735 = ((moom.DR)(new moom.DR(((double) moom.Dr.a(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f))))), this.u, life19_719))).a__DR();
    life22_744 = ((((float) ((moom.DR)(life21_735)).a(((moom.DR)(life18_709)))) + 0x1.0p-1f) / 0x1.8p0f);
    spill1557_18 = life22_744;
    spill1557_19 = 0x0.0p0f;
    if (!((life3_5 == null))) {
        lexicalValue1557_658_0 = spill1557_18;
        lexicalValue1557_658_1 = spill1557_19;
        break lexical_join_658;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill1557_18)), ((float)(spill1557_19))) < 0))) {
        break lexical_join_639;
    }
    life22_744 = 0x0.0p0f;
    }
    net.minecraft.entity.boss.EntityDragon __stackOp1557_177_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_177_0)).bl = ((float)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_177_0)).bl * 0x1.99999ap-1f)));
    lexicalValue1557_658_0 = moom.Dr.a__Float(((double)(((this.t * this.t) + (this.v * this.v)))));
    lexicalValue1557_658_1 = 0x1.0p0f;
    }
    life23_776 = (lexicalValue1557_658_0 + lexicalValue1557_658_1);
    life24_791 = (java.lang.Math.sqrt(((double)(((this.t * this.t) + (this.v * this.v))))) + 0x1.0p0d);
    spill1557_20 = life24_791;
    spill1557_21 = 0x1.4p5d;
    if (!((life3_5 == null))) {
        lexicalValue1557_711_0 = spill1557_20;
        lexicalValue1557_711_1 = spill1557_21;
        break lexical_join_711;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1557_20)), ((double)(spill1557_21))) > 0))) {
        break lexical_join_683;
    }
    life24_791 = 0x1.4p5d;
    }
    this.bl = ((float)(((float) (((double) this.bl) + (life16_667 * ((0x1.666666p-1d / life24_791) / ((double) life23_776)))))));
    net.minecraft.entity.boss.EntityDragon __stackOp1557_193_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_193_0)).w = ((float)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_193_0)).w + (this.bl * 0x1.99999ap-4f))));
    lexicalValue1557_711_0 = 0x1.0p1d;
    lexicalValue1557_711_1 = (life24_791 + 0x1.0p0d);
    }
    life26_833 = ((float) (lexicalValue1557_711_0 / lexicalValue1557_711_1));
    life27_835 = 0x1.eb851ep-5f;
    ((net.minecraft.entity.boss.EntityDragon)(this)).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)((life27_835 * ((life22_744 * life26_833) + (0x1.0p0f - life26_833))))));
    spill1557_22 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_751_0 = spill1557_22;
        break lexical_join_751;
    }
    if (!(((net.minecraft.entity.boss.EntityDragon)(spill1557_22)).cc)) {
        break lexical_join_750;
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).b__Void(((double)((this.t * 0x1.99999ap-1d))), ((double)((this.u * 0x1.99999ap-1d))), ((double)((this.v * 0x1.99999ap-1d))));
    if (!((life3_5 != null))) {
        break lexical_join_758;
    }
    }
    lexicalValue1557_751_0 = this;
    }
    ((net.minecraft.entity.boss.EntityDragon)(lexicalValue1557_751_0)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    }
    life28_897 = ((moom.DR)(new moom.DR(this.t, this.u, this.v))).a__DR();
    life29_906 = ((((float) ((moom.DR)(life28_897)).a(((moom.DR)(life21_735)))) + 0x1.0p0f) / 0x1.0p1f);
    life29_912 = (0x1.99999ap-1f + (0x1.333334p-3f * life29_906));
    net.minecraft.entity.boss.EntityDragon __stackOp1557_212_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_212_0)).t = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_212_0)).t * ((double) life29_912))));
    net.minecraft.entity.boss.EntityDragon __stackOp1557_215_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_215_0)).v = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_215_0)).v * ((double) life29_912))));
    net.minecraft.entity.boss.EntityDragon __stackOp1557_218_0 = this;
    ((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_218_0)).u = ((double)((((net.minecraft.entity.boss.EntityDragon)(__stackOp1557_218_0)).u * 0x1.d1eb86p-1d)));
    }
    this.a2 = ((float)(this.w));
    spill1557_23 = this.b3;
    moom.ts __stackOp1557_225_0 = this.b3;
    float __stackOp1557_225_1 = 0x1.8p1f;
    spill1557_24 = __stackOp1557_225_1;
    ((moom.ts)(__stackOp1557_225_0)).H = ((float)(__stackOp1557_225_1));
    ((moom.ts)(spill1557_23)).G = ((float)(spill1557_24));
    spill1557_25 = this.b5;
    moom.ts __stackOp1557_230_0 = this.b5;
    float __stackOp1557_230_1 = 0x1.0p1f;
    spill1557_26 = __stackOp1557_230_1;
    ((moom.ts)(__stackOp1557_230_0)).H = ((float)(__stackOp1557_230_1));
    ((moom.ts)(spill1557_25)).G = ((float)(spill1557_26));
    spill1557_27 = this.b6;
    moom.ts __stackOp1557_235_0 = this.b6;
    float __stackOp1557_235_1 = 0x1.0p1f;
    spill1557_28 = __stackOp1557_235_1;
    ((moom.ts)(__stackOp1557_235_0)).H = ((float)(__stackOp1557_235_1));
    ((moom.ts)(spill1557_27)).G = ((float)(spill1557_28));
    spill1557_29 = this.b7;
    moom.ts __stackOp1557_240_0 = this.b7;
    float __stackOp1557_240_1 = 0x1.0p1f;
    spill1557_30 = __stackOp1557_240_1;
    ((moom.ts)(__stackOp1557_240_0)).H = ((float)(__stackOp1557_240_1));
    ((moom.ts)(spill1557_29)).G = ((float)(spill1557_30));
    ((moom.ts)(this.b4)).H = ((float)(0x1.8p1f));
    ((moom.ts)(this.b4)).G = ((float)(0x1.4p2f));
    ((moom.ts)(this.b8)).H = ((float)(0x1.0p1f));
    ((moom.ts)(this.b8)).G = ((float)(0x1.0p2f));
    ((moom.ts)(this.b9)).H = ((float)(0x1.8p1f));
    ((moom.ts)(this.b9)).G = ((float)(0x1.0p2f));
    lexicalValue1557_865_0 = this;
    }
    life5_1017 = (((((float) ((((net.minecraft.entity.boss.EntityDragon)(lexicalValue1557_865_0)).a__sourceReturn_59e90b7c78(((int)(5)), ((float)(0x1.0p0f))))[1] - (((net.minecraft.entity.boss.EntityDragon)(this)).a__sourceReturn_59e90b7c78(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic1557_256(27227, (2184672579748293495L ^ life1_3)))), ((float)(0x1.0p0f))))[1])) * 0x1.4p3f) / 0x1.68p7f) * 0x1.921fb6p1f);
    life6_1020 = moom.Dr.b(((float)(life5_1017)));
    life7_1024 = (-moom.Dr.a(((float)(life5_1017))));
    life8_1031 = ((this.w * 0x1.921fb6p1f) / 0x1.68p7f);
    life9_1034 = moom.Dr.a(((float)(life8_1031)));
    life10_1037 = moom.Dr.b(((float)(life8_1031)));
    ((moom.ts)(this.b4)).g__Void();
    ((moom.ts)(this.b4)).c(((double)((this.n + ((double) (life9_1034 * 0x1.0p-1f))))), ((double)(this.o)), ((double)((this.p - ((double) (life10_1037 * 0x1.0p-1f))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.ts)(this.b8)).g__Void();
    ((moom.ts)(this.b8)).c(((double)((this.n + ((double) (life10_1037 * 0x1.2p2f))))), ((double)((this.o + 0x1.0p1d))), ((double)((this.p + ((double) (life9_1034 * 0x1.2p2f))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.ts)(this.b9)).g__Void();
    ((moom.ts)(this.b9)).c(((double)((this.n - ((double) (life10_1037 * 0x1.2p2f))))), ((double)((this.o + 0x1.0p1d))), ((double)((this.p - ((double) (life9_1034 * 0x1.2p2f))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    spill1557_31 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_1044_0 = spill1557_31;
        break lexical_join_1044;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.boss.EntityDragon)(spill1557_31)).i)).G))) {
        break lexical_join_1043;
    }
    spill1557_32 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_1044_0 = spill1557_32;
        break lexical_join_1044;
    }
    if (!((((net.minecraft.entity.boss.EntityDragon)(spill1557_32)).aO == 0))) {
        break lexical_join_1043;
    }
    ((net.minecraft.entity.boss.EntityDragon)(this)).a(((java.util.List)(((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((moom.CA)(__sourceExactCall_5b649ba30da1b3(((moom.ts)(this.b8))))).b(((double)(0x1.0p2d)), ((double)(0x1.0p1d)), ((double)(0x1.0p2d))))).c(((double)(0x0.0p0d)), ((double)(-0x1.0p1d)), ((double)(0x0.0p0d)))))))));
    ((net.minecraft.entity.boss.EntityDragon)(this)).a(((java.util.List)(((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((moom.CA)(__sourceExactCall_5b649ba30da1b3(((moom.ts)(this.b9))))).b(((double)(0x1.0p2d)), ((double)(0x1.0p1d)), ((double)(0x1.0p2d))))).c(((double)(0x0.0p0d)), ((double)(-0x1.0p1d)), ((double)(0x0.0p0d)))))))));
    ((net.minecraft.entity.boss.EntityDragon)(this)).b(((java.util.List)(((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(__sourceExactCall_5b649ba30da1b3(((moom.ts)(this.b3))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(0x1.0p0d)))))))));
    }
    lexicalValue1557_1044_0 = this;
    }
    life11_1188 = ((net.minecraft.entity.boss.EntityDragon)(lexicalValue1557_1044_0)).a__sourceReturn_59e90b7c78(((int)(5)), ((float)(0x1.0p0f)));
    life12_1193 = ((net.minecraft.entity.boss.EntityDragon)(this)).a__sourceReturn_59e90b7c78(((int)(0)), ((float)(0x1.0p0f)));
    life13_1206 = moom.Dr.a(((float)((((this.w * 0x1.921fb6p1f) / 0x1.68p7f) - (this.bl * 0x1.47ae14p-7f)))));
    life14_1219 = moom.Dr.b(((float)((((this.w * 0x1.921fb6p1f) / 0x1.68p7f) - (this.bl * 0x1.47ae14p-7f)))));
    ((moom.ts)(this.b3)).g__Void();
    ((moom.ts)(this.b3)).c(((double)((this.n + ((double) ((life13_1206 * 0x1.6p2f) * life6_1020))))), ((double)(((this.o + ((life12_1193)[1] - (life11_1188)[1])) + ((double) (life7_1024 * 0x1.6p2f))))), ((double)((this.p - ((double) ((life14_1219 * 0x1.6p2f) * life6_1020))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    life15_1262 = 0;
    lexical_cycle_1122: while (true) {
    lexical_join_1148: {
    lexical_join_1144: {
    lexical_join_1142: {
    lexical_join_1134: {
    if (!((life15_1262 < 3))) {
        break lexical_join_1251;
    }
    life16_1267 = null;
    spill1557_33 = life15_1262;
    if (!((life3_5 == null))) {
        lexicalValue1557_1256_0 = spill1557_33;
        break lexical_join_1256;
    }
    if (!((spill1557_33 == 0))) {
        break lexical_join_1134;
    }
    life16_1267 = this.b5;
    }
    spill1557_34 = life15_1262;
    spill1557_35 = 1;
    if (!((life3_5 == null))) {
        lexicalValue1557_1144_0 = spill1557_34;
        lexicalValue1557_1144_1 = spill1557_35;
        break lexical_join_1144;
    }
    if (!((spill1557_34 == spill1557_35))) {
        break lexical_join_1142;
    }
    life16_1267 = this.b6;
    }
    lexicalValue1557_1144_0 = life15_1262;
    lexicalValue1557_1144_1 = 2;
    }
    if (!((lexicalValue1557_1144_0 == lexicalValue1557_1144_1))) {
        break lexical_join_1148;
    }
    life16_1267 = this.b7;
    }
    life17_1307 = ((net.minecraft.entity.boss.EntityDragon)(this)).a__sourceReturn_59e90b7c78(((int)((__sourceIntrinsic_c7b45e3c376e_invokedynamic1557_325(29185, (4799057570808722223L ^ life1_3)) + (life15_1262 * 2)))), ((float)(0x1.0p0f)));
    life18_1328 = (((this.w * 0x1.921fb6p1f) / 0x1.68p7f) + ((((net.minecraft.entity.boss.EntityDragon)(this)).a__sourceReturn_44b37c2d95(((double)(((life17_1307)[0] - (life11_1188)[0])))) * 0x1.921fb6p1f) / 0x1.68p7f));
    life19_1331 = moom.Dr.a(((float)(life18_1328)));
    life20_1334 = moom.Dr.b(((float)(life18_1328)));
    life21_1336 = 0x1.8p0f;
    life22_1343 = (((float) (life15_1262 + 1)) * 0x1.0p1f);
    ((moom.ts)(life16_1267)).g__Void();
    ((moom.ts)(life16_1267)).c(((double)((this.n - ((double) (((life9_1034 * life21_1336) + (life19_1331 * life22_1343)) * life6_1020))))), ((double)((((this.o + ((life17_1307)[1] - (life11_1188)[1])) - ((double) ((life22_1343 + life21_1336) * life7_1024))) + 0x1.8p0d))), ((double)((this.p + ((double) (((life10_1037 * life21_1336) + (life20_1334 * life22_1343)) * life6_1020))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    life15_1262 += 1;
    if (!((life3_5 != null))) { continue lexical_cycle_1122; }
    break lexical_cycle_1122;
    }
    }
    spill1557_36 = this;
    if (!((life3_5 == null))) {
        lexicalValue1557_1258_0 = spill1557_36;
        break lexical_join_1258;
    }
    lexicalValue1557_1256_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.boss.EntityDragon)(spill1557_36)).i)).G) ? 1 : 0);
    }
    if (!((lexicalValue1557_1256_0 == 0))) {
        break lexical_join_1270;
    }
    lexicalValue1557_1258_0 = this;
    }
    ((net.minecraft.entity.boss.EntityDragon)(lexicalValue1557_1258_0)).cc = ((boolean)__sourceIntrinsic_integerToBoolean(((((((net.minecraft.entity.boss.EntityDragon)(this)).b(((moom.CA)(__sourceExactCall_5b649ba30da1b3(((moom.ts)(this.b3))))))) ? 1 : 0) | ((((net.minecraft.entity.boss.EntityDragon)(this)).b(((moom.CA)(__sourceExactCall_5b649ba30da1b3(((moom.ts)(this.b4))))))) ? 1 : 0)))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_4f195331a380_originalDynamicSite480_5(int a0, long a1) throws E;

private static native <E extends Throwable> double[][] __sourceIntrinsic_4f195331a380_multiArray480_6(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4f195331a380_originalDynamicSite480_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4f195331a380_originalDynamicSite480_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1557_256(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1557_325(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c791a6088d77_invokedynamic1558_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c791a6088d77_invokedynamic1558_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_296ab52b3f54_invokedynamic660_6() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f8707f95b411_invokedynamic5003_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f8707f95b411_invokedynamic5003_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0dd38c3318e1_invokedynamic1109_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0dd38c3318e1_invokedynamic1109_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0dd38c3318e1_invokedynamic1109_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1564_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1564_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1564_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1564_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1564_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1564_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1564_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11286_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_d69b06941ddd75(int p0);
private static native int __sourceExactCall_e4228a48c13c7a(int p0, long p1);
private static native float __sourceExactCall_9750978342591c(net.minecraft.entity.boss.EntityDragon p0);
private static native net.minecraft.util.DamageSource __sourceExactCall_c4aa3d32e9e90d(moom.Ei p0);

private static native net.minecraft.entity.Entity[] __sourceExactCall_48f34d8f310a4f();
private static native moom.CA __sourceExactCall_5f0a1ab2f67043(net.minecraft.entity.Entity p0);
private static native moom.CA __sourceExactCall_5b649ba30da1b3(moom.ts p0);
}
