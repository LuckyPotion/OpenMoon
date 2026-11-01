package net.minecraft.server.management;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class ServerConfigurationManager {

public static java.io.File a;

public static java.io.File b;

public static java.io.File c;

public static java.io.File d;

private static org.apache.logging.log4j.Logger e;

private static java.text.SimpleDateFormat f;

private moom.Bl g;

private java.util.List<net.minecraft.entity.player.EntityPlayerMP> h;

private java.util.Map<java.util.UUID, net.minecraft.entity.player.EntityPlayerMP> i;

private moom.BF j;

private moom.BE k;

private moom.BG l;

private moom.BH m;

private java.util.Map<java.util.UUID, net.minecraft.stats.StatisticsFile> n;

private net.minecraft.world.storage.IPlayerFileData o;

private boolean p;

protected int q;

private int r;

private net.minecraft.world.WorldSettings$GameType s;

private boolean t;

private int u;

private static boolean v;

private static long y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

public ServerConfigurationManager(moom.Bl p0) { super(); }

private static void __sourceConstructorBody_24a793887d50f2ad(net.minecraft.server.management.ServerConfigurationManager receiver, moom.Bl p0) throws Throwable {
long local2 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 26403105235082L);
    net.minecraft.server.management.ServerConfigurationManager.__sourceConstructorInit_24a793887d50f2ad_0(((net.minecraft.server.management.ServerConfigurationManager)(receiver)));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).h = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).i = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).j = ((moom.BF)(new moom.BF(net.minecraft.server.management.ServerConfigurationManager.a)));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).k = ((moom.BE)(new moom.BE(net.minecraft.server.management.ServerConfigurationManager.b)));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).l = ((moom.BG)(new moom.BG(net.minecraft.server.management.ServerConfigurationManager.c)));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).m = ((moom.BH)(new moom.BH(net.minecraft.server.management.ServerConfigurationManager.d)));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).n = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).g = ((moom.Bl)(p0));
    ((moom.BF)(((net.minecraft.server.management.ServerConfigurationManager)(receiver)).j)).a(((boolean)(false)));
    ((moom.BE)(((net.minecraft.server.management.ServerConfigurationManager)(receiver)).k)).a(((boolean)(false)));
    ((net.minecraft.server.management.ServerConfigurationManager)(receiver)).q = ((int)(__sourceIntrinsic_24a793887d50f2ad_originalDynamicSite3958_21(4742, (8889967488030406170L ^ local2))));
    return;
}


static {
y = ((long)(((moom._a)(moom._c.a(((long)(4534840487420106828L)), ((long)(-1297928225580732343L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(1455059734608L)))));
    int __sourceSpill1918_6 = 0;
    B = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.server.management.ServerConfigurationManager.c(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1918_6))));
    long local0_life9 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 55601899610870L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1918_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1918_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1918_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1918_16 = new byte[8];
    (__sourceSpill1918_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1918_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1918_18 = __sourceSpill1918_16;
    ((javax.crypto.Cipher)(__sourceSpill1918_13)).init(((int)(__sourceSpill1918_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1918_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1918_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[10];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "rCi`Ë)âC\033O©½ì>$;Ó%<bZ7&»-â\036Ø÷¨þ° ÐÖÏ¸\177¼o\033+É²\000\027WÈÌ:ÿp^Étø~P\f"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1918_27 = local6_life23;
        int __sourceSpill1918_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1918_27)).substring(((int)(__sourceSpill1918_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1918_32 = local8_life21;
        int __sourceSpill1918_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1918_35 = new byte[8];
        (__sourceSpill1918_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1918_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1918_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1918_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1918_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1918_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1918_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1918_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1918_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1918_36)).doFinal(((byte[])(__sourceSpill1918_35)));
        (__sourceSpill1918_32)[__sourceSpill1918_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "~,`ÙàÏ|u\013È\025AnÌ\022"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1918_40 = local6_life23;
        int __sourceSpill1918_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1918_40)).substring(((int)(__sourceSpill1918_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1918_45 = local8_life21;
        int __sourceSpill1918_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1918_48 = new byte[8];
        (__sourceSpill1918_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1918_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1918_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1918_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1918_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1918_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1918_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1918_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1918_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1918_49)).doFinal(((byte[])(__sourceSpill1918_48)));
        (__sourceSpill1918_45)[__sourceSpill1918_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    z = ((long[])(local8_life21));
    A = ((java.lang.Integer[])(new java.lang.Integer[10]));
    a = ((java.io.File)(new java.io.File("banned-players.json")));
    b = ((java.io.File)(new java.io.File("banned-ips.json")));
    c = ((java.io.File)(new java.io.File("ops.json")));
    d = ((java.io.File)(new java.io.File("whitelist.json")));
    e = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    f = ((java.text.SimpleDateFormat)(new java.text.SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z")));
}

private static native <E extends Throwable> void __sourceConstructorInit_24a793887d50f2ad_0(net.minecraft.server.management.ServerConfigurationManager a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_d4b1b501320dd46f1613(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.util.IChatComponent a1, boolean a2) throws E;
private static final class __SourceHandler_d4b1b501320dd46f1613 {

public static void f720011(net.minecraft.server.management.ServerConfigurationManager receiver, net.minecraft.util.IChatComponent p0, boolean p1) throws Throwable {
    int forestValue720011_15_0;
    int forestValue720011_17_0;
    boolean spill720011_0;
    boolean spill720011_1;
    net.minecraft.server.management.ServerConfigurationManager spill720011_2;
    moom.zv spill720011_3;
    long life3_3;
    int life5_9;
    int life6_19;
    forest_join_17: {
    forest_join_16: {
    forest_join_15: {
    life3_3 = (__fieldRead720011_0() ^ 123168536435940L);
    spill720011_0 = __call720011_1();
    __call720011_3(__fieldRead720011_2(receiver), p0);
    life5_9 = __integerCategory720011_4(spill720011_0);
    spill720011_1 = p1;
    if (!((life5_9 == 0))) {
        forestValue720011_15_0 = __integerCategory720011_5(spill720011_1);
        break forest_join_15;
    }
    if (!(spill720011_1)) {
        break forest_join_16;
    }
    forestValue720011_15_0 = 1;
    }
    forestValue720011_17_0 = forestValue720011_15_0;
    break forest_join_17;
    }
    forestValue720011_17_0 = 0;
    }
    life6_19 = ((byte) forestValue720011_17_0);
    spill720011_2 = receiver;
    moom.zv __stackOp720011_7_0 = __sourceUninitializedNEW720011_6();
    spill720011_3 = __stackOp720011_7_0;
    __explicitNewInit720011_8(__stackOp720011_7_0, p0, __integerCategory720011_9(life6_19));
    __call720011_10(spill720011_2, spill720011_3);
    return;
}
private static native long __fieldRead720011_0() throws Throwable;
private static native boolean __call720011_1() throws Throwable;
private static native moom.Bl __fieldRead720011_2(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call720011_3(moom.Bl a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native int __integerCategory720011_4(boolean value) throws Throwable;
private static native int __integerCategory720011_5(boolean value) throws Throwable;
private static native moom.zv __sourceUninitializedNEW720011_6() throws Throwable;
private static native byte __integerCategory720011_9(int value) throws Throwable;
private static native void __explicitNewInit720011_8(moom.zv a0, net.minecraft.util.IChatComponent a1, byte a2) throws Throwable;
private static native void __call720011_10(net.minecraft.server.management.ServerConfigurationManager a0, moom.zv a1) throws Throwable;

}


public java.lang.String[] b__ArrayString() {
return ((moom.BH)(this.m)).a__ArrayString();
}


public void b(net.minecraft.entity.player.EntityPlayerMP p0, net.minecraft.world.WorldServer p1) {
long life3_3;
    net.minecraft.world.border.WorldBorder life6_11;
    int life5_12;
    forward_join_76: {
    forward_join_62: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 88176298765901L);
    boolean spill6277_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life6_11 = ((net.minecraft.world.WorldServer)((((moom.Bl)(this.g)).n)[0])).a__Fi();
    life5_12 = ((spill6277_0) ? 1 : 0);
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.AE(life6_11, net.minecraft.network.play.server.S44PacketWorldBorder$Action.INITIALIZE))));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zw(((net.minecraft.world.WorldServer)(p1)).b__Long(), ((net.minecraft.world.WorldServer)(p1)).c__Long(), ((net.minecraft.world.GameRules)(((net.minecraft.world.WorldServer)(p1)).a__Ej())).a__Boolean(((java.lang.String)("doDaylightCycle")))))));
    if (!((life5_12 != 0))) { break forward_join_62; }
    if (!(((net.minecraft.world.WorldServer)(p1)).g__Boolean())) { break forward_join_76; }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.Ac(1, 0x0.0p0f))));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.Ac(__sourceIntrinsic_a59c4acf8be0_invokedynamic6277_19(10205, (2387335709874851201L ^ life3_3)), ((net.minecraft.world.WorldServer)(p1)).f(((float)(0x1.0p0f)))))));
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.Ac(__sourceIntrinsic_a59c4acf8be0_invokedynamic6277_23(32696, (8657541849848632802L ^ life3_3)), ((net.minecraft.world.WorldServer)(p1)).e(((float)(0x1.0p0f)))))));
    }
    return;
}


public int b() {
return ((java.util.List)(this.h)).size();
}


public void b(com.mojang.authlib.GameProfile p0) {
((moom.BG)(this.l)).a__Void(((p0)));
    return;
}


public boolean b__Boolean(com.mojang.authlib.GameProfile p0) {
int forwardValue5616_40_0;
    int forwardValue5616_44_0;
    int forwardValue5616_46_0;
    boolean spill5616_0;
    boolean spill5616_1;
    boolean spill5616_2;
    boolean spill5616_3;
    long life2_3;
    int life4_5;
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_40: {
    forward_join_38: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 109541535037971L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill5616_0 = ((moom.BG)(this.l)).a__Boolean(((p0)));
    if (!((life4_5 == 0))) {
        forwardValue5616_44_0 = ((spill5616_0) ? 1 : 0);
        break forward_join_44;
    }
    if (!((!spill5616_0))) {
        break forward_join_43;
    }
    spill5616_1 = ((moom.Bl)(this.g)).l__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5616_40_0 = ((spill5616_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill5616_1)) {
        break forward_join_38;
    }
    spill5616_2 = ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.WorldServer)((((moom.Bl)(this.g)).n)[0])).a__IX())).e__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5616_40_0 = ((spill5616_2) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill5616_2)) {
        break forward_join_38;
    }
    spill5616_3 = ((java.lang.String)(((moom.Bl)(this.g)).e__String())).equalsIgnoreCase(((java.lang.String)(((com.mojang.authlib.GameProfile)(p0)).getName())));
    if (!((life4_5 == 0))) {
        forwardValue5616_44_0 = ((spill5616_3) ? 1 : 0);
        break forward_join_44;
    }
    if (!((!spill5616_3))) {
        break forward_join_43;
    }
    }
    forwardValue5616_40_0 = ((this.t) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5616_44_0 = forwardValue5616_40_0;
        break forward_join_44;
    }
    if (!((forwardValue5616_40_0 != 0))) {
        break forward_join_45;
    }
    }
    forwardValue5616_44_0 = 1;
    }
    forwardValue5616_46_0 = forwardValue5616_44_0;
    break forward_join_46;
    }
    forwardValue5616_46_0 = 0;
    }
    return ((forwardValue5616_46_0) != 0);
}


