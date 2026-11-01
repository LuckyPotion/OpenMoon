package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockModelShapes {

private final java.util.Map<net.minecraft.block.state.IBlockState, net.minecraft.client.resources.model.IBakedModel> a;

private final net.minecraft.client.renderer.block.statemap.BlockStateMapper b;

private final net.minecraft.client.resources.model.ModelManager c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public BlockModelShapes(net.minecraft.client.resources.model.ModelManager p0) {
super();
    this.a = com.google.common.collect.Maps.newIdentityHashMap();
    this.b = new net.minecraft.client.renderer.block.statemap.BlockStateMapper();
    this.c = p0;
    (this).b();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2800437875975572116L)), ((long)(8998502559799455868L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(242006206226019L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.BlockModelShapes.d ^ 86483552889840L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1806_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1806_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1806_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1806_14 = new byte[8];
    (__sourceSpill1806_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1806_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1806_16 = __sourceSpill1806_14;
    ((javax.crypto.Cipher)(__sourceSpill1806_11)).init(((int)(__sourceSpill1806_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1806_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1806_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Þ-yá\017¹Æ{\004þªÊ´ Cø\034èN$½m¿XÁ\r4|\021ñºaÔ[\030bö\r µÒnKFP\021Ç*¡p\023Cm_sª\177\004 "))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1806_25 = local6_life21;
        int __sourceSpill1806_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1806_25)).substring(((int)(__sourceSpill1806_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1806_30 = local8_life19;
        int __sourceSpill1806_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1806_33 = new byte[8];
        (__sourceSpill1806_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1806_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1806_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1806_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1806_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1806_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1806_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1806_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1806_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1806_34)).doFinal(((byte[])(__sourceSpill1806_33)));
        (__sourceSpill1806_30)[__sourceSpill1806_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ügÏDþÇb\0050J¸(Ì"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1806_38 = local6_life21;
        int __sourceSpill1806_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1806_38)).substring(((int)(__sourceSpill1806_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1806_43 = local8_life19;
        int __sourceSpill1806_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1806_46 = new byte[8];
        (__sourceSpill1806_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1806_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1806_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1806_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1806_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1806_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1806_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1806_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1806_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1806_47)).doFinal(((byte[])(__sourceSpill1806_46)));
        (__sourceSpill1806_43)[__sourceSpill1806_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[11]));
}


private void b() {
long life1_3;
    life1_3 = (net.minecraft.client.renderer.BlockModelShapes.d ^ 122866527177861L);
    net.minecraft.client.renderer.BlockModelShapes spill503_0 = this;
    net.minecraft.block.Block[] __stackOp503_2_0 = new net.minecraft.block.Block[__sourceIntrinsic_938da207dded_invokedynamic503_1(3559, (8965666395081746352L ^ life1_3))];
    net.minecraft.block.Block[] spill503_1 = __stackOp503_2_0;
    (__stackOp503_2_0)[0] = net.minecraft.init.Blocks.a;
    net.minecraft.block.Block[] __stackOp503_4_0 = spill503_1;
    net.minecraft.block.Block[] spill503_2 = __stackOp503_4_0;
    (__stackOp503_4_0)[1] = net.minecraft.init.Blocks.i;
    net.minecraft.block.Block[] __stackOp503_6_0 = spill503_2;
    net.minecraft.block.Block[] spill503_3 = __stackOp503_6_0;
    (__stackOp503_6_0)[2] = net.minecraft.init.Blocks.j;
    net.minecraft.block.Block[] __stackOp503_8_0 = spill503_3;
    net.minecraft.block.Block[] spill503_4 = __stackOp503_8_0;
    (__stackOp503_8_0)[3] = net.minecraft.init.Blocks.k;
    net.minecraft.block.Block[] __stackOp503_10_0 = spill503_4;
    net.minecraft.block.Block[] spill503_5 = __stackOp503_10_0;
    (__stackOp503_10_0)[4] = net.minecraft.init.Blocks.l;
    net.minecraft.block.Block[] __stackOp503_12_0 = spill503_5;
    net.minecraft.block.Block[] spill503_6 = __stackOp503_12_0;
    (__stackOp503_12_0)[5] = net.minecraft.init.Blocks.M;
    net.minecraft.block.Block[] __stackOp503_14_0 = spill503_6;
    net.minecraft.block.Block[] spill503_7 = __stackOp503_14_0;
    (__stackOp503_14_0)[__sourceIntrinsic_938da207dded_invokedynamic503_15(29312, (959634250099939540L ^ life1_3))] = net.minecraft.init.Blocks.ae;
    net.minecraft.block.Block[] __stackOp503_17_0 = spill503_7;
    net.minecraft.block.Block[] spill503_8 = __stackOp503_17_0;
    (__stackOp503_17_0)[__sourceIntrinsic_938da207dded_invokedynamic503_18(5940, (676501324807880040L ^ life1_3))] = net.minecraft.init.Blocks.bF;
    net.minecraft.block.Block[] __stackOp503_20_0 = spill503_8;
    net.minecraft.block.Block[] spill503_9 = __stackOp503_20_0;
    (__stackOp503_20_0)[__sourceIntrinsic_938da207dded_invokedynamic503_21(11564, (5689815122136532854L ^ life1_3))] = net.minecraft.init.Blocks.bV;
    net.minecraft.block.Block[] __stackOp503_23_0 = spill503_9;
    net.minecraft.block.Block[] spill503_10 = __stackOp503_23_0;
    (__stackOp503_23_0)[__sourceIntrinsic_938da207dded_invokedynamic503_24(17407, (951362656959359402L ^ life1_3))] = net.minecraft.init.Blocks.an;
    net.minecraft.block.Block[] __stackOp503_26_0 = spill503_10;
    net.minecraft.block.Block[] spill503_11 = __stackOp503_26_0;
    (__stackOp503_26_0)[__sourceIntrinsic_938da207dded_invokedynamic503_27(10140, (7279267630501236163L ^ life1_3))] = net.minecraft.init.Blocks.bT;
    net.minecraft.block.Block[] __stackOp503_29_0 = spill503_11;
    net.minecraft.block.Block[] spill503_12 = __stackOp503_29_0;
    (__stackOp503_29_0)[__sourceIntrinsic_938da207dded_invokedynamic503_30(8729, (5161361918566565956L ^ life1_3))] = net.minecraft.init.Blocks.bu;
    net.minecraft.block.Block[] __stackOp503_32_0 = spill503_12;
    net.minecraft.block.Block[] spill503_13 = __stackOp503_32_0;
    (__stackOp503_32_0)[__sourceIntrinsic_938da207dded_invokedynamic503_33(31943, (5254302852914435740L ^ life1_3))] = net.minecraft.init.Blocks.b_;
    net.minecraft.block.Block[] __stackOp503_35_0 = spill503_13;
    net.minecraft.block.Block[] spill503_14 = __stackOp503_35_0;
    (__stackOp503_35_0)[__sourceIntrinsic_938da207dded_invokedynamic503_36(13967, (8885477382156000471L ^ life1_3))] = net.minecraft.init.Blocks.ax;
    net.minecraft.block.Block[] __stackOp503_38_0 = spill503_14;
    net.minecraft.block.Block[] spill503_15 = __stackOp503_38_0;
    (__stackOp503_38_0)[__sourceIntrinsic_938da207dded_invokedynamic503_39(2846, (4353738052096303431L ^ life1_3))] = net.minecraft.init.Blocks.cp;
    net.minecraft.block.Block[] __stackOp503_41_0 = spill503_15;
    net.minecraft.block.Block[] spill503_16 = __stackOp503_41_0;
    (__stackOp503_41_0)[__sourceIntrinsic_938da207dded_invokedynamic503_42(29836, (10163350527860434L ^ life1_3))] = net.minecraft.init.Blocks.co;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_0)).a(((net.minecraft.block.Block[])(spill503_16)));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.ex.Q))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cm)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.d0.Q))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_17 = this;
    moom.dH spill503_18 = net.minecraft.init.Blocks.t;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_19 = ((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))))).a(((java.lang.String)("_leaves")));
    net.minecraft.block.properties.IProperty[] __stackOp503_59_0 = new net.minecraft.block.properties.IProperty[2];
    net.minecraft.block.properties.IProperty[] spill503_20 = __stackOp503_59_0;
    (__stackOp503_59_0)[0] = moom.dH.S;
    net.minecraft.block.properties.IProperty[] __stackOp503_61_0 = spill503_20;
    net.minecraft.block.properties.IProperty[] spill503_21 = __stackOp503_61_0;
    (__stackOp503_61_0)[1] = moom.dH.R;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_17)).a(((net.minecraft.block.Block)(spill503_18)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_19)).a(((net.minecraft.block.properties.IProperty[])(spill503_21))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_22 = this;
    moom.dH spill503_23 = net.minecraft.init.Blocks.u;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_24 = ((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))))).a(((java.lang.String)("_leaves")));
    net.minecraft.block.properties.IProperty[] __stackOp503_70_0 = new net.minecraft.block.properties.IProperty[2];
    net.minecraft.block.properties.IProperty[] spill503_25 = __stackOp503_70_0;
    (__stackOp503_70_0)[0] = moom.dH.S;
    net.minecraft.block.properties.IProperty[] __stackOp503_72_0 = spill503_25;
    net.minecraft.block.properties.IProperty[] spill503_26 = __stackOp503_72_0;
    (__stackOp503_72_0)[1] = moom.dH.R;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_22)).a(((net.minecraft.block.Block)(spill503_23)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_24)).a(((net.minecraft.block.properties.IProperty[])(spill503_26))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_27 = this;
    moom.cM spill503_28 = net.minecraft.init.Blocks.aK;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_29 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_78_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_30 = __stackOp503_78_0;
    (__stackOp503_78_0)[0] = moom.cM.Q;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_27)).a(((net.minecraft.block.Block)(spill503_28)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_29)).a(((net.minecraft.block.properties.IProperty[])(spill503_30))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_31 = this;
    moom.d_ spill503_32 = net.minecraft.init.Blocks.aM;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_33 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_84_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_34 = __stackOp503_84_0;
    (__stackOp503_84_0)[0] = moom.d_.Q;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_31)).a(((net.minecraft.block.Block)(spill503_32)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_33)).a(((net.minecraft.block.properties.IProperty[])(spill503_34))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_35 = this;
    net.minecraft.block.Block spill503_36 = net.minecraft.init.Blocks.aN;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_37 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_90_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_38 = __stackOp503_90_0;
    (__stackOp503_90_0)[0] = moom.c_.R;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_35)).a(((net.minecraft.block.Block)(spill503_36)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_37)).a(((net.minecraft.block.properties.IProperty[])(spill503_38))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_39 = this;
    net.minecraft.block.Block spill503_40 = net.minecraft.init.Blocks.bM;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_41 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_96_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_42 = __stackOp503_96_0;
    (__stackOp503_96_0)[0] = moom.c0.R;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_39)).a(((net.minecraft.block.Block)(spill503_40)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_41)).a(((net.minecraft.block.properties.IProperty[])(spill503_42))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bO)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.eG.V))))).a(((java.lang.String)("_wall"))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_43 = this;
    moom.cz spill503_44 = net.minecraft.init.Blocks.cj;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_45 = ((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)));
    net.minecraft.block.properties.IProperty[] __stackOp503_110_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_46 = __stackOp503_110_0;
    (__stackOp503_110_0)[0] = moom.cz.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_43)).a(((net.minecraft.block.Block)(spill503_44)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_45)).a(((net.minecraft.block.properties.IProperty[])(spill503_46))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_47 = this;
    net.minecraft.block.Block spill503_48 = net.minecraft.init.Blocks.bd;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_49 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_116_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_50 = __stackOp503_116_0;
    (__stackOp503_116_0)[0] = moom.dk.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_47)).a(((net.minecraft.block.Block)(spill503_48)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_49)).a(((net.minecraft.block.properties.IProperty[])(spill503_50))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_51 = this;
    net.minecraft.block.Block spill503_52 = net.minecraft.init.Blocks.be;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_53 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_122_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_54 = __stackOp503_122_0;
    (__stackOp503_122_0)[0] = moom.dk.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_51)).a(((net.minecraft.block.Block)(spill503_52)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_53)).a(((net.minecraft.block.properties.IProperty[])(spill503_54))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_55 = this;
    net.minecraft.block.Block spill503_56 = net.minecraft.init.Blocks.bf;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_57 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_128_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_58 = __stackOp503_128_0;
    (__stackOp503_128_0)[0] = moom.dk.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_55)).a(((net.minecraft.block.Block)(spill503_56)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_57)).a(((net.minecraft.block.properties.IProperty[])(spill503_58))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_59 = this;
    net.minecraft.block.Block spill503_60 = net.minecraft.init.Blocks.bg;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_61 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_134_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_62 = __stackOp503_134_0;
    (__stackOp503_134_0)[0] = moom.dk.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_59)).a(((net.minecraft.block.Block)(spill503_60)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_61)).a(((net.minecraft.block.properties.IProperty[])(spill503_62))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_63 = this;
    net.minecraft.block.Block spill503_64 = net.minecraft.init.Blocks.bh;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_65 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_140_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_66 = __stackOp503_140_0;
    (__stackOp503_140_0)[0] = moom.dk.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_63)).a(((net.minecraft.block.Block)(spill503_64)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_65)).a(((net.minecraft.block.properties.IProperty[])(spill503_66))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_67 = this;
    net.minecraft.block.Block spill503_68 = net.minecraft.init.Blocks.bi;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_69 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_146_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_70 = __stackOp503_146_0;
    (__stackOp503_146_0)[0] = moom.dk.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_67)).a(((net.minecraft.block.Block)(spill503_68)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_69)).a(((net.minecraft.block.properties.IProperty[])(spill503_70))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_71 = this;
    net.minecraft.block.Block spill503_72 = net.minecraft.init.Blocks.bH;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_73 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_152_0 = new net.minecraft.block.properties.IProperty[2];
    net.minecraft.block.properties.IProperty[] spill503_74 = __stackOp503_152_0;
    (__stackOp503_152_0)[0] = moom.eD.T;
    net.minecraft.block.properties.IProperty[] __stackOp503_154_0 = spill503_74;
    net.minecraft.block.properties.IProperty[] spill503_75 = __stackOp503_154_0;
    (__stackOp503_154_0)[1] = moom.eD.Q;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_71)).a(((net.minecraft.block.Block)(spill503_72)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_73)).a(((net.minecraft.block.properties.IProperty[])(spill503_75))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bA)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))))).a(((java.lang.String)("_double_slab"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))))).a(((java.lang.String)("_slab"))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_76 = this;
    net.minecraft.block.Block spill503_77 = net.minecraft.init.Blocks.W;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_78 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_172_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_79 = __stackOp503_172_0;
    (__stackOp503_172_0)[0] = moom.ez.Q;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_76)).a(((net.minecraft.block.Block)(spill503_77)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_78)).a(((net.minecraft.block.properties.IProperty[])(spill503_79))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_80 = this;
    net.minecraft.block.BlockFire spill503_81 = net.minecraft.init.Blocks.ab;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_82 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_178_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_83 = __stackOp503_178_0;
    (__stackOp503_178_0)[0] = net.minecraft.block.BlockFire.Q;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_80)).a(((net.minecraft.block.Block)(spill503_81)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_82)).a(((net.minecraft.block.properties.IProperty[])(spill503_83))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_84 = this;
    moom.d9 spill503_85 = net.minecraft.init.Blocks.af;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_86 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_184_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_87 = __stackOp503_184_0;
    (__stackOp503_184_0)[0] = moom.d9.U;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_84)).a(((net.minecraft.block.Block)(spill503_85)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_86)).a(((net.minecraft.block.properties.IProperty[])(spill503_87))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_88 = this;
    net.minecraft.block.Block spill503_89 = net.minecraft.init.Blocks.ao;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_90 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_190_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_91 = __stackOp503_190_0;
    (__stackOp503_190_0)[0] = net.minecraft.block.BlockDoor.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_88)).a(((net.minecraft.block.Block)(spill503_89)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_90)).a(((net.minecraft.block.properties.IProperty[])(spill503_91))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_92 = this;
    net.minecraft.block.Block spill503_93 = net.minecraft.init.Blocks.ap;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_94 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_196_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_95 = __stackOp503_196_0;
    (__stackOp503_196_0)[0] = net.minecraft.block.BlockDoor.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_92)).a(((net.minecraft.block.Block)(spill503_93)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_94)).a(((net.minecraft.block.properties.IProperty[])(spill503_95))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_96 = this;
    net.minecraft.block.Block spill503_97 = net.minecraft.init.Blocks.aq;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_98 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_202_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_99 = __stackOp503_202_0;
    (__stackOp503_202_0)[0] = net.minecraft.block.BlockDoor.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_96)).a(((net.minecraft.block.Block)(spill503_97)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_98)).a(((net.minecraft.block.properties.IProperty[])(spill503_99))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_100 = this;
    net.minecraft.block.Block spill503_101 = net.minecraft.init.Blocks.ar;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_102 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_208_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_103 = __stackOp503_208_0;
    (__stackOp503_208_0)[0] = net.minecraft.block.BlockDoor.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_100)).a(((net.minecraft.block.Block)(spill503_101)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_102)).a(((net.minecraft.block.properties.IProperty[])(spill503_103))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_104 = this;
    net.minecraft.block.Block spill503_105 = net.minecraft.init.Blocks.as;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_106 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_214_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_107 = __stackOp503_214_0;
    (__stackOp503_214_0)[0] = net.minecraft.block.BlockDoor.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_104)).a(((net.minecraft.block.Block)(spill503_105)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_106)).a(((net.minecraft.block.properties.IProperty[])(spill503_107))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_108 = this;
    net.minecraft.block.Block spill503_109 = net.minecraft.init.Blocks.at;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_110 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_220_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_111 = __stackOp503_220_0;
    (__stackOp503_220_0)[0] = net.minecraft.block.BlockDoor.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_108)).a(((net.minecraft.block.Block)(spill503_109)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_110)).a(((net.minecraft.block.properties.IProperty[])(spill503_111))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_112 = this;
    net.minecraft.block.Block spill503_113 = net.minecraft.init.Blocks.aA;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_114 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_226_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_115 = __stackOp503_226_0;
    (__stackOp503_226_0)[0] = net.minecraft.block.BlockDoor.T;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_112)).a(((net.minecraft.block.Block)(spill503_113)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_114)).a(((net.minecraft.block.properties.IProperty[])(spill503_115))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))).a(((java.lang.String)("_wool"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))).a(((java.lang.String)("_carpet"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))).a(((java.lang.String)("_stained_hardened_clay"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))).a(((java.lang.String)("_stained_glass_pane"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))).a(((java.lang.String)("_stained_glass"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.ef.Q))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cq)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.d6.Q))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.H)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cI.R))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_116 = this;
    net.minecraft.block.Block spill503_117 = net.minecraft.init.Blocks.C;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_118 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_277_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_119 = __stackOp503_277_0;
    (__stackOp503_277_0)[0] = net.minecraft.block.BlockBed.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_116)).a(((net.minecraft.block.Block)(spill503_117)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_118)).a(((net.minecraft.block.properties.IProperty[])(spill503_119))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.N)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(((moom.cA)(net.minecraft.init.Blocks.N)).a__ft()))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(((moom.cA)(net.minecraft.init.Blocks.O)).a__ft()))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.ej.S))))).a(((java.lang.String)("_slab"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ct)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.em.S))))).a(((java.lang.String)("_slab"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.eh.Q))))).a(((java.lang.String)("_monster_egg"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.ey.Q))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_120 = this;
    net.minecraft.block.Block spill503_121 = net.minecraft.init.Blocks.z;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_122 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_318_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_123 = __stackOp503_318_0;
    (__stackOp503_318_0)[0] = moom.c2.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_120)).a(((net.minecraft.block.Block)(spill503_121)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_122)).a(((net.minecraft.block.properties.IProperty[])(spill503_123))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_124 = this;
    net.minecraft.block.Block spill503_125 = net.minecraft.init.Blocks.b8;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_126 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_324_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_127 = __stackOp503_324_0;
    (__stackOp503_324_0)[0] = moom.c3.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_124)).a(((net.minecraft.block.Block)(spill503_125)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_126)).a(((net.minecraft.block.properties.IProperty[])(spill503_127))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.ee.S))))).a(((java.lang.String)("_log"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.ed.S))))).a(((java.lang.String)("_log"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))))).a(((java.lang.String)("_planks"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.cG.R))))).a(((java.lang.String)("_sapling"))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.m)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(new net.minecraft.client.renderer.block.statemap.StateMap$Builder())).a(((net.minecraft.block.properties.IProperty)(moom.dx.R))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_128 = this;
    moom.c9 spill503_129 = net.minecraft.init.Blocks.b4;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_130 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_359_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_131 = __stackOp503_359_0;
    (__stackOp503_359_0)[0] = moom.c9.S;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_128)).a(((net.minecraft.block.Block)(spill503_129)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_130)).a(((net.minecraft.block.properties.IProperty[])(spill503_131))))).a())));
    net.minecraft.client.renderer.BlockModelShapes spill503_132 = this;
    net.minecraft.block.Block spill503_133 = net.minecraft.init.Blocks.bP;
    net.minecraft.client.renderer.block.statemap.StateMap$Builder spill503_134 = new net.minecraft.client.renderer.block.statemap.StateMap$Builder();
    net.minecraft.block.properties.IProperty[] __stackOp503_365_0 = new net.minecraft.block.properties.IProperty[1];
    net.minecraft.block.properties.IProperty[] spill503_135 = __stackOp503_365_0;
    (__stackOp503_365_0)[0] = net.minecraft.block.BlockFlowerPot.R;
    ((net.minecraft.client.renderer.BlockModelShapes)(spill503_132)).a(((net.minecraft.block.Block)(spill503_133)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(((net.minecraft.client.renderer.block.statemap.StateMap$Builder)(spill503_134)).a(((net.minecraft.block.properties.IProperty[])(spill503_135))))).a())));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b5)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(new net.minecraft.client.renderer.BlockModelShapes$1(this))));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.I)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(new moom.l_(this))));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ba)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(new moom.ma(this))));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bb)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(new moom.mb(this))));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(new moom.mc(this))));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.T)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(new moom.md(this))));
    this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cs)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(new moom.me(this))));
    return;
}


