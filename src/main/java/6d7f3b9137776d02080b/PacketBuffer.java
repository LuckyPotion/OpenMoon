package net.minecraft.network;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class PacketBuffer extends io.netty.buffer.ByteBuf {

private io.netty.buffer.ByteBuf a;

private static java.lang.String b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private static long[] g;

private static java.lang.Long[] h;

private static java.util.Map i;

public PacketBuffer(io.netty.buffer.ByteBuf p0) {
super();
    this.a = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(187769454442275192L)), ((long)(-7256772597582068472L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94036768398478L)))));
    java.lang.Object __sourceSpill1201_6 = null;
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life8 = (net.minecraft.network.PacketBuffer.c ^ 78912632163069L);
    net.minecraft.network.PacketBuffer.b(((java.lang.String)(__sourceSpill1201_6)));
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill1201_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1201_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1201_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1201_16 = new byte[8];
    (__sourceSpill1201_16)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill1201_16)[local14_life17] = ((byte) ((int) ((local11_life8 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation1201_18 = __sourceSpill1201_16;
    ((javax.crypto.Cipher)(__sourceSpill1201_13)).init(((int)(__sourceSpill1201_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1201_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1201_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[10];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "í¦2\027Â§FµXê©Üé Ý\000\f(®ÎÆ\r(]D+Øf\n`\000\002£CsPô/õ&\rÐLÆ;^#Ã1¡C²¾\177#è[F"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1201_27 = local17_life23;
        int __sourceSpill1201_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1201_27)).substring(((int)(__sourceSpill1201_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1201_32 = local19_life21;
        int __sourceSpill1201_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill1201_35 = new byte[8];
        (__sourceSpill1201_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill1201_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill1201_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill1201_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill1201_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill1201_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill1201_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill1201_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill1201_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill1201_36)).doFinal(((byte[])(__sourceSpill1201_35)));
        (__sourceSpill1201_32)[__sourceSpill1201_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "çV(éF¢_ü1}¾0rÛ\f"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1201_40 = local17_life23;
        int __sourceSpill1201_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1201_40)).substring(((int)(__sourceSpill1201_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1201_45 = local19_life21;
        int __sourceSpill1201_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill1201_48 = new byte[8];
        (__sourceSpill1201_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill1201_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill1201_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill1201_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill1201_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill1201_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill1201_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill1201_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill1201_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill1201_49)).doFinal(((byte[])(__sourceSpill1201_48)));
        (__sourceSpill1201_45)[__sourceSpill1201_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    d = ((long[])(local19_life21));
    e = ((java.lang.Integer[])(new java.lang.Integer[10]));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill1201_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1201_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1201_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1201_61 = new byte[8];
    (__sourceSpill1201_61)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill1201_61)[local1_life62] = ((byte) ((int) ((local11_life8 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation1201_63 = __sourceSpill1201_61;
    ((javax.crypto.Cipher)(__sourceSpill1201_58)).init(((int)(__sourceSpill1201_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1201_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1201_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[3];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "PwM¬óY\003Í\032í¬WGX\004¥Ü¨I¼H«Ðk"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1201_72 = local4_life68;
        int __sourceSpill1201_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill1201_72)).substring(((int)(__sourceSpill1201_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1201_77 = local6_life66;
        int __sourceSpill1201_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill1201_80 = new byte[8];
        (__sourceSpill1201_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill1201_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill1201_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill1201_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill1201_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill1201_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill1201_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill1201_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill1201_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill1201_81)).doFinal(((byte[])(__sourceSpill1201_80)));
        (__sourceSpill1201_77)[__sourceSpill1201_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    g = ((long[])(local6_life66));
    h = ((java.lang.Long[])(new java.lang.Long[3]));
}

private static native <E extends Throwable> int __sourceHandlerCall_0412447c5212631f6823(net.minecraft.network.PacketBuffer a0) throws E;
private static final class __SourceHandler_0412447c5212631f6823 {

public static int f585(net.minecraft.network.PacketBuffer receiver) throws Throwable {
    java.lang.String spill585_0;
    long life1_3;
    int life4_6;
    int life5_8;
    java.lang.String life3_9;
    int life6_12;
    lexical_join_59: {
    life1_3 = (__fieldRead585_0() ^ 37126003764695L);
    spill585_0 = __call585_1();
    life4_6 = 0;
    life5_8 = 0;
    life3_9 = spill585_0;
    lexical_cycle_10: while (true) {
    lexical_join_57: {
    lexical_join_42: {
    life6_12 = __call585_2(receiver);
    life4_6 = (life4_6 | ((life6_12 & __invokedynamic585_3(5263, (2864420704314321015L ^ life1_3))) << ((life5_8++) * __invokedynamic585_4(31346, (3833840126848632461L ^ life1_3)))));
    if (!((life5_8 > 5))) {
        break lexical_join_42;
    }
    if (!((life3_9 == null))) {
        break lexical_join_57;
    }
    throw new java.lang.RuntimeException("VarInt too big");
    }
    if (!(((life6_12 & __invokedynamic585_5(29516, (3318578485102841791L ^ life1_3))) != __invokedynamic585_6(29516, (3318578485102841791L ^ life1_3))))) {
        break lexical_join_57;
    }
    if (!((life3_9 != null))) {
        break lexical_join_59;
    }
    }
    if (!((life3_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return life4_6;
}
public static int h585_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call2058500_0(p0);
}
public static int h585_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call2058501_0(p0);
}
private static native long __fieldRead585_0() throws Throwable;
private static native java.lang.String __call585_1() throws Throwable;
private static native byte __call585_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __invokedynamic585_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic585_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic585_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic585_6(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call2058500_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call2058501_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_a2a555b61464323a0cdd(int a0) throws E;
private static final class __SourceHandler_a2a555b61464323a0cdd {

public static int f1651(int p0) throws Throwable {
    int lexicalValue1651_28_0;
    int lexicalValue1651_33_0;
    java.lang.String spill1651_0;
    int spill1651_1;
    long life1_3;
    int life4_6;
    java.lang.String life3_7;
    lexical_join_33: {
    lexical_join_32: {
    life1_3 = (__fieldRead1651_0() ^ 54865308648979L);
    spill1651_0 = __call1651_1();
    life4_6 = 1;
    life3_7 = spill1651_0;
    lexical_cycle_8: while (true) {
    lexical_join_29: {
    lexical_join_28: {
    if (!((life4_6 < 5))) {
        break lexical_join_32;
    }
    spill1651_1 = (p0 & (-1 << (life4_6 * __invokedynamic1651_2(31346, (3833857863999827273L ^ life1_3)))));
    if (!((life3_7 == null))) {
        lexicalValue1651_33_0 = spill1651_1;
        break lexical_join_33;
    }
    if (!((life3_7 == null))) {
        lexicalValue1651_28_0 = spill1651_1;
        break lexical_join_28;
    }
    if (!((spill1651_1 == 0))) {
        break lexical_join_29;
    }
    lexicalValue1651_28_0 = life4_6;
    }
    return lexicalValue1651_28_0;
    }
    life4_6 += 1;
    if (!((life3_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue1651_33_0 = 5;
    }
    return lexicalValue1651_33_0;
}
public static void h1651_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165100_0(p0);
}
public static void h1651_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165101_0(p0);
}
private static native long __fieldRead1651_0() throws Throwable;
private static native java.lang.String __call1651_1() throws Throwable;
private static native int __invokedynamic1651_2(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1165100_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165101_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_730610c5946466085dca(net.minecraft.network.PacketBuffer a0, long a1) throws E;
private static final class __SourceHandler_730610c5946466085dca {

public static void f1652(net.minecraft.network.PacketBuffer receiver, long p0) throws Throwable {
    long life3_3;
    java.lang.String life5_5;
    lexical_join_50: {
    lexical_join_45: {
    life3_3 = (__fieldRead1652_0() ^ 18914032280389L);
    life5_5 = __call1652_1();
    lexical_cycle_6: while (true) {
    if (!((__numericCompare1652_3((p0 & __invokedynamic1652_2(3871, (4221075910442218331L ^ life3_3))), 0L) != 0))) {
        break lexical_join_45;
    }
    __call1652_6(receiver, (((int) (p0 & __invokedynamic1652_4(5631, (3507749182696548792L ^ life3_3)))) | __invokedynamic1652_5(29516, (3318525634219065645L ^ life3_3))));
    p0 = (p0 >>> __invokedynamic1652_7(31346, (3833893415743604767L ^ life3_3)));
    if (!((life5_5 == null))) {
        break lexical_join_50;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    __call1652_8(receiver, ((int) p0));
    }
    return;
}
public static void h1652_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165200_0(p0);
}
private static native long __fieldRead1652_0() throws Throwable;
private static native java.lang.String __call1652_1() throws Throwable;
private static native long __invokedynamic1652_2(int a0, long a1) throws Throwable;
private static native int __numericCompare1652_3(long a0, long a1) throws Throwable;
private static native long __invokedynamic1652_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1652_5(int a0, long a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1652_6(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __invokedynamic1652_7(int a0, long a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1652_8(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1165200_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.network.PacketBuffer __sourceHandlerCall_0f2a798b97690a06bcc3(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws E;
private static final class __SourceHandler_0f2a798b97690a06bcc3 {

public static net.minecraft.network.PacketBuffer f2962(net.minecraft.network.PacketBuffer receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    byte[] life5_8;
    java.lang.String life4_9;
    life2_3 = (__fieldRead2962_0() ^ 91879335781173L);
    java.lang.String spill2962_0 = __call2962_1();
    life5_8 = __call2962_3(p0, __fieldRead2962_2());
    life4_9 = spill2962_0;
    if ((life4_9 == null)) {
        if (((life5_8).length > __invokedynamic2962_4(12802, (1569838615616258078L ^ life2_3)))) {
        throw new io.netty.handler.codec.EncoderException(__invokedynamic2962_6(__call2962_5(p0)));
    }
        __call2962_7(receiver, (life5_8).length);
        __call2962_8(receiver, life5_8);
    }
    return receiver;
}
public static void h2962_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1296200_0(p0);
}
public static void h2962_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1296201_0(p0);
}
private static native long __fieldRead2962_0() throws Throwable;
private static native java.lang.String __call2962_1() throws Throwable;
private static native java.nio.charset.Charset __fieldRead2962_2() throws Throwable;
private static native byte[] __call2962_3(java.lang.String a0, java.nio.charset.Charset a1) throws Throwable;
private static native int __invokedynamic2962_4(int a0, long a1) throws Throwable;
private static native int __call2962_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic2962_6(int a0) throws Throwable;
private static native void __call2962_7(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2962_8(net.minecraft.network.PacketBuffer a0, byte[] a1) throws Throwable;
private static native java.lang.Exception __call1296200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1296201_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9c8396c7264c5a771b2b(net.minecraft.network.PacketBuffer a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_9c8396c7264c5a771b2b {

public static void f1653(net.minecraft.network.PacketBuffer receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    net.minecraft.item.ItemStack forwardValue1653_47_0;
    net.minecraft.item.ItemStack spill1653_0;
    net.minecraft.item.ItemStack spill1653_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTTagCompound life5_42;
    forward_join_52: {
    forward_join_49: {
    forward_join_47: {
    forward_join_46: {
    forward_join_32: {
    forward_join_16: {
    life2_3 = (__fieldRead1653_0() ^ 15974381066636L);
    life4_5 = __call1653_1();
    if (!((life4_5 == null))) {
        break forward_join_32;
    }
    if (!((p0 == null))) {
        break forward_join_16;
    }
    __call1653_2(receiver, -1);
    if (!((life4_5 != null))) {
        break forward_join_52;
    }
    }
    __call1653_5(receiver, __call1653_4(__call1653_3(p0)));
    __call1653_7(receiver, __fieldRead1653_6(p0));
    __call1653_9(receiver, __call1653_8(p0));
    }
    life5_42 = null;
    spill1653_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1653_47_0 = spill1653_0;
        break forward_join_47;
    }
    if (!((!__call1653_11(__call1653_10(spill1653_0))))) {
        break forward_join_46;
    }
    spill1653_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue1653_47_0 = spill1653_1;
        break forward_join_47;
    }
    if (!(__call1653_13(__call1653_12(spill1653_1)))) {
        break forward_join_49;
    }
    }
    forwardValue1653_47_0 = p0;
    }
    life5_42 = __call1653_14(forwardValue1653_47_0);
    }
    __call1653_15(receiver, life5_42);
    }
    return;
}
public static void h1653_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165300_0(p0);
}
public static void h1653_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165301_0(p0);
}
public static void h1653_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165302_0(p0);
}
public static void h1653_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165303_0(p0);
}
public static void h1653_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165304_0(p0);
}
public static void h1653_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165305_0(p0);
}
public static void h1653_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165306_0(p0);
}
private static native long __fieldRead1653_0() throws Throwable;
private static native java.lang.String __call1653_1() throws Throwable;
private static native io.netty.buffer.ByteBuf __call1653_2(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call1653_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1653_4(net.minecraft.item.Item a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1653_5(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1653_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1653_7(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __call1653_8(net.minecraft.item.ItemStack a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1653_9(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call1653_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call1653_11(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call1653_12(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call1653_13(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1653_14(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call1653_15(net.minecraft.network.PacketBuffer a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Exception __call1165300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165302_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165303_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165304_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165305_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165306_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f9274d8b15a9c561ef78(net.minecraft.network.PacketBuffer a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_f9274d8b15a9c561ef78 {

public static void f613(net.minecraft.network.PacketBuffer receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forwardValue613_17_0;
    net.minecraft.nbt.NBTTagCompound spill613_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (__fieldRead613_0() ^ 70198108618861L);
    life4_5 = __call613_1();
    spill613_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue613_17_0 = spill613_0;
        break forward_join_17;
    }
    if (!((spill613_0 == null))) {
        break forward_join_16;
    }
    __call613_2(receiver, 0);
    if (!((life4_5 != null))) {
        break forward_join_22;
    }
    }
    forwardValue613_17_0 = p0;
    }
    __call613_3(forwardValue613_17_0, new io.netty.buffer.ByteBufOutputStream(receiver));
    }
    return;
}
public static void h613_0(java.io.IOException p0) throws Throwable {
    throw __call2061300_0(p0);
}
public static void h613_1(java.io.IOException p0) throws Throwable {
    throw __call2061301_0(p0);
}
public static void h613_2(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    throw new io.netty.handler.codec.EncoderException(local1);
}
private static native long __fieldRead613_0() throws Throwable;
private static native java.lang.String __call613_1() throws Throwable;
private static native io.netty.buffer.ByteBuf __call613_2(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __call613_3(net.minecraft.nbt.NBTTagCompound a0, io.netty.buffer.ByteBufOutputStream a1) throws Throwable;
private static native java.lang.Exception __call2061300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2061301_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> long __sourceHandlerCall_40b894836ef752feb803(net.minecraft.network.PacketBuffer a0) throws E;
private static final class __SourceHandler_40b894836ef752feb803 {

public static long f586(net.minecraft.network.PacketBuffer receiver) throws Throwable {
    java.lang.String spill586_0;
    long life1_3;
    long life4_6;
    java.lang.String life3_7;
    int life6_9;
    int life7_12;
    lexical_join_64: {
    life1_3 = (__fieldRead586_0() ^ 92431418450565L);
    spill586_0 = __call586_1();
    life4_6 = 0L;
    life3_7 = spill586_0;
    life6_9 = 0;
    lexical_cycle_10: while (true) {
    lexical_join_62: {
    lexical_join_47: {
    life7_12 = __call586_2(receiver);
    life4_6 = (life4_6 | (((long) (life7_12 & __invokedynamic586_3(5263, (2864292251515037477L ^ life1_3)))) << ((life6_9++) * __invokedynamic586_4(31346, (3833966932595001823L ^ life1_3)))));
    if (!((life6_9 > __invokedynamic586_5(4840, (3731666852821246273L ^ life1_3))))) {
        break lexical_join_47;
    }
    if (!((life3_7 == null))) {
        break lexical_join_62;
    }
    throw new java.lang.RuntimeException("VarLong too big");
    }
    if (!(((life7_12 & __invokedynamic586_6(29516, (3318449617973526765L ^ life1_3))) != __invokedynamic586_7(29516, (3318449617973526765L ^ life1_3))))) {
        break lexical_join_62;
    }
    if (!((life3_7 != null))) {
        break lexical_join_64;
    }
    }
    if (!((life3_7 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return life4_6;
}
public static long h586_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call2058600_0(p0);
}
public static long h586_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call2058601_0(p0);
}
private static native long __fieldRead586_0() throws Throwable;
private static native java.lang.String __call586_1() throws Throwable;
private static native byte __call586_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __invokedynamic586_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic586_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic586_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic586_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic586_7(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call2058600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call2058601_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_41ef0ed8b1bd75dfe0b9(net.minecraft.network.PacketBuffer a0, int a1) throws E;
private static final class __SourceHandler_41ef0ed8b1bd75dfe0b9 {

public static java.lang.String f1654(net.minecraft.network.PacketBuffer receiver, int p0) throws Throwable {
    int forwardValue1654_26_0;
    int forwardValue1654_35_0;
    java.lang.String forwardValue1654_61_0;
    java.lang.String spill1654_0;
    int spill1654_1;
    java.lang.String spill1654_2;
    long life2_3;
    int life5_7;
    java.lang.String life4_8;
    byte[] life6_46;
    java.lang.String life7_56;
    forward_join_61: {
    forward_join_60: {
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    forward_join_25: {
    life2_3 = (__fieldRead1654_0() ^ 1796678186112L);
    spill1654_0 = __call1654_1();
    life5_7 = __call1654_2(receiver);
    life4_8 = spill1654_0;
    spill1654_1 = life5_7;
    if (!((life4_8 == null))) {
        forwardValue1654_26_0 = spill1654_1;
        break forward_join_26;
    }
    if (!((spill1654_1 > (p0 * 4)))) {
        break forward_join_25;
    }
    throw new io.netty.handler.codec.DecoderException(__invokedynamic1654_3(life5_7, (p0 * 4)));
    }
    forwardValue1654_26_0 = life5_7;
    }
    if (!((life4_8 == null))) {
        forwardValue1654_35_0 = forwardValue1654_26_0;
        break forward_join_35;
    }
    if (!((forwardValue1654_26_0 < 0))) {
        break forward_join_34;
    }
    throw new io.netty.handler.codec.DecoderException("The received encoded string buffer length is less than zero! Weird string!");
    }
    forwardValue1654_35_0 = life5_7;
    }
    life6_46 = new byte[forwardValue1654_35_0];
    __call1654_4(receiver, life6_46);
    life7_56 = new java.lang.String(life6_46, __fieldRead1654_5());
    spill1654_2 = life7_56;
    if (!((life4_8 == null))) {
        forwardValue1654_61_0 = spill1654_2;
        break forward_join_61;
    }
    if (!((__call1654_6(spill1654_2) > p0))) {
        break forward_join_60;
    }
    throw new io.netty.handler.codec.DecoderException(__invokedynamic1654_7(life5_7, p0));
    }
    forwardValue1654_61_0 = life7_56;
    }
    return forwardValue1654_61_0;
}
public static void h1654_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165400_0(p0);
}
public static void h1654_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165401_0(p0);
}
public static void h1654_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165402_0(p0);
}
public static void h1654_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165403_0(p0);
}
public static void h1654_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165404_0(p0);
}
public static void h1654_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165405_0(p0);
}
private static native long __fieldRead1654_0() throws Throwable;
private static native java.lang.String __call1654_1() throws Throwable;
private static native int __call1654_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __invokedynamic1654_3(int a0, int a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1654_4(net.minecraft.network.PacketBuffer a0, byte[] a1) throws Throwable;
private static native java.nio.charset.Charset __fieldRead1654_5() throws Throwable;
private static native int __call1654_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic1654_7(int a0, int a1) throws Throwable;
private static native java.lang.Exception __call1165400_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165401_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165402_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165403_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165404_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1165405_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ab963e10e21db4c9043d(net.minecraft.network.PacketBuffer a0, int a1) throws E;
private static final class __SourceHandler_ab963e10e21db4c9043d {

public static void f1655(net.minecraft.network.PacketBuffer receiver, int p0) throws Throwable {
    long life2_3;
    java.lang.String life4_5;
    lexical_join_46: {
    lexical_join_42: {
    life2_3 = (__fieldRead1655_0() ^ 64763404766704L);
    life4_5 = __call1655_1();
    lexical_cycle_6: while (true) {
    if (!(((p0 & __invokedynamic1655_2(986, (1366087745824333569L ^ life2_3))) != 0))) {
        break lexical_join_42;
    }
    __call1655_5(receiver, ((p0 & __invokedynamic1655_3(2576, (2775074888293127885L ^ life2_3))) | __invokedynamic1655_4(32713, (7274046829152887580L ^ life2_3))));
    p0 = (p0 >>> __invokedynamic1655_6(29999, (5533855967721253365L ^ life2_3)));
    if (!((life4_5 == null))) {
        break lexical_join_46;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    __call1655_7(receiver, p0);
    }
    return;
}
public static void h1655_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1165500_0(p0);
}
private static native long __fieldRead1655_0() throws Throwable;
private static native java.lang.String __call1655_1() throws Throwable;
private static native int __invokedynamic1655_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1655_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1655_4(int a0, long a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1655_5(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __invokedynamic1655_6(int a0, long a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1655_7(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1165500_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_6c56a1f6be597b3d4cc2(net.minecraft.network.PacketBuffer a0) throws E;
private static final class __SourceHandler_6c56a1f6be597b3d4cc2 {

public static net.minecraft.item.ItemStack f1656(net.minecraft.network.PacketBuffer receiver) throws Throwable {
    int forwardValue1656_17_0;
    java.lang.String spill1656_0;
    int spill1656_1;
    long life1_3;
    net.minecraft.item.ItemStack life4_6;
    java.lang.String life3_7;
    int life5_10;
    int life6_23;
    int life7_26;
    forward_join_33: {
    forward_join_17: {
    life1_3 = (__fieldRead1656_0() ^ 129052527498709L);
    spill1656_0 = __call1656_1();
    life4_6 = null;
    life3_7 = spill1656_0;
    life5_10 = __call1656_2(receiver);
    spill1656_1 = life5_10;
    if (!((life3_7 == null))) {
        forwardValue1656_17_0 = spill1656_1;
        break forward_join_17;
    }
    if (!((spill1656_1 >= 0))) {
        break forward_join_33;
    }
    forwardValue1656_17_0 = __integerCategory1656_4(__call1656_3(receiver));
    }
    life6_23 = forwardValue1656_17_0;
    life7_26 = __call1656_5(receiver);
    life4_6 = new net.minecraft.item.ItemStack(__call1656_6(life5_10), life6_23, life7_26);
    __call1656_8(life4_6, __call1656_7(receiver));
    }
    return life4_6;
}
public static void h1656_0(java.io.IOException p0) throws Throwable {
    throw __call1165600_0(p0);
}
public static void h1656_1(java.io.IOException p0) throws Throwable {
    throw __call1165601_0(p0);
}
private static native long __fieldRead1656_0() throws Throwable;
private static native java.lang.String __call1656_1() throws Throwable;
private static native short __call1656_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native byte __call1656_3(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory1656_4(byte value) throws Throwable;
private static native short __call1656_5(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.Item __call1656_6(int a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1656_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __call1656_8(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Exception __call1165600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1165601_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_c2ffdcb701bd541f6c4d(net.minecraft.network.PacketBuffer a0) throws E;
private static final class __SourceHandler_c2ffdcb701bd541f6c4d {

public static net.minecraft.nbt.NBTTagCompound f2969(net.minecraft.network.PacketBuffer receiver) throws Throwable {
    long life1_3;
    int life4_7;
    java.lang.String life3_8;
    int life5_11;
    life1_3 = (__fieldRead2969_0() ^ 61644539090048L);
    java.lang.String spill2969_0 = __call2969_1();
    life4_7 = __call2969_2(receiver);
    life3_8 = spill2969_0;
    life5_11 = __call2969_3(receiver);
    if ((life3_8 == null)) {
        if ((life5_11 == 0)) {
        return null;
    }
        __call2969_4(receiver, life4_7);
    }
    return __call2969_6(new io.netty.buffer.ByteBufInputStream(receiver), new moom.yB(__invokedynamic2969_5(7430, (3870825946242766470L ^ life1_3))));
}
public static void h2969_0(java.io.IOException p0) throws Throwable {
    throw __call1296900_0(p0);
}
public static void h2969_1(java.io.IOException p0) throws Throwable {
    throw __call1296901_0(p0);
}
private static native long __fieldRead2969_0() throws Throwable;
private static native java.lang.String __call2969_1() throws Throwable;
private static native int __call2969_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native byte __call2969_3(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2969_4(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native long __invokedynamic2969_5(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call2969_6(io.netty.buffer.ByteBufInputStream a0, moom.yB a1) throws Throwable;
private static native java.lang.Exception __call1296900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1296901_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).equals(((java.lang.Object)(p0))))) != 0);
}


public java.lang.String toString(int p0, int p1, java.nio.charset.Charset p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).toString(((int)(p0)), ((int)(p1)), ((java.nio.charset.Charset)(p2)));
}


public java.lang.String toString(java.nio.charset.Charset p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).toString(((java.nio.charset.Charset)(p0)));
}


public java.lang.String toString() {
return ((io.netty.buffer.ByteBuf)(this.a)).toString();
}


public int hashCode() {
return ((io.netty.buffer.ByteBuf)(this.a)).hashCode();
}


public int compareTo(io.netty.buffer.ByteBuf p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).compareTo(((io.netty.buffer.ByteBuf)(p0)));
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((net.minecraft.network.PacketBuffer)(this)).compareTo(((io.netty.buffer.ByteBuf)(((io.netty.buffer.ByteBuf)(p0)))));
}


public int indexOf(int p0, int p1, byte p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).indexOf(((int)(p0)), ((int)(p1)), ((byte)(p2)));
}


public boolean getBoolean(int p0) {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).getBoolean(((int)(p0))))) != 0);
}


public byte getByte(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getByte(((int)(p0)));
}


public short getShort(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getShort(((int)(p0)));
}


public char getChar(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getChar(((int)(p0)));
}


public int getInt(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getInt(((int)(p0)));
}


public long getLong(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getLong(((int)(p0)));
}


public float getFloat(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getFloat(((int)(p0)));
}


public double getDouble(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getDouble(((int)(p0)));
}


public io.netty.buffer.ByteBuf clear() {
return ((io.netty.buffer.ByteBuf)(this.a)).clear();
}


public io.netty.buffer.ByteBuf getBytes(int p0, java.nio.ByteBuffer p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((java.nio.ByteBuffer)(p1)));
}


public io.netty.buffer.ByteBuf getBytes(int p0, java.io.OutputStream p1, int p2) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((java.io.OutputStream)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf getBytes(int p0, io.netty.buffer.ByteBuf p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((io.netty.buffer.ByteBuf)(p1)));
}


public int getBytes(int p0, java.nio.channels.FileChannel p1, long p2, int p3) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((java.nio.channels.FileChannel)(p1)), ((long)(p2)), ((int)(p3)));
}


public int getBytes(int p0, java.nio.channels.GatheringByteChannel p1, int p2) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((java.nio.channels.GatheringByteChannel)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf getBytes(int p0, byte[] p1, int p2, int p3) {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((byte[])(p1)), ((int)(p2)), ((int)(p3)));
}


public io.netty.buffer.ByteBuf getBytes(int p0, byte[] p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((byte[])(p1)));
}


public io.netty.buffer.ByteBuf getBytes(int p0, io.netty.buffer.ByteBuf p1, int p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((io.netty.buffer.ByteBuf)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf getBytes(int p0, io.netty.buffer.ByteBuf p1, int p2, int p3) {
return ((io.netty.buffer.ByteBuf)(this.a)).getBytes(((int)(p0)), ((io.netty.buffer.ByteBuf)(p1)), ((int)(p2)), ((int)(p3)));
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21169);
    if (((net.minecraft.network.PacketBuffer.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.network.PacketBuffer.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.network.PacketBuffer.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.network.PacketBuffer.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/i", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.network.PacketBuffer.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.network.PacketBuffer.h)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.network.PacketBuffer.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static void b(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return net.minecraft.network.PacketBuffer.b;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12077_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(java.lang.Enum<?> p0) {
((net.minecraft.network.PacketBuffer)(this)).a__Void(((int)(((java.lang.Enum)(p0)).ordinal())));
    return;
}


public int a() { return __sourceHandlerCall_0412447c5212631f6823(this); }


public void a(long p0) { __sourceHandlerCall_730610c5946466085dca(this, p0); }


public long a__Long() { return __sourceHandlerCall_40b894836ef752feb803(this); }


public <T extends java.lang.Enum<T>> T a(java.lang.Class<T> p0) {
return ((T)((((java.lang.Enum[])(((java.lang.Class)(p0)).getEnumConstants())))[((net.minecraft.network.PacketBuffer)(this)).a()]));
}


public void a(net.minecraft.util.IChatComponent p0) {
((net.minecraft.network.PacketBuffer)(this)).a(((java.lang.String)(net.minecraft.util.IChatComponent$Serializer.a(((net.minecraft.util.IChatComponent)(p0))))));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
long local1 = (net.minecraft.network.PacketBuffer.c ^ 4562795062651L);
    return net.minecraft.util.IChatComponent$Serializer.a(((java.lang.String)(((net.minecraft.network.PacketBuffer)(this)).a__String(((int)(__sourceIntrinsic_6e581d8d1b3b_originalDynamicSite2032_1(28097, (5786595949719869844L ^ local1))))))));
}


public net.minecraft.item.ItemStack a__xW() throws java.io.IOException { return __sourceHandlerCall_6c56a1f6be597b3d4cc2(this); }


public java.lang.String a__String(int p0) { return __sourceHandlerCall_41ef0ed8b1bd75dfe0b9(this, p0); }


public net.minecraft.network.PacketBuffer a(java.lang.String p0) { return __sourceHandlerCall_0f2a798b97690a06bcc3(this, p0); }


public java.util.UUID a__UUID() {
return new java.util.UUID(((net.minecraft.network.PacketBuffer)(this)).readLong(), ((net.minecraft.network.PacketBuffer)(this)).readLong());
}


public void a(net.minecraft.item.ItemStack p0) { __sourceHandlerCall_9c8396c7264c5a771b2b(this, p0); }


public void a(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_f9274d8b15a9c561ef78(this, p0); }


public void a(java.util.UUID p0) {
((net.minecraft.network.PacketBuffer)(this)).writeLong(((long)(((java.util.UUID)(p0)).getMostSignificantBits())));
    ((net.minecraft.network.PacketBuffer)(this)).writeLong(((long)(((java.util.UUID)(p0)).getLeastSignificantBits())));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.network.PacketBuffer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7324;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/i", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a__Void(int p0) { __sourceHandlerCall_ab963e10e21db4c9043d(this, p0); }


public net.minecraft.nbt.NBTTagCompound a__yw() throws java.io.IOException { return __sourceHandlerCall_c2ffdcb701bd541f6c4d(this); }


public static int a(int p0) { return __sourceHandlerCall_a2a555b61464323a0cdd(p0); }


public void a(byte[] p0) {
((net.minecraft.network.PacketBuffer)(this)).a__Void(((int)((p0).length)));
    ((net.minecraft.network.PacketBuffer)(this)).writeBytes(((byte[])(p0)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12089_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public byte[] a__ArrayByte() {
byte[] local1 = new byte[((net.minecraft.network.PacketBuffer)(this)).a()];
    ((net.minecraft.network.PacketBuffer)(this)).readBytes(((byte[])(local1)));
    return local1;
}


public moom.DT a__DT() {
return moom.DT.a(((long)(((net.minecraft.network.PacketBuffer)(this)).readLong())));
}


public void a(moom.DT p0) {
((net.minecraft.network.PacketBuffer)(this)).writeLong(((long)(((moom.DT)(p0)).a__Long())));
    return;
}


public boolean isDirect() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).isDirect())) != 0);
}


public boolean hasArray() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).hasArray())) != 0);
}


public byte[] array() {
return ((io.netty.buffer.ByteBuf)(this.a)).array();
}


public int arrayOffset() {
return ((io.netty.buffer.ByteBuf)(this.a)).arrayOffset();
}


public io.netty.buffer.ByteBuf writeInt(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeInt(((int)(p0)));
}


public int readInt() {
return ((io.netty.buffer.ByteBuf)(this.a)).readInt();
}


public io.netty.buffer.ByteBuf setBoolean(int p0, boolean p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setBoolean(((int)(p0)), ((boolean)(p1)));
}


public io.netty.buffer.ByteBuf setByte(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setByte(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf setChar(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setChar(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf setShort(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setShort(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf setInt(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setInt(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf setLong(int p0, long p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setLong(((int)(p0)), ((long)(p1)));
}


public io.netty.buffer.ByteBuf setFloat(int p0, float p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setFloat(((int)(p0)), ((float)(p1)));
}


public io.netty.buffer.ByteBuf setDouble(int p0, double p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setDouble(((int)(p0)), ((double)(p1)));
}


public io.netty.buffer.ByteBuf copy(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).copy(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf copy() {
return ((io.netty.buffer.ByteBuf)(this.a)).copy();
}


public io.netty.buffer.ByteBuf unwrap() {
return ((io.netty.buffer.ByteBuf)(this.a)).unwrap();
}


public io.netty.buffer.ByteBuf capacity(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).capacity(((int)(p0)));
}


public int capacity() {
return ((io.netty.buffer.ByteBuf)(this.a)).capacity();
}


public boolean release() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).release())) != 0);
}


public boolean release(int p0) {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).release(((int)(p0))))) != 0);
}


public boolean isReadOnly() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).isReadOnly())) != 0);
}


public io.netty.buffer.ByteBuf slice(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).slice(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf slice() {
return ((io.netty.buffer.ByteBuf)(this.a)).slice();
}


public io.netty.buffer.ByteBuf duplicate() {
return ((io.netty.buffer.ByteBuf)(this.a)).duplicate();
}


public java.nio.ByteOrder order() {
return ((io.netty.buffer.ByteBuf)(this.a)).order();
}


public io.netty.buffer.ByteBuf order(java.nio.ByteOrder p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).order(((java.nio.ByteOrder)(p0)));
}


public io.netty.buffer.ByteBuf readBytes(byte[] p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((byte[])(p0)));
}


public int readBytes(java.nio.channels.GatheringByteChannel p0, int p1) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((java.nio.channels.GatheringByteChannel)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((java.nio.ByteBuffer)(p0)));
}


public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream p0, int p1) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((java.io.OutputStream)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf readBytes(byte[] p0, int p1, int p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((byte[])(p0)), ((int)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf p0, int p1, int p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((io.netty.buffer.ByteBuf)(p0)), ((int)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((io.netty.buffer.ByteBuf)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((io.netty.buffer.ByteBuf)(p0)));
}


public io.netty.buffer.ByteBuf readBytes(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((int)(p0)));
}


public int readBytes(java.nio.channels.FileChannel p0, long p1, int p2) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).readBytes(((java.nio.channels.FileChannel)(p0)), ((long)(p1)), ((int)(p2)));
}


public int writeBytes(java.io.InputStream p0, int p1) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((java.io.InputStream)(p0)), ((int)(p1)));
}


public int writeBytes(java.nio.channels.ScatteringByteChannel p0, int p1) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((java.nio.channels.ScatteringByteChannel)(p0)), ((int)(p1)));
}


public int writeBytes(java.nio.channels.FileChannel p0, long p1, int p2) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((java.nio.channels.FileChannel)(p0)), ((long)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf p0, int p1, int p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((io.netty.buffer.ByteBuf)(p0)), ((int)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((io.netty.buffer.ByteBuf)(p0)));
}


public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((io.netty.buffer.ByteBuf)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf writeBytes(byte[] p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((byte[])(p0)));
}


public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((java.nio.ByteBuffer)(p0)));
}


public io.netty.buffer.ByteBuf writeBytes(byte[] p0, int p1, int p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBytes(((byte[])(p0)), ((int)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf writeChar(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeChar(((int)(p0)));
}


public char readChar() {
return ((io.netty.buffer.ByteBuf)(this.a)).readChar();
}


public io.netty.buffer.ByteBuf writeFloat(float p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeFloat(((float)(p0)));
}


public float readFloat() {
return ((io.netty.buffer.ByteBuf)(this.a)).readFloat();
}


public int readUnsignedShort() {
return ((io.netty.buffer.ByteBuf)(this.a)).readUnsignedShort();
}


public long readLong() {
return ((io.netty.buffer.ByteBuf)(this.a)).readLong();
}


public byte readByte() {
return ((io.netty.buffer.ByteBuf)(this.a)).readByte();
}


public short readShort() {
return ((io.netty.buffer.ByteBuf)(this.a)).readShort();
}


public boolean isReadable(int p0) {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).isReadable(((int)(p0))))) != 0);
}


public boolean isReadable() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).isReadable())) != 0);
}


public boolean isWritable(int p0) {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).isWritable(((int)(p0))))) != 0);
}


public boolean isWritable() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).isWritable())) != 0);
}


public io.netty.buffer.ByteBuf writeBoolean(boolean p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeBoolean(((boolean)(p0)));
}


public io.netty.buffer.ByteBuf writeByte(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeByte(((int)(p0)));
}


public io.netty.buffer.ByteBuf writeShort(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeShort(((int)(p0)));
}


public io.netty.buffer.ByteBuf writeLong(long p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeLong(((long)(p0)));
}


public io.netty.buffer.ByteBuf writeDouble(double p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeDouble(((double)(p0)));
}


public io.netty.buffer.ByteBuf skipBytes(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).skipBytes(((int)(p0)));
}


