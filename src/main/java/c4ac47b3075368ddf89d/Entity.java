package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class Entity implements net.minecraft.command.ICommandSender {

private static moom.CA a;

private static int b;

private moom.qN c;

public double d;

public boolean e;

public net.minecraft.entity.Entity f;

public net.minecraft.entity.Entity g;

public boolean h;

public net.minecraft.world.World i;

public double j;

public double k;

public double l;

public double m;

public double n;

public double o;

public double p;

public double q;

public double r;

public double s;

public double t;

public double u;

public double v;

public float w;

public float x;

public float y;

public float z;

public boolean A;

public boolean B;

public boolean C;

public boolean D;

public boolean E;

public boolean F;

public float G;

public float H;

public float I;

public float J;

public float K;

public float L;

public double M;

public double N;

public double O;

public float P;

public boolean Q;

public float R;

public int S;

public int T;

public int U;

public boolean V;

public int W;

public int X;

public int Y;

public int Z;

public int aa;

public int ab;

public boolean ac;

public boolean ad;

public int ae;

public int af;

protected boolean ag;

protected java.util.Random ah;

protected boolean ai;

protected boolean aj;

protected boolean ak;

protected net.minecraft.entity.DataWatcher al;

protected boolean am;

protected int an;

protected moom.DT ao;

protected moom.DR ap;

protected moom.bs aq;

protected java.util.UUID ar;

private int as;

private moom.CA at;

private boolean au;

private int av;

private int aw;

private double ax;

private double ay;

private boolean az;

private org.lwjgl.util.vector.Vector4f aA;

protected static com.moon.module.impl.Camera aB;

public boolean aC;

private static java.lang.String[] aD;

private static long fb;

private static long[] lb;

private static java.lang.Integer[] mb;

private static java.util.Map nb;

public Entity(net.minecraft.world.World p0) { super(); __sourceHandlerCall_6d1dc538ff4eecce3330(this, p0); }


static {
fb = ((long)(((moom._a)(moom._c.a(((long)(-4528408409280893439L)), ((long)(-1707566498805378628L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(150407299315885L)))));
    nb = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill1187_7 = null;
    long local0_life8 = (net.minecraft.entity.Entity.fb ^ 130388752759958L);
    net.minecraft.entity.Entity.b(((java.lang.String[])(__sourceSpill1187_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1187_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1187_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1187_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1187_16 = new byte[8];
    (__sourceSpill1187_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1187_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1187_18 = __sourceSpill1187_16;
    ((javax.crypto.Cipher)(__sourceSpill1187_13)).init(((int)(__sourceSpill1187_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1187_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1187_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[12];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "®=çÛÇtj%Î(¡\\Ø¨e\034/ìûaA.¾«\027\001Ýõ\034¸(Rd¼Ô6ÖNØF·\021D¸fªÑ\\93£6·%î¼:g$N\023'µ\004\034\013R=äaQúã"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1187_27 = local6_life23;
        int __sourceSpill1187_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1187_27)).substring(((int)(__sourceSpill1187_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1187_32 = local8_life21;
        int __sourceSpill1187_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1187_35 = new byte[8];
        (__sourceSpill1187_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1187_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1187_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1187_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1187_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1187_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1187_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1187_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1187_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1187_36)).doFinal(((byte[])(__sourceSpill1187_35)));
        (__sourceSpill1187_32)[__sourceSpill1187_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "\026Ýn|Î+5§³dEê®kè"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1187_40 = local6_life23;
        int __sourceSpill1187_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1187_40)).substring(((int)(__sourceSpill1187_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1187_45 = local8_life21;
        int __sourceSpill1187_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1187_48 = new byte[8];
        (__sourceSpill1187_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1187_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1187_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1187_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1187_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1187_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1187_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1187_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1187_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1187_49)).doFinal(((byte[])(__sourceSpill1187_48)));
        (__sourceSpill1187_45)[__sourceSpill1187_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    lb = ((long[])(local8_life21));
    mb = ((java.lang.Integer[])(new java.lang.Integer[12]));
    a = ((moom.CA)(new moom.CA(0x0.0p0d, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d)));
}

private static native <E extends Throwable> void __sourceHandlerCall_6d1dc538ff4eecce3330(net.minecraft.entity.Entity a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_6d1dc538ff4eecce3330 {

public static void f558(net.minecraft.entity.Entity receiver, net.minecraft.world.World p0) throws Throwable {
    net.minecraft.entity.Entity spill558_0;
    int spill558_1;
    int spill558_2;
    long life2_3;
    int life4_20;
    life2_3 = (__fieldRead558_0() ^ 17215816572249L);
    __directSuperInit558_1(receiver);
    spill558_0 = receiver;
    int __stackOp558_3_0 = __fieldRead558_2();
    spill558_1 = __stackOp558_3_0;
    __fieldWrite558_4((__stackOp558_3_0 + 1));
    __fieldWrite558_5(spill558_0, spill558_1);
    __fieldWrite558_6(receiver, 0x1.0p0d);
    spill558_2 = __call558_7();
    __fieldWrite558_9(receiver, __fieldRead558_8());
    life4_20 = spill558_2;
    __fieldWrite558_10(receiver, 0x1.333334p-1f);
    __fieldWrite558_11(receiver, 0x1.ccccccp0f);
    __fieldWrite558_12(receiver, 1);
    __fieldWrite558_13(receiver, new java.util.Random());
    __fieldWrite558_14(receiver, 1);
    __fieldWrite558_15(receiver, 1);
    __fieldWrite558_18(receiver, __call558_17(__fieldRead558_16(receiver)));
    __fieldWrite558_19(receiver, new moom.qN());
    __fieldWrite558_20(receiver, p0);
    __call558_21(receiver, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    if ((life4_20 == 0)) {
        if ((p0 != null)) {
        __fieldWrite558_24(receiver, __call558_23(__fieldRead558_22(p0)));
    } else {
        
    }
        __fieldWrite558_25(receiver, new net.minecraft.entity.DataWatcher(receiver));
        __call558_28(__fieldRead558_26(receiver), 0, __call558_27(0));
        __call558_32(__fieldRead558_29(receiver), 1, __call558_31(__invokedynamic558_30(4821, (2055628907611635393L ^ life2_3))));
        __call558_35(__fieldRead558_33(receiver), 3, __call558_34(0));
        __call558_37(__fieldRead558_36(receiver), 2, "");
        __call558_40(__fieldRead558_38(receiver), 4, __call558_39(0));
        __call558_41(receiver);
    } else {
        
    }
    return;
}
public static void h558_0(moom.Oo p0) throws Throwable {
    throw __call3055800_0(p0);
}
public static void h558_1(moom.Oo p0) throws Throwable {
    throw __call3055801_0(p0);
}
private static native long __fieldRead558_0() throws Throwable;
private static native void __directSuperInit558_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead558_2() throws Throwable;
private static native void __fieldWrite558_4(int a0) throws Throwable;
private static native void __fieldWrite558_5(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite558_6(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native int __call558_7() throws Throwable;
private static native moom.CA __fieldRead558_8() throws Throwable;
private static native void __fieldWrite558_9(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native void __fieldWrite558_10(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite558_11(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite558_12(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite558_13(net.minecraft.entity.Entity a0, java.util.Random a1) throws Throwable;
private static native void __fieldWrite558_14(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite558_15(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead558_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.UUID __call558_17(java.util.Random a0) throws Throwable;
private static native void __fieldWrite558_18(net.minecraft.entity.Entity a0, java.util.UUID a1) throws Throwable;
private static native void __fieldWrite558_19(net.minecraft.entity.Entity a0, moom.qN a1) throws Throwable;
private static native void __fieldWrite558_20(net.minecraft.entity.Entity a0, net.minecraft.world.World a1) throws Throwable;
private static native void __call558_21(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native moom.EA __fieldRead558_22(net.minecraft.world.World a0) throws Throwable;
private static native int __call558_23(moom.EA a0) throws Throwable;
private static native void __fieldWrite558_24(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite558_25(net.minecraft.entity.Entity a0, net.minecraft.entity.DataWatcher a1) throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead558_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Byte __call558_27(int a0) throws Throwable;
private static native void __call558_28(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Byte a2) throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead558_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic558_30(int a0, long a1) throws Throwable;
private static native java.lang.Short __call558_31(int a0) throws Throwable;
private static native void __call558_32(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Short a2) throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead558_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Byte __call558_34(int a0) throws Throwable;
private static native void __call558_35(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Byte a2) throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead558_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call558_37(net.minecraft.entity.DataWatcher a0, int a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead558_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Byte __call558_39(int a0) throws Throwable;
private static native void __call558_40(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Byte a2) throws Throwable;
private static native void __call558_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Throwable __call3055800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5e68c4123104560cecb3(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_5e68c4123104560cecb3 {

public static boolean f1490(net.minecraft.entity.Entity receiver) throws Throwable {
    int forwardValue1490_15_0;
    int forwardValue1490_17_0;
    byte spill1490_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead1490_0() ^ 83021595628392L);
    life3_5 = __call1490_1();
    spill1490_0 = __call1490_3(__fieldRead1490_2(receiver), 3);
    if (!((life3_5 == 0))) {
        forwardValue1490_15_0 = __integerCategory1490_4(spill1490_0);
        break forward_join_15;
    }
    if (!((spill1490_0 == 1))) {
        break forward_join_16;
    }
    forwardValue1490_15_0 = 1;
    }
    forwardValue1490_17_0 = forwardValue1490_15_0;
    break forward_join_17;
    }
    forwardValue1490_17_0 = 0;
    }
    return __integerCategory1490_5(forwardValue1490_17_0);
}
public static void h1490_0(moom.Oo p0) throws Throwable {
    throw __call1149000_0(p0);
}
public static void h1490_1(moom.Oo p0) throws Throwable {
    throw __call1149001_0(p0);
}
private static native long __fieldRead1490_0() throws Throwable;
private static native int __call1490_1() throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1490_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call1490_3(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native int __integerCategory1490_4(byte value) throws Throwable;
private static native boolean __integerCategory1490_5(int value) throws Throwable;
private static native java.lang.Throwable __call1149000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c9758bf377003a51a55e(net.minecraft.entity.Entity a0, double a1) throws E;
private static final class __SourceHandler_c9758bf377003a51a55e {

public static boolean f556(net.minecraft.entity.Entity receiver, double p0) throws Throwable {
    int forwardValue556_29_0;
    int forwardValue556_33_0;
    int forwardValue556_35_0;
    int spill556_0;
    boolean spill556_1;
    long life3_3;
    double life6_8;
    int life5_9;
    double life6_26;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_17: {
    life3_3 = (__fieldRead556_0() ^ 118605351434822L);
    spill556_0 = __call556_1();
    life6_8 = __call556_3(__call556_2(receiver));
    life5_9 = spill556_0;
    spill556_1 = __call556_4(life6_8);
    if (!((life5_9 != 0))) {
        forwardValue556_29_0 = __integerCategory556_5(spill556_1);
        break forward_join_29;
    }
    if (!(spill556_1)) {
        break forward_join_17;
    }
    life6_8 = 0x1.0p0d;
    }
    life6_26 = ((life6_8 * 0x1.0p6d) * __fieldRead556_6(receiver));
    forwardValue556_29_0 = __numericCompare556_7(p0, (life6_26 * life6_26));
    }
    if (!((life5_9 != 0))) {
        forwardValue556_33_0 = forwardValue556_29_0;
        break forward_join_33;
    }
    if (!((forwardValue556_29_0 < 0))) {
        break forward_join_34;
    }
    forwardValue556_33_0 = 1;
    }
    forwardValue556_35_0 = forwardValue556_33_0;
    break forward_join_35;
    }
    forwardValue556_35_0 = 0;
    }
    return __integerCategory556_8(forwardValue556_35_0);
}
public static boolean h556_0(moom.Oo p0) throws Throwable {
    throw __call2055600_0(p0);
}
public static boolean h556_1(moom.Oo p0) throws Throwable {
    throw __call2055601_0(p0);
}
private static native long __fieldRead556_0() throws Throwable;
private static native int __call556_1() throws Throwable;
private static native moom.CA __call556_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call556_3(moom.CA a0) throws Throwable;
private static native boolean __call556_4(double a0) throws Throwable;
private static native int __integerCategory556_5(boolean value) throws Throwable;
private static native double __fieldRead556_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare556_7(double a0, double a1) throws Throwable;
private static native boolean __integerCategory556_8(int value) throws Throwable;
private static native java.lang.Throwable __call2055600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2055601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b8f0e20a51e60d30bf88(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5, int a6, boolean a7) throws E;
private static final class __SourceHandler_b8f0e20a51e60d30bf88 {

public static void f1491(net.minecraft.entity.Entity receiver, double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) throws Throwable {
    double lexicalValue1491_52_0;
    double lexicalValue1491_61_0;
    double lexicalValue1491_61_1;
    int spill1491_0;
    double spill1491_1;
    double spill1491_2;
    long life11_3;
    int life13_10;
    java.util.List life14_25;
    double life15_30;
    java.util.Iterator life17_33;
    moom.CA life18_40;
    double life3_71;
    lexical_join_68: {
    lexical_join_61: {
    lexical_join_55: {
    life11_3 = (__fieldRead1491_0() ^ 56927924530353L);
    spill1491_0 = __call1491_1();
    __call1491_2(receiver, p0, p1, p2);
    life13_10 = spill1491_0;
    __call1491_3(receiver, p3, p4);
    life14_25 = __call1491_7(__fieldRead1491_4(receiver), receiver, __call1491_6(__call1491_5(receiver), 0x1.0p-5d, 0x0.0p0d, 0x1.0p-5d));
    if (!((!__call1491_8(life14_25)))) {
        break lexical_join_68;
    }
    life15_30 = 0x0.0p0d;
    life17_33 = __call1491_9(life14_25);
    lexical_cycle_34: while (true) {
    lexical_join_53: {
    lexical_join_52: {
    if (!(__call1491_10(life17_33))) {
        break lexical_join_55;
    }
    life18_40 = __cast1491_12(__call1491_11(life17_33));
    spill1491_1 = __fieldRead1491_13(life18_40);
    if (!((life13_10 != 0))) {
        lexicalValue1491_52_0 = spill1491_1;
        break lexical_join_52;
    }
    spill1491_2 = life15_30;
    if (!((life13_10 != 0))) {
        lexicalValue1491_61_0 = spill1491_1;
        lexicalValue1491_61_1 = spill1491_2;
        break lexical_join_61;
    }
    if (!((__numericCompare1491_14(spill1491_1, spill1491_2) > 0))) {
        break lexical_join_53;
    }
    lexicalValue1491_52_0 = __fieldRead1491_15(life18_40);
    }
    life15_30 = lexicalValue1491_52_0;
    }
    if (!((life13_10 == 0))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    lexicalValue1491_61_0 = p1;
    lexicalValue1491_61_1 = (life15_30 - __fieldRead1491_17(__call1491_16(receiver)));
    }
    life3_71 = (lexicalValue1491_61_0 + lexicalValue1491_61_1);
    __call1491_18(receiver, p0, life3_71, p2);
    }
    return;
}
public static void h1491_0(moom.Oo p0) throws Throwable {
    throw __call1149100_0(p0);
}
public static void h1491_1(moom.Oo p0) throws Throwable {
    throw __call1149101_0(p0);
}
public static void h1491_2(moom.Oo p0) throws Throwable {
    throw __call1149102_0(p0);
}
private static native long __fieldRead1491_0() throws Throwable;
private static native int __call1491_1() throws Throwable;
private static native void __call1491_2(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native void __call1491_3(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native net.minecraft.world.World __fieldRead1491_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1491_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1491_6(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call1491_7(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call1491_8(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call1491_9(java.util.List a0) throws Throwable;
private static native boolean __call1491_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1491_11(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast1491_12(java.lang.Object a0) throws Throwable;
private static native double __fieldRead1491_13(moom.CA a0) throws Throwable;
private static native int __numericCompare1491_14(double a0, double a1) throws Throwable;
private static native double __fieldRead1491_15(moom.CA a0) throws Throwable;
private static native moom.CA __call1491_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1491_17(moom.CA a0) throws Throwable;
private static native void __call1491_18(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1149100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a31e1d7b04c56308289b(net.minecraft.entity.Entity a0, double a1, boolean a2, net.minecraft.block.Block a3, moom.DT a4) throws E;
private static final class __SourceHandler_a31e1d7b04c56308289b {

public static void f1492(net.minecraft.entity.Entity receiver, double p0, boolean p1, net.minecraft.block.Block p2, moom.DT p3) throws Throwable {
    net.minecraft.block.Block forwardValue1492_20_0;
    int forwardValue1492_42_0;
    boolean spill1492_0;
    net.minecraft.block.Block spill1492_1;
    long life6_3;
    int life8_5;
    forward_join_51: {
    forward_join_42: {
    forward_join_39: {
    forward_join_34: {
    forward_join_29: {
    forward_join_20: {
    life6_3 = (__fieldRead1492_0() ^ 108094594607885L);
    life8_5 = __call1492_1();
    spill1492_0 = p1;
    if (!((life8_5 == 0))) {
        forwardValue1492_42_0 = __integerCategory1492_2(spill1492_0);
        break forward_join_42;
    }
    if (!(spill1492_0)) {
        break forward_join_39;
    }
    if (!((__numericCompare1492_4(__fieldRead1492_3(receiver), 0x0.0p0f) > 0))) {
        break forward_join_51;
    }
    spill1492_1 = p2;
    if (!((life8_5 == 0))) {
        forwardValue1492_20_0 = spill1492_1;
        break forward_join_20;
    }
    if (!((spill1492_1 != null))) {
        break forward_join_29;
    }
    forwardValue1492_20_0 = p2;
    }
    __call1492_7(forwardValue1492_20_0, __fieldRead1492_5(receiver), p3, receiver, __fieldRead1492_6(receiver));
    if (!((life8_5 != 0))) {
        break forward_join_34;
    }
    }
    __call1492_9(receiver, __fieldRead1492_8(receiver), 0x1.0p0f);
    }
    __fieldWrite1492_10(receiver, 0x0.0p0f);
    if (!((life8_5 != 0))) {
        break forward_join_51;
    }
    }
    forwardValue1492_42_0 = __numericCompare1492_11(p0, 0x0.0p0d);
    }
    if (!((forwardValue1492_42_0 < 0))) {
        break forward_join_51;
    }
    __fieldWrite1492_13(receiver, ((float) (((double) __fieldRead1492_12(receiver)) - p0)));
    }
    return;
}
public static void h1492_0(moom.Oo p0) throws Throwable {
    throw __call1149200_0(p0);
}
public static void h1492_1(moom.Oo p0) throws Throwable {
    throw __call1149201_0(p0);
}
public static void h1492_2(moom.Oo p0) throws Throwable {
    throw __call1149202_0(p0);
}
public static void h1492_3(moom.Oo p0) throws Throwable {
    throw __call1149203_0(p0);
}
public static void h1492_4(moom.Oo p0) throws Throwable {
    throw __call1149204_0(p0);
}
public static void h1492_5(moom.Oo p0) throws Throwable {
    throw __call1149205_0(p0);
}
public static void h1492_6(moom.Oo p0) throws Throwable {
    throw __call1149206_0(p0);
}
private static native long __fieldRead1492_0() throws Throwable;
private static native int __call1492_1() throws Throwable;
private static native int __integerCategory1492_2(boolean value) throws Throwable;
private static native float __fieldRead1492_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1492_4(float a0, float a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1492_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1492_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1492_7(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.entity.Entity a3, float a4) throws Throwable;
private static native float __fieldRead1492_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1492_9(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite1492_10(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native int __numericCompare1492_11(double a0, double a1) throws Throwable;
private static native float __fieldRead1492_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1492_13(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1149200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149206_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_eb12ebb4de143ca06e8d(net.minecraft.entity.Entity a0, float a1) throws E;
private static final class __SourceHandler_eb12ebb4de143ca06e8d {

public static float f1493(net.minecraft.entity.Entity receiver, float p0) throws Throwable {
    net.minecraft.world.World forwardValue1493_30_0;
    moom.DT forwardValue1493_30_1;
    float forwardValue1493_33_0;
    int spill1493_0;
    net.minecraft.world.World spill1493_1;
    moom.DT spill1493_2;
    long life2_3;
    moom.DT life5_18;
    int life4_19;
    forward_join_33: {
    forward_join_32: {
    forward_join_30: {
    life2_3 = (__fieldRead1493_0() ^ 96210008722388L);
    spill1493_0 = __call1493_1();
    life5_18 = new moom.DT(__fieldRead1493_2(receiver), (__fieldRead1493_3(receiver) + ((double) __call1493_4(receiver))), __fieldRead1493_5(receiver));
    life4_19 = spill1493_0;
    spill1493_1 = __fieldRead1493_6(receiver);
    spill1493_2 = life5_18;
    if (!((life4_19 != 0))) {
        forwardValue1493_30_0 = spill1493_1;
        forwardValue1493_30_1 = spill1493_2;
        break forward_join_30;
    }
    if (!(__call1493_7(spill1493_1, spill1493_2))) {
        break forward_join_32;
    }
    forwardValue1493_30_0 = __fieldRead1493_8(receiver);
    forwardValue1493_30_1 = life5_18;
    }
    forwardValue1493_33_0 = __call1493_9(forwardValue1493_30_0, forwardValue1493_30_1);
    break forward_join_33;
    }
    forwardValue1493_33_0 = 0x0.0p0f;
    }
    return forwardValue1493_33_0;
}
public static void h1493_0(moom.Oo p0) throws Throwable {
    throw __call1149300_0(p0);
}
public static void h1493_1(moom.Oo p0) throws Throwable {
    throw __call1149301_0(p0);
}
private static native long __fieldRead1493_0() throws Throwable;
private static native int __call1493_1() throws Throwable;
private static native double __fieldRead1493_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1493_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1493_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1493_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1493_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1493_7(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1493_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1493_9(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1149300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cff4f70cc7ef6eebc7be(net.minecraft.entity.Entity a0, float a1, float a2, float a3) throws E;
private static final class __SourceHandler_cff4f70cc7ef6eebc7be {

public static void f557(net.minecraft.entity.Entity receiver, float p0, float p1, float p2) throws Throwable {
    int forwardValue557_55_0;
    float forwardValue557_74_0;
    float forwardValue557_74_1;
    int spill557_0;
    int spill557_1;
    float spill557_2;
    float spill557_3;
    long life4_3;
    float life7_7;
    int life6_8;
    com.moon.eF life8_19;
    float life8_40;
    float life8_67;
    float life9_82;
    float life10_89;
    forward_join_110: {
    forward_join_74: {
    forward_join_58: {
    forward_join_55: {
    forward_join_33: {
    life4_3 = (__fieldRead557_0() ^ 125674921202346L);
    spill557_0 = __call557_1();
    life7_7 = __fieldRead557_2(receiver);
    life6_8 = spill557_0;
    if (!((__instanceOf557_3(receiver) != 0))) {
        break forward_join_33;
    }
    life8_19 = new com.moon.eF(__fieldRead557_4(receiver), p1, p0);
    __call557_7(__call557_6(__call557_5()), life8_19);
    life7_7 = __call557_8(life8_19);
    p1 = __call557_9(life8_19);
    p0 = __call557_10(life8_19);
    }
    life8_40 = ((p0 * p0) + (p1 * p1));
    spill557_1 = __numericCompare557_11(life8_40, 0x1.a36e2ep-14f);
    if (!((life6_8 == 0))) {
        forwardValue557_55_0 = spill557_1;
        break forward_join_55;
    }
    if (!((spill557_1 >= 0))) {
        break forward_join_110;
    }
    life8_40 = __call557_12(life8_40);
    spill557_2 = life8_40;
    spill557_3 = 0x1.0p0f;
    if (!((life6_8 == 0))) {
        forwardValue557_74_0 = spill557_2;
        forwardValue557_74_1 = spill557_3;
        break forward_join_74;
    }
    forwardValue557_55_0 = __numericCompare557_13(spill557_2, spill557_3);
    }
    if (!((forwardValue557_55_0 < 0))) {
        break forward_join_58;
    }
    life8_40 = 0x1.0p0f;
    }
    life8_67 = (p2 / life8_40);
    p0 = (p0 * life8_67);
    p1 = (p1 * life8_67);
    forwardValue557_74_0 = (life7_7 * 0x1.921fb6p1f);
    forwardValue557_74_1 = 0x1.68p7f;
    }
    life9_82 = __call557_14((forwardValue557_74_0 / forwardValue557_74_1));
    life10_89 = __call557_15(((life7_7 * 0x1.921fb6p1f) / 0x1.68p7f));
    net.minecraft.entity.Entity __stackOp557_16_0 = receiver;
    __fieldWrite557_18(__stackOp557_16_0, (__fieldRead557_17(__stackOp557_16_0) + ((double) ((p0 * life10_89) - (p1 * life9_82)))));
    net.minecraft.entity.Entity __stackOp557_19_0 = receiver;
    __fieldWrite557_21(__stackOp557_19_0, (__fieldRead557_20(__stackOp557_19_0) + ((double) ((p1 * life10_89) + (p0 * life9_82)))));
    }
    return;
}
public static void h557_0(moom.Oo p0) throws Throwable {
    throw __call2055700_0(p0);
}
public static void h557_1(moom.Oo p0) throws Throwable {
    throw __call2055701_0(p0);
}
private static native long __fieldRead557_0() throws Throwable;
private static native int __call557_1() throws Throwable;
private static native float __fieldRead557_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf557_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead557_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call557_5() throws Throwable;
private static native com.moon.events.EventBus __call557_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call557_7(com.moon.events.EventBus a0, com.moon.eF a1) throws Throwable;
private static native float __call557_8(com.moon.eF a0) throws Throwable;
private static native float __call557_9(com.moon.eF a0) throws Throwable;
private static native float __call557_10(com.moon.eF a0) throws Throwable;
private static native int __numericCompare557_11(float a0, float a1) throws Throwable;
private static native float __call557_12(float a0) throws Throwable;
private static native int __numericCompare557_13(float a0, float a1) throws Throwable;
private static native float __call557_14(float a0) throws Throwable;
private static native float __call557_15(float a0) throws Throwable;
private static native double __fieldRead557_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite557_18(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead557_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite557_21(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native java.lang.Throwable __call2055700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2055701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_605560c55fcc0bb50f6c(net.minecraft.entity.Entity a0, int a1, boolean a2) throws E;
private static final class __SourceHandler_605560c55fcc0bb50f6c {

public static void f1494(net.minecraft.entity.Entity receiver, int p0, boolean p1) throws Throwable {
    long life3_3;
    int life6_9;
    int life5_10;
    forward_join_41: {
    forward_join_28: {
    forward_join_26: {
    life3_3 = (__fieldRead1494_0() ^ 86998558056548L);
    int spill1494_0 = __call1494_1();
    life6_9 = __call1494_3(__fieldRead1494_2(receiver), 0);
    life5_10 = spill1494_0;
    if (!((life5_10 == 0))) { break forward_join_26; }
    if (!(p1)) { break forward_join_28; }
    __call1494_6(__fieldRead1494_4(receiver), 0, __call1494_5(((byte) (life6_9 | (1 << p0)))));
    }
    if (!((life5_10 != 0))) { break forward_join_41; }
    }
    __call1494_9(__fieldRead1494_7(receiver), 0, __call1494_8(((byte) (life6_9 & ((1 << p0) ^ -1)))));
    }
    return;
}
public static void h1494_0(moom.Oo p0) throws Throwable {
    throw __call1149400_0(p0);
}
public static void h1494_1(moom.Oo p0) throws Throwable {
    throw __call1149401_0(p0);
}
public static void h1494_2(moom.Oo p0) throws Throwable {
    throw __call1149402_0(p0);
}
private static native long __fieldRead1494_0() throws Throwable;
private static native int __call1494_1() throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1494_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call1494_3(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1494_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Byte __call1494_5(byte a0) throws Throwable;
private static native void __call1494_6(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Byte a2) throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1494_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Byte __call1494_8(byte a0) throws Throwable;
private static native void __call1494_9(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Byte a2) throws Throwable;
private static native java.lang.Throwable __call1149400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b07455357397c794b1e4(net.minecraft.entity.Entity a0, java.lang.String a1, float a2, float a3) throws E;
private static final class __SourceHandler_b07455357397c794b1e4 {

public static void f1495(net.minecraft.entity.Entity receiver, java.lang.String p0, float p1, float p2) throws Throwable {
    net.minecraft.entity.Entity forwardValue1495_12_0;
    net.minecraft.entity.Entity spill1495_0;
    long life4_3;
    int life6_5;
    forward_join_18: {
    forward_join_12: {
    life4_3 = (__fieldRead1495_0() ^ 89622382518650L);
    life6_5 = __call1495_1();
    spill1495_0 = receiver;
    if (!((life6_5 != 0))) {
        forwardValue1495_12_0 = spill1495_0;
        break forward_join_12;
    }
    if (!((!__call1495_2(spill1495_0)))) {
        break forward_join_18;
    }
    forwardValue1495_12_0 = receiver;
    }
    __call1495_4(__fieldRead1495_3(forwardValue1495_12_0), receiver, p0, p1, p2);
    }
    return;
}
public static void h1495_0(moom.Oo p0) throws Throwable {
    throw __call1149500_0(p0);
}
public static void h1495_1(moom.Oo p0) throws Throwable {
    throw __call1149501_0(p0);
}
private static native long __fieldRead1495_0() throws Throwable;
private static native int __call1495_1() throws Throwable;
private static native boolean __call1495_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1495_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1495_4(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, java.lang.String a2, float a3, float a4) throws Throwable;
private static native java.lang.Throwable __call1149500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_65ce52faaf9ae04a6b53(net.minecraft.entity.Entity a0, moom.DT a1, net.minecraft.block.Block a2) throws E;
private static final class __SourceHandler_65ce52faaf9ae04a6b53 {

public static void f1496(net.minecraft.entity.Entity receiver, moom.DT p0, net.minecraft.block.Block p1) throws Throwable {
    net.minecraft.block.Block forwardValue1496_35_0;
    int spill1496_0;
    net.minecraft.block.Block spill1496_1;
    long life3_3;
    moom.eJ life6_7;
    int life5_8;
    forward_join_48: {
    forward_join_35: {
    forward_join_34: {
    life3_3 = (__fieldRead1496_0() ^ 33571411119520L);
    spill1496_0 = __call1496_1();
    life6_7 = __fieldRead1496_2(p1);
    life5_8 = spill1496_0;
    spill1496_1 = __call1496_6(__call1496_5(__fieldRead1496_3(receiver), __call1496_4(p0)));
    if (!((life5_8 == 0))) {
        forwardValue1496_35_0 = spill1496_1;
        break forward_join_35;
    }
    if (!((spill1496_1 == __fieldRead1496_7()))) {
        break forward_join_34;
    }
    life6_7 = __fieldRead1496_9(__fieldRead1496_8());
    __call1496_13(receiver, __call1496_10(life6_7), (__call1496_11(life6_7) * 0x1.333334p-3f), __call1496_12(life6_7));
    if (!((life5_8 != 0))) {
        break forward_join_48;
    }
    }
    forwardValue1496_35_0 = p1;
    }
    if (!((!__call1496_15(__call1496_14(forwardValue1496_35_0))))) {
        break forward_join_48;
    }
    __call1496_19(receiver, __call1496_16(life6_7), (__call1496_17(life6_7) * 0x1.333334p-3f), __call1496_18(life6_7));
    }
    return;
}
public static void h1496_0(moom.Oo p0) throws Throwable {
    throw __call1149600_0(p0);
}
public static void h1496_1(moom.Oo p0) throws Throwable {
    throw __call1149601_0(p0);
}
public static void h1496_2(moom.Oo p0) throws Throwable {
    throw __call1149602_0(p0);
}
private static native long __fieldRead1496_0() throws Throwable;
private static native int __call1496_1() throws Throwable;
private static native moom.eJ __fieldRead1496_2(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1496_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call1496_4(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1496_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1496_6(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1496_7() throws Throwable;
private static native net.minecraft.block.Block __fieldRead1496_8() throws Throwable;
private static native moom.eJ __fieldRead1496_9(net.minecraft.block.Block a0) throws Throwable;
private static native java.lang.String __call1496_10(moom.eJ a0) throws Throwable;
private static native float __call1496_11(moom.eJ a0) throws Throwable;
private static native float __call1496_12(moom.eJ a0) throws Throwable;
private static native void __call1496_13(net.minecraft.entity.Entity a0, java.lang.String a1, float a2, float a3) throws Throwable;
private static native moom.fn __call1496_14(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1496_15(moom.fn a0) throws Throwable;
private static native java.lang.String __call1496_16(moom.eJ a0) throws Throwable;
private static native float __call1496_17(moom.eJ a0) throws Throwable;
private static native float __call1496_18(moom.eJ a0) throws Throwable;
private static native void __call1496_19(net.minecraft.entity.Entity a0, java.lang.String a1, float a2, float a3) throws Throwable;
private static native java.lang.Throwable __call1149600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b50a17faeda123527406(net.minecraft.entity.Entity a0, moom.fn a1) throws E;
private static final class __SourceHandler_b50a17faeda123527406 {

public static boolean f1497(net.minecraft.entity.Entity receiver, moom.fn p0) throws Throwable {
    net.minecraft.block.Block forwardValue1497_38_0;
    int forwardValue1497_60_0;
    int forwardValue1497_62_0;
    int spill1497_0;
    net.minecraft.block.Block spill1497_1;
    int spill1497_2;
    long life2_3;
    double life5_11;
    int life4_12;
    moom.DT life7_21;
    net.minecraft.block.state.IBlockState life8_26;
    net.minecraft.block.Block life9_29;
    float life10_49;
    float life11_57;
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_38: {
    life2_3 = (__fieldRead1497_0() ^ 95617312596318L);
    spill1497_0 = __call1497_1();
    life5_11 = (__fieldRead1497_2(receiver) + ((double) __call1497_3(receiver)));
    life4_12 = spill1497_0;
    life7_21 = new moom.DT(__fieldRead1497_4(receiver), life5_11, __fieldRead1497_5(receiver));
    life8_26 = __call1497_7(__fieldRead1497_6(receiver), life7_21);
    life9_29 = __call1497_8(life8_26);
    spill1497_1 = life9_29;
    if (!((life4_12 == 0))) {
        forwardValue1497_38_0 = spill1497_1;
        break forward_join_38;
    }
    if (!((__call1497_9(spill1497_1) == p0))) {
        break forward_join_63;
    }
    forwardValue1497_38_0 = __call1497_10(life8_26);
    }
    life10_49 = (__call1497_12(__call1497_11(forwardValue1497_38_0, life8_26)) - 0x1.c71c72p-4f);
    life11_57 = (((float) (__call1497_13(life7_21) + 1)) - life10_49);
    spill1497_2 = __numericCompare1497_14(life5_11, ((double) life11_57));
    if (!((life4_12 == 0))) {
        forwardValue1497_60_0 = spill1497_2;
        break forward_join_60;
    }
    if (!((spill1497_2 < 0))) {
        break forward_join_61;
    }
    forwardValue1497_60_0 = 1;
    }
    forwardValue1497_62_0 = forwardValue1497_60_0;
    break forward_join_62;
    }
    forwardValue1497_62_0 = 0;
    }
    return __integerCategory1497_15(forwardValue1497_62_0);
    }
    return __integerCategory1497_16(0);
}
public static void h1497_0(moom.Oo p0) throws Throwable {
    throw __call1149700_0(p0);
}
public static void h1497_1(moom.Oo p0) throws Throwable {
    throw __call1149701_0(p0);
}
public static void h1497_2(moom.Oo p0) throws Throwable {
    throw __call1149702_0(p0);
}
private static native long __fieldRead1497_0() throws Throwable;
private static native int __call1497_1() throws Throwable;
private static native double __fieldRead1497_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1497_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1497_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1497_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1497_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1497_7(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1497_8(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1497_9(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __call1497_10(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call1497_11(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native float __call1497_12(int a0) throws Throwable;
private static native int __call1497_13(moom.DT a0) throws Throwable;
private static native int __numericCompare1497_14(double a0, double a1) throws Throwable;
private static native boolean __integerCategory1497_15(int value) throws Throwable;
private static native boolean __integerCategory1497_16(int value) throws Throwable;
private static native java.lang.Throwable __call1149700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_64cacd31dfdc01d8fdfa(net.minecraft.entity.Entity a0, moom.tu a1) throws E;
private static final class __SourceHandler_64cacd31dfdc01d8fdfa {

public static void f246(net.minecraft.entity.Entity receiver, moom.tu p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue246_23_0;
    int spill246_0;
    net.minecraft.entity.Entity spill246_1;
    long life2_3;
    int life4_10;
    forward_join_29: {
    forward_join_23: {
    life2_3 = (__fieldRead246_0() ^ 101937782090385L);
    spill246_0 = __call246_1();
    __call246_3(receiver, __fieldRead246_2(), 0x1.4p2f);
    life4_10 = spill246_0;
    net.minecraft.entity.Entity __stackOp246_4_0 = receiver;
    __fieldWrite246_6(__stackOp246_4_0, (__fieldRead246_5(__stackOp246_4_0) + 1));
    spill246_1 = receiver;
    if (!((life4_10 == 0))) {
        forwardValue246_23_0 = spill246_1;
        break forward_join_23;
    }
    if (!((__fieldRead246_7(spill246_1) == 0))) {
        break forward_join_29;
    }
    forwardValue246_23_0 = receiver;
    }
    __call246_9(forwardValue246_23_0, __invokedynamic246_8(22997, (396567895841407496L ^ life2_3)));
    }
    return;
}
public static void h246_0(moom.Oo p0) throws Throwable {
    throw __call1024600_0(p0);
}
public static void h246_1(moom.Oo p0) throws Throwable {
    throw __call1024601_0(p0);
}
private static native long __fieldRead246_0() throws Throwable;
private static native int __call246_1() throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead246_2() throws Throwable;
private static native boolean __call246_3(net.minecraft.entity.Entity a0, net.minecraft.util.DamageSource a1, float a2) throws Throwable;
private static native int __fieldRead246_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite246_6(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead246_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic246_8(int a0, long a1) throws Throwable;
private static native void __call246_9(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1024600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fec2e711d309a72f69ff(net.minecraft.entity.Entity a0, net.minecraft.entity.EntityLivingBase a1, net.minecraft.entity.Entity a2) throws E;
private static final class __SourceHandler_fec2e711d309a72f69ff {

public static void f2734(net.minecraft.entity.Entity receiver, net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1) throws Throwable {
    long life3_3;
    int life5_5;
    life3_3 = (__fieldRead2734_0() ^ 64264418308783L);
    life5_5 = __call2734_1();
    if ((life5_5 != 0)) {
        if ((__instanceOf2734_2(p1) != 0)) {
        __call2734_4(__cast2734_3(p1), p0);
    }
        __call2734_5(p0, p1);
    }
    return;
}
public static void h2734_0(moom.Oo p0) throws Throwable {
    throw __call1273400_0(p0);
}
public static void h2734_1(moom.Oo p0) throws Throwable {
    throw __call1273401_0(p0);
}
private static native long __fieldRead2734_0() throws Throwable;
private static native int __call2734_1() throws Throwable;
private static native int __instanceOf2734_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast2734_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call2734_4(net.minecraft.entity.EntityLivingBase a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native void __call2734_5(net.minecraft.entity.EntityLivingBase a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Throwable __call1273400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1273401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.item.EntityItem __sourceHandlerCall_15c03119ce7e40053427(net.minecraft.entity.Entity a0, net.minecraft.item.ItemStack a1, float a2) throws E;
private static final class __SourceHandler_15c03119ce7e40053427 {

public static net.minecraft.entity.item.EntityItem f1498(net.minecraft.entity.Entity receiver, net.minecraft.item.ItemStack p0, float p1) throws Throwable {
    net.minecraft.item.ItemStack forwardValue1498_12_0;
    net.minecraft.item.ItemStack spill1498_0;
    long life3_3;
    int life5_5;
    net.minecraft.entity.item.EntityItem life6_35;
    forward_join_39: {
    forward_join_12: {
    life3_3 = (__fieldRead1498_0() ^ 71747916331672L);
    life5_5 = __call1498_1();
    spill1498_0 = p0;
    if (!((life5_5 != 0))) {
        forwardValue1498_12_0 = spill1498_0;
        break forward_join_12;
    }
    if (!((__fieldRead1498_2(spill1498_0) != 0))) {
        break forward_join_39;
    }
    forwardValue1498_12_0 = p0;
    }
    if (!((__call1498_3(forwardValue1498_12_0) != null))) {
        break forward_join_39;
    }
    life6_35 = new net.minecraft.entity.item.EntityItem(__fieldRead1498_4(receiver), __fieldRead1498_5(receiver), (__fieldRead1498_6(receiver) + ((double) p1)), __fieldRead1498_7(receiver), p0);
    __call1498_8(life6_35);
    __call1498_10(__fieldRead1498_9(receiver), life6_35);
    return life6_35;
    }
    return null;
}
public static void h1498_0(moom.Oo p0) throws Throwable {
    throw __call1149800_0(p0);
}
public static void h1498_1(moom.Oo p0) throws Throwable {
    throw __call1149801_0(p0);
}
private static native long __fieldRead1498_0() throws Throwable;
private static native int __call1498_1() throws Throwable;
private static native int __fieldRead1498_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __call1498_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1498_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1498_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1498_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1498_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1498_8(net.minecraft.entity.item.EntityItem a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1498_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1498_10(net.minecraft.world.World a0, net.minecraft.entity.item.EntityItem a1) throws Throwable;
private static native java.lang.Throwable __call1149800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_111e9873fc7673cf35de(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_111e9873fc7673cf35de {

public static void f547(net.minecraft.entity.Entity receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue547_142_0;
    int forwardValue547_145_0;
    net.minecraft.entity.Entity forwardValue547_156_0;
    net.minecraft.nbt.NBTTagCompound spill547_0;
    java.lang.String spill547_1;
    net.minecraft.entity.Entity spill547_2;
    double[] spill547_3;
    double[] spill547_4;
    double[] spill547_5;
    net.minecraft.nbt.NBTTagCompound spill547_6;
    java.lang.String spill547_7;
    net.minecraft.entity.Entity spill547_8;
    double[] spill547_9;
    double[] spill547_10;
    double[] spill547_11;
    net.minecraft.nbt.NBTTagCompound spill547_12;
    java.lang.String spill547_13;
    net.minecraft.entity.Entity spill547_14;
    float[] spill547_15;
    float[] spill547_16;
    net.minecraft.entity.Entity spill547_17;
    int spill547_18;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_178;
    forward_join_170: {
    forward_join_156: {
    forward_join_151: {
    forward_join_145: {
    forward_join_142: {
    forward_join_137: {
    life2_3 = (__fieldRead547_0() ^ 12095990862275L);
    life4_5 = __call547_1();
    spill547_0 = p0;
    spill547_1 = "Pos";
    spill547_2 = receiver;
    double[] __stackOp547_2_0 = new double[3];
    spill547_3 = __stackOp547_2_0;
    (__stackOp547_2_0)[0] = __fieldRead547_3(receiver);
    double[] __stackOp547_4_0 = spill547_3;
    spill547_4 = __stackOp547_4_0;
    (__stackOp547_4_0)[1] = __fieldRead547_5(receiver);
    double[] __stackOp547_6_0 = spill547_4;
    spill547_5 = __stackOp547_6_0;
    (__stackOp547_6_0)[2] = __fieldRead547_7(receiver);
    __call547_9(spill547_0, spill547_1, __call547_8(spill547_2, spill547_5));
    spill547_6 = p0;
    spill547_7 = "Motion";
    spill547_8 = receiver;
    double[] __stackOp547_10_0 = new double[3];
    spill547_9 = __stackOp547_10_0;
    (__stackOp547_10_0)[0] = __fieldRead547_11(receiver);
    double[] __stackOp547_12_0 = spill547_9;
    spill547_10 = __stackOp547_12_0;
    (__stackOp547_12_0)[1] = __fieldRead547_13(receiver);
    double[] __stackOp547_14_0 = spill547_10;
    spill547_11 = __stackOp547_14_0;
    (__stackOp547_14_0)[2] = __fieldRead547_15(receiver);
    __call547_17(spill547_6, spill547_7, __call547_16(spill547_8, spill547_11));
    spill547_12 = p0;
    spill547_13 = "Rotation";
    spill547_14 = receiver;
    float[] __stackOp547_18_0 = new float[2];
    spill547_15 = __stackOp547_18_0;
    (__stackOp547_18_0)[0] = __fieldRead547_19(receiver);
    float[] __stackOp547_20_0 = spill547_15;
    spill547_16 = __stackOp547_20_0;
    (__stackOp547_20_0)[1] = __fieldRead547_21(receiver);
    __call547_23(spill547_12, spill547_13, __call547_22(spill547_14, spill547_16));
    __call547_25(p0, "FallDistance", __fieldRead547_24(receiver));
    __call547_27(p0, "Fire", ((short) __fieldRead547_26(receiver)));
    __call547_29(p0, "Air", ((short) __call547_28(receiver)));
    __call547_31(p0, "OnGround", __fieldRead547_30(receiver));
    __call547_33(p0, "Dimension", __fieldRead547_32(receiver));
    __call547_35(p0, "Invulnerable", __fieldRead547_34(receiver));
    __call547_37(p0, "PortalCooldown", __fieldRead547_36(receiver));
    __call547_40(p0, "UUIDMost", __call547_39(__call547_38(receiver)));
    __call547_43(p0, "UUIDLeast", __call547_42(__call547_41(receiver)));
    spill547_17 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue547_142_0 = spill547_17;
        break forward_join_142;
    }
    if (!((__call547_44(spill547_17) != null))) {
        break forward_join_137;
    }
    spill547_18 = __call547_46(__call547_45(receiver));
    if (!((life4_5 == 0))) {
        forwardValue547_145_0 = spill547_18;
        break forward_join_145;
    }
    if (!((spill547_18 > 0))) {
        break forward_join_137;
    }
    __call547_48(p0, "CustomName", __call547_47(receiver));
    __call547_50(p0, "CustomNameVisible", __call547_49(receiver));
    }
    __call547_52(__fieldRead547_51(receiver), p0);
    forwardValue547_142_0 = receiver;
    }
    if (!((life4_5 == 0))) {
        forwardValue547_156_0 = forwardValue547_142_0;
        break forward_join_156;
    }
    forwardValue547_145_0 = __integerCategory547_54(__call547_53(forwardValue547_142_0));
    }
    if (!((forwardValue547_145_0 != 0))) {
        break forward_join_151;
    }
    __call547_56(p0, "Silent", __call547_55(receiver));
    }
    __call547_57(receiver, p0);
    forwardValue547_156_0 = __fieldRead547_58(receiver);
    }
    if (!((forwardValue547_156_0 != null))) {
        break forward_join_170;
    }
    life5_178 = new net.minecraft.nbt.NBTTagCompound();
    if (!(__call547_60(__fieldRead547_59(receiver), life5_178))) {
        break forward_join_170;
    }
    __call547_61(p0, "Riding", life5_178);
    }
    return;
}
public static void h547_0(java.lang.Throwable p0) throws Throwable {
    throw __call2054700_0(p0);
}
public static void h547_1(java.lang.Throwable p0) throws Throwable {
    throw __call2054701_0(p0);
}
public static void h547_2(java.lang.Throwable p0) throws Throwable {
    throw __call2054702_0(p0);
}
public static void h547_3(java.lang.Throwable p0) throws Throwable {
    throw __call2054703_0(p0);
}
public static void h547_4(java.lang.Throwable p0) throws Throwable {
    throw __call2054704_0(p0);
}
public static void h547_5(java.lang.Throwable p0) throws Throwable {
    throw __call2054705_0(p0);
}
public static void h547_6(java.lang.Throwable p0) throws Throwable {
    throw __call2054706_0(p0);
}
public static void h547_7(java.lang.Throwable p0, net.minecraft.entity.Entity p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2054707_0(local2, "Saving entity NBT");
    moom.qZ local4 = __call2054707_1(local3, "Entity being saved");
    __call2054707_2(p1, local4);
    throw new moom.Oo(local3);
}
private static native long __fieldRead547_0() throws Throwable;
private static native int __call547_1() throws Throwable;
private static native double __fieldRead547_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead547_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead547_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call547_8(net.minecraft.entity.Entity a0, double[] a1) throws Throwable;
private static native void __call547_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native double __fieldRead547_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead547_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead547_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call547_16(net.minecraft.entity.Entity a0, double[] a1) throws Throwable;
private static native void __call547_17(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native float __fieldRead547_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead547_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call547_22(net.minecraft.entity.Entity a0, float[] a1) throws Throwable;
private static native void __call547_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native float __fieldRead547_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_25(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, float a2) throws Throwable;
private static native int __fieldRead547_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_27(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, short a2) throws Throwable;
private static native int __call547_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_29(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, short a2) throws Throwable;
private static native boolean __fieldRead547_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_31(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native int __fieldRead547_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_33(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __fieldRead547_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_35(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native int __fieldRead547_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_37(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.UUID __call547_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native long __call547_39(java.util.UUID a0) throws Throwable;
private static native void __call547_40(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native java.util.UUID __call547_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native long __call547_42(java.util.UUID a0) throws Throwable;
private static native void __call547_43(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native java.lang.String __call547_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call547_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call547_46(java.lang.String a0) throws Throwable;
private static native java.lang.String __call547_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_48(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call547_49(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_50(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native moom.qN __fieldRead547_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_52(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __call547_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory547_54(boolean value) throws Throwable;
private static native boolean __call547_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call547_56(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __call547_57(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead547_58(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead547_59(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call547_60(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call547_61(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.lang.Throwable __call2054700_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2054701_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2054702_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2054703_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2054704_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2054705_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2054706_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2054707_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2054707_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call2054707_2(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9ee255a5ab12eb70d69f(net.minecraft.entity.Entity a0, net.minecraft.util.DamageSource a1) throws E;
private static final class __SourceHandler_9ee255a5ab12eb70d69f {

public static boolean f1499(net.minecraft.entity.Entity receiver, net.minecraft.util.DamageSource p0) throws Throwable {
    net.minecraft.util.DamageSource forwardValue1499_15_0;
    int forwardValue1499_20_0;
    int forwardValue1499_22_0;
    net.minecraft.util.DamageSource spill1499_0;
    boolean spill1499_1;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_15: {
    life2_3 = (__fieldRead1499_0() ^ 125843739775263L);
    life4_5 = __call1499_1();
    if (!(__fieldRead1499_2(receiver))) {
        break forward_join_21;
    }
    spill1499_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1499_15_0 = spill1499_0;
        break forward_join_15;
    }
    if (!((spill1499_0 != __fieldRead1499_3()))) {
        break forward_join_21;
    }
    forwardValue1499_15_0 = p0;
    }
    spill1499_1 = __call1499_4(forwardValue1499_15_0);
    if (!((life4_5 != 0))) {
        forwardValue1499_20_0 = __integerCategory1499_5(spill1499_1);
        break forward_join_20;
    }
    if (!((!spill1499_1))) {
        break forward_join_21;
    }
    forwardValue1499_20_0 = 1;
    }
    forwardValue1499_22_0 = forwardValue1499_20_0;
    break forward_join_22;
    }
    forwardValue1499_22_0 = 0;
    }
    return __integerCategory1499_6(forwardValue1499_22_0);
}
public static void h1499_0(moom.Oo p0) throws Throwable {
    throw __call1149900_0(p0);
}
public static void h1499_1(moom.Oo p0) throws Throwable {
    throw __call1149901_0(p0);
}
public static void h1499_2(moom.Oo p0) throws Throwable {
    throw __call1149902_0(p0);
}
public static void h1499_3(moom.Oo p0) throws Throwable {
    throw __call1149903_0(p0);
}
private static native long __fieldRead1499_0() throws Throwable;
private static native int __call1499_1() throws Throwable;
private static native boolean __fieldRead1499_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead1499_3() throws Throwable;
private static native boolean __call1499_4(net.minecraft.util.DamageSource a0) throws Throwable;
private static native int __integerCategory1499_5(boolean value) throws Throwable;
private static native boolean __integerCategory1499_6(int value) throws Throwable;
private static native java.lang.Throwable __call1149900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1149903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagList __sourceHandlerCall_b61485810f2ae0af8826(net.minecraft.entity.Entity a0, double[] a1) throws E;
private static final class __SourceHandler_b61485810f2ae0af8826 {

public static net.minecraft.nbt.NBTTagList f1500(net.minecraft.entity.Entity receiver, double[] p0) throws Throwable {
    net.minecraft.nbt.NBTTagList lexicalValue1500_36_0;
    int spill1500_0;
    net.minecraft.nbt.NBTTagList spill1500_1;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_8;
    double[] life6_10;
    int life7_13;
    int life8_15;
    int life4_16;
    double life9_23;
    lexical_join_36: {
    lexical_join_35: {
    life2_3 = (__fieldRead1500_0() ^ 76509903456529L);
    spill1500_0 = __call1500_1();
    life5_8 = new net.minecraft.nbt.NBTTagList();
    life6_10 = p0;
    life7_13 = (life6_10).length;
    life8_15 = 0;
    life4_16 = spill1500_0;
    lexical_cycle_17: while (true) {
    if (!((life8_15 < life7_13))) {
        break lexical_join_35;
    }
    life9_23 = (life6_10)[life8_15];
    spill1500_1 = life5_8;
    if (!((life4_16 != 0))) {
        lexicalValue1500_36_0 = spill1500_1;
        break lexical_join_36;
    }
    __call1500_2(spill1500_1, new moom.yq(life9_23));
    life8_15 += 1;
    if (!((life4_16 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1500_36_0 = life5_8;
    }
    return lexicalValue1500_36_0;
}
public static void h1500_0(moom.Oo p0) throws Throwable {
    throw __call1150000_0(p0);
}
private static native long __fieldRead1500_0() throws Throwable;
private static native int __call1500_1() throws Throwable;
private static native void __call1500_2(net.minecraft.nbt.NBTTagList a0, moom.yq a1) throws Throwable;
private static native java.lang.Throwable __call1150000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagList __sourceHandlerCall_559e45d43f755cb5c664(net.minecraft.entity.Entity a0, float[] a1) throws E;
private static final class __SourceHandler_559e45d43f755cb5c664 {

public static net.minecraft.nbt.NBTTagList f1501(net.minecraft.entity.Entity receiver, float[] p0) throws Throwable {
    net.minecraft.nbt.NBTTagList lexicalValue1501_36_0;
    int spill1501_0;
    net.minecraft.nbt.NBTTagList spill1501_1;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_7;
    float[] life6_10;
    int life7_13;
    int life8_15;
    int life4_16;
    float life9_23;
    lexical_join_36: {
    lexical_join_35: {
    life2_3 = (__fieldRead1501_0() ^ 4049510528546L);
    life5_7 = new net.minecraft.nbt.NBTTagList();
    spill1501_0 = __call1501_1();
    life6_10 = p0;
    life7_13 = (life6_10).length;
    life8_15 = 0;
    life4_16 = spill1501_0;
    lexical_cycle_17: while (true) {
    if (!((life8_15 < life7_13))) {
        break lexical_join_35;
    }
    life9_23 = (life6_10)[life8_15];
    spill1501_1 = life5_7;
    if (!((life4_16 == 0))) {
        lexicalValue1501_36_0 = spill1501_1;
        break lexical_join_36;
    }
    __call1501_2(spill1501_1, new moom.yr(life9_23));
    life8_15 += 1;
    if (!((life4_16 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1501_36_0 = life5_7;
    }
    return lexicalValue1501_36_0;
}
public static void h1501_0(moom.Oo p0) throws Throwable {
    throw __call1150100_0(p0);
}
private static native long __fieldRead1501_0() throws Throwable;
private static native int __call1501_1() throws Throwable;
private static native void __call1501_2(net.minecraft.nbt.NBTTagList a0, moom.yr a1) throws Throwable;
private static native java.lang.Throwable __call1150100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_56b8eef1b76cfb65e865(net.minecraft.entity.Entity a0, int a1) throws E;
private static final class __SourceHandler_56b8eef1b76cfb65e865 {

public static boolean f1502(net.minecraft.entity.Entity receiver, int p0) throws Throwable {
    int forwardValue1502_18_0;
    int forwardValue1502_20_0;
    int spill1502_0;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (__fieldRead1502_0() ^ 41185283880141L);
    life4_5 = __call1502_1();
    spill1502_0 = (__call1502_3(__fieldRead1502_2(receiver), 0) & (1 << p0));
    if (!((life4_5 != 0))) {
        forwardValue1502_18_0 = spill1502_0;
        break forward_join_18;
    }
    if (!((spill1502_0 != 0))) {
        break forward_join_19;
    }
    forwardValue1502_18_0 = 1;
    }
    forwardValue1502_20_0 = forwardValue1502_18_0;
    break forward_join_20;
    }
    forwardValue1502_20_0 = 0;
    }
    return __integerCategory1502_4(forwardValue1502_20_0);
}
public static void h1502_0(moom.Oo p0) throws Throwable {
    throw __call1150200_0(p0);
}
private static native long __fieldRead1502_0() throws Throwable;
private static native int __call1502_1() throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1502_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call1502_3(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native boolean __integerCategory1502_4(int value) throws Throwable;
private static native java.lang.Throwable __call1150200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_dd62cdb90ff1db856140(net.minecraft.entity.Entity a0, moom.CA a1) throws E;
private static final class __SourceHandler_dd62cdb90ff1db856140 {

public static boolean f1503(net.minecraft.entity.Entity receiver, moom.CA p0) throws Throwable {
    int forwardValue1503_19_0;
    int forwardValue1503_23_0;
    int forwardValue1503_25_0;
    boolean spill1503_0;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (__fieldRead1503_0() ^ 120395525323662L);
    life4_5 = __call1503_1();
    spill1503_0 = __call1503_4(__call1503_3(__fieldRead1503_2(receiver), receiver, p0));
    if (!((life4_5 != 0))) {
        forwardValue1503_19_0 = __integerCategory1503_5(spill1503_0);
        break forward_join_19;
    }
    if (!(spill1503_0)) {
        break forward_join_24;
    }
    forwardValue1503_19_0 = __integerCategory1503_8(__call1503_7(__fieldRead1503_6(receiver), p0));
    }
    if (!((life4_5 != 0))) {
        forwardValue1503_23_0 = forwardValue1503_19_0;
        break forward_join_23;
    }
    if (!((forwardValue1503_19_0 == 0))) {
        break forward_join_24;
    }
    forwardValue1503_23_0 = 1;
    }
    forwardValue1503_25_0 = forwardValue1503_23_0;
    break forward_join_25;
    }
    forwardValue1503_25_0 = 0;
    }
    return __integerCategory1503_9(forwardValue1503_25_0);
}
public static void h1503_0(moom.Oo p0) throws Throwable {
    throw __call1150300_0(p0);
}
public static void h1503_1(moom.Oo p0) throws Throwable {
    throw __call1150301_0(p0);
}
public static void h1503_2(moom.Oo p0) throws Throwable {
    throw __call1150302_0(p0);
}
private static native long __fieldRead1503_0() throws Throwable;
private static native int __call1503_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1503_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __call1503_3(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call1503_4(java.util.List a0) throws Throwable;
private static native int __integerCategory1503_5(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1503_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1503_7(net.minecraft.world.World a0, moom.CA a1) throws Throwable;
private static native int __integerCategory1503_8(boolean value) throws Throwable;
private static native boolean __integerCategory1503_9(int value) throws Throwable;
private static native java.lang.Throwable __call1150300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8dee5353d992344342af(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_8dee5353d992344342af {

public static boolean f2742(net.minecraft.entity.Entity receiver, net.minecraft.entity.Entity p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead2742_0() ^ 130037412851627L);
    return ((receiver == p0) ? true : false);
}
public static void h2742_0(moom.Oo p0) throws Throwable {
    throw __call1274200_0(p0);
}
private static native long __fieldRead2742_0() throws Throwable;
private static native java.lang.Throwable __call1274200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_02372f939040c26bbd91(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_02372f939040c26bbd91 {

public static boolean f1504(net.minecraft.entity.Entity receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    int forwardValue1504_26_0;
    int spill1504_0;
    boolean spill1504_1;
    long life2_3;
    java.lang.String life5_7;
    int life4_8;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (__fieldRead1504_0() ^ 130927789777130L);
    spill1504_0 = __call1504_1();
    life5_7 = __call1504_2(receiver);
    life4_8 = spill1504_0;
    spill1504_1 = __fieldRead1504_3(receiver);
    if (!((life4_8 == 0))) {
        forwardValue1504_26_0 = __integerCategory1504_4(spill1504_1);
        break forward_join_26;
    }
    if (!((!spill1504_1))) {
        break forward_join_25;
    }
    if (!((life5_7 != null))) {
        break forward_join_25;
    }
    __call1504_5(p0, "id", life5_7);
    __call1504_6(receiver, p0);
    return __integerCategory1504_7(1);
    }
    forwardValue1504_26_0 = 0;
    }
    return __integerCategory1504_8(forwardValue1504_26_0);
}
public static void h1504_0(moom.Oo p0) throws Throwable {
    throw __call1150400_0(p0);
}
public static void h1504_1(moom.Oo p0) throws Throwable {
    throw __call1150401_0(p0);
}
public static void h1504_2(moom.Oo p0) throws Throwable {
    throw __call1150402_0(p0);
}
private static native long __fieldRead1504_0() throws Throwable;
private static native int __call1504_1() throws Throwable;
private static native java.lang.String __call1504_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead1504_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1504_4(boolean value) throws Throwable;
private static native void __call1504_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call1504_6(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __integerCategory1504_7(int value) throws Throwable;
private static native boolean __integerCategory1504_8(int value) throws Throwable;
private static native java.lang.Throwable __call1150400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_02486c368e10a7256f6b(net.minecraft.entity.Entity a0, net.minecraft.util.DamageSource a1, float a2) throws E;
private static final class __SourceHandler_02486c368e10a7256f6b {

public static boolean f1505(net.minecraft.entity.Entity receiver, net.minecraft.util.DamageSource p0, float p1) throws Throwable {
    int forwardValue1505_17_0;
    boolean spill1505_0;
    long life3_3;
    int life5_5;
    forward_join_17: {
    forward_join_14: {
    life3_3 = (__fieldRead1505_0() ^ 102477094194921L);
    life5_5 = __call1505_1();
    spill1505_0 = __call1505_2(receiver, p0);
    if (!((life5_5 == 0))) {
        forwardValue1505_17_0 = __integerCategory1505_3(spill1505_0);
        break forward_join_17;
    }
    if (!(spill1505_0)) {
        break forward_join_14;
    }
    return __integerCategory1505_4(0);
    }
    __call1505_5(receiver);
    forwardValue1505_17_0 = 0;
    }
    return __integerCategory1505_6(forwardValue1505_17_0);
}
public static void h1505_0(moom.Oo p0) throws Throwable {
    throw __call1150500_0(p0);
}
public static void h1505_1(moom.Oo p0) throws Throwable {
    throw __call1150501_0(p0);
}
private static native long __fieldRead1505_0() throws Throwable;
private static native int __call1505_1() throws Throwable;
private static native boolean __call1505_2(net.minecraft.entity.Entity a0, net.minecraft.util.DamageSource a1) throws Throwable;
private static native int __integerCategory1505_3(boolean value) throws Throwable;
private static native boolean __integerCategory1505_4(int value) throws Throwable;
private static native void __call1505_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __integerCategory1505_6(int value) throws Throwable;
private static native java.lang.Throwable __call1150500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_0817a2207a91581f0a33(net.minecraft.entity.Entity a0, float a1) throws E;
private static final class __SourceHandler_0817a2207a91581f0a33 {

public static moom.DR f1506(net.minecraft.entity.Entity receiver, float p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1506_38_0;
    float forwardValue1506_53_0;
    float forwardValue1506_53_1;
    float spill1506_0;
    float spill1506_1;
    net.minecraft.entity.Entity spill1506_2;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life6_16;
    net.minecraft.client.entity.EntityPlayerSP life5_27;
    com.moon.eA life6_35;
    float life5_60;
    float life6_71;
    forward_join_53: {
    forward_join_44: {
    forward_join_38: {
    forward_join_37: {
    life2_3 = (__fieldRead1506_0() ^ 92334538477697L);
    life4_5 = __call1506_1();
    spill1506_0 = p0;
    spill1506_1 = 0x1.0p0f;
    if (!((life4_5 != 0))) {
        forwardValue1506_53_0 = spill1506_0;
        forwardValue1506_53_1 = spill1506_1;
        break forward_join_53;
    }
    if (!((__numericCompare1506_2(spill1506_0, spill1506_1) == 0))) {
        break forward_join_44;
    }
    life6_16 = receiver;
    spill1506_2 = life6_16;
    if (!((life4_5 != 0))) {
        forwardValue1506_38_0 = spill1506_2;
        break forward_join_38;
    }
    if (!((__instanceOf1506_3(spill1506_2) != 0))) {
        break forward_join_37;
    }
    life5_27 = __cast1506_4(life6_16);
    life6_35 = new com.moon.eA(__fieldRead1506_5(receiver), __fieldRead1506_6(receiver));
    return __call1506_9(receiver, __call1506_7(life6_35), __call1506_8(life6_35));
    }
    forwardValue1506_38_0 = receiver;
    }
    return __call1506_12(forwardValue1506_38_0, __fieldRead1506_10(receiver), __fieldRead1506_11(receiver));
    }
    forwardValue1506_53_0 = __fieldRead1506_13(receiver);
    forwardValue1506_53_1 = ((__fieldRead1506_14(receiver) - __fieldRead1506_15(receiver)) * p0);
    }
    life5_60 = (forwardValue1506_53_0 + forwardValue1506_53_1);
    life6_71 = (__fieldRead1506_16(receiver) + ((__fieldRead1506_17(receiver) - __fieldRead1506_18(receiver)) * p0));
    return __call1506_19(receiver, life5_60, life6_71);
}
public static void h1506_0(moom.Oo p0) throws Throwable {
    throw __call1150600_0(p0);
}
public static void h1506_1(moom.Oo p0) throws Throwable {
    throw __call1150601_0(p0);
}
private static native long __fieldRead1506_0() throws Throwable;
private static native int __call1506_1() throws Throwable;
private static native int __numericCompare1506_2(float a0, float a1) throws Throwable;
private static native int __instanceOf1506_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __cast1506_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1506_7(com.moon.eA a0) throws Throwable;
private static native float __call1506_8(com.moon.eA a0) throws Throwable;
private static native moom.DR __call1506_9(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native float __fieldRead1506_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DR __call1506_12(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native float __fieldRead1506_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1506_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DR __call1506_19(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native java.lang.Throwable __call1150600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_76d1aa7c94e936928b3f(net.minecraft.entity.Entity a0, float a1) throws E;
private static final class __SourceHandler_76d1aa7c94e936928b3f {

public static int f1507(net.minecraft.entity.Entity receiver, float p0) throws Throwable {
    int forwardValue1507_32_0;
    int forwardValue1507_34_0;
    int spill1507_0;
    boolean spill1507_1;
    long life2_3;
    moom.DT life5_18;
    int life4_19;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    life2_3 = (__fieldRead1507_0() ^ 96951602743969L);
    spill1507_0 = __call1507_1();
    life5_18 = new moom.DT(__fieldRead1507_2(receiver), (__fieldRead1507_3(receiver) + ((double) __call1507_4(receiver))), __fieldRead1507_5(receiver));
    life4_19 = spill1507_0;
    spill1507_1 = __call1507_7(__fieldRead1507_6(receiver), life5_18);
    if (!((life4_19 == 0))) {
        forwardValue1507_32_0 = __integerCategory1507_8(spill1507_1);
        break forward_join_32;
    }
    if (!(spill1507_1)) {
        break forward_join_33;
    }
    forwardValue1507_32_0 = __call1507_10(__fieldRead1507_9(receiver), life5_18, 0);
    }
    forwardValue1507_34_0 = forwardValue1507_32_0;
    break forward_join_34;
    }
    forwardValue1507_34_0 = 0;
    }
    return forwardValue1507_34_0;
}
public static void h1507_0(moom.Oo p0) throws Throwable {
    throw __call1150700_0(p0);
}
public static void h1507_1(moom.Oo p0) throws Throwable {
    throw __call1150701_0(p0);
}
private static native long __fieldRead1507_0() throws Throwable;
private static native int __call1507_1() throws Throwable;
private static native double __fieldRead1507_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1507_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1507_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1507_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1507_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1507_7(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1507_8(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1507_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1507_10(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1150700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b80bd478c288d7dd4573(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_b80bd478c288d7dd4573 {

public static java.lang.String f1508(net.minecraft.entity.Entity receiver) throws Throwable {
    net.minecraft.entity.Entity forwardValue1508_15_0;
    java.lang.String forwardValue1508_26_0;
    net.minecraft.entity.Entity spill1508_0;
    java.lang.String spill1508_1;
    long life1_3;
    int life3_5;
    java.lang.String life4_21;
    forward_join_26: {
    forward_join_23: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (__fieldRead1508_0() ^ 32853274081676L);
    life3_5 = __call1508_1();
    spill1508_0 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue1508_15_0 = spill1508_0;
        break forward_join_15;
    }
    if (!(__call1508_2(spill1508_0))) {
        break forward_join_14;
    }
    return __call1508_3(receiver);
    }
    forwardValue1508_15_0 = receiver;
    }
    life4_21 = __call1508_4(forwardValue1508_15_0);
    spill1508_1 = life4_21;
    if (!((life3_5 == 0))) {
        forwardValue1508_26_0 = spill1508_1;
        break forward_join_26;
    }
    if (!((spill1508_1 == null))) {
        break forward_join_23;
    }
    life4_21 = "generic";
    }
    forwardValue1508_26_0 = __call1508_6(__invokedynamic1508_5(life4_21));
    }
    return forwardValue1508_26_0;
}
public static void h1508_0(moom.Oo p0) throws Throwable {
    throw __call1150800_0(p0);
}
public static void h1508_1(moom.Oo p0) throws Throwable {
    throw __call1150801_0(p0);
}
public static void h1508_2(moom.Oo p0) throws Throwable {
    throw __call1150802_0(p0);
}
private static native long __fieldRead1508_0() throws Throwable;
private static native int __call1508_1() throws Throwable;
private static native boolean __call1508_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call1508_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call1508_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __invokedynamic1508_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1508_6(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call1150800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_66354a12973e14284177(net.minecraft.entity.Entity a0, float a1, float a2) throws E;
private static final class __SourceHandler_66354a12973e14284177 {

public static void f1509(net.minecraft.entity.Entity receiver, float p0, float p1) throws Throwable {
    float forwardValue1509_22_0;
    int forwardValue1509_73_0;
    int forwardValue1509_81_0;
    net.minecraft.entity.Entity forwardValue1509_83_0;
    float spill1509_0;
    float spill1509_1;
    int spill1509_2;
    net.minecraft.entity.Entity spill1509_3;
    long life3_3;
    int life5_5;
    float life6_34;
    forward_join_95: {
    forward_join_83: {
    forward_join_81: {
    forward_join_73: {
    forward_join_22: {
    forward_join_20: {
    life3_3 = (__fieldRead1509_0() ^ 98263862050401L);
    life5_5 = __call1509_1();
    spill1509_0 = p0;
    if (!((life5_5 != 0))) {
        forwardValue1509_22_0 = spill1509_0;
        break forward_join_22;
    }
    if (!((__numericCompare1509_3(spill1509_0, __fieldRead1509_2(receiver)) == 0))) {
        break forward_join_20;
    }
    spill1509_1 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1509_22_0 = spill1509_1;
        break forward_join_22;
    }
    if (!((__numericCompare1509_5(spill1509_1, __fieldRead1509_4(receiver)) != 0))) {
        break forward_join_95;
    }
    }
    forwardValue1509_22_0 = __fieldRead1509_6(receiver);
    }
    life6_34 = forwardValue1509_22_0;
    __fieldWrite1509_7(receiver, p0);
    __fieldWrite1509_8(receiver, p1);
    __call1509_24(receiver, new moom.CA(__fieldRead1509_10(__call1509_9(receiver)), __fieldRead1509_12(__call1509_11(receiver)), __fieldRead1509_14(__call1509_13(receiver)), (__fieldRead1509_16(__call1509_15(receiver)) + ((double) __fieldRead1509_17(receiver))), (__fieldRead1509_19(__call1509_18(receiver)) + ((double) __fieldRead1509_20(receiver))), (__fieldRead1509_22(__call1509_21(receiver)) + ((double) __fieldRead1509_23(receiver)))));
    spill1509_2 = __numericCompare1509_26(__fieldRead1509_25(receiver), life6_34);
    if (!((life5_5 != 0))) {
        forwardValue1509_73_0 = spill1509_2;
        break forward_join_73;
    }
    if (!((spill1509_2 > 0))) {
        break forward_join_95;
    }
    forwardValue1509_73_0 = __integerCategory1509_28(__fieldRead1509_27(receiver));
    }
    if (!((life5_5 != 0))) {
        forwardValue1509_81_0 = forwardValue1509_73_0;
        break forward_join_81;
    }
    if (!((forwardValue1509_73_0 == 0))) {
        break forward_join_95;
    }
    spill1509_3 = receiver;
    if (!((life5_5 != 0))) {
        forwardValue1509_83_0 = spill1509_3;
        break forward_join_83;
    }
    forwardValue1509_81_0 = __integerCategory1509_31(__fieldRead1509_30(__fieldRead1509_29(spill1509_3)));
    }
    if (!((forwardValue1509_81_0 == 0))) {
        break forward_join_95;
    }
    forwardValue1509_83_0 = receiver;
    }
    __call1509_34(forwardValue1509_83_0, ((double) (life6_34 - __fieldRead1509_32(receiver))), 0x0.0p0d, ((double) (life6_34 - __fieldRead1509_33(receiver))));
    }
    return;
}
public static void h1509_0(moom.Oo p0) throws Throwable {
    throw __call1150900_0(p0);
}
public static void h1509_1(moom.Oo p0) throws Throwable {
    throw __call1150901_0(p0);
}
public static void h1509_2(moom.Oo p0) throws Throwable {
    throw __call1150902_0(p0);
}
public static void h1509_3(moom.Oo p0) throws Throwable {
    throw __call1150903_0(p0);
}
public static void h1509_4(moom.Oo p0) throws Throwable {
    throw __call1150904_0(p0);
}
public static void h1509_5(moom.Oo p0) throws Throwable {
    throw __call1150905_0(p0);
}
public static void h1509_6(moom.Oo p0) throws Throwable {
    throw __call1150906_0(p0);
}
public static void h1509_7(moom.Oo p0) throws Throwable {
    throw __call1150907_0(p0);
}
public static void h1509_8(moom.Oo p0) throws Throwable {
    throw __call1150908_0(p0);
}
private static native long __fieldRead1509_0() throws Throwable;
private static native int __call1509_1() throws Throwable;
private static native float __fieldRead1509_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1509_3(float a0, float a1) throws Throwable;
private static native float __fieldRead1509_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1509_5(float a0, float a1) throws Throwable;
private static native float __fieldRead1509_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1509_7(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite1509_8(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native moom.CA __call1509_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1509_10(moom.CA a0) throws Throwable;
private static native moom.CA __call1509_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1509_12(moom.CA a0) throws Throwable;
private static native moom.CA __call1509_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1509_14(moom.CA a0) throws Throwable;
private static native moom.CA __call1509_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1509_16(moom.CA a0) throws Throwable;
private static native float __fieldRead1509_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1509_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1509_19(moom.CA a0) throws Throwable;
private static native float __fieldRead1509_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1509_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1509_22(moom.CA a0) throws Throwable;
private static native float __fieldRead1509_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1509_24(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native float __fieldRead1509_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1509_26(float a0, float a1) throws Throwable;
private static native boolean __fieldRead1509_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1509_28(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1509_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead1509_30(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1509_31(boolean value) throws Throwable;
private static native float __fieldRead1509_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1509_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1509_34(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1150900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1150908_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f6b0c7487a1747df88d5(net.minecraft.entity.Entity a0, moom.DT a1) throws E;
private static final class __SourceHandler_f6b0c7487a1747df88d5 {

public static void f1510(net.minecraft.entity.Entity receiver, moom.DT p0) throws Throwable {
    int forwardValue1510_22_0;
    moom.fH forwardValue1510_50_0;
    double forwardValue1510_53_0;
    double forwardValue1510_64_0;
    double forwardValue1510_74_0;
    double forwardValue1510_75_0;
    int forwardValue1510_75_1;
    net.minecraft.entity.Entity forwardValue1510_116_0;
    int spill1510_0;
    net.minecraft.entity.Entity spill1510_1;
    moom.fH spill1510_2;
    double spill1510_3;
    long life2_3;
    int life4_5;
    moom.fH life5_51;
    double life6_73;
    double life8_86;
    double life8_109;
    double life10_126;
    forward_join_118: {
    forward_join_116: {
    forward_join_115: {
    forward_join_75: {
    forward_join_74: {
    forward_join_64: {
    forward_join_62: {
    forward_join_53: {
    forward_join_50: {
    forward_join_49: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (__fieldRead1510_0() ^ 91097868147539L);
    life4_5 = __call1510_1();
    spill1510_0 = __fieldRead1510_2(receiver);
    if (!((life4_5 != 0))) {
        forwardValue1510_22_0 = spill1510_0;
        break forward_join_22;
    }
    if (!((spill1510_0 > 0))) {
        break forward_join_17;
    }
    __fieldWrite1510_4(receiver, __call1510_3(receiver));
    if (!((life4_5 == 0))) {
        break forward_join_118;
    }
    }
    spill1510_1 = receiver;
    if (!((life4_5 != 0))) {
        forwardValue1510_116_0 = spill1510_1;
        break forward_join_116;
    }
    forwardValue1510_22_0 = __integerCategory1510_7(__fieldRead1510_6(__fieldRead1510_5(spill1510_1)));
    }
    if (!((forwardValue1510_22_0 == 0))) {
        break forward_join_115;
    }
    if (!((!__call1510_9(p0, __fieldRead1510_8(receiver))))) {
        break forward_join_115;
    }
    __fieldWrite1510_10(receiver, p0);
    life5_51 = __call1510_13(__fieldRead1510_11(), __fieldRead1510_12(receiver), p0);
    spill1510_2 = life5_51;
    if (!((life4_5 != 0))) {
        forwardValue1510_50_0 = spill1510_2;
        break forward_join_50;
    }
    if (!((__call1510_15(__call1510_14(spill1510_2)) == __fieldRead1510_16()))) {
        break forward_join_49;
    }
    forwardValue1510_53_0 = ((double) __call1510_18(__call1510_17(life5_51)));
    break forward_join_53;
    }
    forwardValue1510_50_0 = life5_51;
    }
    forwardValue1510_53_0 = ((double) __call1510_20(__call1510_19(forwardValue1510_50_0)));
    }
    life6_73 = forwardValue1510_53_0;
    if (!((__call1510_22(__call1510_21(life5_51)) == __fieldRead1510_23()))) {
        break forward_join_62;
    }
    forwardValue1510_64_0 = __fieldRead1510_24(receiver);
    break forward_join_64;
    }
    forwardValue1510_64_0 = __fieldRead1510_25(receiver);
    }
    life8_86 = forwardValue1510_64_0;
    spill1510_3 = life8_86;
    if (!((__call1510_28(__call1510_27(__call1510_26(life5_51))) == __fieldRead1510_29()))) {
        forwardValue1510_74_0 = spill1510_3;
        break forward_join_74;
    }
    forwardValue1510_75_0 = spill1510_3;
    forwardValue1510_75_1 = 1;
    break forward_join_75;
    }
    forwardValue1510_75_0 = forwardValue1510_74_0;
    forwardValue1510_75_1 = 0;
    }
    life8_109 = __call1510_32(__call1510_31((forwardValue1510_75_0 - ((double) forwardValue1510_75_1)), life6_73, (life6_73 - ((double) __call1510_30(life5_51)))));
    life10_126 = __call1510_39((__fieldRead1510_33(receiver) - 0x1.0p0d), ((double) __call1510_35(__call1510_34(life5_51))), ((double) (__call1510_37(__call1510_36(life5_51)) - __call1510_38(life5_51))));
    __fieldWrite1510_40(receiver, new moom.DR(life8_109, life10_126, 0x0.0p0d));
    __fieldWrite1510_42(receiver, __call1510_41(life5_51));
    }
    forwardValue1510_116_0 = receiver;
    }
    __fieldWrite1510_43(forwardValue1510_116_0, 1);
    }
    return;
}
public static void h1510_0(moom.Oo p0) throws Throwable {
    throw __call1151000_0(p0);
}
public static void h1510_1(moom.Oo p0) throws Throwable {
    throw __call1151001_0(p0);
}
public static void h1510_2(moom.Oo p0) throws Throwable {
    throw __call1151002_0(p0);
}
public static void h1510_3(moom.Oo p0) throws Throwable {
    throw __call1151003_0(p0);
}
public static void h1510_4(moom.Oo p0) throws Throwable {
    throw __call1151004_0(p0);
}
public static void h1510_5(moom.Oo p0) throws Throwable {
    throw __call1151005_0(p0);
}
public static void h1510_6(moom.Oo p0) throws Throwable {
    throw __call1151006_0(p0);
}
public static void h1510_7(moom.Oo p0) throws Throwable {
    throw __call1151007_0(p0);
}
public static void h1510_8(moom.Oo p0) throws Throwable {
    throw __call1151008_0(p0);
}
private static native long __fieldRead1510_0() throws Throwable;
private static native int __call1510_1() throws Throwable;
private static native int __fieldRead1510_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1510_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1510_4(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1510_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead1510_6(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1510_7(boolean value) throws Throwable;
private static native moom.DT __fieldRead1510_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1510_9(moom.DT a0, moom.DT a1) throws Throwable;
private static native void __fieldWrite1510_10(net.minecraft.entity.Entity a0, moom.DT a1) throws Throwable;
private static native moom.cr __fieldRead1510_11() throws Throwable;
private static native net.minecraft.world.World __fieldRead1510_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.fH __call1510_13(moom.cr a0, net.minecraft.world.World a1, moom.DT a2) throws Throwable;
private static native moom.bs __call1510_14(moom.fH a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __call1510_15(moom.bs a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead1510_16() throws Throwable;
private static native moom.DT __call1510_17(moom.fH a0) throws Throwable;
private static native int __call1510_18(moom.DT a0) throws Throwable;
private static native moom.DT __call1510_19(moom.fH a0) throws Throwable;
private static native int __call1510_20(moom.DT a0) throws Throwable;
private static native moom.bs __call1510_21(moom.fH a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __call1510_22(moom.bs a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead1510_23() throws Throwable;
private static native double __fieldRead1510_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1510_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.bs __call1510_26(moom.fH a0) throws Throwable;
private static native moom.bs __call1510_27(moom.bs a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection __call1510_28(moom.bs a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection __fieldRead1510_29() throws Throwable;
private static native int __call1510_30(moom.fH a0) throws Throwable;
private static native double __call1510_31(double a0, double a1, double a2) throws Throwable;
private static native double __call1510_32(double a0) throws Throwable;
private static native double __fieldRead1510_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call1510_34(moom.fH a0) throws Throwable;
private static native int __call1510_35(moom.DT a0) throws Throwable;
private static native moom.DT __call1510_36(moom.fH a0) throws Throwable;
private static native int __call1510_37(moom.DT a0) throws Throwable;
private static native int __call1510_38(moom.fH a0) throws Throwable;
private static native double __call1510_39(double a0, double a1, double a2) throws Throwable;
private static native void __fieldWrite1510_40(net.minecraft.entity.Entity a0, moom.DR a1) throws Throwable;
private static native moom.bs __call1510_41(moom.fH a0) throws Throwable;
private static native void __fieldWrite1510_42(net.minecraft.entity.Entity a0, moom.bs a1) throws Throwable;
private static native void __fieldWrite1510_43(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1151000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151008_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0f2ed5bb6f98e79d4643(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_0f2ed5bb6f98e79d4643 {

public static void f1511(net.minecraft.entity.Entity receiver, net.minecraft.entity.Entity p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1511_17_0;
    net.minecraft.entity.Entity forwardValue1511_17_1;
    net.minecraft.entity.Entity forwardValue1511_19_0;
    int forwardValue1511_27_0;
    net.minecraft.entity.Entity forwardValue1511_29_0;
    double forwardValue1511_64_0;
    double forwardValue1511_64_1;
    double forwardValue1511_104_0;
    double forwardValue1511_104_1;
    net.minecraft.entity.Entity forwardValue1511_120_0;
    net.minecraft.entity.Entity forwardValue1511_124_0;
    net.minecraft.entity.Entity spill1511_0;
    net.minecraft.entity.Entity spill1511_1;
    net.minecraft.entity.Entity spill1511_2;
    boolean spill1511_3;
    net.minecraft.entity.Entity spill1511_4;
    double spill1511_5;
    double spill1511_6;
    double spill1511_7;
    double spill1511_8;
    net.minecraft.entity.Entity spill1511_9;
    long life2_3;
    int life4_5;
    double life5_51;
    double life7_57;
    double life9_61;
    double life9_74;
    double life11_86;
    double life5_101;
    double life7_105;
    double life5_109;
    double life7_113;
    double life7_129;
    forward_join_128: {
    forward_join_124: {
    forward_join_120: {
    forward_join_118: {
    forward_join_104: {
    forward_join_74: {
    forward_join_64: {
    forward_join_29: {
    forward_join_27: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (__fieldRead1511_0() ^ 23460286884637L);
    life4_5 = __call1511_1();
    spill1511_0 = __fieldRead1511_2(p0);
    spill1511_1 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue1511_17_0 = spill1511_0;
        forwardValue1511_17_1 = spill1511_1;
        break forward_join_17;
    }
    if (!((spill1511_0 != spill1511_1))) {
        break forward_join_128;
    }
    spill1511_2 = __fieldRead1511_3(p0);
    if (!((life4_5 == 0))) {
        forwardValue1511_19_0 = spill1511_2;
        break forward_join_19;
    }
    forwardValue1511_17_0 = spill1511_2;
    forwardValue1511_17_1 = receiver;
    }
    if (!((forwardValue1511_17_0 != forwardValue1511_17_1))) {
        break forward_join_128;
    }
    forwardValue1511_19_0 = p0;
    }
    spill1511_3 = __fieldRead1511_4(forwardValue1511_19_0);
    if (!((life4_5 == 0))) {
        forwardValue1511_27_0 = __integerCategory1511_5(spill1511_3);
        break forward_join_27;
    }
    if (!((!spill1511_3))) {
        break forward_join_128;
    }
    spill1511_4 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue1511_29_0 = spill1511_4;
        break forward_join_29;
    }
    forwardValue1511_27_0 = __integerCategory1511_7(__fieldRead1511_6(spill1511_4));
    }
    if (!((forwardValue1511_27_0 == 0))) {
        break forward_join_128;
    }
    forwardValue1511_29_0 = p0;
    }
    life5_51 = (__fieldRead1511_8(forwardValue1511_29_0) - __fieldRead1511_9(receiver));
    life7_57 = (__fieldRead1511_10(p0) - __fieldRead1511_11(receiver));
    life9_61 = __call1511_12(life5_51, life7_57);
    spill1511_5 = life9_61;
    spill1511_6 = 0x1.47ae14p-7d;
    if (!((life4_5 == 0))) {
        forwardValue1511_64_0 = spill1511_5;
        forwardValue1511_64_1 = spill1511_6;
        break forward_join_64;
    }
    if (!((__numericCompare1511_13(spill1511_5, spill1511_6) >= 0))) {
        break forward_join_128;
    }
    life9_74 = ((double) __call1511_14(life9_61));
    life5_51 = (life5_51 / life9_74);
    life7_57 = (life7_57 / life9_74);
    forwardValue1511_64_0 = 0x1.0p0d;
    forwardValue1511_64_1 = life9_74;
    }
    life11_86 = (forwardValue1511_64_0 / forwardValue1511_64_1);
    spill1511_7 = life11_86;
    spill1511_8 = 0x1.0p0d;
    if (!((life4_5 == 0))) {
        forwardValue1511_104_0 = spill1511_7;
        forwardValue1511_104_1 = spill1511_8;
        break forward_join_104;
    }
    if (!((__numericCompare1511_15(spill1511_7, spill1511_8) > 0))) {
        break forward_join_74;
    }
    life11_86 = 0x1.0p0d;
    }
    life5_101 = (life5_51 * life11_86);
    life7_105 = (life7_57 * life11_86);
    life5_109 = (life5_101 * 0x1.99999ap-5d);
    life7_113 = (life7_105 * 0x1.99999ap-5d);
    life5_51 = (life5_109 * ((double) (0x1.0p0f - __fieldRead1511_16(receiver))));
    forwardValue1511_104_0 = life7_113;
    forwardValue1511_104_1 = ((double) (0x1.0p0f - __fieldRead1511_17(receiver)));
    }
    life7_129 = (forwardValue1511_104_0 * forwardValue1511_104_1);
    spill1511_9 = __fieldRead1511_18(receiver);
    if (!((life4_5 == 0))) {
        forwardValue1511_120_0 = spill1511_9;
        break forward_join_120;
    }
    if (!((spill1511_9 == null))) {
        break forward_join_118;
    }
    __call1511_19(receiver, (-life5_51), 0x0.0p0d, (-life7_129));
    }
    forwardValue1511_120_0 = __fieldRead1511_20(p0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1511_124_0 = forwardValue1511_120_0;
        break forward_join_124;
    }
    if (!((forwardValue1511_120_0 == null))) {
        break forward_join_128;
    }
    forwardValue1511_124_0 = p0;
    }
    __call1511_21(forwardValue1511_124_0, life5_51, 0x0.0p0d, life7_129);
    }
    return;
}
public static void h1511_0(moom.Oo p0) throws Throwable {
    throw __call1151100_0(p0);
}
public static void h1511_1(moom.Oo p0) throws Throwable {
    throw __call1151101_0(p0);
}
public static void h1511_2(moom.Oo p0) throws Throwable {
    throw __call1151102_0(p0);
}
public static void h1511_3(moom.Oo p0) throws Throwable {
    throw __call1151103_0(p0);
}
public static void h1511_4(moom.Oo p0) throws Throwable {
    throw __call1151104_0(p0);
}
public static void h1511_5(moom.Oo p0) throws Throwable {
    throw __call1151105_0(p0);
}
public static void h1511_6(moom.Oo p0) throws Throwable {
    throw __call1151106_0(p0);
}
public static void h1511_7(moom.Oo p0) throws Throwable {
    throw __call1151107_0(p0);
}
public static void h1511_8(moom.Oo p0) throws Throwable {
    throw __call1151108_0(p0);
}
public static void h1511_9(moom.Oo p0) throws Throwable {
    throw __call1151109_0(p0);
}
public static void h1511_10(moom.Oo p0) throws Throwable {
    throw __call1151110_0(p0);
}
private static native long __fieldRead1511_0() throws Throwable;
private static native int __call1511_1() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1511_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1511_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead1511_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1511_5(boolean value) throws Throwable;
private static native boolean __fieldRead1511_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1511_7(boolean value) throws Throwable;
private static native double __fieldRead1511_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1511_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1511_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1511_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1511_12(double a0, double a1) throws Throwable;
private static native int __numericCompare1511_13(double a0, double a1) throws Throwable;
private static native float __call1511_14(double a0) throws Throwable;
private static native int __numericCompare1511_15(double a0, double a1) throws Throwable;
private static native float __fieldRead1511_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1511_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1511_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1511_19(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1511_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1511_21(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1151100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151110_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3400df0489785c82a395(net.minecraft.entity.Entity a0, boolean a1) throws E;
private static final class __SourceHandler_3400df0489785c82a395 {

public static void f1512(net.minecraft.entity.Entity receiver, boolean p0) throws Throwable {
    net.minecraft.entity.DataWatcher forwardValue1512_14_0;
    int forwardValue1512_14_1;
    int forwardValue1512_14_2;
    net.minecraft.entity.DataWatcher forwardValue1512_15_0;
    int forwardValue1512_15_1;
    net.minecraft.entity.DataWatcher forwardValue1512_16_0;
    int forwardValue1512_16_1;
    int forwardValue1512_16_2;
    net.minecraft.entity.DataWatcher spill1512_0;
    int spill1512_1;
    boolean spill1512_2;
    long life2_3;
    int life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead1512_0() ^ 110815708687544L);
    life4_5 = __call1512_1();
    spill1512_0 = __fieldRead1512_2(receiver);
    spill1512_1 = 4;
    spill1512_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1512_14_0 = spill1512_0;
        forwardValue1512_14_1 = spill1512_1;
        forwardValue1512_14_2 = __integerCategory1512_3(spill1512_2);
        break forward_join_14;
    }
    if (!(spill1512_2)) {
        forwardValue1512_15_0 = spill1512_0;
        forwardValue1512_15_1 = spill1512_1;
        break forward_join_15;
    }
    forwardValue1512_14_0 = spill1512_0;
    forwardValue1512_14_1 = spill1512_1;
    forwardValue1512_14_2 = 1;
    }
    forwardValue1512_16_0 = forwardValue1512_14_0;
    forwardValue1512_16_1 = forwardValue1512_14_1;
    forwardValue1512_16_2 = forwardValue1512_14_2;
    break forward_join_16;
    }
    forwardValue1512_16_0 = forwardValue1512_15_0;
    forwardValue1512_16_1 = forwardValue1512_15_1;
    forwardValue1512_16_2 = 0;
    }
    __call1512_5(forwardValue1512_16_0, forwardValue1512_16_1, __call1512_4(((byte) forwardValue1512_16_2)));
    return;
}
public static void h1512_0(moom.Oo p0) throws Throwable {
    throw __call1151200_0(p0);
}
private static native long __fieldRead1512_0() throws Throwable;
private static native int __call1512_1() throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1512_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1512_3(boolean value) throws Throwable;
private static native java.lang.Byte __call1512_4(byte a0) throws Throwable;
private static native void __call1512_5(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Byte a2) throws Throwable;
private static native java.lang.Throwable __call1151200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.v3 __sourceHandlerCall_514261564d09ce7f51d6(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_514261564d09ce7f51d6 {

public static moom.v3 f2752(net.minecraft.entity.Entity receiver) throws Throwable {
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_8;
    java.lang.String life5_11;
    int life3_12;
    life1_3 = (__fieldRead2752_0() ^ 49925846035388L);
    int spill2752_0 = __call2752_1();
    life4_8 = new net.minecraft.nbt.NBTTagCompound();
    life5_11 = __call2752_2(receiver);
    life3_12 = spill2752_0;
    __call2752_5(life4_8, "id", __call2752_4(__call2752_3(receiver)));
    if ((life3_12 == 0)) {
        if ((life5_11 != null)) {
        __call2752_6(life4_8, "type", life5_11);
    }
        __call2752_8(life4_8, "name", __call2752_7(receiver));
    }
    return new moom.v3(__fieldRead2752_9(), new moom.CM(__call2752_10(life4_8)));
}
public static void h2752_0(moom.Oo p0) throws Throwable {
    throw __call1275200_0(p0);
}
public static void h2752_1(moom.Oo p0) throws Throwable {
    throw __call1275201_0(p0);
}
private static native long __fieldRead2752_0() throws Throwable;
private static native int __call2752_1() throws Throwable;
private static native java.lang.String __call2752_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.UUID __call2752_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call2752_4(java.util.UUID a0) throws Throwable;
private static native void __call2752_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2752_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call2752_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call2752_8(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __fieldRead2752_9() throws Throwable;
private static native java.lang.String __call2752_10(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Throwable __call1275200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1275201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_552f94f67d4065f060e3(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5) throws E;
private static final class __SourceHandler_552f94f67d4065f060e3 {

public static void f247(net.minecraft.entity.Entity receiver, double p0, double p1, double p2, float p3, float p4) throws Throwable {
    int forwardValue247_57_0;
    net.minecraft.entity.Entity spill247_0;
    double spill247_1;
    net.minecraft.entity.Entity spill247_2;
    double spill247_3;
    net.minecraft.entity.Entity spill247_4;
    double spill247_5;
    int spill247_6;
    net.minecraft.entity.Entity spill247_7;
    float spill247_8;
    net.minecraft.entity.Entity spill247_9;
    float spill247_10;
    int spill247_11;
    long life9_3;
    double life12_40;
    int life11_41;
    forward_join_64: {
    forward_join_57: {
    forward_join_54: {
    life9_3 = (__fieldRead247_0() ^ 119860341917894L);
    spill247_0 = receiver;
    net.minecraft.entity.Entity __stackOp247_1_0 = receiver;
    double __stackOp247_1_1 = p0;
    spill247_1 = __stackOp247_1_1;
    __fieldWrite247_2(__stackOp247_1_0, __stackOp247_1_1);
    __fieldWrite247_3(spill247_0, spill247_1);
    spill247_2 = receiver;
    net.minecraft.entity.Entity __stackOp247_4_0 = receiver;
    double __stackOp247_4_1 = p1;
    spill247_3 = __stackOp247_4_1;
    __fieldWrite247_5(__stackOp247_4_0, __stackOp247_4_1);
    __fieldWrite247_6(spill247_2, spill247_3);
    spill247_4 = receiver;
    net.minecraft.entity.Entity __stackOp247_7_0 = receiver;
    double __stackOp247_7_1 = p2;
    spill247_5 = __stackOp247_7_1;
    __fieldWrite247_8(__stackOp247_7_0, __stackOp247_7_1);
    __fieldWrite247_9(spill247_4, spill247_5);
    spill247_6 = __call247_10();
    spill247_7 = receiver;
    net.minecraft.entity.Entity __stackOp247_11_0 = receiver;
    float __stackOp247_11_1 = p3;
    spill247_8 = __stackOp247_11_1;
    __fieldWrite247_12(__stackOp247_11_0, __stackOp247_11_1);
    __fieldWrite247_13(spill247_7, spill247_8);
    spill247_9 = receiver;
    net.minecraft.entity.Entity __stackOp247_14_0 = receiver;
    float __stackOp247_14_1 = p4;
    spill247_10 = __stackOp247_14_1;
    __fieldWrite247_15(__stackOp247_14_0, __stackOp247_14_1);
    __fieldWrite247_16(spill247_9, spill247_10);
    life12_40 = ((double) (__fieldRead247_17(receiver) - p3));
    life11_41 = spill247_6;
    spill247_11 = __numericCompare247_18(life12_40, -0x1.68p7d);
    if (!((life11_41 == 0))) {
        forwardValue247_57_0 = spill247_11;
        break forward_join_57;
    }
    if (!((spill247_11 < 0))) {
        break forward_join_54;
    }
    net.minecraft.entity.Entity __stackOp247_19_0 = receiver;
    __fieldWrite247_21(__stackOp247_19_0, (__fieldRead247_20(__stackOp247_19_0) + 0x1.68p8f));
    }
    forwardValue247_57_0 = __numericCompare247_22(life12_40, 0x1.68p7d);
    }
    if (!((forwardValue247_57_0 >= 0))) {
        break forward_join_64;
    }
    net.minecraft.entity.Entity __stackOp247_23_0 = receiver;
    __fieldWrite247_25(__stackOp247_23_0, (__fieldRead247_24(__stackOp247_23_0) - 0x1.68p8f));
    }
    __call247_29(receiver, __fieldRead247_26(receiver), __fieldRead247_27(receiver), __fieldRead247_28(receiver));
    __call247_30(receiver, p3, p4);
    return;
}
public static void h247_0(moom.Oo p0) throws Throwable {
    throw __call1024700_0(p0);
}
public static void h247_1(moom.Oo p0) throws Throwable {
    throw __call1024701_0(p0);
}
public static void h247_2(moom.Oo p0) throws Throwable {
    throw __call1024702_0(p0);
}
private static native long __fieldRead247_0() throws Throwable;
private static native void __fieldWrite247_2(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite247_3(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite247_5(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite247_6(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite247_8(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite247_9(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native int __call247_10() throws Throwable;
private static native void __fieldWrite247_12(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite247_13(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite247_15(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite247_16(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead247_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare247_18(double a0, double a1) throws Throwable;
private static native float __fieldRead247_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite247_21(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native int __numericCompare247_22(double a0, double a1) throws Throwable;
private static native float __fieldRead247_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite247_25(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native double __fieldRead247_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead247_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead247_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call247_29(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native void __call247_30(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native java.lang.Throwable __call1024700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_6d178a1c188536e194cf(net.minecraft.entity.Entity a0, float a1) throws E;
private static final class __SourceHandler_6d178a1c188536e194cf {

public static moom.DR f2754(net.minecraft.entity.Entity receiver, float p0) throws Throwable {
    long life2_3;
    double life4_35;
    double life6_51;
    double life8_63;
    life2_3 = (__fieldRead2754_0() ^ 119725832936953L);
    if ((p0 == 0x1.0p0f)) {
        return new moom.DR(__fieldRead2754_1(receiver), (__fieldRead2754_2(receiver) + ((double) __call2754_3(receiver))), __fieldRead2754_4(receiver));
    }
    life4_35 = (__fieldRead2754_5(receiver) + ((__fieldRead2754_6(receiver) - __fieldRead2754_7(receiver)) * ((double) p0)));
    life6_51 = ((__fieldRead2754_8(receiver) + ((__fieldRead2754_9(receiver) - __fieldRead2754_10(receiver)) * ((double) p0))) + ((double) __call2754_11(receiver)));
    life8_63 = (__fieldRead2754_12(receiver) + ((__fieldRead2754_13(receiver) - __fieldRead2754_14(receiver)) * ((double) p0)));
    return new moom.DR(life4_35, life6_51, life8_63);
}
public static void h2754_0(moom.Oo p0) throws Throwable {
    throw __call1275400_0(p0);
}
private static native long __fieldRead2754_0() throws Throwable;
private static native double __fieldRead2754_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call2754_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call2754_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2754_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Throwable __call1275400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_473f5a8a968ab9ab993f(net.minecraft.entity.Entity a0, int a1) throws E;
private static final class __SourceHandler_473f5a8a968ab9ab993f {

public static void f1513(net.minecraft.entity.Entity receiver, int p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1513_25_0;
    int spill1513_0;
    net.minecraft.entity.Entity spill1513_1;
    long life2_3;
    int life5_12;
    int life4_13;
    int life5_17;
    forward_join_27: {
    forward_join_25: {
    life2_3 = (__fieldRead1513_0() ^ 45107810737452L);
    spill1513_0 = __call1513_1();
    life5_12 = (p0 * __invokedynamic1513_2(21087, (107959559557021233L ^ life2_3)));
    life4_13 = spill1513_0;
    life5_17 = __call1513_3(receiver, life5_12);
    spill1513_1 = receiver;
    if (!((life4_13 == 0))) {
        forwardValue1513_25_0 = spill1513_1;
        break forward_join_25;
    }
    if (!((__fieldRead1513_4(spill1513_1) < life5_17))) {
        break forward_join_27;
    }
    forwardValue1513_25_0 = receiver;
    }
    __fieldWrite1513_5(forwardValue1513_25_0, life5_17);
    }
    return;
}
public static void h1513_0(moom.Oo p0) throws Throwable {
    throw __call1151300_0(p0);
}
public static void h1513_1(moom.Oo p0) throws Throwable {
    throw __call1151301_0(p0);
}
private static native long __fieldRead1513_0() throws Throwable;
private static native int __call1513_1() throws Throwable;
private static native int __invokedynamic1513_2(int a0, long a1) throws Throwable;
private static native int __call1513_3(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead1513_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1513_5(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1151300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d47a85f64f1fac2da2cb(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_d47a85f64f1fac2da2cb {

public static void f1514(net.minecraft.entity.Entity receiver, net.minecraft.entity.Entity p0) throws Throwable {
    net.minecraft.entity.Entity lexicalValue1514_47_0;
    net.minecraft.entity.Entity lexicalValue1514_53_0;
    net.minecraft.entity.Entity lexicalValue1514_61_0;
    net.minecraft.entity.Entity lexicalValue1514_79_0;
    net.minecraft.entity.Entity lexicalValue1514_86_0;
    net.minecraft.entity.Entity lexicalValue1514_87_0;
    net.minecraft.entity.Entity lexicalValue1514_87_1;
    int spill1514_0;
    net.minecraft.entity.Entity spill1514_1;
    net.minecraft.entity.Entity spill1514_2;
    net.minecraft.entity.Entity spill1514_3;
    net.minecraft.entity.Entity spill1514_4;
    long life2_3;
    int life4_8;
    net.minecraft.entity.Entity life5_90;
    lexical_join_88: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_82: {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_47: {
    lexical_join_46: {
    life2_3 = (__fieldRead1514_0() ^ 90318449167909L);
    spill1514_0 = __call1514_1();
    __fieldWrite1514_2(receiver, 0x0.0p0d);
    life4_8 = spill1514_0;
    __fieldWrite1514_3(receiver, 0x0.0p0d);
    spill1514_1 = p0;
    if (!((life4_8 != 0))) {
        lexicalValue1514_53_0 = spill1514_1;
        break lexical_join_53;
    }
    if (!((spill1514_1 == null))) {
        break lexical_join_51;
    }
    spill1514_2 = __fieldRead1514_4(receiver);
    if (!((life4_8 != 0))) {
        lexicalValue1514_47_0 = spill1514_2;
        break lexical_join_47;
    }
    if (!((spill1514_2 != null))) {
        break lexical_join_46;
    }
    __call1514_16(receiver, __fieldRead1514_6(__fieldRead1514_5(receiver)), (__fieldRead1514_9(__call1514_8(__fieldRead1514_7(receiver))) + ((double) __fieldRead1514_11(__fieldRead1514_10(receiver)))), __fieldRead1514_13(__fieldRead1514_12(receiver)), __fieldRead1514_14(receiver), __fieldRead1514_15(receiver));
    __fieldWrite1514_18(__fieldRead1514_17(receiver), null);
    }
    lexicalValue1514_47_0 = receiver;
    }
    __fieldWrite1514_19(lexicalValue1514_47_0, null);
    if (!((life4_8 == 0))) {
        break lexical_join_88;
    }
    }
    lexicalValue1514_53_0 = __fieldRead1514_20(receiver);
    }
    if (!((life4_8 != 0))) {
        lexicalValue1514_61_0 = lexicalValue1514_53_0;
        break lexical_join_61;
    }
    if (!((lexicalValue1514_53_0 != null))) {
        break lexical_join_60;
    }
    __fieldWrite1514_22(__fieldRead1514_21(receiver), null);
    }
    lexicalValue1514_61_0 = p0;
    }
    if (!((life4_8 != 0))) {
        lexicalValue1514_86_0 = lexicalValue1514_61_0;
        break lexical_join_86;
    }
    if (!((lexicalValue1514_61_0 != null))) {
        break lexical_join_82;
    }
    life5_90 = __fieldRead1514_23(p0);
    lexical_cycle_67: while (true) {
    lexical_join_79: {
    lexical_join_77: {
    if (!((life5_90 != null))) {
        break lexical_join_82;
    }
    spill1514_3 = life5_90;
    if (!((life4_8 != 0))) {
        lexicalValue1514_79_0 = spill1514_3;
        break lexical_join_79;
    }
    spill1514_4 = receiver;
    if (!((life4_8 != 0))) {
        lexicalValue1514_87_0 = spill1514_3;
        lexicalValue1514_87_1 = spill1514_4;
        break lexical_join_87;
    }
    if (!((spill1514_3 == spill1514_4))) {
        break lexical_join_77;
    }
    return;
    }
    lexicalValue1514_79_0 = __fieldRead1514_24(life5_90);
    }
    life5_90 = lexicalValue1514_79_0;
    if (!((life4_8 == 0))) { continue lexical_cycle_67; }
    break lexical_cycle_67;
    }
    }
    __fieldWrite1514_25(receiver, p0);
    lexicalValue1514_86_0 = p0;
    }
    lexicalValue1514_87_0 = lexicalValue1514_86_0;
    lexicalValue1514_87_1 = receiver;
    }
    __fieldWrite1514_26(lexicalValue1514_87_0, lexicalValue1514_87_1);
    }
    return;
}
public static void h1514_0(moom.Oo p0) throws Throwable {
    throw __call1151400_0(p0);
}
public static void h1514_1(moom.Oo p0) throws Throwable {
    throw __call1151401_0(p0);
}
public static void h1514_2(moom.Oo p0) throws Throwable {
    throw __call1151402_0(p0);
}
public static void h1514_3(moom.Oo p0) throws Throwable {
    throw __call1151403_0(p0);
}
public static void h1514_4(moom.Oo p0) throws Throwable {
    throw __call1151404_0(p0);
}
public static void h1514_5(moom.Oo p0) throws Throwable {
    throw __call1151405_0(p0);
}
public static void h1514_6(moom.Oo p0) throws Throwable {
    throw __call1151406_0(p0);
}
public static void h1514_7(moom.Oo p0) throws Throwable {
    throw __call1151407_0(p0);
}
public static void h1514_8(moom.Oo p0) throws Throwable {
    throw __call1151408_0(p0);
}
public static void h1514_9(moom.Oo p0) throws Throwable {
    throw __call1151409_0(p0);
}
private static native long __fieldRead1514_0() throws Throwable;
private static native int __call1514_1() throws Throwable;
private static native void __fieldWrite1514_2(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1514_3(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1514_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1514_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1514_9(moom.CA a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1514_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1514_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1514_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1514_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1514_16(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1514_18(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite1514_19(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1514_22(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1514_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1514_25(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __fieldWrite1514_26(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Throwable __call1151400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151409_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f34c90c6c594e9fbd74c(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_f34c90c6c594e9fbd74c {

public static void f646(net.minecraft.entity.Entity receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    int forestValue646_60_0;
    int forestValue646_71_0;
    int forestValue646_173_0;
    int forestValue646_207_0;
    int forestValue646_238_0;
    int forestValue646_274_0;
    net.minecraft.entity.Entity forestValue646_276_0;
    int spill646_0;
    net.minecraft.entity.Entity spill646_1;
    net.minecraft.entity.Entity spill646_2;
    double spill646_3;
    double spill646_4;
    net.minecraft.entity.Entity spill646_5;
    net.minecraft.entity.Entity spill646_6;
    double spill646_7;
    double spill646_8;
    net.minecraft.entity.Entity spill646_9;
    net.minecraft.entity.Entity spill646_10;
    double spill646_11;
    double spill646_12;
    net.minecraft.entity.Entity spill646_13;
    float spill646_14;
    net.minecraft.entity.Entity spill646_15;
    float spill646_16;
    boolean spill646_17;
    int spill646_18;
    net.minecraft.entity.Entity spill646_19;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagList life5_14;
    net.minecraft.nbt.NBTTagList life6_23;
    net.minecraft.nbt.NBTTagList life7_28;
    forest_join_283: {
    forest_join_276: {
    forest_join_274: {
    forest_join_253: {
    forest_join_238: {
    forest_join_216: {
    forest_join_207: {
    forest_join_199: {
    forest_join_173: {
    forest_join_77: {
    forest_join_71: {
    forest_join_66: {
    forest_join_60: {
    forest_join_55: {
    life2_3 = (__fieldRead646_0() ^ 61343968973638L);
    life4_5 = __call646_1();
    life5_14 = __call646_3(p0, "Pos", __invokedynamic646_2(14200, (3769519811613775222L ^ life2_3)));
    life6_23 = __call646_5(p0, "Motion", __invokedynamic646_4(14200, (3769519811613775222L ^ life2_3)));
    life7_28 = __call646_6(p0, "Rotation", 5);
    __fieldWrite646_8(receiver, __call646_7(life6_23, 0));
    __fieldWrite646_10(receiver, __call646_9(life6_23, 1));
    __fieldWrite646_12(receiver, __call646_11(life6_23, 2));
    spill646_0 = __numericCompare646_15(__call646_14(__fieldRead646_13(receiver)), 0x1.4p3d);
    if (!((life4_5 != 0))) {
        forestValue646_60_0 = spill646_0;
        break forest_join_60;
    }
    if (!((spill646_0 > 0))) {
        break forest_join_55;
    }
    __fieldWrite646_16(receiver, 0x0.0p0d);
    }
    forestValue646_60_0 = __numericCompare646_19(__call646_18(__fieldRead646_17(receiver)), 0x1.4p3d);
    }
    if (!((life4_5 != 0))) {
        forestValue646_71_0 = forestValue646_60_0;
        break forest_join_71;
    }
    if (!((forestValue646_60_0 > 0))) {
        break forest_join_66;
    }
    __fieldWrite646_20(receiver, 0x0.0p0d);
    }
    forestValue646_71_0 = __numericCompare646_23(__call646_22(__fieldRead646_21(receiver)), 0x1.4p3d);
    }
    if (!((life4_5 != 0))) {
        forestValue646_173_0 = forestValue646_71_0;
        break forest_join_173;
    }
    if (!((forestValue646_71_0 > 0))) {
        break forest_join_77;
    }
    __fieldWrite646_24(receiver, 0x0.0p0d);
    }
    spill646_1 = receiver;
    spill646_2 = receiver;
    net.minecraft.entity.Entity __stackOp646_26_0 = receiver;
    double __stackOp646_26_1 = __call646_25(life5_14, 0);
    spill646_3 = __stackOp646_26_1;
    __fieldWrite646_27(__stackOp646_26_0, __stackOp646_26_1);
    net.minecraft.entity.Entity __stackOp646_28_0 = spill646_2;
    double __stackOp646_28_1 = spill646_3;
    spill646_4 = __stackOp646_28_1;
    __fieldWrite646_29(__stackOp646_28_0, __stackOp646_28_1);
    __fieldWrite646_30(spill646_1, spill646_4);
    spill646_5 = receiver;
    spill646_6 = receiver;
    net.minecraft.entity.Entity __stackOp646_32_0 = receiver;
    double __stackOp646_32_1 = __call646_31(life5_14, 1);
    spill646_7 = __stackOp646_32_1;
    __fieldWrite646_33(__stackOp646_32_0, __stackOp646_32_1);
    net.minecraft.entity.Entity __stackOp646_34_0 = spill646_6;
    double __stackOp646_34_1 = spill646_7;
    spill646_8 = __stackOp646_34_1;
    __fieldWrite646_35(__stackOp646_34_0, __stackOp646_34_1);
    __fieldWrite646_36(spill646_5, spill646_8);
    spill646_9 = receiver;
    spill646_10 = receiver;
    net.minecraft.entity.Entity __stackOp646_38_0 = receiver;
    double __stackOp646_38_1 = __call646_37(life5_14, 2);
    spill646_11 = __stackOp646_38_1;
    __fieldWrite646_39(__stackOp646_38_0, __stackOp646_38_1);
    net.minecraft.entity.Entity __stackOp646_40_0 = spill646_10;
    double __stackOp646_40_1 = spill646_11;
    spill646_12 = __stackOp646_40_1;
    __fieldWrite646_41(__stackOp646_40_0, __stackOp646_40_1);
    __fieldWrite646_42(spill646_9, spill646_12);
    spill646_13 = receiver;
    net.minecraft.entity.Entity __stackOp646_44_0 = receiver;
    float __stackOp646_44_1 = __call646_43(life7_28, 0);
    spill646_14 = __stackOp646_44_1;
    __fieldWrite646_45(__stackOp646_44_0, __stackOp646_44_1);
    __fieldWrite646_46(spill646_13, spill646_14);
    spill646_15 = receiver;
    net.minecraft.entity.Entity __stackOp646_48_0 = receiver;
    float __stackOp646_48_1 = __call646_47(life7_28, 1);
    spill646_16 = __stackOp646_48_1;
    __fieldWrite646_49(__stackOp646_48_0, __stackOp646_48_1);
    __fieldWrite646_50(spill646_15, spill646_16);
    __call646_52(receiver, __fieldRead646_51(receiver));
    __call646_54(receiver, __fieldRead646_53(receiver));
    __fieldWrite646_56(receiver, __call646_55(p0, "FallDistance"));
    __fieldWrite646_58(receiver, __call646_57(p0, "Fire"));
    __call646_60(receiver, __call646_59(p0, "Air"));
    __fieldWrite646_62(receiver, __call646_61(p0, "OnGround"));
    __fieldWrite646_64(receiver, __call646_63(p0, "Dimension"));
    __fieldWrite646_66(receiver, __call646_65(p0, "Invulnerable"));
    __fieldWrite646_68(receiver, __call646_67(p0, "PortalCooldown"));
    forestValue646_173_0 = __integerCategory646_70(__call646_69(p0, "UUIDMost", 4));
    }
    if (!((life4_5 != 0))) {
        forestValue646_207_0 = forestValue646_173_0;
        break forest_join_207;
    }
    if (!((forestValue646_173_0 != 0))) {
        break forest_join_199;
    }
    spill646_17 = __call646_71(p0, "UUIDLeast", 4);
    if (!((life4_5 != 0))) {
        forestValue646_207_0 = __integerCategory646_72(spill646_17);
        break forest_join_207;
    }
    if (!(spill646_17)) {
        break forest_join_199;
    }
    __fieldWrite646_75(receiver, new java.util.UUID(__call646_73(p0, "UUIDMost"), __call646_74(p0, "UUIDLeast")));
    if (!((life4_5 == 0))) {
        break forest_join_216;
    }
    __call646_76(new java.lang.String[4]);
    }
    forestValue646_207_0 = __integerCategory646_79(__call646_78(p0, "UUID", __invokedynamic646_77(22997, (396474111402130399L ^ life2_3))));
    }
    if (!((life4_5 != 0))) {
        forestValue646_238_0 = forestValue646_207_0;
        break forest_join_238;
    }
    if (!((forestValue646_207_0 != 0))) {
        break forest_join_216;
    }
    __fieldWrite646_82(receiver, __call646_81(__call646_80(p0, "UUID")));
    }
    __call646_86(receiver, __fieldRead646_83(receiver), __fieldRead646_84(receiver), __fieldRead646_85(receiver));
    __call646_89(receiver, __fieldRead646_87(receiver), __fieldRead646_88(receiver));
    forestValue646_238_0 = __integerCategory646_92(__call646_91(p0, "CustomName", __invokedynamic646_90(22997, (396474111402130399L ^ life2_3))));
    }
    if (!((life4_5 != 0))) {
        forestValue646_274_0 = forestValue646_238_0;
        break forest_join_274;
    }
    if (!((forestValue646_238_0 != 0))) {
        break forest_join_253;
    }
    spill646_18 = __call646_94(__call646_93(p0, "CustomName"));
    if (!((life4_5 != 0))) {
        forestValue646_274_0 = spill646_18;
        break forest_join_274;
    }
    if (!((spill646_18 > 0))) {
        break forest_join_253;
    }
    __call646_96(receiver, __call646_95(p0, "CustomName"));
    }
    __call646_98(receiver, __call646_97(p0, "CustomNameVisible"));
    __call646_100(__fieldRead646_99(receiver), p0);
    __call646_102(receiver, __call646_101(p0, "Silent"));
    __call646_103(receiver, p0);
    spill646_19 = receiver;
    if (!((life4_5 != 0))) {
        forestValue646_276_0 = spill646_19;
        break forest_join_276;
    }
    forestValue646_274_0 = __integerCategory646_105(__call646_104(spill646_19));
    }
    if (!((forestValue646_274_0 != 0))) {
        break forest_join_283;
    }
    forestValue646_276_0 = receiver;
    }
    __call646_109(forestValue646_276_0, __fieldRead646_106(receiver), __fieldRead646_107(receiver), __fieldRead646_108(receiver));
    }
    return;
}
public static void h646_0(java.lang.Throwable p0) throws Throwable {
    throw __call3064600_0(p0);
}
public static void h646_1(java.lang.Throwable p0) throws Throwable {
    throw __call3064601_0(p0);
}
public static void h646_2(java.lang.Throwable p0) throws Throwable {
    throw __call3064602_0(p0);
}
public static void h646_3(java.lang.Throwable p0) throws Throwable {
    throw __call3064603_0(p0);
}
public static void h646_4(java.lang.Throwable p0) throws Throwable {
    throw __call3064604_0(p0);
}
public static void h646_5(java.lang.Throwable p0) throws Throwable {
    throw __call3064605_0(p0);
}
public static void h646_6(java.lang.Throwable p0) throws Throwable {
    throw __call3064606_0(p0);
}
public static void h646_7(java.lang.Throwable p0) throws Throwable {
    throw __call3064607_0(p0);
}
public static void h646_8(java.lang.Throwable p0) throws Throwable {
    throw __call3064608_0(p0);
}
public static void h646_9(java.lang.Throwable p0) throws Throwable {
    throw __call3064609_0(p0);
}
public static void h646_10(java.lang.Throwable p0) throws Throwable {
    throw __call3064610_0(p0);
}
public static void h646_11(java.lang.Throwable p0) throws Throwable {
    throw __call3064611_0(p0);
}
public static void h646_12(java.lang.Throwable p0) throws Throwable {
    throw __call3064612_0(p0);
}
public static void h646_13(java.lang.Throwable p0) throws Throwable {
    throw __call3064613_0(p0);
}
public static void h646_14(java.lang.Throwable p0) throws Throwable {
    throw __call3064614_0(p0);
}
public static void h646_15(java.lang.Throwable p0) throws Throwable {
    throw __call3064615_0(p0);
}
public static void h646_16(java.lang.Throwable p0) throws Throwable {
    throw __call3064616_0(p0);
}
public static void h646_17(java.lang.Throwable p0) throws Throwable {
    throw __call3064617_0(p0);
}
public static void h646_18(java.lang.Throwable p0, net.minecraft.entity.Entity p1, net.minecraft.nbt.NBTTagList p2, net.minecraft.nbt.NBTTagList p3, net.minecraft.nbt.NBTTagList p4) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call3064618_0(life2_2, "Loading entity NBT");
    life4_10 = __call3064618_1(life3_6, "Entity being loaded");
    __call3064618_2(p1, life4_10);
    throw new moom.Oo(life3_6);
}
private static native long __fieldRead646_0() throws Throwable;
private static native int __call646_1() throws Throwable;
private static native int __invokedynamic646_2(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call646_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic646_4(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call646_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call646_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native double __call646_7(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_8(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __call646_9(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_10(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __call646_11(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_12(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead646_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call646_14(double a0) throws Throwable;
private static native int __numericCompare646_15(double a0, double a1) throws Throwable;
private static native void __fieldWrite646_16(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead646_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call646_18(double a0) throws Throwable;
private static native int __numericCompare646_19(double a0, double a1) throws Throwable;
private static native void __fieldWrite646_20(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead646_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call646_22(double a0) throws Throwable;
private static native int __numericCompare646_23(double a0, double a1) throws Throwable;
private static native void __fieldWrite646_24(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __call646_25(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_27(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite646_29(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite646_30(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __call646_31(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_33(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite646_35(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite646_36(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __call646_37(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_39(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite646_41(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite646_42(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native float __call646_43(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_45(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite646_46(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __call646_47(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native void __fieldWrite646_49(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite646_50(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead646_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call646_52(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead646_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call646_54(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __call646_55(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite646_56(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native short __call646_57(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite646_58(net.minecraft.entity.Entity a0, short a1) throws Throwable;
private static native short __call646_59(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call646_60(net.minecraft.entity.Entity a0, short a1) throws Throwable;
private static native boolean __call646_61(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite646_62(net.minecraft.entity.Entity a0, boolean a1) throws Throwable;
private static native int __call646_63(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite646_64(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __call646_65(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite646_66(net.minecraft.entity.Entity a0, boolean a1) throws Throwable;
private static native int __call646_67(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite646_68(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __call646_69(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory646_70(boolean value) throws Throwable;
private static native boolean __call646_71(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory646_72(boolean value) throws Throwable;
private static native long __call646_73(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native long __call646_74(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite646_75(net.minecraft.entity.Entity a0, java.util.UUID a1) throws Throwable;
private static native void __call646_76(java.lang.String[] a0) throws Throwable;
private static native int __invokedynamic646_77(int a0, long a1) throws Throwable;
private static native boolean __call646_78(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory646_79(boolean value) throws Throwable;
private static native java.lang.String __call646_80(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.util.UUID __call646_81(java.lang.String a0) throws Throwable;
private static native void __fieldWrite646_82(net.minecraft.entity.Entity a0, java.util.UUID a1) throws Throwable;
private static native double __fieldRead646_83(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead646_84(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead646_85(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call646_86(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native float __fieldRead646_87(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead646_88(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call646_89(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native int __invokedynamic646_90(int a0, long a1) throws Throwable;
private static native boolean __call646_91(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory646_92(boolean value) throws Throwable;
private static native java.lang.String __call646_93(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call646_94(java.lang.String a0) throws Throwable;
private static native java.lang.String __call646_95(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call646_96(net.minecraft.entity.Entity a0, java.lang.String a1) throws Throwable;
private static native boolean __call646_97(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call646_98(net.minecraft.entity.Entity a0, boolean a1) throws Throwable;
private static native moom.qN __fieldRead646_99(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call646_100(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __call646_101(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call646_102(net.minecraft.entity.Entity a0, boolean a1) throws Throwable;
private static native void __call646_103(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __call646_104(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory646_105(boolean value) throws Throwable;
private static native double __fieldRead646_106(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead646_107(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead646_108(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call646_109(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call3064600_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064601_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064602_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064603_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064604_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064605_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064606_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064607_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064608_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064609_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064610_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064611_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064612_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064613_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064614_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064615_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064616_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064617_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3064618_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3064618_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3064618_2(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3fef9cd8cda5aa8179be(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_3fef9cd8cda5aa8179be {

public static boolean f1515(net.minecraft.entity.Entity receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1515_26_0;
    int forwardValue1515_31_0;
    int spill1515_0;
    boolean spill1515_1;
    net.minecraft.entity.Entity spill1515_2;
    long life2_3;
    java.lang.String life5_7;
    int life4_8;
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    life2_3 = (__fieldRead1515_0() ^ 13021120825284L);
    spill1515_0 = __call1515_1();
    life5_7 = __call1515_2(receiver);
    life4_8 = spill1515_0;
    spill1515_1 = __fieldRead1515_3(receiver);
    if (!((life4_8 == 0))) {
        forwardValue1515_31_0 = __integerCategory1515_4(spill1515_1);
        break forward_join_31;
    }
    if (!((!spill1515_1))) {
        break forward_join_30;
    }
    if (!((life5_7 != null))) {
        break forward_join_30;
    }
    spill1515_2 = __fieldRead1515_5(receiver);
    if (!((life4_8 == 0))) {
        forwardValue1515_26_0 = spill1515_2;
        break forward_join_26;
    }
    if (!((spill1515_2 == null))) {
        break forward_join_30;
    }
    __call1515_6(p0, "id", life5_7);
    forwardValue1515_26_0 = receiver;
    }
    __call1515_7(forwardValue1515_26_0, p0);
    return __integerCategory1515_8(1);
    }
    forwardValue1515_31_0 = 0;
    }
    return __integerCategory1515_9(forwardValue1515_31_0);
}
public static void h1515_0(moom.Oo p0) throws Throwable {
    throw __call1151500_0(p0);
}
public static void h1515_1(moom.Oo p0) throws Throwable {
    throw __call1151501_0(p0);
}
public static void h1515_2(moom.Oo p0) throws Throwable {
    throw __call1151502_0(p0);
}
public static void h1515_3(moom.Oo p0) throws Throwable {
    throw __call1151503_0(p0);
}
public static void h1515_4(moom.Oo p0) throws Throwable {
    throw __call1151504_0(p0);
}
private static native long __fieldRead1515_0() throws Throwable;
private static native int __call1515_1() throws Throwable;
private static native java.lang.String __call1515_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead1515_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1515_4(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1515_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1515_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call1515_7(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __integerCategory1515_8(int value) throws Throwable;
private static native boolean __integerCategory1515_9(int value) throws Throwable;
private static native java.lang.Throwable __call1151500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e772adc77320832d3916(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws E;
private static final class __SourceHandler_e772adc77320832d3916 {

public static void f647(net.minecraft.entity.Entity receiver, double p0, double p1, double p2) throws Throwable {
    int forestValue647_46_0;
    net.minecraft.entity.Entity forestValue647_65_0;
    net.minecraft.entity.Entity forestValue647_100_0;
    int forestValue647_115_0;
    int forestValue647_120_0;
    int forestValue647_124_0;
    int forestValue647_126_0;
    int forestValue647_144_0;
    int forestValue647_149_0;
    int forestValue647_156_0;
    int forestValue647_201_0;
    double forestValue647_210_0;
    double forestValue647_210_1;
    int forestValue647_258_0;
    double forestValue647_267_0;
    double forestValue647_267_1;
    int forestValue647_274_0;
    int forestValue647_313_0;
    double forestValue647_322_0;
    double forestValue647_322_1;
    int forestValue647_333_0;
    int forestValue647_353_0;
    int forestValue647_376_0;
    double forestValue647_385_0;
    double forestValue647_385_1;
    int forestValue647_411_0;
    double forestValue647_420_0;
    double forestValue647_420_1;
    int forestValue647_455_0;
    int forestValue647_478_0;
    double forestValue647_487_0;
    double forestValue647_487_1;
    int forestValue647_513_0;
    double forestValue647_522_0;
    double forestValue647_522_1;
    net.minecraft.entity.Entity forestValue647_529_0;
    java.util.List forestValue647_538_0;
    int forestValue647_584_0;
    int forestValue647_588_0;
    int forestValue647_590_0;
    int forestValue647_661_0;
    int forestValue647_667_0;
    double forestValue647_929_0;
    double forestValue647_984_0;
    net.minecraft.entity.Entity forestValue647_1012_0;
    net.minecraft.entity.Entity forestValue647_1024_0;
    net.minecraft.entity.Entity forestValue647_1025_0;
    int forestValue647_1025_1;
    net.minecraft.entity.Entity forestValue647_1026_0;
    net.minecraft.entity.Entity forestValue647_1027_0;
    int forestValue647_1027_1;
    net.minecraft.entity.Entity forestValue647_1036_0;
    int forestValue647_1036_1;
    net.minecraft.entity.Entity forestValue647_1037_0;
    net.minecraft.entity.Entity forestValue647_1038_0;
    int forestValue647_1038_1;
    net.minecraft.entity.Entity forestValue647_1048_0;
    int forestValue647_1048_1;
    net.minecraft.entity.Entity forestValue647_1052_0;
    int forestValue647_1052_1;
    net.minecraft.entity.Entity forestValue647_1053_0;
    net.minecraft.entity.Entity forestValue647_1054_0;
    int forestValue647_1054_1;
    net.minecraft.entity.Entity forestValue647_1066_0;
    net.minecraft.entity.Entity forestValue647_1067_0;
    int forestValue647_1067_1;
    net.minecraft.entity.Entity forestValue647_1068_0;
    net.minecraft.entity.Entity forestValue647_1069_0;
    int forestValue647_1069_1;
    net.minecraft.block.Block forestValue647_1126_0;
    int forestValue647_1140_0;
    int forestValue647_1149_0;
    int forestValue647_1158_0;
    int forestValue647_1170_0;
    net.minecraft.block.Block forestValue647_1201_0;
    int forestValue647_1261_0;
    float forestValue647_1310_0;
    net.minecraft.entity.Entity forestValue647_1328_0;
    net.minecraft.entity.Entity forestValue647_1332_0;
    int forestValue647_1377_0;
    int forestValue647_1386_0;
    int forestValue647_1393_0;
    net.minecraft.entity.Entity forestValue647_1415_0;
    int spill647_0;
    int spill647_1;
    net.minecraft.entity.Entity spill647_2;
    net.minecraft.entity.Entity spill647_3;
    boolean spill647_4;
    int spill647_5;
    net.minecraft.entity.Entity spill647_6;
    boolean spill647_7;
    int spill647_8;
    int spill647_9;
    double spill647_10;
    double spill647_11;
    boolean spill647_12;
    int spill647_13;
    int spill647_14;
    double spill647_15;
    double spill647_16;
    boolean spill647_17;
    int spill647_18;
    int spill647_19;
    double spill647_20;
    double spill647_21;
    int spill647_22;
    int spill647_23;
    java.util.List spill647_24;
    int spill647_25;
    int spill647_26;
    double spill647_27;
    double spill647_28;
    int spill647_29;
    int spill647_30;
    double spill647_31;
    double spill647_32;
    int spill647_33;
    int spill647_34;
    java.util.List spill647_35;
    int spill647_36;
    int spill647_37;
    double spill647_38;
    double spill647_39;
    int spill647_40;
    int spill647_41;
    double spill647_42;
    double spill647_43;
    boolean spill647_44;
    int spill647_45;
    net.minecraft.entity.Entity spill647_46;
    int spill647_47;
    double spill647_48;
    double spill647_49;
    int spill647_50;
    int spill647_51;
    net.minecraft.entity.Entity spill647_52;
    int spill647_53;
    net.minecraft.entity.Entity spill647_54;
    boolean spill647_55;
    net.minecraft.entity.Entity spill647_56;
    boolean spill647_57;
    boolean spill647_58;
    net.minecraft.block.Block spill647_59;
    net.minecraft.block.Block spill647_60;
    int spill647_61;
    net.minecraft.entity.Entity spill647_62;
    net.minecraft.entity.Entity spill647_63;
    net.minecraft.block.Block spill647_64;
    boolean spill647_65;
    net.minecraft.entity.Entity spill647_66;
    net.minecraft.entity.Entity spill647_67;
    float spill647_68;
    boolean spill647_69;
    int spill647_70;
    int spill647_71;
    net.minecraft.entity.Entity spill647_72;
    long life7_3;
    net.minecraft.entity.Entity life11_6;
    int life9_7;
    net.minecraft.client.entity.EntityPlayerSP life10_18;
    com.moon.event.MotionEvent life11_31;
    double life10_76;
    double life12_79;
    double life14_82;
    double life16_118;
    double life18_120;
    double life20_122;
    int life22_154;
    com.moon.dR life23_158;
    double life24_204;
    java.util.List life24_740;
    moom.CA life25_743;
    java.util.Iterator life26_746;
    moom.CA life27_755;
    int life26_811;
    java.util.Iterator life27_814;
    moom.CA life28_823;
    java.util.Iterator life27_848;
    moom.CA life28_857;
    com.moon.dU life27_921;
    double life28_936;
    double life30_938;
    double life32_940;
    moom.CA life34_943;
    double life3_950;
    java.util.List life35_961;
    moom.CA life36_964;
    moom.CA life37_970;
    double life38_972;
    java.util.Iterator life40_975;
    moom.CA life41_984;
    double life40_1005;
    java.util.Iterator life42_1008;
    moom.CA life43_1017;
    double life42_1038;
    java.util.Iterator life44_1041;
    moom.CA life45_1050;
    moom.CA life44_1072;
    double life45_1074;
    java.util.Iterator life47_1077;
    moom.CA life48_1086;
    double life47_1107;
    java.util.Iterator life49_1110;
    moom.CA life50_1119;
    double life49_1140;
    java.util.Iterator life51_1143;
    moom.CA life52_1152;
    double life51_1179;
    double life53_1187;
    java.util.Iterator life55_1224;
    moom.CA life56_1233;
    int life27_1407;
    int life28_1413;
    int life29_1417;
    moom.DT life30_1424;
    net.minecraft.block.Block life31_1430;
    net.minecraft.block.Block life32_1446;
    double life32_1557;
    double life34_1562;
    double life36_1567;
    float life38_1697;
    int life32_1740;
    forest_join_1418: {
    forest_join_1415: {
    forest_join_1414: {
    forest_join_1393: {
    forest_join_1386: {
    forest_join_1385: {
    forest_join_1377: {
    forest_join_1375: {
    forest_join_1332: {
    forest_join_1331: {
    forest_join_1328: {
    forest_join_1327: {
    forest_join_1311: {
    forest_join_1310: {
    forest_join_1261: {
    forest_join_1213: {
    forest_join_1201: {
    forest_join_1200: {
    forest_join_1170: {
    forest_join_1166: {
    forest_join_1158: {
    forest_join_1155: {
    forest_join_1149: {
    forest_join_1146: {
    forest_join_1140: {
    forest_join_1137: {
    forest_join_1130: {
    forest_join_1126: {
    forest_join_1125: {
    forest_join_1069: {
    forest_join_1068: {
    forest_join_1067: {
    forest_join_1066: {
    forest_join_1054: {
    forest_join_1053: {
    forest_join_1052: {
    forest_join_1048: {
    forest_join_1038: {
    forest_join_1037: {
    forest_join_1036: {
    forest_join_1027: {
    forest_join_1026: {
    forest_join_1025: {
    forest_join_1024: {
    forest_join_1012: {
    forest_join_1000: {
    forest_join_990: {
    forest_join_984: {
    forest_join_961: {
    forest_join_953: {
    forest_join_933: {
    forest_join_929: {
    forest_join_923: {
    forest_join_889: {
    forest_join_883: {
    forest_join_862: {
    forest_join_856: {
    forest_join_835: {
    forest_join_829: {
    forest_join_805: {
    forest_join_799: {
    forest_join_778: {
    forest_join_772: {
    forest_join_751: {
    forest_join_745: {
    forest_join_688: {
    forest_join_668: {
    forest_join_667: {
    forest_join_661: {
    forest_join_647: {
    forest_join_639: {
    forest_join_619: {
    forest_join_611: {
    forest_join_590: {
    forest_join_589: {
    forest_join_588: {
    forest_join_587: {
    forest_join_584: {
    forest_join_570: {
    forest_join_562: {
    forest_join_538: {
    forest_join_529: {
    forest_join_528: {
    forest_join_432: {
    forest_join_431: {
    forest_join_333: {
    forest_join_274: {
    forest_join_216: {
    forest_join_157: {
    forest_join_156: {
    forest_join_149: {
    forest_join_144: {
    forest_join_143: {
    forest_join_126: {
    forest_join_125: {
    forest_join_124: {
    forest_join_120: {
    forest_join_115: {
    forest_join_102: {
    forest_join_100: {
    forest_join_65: {
    forest_join_59: {
    forest_join_46: {
    forest_join_42: {
    life7_3 = (__fieldRead647_0() ^ 30020255404785L);
    spill647_0 = __call647_1();
    life11_6 = receiver;
    life9_7 = spill647_0;
    spill647_1 = __instanceOf647_2(life11_6);
    if (!((life9_7 != 0))) {
        forestValue647_46_0 = spill647_1;
        break forest_join_46;
    }
    if (!((spill647_1 != 0))) {
        break forest_join_42;
    }
    life10_18 = __cast647_3(life11_6);
    life11_31 = new com.moon.event.MotionEvent(p0, p1, p2, __fieldRead647_4(life10_18), __fieldRead647_5(life10_18), __fieldRead647_6(life10_18));
    __call647_9(__call647_8(__call647_7()), life11_31);
    p0 = __call647_10(life11_31);
    p1 = __call647_11(life11_31);
    p2 = __call647_12(life11_31);
    }
    spill647_2 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_65_0 = spill647_2;
        break forest_join_65;
    }
    forestValue647_46_0 = __integerCategory647_14(__fieldRead647_13(spill647_2));
    }
    if (!((forestValue647_46_0 != 0))) {
        break forest_join_59;
    }
    __call647_17(receiver, __call647_16(__call647_15(receiver), p0, p1, p2));
    __call647_18(receiver);
    if (!((life9_7 == 0))) {
        break forest_join_1418;
    }
    }
    __call647_21(__fieldRead647_20(__fieldRead647_19(receiver)), "move");
    forestValue647_65_0 = receiver;
    }
    life10_76 = __fieldRead647_22(forestValue647_65_0);
    life12_79 = __fieldRead647_23(receiver);
    life14_82 = __fieldRead647_24(receiver);
    spill647_3 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_100_0 = spill647_3;
        break forest_join_100;
    }
    if (!(__fieldRead647_25(spill647_3))) {
        break forest_join_102;
    }
    __fieldWrite647_26(receiver, 0);
    p0 = (p0 * 0x1.0p-2d);
    p1 = (p1 * 0x1.99999ap-5d);
    p2 = (p2 * 0x1.0p-2d);
    __fieldWrite647_27(receiver, 0x0.0p0d);
    __fieldWrite647_28(receiver, 0x0.0p0d);
    forestValue647_100_0 = receiver;
    }
    __fieldWrite647_29(forestValue647_100_0, 0x0.0p0d);
    }
    life16_118 = p0;
    life18_120 = p1;
    life20_122 = p2;
    spill647_4 = __fieldRead647_30(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_115_0 = __integerCategory647_31(spill647_4);
        break forest_join_115;
    }
    if (!(spill647_4)) {
        break forest_join_125;
    }
    forestValue647_115_0 = __integerCategory647_33(__call647_32(receiver));
    }
    if (!((life9_7 != 0))) {
        forestValue647_120_0 = forestValue647_115_0;
        break forest_join_120;
    }
    if (!((forestValue647_115_0 != 0))) {
        break forest_join_125;
    }
    forestValue647_120_0 = __instanceOf647_34(receiver);
    }
    if (!((life9_7 != 0))) {
        forestValue647_124_0 = forestValue647_120_0;
        break forest_join_124;
    }
    if (!((forestValue647_120_0 != 0))) {
        break forest_join_125;
    }
    forestValue647_124_0 = 1;
    }
    forestValue647_126_0 = forestValue647_124_0;
    break forest_join_126;
    }
    forestValue647_126_0 = 0;
    }
    life22_154 = forestValue647_126_0;
    life23_158 = new com.moon.dR();
    spill647_5 = life22_154;
    if (!((life9_7 != 0))) {
        forestValue647_144_0 = spill647_5;
        break forest_join_144;
    }
    if (!((spill647_5 == 0))) {
        break forest_join_143;
    }
    if (!((receiver == __fieldRead647_36(__call647_35())))) {
        break forest_join_143;
    }
    __call647_39(__call647_38(__call647_37()), life23_158);
    }
    forestValue647_144_0 = life22_154;
    }
    if (!((life9_7 != 0))) {
        forestValue647_149_0 = forestValue647_144_0;
        break forest_join_149;
    }
    if (!((forestValue647_144_0 == 0))) {
        break forest_join_157;
    }
    forestValue647_149_0 = __integerCategory647_41(__call647_40(life23_158));
    }
    if (!((life9_7 != 0))) {
        forestValue647_156_0 = forestValue647_149_0;
        break forest_join_156;
    }
    if (!((forestValue647_149_0 != 0))) {
        break forest_join_528;
    }
    spill647_6 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_529_0 = spill647_6;
        break forest_join_529;
    }
    forestValue647_156_0 = __instanceOf647_42(spill647_6);
    }
    if (!((forestValue647_156_0 != 0))) {
        break forest_join_528;
    }
    }
    life24_204 = 0x1.999999999999ap-5d;
    forest_cycle_159: while (true) {
    forest_join_212: {
    forest_join_210: {
    forest_join_208: {
    forest_join_201: {
    forest_join_196: {
    if (!((__numericCompare647_43(p0, 0x0.0p0d) != 0))) {
        break forest_join_216;
    }
    spill647_7 = __call647_48(__call647_47(__fieldRead647_44(receiver), receiver, __call647_46(__call647_45(receiver), p0, -0x1.0p0d, 0x0.0p0d)));
    if (!((life9_7 != 0))) {
        forestValue647_274_0 = __integerCategory647_49(spill647_7);
        break forest_join_274;
    }
    if (!((life9_7 != 0))) {
        forestValue647_274_0 = __integerCategory647_50(spill647_7);
        break forest_join_274;
    }
    if (!(spill647_7)) {
        break forest_join_216;
    }
    spill647_8 = __numericCompare647_51(p0, life24_204);
    if (!((life9_7 != 0))) {
        forestValue647_201_0 = spill647_8;
        break forest_join_201;
    }
    if (!((spill647_8 < 0))) {
        break forest_join_196;
    }
    spill647_9 = __numericCompare647_52(p0, (-life24_204));
    if (!((life9_7 != 0))) {
        forestValue647_201_0 = spill647_9;
        break forest_join_201;
    }
    if (!((spill647_9 >= 0))) {
        break forest_join_196;
    }
    p0 = 0x0.0p0d;
    if (!((life9_7 == 0))) {
        break forest_join_212;
    }
    }
    spill647_10 = p0;
    spill647_11 = 0x0.0p0d;
    if (!((life9_7 != 0))) {
        forestValue647_210_0 = spill647_10;
        forestValue647_210_1 = spill647_11;
        break forest_join_210;
    }
    forestValue647_201_0 = __numericCompare647_53(spill647_10, spill647_11);
    }
    if (!((forestValue647_201_0 > 0))) {
        break forest_join_208;
    }
    p0 = (p0 - life24_204);
    if (!((life9_7 == 0))) {
        break forest_join_212;
    }
    }
    forestValue647_210_0 = p0;
    forestValue647_210_1 = life24_204;
    }
    p0 = (forestValue647_210_0 + forestValue647_210_1);
    }
    life16_118 = p0;
    if (!((life9_7 == 0))) {
        continue forest_cycle_159;
    }
    break forest_cycle_159;
    }
    }
    forest_cycle_216: while (true) {
    forest_join_269: {
    forest_join_267: {
    forest_join_265: {
    forest_join_258: {
    forest_join_253: {
    if (!((__numericCompare647_54(p2, 0x0.0p0d) != 0))) {
        break forest_join_432;
    }
    spill647_12 = __call647_59(__call647_58(__fieldRead647_55(receiver), receiver, __call647_57(__call647_56(receiver), 0x0.0p0d, -0x1.0p0d, p2)));
    if (!((life9_7 != 0))) {
        forestValue647_333_0 = __integerCategory647_60(spill647_12);
        break forest_join_333;
    }
    if (!((life9_7 != 0))) {
        forestValue647_333_0 = __integerCategory647_61(spill647_12);
        break forest_join_333;
    }
    if (!(spill647_12)) {
        break forest_join_432;
    }
    spill647_13 = __numericCompare647_62(p2, life24_204);
    if (!((life9_7 != 0))) {
        forestValue647_258_0 = spill647_13;
        break forest_join_258;
    }
    if (!((spill647_13 < 0))) {
        break forest_join_253;
    }
    spill647_14 = __numericCompare647_63(p2, (-life24_204));
    if (!((life9_7 != 0))) {
        forestValue647_258_0 = spill647_14;
        break forest_join_258;
    }
    if (!((spill647_14 >= 0))) {
        break forest_join_253;
    }
    p2 = 0x0.0p0d;
    if (!((life9_7 == 0))) {
        break forest_join_269;
    }
    }
    spill647_15 = p2;
    spill647_16 = 0x0.0p0d;
    if (!((life9_7 != 0))) {
        forestValue647_267_0 = spill647_15;
        forestValue647_267_1 = spill647_16;
        break forest_join_267;
    }
    forestValue647_258_0 = __numericCompare647_64(spill647_15, spill647_16);
    }
    if (!((forestValue647_258_0 > 0))) {
        break forest_join_265;
    }
    p2 = (p2 - life24_204);
    if (!((life9_7 == 0))) {
        break forest_join_269;
    }
    }
    forestValue647_267_0 = p2;
    forestValue647_267_1 = life24_204;
    }
    p2 = (forestValue647_267_0 + forestValue647_267_1);
    }
    life20_122 = p2;
    if (!((life9_7 == 0))) {
        continue forest_cycle_216;
    }
    break forest_cycle_216;
    }
    break forest_join_432;
    }
    forest_cycle_274: while (true) {
    forest_join_329: {
    forest_join_324: {
    forest_join_322: {
    forest_join_320: {
    forest_join_313: {
    forest_join_308: {
    if (!((forestValue647_274_0 != 0))) {
        break forest_join_432;
    }
    spill647_17 = __call647_69(__call647_68(__fieldRead647_65(receiver), receiver, __call647_67(__call647_66(receiver), 0x0.0p0d, -0x1.0p0d, p2)));
    if (!((life9_7 != 0))) {
        forestValue647_333_0 = __integerCategory647_70(spill647_17);
        break forest_join_333;
    }
    if (!((life9_7 != 0))) {
        forestValue647_333_0 = __integerCategory647_71(spill647_17);
        break forest_join_333;
    }
    if (!(spill647_17)) {
        break forest_join_432;
    }
    spill647_18 = __numericCompare647_72(p2, life24_204);
    if (!((life9_7 != 0))) {
        forestValue647_313_0 = spill647_18;
        break forest_join_313;
    }
    if (!((spill647_18 < 0))) {
        break forest_join_308;
    }
    spill647_19 = __numericCompare647_73(p2, (-life24_204));
    if (!((life9_7 != 0))) {
        forestValue647_313_0 = spill647_19;
        break forest_join_313;
    }
    if (!((spill647_19 >= 0))) {
        break forest_join_308;
    }
    p2 = 0x0.0p0d;
    if (!((life9_7 == 0))) {
        break forest_join_324;
    }
    }
    spill647_20 = p2;
    spill647_21 = 0x0.0p0d;
    if (!((life9_7 != 0))) {
        forestValue647_322_0 = spill647_20;
        forestValue647_322_1 = spill647_21;
        break forest_join_322;
    }
    forestValue647_313_0 = __numericCompare647_74(spill647_20, spill647_21);
    }
    if (!((forestValue647_313_0 > 0))) {
        break forest_join_320;
    }
    p2 = (p2 - life24_204);
    if (!((life9_7 == 0))) {
        break forest_join_324;
    }
    }
    forestValue647_322_0 = p2;
    forestValue647_322_1 = life24_204;
    }
    p2 = (forestValue647_322_0 + forestValue647_322_1);
    }
    life20_122 = p2;
    if (!((life9_7 == 0))) {
        break forest_join_329;
    }
    break forest_join_432;
    }
    spill647_22 = __numericCompare647_75(p2, 0x0.0p0d);
    forestValue647_274_0 = spill647_22;
    continue forest_cycle_274;
    }
    }
    forest_cycle_333: while (true) {
    forest_join_427: {
    forest_join_422: {
    forest_join_420: {
    forest_join_418: {
    forest_join_411: {
    forest_join_406: {
    forest_join_387: {
    forest_join_385: {
    forest_join_383: {
    forest_join_376: {
    forest_join_371: {
    forest_join_353: {
    if (!((forestValue647_333_0 != 0))) {
        break forest_join_528;
    }
    spill647_23 = __numericCompare647_76(p2, 0x0.0p0d);
    if (!((life9_7 != 0))) {
        forestValue647_353_0 = spill647_23;
        break forest_join_353;
    }
    if (!((spill647_23 != 0))) {
        break forest_join_528;
    }
    spill647_24 = __call647_80(__fieldRead647_77(receiver), receiver, __call647_79(__call647_78(receiver), p0, -0x1.0p0d, p2));
    if (!((life9_7 != 0))) {
        forestValue647_538_0 = spill647_24;
        break forest_join_538;
    }
    forestValue647_353_0 = __integerCategory647_82(__call647_81(spill647_24));
    }
    if (!((forestValue647_353_0 != 0))) {
        break forest_join_528;
    }
    spill647_25 = __numericCompare647_83(p0, life24_204);
    if (!((life9_7 != 0))) {
        forestValue647_376_0 = spill647_25;
        break forest_join_376;
    }
    if (!((spill647_25 < 0))) {
        break forest_join_371;
    }
    spill647_26 = __numericCompare647_84(p0, (-life24_204));
    if (!((life9_7 != 0))) {
        forestValue647_376_0 = spill647_26;
        break forest_join_376;
    }
    if (!((spill647_26 >= 0))) {
        break forest_join_371;
    }
    p0 = 0x0.0p0d;
    if (!((life9_7 == 0))) {
        break forest_join_387;
    }
    }
    spill647_27 = p0;
    spill647_28 = 0x0.0p0d;
    if (!((life9_7 != 0))) {
        forestValue647_385_0 = spill647_27;
        forestValue647_385_1 = spill647_28;
        break forest_join_385;
    }
    forestValue647_376_0 = __numericCompare647_85(spill647_27, spill647_28);
    }
    if (!((forestValue647_376_0 > 0))) {
        break forest_join_383;
    }
    p0 = (p0 - life24_204);
    if (!((life9_7 == 0))) {
        break forest_join_387;
    }
    }
    forestValue647_385_0 = p0;
    forestValue647_385_1 = life24_204;
    }
    p0 = (forestValue647_385_0 + forestValue647_385_1);
    }
    life16_118 = p0;
    spill647_29 = __numericCompare647_86(p2, life24_204);
    if (!((life9_7 != 0))) {
        forestValue647_411_0 = spill647_29;
        break forest_join_411;
    }
    if (!((spill647_29 < 0))) {
        break forest_join_406;
    }
    spill647_30 = __numericCompare647_87(p2, (-life24_204));
    if (!((life9_7 != 0))) {
        forestValue647_411_0 = spill647_30;
        break forest_join_411;
    }
    if (!((spill647_30 >= 0))) {
        break forest_join_406;
    }
    p2 = 0x0.0p0d;
    if (!((life9_7 == 0))) {
        break forest_join_422;
    }
    }
    spill647_31 = p2;
    spill647_32 = 0x0.0p0d;
    if (!((life9_7 != 0))) {
        forestValue647_420_0 = spill647_31;
        forestValue647_420_1 = spill647_32;
        break forest_join_420;
    }
    forestValue647_411_0 = __numericCompare647_88(spill647_31, spill647_32);
    }
    if (!((forestValue647_411_0 > 0))) {
        break forest_join_418;
    }
    p2 = (p2 - life24_204);
    if (!((life9_7 == 0))) {
        break forest_join_422;
    }
    }
    forestValue647_420_0 = p2;
    forestValue647_420_1 = life24_204;
    }
    p2 = (forestValue647_420_0 + forestValue647_420_1);
    }
    life20_122 = p2;
    if (!((life9_7 == 0))) {
        break forest_join_427;
    }
    break forest_join_431;
    }
    spill647_33 = __numericCompare647_89(p0, 0x0.0p0d);
    forestValue647_333_0 = spill647_33;
    continue forest_cycle_333;
    }
    }
    break forest_join_528;
    }
    forest_cycle_432: while (true) {
    forest_join_524: {
    forest_join_522: {
    forest_join_520: {
    forest_join_513: {
    forest_join_508: {
    forest_join_489: {
    forest_join_487: {
    forest_join_485: {
    forest_join_478: {
    forest_join_473: {
    forest_join_455: {
    if (!((__numericCompare647_90(p0, 0x0.0p0d) != 0))) {
        break forest_join_528;
    }
    spill647_34 = __numericCompare647_91(p2, 0x0.0p0d);
    if (!((life9_7 != 0))) {
        forestValue647_455_0 = spill647_34;
        break forest_join_455;
    }
    if (!((spill647_34 != 0))) {
        break forest_join_528;
    }
    spill647_35 = __call647_95(__fieldRead647_92(receiver), receiver, __call647_94(__call647_93(receiver), p0, -0x1.0p0d, p2));
    if (!((life9_7 != 0))) {
        forestValue647_538_0 = spill647_35;
        break forest_join_538;
    }
    forestValue647_455_0 = __integerCategory647_97(__call647_96(spill647_35));
    }
    if (!((forestValue647_455_0 != 0))) {
        break forest_join_528;
    }
    spill647_36 = __numericCompare647_98(p0, life24_204);
    if (!((life9_7 != 0))) {
        forestValue647_478_0 = spill647_36;
        break forest_join_478;
    }
    if (!((spill647_36 < 0))) {
        break forest_join_473;
    }
    spill647_37 = __numericCompare647_99(p0, (-life24_204));
    if (!((life9_7 != 0))) {
        forestValue647_478_0 = spill647_37;
        break forest_join_478;
    }
    if (!((spill647_37 >= 0))) {
        break forest_join_473;
    }
    p0 = 0x0.0p0d;
    if (!((life9_7 == 0))) {
        break forest_join_489;
    }
    }
    spill647_38 = p0;
    spill647_39 = 0x0.0p0d;
    if (!((life9_7 != 0))) {
        forestValue647_487_0 = spill647_38;
        forestValue647_487_1 = spill647_39;
        break forest_join_487;
    }
    forestValue647_478_0 = __numericCompare647_100(spill647_38, spill647_39);
    }
    if (!((forestValue647_478_0 > 0))) {
        break forest_join_485;
    }
    p0 = (p0 - life24_204);
    if (!((life9_7 == 0))) {
        break forest_join_489;
    }
    }
    forestValue647_487_0 = p0;
    forestValue647_487_1 = life24_204;
    }
    p0 = (forestValue647_487_0 + forestValue647_487_1);
    }
    life16_118 = p0;
    spill647_40 = __numericCompare647_101(p2, life24_204);
    if (!((life9_7 != 0))) {
        forestValue647_513_0 = spill647_40;
        break forest_join_513;
    }
    if (!((spill647_40 < 0))) {
        break forest_join_508;
    }
    spill647_41 = __numericCompare647_102(p2, (-life24_204));
    if (!((life9_7 != 0))) {
        forestValue647_513_0 = spill647_41;
        break forest_join_513;
    }
    if (!((spill647_41 >= 0))) {
        break forest_join_508;
    }
    p2 = 0x0.0p0d;
    if (!((life9_7 == 0))) {
        break forest_join_524;
    }
    }
    spill647_42 = p2;
    spill647_43 = 0x0.0p0d;
    if (!((life9_7 != 0))) {
        forestValue647_522_0 = spill647_42;
        forestValue647_522_1 = spill647_43;
        break forest_join_522;
    }
    forestValue647_513_0 = __numericCompare647_103(spill647_42, spill647_43);
    }
    if (!((forestValue647_513_0 > 0))) {
        break forest_join_520;
    }
    p2 = (p2 - life24_204);
    if (!((life9_7 == 0))) {
        break forest_join_524;
    }
    }
    forestValue647_522_0 = p2;
    forestValue647_522_1 = life24_204;
    }
    p2 = (forestValue647_522_0 + forestValue647_522_1);
    }
    life20_122 = p2;
    if (!((life9_7 == 0))) {
        continue forest_cycle_432;
    }
    break forest_cycle_432;
    }
    }
    forestValue647_529_0 = receiver;
    }
    forestValue647_538_0 = __call647_107(__fieldRead647_104(forestValue647_529_0), receiver, __call647_106(__call647_105(receiver), p0, p1, p2));
    }
    life24_740 = forestValue647_538_0;
    life25_743 = __call647_108(receiver);
    life26_746 = __call647_109(life24_740);
    forest_cycle_545: while (true) {
    if (!(__call647_110(life26_746))) {
        break forest_join_562;
    }
    life27_755 = __cast647_112(__call647_111(life26_746));
    p1 = __call647_114(life27_755, __call647_113(receiver), p1);
    if (!((life9_7 != 0))) {
        break forest_join_570;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_545;
    }
    break forest_cycle_545;
    }
    }
    __call647_117(receiver, __call647_116(__call647_115(receiver), 0x0.0p0d, p1, 0x0.0p0d));
    }
    spill647_44 = __fieldRead647_118(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_588_0 = __integerCategory647_119(spill647_44);
        break forest_join_588;
    }
    if (!((!spill647_44))) {
        break forest_join_587;
    }
    spill647_45 = __numericCompare647_120(life18_120, p1);
    if (!((life9_7 != 0))) {
        forestValue647_584_0 = spill647_45;
        break forest_join_584;
    }
    if (!((spill647_45 != 0))) {
        break forest_join_589;
    }
    forestValue647_584_0 = __numericCompare647_121(life18_120, 0x0.0p0d);
    }
    if (!((life9_7 != 0))) {
        forestValue647_588_0 = forestValue647_584_0;
        break forest_join_588;
    }
    if (!((forestValue647_584_0 < 0))) {
        break forest_join_589;
    }
    }
    forestValue647_588_0 = 1;
    }
    forestValue647_590_0 = forestValue647_588_0;
    break forest_join_590;
    }
    forestValue647_590_0 = 0;
    }
    life26_811 = forestValue647_590_0;
    life27_814 = __call647_122(life24_740);
    forest_cycle_594: while (true) {
    if (!(__call647_123(life27_814))) {
        break forest_join_611;
    }
    life28_823 = __cast647_125(__call647_124(life27_814));
    p0 = __call647_127(life28_823, __call647_126(receiver), p0);
    if (!((life9_7 != 0))) {
        break forest_join_619;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_594;
    }
    break forest_cycle_594;
    }
    }
    __call647_130(receiver, __call647_129(__call647_128(receiver), p0, 0x0.0p0d, 0x0.0p0d));
    }
    life27_848 = __call647_131(life24_740);
    forest_cycle_622: while (true) {
    if (!(__call647_132(life27_848))) {
        break forest_join_639;
    }
    life28_857 = __cast647_134(__call647_133(life27_848));
    p2 = __call647_136(life28_857, __call647_135(receiver), p2);
    if (!((life9_7 != 0))) {
        break forest_join_647;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_622;
    }
    break forest_cycle_622;
    }
    }
    __call647_139(receiver, __call647_138(__call647_137(receiver), 0x0.0p0d, 0x0.0p0d, p2));
    }
    spill647_46 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_1012_0 = spill647_46;
        break forest_join_1012;
    }
    if (!((__numericCompare647_141(__fieldRead647_140(spill647_46), 0x0.0p0f) > 0))) {
        break forest_join_1000;
    }
    spill647_47 = life26_811;
    if (!((life9_7 != 0))) {
        forestValue647_661_0 = spill647_47;
        break forest_join_661;
    }
    if (!((spill647_47 != 0))) {
        break forest_join_1000;
    }
    forestValue647_661_0 = __numericCompare647_142(life16_118, p0);
    }
    if (!((life9_7 != 0))) {
        forestValue647_667_0 = forestValue647_661_0;
        break forest_join_667;
    }
    if (!((forestValue647_661_0 == 0))) {
        break forest_join_668;
    }
    forestValue647_667_0 = __numericCompare647_143(life20_122, p2);
    }
    if (!((forestValue647_667_0 != 0))) {
        break forest_join_1000;
    }
    }
    life27_921 = new com.moon.dU(receiver, __fieldRead647_144(receiver), true);
    __call647_147(__call647_146(__call647_145()), life27_921);
    __fieldWrite647_149(receiver, __call647_148(life27_921));
    if (!(__call647_150(life27_921))) {
        break forest_join_688;
    }
    return;
    }
    life28_936 = p0;
    life30_938 = p1;
    life32_940 = p2;
    life34_943 = __call647_151(receiver);
    __call647_152(receiver, life25_743);
    life3_950 = ((double) __fieldRead647_153(receiver));
    life35_961 = __call647_157(__fieldRead647_154(receiver), receiver, __call647_156(__call647_155(receiver), life16_118, life3_950, life20_122));
    life36_964 = __call647_158(receiver);
    life37_970 = __call647_159(life36_964, life16_118, 0x0.0p0d, life20_122);
    life38_972 = life3_950;
    life40_975 = __call647_160(life35_961);
    forest_cycle_729: while (true) {
    if (!(__call647_161(life40_975))) {
        break forest_join_745;
    }
    life41_984 = __cast647_163(__call647_162(life40_975));
    life38_972 = __call647_164(life41_984, life37_970, life38_972);
    if (!((life9_7 != 0))) {
        break forest_join_751;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_729;
    }
    break forest_cycle_729;
    }
    }
    life36_964 = __call647_165(life36_964, 0x0.0p0d, life38_972, 0x0.0p0d);
    }
    life40_1005 = life16_118;
    life42_1008 = __call647_166(life35_961);
    forest_cycle_756: while (true) {
    if (!(__call647_167(life42_1008))) {
        break forest_join_772;
    }
    life43_1017 = __cast647_169(__call647_168(life42_1008));
    life40_1005 = __call647_170(life43_1017, life36_964, life40_1005);
    if (!((life9_7 != 0))) {
        break forest_join_778;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_756;
    }
    break forest_cycle_756;
    }
    }
    life36_964 = __call647_171(life36_964, life40_1005, 0x0.0p0d, 0x0.0p0d);
    }
    life42_1038 = life20_122;
    life44_1041 = __call647_172(life35_961);
    forest_cycle_783: while (true) {
    if (!(__call647_173(life44_1041))) {
        break forest_join_799;
    }
    life45_1050 = __cast647_175(__call647_174(life44_1041));
    life42_1038 = __call647_176(life45_1050, life36_964, life42_1038);
    if (!((life9_7 != 0))) {
        break forest_join_805;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_783;
    }
    break forest_cycle_783;
    }
    }
    life36_964 = __call647_177(life36_964, 0x0.0p0d, 0x0.0p0d, life42_1038);
    }
    life44_1072 = __call647_178(receiver);
    life45_1074 = life3_950;
    life47_1077 = __call647_179(life35_961);
    forest_cycle_813: while (true) {
    if (!(__call647_180(life47_1077))) {
        break forest_join_829;
    }
    life48_1086 = __cast647_182(__call647_181(life47_1077));
    life45_1074 = __call647_183(life48_1086, life44_1072, life45_1074);
    if (!((life9_7 != 0))) {
        break forest_join_835;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_813;
    }
    break forest_cycle_813;
    }
    }
    life44_1072 = __call647_184(life44_1072, 0x0.0p0d, life45_1074, 0x0.0p0d);
    }
    life47_1107 = life16_118;
    life49_1110 = __call647_185(life35_961);
    forest_cycle_840: while (true) {
    if (!(__call647_186(life49_1110))) {
        break forest_join_856;
    }
    life50_1119 = __cast647_188(__call647_187(life49_1110));
    life47_1107 = __call647_189(life50_1119, life44_1072, life47_1107);
    if (!((life9_7 != 0))) {
        break forest_join_862;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_840;
    }
    break forest_cycle_840;
    }
    }
    life44_1072 = __call647_190(life44_1072, life47_1107, 0x0.0p0d, 0x0.0p0d);
    }
    life49_1140 = life20_122;
    life51_1143 = __call647_191(life35_961);
    forest_cycle_867: while (true) {
    if (!(__call647_192(life51_1143))) {
        break forest_join_883;
    }
    life52_1152 = __cast647_194(__call647_193(life51_1143));
    life49_1140 = __call647_195(life52_1152, life44_1072, life49_1140);
    if (!((life9_7 != 0))) {
        break forest_join_889;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_867;
    }
    break forest_cycle_867;
    }
    }
    life44_1072 = __call647_196(life44_1072, 0x0.0p0d, 0x0.0p0d, life49_1140);
    }
    life51_1179 = ((life40_1005 * life40_1005) + (life42_1038 * life42_1038));
    life53_1187 = ((life47_1107 * life47_1107) + (life49_1140 * life49_1140));
    spill647_48 = life51_1179;
    if (!((life9_7 != 0))) {
        forestValue647_929_0 = spill647_48;
        break forest_join_929;
    }
    if (!((__numericCompare647_197(spill647_48, life53_1187) > 0))) {
        break forest_join_923;
    }
    p0 = life40_1005;
    p2 = life42_1038;
    p1 = (-life38_972);
    __call647_198(receiver, life36_964);
    if (!((life9_7 == 0))) {
        break forest_join_933;
    }
    }
    p0 = life47_1107;
    p2 = life49_1140;
    forestValue647_929_0 = (-life45_1074);
    }
    p1 = forestValue647_929_0;
    __call647_199(receiver, life44_1072);
    }
    life55_1224 = __call647_200(life35_961);
    forest_cycle_936: while (true) {
    if (!(__call647_201(life55_1224))) {
        break forest_join_953;
    }
    life56_1233 = __cast647_203(__call647_202(life55_1224));
    p1 = __call647_205(life56_1233, __call647_204(receiver), p1);
    if (!((life9_7 != 0))) {
        break forest_join_961;
    }
    if (!((life9_7 == 0))) {
        continue forest_cycle_936;
    }
    break forest_cycle_936;
    }
    }
    __call647_208(receiver, __call647_207(__call647_206(receiver), 0x0.0p0d, p1, 0x0.0p0d));
    }
    spill647_49 = ((life28_936 * life28_936) + (life32_940 * life32_940));
    if (!((life9_7 != 0))) {
        forestValue647_984_0 = spill647_49;
        break forest_join_984;
    }
    if (!((__numericCompare647_209(spill647_49, ((p0 * p0) + (p2 * p2))) >= 0))) {
        break forest_join_990;
    }
    p0 = life28_936;
    p1 = life30_938;
    forestValue647_984_0 = life32_940;
    }
    p2 = forestValue647_984_0;
    __call647_210(receiver, life34_943);
    if (!((life9_7 == 0))) {
        break forest_join_1000;
    }
    }
    __call647_214(__call647_212(__call647_211()), new com.moon.dU(receiver, __fieldRead647_213(receiver), false));
    }
    __call647_217(__fieldRead647_216(__fieldRead647_215(receiver)));
    __call647_220(__fieldRead647_219(__fieldRead647_218(receiver)), "rest");
    __call647_221(receiver);
    forestValue647_1012_0 = receiver;
    }
    spill647_50 = __numericCompare647_222(life16_118, p0);
    if (!((life9_7 != 0))) {
        forestValue647_1025_0 = forestValue647_1012_0;
        forestValue647_1025_1 = spill647_50;
        break forest_join_1025;
    }
    if (!((spill647_50 == 0))) {
        forestValue647_1024_0 = forestValue647_1012_0;
        break forest_join_1024;
    }
    spill647_51 = __numericCompare647_223(life20_122, p2);
    if (!((life9_7 != 0))) {
        forestValue647_1025_0 = forestValue647_1012_0;
        forestValue647_1025_1 = spill647_51;
        break forest_join_1025;
    }
    if (!((spill647_51 != 0))) {
        forestValue647_1026_0 = forestValue647_1012_0;
        break forest_join_1026;
    }
    forestValue647_1024_0 = forestValue647_1012_0;
    }
    forestValue647_1025_0 = forestValue647_1024_0;
    forestValue647_1025_1 = 1;
    }
    forestValue647_1027_0 = forestValue647_1025_0;
    forestValue647_1027_1 = forestValue647_1025_1;
    break forest_join_1027;
    }
    forestValue647_1027_0 = forestValue647_1026_0;
    forestValue647_1027_1 = 0;
    }
    __fieldWrite647_224(forestValue647_1027_0, forestValue647_1027_1);
    spill647_52 = receiver;
    spill647_53 = __numericCompare647_225(life18_120, p1);
    if (!((life9_7 != 0))) {
        forestValue647_1036_0 = spill647_52;
        forestValue647_1036_1 = spill647_53;
        break forest_join_1036;
    }
    if (!((spill647_53 != 0))) {
        forestValue647_1037_0 = spill647_52;
        break forest_join_1037;
    }
    forestValue647_1036_0 = spill647_52;
    forestValue647_1036_1 = 1;
    }
    forestValue647_1038_0 = forestValue647_1036_0;
    forestValue647_1038_1 = forestValue647_1036_1;
    break forest_join_1038;
    }
    forestValue647_1038_0 = forestValue647_1037_0;
    forestValue647_1038_1 = 0;
    }
    __fieldWrite647_226(forestValue647_1038_0, forestValue647_1038_1);
    spill647_54 = receiver;
    spill647_55 = __fieldRead647_227(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_1048_0 = spill647_54;
        forestValue647_1048_1 = __integerCategory647_228(spill647_55);
        break forest_join_1048;
    }
    if (!(spill647_55)) {
        forestValue647_1053_0 = spill647_54;
        break forest_join_1053;
    }
    forestValue647_1048_0 = spill647_54;
    forestValue647_1048_1 = __numericCompare647_229(life18_120, 0x0.0p0d);
    }
    if (!((life9_7 != 0))) {
        forestValue647_1052_0 = forestValue647_1048_0;
        forestValue647_1052_1 = forestValue647_1048_1;
        break forest_join_1052;
    }
    if (!((forestValue647_1048_1 < 0))) {
        forestValue647_1053_0 = forestValue647_1048_0;
        break forest_join_1053;
    }
    forestValue647_1052_0 = forestValue647_1048_0;
    forestValue647_1052_1 = 1;
    }
    forestValue647_1054_0 = forestValue647_1052_0;
    forestValue647_1054_1 = forestValue647_1052_1;
    break forest_join_1054;
    }
    forestValue647_1054_0 = forestValue647_1053_0;
    forestValue647_1054_1 = 0;
    }
    __fieldWrite647_230(forestValue647_1054_0, forestValue647_1054_1);
    spill647_56 = receiver;
    spill647_57 = __fieldRead647_231(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_1067_0 = spill647_56;
        forestValue647_1067_1 = __integerCategory647_232(spill647_57);
        break forest_join_1067;
    }
    if (!((!spill647_57))) {
        forestValue647_1066_0 = spill647_56;
        break forest_join_1066;
    }
    spill647_58 = __fieldRead647_233(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_1067_0 = spill647_56;
        forestValue647_1067_1 = __integerCategory647_234(spill647_58);
        break forest_join_1067;
    }
    if (!(spill647_58)) {
        forestValue647_1068_0 = spill647_56;
        break forest_join_1068;
    }
    forestValue647_1066_0 = spill647_56;
    }
    forestValue647_1067_0 = forestValue647_1066_0;
    forestValue647_1067_1 = 1;
    }
    forestValue647_1069_0 = forestValue647_1067_0;
    forestValue647_1069_1 = forestValue647_1067_1;
    break forest_join_1069;
    }
    forestValue647_1069_0 = forestValue647_1068_0;
    forestValue647_1069_1 = 0;
    }
    __fieldWrite647_235(forestValue647_1069_0, forestValue647_1069_1);
    life27_1407 = __call647_237(__fieldRead647_236(receiver));
    life28_1413 = __call647_239((__fieldRead647_238(receiver) - 0x1.99999ap-3d));
    life29_1417 = __call647_241(__fieldRead647_240(receiver));
    life30_1424 = new moom.DT(life27_1407, life28_1413, life29_1417);
    life31_1430 = __call647_244(__call647_243(__fieldRead647_242(receiver), life30_1424));
    if (!((life9_7 != 0))) {
        break forest_join_1137;
    }
    if (!((__call647_245(life31_1430) == __fieldRead647_246()))) {
        break forest_join_1130;
    }
    life32_1446 = __call647_250(__call647_249(__fieldRead647_247(receiver), __call647_248(life30_1424)));
    spill647_59 = life32_1446;
    if (!((life9_7 != 0))) {
        forestValue647_1126_0 = spill647_59;
        break forest_join_1126;
    }
    if (!((__instanceOf647_251(spill647_59) == 0))) {
        break forest_join_1125;
    }
    spill647_60 = life32_1446;
    if (!((life9_7 != 0))) {
        forestValue647_1126_0 = spill647_60;
        break forest_join_1126;
    }
    if (!((__instanceOf647_252(spill647_60) == 0))) {
        break forest_join_1125;
    }
    spill647_61 = __instanceOf647_253(life32_1446);
    if (!((life9_7 != 0))) {
        forestValue647_1140_0 = spill647_61;
        break forest_join_1140;
    }
    if (!((spill647_61 != 0))) {
        break forest_join_1130;
    }
    }
    forestValue647_1126_0 = life32_1446;
    }
    life31_1430 = forestValue647_1126_0;
    life30_1424 = __call647_254(life30_1424);
    }
    __call647_256(receiver, p1, __fieldRead647_255(receiver), life31_1430, life30_1424);
    }
    forestValue647_1140_0 = __numericCompare647_257(life16_118, p0);
    }
    if (!((life9_7 != 0))) {
        forestValue647_1149_0 = forestValue647_1140_0;
        break forest_join_1149;
    }
    if (!((forestValue647_1140_0 != 0))) {
        break forest_join_1146;
    }
    __fieldWrite647_258(receiver, 0x0.0p0d);
    }
    forestValue647_1149_0 = __numericCompare647_259(life20_122, p2);
    }
    if (!((life9_7 != 0))) {
        forestValue647_1158_0 = forestValue647_1149_0;
        break forest_join_1158;
    }
    if (!((forestValue647_1149_0 != 0))) {
        break forest_join_1155;
    }
    __fieldWrite647_260(receiver, 0x0.0p0d);
    }
    forestValue647_1158_0 = __numericCompare647_261(life18_120, p1);
    }
    if (!((life9_7 != 0))) {
        forestValue647_1170_0 = forestValue647_1158_0;
        break forest_join_1170;
    }
    if (!((forestValue647_1158_0 != 0))) {
        break forest_join_1166;
    }
    __call647_263(life31_1430, __fieldRead647_262(receiver), receiver);
    }
    spill647_62 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_1332_0 = spill647_62;
        break forest_join_1332;
    }
    forestValue647_1170_0 = __integerCategory647_265(__call647_264(spill647_62));
    }
    if (!((forestValue647_1170_0 != 0))) {
        break forest_join_1331;
    }
    if (!((life22_154 == 0))) {
        break forest_join_1331;
    }
    spill647_63 = __fieldRead647_266(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_1332_0 = spill647_63;
        break forest_join_1332;
    }
    if (!((spill647_63 == null))) {
        break forest_join_1331;
    }
    life32_1557 = (__fieldRead647_267(receiver) - life10_76);
    life34_1562 = (__fieldRead647_268(receiver) - life12_79);
    life36_1567 = (__fieldRead647_269(receiver) - life14_82);
    spill647_64 = life31_1430;
    if (!((life9_7 != 0))) {
        forestValue647_1201_0 = spill647_64;
        break forest_join_1201;
    }
    if (!((spill647_64 != __fieldRead647_270()))) {
        break forest_join_1200;
    }
    life34_1562 = 0x0.0p0d;
    }
    forestValue647_1201_0 = life31_1430;
    }
    if (!((forestValue647_1201_0 != null))) {
        break forest_join_1213;
    }
    spill647_65 = __fieldRead647_271(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_1261_0 = __integerCategory647_272(spill647_65);
        break forest_join_1261;
    }
    if (!(spill647_65)) {
        break forest_join_1213;
    }
    __call647_274(life31_1430, __fieldRead647_273(receiver), life30_1424, receiver);
    }
    __fieldWrite647_277(receiver, ((float) (((double) __fieldRead647_275(receiver)) + (((double) __call647_276(((life32_1557 * life32_1557) + (life36_1567 * life36_1567)))) * 0x1.3333333333333p-1d))));
    __fieldWrite647_280(receiver, ((float) (((double) __fieldRead647_278(receiver)) + (((double) __call647_279((((life32_1557 * life32_1557) + (life34_1562 * life34_1562)) + (life36_1567 * life36_1567)))) * 0x1.3333333333333p-1d))));
    spill647_66 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_1332_0 = spill647_66;
        break forest_join_1332;
    }
    forestValue647_1261_0 = __numericCompare647_283(__fieldRead647_281(spill647_66), ((float) __fieldRead647_282(receiver)));
    }
    if (!((forestValue647_1261_0 > 0))) {
        break forest_join_1331;
    }
    if (!((__call647_284(life31_1430) != __fieldRead647_285()))) {
        break forest_join_1331;
    }
    __fieldWrite647_287(receiver, (((int) __fieldRead647_286(receiver)) + 1));
    spill647_67 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_1328_0 = spill647_67;
        break forest_join_1328;
    }
    if (!(__call647_288(spill647_67))) {
        break forest_join_1327;
    }
    life38_1697 = (__call647_295(((((__fieldRead647_289(receiver) * __fieldRead647_290(receiver)) * 0x1.99999ap-3d) + (__fieldRead647_291(receiver) * __fieldRead647_292(receiver))) + ((__fieldRead647_293(receiver) * __fieldRead647_294(receiver)) * 0x1.99999ap-3d))) * 0x1.666666p-2f);
    spill647_68 = life38_1697;
    if (!((life9_7 != 0))) {
        forestValue647_1310_0 = spill647_68;
        break forest_join_1310;
    }
    if (!((__numericCompare647_296(spill647_68, 0x1.0p0f) > 0))) {
        break forest_join_1311;
    }
    forestValue647_1310_0 = 0x1.0p0f;
    }
    life38_1697 = forestValue647_1310_0;
    }
    __call647_302(receiver, __call647_297(receiver), life38_1697, (0x1.0p0f + ((__call647_299(__fieldRead647_298(receiver)) - __call647_301(__fieldRead647_300(receiver))) * 0x1.99999ap-2f)));
    }
    forestValue647_1328_0 = receiver;
    }
    __call647_303(forestValue647_1328_0, life30_1424, life31_1430);
    }
    forestValue647_1332_0 = receiver;
    }
    __call647_304(forestValue647_1332_0);
    life32_1740 = __integerCategory647_306(__call647_305(receiver));
    spill647_69 = __call647_310(__fieldRead647_307(receiver), __call647_309(__call647_308(receiver), 0x1.0624dd2f1a9fcp-10d, 0x1.0624dd2f1a9fcp-10d, 0x1.0624dd2f1a9fcp-10d));
    if (!((life9_7 != 0))) {
        forestValue647_1377_0 = __integerCategory647_311(spill647_69);
        break forest_join_1377;
    }
    if (!(spill647_69)) {
        break forest_join_1375;
    }
    __call647_312(receiver, 1);
    spill647_70 = life32_1740;
    if (!((life9_7 != 0))) {
        forestValue647_1386_0 = spill647_70;
        break forest_join_1386;
    }
    if (!((spill647_70 == 0))) {
        break forest_join_1385;
    }
    net.minecraft.entity.Entity __stackOp647_313_0 = receiver;
    __fieldWrite647_315(__stackOp647_313_0, (__fieldRead647_314(__stackOp647_313_0) + 1));
    spill647_71 = __fieldRead647_316(receiver);
    if (!((life9_7 != 0))) {
        forestValue647_1386_0 = spill647_71;
        break forest_join_1386;
    }
    if (!((spill647_71 == 0))) {
        break forest_join_1385;
    }
    __call647_318(receiver, __invokedynamic647_317(22997, (396496665924680296L ^ life7_3)));
    if (!((life9_7 == 0))) {
        break forest_join_1385;
    }
    }
    forestValue647_1377_0 = __fieldRead647_319(receiver);
    }
    if (!((life9_7 != 0))) {
        forestValue647_1386_0 = forestValue647_1377_0;
        break forest_join_1386;
    }
    if (!((forestValue647_1377_0 <= 0))) {
        break forest_join_1385;
    }
    __fieldWrite647_321(receiver, (-__fieldRead647_320(receiver)));
    }
    forestValue647_1386_0 = life32_1740;
    }
    if (!((life9_7 != 0))) {
        forestValue647_1393_0 = forestValue647_1386_0;
        break forest_join_1393;
    }
    if (!((forestValue647_1386_0 != 0))) {
        break forest_join_1414;
    }
    spill647_72 = receiver;
    if (!((life9_7 != 0))) {
        forestValue647_1415_0 = spill647_72;
        break forest_join_1415;
    }
    forestValue647_1393_0 = __fieldRead647_322(spill647_72);
    }
    if (!((forestValue647_1393_0 > 0))) {
        break forest_join_1414;
    }
    __call647_327(receiver, "random.fizz", 0x1.666666p-1f, (0x1.99999ap0f + ((__call647_324(__fieldRead647_323(receiver)) - __call647_326(__fieldRead647_325(receiver))) * 0x1.99999ap-2f)));
    __fieldWrite647_329(receiver, (-__fieldRead647_328(receiver)));
    }
    forestValue647_1415_0 = receiver;
    }
    __call647_332(__fieldRead647_331(__fieldRead647_330(forestValue647_1415_0)));
    }
    return;
}
public static void h647_0(java.lang.Throwable p0) throws Throwable {
    throw __call3064700_0(p0);
}
public static void h647_1(java.lang.Throwable p0) throws Throwable {
    throw __call3064701_0(p0);
}
public static void h647_2(java.lang.Throwable p0) throws Throwable {
    throw __call3064702_0(p0);
}
public static void h647_3(java.lang.Throwable p0) throws Throwable {
    throw __call3064703_0(p0);
}
public static void h647_4(java.lang.Throwable p0) throws Throwable {
    throw __call3064704_0(p0);
}
public static void h647_5(java.lang.Throwable p0) throws Throwable {
    throw __call3064705_0(p0);
}
public static void h647_6(java.lang.Throwable p0) throws Throwable {
    throw __call3064706_0(p0);
}
public static void h647_7(java.lang.Throwable p0) throws Throwable {
    throw __call3064707_0(p0);
}
public static void h647_8(java.lang.Throwable p0) throws Throwable {
    throw __call3064708_0(p0);
}
public static void h647_9(java.lang.Throwable p0) throws Throwable {
    throw __call3064709_0(p0);
}
public static void h647_10(java.lang.Throwable p0) throws Throwable {
    throw __call3064710_0(p0);
}
public static void h647_11(java.lang.Throwable p0) throws Throwable {
    throw __call3064711_0(p0);
}
public static void h647_12(java.lang.Throwable p0) throws Throwable {
    throw __call3064712_0(p0);
}
public static void h647_13(java.lang.Throwable p0) throws Throwable {
    throw __call3064713_0(p0);
}
public static void h647_14(java.lang.Throwable p0) throws Throwable {
    throw __call3064714_0(p0);
}
public static void h647_15(java.lang.Throwable p0) throws Throwable {
    throw __call3064715_0(p0);
}
public static void h647_16(java.lang.Throwable p0) throws Throwable {
    throw __call3064716_0(p0);
}
public static void h647_17(java.lang.Throwable p0) throws Throwable {
    throw __call3064717_0(p0);
}
public static void h647_18(java.lang.Throwable p0) throws Throwable {
    throw __call3064718_0(p0);
}
public static void h647_19(java.lang.Throwable p0) throws Throwable {
    throw __call3064719_0(p0);
}
public static void h647_20(java.lang.Throwable p0) throws Throwable {
    throw __call3064720_0(p0);
}
public static void h647_21(java.lang.Throwable p0) throws Throwable {
    throw __call3064721_0(p0);
}
public static void h647_22(java.lang.Throwable p0) throws Throwable {
    throw __call3064722_0(p0);
}
public static void h647_23(java.lang.Throwable p0) throws Throwable {
    throw __call3064723_0(p0);
}
public static void h647_24(java.lang.Throwable p0) throws Throwable {
    throw __call3064724_0(p0);
}
public static void h647_25(java.lang.Throwable p0) throws Throwable {
    throw __call3064725_0(p0);
}
public static void h647_26(java.lang.Throwable p0) throws Throwable {
    throw __call3064726_0(p0);
}
public static void h647_27(java.lang.Throwable p0) throws Throwable {
    throw __call3064727_0(p0);
}
public static void h647_28(java.lang.Throwable p0) throws Throwable {
    throw __call3064728_0(p0);
}
public static void h647_29(java.lang.Throwable p0) throws Throwable {
    throw __call3064729_0(p0);
}
public static void h647_30(java.lang.Throwable p0) throws Throwable {
    throw __call3064730_0(p0);
}
public static void h647_31(java.lang.Throwable p0) throws Throwable {
    throw __call3064731_0(p0);
}
public static void h647_32(java.lang.Throwable p0) throws Throwable {
    throw __call3064732_0(p0);
}
public static void h647_33(java.lang.Throwable p0) throws Throwable {
    throw __call3064733_0(p0);
}
public static void h647_34(java.lang.Throwable p0) throws Throwable {
    throw __call3064734_0(p0);
}
public static void h647_35(java.lang.Throwable p0) throws Throwable {
    throw __call3064735_0(p0);
}
public static void h647_36(java.lang.Throwable p0) throws Throwable {
    throw __call3064736_0(p0);
}
public static void h647_37(java.lang.Throwable p0) throws Throwable {
    throw __call3064737_0(p0);
}
public static void h647_38(java.lang.Throwable p0) throws Throwable {
    throw __call3064738_0(p0);
}
public static void h647_39(java.lang.Throwable p0) throws Throwable {
    throw __call3064739_0(p0);
}
public static void h647_40(java.lang.Throwable p0) throws Throwable {
    throw __call3064740_0(p0);
}
public static void h647_41(java.lang.Throwable p0) throws Throwable {
    throw __call3064741_0(p0);
}
public static void h647_42(java.lang.Throwable p0) throws Throwable {
    throw __call3064742_0(p0);
}
public static void h647_43(java.lang.Throwable p0) throws Throwable {
    throw __call3064743_0(p0);
}
public static void h647_44(java.lang.Throwable p0) throws Throwable {
    throw __call3064744_0(p0);
}
public static void h647_45(java.lang.Throwable p0) throws Throwable {
    throw __call3064745_0(p0);
}
public static void h647_46(java.lang.Throwable p0) throws Throwable {
    throw __call3064746_0(p0);
}
public static void h647_47(java.lang.Throwable p0) throws Throwable {
    throw __call3064747_0(p0);
}
public static void h647_48(java.lang.Throwable p0) throws Throwable {
    throw __call3064748_0(p0);
}
public static void h647_49(java.lang.Throwable p0) throws Throwable {
    throw __call3064749_0(p0);
}
public static void h647_50(java.lang.Throwable p0) throws Throwable {
    throw __call3064750_0(p0);
}
public static void h647_51(java.lang.Throwable p0) throws Throwable {
    throw __call3064751_0(p0);
}
public static void h647_52(java.lang.Throwable p0) throws Throwable {
    throw __call3064752_0(p0);
}
public static void h647_53(java.lang.Throwable p0) throws Throwable {
    throw __call3064753_0(p0);
}
public static void h647_54(java.lang.Throwable p0) throws Throwable {
    throw __call3064754_0(p0);
}
public static void h647_55(java.lang.Throwable p0) throws Throwable {
    throw __call3064755_0(p0);
}
public static void h647_56(java.lang.Throwable p0) throws Throwable {
    throw __call3064756_0(p0);
}
public static void h647_57(java.lang.Throwable p0) throws Throwable {
    throw __call3064757_0(p0);
}
public static void h647_58(java.lang.Throwable p0) throws Throwable {
    throw __call3064758_0(p0);
}
public static void h647_59(java.lang.Throwable p0) throws Throwable {
    throw __call3064759_0(p0);
}
public static void h647_60(java.lang.Throwable p0) throws Throwable {
    throw __call3064760_0(p0);
}
public static void h647_61(java.lang.Throwable p0) throws Throwable {
    throw __call3064761_0(p0);
}
public static void h647_62(java.lang.Throwable p0) throws Throwable {
    throw __call3064762_0(p0);
}
public static void h647_63(java.lang.Throwable p0) throws Throwable {
    throw __call3064763_0(p0);
}
public static void h647_64(java.lang.Throwable p0) throws Throwable {
    throw __call3064764_0(p0);
}
public static void h647_65(java.lang.Throwable p0) throws Throwable {
    throw __call3064765_0(p0);
}
public static void h647_66(java.lang.Throwable p0) throws Throwable {
    throw __call3064766_0(p0);
}
public static void h647_67(java.lang.Throwable p0) throws Throwable {
    throw __call3064767_0(p0);
}
public static void h647_68(java.lang.Throwable p0) throws Throwable {
    throw __call3064768_0(p0);
}
public static void h647_69(java.lang.Throwable p0) throws Throwable {
    throw __call3064769_0(p0);
}
public static void h647_70(java.lang.Throwable p0) throws Throwable {
    throw __call3064770_0(p0);
}
public static void h647_71(java.lang.Throwable p0) throws Throwable {
    throw __call3064771_0(p0);
}
public static void h647_72(java.lang.Throwable p0) throws Throwable {
    throw __call3064772_0(p0);
}
public static void h647_73(java.lang.Throwable p0) throws Throwable {
    throw __call3064773_0(p0);
}
public static void h647_74(java.lang.Throwable p0) throws Throwable {
    throw __call3064774_0(p0);
}
public static void h647_75(java.lang.Throwable p0) throws Throwable {
    throw __call3064775_0(p0);
}
public static void h647_76(java.lang.Throwable p0) throws Throwable {
    throw __call3064776_0(p0);
}
public static void h647_77(java.lang.Throwable p0) throws Throwable {
    throw __call3064777_0(p0);
}
public static void h647_78(java.lang.Throwable p0) throws Throwable {
    throw __call3064778_0(p0);
}
public static void h647_79(java.lang.Throwable p0) throws Throwable {
    throw __call3064779_0(p0);
}
public static void h647_80(java.lang.Throwable p0) throws Throwable {
    throw __call3064780_0(p0);
}
public static void h647_81(java.lang.Throwable p0) throws Throwable {
    throw __call3064781_0(p0);
}
public static void h647_82(java.lang.Throwable p0) throws Throwable {
    throw __call3064782_0(p0);
}
public static void h647_83(java.lang.Throwable p0) throws Throwable {
    throw __call3064783_0(p0);
}
public static void h647_84(java.lang.Throwable p0) throws Throwable {
    throw __call3064784_0(p0);
}
public static void h647_85(java.lang.Throwable p0) throws Throwable {
    throw __call3064785_0(p0);
}
public static void h647_86(java.lang.Throwable p0) throws Throwable {
    throw __call3064786_0(p0);
}
public static void h647_87(java.lang.Throwable p0) throws Throwable {
    throw __call3064787_0(p0);
}
public static void h647_88(java.lang.Throwable p0) throws Throwable {
    throw __call3064788_0(p0);
}
public static void h647_89(java.lang.Throwable p0) throws Throwable {
    throw __call3064789_0(p0);
}
public static void h647_90(java.lang.Throwable p0) throws Throwable {
    throw __call3064790_0(p0);
}
public static void h647_91(java.lang.Throwable p0) throws Throwable {
    throw __call3064791_0(p0);
}
public static void h647_92(java.lang.Throwable p0) throws Throwable {
    throw __call3064792_0(p0);
}
public static void h647_93(java.lang.Throwable p0) throws Throwable {
    throw __call3064793_0(p0);
}
public static void h647_94(java.lang.Throwable p0) throws Throwable {
    throw __call3064794_0(p0);
}
public static void h647_95(java.lang.Throwable p0) throws Throwable {
    throw __call3064795_0(p0);
}
public static void h647_96(java.lang.Throwable p0) throws Throwable {
    throw __call3064796_0(p0);
}
public static void h647_97(java.lang.Throwable p0) throws Throwable {
    throw __call3064797_0(p0);
}
public static void h647_98(java.lang.Throwable p0) throws Throwable {
    throw __call3064798_0(p0);
}
public static void h647_99(java.lang.Throwable p0) throws Throwable {
    throw __call3064799_0(p0);
}
public static void h647_100(java.lang.Throwable p0) throws Throwable {
    throw __call3064800_0(p0);
}
public static void h647_101(java.lang.Throwable p0) throws Throwable {
    throw __call3064801_0(p0);
}
public static void h647_102(java.lang.Throwable p0) throws Throwable {
    throw __call3064802_0(p0);
}
public static void h647_103(java.lang.Throwable p0) throws Throwable {
    throw __call3064803_0(p0);
}
public static void h647_104(java.lang.Throwable p0) throws Throwable {
    throw __call3064804_0(p0);
}
public static void h647_105(java.lang.Throwable p0) throws Throwable {
    throw __call3064805_0(p0);
}
public static void h647_106(java.lang.Throwable p0) throws Throwable {
    throw __call3064806_0(p0);
}
public static void h647_107(java.lang.Throwable p0) throws Throwable {
    throw __call3064807_0(p0);
}
public static void h647_108(java.lang.Throwable p0) throws Throwable {
    throw __call3064808_0(p0);
}
public static void h647_109(java.lang.Throwable p0) throws Throwable {
    throw __call3064809_0(p0);
}
public static void h647_110(java.lang.Throwable p0) throws Throwable {
    throw __call3064810_0(p0);
}
public static void h647_111(java.lang.Throwable p0) throws Throwable {
    throw __call3064811_0(p0);
}
public static void h647_112(java.lang.Throwable p0) throws Throwable {
    throw __call3064812_0(p0);
}
public static void h647_113(java.lang.Throwable p0) throws Throwable {
    throw __call3064813_0(p0);
}
public static void h647_114(java.lang.Throwable p0) throws Throwable {
    throw __call3064814_0(p0);
}
public static void h647_115(java.lang.Throwable p0, net.minecraft.entity.Entity p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call3064815_0(life2_2, "Checking entity block collision");
    life4_10 = __call3064815_1(life3_6, "Entity being checked for collision");
    __call3064815_2(p1, life4_10);
    throw new moom.Oo(life3_6);
}
public static void h647_116(java.lang.Throwable p0) throws Throwable {
    throw __call3064816_0(p0);
}
public static void h647_117(java.lang.Throwable p0) throws Throwable {
    throw __call3064817_0(p0);
}
public static void h647_118(java.lang.Throwable p0) throws Throwable {
    throw __call3064818_0(p0);
}
public static void h647_119(java.lang.Throwable p0) throws Throwable {
    throw __call3064819_0(p0);
}
public static void h647_120(java.lang.Throwable p0) throws Throwable {
    throw __call3064820_0(p0);
}
public static void h647_121(java.lang.Throwable p0) throws Throwable {
    throw __call3064821_0(p0);
}
public static void h647_122(java.lang.Throwable p0) throws Throwable {
    throw __call3064822_0(p0);
}
public static void h647_123(java.lang.Throwable p0) throws Throwable {
    throw __call3064823_0(p0);
}
public static void h647_124(java.lang.Throwable p0) throws Throwable {
    throw __call3064824_0(p0);
}
public static void h647_125(java.lang.Throwable p0) throws Throwable {
    throw __call3064825_0(p0);
}
public static void h647_126(java.lang.Throwable p0) throws Throwable {
    throw __call3064826_0(p0);
}
public static void h647_127(java.lang.Throwable p0) throws Throwable {
    throw __call3064827_0(p0);
}
public static void h647_128(java.lang.Throwable p0) throws Throwable {
    throw __call3064828_0(p0);
}
private static native long __fieldRead647_0() throws Throwable;
private static native int __call647_1() throws Throwable;
private static native int __instanceOf647_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __cast647_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead647_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __fieldRead647_5(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __fieldRead647_6(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call647_7() throws Throwable;
private static native com.moon.events.EventBus __call647_8(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call647_9(com.moon.events.EventBus a0, com.moon.event.MotionEvent a1) throws Throwable;
private static native double __call647_10(com.moon.event.MotionEvent a0) throws Throwable;
private static native double __call647_11(com.moon.event.MotionEvent a0) throws Throwable;
private static native double __call647_12(com.moon.event.MotionEvent a0) throws Throwable;
private static native boolean __fieldRead647_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_14(boolean value) throws Throwable;
private static native moom.CA __call647_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_16(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native void __call647_17(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native void __call647_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead647_20(net.minecraft.world.World a0) throws Throwable;
private static native void __call647_21(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead647_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead647_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite647_26(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite647_27(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite647_28(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite647_29(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native boolean __fieldRead647_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_31(boolean value) throws Throwable;
private static native boolean __call647_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_33(boolean value) throws Throwable;
private static native int __instanceOf647_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call647_35() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead647_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call647_37() throws Throwable;
private static native com.moon.events.EventBus __call647_38(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call647_39(com.moon.events.EventBus a0, com.moon.dR a1) throws Throwable;
private static native boolean __call647_40(com.moon.dR a0) throws Throwable;
private static native int __integerCategory647_41(boolean value) throws Throwable;
private static native int __instanceOf647_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare647_43(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_46(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call647_47(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call647_48(java.util.List a0) throws Throwable;
private static native int __integerCategory647_49(boolean value) throws Throwable;
private static native int __integerCategory647_50(boolean value) throws Throwable;
private static native int __numericCompare647_51(double a0, double a1) throws Throwable;
private static native int __numericCompare647_52(double a0, double a1) throws Throwable;
private static native int __numericCompare647_53(double a0, double a1) throws Throwable;
private static native int __numericCompare647_54(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_56(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_57(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call647_58(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call647_59(java.util.List a0) throws Throwable;
private static native int __integerCategory647_60(boolean value) throws Throwable;
private static native int __integerCategory647_61(boolean value) throws Throwable;
private static native int __numericCompare647_62(double a0, double a1) throws Throwable;
private static native int __numericCompare647_63(double a0, double a1) throws Throwable;
private static native int __numericCompare647_64(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_65(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_66(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_67(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call647_68(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call647_69(java.util.List a0) throws Throwable;
private static native int __integerCategory647_70(boolean value) throws Throwable;
private static native int __integerCategory647_71(boolean value) throws Throwable;
private static native int __numericCompare647_72(double a0, double a1) throws Throwable;
private static native int __numericCompare647_73(double a0, double a1) throws Throwable;
private static native int __numericCompare647_74(double a0, double a1) throws Throwable;
private static native int __numericCompare647_75(double a0, double a1) throws Throwable;
private static native int __numericCompare647_76(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_77(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_78(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_79(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call647_80(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call647_81(java.util.List a0) throws Throwable;
private static native int __integerCategory647_82(boolean value) throws Throwable;
private static native int __numericCompare647_83(double a0, double a1) throws Throwable;
private static native int __numericCompare647_84(double a0, double a1) throws Throwable;
private static native int __numericCompare647_85(double a0, double a1) throws Throwable;
private static native int __numericCompare647_86(double a0, double a1) throws Throwable;
private static native int __numericCompare647_87(double a0, double a1) throws Throwable;
private static native int __numericCompare647_88(double a0, double a1) throws Throwable;
private static native int __numericCompare647_89(double a0, double a1) throws Throwable;
private static native int __numericCompare647_90(double a0, double a1) throws Throwable;
private static native int __numericCompare647_91(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_92(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_93(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_94(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call647_95(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call647_96(java.util.List a0) throws Throwable;
private static native int __integerCategory647_97(boolean value) throws Throwable;
private static native int __numericCompare647_98(double a0, double a1) throws Throwable;
private static native int __numericCompare647_99(double a0, double a1) throws Throwable;
private static native int __numericCompare647_100(double a0, double a1) throws Throwable;
private static native int __numericCompare647_101(double a0, double a1) throws Throwable;
private static native int __numericCompare647_102(double a0, double a1) throws Throwable;
private static native int __numericCompare647_103(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_104(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_105(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_106(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call647_107(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native moom.CA __call647_108(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Iterator __call647_109(java.util.List a0) throws Throwable;
private static native boolean __call647_110(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_111(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_112(java.lang.Object a0) throws Throwable;
private static native moom.CA __call647_113(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call647_114(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_115(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_116(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native void __call647_117(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native boolean __fieldRead647_118(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_119(boolean value) throws Throwable;
private static native int __numericCompare647_120(double a0, double a1) throws Throwable;
private static native int __numericCompare647_121(double a0, double a1) throws Throwable;
private static native java.util.Iterator __call647_122(java.util.List a0) throws Throwable;
private static native boolean __call647_123(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_124(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_125(java.lang.Object a0) throws Throwable;
private static native moom.CA __call647_126(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call647_127(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_128(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_129(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native void __call647_130(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native java.util.Iterator __call647_131(java.util.List a0) throws Throwable;
private static native boolean __call647_132(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_133(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_134(java.lang.Object a0) throws Throwable;
private static native moom.CA __call647_135(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call647_136(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_137(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_138(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native void __call647_139(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native float __fieldRead647_140(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare647_141(float a0, float a1) throws Throwable;
private static native int __numericCompare647_142(double a0, double a1) throws Throwable;
private static native int __numericCompare647_143(double a0, double a1) throws Throwable;
private static native float __fieldRead647_144(net.minecraft.entity.Entity a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call647_145() throws Throwable;
private static native com.moon.events.EventBus __call647_146(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call647_147(com.moon.events.EventBus a0, com.moon.dU a1) throws Throwable;
private static native float __call647_148(com.moon.dU a0) throws Throwable;
private static native void __fieldWrite647_149(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native boolean __call647_150(com.moon.dU a0) throws Throwable;
private static native moom.CA __call647_151(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call647_152(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native float __fieldRead647_153(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_154(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_155(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_156(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call647_157(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native moom.CA __call647_158(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_159(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.Iterator __call647_160(java.util.List a0) throws Throwable;
private static native boolean __call647_161(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_162(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_163(java.lang.Object a0) throws Throwable;
private static native double __call647_164(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_165(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.Iterator __call647_166(java.util.List a0) throws Throwable;
private static native boolean __call647_167(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_168(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_169(java.lang.Object a0) throws Throwable;
private static native double __call647_170(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_171(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.Iterator __call647_172(java.util.List a0) throws Throwable;
private static native boolean __call647_173(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_174(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_175(java.lang.Object a0) throws Throwable;
private static native double __call647_176(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_177(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.CA __call647_178(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Iterator __call647_179(java.util.List a0) throws Throwable;
private static native boolean __call647_180(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_181(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_182(java.lang.Object a0) throws Throwable;
private static native double __call647_183(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_184(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.Iterator __call647_185(java.util.List a0) throws Throwable;
private static native boolean __call647_186(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_187(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_188(java.lang.Object a0) throws Throwable;
private static native double __call647_189(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_190(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.Iterator __call647_191(java.util.List a0) throws Throwable;
private static native boolean __call647_192(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_193(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_194(java.lang.Object a0) throws Throwable;
private static native double __call647_195(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_196(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare647_197(double a0, double a1) throws Throwable;
private static native void __call647_198(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native void __call647_199(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native java.util.Iterator __call647_200(java.util.List a0) throws Throwable;
private static native boolean __call647_201(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call647_202(java.util.Iterator a0) throws Throwable;
private static native moom.CA __cast647_203(java.lang.Object a0) throws Throwable;
private static native moom.CA __call647_204(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call647_205(moom.CA a0, moom.CA a1, double a2) throws Throwable;
private static native moom.CA __call647_206(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_207(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native void __call647_208(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native int __numericCompare647_209(double a0, double a1) throws Throwable;
private static native void __call647_210(net.minecraft.entity.Entity a0, moom.CA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call647_211() throws Throwable;
private static native com.moon.events.EventBus __call647_212(com.moon.runtime.ClientContext a0) throws Throwable;
private static native float __fieldRead647_213(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call647_214(com.moon.events.EventBus a0, com.moon.dU a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_215(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead647_216(net.minecraft.world.World a0) throws Throwable;
private static native void __call647_217(moom.A9 a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_218(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead647_219(net.minecraft.world.World a0) throws Throwable;
private static native void __call647_220(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call647_221(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare647_222(double a0, double a1) throws Throwable;
private static native int __numericCompare647_223(double a0, double a1) throws Throwable;
private static native void __fieldWrite647_224(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __numericCompare647_225(double a0, double a1) throws Throwable;
private static native void __fieldWrite647_226(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __fieldRead647_227(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_228(boolean value) throws Throwable;
private static native int __numericCompare647_229(double a0, double a1) throws Throwable;
private static native void __fieldWrite647_230(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __fieldRead647_231(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_232(boolean value) throws Throwable;
private static native boolean __fieldRead647_233(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_234(boolean value) throws Throwable;
private static native void __fieldWrite647_235(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native double __fieldRead647_236(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call647_237(double a0) throws Throwable;
private static native double __fieldRead647_238(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call647_239(double a0) throws Throwable;
private static native double __fieldRead647_240(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call647_241(double a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_242(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call647_243(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call647_244(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call647_245(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead647_246() throws Throwable;
private static native net.minecraft.world.World __fieldRead647_247(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call647_248(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call647_249(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call647_250(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf647_251(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf647_252(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf647_253(net.minecraft.block.Block a0) throws Throwable;
private static native moom.DT __call647_254(moom.DT a0) throws Throwable;
private static native boolean __fieldRead647_255(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call647_256(net.minecraft.entity.Entity a0, double a1, boolean a2, net.minecraft.block.Block a3, moom.DT a4) throws Throwable;
private static native int __numericCompare647_257(double a0, double a1) throws Throwable;
private static native void __fieldWrite647_258(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native int __numericCompare647_259(double a0, double a1) throws Throwable;
private static native void __fieldWrite647_260(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native int __numericCompare647_261(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_262(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call647_263(net.minecraft.block.Block a0, net.minecraft.world.World a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native boolean __call647_264(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_265(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead647_266(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_267(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_268(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_269(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead647_270() throws Throwable;
private static native boolean __fieldRead647_271(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_272(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_273(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call647_274(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.entity.Entity a3) throws Throwable;
private static native float __fieldRead647_275(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call647_276(double a0) throws Throwable;
private static native void __fieldWrite647_277(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead647_278(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call647_279(double a0) throws Throwable;
private static native void __fieldWrite647_280(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead647_281(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead647_282(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare647_283(float a0, float a1) throws Throwable;
private static native moom.fn __call647_284(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead647_285() throws Throwable;
private static native float __fieldRead647_286(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite647_287(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __call647_288(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_289(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_290(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_291(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_292(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_293(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead647_294(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call647_295(double a0) throws Throwable;
private static native int __numericCompare647_296(float a0, float a1) throws Throwable;
private static native java.lang.String __call647_297(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Random __fieldRead647_298(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call647_299(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead647_300(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call647_301(java.util.Random a0) throws Throwable;
private static native void __call647_302(net.minecraft.entity.Entity a0, java.lang.String a1, float a2, float a3) throws Throwable;
private static native void __call647_303(net.minecraft.entity.Entity a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native void __call647_304(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call647_305(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory647_306(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_307(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_308(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call647_309(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native boolean __call647_310(net.minecraft.world.World a0, moom.CA a1) throws Throwable;
private static native int __integerCategory647_311(boolean value) throws Throwable;
private static native void __call647_312(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead647_314(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite647_315(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead647_316(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic647_317(int a0, long a1) throws Throwable;
private static native void __call647_318(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead647_319(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead647_320(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite647_321(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead647_322(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Random __fieldRead647_323(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call647_324(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead647_325(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call647_326(java.util.Random a0) throws Throwable;
private static native void __call647_327(net.minecraft.entity.Entity a0, java.lang.String a1, float a2, float a3) throws Throwable;
private static native int __fieldRead647_328(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite647_329(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead647_330(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead647_331(net.minecraft.world.World a0) throws Throwable;
private static native void __call647_332(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3064700_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064701_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064702_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064703_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064704_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064705_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064706_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064707_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064708_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064709_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064710_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064711_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064712_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064713_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064714_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064715_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064716_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064717_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064718_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064719_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064720_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064721_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064722_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064723_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064724_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064725_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064726_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064727_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064728_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064729_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064730_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064731_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064732_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064733_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064734_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064735_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064736_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064737_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064738_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064739_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064740_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064741_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064742_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064743_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064744_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064745_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064746_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064747_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064748_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064749_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064750_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064751_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064752_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064753_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064754_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064755_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064756_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064757_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064758_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064759_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064760_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064761_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064762_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064763_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064764_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064765_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064766_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064767_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064768_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064769_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064770_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064771_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064772_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064773_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064774_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064775_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064776_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064777_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064778_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064779_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064780_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064781_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064782_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064783_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064784_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064785_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064786_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064787_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064788_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064789_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064790_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064791_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064792_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064793_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064794_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064795_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064796_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064797_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064798_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064799_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064800_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064801_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064802_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064803_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064804_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064805_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064806_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064807_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064808_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064809_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064810_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064811_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064812_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064813_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064814_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3064815_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3064815_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3064815_2(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;
private static native java.lang.Throwable __call3064816_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064817_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064818_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064819_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064820_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064821_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064822_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064823_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064824_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064825_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064826_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064827_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3064828_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_09e09ea6f26a8066f3d0(net.minecraft.entity.Entity a0, int a1) throws E;
private static final class __SourceHandler_09e09ea6f26a8066f3d0 {

public static void f248(net.minecraft.entity.Entity receiver, int p0) throws Throwable {
    int forwardValue248_16_0;
    boolean spill248_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (__fieldRead248_0() ^ 88311380911964L);
    life4_5 = __call248_1();
    spill248_0 = __fieldRead248_2(receiver);
    if (!((life4_5 == 0))) {
        forwardValue248_16_0 = __integerCategory248_3(spill248_0);
        break forward_join_16;
    }
    if (!((!spill248_0))) {
        break forward_join_17;
    }
    forwardValue248_16_0 = __integerCategory248_6(__call248_5(receiver, __fieldRead248_4(), ((float) p0)));
    }
    __discardScalar248_7(forwardValue248_16_0);
    }
    return;
}
public static void h248_0(moom.Oo p0) throws Throwable {
    throw __call1024800_0(p0);
}
public static void h248_1(moom.Oo p0) throws Throwable {
    throw __call1024801_0(p0);
}
private static native long __fieldRead248_0() throws Throwable;
private static native int __call248_1() throws Throwable;
private static native boolean __fieldRead248_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory248_3(boolean value) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead248_4() throws Throwable;
private static native boolean __call248_5(net.minecraft.entity.Entity a0, net.minecraft.util.DamageSource a1, float a2) throws Throwable;
private static native int __integerCategory248_6(boolean value) throws Throwable;
private static native void __discardScalar248_7(int a0) throws Throwable;
private static native java.lang.Throwable __call1024800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_cb945cfe4b1b49720c73(net.minecraft.entity.Entity a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_cb945cfe4b1b49720c73 {

public static boolean f1517(net.minecraft.entity.Entity receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int forwardValue1517_13_0;
    int forwardValue1517_17_0;
    int forwardValue1517_19_0;
    boolean spill1517_0;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (__fieldRead1517_0() ^ 41116048713714L);
    life4_5 = __call1517_1();
    spill1517_0 = __call1517_2(p0);
    if (!((life4_5 != 0))) {
        forwardValue1517_13_0 = __integerCategory1517_3(spill1517_0);
        break forward_join_13;
    }
    if (!((!spill1517_0))) {
        break forward_join_18;
    }
    forwardValue1517_13_0 = __integerCategory1517_5(__call1517_4(receiver));
    }
    if (!((life4_5 != 0))) {
        forwardValue1517_17_0 = forwardValue1517_13_0;
        break forward_join_17;
    }
    if (!((forwardValue1517_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue1517_17_0 = 1;
    }
    forwardValue1517_19_0 = forwardValue1517_17_0;
    break forward_join_19;
    }
    forwardValue1517_19_0 = 0;
    }
    return __integerCategory1517_6(forwardValue1517_19_0);
}
public static void h1517_0(moom.Oo p0) throws Throwable {
    throw __call1151700_0(p0);
}
public static void h1517_1(moom.Oo p0) throws Throwable {
    throw __call1151701_0(p0);
}
public static void h1517_2(moom.Oo p0) throws Throwable {
    throw __call1151702_0(p0);
}
private static native long __fieldRead1517_0() throws Throwable;
private static native int __call1517_1() throws Throwable;
private static native boolean __call1517_2(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __integerCategory1517_3(boolean value) throws Throwable;
private static native boolean __call1517_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1517_5(boolean value) throws Throwable;
private static native boolean __integerCategory1517_6(int value) throws Throwable;
private static native java.lang.Throwable __call1151700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d6ba6da712fe6ff0ab97(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws E;
private static final class __SourceHandler_d6ba6da712fe6ff0ab97 {

public static boolean f1518(net.minecraft.entity.Entity receiver, double p0, double p1, double p2) throws Throwable {
    int forwardValue1518_52_0;
    int forwardValue1518_78_0;
    int forwardValue1518_100_0;
    int forwardValue1518_122_0;
    int forwardValue1518_142_0;
    int forwardValue1518_156_0;
    net.minecraft.entity.Entity forwardValue1518_158_0;
    int forwardValue1518_175_0;
    int forwardValue1518_185_0;
    int forwardValue1518_185_1;
    int forwardValue1518_194_0;
    int forwardValue1518_194_1;
    int forwardValue1518_206_0;
    int forwardValue1518_206_1;
    int forwardValue1518_212_0;
    int spill1518_0;
    boolean spill1518_1;
    boolean spill1518_2;
    boolean spill1518_3;
    int spill1518_4;
    int spill1518_5;
    int spill1518_6;
    int spill1518_7;
    net.minecraft.entity.Entity spill1518_8;
    int spill1518_9;
    int spill1518_10;
    int spill1518_11;
    int spill1518_12;
    long life7_3;
    moom.DT life10_10;
    double life11_17;
    double life13_23;
    double life15_29;
    int life9_30;
    java.util.List life17_36;
    int life18_63;
    double life19_65;
    double life19_210;
    float life21_220;
    forward_join_212: {
    forward_join_211: {
    forward_join_206: {
    forward_join_202: {
    forward_join_194: {
    forward_join_192: {
    forward_join_185: {
    forward_join_183: {
    forward_join_175: {
    forward_join_174: {
    forward_join_158: {
    forward_join_157: {
    forward_join_156: {
    forward_join_142: {
    forward_join_135: {
    forward_join_122: {
    forward_join_117: {
    forward_join_100: {
    forward_join_95: {
    forward_join_78: {
    forward_join_73: {
    forward_join_52: {
    forward_join_51: {
    life7_3 = (__fieldRead1518_0() ^ 17250544038444L);
    life10_10 = new moom.DT(p0, p1, p2);
    spill1518_0 = __call1518_1();
    life11_17 = (p0 - ((double) __call1518_2(life10_10)));
    life13_23 = (p1 - ((double) __call1518_3(life10_10)));
    life15_29 = (p2 - ((double) __call1518_4(life10_10)));
    life9_30 = spill1518_0;
    life17_36 = __call1518_7(__fieldRead1518_5(receiver), __call1518_6(receiver));
    spill1518_1 = __call1518_8(life17_36);
    if (!((life9_30 != 0))) {
        forwardValue1518_52_0 = __integerCategory1518_9(spill1518_1);
        break forward_join_52;
    }
    if (!(spill1518_1)) {
        break forward_join_51;
    }
    spill1518_2 = __call1518_11(__fieldRead1518_10(receiver), life10_10);
    if (!((life9_30 != 0))) {
        forwardValue1518_52_0 = __integerCategory1518_12(spill1518_2);
        break forward_join_52;
    }
    if (!((!spill1518_2))) {
        break forward_join_51;
    }
    return __integerCategory1518_13(0);
    }
    forwardValue1518_52_0 = 3;
    }
    life18_63 = forwardValue1518_52_0;
    life19_65 = 0x1.3878p13d;
    spill1518_3 = __call1518_16(__fieldRead1518_14(receiver), __call1518_15(life10_10));
    if (!((life9_30 != 0))) {
        forwardValue1518_78_0 = __integerCategory1518_17(spill1518_3);
        break forward_join_78;
    }
    if (!((!spill1518_3))) {
        break forward_join_73;
    }
    spill1518_4 = __numericCompare1518_18(life11_17, life19_65);
    if (!((life9_30 != 0))) {
        forwardValue1518_78_0 = spill1518_4;
        break forward_join_78;
    }
    if (!((spill1518_4 < 0))) {
        break forward_join_73;
    }
    life19_65 = life11_17;
    life18_63 = 0;
    }
    forwardValue1518_78_0 = __integerCategory1518_22(__call1518_21(__fieldRead1518_19(receiver), __call1518_20(life10_10)));
    }
    if (!((life9_30 != 0))) {
        forwardValue1518_100_0 = forwardValue1518_78_0;
        break forward_join_100;
    }
    if (!((forwardValue1518_78_0 == 0))) {
        break forward_join_95;
    }
    spill1518_5 = __numericCompare1518_23((0x1.0p0d - life11_17), life19_65);
    if (!((life9_30 != 0))) {
        forwardValue1518_100_0 = spill1518_5;
        break forward_join_100;
    }
    if (!((spill1518_5 < 0))) {
        break forward_join_95;
    }
    life19_65 = (0x1.0p0d - life11_17);
    life18_63 = 1;
    }
    forwardValue1518_100_0 = __integerCategory1518_27(__call1518_26(__fieldRead1518_24(receiver), __call1518_25(life10_10)));
    }
    if (!((life9_30 != 0))) {
        forwardValue1518_122_0 = forwardValue1518_100_0;
        break forward_join_122;
    }
    if (!((forwardValue1518_100_0 == 0))) {
        break forward_join_117;
    }
    spill1518_6 = __numericCompare1518_28((0x1.0p0d - life13_23), life19_65);
    if (!((life9_30 != 0))) {
        forwardValue1518_122_0 = spill1518_6;
        break forward_join_122;
    }
    if (!((spill1518_6 < 0))) {
        break forward_join_117;
    }
    life19_65 = (0x1.0p0d - life13_23);
    life18_63 = 3;
    }
    forwardValue1518_122_0 = __integerCategory1518_32(__call1518_31(__fieldRead1518_29(receiver), __call1518_30(life10_10)));
    }
    if (!((life9_30 != 0))) {
        forwardValue1518_142_0 = forwardValue1518_122_0;
        break forward_join_142;
    }
    if (!((forwardValue1518_122_0 == 0))) {
        break forward_join_135;
    }
    spill1518_7 = __numericCompare1518_33(life15_29, life19_65);
    if (!((life9_30 != 0))) {
        forwardValue1518_142_0 = spill1518_7;
        break forward_join_142;
    }
    if (!((spill1518_7 < 0))) {
        break forward_join_135;
    }
    life19_65 = life15_29;
    life18_63 = 4;
    }
    spill1518_8 = receiver;
    if (!((life9_30 != 0))) {
        forwardValue1518_158_0 = spill1518_8;
        break forward_join_158;
    }
    forwardValue1518_142_0 = __integerCategory1518_37(__call1518_36(__fieldRead1518_34(spill1518_8), __call1518_35(life10_10)));
    }
    if (!((forwardValue1518_142_0 == 0))) {
        break forward_join_157;
    }
    spill1518_9 = __numericCompare1518_38((0x1.0p0d - life15_29), life19_65);
    if (!((life9_30 != 0))) {
        forwardValue1518_156_0 = spill1518_9;
        break forward_join_156;
    }
    if (!((spill1518_9 < 0))) {
        break forward_join_157;
    }
    life19_210 = (0x1.0p0d - life15_29);
    forwardValue1518_156_0 = 5;
    }
    life18_63 = forwardValue1518_156_0;
    }
    forwardValue1518_158_0 = receiver;
    }
    life21_220 = ((__call1518_40(__fieldRead1518_39(forwardValue1518_158_0)) * 0x1.99999ap-3f) + 0x1.99999ap-4f);
    spill1518_10 = life18_63;
    if (!((life9_30 != 0))) {
        forwardValue1518_175_0 = spill1518_10;
        break forward_join_175;
    }
    if (!((spill1518_10 == 0))) {
        break forward_join_174;
    }
    __fieldWrite1518_41(receiver, ((double) (-life21_220)));
    }
    forwardValue1518_175_0 = life18_63;
    }
    spill1518_11 = 1;
    if (!((life9_30 != 0))) {
        forwardValue1518_185_0 = forwardValue1518_175_0;
        forwardValue1518_185_1 = spill1518_11;
        break forward_join_185;
    }
    if (!((forwardValue1518_175_0 == spill1518_11))) {
        break forward_join_183;
    }
    __fieldWrite1518_42(receiver, ((double) life21_220));
    }
    forwardValue1518_185_0 = life18_63;
    forwardValue1518_185_1 = 3;
    }
    if (!((life9_30 != 0))) {
        forwardValue1518_194_0 = forwardValue1518_185_0;
        forwardValue1518_194_1 = forwardValue1518_185_1;
        break forward_join_194;
    }
    if (!((forwardValue1518_185_0 == forwardValue1518_185_1))) {
        break forward_join_192;
    }
    __fieldWrite1518_43(receiver, ((double) life21_220));
    }
    forwardValue1518_194_0 = life18_63;
    forwardValue1518_194_1 = 4;
    }
    if (!((life9_30 != 0))) {
        forwardValue1518_206_0 = forwardValue1518_194_0;
        forwardValue1518_206_1 = forwardValue1518_194_1;
        break forward_join_206;
    }
    if (!((forwardValue1518_194_0 == forwardValue1518_194_1))) {
        break forward_join_202;
    }
    __fieldWrite1518_44(receiver, ((double) (-life21_220)));
    }
    spill1518_12 = life18_63;
    if (!((life9_30 != 0))) {
        forwardValue1518_212_0 = spill1518_12;
        break forward_join_212;
    }
    forwardValue1518_206_0 = spill1518_12;
    forwardValue1518_206_1 = 5;
    }
    if (!((forwardValue1518_206_0 == forwardValue1518_206_1))) {
        break forward_join_211;
    }
    __fieldWrite1518_45(receiver, ((double) life21_220));
    }
    forwardValue1518_212_0 = 1;
    }
    return __integerCategory1518_46(forwardValue1518_212_0);
}
public static void h1518_0(moom.Oo p0) throws Throwable {
    throw __call1151800_0(p0);
}
public static void h1518_1(moom.Oo p0) throws Throwable {
    throw __call1151801_0(p0);
}
public static void h1518_2(moom.Oo p0) throws Throwable {
    throw __call1151802_0(p0);
}
public static void h1518_3(moom.Oo p0) throws Throwable {
    throw __call1151803_0(p0);
}
public static void h1518_4(moom.Oo p0) throws Throwable {
    throw __call1151804_0(p0);
}
public static void h1518_5(moom.Oo p0) throws Throwable {
    throw __call1151805_0(p0);
}
public static void h1518_6(moom.Oo p0) throws Throwable {
    throw __call1151806_0(p0);
}
public static void h1518_7(moom.Oo p0) throws Throwable {
    throw __call1151807_0(p0);
}
public static void h1518_8(moom.Oo p0) throws Throwable {
    throw __call1151808_0(p0);
}
public static void h1518_9(moom.Oo p0) throws Throwable {
    throw __call1151809_0(p0);
}
public static void h1518_10(moom.Oo p0) throws Throwable {
    throw __call1151810_0(p0);
}
public static void h1518_11(moom.Oo p0) throws Throwable {
    throw __call1151811_0(p0);
}
public static void h1518_12(moom.Oo p0) throws Throwable {
    throw __call1151812_0(p0);
}
public static void h1518_13(moom.Oo p0) throws Throwable {
    throw __call1151813_0(p0);
}
public static void h1518_14(moom.Oo p0) throws Throwable {
    throw __call1151814_0(p0);
}
public static void h1518_15(moom.Oo p0) throws Throwable {
    throw __call1151815_0(p0);
}
public static void h1518_16(moom.Oo p0) throws Throwable {
    throw __call1151816_0(p0);
}
public static void h1518_17(moom.Oo p0) throws Throwable {
    throw __call1151817_0(p0);
}
public static void h1518_18(moom.Oo p0) throws Throwable {
    throw __call1151818_0(p0);
}
public static void h1518_19(moom.Oo p0) throws Throwable {
    throw __call1151819_0(p0);
}
public static void h1518_20(moom.Oo p0) throws Throwable {
    throw __call1151820_0(p0);
}
public static void h1518_21(moom.Oo p0) throws Throwable {
    throw __call1151821_0(p0);
}
public static void h1518_22(moom.Oo p0) throws Throwable {
    throw __call1151822_0(p0);
}
public static void h1518_23(moom.Oo p0) throws Throwable {
    throw __call1151823_0(p0);
}
public static void h1518_24(moom.Oo p0) throws Throwable {
    throw __call1151824_0(p0);
}
public static void h1518_25(moom.Oo p0) throws Throwable {
    throw __call1151825_0(p0);
}
public static void h1518_26(moom.Oo p0) throws Throwable {
    throw __call1151826_0(p0);
}
public static void h1518_27(moom.Oo p0) throws Throwable {
    throw __call1151827_0(p0);
}
public static void h1518_28(moom.Oo p0) throws Throwable {
    throw __call1151828_0(p0);
}
private static native long __fieldRead1518_0() throws Throwable;
private static native int __call1518_1() throws Throwable;
private static native int __call1518_2(moom.DT a0) throws Throwable;
private static native int __call1518_3(moom.DT a0) throws Throwable;
private static native int __call1518_4(moom.DT a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1518_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1518_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __call1518_7(net.minecraft.world.World a0, moom.CA a1) throws Throwable;
private static native boolean __call1518_8(java.util.List a0) throws Throwable;
private static native int __integerCategory1518_9(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1518_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1518_11(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1518_12(boolean value) throws Throwable;
private static native boolean __integerCategory1518_13(int value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1518_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call1518_15(moom.DT a0) throws Throwable;
private static native boolean __call1518_16(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1518_17(boolean value) throws Throwable;
private static native int __numericCompare1518_18(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1518_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call1518_20(moom.DT a0) throws Throwable;
private static native boolean __call1518_21(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1518_22(boolean value) throws Throwable;
private static native int __numericCompare1518_23(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1518_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call1518_25(moom.DT a0) throws Throwable;
private static native boolean __call1518_26(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1518_27(boolean value) throws Throwable;
private static native int __numericCompare1518_28(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1518_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call1518_30(moom.DT a0) throws Throwable;
private static native boolean __call1518_31(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1518_32(boolean value) throws Throwable;
private static native int __numericCompare1518_33(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1518_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call1518_35(moom.DT a0) throws Throwable;
private static native boolean __call1518_36(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1518_37(boolean value) throws Throwable;
private static native int __numericCompare1518_38(double a0, double a1) throws Throwable;
private static native java.util.Random __fieldRead1518_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1518_40(java.util.Random a0) throws Throwable;
private static native void __fieldWrite1518_41(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1518_42(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1518_43(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1518_44(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1518_45(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native boolean __integerCategory1518_46(int value) throws Throwable;
private static native java.lang.Throwable __call1151800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151811_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151812_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151813_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151814_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151815_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151816_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151817_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151818_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151819_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151820_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151821_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151822_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151823_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151824_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151825_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151826_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151827_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151828_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c30a8111cc77d0a71326(net.minecraft.entity.Entity a0, float a1, float a2) throws E;
private static final class __SourceHandler_c30a8111cc77d0a71326 {

public static void f1519(net.minecraft.entity.Entity receiver, float p0, float p1) throws Throwable {
    net.minecraft.entity.Entity forwardValue1519_13_0;
    net.minecraft.entity.Entity spill1519_0;
    long life3_3;
    int life5_5;
    forward_join_16: {
    forward_join_13: {
    life3_3 = (__fieldRead1519_0() ^ 109110365659795L);
    life5_5 = __call1519_1();
    spill1519_0 = __fieldRead1519_2(receiver);
    if (!((life5_5 != 0))) {
        forwardValue1519_13_0 = spill1519_0;
        break forward_join_13;
    }
    if (!((spill1519_0 != null))) {
        break forward_join_16;
    }
    forwardValue1519_13_0 = __fieldRead1519_3(receiver);
    }
    __call1519_4(forwardValue1519_13_0, p0, p1);
    }
    return;
}
public static void h1519_0(moom.Oo p0) throws Throwable {
    throw __call1151900_0(p0);
}
public static void h1519_1(moom.Oo p0) throws Throwable {
    throw __call1151901_0(p0);
}
private static native long __fieldRead1519_0() throws Throwable;
private static native int __call1519_1() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1519_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1519_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1519_4(net.minecraft.entity.Entity a0, float a1, float a2) throws Throwable;
private static native java.lang.Throwable __call1151900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1151901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2f4e776a7d92dcd61853(net.minecraft.entity.Entity a0, int a1) throws E;
private static final class __SourceHandler_2f4e776a7d92dcd61853 {

public static void f249(net.minecraft.entity.Entity receiver, int p0) throws Throwable {
    int forwardValue249_16_0;
    net.minecraft.entity.Entity forwardValue249_18_0;
    int forwardValue249_115_0;
    net.minecraft.entity.Entity forwardValue249_128_0;
    boolean spill249_0;
    net.minecraft.entity.Entity spill249_1;
    net.minecraft.entity.Entity spill249_2;
    int spill249_3;
    int spill249_4;
    long life2_3;
    int life4_5;
    moom.Bl life5_32;
    int life6_35;
    net.minecraft.world.WorldServer life7_39;
    net.minecraft.world.WorldServer life8_43;
    net.minecraft.entity.Entity life9_96;
    moom.DT life10_134;
    forward_join_131: {
    forward_join_128: {
    forward_join_116: {
    forward_join_115: {
    forward_join_112: {
    forward_join_77: {
    forward_join_53: {
    forward_join_18: {
    forward_join_16: {
    life2_3 = (__fieldRead249_0() ^ 51555780554330L);
    life4_5 = __call249_1();
    spill249_0 = __fieldRead249_3(__fieldRead249_2(receiver));
    if (!((life4_5 == 0))) {
        forwardValue249_16_0 = __integerCategory249_4(spill249_0);
        break forward_join_16;
    }
    if (!((!spill249_0))) {
        break forward_join_131;
    }
    spill249_1 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue249_18_0 = spill249_1;
        break forward_join_18;
    }
    forwardValue249_16_0 = __integerCategory249_6(__fieldRead249_5(spill249_1));
    }
    if (!((forwardValue249_16_0 == 0))) {
        break forward_join_131;
    }
    forwardValue249_18_0 = receiver;
    }
    __call249_9(__fieldRead249_8(__fieldRead249_7(forwardValue249_18_0)), "changeDimension");
    life5_32 = __call249_10();
    life6_35 = __fieldRead249_11(receiver);
    life7_39 = __call249_12(life5_32, life6_35);
    life8_43 = __call249_13(life5_32, p0);
    __fieldWrite249_14(receiver, p0);
    if (!((life4_5 == 0))) {
        break forward_join_77;
    }
    if (!((life6_35 == 1))) {
        break forward_join_53;
    }
    if (!((p0 == 1))) {
        break forward_join_53;
    }
    life8_43 = __call249_15(life5_32, 0);
    __fieldWrite249_16(receiver, 0);
    }
    __call249_18(__fieldRead249_17(receiver), receiver);
    __fieldWrite249_19(receiver, 0);
    __call249_22(__fieldRead249_21(__fieldRead249_20(receiver)), "reposition");
    __call249_24(__call249_23(life5_32), receiver, life6_35, life7_39, life8_43);
    __call249_27(__fieldRead249_26(__fieldRead249_25(receiver)), "reloading");
    }
    life9_96 = __call249_29(__call249_28(receiver), life8_43);
    spill249_2 = life9_96;
    if (!((life4_5 == 0))) {
        forwardValue249_128_0 = spill249_2;
        break forward_join_128;
    }
    if (!((spill249_2 != null))) {
        break forward_join_116;
    }
    __call249_30(life9_96, receiver);
    spill249_3 = life6_35;
    if (!((life4_5 == 0))) {
        forwardValue249_115_0 = spill249_3;
        break forward_join_115;
    }
    if (!((spill249_3 == 1))) {
        break forward_join_112;
    }
    spill249_4 = p0;
    if (!((life4_5 == 0))) {
        forwardValue249_115_0 = spill249_4;
        break forward_join_115;
    }
    if (!((spill249_4 == 1))) {
        break forward_join_112;
    }
    life10_134 = __call249_33(__fieldRead249_31(receiver), __call249_32(life8_43));
    __call249_36(life9_96, life10_134, __fieldRead249_34(life9_96), __fieldRead249_35(life9_96));
    }
    forwardValue249_115_0 = __integerCategory249_38(__call249_37(life8_43, life9_96));
    }
    __discardScalar249_39(forwardValue249_115_0);
    }
    __fieldWrite249_40(receiver, 1);
    __call249_43(__fieldRead249_42(__fieldRead249_41(receiver)));
    __call249_44(life7_39);
    __call249_45(life8_43);
    forwardValue249_128_0 = receiver;
    }
    __call249_48(__fieldRead249_47(__fieldRead249_46(forwardValue249_128_0)));
    }
    return;
}
public static void h249_0(moom.Oo p0) throws Throwable {
    throw __call1024900_0(p0);
}
public static void h249_1(moom.Oo p0) throws Throwable {
    throw __call1024901_0(p0);
}
public static void h249_2(moom.Oo p0) throws Throwable {
    throw __call1024902_0(p0);
}
public static void h249_3(moom.Oo p0) throws Throwable {
    throw __call1024903_0(p0);
}
public static void h249_4(moom.Oo p0) throws Throwable {
    throw __call1024904_0(p0);
}
public static void h249_5(moom.Oo p0) throws Throwable {
    throw __call1024905_0(p0);
}
public static void h249_6(moom.Oo p0) throws Throwable {
    throw __call1024906_0(p0);
}
public static void h249_7(moom.Oo p0) throws Throwable {
    throw __call1024907_0(p0);
}
public static void h249_8(moom.Oo p0) throws Throwable {
    throw __call1024908_0(p0);
}
public static void h249_9(moom.Oo p0) throws Throwable {
    throw __call1024909_0(p0);
}
private static native long __fieldRead249_0() throws Throwable;
private static native int __call249_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead249_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead249_3(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory249_4(boolean value) throws Throwable;
private static native boolean __fieldRead249_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory249_6(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead249_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead249_8(net.minecraft.world.World a0) throws Throwable;
private static native void __call249_9(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __call249_10() throws Throwable;
private static native int __fieldRead249_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call249_12(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.world.WorldServer __call249_13(moom.Bl a0, int a1) throws Throwable;
private static native void __fieldWrite249_14(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.WorldServer __call249_15(moom.Bl a0, int a1) throws Throwable;
private static native void __fieldWrite249_16(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead249_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call249_18(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __fieldWrite249_19(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead249_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead249_21(net.minecraft.world.World a0) throws Throwable;
private static native void __call249_22(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call249_23(moom.Bl a0) throws Throwable;
private static native void __call249_24(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.Entity a1, int a2, net.minecraft.world.WorldServer a3, net.minecraft.world.WorldServer a4) throws Throwable;
private static native net.minecraft.world.World __fieldRead249_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead249_26(net.minecraft.world.World a0) throws Throwable;
private static native void __call249_27(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call249_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __call249_29(java.lang.String a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native void __call249_30(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead249_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DT __call249_32(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.DT __call249_33(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native float __fieldRead249_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead249_35(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call249_36(net.minecraft.entity.Entity a0, moom.DT a1, float a2, float a3) throws Throwable;
private static native boolean __call249_37(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory249_38(boolean value) throws Throwable;
private static native void __discardScalar249_39(int a0) throws Throwable;
private static native void __fieldWrite249_40(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead249_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead249_42(net.minecraft.world.World a0) throws Throwable;
private static native void __call249_43(moom.A9 a0) throws Throwable;
private static native void __call249_44(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call249_45(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead249_46(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead249_47(net.minecraft.world.World a0) throws Throwable;
private static native void __call249_48(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call1024900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1024909_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_01633ae9f9e334c1fa21(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_01633ae9f9e334c1fa21 {

public static boolean f1521(net.minecraft.entity.Entity receiver) throws Throwable {
    int forwardValue1521_15_0;
    int forwardValue1521_17_0;
    int spill1521_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead1521_0() ^ 96278310860434L);
    life3_5 = __call1521_1();
    spill1521_0 = __call1521_4(__call1521_3(__fieldRead1521_2(receiver), 2));
    if (!((life3_5 == 0))) {
        forwardValue1521_15_0 = spill1521_0;
        break forward_join_15;
    }
    if (!((spill1521_0 > 0))) {
        break forward_join_16;
    }
    forwardValue1521_15_0 = 1;
    }
    forwardValue1521_17_0 = forwardValue1521_15_0;
    break forward_join_17;
    }
    forwardValue1521_17_0 = 0;
    }
    return __integerCategory1521_5(forwardValue1521_17_0);
}
public static void h1521_0(moom.Oo p0) throws Throwable {
    throw __call1152100_0(p0);
}
private static native long __fieldRead1521_0() throws Throwable;
private static native int __call1521_1() throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1521_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call1521_3(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native int __call1521_4(java.lang.String a0) throws Throwable;
private static native boolean __integerCategory1521_5(int value) throws Throwable;
private static native java.lang.Throwable __call1152100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_682273ebf2b76cd259c8(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_682273ebf2b76cd259c8 {

public static void f1103(net.minecraft.entity.Entity receiver) throws Throwable {
    net.minecraft.entity.Entity forestValue1103_46_0;
    net.minecraft.entity.Entity forestValue1103_54_0;
    net.minecraft.entity.Entity forestValue1103_88_0;
    net.minecraft.entity.Entity forestValue1103_108_0;
    net.minecraft.entity.Entity spill1103_0;
    net.minecraft.entity.Entity spill1103_1;
    net.minecraft.entity.Entity spill1103_2;
    net.minecraft.entity.Entity spill1103_3;
    net.minecraft.entity.Entity spill1103_4;
    net.minecraft.entity.Entity spill1103_5;
    net.minecraft.entity.Entity spill1103_6;
    net.minecraft.entity.Entity spill1103_7;
    double spill1103_8;
    double spill1103_9;
    long life1_3;
    int life3_5;
    forest_join_110: {
    forest_join_108: {
    forest_join_98: {
    forest_join_54: {
    life1_3 = (__fieldRead1103_0() ^ 76663496907897L);
    life3_5 = __call1103_1();
    spill1103_0 = receiver;
    if (!((life3_5 != 0))) {
        forestValue1103_54_0 = spill1103_0;
        break forest_join_54;
    }
    if (!((__fieldRead1103_2(spill1103_0) != null))) {
        break forest_join_110;
    }
    forest_cycle_11: while (true) {
    forest_join_46: {
    forest_join_45: {
    if (!((__numericCompare1103_4(__fieldRead1103_3(receiver), 0x0.0p0d) > 0))) {
        break forest_join_98;
    }
    spill1103_1 = receiver;
    if (!((life3_5 != 0))) {
        forestValue1103_108_0 = spill1103_1;
        break forest_join_108;
    }
    if (!((life3_5 != 0))) {
        forestValue1103_108_0 = spill1103_1;
        break forest_join_108;
    }
    if (!((__numericCompare1103_6(__fieldRead1103_5(spill1103_1), 0x1.0p8d) < 0))) {
        break forest_join_98;
    }
    __call1103_10(receiver, __fieldRead1103_7(receiver), __fieldRead1103_8(receiver), __fieldRead1103_9(receiver));
    spill1103_2 = receiver;
    if (!((life3_5 != 0))) {
        forestValue1103_46_0 = spill1103_2;
        break forest_join_46;
    }
    if (!(__call1103_14(__call1103_13(__fieldRead1103_11(spill1103_2), receiver, __call1103_12(receiver))))) {
        break forest_join_45;
    }
    if (!((life3_5 == 0))) {
        break forest_join_98;
    }
    }
    forestValue1103_46_0 = receiver;
    }
    net.minecraft.entity.Entity __stackOp1103_15_0 = forestValue1103_46_0;
    __fieldWrite1103_17(__stackOp1103_15_0, (__fieldRead1103_16(__stackOp1103_15_0) + 0x1.0p0d));
    if (!((life3_5 == 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    break forest_join_98;
    }
    forest_cycle_54: while (true) {
    forest_join_96: {
    forest_join_88: {
    forest_join_87: {
    if (!((__numericCompare1103_19(__fieldRead1103_18(forestValue1103_54_0), 0x0.0p0d) > 0))) {
        break forest_join_98;
    }
    spill1103_3 = receiver;
    if (!((life3_5 != 0))) {
        forestValue1103_108_0 = spill1103_3;
        break forest_join_108;
    }
    if (!((life3_5 != 0))) {
        forestValue1103_108_0 = spill1103_3;
        break forest_join_108;
    }
    if (!((__numericCompare1103_21(__fieldRead1103_20(spill1103_3), 0x1.0p8d) < 0))) {
        break forest_join_98;
    }
    __call1103_25(receiver, __fieldRead1103_22(receiver), __fieldRead1103_23(receiver), __fieldRead1103_24(receiver));
    spill1103_4 = receiver;
    if (!((life3_5 != 0))) {
        forestValue1103_88_0 = spill1103_4;
        break forest_join_88;
    }
    if (!(__call1103_29(__call1103_28(__fieldRead1103_26(spill1103_4), receiver, __call1103_27(receiver))))) {
        break forest_join_87;
    }
    if (!((life3_5 == 0))) {
        break forest_join_98;
    }
    }
    forestValue1103_88_0 = receiver;
    }
    net.minecraft.entity.Entity __stackOp1103_30_0 = forestValue1103_88_0;
    __fieldWrite1103_32(__stackOp1103_30_0, (__fieldRead1103_31(__stackOp1103_30_0) + 0x1.0p0d));
    if (!((life3_5 == 0))) {
        break forest_join_96;
    }
    break forest_join_98;
    }
    spill1103_5 = receiver;
    forestValue1103_54_0 = spill1103_5;
    continue forest_cycle_54;
    }
    }
    spill1103_6 = receiver;
    spill1103_7 = receiver;
    net.minecraft.entity.Entity __stackOp1103_33_0 = receiver;
    double __stackOp1103_33_1 = 0x0.0p0d;
    spill1103_8 = __stackOp1103_33_1;
    __fieldWrite1103_34(__stackOp1103_33_0, __stackOp1103_33_1);
    net.minecraft.entity.Entity __stackOp1103_35_0 = spill1103_7;
    double __stackOp1103_35_1 = spill1103_8;
    spill1103_9 = __stackOp1103_35_1;
    __fieldWrite1103_36(__stackOp1103_35_0, __stackOp1103_35_1);
    __fieldWrite1103_37(spill1103_6, spill1103_9);
    forestValue1103_108_0 = receiver;
    }
    __fieldWrite1103_38(forestValue1103_108_0, 0x0.0p0f);
    }
    return;
}
public static void h1103_0(moom.Oo p0) throws Throwable {
    throw __call3110300_0(p0);
}
public static void h1103_1(moom.Oo p0) throws Throwable {
    throw __call3110301_0(p0);
}
public static void h1103_2(moom.Oo p0) throws Throwable {
    throw __call3110302_0(p0);
}
public static void h1103_3(moom.Oo p0) throws Throwable {
    throw __call3110303_0(p0);
}
public static void h1103_4(moom.Oo p0) throws Throwable {
    throw __call3110304_0(p0);
}
public static void h1103_5(moom.Oo p0) throws Throwable {
    throw __call3110305_0(p0);
}
public static void h1103_6(moom.Oo p0) throws Throwable {
    throw __call3110306_0(p0);
}
public static void h1103_7(moom.Oo p0) throws Throwable {
    throw __call3110307_0(p0);
}
public static void h1103_8(moom.Oo p0) throws Throwable {
    throw __call3110308_0(p0);
}
private static native long __fieldRead1103_0() throws Throwable;
private static native int __call1103_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1103_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1103_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1103_4(double a0, double a1) throws Throwable;
private static native double __fieldRead1103_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1103_6(double a0, double a1) throws Throwable;
private static native double __fieldRead1103_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1103_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1103_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1103_10(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.world.World __fieldRead1103_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1103_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __call1103_13(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call1103_14(java.util.List a0) throws Throwable;
private static native double __fieldRead1103_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1103_17(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead1103_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1103_19(double a0, double a1) throws Throwable;
private static native double __fieldRead1103_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1103_21(double a0, double a1) throws Throwable;
private static native double __fieldRead1103_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1103_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1103_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1103_25(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.world.World __fieldRead1103_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1103_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __call1103_28(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native boolean __call1103_29(java.util.List a0) throws Throwable;
private static native double __fieldRead1103_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1103_32(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1103_34(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1103_36(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1103_37(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite1103_38(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native java.lang.Throwable __call3110300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3110308_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0607e3fe7a8148bbc09c(net.minecraft.entity.Entity a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_0607e3fe7a8148bbc09c {

public static boolean f1523(net.minecraft.entity.Entity receiver, java.lang.Object p0) throws Throwable {
    int forwardValue1523_14_0;
    int forwardValue1523_20_0;
    int forwardValue1523_22_0;
    int spill1523_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (__fieldRead1523_0() ^ 66868731469891L);
    life4_5 = __call1523_1();
    spill1523_0 = __instanceOf1523_2(p0);
    if (!((life4_5 != 0))) {
        forwardValue1523_14_0 = spill1523_0;
        break forward_join_14;
    }
    if (!((spill1523_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1523_14_0 = __fieldRead1523_4(__cast1523_3(p0));
    }
    if (!((life4_5 != 0))) {
        forwardValue1523_20_0 = forwardValue1523_14_0;
        break forward_join_20;
    }
    if (!((forwardValue1523_14_0 == __fieldRead1523_5(receiver)))) {
        break forward_join_21;
    }
    forwardValue1523_20_0 = 1;
    }
    forwardValue1523_22_0 = forwardValue1523_20_0;
    break forward_join_22;
    }
    forwardValue1523_22_0 = 0;
    }
    return __integerCategory1523_6(forwardValue1523_22_0);
}
public static void h1523_0(moom.Oo p0) throws Throwable {
    throw __call1152300_0(p0);
}
public static void h1523_1(moom.Oo p0) throws Throwable {
    throw __call1152301_0(p0);
}
public static void h1523_2(moom.Oo p0) throws Throwable {
    throw __call1152302_0(p0);
}
public static void h1523_3(moom.Oo p0) throws Throwable {
    throw __call1152303_0(p0);
}
private static native long __fieldRead1523_0() throws Throwable;
private static native int __call1523_1() throws Throwable;
private static native int __instanceOf1523_2(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1523_3(java.lang.Object a0) throws Throwable;
private static native int __fieldRead1523_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead1523_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __integerCategory1523_6(int value) throws Throwable;
private static native java.lang.Throwable __call1152300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1b16307e514e9e0cf09f(net.minecraft.entity.Entity a0, boolean a1) throws E;
private static final class __SourceHandler_1b16307e514e9e0cf09f {

public static void f1524(net.minecraft.entity.Entity receiver, boolean p0) throws Throwable {
    net.minecraft.entity.DataWatcher forwardValue1524_14_0;
    int forwardValue1524_14_1;
    int forwardValue1524_14_2;
    net.minecraft.entity.DataWatcher forwardValue1524_15_0;
    int forwardValue1524_15_1;
    net.minecraft.entity.DataWatcher forwardValue1524_16_0;
    int forwardValue1524_16_1;
    int forwardValue1524_16_2;
    net.minecraft.entity.DataWatcher spill1524_0;
    int spill1524_1;
    boolean spill1524_2;
    long life2_3;
    int life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead1524_0() ^ 40970176626089L);
    life4_5 = __call1524_1();
    spill1524_0 = __fieldRead1524_2(receiver);
    spill1524_1 = 3;
    spill1524_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1524_14_0 = spill1524_0;
        forwardValue1524_14_1 = spill1524_1;
        forwardValue1524_14_2 = __integerCategory1524_3(spill1524_2);
        break forward_join_14;
    }
    if (!(spill1524_2)) {
        forwardValue1524_15_0 = spill1524_0;
        forwardValue1524_15_1 = spill1524_1;
        break forward_join_15;
    }
    forwardValue1524_14_0 = spill1524_0;
    forwardValue1524_14_1 = spill1524_1;
    forwardValue1524_14_2 = 1;
    }
    forwardValue1524_16_0 = forwardValue1524_14_0;
    forwardValue1524_16_1 = forwardValue1524_14_1;
    forwardValue1524_16_2 = forwardValue1524_14_2;
    break forward_join_16;
    }
    forwardValue1524_16_0 = forwardValue1524_15_0;
    forwardValue1524_16_1 = forwardValue1524_15_1;
    forwardValue1524_16_2 = 0;
    }
    __call1524_5(forwardValue1524_16_0, forwardValue1524_16_1, __call1524_4(((byte) forwardValue1524_16_2)));
    return;
}
public static void h1524_0(moom.Oo p0) throws Throwable {
    throw __call1152400_0(p0);
}
private static native long __fieldRead1524_0() throws Throwable;
private static native int __call1524_1() throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1524_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1524_3(boolean value) throws Throwable;
private static native java.lang.Byte __call1524_4(byte a0) throws Throwable;
private static native void __call1524_5(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Byte a2) throws Throwable;
private static native java.lang.Throwable __call1152400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_bf03ebcf56328e96a1af(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_bf03ebcf56328e96a1af {

public static boolean f1525(net.minecraft.entity.Entity receiver) throws Throwable {
    int forwardValue1525_15_0;
    int forwardValue1525_17_0;
    byte spill1525_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead1525_0() ^ 96627485792175L);
    life3_5 = __call1525_1();
    spill1525_0 = __call1525_3(__fieldRead1525_2(receiver), 4);
    if (!((life3_5 != 0))) {
        forwardValue1525_15_0 = __integerCategory1525_4(spill1525_0);
        break forward_join_15;
    }
    if (!((spill1525_0 == 1))) {
        break forward_join_16;
    }
    forwardValue1525_15_0 = 1;
    }
    forwardValue1525_17_0 = forwardValue1525_15_0;
    break forward_join_17;
    }
    forwardValue1525_17_0 = 0;
    }
    return __integerCategory1525_5(forwardValue1525_17_0);
}
public static void h1525_0(moom.Oo p0) throws Throwable {
    throw __call1152500_0(p0);
}
public static void h1525_1(moom.Oo p0) throws Throwable {
    throw __call1152501_0(p0);
}
private static native long __fieldRead1525_0() throws Throwable;
private static native int __call1525_1() throws Throwable;
private static native net.minecraft.entity.DataWatcher __fieldRead1525_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call1525_3(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native int __integerCategory1525_4(byte value) throws Throwable;
private static native boolean __integerCategory1525_5(int value) throws Throwable;
private static native java.lang.Throwable __call1152500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_13a46ba700e2466470bb(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_13a46ba700e2466470bb {

public static void f649(net.minecraft.entity.Entity receiver) throws Throwable {
    net.minecraft.entity.Entity forestValue649_50_0;
    int forestValue649_52_0;
    int forestValue649_120_0;
    net.minecraft.entity.Entity forestValue649_125_0;
    net.minecraft.entity.Entity forestValue649_126_0;
    int forestValue649_126_1;
    int forestValue649_131_0;
    int forestValue649_142_0;
    int forestValue649_152_0;
    net.minecraft.entity.Entity forestValue649_160_0;
    int forestValue649_171_0;
    int forestValue649_181_0;
    int forestValue649_215_0;
    net.minecraft.entity.Entity forestValue649_222_0;
    int forestValue649_229_0;
    int forestValue649_244_0;
    int forestValue649_254_0;
    net.minecraft.entity.Entity forestValue649_263_0;
    int forestValue649_263_1;
    int forestValue649_263_2;
    net.minecraft.entity.Entity forestValue649_264_0;
    int forestValue649_264_1;
    net.minecraft.entity.Entity forestValue649_265_0;
    int forestValue649_265_1;
    int forestValue649_265_2;
    net.minecraft.world.World forestValue649_271_0;
    int spill649_0;
    net.minecraft.entity.Entity spill649_1;
    boolean spill649_2;
    int spill649_3;
    boolean spill649_4;
    boolean spill649_5;
    net.minecraft.entity.Entity spill649_6;
    net.minecraft.entity.Entity spill649_7;
    int spill649_8;
    int spill649_9;
    int spill649_10;
    net.minecraft.entity.Entity spill649_11;
    boolean spill649_12;
    int spill649_13;
    net.minecraft.entity.Entity spill649_14;
    net.minecraft.world.World spill649_15;
    net.minecraft.entity.Entity spill649_16;
    int spill649_17;
    int spill649_18;
    long life1_3;
    int life3_10;
    moom.Bl life4_77;
    int life5_80;
    int life6_132;
    forest_join_271: {
    forest_join_266: {
    forest_join_265: {
    forest_join_264: {
    forest_join_263: {
    forest_join_254: {
    forest_join_249: {
    forest_join_244: {
    forest_join_240: {
    forest_join_229: {
    forest_join_227: {
    forest_join_222: {
    forest_join_221: {
    forest_join_215: {
    forest_join_205: {
    forest_join_181: {
    forest_join_179: {
    forest_join_171: {
    forest_join_163: {
    forest_join_160: {
    forest_join_159: {
    forest_join_152: {
    forest_join_148: {
    forest_join_142: {
    forest_join_140: {
    forest_join_131: {
    forest_join_129: {
    forest_join_126: {
    forest_join_125: {
    forest_join_124: {
    forest_join_121: {
    forest_join_120: {
    forest_join_119: {
    forest_join_52: {
    forest_join_50: {
    forest_join_25: {
    life1_3 = (__fieldRead649_0() ^ 14026796287385L);
    spill649_0 = __call649_1();
    __call649_4(__fieldRead649_3(__fieldRead649_2(receiver)), "entityBaseTick");
    life3_10 = spill649_0;
    spill649_1 = __fieldRead649_5(receiver);
    if (!((life3_10 == 0))) {
        forestValue649_50_0 = spill649_1;
        break forest_join_50;
    }
    if (!((spill649_1 != null))) {
        break forest_join_25;
    }
    spill649_2 = __fieldRead649_7(__fieldRead649_6(receiver));
    if (!((life3_10 == 0))) {
        forestValue649_52_0 = __integerCategory649_8(spill649_2);
        break forest_join_52;
    }
    if (!(spill649_2)) {
        break forest_join_25;
    }
    __fieldWrite649_9(receiver, null);
    }
    __fieldWrite649_11(receiver, __fieldRead649_10(receiver));
    __fieldWrite649_13(receiver, __fieldRead649_12(receiver));
    __fieldWrite649_15(receiver, __fieldRead649_14(receiver));
    __fieldWrite649_17(receiver, __fieldRead649_16(receiver));
    __fieldWrite649_19(receiver, __fieldRead649_18(receiver));
    __fieldWrite649_21(receiver, __fieldRead649_20(receiver));
    forestValue649_50_0 = receiver;
    }
    forestValue649_52_0 = __integerCategory649_24(__fieldRead649_23(__fieldRead649_22(forestValue649_50_0)));
    }
    if (!((life3_10 == 0))) {
        forestValue649_171_0 = forestValue649_52_0;
        break forest_join_171;
    }
    if (!((forestValue649_52_0 == 0))) {
        break forest_join_163;
    }
    spill649_3 = __instanceOf649_26(__fieldRead649_25(receiver));
    if (!((life3_10 == 0))) {
        forestValue649_171_0 = spill649_3;
        break forest_join_171;
    }
    if (!((spill649_3 != 0))) {
        break forest_join_163;
    }
    __call649_29(__fieldRead649_28(__fieldRead649_27(receiver)), "portal");
    life4_77 = __call649_32(__cast649_31(__fieldRead649_30(receiver)));
    life5_80 = __call649_33(receiver);
    spill649_4 = __fieldRead649_34(receiver);
    if (!((life3_10 == 0))) {
        forestValue649_131_0 = __integerCategory649_35(spill649_4);
        break forest_join_131;
    }
    if (!(spill649_4)) {
        break forest_join_129;
    }
    spill649_5 = __call649_36(life4_77);
    if (!((life3_10 == 0))) {
        forestValue649_152_0 = __integerCategory649_37(spill649_5);
        break forest_join_152;
    }
    if (!(spill649_5)) {
        break forest_join_148;
    }
    spill649_6 = __fieldRead649_38(receiver);
    if (!((life3_10 == 0))) {
        forestValue649_125_0 = spill649_6;
        break forest_join_125;
    }
    if (!((spill649_6 == null))) {
        break forest_join_124;
    }
    net.minecraft.entity.Entity __stackOp649_39_0 = receiver;
    spill649_7 = __stackOp649_39_0;
    spill649_8 = __fieldRead649_40(__stackOp649_39_0);
    if (!((life3_10 == 0))) {
        forestValue649_126_0 = spill649_7;
        forestValue649_126_1 = spill649_8;
        break forest_join_126;
    }
    net.minecraft.entity.Entity __stackOp649_41_0 = spill649_7;
    int __stackOp649_41_1 = spill649_8;
    spill649_9 = __stackOp649_41_1;
    __fieldWrite649_42(__stackOp649_41_0, (__stackOp649_41_1 + 1));
    if (!((spill649_9 >= life5_80))) {
        break forest_join_124;
    }
    __fieldWrite649_43(receiver, life5_80);
    __fieldWrite649_45(receiver, __call649_44(receiver));
    spill649_10 = __call649_48(__fieldRead649_47(__fieldRead649_46(receiver)));
    if (!((life3_10 == 0))) {
        forestValue649_120_0 = spill649_10;
        break forest_join_120;
    }
    if (!((spill649_10 == -1))) {
        break forest_join_119;
    }
    life6_132 = 0;
    if (!((life3_10 != 0))) {
        break forest_join_121;
    }
    }
    forestValue649_120_0 = -1;
    }
    life6_132 = forestValue649_120_0;
    }
    __call649_49(receiver, life6_132);
    }
    forestValue649_125_0 = receiver;
    }
    forestValue649_126_0 = forestValue649_125_0;
    forestValue649_126_1 = 0;
    }
    __fieldWrite649_50(forestValue649_126_0, forestValue649_126_1);
    if (!((life3_10 != 0))) {
        break forest_join_148;
    }
    }
    forestValue649_131_0 = __fieldRead649_51(receiver);
    }
    if (!((life3_10 == 0))) {
        forestValue649_142_0 = forestValue649_131_0;
        break forest_join_142;
    }
    if (!((forestValue649_131_0 > 0))) {
        break forest_join_140;
    }
    net.minecraft.entity.Entity __stackOp649_52_0 = receiver;
    __fieldWrite649_54(__stackOp649_52_0, (__fieldRead649_53(__stackOp649_52_0) - 4));
    }
    forestValue649_142_0 = __fieldRead649_55(receiver);
    }
    if (!((life3_10 == 0))) {
        forestValue649_152_0 = forestValue649_142_0;
        break forest_join_152;
    }
    if (!((forestValue649_142_0 < 0))) {
        break forest_join_148;
    }
    __fieldWrite649_56(receiver, 0);
    }
    spill649_11 = receiver;
    if (!((life3_10 == 0))) {
        forestValue649_160_0 = spill649_11;
        break forest_join_160;
    }
    forestValue649_152_0 = __fieldRead649_57(spill649_11);
    }
    if (!((forestValue649_152_0 > 0))) {
        break forest_join_159;
    }
    net.minecraft.entity.Entity __stackOp649_58_0 = receiver;
    __fieldWrite649_60(__stackOp649_58_0, (__fieldRead649_59(__stackOp649_58_0) - 1));
    }
    forestValue649_160_0 = receiver;
    }
    __call649_63(__fieldRead649_62(__fieldRead649_61(forestValue649_160_0)));
    }
    __call649_64(receiver);
    __call649_65(receiver);
    forestValue649_171_0 = __integerCategory649_68(__fieldRead649_67(__fieldRead649_66(receiver)));
    }
    if (!((life3_10 == 0))) {
        forestValue649_181_0 = forestValue649_171_0;
        break forest_join_181;
    }
    if (!((forestValue649_171_0 != 0))) {
        break forest_join_179;
    }
    __fieldWrite649_69(receiver, 0);
    if (!((life3_10 != 0))) {
        break forest_join_227;
    }
    }
    forestValue649_181_0 = __fieldRead649_70(receiver);
    }
    if (!((life3_10 == 0))) {
        forestValue649_229_0 = forestValue649_181_0;
        break forest_join_229;
    }
    if (!((forestValue649_181_0 > 0))) {
        break forest_join_227;
    }
    spill649_12 = __fieldRead649_71(receiver);
    if (!((life3_10 == 0))) {
        forestValue649_215_0 = __integerCategory649_72(spill649_12);
        break forest_join_215;
    }
    if (!(spill649_12)) {
        break forest_join_205;
    }
    net.minecraft.entity.Entity __stackOp649_73_0 = receiver;
    __fieldWrite649_75(__stackOp649_73_0, (__fieldRead649_74(__stackOp649_73_0) - 4));
    spill649_13 = __fieldRead649_76(receiver);
    if (!((life3_10 == 0))) {
        forestValue649_229_0 = spill649_13;
        break forest_join_229;
    }
    if (!((spill649_13 < 0))) {
        break forest_join_227;
    }
    __fieldWrite649_77(receiver, 0);
    if (!((life3_10 != 0))) {
        break forest_join_227;
    }
    }
    spill649_14 = receiver;
    if (!((life3_10 == 0))) {
        forestValue649_222_0 = spill649_14;
        break forest_join_222;
    }
    forestValue649_215_0 = (__fieldRead649_78(spill649_14) % __invokedynamic649_79(30801, (2284780503356771462L ^ life1_3)));
    }
    if (!((forestValue649_215_0 == 0))) {
        break forest_join_221;
    }
    __call649_81(receiver, __fieldRead649_80(), 0x1.0p0f);
    }
    forestValue649_222_0 = receiver;
    }
    net.minecraft.entity.Entity __stackOp649_82_0 = forestValue649_222_0;
    __fieldWrite649_84(__stackOp649_82_0, (__fieldRead649_83(__stackOp649_82_0) - 1));
    }
    forestValue649_229_0 = __integerCategory649_86(__call649_85(receiver));
    }
    if (!((life3_10 == 0))) {
        forestValue649_244_0 = forestValue649_229_0;
        break forest_join_244;
    }
    if (!((forestValue649_229_0 != 0))) {
        break forest_join_240;
    }
    __call649_87(receiver);
    net.minecraft.entity.Entity __stackOp649_88_0 = receiver;
    __fieldWrite649_90(__stackOp649_88_0, (__fieldRead649_89(__stackOp649_88_0) * 0x1.0p-1f));
    }
    forestValue649_244_0 = __numericCompare649_92(__fieldRead649_91(receiver), -0x1.0p6d);
    }
    if (!((life3_10 == 0))) {
        forestValue649_254_0 = forestValue649_244_0;
        break forest_join_254;
    }
    if (!((forestValue649_244_0 < 0))) {
        break forest_join_249;
    }
    __call649_93(receiver);
    }
    spill649_15 = __fieldRead649_94(receiver);
    if (!((life3_10 == 0))) {
        forestValue649_271_0 = spill649_15;
        break forest_join_271;
    }
    forestValue649_254_0 = __integerCategory649_96(__fieldRead649_95(spill649_15));
    }
    if (!((forestValue649_254_0 == 0))) {
        break forest_join_266;
    }
    spill649_16 = receiver;
    spill649_17 = 0;
    spill649_18 = __fieldRead649_97(receiver);
    if (!((life3_10 == 0))) {
        forestValue649_263_0 = spill649_16;
        forestValue649_263_1 = spill649_17;
        forestValue649_263_2 = spill649_18;
        break forest_join_263;
    }
    if (!((spill649_18 > 0))) {
        forestValue649_264_0 = spill649_16;
        forestValue649_264_1 = spill649_17;
        break forest_join_264;
    }
    forestValue649_263_0 = spill649_16;
    forestValue649_263_1 = spill649_17;
    forestValue649_263_2 = 1;
    }
    forestValue649_265_0 = forestValue649_263_0;
    forestValue649_265_1 = forestValue649_263_1;
    forestValue649_265_2 = forestValue649_263_2;
    break forest_join_265;
    }
    forestValue649_265_0 = forestValue649_264_0;
    forestValue649_265_1 = forestValue649_264_1;
    forestValue649_265_2 = 0;
    }
    __call649_98(forestValue649_265_0, forestValue649_265_1, forestValue649_265_2);
    }
    __fieldWrite649_99(receiver, 0);
    forestValue649_271_0 = __fieldRead649_100(receiver);
    }
    __call649_102(__fieldRead649_101(forestValue649_271_0));
    return;
}
public static void h649_0(moom.Oo p0) throws Throwable {
    throw __call3064900_0(p0);
}
public static void h649_1(moom.Oo p0) throws Throwable {
    throw __call3064901_0(p0);
}
public static void h649_2(moom.Oo p0) throws Throwable {
    throw __call3064902_0(p0);
}
public static void h649_3(moom.Oo p0) throws Throwable {
    throw __call3064903_0(p0);
}
public static void h649_4(moom.Oo p0) throws Throwable {
    throw __call3064904_0(p0);
}
public static void h649_5(moom.Oo p0) throws Throwable {
    throw __call3064905_0(p0);
}
public static void h649_6(moom.Oo p0) throws Throwable {
    throw __call3064906_0(p0);
}
public static void h649_7(moom.Oo p0) throws Throwable {
    throw __call3064907_0(p0);
}
public static void h649_8(moom.Oo p0) throws Throwable {
    throw __call3064908_0(p0);
}
public static void h649_9(moom.Oo p0) throws Throwable {
    throw __call3064909_0(p0);
}
public static void h649_10(moom.Oo p0) throws Throwable {
    throw __call3064910_0(p0);
}
public static void h649_11(moom.Oo p0) throws Throwable {
    throw __call3064911_0(p0);
}
public static void h649_12(moom.Oo p0) throws Throwable {
    throw __call3064912_0(p0);
}
public static void h649_13(moom.Oo p0) throws Throwable {
    throw __call3064913_0(p0);
}
public static void h649_14(moom.Oo p0) throws Throwable {
    throw __call3064914_0(p0);
}
public static void h649_15(moom.Oo p0) throws Throwable {
    throw __call3064915_0(p0);
}
public static void h649_16(moom.Oo p0) throws Throwable {
    throw __call3064916_0(p0);
}
public static void h649_17(moom.Oo p0) throws Throwable {
    throw __call3064917_0(p0);
}
public static void h649_18(moom.Oo p0) throws Throwable {
    throw __call3064918_0(p0);
}
public static void h649_19(moom.Oo p0) throws Throwable {
    throw __call3064919_0(p0);
}
public static void h649_20(moom.Oo p0) throws Throwable {
    throw __call3064920_0(p0);
}
public static void h649_21(moom.Oo p0) throws Throwable {
    throw __call3064921_0(p0);
}
public static void h649_22(moom.Oo p0) throws Throwable {
    throw __call3064922_0(p0);
}
public static void h649_23(moom.Oo p0) throws Throwable {
    throw __call3064923_0(p0);
}
public static void h649_24(moom.Oo p0) throws Throwable {
    throw __call3064924_0(p0);
}
public static void h649_25(moom.Oo p0) throws Throwable {
    throw __call3064925_0(p0);
}
public static void h649_26(moom.Oo p0) throws Throwable {
    throw __call3064926_0(p0);
}
public static void h649_27(moom.Oo p0) throws Throwable {
    throw __call3064927_0(p0);
}
public static void h649_28(moom.Oo p0) throws Throwable {
    throw __call3064928_0(p0);
}
public static void h649_29(moom.Oo p0) throws Throwable {
    throw __call3064929_0(p0);
}
public static void h649_30(moom.Oo p0) throws Throwable {
    throw __call3064930_0(p0);
}
public static void h649_31(moom.Oo p0) throws Throwable {
    throw __call3064931_0(p0);
}
public static void h649_32(moom.Oo p0) throws Throwable {
    throw __call3064932_0(p0);
}
public static void h649_33(moom.Oo p0) throws Throwable {
    throw __call3064933_0(p0);
}
public static void h649_34(moom.Oo p0) throws Throwable {
    throw __call3064934_0(p0);
}
public static void h649_35(moom.Oo p0) throws Throwable {
    throw __call3064935_0(p0);
}
public static void h649_36(moom.Oo p0) throws Throwable {
    throw __call3064936_0(p0);
}
public static void h649_37(moom.Oo p0) throws Throwable {
    throw __call3064937_0(p0);
}
public static void h649_38(moom.Oo p0) throws Throwable {
    throw __call3064938_0(p0);
}
public static void h649_39(moom.Oo p0) throws Throwable {
    throw __call3064939_0(p0);
}
public static void h649_40(moom.Oo p0) throws Throwable {
    throw __call3064940_0(p0);
}
public static void h649_41(moom.Oo p0) throws Throwable {
    throw __call3064941_0(p0);
}
public static void h649_42(moom.Oo p0) throws Throwable {
    throw __call3064942_0(p0);
}
private static native long __fieldRead649_0() throws Throwable;
private static native int __call649_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead649_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead649_3(net.minecraft.world.World a0) throws Throwable;
private static native void __call649_4(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead649_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead649_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead649_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory649_8(boolean value) throws Throwable;
private static native void __fieldWrite649_9(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native float __fieldRead649_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_11(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native double __fieldRead649_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_13(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead649_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_15(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead649_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_17(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native float __fieldRead649_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_19(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead649_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_21(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead649_23(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory649_24(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf649_26(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead649_28(net.minecraft.world.World a0) throws Throwable;
private static native void __call649_29(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast649_31(net.minecraft.world.World a0) throws Throwable;
private static native moom.Bl __call649_32(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call649_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead649_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory649_35(boolean value) throws Throwable;
private static native boolean __call649_36(moom.Bl a0) throws Throwable;
private static native int __integerCategory649_37(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead649_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead649_40(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_42(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite649_43(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call649_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_45(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_46(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.EA __fieldRead649_47(net.minecraft.world.World a0) throws Throwable;
private static native int __call649_48(moom.EA a0) throws Throwable;
private static native void __call649_49(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite649_50(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead649_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead649_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_54(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead649_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_56(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead649_57(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead649_59(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_60(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_61(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead649_62(net.minecraft.world.World a0) throws Throwable;
private static native void __call649_63(moom.A9 a0) throws Throwable;
private static native void __call649_64(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call649_65(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_66(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead649_67(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory649_68(boolean value) throws Throwable;
private static native void __fieldWrite649_69(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead649_70(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead649_71(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory649_72(boolean value) throws Throwable;
private static native int __fieldRead649_74(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_75(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead649_76(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_77(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead649_78(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic649_79(int a0, long a1) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead649_80() throws Throwable;
private static native boolean __call649_81(net.minecraft.entity.Entity a0, net.minecraft.util.DamageSource a1, float a2) throws Throwable;
private static native int __fieldRead649_83(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_84(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __call649_85(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory649_86(boolean value) throws Throwable;
private static native void __call649_87(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead649_89(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite649_90(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native double __fieldRead649_91(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare649_92(double a0, double a1) throws Throwable;
private static native void __call649_93(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_94(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead649_95(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory649_96(boolean value) throws Throwable;
private static native int __fieldRead649_97(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call649_98(net.minecraft.entity.Entity a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite649_99(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead649_100(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead649_101(net.minecraft.world.World a0) throws Throwable;
private static native void __call649_102(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3064900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064917_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064918_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064919_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064920_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064921_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064922_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064923_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064924_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064925_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064926_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064927_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064928_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064929_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064930_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064931_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064932_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064933_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064934_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064935_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064936_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064937_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064938_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064939_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064940_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064941_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3064942_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d08eddbe49d4349cd4f4(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_d08eddbe49d4349cd4f4 {

public static boolean f1527(net.minecraft.entity.Entity receiver) throws Throwable {
    int forwardValue1527_46_0;
    int forwardValue1527_48_0;
    boolean spill1527_0;
    boolean spill1527_1;
    boolean spill1527_2;
    long life1_3;
    int life3_5;
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    life1_3 = (__fieldRead1527_0() ^ 54143165605644L);
    life3_5 = __call1527_1();
    spill1527_0 = __fieldRead1527_2(receiver);
    if (!((life3_5 != 0))) {
        forwardValue1527_46_0 = __integerCategory1527_3(spill1527_0);
        break forward_join_46;
    }
    if (!((!spill1527_0))) {
        break forward_join_45;
    }
    spill1527_1 = __call1527_8(__fieldRead1527_4(receiver), new moom.DT(__fieldRead1527_5(receiver), __fieldRead1527_6(receiver), __fieldRead1527_7(receiver)));
    if (!((life3_5 != 0))) {
        forwardValue1527_46_0 = __integerCategory1527_9(spill1527_1);
        break forward_join_46;
    }
    if (!((!spill1527_1))) {
        break forward_join_45;
    }
    spill1527_2 = __call1527_15(__fieldRead1527_10(receiver), new moom.DT(__fieldRead1527_11(receiver), (__fieldRead1527_12(receiver) + ((double) __fieldRead1527_13(receiver))), __fieldRead1527_14(receiver)));
    if (!((life3_5 != 0))) {
        forwardValue1527_46_0 = __integerCategory1527_16(spill1527_2);
        break forward_join_46;
    }
    if (!(spill1527_2)) {
        break forward_join_47;
    }
    }
    forwardValue1527_46_0 = 1;
    }
    forwardValue1527_48_0 = forwardValue1527_46_0;
    break forward_join_48;
    }
    forwardValue1527_48_0 = 0;
    }
    return __integerCategory1527_17(forwardValue1527_48_0);
}
public static void h1527_0(moom.Oo p0) throws Throwable {
    throw __call1152700_0(p0);
}
public static void h1527_1(moom.Oo p0) throws Throwable {
    throw __call1152701_0(p0);
}
public static void h1527_2(moom.Oo p0) throws Throwable {
    throw __call1152702_0(p0);
}
public static void h1527_3(moom.Oo p0) throws Throwable {
    throw __call1152703_0(p0);
}
public static void h1527_4(moom.Oo p0) throws Throwable {
    throw __call1152704_0(p0);
}
private static native long __fieldRead1527_0() throws Throwable;
private static native int __call1527_1() throws Throwable;
private static native boolean __fieldRead1527_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1527_3(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1527_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1527_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1527_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1527_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1527_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1527_9(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1527_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1527_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1527_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1527_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1527_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1527_15(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1527_16(boolean value) throws Throwable;
private static native boolean __integerCategory1527_17(int value) throws Throwable;
private static native java.lang.Throwable __call1152700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152704_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bd56262e98c7dccbb4e7(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_bd56262e98c7dccbb4e7 {

public static void f251(net.minecraft.entity.Entity receiver) throws Throwable {
    int forwardValue251_15_0;
    boolean spill251_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_15: {
    life1_3 = (__fieldRead251_0() ^ 4235143249971L);
    life3_5 = __call251_1();
    spill251_0 = __fieldRead251_2(receiver);
    if (!((life3_5 == 0))) {
        forwardValue251_15_0 = __integerCategory251_3(spill251_0);
        break forward_join_15;
    }
    if (!((!spill251_0))) {
        break forward_join_23;
    }
    forwardValue251_15_0 = __integerCategory251_6(__call251_5(receiver, __fieldRead251_4(), 0x1.0p2f));
    }
    __discardScalar251_7(forwardValue251_15_0);
    __call251_9(receiver, __invokedynamic251_8(1579, (1930899248750442329L ^ life1_3)));
    }
    return;
}
public static void h251_0(moom.Oo p0) throws Throwable {
    throw __call1025100_0(p0);
}
public static void h251_1(moom.Oo p0) throws Throwable {
    throw __call1025101_0(p0);
}
private static native long __fieldRead251_0() throws Throwable;
private static native int __call251_1() throws Throwable;
private static native boolean __fieldRead251_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory251_3(boolean value) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead251_4() throws Throwable;
private static native boolean __call251_5(net.minecraft.entity.Entity a0, net.minecraft.util.DamageSource a1, float a2) throws Throwable;
private static native int __integerCategory251_6(boolean value) throws Throwable;
private static native void __discardScalar251_7(int a0) throws Throwable;
private static native int __invokedynamic251_8(int a0, long a1) throws Throwable;
private static native void __call251_9(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1025100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a63cdb4c5c8c6b5df305(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_a63cdb4c5c8c6b5df305 {

public static boolean f1529(net.minecraft.entity.Entity receiver) throws Throwable {
    net.minecraft.entity.Entity forwardValue1529_43_0;
    net.minecraft.entity.Entity forwardValue1529_48_0;
    net.minecraft.entity.Entity spill1529_0;
    net.minecraft.entity.Entity spill1529_1;
    net.minecraft.entity.Entity spill1529_2;
    long life1_3;
    int life3_5;
    forward_join_50: {
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_36: {
    life1_3 = (__fieldRead1529_0() ^ 67930687539709L);
    life3_5 = __call1529_1();
    spill1529_0 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue1529_48_0 = spill1529_0;
        break forward_join_48;
    }
    if (!(__call1529_7(__fieldRead1529_2(spill1529_0), __call1529_5(__call1529_4(__call1529_3(receiver), 0x0.0p0d, -0x1.99999ap-2d, 0x0.0p0d), 0x1.0624dd2f1a9fcp-10d, 0x1.0624dd2f1a9fcp-10d, 0x1.0624dd2f1a9fcp-10d), __fieldRead1529_6(), receiver))) {
        break forward_join_47;
    }
    spill1529_1 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue1529_43_0 = spill1529_1;
        break forward_join_43;
    }
    if (!((!__fieldRead1529_8(spill1529_1)))) {
        break forward_join_36;
    }
    spill1529_2 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue1529_43_0 = spill1529_2;
        break forward_join_43;
    }
    if (!((!__fieldRead1529_9(spill1529_2)))) {
        break forward_join_36;
    }
    __call1529_10(receiver);
    }
    __fieldWrite1529_11(receiver, 0x0.0p0f);
    __fieldWrite1529_12(receiver, 1);
    forwardValue1529_43_0 = receiver;
    }
    __fieldWrite1529_13(forwardValue1529_43_0, 0);
    if (!((life3_5 != 0))) {
        break forward_join_50;
    }
    }
    forwardValue1529_48_0 = receiver;
    }
    __fieldWrite1529_14(forwardValue1529_48_0, 0);
    }
    return __fieldRead1529_15(receiver);
}
public static void h1529_0(moom.Oo p0) throws Throwable {
    throw __call1152900_0(p0);
}
public static void h1529_1(moom.Oo p0) throws Throwable {
    throw __call1152901_0(p0);
}
public static void h1529_2(moom.Oo p0) throws Throwable {
    throw __call1152902_0(p0);
}
public static void h1529_3(moom.Oo p0) throws Throwable {
    throw __call1152903_0(p0);
}
public static void h1529_4(moom.Oo p0) throws Throwable {
    throw __call1152904_0(p0);
}
public static void h1529_5(moom.Oo p0) throws Throwable {
    throw __call1152905_0(p0);
}
public static void h1529_6(moom.Oo p0) throws Throwable {
    throw __call1152906_0(p0);
}
private static native long __fieldRead1529_0() throws Throwable;
private static native int __call1529_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1529_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1529_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1529_4(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.CA __call1529_5(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.fn __fieldRead1529_6() throws Throwable;
private static native boolean __call1529_7(net.minecraft.world.World a0, moom.CA a1, moom.fn a2, net.minecraft.entity.Entity a3) throws Throwable;
private static native boolean __fieldRead1529_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead1529_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1529_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1529_11(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native void __fieldWrite1529_12(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite1529_13(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite1529_14(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __fieldRead1529_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Throwable __call1152900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1152906_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0cc5570e786a28f35bf2(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_0cc5570e786a28f35bf2 {

public static void f650(net.minecraft.entity.Entity receiver) throws Throwable {
    int forestValue650_54_0;
    int forestValue650_56_0;
    int spill650_0;
    boolean spill650_1;
    int spill650_2;
    long life1_3;
    moom.DT life4_23;
    int life3_24;
    moom.DT life5_43;
    int life6_56;
    int life7_63;
    int life8_72;
    moom.DT life9_83;
    net.minecraft.block.state.IBlockState life10_88;
    forest_join_106: {
    forest_join_54: {
    life1_3 = (__fieldRead650_0() ^ 19021868540569L);
    spill650_0 = __call650_1();
    life4_23 = new moom.DT((__fieldRead650_3(__call650_2(receiver)) + 0x1.0624dd2f1a9fcp-10d), (__fieldRead650_5(__call650_4(receiver)) + 0x1.0624dd2f1a9fcp-10d), (__fieldRead650_7(__call650_6(receiver)) + 0x1.0624dd2f1a9fcp-10d));
    life3_24 = spill650_0;
    life5_43 = new moom.DT((__fieldRead650_9(__call650_8(receiver)) - 0x1.0624dd2f1a9fcp-10d), (__fieldRead650_11(__call650_10(receiver)) - 0x1.0624dd2f1a9fcp-10d), (__fieldRead650_13(__call650_12(receiver)) - 0x1.0624dd2f1a9fcp-10d));
    spill650_1 = __call650_15(__fieldRead650_14(receiver), life4_23, life5_43);
    if (!((life3_24 == 0))) {
        forestValue650_54_0 = __integerCategory650_16(spill650_1);
        break forest_join_54;
    }
    if (!(spill650_1)) {
        break forest_join_106;
    }
    forestValue650_54_0 = __call650_17(life4_23);
    }
    life6_56 = forestValue650_54_0;
    forest_cycle_55: while (true) {
    forest_join_103: {
    forestValue650_56_0 = life6_56;
    forest_cycle_56: while (true) {
    if (!((forestValue650_56_0 <= __call650_18(life5_43)))) {
        break forest_join_106;
    }
    life7_63 = __call650_19(life4_23);
    forest_cycle_62: while (true) {
    forest_join_101: {
    forest_join_100: {
    if (!((life7_63 <= __call650_20(life5_43)))) {
        break forest_join_103;
    }
    spill650_2 = __call650_21(life4_23);
    if (!((life3_24 == 0))) {
        forestValue650_56_0 = spill650_2;
        continue forest_cycle_56;
    }
    life8_72 = spill650_2;
    forest_cycle_71: while (true) {
    if (!((life8_72 <= __call650_22(life5_43)))) {
        break forest_join_100;
    }
    life9_83 = new moom.DT(life6_56, life7_63, life8_72);
    life10_88 = __call650_24(__fieldRead650_23(receiver), life9_83);
    __call650_27(__call650_25(life10_88), __fieldRead650_26(receiver), life9_83, life10_88, receiver);
    if (!((life3_24 == 0))) {
        break forest_join_101;
    }
    life8_72 += 1;
    if (!((life3_24 != 0))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    }
    life7_63 += 1;
    }
    if (!((life3_24 != 0))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    break forest_cycle_56;
    }
    }
    life6_56 += 1;
    if (!((life3_24 != 0))) {
        continue forest_cycle_55;
    }
    break forest_cycle_55;
    }
    }
    return;
}
public static void h650_0(java.lang.Throwable p0) throws Throwable {
    throw __call3065000_0(p0);
}
public static void h650_1(java.lang.Throwable p0) throws Throwable {
    throw __call3065001_0(p0);
}
public static void h650_2(java.lang.Throwable p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) throws Throwable {
    java.lang.Throwable life3_2;
    moom.qY life4_6;
    moom.qZ life5_10;
    life3_2 = p0;
    life4_6 = __call3065002_0(life3_2, "Colliding entity with block");
    life5_10 = __call3065002_1(life4_6, "Block being collided with");
    __call3065002_2(life5_10, p1, p2);
    throw new moom.Oo(life4_6);
}
private static native long __fieldRead650_0() throws Throwable;
private static native int __call650_1() throws Throwable;
private static native moom.CA __call650_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead650_3(moom.CA a0) throws Throwable;
private static native moom.CA __call650_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead650_5(moom.CA a0) throws Throwable;
private static native moom.CA __call650_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead650_7(moom.CA a0) throws Throwable;
private static native moom.CA __call650_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead650_9(moom.CA a0) throws Throwable;
private static native moom.CA __call650_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead650_11(moom.CA a0) throws Throwable;
private static native moom.CA __call650_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead650_13(moom.CA a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead650_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call650_15(net.minecraft.world.World a0, moom.DT a1, moom.DT a2) throws Throwable;
private static native int __integerCategory650_16(boolean value) throws Throwable;
private static native int __call650_17(moom.DT a0) throws Throwable;
private static native int __call650_18(moom.DT a0) throws Throwable;
private static native int __call650_19(moom.DT a0) throws Throwable;
private static native int __call650_20(moom.DT a0) throws Throwable;
private static native int __call650_21(moom.DT a0) throws Throwable;
private static native int __call650_22(moom.DT a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead650_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call650_24(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call650_25(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead650_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call650_27(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, net.minecraft.entity.Entity a4) throws Throwable;
private static native java.lang.Throwable __call3065000_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3065001_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3065002_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3065002_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3065002_2(moom.qZ a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4775a72fabf31d9a69f6(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_4775a72fabf31d9a69f6 {

public static void f563(net.minecraft.entity.Entity receiver) throws Throwable {
    int lexicalValue563_59_0;
    int spill563_0;
    int spill563_1;
    long life1_3;
    float life4_29;
    int life3_30;
    float life5_63;
    int life6_65;
    float life7_86;
    float life8_97;
    float life7_161;
    float life8_172;
    lexical_join_196: {
    lexical_join_135: {
    lexical_join_133: {
    lexical_join_59: {
    lexical_join_39: {
    life1_3 = (__fieldRead563_0() ^ 90883201449755L);
    spill563_0 = __call563_1();
    life4_29 = (__call563_8(((((__fieldRead563_2(receiver) * __fieldRead563_3(receiver)) * 0x1.99999ap-3d) + (__fieldRead563_4(receiver) * __fieldRead563_5(receiver))) + ((__fieldRead563_6(receiver) * __fieldRead563_7(receiver)) * 0x1.99999ap-3d))) * 0x1.99999ap-3f);
    life3_30 = spill563_0;
    spill563_1 = __numericCompare563_9(life4_29, 0x1.0p0f);
    if (!((life3_30 == 0))) {
        lexicalValue563_59_0 = spill563_1;
        break lexical_join_59;
    }
    if (!((spill563_1 > 0))) {
        break lexical_join_39;
    }
    life4_29 = 0x1.0p0f;
    }
    __call563_15(receiver, __call563_10(receiver), life4_29, (0x1.0p0f + ((__call563_12(__fieldRead563_11(receiver)) - __call563_14(__fieldRead563_13(receiver))) * 0x1.99999ap-2f)));
    lexicalValue563_59_0 = __call563_18(__fieldRead563_17(__call563_16(receiver)));
    }
    life5_63 = ((float) lexicalValue563_59_0);
    life6_65 = 0;
    lexical_cycle_63: while (true) {
    if (!((__numericCompare563_20(((float) life6_65), (0x1.0p0f + (__fieldRead563_19(receiver) * 0x1.4p4f))) < 0))) {
        break lexical_join_133;
    }
    life7_86 = (((__call563_22(__fieldRead563_21(receiver)) * 0x1.0p1f) - 0x1.0p0f) * __fieldRead563_23(receiver));
    life8_97 = (((__call563_25(__fieldRead563_24(receiver)) * 0x1.0p1f) - 0x1.0p0f) * __fieldRead563_26(receiver));
    __call563_36(__fieldRead563_27(receiver), __fieldRead563_28(), (__fieldRead563_29(receiver) + ((double) life7_86)), ((double) (life5_63 + 0x1.0p0f)), (__fieldRead563_30(receiver) + ((double) life8_97)), __fieldRead563_31(receiver), (__fieldRead563_32(receiver) - ((double) (__call563_34(__fieldRead563_33(receiver)) * 0x1.99999ap-3f))), __fieldRead563_35(receiver), new int[0]);
    life6_65 += 1;
    if (!((life3_30 == 0))) {
        break lexical_join_135;
    }
    if (!((life3_30 != 0))) { continue lexical_cycle_63; }
    break lexical_cycle_63;
    }
    }
    life6_65 = 0;
    }
    lexical_cycle_135: while (true) {
    if (!((__numericCompare563_38(((float) life6_65), (0x1.0p0f + (__fieldRead563_37(receiver) * 0x1.4p4f))) < 0))) {
        break lexical_join_196;
    }
    life7_161 = (((__call563_40(__fieldRead563_39(receiver)) * 0x1.0p1f) - 0x1.0p0f) * __fieldRead563_41(receiver));
    life8_172 = (((__call563_43(__fieldRead563_42(receiver)) * 0x1.0p1f) - 0x1.0p0f) * __fieldRead563_44(receiver));
    __call563_52(__fieldRead563_45(receiver), __fieldRead563_46(), (__fieldRead563_47(receiver) + ((double) life7_161)), ((double) (life5_63 + 0x1.0p0f)), (__fieldRead563_48(receiver) + ((double) life8_172)), __fieldRead563_49(receiver), __fieldRead563_50(receiver), __fieldRead563_51(receiver), new int[0]);
    life6_65 += 1;
    if (!((life3_30 != 0))) { continue lexical_cycle_135; }
    break lexical_cycle_135;
    }
    }
    return;
}
public static void h563_0(moom.Oo p0) throws Throwable {
    throw __call2056300_0(p0);
}
public static void h563_1(moom.Oo p0) throws Throwable {
    throw __call2056301_0(p0);
}
private static native long __fieldRead563_0() throws Throwable;
private static native int __call563_1() throws Throwable;
private static native double __fieldRead563_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_8(double a0) throws Throwable;
private static native int __numericCompare563_9(float a0, float a1) throws Throwable;
private static native java.lang.String __call563_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Random __fieldRead563_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_12(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead563_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_14(java.util.Random a0) throws Throwable;
private static native void __call563_15(net.minecraft.entity.Entity a0, java.lang.String a1, float a2, float a3) throws Throwable;
private static native moom.CA __call563_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_17(moom.CA a0) throws Throwable;
private static native int __call563_18(double a0) throws Throwable;
private static native float __fieldRead563_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare563_20(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead563_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_22(java.util.Random a0) throws Throwable;
private static native float __fieldRead563_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Random __fieldRead563_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_25(java.util.Random a0) throws Throwable;
private static native float __fieldRead563_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead563_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead563_28() throws Throwable;
private static native double __fieldRead563_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Random __fieldRead563_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_34(java.util.Random a0) throws Throwable;
private static native double __fieldRead563_35(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call563_36(net.minecraft.world.World a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native float __fieldRead563_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare563_38(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead563_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_40(java.util.Random a0) throws Throwable;
private static native float __fieldRead563_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Random __fieldRead563_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call563_43(java.util.Random a0) throws Throwable;
private static native float __fieldRead563_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead563_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead563_46() throws Throwable;
private static native double __fieldRead563_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_48(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_49(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead563_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call563_52(net.minecraft.world.World a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native java.lang.Throwable __call2056300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2056301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_68680c07c1ad0d44d717(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_68680c07c1ad0d44d717 {

public static void f1530(net.minecraft.entity.Entity receiver) throws Throwable {
    int forwardValue1530_15_0;
    net.minecraft.entity.Entity forwardValue1530_17_0;
    boolean spill1530_0;
    net.minecraft.entity.Entity spill1530_1;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (__fieldRead1530_0() ^ 122271859342986L);
    life3_5 = __call1530_1();
    spill1530_0 = __call1530_2(receiver);
    if (!((life3_5 == 0))) {
        forwardValue1530_15_0 = __integerCategory1530_3(spill1530_0);
        break forward_join_15;
    }
    if (!(spill1530_0)) {
        break forward_join_18;
    }
    spill1530_1 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue1530_17_0 = spill1530_1;
        break forward_join_17;
    }
    forwardValue1530_15_0 = __integerCategory1530_5(__call1530_4(spill1530_1));
    }
    if (!((forwardValue1530_15_0 == 0))) {
        break forward_join_18;
    }
    forwardValue1530_17_0 = receiver;
    }
    __call1530_6(forwardValue1530_17_0);
    }
    return;
}
public static void h1530_0(moom.Oo p0) throws Throwable {
    throw __call1153000_0(p0);
}
public static void h1530_1(moom.Oo p0) throws Throwable {
    throw __call1153001_0(p0);
}
public static void h1530_2(moom.Oo p0) throws Throwable {
    throw __call1153002_0(p0);
}
private static native long __fieldRead1530_0() throws Throwable;
private static native int __call1530_1() throws Throwable;
private static native boolean __call1530_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1530_3(boolean value) throws Throwable;
private static native boolean __call1530_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1530_5(boolean value) throws Throwable;
private static native void __call1530_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Throwable __call1153000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_729c817dac647ddcfc67(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_729c817dac647ddcfc67 {

public static boolean f1531(net.minecraft.entity.Entity receiver) throws Throwable {
    int forwardValue1531_12_0;
    int forwardValue1531_14_0;
    boolean spill1531_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (__fieldRead1531_0() ^ 97980423343250L);
    life3_5 = __call1531_1();
    spill1531_0 = __fieldRead1531_2(receiver);
    if (!((life3_5 == 0))) {
        forwardValue1531_12_0 = __integerCategory1531_3(spill1531_0);
        break forward_join_12;
    }
    if (!((!spill1531_0))) {
        break forward_join_13;
    }
    forwardValue1531_12_0 = 1;
    }
    forwardValue1531_14_0 = forwardValue1531_12_0;
    break forward_join_14;
    }
    forwardValue1531_14_0 = 0;
    }
    return __integerCategory1531_4(forwardValue1531_14_0);
}
public static void h1531_0(moom.Oo p0) throws Throwable {
    throw __call1153100_0(p0);
}
private static native long __fieldRead1531_0() throws Throwable;
private static native int __call1531_1() throws Throwable;
private static native boolean __fieldRead1531_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1531_3(boolean value) throws Throwable;
private static native boolean __integerCategory1531_4(int value) throws Throwable;
private static native java.lang.Throwable __call1153100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d7f60bee0477ae2cf0d2(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_d7f60bee0477ae2cf0d2 {

public static boolean f1532(net.minecraft.entity.Entity receiver) throws Throwable {
    int lexicalValue1532_129_0;
    int lexicalValue1532_136_0;
    boolean spill1532_0;
    int spill1532_1;
    int spill1532_2;
    int spill1532_3;
    long life1_3;
    int life3_5;
    moom.DU life4_32;
    int life5_34;
    int life6_59;
    int life7_78;
    int life8_97;
    lexical_join_136: {
    lexical_join_135: {
    life1_3 = (__fieldRead1532_0() ^ 125919048185332L);
    life3_5 = __call1532_1();
    spill1532_0 = __fieldRead1532_2(receiver);
    if (!((life3_5 != 0))) {
        lexicalValue1532_136_0 = __integerCategory1532_3(spill1532_0);
        break lexical_join_136;
    }
    if (!((!spill1532_0))) {
        break lexical_join_135;
    }
    life4_32 = new moom.DU(__invokedynamic1532_4(21554, (4899277782553907343L ^ life1_3)), __invokedynamic1532_5(22626, (7004835762999778518L ^ life1_3)), __invokedynamic1532_6(22626, (7004835762999778518L ^ life1_3)));
    life5_34 = 0;
    lexical_cycle_32: while (true) {
    lexical_join_133: {
    lexical_join_132: {
    lexical_join_129: {
    lexical_join_115: {
    if (!((life5_34 < __invokedynamic1532_7(18650, (860435493200284781L ^ life1_3))))) {
        break lexical_join_135;
    }
    life6_59 = __call1532_10(((__fieldRead1532_8(receiver) + ((double) ((((float) (life5_34 % 2)) - 0x1.0p-1f) * 0x1.99999ap-4f))) + ((double) __call1532_9(receiver))));
    life7_78 = __call1532_13((__fieldRead1532_11(receiver) + ((double) (((((float) ((life5_34 >> 1) % 2)) - 0x1.0p-1f) * __fieldRead1532_12(receiver)) * 0x1.99999ap-1f))));
    life8_97 = __call1532_16((__fieldRead1532_14(receiver) + ((double) (((((float) ((life5_34 >> 2) % 2)) - 0x1.0p-1f) * __fieldRead1532_15(receiver)) * 0x1.99999ap-1f))));
    spill1532_1 = __call1532_17(life4_32);
    if (!((life3_5 != 0))) {
        lexicalValue1532_136_0 = spill1532_1;
        break lexical_join_136;
    }
    if (!((life3_5 != 0))) {
        lexicalValue1532_129_0 = spill1532_1;
        break lexical_join_129;
    }
    if (!((spill1532_1 == life7_78))) {
        break lexical_join_115;
    }
    spill1532_2 = __call1532_18(life4_32);
    if (!((life3_5 != 0))) {
        lexicalValue1532_129_0 = spill1532_2;
        break lexical_join_129;
    }
    if (!((spill1532_2 == life6_59))) {
        break lexical_join_115;
    }
    spill1532_3 = __call1532_19(life4_32);
    if (!((life3_5 != 0))) {
        lexicalValue1532_129_0 = spill1532_3;
        break lexical_join_129;
    }
    if (!((spill1532_3 != life8_97))) {
        break lexical_join_132;
    }
    }
    __call1532_20(life4_32, life7_78, life6_59, life8_97);
    if (!((life3_5 != 0))) {
        break lexical_join_133;
    }
    lexicalValue1532_129_0 = __integerCategory1532_25(__call1532_24(__call1532_23(__call1532_22(__fieldRead1532_21(receiver), life4_32))));
    }
    if (!((lexicalValue1532_129_0 != 0))) {
        break lexical_join_132;
    }
    return __integerCategory1532_26(1);
    }
    life5_34 += 1;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    lexicalValue1532_136_0 = 0;
    }
    return __integerCategory1532_27(lexicalValue1532_136_0);
}
public static void h1532_0(moom.Oo p0) throws Throwable {
    throw __call1153200_0(p0);
}
public static void h1532_1(moom.Oo p0) throws Throwable {
    throw __call1153201_0(p0);
}
public static void h1532_2(moom.Oo p0) throws Throwable {
    throw __call1153202_0(p0);
}
public static void h1532_3(moom.Oo p0) throws Throwable {
    throw __call1153203_0(p0);
}
public static void h1532_4(moom.Oo p0) throws Throwable {
    throw __call1153204_0(p0);
}
public static void h1532_5(moom.Oo p0) throws Throwable {
    throw __call1153205_0(p0);
}
public static void h1532_6(moom.Oo p0) throws Throwable {
    throw __call1153206_0(p0);
}
public static void h1532_7(moom.Oo p0) throws Throwable {
    throw __call1153207_0(p0);
}
public static void h1532_8(moom.Oo p0) throws Throwable {
    throw __call1153208_0(p0);
}
public static void h1532_9(moom.Oo p0) throws Throwable {
    throw __call1153209_0(p0);
}
private static native long __fieldRead1532_0() throws Throwable;
private static native int __call1532_1() throws Throwable;
private static native boolean __fieldRead1532_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1532_3(boolean value) throws Throwable;
private static native int __invokedynamic1532_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1532_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1532_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1532_7(int a0, long a1) throws Throwable;
private static native double __fieldRead1532_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1532_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1532_10(double a0) throws Throwable;
private static native double __fieldRead1532_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1532_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1532_13(double a0) throws Throwable;
private static native double __fieldRead1532_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1532_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1532_16(double a0) throws Throwable;
private static native int __call1532_17(moom.DU a0) throws Throwable;
private static native int __call1532_18(moom.DU a0) throws Throwable;
private static native int __call1532_19(moom.DU a0) throws Throwable;
private static native moom.DU __call1532_20(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.World __fieldRead1532_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1532_22(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1532_23(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1532_24(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory1532_25(boolean value) throws Throwable;
private static native boolean __integerCategory1532_26(int value) throws Throwable;
private static native boolean __integerCategory1532_27(int value) throws Throwable;
private static native java.lang.Throwable __call1153200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153209_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_76a037a0a2906dde42bc(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_76a037a0a2906dde42bc {

public static boolean f1533(net.minecraft.entity.Entity receiver) throws Throwable {
    net.minecraft.world.World forwardValue1533_13_0;
    int forwardValue1533_18_0;
    int forwardValue1533_20_0;
    int forwardValue1533_28_0;
    int forwardValue1533_38_0;
    int forwardValue1533_42_0;
    int forwardValue1533_44_0;
    net.minecraft.world.World spill1533_0;
    boolean spill1533_1;
    boolean spill1533_2;
    int spill1533_3;
    long life1_3;
    int life3_5;
    int life4_29;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_38: {
    forward_join_28: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (__fieldRead1533_0() ^ 72325855697362L);
    life3_5 = __call1533_1();
    spill1533_0 = __fieldRead1533_2(receiver);
    if (!((life3_5 != 0))) {
        forwardValue1533_13_0 = spill1533_0;
        break forward_join_13;
    }
    if (!((spill1533_0 != null))) {
        break forward_join_19;
    }
    forwardValue1533_13_0 = __fieldRead1533_3(receiver);
    }
    spill1533_1 = __fieldRead1533_4(forwardValue1533_13_0);
    if (!((life3_5 != 0))) {
        forwardValue1533_18_0 = __integerCategory1533_5(spill1533_1);
        break forward_join_18;
    }
    if (!(spill1533_1)) {
        break forward_join_19;
    }
    forwardValue1533_18_0 = 1;
    }
    forwardValue1533_20_0 = forwardValue1533_18_0;
    break forward_join_20;
    }
    forwardValue1533_20_0 = 0;
    }
    life4_29 = forwardValue1533_20_0;
    spill1533_2 = __fieldRead1533_6(receiver);
    if (!((life3_5 != 0))) {
        forwardValue1533_28_0 = __integerCategory1533_7(spill1533_2);
        break forward_join_28;
    }
    if (!((!spill1533_2))) {
        break forward_join_43;
    }
    forwardValue1533_28_0 = __fieldRead1533_8(receiver);
    }
    if (!((life3_5 != 0))) {
        forwardValue1533_42_0 = forwardValue1533_28_0;
        break forward_join_42;
    }
    if (!((forwardValue1533_28_0 <= 0))) {
        break forward_join_41;
    }
    spill1533_3 = life4_29;
    if (!((life3_5 != 0))) {
        forwardValue1533_38_0 = spill1533_3;
        break forward_join_38;
    }
    if (!((spill1533_3 != 0))) {
        break forward_join_43;
    }
    forwardValue1533_38_0 = __integerCategory1533_10(__call1533_9(receiver, 0));
    }
    if (!((life3_5 != 0))) {
        forwardValue1533_42_0 = forwardValue1533_38_0;
        break forward_join_42;
    }
    if (!((forwardValue1533_38_0 != 0))) {
        break forward_join_43;
    }
    }
    forwardValue1533_42_0 = 1;
    }
    forwardValue1533_44_0 = forwardValue1533_42_0;
    break forward_join_44;
    }
    forwardValue1533_44_0 = 0;
    }
    return __integerCategory1533_11(forwardValue1533_44_0);
}
public static void h1533_0(moom.Oo p0) throws Throwable {
    throw __call1153300_0(p0);
}
public static void h1533_1(moom.Oo p0) throws Throwable {
    throw __call1153301_0(p0);
}
public static void h1533_2(moom.Oo p0) throws Throwable {
    throw __call1153302_0(p0);
}
public static void h1533_3(moom.Oo p0) throws Throwable {
    throw __call1153303_0(p0);
}
public static void h1533_4(moom.Oo p0) throws Throwable {
    throw __call1153304_0(p0);
}
public static void h1533_5(moom.Oo p0) throws Throwable {
    throw __call1153305_0(p0);
}
public static void h1533_6(moom.Oo p0) throws Throwable {
    throw __call1153306_0(p0);
}
public static void h1533_7(moom.Oo p0) throws Throwable {
    throw __call1153307_0(p0);
}
public static void h1533_8(moom.Oo p0) throws Throwable {
    throw __call1153308_0(p0);
}
public static void h1533_9(moom.Oo p0) throws Throwable {
    throw __call1153309_0(p0);
}
private static native long __fieldRead1533_0() throws Throwable;
private static native int __call1533_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1533_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1533_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead1533_4(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1533_5(boolean value) throws Throwable;
private static native boolean __fieldRead1533_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1533_7(boolean value) throws Throwable;
private static native int __fieldRead1533_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1533_9(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __integerCategory1533_10(boolean value) throws Throwable;
private static native boolean __integerCategory1533_11(int value) throws Throwable;
private static native java.lang.Throwable __call1153300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153309_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d8166df4e4b3e3b47276(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_d8166df4e4b3e3b47276 {

public static boolean f2780(net.minecraft.entity.Entity receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2780_0() ^ 86806942701131L);
    return ((__fieldRead2780_1(receiver) != null) ? true : false);
}
public static void h2780_0(moom.Oo p0) throws Throwable {
    throw __call1278000_0(p0);
}
private static native long __fieldRead2780_0() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead2780_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Throwable __call1278000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_69e9bc30f53a3d8d9189(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_69e9bc30f53a3d8d9189 {

public static void f252(net.minecraft.entity.Entity receiver) throws Throwable {
    net.minecraft.entity.Entity lexicalValue252_30_0;
    net.minecraft.entity.Entity lexicalValue252_50_0;
    int lexicalValue252_149_0;
    int lexicalValue252_160_0;
    int lexicalValue252_173_0;
    double lexicalValue252_177_0;
    net.minecraft.entity.Entity spill252_0;
    int spill252_1;
    double spill252_2;
    long life1_3;
    int life3_5;
    double life4_159;
    double life6_164;
    float life8_166;
    lexical_join_190: {
    lexical_join_178: {
    lexical_join_177: {
    lexical_join_173: {
    lexical_join_166: {
    lexical_join_160: {
    lexical_join_156: {
    lexical_join_149: {
    lexical_join_144: {
    lexical_join_122: {
    lexical_join_107: {
    lexical_join_92: {
    lexical_join_77: {
    lexical_join_50: {
    lexical_join_30: {
    lexical_join_17: {
    life1_3 = (__fieldRead252_0() ^ 22451632430921L);
    life3_5 = __call252_1();
    spill252_0 = __fieldRead252_2(receiver);
    if (!((life3_5 != 0))) {
        lexicalValue252_30_0 = spill252_0;
        break lexical_join_30;
    }
    if (!(__fieldRead252_3(spill252_0))) {
        break lexical_join_17;
    }
    __fieldWrite252_4(receiver, null);
    if (!((life3_5 == 0))) {
        break lexical_join_190;
    }
    }
    __fieldWrite252_5(receiver, 0x0.0p0d);
    __fieldWrite252_6(receiver, 0x0.0p0d);
    __fieldWrite252_7(receiver, 0x0.0p0d);
    __call252_8(receiver);
    lexicalValue252_30_0 = __fieldRead252_9(receiver);
    }
    if (!((life3_5 != 0))) {
        lexicalValue252_50_0 = lexicalValue252_30_0;
        break lexical_join_50;
    }
    if (!((lexicalValue252_30_0 != null))) {
        break lexical_join_190;
    }
    __call252_11(__fieldRead252_10(receiver));
    net.minecraft.entity.Entity __stackOp252_12_0 = receiver;
    __fieldWrite252_18(__stackOp252_12_0, (__fieldRead252_13(__stackOp252_12_0) + ((double) (__fieldRead252_15(__fieldRead252_14(receiver)) - __fieldRead252_17(__fieldRead252_16(receiver))))));
    lexicalValue252_50_0 = receiver;
    }
    net.minecraft.entity.Entity __stackOp252_19_0 = lexicalValue252_50_0;
    __fieldWrite252_25(__stackOp252_19_0, (__fieldRead252_20(__stackOp252_19_0) + ((double) (__fieldRead252_22(__fieldRead252_21(receiver)) - __fieldRead252_24(__fieldRead252_23(receiver))))));
    lexical_cycle_62: while (true) {
    if (!((__numericCompare252_27(__fieldRead252_26(receiver), 0x1.68p7d) >= 0))) {
        break lexical_join_77;
    }
    net.minecraft.entity.Entity __stackOp252_28_0 = receiver;
    __fieldWrite252_30(__stackOp252_28_0, (__fieldRead252_29(__stackOp252_28_0) - 0x1.68p8d));
    if (!((life3_5 != 0))) {
        break lexical_join_92;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    }
    lexical_cycle_77: while (true) {
    if (!((__numericCompare252_32(__fieldRead252_31(receiver), -0x1.68p7d) < 0))) {
        break lexical_join_92;
    }
    net.minecraft.entity.Entity __stackOp252_33_0 = receiver;
    __fieldWrite252_35(__stackOp252_33_0, (__fieldRead252_34(__stackOp252_33_0) + 0x1.68p8d));
    if (!((life3_5 != 0))) {
        break lexical_join_107;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_77; }
    break lexical_cycle_77;
    }
    }
    lexical_cycle_92: while (true) {
    if (!((__numericCompare252_37(__fieldRead252_36(receiver), 0x1.68p7d) >= 0))) {
        break lexical_join_107;
    }
    net.minecraft.entity.Entity __stackOp252_38_0 = receiver;
    __fieldWrite252_40(__stackOp252_38_0, (__fieldRead252_39(__stackOp252_38_0) - 0x1.68p8d));
    if (!((life3_5 != 0))) {
        break lexical_join_122;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_92; }
    break lexical_cycle_92;
    }
    }
    lexical_cycle_107: while (true) {
    if (!((__numericCompare252_42(__fieldRead252_41(receiver), -0x1.68p7d) < 0))) {
        break lexical_join_122;
    }
    net.minecraft.entity.Entity __stackOp252_43_0 = receiver;
    __fieldWrite252_45(__stackOp252_43_0, (__fieldRead252_44(__stackOp252_43_0) + 0x1.68p8d));
    if (!((life3_5 != 0))) {
        break lexical_join_190;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_107; }
    break lexical_cycle_107;
    }
    }
    life4_159 = (__fieldRead252_46(receiver) * 0x1.0p-1d);
    life6_164 = (__fieldRead252_47(receiver) * 0x1.0p-1d);
    life8_166 = 0x1.4p3f;
    spill252_1 = __numericCompare252_48(life4_159, ((double) life8_166));
    if (!((life3_5 != 0))) {
        lexicalValue252_149_0 = spill252_1;
        break lexical_join_149;
    }
    if (!((spill252_1 > 0))) {
        break lexical_join_144;
    }
    life4_159 = ((double) life8_166);
    }
    lexicalValue252_149_0 = __numericCompare252_49(life4_159, ((double) (-life8_166)));
    }
    if (!((life3_5 != 0))) {
        lexicalValue252_160_0 = lexicalValue252_149_0;
        break lexical_join_160;
    }
    if (!((lexicalValue252_149_0 < 0))) {
        break lexical_join_156;
    }
    life4_159 = ((double) (-life8_166));
    }
    lexicalValue252_160_0 = __numericCompare252_50(life6_164, ((double) life8_166));
    }
    if (!((life3_5 != 0))) {
        lexicalValue252_173_0 = lexicalValue252_160_0;
        break lexical_join_173;
    }
    if (!((lexicalValue252_160_0 > 0))) {
        break lexical_join_166;
    }
    life6_164 = ((double) life8_166);
    }
    spill252_2 = life6_164;
    if (!((life3_5 != 0))) {
        lexicalValue252_177_0 = spill252_2;
        break lexical_join_177;
    }
    lexicalValue252_173_0 = __numericCompare252_51(spill252_2, ((double) (-life8_166)));
    }
    if (!((lexicalValue252_173_0 < 0))) {
        break lexical_join_178;
    }
    lexicalValue252_177_0 = ((double) (-life8_166));
    }
    life6_164 = lexicalValue252_177_0;
    }
    net.minecraft.entity.Entity __stackOp252_52_0 = receiver;
    __fieldWrite252_54(__stackOp252_52_0, (__fieldRead252_53(__stackOp252_52_0) - life4_159));
    net.minecraft.entity.Entity __stackOp252_55_0 = receiver;
    __fieldWrite252_57(__stackOp252_55_0, (__fieldRead252_56(__stackOp252_55_0) - life6_164));
    }
    return;
}
public static void h252_0(moom.Oo p0) throws Throwable {
    throw __call1025200_0(p0);
}
public static void h252_1(moom.Oo p0) throws Throwable {
    throw __call1025201_0(p0);
}
public static void h252_2(moom.Oo p0) throws Throwable {
    throw __call1025202_0(p0);
}
public static void h252_3(moom.Oo p0) throws Throwable {
    throw __call1025203_0(p0);
}
public static void h252_4(moom.Oo p0) throws Throwable {
    throw __call1025204_0(p0);
}
public static void h252_5(moom.Oo p0) throws Throwable {
    throw __call1025205_0(p0);
}
public static void h252_6(moom.Oo p0) throws Throwable {
    throw __call1025206_0(p0);
}
public static void h252_7(moom.Oo p0) throws Throwable {
    throw __call1025207_0(p0);
}
public static void h252_8(moom.Oo p0) throws Throwable {
    throw __call1025208_0(p0);
}
public static void h252_9(moom.Oo p0) throws Throwable {
    throw __call1025209_0(p0);
}
public static void h252_10(moom.Oo p0) throws Throwable {
    throw __call1025210_0(p0);
}
public static void h252_11(moom.Oo p0) throws Throwable {
    throw __call1025211_0(p0);
}
public static void h252_12(moom.Oo p0) throws Throwable {
    throw __call1025212_0(p0);
}
public static void h252_13(moom.Oo p0) throws Throwable {
    throw __call1025213_0(p0);
}
public static void h252_14(moom.Oo p0) throws Throwable {
    throw __call1025214_0(p0);
}
public static void h252_15(moom.Oo p0) throws Throwable {
    throw __call1025215_0(p0);
}
private static native long __fieldRead252_0() throws Throwable;
private static native int __call252_1() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead252_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead252_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_4(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite252_5(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite252_6(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __fieldWrite252_7(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __call252_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead252_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead252_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call252_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead252_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead252_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead252_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead252_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead252_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_18(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead252_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead252_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead252_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead252_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead252_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_25(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead252_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare252_27(double a0, double a1) throws Throwable;
private static native double __fieldRead252_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_30(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead252_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare252_32(double a0, double a1) throws Throwable;
private static native double __fieldRead252_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_35(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead252_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare252_37(double a0, double a1) throws Throwable;
private static native double __fieldRead252_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_40(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead252_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare252_42(double a0, double a1) throws Throwable;
private static native double __fieldRead252_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_45(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead252_46(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead252_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare252_48(double a0, double a1) throws Throwable;
private static native int __numericCompare252_49(double a0, double a1) throws Throwable;
private static native int __numericCompare252_50(double a0, double a1) throws Throwable;
private static native int __numericCompare252_51(double a0, double a1) throws Throwable;
private static native double __fieldRead252_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_54(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead252_56(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite252_57(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native java.lang.Throwable __call1025200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025215_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a97ca3d3dae9371cff4c(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_a97ca3d3dae9371cff4c {

public static void f1535(net.minecraft.entity.Entity receiver) throws Throwable {
    net.minecraft.entity.Entity forwardValue1535_13_0;
    net.minecraft.entity.Entity spill1535_0;
    long life1_3;
    int life3_5;
    forward_join_27: {
    forward_join_13: {
    life1_3 = (__fieldRead1535_0() ^ 59525309059445L);
    life3_5 = __call1535_1();
    spill1535_0 = __fieldRead1535_2(receiver);
    if (!((life3_5 == 0))) {
        forwardValue1535_13_0 = spill1535_0;
        break forward_join_13;
    }
    if (!((spill1535_0 != null))) {
        break forward_join_27;
    }
    forwardValue1535_13_0 = __fieldRead1535_3(receiver);
    }
    __call1535_10(forwardValue1535_13_0, __fieldRead1535_4(receiver), ((__fieldRead1535_5(receiver) + __call1535_6(receiver)) + __call1535_8(__fieldRead1535_7(receiver))), __fieldRead1535_9(receiver));
    }
    return;
}
public static void h1535_0(moom.Oo p0) throws Throwable {
    throw __call1153500_0(p0);
}
public static void h1535_1(moom.Oo p0) throws Throwable {
    throw __call1153501_0(p0);
}
private static native long __fieldRead1535_0() throws Throwable;
private static native int __call1535_1() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1535_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1535_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1535_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1535_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1535_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1535_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1535_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1535_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1535_10(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1153500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1153501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_07bdca2da38cd97fe49a(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_07bdca2da38cd97fe49a {

public static java.lang.String f253(net.minecraft.entity.Entity receiver) throws Throwable {
    java.lang.String forwardValue253_39_0;
    java.lang.Object[] forwardValue253_39_1;
    java.lang.Object[] forwardValue253_39_2;
    int forwardValue253_39_3;
    java.lang.String forwardValue253_41_0;
    java.lang.Object[] forwardValue253_41_1;
    java.lang.Object[] forwardValue253_41_2;
    int forwardValue253_41_3;
    net.minecraft.world.World forwardValue253_41_4;
    java.lang.String forwardValue253_43_0;
    java.lang.Object[] forwardValue253_43_1;
    java.lang.Object[] forwardValue253_43_2;
    int forwardValue253_43_3;
    java.lang.String forwardValue253_43_4;
    java.lang.String spill253_0;
    java.lang.Object[] spill253_1;
    java.lang.Object[] spill253_2;
    java.lang.Object[] spill253_3;
    java.lang.Object[] spill253_4;
    java.lang.Object[] spill253_5;
    int spill253_6;
    net.minecraft.world.World spill253_7;
    java.lang.Object[] spill253_8;
    java.lang.Object[] spill253_9;
    java.lang.Object[] spill253_10;
    long life1_3;
    int life3_5;
    forward_join_43: {
    forward_join_41: {
    forward_join_39: {
    life1_3 = (__fieldRead253_0() ^ 7393258420078L);
    life3_5 = __call253_1();
    spill253_0 = "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]";
    java.lang.Object[] __stackOp253_3_0 = new java.lang.Object[__invokedynamic253_2(2294, (6646635249590243031L ^ life1_3))];
    spill253_1 = __stackOp253_3_0;
    (__stackOp253_3_0)[0] = __call253_5(__call253_4(receiver));
    java.lang.Object[] __stackOp253_6_0 = spill253_1;
    spill253_2 = __stackOp253_6_0;
    (__stackOp253_6_0)[1] = __call253_7(receiver);
    java.lang.Object[] __stackOp253_8_0 = spill253_2;
    spill253_3 = __stackOp253_8_0;
    (__stackOp253_8_0)[2] = __call253_10(__fieldRead253_9(receiver));
    java.lang.Object[] __stackOp253_11_0 = spill253_3;
    spill253_4 = __stackOp253_11_0;
    spill253_5 = __stackOp253_11_0;
    spill253_6 = 3;
    spill253_7 = __fieldRead253_12(receiver);
    if (!((life3_5 == 0))) {
        forwardValue253_41_0 = spill253_0;
        forwardValue253_41_1 = spill253_4;
        forwardValue253_41_2 = spill253_5;
        forwardValue253_41_3 = spill253_6;
        forwardValue253_41_4 = spill253_7;
        break forward_join_41;
    }
    if (!((spill253_7 == null))) {
        forwardValue253_39_0 = spill253_0;
        forwardValue253_39_1 = spill253_4;
        forwardValue253_39_2 = spill253_5;
        forwardValue253_39_3 = spill253_6;
        break forward_join_39;
    }
    forwardValue253_43_0 = spill253_0;
    forwardValue253_43_1 = spill253_4;
    forwardValue253_43_2 = spill253_5;
    forwardValue253_43_3 = spill253_6;
    forwardValue253_43_4 = "~NULL~";
    break forward_join_43;
    }
    forwardValue253_41_0 = forwardValue253_39_0;
    forwardValue253_41_1 = forwardValue253_39_1;
    forwardValue253_41_2 = forwardValue253_39_2;
    forwardValue253_41_3 = forwardValue253_39_3;
    forwardValue253_41_4 = __fieldRead253_13(receiver);
    }
    forwardValue253_43_0 = forwardValue253_41_0;
    forwardValue253_43_1 = forwardValue253_41_1;
    forwardValue253_43_2 = forwardValue253_41_2;
    forwardValue253_43_3 = forwardValue253_41_3;
    forwardValue253_43_4 = __call253_15(__call253_14(forwardValue253_41_4));
    }
    (forwardValue253_43_2)[forwardValue253_43_3] = forwardValue253_43_4;
    java.lang.Object[] __stackOp253_16_0 = forwardValue253_43_1;
    spill253_8 = __stackOp253_16_0;
    (__stackOp253_16_0)[4] = __call253_18(__fieldRead253_17(receiver));
    java.lang.Object[] __stackOp253_19_0 = spill253_8;
    spill253_9 = __stackOp253_19_0;
    (__stackOp253_19_0)[5] = __call253_21(__fieldRead253_20(receiver));
    java.lang.Object[] __stackOp253_22_0 = spill253_9;
    spill253_10 = __stackOp253_22_0;
    (__stackOp253_22_0)[__invokedynamic253_23(24614, (389668114860238339L ^ life1_3))] = __call253_25(__fieldRead253_24(receiver));
    return __call253_26(forwardValue253_43_0, spill253_10);
}
public static void h253_0(moom.Oo p0) throws Throwable {
    throw __call1025300_0(p0);
}
public static void h253_1(moom.Oo p0) throws Throwable {
    throw __call1025301_0(p0);
}
private static native long __fieldRead253_0() throws Throwable;
private static native int __call253_1() throws Throwable;
private static native int __invokedynamic253_2(int a0, long a1) throws Throwable;
private static native java.lang.Class __call253_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call253_5(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call253_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead253_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Integer __call253_10(int a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead253_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead253_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call253_14(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.String __call253_15(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native double __fieldRead253_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Double __call253_18(double a0) throws Throwable;
private static native double __fieldRead253_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Double __call253_21(double a0) throws Throwable;
private static native int __invokedynamic253_23(int a0, long a1) throws Throwable;
private static native double __fieldRead253_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Double __call253_25(double a0) throws Throwable;
private static native java.lang.String __call253_26(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Throwable __call1025300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025301_0(moom.Oo a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_0607e3fe7a8148bbc09c(this, p0); }


public java.lang.String toString() { return __sourceHandlerCall_07bdca2da38cd97fe49a(this); }


public int hashCode() {
return this.as;
}


public boolean B() { return __sourceHandlerCall_5e68c4123104560cecb3(this); }


public boolean C__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).B())) != 0);
}


public boolean D() {
return ((((this.au) ? 1 : 0)) != 0);
}


public boolean F() {
return ((((this.ag) ? 1 : 0)) != 0);
}


protected void i__Void() { __sourceHandlerCall_bd56262e98c7dccbb4e7(this); }


public boolean i__Boolean() { return __sourceHandlerCall_d08eddbe49d4349cd4f4(this); }


public int i() {
return 3;
}


public double b(moom.DT p0) {
return ((moom.DT)(p0)).b(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
}


public void b(int p0, net.minecraft.item.ItemStack p1) {
return;
}


public void b(boolean p0) {
((net.minecraft.entity.Entity)(this)).a(((int)(1)), ((boolean)(p0)));
    return;
}


public boolean b__Boolean(net.minecraft.entity.Entity p0) {
return ((0) != 0);
}


public double b(double p0, double p1, double p2) {
double local7 = (this.n - p0);
    double local9 = (this.o - p1);
    double local11 = (this.p - p2);
    return ((double) moom.Dr.a__Float(((double)((((local7 * local7) + (local9 * local9)) + (local11 * local11))))));
}


public void b__Void(float p0) {
return;
}


public void b(double p0, double p1, double p2, float p3, float p4) { __sourceHandlerCall_552f94f67d4065f060e3(this, p0, p1, p2, p3, p4); }


public void b(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_f34c90c6c594e9fbd74c(this, p0); }


public boolean b__Boolean(net.minecraft.nbt.NBTTagCompound p0) { return __sourceHandlerCall_3fef9cd8cda5aa8179be(this, p0); }


public boolean b__Boolean(double p0, double p1, double p2) {
double local7 = (this.n - p0);
    double local9 = (this.o - p1);
    double local11 = (this.p - p2);
    double local13 = (((local7 * local7) + (local9 * local9)) + (local11 * local11));
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).a(((double)(local13))))) != 0);
}


public moom.DR b(float p0) { return __sourceHandlerCall_6d178a1c188536e194cf(this, p0); }


public void b(com.moon.n5 p0) {
this.t = ((double)(((com.moon.n5)(p0)).e()));
    this.u = ((double)(((com.moon.n5)(p0)).f()));
    this.v = ((double)(((com.moon.n5)(p0)).g()));
    return;
}


public moom.DR b__DR() {
return null;
}


public void b(net.minecraft.entity.Entity p0) { __sourceHandlerCall_d47a85f64f1fac2da2cb(this, p0); }


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
return ((0) != 0);
}


public void b__Void(double p0, double p1, double p2) { __sourceHandlerCall_e772adc77320832d3916(this, p0, p1, p2); }


protected void b(float p0, float p1) {
this.w = ((float)((p0 % 0x1.68p8f)));
    this.x = ((float)((p1 % 0x1.68p8f)));
    return;
}


public moom.CA b() {
return this.at;
}


public boolean b__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((0) != 0);
}


public moom.bs b__bs() {
return moom.bs.b(((int)((moom.Dr.b__Int(((double)((((double) ((this.w * 0x1.0p2f) / 0x1.68p8f)) + 0x1.0p-1d)))) & 3))));
}


public void b(int p0) { __sourceHandlerCall_473f5a8a968ab9ab993f(this, p0); }


private static java.lang.Throwable b(java.lang.Throwable p0) {
return p0;
}


public static void b(java.lang.String[] p0) {
aD = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b__ArrayString() {
return net.minecraft.entity.Entity.aD;
}


public void e(net.minecraft.entity.Entity p0) {
((moom.qN)(this.c)).a(((moom.qN)(((net.minecraft.entity.Entity)(p0)).a__qN())));
    return;
}


public float e__Float() {
return (this.H * 0x1.b33334p-1f);
}


public void e(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void e__Void() { __sourceHandlerCall_682273ebf2b76cd259c8(this); }


public double e() {
return (((double) this.H) * 0x1.8p-1d);
}


protected java.lang.String e__String() {
return "game.neutral.swim.splash";
}


public boolean e__Boolean() { return __sourceHandlerCall_01633ae9f9e334c1fa21(this); }


public void e(boolean p0) {
((net.minecraft.entity.Entity)(this)).a(((int)(4)), ((boolean)(p0)));
    return;
}


public void e(int p0) { __sourceHandlerCall_2f4e776a7d92dcd61853(this, p0); }


public void e(double p0, double p1, double p2) {
((net.minecraft.entity.Entity)(this)).c(((double)(p0)), ((double)(p1)), ((double)(p2)), ((float)(this.w)), ((float)(this.x)));
    return;
}


public int e__Int() {
return this.as;
}


public boolean x__Boolean() {
return ((1) != 0);
}


public boolean s__Boolean() { return __sourceHandlerCall_d8166df4e4b3e3b47276(this); }


public void s__Void() { __sourceHandlerCall_69e9bc30f53a3d8d9189(this); }


public void c(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.Entity)(this)).c(((double)(((net.minecraft.entity.Entity)(p0)).n)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(((net.minecraft.entity.Entity)(p0)).p)), ((float)(((net.minecraft.entity.Entity)(p0)).w)), ((float)(((net.minecraft.entity.Entity)(p0)).x)));
    return;
}


public void c(double p0, double p1, double p2) {
this.t += p0;
    this.u += p1;
    this.v += p2;
    this.ad = ((boolean)(true));
    return;
}


public float c() {
return 0x1.99999ap-4f;
}


protected boolean c__Boolean(double p0, double p1, double p2) { return __sourceHandlerCall_d6ba6da712fe6ff0ab97(this, p0, p1, p2); }


protected abstract void c(net.minecraft.nbt.NBTTagCompound p0);

public boolean c(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_cb945cfe4b1b49720c73(this, p0); }


public moom.DR c__DR() {
return this.ap;
}


public void c(boolean p0) {
((net.minecraft.entity.Entity)(this)).a(((int)(3)), ((boolean)(p0)));
    return;
}


public void c__Void() {
((net.minecraft.entity.Entity)(this)).f__Void();
    return;
}


protected void c(int p0) { __sourceHandlerCall_09e09ea6f26a8066f3d0(this, p0); }


public void c(double p0, double p1, double p2, float p3, float p4) {
net.minecraft.entity.Entity spill648_0;
    net.minecraft.entity.Entity spill648_1;
    double spill648_2;
    double spill648_3;
    net.minecraft.entity.Entity spill648_4;
    net.minecraft.entity.Entity spill648_5;
    double spill648_6;
    double spill648_7;
    net.minecraft.entity.Entity spill648_8;
    net.minecraft.entity.Entity spill648_9;
    double spill648_10;
    double spill648_11;
    spill648_0 = this;
    spill648_1 = this;
    net.minecraft.entity.Entity __stackOp648_0_0 = this;
    double __stackOp648_0_1 = p0;
    spill648_2 = __stackOp648_0_1;
    ((net.minecraft.entity.Entity)(__stackOp648_0_0)).n = ((double)(__stackOp648_0_1));
    net.minecraft.entity.Entity __stackOp648_2_0 = spill648_1;
    double __stackOp648_2_1 = spill648_2;
    spill648_3 = __stackOp648_2_1;
    ((net.minecraft.entity.Entity)(__stackOp648_2_0)).k = ((double)(__stackOp648_2_1));
    ((net.minecraft.entity.Entity)(spill648_0)).M = ((double)(spill648_3));
    spill648_4 = this;
    spill648_5 = this;
    net.minecraft.entity.Entity __stackOp648_5_0 = this;
    double __stackOp648_5_1 = p1;
    spill648_6 = __stackOp648_5_1;
    ((net.minecraft.entity.Entity)(__stackOp648_5_0)).o = ((double)(__stackOp648_5_1));
    net.minecraft.entity.Entity __stackOp648_7_0 = spill648_5;
    double __stackOp648_7_1 = spill648_6;
    spill648_7 = __stackOp648_7_1;
    ((net.minecraft.entity.Entity)(__stackOp648_7_0)).l = ((double)(__stackOp648_7_1));
    ((net.minecraft.entity.Entity)(spill648_4)).N = ((double)(spill648_7));
    spill648_8 = this;
    spill648_9 = this;
    net.minecraft.entity.Entity __stackOp648_10_0 = this;
    double __stackOp648_10_1 = p2;
    spill648_10 = __stackOp648_10_1;
    ((net.minecraft.entity.Entity)(__stackOp648_10_0)).p = ((double)(__stackOp648_10_1));
    net.minecraft.entity.Entity __stackOp648_12_0 = spill648_9;
    double __stackOp648_12_1 = spill648_10;
    spill648_11 = __stackOp648_12_1;
    ((net.minecraft.entity.Entity)(__stackOp648_12_0)).m = ((double)(__stackOp648_12_1));
    ((net.minecraft.entity.Entity)(spill648_8)).O = ((double)(spill648_11));
    this.w = ((float)(p3));
    this.x = ((float)(p4));
    ((net.minecraft.entity.Entity)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    return;
}


public void c(float p0, float p1) {
float local3_life1 = this.x;
    float local4_life3 = this.w;
    this.w = ((float)(((float) (((double) this.w) + (((double) p0) * 0x1.3333333333333p-3d)))));
    this.x = ((float)(((float) (((double) this.x) - (((double) p1) * 0x1.3333333333333p-3d)))));
    this.x = ((float)(moom.Dr.a(((float)(this.x)), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f)))));
    this.z += (this.x - local3_life1);
    this.y += (this.w - local4_life3);
    return;
}


protected void n__Void() { __sourceHandlerCall_4775a72fabf31d9a69f6(this); }


public boolean n__Boolean() {
return ((0) != 0);
}


public final boolean h__Boolean() {
return ((((this.ak) ? 1 : 0)) != 0);
}


public int h() {
return ((net.minecraft.entity.DataWatcher)(this.al)).a__Short(((int)(1)));
}


public void h__Void() { __sourceHandlerCall_13a46ba700e2466470bb(this); }


public void f(int p0) {
return;
}


public boolean f__Boolean() { return __sourceHandlerCall_bf03ebcf56328e96a1af(this); }


public void f(boolean p0) { __sourceHandlerCall_1b16307e514e9e0cf09f(this, p0); }


protected final java.lang.String f__String() {
return net.minecraft.entity.EntityList.a__String(((net.minecraft.entity.Entity)(this)));
}


public int f() {
return 0;
}


public void f__Void() {
this.F = ((boolean)(true));
    return;
}


public boolean l__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this.i)).a(((moom.CA)(((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).b(((double)(-0x1.99999ap-4d)), ((double)(-0x1.99999ap-2d)), ((double)(-0x1.99999ap-4d))))), ((moom.fn)(moom.fn.i))))) != 0);
}


private void l() {
this.n = ((double)(((((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).b + ((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).e) / 0x1.0p1d)));
    this.o = ((double)(((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).c));
    this.p = ((double)(((((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).d + ((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).g) / 0x1.0p1d)));
    return;
}


protected abstract void d(net.minecraft.nbt.NBTTagCompound p0);

public double d() {
return 0x0.0p0d;
}


protected abstract void d__Void();

public float d__Float() {
return 0x0.0p0f;
}


protected java.lang.String d__String() {
return "game.neutral.swim";
}


public void d(int p0) {
((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(1)), ((java.lang.Object)(java.lang.Short.valueOf(((short)(((short) p0)))))));
    return;
}


public void d(boolean p0) {
((net.minecraft.entity.Entity)(this)).a(((int)(5)), ((boolean)(p0)));
    return;
}


public void d(double p0, double p1, double p2) {
this.t = ((double)(p0));
    this.u = ((double)(p1));
    this.v = ((double)(p2));
    return;
}


public void d(float p0, float p1) { __sourceHandlerCall_c30a8111cc77d0a71326(this, p0, p1); }


public void d(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public void d(net.minecraft.entity.Entity p0) {
net.minecraft.nbt.NBTTagCompound local2 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.entity.Entity)(p0)).a(((net.minecraft.nbt.NBTTagCompound)(local2)));
    ((net.minecraft.entity.Entity)(this)).b(((net.minecraft.nbt.NBTTagCompound)(local2)));
    this.ae = ((int)(((net.minecraft.entity.Entity)(p0)).ae));
    this.ao = ((moom.DT)(((net.minecraft.entity.Entity)(p0)).ao));
    this.ap = ((moom.DR)(((net.minecraft.entity.Entity)(p0)).ap));
    this.aq = ((moom.bs)(((net.minecraft.entity.Entity)(p0)).aq));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CM local1 = new moom.CM(((net.minecraft.entity.Entity)(this)).a__String());
    ((moom.CO)(((moom.CM)(local1)).a__CO())).a(((moom.v3)(((net.minecraft.entity.Entity)(this)).a__v3())));
    ((moom.CO)(((moom.CM)(local1)).a__CO())).a(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.Entity)(this)).a__UUID())).toString())));
    return local1;
}


public void a__Void(float p0) {
return;
}


public java.util.UUID a__UUID() {
return this.ar;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_8dee5353d992344342af(this, p0); }


public void a(java.lang.String p0) {
((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(2)), ((java.lang.Object)(p0)));
    return;
}


public net.minecraft.entity.Entity[] a__Arrayr3() {
return null;
}


public float a(moom.Ei p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p3)).a__ch())).a(((net.minecraft.entity.Entity)(this)));
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) { __sourceHandlerCall_65ce52faaf9ae04a6b53(this, p0, p1); }


public void a__Void(boolean p0) { __sourceHandlerCall_3400df0489785c82a395(this, p0); }


public void a(java.lang.String p0, float p1, float p2) { __sourceHandlerCall_b07455357397c794b1e4(this, p0, p1, p2); }


public boolean a(net.minecraft.util.DamageSource p0) { return __sourceHandlerCall_9ee255a5ab12eb70d69f(this, p0); }


public void a(moom.qZ p0) {
((moom.qZ)(p0)).a(((java.lang.String)("Entity Type")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite1870_0(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Entity ID")), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.as))))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Entity Name")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite1870_5(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Entity's Exact location")), ((java.lang.Object)(java.lang.String.format(((java.lang.String)("%.2f, %.2f, %.2f")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Double.valueOf(((double)(this.n))), java.lang.Double.valueOf(((double)(this.o))), java.lang.Double.valueOf(((double)(this.p)))}))))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Entity's Block location")), ((java.lang.Object)(moom.qZ.a(((double)(((double) moom.Dr.b__Int(((double)(this.n)))))), ((double)(((double) moom.Dr.b__Int(((double)(this.o)))))), ((double)(((double) moom.Dr.b__Int(((double)(this.p))))))))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Entity's Momentum")), ((java.lang.Object)(java.lang.String.format(((java.lang.String)("%.2f, %.2f, %.2f")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Double.valueOf(((double)(this.t))), java.lang.Double.valueOf(((double)(this.u))), java.lang.Double.valueOf(((double)(this.v)))}))))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Entity's Rider")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite1870_31(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Entity's Vehicle")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite1870_33(this))));
    return;
}


protected void a(double p0, boolean p1, net.minecraft.block.Block p2, moom.DT p3) { __sourceHandlerCall_a31e1d7b04c56308289b(this, p0, p1, p2, p3); }


public moom.bs a__bs() {
return this.aq;
}


public boolean a(moom.Ei p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, float p4) {
return ((1) != 0);
}


protected void a__Void(float p0, float p1) { __sourceHandlerCall_66354a12973e14284177(this, p0, p1); }


public boolean a(net.minecraft.entity.player.EntityPlayer p0, moom.DR p1) {
return ((0) != 0);
}


protected void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1) { __sourceHandlerCall_fec2e711d309a72f69ff(this, p0, p1); }


public net.minecraft.entity.Entity a(boolean p0) {
this.ak = ((boolean)(p0));
    return this;
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
return null;
}


public void a__Void(double p0, double p1, double p2) {
this.n = ((double)(p0));
    this.o = ((double)(p1));
    this.p = ((double)(p2));
    float local7 = (this.G / 0x1.0p1f);
    float local8 = this.H;
    ((net.minecraft.entity.Entity)(this)).a(((moom.CA)(new moom.CA((p0 - ((double) local7)), p1, (p2 - ((double) local7)), (p0 + ((double) local7)), (p1 + ((double) local8)), (p2 + ((double) local7))))));
    return;
}


public moom.qN a__qN() {
return this.c;
}


public void a(int p0) {
this.as = ((int)(p0));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16830;
      if (mb[var3] == null) {
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
         long var5 = lb[var3];
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
         Object[] var9 = (Object[])nb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               nb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/r3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         mb[var3] = var15;
      }

      return mb[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.Entity.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11111_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/r3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.entity.DataWatcher a__r1() {
return this.al;
}


public net.minecraft.entity.Entity a(org.lwjgl.util.vector.Vector4f p0) {
this.aA = ((org.lwjgl.util.vector.Vector4f)(p0));
    return this;
}


public org.lwjgl.util.vector.Vector4f a__Vector4f() {
return this.aA;
}


public boolean a(net.minecraft.entity.player.EntityPlayerMP p0) {
return ((1) != 0);
}


public void a(moom.CA p0) {
this.at = ((moom.CA)(p0));
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
return;
}


public boolean a(int p0, java.lang.String p1) {
return ((1) != 0);
}


protected moom.v3 a__v3() { return __sourceHandlerCall_514261564d09ce7f51d6(this); }


public boolean a__Boolean(double p0, double p1, double p2) {
java.lang.Object local7 = ((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).c(((double)(p0)), ((double)(p1)), ((double)(p2)));
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).a__Boolean(((moom.CA)(local7))))) != 0);
}


private boolean a__Boolean(moom.CA p0) { return __sourceHandlerCall_dd62cdb90ff1db856140(this, p0); }


public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
((moom.qN)(this.c)).a(((net.minecraft.command.ICommandSender)(this)), ((net.minecraft.command.CommandResultStats$Type)(p0)), ((int)(p1)));
    return;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public net.minecraft.entity.Entity a__r3() {
return this;
}


public net.minecraft.world.World a__Eu() {
return this.i;
}


public moom.DR a__DR() {
return new moom.DR(this.n, this.o, this.p);
}


public moom.DT a__DT() {
return new moom.DT(this.n, (this.o + 0x1.0p-1d), this.p);
}


protected net.minecraft.nbt.NBTTagList a(double[] p0) { return __sourceHandlerCall_b61485810f2ae0af8826(this, p0); }


protected net.minecraft.nbt.NBTTagList a(float[] p0) { return __sourceHandlerCall_559e45d43f755cb5c664(this, p0); }


public net.minecraft.entity.item.EntityItem a(net.minecraft.item.Item p0, int p1) {
return ((net.minecraft.entity.Entity)(this)).a(((net.minecraft.item.Item)(p0)), ((int)(p1)), ((float)(0x0.0p0f)));
}


public net.minecraft.entity.item.EntityItem a(net.minecraft.item.Item p0, int p1, float p2) {
return ((net.minecraft.entity.Entity)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p0, p1, 0))), ((float)(p2)));
}


public void a(net.minecraft.world.World p0) {
this.i = ((net.minecraft.world.World)(p0));
    return;
}


public void a(moom.DT p0, float p1, float p2) {
((net.minecraft.entity.Entity)(this)).c(((double)((((double) ((moom.DT)(p0)).a()) + 0x1.0p-1d))), ((double)(((double) ((moom.DT)(p0)).b()))), ((double)((((double) ((moom.DT)(p0)).c()) + 0x1.0p-1d))), ((float)(p1)), ((float)(p2)));
    return;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_111e9873fc7673cf35de(this, p0); }


public int a__Int(float p0) { return __sourceHandlerCall_76d1aa7c94e936928b3f(this, p0); }


public void a(float p0, float p1, float p2) { __sourceHandlerCall_cff4f70cc7ef6eebc7be(this, p0, p1, p2); }


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) { __sourceHandlerCall_b8f0e20a51e60d30bf88(this, p0, p1, p2, p3, p4, p5, p6); }


public boolean a(moom.fn p0) { return __sourceHandlerCall_b50a17faeda123527406(this, p0); }


public moom.CA a__CA(net.minecraft.entity.Entity p0) {
return null;
}


public float a(float p0) { return __sourceHandlerCall_eb12ebb4de143ca06e8d(this, p0); }


public net.minecraft.entity.item.EntityItem a(net.minecraft.item.ItemStack p0, float p1) { return __sourceHandlerCall_15c03119ce7e40053427(this, p0, p1); }


public void a(com.moon.n5 p0) {
this.t += ((com.moon.n5)(p0)).e();
    this.u += ((com.moon.n5)(p0)).f();
    this.v += ((com.moon.n5)(p0)).g();
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) { return __sourceHandlerCall_02486c368e10a7256f6b(this, p0, p1); }


public moom.DR a__DR(float p0) { return __sourceHandlerCall_0817a2207a91581f0a33(this, p0); }


protected final moom.DR a(float p0, float p1) {
float local3 = moom.Dr.b(((float)((((-p1) * 0x1.1df46ap-6f) - 0x1.921fb6p1f))));
    float local4 = moom.Dr.a(((float)((((-p1) * 0x1.1df46ap-6f) - 0x1.921fb6p1f))));
    float local5 = (-moom.Dr.b(((float)(((-p0) * 0x1.1df46ap-6f)))));
    float local6 = moom.Dr.a(((float)(((-p0) * 0x1.1df46ap-6f))));
    return new moom.DR(((double) (local4 * local5)), ((double) local6), ((double) (local3 * local5)));
}


public double a(moom.DT p0) {
return ((moom.DT)(p0)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
}


public void a__Void(net.minecraft.entity.Entity p0) { __sourceHandlerCall_0f2ed5bb6f98e79d4643(this, p0); }


public double a(net.minecraft.entity.Entity p0) {
double local2 = (this.n - ((net.minecraft.entity.Entity)(p0)).n);
    double local4 = (this.o - ((net.minecraft.entity.Entity)(p0)).o);
    double local6 = (this.p - ((net.minecraft.entity.Entity)(p0)).p);
    return (((local2 * local2) + (local4 * local4)) + (local6 * local6));
}


public boolean a__Boolean(net.minecraft.nbt.NBTTagCompound p0) { return __sourceHandlerCall_02372f939040c26bbd91(this, p0); }


public boolean a(double p0) { return __sourceHandlerCall_c9758bf377003a51a55e(this, p0); }


public float a__Float(net.minecraft.entity.Entity p0) {
float local2 = ((float) (this.n - ((net.minecraft.entity.Entity)(p0)).n));
    float local3 = ((float) (this.o - ((net.minecraft.entity.Entity)(p0)).o));
    float local4 = ((float) (this.p - ((net.minecraft.entity.Entity)(p0)).p));
    return moom.Dr.c(((float)((((local2 * local2) + (local3 * local3)) + (local4 * local4)))));
}


public void a(net.minecraft.entity.Entity p0, int p1) {
return;
}


public net.minecraft.util.MovingObjectPosition a(double p0, float p1) {
java.lang.Object local4 = ((net.minecraft.entity.Entity)(this)).b(((float)(p1)));
    java.lang.Object local5 = ((net.minecraft.entity.Entity)(this)).a__DR(((float)(p1)));
    java.lang.Object local6 = ((moom.DR)(local4)).b(((double)((((moom.DR)(local5)).a * p0))), ((double)((((moom.DR)(local5)).b * p0))), ((double)((((moom.DR)(local5)).c * p0))));
    return ((net.minecraft.world.World)(this.i)).a(((moom.DR)(local4)), ((moom.DR)(local6)), ((boolean)(false)), ((boolean)(false)), ((boolean)(true)));
}


public double a(double p0, double p1, double p2) {
double local7 = (this.n - p0);
    double local9 = (this.o - p1);
    double local11 = (this.p - p2);
    return (((local7 * local7) + (local9 * local9)) + (local11 * local11));
}


public void a(moom.tu p0) { __sourceHandlerCall_64cacd31dfdc01d8fdfa(this, p0); }


public void a(int p0, boolean p1) { __sourceHandlerCall_605560c55fcc0bb50f6c(this, p0, p1); }


protected boolean a__Boolean(int p0) { return __sourceHandlerCall_56b8eef1b76cfb65e865(this, p0); }


public net.minecraft.item.ItemStack[] a__ArrayxW() {
return null;
}


public void a(byte p0) {
return;
}


public void a__Void(moom.DT p0) { __sourceHandlerCall_f6b0c7487a1747df88d5(this, p0); }


public java.lang.String a__String() { return __sourceHandlerCall_b80bd478c288d7dd4573(this); }


public void a(net.minecraft.entity.EntityLivingBase p0) {
return;
}


public moom.CA a__CA() {
return null;
}


protected void m() { __sourceHandlerCall_0cc5570e786a28f35bf2(this); }


public boolean m__Boolean() {
return ((0) != 0);
}


protected boolean o__Boolean() {
return ((1) != 0);
}


public void o() { __sourceHandlerCall_68680c07c1ad0d44d717(this); }


protected void p() {
long life1_3;
    int life3_7;
    int life4_13;
    int life5_17;
    moom.DT life6_24;
    net.minecraft.block.state.IBlockState life7_29;
    net.minecraft.block.Block life8_32;
    life1_3 = (net.minecraft.entity.Entity.fb ^ 73887614914277L);
    life3_7 = moom.Dr.b__Int(((double)(this.n)));
    life4_13 = moom.Dr.b__Int(((double)((this.o - 0x1.99999ap-3d))));
    life5_17 = moom.Dr.b__Int(((double)(this.p)));
    life6_24 = new moom.DT(life3_7, life4_13, life5_17);
    life7_29 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life6_24)));
    life8_32 = ((net.minecraft.block.state.IBlockState)(life7_29)).a__ch();
    try {
        if ((((net.minecraft.block.Block)(life8_32)).c__Int() != -1)) {
        ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BLOCK_CRACK)), ((double)((this.n + ((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * ((double) this.G))))), ((double)((((moom.CA)(((net.minecraft.entity.Entity)(this)).b())).c + 0x1.999999999999ap-4d))), ((double)((this.p + ((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * ((double) this.G))))), ((double)(((-this.t) * 0x1.0p2d))), ((double)(0x1.8p0d)), ((double)(((-this.v) * 0x1.0p2d))), ((int[])(new int[] {net.minecraft.block.Block.a(((net.minecraft.block.state.IBlockState)(life7_29)))})));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.entity.Entity.b(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public boolean p__Boolean() { return __sourceHandlerCall_729c817dac647ddcfc67(this); }


public boolean k__Boolean() { return __sourceHandlerCall_a63cdb4c5c8c6b5df305(this); }


protected void k__Void() {
((net.minecraft.entity.Entity)(this)).f__Void();
    return;
}


public void t__Void() { __sourceHandlerCall_a97ca3d3dae9371cff4c(this); }


public boolean t__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).a__Boolean(((int)(1))))) != 0);
}


public java.lang.String g__String() {
return ((net.minecraft.entity.DataWatcher)(this.al)).a__String(((int)(2)));
}


public void g(boolean p0) {
this.au = ((boolean)(p0));
    return;
}


public int g() {
long local1 = (net.minecraft.entity.Entity.fb ^ 91499306708051L);
    return __sourceIntrinsic_80d806743da5_originalDynamicSite1872_1(10406, (3644347354505409983L ^ local1));
}


protected boolean g__Boolean() {
return ((1) != 0);
}


public void g__Void() {
((net.minecraft.entity.Entity)(this)).h__Void();
    return;
}


public void v() {
this.ag = ((boolean)(true));
    this.L = ((float)(0x0.0p0f));
    return;
}


public boolean v__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).a__Boolean(((int)(5))))) != 0);
}


public void j() {
this.aw = ((int)(0));
    return;
}


public boolean j__Boolean() {
return ((((this.ai) ? 1 : 0)) != 0);
}


protected void q() {
this.E = ((boolean)(true));
    return;
}


public boolean q__Boolean() { return __sourceHandlerCall_d7f60bee0477ae2cf0d2(this); }


public boolean z() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).r__Boolean())) != 0);
}


public boolean w() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).a__Boolean(((int)(4))))) != 0);
}


public boolean u__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(this)).a__Boolean(((int)(3))))) != 0);
}


public void u() {
return;
}


public void r() {
return;
}


public boolean r__Boolean() { return __sourceHandlerCall_76a037a0a2906dde42bc(this); }


public boolean y() {
return ((0) != 0);
}


public boolean E() {
return ((0) != 0);
}


public boolean A() {
return ((1) != 0);
}


private java.lang.String lambda$addEntityCrashInfo$0() throws java.lang.Exception {
return __sourceIntrinsic_b63c132c15d4_originalDynamicSite1873_3(net.minecraft.entity.EntityList.a__String(((net.minecraft.entity.Entity)(this))), ((java.lang.Class)(((java.lang.Object)(this)).getClass())).getCanonicalName());
}


private java.lang.String lambda$addEntityCrashInfo$2() throws java.lang.Exception {
return ((net.minecraft.entity.Entity)(this.g)).toString();
}


private java.lang.String lambda$addEntityCrashInfo$1() throws java.lang.Exception {
return ((net.minecraft.entity.Entity)(this.f)).toString();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11111_0() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite1870_0(net.minecraft.entity.Entity a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite1870_5(net.minecraft.entity.Entity a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite1870_31(net.minecraft.entity.Entity a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite1870_33(net.minecraft.entity.Entity a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80d806743da5_originalDynamicSite1872_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b63c132c15d4_originalDynamicSite1873_3(java.lang.String a0, java.lang.String a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