public void b(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.util.IChatComponent p1) {
net.minecraft.entity.player.EntityPlayerMP lexicalValue1676_36_0;
    boolean spill1676_0;
    net.minecraft.entity.player.EntityPlayerMP spill1676_1;
    long life3_3;
    moom.Bj life6_7;
    int life5_8;
    java.util.Iterator life7_27;
    net.minecraft.entity.player.EntityPlayerMP life8_34;
    lexical_join_40: {
    lexical_join_18: {
    lexical_join_16: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 98285344156647L);
    spill1676_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life6_7 = __sourceExactCall_d6bdea0297b187(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life5_8 = ((spill1676_0) ? 1 : 0);
    if (!((life5_8 == 0))) {
        break lexical_join_16;
    }
    if (!((life6_7 == null))) {
        break lexical_join_18;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.util.IChatComponent)(p1)));
    }
    if (!((life5_8 != 0))) {
        break lexical_join_40;
    }
    }
    life7_27 = ((java.util.List)(this.h)).iterator();
    lexical_cycle_22: while (true) {
    lexical_join_38: {
    lexical_join_36: {
    if (!(((java.util.Iterator)(life7_27)).hasNext())) {
        break lexical_join_40;
    }
    life8_34 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life7_27)).next()));
    spill1676_1 = life8_34;
    if (!((life5_8 == 0))) {
        lexicalValue1676_36_0 = spill1676_1;
        break lexical_join_36;
    }
    if (!((__sourceExactCall_488d28ed0ee1d2(((net.minecraft.entity.player.EntityPlayerMP)(spill1676_1))) != life6_7))) {
        break lexical_join_38;
    }
    lexicalValue1676_36_0 = life8_34;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue1676_36_0)).a(((net.minecraft.util.IChatComponent)(p1)));
    }
    if (!((life5_8 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return;
}


public void b__Void() {
boolean spill1678_0;
    long life1_3;
    java.util.Iterator life4_8;
    int life3_9;
    net.minecraft.entity.player.EntityPlayerMP life5_16;
    lexical_join_22: {
    life1_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 62534470444612L);
    spill1678_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life4_8 = ((java.util.List)(this.h)).iterator();
    life3_9 = ((spill1678_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_22;
    }
    life5_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life4_8)).next()));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a__Void(((net.minecraft.entity.player.EntityPlayerMP)(life5_16)));
    if (!((life3_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void b(net.minecraft.entity.player.EntityPlayerMP p0) {
boolean spill1677_0;
    long life2_3;
    int life4_29;
    net.minecraft.world.WorldServer life5_35;
    java.util.Iterator life6_47;
    net.minecraft.entity.player.EntityPlayerMP life7_54;
    lexical_join_70: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 119296170136554L);
    spill1677_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    ((java.util.List)(this.h)).add(((java.lang.Object)(p0)));
    ((java.util.Map)(this.i)).put(((java.lang.Object)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__UUID())), ((java.lang.Object)(p0)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((moom.yK)(new moom.Ap(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.ADD_PLAYER, new net.minecraft.entity.player.EntityPlayerMP[] {p0}))));
    life4_29 = ((spill1677_0) ? 1 : 0);
    life5_35 = ((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af)));
    ((net.minecraft.world.WorldServer)(life5_35)).b__Boolean(((net.minecraft.entity.Entity)(p0)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.entity.player.EntityPlayerMP)(p0)), ((net.minecraft.world.WorldServer)(null)));
    life6_47 = ((java.util.List)(this.h)).iterator();
    lexical_cycle_48: while (true) {
    if (!(((java.util.Iterator)(life6_47)).hasNext())) {
        break lexical_join_70;
    }
    life7_54 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life6_47)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.Ap(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.ADD_PLAYER, new net.minecraft.entity.player.EntityPlayerMP[] {life7_54}))));
    if (!((life4_29 == 0))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    return;
}


public static boolean b__Boolean() {
return ((((net.minecraft.server.management.ServerConfigurationManager.v) ? 1 : 0)) != 0);
}


public void b(boolean p0) {
this.t = ((boolean)(p0));
    return;
}


public void e(net.minecraft.entity.player.EntityPlayerMP p0) {
__sourceExactCall_7e76344e5ca6b8(((net.minecraft.entity.player.EntityPlayerMP)(p0)), ((moom.v8)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).bF)));
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).ab();
    __sourceExactCall_1a90c6050b1122(((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)), ((moom.yK)(new moom.zC(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).bD)).c))));
    return;
}


public void c(com.mojang.authlib.GameProfile p0) {
__sourceExactCall_4e1d85d6955bc2(((moom.BH)(this.m)), ((net.minecraft.server.management.UserListEntry)(new moom.BP(p0))));
    return;
}


public static void c(boolean p0) {
v = ((boolean)(p0));
    return;
}


public boolean c__Boolean(com.mojang.authlib.GameProfile p0) {
return ((0) != 0);
}


public int c() {
return this.q;
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(net.minecraft.server.management.ServerConfigurationManager.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public void c(net.minecraft.entity.player.EntityPlayerMP p0) {
((moom.Br)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Ew())).a__Br())).d(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    return;
}


public void c__Void() {
return;
}


public java.lang.String[] c__ArrayString() {
return ((moom.BG)(this.l)).a__ArrayString();
}


public void d__Void() {
boolean spill1679_0;
    long life1_3;
    java.util.Iterator life4_8;
    int life3_9;
    net.minecraft.entity.player.EntityPlayerMP life5_16;
    lexical_join_23: {
    life1_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 17661873093130L);
    spill1679_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life4_8 = ((java.util.List)(this.h)).iterator();
    life3_9 = ((spill1679_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_23;
    }
    life5_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life4_8)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life5_16)).cg)).a(((java.lang.String)("Server closed")));
    if (!((life3_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public int d() {
return this.r;
}


public java.lang.String[] d__ArrayString() {
return ((net.minecraft.world.storage.IPlayerFileData)(((net.minecraft.world.storage.ISaveHandler)(((net.minecraft.world.WorldServer)((((moom.Bl)(this.g)).n)[0])).a__IL())).a__IJ())).a__ArrayString();
}


public void d(com.mojang.authlib.GameProfile p0) {
((moom.BH)(this.m)).a__Void(((p0)));
    return;
}


public void d(net.minecraft.entity.player.EntityPlayerMP p0) {
net.minecraft.entity.player.EntityPlayerMP forwardValue5618_40_0;
    boolean spill5618_0;
    net.minecraft.entity.player.EntityPlayerMP spill5618_1;
    long life2_3;
    net.minecraft.world.WorldServer life5_13;
    int life4_14;
    java.util.UUID life6_47;
    net.minecraft.entity.player.EntityPlayerMP life7_53;
    forward_join_75: {
    forward_join_63: {
    forward_join_40: {
    forward_join_27: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 75253837394673L);
    spill5618_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).a(((moom.BY)(net.minecraft.stats.StatList.f)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a__Void(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    life5_13 = ((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Ew();
    life4_14 = ((spill5618_0) ? 1 : 0);
    spill5618_1 = p0;
    if (!((life4_14 != 0))) {
        forwardValue5618_40_0 = spill5618_1;
        break forward_join_40;
    }
    if (!((((net.minecraft.entity.player.EntityPlayerMP)(spill5618_1)).g != null))) {
        break forward_join_27;
    }
    ((net.minecraft.world.WorldServer)(life5_13)).d(((net.minecraft.entity.Entity)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).g)));
    ((org.apache.logging.log4j.Logger)(net.minecraft.server.management.ServerConfigurationManager.e)).debug(((java.lang.String)("removing player mount")));
    }
    ((net.minecraft.world.WorldServer)(life5_13)).c(((net.minecraft.entity.Entity)(p0)));
    ((moom.Br)(((net.minecraft.world.WorldServer)(life5_13)).a__Br())).c(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    ((java.util.List)(this.h)).remove(((java.lang.Object)(p0)));
    forwardValue5618_40_0 = p0;
    }
    life6_47 = ((net.minecraft.entity.player.EntityPlayerMP)(forwardValue5618_40_0)).a__UUID();
    life7_53 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Map)(this.i)).get(((java.lang.Object)(life6_47)))));
    if (!((life4_14 != 0))) {
        break forward_join_75;
    }
    if (!((life7_53 == p0))) {
        break forward_join_63;
    }
    ((java.util.Map)(this.i)).remove(((java.lang.Object)(life6_47)));
    ((java.util.Map)(this.n)).remove(((java.lang.Object)(life6_47)));
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((moom.yK)(new moom.Ap(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.REMOVE_PLAYER, new net.minecraft.entity.player.EntityPlayerMP[] {p0}))));
    }
    return;
}


public void a(net.minecraft.util.IChatComponent p0, boolean p1) { __sourceHandlerCall_d4b1b501320dd46f1613(this, p0, p1); }


public net.minecraft.nbt.NBTTagCompound a(net.minecraft.entity.player.EntityPlayerMP p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5600_39_0;
    boolean spill5600_0;
    net.minecraft.nbt.NBTTagCompound spill5600_1;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_12;
    int life4_13;
    net.minecraft.nbt.NBTTagCompound life6_35;
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 89317045716724L);
    spill5600_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_12 = ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.WorldServer)((((moom.Bl)(this.g)).n)[0])).a__IX())).b__yw();
    life4_13 = ((spill5600_0) ? 1 : 0);
    if (!(((java.lang.String)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__String())).equals(((java.lang.Object)(((moom.Bl)(this.g)).e__String()))))) {
        break forward_join_35;
    }
    spill5600_1 = life5_12;
    if (!((life4_13 != 0))) {
        forwardValue5600_39_0 = spill5600_1;
        break forward_join_39;
    }
    if (!((spill5600_1 != null))) {
        break forward_join_35;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).b(((net.minecraft.nbt.NBTTagCompound)(life5_12)));
    life6_35 = life5_12;
    ((org.apache.logging.log4j.Logger)(net.minecraft.server.management.ServerConfigurationManager.e)).debug(((java.lang.String)("loading single player")));
    if (!((life4_13 == 0))) {
        break forward_join_40;
    }
    }
    forwardValue5600_39_0 = ((net.minecraft.world.storage.IPlayerFileData)(this.o)).a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    }
    life6_35 = forwardValue5600_39_0;
    }
    return life6_35;
}


