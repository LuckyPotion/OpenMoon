package moom;

import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ap implements moom.yK<moom.y2> {

private net.minecraft.network.play.server.S38PacketPlayerListItem$Action a;

private java.util.List<net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData> b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public Ap(net.minecraft.network.play.server.S38PacketPlayerListItem$Action p0, java.lang.Iterable<net.minecraft.entity.player.EntityPlayerMP> p1) { super(); }


private static void __sourceConstructorBody_a9e3ffc581272733(moom.Ap receiver, net.minecraft.network.play.server.S38PacketPlayerListItem$Action p0, java.lang.Iterable p1) throws Throwable {

init_join_42: {

    long local3_life2 = (moom.Ap.c ^ 4471520844563L);

    moom.Ap.__sourceConstructorInit_a9e3ffc581272733_0(((moom.Ap)(receiver)));

    int[] __sourceSpill455_7 = moom.zN.b__ArrayInt();

    ((moom.Ap)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.Ap)(receiver)).a = ((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(p0));

    int[] local5_life9 = __sourceSpill455_7;

    java.util.Iterator local6_life11 = ((java.lang.Iterable)(p1)).iterator();

    init_cycle_17: while (true) {

    if (!(((java.util.Iterator)(local6_life11)).hasNext())) {

        break init_join_42;

    }

    net.minecraft.entity.player.EntityPlayerMP local7_life15 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(local6_life11)).next()));

    __sourceExactCall_191ecc1a5dc1f7(((java.util.List)(((moom.Ap)(receiver)).b)), ((java.lang.Object)(new net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData(__sourceExactCall_8b68ae11270e19(((net.minecraft.entity.player.EntityPlayerMP)(local7_life15))), ((net.minecraft.entity.player.EntityPlayerMP)(local7_life15)).cA, __sourceExactCall_c9d27a939d0cf3(((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(local7_life15)).ci))), __sourceExactCall_61a278c65db199(((net.minecraft.entity.player.EntityPlayerMP)(local7_life15)))))));

    if (!((local5_life9 != null))) { continue init_cycle_17; }

    break init_cycle_17;

    }

    }

    return;

}



public Ap(net.minecraft.network.play.server.S38PacketPlayerListItem$Action p0, net.minecraft.entity.player.EntityPlayerMP[] p1) { super(); }