public boolean readBoolean() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).readBoolean())) != 0);
}


public short readUnsignedByte() {
return ((io.netty.buffer.ByteBuf)(this.a)).readUnsignedByte();
}


public double readDouble() {
return ((io.netty.buffer.ByteBuf)(this.a)).readDouble();
}


public io.netty.buffer.ByteBuf setIndex(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setIndex(((int)(p0)), ((int)(p1)));
}


public long readUnsignedInt() {
return ((io.netty.buffer.ByteBuf)(this.a)).readUnsignedInt();
}


public io.netty.buffer.ByteBuf writerIndex(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writerIndex(((int)(p0)));
}


public int writerIndex() {
return ((io.netty.buffer.ByteBuf)(this.a)).writerIndex();
}


public int writeCharSequence(java.lang.CharSequence p0, java.nio.charset.Charset p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeCharSequence(((java.lang.CharSequence)(p0)), ((java.nio.charset.Charset)(p1)));
}


public io.netty.util.ReferenceCounted touch__ReferenceCounted() {
return ((net.minecraft.network.PacketBuffer)(this)).touch();
}


public io.netty.buffer.ByteBuf touch() {
return ((io.netty.buffer.ByteBuf)(this.a)).touch();
}


public io.netty.util.ReferenceCounted touch__ReferenceCounted(java.lang.Object p0) {
return ((net.minecraft.network.PacketBuffer)(this)).touch(((java.lang.Object)(p0)));
}


