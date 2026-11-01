package moom;

import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class qV implements net.minecraft.command.ICommandSender {

private static java.text.SimpleDateFormat a;

private int b;

private boolean c;

private net.minecraft.util.IChatComponent d;

private java.lang.String e;

private java.lang.String f;

private moom.qN g;

private static int h;

private static long j;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public qV() {
super();
    this.c = true;
    this.d = null;
    this.e = "";
    this.f = "@";
    this.g = new moom.qN();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-4552910839492543475L)), ((long)(-6018062498681231639L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239385599576067L)))));
    int __sourceSpill974_6 = 57;
    n = ((java.util.Map)(new java.util.HashMap(13)));
    moom.qV.b(((int)(__sourceSpill974_6)));
    long local0_life9 = (moom.qV.j ^ 45716769841256L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill974_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill974_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill974_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill974_16 = new byte[8];
    (__sourceSpill974_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill974_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation974_18 = __sourceSpill974_16;
    ((javax.crypto.Cipher)(__sourceSpill974_13)).init(((int)(__sourceSpill974_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill974_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation974_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "(\005\027 \027_íÛY`SÕÔ"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill974_27 = local6_life23;
        int __sourceSpill974_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill974_27)).substring(((int)(__sourceSpill974_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill974_32 = local8_life21;
        int __sourceSpill974_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill974_35 = new byte[8];
        (__sourceSpill974_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill974_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill974_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill974_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill974_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill974_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill974_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill974_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill974_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill974_36)).doFinal(((byte[])(__sourceSpill974_35)));
        (__sourceSpill974_32)[__sourceSpill974_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    l = ((long[])(local8_life21));
    m = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((java.text.SimpleDateFormat)(new java.text.SimpleDateFormat("HH:mm:ss")));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_03b406e0a3878eb31b5f(moom.qV a0, int a1, java.lang.String a2) throws E;
private static final class __SourceHandler_03b406e0a3878eb31b5f {

public static boolean f1153(moom.qV receiver, int p0, java.lang.String p1) throws Throwable {
    int forwardValue1153_12_0;
    int forwardValue1153_14_0;
    int spill1153_0;
    long life3_3;
    int life5_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (__fieldRead1153_0() ^ 6800716540701L);
    life5_5 = __call1153_1();
    spill1153_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue1153_12_0 = spill1153_0;
        break forward_join_12;
    }
    if (!((spill1153_0 <= 2))) {
        break forward_join_13;
    }
    forwardValue1153_12_0 = 1;
    }
    forwardValue1153_14_0 = forwardValue1153_12_0;
    break forward_join_14;
    }
    forwardValue1153_14_0 = 0;
    }
    return __integerCategory1153_2(forwardValue1153_14_0);
}
public static void h1153_0(moom.Oo p0) throws Throwable {
    throw __call1115300_0(p0);
}
public static void h1153_1(moom.Oo p0) throws Throwable {
    throw __call1115301_0(p0);
}
private static native long __fieldRead1153_0() throws Throwable;
private static native int __call1153_1() throws Throwable;
private static native boolean __integerCategory1153_2(int value) throws Throwable;
private static native java.lang.Throwable __call1115300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_eb5dfbab89ba1c8c1388(moom.qV a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_eb5dfbab89ba1c8c1388 {

public static boolean f1154(moom.qV receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int forwardValue1154_17_0;
    int forwardValue1154_24_0;
    boolean spill1154_0;
    long life2_3;
    int life4_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    forward_join_14: {
    life2_3 = (__fieldRead1154_0() ^ 13194681304880L);
    life4_5 = __call1154_1();
    spill1154_0 = __fieldRead1154_3(__fieldRead1154_2(p0));
    if (!((life4_5 == 0))) {
        forwardValue1154_17_0 = __integerCategory1154_4(spill1154_0);
        break forward_join_17;
    }
    if (!((!spill1154_0))) {
        break forward_join_14;
    }
    return __integerCategory1154_5(0);
    }
    forwardValue1154_17_0 = __integerCategory1154_8(__fieldRead1154_7(__call1154_6(p0)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1154_24_0 = forwardValue1154_17_0;
        break forward_join_24;
    }
    if (!((forwardValue1154_17_0 != 0))) {
        break forward_join_23;
    }
    __call1154_9(p0, receiver);
    }
    forwardValue1154_24_0 = 1;
    }
    return __integerCategory1154_10(forwardValue1154_24_0);
}
public static void h1154_0(moom.Oo p0) throws Throwable {
    throw __call1115400_0(p0);
}
public static void h1154_1(moom.Oo p0) throws Throwable {
    throw __call1115401_0(p0);
}
public static void h1154_2(moom.Oo p0) throws Throwable {
    throw __call1115402_0(p0);
}
public static void h1154_3(moom.Oo p0) throws Throwable {
    throw __call1115403_0(p0);
}
private static native long __fieldRead1154_0() throws Throwable;
private static native int __call1154_1() throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1154_2(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __fieldRead1154_3(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory1154_4(boolean value) throws Throwable;
private static native boolean __integerCategory1154_5(int value) throws Throwable;
private static native net.minecraft.world.World __call1154_6(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __fieldRead1154_7(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1154_8(boolean value) throws Throwable;
private static native void __call1154_9(net.minecraft.entity.player.EntityPlayer a0, moom.qV a1) throws Throwable;
private static native boolean __integerCategory1154_10(int value) throws Throwable;
private static native java.lang.Throwable __call1115400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a7f2583cbd1f9ef4a991(moom.qV a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_a7f2583cbd1f9ef4a991 {

public static void f1155(moom.qV receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    moom.qV forwardValue1155_43_0;
    int spill1155_0;
    moom.qV spill1155_1;
    moom.qV spill1155_2;
    long life2_3;
    int life4_25;
    forward_join_43: {
    forward_join_42: {
    life2_3 = (__fieldRead1155_0() ^ 129792989444202L);
    __call1155_2(p0, "Command", __fieldRead1155_1(receiver));
    __call1155_4(p0, "SuccessCount", __fieldRead1155_3(receiver));
    __call1155_6(p0, "CustomName", __fieldRead1155_5(receiver));
    spill1155_0 = __call1155_7();
    __call1155_9(p0, "TrackOutput", __fieldRead1155_8(receiver));
    life4_25 = spill1155_0;
    spill1155_1 = receiver;
    if (!((life4_25 != 0))) {
        forwardValue1155_43_0 = spill1155_1;
        break forward_join_43;
    }
    if (!((__fieldRead1155_10(spill1155_1) != null))) {
        break forward_join_42;
    }
    spill1155_2 = receiver;
    if (!((life4_25 != 0))) {
        forwardValue1155_43_0 = spill1155_2;
        break forward_join_43;
    }
    if (!(__fieldRead1155_11(spill1155_2))) {
        break forward_join_42;
    }
    __call1155_14(p0, "LastOutput", __call1155_13(__fieldRead1155_12(receiver)));
    }
    forwardValue1155_43_0 = receiver;
    }
    __call1155_16(__fieldRead1155_15(forwardValue1155_43_0), p0);
    return;
}
public static void h1155_0(moom.Oo p0) throws Throwable {
    throw __call1115500_0(p0);
}
public static void h1155_1(moom.Oo p0) throws Throwable {
    throw __call1115501_0(p0);
}
public static void h1155_2(moom.Oo p0) throws Throwable {
    throw __call1115502_0(p0);
}
public static void h1155_3(moom.Oo p0) throws Throwable {
    throw __call1115503_0(p0);
}
private static native long __fieldRead1155_0() throws Throwable;
private static native java.lang.String __fieldRead1155_1(moom.qV a0) throws Throwable;
private static native void __call1155_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __fieldRead1155_3(moom.qV a0) throws Throwable;
private static native void __call1155_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __fieldRead1155_5(moom.qV a0) throws Throwable;
private static native void __call1155_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __call1155_7() throws Throwable;
private static native boolean __fieldRead1155_8(moom.qV a0) throws Throwable;
private static native void __call1155_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native net.minecraft.util.IChatComponent __fieldRead1155_10(moom.qV a0) throws Throwable;
private static native boolean __fieldRead1155_11(moom.qV a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __fieldRead1155_12(moom.qV a0) throws Throwable;
private static native java.lang.String __call1155_13(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __call1155_14(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native moom.qN __fieldRead1155_15(moom.qV a0) throws Throwable;
private static native void __call1155_16(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Throwable __call1115500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_33f3174567ad4102e082(moom.qV a0, net.minecraft.util.IChatComponent a1) throws E;
private static final class __SourceHandler_33f3174567ad4102e082 {

public static void f1156(moom.qV receiver, net.minecraft.util.IChatComponent p0) throws Throwable {
    moom.qV forwardValue1156_12_0;
    net.minecraft.world.World forwardValue1156_20_0;
    moom.qV forwardValue1156_36_0;
    moom.qV spill1156_0;
    net.minecraft.world.World spill1156_1;
    moom.qV spill1156_2;
    long life2_3;
    int life4_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_20: {
    forward_join_12: {
    life2_3 = (__fieldRead1156_0() ^ 74658523334018L);
    life4_5 = __call1156_1();
    spill1156_0 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue1156_12_0 = spill1156_0;
        break forward_join_12;
    }
    if (!(__fieldRead1156_2(spill1156_0))) {
        break forward_join_37;
    }
    forwardValue1156_12_0 = receiver;
    }
    spill1156_1 = __call1156_3(forwardValue1156_12_0);
    if (!((life4_5 == 0))) {
        forwardValue1156_20_0 = spill1156_1;
        break forward_join_20;
    }
    if (!((spill1156_1 != null))) {
        break forward_join_37;
    }
    spill1156_2 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue1156_36_0 = spill1156_2;
        break forward_join_36;
    }
    forwardValue1156_20_0 = __call1156_4(spill1156_2);
    }
    if (!((!__fieldRead1156_5(forwardValue1156_20_0)))) {
        break forward_join_37;
    }
    __fieldWrite1156_10(receiver, __call1156_9(new moom.CM(__invokedynamic1156_8(__call1156_7(__fieldRead1156_6(), new java.util.Date()))), p0));
    forwardValue1156_36_0 = receiver;
    }
    __call1156_11(forwardValue1156_36_0);
    }
    return;
}
public static void h1156_0(moom.Oo p0) throws Throwable {
    throw __call1115600_0(p0);
}
public static void h1156_1(moom.Oo p0) throws Throwable {
    throw __call1115601_0(p0);
}
public static void h1156_2(moom.Oo p0) throws Throwable {
    throw __call1115602_0(p0);
}
public static void h1156_3(moom.Oo p0) throws Throwable {
    throw __call1115603_0(p0);
}
public static void h1156_4(moom.Oo p0) throws Throwable {
    throw __call1115604_0(p0);
}
public static void h1156_5(moom.Oo p0) throws Throwable {
    throw __call1115605_0(p0);
}
private static native long __fieldRead1156_0() throws Throwable;
private static native int __call1156_1() throws Throwable;
private static native boolean __fieldRead1156_2(moom.qV a0) throws Throwable;
private static native net.minecraft.world.World __call1156_3(moom.qV a0) throws Throwable;
private static native net.minecraft.world.World __call1156_4(moom.qV a0) throws Throwable;
private static native boolean __fieldRead1156_5(net.minecraft.world.World a0) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead1156_6() throws Throwable;
private static native java.lang.String __call1156_7(java.text.SimpleDateFormat a0, java.util.Date a1) throws Throwable;
private static native java.lang.String __invokedynamic1156_8(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1156_9(moom.CM a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native void __fieldWrite1156_10(moom.qV a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native void __call1156_11(moom.qV a0) throws Throwable;
private static native java.lang.Throwable __call1115600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115605_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_68b935c8d71c9aec44f4(moom.qV a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_68b935c8d71c9aec44f4 {

public static void f426(moom.qV receiver, net.minecraft.world.World p0) throws Throwable {
    moom.Bl forwardValue426_19_0;
    int forwardValue426_27_0;
    moom.Bl forwardValue426_29_0;
    moom.Bl spill426_0;
    boolean spill426_1;
    moom.Bl spill426_2;
    long life2_3;
    int life4_5;
    moom.Bl life5_16;
    net.minecraft.command.ICommandManager life6_45;
    forward_join_46: {
    forward_join_43: {
    forward_join_29: {
    forward_join_27: {
    forward_join_19: {
    forward_join_12: {
    life2_3 = (__fieldRead426_0() ^ 103976657419979L);
    life4_5 = __call426_1();
    if (!(__fieldRead426_2(p0))) {
        break forward_join_12;
    }
    __fieldWrite426_3(receiver, 0);
    }
    life5_16 = __call426_4();
    spill426_0 = life5_16;
    if (!((life4_5 == 0))) {
        forwardValue426_19_0 = spill426_0;
        break forward_join_19;
    }
    if (!((spill426_0 != null))) {
        break forward_join_43;
    }
    forwardValue426_19_0 = life5_16;
    }
    spill426_1 = __call426_5(forwardValue426_19_0);
    if (!((life4_5 == 0))) {
        forwardValue426_27_0 = __integerCategory426_6(spill426_1);
        break forward_join_27;
    }
    if (!(spill426_1)) {
        break forward_join_43;
    }
    spill426_2 = life5_16;
    if (!((life4_5 == 0))) {
        forwardValue426_29_0 = spill426_2;
        break forward_join_29;
    }
    forwardValue426_27_0 = __integerCategory426_8(__call426_7(spill426_2));
    }
    if (!((forwardValue426_27_0 != 0))) {
        break forward_join_43;
    }
    forwardValue426_29_0 = life5_16;
    }
    life6_45 = __call426_9(forwardValue426_29_0);
    __fieldWrite426_10(receiver, null);
    __fieldWrite426_13(receiver, __call426_12(life6_45, receiver, __fieldRead426_11(receiver)));
    if (!((life4_5 != 0))) {
        break forward_join_46;
    }
    }
    __fieldWrite426_14(receiver, 0);
    }
    return;
}
public static void h426_0(java.lang.Throwable p0) throws Throwable {
    throw __call2042600_0(p0);
}
public static void h426_1(java.lang.Throwable p0) throws Throwable {
    throw __call2042601_0(p0);
}
public static void h426_2(java.lang.Throwable p0) throws Throwable {
    throw __call2042602_0(p0);
}
public static void h426_3(java.lang.Throwable p0) throws Throwable {
    throw __call2042603_0(p0);
}
public static void h426_4(java.lang.Throwable p0) throws Throwable {
    throw __call2042604_0(p0);
}
public static void h426_5(java.lang.Throwable p0, moom.qV p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2042605_0(local2, "Executing command block");
    moom.qZ local4 = __call2042605_1(local3, "Command to be executed");
    __call2042605_3(local4, "Command", __invokedynamic2042605_2(p1));
    __call2042605_5(local4, "Name", __invokedynamic2042605_4(p1));
    throw new moom.Oo(local3);
}
public static void h426_6(java.lang.Throwable p0) throws Throwable {
    throw __call2042606_0(p0);
}
private static native long __fieldRead426_0() throws Throwable;
private static native int __call426_1() throws Throwable;
private static native boolean __fieldRead426_2(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite426_3(moom.qV a0, int a1) throws Throwable;
private static native moom.Bl __call426_4() throws Throwable;
private static native boolean __call426_5(moom.Bl a0) throws Throwable;
private static native int __integerCategory426_6(boolean value) throws Throwable;
private static native boolean __call426_7(moom.Bl a0) throws Throwable;
private static native int __integerCategory426_8(boolean value) throws Throwable;
private static native net.minecraft.command.ICommandManager __call426_9(moom.Bl a0) throws Throwable;
private static native void __fieldWrite426_10(moom.qV a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __fieldRead426_11(moom.qV a0) throws Throwable;
private static native int __call426_12(net.minecraft.command.ICommandManager a0, moom.qV a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite426_13(moom.qV a0, int a1) throws Throwable;
private static native void __fieldWrite426_14(moom.qV a0, int a1) throws Throwable;
private static native java.lang.Throwable __call2042600_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2042601_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2042602_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2042603_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2042604_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2042605_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2042605_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2042605_2(moom.qV a0) throws Throwable;
private static native void __call2042605_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2042605_4(moom.qV a0) throws Throwable;
private static native void __call2042605_5(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Throwable __call2042606_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_dc0e5e045140151f1070(moom.qV a0) throws E;
private static final class __SourceHandler_dc0e5e045140151f1070 {

public static boolean f1157(moom.qV receiver) throws Throwable {
    moom.Bl forwardValue1157_13_0;
    int forwardValue1157_28_0;
    int forwardValue1157_30_0;
    int spill1157_0;
    moom.Bl spill1157_1;
    boolean spill1157_2;
    boolean spill1157_3;
    long life1_3;
    moom.Bl life4_6;
    int life3_7;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_13: {
    life1_3 = (__fieldRead1157_0() ^ 8676155994967L);
    spill1157_0 = __call1157_1();
    life4_6 = __call1157_2();
    life3_7 = spill1157_0;
    spill1157_1 = life4_6;
    if (!((life3_7 != 0))) {
        forwardValue1157_13_0 = spill1157_1;
        break forward_join_13;
    }
    if (!((spill1157_1 != null))) {
        break forward_join_27;
    }
    forwardValue1157_13_0 = life4_6;
    }
    spill1157_2 = __call1157_3(forwardValue1157_13_0);
    if (!((life3_7 != 0))) {
        forwardValue1157_28_0 = __integerCategory1157_4(spill1157_2);
        break forward_join_28;
    }
    if (!(spill1157_2)) {
        break forward_join_27;
    }
    spill1157_3 = __call1157_7(__call1157_6((__fieldRead1157_5(life4_6))[0]), "commandBlockOutput");
    if (!((life3_7 != 0))) {
        forwardValue1157_28_0 = __integerCategory1157_8(spill1157_3);
        break forward_join_28;
    }
    if (!(spill1157_3)) {
        break forward_join_29;
    }
    }
    forwardValue1157_28_0 = 1;
    }
    forwardValue1157_30_0 = forwardValue1157_28_0;
    break forward_join_30;
    }
    forwardValue1157_30_0 = 0;
    }
    return __integerCategory1157_9(forwardValue1157_30_0);
}
public static void h1157_0(moom.Oo p0) throws Throwable {
    throw __call1115700_0(p0);
}
public static void h1157_1(moom.Oo p0) throws Throwable {
    throw __call1115701_0(p0);
}
public static void h1157_2(moom.Oo p0) throws Throwable {
    throw __call1115702_0(p0);
}
public static void h1157_3(moom.Oo p0) throws Throwable {
    throw __call1115703_0(p0);
}
private static native long __fieldRead1157_0() throws Throwable;
private static native int __call1157_1() throws Throwable;
private static native moom.Bl __call1157_2() throws Throwable;
private static native boolean __call1157_3(moom.Bl a0) throws Throwable;
private static native int __integerCategory1157_4(boolean value) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead1157_5(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.GameRules __call1157_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1157_7(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1157_8(boolean value) throws Throwable;
private static native boolean __integerCategory1157_9(int value) throws Throwable;
private static native java.lang.Throwable __call1115700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_551064a549a29e4e2d58(moom.qV a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_551064a549a29e4e2d58 {

public static void f1158(moom.qV receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    int forwardValue1158_36_0;
    int forwardValue1158_52_0;
    int forwardValue1158_59_0;
    moom.qV forwardValue1158_67_0;
    int spill1158_0;
    boolean spill1158_1;
    moom.qV spill1158_2;
    long life2_3;
    int life4_10;
    forward_join_67: {
    forward_join_66: {
    forward_join_59: {
    forward_join_52: {
    forward_join_44: {
    forward_join_36: {
    forward_join_32: {
    life2_3 = (__fieldRead1158_0() ^ 70452822774795L);
    spill1158_0 = __call1158_1();
    __fieldWrite1158_3(receiver, __call1158_2(p0, "Command"));
    life4_10 = spill1158_0;
    __fieldWrite1158_5(receiver, __call1158_4(p0, "SuccessCount"));
    spill1158_1 = __call1158_7(p0, "CustomName", __invokedynamic1158_6(3060, (7625768809340975236L ^ life2_3)));
    if (!((life4_10 == 0))) {
        forwardValue1158_36_0 = __integerCategory1158_8(spill1158_1);
        break forward_join_36;
    }
    if (!(spill1158_1)) {
        break forward_join_32;
    }
    __fieldWrite1158_10(receiver, __call1158_9(p0, "CustomName"));
    }
    forwardValue1158_36_0 = __integerCategory1158_12(__call1158_11(p0, "TrackOutput", 1));
    }
    if (!((life4_10 == 0))) {
        forwardValue1158_52_0 = forwardValue1158_36_0;
        break forward_join_52;
    }
    if (!((forwardValue1158_36_0 != 0))) {
        break forward_join_44;
    }
    __fieldWrite1158_14(receiver, __call1158_13(p0, "TrackOutput"));
    }
    forwardValue1158_52_0 = __integerCategory1158_17(__call1158_16(p0, "LastOutput", __invokedynamic1158_15(23672, (1292557920901394185L ^ life2_3))));
    }
    if (!((life4_10 == 0))) {
        forwardValue1158_59_0 = forwardValue1158_52_0;
        break forward_join_59;
    }
    if (!((forwardValue1158_52_0 != 0))) {
        break forward_join_66;
    }
    spill1158_2 = receiver;
    if (!((life4_10 == 0))) {
        forwardValue1158_67_0 = spill1158_2;
        break forward_join_67;
    }
    forwardValue1158_59_0 = __integerCategory1158_19(__fieldRead1158_18(spill1158_2));
    }
    if (!((forwardValue1158_59_0 != 0))) {
        break forward_join_66;
    }
    __fieldWrite1158_22(receiver, __call1158_21(__call1158_20(p0, "LastOutput")));
    }
    forwardValue1158_67_0 = receiver;
    }
    __call1158_24(__fieldRead1158_23(forwardValue1158_67_0), p0);
    return;
}
public static void h1158_0(moom.Oo p0) throws Throwable {
    throw __call1115800_0(p0);
}
public static void h1158_1(moom.Oo p0) throws Throwable {
    throw __call1115801_0(p0);
}
public static void h1158_2(moom.Oo p0) throws Throwable {
    throw __call1115802_0(p0);
}
public static void h1158_3(moom.Oo p0) throws Throwable {
    throw __call1115803_0(p0);
}
public static void h1158_4(moom.Oo p0) throws Throwable {
    throw __call1115804_0(p0);
}
public static void h1158_5(moom.Oo p0) throws Throwable {
    throw __call1115805_0(p0);
}
public static void h1158_6(moom.Oo p0) throws Throwable {
    throw __call1115806_0(p0);
}
public static void h1158_7(moom.Oo p0) throws Throwable {
    throw __call1115807_0(p0);
}
private static native long __fieldRead1158_0() throws Throwable;
private static native int __call1158_1() throws Throwable;
private static native java.lang.String __call1158_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1158_3(moom.qV a0, java.lang.String a1) throws Throwable;
private static native int __call1158_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1158_5(moom.qV a0, int a1) throws Throwable;
private static native int __invokedynamic1158_6(int a0, long a1) throws Throwable;
private static native boolean __call1158_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1158_8(boolean value) throws Throwable;
private static native java.lang.String __call1158_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1158_10(moom.qV a0, java.lang.String a1) throws Throwable;
private static native boolean __call1158_11(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1158_12(boolean value) throws Throwable;
private static native boolean __call1158_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1158_14(moom.qV a0, boolean a1) throws Throwable;
private static native int __invokedynamic1158_15(int a0, long a1) throws Throwable;
private static native boolean __call1158_16(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1158_17(boolean value) throws Throwable;
private static native boolean __fieldRead1158_18(moom.qV a0) throws Throwable;
private static native int __integerCategory1158_19(boolean value) throws Throwable;
private static native java.lang.String __call1158_20(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1158_21(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1158_22(moom.qV a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native moom.qN __fieldRead1158_23(moom.qV a0) throws Throwable;
private static native void __call1158_24(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Throwable __call1115800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1115807_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_f80100fdde2271377d03() throws E;
private static final class __SourceHandler_f80100fdde2271377d03 {

public static int f1994() throws Throwable {
    int life0_1;
    life0_1 = __call1994_0();
    if ((life0_1 == 0)) {
        return 8;
    }
    return 0;
}
public static void h1994_0(moom.Oo p0) throws Throwable {
    throw __call1199400_0(p0);
}
private static native int __call1994_0() throws Throwable;
private static native java.lang.Throwable __call1199400_0(moom.Oo a0) throws Throwable;

}


public static void b(int p0) {
h = ((int)(p0));
    return;
}


public void b(net.minecraft.util.IChatComponent p0) {
this.d = ((net.minecraft.util.IChatComponent)(p0));
    return;
}


public java.lang.String b__String() {
return this.e;
}


public void b(java.lang.String p0) {
this.f = ((java.lang.String)(p0));
    return;
}


public boolean b__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public abstract int b();

public void b(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_551064a549a29e4e2d58(this, p0); }


public net.minecraft.util.IChatComponent b__C5() {
return this.d;
}


public static int c() {
return moom.qV.h;
}


public static int d() { return __sourceHandlerCall_f80100fdde2271377d03(); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8793_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0) {
this.c = ((boolean)(p0));
    return;
}


public moom.qN a__qN() {
return this.g;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_eb5dfbab89ba1c8c1388(this, p0); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28533;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/qV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
return this.f;
}


public void a(net.minecraft.world.World p0) { __sourceHandlerCall_68b935c8d71c9aec44f4(this, p0); }


public void a(java.lang.String p0) {
this.e = ((java.lang.String)(p0));
    this.b = ((int)(0));
    return;
}


public boolean a(int p0, java.lang.String p1) { return __sourceHandlerCall_03b406e0a3878eb31b5f(this, p0, p1); }


public void a(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_a7f2583cbd1f9ef4a991(this, p0); }


public int a() {
return this.b;
}


public abstract void a(ByteBuf p0);

public abstract void a__Void();

public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
((moom.qN)(this.g)).a(((net.minecraft.command.ICommandSender)(this)), ((net.minecraft.command.CommandResultStats$Type)(p0)), ((int)(p1)));
    return;
}


public boolean a__Boolean() { return __sourceHandlerCall_dc0e5e045140151f1070(this); }


public void a(net.minecraft.util.IChatComponent p0) { __sourceHandlerCall_33f3174567ad4102e082(this, p0); }


public net.minecraft.util.IChatComponent a__C5() {
return new moom.CM(((moom.qV)(this)).a__String());
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8793_0() throws E;
}