private static void __sourceConstructorBody_1239569f79ee65cf(moom.Ap receiver, net.minecraft.network.play.server.S38PacketPlayerListItem$Action p0, net.minecraft.entity.player.EntityPlayerMP[] p1) throws Throwable {

init_join_47: {

    long local3_life2 = (moom.Ap.c ^ 60372750299638L);

    moom.Ap.__sourceConstructorInit_1239569f79ee65cf_0(((moom.Ap)(receiver)));

    ((moom.Ap)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    int[] __sourceSpill456_8 = moom.zN.b__ArrayInt();

    ((moom.Ap)(receiver)).a = ((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(p0));

    net.minecraft.entity.player.EntityPlayerMP[] local6_life9 = p1;

    int[] local5_life10 = __sourceSpill456_8;

    int local7_life11 = (local6_life9).length;

    int local8_life12 = 0;

    init_cycle_21: while (true) {

    if (!((local8_life12 < local7_life11))) {

        break init_join_47;

    }

    net.minecraft.entity.player.EntityPlayerMP local9_life13 = (local6_life9)[local8_life12];

    __sourceExactCall_191ecc1a5dc1f7(((java.util.List)(((moom.Ap)(receiver)).b)), ((java.lang.Object)(new net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData(__sourceExactCall_8b68ae11270e19(((net.minecraft.entity.player.EntityPlayerMP)(local9_life13))), ((net.minecraft.entity.player.EntityPlayerMP)(local9_life13)).cA, __sourceExactCall_c9d27a939d0cf3(((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(local9_life13)).ci))), __sourceExactCall_61a278c65db199(((net.minecraft.entity.player.EntityPlayerMP)(local9_life13)))))));

    local8_life12 += 1;

    if (!((local5_life10 != null))) { continue init_cycle_21; }

    break init_cycle_21;

    }

    }

    return;

}



public Ap() {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(8189010032810378609L)), ((long)(-3022293215023206256L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(253271339485296L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ap.c ^ 90272663897236L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill478_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill478_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill478_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill478_14 = new byte[8];
    (__sourceSpill478_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill478_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation478_16 = __sourceSpill478_14;
    ((javax.crypto.Cipher)(__sourceSpill478_11)).init(((int)(__sourceSpill478_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill478_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation478_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\027TÖ\021ø\bH\016)«4Ïâùm\036\023óìL\033ÞÙ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill478_25 = local6_life21;
        int __sourceSpill478_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill478_25)).substring(((int)(__sourceSpill478_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill478_30 = local8_life19;
        int __sourceSpill478_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill478_33 = new byte[8];
        (__sourceSpill478_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill478_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill478_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill478_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill478_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill478_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill478_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill478_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill478_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill478_34)).doFinal(((byte[])(__sourceSpill478_33)));
        (__sourceSpill478_30)[__sourceSpill478_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a9e3ffc581272733_0(moom.Ap a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_1239569f79ee65cf_0(moom.Ap a0) throws E;

public java.lang.String toString() {
return ((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(com.google.common.base.MoreObjects.toStringHelper(((java.lang.Object)(this))))).add(((java.lang.String)("action")), ((java.lang.Object)(this.a))))).add(((java.lang.String)("entries")), ((java.lang.Object)(this.b))))).toString();
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forestValue206_21_0;
    ByteBuf forestValue206_95_0;
    int[] spill206_0;
    net.minecraft.network.PacketBuffer spill206_1;
    boolean spill206_2;
    long life2_3;
    java.util.Iterator life5_17;
    int[] life4_18;
    net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData life6_25;
    java.util.Iterator life7_57;
    com.mojang.authlib.properties.Property life8_64;
    forest_join_184: {
    life2_3 = (moom.Ap.c ^ 89981589948136L);
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Enum)(this.a)));
    spill206_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((java.util.List)(this.b)).size())));
    life5_17 = ((java.util.List)(this.b)).iterator();
    life4_18 = spill206_0;
    forest_cycle_19: while (true) {
    forest_join_182: {
    forest_join_177: {
    forest_join_175: {
    forest_join_167: {
    forest_join_151: {
    forest_join_140: {
    forest_join_128: {
    forest_join_126: {
    forest_join_118: {
    forest_join_98: {
    forestValue206_21_0 = ((((java.util.Iterator)(life5_17)).hasNext()) ? 1 : 0);
    forest_cycle_21: while (true) {
    forest_join_51: {
    forest_join_34: {
    if (!((forestValue206_21_0 != 0))) {
        break forest_join_184;
    }
    life6_25 = ((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(((java.util.Iterator)(life5_17)).next()));
    if (!((life4_18 == null))) {
        break forest_join_51;
    }
    switch ((moom.Aq.a)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(this.a)).ordinal()]) {
case 1:
{
        break forest_join_34;
    }
case 2:
{
        break forest_join_128;
    }
case 3:
{
        break forest_join_140;
    }
case 4:
{
        break forest_join_151;
    }
case 5:
{
        break forest_join_177;
    }
default:
{
        break forest_join_182;
    }
}
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getId())));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getName())));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((com.mojang.authlib.properties.PropertyMap)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getProperties())).size())));
    }
    life7_57 = ((java.util.Collection)(((com.mojang.authlib.properties.PropertyMap)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getProperties())).values())).iterator();
    forest_cycle_57: while (true) {
    forest_join_96: {
    forest_join_95: {
    forest_join_92: {
    if (!(((java.util.Iterator)(life7_57)).hasNext())) {
        break forest_join_98;
    }
    life8_64 = ((com.mojang.authlib.properties.Property)(((java.util.Iterator)(life7_57)).next()));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((com.mojang.authlib.properties.Property)(life8_64)).getName())));
    spill206_1 = ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((com.mojang.authlib.properties.Property)(life8_64)).getValue())));
    if (!((life4_18 == null))) {
        forestValue206_95_0 = spill206_1;
        break forest_join_95;
    }
    recovery.source.CarrierOps.discard(spill206_1);
    spill206_2 = ((com.mojang.authlib.properties.Property)(life8_64)).hasSignature();
    if (!((life4_18 == null))) {
        forestValue206_21_0 = ((spill206_2) ? 1 : 0);
        continue forest_cycle_21;
    }
    if (!(spill206_2)) {
        break forest_join_92;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(true)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((com.mojang.authlib.properties.Property)(life8_64)).getSignature())));
    if (!((life4_18 != null))) {
        break forest_join_96;
    }
    }
    forestValue206_95_0 = ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(false)));
    }
    recovery.source.CarrierOps.discard(forestValue206_95_0);
    }
    if (!((life4_18 != null))) {
        continue forest_cycle_57;
    }
    break forest_cycle_57;
    }
    break forest_cycle_21;
    }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((net.minecraft.world.WorldSettings$GameType)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__bE())).a())));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a())));
    if (!((life4_18 == null))) {
        break forest_join_126;
    }
    if (!((((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__C5() == null))) {
        break forest_join_118;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(false)));
    if (!((life4_18 != null))) {
        break forest_join_182;
    }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(true)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__C5())));
    }
    if (!((life4_18 != null))) {
        break forest_join_182;
    }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getId())));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((net.minecraft.world.WorldSettings$GameType)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__bE())).a())));
    if (!((life4_18 != null))) {
        break forest_join_182;
    }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getId())));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a())));
    if (!((life4_18 != null))) {
        break forest_join_182;
    }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getId())));
    if (!((life4_18 == null))) {
        break forest_join_175;
    }
    if (!((((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__C5() == null))) {
        break forest_join_167;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(false)));
    if (!((life4_18 != null))) {
        break forest_join_182;
    }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(true)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__C5())));
    }
    if (!((life4_18 != null))) {
        break forest_join_182;
    }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(life6_25)).a__GameProfile())).getId())));
    }
    if (!((life4_18 != null))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ap.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21943;
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
            throw new RuntimeException("moom/Ap", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3722_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ap"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forestValue205_106_0;
    int forestValue205_112_0;
    net.minecraft.network.PacketBuffer forestValue205_123_0;
    net.minecraft.network.PacketBuffer forestValue205_162_0;
    int[] spill205_0;
    boolean spill205_1;
    net.minecraft.network.PacketBuffer spill205_2;
    net.minecraft.network.PacketBuffer spill205_3;
    long life2_3;
    int[] life4_11;
    int life5_14;
    int life6_16;
    com.mojang.authlib.GameProfile life7_21;
    int life8_23;
    net.minecraft.world.WorldSettings$GameType life9_25;
    net.minecraft.util.IChatComponent life10_27;
    int life11_49;
    int life12_51;
    java.lang.String life13_62;
    java.lang.String life14_70;
    forest_join_186: {
    life2_3 = (moom.Ap.c ^ 42896168703329L);
    spill205_0 = moom.zN.b__ArrayInt();
    this.a = ((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Class)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.class)))))));
    life4_11 = spill205_0;
    life5_14 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    life6_16 = 0;
    forest_cycle_17: while (true) {
    forest_join_172: {
    forest_join_165: {
    forest_join_162: {
    forest_join_149: {
    forest_join_138: {
    forest_join_126: {
    forest_join_123: {
    forest_join_112: {
    forest_join_110: {
    forest_join_34: {
    if (!((life6_16 < life5_14))) {
        break forest_join_186;
    }
    life7_21 = null;
    life8_23 = 0;
    life9_25 = null;
    life10_27 = null;
    switch ((moom.Aq.a)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(this.a)).ordinal()]) {
case 1:
{
        break forest_join_34;
    }
case 2:
{
        break forest_join_126;
    }
case 3:
{
        break forest_join_138;
    }
case 4:
{
        break forest_join_149;
    }
case 5:
{
        break forest_join_165;
    }
default:
{
        break forest_join_172;
    }
}
    }
    life7_21 = new com.mojang.authlib.GameProfile(((net.minecraft.network.PacketBuffer)(p0)).a__UUID(), ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic205_11(2921, (6688938032787841205L ^ life2_3))))));
    life11_49 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    life12_51 = 0;
    forest_cycle_52: while (true) {
    forest_join_107: {
    forest_join_106: {
    forest_join_97: {
    if (!((life12_51 < life11_49))) {
        break forest_join_110;
    }
    life13_62 = ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic205_14(17682, (3779086432666234572L ^ life2_3)))));
    life14_70 = ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic205_16(3934, (1521575564186444929L ^ life2_3)))));
    spill205_1 = ((net.minecraft.network.PacketBuffer)(p0)).readBoolean();
    if (!((life4_11 == null))) {
        forestValue205_112_0 = ((spill205_1) ? 1 : 0);
        break forest_join_112;
    }
    if (!((life4_11 == null))) {
        forestValue205_106_0 = ((spill205_1) ? 1 : 0);
        break forest_join_106;
    }
    if (!(spill205_1)) {
        break forest_join_97;
    }
    ((com.mojang.authlib.properties.PropertyMap)(((com.mojang.authlib.GameProfile)(life7_21)).getProperties())).put(((life13_62)), ((new com.mojang.authlib.properties.Property(life13_62, life14_70, ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic205_22(3934, (1521575564186444929L ^ life2_3)))))))));
    if (!((life4_11 != null))) {
        break forest_join_107;
    }
    }
    forestValue205_106_0 = ((((com.mojang.authlib.properties.PropertyMap)(((com.mojang.authlib.GameProfile)(life7_21)).getProperties())).put(((life13_62)), ((new com.mojang.authlib.properties.Property(life13_62, life14_70))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue205_106_0);
    }
    life12_51 += 1;
    if (!((life4_11 != null))) {
        continue forest_cycle_52;
    }
    break forest_cycle_52;
    }
    }
    forestValue205_112_0 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    }
    life9_25 = __sourceExactCall_19dc0eb32bf79e(((int)(forestValue205_112_0)));
    life8_23 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    spill205_2 = p0;
    if (!((life4_11 == null))) {
        forestValue205_123_0 = spill205_2;
        break forest_join_123;
    }
    if (!(((net.minecraft.network.PacketBuffer)(spill205_2)).readBoolean())) {
        break forest_join_172;
    }
    forestValue205_123_0 = p0;
    }
    life10_27 = ((net.minecraft.network.PacketBuffer)(forestValue205_123_0)).a__C5();
    break forest_join_172;
    }
    life7_21 = new com.mojang.authlib.GameProfile(((net.minecraft.network.PacketBuffer)(p0)).a__UUID(), null);
    life9_25 = __sourceExactCall_19dc0eb32bf79e(((int)(((net.minecraft.network.PacketBuffer)(p0)).a())));
    break forest_join_172;
    }
    life7_21 = new com.mojang.authlib.GameProfile(((net.minecraft.network.PacketBuffer)(p0)).a__UUID(), null);
    life8_23 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    break forest_join_172;
    }
    life7_21 = new com.mojang.authlib.GameProfile(((net.minecraft.network.PacketBuffer)(p0)).a__UUID(), null);
    spill205_3 = p0;
    if (!((life4_11 == null))) {
        forestValue205_162_0 = spill205_3;
        break forest_join_162;
    }
    if (!(((net.minecraft.network.PacketBuffer)(spill205_3)).readBoolean())) {
        break forest_join_172;
    }
    forestValue205_162_0 = p0;
    }
    life10_27 = ((net.minecraft.network.PacketBuffer)(forestValue205_162_0)).a__C5();
    break forest_join_172;
    }
    life7_21 = new com.mojang.authlib.GameProfile(((net.minecraft.network.PacketBuffer)(p0)).a__UUID(), null);
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(new net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData(life7_21, life8_23, life9_25, life10_27))));
    life6_16 += 1;
    if (!((life4_11 != null))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ap)(this)));
    return;
}


public java.util.List<net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData> a() {
return this.b;
}


public net.minecraft.network.play.server.S38PacketPlayerListItem$Action a__bi() {
return this.a;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3722_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic205_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic205_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic205_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic205_22(int a0, long a1) throws E;

private static native net.minecraft.world.WorldSettings$GameType __sourceExactCall_19dc0eb32bf79e(int p0);

private static native boolean __sourceExactCall_191ecc1a5dc1f7(java.util.List p0, java.lang.Object p1);
private static native com.mojang.authlib.GameProfile __sourceExactCall_8b68ae11270e19(net.minecraft.entity.player.EntityPlayerMP p0);
private static native net.minecraft.world.WorldSettings$GameType __sourceExactCall_c9d27a939d0cf3(moom.Bo p0);
private static native net.minecraft.util.IChatComponent __sourceExactCall_61a278c65db199(net.minecraft.entity.player.EntityPlayerMP p0);
}