public void a(net.minecraft.block.Block[] p0) {
((net.minecraft.client.renderer.block.statemap.BlockStateMapper)(this.b)).a(((net.minecraft.block.Block[])(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2843;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/kN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_7485f3abe33014(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10545_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.client.renderer.block.statemap.BlockStateMapper a() {
return this.b;
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.Block life2_2;
    net.minecraft.client.resources.model.IBakedModel life3_6;
    forward_join_95: {
    forward_join_89: {
    forward_join_80: {
    forward_join_71: {
    forward_join_65: {
    forward_join_59: {
    forward_join_53: {
    forward_join_47: {
    forward_join_38: {
    forward_join_32: {
    forward_join_14: {
    life2_2 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    life3_6 = ((net.minecraft.client.renderer.BlockModelShapes)(this)).a__pp(((net.minecraft.block.state.IBlockState)(p0)));
    if (!((life3_6 != null))) { break forward_join_14; }
    if (!((life3_6 == ((net.minecraft.client.resources.model.ModelManager)(this.c)).a__pp()))) { break forward_join_89; }
    }
    if (!((life2_2 != net.minecraft.init.Blocks.ax))) { break forward_join_32; }
    if (!((life2_2 != net.minecraft.init.Blocks.an))) { break forward_join_32; }
    if (!((life2_2 != net.minecraft.init.Blocks.ae))) { break forward_join_32; }
    if (!((life2_2 != net.minecraft.init.Blocks.bV))) { break forward_join_32; }
    if (!((life2_2 != net.minecraft.init.Blocks.co))) { break forward_join_32; }
    if (!((life2_2 == net.minecraft.init.Blocks.cp))) { break forward_join_38; }
    }
    return ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.resources.model.ModelManager)(this.c)).a__n8())).a(((java.lang.String)("minecraft:blocks/planks_oak")));
    }
    if (!((life2_2 == net.minecraft.init.Blocks.bF))) { break forward_join_47; }
    return ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.resources.model.ModelManager)(this.c)).a__n8())).a(((java.lang.String)("minecraft:blocks/obsidian")));
    }
    if (!((life2_2 != net.minecraft.init.Blocks.k))) { break forward_join_53; }
    if (!((life2_2 == net.minecraft.init.Blocks.l))) { break forward_join_59; }
    }
    return ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.resources.model.ModelManager)(this.c)).a__n8())).a(((java.lang.String)("minecraft:blocks/lava_still")));
    }
    if (!((life2_2 != net.minecraft.init.Blocks.i))) { break forward_join_65; }
    if (!((life2_2 == net.minecraft.init.Blocks.j))) { break forward_join_71; }
    }
    return ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.resources.model.ModelManager)(this.c)).a__n8())).a(((java.lang.String)("minecraft:blocks/water_still")));
    }
    if (!((life2_2 == net.minecraft.init.Blocks.bT))) { break forward_join_80; }
    return ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.resources.model.ModelManager)(this.c)).a__n8())).a(((java.lang.String)("minecraft:blocks/soul_sand")));
    }
    if (!((life2_2 == net.minecraft.init.Blocks.b_))) { break forward_join_89; }
    return ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.resources.model.ModelManager)(this.c)).a__n8())).a(((java.lang.String)("minecraft:items/barrier")));
    }
    if (!((life3_6 == null))) { break forward_join_95; }
    life3_6 = ((net.minecraft.client.resources.model.ModelManager)(this.c)).a__pp();
    }
    return ((net.minecraft.client.resources.model.IBakedModel)(life3_6)).a__oh();
}


