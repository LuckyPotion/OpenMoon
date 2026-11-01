package com.moon;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;


public class aI extends com.viaversion.viaversion.connection.UserConnectionImpl {

private static java.lang.String[] b;

private static final long a;

private static final long c;

private static final long d;

public aI(Channel p0, boolean p1) {
super(((Channel)(p0)), ((boolean)(p1)));
    return;
}


static {
javax.crypto.Cipher forestValue2_34_0;
    int forestValue2_34_1;
    javax.crypto.SecretKeyFactory forestValue2_34_2;
    byte[] forestValue2_34_3;
    javax.crypto.Cipher forestValue2_51_0;
    int forestValue2_51_1;
    javax.crypto.SecretKeyFactory forestValue2_51_2;
    byte[] forestValue2_51_3;
    javax.crypto.Cipher forestValue2_227_0;
    int forestValue2_227_1;
    javax.crypto.SecretKeyFactory forestValue2_227_2;
    byte[] forestValue2_227_3;
    javax.crypto.Cipher forestValue2_244_0;
    int forestValue2_244_1;
    javax.crypto.SecretKeyFactory forestValue2_244_2;
    byte[] forestValue2_244_3;
    java.lang.String[] spill2_0;
    javax.crypto.Cipher spill2_1;
    int spill2_2;
    javax.crypto.SecretKeyFactory spill2_3;
    byte[] spill2_4;
    byte[] spill2_5;
    int spill2_6;
    long spill2_7;
    byte[] spill2_8;
    byte[] spill2_9;
    byte[] spill2_10;
    byte[] spill2_11;
    byte[] spill2_12;
    byte[] spill2_13;
    byte[] spill2_14;
    byte[] spill2_15;
    long spill2_16;
    int spill2_17;
    javax.crypto.Cipher spill2_18;
    int spill2_19;
    javax.crypto.SecretKeyFactory spill2_20;
    byte[] spill2_21;
    byte[] spill2_22;
    int spill2_23;
    long spill2_24;
    byte[] spill2_25;
    byte[] spill2_26;
    byte[] spill2_27;
    byte[] spill2_28;
    byte[] spill2_29;
    byte[] spill2_30;
    byte[] spill2_31;
    byte[] spill2_32;
    long spill2_33;
    int spill2_34;
    long life5_13;
    javax.crypto.Cipher life7_18;
    int life8_33;
    long life9_67;
    byte[] life11_135;
    javax.crypto.Cipher life0_214;
    int life1_229;
    long life2_263;
    byte[] life4_331;
    forest_join_244: {
    forest_join_51: {
    a = ((long)(((moom._a)(moom._c.a(((long)(8428243475791463044L)), ((long)(-8613600668833305747L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(184747499450110L)))));
    spill2_0 = new java.lang.String[2];
    life5_13 = (com.moon.aI.a ^ 133325600177053L);
    com.moon.aI.b(((java.lang.String[])(spill2_0)));
    spill2_1 = (life7_18 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill2_2 = 2;
    spill2_3 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp2_9_0 = new byte[8];
    spill2_4 = __stackOp2_9_0;
    (__stackOp2_9_0)[0] = ((byte) ((int) (life5_13 >>> 56)));
    life8_33 = 1;
    forestValue2_34_0 = spill2_1;
    forestValue2_34_1 = spill2_2;
    forestValue2_34_2 = spill2_3;
    forestValue2_34_3 = spill2_4;
    forest_cycle_34: while (true) {
    if (!((life8_33 < 8))) {
        forestValue2_51_0 = forestValue2_34_0;
        forestValue2_51_1 = forestValue2_34_1;
        forestValue2_51_2 = forestValue2_34_2;
        forestValue2_51_3 = forestValue2_34_3;
        break forest_join_51;
    }
    byte[] __stackOp2_10_0 = forestValue2_34_3;
    spill2_5 = __stackOp2_10_0;
    (__stackOp2_10_0)[life8_33] = ((byte) ((int) ((life5_13 << (life8_33 * 8)) >>> 56)));
    life8_33 += 1;
    forestValue2_34_3 = spill2_5;
    continue forest_cycle_34;
    }
    }
    ((javax.crypto.Cipher)(forestValue2_51_0)).init(((int)(forestValue2_51_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue2_51_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue2_51_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp2_13_0 = -1023109332601220047L;
    int __stackOp2_13_1 = -1;
    spill2_6 = __stackOp2_13_1;
    spill2_7 = __stackOp2_13_0;
    recovery.source.CarrierOps.discard(__stackOp2_13_1);
    life9_67 = spill2_7;
    byte[] __stackOp2_15_0 = new byte[8];
    spill2_8 = __stackOp2_15_0;
    (__stackOp2_15_0)[0] = ((byte) ((int) (life9_67 >>> 56)));
    byte[] __stackOp2_16_0 = spill2_8;
    spill2_9 = __stackOp2_16_0;
    (__stackOp2_16_0)[1] = ((byte) ((int) (life9_67 >>> 48)));
    byte[] __stackOp2_17_0 = spill2_9;
    spill2_10 = __stackOp2_17_0;
    (__stackOp2_17_0)[2] = ((byte) ((int) (life9_67 >>> 40)));
    byte[] __stackOp2_18_0 = spill2_10;
    spill2_11 = __stackOp2_18_0;
    (__stackOp2_18_0)[3] = ((byte) ((int) (life9_67 >>> 32)));
    byte[] __stackOp2_19_0 = spill2_11;
    spill2_12 = __stackOp2_19_0;
    (__stackOp2_19_0)[4] = ((byte) ((int) (life9_67 >>> 24)));
    byte[] __stackOp2_20_0 = spill2_12;
    spill2_13 = __stackOp2_20_0;
    (__stackOp2_20_0)[5] = ((byte) ((int) (life9_67 >>> 16)));
    byte[] __stackOp2_21_0 = spill2_13;
    spill2_14 = __stackOp2_21_0;
    (__stackOp2_21_0)[6] = ((byte) ((int) (life9_67 >>> 8)));
    byte[] __stackOp2_22_0 = spill2_14;
    spill2_15 = __stackOp2_22_0;
    (__stackOp2_22_0)[7] = ((byte) ((int) life9_67));
    byte[] __stackOp2_23_0 = spill2_15;
    javax.crypto.Cipher __stackOp2_23_1 = life7_18;
    life11_135 = ((javax.crypto.Cipher)(__stackOp2_23_1)).doFinal(((byte[])(__stackOp2_23_0)));
    int __stackOp2_25_0 = spill2_6;
    long __stackOp2_25_1 = (((((((((((long) (life11_135)[0]) & 255L) << 56) | ((((long) (life11_135)[1]) & 255L) << 48)) | ((((long) (life11_135)[2]) & 255L) << 40)) | ((((long) (life11_135)[3]) & 255L) << 32)) | ((((long) (life11_135)[4]) & 255L) << 24)) | ((((long) (life11_135)[5]) & 255L) << 16)) | ((((long) (life11_135)[6]) & 255L) << 8)) | (((long) (life11_135)[7]) & 255L));
    spill2_16 = __stackOp2_25_1;
    spill2_17 = __stackOp2_25_0;
    recovery.source.CarrierOps.discard(__stackOp2_25_1);
    recovery.source.CarrierOps.discard(spill2_17);
    c = ((long)(spill2_16));
    spill2_18 = (life0_214 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill2_19 = 2;
    spill2_20 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp2_31_0 = new byte[8];
    spill2_21 = __stackOp2_31_0;
    (__stackOp2_31_0)[0] = ((byte) ((int) (life5_13 >>> 56)));
    life1_229 = 1;
    forestValue2_227_0 = spill2_18;
    forestValue2_227_1 = spill2_19;
    forestValue2_227_2 = spill2_20;
    forestValue2_227_3 = spill2_21;
    forest_cycle_227: while (true) {
    if (!((life1_229 < 8))) {
        forestValue2_244_0 = forestValue2_227_0;
        forestValue2_244_1 = forestValue2_227_1;
        forestValue2_244_2 = forestValue2_227_2;
        forestValue2_244_3 = forestValue2_227_3;
        break forest_join_244;
    }
    byte[] __stackOp2_32_0 = forestValue2_227_3;
    spill2_22 = __stackOp2_32_0;
    (__stackOp2_32_0)[life1_229] = ((byte) ((int) ((life5_13 << (life1_229 * 8)) >>> 56)));
    life1_229 += 1;
    forestValue2_227_3 = spill2_22;
    continue forest_cycle_227;
    }
    }
    ((javax.crypto.Cipher)(forestValue2_244_0)).init(((int)(forestValue2_244_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue2_244_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue2_244_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp2_35_0 = 5648297349827746159L;
    int __stackOp2_35_1 = -1;
    spill2_23 = __stackOp2_35_1;
    spill2_24 = __stackOp2_35_0;
    recovery.source.CarrierOps.discard(__stackOp2_35_1);
    life2_263 = spill2_24;
    byte[] __stackOp2_37_0 = new byte[8];
    spill2_25 = __stackOp2_37_0;
    (__stackOp2_37_0)[0] = ((byte) ((int) (life2_263 >>> 56)));
    byte[] __stackOp2_38_0 = spill2_25;
    spill2_26 = __stackOp2_38_0;
    (__stackOp2_38_0)[1] = ((byte) ((int) (life2_263 >>> 48)));
    byte[] __stackOp2_39_0 = spill2_26;
    spill2_27 = __stackOp2_39_0;
    (__stackOp2_39_0)[2] = ((byte) ((int) (life2_263 >>> 40)));
    byte[] __stackOp2_40_0 = spill2_27;
    spill2_28 = __stackOp2_40_0;
    (__stackOp2_40_0)[3] = ((byte) ((int) (life2_263 >>> 32)));
    byte[] __stackOp2_41_0 = spill2_28;
    spill2_29 = __stackOp2_41_0;
    (__stackOp2_41_0)[4] = ((byte) ((int) (life2_263 >>> 24)));
    byte[] __stackOp2_42_0 = spill2_29;
    spill2_30 = __stackOp2_42_0;
    (__stackOp2_42_0)[5] = ((byte) ((int) (life2_263 >>> 16)));
    byte[] __stackOp2_43_0 = spill2_30;
    spill2_31 = __stackOp2_43_0;
    (__stackOp2_43_0)[6] = ((byte) ((int) (life2_263 >>> 8)));
    byte[] __stackOp2_44_0 = spill2_31;
    spill2_32 = __stackOp2_44_0;
    (__stackOp2_44_0)[7] = ((byte) ((int) life2_263));
    byte[] __stackOp2_45_0 = spill2_32;
    javax.crypto.Cipher __stackOp2_45_1 = life0_214;
    life4_331 = ((javax.crypto.Cipher)(__stackOp2_45_1)).doFinal(((byte[])(__stackOp2_45_0)));
    int __stackOp2_47_0 = spill2_23;
    long __stackOp2_47_1 = (((((((((((long) (life4_331)[0]) & 255L) << 56) | ((((long) (life4_331)[1]) & 255L) << 48)) | ((((long) (life4_331)[2]) & 255L) << 40)) | ((((long) (life4_331)[3]) & 255L) << 32)) | ((((long) (life4_331)[4]) & 255L) << 24)) | ((((long) (life4_331)[5]) & 255L) << 16)) | ((((long) (life4_331)[6]) & 255L) << 8)) | (((long) (life4_331)[7]) & 255L));
    spill2_33 = __stackOp2_47_1;
    spill2_34 = __stackOp2_47_0;
    recovery.source.CarrierOps.discard(__stackOp2_47_1);
    recovery.source.CarrierOps.discard(spill2_34);
    d = ((long)(spill2_33));
}


public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return com.moon.aI.b;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static void lambda$transformIncoming$0(int p0) {
long local1 = (com.moon.aI.a ^ 122676727245946L);
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).cm)).a(((moom.yK)(new com.moon.hS(((int) com.moon.aI.c), p0))));
    return;
}


public void transformOutgoing(ByteBuf p0, java.util.function.Function<java.lang.Throwable, java.lang.Exception> p1) throws java.lang.Exception {
super.transformOutgoing(((ByteBuf)(p0)), ((java.util.function.Function)(p1)));
    return;
}


public void transformIncoming(ByteBuf p0, java.util.function.Function<java.lang.Throwable, java.lang.Exception> p1) throws java.lang.Exception {
int forestValue6_62_0;
    int spill6_0;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.network.PacketBuffer life6_24;
    long life7_29;
    int life9_41;
    forest_join_72: {
    forest_join_67: {
    forest_join_63: {
    forest_join_62: {
    forest_join_60: {
    life3_3 = (com.moon.aI.a ^ 9623228320924L);
    life5_5 = com.moon.aI.b();
    if (!((life5_5 != null))) {
        break forest_join_67;
    }
    if (!(((ByteBuf)(p0)).isReadable())) {
        break forest_join_63;
    }
    if (!((((com.moon.o4)(com.moon.o4.a__o4())).b() == ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(((com.moon.cl)(com.moon.cl.R_1_19_1)).a())).getVersion()))) {
        break forest_join_63;
    }
    life6_24 = new net.minecraft.network.PacketBuffer(((ByteBuf)(p0)).copy());
    life7_29 = ((long) ((com.viaversion.viaversion.api.type.types.VarIntType)(com.viaversion.viaversion.api.type.Type.VAR_INT)).readPrimitive(((ByteBuf)(life6_24))));
    spill6_0 = recovery.source.CarrierOps.lcmp(((long)(life7_29)), ((long)(com.moon.aI.d)));
    if (!((life5_5 != null))) {
        forestValue6_62_0 = spill6_0;
        break forest_join_62;
    }
    if (!((spill6_0 == 0))) {
        break forest_join_60;
    }
    life9_41 = ((java.lang.Integer)(((com.viaversion.viaversion.api.type.types.IntType)(com.viaversion.viaversion.api.type.Type.INT)).read(((ByteBuf)(life6_24))))).intValue();
    ((com.moon.aI)(this)).setActive(((boolean)__sourceIntrinsic_integerToBoolean((0))));
    ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a(((java.lang.Runnable)(__sourceIntrinsic_40ff3cea2baf_invokedynamic6_18(life9_41))));
    ((com.moon.aI)(this)).setActive(((boolean)__sourceIntrinsic_integerToBoolean((1))));
    ((net.minecraft.network.PacketBuffer)(life6_24)).release();
    throw ((java.lang.Exception)(((java.util.function.Function)(p1)).apply(((java.lang.Object)(new com.viaversion.viaversion.exception.CancelException())))));
    }
    forestValue6_62_0 = ((((net.minecraft.network.PacketBuffer)(life6_24)).release()) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue6_62_0);
    }
    super.transformIncoming(((ByteBuf)(p0)), ((java.util.function.Function)(p1)));
    }
    if (!((life5_5 == null))) {
        break forest_join_72;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_40ff3cea2baf_invokedynamic6_18(int a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