public io.netty.buffer.ByteBuf touch(java.lang.Object p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).touch(((java.lang.Object)(p0)));
}


public io.netty.buffer.ByteBuf setZero(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setZero(((int)(p0)), ((int)(p1)));
}


public int maxCapacity() {
return ((io.netty.buffer.ByteBuf)(this.a)).maxCapacity();
}


public int readableBytes() {
return ((io.netty.buffer.ByteBuf)(this.a)).readableBytes();
}


public io.netty.buffer.ByteBuf readerIndex(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).readerIndex(((int)(p0)));
}


public int readerIndex() {
return ((io.netty.buffer.ByteBuf)(this.a)).readerIndex();
}


public int readUnsignedMediumLE() {
return ((io.netty.buffer.ByteBuf)(this.a)).readUnsignedMediumLE();
}


public io.netty.buffer.ByteBuf discardSomeReadBytes() {
return ((io.netty.buffer.ByteBuf)(this.a)).discardSomeReadBytes();
}


public int readUnsignedShortLE() {
return ((io.netty.buffer.ByteBuf)(this.a)).readUnsignedShortLE();
}


public int getUnsignedMediumLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getUnsignedMediumLE(((int)(p0)));
}


public io.netty.buffer.ByteBufAllocator alloc() {
return ((io.netty.buffer.ByteBuf)(this.a)).alloc();
}


