package moom;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class k extends ChannelInboundHandlerAdapter {

private static org.apache.logging.log4j.Logger a;

private net.minecraft.network.NetworkSystem b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public k(net.minecraft.network.NetworkSystem p0) {
super();
    this.b = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3990192673481356412L)), ((long)(-985795028012676751L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225829097163517L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.k.c ^ 27741514759092L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1354_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1354_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1354_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1354_14 = new byte[8];
    (__sourceSpill1354_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1354_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1354_16 = __sourceSpill1354_14;
    ((javax.crypto.Cipher)(__sourceSpill1354_11)).init(((int)(__sourceSpill1354_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1354_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1354_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "LÇ\021\031Áòy´pÿ\000¬<ñBäGÿçësBúVÅ\f3\032\005Úî·ÀÅ\030´¿"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1354_25 = local6_life21;
        int __sourceSpill1354_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1354_25)).substring(((int)(__sourceSpill1354_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1354_30 = local8_life19;
        int __sourceSpill1354_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1354_33 = new byte[8];
        (__sourceSpill1354_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1354_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1354_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1354_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1354_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1354_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1354_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1354_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1354_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1354_34)).doFinal(((byte[])(__sourceSpill1354_33)));
        (__sourceSpill1354_30)[__sourceSpill1354_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "sö\032×Z¤=)k¬mú¥ñ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1354_38 = local6_life21;
        int __sourceSpill1354_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1354_38)).substring(((int)(__sourceSpill1354_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1354_43 = local8_life19;
        int __sourceSpill1354_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1354_46 = new byte[8];
        (__sourceSpill1354_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1354_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1354_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1354_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1354_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1354_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1354_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1354_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1354_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1354_47)).doFinal(((byte[])(__sourceSpill1354_46)));
        (__sourceSpill1354_43)[__sourceSpill1354_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[7]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_3a6b55f580888b1edd6a(moom.k a0, ChannelHandlerContext a1, java.lang.Object a2) throws E;
private static final class __SourceHandler_3a6b55f580888b1edd6a {

public static void f452(moom.k receiver, ChannelHandlerContext p0, java.lang.Object p1) throws Throwable {
    int forestValue452_93_0;
    int forestValue452_170_0;
    int forestValue452_175_0;
    int forestValue452_177_0;
    int forestValue452_190_0;
    int forestValue452_190_1;
    int forestValue452_191_0;
    int forestValue452_192_0;
    int forestValue452_192_1;
    int forestValue452_225_0;
    int forestValue452_225_1;
    int forestValue452_226_0;
    int forestValue452_227_0;
    int forestValue452_227_1;
    int forestValue452_247_0;
    int forestValue452_247_1;
    int forestValue452_248_0;
    int forestValue452_249_0;
    int forestValue452_249_1;
    int forestValue452_263_0;
    int forestValue452_263_1;
    int forestValue452_264_0;
    int forestValue452_265_0;
    int forestValue452_265_1;
    int forestValue452_274_0;
    int forestValue452_274_1;
    int forestValue452_275_0;
    int forestValue452_276_0;
    int forestValue452_276_1;
    int forestValue452_367_0;
    java.lang.String spill452_0;
    short spill452_1;
    int spill452_2;
    org.apache.logging.log4j.Logger spill452_3;
    java.lang.String spill452_4;
    java.lang.Object[] spill452_5;
    java.lang.Object[] spill452_6;
    java.lang.String spill452_7;
    java.lang.Object[] spill452_8;
    java.lang.Object[] spill452_9;
    java.lang.Object[] spill452_10;
    short spill452_11;
    org.apache.logging.log4j.Logger spill452_12;
    java.lang.String spill452_13;
    java.lang.Object[] spill452_14;
    java.lang.Object[] spill452_15;
    java.lang.String spill452_16;
    java.lang.Object[] spill452_17;
    java.lang.Object[] spill452_18;
    java.lang.Object[] spill452_19;
    java.lang.Object[] spill452_20;
    java.lang.Object[] spill452_21;
    int spill452_22;
    short spill452_23;
    int spill452_24;
    short spill452_25;
    int spill452_26;
    int spill452_27;
    int spill452_28;
    int spill452_29;
    int spill452_30;
    int spill452_31;
    org.apache.logging.log4j.Logger spill452_32;
    java.lang.String spill452_33;
    java.lang.Object[] spill452_34;
    java.lang.Object[] spill452_35;
    java.lang.String spill452_36;
    java.lang.Object[] spill452_37;
    java.lang.Object[] spill452_38;
    java.lang.Object[] spill452_39;
    java.lang.Object[] spill452_40;
    java.lang.Object[] spill452_41;
    long life3_3;
    ByteBuf life6_7;
    int life7_12;
    java.lang.String life5_13;
    java.net.InetSocketAddress life8_29;
    moom.Bl life9_33;
    int life10_36;
    java.lang.String life11_78;
    java.lang.String life12_163;
    int life13_184;
    int life13_202;
    int life13_218;
    int life14_221;
    int life13_239;
    int life13_263;
    int life13_281;
    int life13_293;
    java.lang.String life15_367;
    ByteBuf life16_371;
    forest_join_381: {
    forest_join_367: {
    forest_join_366: {
    forest_join_361: {
    forest_join_314: {
    forest_join_298: {
    forest_join_297: {
    forest_join_276: {
    forest_join_275: {
    forest_join_274: {
    forest_join_265: {
    forest_join_264: {
    forest_join_263: {
    forest_join_249: {
    forest_join_248: {
    forest_join_247: {
    forest_join_227: {
    forest_join_226: {
    forest_join_225: {
    forest_join_192: {
    forest_join_191: {
    forest_join_190: {
    forest_join_177: {
    forest_join_176: {
    forest_join_175: {
    forest_join_170: {
    forest_join_168: {
    forest_join_108: {
    forest_join_107: {
    forest_join_93: {
    forest_join_86: {
    forest_join_40: {
    life3_3 = (__fieldRead452_0() ^ 44236291120077L);
    spill452_0 = __call452_1();
    life6_7 = __cast452_2(p1);
    __call452_3(life6_7);
    life7_12 = 1;
    life5_13 = spill452_0;
    spill452_1 = __call452_4(life6_7);
    if (!((life5_13 == null))) {
        forestValue452_367_0 = __integerCategory452_5(spill452_1);
        break forest_join_367;
    }
    if (!((spill452_1 == __invokedynamic452_6(13763, (3286594893921371235L ^ life3_3))))) {
        break forest_join_366;
    }
    life8_29 = __cast452_9(__call452_8(__call452_7(p0)));
    life9_33 = __call452_11(__fieldRead452_10(receiver));
    life10_36 = __call452_12(life6_7);
    spill452_2 = life10_36;
    if (!((life5_13 == null))) {
        forestValue452_170_0 = spill452_2;
        break forest_join_170;
    }
    switch (spill452_2) {
case 0:
{
        break forest_join_40;
    }
case 1:
{
        break forest_join_86;
    }
default:
{
        break forest_join_168;
    }
}
    }
    spill452_3 = __fieldRead452_13();
    spill452_4 = "Ping: (<1.3.x) from {}:{}";
    java.lang.Object[] __stackOp452_14_0 = new java.lang.Object[2];
    spill452_5 = __stackOp452_14_0;
    (__stackOp452_14_0)[0] = __call452_15(life8_29);
    java.lang.Object[] __stackOp452_16_0 = spill452_5;
    spill452_6 = __stackOp452_16_0;
    (__stackOp452_16_0)[1] = __call452_18(__call452_17(life8_29));
    __call452_19(spill452_3, spill452_4, spill452_6);
    spill452_7 = "%s§%d§%d";
    java.lang.Object[] __stackOp452_20_0 = new java.lang.Object[3];
    spill452_8 = __stackOp452_20_0;
    (__stackOp452_20_0)[0] = __call452_21(life9_33);
    java.lang.Object[] __stackOp452_22_0 = spill452_8;
    spill452_9 = __stackOp452_22_0;
    (__stackOp452_22_0)[1] = __call452_24(__call452_23(life9_33));
    java.lang.Object[] __stackOp452_25_0 = spill452_9;
    spill452_10 = __stackOp452_25_0;
    (__stackOp452_25_0)[2] = __call452_27(__call452_26(life9_33));
    life11_78 = __call452_28(spill452_7, spill452_10);
    __call452_30(receiver, p0, __call452_29(receiver, life11_78));
    if (!((life5_13 != null))) {
        break forest_join_361;
    }
    }
    spill452_11 = __call452_31(life6_7);
    if (!((life5_13 == null))) {
        forestValue452_93_0 = __integerCategory452_32(spill452_11);
        break forest_join_93;
    }
    if (!((spill452_11 != 1))) {
        break forest_join_108;
    }
    forestValue452_93_0 = life7_12;
    }
    if (!((forestValue452_93_0 != 0))) {
        break forest_join_107;
    }
    __call452_33(life6_7);
    __call452_36(__call452_35(__call452_34(p0)), "legacy_query");
    __call452_37(p0, p1);
    }
    return;
    }
    spill452_12 = __fieldRead452_38();
    spill452_13 = "Ping: (1.4-1.5.x) from {}:{}";
    java.lang.Object[] __stackOp452_39_0 = new java.lang.Object[2];
    spill452_14 = __stackOp452_39_0;
    (__stackOp452_39_0)[0] = __call452_40(life8_29);
    java.lang.Object[] __stackOp452_41_0 = spill452_14;
    spill452_15 = __stackOp452_41_0;
    (__stackOp452_41_0)[1] = __call452_43(__call452_42(life8_29));
    __call452_44(spill452_12, spill452_13, spill452_15);
    spill452_16 = "§1\000%d\000%s\000%s\000%d\000%d";
    java.lang.Object[] __stackOp452_45_0 = new java.lang.Object[5];
    spill452_17 = __stackOp452_45_0;
    (__stackOp452_45_0)[0] = __call452_47(__invokedynamic452_46(22437, (8579633317198571010L ^ life3_3)));
    java.lang.Object[] __stackOp452_48_0 = spill452_17;
    spill452_18 = __stackOp452_48_0;
    (__stackOp452_48_0)[1] = __call452_49(life9_33);
    java.lang.Object[] __stackOp452_50_0 = spill452_18;
    spill452_19 = __stackOp452_50_0;
    (__stackOp452_50_0)[2] = __call452_51(life9_33);
    java.lang.Object[] __stackOp452_52_0 = spill452_19;
    spill452_20 = __stackOp452_52_0;
    (__stackOp452_52_0)[3] = __call452_54(__call452_53(life9_33));
    java.lang.Object[] __stackOp452_55_0 = spill452_20;
    spill452_21 = __stackOp452_55_0;
    (__stackOp452_55_0)[4] = __call452_57(__call452_56(life9_33));
    life12_163 = __call452_58(spill452_16, spill452_21);
    __call452_60(receiver, p0, __call452_59(receiver, life12_163));
    if (!((life5_13 != null))) {
        break forest_join_361;
    }
    }
    forestValue452_170_0 = __integerCategory452_62(__call452_61(life6_7));
    }
    if (!((life5_13 == null))) {
        forestValue452_175_0 = forestValue452_170_0;
        break forest_join_175;
    }
    if (!((forestValue452_170_0 == 1))) {
        break forest_join_176;
    }
    forestValue452_175_0 = 1;
    }
    forestValue452_177_0 = forestValue452_175_0;
    break forest_join_177;
    }
    forestValue452_177_0 = 0;
    }
    life13_184 = forestValue452_177_0;
    spill452_22 = life13_184;
    spill452_23 = __call452_63(life6_7);
    if (!((life5_13 == null))) {
        forestValue452_190_0 = spill452_22;
        forestValue452_190_1 = __integerCategory452_64(spill452_23);
        break forest_join_190;
    }
    if (!((spill452_23 == __invokedynamic452_65(11567, (4530168775606164617L ^ life3_3))))) {
        forestValue452_191_0 = spill452_22;
        break forest_join_191;
    }
    forestValue452_190_0 = spill452_22;
    forestValue452_190_1 = 1;
    }
    forestValue452_192_0 = forestValue452_190_0;
    forestValue452_192_1 = forestValue452_190_1;
    break forest_join_192;
    }
    forestValue452_192_0 = forestValue452_191_0;
    forestValue452_192_1 = 0;
    }
    life13_202 = (forestValue452_192_0 & forestValue452_192_1);
    life13_218 = (life13_202 & __integerCategory452_72(__call452_71("MC|PingHost", new java.lang.String(__call452_69(__call452_68(life6_7, (__integerCategory452_67(__call452_66(life6_7)) * 2))), __fieldRead452_70()))));
    life14_221 = __call452_73(life6_7);
    spill452_24 = life13_218;
    spill452_25 = __call452_74(life6_7);
    if (!((life5_13 == null))) {
        forestValue452_225_0 = spill452_24;
        forestValue452_225_1 = __integerCategory452_75(spill452_25);
        break forest_join_225;
    }
    if (!((spill452_25 >= __invokedynamic452_76(19680, (4352131385714949445L ^ life3_3))))) {
        forestValue452_226_0 = spill452_24;
        break forest_join_226;
    }
    forestValue452_225_0 = spill452_24;
    forestValue452_225_1 = 1;
    }
    forestValue452_227_0 = forestValue452_225_0;
    forestValue452_227_1 = forestValue452_225_1;
    break forest_join_227;
    }
    forestValue452_227_0 = forestValue452_226_0;
    forestValue452_227_1 = 0;
    }
    life13_239 = (forestValue452_227_0 & forestValue452_227_1);
    spill452_26 = life13_239;
    spill452_27 = ((3 + (__call452_80(__call452_79(life6_7, (__integerCategory452_78(__call452_77(life6_7)) * 2)))).length) + 4);
    if (!((life5_13 == null))) {
        forestValue452_247_0 = spill452_26;
        forestValue452_247_1 = spill452_27;
        break forest_join_247;
    }
    if (!((spill452_27 == life14_221))) {
        forestValue452_248_0 = spill452_26;
        break forest_join_248;
    }
    forestValue452_247_0 = spill452_26;
    forestValue452_247_1 = 1;
    }
    forestValue452_249_0 = forestValue452_247_0;
    forestValue452_249_1 = forestValue452_247_1;
    break forest_join_249;
    }
    forestValue452_249_0 = forestValue452_248_0;
    forestValue452_249_1 = 0;
    }
    life13_263 = (forestValue452_249_0 & forestValue452_249_1);
    spill452_28 = life13_263;
    spill452_29 = __call452_81(life6_7);
    if (!((life5_13 == null))) {
        forestValue452_263_0 = spill452_28;
        forestValue452_263_1 = spill452_29;
        break forest_join_263;
    }
    if (!((spill452_29 <= __invokedynamic452_82(7591, (6469023295378418691L ^ life3_3))))) {
        forestValue452_264_0 = spill452_28;
        break forest_join_264;
    }
    forestValue452_263_0 = spill452_28;
    forestValue452_263_1 = 1;
    }
    forestValue452_265_0 = forestValue452_263_0;
    forestValue452_265_1 = forestValue452_263_1;
    break forest_join_265;
    }
    forestValue452_265_0 = forestValue452_264_0;
    forestValue452_265_1 = 0;
    }
    life13_281 = (forestValue452_265_0 & forestValue452_265_1);
    spill452_30 = life13_281;
    spill452_31 = __call452_83(life6_7);
    if (!((life5_13 == null))) {
        forestValue452_274_0 = spill452_30;
        forestValue452_274_1 = spill452_31;
        break forest_join_274;
    }
    if (!((spill452_31 == 0))) {
        forestValue452_275_0 = spill452_30;
        break forest_join_275;
    }
    forestValue452_274_0 = spill452_30;
    forestValue452_274_1 = 1;
    }
    forestValue452_276_0 = forestValue452_274_0;
    forestValue452_276_1 = forestValue452_274_1;
    break forest_join_276;
    }
    forestValue452_276_0 = forestValue452_275_0;
    forestValue452_276_1 = 0;
    }
    life13_293 = (forestValue452_276_0 & forestValue452_276_1);
    if (!((life5_13 == null))) {
        break forest_join_314;
    }
    if (!((life13_293 == 0))) {
        break forest_join_298;
    }
    if (!((life7_12 != 0))) {
        break forest_join_297;
    }
    __call452_84(life6_7);
    __call452_87(__call452_86(__call452_85(p0)), "legacy_query");
    __call452_88(p0, p1);
    }
    return;
    }
    spill452_32 = __fieldRead452_89();
    spill452_33 = "Ping: (1.6) from {}:{}";
    java.lang.Object[] __stackOp452_90_0 = new java.lang.Object[2];
    spill452_34 = __stackOp452_90_0;
    (__stackOp452_90_0)[0] = __call452_91(life8_29);
    java.lang.Object[] __stackOp452_92_0 = spill452_34;
    spill452_35 = __stackOp452_92_0;
    (__stackOp452_92_0)[1] = __call452_94(__call452_93(life8_29));
    __call452_95(spill452_32, spill452_33, spill452_35);
    }
    spill452_36 = "§1\000%d\000%s\000%s\000%d\000%d";
    java.lang.Object[] __stackOp452_96_0 = new java.lang.Object[5];
    spill452_37 = __stackOp452_96_0;
    (__stackOp452_96_0)[0] = __call452_98(__invokedynamic452_97(32120, (429350766784974043L ^ life3_3)));
    java.lang.Object[] __stackOp452_99_0 = spill452_37;
    spill452_38 = __stackOp452_99_0;
    (__stackOp452_99_0)[1] = __call452_100(life9_33);
    java.lang.Object[] __stackOp452_101_0 = spill452_38;
    spill452_39 = __stackOp452_101_0;
    (__stackOp452_101_0)[2] = __call452_102(life9_33);
    java.lang.Object[] __stackOp452_103_0 = spill452_39;
    spill452_40 = __stackOp452_103_0;
    (__stackOp452_103_0)[3] = __call452_105(__call452_104(life9_33));
    java.lang.Object[] __stackOp452_106_0 = spill452_40;
    spill452_41 = __stackOp452_106_0;
    (__stackOp452_106_0)[4] = __call452_108(__call452_107(life9_33));
    life15_367 = __call452_109(spill452_36, spill452_41);
    life16_371 = __call452_110(receiver, life15_367);
    __call452_111(receiver, p0, life16_371);
    __call452_112(life16_371);
    }
    __call452_113(life6_7);
    life7_12 = 0;
    }
    forestValue452_367_0 = life7_12;
    }
    if (!((forestValue452_367_0 != 0))) {
        break forest_join_381;
    }
    __call452_114(life6_7);
    __call452_117(__call452_116(__call452_115(p0)), "legacy_query");
    __call452_118(p0, p1);
    }
    return;
}
public static void h452_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045200_0(p0);
}
public static void h452_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045201_0(p0);
}
public static void h452_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045202_0(p0);
}
public static void h452_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045203_0(p0);
}
public static void h452_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045204_0(p0);
}
public static void h452_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045205_0(p0);
}
public static void h452_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045206_0(p0);
}
public static void h452_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045207_0(p0);
}
public static void h452_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045208_0(p0);
}
public static void h452_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045209_0(p0);
}
public static void h452_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045210_0(p0);
}
public static void h452_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045211_0(p0);
}
public static void h452_12(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045212_0(p0);
}
public static void h452_13(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045213_0(p0);
}
public static void h452_14(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045214_0(p0);
}
public static void h452_15(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045215_0(p0);
}
public static void h452_16(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045216_0(p0);
}
public static void h452_17(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045217_0(p0);
}
public static void h452_18(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045218_0(p0);
}
public static void h452_19(java.lang.Throwable p0, ByteBuf p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3045219_0(p1);
    throw life2_2;
}
public static void h452_20(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045220_0(p0);
}
public static void h452_21(java.lang.RuntimeException p0, ChannelHandlerContext p1, java.lang.Object p2, java.lang.String p3, ByteBuf p4, int p5) throws Throwable {
    java.lang.RuntimeException life6_2;
    forest_join_19: {
    life6_2 = p0;
    if (!((p3 == null))) {
        break forest_join_19;
    }
    if (!((p5 != 0))) {
        break forest_join_19;
    }
    __call3045221_0(p4);
    __call3045221_3(__call3045221_2(__call3045221_1(p1)), "legacy_query");
    __call3045221_4(p1, p2);
    }
    return;
}
public static void h452_22(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045222_0(p0);
}
public static void h452_23(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045223_0(p0);
}
public static void h452_24(java.lang.Throwable p0, ChannelHandlerContext p1, java.lang.Object p2, java.lang.String p3, ByteBuf p4, int p5) throws Throwable {
    java.lang.Throwable life6_2;
    forest_join_19: {
    forest_join_15: {
    life6_2 = p0;
    if (!((p3 == null))) {
        break forest_join_15;
    }
    if (!((p5 != 0))) {
        break forest_join_19;
    }
    __call3045224_0(p4);
    __call3045224_3(__call3045224_2(__call3045224_1(p1)), "legacy_query");
    }
    __call3045224_4(p1, p2);
    }
    throw life6_2;
}
public static void h452_25(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045225_0(p0);
}
public static void h452_26(java.lang.RuntimeException p0) throws Throwable {
    throw __call3045226_0(p0);
}
private static native long __fieldRead452_0() throws Throwable;
private static native java.lang.String __call452_1() throws Throwable;
private static native ByteBuf __cast452_2(java.lang.Object a0) throws Throwable;
private static native ByteBuf __call452_3(ByteBuf a0) throws Throwable;
private static native short __call452_4(ByteBuf a0) throws Throwable;
private static native int __integerCategory452_5(short value) throws Throwable;
private static native int __invokedynamic452_6(int a0, long a1) throws Throwable;
private static native Channel __call452_7(ChannelHandlerContext a0) throws Throwable;
private static native java.net.SocketAddress __call452_8(Channel a0) throws Throwable;
private static native java.net.InetSocketAddress __cast452_9(java.net.SocketAddress a0) throws Throwable;
private static native net.minecraft.network.NetworkSystem __fieldRead452_10(moom.k a0) throws Throwable;
private static native moom.Bl __call452_11(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native int __call452_12(ByteBuf a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead452_13() throws Throwable;
private static native java.net.InetAddress __call452_15(java.net.InetSocketAddress a0) throws Throwable;
private static native int __call452_17(java.net.InetSocketAddress a0) throws Throwable;
private static native java.lang.Integer __call452_18(int a0) throws Throwable;
private static native void __call452_19(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __call452_21(moom.Bl a0) throws Throwable;
private static native int __call452_23(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call452_24(int a0) throws Throwable;
private static native int __call452_26(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call452_27(int a0) throws Throwable;
private static native java.lang.String __call452_28(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native ByteBuf __call452_29(moom.k a0, java.lang.String a1) throws Throwable;
private static native void __call452_30(moom.k a0, ChannelHandlerContext a1, ByteBuf a2) throws Throwable;
private static native short __call452_31(ByteBuf a0) throws Throwable;
private static native int __integerCategory452_32(short value) throws Throwable;
private static native ByteBuf __call452_33(ByteBuf a0) throws Throwable;
private static native Channel __call452_34(ChannelHandlerContext a0) throws Throwable;
private static native ChannelPipeline __call452_35(Channel a0) throws Throwable;
private static native ChannelHandler __call452_36(ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native ChannelHandlerContext __call452_37(ChannelHandlerContext a0, java.lang.Object a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead452_38() throws Throwable;
private static native java.net.InetAddress __call452_40(java.net.InetSocketAddress a0) throws Throwable;
private static native int __call452_42(java.net.InetSocketAddress a0) throws Throwable;
private static native java.lang.Integer __call452_43(int a0) throws Throwable;
private static native void __call452_44(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __invokedynamic452_46(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call452_47(int a0) throws Throwable;
private static native java.lang.String __call452_49(moom.Bl a0) throws Throwable;
private static native java.lang.String __call452_51(moom.Bl a0) throws Throwable;
private static native int __call452_53(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call452_54(int a0) throws Throwable;
private static native int __call452_56(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call452_57(int a0) throws Throwable;
private static native java.lang.String __call452_58(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native ByteBuf __call452_59(moom.k a0, java.lang.String a1) throws Throwable;
private static native void __call452_60(moom.k a0, ChannelHandlerContext a1, ByteBuf a2) throws Throwable;
private static native short __call452_61(ByteBuf a0) throws Throwable;
private static native int __integerCategory452_62(short value) throws Throwable;
private static native short __call452_63(ByteBuf a0) throws Throwable;
private static native int __integerCategory452_64(short value) throws Throwable;
private static native int __invokedynamic452_65(int a0, long a1) throws Throwable;
private static native short __call452_66(ByteBuf a0) throws Throwable;
private static native int __integerCategory452_67(short value) throws Throwable;
private static native ByteBuf __call452_68(ByteBuf a0, int a1) throws Throwable;
private static native byte[] __call452_69(ByteBuf a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead452_70() throws Throwable;
private static native boolean __call452_71(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory452_72(boolean value) throws Throwable;
private static native int __call452_73(ByteBuf a0) throws Throwable;
private static native short __call452_74(ByteBuf a0) throws Throwable;
private static native int __integerCategory452_75(short value) throws Throwable;
private static native int __invokedynamic452_76(int a0, long a1) throws Throwable;
private static native short __call452_77(ByteBuf a0) throws Throwable;
private static native int __integerCategory452_78(short value) throws Throwable;
private static native ByteBuf __call452_79(ByteBuf a0, int a1) throws Throwable;
private static native byte[] __call452_80(ByteBuf a0) throws Throwable;
private static native int __call452_81(ByteBuf a0) throws Throwable;
private static native int __invokedynamic452_82(int a0, long a1) throws Throwable;
private static native int __call452_83(ByteBuf a0) throws Throwable;
private static native ByteBuf __call452_84(ByteBuf a0) throws Throwable;
private static native Channel __call452_85(ChannelHandlerContext a0) throws Throwable;
private static native ChannelPipeline __call452_86(Channel a0) throws Throwable;
private static native ChannelHandler __call452_87(ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native ChannelHandlerContext __call452_88(ChannelHandlerContext a0, java.lang.Object a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead452_89() throws Throwable;
private static native java.net.InetAddress __call452_91(java.net.InetSocketAddress a0) throws Throwable;
private static native int __call452_93(java.net.InetSocketAddress a0) throws Throwable;
private static native java.lang.Integer __call452_94(int a0) throws Throwable;
private static native void __call452_95(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __invokedynamic452_97(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call452_98(int a0) throws Throwable;
private static native java.lang.String __call452_100(moom.Bl a0) throws Throwable;
private static native java.lang.String __call452_102(moom.Bl a0) throws Throwable;
private static native int __call452_104(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call452_105(int a0) throws Throwable;
private static native int __call452_107(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call452_108(int a0) throws Throwable;
private static native java.lang.String __call452_109(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native ByteBuf __call452_110(moom.k a0, java.lang.String a1) throws Throwable;
private static native void __call452_111(moom.k a0, ChannelHandlerContext a1, ByteBuf a2) throws Throwable;
private static native boolean __call452_112(ByteBuf a0) throws Throwable;
private static native boolean __call452_113(ByteBuf a0) throws Throwable;
private static native ByteBuf __call452_114(ByteBuf a0) throws Throwable;
private static native Channel __call452_115(ChannelHandlerContext a0) throws Throwable;
private static native ChannelPipeline __call452_116(Channel a0) throws Throwable;
private static native ChannelHandler __call452_117(ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native ChannelHandlerContext __call452_118(ChannelHandlerContext a0, java.lang.Object a1) throws Throwable;
private static native java.lang.RuntimeException __call3045200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045201_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045202_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045203_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045204_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045205_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045206_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045207_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045208_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045209_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045210_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045211_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045212_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045213_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045214_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045215_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045216_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045217_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045218_0(java.lang.RuntimeException a0) throws Throwable;
private static native boolean __call3045219_0(ByteBuf a0) throws Throwable;
private static native java.lang.RuntimeException __call3045220_0(java.lang.RuntimeException a0) throws Throwable;
private static native ByteBuf __call3045221_0(ByteBuf a0) throws Throwable;
private static native Channel __call3045221_1(ChannelHandlerContext a0) throws Throwable;
private static native ChannelPipeline __call3045221_2(Channel a0) throws Throwable;
private static native ChannelHandler __call3045221_3(ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native ChannelHandlerContext __call3045221_4(ChannelHandlerContext a0, java.lang.Object a1) throws Throwable;
private static native java.lang.RuntimeException __call3045222_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045223_0(java.lang.RuntimeException a0) throws Throwable;
private static native ByteBuf __call3045224_0(ByteBuf a0) throws Throwable;
private static native Channel __call3045224_1(ChannelHandlerContext a0) throws Throwable;
private static native ChannelPipeline __call3045224_2(Channel a0) throws Throwable;
private static native ChannelHandler __call3045224_3(ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native ChannelHandlerContext __call3045224_4(ChannelHandlerContext a0, java.lang.Object a1) throws Throwable;
private static native java.lang.RuntimeException __call3045225_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3045226_0(java.lang.RuntimeException a0) throws Throwable;

}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28744;
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
            throw new RuntimeException("moom/k", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.k.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8203_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/k"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private ByteBuf a(java.lang.String p0) {
ByteBuf lexicalValue1229_48_0;
    java.lang.String spill1229_0;
    ByteBuf spill1229_1;
    long life2_3;
    ByteBuf life5_5;
    char[] life6_17;
    java.lang.String life4_18;
    char[] life7_25;
    int life8_28;
    int life9_30;
    int life10_37;
    lexical_join_48: {
    lexical_join_47: {
    life2_3 = (moom.k.c ^ 7264860054840L);
    life5_5 = Unpooled.buffer();
    ((ByteBuf)(life5_5)).writeByte(((int)(__sourceIntrinsic_b55696d77ab3_invokedynamic1229_2(26896, (2408194947900450372L ^ life2_3)))));
    spill1229_0 = net.minecraft.network.PacketBuffer.b();
    life6_17 = ((java.lang.String)(p0)).toCharArray();
    life4_18 = spill1229_0;
    ((ByteBuf)(life5_5)).writeShort(((int)((life6_17).length)));
    life7_25 = life6_17;
    life8_28 = (life7_25).length;
    life9_30 = 0;
    lexical_cycle_31: while (true) {
    if (!((life9_30 < life8_28))) {
        break lexical_join_47;
    }
    life10_37 = ((int)((life7_25)[life9_30]));
    spill1229_1 = ((ByteBuf)(life5_5)).writeChar(((int)(life10_37)));
    if (!((life4_18 == null))) {
        lexicalValue1229_48_0 = spill1229_1;
        break lexical_join_48;
    }
    recovery.source.CarrierOps.discard(spill1229_1);
    life9_30 += 1;
    if (!((life4_18 != null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    lexicalValue1229_48_0 = life5_5;
    }
    return lexicalValue1229_48_0;
}


private void a(ChannelHandlerContext p0, ByteBuf p1) {
((ChannelFuture)(((ChannelHandlerContext)(((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).firstContext())).writeAndFlush(((java.lang.Object)(p1))))).addListener(((GenericFutureListener)(ChannelFutureListener.CLOSE)));
    return;
}


public void channelRead(ChannelHandlerContext p0, java.lang.Object p1) throws java.lang.Exception { __sourceHandlerCall_3a6b55f580888b1edd6a(this, p0, p1); }


private static native <E extends Throwable> int __sourceIntrinsic_b55696d77ab3_invokedynamic1229_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8203_0() throws E;
}