protected void a__Void(net.minecraft.entity.player.EntityPlayerMP p0) {
net.minecraft.stats.StatisticsFile forwardValue5612_22_0;
    boolean spill5612_0;
    net.minecraft.stats.StatisticsFile spill5612_1;
    long life2_3;
    int life4_9;
    net.minecraft.stats.StatisticsFile life5_16;
    forward_join_23: {
    forward_join_22: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 122760885028543L);
    spill5612_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    ((net.minecraft.world.storage.IPlayerFileData)(this.o)).a__Void(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_9 = ((spill5612_0) ? 1 : 0);
    life5_16 = ((net.minecraft.stats.StatisticsFile)(((java.util.Map)(this.n)).get(((java.lang.Object)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__UUID())))));
    spill5612_1 = life5_16;
    if (!((life4_9 != 0))) {
        forwardValue5612_22_0 = spill5612_1;
        break forward_join_22;
    }
    if (!((spill5612_1 != null))) {
        break forward_join_23;
    }
    forwardValue5612_22_0 = life5_16;
    }
    ((net.minecraft.stats.StatisticsFile)(forwardValue5612_22_0)).b();
    }
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.util.IChatComponent)(p0)), ((boolean)(true)));
    return;
}


public net.minecraft.stats.StatisticsFile a(net.minecraft.entity.player.EntityPlayer p0) {
java.lang.Object forwardValue5597_19_0;
    net.minecraft.stats.StatisticsFile forwardValue5597_20_0;
    java.lang.Object forwardValue5597_85_0;
    net.minecraft.stats.StatisticsFile forwardValue5597_87_0;
    boolean spill5597_0;
    java.util.UUID spill5597_1;
    net.minecraft.stats.StatisticsFile spill5597_2;
    java.io.File spill5597_3;
    java.io.File spill5597_4;
    java.io.File spill5597_5;
    long life2_3;
    java.util.UUID life5_7;
    int life4_8;
    net.minecraft.stats.StatisticsFile life6_25;
    java.io.File life7_43;
    java.io.File life8_51;
    java.io.File life9_67;
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_71: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 103935153856583L);
    spill5597_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_7 = ((net.minecraft.entity.player.EntityPlayer)(p0)).a__UUID();
    life4_8 = ((spill5597_0) ? 1 : 0);
    spill5597_1 = life5_7;
    if (!((life4_8 != 0))) {
        forwardValue5597_19_0 = spill5597_1;
        break forward_join_19;
    }
    if (!((spill5597_1 == null))) {
        break forward_join_15;
    }
    forwardValue5597_20_0 = null;
    break forward_join_20;
    }
    forwardValue5597_19_0 = ((java.util.Map)(this.n)).get(((java.lang.Object)(life5_7)));
    }
    forwardValue5597_20_0 = ((net.minecraft.stats.StatisticsFile)(forwardValue5597_19_0));
    }
    life6_25 = forwardValue5597_20_0;
    spill5597_2 = life6_25;
    if (!((life4_8 != 0))) {
        forwardValue5597_87_0 = spill5597_2;
        break forward_join_87;
    }
    if (!((spill5597_2 == null))) {
        break forward_join_86;
    }
    life7_43 = new java.io.File(((net.minecraft.world.storage.ISaveHandler)(((net.minecraft.world.WorldServer)(((moom.Bl)(this.g)).a(((int)(0))))).a__IL())).a(), "stats");
    life8_51 = new java.io.File(life7_43, __sourceIntrinsic_9962c0096975_invokedynamic5597_12(((java.util.UUID)(life5_7)).toString()));
    spill5597_3 = life8_51;
    if (!((life4_8 != 0))) {
        forwardValue5597_85_0 = spill5597_3;
        break forward_join_85;
    }
    if (!((!((java.io.File)(spill5597_3)).exists()))) {
        break forward_join_71;
    }
    life9_67 = new java.io.File(life7_43, __sourceIntrinsic_9962c0096975_invokedynamic5597_15(((net.minecraft.entity.player.EntityPlayer)(p0)).a__String()));
    spill5597_4 = life9_67;
    if (!((life4_8 != 0))) {
        forwardValue5597_85_0 = spill5597_4;
        break forward_join_85;
    }
    if (!(((java.io.File)(spill5597_4)).exists())) {
        break forward_join_71;
    }
    spill5597_5 = life9_67;
    if (!((life4_8 != 0))) {
        forwardValue5597_85_0 = spill5597_5;
        break forward_join_85;
    }
    if (!(((java.io.File)(spill5597_5)).isFile())) {
        break forward_join_71;
    }
    ((java.io.File)(life9_67)).renameTo(((java.io.File)(life8_51)));
    }
    life6_25 = new net.minecraft.stats.StatisticsFile(this.g, life8_51);
    ((net.minecraft.stats.StatisticsFile)(life6_25)).a__Void();
    forwardValue5597_85_0 = ((java.util.Map)(this.n)).put(((java.lang.Object)(life5_7)), ((java.lang.Object)(life6_25)));
    }
    recovery.source.CarrierOps.discard(forwardValue5597_85_0);
    }
    forwardValue5597_87_0 = life6_25;
    }
    return forwardValue5597_87_0;
}


public void a(int p0) {
net.minecraft.world.WorldServer[] lexicalValue1661_18_0;
    boolean spill1661_0;
    net.minecraft.world.WorldServer[] spill1661_1;
    long life2_3;
    int life4_8;
    net.minecraft.world.WorldServer[] life5_24;
    int life6_27;
    int life7_29;
    net.minecraft.world.WorldServer life8_36;
    lexical_join_42: {
    lexical_join_18: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 44430027009137L);
    spill1661_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    this.r = ((int)(p0));
    life4_8 = ((spill1661_0) ? 1 : 0);
    spill1661_1 = ((moom.Bl)(this.g)).n;
    if (!((life4_8 == 0))) {
        lexicalValue1661_18_0 = spill1661_1;
        break lexical_join_18;
    }
    if (!((spill1661_1 != null))) {
        break lexical_join_42;
    }
    lexicalValue1661_18_0 = ((moom.Bl)(this.g)).n;
    }
    life5_24 = lexicalValue1661_18_0;
    life6_27 = (life5_24).length;
    life7_29 = 0;
    lexical_cycle_24: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    if (!((life7_29 < life6_27))) {
        break lexical_join_42;
    }
    life8_36 = (life5_24)[life7_29];
    if (!((life4_8 == 0))) {
        break lexical_join_40;
    }
    if (!((life8_36 != null))) {
        break lexical_join_39;
    }
    ((moom.Br)(((net.minecraft.world.WorldServer)(life8_36)).a__Br())).a__Void(((int)(p0)));
    }
    life7_29 += 1;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    return;
}


public java.util.List<net.minecraft.entity.player.EntityPlayerMP> a(java.lang.String p0) {
int lexicalValue1663_29_0;
    boolean spill1663_0;
    boolean spill1663_1;
    long life2_3;
    java.util.ArrayList life5_6;
    int life4_7;
    java.util.Iterator life6_11;
    net.minecraft.entity.player.EntityPlayerMP life7_18;
    lexical_join_32: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 1329742441454L);
    spill1663_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    life4_7 = ((spill1663_0) ? 1 : 0);
    life6_11 = ((java.util.List)(this.h)).iterator();
    lexical_cycle_12: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_32;
    }
    life7_18 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life6_11)).next()));
    spill1663_1 = ((java.lang.String)(((net.minecraft.entity.player.EntityPlayerMP)(life7_18)).b__sourceReturn_0e30dfc966())).equals(((java.lang.Object)(p0)));
    if (!((life4_7 != 0))) {
        lexicalValue1663_29_0 = ((spill1663_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill1663_1)) {
        break lexical_join_30;
    }
    lexicalValue1663_29_0 = ((((java.util.List)(life5_6)).add(((java.lang.Object)(life7_18)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1663_29_0);
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_6;
}


public moom.Bl a__Bl() {
return this.g;
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
return null;
}


public void a(net.minecraft.world.WorldSettings$GameType p0) {
this.s = ((net.minecraft.world.WorldSettings$GameType)(p0));
    return;
}


private void a(net.minecraft.entity.player.EntityPlayerMP p0, net.minecraft.entity.player.EntityPlayerMP p1, net.minecraft.world.World p2) {
net.minecraft.entity.player.EntityPlayerMP forwardValue5603_11_0;
    net.minecraft.entity.player.EntityPlayerMP spill5603_0;
    long life4_3;
    int life6_5;
    forward_join_26: {
    forward_join_18: {
    forward_join_11: {
    life4_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 72552162023306L);
    life6_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill5603_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue5603_11_0 = spill5603_0;
        break forward_join_11;
    }
    if (!((spill5603_0 != null))) {
        break forward_join_18;
    }
    forwardValue5603_11_0 = p0;
    }
    ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(forwardValue5603_11_0)).ci)).a(((net.minecraft.world.WorldSettings$GameType)(((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).ci)).a())));
    if (!((life6_5 != 0))) {
        break forward_join_26;
    }
    }
    if (!((this.s != null))) {
        break forward_join_26;
    }
    ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).ci)).a(((net.minecraft.world.WorldSettings$GameType)(this.s)));
    }
    ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).ci)).b(((net.minecraft.world.WorldSettings$GameType)(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p2)).a__IX())).a__bE())));
    return;
}