public int writableBytes() {
return ((io.netty.buffer.ByteBuf)(this.a)).writableBytes();
}


public io.netty.buffer.ByteBuf markWriterIndex() {
return ((io.netty.buffer.ByteBuf)(this.a)).markWriterIndex();
}


public io.netty.buffer.ByteBuf resetWriterIndex() {
return ((io.netty.buffer.ByteBuf)(this.a)).resetWriterIndex();
}


public io.netty.buffer.ByteBuf discardReadBytes() {
return ((io.netty.buffer.ByteBuf)(this.a)).discardReadBytes();
}


public io.netty.buffer.ByteBuf ensureWritable(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).ensureWritable(((int)(p0)));
}


public int ensureWritable(int p0, boolean p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).ensureWritable(((int)(p0)), ((boolean)(p1)));
}


public io.netty.buffer.ByteBuf resetReaderIndex() {
return ((io.netty.buffer.ByteBuf)(this.a)).resetReaderIndex();
}


public int maxWritableBytes() {
return ((io.netty.buffer.ByteBuf)(this.a)).maxWritableBytes();
}


public io.netty.buffer.ByteBuf markReaderIndex() {
return ((io.netty.buffer.ByteBuf)(this.a)).markReaderIndex();
}


public short getUnsignedByte(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getUnsignedByte(((int)(p0)));
}


