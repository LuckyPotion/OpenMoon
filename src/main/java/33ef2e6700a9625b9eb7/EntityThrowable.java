package net.minecraft.entity.projectile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EntityThrowable extends net.minecraft.entity.Entity implements net.minecraft.entity.IProjectile {

private int aE;

private int aF;

private int aG;

private net.minecraft.block.Block aH;

protected boolean aI;

public int aJ;

private net.minecraft.entity.EntityLivingBase aK;

private java.lang.String aL;

private int aM;

private int aN;

private static long cb;

private static long[] db;

private static java.lang.Integer[] eb;

private static java.util.Map gb;

public EntityThrowable(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0);
    this.aE = -1;
    this.aF = -1;
    this.aG = -1;
    this.aM = 0;
    (this).a__Void(0x1.0000000000000p-2f, 0x1.0000000000000p-2f);
    (this).a__Void(p1, p2, p3);
}


public EntityThrowable(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1) { super((net.minecraft.world.World)null); __sourceHandlerCall_fe0324c1285220cf4a76(this, p0, p1); }


public EntityThrowable(net.minecraft.world.World p0) {
super(p0);
    this.aE = -1;
    this.aF = -1;
    this.aG = -1;
    (this).a__Void(0x1.0000000000000p-2f, 0x1.0000000000000p-2f);
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-890570554844013609L)), ((long)(-7630358772366735260L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(126563156140749L)))));
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.projectile.EntityThrowable.cb ^ 14690475945980L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1894_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1894_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1894_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1894_14 = new byte[8];
    (__sourceSpill1894_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1894_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1894_16 = __sourceSpill1894_14;
    ((javax.crypto.Cipher)(__sourceSpill1894_11)).init(((int)(__sourceSpill1894_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1894_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1894_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\002ñÊ\020Üïîµ\f/¦UI4"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1894_25 = local6_life21;
        int __sourceSpill1894_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1894_25)).substring(((int)(__sourceSpill1894_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1894_30 = local8_life19;
        int __sourceSpill1894_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1894_33 = new byte[8];
        (__sourceSpill1894_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1894_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1894_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1894_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1894_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1894_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1894_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1894_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1894_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1894_34)).doFinal(((byte[])(__sourceSpill1894_33)));
        (__sourceSpill1894_30)[__sourceSpill1894_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "­?å\022\035jR\t>$Ía+ "))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1894_38 = local6_life21;
        int __sourceSpill1894_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1894_38)).substring(((int)(__sourceSpill1894_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1894_43 = local8_life19;
        int __sourceSpill1894_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1894_46 = new byte[8];
        (__sourceSpill1894_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1894_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1894_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1894_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1894_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1894_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1894_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1894_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1894_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1894_47)).doFinal(((byte[])(__sourceSpill1894_46)));
        (__sourceSpill1894_43)[__sourceSpill1894_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    eb = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_fe0324c1285220cf4a76(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.world.World a1, net.minecraft.entity.EntityLivingBase a2) throws E;
private static final class __SourceHandler_fe0324c1285220cf4a76 {

public static void f566(net.minecraft.entity.projectile.EntityThrowable receiver, net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1) throws Throwable {
    int[] spill566_0;
    long life3_3;
    float life6_85;
    int[] life5_107;
    life3_3 = (__fieldRead566_0() ^ 4115079720285L);
    __directSuperInit566_1(receiver, p0);
    __fieldWrite566_2(receiver, -1);
    __fieldWrite566_3(receiver, -1);
    __fieldWrite566_4(receiver, -1);
    __fieldWrite566_5(receiver, p1);
    __call566_6(receiver, 0x1.0p-2f, 0x1.0p-2f);
    __call566_13(receiver, __fieldRead566_7(p1), (__fieldRead566_8(p1) + ((double) __call566_9(p1))), __fieldRead566_10(p1), __fieldRead566_11(p1), __fieldRead566_12(p1));
    net.minecraft.entity.projectile.EntityThrowable __stackOp566_14_0 = receiver;
    __fieldWrite566_18(__stackOp566_14_0, (__fieldRead566_15(__stackOp566_14_0) - ((double) (__call566_17(((__fieldRead566_16(receiver) / 0x1.68p7f) * 0x1.921fb6p1f)) * 0x1.47ae14p-3f))));
    net.minecraft.entity.projectile.EntityThrowable __stackOp566_19_0 = receiver;
    __fieldWrite566_21(__stackOp566_19_0, (__fieldRead566_20(__stackOp566_19_0) - 0x1.99999ap-4d));
    net.minecraft.entity.projectile.EntityThrowable __stackOp566_22_0 = receiver;
    __fieldWrite566_26(__stackOp566_22_0, (__fieldRead566_23(__stackOp566_22_0) - ((double) (__call566_25(((__fieldRead566_24(receiver) / 0x1.68p7f) * 0x1.921fb6p1f)) * 0x1.47ae14p-3f))));
    __call566_30(receiver, __fieldRead566_27(receiver), __fieldRead566_28(receiver), __fieldRead566_29(receiver));
    spill566_0 = __call566_31();
    life6_85 = 0x1.99999ap-2f;
    __fieldWrite566_36(receiver, ((double) (((-__call566_33(((__fieldRead566_32(receiver) / 0x1.68p7f) * 0x1.921fb6p1f))) * __call566_35(((__fieldRead566_34(receiver) / 0x1.68p7f) * 0x1.921fb6p1f))) * life6_85)));
    life5_107 = spill566_0;
    __fieldWrite566_41(receiver, ((double) ((__call566_38(((__fieldRead566_37(receiver) / 0x1.68p7f) * 0x1.921fb6p1f)) * __call566_40(((__fieldRead566_39(receiver) / 0x1.68p7f) * 0x1.921fb6p1f))) * life6_85)));
    __fieldWrite566_45(receiver, ((double) ((-__call566_44((((__fieldRead566_42(receiver) + __call566_43(receiver)) / 0x1.68p7f) * 0x1.921fb6p1f))) * life6_85)));
    __call566_50(receiver, __fieldRead566_46(receiver), __fieldRead566_47(receiver), __fieldRead566_48(receiver), __call566_49(receiver), 0x1.0p0f);
    if ((__call566_51() != null)) {
        __call566_52(new int[2]);
    } else {
        
    }
    return;
}
public static void h566_0(moom.Oo p0) throws Throwable {
    throw __call3056600_0(p0);
}
private static native long __fieldRead566_0() throws Throwable;
private static native void __directSuperInit566_1(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.world.World a1) throws Throwable;
private static native void __fieldWrite566_2(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native void __fieldWrite566_3(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native void __fieldWrite566_4(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native void __fieldWrite566_5(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native void __call566_6(net.minecraft.entity.projectile.EntityThrowable a0, float a1, float a2) throws Throwable;
private static native double __fieldRead566_7(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native double __fieldRead566_8(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __call566_9(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native double __fieldRead566_10(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead566_11(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead566_12(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call566_13(net.minecraft.entity.projectile.EntityThrowable a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native double __fieldRead566_15(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead566_16(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_17(float a0) throws Throwable;
private static native void __fieldWrite566_18(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead566_20(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite566_21(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead566_23(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead566_24(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_25(float a0) throws Throwable;
private static native void __fieldWrite566_26(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead566_27(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead566_28(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead566_29(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call566_30(net.minecraft.entity.projectile.EntityThrowable a0, double a1, double a2, double a3) throws Throwable;
private static native int[] __call566_31() throws Throwable;
private static native float __fieldRead566_32(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_33(float a0) throws Throwable;
private static native float __fieldRead566_34(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_35(float a0) throws Throwable;
private static native void __fieldWrite566_36(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native float __fieldRead566_37(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_38(float a0) throws Throwable;
private static native float __fieldRead566_39(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_40(float a0) throws Throwable;
private static native void __fieldWrite566_41(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native float __fieldRead566_42(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_43(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_44(float a0) throws Throwable;
private static native void __fieldWrite566_45(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead566_46(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead566_47(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead566_48(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call566_49(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call566_50(net.minecraft.entity.projectile.EntityThrowable a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native java.lang.String[] __call566_51() throws Throwable;
private static native void __call566_52(int[] a0) throws Throwable;
private static native java.lang.Throwable __call3056600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_64dc877adc4ed195b7d4(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws E;
private static final class __SourceHandler_64dc877adc4ed195b7d4 {

public static boolean f597(net.minecraft.entity.projectile.EntityThrowable receiver, double p0) throws Throwable {
    int forwardValue597_28_0;
    int forwardValue597_32_0;
    int forwardValue597_34_0;
    int[] spill597_0;
    boolean spill597_1;
    long life3_3;
    double life6_10;
    int[] life5_11;
    double life6_25;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    life3_3 = (__fieldRead597_0() ^ 98706880926185L);
    spill597_0 = __call597_1();
    life6_10 = (__call597_3(__call597_2(receiver)) * 0x1.0p2d);
    life5_11 = spill597_0;
    spill597_1 = __call597_4(life6_10);
    if (!((life5_11 != null))) {
        forwardValue597_28_0 = __integerCategory597_5(spill597_1);
        break forward_join_28;
    }
    if (!(spill597_1)) {
        break forward_join_19;
    }
    life6_10 = 0x1.0p2d;
    }
    life6_25 = (life6_10 * 0x1.0p6d);
    forwardValue597_28_0 = __numericCompare597_6(p0, (life6_25 * life6_25));
    }
    if (!((life5_11 != null))) {
        forwardValue597_32_0 = forwardValue597_28_0;
        break forward_join_32;
    }
    if (!((forwardValue597_28_0 < 0))) {
        break forward_join_33;
    }
    forwardValue597_32_0 = 1;
    }
    forwardValue597_34_0 = forwardValue597_32_0;
    break forward_join_34;
    }
    forwardValue597_34_0 = 0;
    }
    return __integerCategory597_7(forwardValue597_34_0);
}
public static boolean h597_0(moom.Oo p0) throws Throwable {
    throw __call2059700_0(p0);
}
public static boolean h597_1(moom.Oo p0) throws Throwable {
    throw __call2059701_0(p0);
}
private static native long __fieldRead597_0() throws Throwable;
private static native int[] __call597_1() throws Throwable;
private static native moom.CA __call597_2(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __call597_3(moom.CA a0) throws Throwable;
private static native boolean __call597_4(double a0) throws Throwable;
private static native int __integerCategory597_5(boolean value) throws Throwable;
private static native int __numericCompare597_6(double a0, double a1) throws Throwable;
private static native boolean __integerCategory597_7(int value) throws Throwable;
private static native java.lang.Throwable __call2059700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.EntityLivingBase __sourceHandlerCall_1596ffb7cb595819a9d3(net.minecraft.entity.projectile.EntityThrowable a0) throws E;
private static final class __SourceHandler_1596ffb7cb595819a9d3 {

public static net.minecraft.entity.EntityLivingBase f254(net.minecraft.entity.projectile.EntityThrowable receiver) throws Throwable {
    net.minecraft.entity.projectile.EntityThrowable forwardValue254_56_0;
    net.minecraft.entity.EntityLivingBase forwardValue254_57_0;
    net.minecraft.entity.EntityLivingBase spill254_0;
    net.minecraft.entity.projectile.EntityThrowable spill254_1;
    net.minecraft.entity.projectile.EntityThrowable spill254_2;
    net.minecraft.entity.EntityLivingBase spill254_3;
    net.minecraft.entity.projectile.EntityThrowable spill254_4;
    long life1_3;
    int[] life3_5;
    net.minecraft.entity.Entity life4_74;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    life1_3 = (__fieldRead254_0() ^ 45505477502495L);
    life3_5 = __call254_1();
    spill254_0 = __fieldRead254_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue254_57_0 = spill254_0;
        break forward_join_57;
    }
    if (!((spill254_0 == null))) {
        break forward_join_55;
    }
    spill254_1 = receiver;
    if (!((life3_5 != null))) {
        forwardValue254_56_0 = spill254_1;
        break forward_join_56;
    }
    if (!((__fieldRead254_3(spill254_1) != null))) {
        break forward_join_55;
    }
    spill254_2 = receiver;
    if (!((life3_5 != null))) {
        forwardValue254_56_0 = spill254_2;
        break forward_join_56;
    }
    if (!((__call254_5(__fieldRead254_4(spill254_2)) > 0))) {
        break forward_join_55;
    }
    __fieldWrite254_9(receiver, __call254_8(__fieldRead254_6(receiver), __fieldRead254_7(receiver)));
    spill254_3 = __fieldRead254_10(receiver);
    if (!((life3_5 != null))) {
        forwardValue254_57_0 = spill254_3;
        break forward_join_57;
    }
    if (!((spill254_3 == null))) {
        break forward_join_55;
    }
    spill254_4 = receiver;
    if (!((life3_5 != null))) {
        forwardValue254_56_0 = spill254_4;
        break forward_join_56;
    }
    if (!((__instanceOf254_12(__fieldRead254_11(spill254_4)) != 0))) {
        break forward_join_55;
    }
    life4_74 = __call254_17(__cast254_14(__fieldRead254_13(receiver)), __call254_16(__fieldRead254_15(receiver)));
    if (!((__instanceOf254_18(life4_74) != 0))) {
        break forward_join_55;
    }
    __fieldWrite254_20(receiver, __cast254_19(life4_74));
    }
    forwardValue254_56_0 = receiver;
    }
    forwardValue254_57_0 = __fieldRead254_21(forwardValue254_56_0);
    }
    return forwardValue254_57_0;
}
public static net.minecraft.entity.EntityLivingBase h254_0(java.lang.Throwable p0) throws Throwable {
    throw __call2025400_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_1(java.lang.Throwable p0) throws Throwable {
    throw __call2025401_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_2(java.lang.Throwable p0) throws Throwable {
    throw __call2025402_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_3(java.lang.Throwable p0) throws Throwable {
    throw __call2025403_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_4(java.lang.Throwable p0) throws Throwable {
    throw __call2025404_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_5(java.lang.Throwable p0) throws Throwable {
    throw __call2025405_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_6(java.lang.Throwable p0) throws Throwable {
    throw __call2025406_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_7(java.lang.Throwable p0) throws Throwable {
    throw __call2025407_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_8(java.lang.Throwable p0) throws Throwable {
    throw __call2025408_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_9(java.lang.Throwable p0) throws Throwable {
    throw __call2025409_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h254_10(java.lang.Throwable p0, net.minecraft.entity.projectile.EntityThrowable p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __fieldWrite2025410_0(p1, null);
    return __fieldRead2025410_1(p1);
}
private static native long __fieldRead254_0() throws Throwable;
private static native int[] __call254_1() throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead254_2(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.String __fieldRead254_3(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.String __fieldRead254_4(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __call254_5(java.lang.String a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead254_6(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.String __fieldRead254_7(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __call254_8(net.minecraft.world.World a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite254_9(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead254_10(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead254_11(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __instanceOf254_12(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead254_13(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast254_14(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.String __fieldRead254_15(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.util.UUID __call254_16(java.lang.String a0) throws Throwable;
private static native net.minecraft.entity.Entity __call254_17(net.minecraft.world.WorldServer a0, java.util.UUID a1) throws Throwable;
private static native int __instanceOf254_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast254_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite254_20(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead254_21(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.Throwable __call2025400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025401_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025402_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025403_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025404_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025405_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025406_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025407_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025408_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025409_0(java.lang.Throwable a0) throws Throwable;
private static native void __fieldWrite2025410_0(net.minecraft.entity.projectile.EntityThrowable a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead2025410_1(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e1b15ad3295460233818(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_e1b15ad3295460233818 {

public static void f1598(net.minecraft.entity.projectile.EntityThrowable receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.entity.projectile.EntityThrowable forwardValue1598_50_0;
    int forwardValue1598_50_1;
    net.minecraft.entity.projectile.EntityThrowable forwardValue1598_72_0;
    int forwardValue1598_72_1;
    net.minecraft.entity.projectile.EntityThrowable forwardValue1598_73_0;
    net.minecraft.entity.projectile.EntityThrowable forwardValue1598_74_0;
    int forwardValue1598_74_1;
    net.minecraft.entity.projectile.EntityThrowable forwardValue1598_98_0;
    int[] spill1598_0;
    net.minecraft.entity.projectile.EntityThrowable spill1598_1;
    short spill1598_2;
    net.minecraft.entity.projectile.EntityThrowable spill1598_3;
    byte spill1598_4;
    net.minecraft.entity.projectile.EntityThrowable spill1598_5;
    net.minecraft.entity.projectile.EntityThrowable spill1598_6;
    long life2_3;
    int[] life4_10;
    forward_join_98: {
    forward_join_97: {
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_52: {
    forward_join_50: {
    forward_join_40: {
    life2_3 = (__fieldRead1598_0() ^ 9761262839236L);
    spill1598_0 = __call1598_1();
    __fieldWrite1598_3(receiver, __call1598_2(p0, "xTile"));
    life4_10 = spill1598_0;
    __fieldWrite1598_5(receiver, __call1598_4(p0, "yTile"));
    spill1598_1 = receiver;
    spill1598_2 = __call1598_6(p0, "zTile");
    if (!((life4_10 != null))) {
        forwardValue1598_50_0 = spill1598_1;
        forwardValue1598_50_1 = __integerCategory1598_7(spill1598_2);
        break forward_join_50;
    }
    __fieldWrite1598_8(spill1598_1, spill1598_2);
    if (!(__call1598_10(p0, "inTile", __invokedynamic1598_9(16719, (8672429565524181162L ^ life2_3))))) {
        break forward_join_40;
    }
    __fieldWrite1598_13(receiver, __call1598_12(__call1598_11(p0, "inTile")));
    if (!((life4_10 == null))) {
        break forward_join_52;
    }
    }
    forwardValue1598_50_0 = receiver;
    forwardValue1598_50_1 = (__call1598_14(p0, "inTile") & __invokedynamic1598_15(3054, (8349286274330610185L ^ life2_3)));
    }
    __fieldWrite1598_17(forwardValue1598_50_0, __call1598_16(forwardValue1598_50_1));
    }
    __fieldWrite1598_20(receiver, (__call1598_18(p0, "shake") & __invokedynamic1598_19(13333, (4492628484539184627L ^ life2_3))));
    spill1598_3 = receiver;
    spill1598_4 = __call1598_21(p0, "inGround");
    if (!((life4_10 != null))) {
        forwardValue1598_72_0 = spill1598_3;
        forwardValue1598_72_1 = __integerCategory1598_22(spill1598_4);
        break forward_join_72;
    }
    if (!((spill1598_4 == 1))) {
        forwardValue1598_73_0 = spill1598_3;
        break forward_join_73;
    }
    forwardValue1598_72_0 = spill1598_3;
    forwardValue1598_72_1 = 1;
    }
    forwardValue1598_74_0 = forwardValue1598_72_0;
    forwardValue1598_74_1 = forwardValue1598_72_1;
    break forward_join_74;
    }
    forwardValue1598_74_0 = forwardValue1598_73_0;
    forwardValue1598_74_1 = 0;
    }
    __fieldWrite1598_23(forwardValue1598_74_0, forwardValue1598_74_1);
    __fieldWrite1598_24(receiver, null);
    __fieldWrite1598_26(receiver, __call1598_25(p0, "ownerName"));
    spill1598_5 = receiver;
    if (!((life4_10 != null))) {
        forwardValue1598_98_0 = spill1598_5;
        break forward_join_98;
    }
    if (!((__fieldRead1598_27(spill1598_5) != null))) {
        break forward_join_97;
    }
    spill1598_6 = receiver;
    if (!((life4_10 != null))) {
        forwardValue1598_98_0 = spill1598_6;
        break forward_join_98;
    }
    if (!((__call1598_29(__fieldRead1598_28(spill1598_6)) == 0))) {
        break forward_join_97;
    }
    __fieldWrite1598_30(receiver, null);
    }
    forwardValue1598_98_0 = receiver;
    }
    __fieldWrite1598_32(forwardValue1598_98_0, __call1598_31(receiver));
    return;
}
public static void h1598_0(moom.Oo p0) throws Throwable {
    throw __call1159800_0(p0);
}
public static void h1598_1(moom.Oo p0) throws Throwable {
    throw __call1159801_0(p0);
}
public static void h1598_2(moom.Oo p0) throws Throwable {
    throw __call1159802_0(p0);
}
public static void h1598_3(moom.Oo p0) throws Throwable {
    throw __call1159803_0(p0);
}
public static void h1598_4(moom.Oo p0) throws Throwable {
    throw __call1159804_0(p0);
}
public static void h1598_5(moom.Oo p0) throws Throwable {
    throw __call1159805_0(p0);
}
public static void h1598_6(moom.Oo p0) throws Throwable {
    throw __call1159806_0(p0);
}
public static void h1598_7(moom.Oo p0) throws Throwable {
    throw __call1159807_0(p0);
}
public static void h1598_8(moom.Oo p0) throws Throwable {
    throw __call1159808_0(p0);
}
private static native long __fieldRead1598_0() throws Throwable;
private static native int[] __call1598_1() throws Throwable;
private static native short __call1598_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1598_3(net.minecraft.entity.projectile.EntityThrowable a0, short a1) throws Throwable;
private static native short __call1598_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1598_5(net.minecraft.entity.projectile.EntityThrowable a0, short a1) throws Throwable;
private static native short __call1598_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1598_7(short value) throws Throwable;
private static native void __fieldWrite1598_8(net.minecraft.entity.projectile.EntityThrowable a0, short a1) throws Throwable;
private static native int __invokedynamic1598_9(int a0, long a1) throws Throwable;
private static native boolean __call1598_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call1598_11(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call1598_12(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1598_13(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.block.Block a1) throws Throwable;
private static native byte __call1598_14(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1598_15(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call1598_16(int a0) throws Throwable;
private static native void __fieldWrite1598_17(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.block.Block a1) throws Throwable;
private static native byte __call1598_18(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1598_19(int a0, long a1) throws Throwable;
private static native void __fieldWrite1598_20(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native byte __call1598_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1598_22(byte value) throws Throwable;
private static native void __fieldWrite1598_23(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native void __fieldWrite1598_24(net.minecraft.entity.projectile.EntityThrowable a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __call1598_25(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1598_26(net.minecraft.entity.projectile.EntityThrowable a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1598_27(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.String __fieldRead1598_28(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __call1598_29(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1598_30(net.minecraft.entity.projectile.EntityThrowable a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __call1598_31(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite1598_32(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native java.lang.Throwable __call1159800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159808_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c386e1e1bf6a003bd81f(net.minecraft.entity.projectile.EntityThrowable a0, double a1, double a2, double a3) throws E;
private static final class __SourceHandler_c386e1e1bf6a003bd81f {

public static void f598(net.minecraft.entity.projectile.EntityThrowable receiver, double p0, double p1, double p2) throws Throwable {
    int forwardValue598_28_0;
    float forwardValue598_37_0;
    int[] spill598_0;
    int spill598_1;
    float spill598_2;
    net.minecraft.entity.projectile.EntityThrowable spill598_3;
    float spill598_4;
    net.minecraft.entity.projectile.EntityThrowable spill598_5;
    float spill598_6;
    long life7_3;
    int[] life9_8;
    float life10_49;
    forward_join_65: {
    forward_join_37: {
    forward_join_28: {
    life7_3 = (__fieldRead598_0() ^ 59233149345910L);
    spill598_0 = __call598_1();
    __fieldWrite598_2(receiver, p0);
    life9_8 = spill598_0;
    __fieldWrite598_3(receiver, p1);
    __fieldWrite598_4(receiver, p2);
    spill598_1 = __numericCompare598_6(__fieldRead598_5(receiver), 0x0.0p0f);
    if (!((life9_8 != null))) {
        forwardValue598_28_0 = spill598_1;
        break forward_join_28;
    }
    if (!((spill598_1 == 0))) {
        break forward_join_65;
    }
    spill598_2 = __fieldRead598_7(receiver);
    if (!((life9_8 != null))) {
        forwardValue598_37_0 = spill598_2;
        break forward_join_37;
    }
    forwardValue598_28_0 = __numericCompare598_8(spill598_2, 0x0.0p0f);
    }
    if (!((forwardValue598_28_0 == 0))) {
        break forward_join_65;
    }
    forwardValue598_37_0 = __call598_9(((p0 * p0) + (p2 * p2)));
    }
    life10_49 = forwardValue598_37_0;
    spill598_3 = receiver;
    net.minecraft.entity.projectile.EntityThrowable __stackOp598_11_0 = receiver;
    float __stackOp598_11_1 = ((float) ((__call598_10(p0, p2) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill598_4 = __stackOp598_11_1;
    __fieldWrite598_12(__stackOp598_11_0, __stackOp598_11_1);
    __fieldWrite598_13(spill598_3, spill598_4);
    spill598_5 = receiver;
    net.minecraft.entity.projectile.EntityThrowable __stackOp598_15_0 = receiver;
    float __stackOp598_15_1 = ((float) ((__call598_14(p1, ((double) life10_49)) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill598_6 = __stackOp598_15_1;
    __fieldWrite598_16(__stackOp598_15_0, __stackOp598_15_1);
    __fieldWrite598_17(spill598_5, spill598_6);
    }
    return;
}
public static void h598_0(moom.Oo p0) throws Throwable {
    throw __call2059800_0(p0);
}
public static void h598_1(moom.Oo p0) throws Throwable {
    throw __call2059801_0(p0);
}
public static void h598_2(moom.Oo p0) throws Throwable {
    throw __call2059802_0(p0);
}
public static void h598_3(moom.Oo p0) throws Throwable {
    throw __call2059803_0(p0);
}
private static native long __fieldRead598_0() throws Throwable;
private static native int[] __call598_1() throws Throwable;
private static native void __fieldWrite598_2(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native void __fieldWrite598_3(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native void __fieldWrite598_4(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native float __fieldRead598_5(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __numericCompare598_6(float a0, float a1) throws Throwable;
private static native float __fieldRead598_7(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __numericCompare598_8(float a0, float a1) throws Throwable;
private static native float __call598_9(double a0) throws Throwable;
private static native double __call598_10(double a0, double a1) throws Throwable;
private static native void __fieldWrite598_12(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native void __fieldWrite598_13(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native double __call598_14(double a0, double a1) throws Throwable;
private static native void __fieldWrite598_16(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native void __fieldWrite598_17(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native java.lang.Throwable __call2059800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059803_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c3767e4c7fe4b313b943(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_c3767e4c7fe4b313b943 {

public static void f1599(net.minecraft.entity.projectile.EntityThrowable receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forwardValue1599_38_0;
    java.lang.String forwardValue1599_38_1;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_39_0;
    java.lang.String forwardValue1599_39_1;
    moom.DD forwardValue1599_39_2;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_40_0;
    java.lang.String forwardValue1599_40_1;
    java.lang.String forwardValue1599_40_2;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_55_0;
    java.lang.String forwardValue1599_55_1;
    int forwardValue1599_55_2;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_56_0;
    java.lang.String forwardValue1599_56_1;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_57_0;
    java.lang.String forwardValue1599_57_1;
    int forwardValue1599_57_2;
    net.minecraft.entity.projectile.EntityThrowable forwardValue1599_71_0;
    int forwardValue1599_75_0;
    net.minecraft.entity.projectile.EntityThrowable forwardValue1599_77_0;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_90_0;
    java.lang.String forwardValue1599_90_1;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_91_0;
    java.lang.String forwardValue1599_91_1;
    net.minecraft.entity.projectile.EntityThrowable forwardValue1599_91_2;
    net.minecraft.nbt.NBTTagCompound forwardValue1599_92_0;
    java.lang.String forwardValue1599_92_1;
    java.lang.String forwardValue1599_92_2;
    int[] spill1599_0;
    net.minecraft.nbt.NBTTagCompound spill1599_1;
    java.lang.String spill1599_2;
    moom.DD spill1599_3;
    net.minecraft.nbt.NBTTagCompound spill1599_4;
    java.lang.String spill1599_5;
    boolean spill1599_6;
    net.minecraft.entity.projectile.EntityThrowable spill1599_7;
    int spill1599_8;
    net.minecraft.nbt.NBTTagCompound spill1599_9;
    java.lang.String spill1599_10;
    net.minecraft.entity.projectile.EntityThrowable spill1599_11;
    long life2_3;
    int[] life4_11;
    moom.DD life5_29;
    forward_join_92: {
    forward_join_91: {
    forward_join_90: {
    forward_join_81: {
    forward_join_77: {
    forward_join_75: {
    forward_join_71: {
    forward_join_70: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    life2_3 = (__fieldRead1599_0() ^ 58842242465487L);
    spill1599_0 = __call1599_1();
    __call1599_3(p0, "xTile", ((short) __fieldRead1599_2(receiver)));
    life4_11 = spill1599_0;
    __call1599_5(p0, "yTile", ((short) __fieldRead1599_4(receiver)));
    __call1599_7(p0, "zTile", ((short) __fieldRead1599_6(receiver)));
    life5_29 = __cast1599_11(__call1599_10(__fieldRead1599_8(), __fieldRead1599_9(receiver)));
    spill1599_1 = p0;
    spill1599_2 = "inTile";
    spill1599_3 = life5_29;
    if (!((life4_11 != null))) {
        forwardValue1599_39_0 = spill1599_1;
        forwardValue1599_39_1 = spill1599_2;
        forwardValue1599_39_2 = spill1599_3;
        break forward_join_39;
    }
    if (!((spill1599_3 == null))) {
        forwardValue1599_38_0 = spill1599_1;
        forwardValue1599_38_1 = spill1599_2;
        break forward_join_38;
    }
    forwardValue1599_40_0 = spill1599_1;
    forwardValue1599_40_1 = spill1599_2;
    forwardValue1599_40_2 = "";
    break forward_join_40;
    }
    forwardValue1599_39_0 = forwardValue1599_38_0;
    forwardValue1599_39_1 = forwardValue1599_38_1;
    forwardValue1599_39_2 = life5_29;
    }
    forwardValue1599_40_0 = forwardValue1599_39_0;
    forwardValue1599_40_1 = forwardValue1599_39_1;
    forwardValue1599_40_2 = __call1599_12(forwardValue1599_39_2);
    }
    __call1599_13(forwardValue1599_40_0, forwardValue1599_40_1, forwardValue1599_40_2);
    __call1599_15(p0, "shake", ((byte) __fieldRead1599_14(receiver)));
    spill1599_4 = p0;
    spill1599_5 = "inGround";
    spill1599_6 = __fieldRead1599_16(receiver);
    if (!((life4_11 != null))) {
        forwardValue1599_55_0 = spill1599_4;
        forwardValue1599_55_1 = spill1599_5;
        forwardValue1599_55_2 = __integerCategory1599_17(spill1599_6);
        break forward_join_55;
    }
    if (!(spill1599_6)) {
        forwardValue1599_56_0 = spill1599_4;
        forwardValue1599_56_1 = spill1599_5;
        break forward_join_56;
    }
    forwardValue1599_55_0 = spill1599_4;
    forwardValue1599_55_1 = spill1599_5;
    forwardValue1599_55_2 = 1;
    }
    forwardValue1599_57_0 = forwardValue1599_55_0;
    forwardValue1599_57_1 = forwardValue1599_55_1;
    forwardValue1599_57_2 = forwardValue1599_55_2;
    break forward_join_57;
    }
    forwardValue1599_57_0 = forwardValue1599_56_0;
    forwardValue1599_57_1 = forwardValue1599_56_1;
    forwardValue1599_57_2 = 0;
    }
    __call1599_18(forwardValue1599_57_0, forwardValue1599_57_1, ((byte) forwardValue1599_57_2));
    spill1599_7 = receiver;
    if (!((life4_11 != null))) {
        forwardValue1599_71_0 = spill1599_7;
        break forward_join_71;
    }
    if (!((__fieldRead1599_19(spill1599_7) != null))) {
        break forward_join_70;
    }
    spill1599_8 = __call1599_21(__fieldRead1599_20(receiver));
    if (!((life4_11 != null))) {
        forwardValue1599_75_0 = spill1599_8;
        break forward_join_75;
    }
    if (!((spill1599_8 == 0))) {
        break forward_join_81;
    }
    }
    forwardValue1599_71_0 = receiver;
    }
    if (!((life4_11 != null))) {
        forwardValue1599_77_0 = forwardValue1599_71_0;
        break forward_join_77;
    }
    forwardValue1599_75_0 = __instanceOf1599_23(__fieldRead1599_22(forwardValue1599_71_0));
    }
    if (!((forwardValue1599_75_0 != 0))) {
        break forward_join_81;
    }
    forwardValue1599_77_0 = receiver;
    }
    __fieldWrite1599_26(forwardValue1599_77_0, __call1599_25(__fieldRead1599_24(receiver)));
    }
    spill1599_9 = p0;
    spill1599_10 = "ownerName";
    spill1599_11 = receiver;
    if (!((life4_11 != null))) {
        forwardValue1599_91_0 = spill1599_9;
        forwardValue1599_91_1 = spill1599_10;
        forwardValue1599_91_2 = spill1599_11;
        break forward_join_91;
    }
    if (!((__fieldRead1599_27(spill1599_11) == null))) {
        forwardValue1599_90_0 = spill1599_9;
        forwardValue1599_90_1 = spill1599_10;
        break forward_join_90;
    }
    forwardValue1599_92_0 = spill1599_9;
    forwardValue1599_92_1 = spill1599_10;
    forwardValue1599_92_2 = "";
    break forward_join_92;
    }
    forwardValue1599_91_0 = forwardValue1599_90_0;
    forwardValue1599_91_1 = forwardValue1599_90_1;
    forwardValue1599_91_2 = receiver;
    }
    forwardValue1599_92_0 = forwardValue1599_91_0;
    forwardValue1599_92_1 = forwardValue1599_91_1;
    forwardValue1599_92_2 = __fieldRead1599_28(forwardValue1599_91_2);
    }
    __call1599_29(forwardValue1599_92_0, forwardValue1599_92_1, forwardValue1599_92_2);
    return;
}
public static void h1599_0(moom.Oo p0) throws Throwable {
    throw __call1159900_0(p0);
}
public static void h1599_1(moom.Oo p0) throws Throwable {
    throw __call1159901_0(p0);
}
public static void h1599_2(moom.Oo p0) throws Throwable {
    throw __call1159902_0(p0);
}
public static void h1599_3(moom.Oo p0) throws Throwable {
    throw __call1159903_0(p0);
}
public static void h1599_4(moom.Oo p0) throws Throwable {
    throw __call1159904_0(p0);
}
public static void h1599_5(moom.Oo p0) throws Throwable {
    throw __call1159905_0(p0);
}
public static void h1599_6(moom.Oo p0) throws Throwable {
    throw __call1159906_0(p0);
}
public static void h1599_7(moom.Oo p0) throws Throwable {
    throw __call1159907_0(p0);
}
public static void h1599_8(moom.Oo p0) throws Throwable {
    throw __call1159908_0(p0);
}
private static native long __fieldRead1599_0() throws Throwable;
private static native int[] __call1599_1() throws Throwable;
private static native int __fieldRead1599_2(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call1599_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, short a2) throws Throwable;
private static native int __fieldRead1599_4(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call1599_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, short a2) throws Throwable;
private static native int __fieldRead1599_6(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call1599_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, short a2) throws Throwable;
private static native moom.DC __fieldRead1599_8() throws Throwable;
private static native net.minecraft.block.Block __fieldRead1599_9(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.Object __call1599_10(moom.DC a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.DD __cast1599_11(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1599_12(moom.DD a0) throws Throwable;
private static native void __call1599_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __fieldRead1599_14(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call1599_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native boolean __fieldRead1599_16(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __integerCategory1599_17(boolean value) throws Throwable;
private static native void __call1599_18(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native java.lang.String __fieldRead1599_19(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.String __fieldRead1599_20(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __call1599_21(java.lang.String a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead1599_22(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __instanceOf1599_23(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead1599_24(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.String __call1599_25(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __fieldWrite1599_26(net.minecraft.entity.projectile.EntityThrowable a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1599_27(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.lang.String __fieldRead1599_28(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call1599_29(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Throwable __call1159900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159908_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_eeb76cdad51c8d19981f(net.minecraft.entity.projectile.EntityThrowable a0) throws E;
private static final class __SourceHandler_eeb76cdad51c8d19981f {

public static void f260(net.minecraft.entity.projectile.EntityThrowable receiver) throws Throwable {
    int lexicalValue260_35_0;
    net.minecraft.entity.projectile.EntityThrowable lexicalValue260_71_0;
    net.minecraft.entity.projectile.EntityThrowable lexicalValue260_113_0;
    net.minecraft.entity.projectile.EntityThrowable lexicalValue260_118_0;
    moom.DR lexicalValue260_203_0;
    net.minecraft.entity.Entity lexicalValue260_251_0;
    double lexicalValue260_296_0;
    net.minecraft.entity.Entity lexicalValue260_300_0;
    net.minecraft.util.MovingObjectPosition lexicalValue260_311_0;
    net.minecraft.entity.projectile.EntityThrowable lexicalValue260_331_0;
    net.minecraft.entity.projectile.EntityThrowable lexicalValue260_576_0;
    int[] spill260_0;
    int spill260_1;
    net.minecraft.entity.projectile.EntityThrowable spill260_2;
    net.minecraft.entity.projectile.EntityThrowable spill260_3;
    net.minecraft.entity.projectile.EntityThrowable spill260_4;
    moom.DR spill260_5;
    net.minecraft.entity.Entity spill260_6;
    double spill260_7;
    double spill260_8;
    net.minecraft.util.MovingObjectPosition spill260_9;
    net.minecraft.entity.projectile.EntityThrowable spill260_10;
    net.minecraft.entity.projectile.EntityThrowable spill260_11;
    long life1_3;
    int[] life3_9;
    moom.DR life4_159;
    moom.DR life5_178;
    net.minecraft.util.MovingObjectPosition life6_184;
    moom.DR life4_194;
    moom.DR life5_215;
    net.minecraft.entity.Entity life7_239;
    java.util.List life8_257;
    double life9_259;
    net.minecraft.entity.EntityLivingBase life11_262;
    java.util.Iterator life12_265;
    net.minecraft.entity.Entity life13_272;
    float life14_300;
    moom.CA life15_310;
    net.minecraft.util.MovingObjectPosition life16_315;
    double life17_322;
    float life7_432;
    float life8_572;
    float life9_575;
    int life10_585;
    float life11_590;
    lexical_join_583: {
    lexical_join_576: {
    lexical_join_547: {
    lexical_join_545: {
    lexical_join_487: {
    lexical_join_463: {
    lexical_join_445: {
    lexical_join_427: {
    lexical_join_409: {
    lexical_join_333: {
    lexical_join_331: {
    lexical_join_330: {
    lexical_join_311: {
    lexical_join_306: {
    lexical_join_300: {
    lexical_join_299: {
    lexical_join_204: {
    lexical_join_203: {
    lexical_join_123: {
    lexical_join_118: {
    lexical_join_117: {
    lexical_join_113: {
    lexical_join_73: {
    lexical_join_72: {
    lexical_join_71: {
    lexical_join_35: {
    lexical_join_31: {
    life1_3 = (__fieldRead260_0() ^ 66056485718704L);
    spill260_0 = __call260_1();
    __fieldWrite260_3(receiver, __fieldRead260_2(receiver));
    life3_9 = spill260_0;
    __fieldWrite260_5(receiver, __fieldRead260_4(receiver));
    __fieldWrite260_7(receiver, __fieldRead260_6(receiver));
    __call260_8(receiver);
    spill260_1 = __fieldRead260_9(receiver);
    if (!((life3_9 != null))) {
        lexicalValue260_35_0 = spill260_1;
        break lexical_join_35;
    }
    if (!((spill260_1 > 0))) {
        break lexical_join_31;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_10_0 = receiver;
    __fieldWrite260_12(__stackOp260_10_0, (__fieldRead260_11(__stackOp260_10_0) - 1));
    }
    spill260_2 = receiver;
    if (!((life3_9 != null))) {
        lexicalValue260_118_0 = spill260_2;
        break lexical_join_118;
    }
    lexicalValue260_35_0 = __integerCategory260_14(__fieldRead260_13(spill260_2));
    }
    if (!((lexicalValue260_35_0 != 0))) {
        break lexical_join_117;
    }
    spill260_3 = receiver;
    if (!((life3_9 != null))) {
        lexicalValue260_113_0 = spill260_3;
        break lexical_join_113;
    }
    if (!((__call260_20(__call260_19(__fieldRead260_15(spill260_3), new moom.DT(__fieldRead260_16(receiver), __fieldRead260_17(receiver), __fieldRead260_18(receiver)))) == __fieldRead260_21(receiver)))) {
        break lexical_join_73;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_22_0 = receiver;
    __fieldWrite260_24(__stackOp260_22_0, (__fieldRead260_23(__stackOp260_22_0) + 1));
    spill260_4 = receiver;
    if (!((life3_9 != null))) {
        lexicalValue260_71_0 = spill260_4;
        break lexical_join_71;
    }
    if (!((__fieldRead260_25(spill260_4) == __invokedynamic260_26(634, (2108964326411054314L ^ life1_3))))) {
        break lexical_join_72;
    }
    lexicalValue260_71_0 = receiver;
    }
    __call260_27(lexicalValue260_71_0);
    }
    return;
    }
    __fieldWrite260_28(receiver, 0);
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_29_0 = receiver;
    __fieldWrite260_33(__stackOp260_29_0, (__fieldRead260_30(__stackOp260_29_0) * ((double) (__call260_32(__fieldRead260_31(receiver)) * 0x1.99999ap-3f))));
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_34_0 = receiver;
    __fieldWrite260_38(__stackOp260_34_0, (__fieldRead260_35(__stackOp260_34_0) * ((double) (__call260_37(__fieldRead260_36(receiver)) * 0x1.99999ap-3f))));
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_39_0 = receiver;
    __fieldWrite260_43(__stackOp260_39_0, (__fieldRead260_40(__stackOp260_39_0) * ((double) (__call260_42(__fieldRead260_41(receiver)) * 0x1.99999ap-3f))));
    __fieldWrite260_44(receiver, 0);
    lexicalValue260_113_0 = receiver;
    }
    __fieldWrite260_45(lexicalValue260_113_0, 0);
    if (!((life3_9 == null))) {
        break lexical_join_123;
    }
    }
    lexicalValue260_118_0 = receiver;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_46_0 = lexicalValue260_118_0;
    __fieldWrite260_48(__stackOp260_46_0, (__fieldRead260_47(__stackOp260_46_0) + 1));
    }
    life4_159 = new moom.DR(__fieldRead260_49(receiver), __fieldRead260_50(receiver), __fieldRead260_51(receiver));
    life5_178 = new moom.DR((__fieldRead260_52(receiver) + __fieldRead260_53(receiver)), (__fieldRead260_54(receiver) + __fieldRead260_55(receiver)), (__fieldRead260_56(receiver) + __fieldRead260_57(receiver)));
    life6_184 = __call260_59(__fieldRead260_58(receiver), life4_159, life5_178);
    life4_194 = new moom.DR(__fieldRead260_60(receiver), __fieldRead260_61(receiver), __fieldRead260_62(receiver));
    spill260_5 = new moom.DR((__fieldRead260_63(receiver) + __fieldRead260_64(receiver)), (__fieldRead260_65(receiver) + __fieldRead260_66(receiver)), (__fieldRead260_67(receiver) + __fieldRead260_68(receiver)));
    if (!((life3_9 != null))) {
        lexicalValue260_203_0 = spill260_5;
        break lexical_join_203;
    }
    life5_215 = spill260_5;
    if (!((life6_184 != null))) {
        break lexical_join_204;
    }
    lexicalValue260_203_0 = new moom.DR(__fieldRead260_70(__fieldRead260_69(life6_184)), __fieldRead260_72(__fieldRead260_71(life6_184)), __fieldRead260_74(__fieldRead260_73(life6_184)));
    }
    life5_215 = lexicalValue260_203_0;
    }
    if (!((!__fieldRead260_76(__fieldRead260_75(receiver))))) {
        break lexical_join_306;
    }
    life7_239 = null;
    life8_257 = __call260_84(__fieldRead260_77(receiver), receiver, __call260_83(__call260_82(__call260_78(receiver), __fieldRead260_79(receiver), __fieldRead260_80(receiver), __fieldRead260_81(receiver)), 0x1.0p0d, 0x1.0p0d, 0x1.0p0d));
    life9_259 = 0x0.0p0d;
    life11_262 = __call260_85(receiver);
    life12_265 = __call260_86(life8_257);
    lexical_cycle_236: while (true) {
    lexical_join_297: {
    lexical_join_296: {
    lexical_join_293: {
    lexical_join_257: {
    lexical_join_251: {
    if (!(__call260_87(life12_265))) {
        break lexical_join_299;
    }
    life13_272 = __cast260_89(__call260_88(life12_265));
    spill260_6 = life13_272;
    if (!((life3_9 != null))) {
        lexicalValue260_300_0 = spill260_6;
        break lexical_join_300;
    }
    if (!((life3_9 != null))) {
        lexicalValue260_251_0 = spill260_6;
        break lexical_join_251;
    }
    if (!(__call260_90(spill260_6))) {
        break lexical_join_297;
    }
    lexicalValue260_251_0 = life13_272;
    }
    if (!((lexicalValue260_251_0 == life11_262))) {
        break lexical_join_257;
    }
    if (!((__fieldRead260_91(receiver) >= 5))) {
        break lexical_join_297;
    }
    }
    life14_300 = 0x1.333334p-2f;
    life15_310 = __call260_93(__call260_92(life13_272), ((double) life14_300), ((double) life14_300), ((double) life14_300));
    life16_315 = __call260_94(life15_310, life4_194, life5_215);
    if (!((life16_315 != null))) {
        break lexical_join_297;
    }
    life17_322 = __call260_96(life4_194, __fieldRead260_95(life16_315));
    spill260_7 = life17_322;
    if (!((life3_9 != null))) {
        lexicalValue260_296_0 = spill260_7;
        break lexical_join_296;
    }
    if (!((__numericCompare260_97(spill260_7, life9_259) >= 0))) {
        break lexical_join_293;
    }
    spill260_8 = life9_259;
    if (!((life3_9 != null))) {
        lexicalValue260_296_0 = spill260_8;
        break lexical_join_296;
    }
    if (!((__numericCompare260_98(spill260_8, 0x0.0p0d) == 0))) {
        break lexical_join_297;
    }
    }
    life7_239 = life13_272;
    lexicalValue260_296_0 = life17_322;
    }
    life9_259 = lexicalValue260_296_0;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_236; }
    break lexical_cycle_236;
    }
    }
    lexicalValue260_300_0 = life7_239;
    }
    if (!((lexicalValue260_300_0 != null))) {
        break lexical_join_306;
    }
    life6_184 = new net.minecraft.util.MovingObjectPosition(life7_239);
    }
    spill260_9 = life6_184;
    if (!((life3_9 != null))) {
        lexicalValue260_311_0 = spill260_9;
        break lexical_join_311;
    }
    if (!((spill260_9 != null))) {
        break lexical_join_333;
    }
    lexicalValue260_311_0 = life6_184;
    }
    if (!((__fieldRead260_99(lexicalValue260_311_0) == __fieldRead260_100()))) {
        break lexical_join_330;
    }
    spill260_10 = receiver;
    if (!((life3_9 != null))) {
        lexicalValue260_331_0 = spill260_10;
        break lexical_join_331;
    }
    if (!((__call260_104(__call260_103(__fieldRead260_101(spill260_10), __call260_102(life6_184))) == __fieldRead260_105()))) {
        break lexical_join_330;
    }
    __call260_107(receiver, __call260_106(life6_184));
    if (!((life3_9 == null))) {
        break lexical_join_333;
    }
    }
    lexicalValue260_331_0 = receiver;
    }
    __call260_108(lexicalValue260_331_0, life6_184);
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_109_0 = receiver;
    __fieldWrite260_112(__stackOp260_109_0, (__fieldRead260_110(__stackOp260_109_0) + __fieldRead260_111(receiver)));
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_113_0 = receiver;
    __fieldWrite260_116(__stackOp260_113_0, (__fieldRead260_114(__stackOp260_113_0) + __fieldRead260_115(receiver)));
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_117_0 = receiver;
    __fieldWrite260_120(__stackOp260_117_0, (__fieldRead260_118(__stackOp260_117_0) + __fieldRead260_119(receiver)));
    life7_432 = __call260_125(((__fieldRead260_121(receiver) * __fieldRead260_122(receiver)) + (__fieldRead260_123(receiver) * __fieldRead260_124(receiver))));
    __fieldWrite260_129(receiver, ((float) ((__call260_128(__fieldRead260_126(receiver), __fieldRead260_127(receiver)) * 0x1.68p7d) / 0x1.921fb54442d18p1d)));
    __fieldWrite260_132(receiver, ((float) ((__call260_131(__fieldRead260_130(receiver), ((double) life7_432)) * 0x1.68p7d) / 0x1.921fb54442d18p1d)));
    lexical_cycle_391: while (true) {
    if (!((__numericCompare260_135((__fieldRead260_133(receiver) - __fieldRead260_134(receiver)), -0x1.68p7f) < 0))) {
        break lexical_join_409;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_136_0 = receiver;
    __fieldWrite260_138(__stackOp260_136_0, (__fieldRead260_137(__stackOp260_136_0) - 0x1.68p8f));
    if (!((life3_9 != null))) {
        break lexical_join_427;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_391; }
    break lexical_cycle_391;
    }
    }
    lexical_cycle_409: while (true) {
    if (!((__numericCompare260_141((__fieldRead260_139(receiver) - __fieldRead260_140(receiver)), 0x1.68p7f) >= 0))) {
        break lexical_join_427;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_142_0 = receiver;
    __fieldWrite260_144(__stackOp260_142_0, (__fieldRead260_143(__stackOp260_142_0) + 0x1.68p8f));
    if (!((life3_9 != null))) {
        break lexical_join_445;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_409; }
    break lexical_cycle_409;
    }
    }
    lexical_cycle_427: while (true) {
    if (!((__numericCompare260_147((__fieldRead260_145(receiver) - __fieldRead260_146(receiver)), -0x1.68p7f) < 0))) {
        break lexical_join_445;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_148_0 = receiver;
    __fieldWrite260_150(__stackOp260_148_0, (__fieldRead260_149(__stackOp260_148_0) - 0x1.68p8f));
    if (!((life3_9 != null))) {
        break lexical_join_487;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_427; }
    break lexical_cycle_427;
    }
    }
    lexical_cycle_445: while (true) {
    if (!((__numericCompare260_153((__fieldRead260_151(receiver) - __fieldRead260_152(receiver)), 0x1.68p7f) >= 0))) {
        break lexical_join_463;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_154_0 = receiver;
    __fieldWrite260_156(__stackOp260_154_0, (__fieldRead260_155(__stackOp260_154_0) + 0x1.68p8f));
    if (!((life3_9 != null))) {
        break lexical_join_487;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_445; }
    break lexical_cycle_445;
    }
    }
    __fieldWrite260_160(receiver, (__fieldRead260_157(receiver) + ((__fieldRead260_158(receiver) - __fieldRead260_159(receiver)) * 0x1.99999ap-3f)));
    __fieldWrite260_164(receiver, (__fieldRead260_161(receiver) + ((__fieldRead260_162(receiver) - __fieldRead260_163(receiver)) * 0x1.99999ap-3f)));
    }
    life8_572 = 0x1.fae148p-1f;
    life9_575 = __call260_165(receiver);
    spill260_11 = receiver;
    if (!((life3_9 != null))) {
        lexicalValue260_576_0 = spill260_11;
        break lexical_join_576;
    }
    if (!(__call260_166(spill260_11))) {
        break lexical_join_547;
    }
    life10_585 = 0;
    lexical_cycle_499: while (true) {
    if (!((life10_585 < 4))) {
        break lexical_join_545;
    }
    life11_590 = 0x1.0p-2f;
    __call260_178(__fieldRead260_167(receiver), __fieldRead260_168(), (__fieldRead260_169(receiver) - (__fieldRead260_170(receiver) * ((double) life11_590))), (__fieldRead260_171(receiver) - (__fieldRead260_172(receiver) * ((double) life11_590))), (__fieldRead260_173(receiver) - (__fieldRead260_174(receiver) * ((double) life11_590))), __fieldRead260_175(receiver), __fieldRead260_176(receiver), __fieldRead260_177(receiver), new int[0]);
    life10_585 += 1;
    if (!((life3_9 != null))) {
        break lexical_join_583;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_499; }
    break lexical_cycle_499;
    }
    }
    life8_572 = 0x1.99999ap-1f;
    }
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_179_0 = receiver;
    __fieldWrite260_181(__stackOp260_179_0, (__fieldRead260_180(__stackOp260_179_0) * ((double) life8_572)));
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_182_0 = receiver;
    __fieldWrite260_184(__stackOp260_182_0, (__fieldRead260_183(__stackOp260_182_0) * ((double) life8_572)));
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_185_0 = receiver;
    __fieldWrite260_187(__stackOp260_185_0, (__fieldRead260_186(__stackOp260_185_0) * ((double) life8_572)));
    net.minecraft.entity.projectile.EntityThrowable __stackOp260_188_0 = receiver;
    __fieldWrite260_190(__stackOp260_188_0, (__fieldRead260_189(__stackOp260_188_0) - ((double) life9_575)));
    lexicalValue260_576_0 = receiver;
    }
    __call260_194(lexicalValue260_576_0, __fieldRead260_191(receiver), __fieldRead260_192(receiver), __fieldRead260_193(receiver));
    }
    return;
}
public static void h260_0(moom.Oo p0) throws Throwable {
    throw __call1026000_0(p0);
}
public static void h260_1(moom.Oo p0) throws Throwable {
    throw __call1026001_0(p0);
}
public static void h260_2(moom.Oo p0) throws Throwable {
    throw __call1026002_0(p0);
}
public static void h260_3(moom.Oo p0) throws Throwable {
    throw __call1026003_0(p0);
}
public static void h260_4(moom.Oo p0) throws Throwable {
    throw __call1026004_0(p0);
}
public static void h260_5(moom.Oo p0) throws Throwable {
    throw __call1026005_0(p0);
}
public static void h260_6(moom.Oo p0) throws Throwable {
    throw __call1026006_0(p0);
}
public static void h260_7(moom.Oo p0) throws Throwable {
    throw __call1026007_0(p0);
}
public static void h260_8(moom.Oo p0) throws Throwable {
    throw __call1026008_0(p0);
}
public static void h260_9(moom.Oo p0) throws Throwable {
    throw __call1026009_0(p0);
}
public static void h260_10(moom.Oo p0) throws Throwable {
    throw __call1026010_0(p0);
}
public static void h260_11(moom.Oo p0) throws Throwable {
    throw __call1026011_0(p0);
}
public static void h260_12(moom.Oo p0) throws Throwable {
    throw __call1026012_0(p0);
}
public static void h260_13(moom.Oo p0) throws Throwable {
    throw __call1026013_0(p0);
}
public static void h260_14(moom.Oo p0) throws Throwable {
    throw __call1026014_0(p0);
}
public static void h260_15(moom.Oo p0) throws Throwable {
    throw __call1026015_0(p0);
}
public static void h260_16(moom.Oo p0) throws Throwable {
    throw __call1026016_0(p0);
}
public static void h260_17(moom.Oo p0) throws Throwable {
    throw __call1026017_0(p0);
}
public static void h260_18(moom.Oo p0) throws Throwable {
    throw __call1026018_0(p0);
}
public static void h260_19(moom.Oo p0) throws Throwable {
    throw __call1026019_0(p0);
}
public static void h260_20(moom.Oo p0) throws Throwable {
    throw __call1026020_0(p0);
}
public static void h260_21(moom.Oo p0) throws Throwable {
    throw __call1026021_0(p0);
}
public static void h260_22(moom.Oo p0) throws Throwable {
    throw __call1026022_0(p0);
}
public static void h260_23(moom.Oo p0) throws Throwable {
    throw __call1026023_0(p0);
}
public static void h260_24(moom.Oo p0) throws Throwable {
    throw __call1026024_0(p0);
}
public static void h260_25(moom.Oo p0) throws Throwable {
    throw __call1026025_0(p0);
}
public static void h260_26(moom.Oo p0) throws Throwable {
    throw __call1026026_0(p0);
}
public static void h260_27(moom.Oo p0) throws Throwable {
    throw __call1026027_0(p0);
}
public static void h260_28(moom.Oo p0) throws Throwable {
    throw __call1026028_0(p0);
}
public static void h260_29(moom.Oo p0) throws Throwable {
    throw __call1026029_0(p0);
}
private static native long __fieldRead260_0() throws Throwable;
private static native int[] __call260_1() throws Throwable;
private static native double __fieldRead260_2(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_3(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_4(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_5(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_6(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_7(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native void __call260_8(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __fieldRead260_9(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __fieldRead260_11(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_12(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native boolean __fieldRead260_13(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __integerCategory260_14(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead260_15(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __fieldRead260_16(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __fieldRead260_17(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __fieldRead260_18(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call260_19(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call260_20(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead260_21(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __fieldRead260_23(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_24(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native int __fieldRead260_25(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __invokedynamic260_26(int a0, long a1) throws Throwable;
private static native void __call260_27(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_28(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native double __fieldRead260_30(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.util.Random __fieldRead260_31(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call260_32(java.util.Random a0) throws Throwable;
private static native void __fieldWrite260_33(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_35(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.util.Random __fieldRead260_36(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call260_37(java.util.Random a0) throws Throwable;
private static native void __fieldWrite260_38(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_40(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.util.Random __fieldRead260_41(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call260_42(java.util.Random a0) throws Throwable;
private static native void __fieldWrite260_43(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native void __fieldWrite260_44(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native void __fieldWrite260_45(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native int __fieldRead260_47(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_48(net.minecraft.entity.projectile.EntityThrowable a0, int a1) throws Throwable;
private static native double __fieldRead260_49(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_50(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_51(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_52(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_53(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_54(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_55(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_56(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_57(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead260_58(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call260_59(net.minecraft.world.World a0, moom.DR a1, moom.DR a2) throws Throwable;
private static native double __fieldRead260_60(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_61(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_62(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_63(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_64(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_65(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_66(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_67(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_68(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native moom.DR __fieldRead260_69(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native double __fieldRead260_70(moom.DR a0) throws Throwable;
private static native moom.DR __fieldRead260_71(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native double __fieldRead260_72(moom.DR a0) throws Throwable;
private static native moom.DR __fieldRead260_73(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native double __fieldRead260_74(moom.DR a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead260_75(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native boolean __fieldRead260_76(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead260_77(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native moom.CA __call260_78(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_79(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_80(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_81(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native moom.CA __call260_82(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.CA __call260_83(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call260_84(net.minecraft.world.World a0, net.minecraft.entity.projectile.EntityThrowable a1, moom.CA a2) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __call260_85(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native java.util.Iterator __call260_86(java.util.List a0) throws Throwable;
private static native boolean __call260_87(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call260_88(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast260_89(java.lang.Object a0) throws Throwable;
private static native boolean __call260_90(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead260_91(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native moom.CA __call260_92(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call260_93(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call260_94(moom.CA a0, moom.DR a1, moom.DR a2) throws Throwable;
private static native moom.DR __fieldRead260_95(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native double __call260_96(moom.DR a0, moom.DR a1) throws Throwable;
private static native int __numericCompare260_97(double a0, double a1) throws Throwable;
private static native int __numericCompare260_98(double a0, double a1) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead260_99(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead260_100() throws Throwable;
private static native net.minecraft.world.World __fieldRead260_101(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native moom.DT __call260_102(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call260_103(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call260_104(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.cr __fieldRead260_105() throws Throwable;
private static native moom.DT __call260_106(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native void __call260_107(net.minecraft.entity.projectile.EntityThrowable a0, moom.DT a1) throws Throwable;
private static native void __call260_108(net.minecraft.entity.projectile.EntityThrowable a0, net.minecraft.util.MovingObjectPosition a1) throws Throwable;
private static native double __fieldRead260_110(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_111(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_112(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_114(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_115(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_116(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_118(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_119(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_120(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_121(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_122(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_123(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_124(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __call260_125(double a0) throws Throwable;
private static native double __fieldRead260_126(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_127(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __call260_128(double a0, double a1) throws Throwable;
private static native void __fieldWrite260_129(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native double __fieldRead260_130(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __call260_131(double a0, double a1) throws Throwable;
private static native void __fieldWrite260_132(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native float __fieldRead260_133(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_134(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __numericCompare260_135(float a0, float a1) throws Throwable;
private static native float __fieldRead260_137(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_138(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native float __fieldRead260_139(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_140(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __numericCompare260_141(float a0, float a1) throws Throwable;
private static native float __fieldRead260_143(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_144(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native float __fieldRead260_145(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_146(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __numericCompare260_147(float a0, float a1) throws Throwable;
private static native float __fieldRead260_149(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_150(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native float __fieldRead260_151(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_152(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native int __numericCompare260_153(float a0, float a1) throws Throwable;
private static native float __fieldRead260_155(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_156(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native float __fieldRead260_157(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_158(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_159(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_160(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native float __fieldRead260_161(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_162(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native float __fieldRead260_163(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_164(net.minecraft.entity.projectile.EntityThrowable a0, float a1) throws Throwable;
private static native float __call260_165(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native boolean __call260_166(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead260_167(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead260_168() throws Throwable;
private static native double __fieldRead260_169(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_170(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_171(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_172(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_173(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_174(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_175(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_176(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_177(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call260_178(net.minecraft.world.World a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native double __fieldRead260_180(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_181(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_183(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_184(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_186(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_187(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_189(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __fieldWrite260_190(net.minecraft.entity.projectile.EntityThrowable a0, double a1) throws Throwable;
private static native double __fieldRead260_191(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_192(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native double __fieldRead260_193(net.minecraft.entity.projectile.EntityThrowable a0) throws Throwable;
private static native void __call260_194(net.minecraft.entity.projectile.EntityThrowable a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1026000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026022_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026023_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026024_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026025_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026026_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026027_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026028_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1026029_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11880_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16250;
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
            throw new RuntimeException("moom/tS", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.projectile.EntityThrowable.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected float b__sourceReturn_bc607678b6() {
return 0x0.0p0f;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_e1b15ad3295460233818(this, p0); }


protected float f__sourceReturn_bc607678b6() {
return 0x1.eb851ep-6f;
}


public void d(double p0, double p1, double p2) { __sourceHandlerCall_c386e1e1bf6a003bd81f(this, p0, p1, p2); }


public void d(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_c3767e4c7fe4b313b943(this, p0); }


protected void d__Void() {
return;
}


public void a(double p0, double p1, double p2, float p3, float p4) {
float local9_life1 = moom.Dr.a__Float(((double)((((p0 * p0) + (p1 * p1)) + (p2 * p2)))));
    p0 = (p0 / ((double) local9_life1));
    p1 = (p1 / ((double) local9_life1));
    p2 = (p2 / ((double) local9_life1));
    p0 = (p0 + ((((java.util.Random)(this.ah)).nextGaussian() * 0x1.eb851e0000000p-8D) * ((double) p4)));
    p1 = (p1 + ((((java.util.Random)(this.ah)).nextGaussian() * 0x1.eb851e0000000p-8D) * ((double) p4)));
    p2 = (p2 + ((((java.util.Random)(this.ah)).nextGaussian() * 0x1.eb851e0000000p-8D) * ((double) p4)));
    p0 = (p0 * ((double) p3));
    p1 = (p1 * ((double) p3));
    p2 = (p2 * ((double) p3));
    this.t = ((double)(p0));
    this.u = ((double)(p1));
    this.v = ((double)(p2));
    float local10_life15 = moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2)))));
    net.minecraft.entity.projectile.EntityThrowable __sourceSpill853_19 = this;
    net.minecraft.entity.projectile.EntityThrowable __stackOp853_20_0 = this;
    float __stackOp853_20_1 = ((float) ((moom.Dr.b(((double)(p0)), ((double)(p2))) * 0x1.6800000000000p+7D) / 0x1.921fb54442d18p+1D));
    float __sourceSpill853_22 = __stackOp853_20_1;
    ((net.minecraft.entity.projectile.EntityThrowable)(__stackOp853_20_0)).w = ((float)(__stackOp853_20_1));
    ((net.minecraft.entity.projectile.EntityThrowable)(__sourceSpill853_19)).y = ((float)(__sourceSpill853_22));
    net.minecraft.entity.projectile.EntityThrowable __sourceSpill853_27 = this;
    net.minecraft.entity.projectile.EntityThrowable __stackOp853_28_0 = this;
    float __stackOp853_28_1 = ((float) ((moom.Dr.b(((double)(p1)), ((double)(((double) local10_life15)))) * 0x1.6800000000000p+7D) / 0x1.921fb54442d18p+1D));
    float __sourceSpill853_30 = __stackOp853_28_1;
    ((net.minecraft.entity.projectile.EntityThrowable)(__stackOp853_28_0)).x = ((float)(__stackOp853_28_1));
    ((net.minecraft.entity.projectile.EntityThrowable)(__sourceSpill853_27)).z = ((float)(__sourceSpill853_30));
    this.aM = ((int)(0));
    return;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public boolean a(double p0) { return __sourceHandlerCall_64dc877adc4ed195b7d4(this, p0); }


protected float a() {
return 0x1.8p0f;
}


protected abstract void a(net.minecraft.util.MovingObjectPosition p0);

public net.minecraft.entity.EntityLivingBase a__sG() { return __sourceHandlerCall_1596ffb7cb595819a9d3(this); }


public void g__Void() { __sourceHandlerCall_eeb76cdad51c8d19981f(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11880_0() throws E;
}