protected void a(moom.Bi p0, net.minecraft.entity.player.EntityPlayerMP p1) {
boolean spill1664_0;
    long life3_3;
    java.util.HashSet life6_5;
    java.util.Iterator life7_10;
    int life5_11;
    moom.Bk life8_18;
    int life7_30;
    net.minecraft.scoreboard.ScoreObjective life8_41;
    java.util.Iterator life9_60;
    moom.yK life10_67;
    lexical_join_77: {
    lexical_join_29: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 113069082179685L);
    life6_5 = com.google.common.collect.Sets.newHashSet();
    spill1664_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life7_10 = ((java.util.Collection)(((moom.Bi)(p0)).e())).iterator();
    life5_11 = ((spill1664_0) ? 1 : 0);
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life7_10)).hasNext())) {
        break lexical_join_29;
    }
    life8_18 = ((moom.Bk)(((java.util.Iterator)(life7_10)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).cg)).a(((moom.yK)(new moom.Ax(life8_18, 0))));
    if (!((life5_11 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    life7_30 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_70: {
    if (!((life7_30 < __sourceIntrinsic_a7f56b5f490a_invokedynamic1664_11(651, (5243988009449258749L ^ life3_3))))) {
        break lexical_join_77;
    }
    life8_41 = ((moom.Bi)(p0)).a__Bg(((int)(life7_30)));
    if (!((life5_11 == 0))) {
        break lexical_join_75;
    }
    if (!((life8_41 != null))) {
        break lexical_join_74;
    }
    if (!((!((java.util.Set)(life6_5)).contains(((java.lang.Object)(life8_41)))))) {
        break lexical_join_74;
    }
    life9_60 = ((java.util.List)(((moom.Bi)(p0)).a__List(((net.minecraft.scoreboard.ScoreObjective)(life8_41))))).iterator();
    lexical_cycle_55: while (true) {
    if (!(((java.util.Iterator)(life9_60)).hasNext())) {
        break lexical_join_70;
    }
    life10_67 = ((moom.yK)(((java.util.Iterator)(life9_60)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).cg)).a(((moom.yK)(life10_67)));
    if (!((life5_11 == 0))) {
        break lexical_join_75;
    }
    if (!((life5_11 != 0))) { continue lexical_cycle_55; }
    break lexical_cycle_55;
    }
    }
    ((java.util.Set)(life6_5)).add(((java.lang.Object)(life8_41)));
    }
    life7_30 += 1;
    }
    if (!((life5_11 != 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    return;
}


public void a(net.minecraft.network.NetworkManager p0, net.minecraft.entity.player.EntityPlayerMP p1) {
com.mojang.authlib.GameProfile lexicalValue1671_26_0;
    java.lang.String lexicalValue1671_27_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1671_291_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1671_303_0;
    java.lang.String lexicalValue1671_303_1;
    net.minecraft.entity.Entity lexicalValue1671_322_0;
    boolean spill1671_0;
    com.mojang.authlib.GameProfile spill1671_1;
    net.minecraft.nbt.NBTTagCompound spill1671_2;
    java.lang.String spill1671_3;
    net.minecraft.entity.Entity spill1671_4;
    long life3_3;
    com.mojang.authlib.GameProfile life6_6;
    moom.Bt life7_11;
    com.mojang.authlib.GameProfile life8_16;
    int life5_17;
    java.lang.String life9_32;
    net.minecraft.nbt.NBTTagCompound life10_39;
    java.lang.String life11_54;
    net.minecraft.world.WorldServer life12_86;
    net.minecraft.world.storage.WorldInfo life13_89;
    moom.DT life14_92;
    net.minecraft.network.NetHandlerPlayServer life15_105;
    moom.CN life16_211;
    java.util.Iterator life17_278;
    net.minecraft.potion.PotionEffect life18_285;
    net.minecraft.entity.Entity life17_332;
    lexical_join_324: {
    lexical_join_322: {
    lexical_join_303: {
    lexical_join_291: {
    lexical_join_286: {
    lexical_join_284: {
    lexical_join_261: {
    lexical_join_221: {
    lexical_join_209: {
    lexical_join_73: {
    lexical_join_59: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_25: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 108163221976141L);
    life6_6 = ((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__sourceReturn_cd99b948a0();
    spill1671_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life7_11 = ((moom.Bl)(this.g)).a__Bt();
    life8_16 = ((moom.Bt)(life7_11)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(life6_6)).getId())));
    life5_17 = ((spill1671_0) ? 1 : 0);
    spill1671_1 = life8_16;
    if (!((life5_17 != 0))) {
        lexicalValue1671_26_0 = spill1671_1;
        break lexical_join_26;
    }
    if (!((spill1671_1 == null))) {
        break lexical_join_25;
    }
    lexicalValue1671_27_0 = ((com.mojang.authlib.GameProfile)(life6_6)).getName();
    break lexical_join_27;
    }
    lexicalValue1671_26_0 = life8_16;
    }
    lexicalValue1671_27_0 = ((com.mojang.authlib.GameProfile)(lexicalValue1671_26_0)).getName();
    }
    life9_32 = lexicalValue1671_27_0;
    ((moom.Bt)(life7_11)).a(((com.mojang.authlib.GameProfile)(life6_6)));
    life10_39 = ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.entity.player.EntityPlayerMP)(p1)));
    ((net.minecraft.entity.player.EntityPlayerMP)(p1)).a(((net.minecraft.world.World)(((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).af))))));
    ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).ci)).a(((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).i)))));
    life11_54 = "local";
    if (!((life5_17 != 0))) {
        break lexical_join_73;
    }
    if (!((((net.minecraft.network.NetworkManager)(p0)).a__SocketAddress() != null))) {
        break lexical_join_59;
    }
    life11_54 = ((java.lang.Object)(((net.minecraft.network.NetworkManager)(p0)).a__SocketAddress())).toString();
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.server.management.ServerConfigurationManager.e)).info(((java.lang.String)(__sourceIntrinsic_828fa99223c9_invokedynamic1671_29(((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__String(), life11_54, ((net.minecraft.entity.player.EntityPlayerMP)(p1)).e__Int(), ((net.minecraft.entity.player.EntityPlayerMP)(p1)).n, ((net.minecraft.entity.player.EntityPlayerMP)(p1)).o, ((net.minecraft.entity.player.EntityPlayerMP)(p1)).p))));
    }
    life12_86 = ((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).af)));
    life13_89 = ((net.minecraft.world.WorldServer)(life12_86)).a__IX();
    life14_92 = ((net.minecraft.world.WorldServer)(life12_86)).a__DT();
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.entity.player.EntityPlayerMP)(p1)), ((net.minecraft.entity.player.EntityPlayerMP)(null)), ((net.minecraft.world.World)(life12_86)));
    life15_105 = new net.minecraft.network.NetHandlerPlayServer(this.g, p0, p1);
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((moom.yK)(new moom.zu(((net.minecraft.entity.player.EntityPlayerMP)(p1)).e__Int(), ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).ci)).a(), ((net.minecraft.world.storage.WorldInfo)(life13_89)).d__Boolean(), ((moom.EA)(((net.minecraft.world.WorldServer)(life12_86)).v)).b(), ((net.minecraft.world.WorldServer)(life12_86)).a__bB(), ((net.minecraft.server.management.ServerConfigurationManager)(this)).c(), ((net.minecraft.world.storage.WorldInfo)(life13_89)).a__EL(), ((net.minecraft.world.GameRules)(((net.minecraft.world.WorldServer)(life12_86)).a__Ej())).a__Boolean(((java.lang.String)("reducedDebugInfo")))))));
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((moom.yK)(new moom.Ay("MC|Brand", ((net.minecraft.network.PacketBuffer)(new net.minecraft.network.PacketBuffer(io.netty.buffer.Unpooled.buffer()))).a(((java.lang.String)(((moom.Bl)(((net.minecraft.server.management.ServerConfigurationManager)(this)).a__Bl())).d__String())))))));
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((moom.yK)(new moom.AA(((net.minecraft.world.storage.WorldInfo)(life13_89)).a__bB(), ((net.minecraft.world.storage.WorldInfo)(life13_89)).g__Boolean()))));
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((moom.yK)(new moom.zy(life14_92))));
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((moom.yK)(new moom.As(((net.minecraft.entity.player.EntityPlayerMP)(p1)).b1))));
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((moom.yK)(new moom.zC(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).bD)).c))));
    ((net.minecraft.stats.StatisticsFile)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__B3())).c();
    ((net.minecraft.stats.StatisticsFile)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__B3())).b(((net.minecraft.entity.player.EntityPlayerMP)(p1)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((moom.Bi)(((moom.Bi)(((net.minecraft.world.WorldServer)(life12_86)).a__Bh())))), ((net.minecraft.entity.player.EntityPlayerMP)(p1)));
    ((moom.Bl)(this.g)).l();
    if (!((!((java.lang.String)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__String())).equalsIgnoreCase(((java.lang.String)(life9_32)))))) {
        break lexical_join_209;
    }
    life16_211 = new moom.CN("multiplayer.player.joined.renamed", new java.lang.Object[] {((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__C5(), life9_32});
    if (!((life5_17 == 0))) {
        break lexical_join_221;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[1])));
    }
    life16_211 = new moom.CN("multiplayer.player.joined", new java.lang.Object[] {((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__C5()});
    }
    ((moom.CO)(((moom.CN)(life16_211)).a__CO())).a(((net.minecraft.util.EnumChatFormatting)(net.minecraft.util.EnumChatFormatting.YELLOW)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.util.IChatComponent)(life16_211)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).b(((net.minecraft.entity.player.EntityPlayerMP)(p1)));
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((double)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).n)), ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).o)), ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).p)), ((float)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).w)), ((float)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).x)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).b(((net.minecraft.entity.player.EntityPlayerMP)(p1)), ((net.minecraft.world.WorldServer)(life12_86)));
    if (!((((java.lang.String)(((moom.Bl)(this.g)).h__String())).length() > 0))) {
        break lexical_join_261;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(p1)).a(((java.lang.String)(((moom.Bl)(this.g)).h__String())), ((java.lang.String)(((moom.Bl)(this.g)).i__String())));
    }
    life17_278 = ((java.util.Collection)(((net.minecraft.entity.player.EntityPlayerMP)(p1)).a__Collection())).iterator();
    lexical_cycle_265: while (true) {
    if (!(((java.util.Iterator)(life17_278)).hasNext())) {
        break lexical_join_284;
    }
    life18_285 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life17_278)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(life15_105)).a(((moom.yK)(new moom.zW(((net.minecraft.entity.player.EntityPlayerMP)(p1)).e__Int(), life18_285))));
    if (!((life5_17 != 0))) {
        break lexical_join_286;
    }
    if (!((life5_17 == 0))) { continue lexical_cycle_265; }
    break lexical_cycle_265;
    }
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(p1)).U();
    }
    spill1671_2 = life10_39;
    if (!((life5_17 != 0))) {
        lexicalValue1671_291_0 = spill1671_2;
        break lexical_join_291;
    }
    if (!((spill1671_2 != null))) {
        break lexical_join_324;
    }
    lexicalValue1671_291_0 = life10_39;
    }
    spill1671_3 = "Riding";
    if (!((life5_17 != 0))) {
        lexicalValue1671_303_0 = lexicalValue1671_291_0;
        lexicalValue1671_303_1 = spill1671_3;
        break lexical_join_303;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(lexicalValue1671_291_0)).a__Boolean(((java.lang.String)(spill1671_3)), ((int)(__sourceIntrinsic_828fa99223c9_invokedynamic1671_106(30530, (4576712241274521361L ^ life3_3))))))) {
        break lexical_join_324;
    }
    lexicalValue1671_303_0 = life10_39;
    lexicalValue1671_303_1 = "Riding";
    }
    life17_332 = net.minecraft.entity.EntityList.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(lexicalValue1671_303_0)).a__yw(((java.lang.String)(lexicalValue1671_303_1))))), ((net.minecraft.world.World)(life12_86)));
    spill1671_4 = life17_332;
    if (!((life5_17 != 0))) {
        lexicalValue1671_322_0 = spill1671_4;
        break lexical_join_322;
    }
    if (!((spill1671_4 != null))) {
        break lexical_join_324;
    }
    ((net.minecraft.entity.Entity)(life17_332)).h = ((boolean)(true));
    ((net.minecraft.world.WorldServer)(life12_86)).b__Boolean(((net.minecraft.entity.Entity)(life17_332)));
    ((net.minecraft.entity.player.EntityPlayerMP)(p1)).b(((net.minecraft.entity.Entity)(life17_332)));
    lexicalValue1671_322_0 = life17_332;
    }
    ((net.minecraft.entity.Entity)(lexicalValue1671_322_0)).h = ((boolean)(false));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32406;
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/BA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_26fc72bcc5c66d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12187_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/BA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.List<net.minecraft.entity.player.EntityPlayerMP> a__List() {
return this.h;
}