public short getShortLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getShortLE(((int)(p0)));
}


public int getUnsignedShort(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getUnsignedShort(((int)(p0)));
}


public io.netty.buffer.ByteBuf asReadOnly() {
return ((io.netty.buffer.ByteBuf)(this.a)).asReadOnly();
}


public int getIntLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getIntLE(((int)(p0)));
}


public io.netty.buffer.ByteBuf setMedium(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setMedium(((int)(p0)), ((int)(p1)));
}


public long getLongLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getLongLE(((int)(p0)));
}


public io.netty.buffer.ByteBuf setMediumLE(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setMediumLE(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf setBytes(int p0, byte[] p1, int p2, int p3) {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((byte[])(p1)), ((int)(p2)), ((int)(p3)));
}


public io.netty.buffer.ByteBuf setBytes(int p0, byte[] p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((byte[])(p1)));
}


public io.netty.buffer.ByteBuf setBytes(int p0, java.nio.ByteBuffer p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((java.nio.ByteBuffer)(p1)));
}


public int setBytes(int p0, java.nio.channels.FileChannel p1, long p2, int p3) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((java.nio.channels.FileChannel)(p1)), ((long)(p2)), ((int)(p3)));
}


public int setBytes(int p0, java.nio.channels.ScatteringByteChannel p1, int p2) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((java.nio.channels.ScatteringByteChannel)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf setBytes(int p0, io.netty.buffer.ByteBuf p1, int p2, int p3) {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((io.netty.buffer.ByteBuf)(p1)), ((int)(p2)), ((int)(p3)));
}


