package net.minecraft.entity.player;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityPlayerMP extends net.minecraft.entity.player.EntityPlayer implements net.minecraft.inventory.ICrafting {

private static org.apache.logging.log4j.Logger ce;

private java.lang.String cf;

public net.minecraft.network.NetHandlerPlayServer cg;

public moom.Bl ch;

public moom.Bo ci;

public double cj;

public double ck;

public java.util.List<moom.Ee> cl;

private java.util.List<java.lang.Integer> cm;

private net.minecraft.stats.StatisticsFile cn;

private float co;

private float cp;

private int cq;

private boolean cr;

private int cs;

private int ct;

private net.minecraft.entity.player.EntityPlayer$EnumChatVisibility cu;

private boolean cv;

private long cw;

private net.minecraft.entity.Entity cx;

private int cy;

public boolean cz;

public int cA;

public boolean cB;

private static long db;

private static long[] eb;

private static java.lang.Integer[] rb;

private static java.util.Map sb;

public EntityPlayerMP(moom.Bl p0, net.minecraft.world.WorldServer p1, com.mojang.authlib.GameProfile p2, moom.Bo p3) { super((net.minecraft.world.World)null, (com.mojang.authlib.GameProfile)null); __sourceHandlerCall_fd2f3b6e7d3a1f60439c(this, p0, p1, p2, p3); }


static {
db = ((long)(((moom._a)(moom._c.a(((long)(-202820416986327613L)), ((long)(-4752754653184679928L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(38729262482157L)))));
    sb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.player.EntityPlayerMP.db ^ 50204106967375L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1887_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1887_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1887_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1887_14 = new byte[8];
    (__sourceSpill1887_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1887_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1887_16 = __sourceSpill1887_14;
    ((javax.crypto.Cipher)(__sourceSpill1887_11)).init(((int)(__sourceSpill1887_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1887_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1887_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ì:¾î*\001õ\001P¬ê\017o¬é7Y¡%Ò1Ý´\001\030H¼J{¯[6\fÏÄAêf\177Vq®\026±{¢Q³Ñ£\004À!ÇI<%ÿ¢µW»ÝéF7íU¨XþÅÁfCßáj3ý0¿a=\001À+:ÜR\017\031Åc\023s"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1887_25 = local6_life21;
        int __sourceSpill1887_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1887_25)).substring(((int)(__sourceSpill1887_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1887_30 = local8_life19;
        int __sourceSpill1887_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1887_33 = new byte[8];
        (__sourceSpill1887_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1887_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1887_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1887_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1887_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1887_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1887_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1887_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1887_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1887_34)).doFinal(((byte[])(__sourceSpill1887_33)));
        (__sourceSpill1887_30)[__sourceSpill1887_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "F\007,>Äð@»lý$öÓ|"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1887_38 = local6_life21;
        int __sourceSpill1887_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1887_38)).substring(((int)(__sourceSpill1887_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1887_43 = local8_life19;
        int __sourceSpill1887_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1887_46 = new byte[8];
        (__sourceSpill1887_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1887_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1887_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1887_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1887_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1887_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1887_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1887_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1887_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1887_47)).doFinal(((byte[])(__sourceSpill1887_46)));
        (__sourceSpill1887_43)[__sourceSpill1887_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    eb = ((long[])(local8_life19));
    rb = ((java.lang.Integer[])(new java.lang.Integer[15]));
    ce = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_fd2f3b6e7d3a1f60439c(net.minecraft.entity.player.EntityPlayerMP a0, moom.Bl a1, net.minecraft.world.WorldServer a2, com.mojang.authlib.GameProfile a3, moom.Bo a4) throws E;
private static final class __SourceHandler_fd2f3b6e7d3a1f60439c {

public static void f564(net.minecraft.entity.player.EntityPlayerMP receiver, moom.Bl p0, net.minecraft.world.WorldServer p1, com.mojang.authlib.GameProfile p2, moom.Bo p3) throws Throwable {
    int forestValue564_111_0;
    int forestValue564_111_1;
    int forestValue564_113_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue564_168_0;
    boolean spill564_0;
    int spill564_1;
    int spill564_2;
    int spill564_3;
    net.minecraft.entity.player.EntityPlayerMP spill564_4;
    long life5_3;
    int life7_51;
    moom.DT life8_66;
    int life9_90;
    int life10_101;
    forest_join_179: {
    forest_join_148: {
    forest_join_136: {
    forest_join_114: {
    forest_join_113: {
    forest_join_111: {
    forest_join_107: {
    life5_3 = (__fieldRead564_0() ^ 116879040485711L);
    __directSuperInit564_1(receiver, p1, p2);
    __fieldWrite564_2(receiver, "en_US");
    __fieldWrite564_4(receiver, __call564_3());
    __fieldWrite564_6(receiver, __call564_5());
    __fieldWrite564_7(receiver, 0x0.000002p-126f);
    __fieldWrite564_8(receiver, -0x1.7d784p26f);
    __fieldWrite564_10(receiver, __invokedynamic564_9(17051, (5520065457462623209L ^ life5_3)));
    __fieldWrite564_11(receiver, 1);
    __fieldWrite564_13(receiver, __invokedynamic564_12(912, (1063790254136097512L ^ life5_3)));
    __fieldWrite564_15(receiver, __invokedynamic564_14(19483, (7824545519035626848L ^ life5_3)));
    spill564_0 = __call564_16();
    __fieldWrite564_17(receiver, 1);
    life7_51 = __integerCategory564_18(spill564_0);
    __fieldWrite564_20(receiver, __call564_19());
    __fieldWrite564_21(receiver, null);
    __fieldWrite564_22(p3, receiver);
    __fieldWrite564_23(receiver, p3);
    life8_66 = __call564_24(p1);
    if (!((life7_51 == 0))) {
        break forest_join_148;
    }
    if (!((!__call564_26(__fieldRead564_25(p1))))) {
        break forest_join_136;
    }
    if (!((__call564_28(__call564_27(p1)) != __fieldRead564_29()))) {
        break forest_join_136;
    }
    life9_90 = __call564_32(5, (__call564_30(p0) - __invokedynamic564_31(31224, (1764494782238326917L ^ life5_3))));
    life10_101 = __call564_37(__call564_36(__call564_33(p1), ((double) __call564_34(life8_66)), ((double) __call564_35(life8_66))));
    spill564_1 = life10_101;
    spill564_2 = life9_90;
    if (!((life7_51 == 0))) {
        forestValue564_111_0 = spill564_1;
        forestValue564_111_1 = spill564_2;
        break forest_join_111;
    }
    if (!((spill564_1 < spill564_2))) {
        break forest_join_107;
    }
    life9_90 = life10_101;
    }
    spill564_3 = life10_101;
    if (!((life7_51 == 0))) {
        forestValue564_113_0 = spill564_3;
        break forest_join_113;
    }
    forestValue564_111_0 = spill564_3;
    forestValue564_111_1 = 1;
    }
    if (!((forestValue564_111_0 <= forestValue564_111_1))) {
        break forest_join_114;
    }
    forestValue564_113_0 = 1;
    }
    life9_90 = forestValue564_113_0;
    }
    life8_66 = __call564_43(p1, __call564_42(life8_66, (__call564_39(__fieldRead564_38(receiver), (life9_90 * 2)) - life9_90), 0, (__call564_41(__fieldRead564_40(receiver), (life9_90 * 2)) - life9_90)));
    }
    __fieldWrite564_44(receiver, p0);
    __fieldWrite564_47(receiver, __call564_46(__call564_45(p0), receiver));
    __fieldWrite564_48(receiver, 0x0.0p0f);
    }
    __call564_49(receiver, life8_66, 0x0.0p0f, 0x0.0p0f);
    forest_cycle_153: while (true) {
    forest_join_168: {
    if (!((!__call564_52(__call564_51(p1, receiver, __call564_50(receiver)))))) {
        break forest_join_179;
    }
    spill564_4 = receiver;
    if (!((life7_51 == 0))) {
        forestValue564_168_0 = spill564_4;
        break forest_join_168;
    }
    if (!((__numericCompare564_54(__fieldRead564_53(spill564_4), 0x1.fep7d) < 0))) {
        break forest_join_179;
    }
    forestValue564_168_0 = receiver;
    }
    __call564_58(forestValue564_168_0, __fieldRead564_55(receiver), (__fieldRead564_56(receiver) + 0x1.0p0d), __fieldRead564_57(receiver));
    if (!((life7_51 != 0))) {
        continue forest_cycle_153;
    }
    break forest_cycle_153;
    }
    }
    return;
}
public static void h564_0(moom.Oo p0) throws Throwable {
    throw __call3056400_0(p0);
}
public static void h564_1(moom.Oo p0) throws Throwable {
    throw __call3056401_0(p0);
}
public static void h564_2(moom.Oo p0) throws Throwable {
    throw __call3056402_0(p0);
}
public static void h564_3(moom.Oo p0) throws Throwable {
    throw __call3056403_0(p0);
}
public static void h564_4(moom.Oo p0) throws Throwable {
    throw __call3056404_0(p0);
}
public static void h564_5(moom.Oo p0) throws Throwable {
    throw __call3056405_0(p0);
}
private static native long __fieldRead564_0() throws Throwable;
private static native void __directSuperInit564_1(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.world.World a1, com.mojang.authlib.GameProfile a2) throws Throwable;
private static native void __fieldWrite564_2(net.minecraft.entity.player.EntityPlayerMP a0, java.lang.String a1) throws Throwable;
private static native java.util.LinkedList __call564_3() throws Throwable;
private static native void __fieldWrite564_4(net.minecraft.entity.player.EntityPlayerMP a0, java.util.LinkedList a1) throws Throwable;
private static native java.util.LinkedList __call564_5() throws Throwable;
private static native void __fieldWrite564_6(net.minecraft.entity.player.EntityPlayerMP a0, java.util.LinkedList a1) throws Throwable;
private static native void __fieldWrite564_7(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native void __fieldWrite564_8(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native int __invokedynamic564_9(int a0, long a1) throws Throwable;
private static native void __fieldWrite564_10(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native void __fieldWrite564_11(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native int __invokedynamic564_12(int a0, long a1) throws Throwable;
private static native void __fieldWrite564_13(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native int __invokedynamic564_14(int a0, long a1) throws Throwable;
private static native void __fieldWrite564_15(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native boolean __call564_16() throws Throwable;
private static native void __fieldWrite564_17(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native int __integerCategory564_18(boolean value) throws Throwable;
private static native long __call564_19() throws Throwable;
private static native void __fieldWrite564_20(net.minecraft.entity.player.EntityPlayerMP a0, long a1) throws Throwable;
private static native void __fieldWrite564_21(net.minecraft.entity.player.EntityPlayerMP a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite564_22(moom.Bo a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native void __fieldWrite564_23(net.minecraft.entity.player.EntityPlayerMP a0, moom.Bo a1) throws Throwable;
private static native moom.DT __call564_24(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.EA __fieldRead564_25(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call564_26(moom.EA a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call564_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call564_28(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead564_29() throws Throwable;
private static native int __call564_30(moom.Bl a0) throws Throwable;
private static native int __invokedynamic564_31(int a0, long a1) throws Throwable;
private static native int __call564_32(int a0, int a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call564_33(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call564_34(moom.DT a0) throws Throwable;
private static native int __call564_35(moom.DT a0) throws Throwable;
private static native double __call564_36(net.minecraft.world.border.WorldBorder a0, double a1, double a2) throws Throwable;
private static native int __call564_37(double a0) throws Throwable;
private static native java.util.Random __fieldRead564_38(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call564_39(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead564_40(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call564_41(java.util.Random a0, int a1) throws Throwable;
private static native moom.DT __call564_42(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __call564_43(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native void __fieldWrite564_44(net.minecraft.entity.player.EntityPlayerMP a0, moom.Bl a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call564_45(moom.Bl a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call564_46(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native void __fieldWrite564_47(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.stats.StatisticsFile a1) throws Throwable;
private static native void __fieldWrite564_48(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native void __call564_49(net.minecraft.entity.player.EntityPlayerMP a0, moom.DT a1, float a2, float a3) throws Throwable;
private static native moom.CA __call564_50(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.List __call564_51(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.CA a2) throws Throwable;
private static native boolean __call564_52(java.util.List a0) throws Throwable;
private static native double __fieldRead564_53(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare564_54(double a0, double a1) throws Throwable;
private static native double __fieldRead564_55(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead564_56(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead564_57(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call564_58(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call3056400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3056401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3056402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3056403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3056404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3056405_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fa7a90f54bb97ba126fa(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_fa7a90f54bb97ba126fa {

public static void f720010(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    net.minecraft.network.NetHandlerPlayServer spill720010_0;
    moom.zT spill720010_1;
    long life1_3;
    life1_3 = (__fieldRead720010_0() ^ 16367143094815L);
    spill720010_0 = __fieldRead720010_1(receiver);
    moom.zT __stackOp720010_3_0 = __sourceUninitializedNEW720010_2();
    spill720010_1 = __stackOp720010_3_0;
    __explicitNewInit720010_5(__stackOp720010_3_0, receiver, __integerCategory720010_6(__invokedynamic720010_4(9653, (837711342076841882L ^ life1_3))));
    __call720010_7(spill720010_0, spill720010_1);
    __call720010_8(receiver);
    return;
}
private static native long __fieldRead720010_0() throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead720010_1(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.zT __sourceUninitializedNEW720010_2() throws Throwable;
private static native int __invokedynamic720010_4(int a0, long a1) throws Throwable;
private static native byte __integerCategory720010_6(int value) throws Throwable;
private static native void __explicitNewInit720010_5(moom.zT a0, net.minecraft.entity.Entity a1, byte a2) throws Throwable;
private static native void __call720010_7(net.minecraft.network.NetHandlerPlayServer a0, moom.zT a1) throws Throwable;
private static native void __call720010_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c9edc3fe49ebb953518f(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_c9edc3fe49ebb953518f {

public static void f1548(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    net.minecraft.network.NetHandlerPlayServer forwardValue1548_13_0;
    net.minecraft.network.NetHandlerPlayServer spill1548_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_13: {
    life1_3 = (__fieldRead1548_0() ^ 82282683616987L);
    life3_5 = __integerCategory1548_2(__call1548_1());
    spill1548_0 = __fieldRead1548_3(receiver);
    if (!((life3_5 != 0))) {
        forwardValue1548_13_0 = spill1548_0;
        break forward_join_13;
    }
    if (!((spill1548_0 != null))) {
        break forward_join_21;
    }
    forwardValue1548_13_0 = __fieldRead1548_4(receiver);
    }
    __call1548_6(forwardValue1548_13_0, new moom.As(__fieldRead1548_5(receiver)));
    __call1548_7(receiver);
    }
    return;
}
public static void h1548_0(moom.Oo p0) throws Throwable {
    throw __call1154800_0(p0);
}
public static void h1548_1(moom.Oo p0) throws Throwable {
    throw __call1154801_0(p0);
}
private static native long __fieldRead1548_0() throws Throwable;
private static native boolean __call1548_1() throws Throwable;
private static native int __integerCategory1548_2(boolean value) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1548_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1548_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1548_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1548_6(net.minecraft.network.NetHandlerPlayServer a0, moom.As a1) throws Throwable;
private static native void __call1548_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.Throwable __call1154800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f9cc324602d1ee229abc(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_f9cc324602d1ee229abc {

public static boolean f2802(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2802_0() ^ 67427717628760L);
    return ((__call2802_2(__fieldRead2802_1(receiver)) == __fieldRead2802_3()) ? true : false);
}
public static void h2802_0(moom.Oo p0) throws Throwable {
    throw __call1280200_0(p0);
}
private static native long __fieldRead2802_0() throws Throwable;
private static native moom.Bo __fieldRead2802_1(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call2802_2(moom.Bo a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead2802_3() throws Throwable;
private static native java.lang.Throwable __call1280200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_133010f4bfcce7b8204f(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_133010f4bfcce7b8204f {

public static void f100209(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    net.minecraft.item.Item forestValue100209_34_0;
    int forestValue100209_77_0;
    int forestValue100209_79_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue100209_106_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue100209_115_0;
    int forestValue100209_115_1;
    net.minecraft.entity.player.EntityPlayerMP forestValue100209_116_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue100209_117_0;
    int forestValue100209_117_1;
    int forestValue100209_164_0;
    int forestValue100209_194_0;
    int forestValue100209_194_1;
    int forestValue100209_204_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue100209_206_0;
    net.minecraft.item.Item spill100209_0;
    net.minecraft.entity.player.EntityPlayerMP spill100209_1;
    net.minecraft.entity.player.EntityPlayerMP spill100209_2;
    int spill100209_3;
    int spill100209_4;
    int spill100209_5;
    int spill100209_6;
    int spill100209_7;
    net.minecraft.entity.player.EntityPlayerMP spill100209_8;
    long life1_3;
    int life3_5;
    int life4_9;
    net.minecraft.item.ItemStack life5_19;
    moom.yK life6_45;
    java.util.Iterator life4_156;
    net.minecraft.scoreboard.ScoreObjective life5_163;
    forest_join_207: {
    forest_join_206: {
    forest_join_204: {
    forest_join_194: {
    forest_join_185: {
    forest_join_164: {
    forest_join_162: {
    forest_join_118: {
    forest_join_117: {
    forest_join_116: {
    forest_join_115: {
    forest_join_106: {
    forest_join_105: {
    forest_join_82: {
    forest_join_79: {
    forest_join_78: {
    forest_join_77: {
    forest_join_52: {
    life1_3 = (__fieldRead100209_0() ^ 41443539284598L);
    life3_5 = __integerCategory100209_2(__call100209_1());
    __call100209_3(receiver);
    life4_9 = 0;
    forest_cycle_10: while (true) {
    forest_join_50: {
    forest_join_49: {
    forest_join_34: {
    if (!((life4_9 < __call100209_5(__fieldRead100209_4(receiver))))) {
        break forest_join_52;
    }
    life5_19 = __call100209_7(__fieldRead100209_6(receiver), life4_9);
    if (!((life3_5 != 0))) {
        break forest_join_105;
    }
    if (!((life3_5 != 0))) {
        break forest_join_50;
    }
    if (!((life5_19 != null))) {
        break forest_join_49;
    }
    spill100209_0 = __call100209_8(life5_19);
    if (!((life3_5 != 0))) {
        forestValue100209_34_0 = spill100209_0;
        break forest_join_34;
    }
    if (!(__call100209_9(spill100209_0))) {
        break forest_join_49;
    }
    forestValue100209_34_0 = __call100209_10(life5_19);
    }
    life6_45 = __call100209_13(__cast100209_11(forestValue100209_34_0), life5_19, __fieldRead100209_12(receiver), receiver);
    if (!((life3_5 != 0))) {
        break forest_join_50;
    }
    if (!((life6_45 != null))) {
        break forest_join_49;
    }
    __call100209_15(__fieldRead100209_14(receiver), life6_45);
    }
    life4_9 += 1;
    }
    if (!((life3_5 == 0))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    spill100209_1 = receiver;
    if (!((life3_5 != 0))) {
        forestValue100209_106_0 = spill100209_1;
        break forest_join_106;
    }
    if (!((__numericCompare100209_18(__call100209_16(spill100209_1), __fieldRead100209_17(receiver)) == 0))) {
        break forest_join_82;
    }
    spill100209_2 = receiver;
    if (!((life3_5 != 0))) {
        forestValue100209_106_0 = spill100209_2;
        break forest_join_106;
    }
    if (!((__fieldRead100209_19(spill100209_2) == __call100209_21(__fieldRead100209_20(receiver))))) {
        break forest_join_82;
    }
    spill100209_3 = __numericCompare100209_24(__call100209_23(__fieldRead100209_22(receiver)), 0x0.0p0f);
    if (!((life3_5 != 0))) {
        forestValue100209_77_0 = spill100209_3;
        break forest_join_77;
    }
    if (!((spill100209_3 == 0))) {
        break forest_join_78;
    }
    forestValue100209_77_0 = 1;
    }
    forestValue100209_79_0 = forestValue100209_77_0;
    break forest_join_79;
    }
    forestValue100209_79_0 = 0;
    }
    if (!((forestValue100209_79_0 != __integerCategory100209_26(__fieldRead100209_25(receiver))))) {
        break forest_join_118;
    }
    }
    __call100209_33(__fieldRead100209_27(receiver), new moom.zz(__call100209_28(receiver), __call100209_30(__fieldRead100209_29(receiver)), __call100209_32(__fieldRead100209_31(receiver))));
    __fieldWrite100209_35(receiver, __call100209_34(receiver));
    __fieldWrite100209_38(receiver, __call100209_37(__fieldRead100209_36(receiver)));
    }
    forestValue100209_106_0 = receiver;
    }
    spill100209_4 = __numericCompare100209_41(__call100209_40(__fieldRead100209_39(receiver)), 0x0.0p0f);
    if (!((life3_5 != 0))) {
        forestValue100209_115_0 = forestValue100209_106_0;
        forestValue100209_115_1 = spill100209_4;
        break forest_join_115;
    }
    if (!((spill100209_4 == 0))) {
        forestValue100209_116_0 = forestValue100209_106_0;
        break forest_join_116;
    }
    forestValue100209_115_0 = forestValue100209_106_0;
    forestValue100209_115_1 = 1;
    }
    forestValue100209_117_0 = forestValue100209_115_0;
    forestValue100209_117_1 = forestValue100209_115_1;
    break forest_join_117;
    }
    forestValue100209_117_0 = forestValue100209_116_0;
    forestValue100209_117_1 = 0;
    }
    __fieldWrite100209_42(forestValue100209_117_0, forestValue100209_117_1);
    }
    spill100209_5 = __numericCompare100209_46((__call100209_43(receiver) + __call100209_44(receiver)), __fieldRead100209_45(receiver));
    if (!((life3_5 != 0))) {
        forestValue100209_164_0 = spill100209_5;
        break forest_join_164;
    }
    if (!((spill100209_5 != 0))) {
        break forest_join_162;
    }
    __fieldWrite100209_49(receiver, (__call100209_47(receiver) + __call100209_48(receiver)));
    life4_156 = __call100209_53(__call100209_52(__call100209_50(receiver), __fieldRead100209_51()));
    forest_cycle_142: while (true) {
    if (!(__call100209_54(life4_156))) {
        break forest_join_162;
    }
    life5_163 = __cast100209_56(__call100209_55(life4_156));
    __call100209_61(__call100209_59(__call100209_57(receiver), __call100209_58(receiver), life5_163), __call100209_60(receiver));
    if (!((life3_5 != 0))) {
        break forest_join_185;
    }
    if (!((life3_5 == 0))) {
        continue forest_cycle_142;
    }
    break forest_cycle_142;
    }
    }
    forestValue100209_164_0 = __fieldRead100209_62(receiver);
    }
    spill100209_6 = __fieldRead100209_63(receiver);
    if (!((life3_5 != 0))) {
        forestValue100209_194_0 = forestValue100209_164_0;
        forestValue100209_194_1 = spill100209_6;
        break forest_join_194;
    }
    if (!((forestValue100209_164_0 != spill100209_6))) {
        break forest_join_185;
    }
    __fieldWrite100209_65(receiver, __fieldRead100209_64(receiver));
    __call100209_70(__fieldRead100209_66(receiver), new moom.zY(__fieldRead100209_67(receiver), __fieldRead100209_68(receiver), __fieldRead100209_69(receiver)));
    }
    forestValue100209_194_0 = (__fieldRead100209_71(receiver) % __invokedynamic100209_72(13743, (5458073629073418211L ^ life1_3)));
    forestValue100209_194_1 = 5;
    }
    spill100209_7 = (forestValue100209_194_0 * forestValue100209_194_1);
    if (!((life3_5 != 0))) {
        forestValue100209_204_0 = spill100209_7;
        break forest_join_204;
    }
    if (!((spill100209_7 == 0))) {
        break forest_join_207;
    }
    spill100209_8 = receiver;
    if (!((life3_5 != 0))) {
        forestValue100209_206_0 = spill100209_8;
        break forest_join_206;
    }
    forestValue100209_204_0 = __integerCategory100209_76(__call100209_75(__call100209_73(spill100209_8), __fieldRead100209_74()));
    }
    if (!((forestValue100209_204_0 == 0))) {
        break forest_join_207;
    }
    forestValue100209_206_0 = receiver;
    }
    __call100209_77(forestValue100209_206_0);
    }
    return;
}
public static void h100209_0(java.lang.Throwable p0) throws Throwable {
    throw __call13020900_0(p0);
}
public static void h100209_1(java.lang.Throwable p0) throws Throwable {
    throw __call13020901_0(p0);
}
public static void h100209_2(java.lang.Throwable p0) throws Throwable {
    throw __call13020902_0(p0);
}
public static void h100209_3(java.lang.Throwable p0) throws Throwable {
    throw __call13020903_0(p0);
}
public static void h100209_4(java.lang.Throwable p0) throws Throwable {
    throw __call13020904_0(p0);
}
public static void h100209_5(java.lang.Throwable p0) throws Throwable {
    throw __call13020905_0(p0);
}
public static void h100209_6(java.lang.Throwable p0) throws Throwable {
    throw __call13020906_0(p0);
}
public static void h100209_7(java.lang.Throwable p0) throws Throwable {
    throw __call13020907_0(p0);
}
public static void h100209_8(java.lang.Throwable p0) throws Throwable {
    throw __call13020908_0(p0);
}
public static void h100209_9(java.lang.Throwable p0) throws Throwable {
    throw __call13020909_0(p0);
}
public static void h100209_10(java.lang.Throwable p0) throws Throwable {
    throw __call13020910_0(p0);
}
public static void h100209_11(java.lang.Throwable p0) throws Throwable {
    throw __call13020911_0(p0);
}
public static void h100209_12(java.lang.Throwable p0) throws Throwable {
    throw __call13020912_0(p0);
}
public static void h100209_13(java.lang.Throwable p0) throws Throwable {
    throw __call13020913_0(p0);
}
public static void h100209_14(java.lang.Throwable p0) throws Throwable {
    throw __call13020914_0(p0);
}
public static void h100209_15(java.lang.Throwable p0) throws Throwable {
    throw __call13020915_0(p0);
}
public static void h100209_16(java.lang.Throwable p0) throws Throwable {
    throw __call13020916_0(p0);
}
public static void h100209_17(java.lang.Throwable p0) throws Throwable {
    throw __call13020917_0(p0);
}
public static void h100209_18(java.lang.Throwable p0) throws Throwable {
    throw __call13020918_0(p0);
}
public static void h100209_19(java.lang.Throwable p0) throws Throwable {
    throw __call13020919_0(p0);
}
public static void h100209_20(java.lang.Throwable p0) throws Throwable {
    throw __call13020920_0(p0);
}
public static void h100209_21(java.lang.Throwable p0, net.minecraft.entity.player.EntityPlayerMP p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call13020921_0(life2_2, "Ticking player");
    life4_10 = __call13020921_1(life3_6, "Player being ticked");
    __call13020921_2(p1, life4_10);
    throw new moom.Oo(life3_6);
}
private static native long __fieldRead100209_0() throws Throwable;
private static native boolean __call100209_1() throws Throwable;
private static native int __integerCategory100209_2(boolean value) throws Throwable;
private static native void __call100209_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead100209_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call100209_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead100209_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call100209_7(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native net.minecraft.item.Item __call100209_8(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call100209_9(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call100209_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemMapBase __cast100209_11(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead100209_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.yK __call100209_13(net.minecraft.item.ItemMapBase a0, net.minecraft.item.ItemStack a1, net.minecraft.world.World a2, net.minecraft.entity.player.EntityPlayerMP a3) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead100209_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call100209_15(net.minecraft.network.NetHandlerPlayServer a0, moom.yK a1) throws Throwable;
private static native float __call100209_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead100209_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare100209_18(float a0, float a1) throws Throwable;
private static native int __fieldRead100209_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.FoodStats __fieldRead100209_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call100209_21(net.minecraft.util.FoodStats a0) throws Throwable;
private static native net.minecraft.util.FoodStats __fieldRead100209_22(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call100209_23(net.minecraft.util.FoodStats a0) throws Throwable;
private static native int __numericCompare100209_24(float a0, float a1) throws Throwable;
private static native boolean __fieldRead100209_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory100209_26(boolean value) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead100209_27(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call100209_28(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.FoodStats __fieldRead100209_29(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call100209_30(net.minecraft.util.FoodStats a0) throws Throwable;
private static native net.minecraft.util.FoodStats __fieldRead100209_31(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call100209_32(net.minecraft.util.FoodStats a0) throws Throwable;
private static native void __call100209_33(net.minecraft.network.NetHandlerPlayServer a0, moom.zz a1) throws Throwable;
private static native float __call100209_34(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite100209_35(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native net.minecraft.util.FoodStats __fieldRead100209_36(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call100209_37(net.minecraft.util.FoodStats a0) throws Throwable;
private static native void __fieldWrite100209_38(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.util.FoodStats __fieldRead100209_39(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call100209_40(net.minecraft.util.FoodStats a0) throws Throwable;
private static native int __numericCompare100209_41(float a0, float a1) throws Throwable;
private static native void __fieldWrite100209_42(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native float __call100209_43(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call100209_44(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead100209_45(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare100209_46(float a0, float a1) throws Throwable;
private static native float __call100209_47(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call100209_48(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite100209_49(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call100209_50(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __fieldRead100209_51() throws Throwable;
private static native java.util.Collection __call100209_52(net.minecraft.scoreboard.Scoreboard a0, net.minecraft.scoreboard.IScoreObjectiveCriteria a1) throws Throwable;
private static native java.util.Iterator __call100209_53(java.util.Collection a0) throws Throwable;
private static native boolean __call100209_54(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100209_55(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast100209_56(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call100209_57(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __call100209_58(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call100209_59(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native java.util.List __call100209_60(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call100209_61(net.minecraft.scoreboard.Score a0, java.util.List a1) throws Throwable;
private static native int __fieldRead100209_62(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead100209_63(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead100209_64(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite100209_65(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead100209_66(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead100209_67(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead100209_68(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead100209_69(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call100209_70(net.minecraft.network.NetHandlerPlayServer a0, moom.zY a1) throws Throwable;
private static native int __fieldRead100209_71(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __invokedynamic100209_72(int a0, long a1) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call100209_73(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.BZ __fieldRead100209_74() throws Throwable;
private static native boolean __call100209_75(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory100209_76(boolean value) throws Throwable;
private static native void __call100209_77(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.Throwable __call13020900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020903_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020904_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020905_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020906_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020907_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020908_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020909_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020910_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020911_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020912_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020913_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020914_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020915_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020916_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020917_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020918_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020919_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13020920_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call13020921_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call13020921_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call13020921_2(net.minecraft.entity.player.EntityPlayerMP a0, moom.qZ a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_01a75ab79cf91086d255(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_01a75ab79cf91086d255 {

public static void f1549(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    moom.f lexicalValue1549_43_0;
    int lexicalValue1549_57_0;
    java.util.Set lexicalValue1549_61_0;
    int lexicalValue1549_89_0;
    boolean spill1549_0;
    moom.f spill1549_1;
    boolean spill1549_2;
    moom.f spill1549_3;
    boolean spill1549_4;
    long life1_3;
    net.minecraft.world.biome.BiomeGenBase life4_18;
    int life3_19;
    java.lang.String life5_22;
    moom.f life6_28;
    java.util.HashSet life7_77;
    java.util.Iterator life8_80;
    java.lang.String life9_87;
    lexical_join_93: {
    lexical_join_89: {
    lexical_join_87: {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_43: {
    lexical_join_42: {
    life1_3 = (__fieldRead1549_0() ^ 17876153044649L);
    spill1549_0 = __call1549_1();
    life4_18 = __call1549_7(__fieldRead1549_2(receiver), new moom.DT(__call1549_4(__fieldRead1549_3(receiver)), 0, __call1549_6(__fieldRead1549_5(receiver))));
    life3_19 = __integerCategory1549_8(spill1549_0);
    life5_22 = __fieldRead1549_9(life4_18);
    life6_28 = __cast1549_13(__call1549_12(__call1549_10(receiver), __fieldRead1549_11()));
    spill1549_1 = life6_28;
    if (!((life3_19 != 0))) {
        lexicalValue1549_43_0 = spill1549_1;
        break lexical_join_43;
    }
    if (!((spill1549_1 == null))) {
        break lexical_join_42;
    }
    life6_28 = __cast1549_17(__call1549_16(__call1549_14(receiver), __fieldRead1549_15(), new moom.f()));
    }
    lexicalValue1549_43_0 = life6_28;
    }
    __call1549_18(lexicalValue1549_43_0, life5_22);
    spill1549_2 = __call1549_21(__call1549_19(receiver), __fieldRead1549_20());
    if (!((life3_19 != 0))) {
        lexicalValue1549_57_0 = __integerCategory1549_22(spill1549_2);
        break lexical_join_57;
    }
    if (!(spill1549_2)) {
        break lexical_join_93;
    }
    spill1549_3 = life6_28;
    if (!((life3_19 != 0))) {
        lexicalValue1549_61_0 = spill1549_3;
        break lexical_join_61;
    }
    lexicalValue1549_57_0 = __call1549_23(spill1549_3);
    }
    if (!((lexicalValue1549_57_0 >= __call1549_25(__fieldRead1549_24())))) {
        break lexical_join_93;
    }
    lexicalValue1549_61_0 = __fieldRead1549_26();
    }
    life7_77 = __call1549_27(lexicalValue1549_61_0);
    life8_80 = __call1549_28(life6_28);
    lexical_cycle_66: while (true) {
    lexical_join_85: {
    if (!(__call1549_29(life8_80))) {
        break lexical_join_87;
    }
    life9_87 = __cast1549_31(__call1549_30(life8_80));
    __call1549_33(life7_77, __invokedynamic1549_32(life9_87));
    spill1549_4 = __call1549_34(life7_77);
    if (!((life3_19 != 0))) {
        lexicalValue1549_89_0 = __integerCategory1549_35(spill1549_4);
        break lexical_join_89;
    }
    if (!(spill1549_4)) {
        break lexical_join_85;
    }
    if (!((life3_19 == 0))) {
        break lexical_join_87;
    }
    }
    if (!((life3_19 == 0))) { continue lexical_cycle_66; }
    break lexical_cycle_66;
    }
    }
    lexicalValue1549_89_0 = __integerCategory1549_37(__call1549_36(life7_77));
    }
    if (!((lexicalValue1549_89_0 != 0))) {
        break lexical_join_93;
    }
    __call1549_39(receiver, __fieldRead1549_38());
    }
    return;
}
public static void h1549_0(moom.Oo p0) throws Throwable {
    throw __call1154900_0(p0);
}
public static void h1549_1(moom.Oo p0) throws Throwable {
    throw __call1154901_0(p0);
}
public static void h1549_2(moom.Oo p0) throws Throwable {
    throw __call1154902_0(p0);
}
public static void h1549_3(moom.Oo p0) throws Throwable {
    throw __call1154903_0(p0);
}
public static void h1549_4(moom.Oo p0) throws Throwable {
    throw __call1154904_0(p0);
}
public static void h1549_5(moom.Oo p0) throws Throwable {
    throw __call1154905_0(p0);
}
public static void h1549_6(moom.Oo p0) throws Throwable {
    throw __call1154906_0(p0);
}
public static void h1549_7(moom.Oo p0) throws Throwable {
    throw __call1154907_0(p0);
}
public static void h1549_8(moom.Oo p0) throws Throwable {
    throw __call1154908_0(p0);
}
private static native long __fieldRead1549_0() throws Throwable;
private static native boolean __call1549_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1549_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1549_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1549_4(double a0) throws Throwable;
private static native double __fieldRead1549_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1549_6(double a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1549_7(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1549_8(boolean value) throws Throwable;
private static native java.lang.String __fieldRead1549_9(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call1549_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.BZ __fieldRead1549_11() throws Throwable;
private static native net.minecraft.util.IJsonSerializable __call1549_12(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native moom.f __cast1549_13(net.minecraft.util.IJsonSerializable a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call1549_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.BZ __fieldRead1549_15() throws Throwable;
private static native net.minecraft.util.IJsonSerializable __call1549_16(net.minecraft.stats.StatisticsFile a0, moom.BZ a1, moom.f a2) throws Throwable;
private static native moom.f __cast1549_17(net.minecraft.util.IJsonSerializable a0) throws Throwable;
private static native boolean __call1549_18(moom.f a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call1549_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.BZ __fieldRead1549_20() throws Throwable;
private static native boolean __call1549_21(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory1549_22(boolean value) throws Throwable;
private static native int __call1549_23(moom.f a0) throws Throwable;
private static native java.util.Set __fieldRead1549_24() throws Throwable;
private static native int __call1549_25(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead1549_26() throws Throwable;
private static native java.util.HashSet __call1549_27(java.util.Set a0) throws Throwable;
private static native java.util.Iterator __call1549_28(moom.f a0) throws Throwable;
private static native boolean __call1549_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1549_30(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1549_31(java.lang.Object a0) throws Throwable;
private static native java.util.function.Predicate __invokedynamic1549_32(java.lang.String a0) throws Throwable;
private static native boolean __call1549_33(java.util.HashSet a0, java.util.function.Predicate a1) throws Throwable;
private static native boolean __call1549_34(java.util.HashSet a0) throws Throwable;
private static native int __integerCategory1549_35(boolean value) throws Throwable;
private static native boolean __call1549_36(java.util.HashSet a0) throws Throwable;
private static native int __integerCategory1549_37(boolean value) throws Throwable;
private static native moom.BZ __fieldRead1549_38() throws Throwable;
private static native void __call1549_39(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native java.lang.Throwable __call1154900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1154908_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bcae890b60e375f2e65b(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_bcae890b60e375f2e65b {

public static void f1550(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1550_12_0;
    net.minecraft.entity.player.EntityPlayerMP spill1550_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_12: {
    life1_3 = (__fieldRead1550_0() ^ 66436093302432L);
    life3_5 = __integerCategory1550_2(__call1550_1());
    spill1550_0 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue1550_12_0 = spill1550_0;
        break forward_join_12;
    }
    if (!((!__fieldRead1550_3(spill1550_0)))) {
        break forward_join_22;
    }
    forwardValue1550_12_0 = receiver;
    }
    __call1550_7(__fieldRead1550_4(forwardValue1550_12_0), new moom.Ag(-1, -1, __call1550_6(__fieldRead1550_5(receiver))));
    }
    return;
}
public static void h1550_0(moom.Oo p0) throws Throwable {
    throw __call1155000_0(p0);
}
public static void h1550_1(moom.Oo p0) throws Throwable {
    throw __call1155001_0(p0);
}
private static native long __fieldRead1550_0() throws Throwable;
private static native boolean __call1550_1() throws Throwable;
private static native int __integerCategory1550_2(boolean value) throws Throwable;
private static native boolean __fieldRead1550_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1550_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1550_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1550_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call1550_7(net.minecraft.network.NetHandlerPlayServer a0, moom.Ag a1) throws Throwable;
private static native java.lang.Throwable __call1155000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0b22504a1a629f3704b7(net.minecraft.entity.player.EntityPlayerMP a0, double a1, boolean a2) throws E;
private static final class __SourceHandler_0b22504a1a629f3704b7 {

public static void f1551(net.minecraft.entity.player.EntityPlayerMP receiver, double p0, boolean p1) throws Throwable {
    net.minecraft.block.Block forwardValue1551_69_0;
    boolean spill1551_0;
    net.minecraft.block.Block spill1551_1;
    net.minecraft.block.Block spill1551_2;
    net.minecraft.block.Block spill1551_3;
    long life4_3;
    int life7_8;
    int life6_9;
    int life8_15;
    int life9_19;
    moom.DT life10_26;
    net.minecraft.block.Block life11_32;
    net.minecraft.block.Block life12_48;
    forward_join_76: {
    forward_join_70: {
    forward_join_69: {
    forward_join_61: {
    life4_3 = (__fieldRead1551_0() ^ 49795532677420L);
    spill1551_0 = __call1551_1();
    life7_8 = __call1551_3(__fieldRead1551_2(receiver));
    life6_9 = __integerCategory1551_4(spill1551_0);
    life8_15 = __call1551_6((__fieldRead1551_5(receiver) - 0x1.99999ap-3d));
    life9_19 = __call1551_8(__fieldRead1551_7(receiver));
    life10_26 = new moom.DT(life7_8, life8_15, life9_19);
    life11_32 = __call1551_11(__call1551_10(__fieldRead1551_9(receiver), life10_26));
    if (!((life6_9 != 0))) {
        break forward_join_76;
    }
    if (!((__call1551_12(life11_32) == __fieldRead1551_13()))) {
        break forward_join_70;
    }
    life12_48 = __call1551_17(__call1551_16(__fieldRead1551_14(receiver), __call1551_15(life10_26)));
    spill1551_1 = life12_48;
    if (!((life6_9 != 0))) {
        forwardValue1551_69_0 = spill1551_1;
        break forward_join_69;
    }
    if (!((__instanceOf1551_18(spill1551_1) == 0))) {
        break forward_join_61;
    }
    spill1551_2 = life12_48;
    if (!((life6_9 != 0))) {
        forwardValue1551_69_0 = spill1551_2;
        break forward_join_69;
    }
    if (!((__instanceOf1551_19(spill1551_2) == 0))) {
        break forward_join_61;
    }
    spill1551_3 = life12_48;
    if (!((life6_9 != 0))) {
        forwardValue1551_69_0 = spill1551_3;
        break forward_join_69;
    }
    if (!((__instanceOf1551_20(spill1551_3) != 0))) {
        break forward_join_70;
    }
    }
    life10_26 = __call1551_21(life10_26);
    forwardValue1551_69_0 = __call1551_24(__call1551_23(__fieldRead1551_22(receiver), life10_26));
    }
    life11_32 = forwardValue1551_69_0;
    }
    __call1551_25(receiver, p0, p1, life11_32, life10_26);
    }
    return;
}
public static void h1551_0(moom.Oo p0) throws Throwable {
    throw __call1155100_0(p0);
}
public static void h1551_1(moom.Oo p0) throws Throwable {
    throw __call1155101_0(p0);
}
public static void h1551_2(moom.Oo p0) throws Throwable {
    throw __call1155102_0(p0);
}
public static void h1551_3(moom.Oo p0) throws Throwable {
    throw __call1155103_0(p0);
}
public static void h1551_4(moom.Oo p0) throws Throwable {
    throw __call1155104_0(p0);
}
public static void h1551_5(moom.Oo p0) throws Throwable {
    throw __call1155105_0(p0);
}
private static native long __fieldRead1551_0() throws Throwable;
private static native boolean __call1551_1() throws Throwable;
private static native double __fieldRead1551_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1551_3(double a0) throws Throwable;
private static native int __integerCategory1551_4(boolean value) throws Throwable;
private static native double __fieldRead1551_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1551_6(double a0) throws Throwable;
private static native double __fieldRead1551_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1551_8(double a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1551_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1551_10(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1551_11(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1551_12(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1551_13() throws Throwable;
private static native net.minecraft.world.World __fieldRead1551_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.DT __call1551_15(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1551_16(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1551_17(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf1551_18(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf1551_19(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf1551_20(net.minecraft.block.Block a0) throws Throwable;
private static native moom.DT __call1551_21(moom.DT a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1551_22(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1551_23(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1551_24(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1551_25(net.minecraft.entity.player.EntityPlayerMP a0, double a1, boolean a2, net.minecraft.block.Block a3, moom.DT a4) throws Throwable;
private static native java.lang.Throwable __call1155100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155105_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_19d9da736bc4e33d41fd(net.minecraft.entity.player.EntityPlayerMP a0, float a1, float a2, boolean a3, boolean a4) throws E;
private static final class __SourceHandler_19d9da736bc4e33d41fd {

public static void f593(net.minecraft.entity.player.EntityPlayerMP receiver, float p0, float p1, boolean p2, boolean p3) throws Throwable {
    int forwardValue593_27_0;
    int forwardValue593_33_0;
    int spill593_0;
    int spill593_1;
    long life5_3;
    int life7_5;
    forward_join_43: {
    forward_join_37: {
    forward_join_33: {
    forward_join_27: {
    forward_join_24: {
    life5_3 = (__fieldRead593_0() ^ 128087091916444L);
    life7_5 = __integerCategory593_2(__call593_1());
    if (!((__fieldRead593_3(receiver) != null))) {
        break forward_join_43;
    }
    spill593_0 = __numericCompare593_4(p0, -0x1.0p0f);
    if (!((life7_5 == 0))) {
        forwardValue593_27_0 = spill593_0;
        break forward_join_27;
    }
    if (!((spill593_0 >= 0))) {
        break forward_join_24;
    }
    spill593_1 = __numericCompare593_5(p0, 0x1.0p0f);
    if (!((life7_5 == 0))) {
        forwardValue593_27_0 = spill593_1;
        break forward_join_27;
    }
    if (!((spill593_1 <= 0))) {
        break forward_join_24;
    }
    __fieldWrite593_6(receiver, p0);
    }
    forwardValue593_27_0 = __numericCompare593_7(p1, -0x1.0p0f);
    }
    if (!((life7_5 == 0))) {
        forwardValue593_33_0 = forwardValue593_27_0;
        break forward_join_33;
    }
    if (!((forwardValue593_27_0 >= 0))) {
        break forward_join_37;
    }
    forwardValue593_33_0 = __numericCompare593_8(p1, 0x1.0p0f);
    }
    if (!((forwardValue593_33_0 <= 0))) {
        break forward_join_37;
    }
    __fieldWrite593_9(receiver, p1);
    }
    __fieldWrite593_10(receiver, p2);
    __call593_11(receiver, p3);
    }
    return;
}
public static void h593_0(moom.Oo p0) throws Throwable {
    throw __call2059300_0(p0);
}
public static void h593_1(moom.Oo p0) throws Throwable {
    throw __call2059301_0(p0);
}
public static void h593_2(moom.Oo p0) throws Throwable {
    throw __call2059302_0(p0);
}
public static void h593_3(moom.Oo p0) throws Throwable {
    throw __call2059303_0(p0);
}
public static void h593_4(moom.Oo p0) throws Throwable {
    throw __call2059304_0(p0);
}
public static void h593_5(moom.Oo p0) throws Throwable {
    throw __call2059305_0(p0);
}
public static void h593_6(moom.Oo p0) throws Throwable {
    throw __call2059306_0(p0);
}
public static void h593_7(moom.Oo p0) throws Throwable {
    throw __call2059307_0(p0);
}
private static native long __fieldRead593_0() throws Throwable;
private static native boolean __call593_1() throws Throwable;
private static native int __integerCategory593_2(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead593_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare593_4(float a0, float a1) throws Throwable;
private static native int __numericCompare593_5(float a0, float a1) throws Throwable;
private static native void __fieldWrite593_6(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native int __numericCompare593_7(float a0, float a1) throws Throwable;
private static native int __numericCompare593_8(float a0, float a1) throws Throwable;
private static native void __fieldWrite593_9(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native void __fieldWrite593_10(net.minecraft.entity.player.EntityPlayerMP a0, boolean a1) throws Throwable;
private static native void __call593_11(net.minecraft.entity.player.EntityPlayerMP a0, boolean a1) throws Throwable;
private static native java.lang.Throwable __call2059300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059307_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_33115d4f1c08a28e9eb5(net.minecraft.entity.player.EntityPlayerMP a0, int a1, java.lang.String a2) throws E;
private static final class __SourceHandler_33115d4f1c08a28e9eb5 {

public static boolean f1552(net.minecraft.entity.player.EntityPlayerMP receiver, int p0, java.lang.String p1) throws Throwable {
    int forwardValue1552_23_0;
    moom.BO forwardValue1552_67_0;
    int forwardValue1552_75_0;
    int forwardValue1552_84_0;
    int forwardValue1552_86_0;
    int forwardValue1552_88_0;
    int forwardValue1552_90_0;
    boolean spill1552_0;
    boolean spill1552_1;
    boolean spill1552_2;
    boolean spill1552_3;
    boolean spill1552_4;
    boolean spill1552_5;
    moom.BO spill1552_6;
    int spill1552_7;
    int spill1552_8;
    long life3_3;
    int life5_5;
    moom.BO life6_99;
    forward_join_90: {
    forward_join_89: {
    forward_join_88: {
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_67: {
    forward_join_23: {
    forward_join_20: {
    life3_3 = (__fieldRead1552_0() ^ 61611996812751L);
    life5_5 = __integerCategory1552_2(__call1552_1());
    spill1552_0 = __call1552_3("seed", p1);
    if (!((life5_5 == 0))) {
        forwardValue1552_23_0 = __integerCategory1552_4(spill1552_0);
        break forward_join_23;
    }
    if (!(spill1552_0)) {
        break forward_join_20;
    }
    spill1552_1 = __call1552_6(__fieldRead1552_5(receiver));
    if (!((life5_5 == 0))) {
        forwardValue1552_23_0 = __integerCategory1552_7(spill1552_1);
        break forward_join_23;
    }
    if (!((!spill1552_1))) {
        break forward_join_20;
    }
    return __integerCategory1552_8(1);
    }
    forwardValue1552_23_0 = __integerCategory1552_10(__call1552_9("tell", p1));
    }
    if (!((life5_5 == 0))) {
        forwardValue1552_90_0 = forwardValue1552_23_0;
        break forward_join_90;
    }
    if (!((forwardValue1552_23_0 == 0))) {
        break forward_join_89;
    }
    spill1552_2 = __call1552_11("help", p1);
    if (!((life5_5 == 0))) {
        forwardValue1552_90_0 = __integerCategory1552_12(spill1552_2);
        break forward_join_90;
    }
    if (!((!spill1552_2))) {
        break forward_join_89;
    }
    spill1552_3 = __call1552_13("me", p1);
    if (!((life5_5 == 0))) {
        forwardValue1552_90_0 = __integerCategory1552_14(spill1552_3);
        break forward_join_90;
    }
    if (!((!spill1552_3))) {
        break forward_join_89;
    }
    spill1552_4 = __call1552_15("trigger", p1);
    if (!((life5_5 == 0))) {
        forwardValue1552_90_0 = __integerCategory1552_16(spill1552_4);
        break forward_join_90;
    }
    if (!((!spill1552_4))) {
        break forward_join_89;
    }
    spill1552_5 = __call1552_20(__call1552_18(__fieldRead1552_17(receiver)), __call1552_19(receiver));
    if (!((life5_5 == 0))) {
        forwardValue1552_88_0 = __integerCategory1552_21(spill1552_5);
        break forward_join_88;
    }
    if (!(spill1552_5)) {
        break forward_join_87;
    }
    life6_99 = __cast1552_27(__call1552_26(__call1552_24(__call1552_23(__fieldRead1552_22(receiver))), __call1552_25(receiver)));
    spill1552_6 = life6_99;
    if (!((life5_5 == 0))) {
        forwardValue1552_67_0 = spill1552_6;
        break forward_join_67;
    }
    if (!((spill1552_6 != null))) {
        break forward_join_76;
    }
    forwardValue1552_67_0 = life6_99;
    }
    spill1552_7 = __call1552_28(forwardValue1552_67_0);
    if (!((life5_5 == 0))) {
        forwardValue1552_75_0 = spill1552_7;
        break forward_join_75;
    }
    if (!((spill1552_7 >= p0))) {
        break forward_join_74;
    }
    forwardValue1552_86_0 = 1;
    break forward_join_86;
    }
    forwardValue1552_75_0 = 0;
    }
    forwardValue1552_86_0 = forwardValue1552_75_0;
    break forward_join_86;
    }
    spill1552_8 = __call1552_30(__fieldRead1552_29(receiver));
    if (!((life5_5 == 0))) {
        forwardValue1552_84_0 = spill1552_8;
        break forward_join_84;
    }
    if (!((spill1552_8 >= p0))) {
        break forward_join_85;
    }
    forwardValue1552_84_0 = 1;
    }
    forwardValue1552_86_0 = forwardValue1552_84_0;
    break forward_join_86;
    }
    forwardValue1552_86_0 = 0;
    }
    return __integerCategory1552_31(forwardValue1552_86_0);
    }
    forwardValue1552_88_0 = 0;
    }
    return __integerCategory1552_32(forwardValue1552_88_0);
    }
    forwardValue1552_90_0 = 1;
    }
    return __integerCategory1552_33(forwardValue1552_90_0);
}
public static void h1552_0(moom.Oo p0) throws Throwable {
    throw __call1155200_0(p0);
}
public static void h1552_1(moom.Oo p0) throws Throwable {
    throw __call1155201_0(p0);
}
public static void h1552_2(moom.Oo p0) throws Throwable {
    throw __call1155202_0(p0);
}
public static void h1552_3(moom.Oo p0) throws Throwable {
    throw __call1155203_0(p0);
}
public static void h1552_4(moom.Oo p0) throws Throwable {
    throw __call1155204_0(p0);
}
public static void h1552_5(moom.Oo p0) throws Throwable {
    throw __call1155205_0(p0);
}
public static void h1552_6(moom.Oo p0) throws Throwable {
    throw __call1155206_0(p0);
}
public static void h1552_7(moom.Oo p0) throws Throwable {
    throw __call1155207_0(p0);
}
public static void h1552_8(moom.Oo p0) throws Throwable {
    throw __call1155208_0(p0);
}
public static void h1552_9(moom.Oo p0) throws Throwable {
    throw __call1155209_0(p0);
}
public static void h1552_10(moom.Oo p0) throws Throwable {
    throw __call1155210_0(p0);
}
public static void h1552_11(moom.Oo p0) throws Throwable {
    throw __call1155211_0(p0);
}
public static void h1552_12(moom.Oo p0) throws Throwable {
    throw __call1155212_0(p0);
}
public static void h1552_13(moom.Oo p0) throws Throwable {
    throw __call1155213_0(p0);
}
public static void h1552_14(moom.Oo p0) throws Throwable {
    throw __call1155214_0(p0);
}
public static void h1552_15(moom.Oo p0) throws Throwable {
    throw __call1155215_0(p0);
}
public static void h1552_16(moom.Oo p0) throws Throwable {
    throw __call1155216_0(p0);
}
public static void h1552_17(moom.Oo p0) throws Throwable {
    throw __call1155217_0(p0);
}
private static native long __fieldRead1552_0() throws Throwable;
private static native boolean __call1552_1() throws Throwable;
private static native int __integerCategory1552_2(boolean value) throws Throwable;
private static native boolean __call1552_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1552_4(boolean value) throws Throwable;
private static native moom.Bl __fieldRead1552_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1552_6(moom.Bl a0) throws Throwable;
private static native int __integerCategory1552_7(boolean value) throws Throwable;
private static native boolean __integerCategory1552_8(int value) throws Throwable;
private static native boolean __call1552_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1552_10(boolean value) throws Throwable;
private static native boolean __call1552_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1552_12(boolean value) throws Throwable;
private static native boolean __call1552_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1552_14(boolean value) throws Throwable;
private static native boolean __call1552_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1552_16(boolean value) throws Throwable;
private static native moom.Bl __fieldRead1552_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1552_18(moom.Bl a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1552_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1552_20(net.minecraft.server.management.ServerConfigurationManager a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native int __integerCategory1552_21(boolean value) throws Throwable;
private static native moom.Bl __fieldRead1552_22(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1552_23(moom.Bl a0) throws Throwable;
private static native moom.BG __call1552_24(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1552_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.UserListEntry __call1552_26(moom.BG a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native moom.BO __cast1552_27(net.minecraft.server.management.UserListEntry a0) throws Throwable;
private static native int __call1552_28(moom.BO a0) throws Throwable;
private static native moom.Bl __fieldRead1552_29(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1552_30(moom.Bl a0) throws Throwable;
private static native boolean __integerCategory1552_31(int value) throws Throwable;
private static native boolean __integerCategory1552_32(int value) throws Throwable;
private static native boolean __integerCategory1552_33(int value) throws Throwable;
private static native java.lang.Throwable __call1155200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155216_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155217_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5dc6e81d6a711a788301(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1, int a2) throws E;
private static final class __SourceHandler_5dc6e81d6a711a788301 {

public static void f1553(net.minecraft.entity.player.EntityPlayerMP receiver, moom.BY p0, int p1) throws Throwable {
    net.minecraft.stats.StatisticsFile lexicalValue1553_50_0;
    net.minecraft.stats.StatisticsFile spill1553_0;
    long life3_3;
    int life5_5;
    java.util.Iterator life6_28;
    net.minecraft.scoreboard.ScoreObjective life7_35;
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_42: {
    lexical_join_16: {
    life3_3 = (__fieldRead1553_0() ^ 59578856542168L);
    life5_5 = __integerCategory1553_2(__call1553_1());
    if (!((life5_5 == 0))) {
        break lexical_join_16;
    }
    if (!((p0 != null))) {
        break lexical_join_52;
    }
    __call1553_4(__fieldRead1553_3(receiver), receiver, p0, p1);
    }
    life6_28 = __call1553_8(__call1553_7(__call1553_5(receiver), __call1553_6(p0)));
    lexical_cycle_23: while (true) {
    if (!(__call1553_9(life6_28))) {
        break lexical_join_42;
    }
    life7_35 = __cast1553_11(__call1553_10(life6_28));
    __call1553_15(__call1553_14(__call1553_12(receiver), __call1553_13(receiver), life7_35), p1);
    if (!((life5_5 == 0))) {
        break lexical_join_52;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    spill1553_0 = __fieldRead1553_16(receiver);
    if (!((life5_5 == 0))) {
        lexicalValue1553_50_0 = spill1553_0;
        break lexical_join_50;
    }
    if (!(__call1553_17(spill1553_0))) {
        break lexical_join_52;
    }
    lexicalValue1553_50_0 = __fieldRead1553_18(receiver);
    }
    __call1553_19(lexicalValue1553_50_0, receiver);
    }
    return;
}
public static void h1553_0(moom.Oo p0) throws Throwable {
    throw __call1155300_0(p0);
}
public static void h1553_1(moom.Oo p0) throws Throwable {
    throw __call1155301_0(p0);
}
public static void h1553_2(moom.Oo p0) throws Throwable {
    throw __call1155302_0(p0);
}
public static void h1553_3(moom.Oo p0) throws Throwable {
    throw __call1155303_0(p0);
}
public static void h1553_4(moom.Oo p0) throws Throwable {
    throw __call1155304_0(p0);
}
private static native long __fieldRead1553_0() throws Throwable;
private static native boolean __call1553_1() throws Throwable;
private static native int __integerCategory1553_2(boolean value) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __fieldRead1553_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1553_4(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.BY a2, int a3) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1553_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call1553_6(moom.BY a0) throws Throwable;
private static native java.util.Collection __call1553_7(net.minecraft.scoreboard.Scoreboard a0, net.minecraft.scoreboard.IScoreObjectiveCriteria a1) throws Throwable;
private static native java.util.Iterator __call1553_8(java.util.Collection a0) throws Throwable;
private static native boolean __call1553_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1553_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast1553_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1553_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __call1553_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call1553_14(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native void __call1553_15(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __fieldRead1553_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1553_17(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __fieldRead1553_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1553_19(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call1155300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155304_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.aX __sourceHandlerCall_662d716ee4ad468776dc(net.minecraft.entity.player.EntityPlayerMP a0, moom.DT a1) throws E;
private static final class __SourceHandler_662d716ee4ad468776dc {

public static moom.aX f1554(net.minecraft.entity.player.EntityPlayerMP receiver, moom.DT p0) throws Throwable {
    moom.aX forwardValue1554_45_0;
    boolean spill1554_0;
    moom.aX spill1554_1;
    long life2_3;
    moom.aX life5_8;
    int life4_9;
    moom.zD life6_23;
    forward_join_45: {
    forward_join_44: {
    life2_3 = (__fieldRead1554_0() ^ 43392051907279L);
    spill1554_0 = __call1554_1();
    life5_8 = __call1554_2(receiver, p0);
    life4_9 = __integerCategory1554_3(spill1554_0);
    spill1554_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1554_45_0 = spill1554_1;
        break forward_join_45;
    }
    if (!((spill1554_1 == __fieldRead1554_4()))) {
        break forward_join_44;
    }
    life6_23 = new moom.zD(receiver, p0);
    __call1554_7(__call1554_6(__call1554_5(receiver)), receiver, life6_23);
    __call1554_14(__fieldRead1554_8(receiver), __fieldRead1554_9(receiver), __fieldRead1554_10(receiver), __fieldRead1554_11(receiver), __fieldRead1554_12(receiver), __fieldRead1554_13(receiver));
    __call1554_16(__fieldRead1554_15(receiver), life6_23);
    }
    forwardValue1554_45_0 = life5_8;
    }
    return forwardValue1554_45_0;
}
public static void h1554_0(moom.Oo p0) throws Throwable {
    throw __call1155400_0(p0);
}
private static native long __fieldRead1554_0() throws Throwable;
private static native boolean __call1554_1() throws Throwable;
private static native moom.aX __call1554_2(net.minecraft.entity.player.EntityPlayerMP a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1554_3(boolean value) throws Throwable;
private static native moom.aX __fieldRead1554_4() throws Throwable;
private static native net.minecraft.world.WorldServer __call1554_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.EntityTracker __call1554_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1554_7(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.zD a2) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1554_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1554_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1554_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1554_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead1554_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead1554_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1554_14(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1554_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1554_16(net.minecraft.network.NetHandlerPlayServer a0, moom.zD a1) throws Throwable;
private static native java.lang.Throwable __call1155400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8a3ca6e0b23300b6c59c(net.minecraft.entity.player.EntityPlayerMP a0, moom.v8 a1, int a2, net.minecraft.item.ItemStack a3) throws E;
private static final class __SourceHandler_8a3ca6e0b23300b6c59c {

public static void f1555(net.minecraft.entity.player.EntityPlayerMP receiver, moom.v8 p0, int p1, net.minecraft.item.ItemStack p2) throws Throwable {
    int forwardValue1555_17_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue1555_19_0;
    int spill1555_0;
    net.minecraft.entity.player.EntityPlayerMP spill1555_1;
    long life4_3;
    int life6_5;
    forward_join_28: {
    forward_join_19: {
    forward_join_17: {
    life4_3 = (__fieldRead1555_0() ^ 60693152347997L);
    life6_5 = __integerCategory1555_2(__call1555_1());
    spill1555_0 = __instanceOf1555_4(__call1555_3(p0, p1));
    if (!((life6_5 == 0))) {
        forwardValue1555_17_0 = spill1555_0;
        break forward_join_17;
    }
    if (!((spill1555_0 == 0))) {
        break forward_join_28;
    }
    spill1555_1 = receiver;
    if (!((life6_5 == 0))) {
        forwardValue1555_19_0 = spill1555_1;
        break forward_join_19;
    }
    forwardValue1555_17_0 = __integerCategory1555_6(__fieldRead1555_5(spill1555_1));
    }
    if (!((forwardValue1555_17_0 == 0))) {
        break forward_join_28;
    }
    forwardValue1555_19_0 = receiver;
    }
    __call1555_9(__fieldRead1555_7(forwardValue1555_19_0), new moom.Ag(__fieldRead1555_8(p0), p1, p2));
    }
    return;
}
public static void h1555_0(moom.Oo p0) throws Throwable {
    throw __call1155500_0(p0);
}
public static void h1555_1(moom.Oo p0) throws Throwable {
    throw __call1155501_0(p0);
}
public static void h1555_2(moom.Oo p0) throws Throwable {
    throw __call1155502_0(p0);
}
private static native long __fieldRead1555_0() throws Throwable;
private static native boolean __call1555_1() throws Throwable;
private static native int __integerCategory1555_2(boolean value) throws Throwable;
private static native moom.wB __call1555_3(moom.v8 a0, int a1) throws Throwable;
private static native int __instanceOf1555_4(moom.wB a0) throws Throwable;
private static native boolean __fieldRead1555_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1555_6(boolean value) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1555_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1555_8(moom.v8 a0) throws Throwable;
private static native void __call1555_9(net.minecraft.network.NetHandlerPlayServer a0, moom.Ag a1) throws Throwable;
private static native java.lang.Throwable __call1155500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155502_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_84d83c411558454f4ee6(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.passive.EntityHorse a1, net.minecraft.inventory.IInventory a2) throws E;
private static final class __SourceHandler_84d83c411558454f4ee6 {

public static void f1556(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.entity.passive.EntityHorse p0, net.minecraft.inventory.IInventory p1) throws Throwable {
    moom.v8 forwardValue1556_50_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue1556_50_1;
    moom.v8 spill1556_0;
    net.minecraft.entity.player.EntityPlayerMP spill1556_1;
    long life3_3;
    int life5_5;
    forward_join_50: {
    forward_join_15: {
    life3_3 = (__fieldRead1556_0() ^ 47107522227236L);
    life5_5 = __integerCategory1556_2(__call1556_1());
    spill1556_0 = __fieldRead1556_3(receiver);
    spill1556_1 = receiver;
    if (!((life5_5 != 0))) {
        forwardValue1556_50_0 = spill1556_0;
        forwardValue1556_50_1 = spill1556_1;
        break forward_join_50;
    }
    if (!((spill1556_0 != __fieldRead1556_4(spill1556_1)))) {
        break forward_join_15;
    }
    __call1556_5(receiver);
    }
    __call1556_6(receiver);
    __call1556_12(__fieldRead1556_7(receiver), new moom.Ae(__fieldRead1556_8(receiver), "EntityHorse", __call1556_9(p1), __call1556_10(p1), __call1556_11(p0)));
    __fieldWrite1556_14(receiver, new moom.wh(__fieldRead1556_13(receiver), p1, p0, receiver));
    __fieldWrite1556_17(__fieldRead1556_15(receiver), __fieldRead1556_16(receiver));
    forwardValue1556_50_0 = __fieldRead1556_18(receiver);
    forwardValue1556_50_1 = receiver;
    }
    __call1556_19(forwardValue1556_50_0, forwardValue1556_50_1);
    return;
}
public static void h1556_0(moom.Oo p0) throws Throwable {
    throw __call1155600_0(p0);
}
public static void h1556_1(moom.Oo p0) throws Throwable {
    throw __call1155601_0(p0);
}
private static native long __fieldRead1556_0() throws Throwable;
private static native boolean __call1556_1() throws Throwable;
private static native int __integerCategory1556_2(boolean value) throws Throwable;
private static native moom.v8 __fieldRead1556_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.v8 __fieldRead1556_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1556_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1556_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1556_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1556_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1556_9(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native int __call1556_10(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native int __call1556_11(net.minecraft.entity.passive.EntityHorse a0) throws Throwable;
private static native void __call1556_12(net.minecraft.network.NetHandlerPlayServer a0, moom.Ae a1) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1556_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite1556_14(net.minecraft.entity.player.EntityPlayerMP a0, moom.wh a1) throws Throwable;
private static native moom.v8 __fieldRead1556_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1556_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite1556_17(moom.v8 a0, int a1) throws Throwable;
private static native moom.v8 __fieldRead1556_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1556_19(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call1155600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7c6e99b65919e0e8e90f(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayerMP a1) throws E;
private static final class __SourceHandler_7c6e99b65919e0e8e90f {

public static boolean f1557(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.entity.player.EntityPlayerMP p0) throws Throwable {
    int forwardValue1557_21_0;
    int forwardValue1557_27_0;
    int forwardValue1557_31_0;
    int forwardValue1557_33_0;
    boolean spill1557_0;
    long life2_3;
    int life4_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_27: {
    forward_join_21: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (__fieldRead1557_0() ^ 10416907436126L);
    life4_5 = __integerCategory1557_2(__call1557_1());
    spill1557_0 = __call1557_3(p0);
    if (!((life4_5 == 0))) {
        forwardValue1557_21_0 = __integerCategory1557_4(spill1557_0);
        break forward_join_21;
    }
    if (!(spill1557_0)) {
        break forward_join_19;
    }
    if (!((__call1557_5(receiver) == receiver))) {
        break forward_join_17;
    }
    forwardValue1557_33_0 = 1;
    break forward_join_33;
    }
    forwardValue1557_33_0 = 0;
    break forward_join_33;
    }
    forwardValue1557_21_0 = __integerCategory1557_7(__call1557_6(receiver));
    }
    if (!((life4_5 == 0))) {
        forwardValue1557_27_0 = forwardValue1557_21_0;
        break forward_join_27;
    }
    if (!((forwardValue1557_21_0 == 0))) {
        break forward_join_32;
    }
    forwardValue1557_27_0 = __integerCategory1557_9(__call1557_8(receiver, p0));
    }
    if (!((life4_5 == 0))) {
        forwardValue1557_31_0 = forwardValue1557_27_0;
        break forward_join_31;
    }
    if (!((forwardValue1557_27_0 != 0))) {
        break forward_join_32;
    }
    forwardValue1557_31_0 = 1;
    }
    forwardValue1557_33_0 = forwardValue1557_31_0;
    break forward_join_33;
    }
    forwardValue1557_33_0 = 0;
    }
    return __integerCategory1557_10(forwardValue1557_33_0);
}
public static void h1557_0(moom.Oo p0) throws Throwable {
    throw __call1155700_0(p0);
}
public static void h1557_1(moom.Oo p0) throws Throwable {
    throw __call1155701_0(p0);
}
public static void h1557_2(moom.Oo p0) throws Throwable {
    throw __call1155702_0(p0);
}
public static void h1557_3(moom.Oo p0) throws Throwable {
    throw __call1155703_0(p0);
}
public static void h1557_4(moom.Oo p0) throws Throwable {
    throw __call1155704_0(p0);
}
public static void h1557_5(moom.Oo p0) throws Throwable {
    throw __call1155705_0(p0);
}
private static native long __fieldRead1557_0() throws Throwable;
private static native boolean __call1557_1() throws Throwable;
private static native int __integerCategory1557_2(boolean value) throws Throwable;
private static native boolean __call1557_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1557_4(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __call1557_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1557_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1557_7(boolean value) throws Throwable;
private static native boolean __call1557_8(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native int __integerCategory1557_9(boolean value) throws Throwable;
private static native boolean __integerCategory1557_10(int value) throws Throwable;
private static native java.lang.Throwable __call1155700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155705_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5603ff0a0366d75ec65f(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.inventory.IInventory a1) throws E;
private static final class __SourceHandler_5603ff0a0366d75ec65f {

public static void f1558(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.inventory.IInventory p0) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1558_14_0;
    int forwardValue1558_80_0;
    net.minecraft.entity.player.EntityPlayerMP spill1558_0;
    int spill1558_1;
    boolean spill1558_2;
    boolean spill1558_3;
    boolean spill1558_4;
    long life2_3;
    int life4_5;
    net.minecraft.world.ILockableContainer life5_31;
    forward_join_128: {
    forward_join_119: {
    forward_join_106: {
    forward_join_80: {
    forward_join_74: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead1558_0() ^ 40638375224636L);
    life4_5 = __integerCategory1558_2(__call1558_1());
    spill1558_0 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue1558_14_0 = spill1558_0;
        break forward_join_14;
    }
    if (!((__fieldRead1558_3(spill1558_0) != __fieldRead1558_4(receiver)))) {
        break forward_join_15;
    }
    forwardValue1558_14_0 = receiver;
    }
    __call1558_5(forwardValue1558_14_0);
    }
    spill1558_1 = __instanceOf1558_6(p0);
    if (!((life4_5 == 0))) {
        forwardValue1558_80_0 = spill1558_1;
        break forward_join_80;
    }
    if (!((spill1558_1 != 0))) {
        break forward_join_74;
    }
    life5_31 = __cast1558_7(p0);
    spill1558_2 = __call1558_8(life5_31);
    if (!((life4_5 == 0))) {
        forwardValue1558_80_0 = __integerCategory1558_9(spill1558_2);
        break forward_join_80;
    }
    if (!(spill1558_2)) {
        break forward_join_74;
    }
    spill1558_3 = __call1558_11(receiver, __call1558_10(life5_31));
    if (!((life4_5 == 0))) {
        forwardValue1558_80_0 = __integerCategory1558_12(spill1558_3);
        break forward_join_80;
    }
    if (!((!spill1558_3))) {
        break forward_join_74;
    }
    spill1558_4 = __call1558_13(receiver);
    if (!((life4_5 == 0))) {
        forwardValue1558_80_0 = __integerCategory1558_14(spill1558_4);
        break forward_join_80;
    }
    if (!((!spill1558_4))) {
        break forward_join_74;
    }
    __call1558_17(__fieldRead1558_15(receiver), new moom.zv(new moom.CN("container.isLocked", new java.lang.Object[] {__call1558_16(p0)}), ((byte) 2)));
    __call1558_22(__fieldRead1558_18(receiver), new moom.Aa("random.door_close", __fieldRead1558_19(receiver), __fieldRead1558_20(receiver), __fieldRead1558_21(receiver), 0x1.0p0f, 0x1.0p0f));
    return;
    }
    __call1558_23(receiver);
    if (!((life4_5 == 0))) {
        break forward_join_119;
    }
    forwardValue1558_80_0 = __instanceOf1558_24(p0);
    }
    if (!((forwardValue1558_80_0 != 0))) {
        break forward_join_106;
    }
    __call1558_31(__fieldRead1558_25(receiver), new moom.Ae(__fieldRead1558_26(receiver), __call1558_28(__cast1558_27(p0)), __call1558_29(p0), __call1558_30(p0)));
    __fieldWrite1558_35(receiver, __call1558_34(__cast1558_32(p0), __fieldRead1558_33(receiver), receiver));
    if (!((life4_5 != 0))) {
        break forward_join_128;
    }
    }
    __call1558_40(__fieldRead1558_36(receiver), new moom.Ae(__fieldRead1558_37(receiver), "minecraft:container", __call1558_38(p0), __call1558_39(p0)));
    }
    __fieldWrite1558_42(receiver, new moom.wc(__fieldRead1558_41(receiver), p0, receiver));
    }
    __fieldWrite1558_45(__fieldRead1558_43(receiver), __fieldRead1558_44(receiver));
    __call1558_47(__fieldRead1558_46(receiver), receiver);
    return;
}
public static void h1558_0(moom.Oo p0) throws Throwable {
    throw __call1155800_0(p0);
}
public static void h1558_1(moom.Oo p0) throws Throwable {
    throw __call1155801_0(p0);
}
public static void h1558_2(moom.Oo p0) throws Throwable {
    throw __call1155802_0(p0);
}
public static void h1558_3(moom.Oo p0) throws Throwable {
    throw __call1155803_0(p0);
}
public static void h1558_4(moom.Oo p0) throws Throwable {
    throw __call1155804_0(p0);
}
public static void h1558_5(moom.Oo p0) throws Throwable {
    throw __call1155805_0(p0);
}
public static void h1558_6(moom.Oo p0) throws Throwable {
    throw __call1155806_0(p0);
}
public static void h1558_7(moom.Oo p0) throws Throwable {
    throw __call1155807_0(p0);
}
public static void h1558_8(moom.Oo p0) throws Throwable {
    throw __call1155808_0(p0);
}
public static void h1558_9(moom.Oo p0) throws Throwable {
    throw __call1155809_0(p0);
}
public static void h1558_10(moom.Oo p0) throws Throwable {
    throw __call1155810_0(p0);
}
public static void h1558_11(moom.Oo p0) throws Throwable {
    throw __call1155811_0(p0);
}
private static native long __fieldRead1558_0() throws Throwable;
private static native boolean __call1558_1() throws Throwable;
private static native int __integerCategory1558_2(boolean value) throws Throwable;
private static native moom.v8 __fieldRead1558_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.v8 __fieldRead1558_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1558_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf1558_6(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native net.minecraft.world.ILockableContainer __cast1558_7(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native boolean __call1558_8(net.minecraft.world.ILockableContainer a0) throws Throwable;
private static native int __integerCategory1558_9(boolean value) throws Throwable;
private static native moom.Eq __call1558_10(net.minecraft.world.ILockableContainer a0) throws Throwable;
private static native boolean __call1558_11(net.minecraft.entity.player.EntityPlayerMP a0, moom.Eq a1) throws Throwable;
private static native int __integerCategory1558_12(boolean value) throws Throwable;
private static native boolean __call1558_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1558_14(boolean value) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1558_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1558_16(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native void __call1558_17(net.minecraft.network.NetHandlerPlayServer a0, moom.zv a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1558_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1558_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1558_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1558_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1558_22(net.minecraft.network.NetHandlerPlayServer a0, moom.Aa a1) throws Throwable;
private static native void __call1558_23(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf1558_24(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1558_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1558_26(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.IInteractionObject __cast1558_27(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native java.lang.String __call1558_28(net.minecraft.world.IInteractionObject a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1558_29(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native int __call1558_30(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native void __call1558_31(net.minecraft.network.NetHandlerPlayServer a0, moom.Ae a1) throws Throwable;
private static native net.minecraft.world.IInteractionObject __cast1558_32(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1558_33(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.v8 __call1558_34(net.minecraft.world.IInteractionObject a0, net.minecraft.entity.player.InventoryPlayer a1, net.minecraft.entity.player.EntityPlayerMP a2) throws Throwable;
private static native void __fieldWrite1558_35(net.minecraft.entity.player.EntityPlayerMP a0, moom.v8 a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1558_36(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1558_37(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1558_38(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native int __call1558_39(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native void __call1558_40(net.minecraft.network.NetHandlerPlayServer a0, moom.Ae a1) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1558_41(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite1558_42(net.minecraft.entity.player.EntityPlayerMP a0, moom.wc a1) throws Throwable;
private static native moom.v8 __fieldRead1558_43(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1558_44(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite1558_45(moom.v8 a0, int a1) throws Throwable;
private static native moom.v8 __fieldRead1558_46(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1558_47(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call1155800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155811_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c29a2c2ee93615f4a99a(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.tileentity.TileEntity a1) throws E;
private static final class __SourceHandler_c29a2c2ee93615f4a99a {

public static void f1559(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.tileentity.TileEntity p0) throws Throwable {
    net.minecraft.tileentity.TileEntity forwardValue1559_11_0;
    net.minecraft.tileentity.TileEntity spill1559_0;
    long life2_3;
    int life4_5;
    moom.yK life5_15;
    forward_join_19: {
    forward_join_11: {
    life2_3 = (__fieldRead1559_0() ^ 63581002228704L);
    life4_5 = __integerCategory1559_2(__call1559_1());
    spill1559_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1559_11_0 = spill1559_0;
        break forward_join_11;
    }
    if (!((spill1559_0 != null))) {
        break forward_join_19;
    }
    forwardValue1559_11_0 = p0;
    }
    life5_15 = __call1559_3(forwardValue1559_11_0);
    if (!((life5_15 != null))) {
        break forward_join_19;
    }
    __call1559_5(__fieldRead1559_4(receiver), life5_15);
    }
    return;
}
public static void h1559_0(moom.Oo p0) throws Throwable {
    throw __call1155900_0(p0);
}
public static void h1559_1(moom.Oo p0) throws Throwable {
    throw __call1155901_0(p0);
}
private static native long __fieldRead1559_0() throws Throwable;
private static native boolean __call1559_1() throws Throwable;
private static native int __integerCategory1559_2(boolean value) throws Throwable;
private static native moom.yK __call1559_3(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1559_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1559_5(net.minecraft.network.NetHandlerPlayServer a0, moom.yK a1) throws Throwable;
private static native java.lang.Throwable __call1155900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1155901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4fd7f1318388105a07fc(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.util.DamageSource a1) throws E;
private static final class __SourceHandler_4fd7f1318388105a07fc {

public static void f1560(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.util.DamageSource p0) throws Throwable {
    moom.Bj lexicalValue1560_22_0;
    net.minecraft.scoreboard.Team$EnumVisible lexicalValue1560_30_0;
    net.minecraft.scoreboard.Team$EnumVisible lexicalValue1560_30_1;
    net.minecraft.scoreboard.Team$EnumVisible lexicalValue1560_46_0;
    net.minecraft.scoreboard.Team$EnumVisible lexicalValue1560_46_1;
    int lexicalValue1560_71_0;
    net.minecraft.world.World lexicalValue1560_77_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1560_104_0;
    boolean spill1560_0;
    moom.Bj spill1560_1;
    net.minecraft.scoreboard.Team$EnumVisible spill1560_2;
    net.minecraft.scoreboard.Team$EnumVisible spill1560_3;
    net.minecraft.world.World spill1560_4;
    net.minecraft.entity.player.EntityPlayerMP spill1560_5;
    long life2_3;
    int life4_5;
    moom.Bj life5_19;
    java.util.Iterator life5_114;
    net.minecraft.scoreboard.ScoreObjective life6_121;
    net.minecraft.scoreboard.Score life7_130;
    net.minecraft.entity.EntityLivingBase life5_137;
    net.minecraft.entity.EntityList$EntityEggInfo life6_151;
    lexical_join_136: {
    lexical_join_127: {
    lexical_join_122: {
    lexical_join_104: {
    lexical_join_102: {
    lexical_join_77: {
    lexical_join_75: {
    lexical_join_71: {
    lexical_join_64: {
    lexical_join_57: {
    lexical_join_46: {
    lexical_join_43: {
    lexical_join_30: {
    lexical_join_22: {
    life2_3 = (__fieldRead1560_0() ^ 140680781687098L);
    life4_5 = __integerCategory1560_2(__call1560_1());
    spill1560_0 = __call1560_5(__call1560_4(__fieldRead1560_3(receiver)), "showDeathMessages");
    if (!((life4_5 != 0))) {
        lexicalValue1560_71_0 = __integerCategory1560_6(spill1560_0);
        break lexical_join_71;
    }
    if (!(spill1560_0)) {
        break lexical_join_64;
    }
    life5_19 = __call1560_7(receiver);
    spill1560_1 = life5_19;
    if (!((life4_5 != 0))) {
        lexicalValue1560_22_0 = spill1560_1;
        break lexical_join_22;
    }
    if (!((spill1560_1 != null))) {
        break lexical_join_57;
    }
    lexicalValue1560_22_0 = life5_19;
    }
    spill1560_2 = __call1560_8(lexicalValue1560_22_0);
    spill1560_3 = __fieldRead1560_9();
    if (!((life4_5 != 0))) {
        lexicalValue1560_30_0 = spill1560_2;
        lexicalValue1560_30_1 = spill1560_3;
        break lexical_join_30;
    }
    if (!((spill1560_2 != spill1560_3))) {
        break lexical_join_57;
    }
    lexicalValue1560_30_0 = __call1560_10(life5_19);
    lexicalValue1560_30_1 = __fieldRead1560_11();
    }
    if (!((life4_5 != 0))) {
        lexicalValue1560_46_0 = lexicalValue1560_30_0;
        lexicalValue1560_46_1 = lexicalValue1560_30_1;
        break lexical_join_46;
    }
    if (!((lexicalValue1560_30_0 == lexicalValue1560_30_1))) {
        break lexical_join_43;
    }
    __call1560_16(__call1560_13(__fieldRead1560_12(receiver)), receiver, __call1560_15(__call1560_14(receiver)));
    if (!((life4_5 == 0))) {
        break lexical_join_64;
    }
    }
    lexicalValue1560_46_0 = __call1560_17(life5_19);
    lexicalValue1560_46_1 = __fieldRead1560_18();
    }
    if (!((lexicalValue1560_46_0 == lexicalValue1560_46_1))) {
        break lexical_join_64;
    }
    __call1560_23(__call1560_20(__fieldRead1560_19(receiver)), receiver, __call1560_22(__call1560_21(receiver)));
    if (!((life4_5 == 0))) {
        break lexical_join_64;
    }
    }
    __call1560_28(__call1560_25(__fieldRead1560_24(receiver)), __call1560_27(__call1560_26(receiver)));
    }
    spill1560_4 = __fieldRead1560_29(receiver);
    if (!((life4_5 != 0))) {
        lexicalValue1560_77_0 = spill1560_4;
        break lexical_join_77;
    }
    lexicalValue1560_71_0 = __integerCategory1560_32(__call1560_31(__call1560_30(spill1560_4), "keepInventory"));
    }
    if (!((lexicalValue1560_71_0 == 0))) {
        break lexical_join_75;
    }
    __call1560_34(__fieldRead1560_33(receiver));
    }
    lexicalValue1560_77_0 = __fieldRead1560_35(receiver);
    }
    life5_114 = __call1560_39(__call1560_38(__call1560_36(lexicalValue1560_77_0), __fieldRead1560_37()));
    lexical_cycle_82: while (true) {
    if (!(__call1560_40(life5_114))) {
        break lexical_join_102;
    }
    life6_121 = __cast1560_42(__call1560_41(life5_114));
    spill1560_5 = receiver;
    if (!((life4_5 != 0))) {
        lexicalValue1560_104_0 = spill1560_5;
        break lexical_join_104;
    }
    life7_130 = __call1560_45(__call1560_43(spill1560_5), __call1560_44(receiver), life6_121);
    __call1560_46(life7_130);
    if (!((life4_5 == 0))) { continue lexical_cycle_82; }
    break lexical_cycle_82;
    }
    }
    lexicalValue1560_104_0 = __call1560_47(receiver);
    }
    life5_137 = lexicalValue1560_104_0;
    if (!((life4_5 != 0))) {
        break lexical_join_136;
    }
    if (!((life5_137 != null))) {
        break lexical_join_127;
    }
    life6_151 = __cast1560_52(__call1560_51(__fieldRead1560_48(), __call1560_50(__call1560_49(life5_137))));
    if (!((life6_151 != null))) {
        break lexical_join_122;
    }
    __call1560_54(receiver, __fieldRead1560_53(life6_151));
    }
    __call1560_56(life5_137, receiver, __fieldRead1560_55(receiver));
    }
    __call1560_58(receiver, __fieldRead1560_57());
    __call1560_60(receiver, __fieldRead1560_59());
    __call1560_62(__call1560_61(receiver));
    }
    return;
}
public static void h1560_0(moom.Oo p0) throws Throwable {
    throw __call1156000_0(p0);
}
public static void h1560_1(moom.Oo p0) throws Throwable {
    throw __call1156001_0(p0);
}
public static void h1560_2(moom.Oo p0) throws Throwable {
    throw __call1156002_0(p0);
}
public static void h1560_3(moom.Oo p0) throws Throwable {
    throw __call1156003_0(p0);
}
public static void h1560_4(moom.Oo p0) throws Throwable {
    throw __call1156004_0(p0);
}
public static void h1560_5(moom.Oo p0) throws Throwable {
    throw __call1156005_0(p0);
}
public static void h1560_6(moom.Oo p0) throws Throwable {
    throw __call1156006_0(p0);
}
public static void h1560_7(moom.Oo p0) throws Throwable {
    throw __call1156007_0(p0);
}
public static void h1560_8(moom.Oo p0) throws Throwable {
    throw __call1156008_0(p0);
}
public static void h1560_9(moom.Oo p0) throws Throwable {
    throw __call1156009_0(p0);
}
public static void h1560_10(moom.Oo p0) throws Throwable {
    throw __call1156010_0(p0);
}
public static void h1560_11(moom.Oo p0) throws Throwable {
    throw __call1156011_0(p0);
}
public static void h1560_12(moom.Oo p0) throws Throwable {
    throw __call1156012_0(p0);
}
private static native long __fieldRead1560_0() throws Throwable;
private static native boolean __call1560_1() throws Throwable;
private static native int __integerCategory1560_2(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1560_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.GameRules __call1560_4(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1560_5(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1560_6(boolean value) throws Throwable;
private static native moom.Bj __call1560_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call1560_8(moom.Bj a0) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __fieldRead1560_9() throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call1560_10(moom.Bj a0) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __fieldRead1560_11() throws Throwable;
private static native moom.Bl __fieldRead1560_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1560_13(moom.Bl a0) throws Throwable;
private static native net.minecraft.util.CombatTracker __call1560_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1560_15(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native void __call1560_16(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.util.IChatComponent a2) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call1560_17(moom.Bj a0) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __fieldRead1560_18() throws Throwable;
private static native moom.Bl __fieldRead1560_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1560_20(moom.Bl a0) throws Throwable;
private static native net.minecraft.util.CombatTracker __call1560_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1560_22(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native void __call1560_23(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.util.IChatComponent a2) throws Throwable;
private static native moom.Bl __fieldRead1560_24(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1560_25(moom.Bl a0) throws Throwable;
private static native net.minecraft.util.CombatTracker __call1560_26(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1560_27(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native void __call1560_28(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1560_29(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.GameRules __call1560_30(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1560_31(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1560_32(boolean value) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1560_33(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1560_34(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1560_35(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1560_36(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __fieldRead1560_37() throws Throwable;
private static native java.util.Collection __call1560_38(net.minecraft.scoreboard.Scoreboard a0, net.minecraft.scoreboard.IScoreObjectiveCriteria a1) throws Throwable;
private static native java.util.Iterator __call1560_39(java.util.Collection a0) throws Throwable;
private static native boolean __call1560_40(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1560_41(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast1560_42(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1560_43(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __call1560_44(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call1560_45(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native void __call1560_46(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __call1560_47(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.Map __fieldRead1560_48() throws Throwable;
private static native int __call1560_49(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.Integer __call1560_50(int a0) throws Throwable;
private static native java.lang.Object __call1560_51(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native net.minecraft.entity.EntityList$EntityEggInfo __cast1560_52(java.lang.Object a0) throws Throwable;
private static native moom.BY __fieldRead1560_53(net.minecraft.entity.EntityList$EntityEggInfo a0) throws Throwable;
private static native void __call1560_54(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1) throws Throwable;
private static native int __fieldRead1560_55(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1560_56(net.minecraft.entity.EntityLivingBase a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native moom.BY __fieldRead1560_57() throws Throwable;
private static native void __call1560_58(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1) throws Throwable;
private static native moom.BY __fieldRead1560_59() throws Throwable;
private static native void __call1560_60(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1) throws Throwable;
private static native net.minecraft.util.CombatTracker __call1560_61(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1560_62(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native java.lang.Throwable __call1156000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156012_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4a4593f2c87d16768244(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.world.WorldSettings$GameType a1) throws E;
private static final class __SourceHandler_4a4593f2c87d16768244 {

public static void f1561(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.world.WorldSettings$GameType p0) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1561_31_0;
    boolean spill1561_0;
    net.minecraft.entity.player.EntityPlayerMP spill1561_1;
    long life2_3;
    int life4_9;
    forward_join_33: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (__fieldRead1561_0() ^ 11545365754444L);
    spill1561_0 = __call1561_1();
    __call1561_3(__fieldRead1561_2(receiver), p0);
    life4_9 = __integerCategory1561_4(spill1561_0);
    spill1561_1 = receiver;
    if (!((life4_9 == 0))) {
        forwardValue1561_31_0 = spill1561_1;
        break forward_join_31;
    }
    __call1561_7(__fieldRead1561_5(spill1561_1), new moom.Ac(3, ((float) __call1561_6(p0))));
    if (!((p0 == __fieldRead1561_8()))) {
        break forward_join_30;
    }
    __call1561_9(receiver, null);
    if (!((life4_9 != 0))) {
        break forward_join_33;
    }
    }
    forwardValue1561_31_0 = receiver;
    }
    __call1561_10(forwardValue1561_31_0, receiver);
    }
    __call1561_11(receiver);
    __call1561_12(receiver);
    return;
}
public static void h1561_0(moom.Oo p0) throws Throwable {
    throw __call1156100_0(p0);
}
public static void h1561_1(moom.Oo p0) throws Throwable {
    throw __call1156101_0(p0);
}
public static void h1561_2(moom.Oo p0) throws Throwable {
    throw __call1156102_0(p0);
}
private static native long __fieldRead1561_0() throws Throwable;
private static native boolean __call1561_1() throws Throwable;
private static native moom.Bo __fieldRead1561_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1561_3(moom.Bo a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native int __integerCategory1561_4(boolean value) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1561_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1561_6(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native void __call1561_7(net.minecraft.network.NetHandlerPlayServer a0, moom.Ac a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1561_8() throws Throwable;
private static native void __call1561_9(net.minecraft.entity.player.EntityPlayerMP a0, java.lang.Object a1) throws Throwable;
private static native void __call1561_10(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native void __call1561_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1561_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.Throwable __call1156100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f183a7a797bebe2e96a0(net.minecraft.entity.player.EntityPlayerMP a0, boolean a1, boolean a2, boolean a3) throws E;
private static final class __SourceHandler_f183a7a797bebe2e96a0 {

public static void f1562(net.minecraft.entity.player.EntityPlayerMP receiver, boolean p0, boolean p1, boolean p2) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1562_27_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue1562_33_0;
    net.minecraft.entity.player.EntityPlayerMP spill1562_0;
    net.minecraft.network.NetHandlerPlayServer spill1562_1;
    long life4_3;
    int life6_5;
    forward_join_44: {
    forward_join_33: {
    forward_join_27: {
    forward_join_21: {
    life4_3 = (__fieldRead1562_0() ^ 136642337192458L);
    life6_5 = __integerCategory1562_2(__call1562_1());
    spill1562_0 = receiver;
    if (!((life6_5 == 0))) {
        forwardValue1562_27_0 = spill1562_0;
        break forward_join_27;
    }
    if (!(__call1562_3(spill1562_0))) {
        break forward_join_21;
    }
    __call1562_6(__call1562_5(__call1562_4(receiver)), receiver, new moom.zE(receiver, 2));
    }
    __call1562_7(receiver, p0, p1, p2);
    forwardValue1562_27_0 = receiver;
    }
    spill1562_1 = __fieldRead1562_8(forwardValue1562_27_0);
    if (!((life6_5 == 0))) {
        forwardValue1562_33_0 = spill1562_1;
        break forward_join_33;
    }
    if (!((spill1562_1 != null))) {
        break forward_join_44;
    }
    forwardValue1562_33_0 = __fieldRead1562_9(receiver);
    }
    __call1562_15(forwardValue1562_33_0, __fieldRead1562_10(receiver), __fieldRead1562_11(receiver), __fieldRead1562_12(receiver), __fieldRead1562_13(receiver), __fieldRead1562_14(receiver));
    }
    return;
}
public static void h1562_0(moom.Oo p0) throws Throwable {
    throw __call1156200_0(p0);
}
public static void h1562_1(moom.Oo p0) throws Throwable {
    throw __call1156201_0(p0);
}
public static void h1562_2(moom.Oo p0) throws Throwable {
    throw __call1156202_0(p0);
}
public static void h1562_3(moom.Oo p0) throws Throwable {
    throw __call1156203_0(p0);
}
private static native long __fieldRead1562_0() throws Throwable;
private static native boolean __call1562_1() throws Throwable;
private static native int __integerCategory1562_2(boolean value) throws Throwable;
private static native boolean __call1562_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1562_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.EntityTracker __call1562_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1562_6(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.zE a2) throws Throwable;
private static native void __call1562_7(net.minecraft.entity.player.EntityPlayerMP a0, boolean a1, boolean a2, boolean a3) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1562_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1562_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1562_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1562_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1562_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead1562_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead1562_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1562_15(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native java.lang.Throwable __call1156200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7309d21a1849f4c82010(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_7309d21a1849f4c82010 {

public static boolean f1563(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int forwardValue1563_14_0;
    int forwardValue1563_18_0;
    int forwardValue1563_20_0;
    boolean spill1563_0;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life2_3 = (__fieldRead1563_0() ^ 89438725519652L);
    life4_5 = __integerCategory1563_2(__call1563_1());
    spill1563_0 = __call1563_3(receiver);
    if (!((life4_5 == 0))) {
        forwardValue1563_14_0 = __integerCategory1563_4(spill1563_0);
        break forward_join_14;
    }
    if (!(spill1563_0)) {
        break forward_join_19;
    }
    forwardValue1563_14_0 = __integerCategory1563_6(__call1563_5(receiver, p0));
    }
    if (!((life4_5 == 0))) {
        forwardValue1563_18_0 = forwardValue1563_14_0;
        break forward_join_18;
    }
    if (!((forwardValue1563_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue1563_18_0 = 1;
    }
    forwardValue1563_20_0 = forwardValue1563_18_0;
    break forward_join_20;
    }
    forwardValue1563_20_0 = 0;
    }
    return __integerCategory1563_7(forwardValue1563_20_0);
}
public static void h1563_0(moom.Oo p0) throws Throwable {
    throw __call1156300_0(p0);
}
public static void h1563_1(moom.Oo p0) throws Throwable {
    throw __call1156301_0(p0);
}
public static void h1563_2(moom.Oo p0) throws Throwable {
    throw __call1156302_0(p0);
}
private static native long __fieldRead1563_0() throws Throwable;
private static native boolean __call1563_1() throws Throwable;
private static native int __integerCategory1563_2(boolean value) throws Throwable;
private static native boolean __call1563_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1563_4(boolean value) throws Throwable;
private static native boolean __call1563_5(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native int __integerCategory1563_6(boolean value) throws Throwable;
private static native boolean __integerCategory1563_7(int value) throws Throwable;
private static native java.lang.Throwable __call1156300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_849713f6b7a32f80916b(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.util.DamageSource a1, float a2) throws E;
private static final class __SourceHandler_849713f6b7a32f80916b {

public static boolean f1564(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.util.DamageSource p0, float p1) throws Throwable {
    int forwardValue1564_17_0;
    int forwardValue1564_22_0;
    int forwardValue1564_29_0;
    int forwardValue1564_33_0;
    int forwardValue1564_35_0;
    net.minecraft.util.DamageSource forwardValue1564_53_0;
    int forwardValue1564_54_0;
    int forwardValue1564_76_0;
    int forwardValue1564_102_0;
    boolean spill1564_0;
    int spill1564_1;
    int spill1564_2;
    net.minecraft.util.DamageSource spill1564_3;
    int spill1564_4;
    boolean spill1564_5;
    int spill1564_6;
    boolean spill1564_7;
    long life3_3;
    int life5_5;
    int life6_55;
    net.minecraft.entity.Entity life7_99;
    net.minecraft.entity.projectile.EntityArrow life8_135;
    forward_join_102: {
    forward_join_98: {
    forward_join_76: {
    forward_join_74: {
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_22: {
    forward_join_17: {
    forward_join_14: {
    life3_3 = (__fieldRead1564_0() ^ 69714667833539L);
    life5_5 = __integerCategory1564_2(__call1564_1());
    spill1564_0 = __call1564_3(receiver, p0);
    if (!((life5_5 == 0))) {
        forwardValue1564_17_0 = __integerCategory1564_4(spill1564_0);
        break forward_join_17;
    }
    if (!(spill1564_0)) {
        break forward_join_14;
    }
    return __integerCategory1564_5(0);
    }
    forwardValue1564_17_0 = __integerCategory1564_8(__call1564_7(__fieldRead1564_6(receiver)));
    }
    if (!((life5_5 == 0))) {
        forwardValue1564_22_0 = forwardValue1564_17_0;
        break forward_join_22;
    }
    if (!((forwardValue1564_17_0 != 0))) {
        break forward_join_34;
    }
    forwardValue1564_22_0 = __integerCategory1564_10(__call1564_9(receiver));
    }
    if (!((life5_5 == 0))) {
        forwardValue1564_29_0 = forwardValue1564_22_0;
        break forward_join_29;
    }
    if (!((forwardValue1564_22_0 != 0))) {
        break forward_join_34;
    }
    forwardValue1564_29_0 = __integerCategory1564_13(__call1564_12("fall", __fieldRead1564_11(p0)));
    }
    if (!((life5_5 == 0))) {
        forwardValue1564_33_0 = forwardValue1564_29_0;
        break forward_join_33;
    }
    if (!((forwardValue1564_29_0 != 0))) {
        break forward_join_34;
    }
    forwardValue1564_33_0 = 1;
    }
    forwardValue1564_35_0 = forwardValue1564_33_0;
    break forward_join_35;
    }
    forwardValue1564_35_0 = 0;
    }
    life6_55 = forwardValue1564_35_0;
    spill1564_1 = life6_55;
    if (!((life5_5 == 0))) {
        forwardValue1564_54_0 = spill1564_1;
        break forward_join_54;
    }
    if (!((spill1564_1 == 0))) {
        break forward_join_52;
    }
    spill1564_2 = __fieldRead1564_14(receiver);
    if (!((life5_5 == 0))) {
        forwardValue1564_54_0 = spill1564_2;
        break forward_join_54;
    }
    if (!((spill1564_2 > 0))) {
        break forward_join_52;
    }
    spill1564_3 = p0;
    if (!((life5_5 == 0))) {
        forwardValue1564_53_0 = spill1564_3;
        break forward_join_53;
    }
    if (!((spill1564_3 != __fieldRead1564_15()))) {
        break forward_join_52;
    }
    return __integerCategory1564_16(0);
    }
    forwardValue1564_53_0 = p0;
    }
    forwardValue1564_54_0 = __instanceOf1564_17(forwardValue1564_53_0);
    }
    if (!((life5_5 == 0))) {
        forwardValue1564_102_0 = forwardValue1564_54_0;
        break forward_join_102;
    }
    if (!((forwardValue1564_54_0 != 0))) {
        break forward_join_98;
    }
    life7_99 = __call1564_18(p0);
    spill1564_4 = __instanceOf1564_19(life7_99);
    if (!((life5_5 == 0))) {
        forwardValue1564_76_0 = spill1564_4;
        break forward_join_76;
    }
    if (!((spill1564_4 != 0))) {
        break forward_join_74;
    }
    spill1564_5 = __call1564_21(receiver, __cast1564_20(life7_99));
    if (!((life5_5 == 0))) {
        forwardValue1564_76_0 = __integerCategory1564_22(spill1564_5);
        break forward_join_76;
    }
    if (!((!spill1564_5))) {
        break forward_join_74;
    }
    return __integerCategory1564_23(0);
    }
    forwardValue1564_76_0 = __instanceOf1564_24(life7_99);
    }
    if (!((life5_5 == 0))) {
        forwardValue1564_102_0 = forwardValue1564_76_0;
        break forward_join_102;
    }
    if (!((forwardValue1564_76_0 != 0))) {
        break forward_join_98;
    }
    life8_135 = __cast1564_25(life7_99);
    spill1564_6 = __instanceOf1564_27(__fieldRead1564_26(life8_135));
    if (!((life5_5 == 0))) {
        forwardValue1564_102_0 = spill1564_6;
        break forward_join_102;
    }
    if (!((spill1564_6 != 0))) {
        break forward_join_98;
    }
    spill1564_7 = __call1564_30(receiver, __cast1564_29(__fieldRead1564_28(life8_135)));
    if (!((life5_5 == 0))) {
        forwardValue1564_102_0 = __integerCategory1564_31(spill1564_7);
        break forward_join_102;
    }
    if (!((!spill1564_7))) {
        break forward_join_98;
    }
    return __integerCategory1564_32(0);
    }
    forwardValue1564_102_0 = __integerCategory1564_34(__call1564_33(receiver, p0, p1));
    }
    return __integerCategory1564_35(forwardValue1564_102_0);
}
public static void h1564_0(moom.Oo p0) throws Throwable {
    throw __call1156400_0(p0);
}
public static void h1564_1(moom.Oo p0) throws Throwable {
    throw __call1156401_0(p0);
}
public static void h1564_2(moom.Oo p0) throws Throwable {
    throw __call1156402_0(p0);
}
public static void h1564_3(moom.Oo p0) throws Throwable {
    throw __call1156403_0(p0);
}
public static void h1564_4(moom.Oo p0) throws Throwable {
    throw __call1156404_0(p0);
}
public static void h1564_5(moom.Oo p0) throws Throwable {
    throw __call1156405_0(p0);
}
public static void h1564_6(moom.Oo p0) throws Throwable {
    throw __call1156406_0(p0);
}
public static void h1564_7(moom.Oo p0) throws Throwable {
    throw __call1156407_0(p0);
}
public static void h1564_8(moom.Oo p0) throws Throwable {
    throw __call1156408_0(p0);
}
public static void h1564_9(moom.Oo p0) throws Throwable {
    throw __call1156409_0(p0);
}
public static void h1564_10(moom.Oo p0) throws Throwable {
    throw __call1156410_0(p0);
}
public static void h1564_11(moom.Oo p0) throws Throwable {
    throw __call1156411_0(p0);
}
public static void h1564_12(moom.Oo p0) throws Throwable {
    throw __call1156412_0(p0);
}
public static void h1564_13(moom.Oo p0) throws Throwable {
    throw __call1156413_0(p0);
}
public static void h1564_14(moom.Oo p0) throws Throwable {
    throw __call1156414_0(p0);
}
public static void h1564_15(moom.Oo p0) throws Throwable {
    throw __call1156415_0(p0);
}
public static void h1564_16(moom.Oo p0) throws Throwable {
    throw __call1156416_0(p0);
}
public static void h1564_17(moom.Oo p0) throws Throwable {
    throw __call1156417_0(p0);
}
public static void h1564_18(moom.Oo p0) throws Throwable {
    throw __call1156418_0(p0);
}
public static void h1564_19(moom.Oo p0) throws Throwable {
    throw __call1156419_0(p0);
}
public static void h1564_20(moom.Oo p0) throws Throwable {
    throw __call1156420_0(p0);
}
public static void h1564_21(moom.Oo p0) throws Throwable {
    throw __call1156421_0(p0);
}
public static void h1564_22(moom.Oo p0) throws Throwable {
    throw __call1156422_0(p0);
}
private static native long __fieldRead1564_0() throws Throwable;
private static native boolean __call1564_1() throws Throwable;
private static native int __integerCategory1564_2(boolean value) throws Throwable;
private static native boolean __call1564_3(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.util.DamageSource a1) throws Throwable;
private static native int __integerCategory1564_4(boolean value) throws Throwable;
private static native boolean __integerCategory1564_5(int value) throws Throwable;
private static native moom.Bl __fieldRead1564_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1564_7(moom.Bl a0) throws Throwable;
private static native int __integerCategory1564_8(boolean value) throws Throwable;
private static native boolean __call1564_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1564_10(boolean value) throws Throwable;
private static native java.lang.String __fieldRead1564_11(net.minecraft.util.DamageSource a0) throws Throwable;
private static native boolean __call1564_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1564_13(boolean value) throws Throwable;
private static native int __fieldRead1564_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead1564_15() throws Throwable;
private static native boolean __integerCategory1564_16(int value) throws Throwable;
private static native int __instanceOf1564_17(net.minecraft.util.DamageSource a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1564_18(net.minecraft.util.DamageSource a0) throws Throwable;
private static native int __instanceOf1564_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1564_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1564_21(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native int __integerCategory1564_22(boolean value) throws Throwable;
private static native boolean __integerCategory1564_23(int value) throws Throwable;
private static native int __instanceOf1564_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.projectile.EntityArrow __cast1564_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1564_26(net.minecraft.entity.projectile.EntityArrow a0) throws Throwable;
private static native int __instanceOf1564_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1564_28(net.minecraft.entity.projectile.EntityArrow a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1564_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1564_30(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native int __integerCategory1564_31(boolean value) throws Throwable;
private static native boolean __integerCategory1564_32(int value) throws Throwable;
private static native boolean __call1564_33(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.util.DamageSource a1, float a2) throws Throwable;
private static native int __integerCategory1564_34(boolean value) throws Throwable;
private static native boolean __integerCategory1564_35(int value) throws Throwable;
private static native java.lang.Throwable __call1156400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156417_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156418_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156419_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156420_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156421_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156422_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d0218e9cd84a7634f105(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_d0218e9cd84a7634f105 {

public static void f1565(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1565_16_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue1565_21_0;
    net.minecraft.entity.player.EntityPlayerMP spill1565_0;
    long life1_3;
    int life3_5;
    forward_join_25: {
    forward_join_21: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead1565_0() ^ 135824803931301L);
    life3_5 = __integerCategory1565_2(__call1565_1());
    spill1565_0 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue1565_16_0 = spill1565_0;
        break forward_join_16;
    }
    if (!((__fieldRead1565_3(spill1565_0) != null))) {
        break forward_join_15;
    }
    __call1565_5(__fieldRead1565_4(receiver), receiver);
    }
    forwardValue1565_16_0 = receiver;
    }
    if (!((life3_5 == 0))) {
        forwardValue1565_21_0 = forwardValue1565_16_0;
        break forward_join_21;
    }
    if (!(__fieldRead1565_6(forwardValue1565_16_0))) {
        break forward_join_25;
    }
    forwardValue1565_21_0 = receiver;
    }
    __call1565_7(forwardValue1565_21_0, 1, 0, 0);
    }
    return;
}
public static void h1565_0(moom.Oo p0) throws Throwable {
    throw __call1156500_0(p0);
}
public static void h1565_1(moom.Oo p0) throws Throwable {
    throw __call1156501_0(p0);
}
public static void h1565_2(moom.Oo p0) throws Throwable {
    throw __call1156502_0(p0);
}
public static void h1565_3(moom.Oo p0) throws Throwable {
    throw __call1156503_0(p0);
}
private static native long __fieldRead1565_0() throws Throwable;
private static native boolean __call1565_1() throws Throwable;
private static native int __integerCategory1565_2(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1565_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1565_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1565_5(net.minecraft.entity.Entity a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native boolean __fieldRead1565_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1565_7(net.minecraft.entity.player.EntityPlayerMP a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1156500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_05cbdcaa98a3eedcd87a(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1) throws E;
private static final class __SourceHandler_05cbdcaa98a3eedcd87a {

public static void f1566(net.minecraft.entity.player.EntityPlayerMP receiver, moom.BY p0) throws Throwable {
    net.minecraft.stats.StatisticsFile lexicalValue1566_50_0;
    net.minecraft.stats.StatisticsFile spill1566_0;
    long life2_3;
    int life4_5;
    java.util.Iterator life5_28;
    net.minecraft.scoreboard.ScoreObjective life6_35;
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_42: {
    lexical_join_16: {
    life2_3 = (__fieldRead1566_0() ^ 28892813555725L);
    life4_5 = __integerCategory1566_2(__call1566_1());
    if (!((life4_5 == 0))) {
        break lexical_join_16;
    }
    if (!((p0 != null))) {
        break lexical_join_52;
    }
    __call1566_4(__fieldRead1566_3(receiver), receiver, p0, 0);
    }
    life5_28 = __call1566_8(__call1566_7(__call1566_5(receiver), __call1566_6(p0)));
    lexical_cycle_23: while (true) {
    if (!(__call1566_9(life5_28))) {
        break lexical_join_42;
    }
    life6_35 = __cast1566_11(__call1566_10(life5_28));
    __call1566_15(__call1566_14(__call1566_12(receiver), __call1566_13(receiver), life6_35), 0);
    if (!((life4_5 == 0))) {
        break lexical_join_52;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    spill1566_0 = __fieldRead1566_16(receiver);
    if (!((life4_5 == 0))) {
        lexicalValue1566_50_0 = spill1566_0;
        break lexical_join_50;
    }
    if (!(__call1566_17(spill1566_0))) {
        break lexical_join_52;
    }
    lexicalValue1566_50_0 = __fieldRead1566_18(receiver);
    }
    __call1566_19(lexicalValue1566_50_0, receiver);
    }
    return;
}
public static void h1566_0(moom.Oo p0) throws Throwable {
    throw __call1156600_0(p0);
}
public static void h1566_1(moom.Oo p0) throws Throwable {
    throw __call1156601_0(p0);
}
public static void h1566_2(moom.Oo p0) throws Throwable {
    throw __call1156602_0(p0);
}
public static void h1566_3(moom.Oo p0) throws Throwable {
    throw __call1156603_0(p0);
}
public static void h1566_4(moom.Oo p0) throws Throwable {
    throw __call1156604_0(p0);
}
private static native long __fieldRead1566_0() throws Throwable;
private static native boolean __call1566_1() throws Throwable;
private static native int __integerCategory1566_2(boolean value) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __fieldRead1566_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1566_4(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.BY a2, int a3) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1566_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call1566_6(moom.BY a0) throws Throwable;
private static native java.util.Collection __call1566_7(net.minecraft.scoreboard.Scoreboard a0, net.minecraft.scoreboard.IScoreObjectiveCriteria a1) throws Throwable;
private static native java.util.Iterator __call1566_8(java.util.Collection a0) throws Throwable;
private static native boolean __call1566_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1566_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast1566_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1566_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __call1566_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call1566_14(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native void __call1566_15(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __fieldRead1566_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1566_17(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __fieldRead1566_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1566_19(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call1156600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156604_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_47decd23d21223fb9fac(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_47decd23d21223fb9fac {

public static void f1567(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.entity.Entity p0) throws Throwable {
    long life2_3;
    net.minecraft.entity.Entity life5_6;
    int life4_11;
    forward_join_40: {
    forward_join_27: {
    life2_3 = (__fieldRead1567_0() ^ 53260276418575L);
    life5_6 = __fieldRead1567_1(receiver);
    boolean spill1567_0 = __call1567_2();
    __call1567_3(receiver, p0);
    life4_11 = __integerCategory1567_4(spill1567_0);
    if (!((life4_11 != 0))) { break forward_join_27; }
    if (!((p0 != life5_6))) { break forward_join_40; }
    __call1567_7(__fieldRead1567_5(receiver), new moom.zU(0, receiver, __fieldRead1567_6(receiver)));
    }
    __call1567_14(__fieldRead1567_8(receiver), __fieldRead1567_9(receiver), __fieldRead1567_10(receiver), __fieldRead1567_11(receiver), __fieldRead1567_12(receiver), __fieldRead1567_13(receiver));
    }
    return;
}
public static void h1567_0(moom.Oo p0) throws Throwable {
    throw __call1156700_0(p0);
}
public static void h1567_1(moom.Oo p0) throws Throwable {
    throw __call1156701_0(p0);
}
private static native long __fieldRead1567_0() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1567_1(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1567_2() throws Throwable;
private static native void __call1567_3(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1567_4(boolean value) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1567_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1567_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1567_7(net.minecraft.network.NetHandlerPlayServer a0, moom.zU a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1567_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1567_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1567_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1567_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead1567_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __fieldRead1567_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1567_14(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native java.lang.Throwable __call1156700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_23055801733673d9dc59(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.item.ItemStack a1, int a2) throws E;
private static final class __SourceHandler_23055801733673d9dc59 {

public static void f1568(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.item.ItemStack p0, int p1) throws Throwable {
    net.minecraft.item.ItemStack forwardValue1568_15_0;
    net.minecraft.item.Item forwardValue1568_21_0;
    boolean spill1568_0;
    net.minecraft.item.ItemStack spill1568_1;
    net.minecraft.item.Item spill1568_2;
    long life3_3;
    int life5_9;
    forward_join_35: {
    forward_join_21: {
    forward_join_15: {
    life3_3 = (__fieldRead1568_0() ^ 67213212697667L);
    spill1568_0 = __call1568_1();
    __call1568_2(receiver, p0, p1);
    life5_9 = __integerCategory1568_3(spill1568_0);
    spill1568_1 = p0;
    if (!((life5_9 != 0))) {
        forwardValue1568_15_0 = spill1568_1;
        break forward_join_15;
    }
    if (!((spill1568_1 != null))) {
        break forward_join_35;
    }
    forwardValue1568_15_0 = p0;
    }
    spill1568_2 = __call1568_4(forwardValue1568_15_0);
    if (!((life5_9 != 0))) {
        forwardValue1568_21_0 = spill1568_2;
        break forward_join_21;
    }
    if (!((spill1568_2 != null))) {
        break forward_join_35;
    }
    forwardValue1568_21_0 = __call1568_5(p0);
    }
    if (!((__call1568_6(forwardValue1568_21_0, p0) == __fieldRead1568_7()))) {
        break forward_join_35;
    }
    __call1568_10(__call1568_9(__call1568_8(receiver)), receiver, new moom.zE(receiver, 3));
    }
    return;
}
public static void h1568_0(moom.Oo p0) throws Throwable {
    throw __call1156800_0(p0);
}
public static void h1568_1(moom.Oo p0) throws Throwable {
    throw __call1156801_0(p0);
}
public static void h1568_2(moom.Oo p0) throws Throwable {
    throw __call1156802_0(p0);
}
public static void h1568_3(moom.Oo p0) throws Throwable {
    throw __call1156803_0(p0);
}
private static native long __fieldRead1568_0() throws Throwable;
private static native boolean __call1568_1() throws Throwable;
private static native void __call1568_2(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native int __integerCategory1568_3(boolean value) throws Throwable;
private static native net.minecraft.item.Item __call1568_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __call1568_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.a1 __call1568_6(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native moom.a1 __fieldRead1568_7() throws Throwable;
private static native net.minecraft.world.WorldServer __call1568_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.EntityTracker __call1568_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1568_10(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.zE a2) throws Throwable;
private static native java.lang.Throwable __call1156800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156803_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_d9116bbb24f12349b59f(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_d9116bbb24f12349b59f {

public static net.minecraft.entity.Entity f1569(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1569_14_0;
    net.minecraft.entity.Entity forwardValue1569_15_0;
    net.minecraft.entity.player.EntityPlayerMP spill1569_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead1569_0() ^ 62850179726252L);
    life3_5 = __integerCategory1569_2(__call1569_1());
    spill1569_0 = receiver;
    if (!((life3_5 != 0))) {
        forwardValue1569_14_0 = spill1569_0;
        break forward_join_14;
    }
    if (!((__fieldRead1569_3(spill1569_0) == null))) {
        break forward_join_13;
    }
    forwardValue1569_15_0 = receiver;
    break forward_join_15;
    }
    forwardValue1569_14_0 = receiver;
    }
    forwardValue1569_15_0 = __fieldRead1569_4(forwardValue1569_14_0);
    }
    return forwardValue1569_15_0;
}
public static void h1569_0(moom.Oo p0) throws Throwable {
    throw __call1156900_0(p0);
}
public static void h1569_1(moom.Oo p0) throws Throwable {
    throw __call1156901_0(p0);
}
private static native long __fieldRead1569_0() throws Throwable;
private static native boolean __call1569_1() throws Throwable;
private static native int __integerCategory1569_2(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1569_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1569_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.Throwable __call1156900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1156901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_20e237c767e43e8c0c3a(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_20e237c767e43e8c0c3a {

public static void f1570(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    int forwardValue1570_22_0;
    boolean spill1570_0;
    boolean spill1570_1;
    long life2_3;
    int life4_8;
    forward_join_37: {
    forward_join_30: {
    forward_join_22: {
    life2_3 = (__fieldRead1570_0() ^ 97512015890497L);
    spill1570_0 = __call1570_1();
    __call1570_2(receiver, p0);
    life4_8 = __integerCategory1570_3(spill1570_0);
    spill1570_1 = __call1570_5(p0, "playerGameType", __invokedynamic1570_4(9525, (8388558905227267404L ^ life2_3)));
    if (!((life4_8 != 0))) {
        forwardValue1570_22_0 = __integerCategory1570_6(spill1570_1);
        break forward_join_22;
    }
    if (!(spill1570_1)) {
        break forward_join_37;
    }
    forwardValue1570_22_0 = __integerCategory1570_9(__call1570_8(__call1570_7()));
    }
    if (!((forwardValue1570_22_0 != 0))) {
        break forward_join_30;
    }
    __call1570_13(__fieldRead1570_10(receiver), __call1570_12(__call1570_11()));
    if (!((life4_8 == 0))) {
        break forward_join_37;
    }
    }
    __call1570_17(__fieldRead1570_14(receiver), __call1570_16(__call1570_15(p0, "playerGameType")));
    }
    return;
}
public static void h1570_0(moom.Oo p0) throws Throwable {
    throw __call1157000_0(p0);
}
public static void h1570_1(moom.Oo p0) throws Throwable {
    throw __call1157001_0(p0);
}
public static void h1570_2(moom.Oo p0) throws Throwable {
    throw __call1157002_0(p0);
}
public static void h1570_3(moom.Oo p0) throws Throwable {
    throw __call1157003_0(p0);
}
private static native long __fieldRead1570_0() throws Throwable;
private static native boolean __call1570_1() throws Throwable;
private static native void __call1570_2(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native int __integerCategory1570_3(boolean value) throws Throwable;
private static native int __invokedynamic1570_4(int a0, long a1) throws Throwable;
private static native boolean __call1570_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1570_6(boolean value) throws Throwable;
private static native moom.Bl __call1570_7() throws Throwable;
private static native boolean __call1570_8(moom.Bl a0) throws Throwable;
private static native int __integerCategory1570_9(boolean value) throws Throwable;
private static native moom.Bo __fieldRead1570_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __call1570_11() throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1570_12(moom.Bl a0) throws Throwable;
private static native void __call1570_13(moom.Bo a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native moom.Bo __fieldRead1570_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1570_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1570_16(int a0) throws Throwable;
private static native void __call1570_17(moom.Bo a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native java.lang.Throwable __call1157000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a97de4ff27a337c1ee1e(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws E;
private static final class __SourceHandler_a97de4ff27a337c1ee1e {

public static void f1571(net.minecraft.entity.player.EntityPlayerMP receiver, int p0) throws Throwable {
    int forwardValue1571_41_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue1571_77_0;
    int spill1571_0;
    int spill1571_1;
    net.minecraft.entity.player.EntityPlayerMP spill1571_2;
    long life2_3;
    int life4_5;
    moom.DT life5_74;
    forward_join_94: {
    forward_join_79: {
    forward_join_77: {
    forward_join_76: {
    forward_join_74: {
    forward_join_72: {
    forward_join_41: {
    forward_join_37: {
    life2_3 = (__fieldRead1571_0() ^ 84352003434608L);
    life4_5 = __integerCategory1571_2(__call1571_1());
    spill1571_0 = __fieldRead1571_3(receiver);
    if (!((life4_5 != 0))) {
        forwardValue1571_41_0 = spill1571_0;
        break forward_join_41;
    }
    if (!((spill1571_0 == 1))) {
        break forward_join_37;
    }
    spill1571_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1571_41_0 = spill1571_1;
        break forward_join_41;
    }
    if (!((spill1571_1 == 1))) {
        break forward_join_37;
    }
    __call1571_5(receiver, __fieldRead1571_4());
    __call1571_7(__fieldRead1571_6(receiver), receiver);
    __fieldWrite1571_8(receiver, 1);
    __call1571_10(__fieldRead1571_9(receiver), new moom.Ac(4, 0x0.0p0f));
    if (!((life4_5 == 0))) {
        break forward_join_94;
    }
    }
    spill1571_2 = receiver;
    if (!((life4_5 != 0))) {
        forwardValue1571_77_0 = spill1571_2;
        break forward_join_77;
    }
    forwardValue1571_41_0 = __fieldRead1571_11(spill1571_2);
    }
    if (!((forwardValue1571_41_0 == 0))) {
        break forward_join_76;
    }
    if (!((p0 == 1))) {
        break forward_join_76;
    }
    __call1571_13(receiver, __fieldRead1571_12());
    life5_74 = __call1571_16(__call1571_15(__fieldRead1571_14(receiver), p0));
    if (!((life4_5 != 0))) {
        break forward_join_74;
    }
    if (!((life5_74 != null))) {
        break forward_join_72;
    }
    __call1571_21(__fieldRead1571_17(receiver), ((double) __call1571_18(life5_74)), ((double) __call1571_19(life5_74)), ((double) __call1571_20(life5_74)), 0x0.0p0f, 0x0.0p0f);
    }
    p0 = 1;
    }
    if (!((life4_5 == 0))) {
        break forward_join_79;
    }
    }
    forwardValue1571_77_0 = receiver;
    }
    __call1571_23(forwardValue1571_77_0, __fieldRead1571_22());
    }
    __call1571_26(__call1571_25(__fieldRead1571_24(receiver)), receiver, p0);
    __fieldWrite1571_27(receiver, -1);
    __fieldWrite1571_28(receiver, -0x1.0p0f);
    __fieldWrite1571_29(receiver, -1);
    }
    return;
}
public static void h1571_0(moom.Oo p0) throws Throwable {
    throw __call1157100_0(p0);
}
public static void h1571_1(moom.Oo p0) throws Throwable {
    throw __call1157101_0(p0);
}
public static void h1571_2(moom.Oo p0) throws Throwable {
    throw __call1157102_0(p0);
}
public static void h1571_3(moom.Oo p0) throws Throwable {
    throw __call1157103_0(p0);
}
public static void h1571_4(moom.Oo p0) throws Throwable {
    throw __call1157104_0(p0);
}
public static void h1571_5(moom.Oo p0) throws Throwable {
    throw __call1157105_0(p0);
}
public static void h1571_6(moom.Oo p0) throws Throwable {
    throw __call1157106_0(p0);
}
public static void h1571_7(moom.Oo p0) throws Throwable {
    throw __call1157107_0(p0);
}
public static void h1571_8(moom.Oo p0) throws Throwable {
    throw __call1157108_0(p0);
}
public static void h1571_9(moom.Oo p0) throws Throwable {
    throw __call1157109_0(p0);
}
private static native long __fieldRead1571_0() throws Throwable;
private static native boolean __call1571_1() throws Throwable;
private static native int __integerCategory1571_2(boolean value) throws Throwable;
private static native int __fieldRead1571_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.BZ __fieldRead1571_4() throws Throwable;
private static native void __call1571_5(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1571_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1571_7(net.minecraft.world.World a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native void __fieldWrite1571_8(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1571_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1571_10(net.minecraft.network.NetHandlerPlayServer a0, moom.Ac a1) throws Throwable;
private static native int __fieldRead1571_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.BZ __fieldRead1571_12() throws Throwable;
private static native void __call1571_13(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native moom.Bl __fieldRead1571_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1571_15(moom.Bl a0, int a1) throws Throwable;
private static native moom.DT __call1571_16(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1571_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1571_18(moom.DT a0) throws Throwable;
private static native int __call1571_19(moom.DT a0) throws Throwable;
private static native int __call1571_20(moom.DT a0) throws Throwable;
private static native void __call1571_21(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native moom.BZ __fieldRead1571_22() throws Throwable;
private static native void __call1571_23(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native moom.Bl __fieldRead1571_24(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1571_25(moom.Bl a0) throws Throwable;
private static native void __call1571_26(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native void __fieldWrite1571_27(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native void __fieldWrite1571_28(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native void __fieldWrite1571_29(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1157100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157109_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4352ceaeeb6c5922cd04(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_4352ceaeeb6c5922cd04 {

public static void f680(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    int forestValue680_32_0;
    int forestValue680_60_0;
    int forestValue680_60_1;
    int forestValue680_103_0;
    int forestValue680_112_0;
    int forestValue680_112_1;
    int forestValue680_164_0;
    net.minecraft.world.World forestValue680_214_0;
    int forestValue680_285_0;
    int forestValue680_296_0;
    int forestValue680_301_0;
    int forestValue680_302_0;
    int forestValue680_302_1;
    net.minecraft.entity.Entity forestValue680_367_0;
    net.minecraft.entity.Entity forestValue680_374_0;
    int forestValue680_404_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue680_406_0;
    boolean spill680_0;
    int spill680_1;
    boolean spill680_2;
    int spill680_3;
    int spill680_4;
    int spill680_5;
    int spill680_6;
    int spill680_7;
    int spill680_8;
    boolean spill680_9;
    net.minecraft.entity.player.EntityPlayerMP spill680_10;
    int spill680_11;
    int spill680_12;
    net.minecraft.world.World spill680_13;
    boolean spill680_14;
    net.minecraft.entity.player.EntityPlayerMP spill680_15;
    net.minecraft.entity.Entity spill680_16;
    boolean spill680_17;
    net.minecraft.entity.player.EntityPlayerMP spill680_18;
    long life1_3;
    int life3_8;
    int life4_77;
    int[] life5_80;
    java.util.Iterator life6_84;
    int life7_89;
    int life4_138;
    int[] life5_141;
    java.util.Iterator life6_145;
    int life7_150;
    java.util.ArrayList life4_202;
    java.util.Iterator life5_206;
    java.util.ArrayList life6_208;
    moom.Ee life7_234;
    net.minecraft.world.chunk.Chunk life8_268;
    java.util.Iterator life7_397;
    net.minecraft.tileentity.TileEntity life8_406;
    net.minecraft.world.chunk.Chunk life8_428;
    net.minecraft.entity.Entity life4_445;
    forest_join_408: {
    forest_join_406: {
    forest_join_404: {
    forest_join_383: {
    forest_join_374: {
    forest_join_367: {
    forest_join_365: {
    forest_join_348: {
    forest_join_345: {
    forest_join_328: {
    forest_join_321: {
    forest_join_302: {
    forest_join_301: {
    forest_join_296: {
    forest_join_294: {
    forest_join_164: {
    forest_join_159: {
    forest_join_103: {
    forest_join_48: {
    forest_join_32: {
    forest_join_26: {
    life1_3 = (__fieldRead680_0() ^ 119144688576309L);
    spill680_0 = __call680_1();
    __call680_3(__fieldRead680_2(receiver));
    life3_8 = __integerCategory680_4(spill680_0);
    net.minecraft.entity.player.EntityPlayerMP __stackOp680_5_0 = receiver;
    __fieldWrite680_7(__stackOp680_5_0, (__fieldRead680_6(__stackOp680_5_0) - 1));
    spill680_1 = __fieldRead680_8(receiver);
    if (!((life3_8 != 0))) {
        forestValue680_32_0 = spill680_1;
        break forest_join_32;
    }
    if (!((spill680_1 > 0))) {
        break forest_join_26;
    }
    net.minecraft.entity.player.EntityPlayerMP __stackOp680_9_0 = receiver;
    __fieldWrite680_11(__stackOp680_9_0, (__fieldRead680_10(__stackOp680_9_0) - 1));
    }
    __call680_13(__fieldRead680_12(receiver));
    forestValue680_32_0 = __integerCategory680_16(__fieldRead680_15(__fieldRead680_14(receiver)));
    }
    if (!((life3_8 != 0))) {
        forestValue680_103_0 = forestValue680_32_0;
        break forest_join_103;
    }
    if (!((forestValue680_32_0 == 0))) {
        break forest_join_48;
    }
    spill680_2 = __call680_18(__fieldRead680_17(receiver), receiver);
    if (!((life3_8 != 0))) {
        forestValue680_103_0 = __integerCategory680_19(spill680_2);
        break forest_join_103;
    }
    if (!((!spill680_2))) {
        break forest_join_48;
    }
    __call680_20(receiver);
    __fieldWrite680_22(receiver, __fieldRead680_21(receiver));
    }
    forest_cycle_48: while (true) {
    forest_join_93: {
    if (!((!__call680_24(__fieldRead680_23(receiver))))) {
        break forest_join_159;
    }
    forestValue680_60_0 = __call680_26(__fieldRead680_25(receiver));
    forestValue680_60_1 = __invokedynamic680_27(8168, (1789091856537262307L ^ life1_3));
    forest_cycle_60: while (true) {
    life4_77 = __call680_28(forestValue680_60_0, forestValue680_60_1);
    life5_80 = new int[life4_77];
    life6_84 = __call680_30(__fieldRead680_29(receiver));
    spill680_3 = 0;
    if (!((life3_8 != 0))) {
        forestValue680_164_0 = spill680_3;
        break forest_join_164;
    }
    life7_89 = spill680_3;
    forest_cycle_73: while (true) {
    if (!(__call680_31(life6_84))) {
        break forest_join_93;
    }
    spill680_4 = life7_89;
    spill680_5 = life4_77;
    if (!((life3_8 != 0))) {
        forestValue680_60_0 = spill680_4;
        forestValue680_60_1 = spill680_5;
        continue forest_cycle_60;
    }
    if (!((spill680_4 < spill680_5))) {
        break forest_join_93;
    }
    (life5_80)[(life7_89++)] = __call680_34(__cast680_33(__call680_32(life6_84)));
    __call680_35(life6_84);
    if (!((life3_8 == 0))) {
        continue forest_cycle_73;
    }
    break forest_cycle_73;
    }
    break forest_cycle_60;
    }
    }
    __call680_37(__fieldRead680_36(receiver), new moom.zM(life5_80));
    if (!((life3_8 == 0))) {
        continue forest_cycle_48;
    }
    break forest_cycle_48;
    }
    break forest_join_159;
    }
    forest_cycle_103: while (true) {
    forest_join_155: {
    forest_join_145: {
    if (!((forestValue680_103_0 == 0))) {
        break forest_join_159;
    }
    forestValue680_112_0 = __call680_39(__fieldRead680_38(receiver));
    forestValue680_112_1 = __invokedynamic680_40(8168, (1789091856537262307L ^ life1_3));
    forest_cycle_112: while (true) {
    life4_138 = __call680_41(forestValue680_112_0, forestValue680_112_1);
    life5_141 = new int[life4_138];
    life6_145 = __call680_43(__fieldRead680_42(receiver));
    spill680_6 = 0;
    if (!((life3_8 != 0))) {
        forestValue680_164_0 = spill680_6;
        break forest_join_164;
    }
    life7_150 = spill680_6;
    forest_cycle_125: while (true) {
    if (!(__call680_44(life6_145))) {
        break forest_join_145;
    }
    spill680_7 = life7_150;
    spill680_8 = life4_138;
    if (!((life3_8 != 0))) {
        forestValue680_112_0 = spill680_7;
        forestValue680_112_1 = spill680_8;
        continue forest_cycle_112;
    }
    if (!((spill680_7 < spill680_8))) {
        break forest_join_145;
    }
    (life5_141)[(life7_150++)] = __call680_47(__cast680_46(__call680_45(life6_145)));
    __call680_48(life6_145);
    if (!((life3_8 == 0))) {
        continue forest_cycle_125;
    }
    break forest_cycle_125;
    }
    break forest_cycle_112;
    }
    }
    __call680_50(__fieldRead680_49(receiver), new moom.zM(life5_141));
    if (!((life3_8 == 0))) {
        break forest_join_155;
    }
    break forest_join_159;
    }
    spill680_9 = __call680_52(__fieldRead680_51(receiver));
    forestValue680_103_0 = __integerCategory680_53(spill680_9);
    continue forest_cycle_103;
    }
    }
    spill680_10 = receiver;
    if (!((life3_8 != 0))) {
        forestValue680_367_0 = spill680_10;
        break forest_join_367;
    }
    forestValue680_164_0 = __integerCategory680_56(__call680_55(__fieldRead680_54(spill680_10)));
    }
    if (!((forestValue680_164_0 == 0))) {
        break forest_join_365;
    }
    life4_202 = __call680_57();
    life5_206 = __call680_59(__fieldRead680_58(receiver));
    life6_208 = __call680_60();
    forest_cycle_173: while (true) {
    forest_join_292: {
    forest_join_290: {
    forest_join_288: {
    forest_join_285: {
    forest_join_214: {
    if (!(__call680_61(life5_206))) {
        break forest_join_294;
    }
    spill680_11 = __call680_62(life4_202);
    if (!((life3_8 != 0))) {
        forestValue680_296_0 = spill680_11;
        break forest_join_296;
    }
    spill680_12 = __invokedynamic680_63(611, (1331666717846537581L ^ life1_3));
    if (!((life3_8 != 0))) {
        forestValue680_302_0 = spill680_11;
        forestValue680_302_1 = spill680_12;
        break forest_join_302;
    }
    if (!((spill680_11 < spill680_12))) {
        break forest_join_294;
    }
    life7_234 = __cast680_65(__call680_64(life5_206));
    if (!((life7_234 != null))) {
        break forest_join_290;
    }
    spill680_13 = __fieldRead680_66(receiver);
    if (!((life3_8 != 0))) {
        forestValue680_214_0 = spill680_13;
        break forest_join_214;
    }
    if (!(__call680_69(spill680_13, new moom.DT((__fieldRead680_67(life7_234) << 4), 0, (__fieldRead680_68(life7_234) << 4))))) {
        break forest_join_292;
    }
    forestValue680_214_0 = __fieldRead680_70(receiver);
    }
    life8_268 = __call680_73(forestValue680_214_0, __fieldRead680_71(life7_234), __fieldRead680_72(life7_234));
    spill680_14 = __call680_74(life8_268);
    if (!((life3_8 != 0))) {
        forestValue680_285_0 = __integerCategory680_75(spill680_14);
        break forest_join_285;
    }
    if (!(spill680_14)) {
        break forest_join_288;
    }
    __call680_76(life4_202, life8_268);
    forestValue680_285_0 = __integerCategory680_92(__call680_91(life6_208, __call680_90(__cast680_78(__fieldRead680_77(receiver)), (__fieldRead680_79(life7_234) * __invokedynamic680_80(20814, (3065374982194026052L ^ life1_3))), 0, (__fieldRead680_81(life7_234) * __invokedynamic680_82(27931, (2732918061715384856L ^ life1_3))), ((__fieldRead680_83(life7_234) * __invokedynamic680_84(27931, (2732918061715384856L ^ life1_3))) + __invokedynamic680_85(27931, (2732918061715384856L ^ life1_3))), __invokedynamic680_86(809, (2401286089321284655L ^ life1_3)), ((__fieldRead680_87(life7_234) * __invokedynamic680_88(27931, (2732918061715384856L ^ life1_3))) + __invokedynamic680_89(27931, (2732918061715384856L ^ life1_3))))));
    }
    __discardScalar680_93(forestValue680_285_0);
    __call680_94(life5_206);
    }
    if (!((life3_8 == 0))) {
        break forest_join_292;
    }
    }
    __call680_95(life5_206);
    }
    if (!((life3_8 == 0))) {
        continue forest_cycle_173;
    }
    break forest_cycle_173;
    }
    }
    forestValue680_296_0 = __integerCategory680_97(__call680_96(life4_202));
    }
    if (!((life3_8 != 0))) {
        forestValue680_301_0 = forestValue680_296_0;
        break forest_join_301;
    }
    if (!((forestValue680_296_0 == 0))) {
        break forest_join_365;
    }
    forestValue680_301_0 = __call680_98(life4_202);
    }
    forestValue680_302_0 = forestValue680_301_0;
    forestValue680_302_1 = 1;
    }
    if (!((forestValue680_302_0 == forestValue680_302_1))) {
        break forest_join_321;
    }
    __call680_103(__fieldRead680_99(receiver), new moom.z1(__cast680_101(__call680_100(life4_202, 0)), true, __invokedynamic680_102(23289, (3004824952569355760L ^ life1_3))));
    if (!((life3_8 == 0))) {
        break forest_join_328;
    }
    }
    __call680_105(__fieldRead680_104(receiver), new moom.z8(life4_202));
    }
    life7_397 = __call680_106(life6_208);
    forest_cycle_331: while (true) {
    if (!(__call680_107(life7_397))) {
        break forest_join_345;
    }
    life8_406 = __cast680_109(__call680_108(life7_397));
    __call680_110(receiver, life8_406);
    if (!((life3_8 != 0))) {
        break forest_join_348;
    }
    if (!((life3_8 == 0))) {
        continue forest_cycle_331;
    }
    break forest_cycle_331;
    }
    }
    life7_397 = __call680_111(life4_202);
    }
    forest_cycle_348: while (true) {
    if (!(__call680_112(life7_397))) {
        break forest_join_365;
    }
    life8_428 = __cast680_114(__call680_113(life7_397));
    spill680_15 = receiver;
    if (!((life3_8 != 0))) {
        forestValue680_367_0 = spill680_15;
        break forest_join_367;
    }
    __call680_117(__call680_116(__call680_115(spill680_15)), receiver, life8_428);
    if (!((life3_8 == 0))) {
        continue forest_cycle_348;
    }
    break forest_cycle_348;
    }
    }
    forestValue680_367_0 = __call680_118(receiver);
    }
    life4_445 = forestValue680_367_0;
    spill680_16 = life4_445;
    if (!((life3_8 != 0))) {
        forestValue680_374_0 = spill680_16;
        break forest_join_374;
    }
    if (!((spill680_16 != receiver))) {
        break forest_join_408;
    }
    forestValue680_374_0 = life4_445;
    }
    spill680_17 = __call680_119(forestValue680_374_0);
    if (!((life3_8 != 0))) {
        forestValue680_404_0 = __integerCategory680_120(spill680_17);
        break forest_join_404;
    }
    if (!((!spill680_17))) {
        break forest_join_383;
    }
    __call680_121(receiver, receiver);
    if (!((life3_8 == 0))) {
        break forest_join_408;
    }
    }
    __call680_127(receiver, __fieldRead680_122(life4_445), __fieldRead680_123(life4_445), __fieldRead680_124(life4_445), __fieldRead680_125(life4_445), __fieldRead680_126(life4_445));
    __call680_130(__call680_129(__fieldRead680_128(receiver)), receiver);
    spill680_18 = receiver;
    if (!((life3_8 != 0))) {
        forestValue680_406_0 = spill680_18;
        break forest_join_406;
    }
    forestValue680_404_0 = __integerCategory680_132(__call680_131(spill680_18));
    }
    if (!((forestValue680_404_0 != 0))) {
        break forest_join_408;
    }
    forestValue680_406_0 = receiver;
    }
    __call680_133(forestValue680_406_0, receiver);
    }
    return;
}
public static void h680_0(moom.Oo p0) throws Throwable {
    throw __call3068000_0(p0);
}
public static void h680_1(moom.Oo p0) throws Throwable {
    throw __call3068001_0(p0);
}
public static void h680_2(moom.Oo p0) throws Throwable {
    throw __call3068002_0(p0);
}
public static void h680_3(moom.Oo p0) throws Throwable {
    throw __call3068003_0(p0);
}
public static void h680_4(moom.Oo p0) throws Throwable {
    throw __call3068004_0(p0);
}
public static void h680_5(moom.Oo p0) throws Throwable {
    throw __call3068005_0(p0);
}
public static void h680_6(moom.Oo p0) throws Throwable {
    throw __call3068006_0(p0);
}
public static void h680_7(moom.Oo p0) throws Throwable {
    throw __call3068007_0(p0);
}
public static void h680_8(moom.Oo p0) throws Throwable {
    throw __call3068008_0(p0);
}
public static void h680_9(moom.Oo p0) throws Throwable {
    throw __call3068009_0(p0);
}
public static void h680_10(moom.Oo p0) throws Throwable {
    throw __call3068010_0(p0);
}
public static void h680_11(moom.Oo p0) throws Throwable {
    throw __call3068011_0(p0);
}
public static void h680_12(moom.Oo p0) throws Throwable {
    throw __call3068012_0(p0);
}
public static void h680_13(moom.Oo p0) throws Throwable {
    throw __call3068013_0(p0);
}
public static void h680_14(moom.Oo p0) throws Throwable {
    throw __call3068014_0(p0);
}
public static void h680_15(moom.Oo p0) throws Throwable {
    throw __call3068015_0(p0);
}
public static void h680_16(moom.Oo p0) throws Throwable {
    throw __call3068016_0(p0);
}
public static void h680_17(moom.Oo p0) throws Throwable {
    throw __call3068017_0(p0);
}
public static void h680_18(moom.Oo p0) throws Throwable {
    throw __call3068018_0(p0);
}
public static void h680_19(moom.Oo p0) throws Throwable {
    throw __call3068019_0(p0);
}
public static void h680_20(moom.Oo p0) throws Throwable {
    throw __call3068020_0(p0);
}
public static void h680_21(moom.Oo p0) throws Throwable {
    throw __call3068021_0(p0);
}
public static void h680_22(moom.Oo p0) throws Throwable {
    throw __call3068022_0(p0);
}
public static void h680_23(moom.Oo p0) throws Throwable {
    throw __call3068023_0(p0);
}
public static void h680_24(moom.Oo p0) throws Throwable {
    throw __call3068024_0(p0);
}
public static void h680_25(moom.Oo p0) throws Throwable {
    throw __call3068025_0(p0);
}
public static void h680_26(moom.Oo p0) throws Throwable {
    throw __call3068026_0(p0);
}
public static void h680_27(moom.Oo p0) throws Throwable {
    throw __call3068027_0(p0);
}
private static native long __fieldRead680_0() throws Throwable;
private static native boolean __call680_1() throws Throwable;
private static native moom.Bo __fieldRead680_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call680_3(moom.Bo a0) throws Throwable;
private static native int __integerCategory680_4(boolean value) throws Throwable;
private static native int __fieldRead680_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite680_7(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native int __fieldRead680_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead680_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite680_11(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native moom.v8 __fieldRead680_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call680_13(moom.v8 a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead680_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead680_15(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory680_16(boolean value) throws Throwable;
private static native moom.v8 __fieldRead680_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call680_18(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native int __integerCategory680_19(boolean value) throws Throwable;
private static native void __call680_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.v8 __fieldRead680_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite680_22(net.minecraft.entity.player.EntityPlayerMP a0, moom.v8 a1) throws Throwable;
private static native java.util.List __fieldRead680_23(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call680_24(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead680_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call680_26(java.util.List a0) throws Throwable;
private static native int __invokedynamic680_27(int a0, long a1) throws Throwable;
private static native int __call680_28(int a0, int a1) throws Throwable;
private static native java.util.List __fieldRead680_29(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.Iterator __call680_30(java.util.List a0) throws Throwable;
private static native boolean __call680_31(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call680_32(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast680_33(java.lang.Object a0) throws Throwable;
private static native int __call680_34(java.lang.Integer a0) throws Throwable;
private static native void __call680_35(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead680_36(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call680_37(net.minecraft.network.NetHandlerPlayServer a0, moom.zM a1) throws Throwable;
private static native java.util.List __fieldRead680_38(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call680_39(java.util.List a0) throws Throwable;
private static native int __invokedynamic680_40(int a0, long a1) throws Throwable;
private static native int __call680_41(int a0, int a1) throws Throwable;
private static native java.util.List __fieldRead680_42(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.Iterator __call680_43(java.util.List a0) throws Throwable;
private static native boolean __call680_44(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call680_45(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast680_46(java.lang.Object a0) throws Throwable;
private static native int __call680_47(java.lang.Integer a0) throws Throwable;
private static native void __call680_48(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead680_49(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call680_50(net.minecraft.network.NetHandlerPlayServer a0, moom.zM a1) throws Throwable;
private static native java.util.List __fieldRead680_51(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call680_52(java.util.List a0) throws Throwable;
private static native int __integerCategory680_53(boolean value) throws Throwable;
private static native java.util.List __fieldRead680_54(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call680_55(java.util.List a0) throws Throwable;
private static native int __integerCategory680_56(boolean value) throws Throwable;
private static native java.util.ArrayList __call680_57() throws Throwable;
private static native java.util.List __fieldRead680_58(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.Iterator __call680_59(java.util.List a0) throws Throwable;
private static native java.util.ArrayList __call680_60() throws Throwable;
private static native boolean __call680_61(java.util.Iterator a0) throws Throwable;
private static native int __call680_62(java.util.ArrayList a0) throws Throwable;
private static native int __invokedynamic680_63(int a0, long a1) throws Throwable;
private static native java.lang.Object __call680_64(java.util.Iterator a0) throws Throwable;
private static native moom.Ee __cast680_65(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead680_66(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead680_67(moom.Ee a0) throws Throwable;
private static native int __fieldRead680_68(moom.Ee a0) throws Throwable;
private static native boolean __call680_69(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead680_70(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead680_71(moom.Ee a0) throws Throwable;
private static native int __fieldRead680_72(moom.Ee a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call680_73(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native boolean __call680_74(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory680_75(boolean value) throws Throwable;
private static native boolean __call680_76(java.util.ArrayList a0, net.minecraft.world.chunk.Chunk a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead680_77(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast680_78(net.minecraft.world.World a0) throws Throwable;
private static native int __fieldRead680_79(moom.Ee a0) throws Throwable;
private static native int __invokedynamic680_80(int a0, long a1) throws Throwable;
private static native int __fieldRead680_81(moom.Ee a0) throws Throwable;
private static native int __invokedynamic680_82(int a0, long a1) throws Throwable;
private static native int __fieldRead680_83(moom.Ee a0) throws Throwable;
private static native int __invokedynamic680_84(int a0, long a1) throws Throwable;
private static native int __invokedynamic680_85(int a0, long a1) throws Throwable;
private static native int __invokedynamic680_86(int a0, long a1) throws Throwable;
private static native int __fieldRead680_87(moom.Ee a0) throws Throwable;
private static native int __invokedynamic680_88(int a0, long a1) throws Throwable;
private static native int __invokedynamic680_89(int a0, long a1) throws Throwable;
private static native java.util.List __call680_90(net.minecraft.world.WorldServer a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native boolean __call680_91(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native int __integerCategory680_92(boolean value) throws Throwable;
private static native void __discardScalar680_93(int a0) throws Throwable;
private static native void __call680_94(java.util.Iterator a0) throws Throwable;
private static native void __call680_95(java.util.Iterator a0) throws Throwable;
private static native boolean __call680_96(java.util.ArrayList a0) throws Throwable;
private static native int __integerCategory680_97(boolean value) throws Throwable;
private static native int __call680_98(java.util.ArrayList a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead680_99(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.Object __call680_100(java.util.ArrayList a0, int a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast680_101(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic680_102(int a0, long a1) throws Throwable;
private static native void __call680_103(net.minecraft.network.NetHandlerPlayServer a0, moom.z1 a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead680_104(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call680_105(net.minecraft.network.NetHandlerPlayServer a0, moom.z8 a1) throws Throwable;
private static native java.util.Iterator __call680_106(java.util.ArrayList a0) throws Throwable;
private static native boolean __call680_107(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call680_108(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast680_109(java.lang.Object a0) throws Throwable;
private static native void __call680_110(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native java.util.Iterator __call680_111(java.util.ArrayList a0) throws Throwable;
private static native boolean __call680_112(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call680_113(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast680_114(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call680_115(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.EntityTracker __call680_116(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call680_117(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.world.chunk.Chunk a2) throws Throwable;
private static native net.minecraft.entity.Entity __call680_118(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call680_119(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory680_120(boolean value) throws Throwable;
private static native void __call680_121(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native double __fieldRead680_122(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead680_123(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead680_124(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead680_125(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead680_126(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call680_127(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native moom.Bl __fieldRead680_128(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call680_129(moom.Bl a0) throws Throwable;
private static native void __call680_130(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native boolean __call680_131(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory680_132(boolean value) throws Throwable;
private static native void __call680_133(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call3068000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068022_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068023_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068024_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068025_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068026_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3068027_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f6e6d73493f225215b04(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_f6e6d73493f225215b04 {

public static void f1572(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.entity.Entity p0) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1572_19_0;
    net.minecraft.entity.player.EntityPlayerMP spill1572_0;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (__fieldRead1572_0() ^ 92818851149753L);
    life4_5 = __integerCategory1572_2(__call1572_1());
    spill1572_0 = receiver;
    if (!((life4_5 != 0))) {
        forwardValue1572_19_0 = spill1572_0;
        break forward_join_19;
    }
    if (!((__call1572_4(__fieldRead1572_3(spill1572_0)) == __fieldRead1572_5()))) {
        break forward_join_18;
    }
    __call1572_6(receiver, p0);
    if (!((life4_5 == 0))) {
        break forward_join_21;
    }
    }
    forwardValue1572_19_0 = receiver;
    }
    __call1572_7(forwardValue1572_19_0, p0);
    }
    return;
}
public static void h1572_0(moom.Oo p0) throws Throwable {
    throw __call1157200_0(p0);
}
public static void h1572_1(moom.Oo p0) throws Throwable {
    throw __call1157201_0(p0);
}
public static void h1572_2(moom.Oo p0) throws Throwable {
    throw __call1157202_0(p0);
}
private static native long __fieldRead1572_0() throws Throwable;
private static native boolean __call1572_1() throws Throwable;
private static native int __integerCategory1572_2(boolean value) throws Throwable;
private static native moom.Bo __fieldRead1572_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1572_4(moom.Bo a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1572_5() throws Throwable;
private static native void __call1572_6(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call1572_7(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Throwable __call1157200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_436ce477cf665ff07ad6(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_436ce477cf665ff07ad6 {

public static void f71(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue71_32_0;
    int spill71_0;
    long life2_3;
    int life4_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_26: {
    life2_3 = (__fieldRead71_0() ^ 112682691957654L);
    life4_5 = __integerCategory71_2(__call71_1());
    spill71_0 = __instanceOf71_3(p0);
    if (!((life4_5 == 0))) {
        forwardValue71_32_0 = spill71_0;
        break forward_join_32;
    }
    if (!((spill71_0 != 0))) {
        break forward_join_26;
    }
    __call71_6(__fieldRead71_4(receiver), new moom.zM(new int[] {__call71_5(p0)}));
    if (!((life4_5 != 0))) {
        break forward_join_33;
    }
    }
    forwardValue71_32_0 = __integerCategory71_11(__call71_10(__fieldRead71_7(receiver), __call71_9(__call71_8(p0))));
    }
    __discardScalar71_12(forwardValue71_32_0);
    }
    return;
}
public static void h71_0(moom.Oo p0) throws Throwable {
    throw __call3007100_0(p0);
}
public static void h71_1(moom.Oo p0) throws Throwable {
    throw __call3007101_0(p0);
}
public static void h71_2(moom.Oo p0) throws Throwable {
    throw __call3007102_0(p0);
}
private static native long __fieldRead71_0() throws Throwable;
private static native boolean __call71_1() throws Throwable;
private static native int __integerCategory71_2(boolean value) throws Throwable;
private static native int __instanceOf71_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead71_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call71_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call71_6(net.minecraft.network.NetHandlerPlayServer a0, moom.zM a1) throws Throwable;
private static native java.util.List __fieldRead71_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call71_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Integer __call71_9(int a0) throws Throwable;
private static native boolean __call71_10(java.util.List a0, java.lang.Integer a1) throws Throwable;
private static native int __integerCategory71_11(boolean value) throws Throwable;
private static native void __discardScalar71_12(int a0) throws Throwable;
private static native java.lang.Throwable __call3007100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3007101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3007102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2cbcfd45fbc3a9b8bff9(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_2cbcfd45fbc3a9b8bff9 {

public static void f564(net.minecraft.entity.player.EntityPlayerMP receiver, net.minecraft.entity.Entity p0) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue564_14_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue564_15_0;
    net.minecraft.entity.Entity forwardValue564_15_1;
    boolean spill564_0;
    net.minecraft.entity.player.EntityPlayerMP spill564_1;
    long life2_3;
    net.minecraft.entity.Entity life5_7;
    int life4_8;
    forward_join_41: {
    forward_join_30: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead564_0() ^ 91697310627698L);
    spill564_0 = __call564_1();
    life5_7 = __call564_2(receiver);
    life4_8 = __integerCategory564_3(spill564_0);
    spill564_1 = receiver;
    if (!((p0 == null))) {
        forwardValue564_14_0 = spill564_1;
        break forward_join_14;
    }
    forwardValue564_15_0 = spill564_1;
    forwardValue564_15_1 = receiver;
    break forward_join_15;
    }
    forwardValue564_15_0 = forwardValue564_14_0;
    forwardValue564_15_1 = p0;
    }
    __fieldWrite564_4(forwardValue564_15_0, forwardValue564_15_1);
    if (!((life4_8 != 0))) {
        break forward_join_30;
    }
    if (!((life5_7 != __fieldRead564_5(receiver)))) {
        break forward_join_41;
    }
    __call564_8(__fieldRead564_6(receiver), new moom.AD(__fieldRead564_7(receiver)));
    }
    __call564_15(receiver, __fieldRead564_10(__fieldRead564_9(receiver)), __fieldRead564_12(__fieldRead564_11(receiver)), __fieldRead564_14(__fieldRead564_13(receiver)));
    }
    return;
}
public static void h564_0(moom.Oo p0) throws Throwable {
    throw __call2056400_0(p0);
}
public static void h564_1(moom.Oo p0) throws Throwable {
    throw __call2056401_0(p0);
}
public static void h564_2(moom.Oo p0) throws Throwable {
    throw __call2056402_0(p0);
}
private static native long __fieldRead564_0() throws Throwable;
private static native boolean __call564_1() throws Throwable;
private static native net.minecraft.entity.Entity __call564_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory564_3(boolean value) throws Throwable;
private static native void __fieldWrite564_4(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead564_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead564_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead564_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call564_8(net.minecraft.network.NetHandlerPlayServer a0, moom.AD a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead564_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead564_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead564_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead564_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead564_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead564_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call564_15(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call2056400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2056401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2056402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_17845daf2f0744eb1720(net.minecraft.entity.player.EntityPlayerMP a0) throws E;
private static final class __SourceHandler_17845daf2f0744eb1720 {

public static void f1574(net.minecraft.entity.player.EntityPlayerMP receiver) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1574_19_0;
    net.minecraft.entity.player.EntityPlayerMP spill1574_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead1574_0() ^ 105356360739127L);
    life3_5 = __integerCategory1574_2(__call1574_1());
    spill1574_0 = receiver;
    if (!((life3_5 != 0))) {
        forwardValue1574_19_0 = spill1574_0;
        break forward_join_19;
    }
    if (!(__call1574_3(spill1574_0))) {
        break forward_join_18;
    }
    __call1574_4(receiver);
    __call1574_5(receiver, 1);
    if (!((life3_5 == 0))) {
        break forward_join_20;
    }
    }
    forwardValue1574_19_0 = receiver;
    }
    __call1574_6(forwardValue1574_19_0);
    }
    __call1574_9(__call1574_8(__call1574_7(receiver)), receiver);
    return;
}
public static void h1574_0(moom.Oo p0) throws Throwable {
    throw __call1157400_0(p0);
}
public static void h1574_1(moom.Oo p0) throws Throwable {
    throw __call1157401_0(p0);
}
public static void h1574_2(moom.Oo p0) throws Throwable {
    throw __call1157402_0(p0);
}
private static native long __fieldRead1574_0() throws Throwable;
private static native boolean __call1574_1() throws Throwable;
private static native int __integerCategory1574_2(boolean value) throws Throwable;
private static native boolean __call1574_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1574_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1574_5(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native void __call1574_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1574_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.EntityTracker __call1574_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1574_9(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call1157400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157402_0(moom.Oo a0) throws Throwable;

}


public void J() {
super.J();
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.AB(((net.minecraft.entity.player.EntityPlayerMP)(this)).a__CS(), net.minecraft.network.play.server.S42PacketCombatEvent$Event.ENTER_COMBAT))));
    return;
}


public void Z() {
((moom.v8)(this.bG)).a(((net.minecraft.entity.player.EntityPlayer)(this)));
    this.bG = ((moom.v8)(this.bF));
    return;
}


public void V__sourceReturn_da8c82d5d4() { __sourceHandlerCall_133010f4bfcce7b8204f(this); }


public void b(net.minecraft.item.ItemStack p0, int p1) { __sourceHandlerCall_23055801733673d9dc59(this, p0, p1); }


public net.minecraft.entity.Entity b__r3() { return __sourceHandlerCall_d9116bbb24f12349b59f(this); }


public java.lang.String b__sourceReturn_0e30dfc966() {
java.lang.Object local1 = ((java.lang.Object)(((net.minecraft.network.NetworkManager)(((net.minecraft.network.NetHandlerPlayServer)(this.cg)).b)).a__SocketAddress())).toString();
    local1 = ((java.lang.String)(local1)).substring(((int)((((java.lang.String)(local1)).indexOf(((java.lang.String)("/"))) + 1))));
    local1 = ((java.lang.String)(local1)).substring(((int)(0)), ((int)(((java.lang.String)(local1)).indexOf(((java.lang.String)(":"))))));
    return ((java.lang.String)(local1));
}


public void b(net.minecraft.entity.Entity p0, int p1) {
super.b(((net.minecraft.entity.Entity)(p0)), ((int)(p1)));
    ((moom.v8)(this.bG)).a__Void();
    return;
}


protected void b(net.minecraft.potion.PotionEffect p0) {
super.b(((net.minecraft.potion.PotionEffect)(p0)));
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.zW(((net.minecraft.entity.player.EntityPlayerMP)(this)).e__Int(), p0))));
    return;
}


public void b(moom.BY p0) { __sourceHandlerCall_05cbdcaa98a3eedcd87a(this, p0); }


public void b(net.minecraft.entity.Entity p0) { __sourceHandlerCall_47decd23d21223fb9fac(this, p0); }


public net.minecraft.util.IChatComponent b__C5() {
return null;
}


public void b(net.minecraft.util.IChatComponent p0) {
((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.zv(p0))));
    return;
}


public void e(int p0) { __sourceHandlerCall_a97de4ff27a337c1ee1e(this, p0); }


public void e(double p0, double p1, double p2) {
((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((double)(p0)), ((double)(p1)), ((double)(p2)), ((float)(this.w)), ((float)(this.x)));
    return;
}


protected void x() { __sourceHandlerCall_17845daf2f0744eb1720(this); }


public void c(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_20e237c767e43e8c0c3a(this, p0); }


protected void c(net.minecraft.potion.PotionEffect p0) {
super.c(((net.minecraft.potion.PotionEffect)(p0)));
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.zX(((net.minecraft.entity.player.EntityPlayerMP)(this)).e__Int(), p0))));
    return;
}


public void n(int p0) {
super.n(((int)(p0)));
    this.cs = ((int)(-1));
    return;
}


public void n(net.minecraft.entity.Entity p0) { __sourceHandlerCall_2cbcfd45fbc3a9b8bff9(this, p0); }


public void l(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(this)).a__Ew())).a__t2())).b(((net.minecraft.entity.Entity)(this)), ((moom.yK)(new moom.zE(p0, 5))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5858;
      if (rb[var3] == null) {
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
         Object[] var9 = (Object[])sb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               sb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         rb[var3] = var15;
      }

      return rb[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11796_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_a0086961ca28e5(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("playerGameType")), ((int)(((net.minecraft.world.WorldSettings$GameType)(((moom.Bo)(this.ci)).a())).a())));
    return;
}


protected void a(net.minecraft.potion.PotionEffect p0, boolean p1) {
super.a(((net.minecraft.potion.PotionEffect)(p0)), ((boolean)(p1)));
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.zW(((net.minecraft.entity.player.EntityPlayerMP)(this)).e__Int(), p0))));
    return;
}


public boolean a(net.minecraft.entity.player.EntityPlayerMP p0) { return __sourceHandlerCall_7c6e99b65919e0e8e90f(this, p0); }


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_7309d21a1849f4c82010(this, p0); }


public net.minecraft.stats.StatisticsFile a__B3() {
return this.cn;
}


public void a(boolean p0, boolean p1, boolean p2) { __sourceHandlerCall_f183a7a797bebe2e96a0(this, p0, p1, p2); }


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) { __sourceHandlerCall_4fd7f1318388105a07fc(this, p0); }


public moom.aX a__sourceReturn_47d2aadd8a(moom.DT p0) { return __sourceHandlerCall_662d716ee4ad468776dc(this, p0); }


public void a(net.minecraft.entity.player.EntityPlayer p0, boolean p1) {
super.a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((boolean)(p1)));
    this.cs = ((int)(-1));
    this.cp = ((float)(-0x1.0p0f));
    this.cq = ((int)(-1));
    ((java.util.List)(this.cm)).addAll(((java.util.Collection)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(p0)))).cm)));
    return;
}


private void a(net.minecraft.tileentity.TileEntity p0) { __sourceHandlerCall_c29a2c2ee93615f4a99a(this, p0); }


public void a(net.minecraft.util.IChatComponent p0) {
((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.zv(p0))));
    return;
}


public boolean a(int p0, java.lang.String p1) { return __sourceHandlerCall_33115d4f1c08a28e9eb5(this, p0, p1); }


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) { return __sourceHandlerCall_849713f6b7a32f80916b(this, p0, p1); }


public void a(moom.zo p0) {
long local2 = (net.minecraft.entity.player.EntityPlayerMP.db ^ 47512585734131L);
    this.cf = ((java.lang.String)(((moom.zo)(p0)).a__String()));
    this.cu = ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(((moom.zo)(p0)).a__aW()));
    this.cv = ((boolean)(((moom.zo)(p0)).a__Boolean()));
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.player.EntityPlayerMP)(this)).a__r1())).b(((int)(__sourceIntrinsic_bad3bf6cac83_originalDynamicSite2008_8(12699, (8287739338297595473L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) ((moom.zo)(p0)).a())))))));
    return;
}


public net.minecraft.entity.player.EntityPlayer$EnumChatVisibility a__aW() {
return this.cu;
}


public moom.DT a__DT() {
return new moom.DT(this.n, (this.o + 0x1.0p-1d), this.p);
}


public net.minecraft.world.WorldServer a__Ew() {
return ((net.minecraft.world.WorldServer)(this.i));
}


public void a(net.minecraft.world.WorldSettings$GameType p0) { __sourceHandlerCall_4a4593f2c87d16768244(this, p0); }


public void a(java.lang.String p0, java.lang.String p1) {
((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.AJ(p0, p1))));
    return;
}


public void a(net.minecraft.item.ItemStack p0) {
long life2_3;
    net.minecraft.item.Item life4_6;
    life2_3 = (net.minecraft.entity.player.EntityPlayerMP.db ^ 69093708243298L);
    life4_6 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    try {
        if ((life4_6 == net.minecraft.init.Items.bC)) {
        ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.Ay("MC|BOpen", new net.minecraft.network.PacketBuffer(io.netty.buffer.Unpooled.buffer())))));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw __sourceExactCall_fd25f1f6e0ec5f(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void a(moom.v8 p0, int p1, net.minecraft.item.ItemStack p2) { __sourceHandlerCall_8a3ca6e0b23300b6c59c(this, p0, p1, p2); }


public void a(moom.v8 p0) {
((net.minecraft.entity.player.EntityPlayerMP)(this)).a(((moom.v8)(p0)), ((java.util.List)(((moom.v8)(p0)).a())));
    return;
}


public void a(moom.v8 p0, java.util.List<net.minecraft.item.ItemStack> p1) {
((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.Ah(((moom.v8)(p0)).c, p1))));
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.Ag(-1, -1, ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c__xW()))));
    return;
}


public void a(moom.v8 p0, int p1, int p2) {
((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.Ai(((moom.v8)(p0)).c, p1, p2))));
    return;
}


public void a(moom.BY p0, int p1) { __sourceHandlerCall_5dc6e81d6a711a788301(this, p0, p1); }


public void a(net.minecraft.world.IInteractionObject p0) {
((net.minecraft.entity.player.EntityPlayerMP)(this)).X();
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.Ae(this.cy, ((net.minecraft.world.IInteractionObject)(p0)).c__String(), ((net.minecraft.world.IInteractionObject)(p0)).a__C5()))));
    this.bG = ((moom.v8)(((net.minecraft.world.IInteractionObject)(p0)).a(((net.minecraft.entity.player.InventoryPlayer)(this.bD)), ((net.minecraft.entity.player.EntityPlayer)(this)))));
    ((moom.v8)(this.bG)).c = ((int)(this.cy));
    ((moom.v8)(this.bG)).a(((net.minecraft.inventory.ICrafting)(this)));
    return;
}


public void a(net.minecraft.inventory.IInventory p0) { __sourceHandlerCall_5603ff0a0366d75ec65f(this, p0); }


public void a(net.minecraft.entity.IMerchant p0) {
long life2_3;
    moom.wA life4_29;
    net.minecraft.util.IChatComponent life5_32;
    moom.OF life6_48;
    net.minecraft.network.PacketBuffer life7_55;
    life2_3 = (net.minecraft.entity.player.EntityPlayerMP.db ^ 72805025399237L);
    ((net.minecraft.entity.player.EntityPlayerMP)(this)).X();
    this.bG = ((moom.v8)(new moom.wi(this.bD, p0, this.i)));
    ((moom.v8)(this.bG)).c = ((int)(this.cy));
    __sourceExactCall_846faa72b57e06(((moom.v8)(this.bG)), ((net.minecraft.inventory.ICrafting)(this)));
    life4_29 = ((moom.wi)(((moom.wi)(this.bG)))).a__sourceReturn_67261f1639();
    life5_32 = ((net.minecraft.entity.IMerchant)(p0)).a__C5();
    __sourceExactCall_1a90c6050b1122(((net.minecraft.network.NetHandlerPlayServer)(this.cg)), ((moom.yK)(new moom.Ae(this.cy, "minecraft:villager", life5_32, __sourceExactCall_7c5e4d6c259504(((net.minecraft.inventory.IInventory)(life4_29)))))));
    life6_48 = __sourceExactCall_91da5b4f0de835(((net.minecraft.entity.IMerchant)(p0)), ((net.minecraft.entity.player.EntityPlayer)(this)));
    if ((life6_48 != null)) {
        life7_55 = new net.minecraft.network.PacketBuffer(io.netty.buffer.Unpooled.buffer());
        ((net.minecraft.network.PacketBuffer)(life7_55)).writeInt(((int)(this.cy)));
        ((moom.OF)(life6_48)).a__Void(((net.minecraft.network.PacketBuffer)(life7_55)));
        __sourceExactCall_1a90c6050b1122(((net.minecraft.network.NetHandlerPlayServer)(this.cg)), ((moom.yK)(new moom.Ay("MC|TrList", life7_55))));
    }
    return;
}


public void a(net.minecraft.entity.passive.EntityHorse p0, net.minecraft.inventory.IInventory p1) { __sourceHandlerCall_84d83c411558454f4ee6(this, p0, p1); }


public void a(float p0, float p1, boolean p2, boolean p3) { __sourceHandlerCall_19d9da736bc4e33d41fd(this, p0, p1, p2, p3); }


public void a(double p0, boolean p1) { __sourceHandlerCall_0b22504a1a629f3704b7(this, p0, p1); }


protected void a(double p0, boolean p1, net.minecraft.block.Block p2, moom.DT p3) {
return;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public long a__sourceReturn_f9912cc5c6() {
return this.cw;
}


public void a(moom.v8 p0, net.minecraft.inventory.IInventory p1) {
boolean spill1622_0;
    long life3_3;
    int life6_6;
    int life5_7;
    lexical_join_27: {
    life3_3 = (net.minecraft.entity.player.EntityPlayerMP.db ^ 109983680695420L);
    spill1622_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    life6_6 = 0;
    life5_7 = ((spill1622_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    if (!((life6_6 < ((net.minecraft.inventory.IInventory)(p1)).d__Int()))) {
        break lexical_join_27;
    }
    __sourceExactCall_1a90c6050b1122(((net.minecraft.network.NetHandlerPlayServer)(this.cg)), ((moom.yK)(new moom.Ai(((moom.v8)(p0)).c, life6_6, __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(p1)), ((int)(life6_6)))))));
    life6_6 += 1;
    if (!((life5_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a(moom.Ct p0) {
((moom.Ct)(p0)).a(((net.minecraft.entity.player.EntityPlayer)(this)));
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.An(((moom.Ct)(p0)).a__DT()))));
    return;
}


public void m(int p0) {
super.m(((int)(p0)));
    this.cs = ((int)(-1));
    return;
}


public void m(net.minecraft.entity.Entity p0) { __sourceHandlerCall_436ce477cf665ff07ad6(this, p0); }


public void k(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(this)).a__Ew())).a__t2())).b(((net.minecraft.entity.Entity)(this)), ((moom.yK)(new moom.zE(p0, 4))));
    return;
}


public void g__Void() { __sourceHandlerCall_4352ceaeeb6c5922cd04(this); }


public void j(net.minecraft.entity.Entity p0) { __sourceHandlerCall_f6e6d73493f225215b04(this, p0); }


public void U() {
((moom.v8)(this.bG)).a(((net.minecraft.inventory.ICrafting)(this)));
    return;
}


public boolean U__Boolean() { return __sourceHandlerCall_f9cc324602d1ee229abc(this); }


public void K() {
super.K();
    ((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.AB(((net.minecraft.entity.player.EntityPlayerMP)(this)).a__CS(), net.minecraft.network.play.server.S42PacketCombatEvent$Event.END_COMBAT))));
    return;
}


protected void P() { __sourceHandlerCall_fa7a90f54bb97ba126fa(this); }


public void ac() {
this.cw = ((long)(moom.Bl.a__Long()));
    return;
}


private void X() {
long local1 = (net.minecraft.entity.player.EntityPlayerMP.db ^ 55199410335849L);
    this.cy = ((int)(((this.cy % __sourceIntrinsic_296ab52b3f54_originalDynamicSite2010_2(24943, (7148199808583086387L ^ local1))) + 1)));
    return;
}


public void Y() { __sourceHandlerCall_bcae890b60e375f2e65b(this); }


public void T() { __sourceHandlerCall_c9edc3fe49ebb953518f(this); }


protected void W() { __sourceHandlerCall_01a75ab79cf91086d255(this); }


private boolean W__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.Bl)(this.ch)).t())) != 0);
}


private static boolean lambda$updateBiomesExplored$0(java.lang.String p0, net.minecraft.world.biome.BiomeGenBase p1) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(((net.minecraft.world.biome.BiomeGenBase)(p1)).aj)).equals(((java.lang.Object)(p0))))) != 0);
}


public void ab() {
this.cp = ((float)(-0x1.7d784p26f));
    return;
}


public void Q() {
((net.minecraft.network.NetHandlerPlayServer)(this.cg)).a(((moom.yK)(new moom.Af(((moom.v8)(this.bG)).c))));
    ((net.minecraft.entity.player.EntityPlayerMP)(this)).Z();
    return;
}


public void aa() { __sourceHandlerCall_d0218e9cd84a7634f105(this); }


private static native <E extends Throwable> int __sourceIntrinsic_296ab52b3f54_originalDynamicSite2010_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bad3bf6cac83_originalDynamicSite2008_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11796_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_a0086961ca28e5(int p0, long p1);
private static native java.lang.Throwable __sourceExactCall_fd25f1f6e0ec5f(java.lang.Throwable p0);

private static native void __sourceExactCall_846faa72b57e06(moom.v8 p0, net.minecraft.inventory.ICrafting p1);
private static native void __sourceExactCall_1a90c6050b1122(net.minecraft.network.NetHandlerPlayServer p0, moom.yK p1);
private static native int __sourceExactCall_7c5e4d6c259504(net.minecraft.inventory.IInventory p0);
private static native moom.OF __sourceExactCall_91da5b4f0de835(net.minecraft.entity.IMerchant p0, net.minecraft.entity.player.EntityPlayer p1);
private static native int __sourceExactCall_cdf7df5ac5b665(net.minecraft.inventory.IInventory p0, int p1);
}