public net.minecraft.entity.player.EntityPlayerMP a(java.util.UUID p0) {
return ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Map)(this.i)).get(((java.lang.Object)(p0)))));
}


public int a() {
return __sourceExactCall_ddbbecca067b2b(((int)(((net.minecraft.server.management.ServerConfigurationManager)(this)).d())));
}


public void a(net.minecraft.entity.player.EntityPlayerMP p0, net.minecraft.world.WorldServer p1) {
net.minecraft.world.WorldServer forwardValue5604_22_0;
    boolean spill5604_0;
    net.minecraft.world.WorldServer spill5604_1;
    long life3_3;
    net.minecraft.world.WorldServer life6_7;
    int life5_8;
    forward_join_22: {
    forward_join_17: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 78267964506274L);
    spill5604_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life6_7 = ((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Ew();
    life5_8 = ((spill5604_0) ? 1 : 0);
    spill5604_1 = p1;
    if (!((life5_8 != 0))) {
        forwardValue5604_22_0 = spill5604_1;
        break forward_join_22;
    }
    if (!((spill5604_1 != null))) {
        break forward_join_17;
    }
    ((moom.Br)(((net.minecraft.world.WorldServer)(p1)).a__Br())).c(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    }
    ((moom.Br)(((net.minecraft.world.WorldServer)(life6_7)).a__Br())).a__Void(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    forwardValue5604_22_0 = life6_7;
    }
    ((net.minecraft.world.gen.ChunkProviderServer)(((net.minecraft.world.WorldServer)(forwardValue5604_22_0)).Z)).b(((int)((((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).n) >> 4))), ((int)((((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).p) >> 4))));
    return;
}


public void a(net.minecraft.world.WorldServer[] p0) {
this.o = ((net.minecraft.world.storage.IPlayerFileData)(((net.minecraft.world.storage.ISaveHandler)(((net.minecraft.world.WorldServer)((p0)[0])).a__IL())).a__IJ()));
    ((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)((p0)[0])).a__Fi())).a(((net.minecraft.world.border.IBorderListener)(new net.minecraft.server.management.ServerConfigurationManager$1(this))));
    return;
}


public net.minecraft.entity.player.EntityPlayerMP a__tr(java.lang.String p0) {
net.minecraft.entity.player.EntityPlayerMP lexicalValue1675_25_0;
    boolean spill1675_0;
    net.minecraft.entity.player.EntityPlayerMP spill1675_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    net.minecraft.entity.player.EntityPlayerMP life6_16;
    lexical_join_28: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 16876635663915L);
    spill1675_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_8 = ((java.util.List)(this.h)).iterator();
    life4_9 = ((spill1675_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_26: {
    lexical_join_25: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_28;
    }
    life6_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life5_8)).next()));
    spill1675_1 = life6_16;
    if (!((life4_9 == 0))) {
        lexicalValue1675_25_0 = spill1675_1;
        break lexical_join_25;
    }
    if (!(((java.lang.String)(((net.minecraft.entity.player.EntityPlayerMP)(spill1675_1)).a__String())).equalsIgnoreCase(((java.lang.String)(p0))))) {
        break lexical_join_26;
    }
    lexicalValue1675_25_0 = life6_16;
    }
    return lexicalValue1675_25_0;
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return null;
}