public io.netty.buffer.ByteBuf setBytes(int p0, io.netty.buffer.ByteBuf p1, int p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((io.netty.buffer.ByteBuf)(p1)), ((int)(p2)));
}


public io.netty.buffer.ByteBuf setBytes(int p0, io.netty.buffer.ByteBuf p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((io.netty.buffer.ByteBuf)(p1)));
}


public int setBytes(int p0, java.io.InputStream p1, int p2) throws java.io.IOException {
return ((io.netty.buffer.ByteBuf)(this.a)).setBytes(((int)(p0)), ((java.io.InputStream)(p1)), ((int)(p2)));
}


public int getMediumLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getMediumLE(((int)(p0)));
}


public io.netty.buffer.ByteBuf setLongLE(int p0, long p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setLongLE(((int)(p0)), ((long)(p1)));
}


public long getUnsignedIntLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getUnsignedIntLE(((int)(p0)));
}


public int setCharSequence(int p0, java.lang.CharSequence p1, java.nio.charset.Charset p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).setCharSequence(((int)(p0)), ((java.lang.CharSequence)(p1)), ((java.nio.charset.Charset)(p2)));
}


public int getUnsignedShortLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getUnsignedShortLE(((int)(p0)));
}


public short readShortLE() {
return ((io.netty.buffer.ByteBuf)(this.a)).readShortLE();
}