public net.minecraft.client.resources.model.IBakedModel a__pp(net.minecraft.block.state.IBlockState p0) {
java.lang.Object local2 = ((net.minecraft.client.resources.model.IBakedModel)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
    if ((local2 == null)) {
        local2 = ((net.minecraft.client.resources.model.ModelManager)(this.c)).a__pp();
    }
    return ((net.minecraft.client.resources.model.IBakedModel)(local2));
}


public net.minecraft.client.resources.model.ModelManager a__pr() {
return this.c;
}


public void a__Void() {
java.util.Iterator life1_8;
    java.util.Map.Entry life2_15;
    ((java.util.Map)(this.a)).clear();
    life1_8 = ((java.util.Set)(((java.util.Map)(((net.minecraft.client.renderer.block.statemap.BlockStateMapper)(this.b)).a())).entrySet())).iterator();
    while (((java.util.Iterator)(life1_8)).hasNext()) {
        life2_15 = ((java.util.Map.Entry)(((java.util.Iterator)(life1_8)).next()));
        ((java.util.Map)(this.a)).put(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(((java.util.Map.Entry)(life2_15)).getKey())))), ((java.lang.Object)(((net.minecraft.client.resources.model.ModelManager)(this.c)).a(((moom.DE)(((moom.DE)(((java.util.Map.Entry)(life2_15)).getValue()))))))));
    }
    return;
}


public void a(net.minecraft.block.Block p0, net.minecraft.client.renderer.block.statemap.IStateMapper p1) {
((net.minecraft.client.renderer.block.statemap.BlockStateMapper)(this.b)).a(((net.minecraft.block.Block)(p0)), ((net.minecraft.client.renderer.block.statemap.IStateMapper)(p1)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10545_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic503_42(int a0, long a1) throws E;

private static native int __sourceExactCall_7485f3abe33014(int p0, long p1);
}