public void a(double p0, double p1, double p2, double p3, int p4, moom.yK p5) {
((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((double)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((int)(p4)), ((moom.yK)(p5)));
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, double p1, double p2, double p3, double p4, int p5, moom.yK p6) {
net.minecraft.entity.player.EntityPlayerMP lexicalValue1667_23_0;
    boolean spill1667_0;
    net.minecraft.entity.player.EntityPlayerMP spill1667_1;
    long life12_3;
    java.util.Iterator life15_8;
    int life14_9;
    net.minecraft.entity.player.EntityPlayerMP life16_16;
    double life17_36;
    double life19_41;
    double life21_46;
    lexical_join_63: {
    life12_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 56350411788063L);
    spill1667_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life15_8 = ((java.util.List)(this.h)).iterator();
    life14_9 = ((spill1667_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_61: {
    lexical_join_23: {
    if (!(((java.util.Iterator)(life15_8)).hasNext())) {
        break lexical_join_63;
    }
    life16_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life15_8)).next()));
    spill1667_1 = life16_16;
    if (!((life14_9 == 0))) {
        lexicalValue1667_23_0 = spill1667_1;
        break lexical_join_23;
    }
    if (!((spill1667_1 != p0))) {
        break lexical_join_61;
    }
    lexicalValue1667_23_0 = life16_16;
    }
    if (!((((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue1667_23_0)).af == p5))) {
        break lexical_join_61;
    }
    life17_36 = (p1 - ((net.minecraft.entity.player.EntityPlayerMP)(life16_16)).n);
    life19_41 = (p2 - ((net.minecraft.entity.player.EntityPlayerMP)(life16_16)).o);
    life21_46 = (p3 - ((net.minecraft.entity.player.EntityPlayerMP)(life16_16)).p);
    if (!((recovery.source.CarrierOps.dcmpg(((double)((((life17_36 * life17_36) + (life19_41 * life19_41)) + (life21_46 * life21_46)))), ((double)((p4 * p4)))) < 0))) {
        break lexical_join_61;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life16_16)).cg)).a(((moom.yK)(p6)));
    }
    if (!((life14_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public java.lang.String[] a__ArrayString() {
java.lang.String[] lexicalValue1674_33_0;
    boolean spill1674_0;
    java.lang.String[] spill1674_1;
    long life1_3;
    java.lang.String[] life4_8;
    int life5_11;
    int life3_12;
    lexical_join_33: {
    lexical_join_32: {
    life1_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 119119383617055L);
    life4_8 = new java.lang.String[((java.util.List)(this.h)).size()];
    spill1674_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_11 = 0;
    life3_12 = ((spill1674_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    if (!((life5_11 < ((java.util.List)(this.h)).size()))) {
        break lexical_join_32;
    }
    spill1674_1 = life4_8;
    if (!((life3_12 == 0))) {
        lexicalValue1674_33_0 = spill1674_1;
        break lexical_join_33;
    }
    (spill1674_1)[life5_11] = ((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(((java.util.List)(this.h)).get(((int)(life5_11))))))).a__String();
    life5_11 += 1;
    if (!((life3_12 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1674_33_0 = life4_8;
    }
    return lexicalValue1674_33_0;
}


public java.lang.String a(boolean p0) {
int lexicalValue1672_39_0;
    boolean spill1672_0;
    int spill1672_1;
    long life2_3;
    java.lang.StringBuilder life5_8;
    java.util.ArrayList life6_12;
    int life7_14;
    int life4_15;
    lexical_join_56: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 53837485576855L);
    spill1672_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_8 = new java.lang.StringBuilder();
    life6_12 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(this.h)));
    life7_14 = 0;
    life4_15 = ((spill1672_0) ? 1 : 0);
    lexical_cycle_16: while (true) {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_39: {
    lexical_join_28: {
    if (!((life7_14 < ((java.util.List)(life6_12)).size()))) {
        break lexical_join_56;
    }
    spill1672_1 = life7_14;
    if (!((life4_15 == 0))) {
        lexicalValue1672_39_0 = spill1672_1;
        break lexical_join_39;
    }
    if (!((spill1672_1 > 0))) {
        break lexical_join_28;
    }
    ((java.lang.StringBuilder)(life5_8)).append(((java.lang.String)(", ")));
    }
    ((java.lang.StringBuilder)(life5_8)).append(((java.lang.String)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(((java.util.List)(life6_12)).get(((int)(life7_14))))))).a__String())));
    if (!((life4_15 == 0))) {
        break lexical_join_54;
    }
    lexicalValue1672_39_0 = ((p0) ? 1 : 0);
    }
    if (!((lexicalValue1672_39_0 != 0))) {
        break lexical_join_53;
    }
    ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(life5_8)).append(((java.lang.String)(" ("))))).append(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(((java.util.List)(life6_12)).get(((int)(life7_14))))))).a__UUID())).toString()))))).append(((java.lang.String)(")")));
    }
    life7_14 += 1;
    }
    if (!((life4_15 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return ((java.lang.StringBuilder)(life5_8)).toString();
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.util.IChatComponent p1) {
moom.Bj lexicalValue1668_14_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1668_33_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1668_38_0;
    boolean spill1668_0;
    moom.Bj spill1668_1;
    net.minecraft.entity.player.EntityPlayerMP spill1668_2;
    long life3_3;
    moom.Bj life6_7;
    int life5_8;
    java.util.Iterator life7_19;
    java.lang.String life8_26;
    net.minecraft.entity.player.EntityPlayerMP life9_30;
    lexical_join_42: {
    lexical_join_14: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 44930225528618L);
    spill1668_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life6_7 = ((net.minecraft.entity.player.EntityPlayer)(p0)).a__Bj();
    life5_8 = ((spill1668_0) ? 1 : 0);
    spill1668_1 = life6_7;
    if (!((life5_8 == 0))) {
        lexicalValue1668_14_0 = spill1668_1;
        break lexical_join_14;
    }
    if (!((spill1668_1 != null))) {
        break lexical_join_42;
    }
    lexicalValue1668_14_0 = life6_7;
    }
    life7_19 = ((java.util.Collection)(((moom.Bj)(lexicalValue1668_14_0)).a__Collection())).iterator();
    lexical_cycle_17: while (true) {
    lexical_join_40: {
    lexical_join_38: {
    lexical_join_33: {
    if (!(((java.util.Iterator)(life7_19)).hasNext())) {
        break lexical_join_42;
    }
    life8_26 = ((java.lang.String)(((java.util.Iterator)(life7_19)).next()));
    life9_30 = ((net.minecraft.server.management.ServerConfigurationManager)(this)).a__tr(((java.lang.String)(life8_26)));
    spill1668_2 = life9_30;
    if (!((life5_8 == 0))) {
        lexicalValue1668_33_0 = spill1668_2;
        break lexical_join_33;
    }
    if (!((spill1668_2 != null))) {
        break lexical_join_40;
    }
    lexicalValue1668_33_0 = life9_30;
    }
    if (!((life5_8 == 0))) {
        lexicalValue1668_38_0 = lexicalValue1668_33_0;
        break lexical_join_38;
    }
    if (!((lexicalValue1668_33_0 != p0))) {
        break lexical_join_40;
    }
    lexicalValue1668_38_0 = life9_30;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue1668_38_0)).a(((net.minecraft.util.IChatComponent)(p1)));
    }
    if (!((life5_8 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public moom.BE a__BE() {
return this.k;
}


public void a__Void(com.mojang.authlib.GameProfile p0) {
__sourceExactCall_bdb00c4a0b7943(((moom.BG)(this.l)), ((net.minecraft.server.management.UserListEntry)(new moom.BO(p0, __sourceExactCall_213660f04172ca(((moom.Bl)(this.g))), ((moom.BG)(this.l)).a__Boolean(((com.mojang.authlib.GameProfile)(p0)))))));
    return;
}


public moom.BF a__BF() {
return this.j;
}


public boolean a__Boolean(com.mojang.authlib.GameProfile p0) {
int forwardValue5610_26_0;
    int forwardValue5610_28_0;
    boolean spill5610_0;
    boolean spill5610_1;
    boolean spill5610_2;
    long life2_3;
    int life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 133062119193035L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill5610_0 = this.p;
    if (!((life4_5 == 0))) {
        forwardValue5610_26_0 = ((spill5610_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill5610_0)) {
        break forward_join_25;
    }
    spill5610_1 = ((moom.BG)(this.l)).a__Boolean(((p0)));
    if (!((life4_5 == 0))) {
        forwardValue5610_26_0 = ((spill5610_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill5610_1))) {
        break forward_join_25;
    }
    spill5610_2 = ((moom.BH)(this.m)).a__Boolean(((p0)));
    if (!((life4_5 == 0))) {
        forwardValue5610_26_0 = ((spill5610_2) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill5610_2)) {
        break forward_join_27;
    }
    }
    forwardValue5610_26_0 = 1;
    }
    forwardValue5610_28_0 = forwardValue5610_26_0;
    break forward_join_28;
    }
    forwardValue5610_28_0 = 0;
    }
    return ((forwardValue5610_28_0) != 0);
}


public com.mojang.authlib.GameProfile[] a__ArrayGameProfile() {
com.mojang.authlib.GameProfile[] lexicalValue1673_33_0;
    boolean spill1673_0;
    com.mojang.authlib.GameProfile[] spill1673_1;
    long life1_3;
    com.mojang.authlib.GameProfile[] life4_9;
    int life3_10;
    int life5_12;
    lexical_join_33: {
    lexical_join_32: {
    life1_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 93070466254343L);
    spill1673_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life4_9 = new com.mojang.authlib.GameProfile[((java.util.List)(this.h)).size()];
    life3_10 = ((spill1673_0) ? 1 : 0);
    life5_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life5_12 < ((java.util.List)(this.h)).size()))) {
        break lexical_join_32;
    }
    spill1673_1 = life4_9;
    if (!((life3_10 == 0))) {
        lexicalValue1673_33_0 = spill1673_1;
        break lexical_join_33;
    }
    (spill1673_1)[life5_12] = ((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(((java.util.List)(this.h)).get(((int)(life5_12))))))).a__sourceReturn_cd99b948a0();
    life5_12 += 1;
    if (!((life3_10 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1673_33_0 = life4_9;
    }
    return lexicalValue1673_33_0;
}


public void a(net.minecraft.entity.Entity p0, int p1, net.minecraft.world.WorldServer p2, net.minecraft.world.WorldServer p3) {
int forwardValue5596_80_0;
    int forwardValue5596_135_0;
    int forwardValue5596_181_0;
    moom.A9 forwardValue5596_247_0;
    boolean spill5596_0;
    int spill5596_1;
    boolean spill5596_2;
    boolean spill5596_3;
    boolean spill5596_4;
    moom.A9 spill5596_5;
    long life5_3;
    double life8_7;
    int life7_8;
    double life10_11;
    double life12_13;
    float life14_16;
    moom.DT life15_163;
    double life8_239;
    double life10_254;
    forward_join_251: {
    forward_join_248: {
    forward_join_247: {
    forward_join_245: {
    forward_join_181: {
    forward_join_175: {
    forward_join_145: {
    forward_join_142: {
    forward_join_135: {
    forward_join_134: {
    forward_join_80: {
    forward_join_78: {
    life5_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 88626961913844L);
    spill5596_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life8_7 = ((net.minecraft.entity.Entity)(p0)).n;
    life7_8 = ((spill5596_0) ? 1 : 0);
    life10_11 = ((net.minecraft.entity.Entity)(p0)).p;
    life12_13 = 0x1.0p3d;
    life14_16 = ((net.minecraft.entity.Entity)(p0)).w;
    ((moom.A9)(((net.minecraft.world.WorldServer)(p2)).D)).a__Void(((java.lang.String)("moving")));
    spill5596_1 = ((net.minecraft.entity.Entity)(p0)).af;
    if (!((life7_8 == 0))) {
        forwardValue5596_80_0 = spill5596_1;
        break forward_join_80;
    }
    if (!((spill5596_1 == -1))) {
        break forward_join_78;
    }
    life8_7 = moom.Dr.a(((double)((life8_7 / life12_13))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).a() + 0x1.0p4d))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).c() - 0x1.0p4d))));
    life10_11 = moom.Dr.a(((double)((life10_11 / life12_13))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).b() + 0x1.0p4d))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).d() - 0x1.0p4d))));
    ((net.minecraft.entity.Entity)(p0)).c(((double)(life8_7)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(life10_11)), ((float)(((net.minecraft.entity.Entity)(p0)).w)), ((float)(((net.minecraft.entity.Entity)(p0)).x)));
    spill5596_2 = ((net.minecraft.entity.Entity)(p0)).p__Boolean();
    if (!((life7_8 == 0))) {
        forwardValue5596_181_0 = ((spill5596_2) ? 1 : 0);
        break forward_join_181;
    }
    if (!(spill5596_2)) {
        break forward_join_175;
    }
    ((net.minecraft.world.WorldServer)(p2)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(false)));
    if (!((life7_8 != 0))) {
        break forward_join_175;
    }
    }
    forwardValue5596_80_0 = ((net.minecraft.entity.Entity)(p0)).af;
    }
    if (!((life7_8 == 0))) {
        forwardValue5596_135_0 = forwardValue5596_80_0;
        break forward_join_135;
    }
    if (!((forwardValue5596_80_0 == 0))) {
        break forward_join_134;
    }
    life8_7 = moom.Dr.a(((double)((life8_7 * life12_13))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).a() + 0x1.0p4d))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).c() - 0x1.0p4d))));
    life10_11 = moom.Dr.a(((double)((life10_11 * life12_13))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).b() + 0x1.0p4d))), ((double)((((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(p3)).a__Fi())).d() - 0x1.0p4d))));
    ((net.minecraft.entity.Entity)(p0)).c(((double)(life8_7)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(life10_11)), ((float)(((net.minecraft.entity.Entity)(p0)).w)), ((float)(((net.minecraft.entity.Entity)(p0)).x)));
    spill5596_3 = ((net.minecraft.entity.Entity)(p0)).p__Boolean();
    if (!((life7_8 == 0))) {
        forwardValue5596_181_0 = ((spill5596_3) ? 1 : 0);
        break forward_join_181;
    }
    if (!(spill5596_3)) {
        break forward_join_175;
    }
    ((net.minecraft.world.WorldServer)(p2)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(false)));
    if (!((life7_8 != 0))) {
        break forward_join_175;
    }
    }
    forwardValue5596_135_0 = p1;
    }
    if (!((forwardValue5596_135_0 == 1))) {
        break forward_join_142;
    }
    life15_163 = ((net.minecraft.world.WorldServer)(p3)).a__DT();
    if (!((life7_8 != 0))) {
        break forward_join_145;
    }
    }
    life15_163 = ((net.minecraft.world.WorldServer)(p3)).b__DT();
    }
    life8_7 = ((double) ((moom.DT)(life15_163)).a());
    ((net.minecraft.entity.Entity)(p0)).o = ((double)(((double) ((moom.DT)(life15_163)).b())));
    life10_11 = ((double) ((moom.DT)(life15_163)).c());
    ((net.minecraft.entity.Entity)(p0)).c(((double)(life8_7)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(life10_11)), ((float)(0x1.68p6f)), ((float)(0x0.0p0f)));
    spill5596_4 = ((net.minecraft.entity.Entity)(p0)).p__Boolean();
    if (!((life7_8 == 0))) {
        forwardValue5596_181_0 = ((spill5596_4) ? 1 : 0);
        break forward_join_181;
    }
    if (!(spill5596_4)) {
        break forward_join_175;
    }
    ((net.minecraft.world.WorldServer)(p2)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(false)));
    }
    ((moom.A9)(((net.minecraft.world.WorldServer)(p2)).D)).b();
    if (!((life7_8 == 0))) {
        break forward_join_251;
    }
    forwardValue5596_181_0 = p1;
    }
    if (!((forwardValue5596_181_0 != 1))) {
        break forward_join_248;
    }
    spill5596_5 = ((net.minecraft.world.WorldServer)(p2)).D;
    if (!((life7_8 == 0))) {
        forwardValue5596_247_0 = spill5596_5;
        break forward_join_247;
    }
    ((moom.A9)(spill5596_5)).a__Void(((java.lang.String)("placing")));
    life8_239 = ((double) moom.Dr.a(((int)(((int) life8_7))), ((int)(__sourceIntrinsic_6a1379dd9917_invokedynamic5596_59(162, (6918639076835791682L ^ life5_3)))), ((int)(__sourceIntrinsic_6a1379dd9917_invokedynamic5596_60(31866, (3269643158233771931L ^ life5_3))))));
    life10_254 = ((double) moom.Dr.a(((int)(((int) life10_11))), ((int)(__sourceIntrinsic_6a1379dd9917_invokedynamic5596_62(4297, (6338849684299678511L ^ life5_3)))), ((int)(__sourceIntrinsic_6a1379dd9917_invokedynamic5596_63(12725, (330627057537917521L ^ life5_3))))));
    if (!(((net.minecraft.entity.Entity)(p0)).p__Boolean())) {
        break forward_join_245;
    }
    ((net.minecraft.entity.Entity)(p0)).c(((double)(life8_239)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(life10_254)), ((float)(((net.minecraft.entity.Entity)(p0)).w)), ((float)(((net.minecraft.entity.Entity)(p0)).x)));
    ((moom.Et)(((net.minecraft.world.WorldServer)(p3)).a__Et())).a(((net.minecraft.entity.Entity)(p0)), ((float)(life14_16)));
    ((net.minecraft.world.WorldServer)(p3)).b__Boolean(((net.minecraft.entity.Entity)(p0)));
    ((net.minecraft.world.WorldServer)(p3)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(false)));
    }
    forwardValue5596_247_0 = ((net.minecraft.world.WorldServer)(p2)).D;
    }
    ((moom.A9)(forwardValue5596_247_0)).b();
    }
    ((net.minecraft.entity.Entity)(p0)).a(((net.minecraft.world.World)(p3)));
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayerMP p0, int p1) {
boolean spill1669_0;
    long life3_3;
    int life6_7;
    net.minecraft.world.WorldServer life7_13;
    net.minecraft.world.WorldServer life8_22;
    int life5_53;
    java.util.Iterator life9_85;
    net.minecraft.potion.PotionEffect life10_92;
    lexical_join_104: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 121758066189942L);
    spill1669_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life6_7 = ((net.minecraft.entity.player.EntityPlayerMP)(p0)).af;
    life7_13 = ((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af)));
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).af = ((int)(p1));
    life8_22 = ((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af)));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zA(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af, ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).i)).a__bB(), ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).i)).a__IX())).a__EL(), ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).ci)).a()))));
    ((net.minecraft.world.WorldServer)(life7_13)).d(((net.minecraft.entity.Entity)(p0)));
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).F = ((boolean)(false));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.entity.Entity)(p0)), ((int)(life6_7)), ((net.minecraft.world.WorldServer)(life7_13)), ((net.minecraft.world.WorldServer)(life8_22)));
    life5_53 = ((spill1669_0) ? 1 : 0);
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.entity.player.EntityPlayerMP)(p0)), ((net.minecraft.world.WorldServer)(life7_13)));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((double)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).n)), ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).o)), ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).p)), ((float)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).w)), ((float)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).x)));
    ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).ci)).a(((net.minecraft.world.WorldServer)(life8_22)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).b(((net.minecraft.entity.player.EntityPlayerMP)(p0)), ((net.minecraft.world.WorldServer)(life8_22)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).e(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    life9_85 = ((java.util.Collection)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Collection())).iterator();
    lexical_cycle_86: while (true) {
    if (!(((java.util.Iterator)(life9_85)).hasNext())) {
        break lexical_join_104;
    }
    life10_92 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life9_85)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zW(((net.minecraft.entity.player.EntityPlayerMP)(p0)).e__Int(), life10_92))));
    if (!((life5_53 == 0))) { continue lexical_cycle_86; }
    break lexical_cycle_86;
    }
    }
    return;
}