public io.netty.buffer.ByteBuf setIntLE(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setIntLE(((int)(p0)), ((int)(p1)));
}


public long getUnsignedInt(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getUnsignedInt(((int)(p0)));
}


public int readMedium() {
return ((io.netty.buffer.ByteBuf)(this.a)).readMedium();
}


public io.netty.buffer.ByteBuf setShortLE(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).setShortLE(((int)(p0)), ((int)(p1)));
}


public int readMediumLE() {
return ((io.netty.buffer.ByteBuf)(this.a)).readMediumLE();
}


public int getUnsignedMedium(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getUnsignedMedium(((int)(p0)));
}


public java.lang.CharSequence getCharSequence(int p0, int p1, java.nio.charset.Charset p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).getCharSequence(((int)(p0)), ((int)(p1)), ((java.nio.charset.Charset)(p2)));
}


public int getMedium(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).getMedium(((int)(p0)));
}


public int readUnsignedMedium() {
return ((io.netty.buffer.ByteBuf)(this.a)).readUnsignedMedium();
}


public java.lang.CharSequence readCharSequence(int p0, java.nio.charset.Charset p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).readCharSequence(((int)(p0)), ((java.nio.charset.Charset)(p1)));
}


public java.nio.ByteBuffer internalNioBuffer(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).internalNioBuffer(((int)(p0)), ((int)(p1)));
}


public io.netty.buffer.ByteBuf writeLongLE(long p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeLongLE(((long)(p0)));
}


public io.netty.buffer.ByteBuf writeMedium(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeMedium(((int)(p0)));
}


public int bytesBefore(int p0, byte p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).bytesBefore(((int)(p0)), ((byte)(p1)));
}


public int bytesBefore(byte p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).bytesBefore(((byte)(p0)));
}


public int bytesBefore(int p0, int p1, byte p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).bytesBefore(((int)(p0)), ((int)(p1)), ((byte)(p2)));
}


public long readUnsignedIntLE() {
return ((io.netty.buffer.ByteBuf)(this.a)).readUnsignedIntLE();
}


public long readLongLE() {
return ((io.netty.buffer.ByteBuf)(this.a)).readLongLE();
}


public io.netty.buffer.ByteBuf writeZero(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeZero(((int)(p0)));
}


public int forEachByte(io.netty.util.ByteProcessor p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).forEachByte(((io.netty.util.ByteProcessor)(p0)));
}


public int forEachByte(int p0, int p1, io.netty.util.ByteProcessor p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).forEachByte(((int)(p0)), ((int)(p1)), ((io.netty.util.ByteProcessor)(p2)));
}


public int nioBufferCount() {
return ((io.netty.buffer.ByteBuf)(this.a)).nioBufferCount();
}


public int readIntLE() {
return ((io.netty.buffer.ByteBuf)(this.a)).readIntLE();
}


public io.netty.buffer.ByteBuf writeMediumLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeMediumLE(((int)(p0)));
}


public io.netty.buffer.ByteBuf writeIntLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeIntLE(((int)(p0)));
}


public io.netty.buffer.ByteBuf writeShortLE(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).writeShortLE(((int)(p0)));
}


public io.netty.buffer.ByteBuf retainedSlice() {
return ((io.netty.buffer.ByteBuf)(this.a)).retainedSlice();
}


public io.netty.buffer.ByteBuf retainedSlice(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).retainedSlice(((int)(p0)), ((int)(p1)));
}


public java.nio.ByteBuffer nioBuffer() {
return ((io.netty.buffer.ByteBuf)(this.a)).nioBuffer();
}


public java.nio.ByteBuffer nioBuffer(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).nioBuffer(((int)(p0)), ((int)(p1)));
}


public int forEachByteDesc(io.netty.util.ByteProcessor p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).forEachByteDesc(((io.netty.util.ByteProcessor)(p0)));
}


public int forEachByteDesc(int p0, int p1, io.netty.util.ByteProcessor p2) {
return ((io.netty.buffer.ByteBuf)(this.a)).forEachByteDesc(((int)(p0)), ((int)(p1)), ((io.netty.util.ByteProcessor)(p2)));
}


public io.netty.buffer.ByteBuf readRetainedSlice(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).readRetainedSlice(((int)(p0)));
}


public io.netty.buffer.ByteBuf retainedDuplicate() {
return ((io.netty.buffer.ByteBuf)(this.a)).retainedDuplicate();
}


public java.nio.ByteBuffer[] nioBuffers() {
return ((io.netty.buffer.ByteBuf)(this.a)).nioBuffers();
}


public java.nio.ByteBuffer[] nioBuffers(int p0, int p1) {
return ((io.netty.buffer.ByteBuf)(this.a)).nioBuffers(((int)(p0)), ((int)(p1)));
}


public boolean hasMemoryAddress() {
return (__sourceIntrinsic_booleanComparison((((io.netty.buffer.ByteBuf)(this.a)).hasMemoryAddress())) != 0);
}


public io.netty.buffer.ByteBuf retain(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).retain(((int)(p0)));
}


public io.netty.util.ReferenceCounted retain__ReferenceCounted(int p0) {
return ((net.minecraft.network.PacketBuffer)(this)).retain(((int)(p0)));
}


public io.netty.util.ReferenceCounted retain__ReferenceCounted() {
return ((net.minecraft.network.PacketBuffer)(this)).retain();
}


public io.netty.buffer.ByteBuf retain() {
return ((io.netty.buffer.ByteBuf)(this.a)).retain();
}


public long memoryAddress() {
return ((io.netty.buffer.ByteBuf)(this.a)).memoryAddress();
}


public int refCnt() {
return ((io.netty.buffer.ByteBuf)(this.a)).refCnt();
}


public io.netty.buffer.ByteBuf readSlice(int p0) {
return ((io.netty.buffer.ByteBuf)(this.a)).readSlice(((int)(p0)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12089_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6e581d8d1b3b_originalDynamicSite2032_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12077_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);


}