public net.minecraft.entity.player.EntityPlayerMP a(net.minecraft.entity.player.EntityPlayerMP p0, int p1, boolean p2) {
moom.DT forestValue62_118_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue62_202_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue62_291_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue62_292_0;
    int forestValue62_292_1;
    net.minecraft.entity.player.EntityPlayerMP forestValue62_293_0;
    boolean spill62_0;
    moom.DT spill62_1;
    net.minecraft.entity.player.EntityPlayerMP spill62_2;
    net.minecraft.entity.player.EntityPlayerMP spill62_3;
    long life4_3;
    int life6_10;
    moom.DT life7_35;
    int life8_38;
    moom.Bo life9_55;
    net.minecraft.entity.player.EntityPlayerMP life10_82;
    net.minecraft.world.WorldServer life11_103;
    moom.DT life12_125;
    moom.DT life12_244;
    forest_join_293: {
    forest_join_292: {
    forest_join_291: {
    forest_join_202: {
    forest_join_201: {
    forest_join_159: {
    forest_join_151: {
    forest_join_149: {
    forest_join_118: {
    forest_join_66: {
    forest_join_57: {
    life4_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 49743528135867L);
    spill62_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    ((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Ew())).a__t2())).b(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    life6_10 = ((spill62_0) ? 1 : 0);
    ((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Ew())).a__t2())).b(((net.minecraft.entity.Entity)(p0)));
    ((moom.Br)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Ew())).a__Br())).c(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    ((java.util.List)(this.h)).remove(((java.lang.Object)(p0)));
    ((net.minecraft.world.WorldServer)(((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af))))).d(((net.minecraft.entity.Entity)(p0)));
    life7_35 = ((net.minecraft.entity.player.EntityPlayerMP)(p0)).b__sourceReturn_f4db834595();
    life8_38 = ((((net.minecraft.entity.player.EntityPlayerMP)(p0)).R__Boolean()) ? 1 : 0);
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).af = ((int)(p1));
    if (!(((moom.Bl)(this.g)).n())) {
        break forest_join_57;
    }
    life9_55 = new moom.Bp(((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af))));
    if (!((life6_10 != 0))) {
        break forest_join_66;
    }
    }
    life9_55 = new moom.Bo(((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af))));
    }
    life10_82 = new net.minecraft.entity.player.EntityPlayerMP(this.g, ((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af))), ((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__sourceReturn_cd99b948a0(), life9_55);
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).cg = ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg));
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((boolean)(p2)));
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).e__Int())));
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).e(((net.minecraft.entity.Entity)(p0)));
    life11_103 = ((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af)));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)), ((net.minecraft.entity.player.EntityPlayerMP)(p0)), ((net.minecraft.world.World)(life11_103)));
    spill62_1 = life7_35;
    if (!((life6_10 == 0))) {
        forestValue62_118_0 = spill62_1;
        break forest_join_118;
    }
    if (!((spill62_1 != null))) {
        break forest_join_159;
    }
    forestValue62_118_0 = __sourceExactCall_187c8346c0032e(((net.minecraft.world.World)(((moom.Bl)(this.g)).a(((int)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).af))))), ((moom.DT)(life7_35)), ((boolean)__sourceIntrinsic_integerToBoolean((life8_38))));
    }
    life12_125 = forestValue62_118_0;
    if (!((life6_10 == 0))) {
        break forest_join_149;
    }
    if (!((life12_125 != null))) {
        break forest_join_151;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).c(((double)(((double) (((float) ((moom.DT)(life12_125)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(life12_125)).b()) + 0x1.99999ap-4f)))), ((double)(((double) (((float) ((moom.DT)(life12_125)).c()) + 0x1.0p-1f)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).a(((moom.DT)(life7_35)), ((boolean)__sourceIntrinsic_integerToBoolean((life8_38))));
    }
    if (!((life6_10 != 0))) {
        break forest_join_159;
    }
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).cg)).a(((moom.yK)(new moom.Ac(0, 0x0.0p0f))));
    }
    ((net.minecraft.world.gen.ChunkProviderServer)(((net.minecraft.world.WorldServer)(life11_103)).Z)).b(((int)((((int) ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).n) >> 4))), ((int)((((int) ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).p) >> 4))));
    forest_cycle_173: while (true) {
    if (!((!((java.util.List)(((net.minecraft.world.WorldServer)(life11_103)).a(((net.minecraft.entity.Entity)(life10_82)), ((moom.CA)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).b()))))).isEmpty()))) {
        break forest_join_201;
    }
    spill62_2 = life10_82;
    if (!((life6_10 == 0))) {
        forestValue62_202_0 = spill62_2;
        break forest_join_202;
    }
    if (!((life6_10 == 0))) {
        forestValue62_202_0 = spill62_2;
        break forest_join_202;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayerMP)(spill62_2)).o)), ((double)(0x1.0p8d))) < 0))) {
        break forest_join_201;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).a__Void(((double)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).n)), ((double)((((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).o + 0x1.0p0d))), ((double)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).p)));
    if (!((life6_10 != 0))) {
        continue forest_cycle_173;
    }
    break forest_cycle_173;
    }
    }
    forestValue62_202_0 = life10_82;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(forestValue62_202_0)).cg)).a(((moom.yK)(new moom.zA(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).af, ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).i)).a__bB(), ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).i)).a__IX())).a__EL(), ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).ci)).a()))));
    life12_244 = ((net.minecraft.world.WorldServer)(life11_103)).a__DT();
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).cg)).a(((double)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).n)), ((double)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).o)), ((double)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).p)), ((float)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).w)), ((float)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).x)));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).cg)).a(((moom.yK)(new moom.zy(life12_244))));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).cg)).a(((moom.yK)(new moom.zY(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).b4, ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).b3, ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).b2))));
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).b(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)), ((net.minecraft.world.WorldServer)(life11_103)));
    ((moom.Br)(((net.minecraft.world.WorldServer)(life11_103)).a__Br())).a__Void(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)));
    ((net.minecraft.world.WorldServer)(life11_103)).b__Boolean(((net.minecraft.entity.Entity)(life10_82)));
    ((java.util.List)(this.h)).add(((java.lang.Object)(life10_82)));
    ((java.util.Map)(this.i)).put(((java.lang.Object)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).a__UUID())), ((java.lang.Object)(life10_82)));
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).U();
    ((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).d(((float)(((net.minecraft.entity.player.EntityPlayerMP)(life10_82)).b__sourceReturn_bc607678b6())));
    spill62_3 = life10_82;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forestValue62_293_0 = spill62_3;
        break forest_join_293;
    }
    if (!((life6_10 != 0))) {
        forestValue62_291_0 = spill62_3;
        break forest_join_291;
    }
    forestValue62_292_0 = spill62_3;
    forestValue62_292_1 = 0;
    break forest_join_292;
    }
    forestValue62_292_0 = forestValue62_291_0;
    forestValue62_292_1 = 1;
    }
    __sourceExactCall_f68ae976d3d90b(((boolean)__sourceIntrinsic_integerToBoolean((forestValue62_292_1))));
    forestValue62_293_0 = forestValue62_292_0;
    }
    return forestValue62_293_0;
}


public net.minecraft.entity.player.EntityPlayerMP a(com.mojang.authlib.GameProfile p0) {
int forestValue63_34_0;
    java.lang.Object forestValue63_42_0;
    java.util.ArrayList forestValue63_57_0;
    boolean spill63_0;
    java.util.UUID spill63_1;
    boolean spill63_2;
    java.util.ArrayList spill63_3;
    long life2_3;
    java.util.UUID life5_6;
    java.util.ArrayList life6_9;
    java.util.Iterator life7_13;
    int life4_14;
    net.minecraft.entity.player.EntityPlayerMP life8_23;
    net.minecraft.entity.player.EntityPlayerMP life7_54;
    java.util.Iterator life8_76;
    net.minecraft.entity.player.EntityPlayerMP life9_85;
    moom.Bo life8_109;
    forest_join_95: {
    forest_join_87: {
    forest_join_74: {
    forest_join_57: {
    forest_join_56: {
    forest_join_42: {
    forest_join_37: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 124724612248299L);
    life5_6 = __sourceExactCall_db997ad1931512(((com.mojang.authlib.GameProfile)(p0)));
    spill63_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life6_9 = com.google.common.collect.Lists.newArrayList();
    life7_13 = ((java.util.List)(this.h)).iterator();
    life4_14 = ((spill63_0) ? 1 : 0);
    forest_cycle_15: while (true) {
    forest_join_35: {
    forest_join_34: {
    if (!(((java.util.Iterator)(life7_13)).hasNext())) {
        break forest_join_37;
    }
    life8_23 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life7_13)).next()));
    spill63_1 = ((net.minecraft.entity.player.EntityPlayerMP)(life8_23)).a__UUID();
    if (!((life4_14 != 0))) {
        forestValue63_42_0 = spill63_1;
        break forest_join_42;
    }
    spill63_2 = ((java.util.UUID)(spill63_1)).equals(((java.lang.Object)(life5_6)));
    if (!((life4_14 != 0))) {
        forestValue63_34_0 = ((spill63_2) ? 1 : 0);
        break forest_join_34;
    }
    if (!(spill63_2)) {
        break forest_join_35;
    }
    forestValue63_34_0 = ((((java.util.List)(life6_9)).add(((java.lang.Object)(life8_23)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue63_34_0);
    }
    if (!((life4_14 == 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    forestValue63_42_0 = ((java.util.Map)(this.i)).get(((java.lang.Object)(((com.mojang.authlib.GameProfile)(p0)).getId())));
    }
    life7_54 = ((net.minecraft.entity.player.EntityPlayerMP)(forestValue63_42_0));
    if (!((life7_54 != null))) {
        break forest_join_56;
    }
    spill63_3 = life6_9;
    if (!((life4_14 != 0))) {
        forestValue63_57_0 = spill63_3;
        break forest_join_57;
    }
    if (!((!((java.util.List)(spill63_3)).contains(((java.lang.Object)(life7_54)))))) {
        break forest_join_56;
    }
    ((java.util.List)(life6_9)).add(((java.lang.Object)(life7_54)));
    }
    forestValue63_57_0 = life6_9;
    }
    life8_76 = ((java.util.List)(forestValue63_57_0)).iterator();
    forest_cycle_59: while (true) {
    if (!(((java.util.Iterator)(life8_76)).hasNext())) {
        break forest_join_74;
    }
    life9_85 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life8_76)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life9_85)).cg)).a(((java.lang.String)("You logged in from another location")));
    if (!((life4_14 != 0))) {
        break forest_join_87;
    }
    if (!((life4_14 == 0))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    }
    if (!(((moom.Bl)(this.g)).n())) {
        break forest_join_87;
    }
    life8_109 = new moom.Bp(((moom.Bl)(this.g)).a(((int)(0))));
    break forest_join_95;
    }
    life8_109 = new moom.Bo(((moom.Bl)(this.g)).a(((int)(0))));
    }
    return new net.minecraft.entity.player.EntityPlayerMP(this.g, ((moom.Bl)(this.g)).a(((int)(0))), p0, life8_109);
}


public java.lang.String a(java.net.SocketAddress p0, com.mojang.authlib.GameProfile p1) {
int forwardValue5592_38_0;
    int forwardValue5592_47_0;
    int forwardValue5592_74_0;
    int forwardValue5592_82_0;
    java.lang.String forwardValue5592_86_0;
    boolean spill5592_0;
    long life3_3;
    int life5_5;
    moom.BN life6_21;
    java.lang.String life7_25;
    moom.BM life6_65;
    java.lang.String life7_69;
    forward_join_86: {
    forward_join_85: {
    forward_join_82: {
    forward_join_74: {
    forward_join_71: {
    forward_join_69: {
    forward_join_47: {
    forward_join_43: {
    forward_join_38: {
    forward_join_35: {
    forward_join_33: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 18071650529924L);
    life5_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill5592_0 = ((moom.BF)(this.j)).a__Boolean(((com.mojang.authlib.GameProfile)(p1)));
    if (!((life5_5 != 0))) {
        forwardValue5592_38_0 = ((spill5592_0) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill5592_0)) {
        break forward_join_35;
    }
    life6_21 = ((moom.BN)(((moom.BF)(this.j)).a__BK(((p1)))));
    life7_25 = __sourceIntrinsic_69c84345a285_invokedynamic5592_10(((moom.BN)(life6_21)).a__sourceReturn_0e30dfc966());
    if (!((((moom.BN)(life6_21)).a__Date() != null))) {
        break forward_join_33;
    }
    life7_25 = __sourceIntrinsic_69c84345a285_invokedynamic5592_15(life7_25, ((java.text.SimpleDateFormat)(net.minecraft.server.management.ServerConfigurationManager.f)).format(((java.util.Date)(((moom.BN)(life6_21)).a__Date()))));
    }
    return life7_25;
    }
    forwardValue5592_38_0 = ((((net.minecraft.server.management.ServerConfigurationManager)(this)).a__Boolean(((com.mojang.authlib.GameProfile)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5592_47_0 = forwardValue5592_38_0;
        break forward_join_47;
    }
    if (!((forwardValue5592_38_0 == 0))) {
        break forward_join_43;
    }
    return "You are not white-listed on this server!";
    }
    forwardValue5592_47_0 = ((((moom.BE)(this.k)).a__Boolean(((java.net.SocketAddress)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5592_74_0 = forwardValue5592_47_0;
        break forward_join_74;
    }
    if (!((forwardValue5592_47_0 != 0))) {
        break forward_join_71;
    }
    life6_65 = ((moom.BE)(this.k)).a__BM(((java.net.SocketAddress)(p0)));
    life7_69 = __sourceIntrinsic_69c84345a285_invokedynamic5592_24(((moom.BM)(life6_65)).a__sourceReturn_0e30dfc966());
    if (!((((moom.BM)(life6_65)).a__Date() != null))) {
        break forward_join_69;
    }
    life7_69 = __sourceIntrinsic_69c84345a285_invokedynamic5592_29(life7_69, ((java.text.SimpleDateFormat)(net.minecraft.server.management.ServerConfigurationManager.f)).format(((java.util.Date)(((moom.BM)(life6_65)).a__Date()))));
    }
    return life7_69;
    }
    forwardValue5592_74_0 = ((java.util.List)(this.h)).size();
    }
    if (!((life5_5 != 0))) {
        forwardValue5592_82_0 = forwardValue5592_74_0;
        break forward_join_82;
    }
    if (!((forwardValue5592_74_0 >= this.q))) {
        break forward_join_85;
    }
    forwardValue5592_82_0 = ((((net.minecraft.server.management.ServerConfigurationManager)(this)).c__Boolean(((com.mojang.authlib.GameProfile)(p1)))) ? 1 : 0);
    }
    if (!((forwardValue5592_82_0 == 0))) {
        break forward_join_85;
    }
    forwardValue5592_86_0 = "The server is full!";
    break forward_join_86;
    }
    forwardValue5592_86_0 = null;
    }
    return forwardValue5592_86_0;
}


public void a__Void(boolean p0) {
this.p = ((boolean)(p0));
    return;
}


public moom.BH a__BH() {
return this.m;
}


public void a(moom.yK p0, int p1) {
net.minecraft.entity.player.EntityPlayerMP lexicalValue1666_24_0;
    boolean spill1666_0;
    net.minecraft.entity.player.EntityPlayerMP spill1666_1;
    long life3_3;
    java.util.Iterator life6_8;
    int life5_9;
    net.minecraft.entity.player.EntityPlayerMP life7_16;
    lexical_join_29: {
    life3_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 48484704149430L);
    spill1666_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life6_8 = ((java.util.List)(this.h)).iterator();
    life5_9 = ((spill1666_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_27: {
    lexical_join_24: {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_29;
    }
    life7_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life6_8)).next()));
    spill1666_1 = life7_16;
    if (!((life5_9 != 0))) {
        lexicalValue1666_24_0 = spill1666_1;
        break lexical_join_24;
    }
    if (!((((net.minecraft.entity.player.EntityPlayerMP)(spill1666_1)).af == p1))) {
        break lexical_join_27;
    }
    lexicalValue1666_24_0 = life7_16;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue1666_24_0)).cg)).a(((moom.yK)(p0)));
    }
    if (!((life5_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public moom.BG a__BG() {
return this.l;
}


public void a(moom.yK p0) {
boolean spill1665_0;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    net.minecraft.entity.player.EntityPlayerMP life6_16;
    lexical_join_23: {
    life2_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 100133513845175L);
    spill1665_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_8 = ((java.util.List)(this.h)).iterator();
    life4_9 = ((spill1665_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_23;
    }
    life6_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life5_8)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life6_16)).cg)).a(((moom.yK)(p0)));
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a__Void() {
net.minecraft.server.management.ServerConfigurationManager forestValue1137_31_0;
    int forestValue1137_31_1;
    net.minecraft.server.management.ServerConfigurationManager spill1137_0;
    int spill1137_1;
    int spill1137_2;
    long life1_3;
    int life3_5;
    forest_join_32: {
    forest_join_31: {
    life1_3 = (net.minecraft.server.management.ServerConfigurationManager.y ^ 22470827277819L);
    life3_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    net.minecraft.server.management.ServerConfigurationManager __stackOp1137_3_0 = this;
    spill1137_0 = __stackOp1137_3_0;
    spill1137_1 = (((net.minecraft.server.management.ServerConfigurationManager)(__stackOp1137_3_0)).u + 1);
    if (!((life3_5 == 0))) {
        forestValue1137_31_0 = spill1137_0;
        forestValue1137_31_1 = spill1137_1;
        break forest_join_31;
    }
    net.minecraft.server.management.ServerConfigurationManager __stackOp1137_5_0 = spill1137_0;
    int __stackOp1137_5_1 = spill1137_1;
    spill1137_2 = __stackOp1137_5_1;
    ((net.minecraft.server.management.ServerConfigurationManager)(__stackOp1137_5_0)).u = ((int)(__stackOp1137_5_1));
    if (!((spill1137_2 > __sourceIntrinsic_b82a5b29b709_invokedynamic1137_7(12976, (5822781131501685588L ^ life1_3))))) {
        break forest_join_32;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(this)).a(((moom.yK)(new moom.Ap(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_LATENCY, this.h))));
    forestValue1137_31_0 = this;
    forestValue1137_31_1 = 0;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(forestValue1137_31_0)).u = ((int)(forestValue1137_31_1));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_24a793887d50f2ad_originalDynamicSite3958_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12187_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69c84345a285_invokedynamic5592_10(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69c84345a285_invokedynamic5592_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69c84345a285_invokedynamic5592_24(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69c84345a285_invokedynamic5592_29(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7f56b5f490a_invokedynamic1664_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a1379dd9917_invokedynamic5596_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a1379dd9917_invokedynamic5596_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a1379dd9917_invokedynamic5596_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a1379dd9917_invokedynamic5596_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9962c0096975_invokedynamic5597_12(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9962c0096975_invokedynamic5597_15(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_828fa99223c9_invokedynamic1671_29(java.lang.String a0, java.lang.String a1, int a2, double a3, double a4, double a5) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_828fa99223c9_invokedynamic1671_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1137_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a59c4acf8be0_invokedynamic6277_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a59c4acf8be0_invokedynamic6277_23(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native int __sourceExactCall_26fc72bcc5c66d(int p0, long p1);
private static native int __sourceExactCall_ddbbecca067b2b(int p0);
private static native moom.DT __sourceExactCall_187c8346c0032e(net.minecraft.world.World p0, moom.DT p1, boolean p2);
private static native void __sourceExactCall_f68ae976d3d90b(boolean p0);
private static native java.util.UUID __sourceExactCall_db997ad1931512(com.mojang.authlib.GameProfile p0);

private static native moom.Bj __sourceExactCall_d6bdea0297b187(net.minecraft.entity.player.EntityPlayer p0);
private static native moom.Bj __sourceExactCall_488d28ed0ee1d2(net.minecraft.entity.player.EntityPlayerMP p0);

private static native void __sourceExactCall_7e76344e5ca6b8(net.minecraft.entity.player.EntityPlayerMP p0, moom.v8 p1);
private static native void __sourceExactCall_1a90c6050b1122(net.minecraft.network.NetHandlerPlayServer p0, moom.yK p1);
private static native void __sourceExactCall_4e1d85d6955bc2(moom.BH p0, net.minecraft.server.management.UserListEntry p1);
private static native void __sourceExactCall_bdb00c4a0b7943(moom.BG p0, net.minecraft.server.management.UserListEntry p1);
private static native int __sourceExactCall_213660f04172ca(moom.Bl p0);
}
