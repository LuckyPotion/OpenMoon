package net.minecraft.client.resources.model;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ModelBakery {

private static java.util.Set<moom.DD> a;

private static org.apache.logging.log4j.Logger b;

protected static moom.DE c;

private static java.util.Map<java.lang.String, java.lang.String> d;

private static com.google.common.base.Joiner e;

private moom.oR f;

private java.util.Map<moom.DD, net.minecraft.client.renderer.texture.TextureAtlasSprite> g;

private java.util.Map<moom.DD, net.minecraft.client.renderer.block.model.ModelBlock> h;

private java.util.Map<moom.DE, moom.l4> i;

private net.minecraft.client.renderer.texture.TextureMap j;

private net.minecraft.client.renderer.BlockModelShapes k;

private moom.lN l;

private net.minecraft.client.renderer.block.model.ItemModelGenerator m;

private moom.Dy<moom.DE, net.minecraft.client.resources.model.IBakedModel> n;

private static net.minecraft.client.renderer.block.model.ModelBlock o;

private static net.minecraft.client.renderer.block.model.ModelBlock p;

private static net.minecraft.client.renderer.block.model.ModelBlock q;

private static net.minecraft.client.renderer.block.model.ModelBlock r;

private java.util.Map<java.lang.String, moom.DD> s;

private java.util.Map<moom.DD, net.minecraft.client.renderer.block.model.ModelBlockDefinition> t;

private java.util.Map<net.minecraft.item.Item, java.util.List<java.lang.String>> u;

private static java.util.Map<moom.I7<net.minecraft.item.Item>, java.util.Set<java.lang.String>> v;

private static long w;

private static long[] x;

private static java.lang.Integer[] y;

private static java.util.Map z;

public ModelBakery(moom.oR p0, net.minecraft.client.renderer.texture.TextureMap p1, net.minecraft.client.renderer.BlockModelShapes p2) { super(); }

private static void __sourceConstructorBody_52361c9f82200d8b(net.minecraft.client.resources.model.ModelBakery receiver, moom.oR p0, net.minecraft.client.renderer.texture.TextureMap p1, net.minecraft.client.renderer.BlockModelShapes p2) throws Throwable {
long local4_life2 = (net.minecraft.client.resources.model.ModelBakery.w ^ 79282281585884L);
    net.minecraft.client.resources.model.ModelBakery.__sourceConstructorInit_52361c9f82200d8b_0(((net.minecraft.client.resources.model.ModelBakery)(receiver)));
    ((net.minecraft.client.resources.model.ModelBakery)(receiver)).g = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.client.resources.model.ModelBakery)(receiver)).h = ((java.util.Map)(com.google.common.collect.Maps.newLinkedHashMap()));
    ((net.minecraft.client.resources.model.ModelBakery)(receiver)).i = ((java.util.Map)(com.google.common.collect.Maps.newLinkedHashMap()));
    int __sourceSpill820_12 = __sourceExactCall_5c5d6a17b3677f();
    ((net.minecraft.client.resources.model.ModelBakery)(receiver)).l = ((moom.lN)(new moom.lN()));
    ((net.minecraft.client.resources.model.ModelBakery)(receiver)).m = ((net.minecraft.client.renderer.block.model.ItemModelGenerator)(new net.minecraft.client.renderer.block.model.ItemModelGenerator()));
    int local6_life14 = __sourceSpill820_12;
    try {
        ((net.minecraft.client.resources.model.ModelBakery)(receiver)).n = ((moom.Dy)(new moom.Dy()));
        ((net.minecraft.client.resources.model.ModelBakery)(receiver)).s = ((java.util.Map)(com.google.common.collect.Maps.newLinkedHashMap()));
        ((net.minecraft.client.resources.model.ModelBakery)(receiver)).t = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
        ((net.minecraft.client.resources.model.ModelBakery)(receiver)).u = ((java.util.Map)(com.google.common.collect.Maps.newIdentityHashMap()));
        ((net.minecraft.client.resources.model.ModelBakery)(receiver)).f = ((moom.oR)(p0));
        ((net.minecraft.client.resources.model.ModelBakery)(receiver)).j = ((net.minecraft.client.renderer.texture.TextureMap)(p1));
        ((net.minecraft.client.resources.model.ModelBakery)(receiver)).k = ((net.minecraft.client.renderer.BlockModelShapes)(p2));
        if ((local6_life14 != 0)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[5])));
    }
    } catch (java.lang.RuntimeException __catchStack820) {
        throw net.minecraft.client.resources.model.ModelBakery.a(((java.lang.Exception)(__catchStack820)));
    }
    return;
}


static {
w = ((long)(((moom._a)(moom._c.a(((long)(2550611672825597665L)), ((long)(-3113092467010131172L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(19824986981789L)))));
    long local11_life6 = (net.minecraft.client.resources.model.ModelBakery.w ^ 36498491219409L);
    z = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1829_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1829_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1829_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1829_14 = new byte[8];
    (__sourceSpill1829_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1829_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1829_16 = __sourceSpill1829_14;
    ((javax.crypto.Cipher)(__sourceSpill1829_11)).init(((int)(__sourceSpill1829_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1829_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1829_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[24];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "c\036³¢Z)AÄ]oãYç´'e¦cèG6¬èðaýÔ+\023{ºö¡8íýðyXî.]Û\022F\023\036¸×p@\016¯CôÅØ<VÚ5§\023]\016{\035eY<ñim·aIì¤4¢ÏSØXHamÁ=£t·ôzB\b Pã\027A¹\024V¸ý\016YÑÕhÌÛ\033\002B¸¸\030\025ä\t\004v.BÂq\tÎÉrWÙº¬¶%Ë\002s\027>#£ï|&"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1829_25 = local4_life21;
        int __sourceSpill1829_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1829_25)).substring(((int)(__sourceSpill1829_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1829_30 = local6_life19;
        int __sourceSpill1829_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1829_33 = new byte[8];
        (__sourceSpill1829_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1829_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1829_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1829_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1829_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1829_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1829_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1829_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1829_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1829_34)).doFinal(((byte[])(__sourceSpill1829_33)));
        (__sourceSpill1829_30)[__sourceSpill1829_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "î\007¦T6Füu%\037;^X\b"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1829_38 = local4_life21;
        int __sourceSpill1829_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1829_38)).substring(((int)(__sourceSpill1829_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1829_43 = local6_life19;
        int __sourceSpill1829_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1829_46 = new byte[8];
        (__sourceSpill1829_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1829_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1829_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1829_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1829_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1829_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1829_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1829_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1829_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1829_47)).doFinal(((byte[])(__sourceSpill1829_46)));
        (__sourceSpill1829_43)[__sourceSpill1829_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    x = ((long[])(local6_life19));
    y = ((java.lang.Integer[])(new java.lang.Integer[24]));
    moom.DD[] __sourceSpill1829_53 = new moom.DD[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_52(20649, (2962596720023127685L ^ local11_life6))];
    (__sourceSpill1829_53)[0] = new moom.DD("blocks/water_flow");
    (__sourceSpill1829_53)[1] = new moom.DD("blocks/water_still");
    (__sourceSpill1829_53)[2] = new moom.DD("blocks/lava_flow");
    (__sourceSpill1829_53)[3] = new moom.DD("blocks/lava_still");
    (__sourceSpill1829_53)[4] = new moom.DD("blocks/destroy_stage_0");
    (__sourceSpill1829_53)[5] = new moom.DD("blocks/destroy_stage_1");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_54(11821, (3333891189792913424L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_2");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_55(6586, (5835804035545501569L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_3");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_56(24600, (2249972955166144049L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_4");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_57(8401, (582986629916899059L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_5");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_58(5033, (4260137783599367575L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_6");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_59(13744, (8512365772843131799L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_7");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_60(31156, (4379877823151992729L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_8");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_61(18784, (8171298956132704067L ^ local11_life6))] = new moom.DD("blocks/destroy_stage_9");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_62(23378, (599780762231131496L ^ local11_life6))] = new moom.DD("items/empty_armor_slot_helmet");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_63(7091, (9158341071190756746L ^ local11_life6))] = new moom.DD("items/empty_armor_slot_chestplate");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_64(26108, (3479083660699169751L ^ local11_life6))] = new moom.DD("items/empty_armor_slot_leggings");
    (__sourceSpill1829_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_65(634, (1979741421336368223L ^ local11_life6))] = new moom.DD("items/empty_armor_slot_boots");
    a = ((java.util.Set)(com.google.common.collect.Sets.newHashSet(((java.lang.Object[])(__sourceSpill1829_53)))));
    b = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    c = ((moom.DE)(new moom.DE("builtin/missing", "missing")));
    d = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    e = ((com.google.common.base.Joiner)(com.google.common.base.Joiner.on(((java.lang.String)(" -> ")))));
    o = ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.renderer.block.model.ModelBlock.a__lX(((java.lang.String)("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}")))));
    p = ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.renderer.block.model.ModelBlock.a__lX(((java.lang.String)("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}")))));
    q = ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.renderer.block.model.ModelBlock.a__lX(((java.lang.String)("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}")))));
    r = ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.renderer.block.model.ModelBlock.a__lX(((java.lang.String)("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}")))));
    v = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((java.util.Map)(net.minecraft.client.resources.model.ModelBakery.d)).put(((java.lang.Object)("missing")), ((java.lang.Object)("{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}")));
    ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.resources.model.ModelBakery.o)).g = ((java.lang.String)("generation marker"));
    ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.resources.model.ModelBakery.p)).g = ((java.lang.String)("compass generation marker"));
    ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.resources.model.ModelBakery.q)).g = ((java.lang.String)("class generation marker"));
    ((net.minecraft.client.renderer.block.model.ModelBlock)(net.minecraft.client.resources.model.ModelBakery.r)).g = ((java.lang.String)("block entity marker"));
}

private static native <E extends Throwable> void __sourceConstructorInit_52361c9f82200d8b_0(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static native <E extends Throwable> java.util.Set __sourceHandlerCall_a0bd0e8f35063dda6bf7(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_a0bd0e8f35063dda6bf7 {

public static java.util.Set f1084(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    java.lang.Object forestValue1084_31_0;
    int spill1084_0;
    net.minecraft.client.renderer.block.model.ModelBlock spill1084_1;
    long life1_3;
    java.util.HashSet life4_6;
    java.util.ArrayList life5_11;
    java.util.Iterator life6_18;
    int life3_19;
    moom.DE life7_26;
    moom.l4 life8_32;
    java.util.Iterator life9_38;
    moom.l2 life10_45;
    net.minecraft.client.renderer.block.model.ModelBlock life11_52;
    forest_join_79: {
    forest_join_75: {
    life1_3 = (__fieldRead1084_0() ^ 36042133921181L);
    spill1084_0 = __call1084_1();
    life4_6 = __call1084_2();
    life5_11 = __call1084_5(__call1084_4(__fieldRead1084_3(receiver)));
    __call1084_8(life5_11, __call1084_7(__invokedynamic1084_6()));
    life6_18 = __call1084_9(life5_11);
    life3_19 = spill1084_0;
    forest_cycle_20: while (true) {
    forest_join_73: {
    if (!(__call1084_10(life6_18))) {
        break forest_join_75;
    }
    life7_26 = __cast1084_12(__call1084_11(life6_18));
    forestValue1084_31_0 = __call1084_14(__fieldRead1084_13(receiver), life7_26);
    forest_cycle_31: while (true) {
    life8_32 = __cast1084_15(forestValue1084_31_0);
    if (!((life3_19 != 0))) {
        break forest_join_79;
    }
    life9_38 = __call1084_17(__call1084_16(life8_32));
    forest_cycle_39: while (true) {
    forest_join_71: {
    forest_join_65: {
    forest_join_63: {
    if (!(__call1084_18(life9_38))) {
        break forest_join_73;
    }
    life10_45 = __cast1084_20(__call1084_19(life9_38));
    life11_52 = __cast1084_24(__call1084_23(__fieldRead1084_21(receiver), __call1084_22(life10_45)));
    if (!((life3_19 != 0))) {
        break forest_join_63;
    }
    spill1084_1 = life11_52;
    if (!((life3_19 != 0))) {
        forestValue1084_31_0 = spill1084_1;
        continue forest_cycle_31;
    }
    if (!((spill1084_1 == null))) {
        break forest_join_65;
    }
    __call1084_27(__fieldRead1084_25(), __invokedynamic1084_26(life7_26));
    }
    if (!((life3_19 == 0))) {
        break forest_join_71;
    }
    }
    __call1084_29(life4_6, __call1084_28(receiver, life11_52));
    }
    if (!((life3_19 == 0))) {
        continue forest_cycle_39;
    }
    break forest_cycle_39;
    }
    break forest_cycle_31;
    }
    }
    if (!((life3_19 == 0))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    }
    __call1084_31(life4_6, __fieldRead1084_30());
    }
    return life4_6;
}
public static java.util.Set h1084_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108400_0(p0);
}
public static java.util.Set h1084_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108401_0(p0);
}
public static java.util.Set h1084_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108402_0(p0);
}
private static native long __fieldRead1084_0() throws Throwable;
private static native int __call1084_1() throws Throwable;
private static native java.util.HashSet __call1084_2() throws Throwable;
private static native java.util.Map __fieldRead1084_3(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Set __call1084_4(java.util.Map a0) throws Throwable;
private static native java.util.ArrayList __call1084_5(java.util.Set a0) throws Throwable;
private static native java.util.function.Function __invokedynamic1084_6() throws Throwable;
private static native java.util.Comparator __call1084_7(java.util.function.Function a0) throws Throwable;
private static native void __call1084_8(java.util.ArrayList a0, java.util.Comparator a1) throws Throwable;
private static native java.util.Iterator __call1084_9(java.util.ArrayList a0) throws Throwable;
private static native boolean __call1084_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1084_11(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast1084_12(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1084_13(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1084_14(java.util.Map a0, moom.DE a1) throws Throwable;
private static native moom.l4 __cast1084_15(java.lang.Object a0) throws Throwable;
private static native java.util.List __call1084_16(moom.l4 a0) throws Throwable;
private static native java.util.Iterator __call1084_17(java.util.List a0) throws Throwable;
private static native boolean __call1084_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1084_19(java.util.Iterator a0) throws Throwable;
private static native moom.l2 __cast1084_20(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1084_21(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.DD __call1084_22(moom.l2 a0) throws Throwable;
private static native java.lang.Object __call1084_23(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1084_24(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1084_25() throws Throwable;
private static native java.lang.String __invokedynamic1084_26(moom.DE a0) throws Throwable;
private static native void __call1084_27(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.Set __call1084_28(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native boolean __call1084_29(java.util.HashSet a0, java.util.Set a1) throws Throwable;
private static native java.util.Set __fieldRead1084_30() throws Throwable;
private static native boolean __call1084_31(java.util.HashSet a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call3108400_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108401_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108402_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_15f3bc0da5850629bded(net.minecraft.client.resources.model.ModelBakery a0, java.lang.String a1, moom.DD a2, moom.DD a3) throws E;
private static final class __SourceHandler_15f3bc0da5850629bded {

public static void f245(net.minecraft.client.resources.model.ModelBakery receiver, java.lang.String p0, moom.DD p1, moom.DD p2) throws Throwable {
    net.minecraft.client.resources.model.ModelBakery forwardValue245_20_0;
    int spill245_0;
    net.minecraft.client.resources.model.ModelBakery spill245_1;
    long life4_3;
    int life6_11;
    net.minecraft.client.renderer.block.model.ModelBlock life7_25;
    forward_join_29: {
    forward_join_20: {
    life4_3 = (__fieldRead245_0() ^ 53382465915623L);
    spill245_0 = __call245_1();
    __call245_3(__fieldRead245_2(receiver), p0, p1);
    life6_11 = spill245_0;
    spill245_1 = receiver;
    if (!((life6_11 != 0))) {
        forwardValue245_20_0 = spill245_1;
        break forward_join_20;
    }
    if (!((__call245_5(__fieldRead245_4(spill245_1), p1) == null))) {
        break forward_join_29;
    }
    forwardValue245_20_0 = receiver;
    }
    life7_25 = __call245_6(forwardValue245_20_0, p1);
    __call245_8(__fieldRead245_7(receiver), p1, life7_25);
    }
    return;
}
public static void h245_0(java.lang.Exception p0) throws Throwable {
    throw __call2024500_0(p0);
}
public static void h245_1(java.lang.Exception p0, moom.DD p1, moom.DD p2) throws Throwable {
    java.lang.Exception local3 = p0;
    org.apache.logging.log4j.Logger spill2024501_0 = __fieldRead2024501_0();
    java.lang.String spill2024501_1 = "Unable to load item model: '{}' for item: '{}'";
    java.lang.Object[] __stackOp2024501_1_0 = new java.lang.Object[2];
    java.lang.Object[] spill2024501_2 = __stackOp2024501_1_0;
    (__stackOp2024501_1_0)[0] = p1;
    java.lang.Object[] __stackOp2024501_2_0 = spill2024501_2;
    java.lang.Object[] spill2024501_3 = __stackOp2024501_2_0;
    (__stackOp2024501_2_0)[1] = p2;
    __call2024501_3(spill2024501_0, spill2024501_1, spill2024501_3);
    __call2024501_9(__fieldRead2024501_4(), __invokedynamic2024501_8(__call2024501_6(__call2024501_5(local3)), __call2024501_7(local3)));
    return;
}
private static native long __fieldRead245_0() throws Throwable;
private static native int __call245_1() throws Throwable;
private static native java.util.Map __fieldRead245_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call245_3(java.util.Map a0, java.lang.String a1, moom.DD a2) throws Throwable;
private static native java.util.Map __fieldRead245_4(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call245_5(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call245_6(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead245_7(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call245_8(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native java.lang.Exception __call2024500_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2024501_0() throws Throwable;
private static native void __call2024501_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2024501_4() throws Throwable;
private static native java.lang.Class __call2024501_5(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call2024501_6(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2024501_7(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2024501_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2024501_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ba2f26bcca554c371b5a(net.minecraft.client.resources.model.ModelBakery a0, java.util.Collection a1) throws E;
private static final class __SourceHandler_ba2f26bcca554c371b5a {

public static void f1082(net.minecraft.client.resources.model.ModelBakery receiver, java.util.Collection p0) throws Throwable {
    int spill1082_0;
    long life2_3;
    java.util.Iterator life5_7;
    int life4_8;
    moom.DE life6_15;
    net.minecraft.client.renderer.block.model.ModelBlockDefinition life7_19;
    forest_join_26: {
    life2_3 = (__fieldRead1082_0() ^ 53003243302630L);
    spill1082_0 = __call1082_1();
    life5_7 = __call1082_2(p0);
    life4_8 = spill1082_0;
    forest_cycle_9: while (true) {
    if (!(__call1082_3(life5_7))) {
        break forest_join_26;
    }
    life6_15 = __cast1082_5(__call1082_4(life5_7));
    life7_19 = __call1082_6(receiver, life6_15);
    __call1082_7(receiver, life7_19, life6_15);
    if (!((life4_8 != 0))) {
        continue forest_cycle_9;
    }
    break forest_cycle_9;
    }
    }
    return;
}
public static void h1082_0(java.lang.Exception p0, net.minecraft.client.resources.model.ModelBakery p1, int p2, java.util.Iterator p3, moom.DE p4, net.minecraft.client.renderer.block.model.ModelBlockDefinition p5) throws Throwable {
    java.lang.Exception life6_2;
    moom.DE life4_20;
    net.minecraft.client.renderer.block.model.ModelBlockDefinition life5_24;
    forest_join_28: {
    life6_2 = p0;
    __call3108200_3(__fieldRead3108200_0(), __invokedynamic3108200_2(__call3108200_1(p4), p4), life6_2);
    forest_cycle_9: while (true) {
    forest_join_12: {
    if (!((p2 != 0))) {
        break forest_join_12;
    }
    break forest_join_28;
    }
    if (!(__call3108200_4(p3))) {
        break forest_join_28;
    }
    life4_20 = __cast3108200_6(__call3108200_5(p3));
    life5_24 = __call3108200_7(p1, life4_20);
    __call3108200_8(p1, life5_24, life4_20);
    continue forest_cycle_9;
    }
    }
    return;
}
public static void h1082_1(java.lang.Exception p0, net.minecraft.client.resources.model.ModelBakery p1, int p2, java.util.Iterator p3, moom.DE p4, net.minecraft.client.renderer.block.model.ModelBlockDefinition p5) throws Throwable {
    java.lang.Exception life5_2;
    moom.DE life4_17;
    net.minecraft.client.renderer.block.model.ModelBlockDefinition life5_21;
    forest_join_26: {
    life5_2 = p0;
    __call3108201_2(__fieldRead3108201_0(), __invokedynamic3108201_1(p4), life5_2);
    forest_cycle_7: while (true) {
    forest_join_10: {
    if (!((p2 != 0))) {
        break forest_join_10;
    }
    break forest_join_26;
    }
    if (!(__call3108201_3(p3))) {
        break forest_join_26;
    }
    life4_17 = __cast3108201_5(__call3108201_4(p3));
    life5_21 = __call3108201_6(p1, life4_17);
    __call3108201_7(p1, life5_21, life4_17);
    continue forest_cycle_7;
    }
    }
    return;
}
private static native long __fieldRead1082_0() throws Throwable;
private static native int __call1082_1() throws Throwable;
private static native java.util.Iterator __call1082_2(java.util.Collection a0) throws Throwable;
private static native boolean __call1082_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1082_4(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast1082_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlockDefinition __call1082_6(net.minecraft.client.resources.model.ModelBakery a0, moom.DE a1) throws Throwable;
private static native void __call1082_7(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlockDefinition a1, moom.DE a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3108200_0() throws Throwable;
private static native java.lang.String __call3108200_1(moom.DE a0) throws Throwable;
private static native java.lang.String __invokedynamic3108200_2(java.lang.String a0, moom.DE a1) throws Throwable;
private static native void __call3108200_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3108200_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3108200_5(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast3108200_6(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlockDefinition __call3108200_7(net.minecraft.client.resources.model.ModelBakery a0, moom.DE a1) throws Throwable;
private static native void __call3108200_8(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlockDefinition a1, moom.DE a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3108201_0() throws Throwable;
private static native java.lang.String __invokedynamic3108201_1(moom.DE a0) throws Throwable;
private static native void __call3108201_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3108201_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3108201_4(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast3108201_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlockDefinition __call3108201_6(net.minecraft.client.resources.model.ModelBakery a0, moom.DE a1) throws Throwable;
private static native void __call3108201_7(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlockDefinition a1, moom.DE a2) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_2f38ece7bb11384b852b(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws E;
private static final class __SourceHandler_2f38ece7bb11384b852b {

public static java.util.List f235(net.minecraft.client.resources.model.ModelBakery receiver, moom.DD p0) throws Throwable {
    java.util.ArrayList lexicalValue235_31_0;
    int spill235_0;
    moom.DD[] spill235_1;
    java.util.ArrayList spill235_2;
    long life2_3;
    java.util.ArrayList life5_12;
    int life4_13;
    moom.DD life6_15;
    lexical_join_31: {
    lexical_join_30: {
    life2_3 = (__fieldRead235_0() ^ 115412794429587L);
    spill235_0 = __call235_1();
    moom.DD[] __stackOp235_2_0 = new moom.DD[1];
    spill235_1 = __stackOp235_2_0;
    (__stackOp235_2_0)[0] = p0;
    life5_12 = __call235_3(spill235_1);
    life4_13 = spill235_0;
    life6_15 = p0;
    lexical_cycle_16: while (true) {
    if (!(((life6_15 = __call235_4(receiver, life6_15)) != null))) {
        break lexical_join_30;
    }
    spill235_2 = life5_12;
    if (!((life4_13 == 0))) {
        lexicalValue235_31_0 = spill235_2;
        break lexical_join_31;
    }
    __call235_5(spill235_2, 0, life6_15);
    if (!((life4_13 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue235_31_0 = life5_12;
    }
    return lexicalValue235_31_0;
}
public static void h235_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1023500_0(p0);
}
private static native long __fieldRead235_0() throws Throwable;
private static native int __call235_1() throws Throwable;
private static native java.util.ArrayList __call235_3(moom.DD[] a0) throws Throwable;
private static native moom.DD __call235_4(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native void __call235_5(java.util.ArrayList a0, int a1, moom.DD a2) throws Throwable;
private static native java.lang.Exception __call1023500_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_a4252fdf776043b8efd6(moom.DD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_a4252fdf776043b8efd6 {

public static moom.DD f1433(moom.DD p0, java.lang.String p1) throws Throwable {
    java.lang.String forwardValue1433_18_0;
    moom.DD forwardValue1433_41_0;
    moom.DD spill1433_0;
    java.lang.String spill1433_1;
    moom.DD spill1433_2;
    moom.DD spill1433_3;
    long life2_3;
    int life4_5;
    java.lang.String life5_43;
    java.lang.String life6_47;
    forward_join_41: {
    forward_join_40: {
    forward_join_18: {
    life2_3 = (__fieldRead1433_0() ^ 92452350527977L);
    life4_5 = __call1433_1();
    spill1433_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1433_41_0 = spill1433_0;
        break forward_join_41;
    }
    if (!((spill1433_0 != null))) {
        break forward_join_40;
    }
    spill1433_1 = p1;
    if (!((life4_5 == 0))) {
        forwardValue1433_18_0 = spill1433_1;
        break forward_join_18;
    }
    if (!((spill1433_1 != null))) {
        break forward_join_40;
    }
    spill1433_2 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1433_41_0 = spill1433_2;
        break forward_join_41;
    }
    forwardValue1433_18_0 = __call1433_2(spill1433_2);
    }
    if (!(__call1433_3(forwardValue1433_18_0, "minecraft"))) {
        break forward_join_40;
    }
    spill1433_3 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1433_41_0 = spill1433_3;
        break forward_join_41;
    }
    life5_43 = __call1433_4(spill1433_3);
    life6_47 = __call1433_5(life5_43, p1);
    if (!((life6_47 != life5_43))) {
        break forward_join_40;
    }
    p0 = new moom.DD(__call1433_6(p0), life6_47);
    }
    forwardValue1433_41_0 = p0;
    }
    return forwardValue1433_41_0;
}
public static void h1433_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143300_0(p0);
}
public static void h1433_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143301_0(p0);
}
public static void h1433_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143302_0(p0);
}
public static void h1433_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143303_0(p0);
}
public static void h1433_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143304_0(p0);
}
public static void h1433_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143305_0(p0);
}
private static native long __fieldRead1433_0() throws Throwable;
private static native int __call1433_1() throws Throwable;
private static native java.lang.String __call1433_2(moom.DD a0) throws Throwable;
private static native boolean __call1433_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1433_4(moom.DD a0) throws Throwable;
private static native java.lang.String __call1433_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1433_6(moom.DD a0) throws Throwable;
private static native java.lang.Exception __call1143300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143302_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143303_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143304_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143305_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4fd5c0a9d1db8991df93(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws E;
private static final class __SourceHandler_4fd5c0a9d1db8991df93 {

public static void f236(net.minecraft.client.renderer.block.model.ModelBlock p0, java.lang.String p1) throws Throwable {
    java.util.Map lexicalValue236_26_0;
    java.lang.Object lexicalValue236_52_0;
    int spill236_0;
    java.util.Map spill236_1;
    java.lang.String spill236_2;
    long life2_3;
    moom.DD life5_9;
    int life4_10;
    java.util.Map life6_23;
    java.util.Iterator life7_34;
    java.util.Map.Entry life8_41;
    java.lang.String life9_45;
    java.lang.String life10_49;
    lexical_join_55: {
    lexical_join_26: {
    lexical_join_18: {
    life2_3 = (__fieldRead236_0() ^ 89117349929071L);
    spill236_0 = __call236_1();
    life5_9 = __call236_3(__call236_2(p0), p1);
    life4_10 = spill236_0;
    if (!((life5_9 != __call236_4(p0)))) {
        break lexical_join_18;
    }
    __fieldWrite236_5(p0, life5_9);
    }
    life6_23 = __fieldRead236_6(p0);
    spill236_1 = life6_23;
    if (!((life4_10 != 0))) {
        lexicalValue236_26_0 = spill236_1;
        break lexical_join_26;
    }
    if (!((spill236_1 != null))) {
        break lexical_join_55;
    }
    lexicalValue236_26_0 = life6_23;
    }
    life7_34 = __call236_8(__call236_7(lexicalValue236_26_0));
    lexical_cycle_29: while (true) {
    lexical_join_53: {
    lexical_join_52: {
    if (!(__call236_9(life7_34))) {
        break lexical_join_55;
    }
    life8_41 = __cast236_11(__call236_10(life7_34));
    life9_45 = __cast236_13(__call236_12(life8_41));
    life10_49 = __call236_14(life9_45, p1);
    spill236_2 = life10_49;
    if (!((life4_10 != 0))) {
        lexicalValue236_52_0 = spill236_2;
        break lexical_join_52;
    }
    if (!((spill236_2 != life9_45))) {
        break lexical_join_53;
    }
    lexicalValue236_52_0 = __call236_15(life8_41, life10_49);
    }
    __discardScalar236_16(lexicalValue236_52_0);
    }
    if (!((life4_10 == 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return;
}
public static void h236_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1023600_0(p0);
}
public static void h236_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1023601_0(p0);
}
public static void h236_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1023602_0(p0);
}
public static void h236_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1023603_0(p0);
}
private static native long __fieldRead236_0() throws Throwable;
private static native int __call236_1() throws Throwable;
private static native moom.DD __call236_2(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native moom.DD __call236_3(moom.DD a0, java.lang.String a1) throws Throwable;
private static native moom.DD __call236_4(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native void __fieldWrite236_5(net.minecraft.client.renderer.block.model.ModelBlock a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead236_6(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native java.util.Set __call236_7(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call236_8(java.util.Set a0) throws Throwable;
private static native boolean __call236_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call236_10(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast236_11(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call236_12(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast236_13(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call236_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call236_15(java.util.Map.Entry a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar236_16(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1023600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1023601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1023602_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1023603_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.resources.model.IBakedModel __sourceHandlerCall_bed11baed749c4cf8537(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1, moom.I2 a2, boolean a3) throws E;
private static final class __SourceHandler_bed11baed749c4cf8537 {

public static net.minecraft.client.resources.model.IBakedModel f1083(net.minecraft.client.resources.model.ModelBakery receiver, net.minecraft.client.renderer.block.model.ModelBlock p0, moom.I2 p1, boolean p2) throws Throwable {
    java.lang.Object forestValue1083_33_0;
    net.minecraft.client.resources.model.IBakedModel forestValue1083_111_0;
    int spill1083_0;
    moom.bs spill1083_1;
    net.minecraft.client.resources.model.IBakedModel spill1083_2;
    long life4_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life7_15;
    net.minecraft.client.resources.model.SimpleBakedModel$Builder life8_22;
    int life6_23;
    java.util.Iterator life9_27;
    net.minecraft.client.renderer.block.model.BlockPart life10_34;
    java.util.Iterator life11_39;
    moom.bs life12_46;
    net.minecraft.client.renderer.block.model.BlockPartFace life13_52;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life14_64;
    forest_join_111: {
    forest_join_104: {
    life4_3 = (__fieldRead1083_0() ^ 11195263637512L);
    spill1083_0 = __call1083_1();
    life7_15 = __cast1083_5(__call1083_4(__fieldRead1083_2(receiver), new moom.DD(__call1083_3(p0, "particle"))));
    life8_22 = __call1083_6(new net.minecraft.client.resources.model.SimpleBakedModel$Builder(p0), life7_15);
    life6_23 = spill1083_0;
    life9_27 = __call1083_8(__call1083_7(p0));
    forest_cycle_28: while (true) {
    forest_join_102: {
    if (!(__call1083_9(life9_27))) {
        break forest_join_104;
    }
    forestValue1083_33_0 = __call1083_10(life9_27);
    forest_cycle_33: while (true) {
    life10_34 = __cast1083_11(forestValue1083_33_0);
    life11_39 = __call1083_14(__call1083_13(__fieldRead1083_12(life10_34)));
    forest_cycle_40: while (true) {
    forest_join_100: {
    forest_join_89: {
    forest_join_87: {
    if (!(__call1083_15(life11_39))) {
        break forest_join_102;
    }
    life12_46 = __cast1083_17(__call1083_16(life11_39));
    life13_52 = __cast1083_20(__call1083_19(__fieldRead1083_18(life10_34), life12_46));
    life14_64 = __cast1083_25(__call1083_24(__fieldRead1083_21(receiver), new moom.DD(__call1083_23(p0, __fieldRead1083_22(life13_52)))));
    if (!((life6_23 != 0))) {
        break forest_join_87;
    }
    spill1083_1 = __fieldRead1083_26(life13_52);
    if (!((life6_23 != 0))) {
        forestValue1083_33_0 = spill1083_1;
        continue forest_cycle_33;
    }
    if (!((spill1083_1 != null))) {
        break forest_join_89;
    }
    __call1083_30(life8_22, __call1083_28(p1, __fieldRead1083_27(life13_52)), __call1083_29(receiver, life10_34, life13_52, life14_64, life12_46, p1, p2));
    }
    if (!((life6_23 == 0))) {
        break forest_join_100;
    }
    }
    __call1083_32(life8_22, __call1083_31(receiver, life10_34, life13_52, life14_64, life12_46, p1, p2));
    }
    if (!((life6_23 == 0))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    break forest_cycle_33;
    }
    }
    if (!((life6_23 == 0))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    }
    spill1083_2 = __call1083_33(life8_22);
    if (!((__call1083_34() != null))) {
        forestValue1083_111_0 = spill1083_2;
        break forest_join_111;
    }
    life6_23 += 1;
    __call1083_35(life6_23);
    forestValue1083_111_0 = spill1083_2;
    }
    return forestValue1083_111_0;
}
public static net.minecraft.client.resources.model.IBakedModel h1083_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108300_0(p0);
}
public static net.minecraft.client.resources.model.IBakedModel h1083_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108301_0(p0);
}
public static net.minecraft.client.resources.model.IBakedModel h1083_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108302_0(p0);
}
public static net.minecraft.client.resources.model.IBakedModel h1083_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108303_0(p0);
}
private static native long __fieldRead1083_0() throws Throwable;
private static native int __call1083_1() throws Throwable;
private static native java.util.Map __fieldRead1083_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.String __call1083_3(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call1083_4(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast1083_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.model.SimpleBakedModel$Builder __call1083_6(net.minecraft.client.resources.model.SimpleBakedModel$Builder a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.List __call1083_7(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native java.util.Iterator __call1083_8(java.util.List a0) throws Throwable;
private static native boolean __call1083_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1083_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.BlockPart __cast1083_11(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1083_12(net.minecraft.client.renderer.block.model.BlockPart a0) throws Throwable;
private static native java.util.Set __call1083_13(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1083_14(java.util.Set a0) throws Throwable;
private static native boolean __call1083_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1083_16(java.util.Iterator a0) throws Throwable;
private static native moom.bs __cast1083_17(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1083_18(net.minecraft.client.renderer.block.model.BlockPart a0) throws Throwable;
private static native java.lang.Object __call1083_19(java.util.Map a0, moom.bs a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.BlockPartFace __cast1083_20(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1083_21(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.String __fieldRead1083_22(net.minecraft.client.renderer.block.model.BlockPartFace a0) throws Throwable;
private static native java.lang.String __call1083_23(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call1083_24(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast1083_25(java.lang.Object a0) throws Throwable;
private static native moom.bs __fieldRead1083_26(net.minecraft.client.renderer.block.model.BlockPartFace a0) throws Throwable;
private static native moom.bs __fieldRead1083_27(net.minecraft.client.renderer.block.model.BlockPartFace a0) throws Throwable;
private static native moom.bs __call1083_28(moom.I2 a0, moom.bs a1) throws Throwable;
private static native moom.lC __call1083_29(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.BlockPart a1, net.minecraft.client.renderer.block.model.BlockPartFace a2, net.minecraft.client.renderer.texture.TextureAtlasSprite a3, moom.bs a4, moom.I2 a5, boolean a6) throws Throwable;
private static native net.minecraft.client.resources.model.SimpleBakedModel$Builder __call1083_30(net.minecraft.client.resources.model.SimpleBakedModel$Builder a0, moom.bs a1, moom.lC a2) throws Throwable;
private static native moom.lC __call1083_31(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.BlockPart a1, net.minecraft.client.renderer.block.model.BlockPartFace a2, net.minecraft.client.renderer.texture.TextureAtlasSprite a3, moom.bs a4, moom.I2 a5, boolean a6) throws Throwable;
private static native net.minecraft.client.resources.model.SimpleBakedModel$Builder __call1083_32(net.minecraft.client.resources.model.SimpleBakedModel$Builder a0, moom.lC a1) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1083_33(net.minecraft.client.resources.model.SimpleBakedModel$Builder a0) throws Throwable;
private static native java.lang.String[] __call1083_34() throws Throwable;
private static native void __call1083_35(int a0) throws Throwable;
private static native java.lang.Exception __call3108300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108302_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108303_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_e78953c3f5939a37b9d3(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.item.Item a1) throws E;
private static final class __SourceHandler_e78953c3f5939a37b9d3 {

public static java.util.List f1436(net.minecraft.client.resources.model.ModelBakery receiver, net.minecraft.item.Item p0) throws Throwable {
    java.util.List forwardValue1436_24_0;
    int spill1436_0;
    java.util.List spill1436_1;
    long life2_3;
    java.util.List life5_10;
    int life4_11;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead1436_0() ^ 117534028163591L);
    spill1436_0 = __call1436_1();
    life5_10 = __cast1436_4(__call1436_3(__fieldRead1436_2(receiver), p0));
    life4_11 = spill1436_0;
    spill1436_1 = life5_10;
    if (!((life4_11 == 0))) {
        forwardValue1436_24_0 = spill1436_1;
        break forward_join_24;
    }
    if (!((spill1436_1 == null))) {
        break forward_join_23;
    }
    life5_10 = __call1436_9(__call1436_8(__cast1436_7(__call1436_6(__fieldRead1436_5(), p0))));
    }
    forwardValue1436_24_0 = life5_10;
    }
    return forwardValue1436_24_0;
}
public static void h1436_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143600_0(p0);
}
private static native long __fieldRead1436_0() throws Throwable;
private static native int __call1436_1() throws Throwable;
private static native java.util.Map __fieldRead1436_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1436_3(java.util.Map a0, net.minecraft.item.Item a1) throws Throwable;
private static native java.util.List __cast1436_4(java.lang.Object a0) throws Throwable;
private static native moom.DB __fieldRead1436_5() throws Throwable;
private static native java.lang.Object __call1436_6(moom.DB a0, net.minecraft.item.Item a1) throws Throwable;
private static native moom.DD __cast1436_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1436_8(moom.DD a0) throws Throwable;
private static native java.util.List __call1436_9(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1143600_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_606d5994ebe8bb7d8353(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws E;
private static final class __SourceHandler_606d5994ebe8bb7d8353 {

public static boolean f1437(net.minecraft.client.resources.model.ModelBakery receiver, net.minecraft.client.renderer.block.model.ModelBlock p0) throws Throwable {
    net.minecraft.client.renderer.block.model.ModelBlock forwardValue1437_14_0;
    net.minecraft.client.renderer.block.model.ModelBlock forwardValue1437_22_0;
    net.minecraft.client.renderer.block.model.ModelBlock forwardValue1437_22_1;
    net.minecraft.client.renderer.block.model.ModelBlock forwardValue1437_27_0;
    net.minecraft.client.renderer.block.model.ModelBlock forwardValue1437_27_1;
    int forwardValue1437_31_0;
    net.minecraft.client.renderer.block.model.ModelBlock spill1437_0;
    net.minecraft.client.renderer.block.model.ModelBlock spill1437_1;
    net.minecraft.client.renderer.block.model.ModelBlock spill1437_2;
    long life2_3;
    int life4_5;
    net.minecraft.client.renderer.block.model.ModelBlock life5_19;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    forward_join_27: {
    forward_join_22: {
    forward_join_14: {
    forward_join_12: {
    life2_3 = (__fieldRead1437_0() ^ 134413892859460L);
    life4_5 = __call1437_1();
    spill1437_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1437_14_0 = spill1437_0;
        break forward_join_14;
    }
    if (!((spill1437_0 == null))) {
        break forward_join_12;
    }
    return __integerCategory1437_2(0);
    }
    forwardValue1437_14_0 = __call1437_3(p0);
    }
    life5_19 = forwardValue1437_14_0;
    spill1437_1 = life5_19;
    spill1437_2 = __fieldRead1437_4();
    if (!((life4_5 != 0))) {
        forwardValue1437_22_0 = spill1437_1;
        forwardValue1437_22_1 = spill1437_2;
        break forward_join_22;
    }
    if (!((spill1437_1 != spill1437_2))) {
        break forward_join_28;
    }
    forwardValue1437_22_0 = life5_19;
    forwardValue1437_22_1 = __fieldRead1437_5();
    }
    if (!((life4_5 != 0))) {
        forwardValue1437_27_0 = forwardValue1437_22_0;
        forwardValue1437_27_1 = forwardValue1437_22_1;
        break forward_join_27;
    }
    if (!((forwardValue1437_22_0 != forwardValue1437_22_1))) {
        break forward_join_28;
    }
    forwardValue1437_27_0 = life5_19;
    forwardValue1437_27_1 = __fieldRead1437_6();
    }
    if (!((forwardValue1437_27_0 == forwardValue1437_27_1))) {
        break forward_join_30;
    }
    }
    forwardValue1437_31_0 = 1;
    break forward_join_31;
    }
    forwardValue1437_31_0 = 0;
    }
    return __integerCategory1437_7(forwardValue1437_31_0);
}
public static void h1437_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143700_0(p0);
}
public static void h1437_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143701_0(p0);
}
public static void h1437_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143702_0(p0);
}
public static void h1437_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143703_0(p0);
}
public static void h1437_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143704_0(p0);
}
public static void h1437_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143705_0(p0);
}
public static void h1437_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143706_0(p0);
}
private static native long __fieldRead1437_0() throws Throwable;
private static native int __call1437_1() throws Throwable;
private static native boolean __integerCategory1437_2(int value) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1437_3(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1437_4() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1437_5() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1437_6() throws Throwable;
private static native boolean __integerCategory1437_7(int value) throws Throwable;
private static native java.lang.Exception __call1143700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143701_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143702_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143703_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143704_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143705_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143706_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.block.model.ModelBlockDefinition __sourceHandlerCall_86273df2d3ce7b42c873(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws E;
private static final class __SourceHandler_86273df2d3ce7b42c873 {

public static net.minecraft.client.renderer.block.model.ModelBlockDefinition f627(net.minecraft.client.resources.model.ModelBakery receiver, moom.DD p0) throws Throwable {
    net.minecraft.client.renderer.block.model.ModelBlockDefinition forestValue627_69_0;
    int spill627_0;
    net.minecraft.client.renderer.block.model.ModelBlockDefinition spill627_1;
    long life2_3;
    moom.DD life5_8;
    net.minecraft.client.renderer.block.model.ModelBlockDefinition life6_14;
    int life4_15;
    java.util.ArrayList life7_22;
    java.util.Iterator life8_28;
    net.minecraft.client.resources.IResource life9_35;
    java.lang.Object life10_37;
    java.io.InputStream life10_40;
    net.minecraft.client.renderer.block.model.ModelBlockDefinition life11_47;
    forest_join_69: {
    forest_join_68: {
    forest_join_62: {
    forest_join_57: {
    life2_3 = (__fieldRead627_0() ^ 54443373949288L);
    spill627_0 = __call627_1();
    life5_8 = __call627_2(receiver, p0);
    life6_14 = __cast627_5(__call627_4(__fieldRead627_3(receiver), life5_8));
    life4_15 = spill627_0;
    spill627_1 = life6_14;
    if (!((life4_15 != 0))) {
        forestValue627_69_0 = spill627_1;
        break forest_join_69;
    }
    if (!((spill627_1 == null))) {
        break forest_join_68;
    }
    life7_22 = __call627_6();
    life8_28 = __call627_9(__call627_8(__fieldRead627_7(receiver), life5_8));
    forest_cycle_28: while (true) {
    if (!(__call627_10(life8_28))) {
        break forest_join_57;
    }
    life9_35 = __cast627_12(__call627_11(life8_28));
    life10_37 = null;
    life10_40 = __call627_13(life9_35);
    life11_47 = __call627_15(new java.io.InputStreamReader(life10_40, __fieldRead627_14()));
    __call627_16(life7_22, life11_47);
    __call627_17(life10_40);
    if (!((life4_15 != 0))) {
        break forest_join_62;
    }
    if (!((life4_15 == 0))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    }
    life6_14 = new net.minecraft.client.renderer.block.model.ModelBlockDefinition((java.util.List<net.minecraft.client.renderer.block.model.ModelBlockDefinition>)(life7_22));
    }
    __call627_19(__fieldRead627_18(receiver), life5_8, life6_14);
    }
    forestValue627_69_0 = life6_14;
    }
    return forestValue627_69_0;
}
public static net.minecraft.client.renderer.block.model.ModelBlockDefinition h627_0(java.lang.Exception p0) throws Throwable {
    throw __call3062700_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlockDefinition h627_1(java.lang.Exception p0, moom.DD p1, net.minecraft.client.resources.IResource p2) throws Throwable {
    java.lang.Exception life3_2;
    life3_2 = p0;
    throw new java.lang.RuntimeException(__invokedynamic3062701_2(p1, __call3062701_0(p2), __call3062701_1(p2)), life3_2);
}
public static net.minecraft.client.renderer.block.model.ModelBlockDefinition h627_2(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3062702_0(p1);
    throw life2_2;
}
public static net.minecraft.client.renderer.block.model.ModelBlockDefinition h627_3(java.io.IOException p0, moom.DD p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    throw new java.lang.RuntimeException(__invokedynamic3062703_0(p1), life2_2);
}
private static native long __fieldRead627_0() throws Throwable;
private static native int __call627_1() throws Throwable;
private static native moom.DD __call627_2(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead627_3(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call627_4(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlockDefinition __cast627_5(java.lang.Object a0) throws Throwable;
private static native java.util.ArrayList __call627_6() throws Throwable;
private static native moom.oR __fieldRead627_7(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.List __call627_8(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.util.Iterator __call627_9(java.util.List a0) throws Throwable;
private static native boolean __call627_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call627_11(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __cast627_12(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call627_13(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead627_14() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlockDefinition __call627_15(java.io.InputStreamReader a0) throws Throwable;
private static native boolean __call627_16(java.util.ArrayList a0, net.minecraft.client.renderer.block.model.ModelBlockDefinition a1) throws Throwable;
private static native void __call627_17(java.io.InputStream a0) throws Throwable;
private static native java.util.Map __fieldRead627_18(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call627_19(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlockDefinition a2) throws Throwable;
private static native java.lang.Exception __call3062700_0(java.lang.Exception a0) throws Throwable;
private static native moom.DD __call3062701_0(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.lang.String __call3062701_1(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.lang.String __invokedynamic3062701_2(moom.DD a0, moom.DD a1, java.lang.String a2) throws Throwable;
private static native void __call3062702_0(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic3062703_0(moom.DD a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.block.model.ModelBlock __sourceHandlerCall_6bcc0e01ca0e18761fce(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws E;
private static final class __SourceHandler_6bcc0e01ca0e18761fce {

public static net.minecraft.client.renderer.block.model.ModelBlock f57(net.minecraft.client.resources.model.ModelBakery receiver, moom.DD p0) throws Throwable {
    int forestValue57_20_0;
    int forestValue57_28_0;
    int forestValue57_36_0;
    int forestValue57_46_0;
    java.lang.String forestValue57_49_0;
    java.lang.String forestValue57_49_1;
    int spill57_0;
    boolean spill57_1;
    java.lang.String spill57_2;
    java.lang.String spill57_3;
    long life2_3;
    java.lang.String life5_7;
    int life4_8;
    java.lang.String life7_70;
    java.lang.String life8_75;
    java.io.Reader life6_89;
    net.minecraft.client.resources.IResource life7_101;
    net.minecraft.client.renderer.block.model.ModelBlock life8_112;
    net.minecraft.client.renderer.block.model.ModelBlock life7_118;
    java.lang.String life9_122;
    forest_join_88: {
    forest_join_72: {
    forest_join_65: {
    forest_join_49: {
    forest_join_46: {
    forest_join_41: {
    forest_join_36: {
    forest_join_33: {
    forest_join_28: {
    forest_join_25: {
    forest_join_20: {
    forest_join_17: {
    life2_3 = (__fieldRead57_0() ^ 40502755338255L);
    spill57_0 = __call57_1();
    life5_7 = __call57_2(p0);
    life4_8 = spill57_0;
    spill57_1 = __call57_3("builtin/generated", life5_7);
    if (!((life4_8 == 0))) {
        forestValue57_20_0 = __integerCategory57_4(spill57_1);
        break forest_join_20;
    }
    if (!(spill57_1)) {
        break forest_join_17;
    }
    return __fieldRead57_5();
    }
    forestValue57_20_0 = __integerCategory57_7(__call57_6("builtin/compass", life5_7));
    }
    if (!((life4_8 == 0))) {
        forestValue57_28_0 = forestValue57_20_0;
        break forest_join_28;
    }
    if (!((forestValue57_20_0 != 0))) {
        break forest_join_25;
    }
    return __fieldRead57_8();
    }
    forestValue57_28_0 = __integerCategory57_10(__call57_9("builtin/clock", life5_7));
    }
    if (!((life4_8 == 0))) {
        forestValue57_36_0 = forestValue57_28_0;
        break forest_join_36;
    }
    if (!((forestValue57_28_0 != 0))) {
        break forest_join_33;
    }
    return __fieldRead57_11();
    }
    forestValue57_36_0 = __integerCategory57_13(__call57_12("builtin/entity", life5_7));
    }
    if (!((life4_8 == 0))) {
        forestValue57_46_0 = forestValue57_36_0;
        break forest_join_46;
    }
    if (!((forestValue57_36_0 != 0))) {
        break forest_join_41;
    }
    return __fieldRead57_14();
    }
    spill57_2 = life5_7;
    spill57_3 = "builtin/";
    if (!((life4_8 == 0))) {
        forestValue57_49_0 = spill57_2;
        forestValue57_49_1 = spill57_3;
        break forest_join_49;
    }
    forestValue57_46_0 = __integerCategory57_16(__call57_15(spill57_2, spill57_3));
    }
    if (!((forestValue57_46_0 != 0))) {
        break forest_join_72;
    }
    forestValue57_49_0 = life5_7;
    forestValue57_49_1 = "builtin/";
    }
    life7_70 = __call57_18(forestValue57_49_0, __call57_17(forestValue57_49_1));
    life8_75 = __cast57_21(__call57_20(__fieldRead57_19(), life7_70));
    if (!((life8_75 == null))) {
        break forest_join_65;
    }
    throw new java.io.FileNotFoundException(__call57_22(p0));
    }
    life6_89 = new java.io.StringReader(life8_75);
    if (!((life4_8 != 0))) {
        break forest_join_88;
    }
    }
    p0 = __call57_23(receiver, p0);
    life7_101 = __call57_25(__fieldRead57_24(receiver), p0);
    life6_89 = new java.io.InputStreamReader(__call57_26(life7_101), __fieldRead57_27());
    }
    life8_112 = __call57_28(life6_89);
    __fieldWrite57_30(life8_112, __call57_29(p0));
    life7_118 = life8_112;
    life9_122 = __call57_32(__call57_31(p0));
    __call57_33(life8_112, life9_122);
    __call57_34(life6_89);
    return life7_118;
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_0(java.io.IOException p0) throws Throwable {
    throw __call3005700_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_1(java.io.IOException p0) throws Throwable {
    throw __call3005701_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_2(java.io.IOException p0) throws Throwable {
    throw __call3005702_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_3(java.io.IOException p0) throws Throwable {
    throw __call3005703_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_4(java.io.IOException p0) throws Throwable {
    throw __call3005704_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_5(java.io.IOException p0) throws Throwable {
    throw __call3005705_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_6(java.io.IOException p0) throws Throwable {
    throw __call3005706_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_7(java.io.IOException p0) throws Throwable {
    throw __call3005707_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_8(java.io.IOException p0) throws Throwable {
    throw __call3005708_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_9(java.io.IOException p0) throws Throwable {
    throw __call3005709_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_10(java.io.IOException p0) throws Throwable {
    throw __call3005710_0(p0);
}
public static net.minecraft.client.renderer.block.model.ModelBlock h57_11(java.lang.Throwable p0, java.io.Reader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3005711_0(p1);
    throw life2_2;
}
private static native long __fieldRead57_0() throws Throwable;
private static native int __call57_1() throws Throwable;
private static native java.lang.String __call57_2(moom.DD a0) throws Throwable;
private static native boolean __call57_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory57_4(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead57_5() throws Throwable;
private static native boolean __call57_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory57_7(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead57_8() throws Throwable;
private static native boolean __call57_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory57_10(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead57_11() throws Throwable;
private static native boolean __call57_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory57_13(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead57_14() throws Throwable;
private static native boolean __call57_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory57_16(boolean value) throws Throwable;
private static native int __call57_17(java.lang.String a0) throws Throwable;
private static native java.lang.String __call57_18(java.lang.String a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead57_19() throws Throwable;
private static native java.lang.Object __call57_20(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast57_21(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call57_22(moom.DD a0) throws Throwable;
private static native moom.DD __call57_23(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native moom.oR __fieldRead57_24(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call57_25(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call57_26(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead57_27() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call57_28(java.io.Reader a0) throws Throwable;
private static native java.lang.String __call57_29(moom.DD a0) throws Throwable;
private static native void __fieldWrite57_30(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call57_31(moom.DD a0) throws Throwable;
private static native java.lang.String __call57_32(java.lang.String a0) throws Throwable;
private static native void __call57_33(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native void __call57_34(java.io.Reader a0) throws Throwable;
private static native java.lang.Exception __call3005700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005705_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005706_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005707_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005708_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005709_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3005710_0(java.io.IOException a0) throws Throwable;
private static native void __call3005711_0(java.io.Reader a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Set __sourceHandlerCall_f02ebeb717d1618e5920(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_f02ebeb717d1618e5920 {

public static java.util.Set f1079(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    java.util.Iterator forestValue1079_14_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1079_29_0;
    moom.DD forestValue1079_77_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1079_84_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1079_84_1;
    int forestValue1079_97_0;
    moom.DD forestValue1079_139_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1079_146_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1079_146_1;
    int forestValue1079_159_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1079_163_0;
    int forestValue1079_179_0;
    int spill1079_0;
    boolean spill1079_1;
    net.minecraft.client.renderer.block.model.ModelBlock spill1079_2;
    net.minecraft.client.renderer.block.model.ModelBlock spill1079_3;
    moom.DD spill1079_4;
    boolean spill1079_5;
    boolean spill1079_6;
    net.minecraft.client.renderer.block.model.ModelBlock spill1079_7;
    net.minecraft.client.renderer.block.model.ModelBlock spill1079_8;
    moom.DD spill1079_9;
    boolean spill1079_10;
    java.util.Iterator spill1079_11;
    long life1_3;
    java.util.HashSet life4_6;
    int life3_7;
    java.util.Iterator life5_12;
    moom.DD life6_22;
    net.minecraft.client.renderer.block.model.ModelBlock life7_28;
    java.util.Iterator life8_57;
    java.lang.String life9_66;
    moom.DD life10_73;
    java.util.Iterator life8_142;
    java.lang.String life9_151;
    moom.DD life10_158;
    java.util.Iterator life8_241;
    net.minecraft.client.renderer.block.model.BlockPart life9_250;
    java.util.Iterator life10_258;
    net.minecraft.client.renderer.block.model.BlockPartFace life11_267;
    moom.DD life12_275;
    forest_join_225: {
    life1_3 = (__fieldRead1079_0() ^ 25627275716045L);
    spill1079_0 = __call1079_1();
    life4_6 = __call1079_2();
    life3_7 = spill1079_0;
    life5_12 = __call1079_5(__call1079_4(__fieldRead1079_3(receiver)));
    forest_cycle_13: while (true) {
    forest_join_223: {
    forestValue1079_14_0 = life5_12;
    forest_cycle_14: while (true) {
    forest_join_179: {
    forest_join_176: {
    forest_join_174: {
    forest_join_101: {
    if (!(__call1079_6(forestValue1079_14_0))) {
        break forest_join_225;
    }
    life6_22 = __cast1079_8(__call1079_7(life5_12));
    life7_28 = __cast1079_11(__call1079_10(__fieldRead1079_9(receiver), life6_22));
    if (!((life3_7 != 0))) {
        break forest_join_101;
    }
    forestValue1079_29_0 = life7_28;
    forest_cycle_29: while (true) {
    if (!((forestValue1079_29_0 != null))) {
        break forest_join_223;
    }
    __call1079_13(life4_6, new moom.DD(__call1079_12(life7_28, "particle")));
    spill1079_1 = __call1079_14(receiver, life7_28);
    if (!((life3_7 != 0))) {
        forestValue1079_179_0 = __integerCategory1079_15(spill1079_1);
        break forest_join_179;
    }
    if (!(spill1079_1)) {
        break forest_join_176;
    }
    life8_57 = __call1079_17(__fieldRead1079_16());
    forest_cycle_48: while (true) {
    forest_join_97: {
    forest_join_94: {
    forest_join_84: {
    forest_join_81: {
    forest_join_77: {
    if (!(__call1079_18(life8_57))) {
        break forest_join_174;
    }
    life9_66 = __cast1079_20(__call1079_19(life8_57));
    life10_73 = new moom.DD(__call1079_21(life7_28, life9_66));
    spill1079_2 = __call1079_22(life7_28);
    if (!((life3_7 != 0))) {
        forestValue1079_29_0 = spill1079_2;
        continue forest_cycle_29;
    }
    spill1079_3 = __fieldRead1079_23();
    if (!((life3_7 != 0))) {
        forestValue1079_84_0 = spill1079_2;
        forestValue1079_84_1 = spill1079_3;
        break forest_join_84;
    }
    if (!((spill1079_2 == spill1079_3))) {
        break forest_join_81;
    }
    spill1079_4 = __fieldRead1079_24();
    if (!((life3_7 != 0))) {
        forestValue1079_77_0 = spill1079_4;
        break forest_join_77;
    }
    if (!((!__call1079_25(spill1079_4, life10_73)))) {
        break forest_join_81;
    }
    forestValue1079_77_0 = life10_73;
    }
    __call1079_27(__call1079_26(forestValue1079_77_0));
    if (!((life3_7 == 0))) {
        break forest_join_94;
    }
    }
    forestValue1079_84_0 = __call1079_28(life7_28);
    forestValue1079_84_1 = __fieldRead1079_29();
    }
    if (!((forestValue1079_84_0 == forestValue1079_84_1))) {
        break forest_join_94;
    }
    spill1079_5 = __call1079_31(__fieldRead1079_30(), life10_73);
    if (!((life3_7 != 0))) {
        forestValue1079_97_0 = __integerCategory1079_32(spill1079_5);
        break forest_join_97;
    }
    if (!((!spill1079_5))) {
        break forest_join_94;
    }
    __call1079_34(__call1079_33(life10_73));
    }
    forestValue1079_97_0 = __integerCategory1079_36(__call1079_35(life4_6, life10_73));
    }
    __discardScalar1079_37(forestValue1079_97_0);
    if (!((life3_7 == 0))) {
        continue forest_cycle_48;
    }
    break forest_cycle_48;
    }
    break forest_cycle_29;
    }
    break forest_join_174;
    }
    forest_cycle_101: while (true) {
    forest_join_163: {
    spill1079_6 = __call1079_38(receiver, life7_28);
    if (!((life3_7 != 0))) {
        forestValue1079_179_0 = __integerCategory1079_39(spill1079_6);
        break forest_join_179;
    }
    if (!(spill1079_6)) {
        break forest_join_176;
    }
    life8_142 = __call1079_41(__fieldRead1079_40());
    forest_cycle_110: while (true) {
    forest_join_159: {
    forest_join_156: {
    forest_join_146: {
    forest_join_143: {
    forest_join_139: {
    if (!(__call1079_42(life8_142))) {
        break forest_join_174;
    }
    life9_151 = __cast1079_44(__call1079_43(life8_142));
    life10_158 = new moom.DD(__call1079_45(life7_28, life9_151));
    spill1079_7 = __call1079_46(life7_28);
    if (!((life3_7 != 0))) {
        forestValue1079_163_0 = spill1079_7;
        break forest_join_163;
    }
    spill1079_8 = __fieldRead1079_47();
    if (!((life3_7 != 0))) {
        forestValue1079_146_0 = spill1079_7;
        forestValue1079_146_1 = spill1079_8;
        break forest_join_146;
    }
    if (!((spill1079_7 == spill1079_8))) {
        break forest_join_143;
    }
    spill1079_9 = __fieldRead1079_48();
    if (!((life3_7 != 0))) {
        forestValue1079_139_0 = spill1079_9;
        break forest_join_139;
    }
    if (!((!__call1079_49(spill1079_9, life10_158)))) {
        break forest_join_143;
    }
    forestValue1079_139_0 = life10_158;
    }
    __call1079_51(__call1079_50(forestValue1079_139_0));
    if (!((life3_7 == 0))) {
        break forest_join_156;
    }
    }
    forestValue1079_146_0 = __call1079_52(life7_28);
    forestValue1079_146_1 = __fieldRead1079_53();
    }
    if (!((forestValue1079_146_0 == forestValue1079_146_1))) {
        break forest_join_156;
    }
    spill1079_10 = __call1079_55(__fieldRead1079_54(), life10_158);
    if (!((life3_7 != 0))) {
        forestValue1079_159_0 = __integerCategory1079_56(spill1079_10);
        break forest_join_159;
    }
    if (!((!spill1079_10))) {
        break forest_join_156;
    }
    __call1079_58(__call1079_57(life10_158));
    }
    forestValue1079_159_0 = __integerCategory1079_60(__call1079_59(life4_6, life10_158));
    }
    __discardScalar1079_61(forestValue1079_159_0);
    if (!((life3_7 == 0))) {
        continue forest_cycle_110;
    }
    break forest_cycle_110;
    }
    break forest_join_174;
    }
    if (!((forestValue1079_163_0 != null))) {
        break forest_join_223;
    }
    __call1079_63(life4_6, new moom.DD(__call1079_62(life7_28, "particle")));
    continue forest_cycle_101;
    }
    }
    if (!((life3_7 == 0))) {
        break forest_join_223;
    }
    }
    forestValue1079_179_0 = __integerCategory1079_65(__call1079_64(receiver, life7_28));
    }
    if (!((forestValue1079_179_0 == 0))) {
        break forest_join_223;
    }
    life8_241 = __call1079_67(__call1079_66(life7_28));
    forest_cycle_184: while (true) {
    forest_join_221: {
    if (!(__call1079_68(life8_241))) {
        break forest_join_223;
    }
    life9_250 = __cast1079_70(__call1079_69(life8_241));
    spill1079_11 = __call1079_73(__call1079_72(__fieldRead1079_71(life9_250)));
    if (!((life3_7 != 0))) {
        forestValue1079_14_0 = spill1079_11;
        continue forest_cycle_14;
    }
    life10_258 = spill1079_11;
    forest_cycle_198: while (true) {
    if (!(__call1079_74(life10_258))) {
        break forest_join_221;
    }
    life11_267 = __cast1079_76(__call1079_75(life10_258));
    life12_275 = new moom.DD(__call1079_78(life7_28, __fieldRead1079_77(life11_267)));
    __call1079_79(life4_6, life12_275);
    if (!((life3_7 != 0))) {
        continue forest_cycle_184;
    }
    if (!((life3_7 == 0))) {
        continue forest_cycle_198;
    }
    break forest_cycle_198;
    }
    }
    if (!((life3_7 == 0))) {
        continue forest_cycle_184;
    }
    break forest_cycle_184;
    }
    break forest_cycle_14;
    }
    }
    if (!((life3_7 == 0))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    return life4_6;
}
public static java.util.Set h1079_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107900_0(p0);
}
public static java.util.Set h1079_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107901_0(p0);
}
public static java.util.Set h1079_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107902_0(p0);
}
public static java.util.Set h1079_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107903_0(p0);
}
public static java.util.Set h1079_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107904_0(p0);
}
public static java.util.Set h1079_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107905_0(p0);
}
public static java.util.Set h1079_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107906_0(p0);
}
public static java.util.Set h1079_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107907_0(p0);
}
public static java.util.Set h1079_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107908_0(p0);
}
public static java.util.Set h1079_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107909_0(p0);
}
public static java.util.Set h1079_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107910_0(p0);
}
private static native long __fieldRead1079_0() throws Throwable;
private static native int __call1079_1() throws Throwable;
private static native java.util.HashSet __call1079_2() throws Throwable;
private static native java.util.Map __fieldRead1079_3(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Collection __call1079_4(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1079_5(java.util.Collection a0) throws Throwable;
private static native boolean __call1079_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1079_7(java.util.Iterator a0) throws Throwable;
private static native moom.DD __cast1079_8(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1079_9(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1079_10(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1079_11(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1079_12(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native boolean __call1079_13(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native boolean __call1079_14(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native int __integerCategory1079_15(boolean value) throws Throwable;
private static native java.util.List __fieldRead1079_16() throws Throwable;
private static native java.util.Iterator __call1079_17(java.util.List a0) throws Throwable;
private static native boolean __call1079_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1079_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1079_20(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1079_21(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1079_22(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1079_23() throws Throwable;
private static native moom.DD __fieldRead1079_24() throws Throwable;
private static native boolean __call1079_25(moom.DD a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call1079_26(moom.DD a0) throws Throwable;
private static native void __call1079_27(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1079_28(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1079_29() throws Throwable;
private static native moom.DD __fieldRead1079_30() throws Throwable;
private static native boolean __call1079_31(moom.DD a0, moom.DD a1) throws Throwable;
private static native int __integerCategory1079_32(boolean value) throws Throwable;
private static native java.lang.String __call1079_33(moom.DD a0) throws Throwable;
private static native void __call1079_34(java.lang.String a0) throws Throwable;
private static native boolean __call1079_35(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native int __integerCategory1079_36(boolean value) throws Throwable;
private static native void __discardScalar1079_37(int a0) throws Throwable;
private static native boolean __call1079_38(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native int __integerCategory1079_39(boolean value) throws Throwable;
private static native java.util.List __fieldRead1079_40() throws Throwable;
private static native java.util.Iterator __call1079_41(java.util.List a0) throws Throwable;
private static native boolean __call1079_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1079_43(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1079_44(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1079_45(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1079_46(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1079_47() throws Throwable;
private static native moom.DD __fieldRead1079_48() throws Throwable;
private static native boolean __call1079_49(moom.DD a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call1079_50(moom.DD a0) throws Throwable;
private static native void __call1079_51(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1079_52(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1079_53() throws Throwable;
private static native moom.DD __fieldRead1079_54() throws Throwable;
private static native boolean __call1079_55(moom.DD a0, moom.DD a1) throws Throwable;
private static native int __integerCategory1079_56(boolean value) throws Throwable;
private static native java.lang.String __call1079_57(moom.DD a0) throws Throwable;
private static native void __call1079_58(java.lang.String a0) throws Throwable;
private static native boolean __call1079_59(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native int __integerCategory1079_60(boolean value) throws Throwable;
private static native void __discardScalar1079_61(int a0) throws Throwable;
private static native java.lang.String __call1079_62(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native boolean __call1079_63(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native boolean __call1079_64(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native int __integerCategory1079_65(boolean value) throws Throwable;
private static native java.util.List __call1079_66(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native java.util.Iterator __call1079_67(java.util.List a0) throws Throwable;
private static native boolean __call1079_68(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1079_69(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.BlockPart __cast1079_70(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1079_71(net.minecraft.client.renderer.block.model.BlockPart a0) throws Throwable;
private static native java.util.Collection __call1079_72(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1079_73(java.util.Collection a0) throws Throwable;
private static native boolean __call1079_74(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1079_75(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.BlockPartFace __cast1079_76(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1079_77(net.minecraft.client.renderer.block.model.BlockPartFace a0) throws Throwable;
private static native java.lang.String __call1079_78(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native boolean __call1079_79(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call3107900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107902_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107903_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107904_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107905_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107906_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107907_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107908_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107909_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107910_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_6f92791b8f159fbf6787(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws E;
private static final class __SourceHandler_6f92791b8f159fbf6787 {

public static moom.DD f1439(net.minecraft.client.resources.model.ModelBakery receiver, moom.DD p0) throws Throwable {
    int forwardValue1439_35_0;
    int spill1439_0;
    boolean spill1439_1;
    boolean spill1439_2;
    long life2_3;
    moom.DD life5_6;
    int life4_7;
    java.lang.String life6_10;
    forward_join_44: {
    forward_join_35: {
    forward_join_32: {
    life2_3 = (__fieldRead1439_0() ^ 24207238388404L);
    spill1439_0 = __call1439_1();
    life5_6 = p0;
    life4_7 = spill1439_0;
    life6_10 = __call1439_2(p0);
    spill1439_1 = __call1439_3(life6_10, "mcpatcher");
    if (!((life4_7 == 0))) {
        forwardValue1439_35_0 = __integerCategory1439_4(spill1439_1);
        break forward_join_35;
    }
    if (!((!spill1439_1))) {
        break forward_join_32;
    }
    spill1439_2 = __call1439_5(life6_10, "optifine");
    if (!((life4_7 == 0))) {
        forwardValue1439_35_0 = __integerCategory1439_6(spill1439_2);
        break forward_join_35;
    }
    if (!((!spill1439_2))) {
        break forward_join_32;
    }
    return new moom.DD(__call1439_7(p0), __invokedynamic1439_9(__call1439_8(p0)));
    }
    forwardValue1439_35_0 = __integerCategory1439_11(__call1439_10(life6_10, ".json"));
    }
    if (!((forwardValue1439_35_0 == 0))) {
        break forward_join_44;
    }
    life5_6 = new moom.DD(__call1439_12(p0), __invokedynamic1439_13(life6_10));
    }
    return life5_6;
}
public static void h1439_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143900_0(p0);
}
public static void h1439_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143901_0(p0);
}
public static void h1439_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143902_0(p0);
}
public static void h1439_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1143903_0(p0);
}
private static native long __fieldRead1439_0() throws Throwable;
private static native int __call1439_1() throws Throwable;
private static native java.lang.String __call1439_2(moom.DD a0) throws Throwable;
private static native boolean __call1439_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1439_4(boolean value) throws Throwable;
private static native boolean __call1439_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1439_6(boolean value) throws Throwable;
private static native java.lang.String __call1439_7(moom.DD a0) throws Throwable;
private static native java.lang.String __call1439_8(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic1439_9(java.lang.String a0) throws Throwable;
private static native boolean __call1439_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1439_11(boolean value) throws Throwable;
private static native java.lang.String __call1439_12(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic1439_13(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1143900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143902_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1143903_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_28d7b71a18b94a89bd39(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws E;
private static final class __SourceHandler_28d7b71a18b94a89bd39 {

public static boolean f1440(net.minecraft.client.resources.model.ModelBakery receiver, net.minecraft.client.renderer.block.model.ModelBlock p0) throws Throwable {
    net.minecraft.client.renderer.block.model.ModelBlock forwardValue1440_14_0;
    int forwardValue1440_21_0;
    net.minecraft.client.renderer.block.model.ModelBlock spill1440_0;
    long life2_3;
    int life4_5;
    net.minecraft.client.renderer.block.model.ModelBlock life5_19;
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    forward_join_12: {
    life2_3 = (__fieldRead1440_0() ^ 97641508433021L);
    life4_5 = __call1440_1();
    spill1440_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1440_14_0 = spill1440_0;
        break forward_join_14;
    }
    if (!((spill1440_0 == null))) {
        break forward_join_12;
    }
    return __integerCategory1440_2(0);
    }
    forwardValue1440_14_0 = __call1440_3(p0);
    }
    life5_19 = forwardValue1440_14_0;
    if (!((life5_19 == __fieldRead1440_4()))) {
        break forward_join_20;
    }
    forwardValue1440_21_0 = 1;
    break forward_join_21;
    }
    forwardValue1440_21_0 = 0;
    }
    return __integerCategory1440_5(forwardValue1440_21_0);
}
public static void h1440_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1144000_0(p0);
}
public static void h1440_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1144001_0(p0);
}
public static void h1440_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1144002_0(p0);
}
private static native long __fieldRead1440_0() throws Throwable;
private static native int __call1440_1() throws Throwable;
private static native boolean __integerCategory1440_2(int value) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1440_3(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1440_4() throws Throwable;
private static native boolean __integerCategory1440_5(int value) throws Throwable;
private static native java.lang.Exception __call1144000_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1144001_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1144002_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4fe4ad817a721b2addd9(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_4fe4ad817a721b2addd9 {

public static void f1078(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    java.lang.Object forestValue1078_22_0;
    net.minecraft.client.resources.model.ModelBakery forestValue1078_46_0;
    int spill1078_0;
    net.minecraft.client.resources.model.ModelBakery spill1078_1;
    java.lang.Object spill1078_2;
    long life1_3;
    java.util.Iterator life4_9;
    int life3_10;
    moom.DE life5_19;
    java.util.Iterator life6_28;
    moom.l2 life7_37;
    moom.DD life8_40;
    net.minecraft.client.renderer.block.model.ModelBlock life9_58;
    forest_join_59: {
    life1_3 = (__fieldRead1078_0() ^ 21895797559024L);
    spill1078_0 = __call1078_1();
    life4_9 = __call1078_4(__call1078_3(__fieldRead1078_2(receiver)));
    life3_10 = spill1078_0;
    forest_cycle_11: while (true) {
    forest_join_57: {
    if (!(__call1078_5(life4_9))) {
        break forest_join_59;
    }
    life5_19 = __cast1078_7(__call1078_6(life4_9));
    forestValue1078_22_0 = __call1078_9(__fieldRead1078_8(receiver), life5_19);
    forest_cycle_22: while (true) {
    life6_28 = __call1078_12(__call1078_11(__cast1078_10(forestValue1078_22_0)));
    forest_cycle_26: while (true) {
    forest_join_55: {
    forest_join_46: {
    if (!(__call1078_13(life6_28))) {
        break forest_join_57;
    }
    life7_37 = __cast1078_15(__call1078_14(life6_28));
    life8_40 = __call1078_16(life7_37);
    spill1078_1 = receiver;
    if (!((life3_10 == 0))) {
        forestValue1078_46_0 = spill1078_1;
        break forest_join_46;
    }
    spill1078_2 = __call1078_18(__fieldRead1078_17(spill1078_1), life8_40);
    if (!((life3_10 == 0))) {
        forestValue1078_22_0 = spill1078_2;
        continue forest_cycle_22;
    }
    if (!((spill1078_2 == null))) {
        break forest_join_55;
    }
    forestValue1078_46_0 = receiver;
    }
    life9_58 = __call1078_19(forestValue1078_46_0, life8_40);
    __call1078_21(__fieldRead1078_20(receiver), life8_40, life9_58);
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    break forest_cycle_22;
    }
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    return;
}
public static void h1078_0(java.lang.Exception p0) throws Throwable {
    throw __call3107800_0(p0);
}
public static void h1078_1(java.lang.Exception p0, net.minecraft.client.resources.model.ModelBakery p1, int p2, java.util.Iterator p3, moom.DE p4, java.util.Iterator p5, moom.l2 p6, moom.DD p7, net.minecraft.client.renderer.block.model.ModelBlock p8) throws Throwable {
    java.lang.Object forestValue3107801_44_0;
    java.lang.Object forestValue3107801_49_0;
    java.lang.Object forestValue3107801_64_0;
    java.lang.Object forestValue3107801_86_0;
    net.minecraft.client.resources.model.ModelBakery forestValue3107801_88_0;
    net.minecraft.client.resources.model.ModelBakery spill3107801_0;
    java.lang.Object spill3107801_1;
    net.minecraft.client.resources.model.ModelBakery spill3107801_2;
    java.lang.Object spill3107801_3;
    java.lang.Exception life8_2;
    moom.l2 life6_20;
    moom.DD life7_23;
    moom.DE life4_44;
    moom.DE life4_66;
    moom.l2 life6_84;
    net.minecraft.client.renderer.block.model.ModelBlock life8_105;
    forest_join_98: {
    life8_2 = p0;
    __call3107801_2(__fieldRead3107801_0(), __invokedynamic3107801_1(p7, p4), life8_2);
    forest_cycle_8: while (true) {
    forest_join_88: {
    forest_join_86: {
    forest_join_50: {
    forest_join_49: {
    forest_join_11: {
    if (!((p2 != 0))) {
        break forest_join_11;
    }
    break forest_join_50;
    }
    forest_cycle_11: while (true) {
    forest_join_44: {
    forest_join_33: {
    forest_join_30: {
    if (!(__call3107801_3(p5))) {
        break forest_join_30;
    }
    life6_20 = __cast3107801_5(__call3107801_4(p5));
    life7_23 = __call3107801_6(life6_20);
    spill3107801_0 = p1;
    if (!((p2 == 0))) {
        forestValue3107801_88_0 = spill3107801_0;
        break forest_join_88;
    }
    spill3107801_1 = __call3107801_8(__fieldRead3107801_7(spill3107801_0), life7_23);
    if (!((p2 == 0))) {
        forestValue3107801_44_0 = spill3107801_1;
        break forest_join_44;
    }
    forestValue3107801_49_0 = spill3107801_1;
    break forest_join_49;
    }
    if (!((p2 != 0))) {
        break forest_join_33;
    }
    break forest_join_98;
    }
    if (!(__call3107801_9(p3))) {
        break forest_join_98;
    }
    life4_44 = __cast3107801_11(__call3107801_10(p3));
    forestValue3107801_44_0 = __call3107801_13(__fieldRead3107801_12(p1), life4_44);
    }
    p5 = __call3107801_16(__call3107801_15(__cast3107801_14(forestValue3107801_44_0)));
    continue forest_cycle_11;
    }
    }
    forestValue3107801_86_0 = forestValue3107801_49_0;
    break forest_join_86;
    }
    forest_cycle_50: while (true) {
    forest_join_53: {
    if (!((p2 != 0))) {
        break forest_join_53;
    }
    break forest_join_98;
    }
    if (!(__call3107801_17(p3))) {
        break forest_join_98;
    }
    life4_66 = __cast3107801_19(__call3107801_18(p3));
    forestValue3107801_64_0 = __call3107801_21(__fieldRead3107801_20(p1), life4_66);
    forest_cycle_64: while (true) {
    p5 = __call3107801_24(__call3107801_23(__cast3107801_22(forestValue3107801_64_0)));
    if (!(__call3107801_25(p5))) {
        continue forest_cycle_50;
    }
    life6_84 = __cast3107801_27(__call3107801_26(p5));
    life7_23 = __call3107801_28(life6_84);
    spill3107801_2 = p1;
    if (!((p2 == 0))) {
        forestValue3107801_88_0 = spill3107801_2;
        break forest_join_88;
    }
    spill3107801_3 = __call3107801_30(__fieldRead3107801_29(spill3107801_2), life7_23);
    if (!((p2 == 0))) {
        forestValue3107801_64_0 = spill3107801_3;
        continue forest_cycle_64;
    }
    break forest_cycle_64;
    }
    break forest_cycle_50;
    }
    forestValue3107801_86_0 = spill3107801_3;
    }
    if (!((forestValue3107801_86_0 == null))) {
        continue forest_cycle_8;
    }
    forestValue3107801_88_0 = p1;
    }
    life8_105 = __call3107801_31(forestValue3107801_88_0, life7_23);
    __call3107801_33(__fieldRead3107801_32(p1), life7_23, life8_105);
    continue forest_cycle_8;
    }
    }
    return;
}
private static native long __fieldRead1078_0() throws Throwable;
private static native int __call1078_1() throws Throwable;
private static native java.util.Map __fieldRead1078_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Set __call1078_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1078_4(java.util.Set a0) throws Throwable;
private static native boolean __call1078_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1078_6(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast1078_7(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1078_8(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1078_9(java.util.Map a0, moom.DE a1) throws Throwable;
private static native moom.l4 __cast1078_10(java.lang.Object a0) throws Throwable;
private static native java.util.List __call1078_11(moom.l4 a0) throws Throwable;
private static native java.util.Iterator __call1078_12(java.util.List a0) throws Throwable;
private static native boolean __call1078_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1078_14(java.util.Iterator a0) throws Throwable;
private static native moom.l2 __cast1078_15(java.lang.Object a0) throws Throwable;
private static native moom.DD __call1078_16(moom.l2 a0) throws Throwable;
private static native java.util.Map __fieldRead1078_17(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1078_18(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1078_19(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead1078_20(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1078_21(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native java.lang.Exception __call3107800_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3107801_0() throws Throwable;
private static native java.lang.String __invokedynamic3107801_1(moom.DD a0, moom.DE a1) throws Throwable;
private static native void __call3107801_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3107801_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3107801_4(java.util.Iterator a0) throws Throwable;
private static native moom.l2 __cast3107801_5(java.lang.Object a0) throws Throwable;
private static native moom.DD __call3107801_6(moom.l2 a0) throws Throwable;
private static native java.util.Map __fieldRead3107801_7(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3107801_8(java.util.Map a0, moom.DD a1) throws Throwable;
private static native boolean __call3107801_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3107801_10(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast3107801_11(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead3107801_12(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3107801_13(java.util.Map a0, moom.DE a1) throws Throwable;
private static native moom.l4 __cast3107801_14(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3107801_15(moom.l4 a0) throws Throwable;
private static native java.util.Iterator __call3107801_16(java.util.List a0) throws Throwable;
private static native boolean __call3107801_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3107801_18(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast3107801_19(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead3107801_20(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3107801_21(java.util.Map a0, moom.DE a1) throws Throwable;
private static native moom.l4 __cast3107801_22(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3107801_23(moom.l4 a0) throws Throwable;
private static native java.util.Iterator __call3107801_24(java.util.List a0) throws Throwable;
private static native boolean __call3107801_25(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3107801_26(java.util.Iterator a0) throws Throwable;
private static native moom.l2 __cast3107801_27(java.lang.Object a0) throws Throwable;
private static native moom.DD __call3107801_28(moom.l2 a0) throws Throwable;
private static native java.util.Map __fieldRead3107801_29(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3107801_30(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call3107801_31(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead3107801_32(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3107801_33(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fcfc278b7563a39a6374(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_fcfc278b7563a39a6374 {

public static void f1081(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    java.lang.Object forestValue1081_16_0;
    net.minecraft.client.resources.model.ModelBakery forestValue1081_50_0;
    int spill1081_0;
    net.minecraft.client.resources.model.ModelBakery spill1081_1;
    java.lang.Object spill1081_2;
    long life1_3;
    int life3_7;
    java.util.Iterator life4_10;
    net.minecraft.item.Item life5_20;
    java.util.Iterator life6_25;
    java.lang.String life7_34;
    moom.DD life8_38;
    net.minecraft.client.renderer.block.model.ModelBlock life9_62;
    forest_join_63: {
    life1_3 = (__fieldRead1081_0() ^ 44934484182930L);
    spill1081_0 = __call1081_1();
    __call1081_2(receiver);
    life3_7 = spill1081_0;
    life4_10 = __call1081_4(__fieldRead1081_3());
    forest_cycle_11: while (true) {
    forest_join_61: {
    if (!(__call1081_5(life4_10))) {
        break forest_join_63;
    }
    forestValue1081_16_0 = __call1081_6(life4_10);
    forest_cycle_16: while (true) {
    life5_20 = __cast1081_7(forestValue1081_16_0);
    life6_25 = __call1081_9(__call1081_8(receiver, life5_20));
    forest_cycle_23: while (true) {
    forest_join_59: {
    forest_join_50: {
    if (!(__call1081_10(life6_25))) {
        break forest_join_61;
    }
    life7_34 = __cast1081_12(__call1081_11(life6_25));
    life8_38 = __call1081_13(receiver, life7_34);
    __call1081_15(__fieldRead1081_14(receiver), life7_34, life8_38);
    spill1081_1 = receiver;
    if (!((life3_7 == 0))) {
        forestValue1081_50_0 = spill1081_1;
        break forest_join_50;
    }
    spill1081_2 = __call1081_17(__fieldRead1081_16(spill1081_1), life8_38);
    if (!((life3_7 == 0))) {
        forestValue1081_16_0 = spill1081_2;
        continue forest_cycle_16;
    }
    if (!((spill1081_2 == null))) {
        break forest_join_59;
    }
    forestValue1081_50_0 = receiver;
    }
    life9_62 = __call1081_18(forestValue1081_50_0, life8_38);
    __call1081_20(__fieldRead1081_19(receiver), life8_38, life9_62);
    }
    if (!((life3_7 != 0))) {
        continue forest_cycle_23;
    }
    break forest_cycle_23;
    }
    break forest_cycle_16;
    }
    }
    if (!((life3_7 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    return;
}
public static void h1081_0(java.lang.Exception p0) throws Throwable {
    throw __call3108100_0(p0);
}
public static void h1081_1(java.lang.Exception p0, net.minecraft.client.resources.model.ModelBakery p1, int p2, java.util.Iterator p3, net.minecraft.item.Item p4, java.util.Iterator p5, java.lang.String p6, moom.DD p7, net.minecraft.client.renderer.block.model.ModelBlock p8) throws Throwable {
    java.lang.Object forestValue3108101_47_0;
    java.lang.Object forestValue3108101_55_0;
    java.lang.Object forestValue3108101_64_0;
    java.lang.Object forestValue3108101_96_0;
    net.minecraft.client.resources.model.ModelBakery forestValue3108101_98_0;
    net.minecraft.client.resources.model.ModelBakery spill3108101_0;
    java.lang.Object spill3108101_1;
    net.minecraft.client.resources.model.ModelBakery spill3108101_2;
    java.lang.Object spill3108101_3;
    java.lang.Exception life8_2;
    java.lang.String life6_22;
    moom.DD life7_26;
    net.minecraft.item.Item life4_54;
    net.minecraft.item.Item life4_73;
    java.lang.String life6_87;
    net.minecraft.client.renderer.block.model.ModelBlock life8_115;
    forest_join_108: {
    life8_2 = p0;
    __call3108101_4(__fieldRead3108101_0(), __invokedynamic3108101_3(p7, __call3108101_2(__fieldRead3108101_1(), p4)), life8_2);
    forest_cycle_10: while (true) {
    forest_join_98: {
    forest_join_96: {
    forest_join_56: {
    forest_join_55: {
    forest_join_13: {
    if (!((p2 != 0))) {
        break forest_join_13;
    }
    break forest_join_56;
    }
    forest_cycle_13: while (true) {
    forest_join_47: {
    forest_join_42: {
    forest_join_39: {
    if (!(__call3108101_5(p5))) {
        break forest_join_39;
    }
    life6_22 = __cast3108101_7(__call3108101_6(p5));
    life7_26 = __call3108101_8(p1, life6_22);
    __call3108101_10(__fieldRead3108101_9(p1), life6_22, life7_26);
    spill3108101_0 = p1;
    if (!((p2 == 0))) {
        forestValue3108101_98_0 = spill3108101_0;
        break forest_join_98;
    }
    spill3108101_1 = __call3108101_12(__fieldRead3108101_11(spill3108101_0), life7_26);
    if (!((p2 == 0))) {
        forestValue3108101_47_0 = spill3108101_1;
        break forest_join_47;
    }
    forestValue3108101_55_0 = spill3108101_1;
    break forest_join_55;
    }
    if (!((p2 != 0))) {
        break forest_join_42;
    }
    break forest_join_108;
    }
    if (!(__call3108101_13(p3))) {
        break forest_join_108;
    }
    forestValue3108101_47_0 = __call3108101_14(p3);
    }
    life4_54 = __cast3108101_15(forestValue3108101_47_0);
    p5 = __call3108101_17(__call3108101_16(p1, life4_54));
    continue forest_cycle_13;
    }
    }
    forestValue3108101_96_0 = forestValue3108101_55_0;
    break forest_join_96;
    }
    forest_cycle_56: while (true) {
    forest_join_59: {
    if (!((p2 != 0))) {
        break forest_join_59;
    }
    break forest_join_108;
    }
    if (!(__call3108101_18(p3))) {
        break forest_join_108;
    }
    forestValue3108101_64_0 = __call3108101_19(p3);
    forest_cycle_64: while (true) {
    life4_73 = __cast3108101_20(forestValue3108101_64_0);
    p5 = __call3108101_22(__call3108101_21(p1, life4_73));
    if (!(__call3108101_23(p5))) {
        continue forest_cycle_56;
    }
    life6_87 = __cast3108101_25(__call3108101_24(p5));
    life7_26 = __call3108101_26(p1, life6_87);
    __call3108101_28(__fieldRead3108101_27(p1), life6_87, life7_26);
    spill3108101_2 = p1;
    if (!((p2 == 0))) {
        forestValue3108101_98_0 = spill3108101_2;
        break forest_join_98;
    }
    spill3108101_3 = __call3108101_30(__fieldRead3108101_29(spill3108101_2), life7_26);
    if (!((p2 == 0))) {
        forestValue3108101_64_0 = spill3108101_3;
        continue forest_cycle_64;
    }
    break forest_cycle_64;
    }
    break forest_cycle_56;
    }
    forestValue3108101_96_0 = spill3108101_3;
    }
    if (!((forestValue3108101_96_0 == null))) {
        continue forest_cycle_10;
    }
    forestValue3108101_98_0 = p1;
    }
    life8_115 = __call3108101_31(forestValue3108101_98_0, life7_26);
    __call3108101_33(__fieldRead3108101_32(p1), life7_26, life8_115);
    continue forest_cycle_10;
    }
    }
    return;
}
private static native long __fieldRead1081_0() throws Throwable;
private static native int __call1081_1() throws Throwable;
private static native void __call1081_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.DB __fieldRead1081_3() throws Throwable;
private static native java.util.Iterator __call1081_4(moom.DB a0) throws Throwable;
private static native boolean __call1081_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1081_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.Item __cast1081_7(java.lang.Object a0) throws Throwable;
private static native java.util.List __call1081_8(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.item.Item a1) throws Throwable;
private static native java.util.Iterator __call1081_9(java.util.List a0) throws Throwable;
private static native boolean __call1081_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1081_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1081_12(java.lang.Object a0) throws Throwable;
private static native moom.DD __call1081_13(net.minecraft.client.resources.model.ModelBakery a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead1081_14(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1081_15(java.util.Map a0, java.lang.String a1, moom.DD a2) throws Throwable;
private static native java.util.Map __fieldRead1081_16(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1081_17(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1081_18(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead1081_19(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1081_20(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native java.lang.Exception __call3108100_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3108101_0() throws Throwable;
private static native moom.DB __fieldRead3108101_1() throws Throwable;
private static native java.lang.Object __call3108101_2(moom.DB a0, net.minecraft.item.Item a1) throws Throwable;
private static native java.lang.String __invokedynamic3108101_3(moom.DD a0, java.lang.Object a1) throws Throwable;
private static native void __call3108101_4(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3108101_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3108101_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3108101_7(java.lang.Object a0) throws Throwable;
private static native moom.DD __call3108101_8(net.minecraft.client.resources.model.ModelBakery a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead3108101_9(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3108101_10(java.util.Map a0, java.lang.String a1, moom.DD a2) throws Throwable;
private static native java.util.Map __fieldRead3108101_11(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3108101_12(java.util.Map a0, moom.DD a1) throws Throwable;
private static native boolean __call3108101_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3108101_14(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.Item __cast3108101_15(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3108101_16(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.item.Item a1) throws Throwable;
private static native java.util.Iterator __call3108101_17(java.util.List a0) throws Throwable;
private static native boolean __call3108101_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3108101_19(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.Item __cast3108101_20(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3108101_21(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.item.Item a1) throws Throwable;
private static native java.util.Iterator __call3108101_22(java.util.List a0) throws Throwable;
private static native boolean __call3108101_23(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3108101_24(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3108101_25(java.lang.Object a0) throws Throwable;
private static native moom.DD __call3108101_26(net.minecraft.client.resources.model.ModelBakery a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead3108101_27(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3108101_28(java.util.Map a0, java.lang.String a1, moom.DD a2) throws Throwable;
private static native java.util.Map __fieldRead3108101_29(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3108101_30(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call3108101_31(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead3108101_32(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call3108101_33(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_d3a3e227eb06521f510b(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws E;
private static final class __SourceHandler_d3a3e227eb06521f510b {

public static moom.DD f1441(net.minecraft.client.resources.model.ModelBakery receiver, moom.DD p0) throws Throwable {
    moom.DD lexicalValue1441_34_0;
    int spill1441_0;
    moom.DD spill1441_1;
    long life2_3;
    java.util.Iterator life5_9;
    int life4_10;
    java.util.Map.Entry life6_17;
    net.minecraft.client.renderer.block.model.ModelBlock life7_21;
    lexical_join_37: {
    life2_3 = (__fieldRead1441_0() ^ 139717770913148L);
    spill1441_0 = __call1441_1();
    life5_9 = __call1441_4(__call1441_3(__fieldRead1441_2(receiver)));
    life4_10 = spill1441_0;
    lexical_cycle_11: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    if (!(__call1441_5(life5_9))) {
        break lexical_join_37;
    }
    life6_17 = __cast1441_7(__call1441_6(life5_9));
    life7_21 = __cast1441_9(__call1441_8(life6_17));
    if (!((life7_21 != null))) {
        break lexical_join_35;
    }
    spill1441_1 = p0;
    if (!((life4_10 == 0))) {
        lexicalValue1441_34_0 = spill1441_1;
        break lexical_join_34;
    }
    if (!(__call1441_11(spill1441_1, __call1441_10(life7_21)))) {
        break lexical_join_35;
    }
    lexicalValue1441_34_0 = __cast1441_13(__call1441_12(life6_17));
    }
    return lexicalValue1441_34_0;
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return null;
}
public static void h1441_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1144100_0(p0);
}
public static void h1441_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1144101_0(p0);
}
public static void h1441_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1144102_0(p0);
}
private static native long __fieldRead1441_0() throws Throwable;
private static native int __call1441_1() throws Throwable;
private static native java.util.Map __fieldRead1441_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Set __call1441_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1441_4(java.util.Set a0) throws Throwable;
private static native boolean __call1441_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1441_6(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast1441_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1441_8(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1441_9(java.lang.Object a0) throws Throwable;
private static native moom.DD __call1441_10(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native boolean __call1441_11(moom.DD a0, moom.DD a1) throws Throwable;
private static native java.lang.Object __call1441_12(java.util.Map.Entry a0) throws Throwable;
private static native moom.DD __cast1441_13(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1144100_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1144101_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1144102_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_de00b3b04cd40ad3e74b(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_de00b3b04cd40ad3e74b {

public static void f629(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    java.util.Map spill629_0;
    net.minecraft.item.Item spill629_1;
    java.lang.String[] spill629_2;
    java.lang.String[] spill629_3;
    java.lang.String[] spill629_4;
    java.lang.String[] spill629_5;
    java.lang.String[] spill629_6;
    java.lang.String[] spill629_7;
    java.lang.String[] spill629_8;
    java.util.Map spill629_9;
    net.minecraft.item.Item spill629_10;
    java.lang.String[] spill629_11;
    java.lang.String[] spill629_12;
    java.lang.String[] spill629_13;
    java.util.Map spill629_14;
    net.minecraft.item.Item spill629_15;
    java.lang.String[] spill629_16;
    java.lang.String[] spill629_17;
    java.lang.String[] spill629_18;
    java.lang.String[] spill629_19;
    java.lang.String[] spill629_20;
    java.lang.String[] spill629_21;
    java.util.Map spill629_22;
    net.minecraft.item.Item spill629_23;
    java.lang.String[] spill629_24;
    java.lang.String[] spill629_25;
    java.lang.String[] spill629_26;
    java.lang.String[] spill629_27;
    java.lang.String[] spill629_28;
    java.lang.String[] spill629_29;
    java.util.Map spill629_30;
    net.minecraft.item.Item spill629_31;
    java.lang.String[] spill629_32;
    java.lang.String[] spill629_33;
    java.util.Map spill629_34;
    net.minecraft.item.Item spill629_35;
    java.lang.String[] spill629_36;
    java.lang.String[] spill629_37;
    java.lang.String[] spill629_38;
    java.lang.String[] spill629_39;
    int spill629_40;
    java.util.Map spill629_41;
    net.minecraft.item.Item spill629_42;
    java.lang.String[] spill629_43;
    java.lang.String[] spill629_44;
    java.lang.String[] spill629_45;
    java.lang.String[] spill629_46;
    java.util.Map spill629_47;
    net.minecraft.item.Item spill629_48;
    java.lang.String[] spill629_49;
    java.lang.String[] spill629_50;
    java.util.Map spill629_51;
    net.minecraft.item.Item spill629_52;
    java.lang.String[] spill629_53;
    java.lang.String[] spill629_54;
    java.lang.String[] spill629_55;
    java.util.Map spill629_56;
    net.minecraft.item.Item spill629_57;
    java.lang.String[] spill629_58;
    java.lang.String[] spill629_59;
    java.lang.String[] spill629_60;
    java.util.Map spill629_61;
    net.minecraft.item.Item spill629_62;
    java.lang.String[] spill629_63;
    java.lang.String[] spill629_64;
    java.lang.String[] spill629_65;
    java.util.Map spill629_66;
    net.minecraft.item.Item spill629_67;
    java.lang.String[] spill629_68;
    java.util.Map spill629_69;
    net.minecraft.item.Item spill629_70;
    java.lang.String[] spill629_71;
    java.lang.String[] spill629_72;
    java.lang.String[] spill629_73;
    java.lang.String[] spill629_74;
    java.lang.String[] spill629_75;
    java.lang.String[] spill629_76;
    java.lang.String[] spill629_77;
    java.lang.String[] spill629_78;
    java.lang.String[] spill629_79;
    java.lang.String[] spill629_80;
    java.lang.String[] spill629_81;
    java.lang.String[] spill629_82;
    java.lang.String[] spill629_83;
    java.lang.String[] spill629_84;
    java.lang.String[] spill629_85;
    java.lang.String[] spill629_86;
    java.util.Map spill629_87;
    net.minecraft.item.Item spill629_88;
    java.lang.String[] spill629_89;
    java.util.Map spill629_90;
    net.minecraft.item.Item spill629_91;
    java.lang.String[] spill629_92;
    java.lang.String[] spill629_93;
    java.lang.String[] spill629_94;
    java.lang.String[] spill629_95;
    java.lang.String[] spill629_96;
    java.lang.String[] spill629_97;
    java.lang.String[] spill629_98;
    java.lang.String[] spill629_99;
    java.lang.String[] spill629_100;
    java.util.Map spill629_101;
    net.minecraft.item.Item spill629_102;
    java.lang.String[] spill629_103;
    java.lang.String[] spill629_104;
    java.lang.String[] spill629_105;
    java.lang.String[] spill629_106;
    java.lang.String[] spill629_107;
    java.lang.String[] spill629_108;
    java.lang.String[] spill629_109;
    java.util.Map spill629_110;
    net.minecraft.item.Item spill629_111;
    java.lang.String[] spill629_112;
    java.util.Map spill629_113;
    net.minecraft.item.Item spill629_114;
    java.lang.String[] spill629_115;
    java.lang.String[] spill629_116;
    java.lang.String[] spill629_117;
    java.lang.String[] spill629_118;
    java.lang.String[] spill629_119;
    java.lang.String[] spill629_120;
    java.lang.String[] spill629_121;
    java.lang.String[] spill629_122;
    java.lang.String[] spill629_123;
    java.lang.String[] spill629_124;
    java.lang.String[] spill629_125;
    java.lang.String[] spill629_126;
    java.lang.String[] spill629_127;
    java.lang.String[] spill629_128;
    java.lang.String[] spill629_129;
    java.lang.String[] spill629_130;
    java.util.Map spill629_131;
    net.minecraft.item.Item spill629_132;
    java.lang.String[] spill629_133;
    java.lang.String[] spill629_134;
    java.lang.String[] spill629_135;
    java.lang.String[] spill629_136;
    java.lang.String[] spill629_137;
    java.lang.String[] spill629_138;
    java.util.Map spill629_139;
    net.minecraft.item.Item spill629_140;
    java.lang.String[] spill629_141;
    java.lang.String[] spill629_142;
    java.lang.String[] spill629_143;
    java.lang.String[] spill629_144;
    java.util.Map spill629_145;
    net.minecraft.item.Item spill629_146;
    java.lang.String[] spill629_147;
    java.lang.String[] spill629_148;
    java.lang.String[] spill629_149;
    java.lang.String[] spill629_150;
    java.lang.String[] spill629_151;
    java.lang.String[] spill629_152;
    java.util.Map spill629_153;
    net.minecraft.item.Item spill629_154;
    java.lang.String[] spill629_155;
    java.lang.String[] spill629_156;
    java.util.Map spill629_157;
    net.minecraft.item.Item spill629_158;
    java.lang.String[] spill629_159;
    java.lang.String[] spill629_160;
    java.lang.String[] spill629_161;
    java.util.Map spill629_162;
    net.minecraft.item.Item spill629_163;
    java.lang.String[] spill629_164;
    java.lang.String[] spill629_165;
    java.lang.String[] spill629_166;
    java.util.Map spill629_167;
    net.minecraft.item.Item spill629_168;
    java.lang.String[] spill629_169;
    java.lang.String[] spill629_170;
    java.lang.String[] spill629_171;
    java.lang.String[] spill629_172;
    java.lang.String[] spill629_173;
    java.lang.String[] spill629_174;
    java.lang.String[] spill629_175;
    java.lang.String[] spill629_176;
    java.lang.String[] spill629_177;
    java.lang.String[] spill629_178;
    java.lang.String[] spill629_179;
    java.lang.String[] spill629_180;
    java.lang.String[] spill629_181;
    java.lang.String[] spill629_182;
    java.lang.String[] spill629_183;
    java.lang.String[] spill629_184;
    java.util.Map spill629_185;
    net.minecraft.item.Item spill629_186;
    java.lang.String[] spill629_187;
    java.lang.String[] spill629_188;
    java.lang.String[] spill629_189;
    java.lang.String[] spill629_190;
    java.lang.String[] spill629_191;
    java.lang.String[] spill629_192;
    java.lang.String[] spill629_193;
    java.lang.String[] spill629_194;
    java.lang.String[] spill629_195;
    java.lang.String[] spill629_196;
    java.lang.String[] spill629_197;
    java.lang.String[] spill629_198;
    java.lang.String[] spill629_199;
    java.lang.String[] spill629_200;
    java.lang.String[] spill629_201;
    java.lang.String[] spill629_202;
    java.util.Map spill629_203;
    net.minecraft.item.Item spill629_204;
    java.lang.String[] spill629_205;
    java.lang.String[] spill629_206;
    java.util.Map spill629_207;
    net.minecraft.item.Item spill629_208;
    java.lang.String[] spill629_209;
    java.lang.String[] spill629_210;
    java.util.Map spill629_211;
    net.minecraft.item.Item spill629_212;
    java.lang.String[] spill629_213;
    java.lang.String[] spill629_214;
    java.lang.String[] spill629_215;
    java.util.Map spill629_216;
    net.minecraft.item.Item spill629_217;
    java.lang.String[] spill629_218;
    java.lang.String[] spill629_219;
    java.lang.String[] spill629_220;
    java.lang.String[] spill629_221;
    java.lang.String[] spill629_222;
    java.lang.String[] spill629_223;
    java.lang.String[] spill629_224;
    java.lang.String[] spill629_225;
    java.lang.String[] spill629_226;
    java.lang.String[] spill629_227;
    java.lang.String[] spill629_228;
    java.lang.String[] spill629_229;
    java.lang.String[] spill629_230;
    java.lang.String[] spill629_231;
    java.lang.String[] spill629_232;
    java.lang.String[] spill629_233;
    java.util.Map spill629_234;
    net.minecraft.item.Item spill629_235;
    java.lang.String[] spill629_236;
    java.lang.String[] spill629_237;
    java.lang.String[] spill629_238;
    java.lang.String[] spill629_239;
    java.lang.String[] spill629_240;
    java.lang.String[] spill629_241;
    java.util.Map spill629_242;
    net.minecraft.item.ItemBow spill629_243;
    java.lang.String[] spill629_244;
    java.lang.String[] spill629_245;
    java.lang.String[] spill629_246;
    java.lang.String[] spill629_247;
    java.util.Map spill629_248;
    net.minecraft.item.Item spill629_249;
    java.lang.String[] spill629_250;
    java.lang.String[] spill629_251;
    java.util.Map spill629_252;
    moom.xn spill629_253;
    java.lang.String[] spill629_254;
    java.lang.String[] spill629_255;
    java.util.Map spill629_256;
    net.minecraft.item.Item spill629_257;
    java.lang.String[] spill629_258;
    java.lang.String[] spill629_259;
    java.lang.String[] spill629_260;
    java.lang.String[] spill629_261;
    java.util.Map spill629_262;
    net.minecraft.item.Item spill629_263;
    java.lang.String[] spill629_264;
    java.lang.String[] spill629_265;
    java.util.Map spill629_266;
    net.minecraft.item.Item spill629_267;
    java.lang.String[] spill629_268;
    java.lang.String[] spill629_269;
    java.lang.String[] spill629_270;
    java.lang.String[] spill629_271;
    java.lang.String[] spill629_272;
    java.lang.String[] spill629_273;
    java.lang.String[] spill629_274;
    java.lang.String[] spill629_275;
    java.lang.String[] spill629_276;
    java.lang.String[] spill629_277;
    java.lang.String[] spill629_278;
    java.lang.String[] spill629_279;
    java.lang.String[] spill629_280;
    java.lang.String[] spill629_281;
    java.lang.String[] spill629_282;
    java.lang.String[] spill629_283;
    java.util.Map spill629_284;
    net.minecraft.item.ItemPotion spill629_285;
    java.lang.String[] spill629_286;
    java.lang.String[] spill629_287;
    java.util.Map spill629_288;
    net.minecraft.item.Item spill629_289;
    java.lang.String[] spill629_290;
    java.lang.String[] spill629_291;
    java.lang.String[] spill629_292;
    java.lang.String[] spill629_293;
    java.lang.String[] spill629_294;
    java.util.Map spill629_295;
    net.minecraft.item.Item spill629_296;
    java.lang.String[] spill629_297;
    java.util.Map spill629_298;
    net.minecraft.item.Item spill629_299;
    java.lang.String[] spill629_300;
    java.util.Map spill629_301;
    net.minecraft.item.Item spill629_302;
    java.lang.String[] spill629_303;
    long life1_3;
    int life3_1100;
    java.util.Iterator life4_1573;
    java.util.Map.Entry life5_1580;
    forest_join_1602: {
    forest_join_1599: {
    life1_3 = (__fieldRead629_0() ^ 133296859561680L);
    __call629_2(__fieldRead629_1(receiver));
    spill629_0 = __fieldRead629_3(receiver);
    spill629_1 = __call629_5(__fieldRead629_4());
    java.lang.String[] __stackOp629_7_0 = new java.lang.String[__invokedynamic629_6(11141, (1872783907943423662L ^ life1_3))];
    spill629_2 = __stackOp629_7_0;
    (__stackOp629_7_0)[0] = "stone";
    java.lang.String[] __stackOp629_8_0 = spill629_2;
    spill629_3 = __stackOp629_8_0;
    (__stackOp629_8_0)[1] = "granite";
    java.lang.String[] __stackOp629_9_0 = spill629_3;
    spill629_4 = __stackOp629_9_0;
    (__stackOp629_9_0)[2] = "granite_smooth";
    java.lang.String[] __stackOp629_10_0 = spill629_4;
    spill629_5 = __stackOp629_10_0;
    (__stackOp629_10_0)[3] = "diorite";
    java.lang.String[] __stackOp629_11_0 = spill629_5;
    spill629_6 = __stackOp629_11_0;
    (__stackOp629_11_0)[4] = "diorite_smooth";
    java.lang.String[] __stackOp629_12_0 = spill629_6;
    spill629_7 = __stackOp629_12_0;
    (__stackOp629_12_0)[5] = "andesite";
    java.lang.String[] __stackOp629_13_0 = spill629_7;
    spill629_8 = __stackOp629_13_0;
    (__stackOp629_13_0)[__invokedynamic629_14(30242, (1681781847613981452L ^ life1_3))] = "andesite_smooth";
    __call629_16(spill629_0, spill629_1, __call629_15(spill629_8));
    spill629_9 = __fieldRead629_17(receiver);
    spill629_10 = __call629_19(__fieldRead629_18());
    java.lang.String[] __stackOp629_20_0 = new java.lang.String[3];
    spill629_11 = __stackOp629_20_0;
    (__stackOp629_20_0)[0] = "dirt";
    java.lang.String[] __stackOp629_21_0 = spill629_11;
    spill629_12 = __stackOp629_21_0;
    (__stackOp629_21_0)[1] = "coarse_dirt";
    java.lang.String[] __stackOp629_22_0 = spill629_12;
    spill629_13 = __stackOp629_22_0;
    (__stackOp629_22_0)[2] = "podzol";
    __call629_24(spill629_9, spill629_10, __call629_23(spill629_13));
    spill629_14 = __fieldRead629_25(receiver);
    spill629_15 = __call629_27(__fieldRead629_26());
    java.lang.String[] __stackOp629_29_0 = new java.lang.String[__invokedynamic629_28(30242, (1681781847613981452L ^ life1_3))];
    spill629_16 = __stackOp629_29_0;
    (__stackOp629_29_0)[0] = "oak_planks";
    java.lang.String[] __stackOp629_30_0 = spill629_16;
    spill629_17 = __stackOp629_30_0;
    (__stackOp629_30_0)[1] = "spruce_planks";
    java.lang.String[] __stackOp629_31_0 = spill629_17;
    spill629_18 = __stackOp629_31_0;
    (__stackOp629_31_0)[2] = "birch_planks";
    java.lang.String[] __stackOp629_32_0 = spill629_18;
    spill629_19 = __stackOp629_32_0;
    (__stackOp629_32_0)[3] = "jungle_planks";
    java.lang.String[] __stackOp629_33_0 = spill629_19;
    spill629_20 = __stackOp629_33_0;
    (__stackOp629_33_0)[4] = "acacia_planks";
    java.lang.String[] __stackOp629_34_0 = spill629_20;
    spill629_21 = __stackOp629_34_0;
    (__stackOp629_34_0)[5] = "dark_oak_planks";
    __call629_36(spill629_14, spill629_15, __call629_35(spill629_21));
    spill629_22 = __fieldRead629_37(receiver);
    spill629_23 = __call629_39(__fieldRead629_38());
    java.lang.String[] __stackOp629_41_0 = new java.lang.String[__invokedynamic629_40(30242, (1681781847613981452L ^ life1_3))];
    spill629_24 = __stackOp629_41_0;
    (__stackOp629_41_0)[0] = "oak_sapling";
    java.lang.String[] __stackOp629_42_0 = spill629_24;
    spill629_25 = __stackOp629_42_0;
    (__stackOp629_42_0)[1] = "spruce_sapling";
    java.lang.String[] __stackOp629_43_0 = spill629_25;
    spill629_26 = __stackOp629_43_0;
    (__stackOp629_43_0)[2] = "birch_sapling";
    java.lang.String[] __stackOp629_44_0 = spill629_26;
    spill629_27 = __stackOp629_44_0;
    (__stackOp629_44_0)[3] = "jungle_sapling";
    java.lang.String[] __stackOp629_45_0 = spill629_27;
    spill629_28 = __stackOp629_45_0;
    (__stackOp629_45_0)[4] = "acacia_sapling";
    java.lang.String[] __stackOp629_46_0 = spill629_28;
    spill629_29 = __stackOp629_46_0;
    (__stackOp629_46_0)[5] = "dark_oak_sapling";
    __call629_48(spill629_22, spill629_23, __call629_47(spill629_29));
    spill629_30 = __fieldRead629_49(receiver);
    spill629_31 = __call629_51(__fieldRead629_50());
    java.lang.String[] __stackOp629_52_0 = new java.lang.String[2];
    spill629_32 = __stackOp629_52_0;
    (__stackOp629_52_0)[0] = "sand";
    java.lang.String[] __stackOp629_53_0 = spill629_32;
    spill629_33 = __stackOp629_53_0;
    (__stackOp629_53_0)[1] = "red_sand";
    __call629_55(spill629_30, spill629_31, __call629_54(spill629_33));
    spill629_34 = __fieldRead629_56(receiver);
    spill629_35 = __call629_58(__fieldRead629_57());
    java.lang.String[] __stackOp629_59_0 = new java.lang.String[4];
    spill629_36 = __stackOp629_59_0;
    (__stackOp629_59_0)[0] = "oak_log";
    java.lang.String[] __stackOp629_60_0 = spill629_36;
    spill629_37 = __stackOp629_60_0;
    (__stackOp629_60_0)[1] = "spruce_log";
    java.lang.String[] __stackOp629_61_0 = spill629_37;
    spill629_38 = __stackOp629_61_0;
    (__stackOp629_61_0)[2] = "birch_log";
    java.lang.String[] __stackOp629_62_0 = spill629_38;
    spill629_39 = __stackOp629_62_0;
    (__stackOp629_62_0)[3] = "jungle_log";
    __call629_64(spill629_34, spill629_35, __call629_63(spill629_39));
    spill629_40 = __call629_65();
    spill629_41 = __fieldRead629_66(receiver);
    spill629_42 = __call629_68(__fieldRead629_67());
    java.lang.String[] __stackOp629_69_0 = new java.lang.String[4];
    spill629_43 = __stackOp629_69_0;
    (__stackOp629_69_0)[0] = "oak_leaves";
    java.lang.String[] __stackOp629_70_0 = spill629_43;
    spill629_44 = __stackOp629_70_0;
    (__stackOp629_70_0)[1] = "spruce_leaves";
    java.lang.String[] __stackOp629_71_0 = spill629_44;
    spill629_45 = __stackOp629_71_0;
    (__stackOp629_71_0)[2] = "birch_leaves";
    java.lang.String[] __stackOp629_72_0 = spill629_45;
    spill629_46 = __stackOp629_72_0;
    (__stackOp629_72_0)[3] = "jungle_leaves";
    __call629_74(spill629_41, spill629_42, __call629_73(spill629_46));
    spill629_47 = __fieldRead629_75(receiver);
    spill629_48 = __call629_77(__fieldRead629_76());
    java.lang.String[] __stackOp629_78_0 = new java.lang.String[2];
    spill629_49 = __stackOp629_78_0;
    (__stackOp629_78_0)[0] = "sponge";
    java.lang.String[] __stackOp629_79_0 = spill629_49;
    spill629_50 = __stackOp629_79_0;
    (__stackOp629_79_0)[1] = "sponge_wet";
    __call629_81(spill629_47, spill629_48, __call629_80(spill629_50));
    spill629_51 = __fieldRead629_82(receiver);
    spill629_52 = __call629_84(__fieldRead629_83());
    java.lang.String[] __stackOp629_85_0 = new java.lang.String[3];
    spill629_53 = __stackOp629_85_0;
    (__stackOp629_85_0)[0] = "sandstone";
    java.lang.String[] __stackOp629_86_0 = spill629_53;
    spill629_54 = __stackOp629_86_0;
    (__stackOp629_86_0)[1] = "chiseled_sandstone";
    java.lang.String[] __stackOp629_87_0 = spill629_54;
    spill629_55 = __stackOp629_87_0;
    (__stackOp629_87_0)[2] = "smooth_sandstone";
    __call629_89(spill629_51, spill629_52, __call629_88(spill629_55));
    spill629_56 = __fieldRead629_90(receiver);
    spill629_57 = __call629_92(__fieldRead629_91());
    java.lang.String[] __stackOp629_93_0 = new java.lang.String[3];
    spill629_58 = __stackOp629_93_0;
    (__stackOp629_93_0)[0] = "red_sandstone";
    java.lang.String[] __stackOp629_94_0 = spill629_58;
    spill629_59 = __stackOp629_94_0;
    (__stackOp629_94_0)[1] = "chiseled_red_sandstone";
    java.lang.String[] __stackOp629_95_0 = spill629_59;
    spill629_60 = __stackOp629_95_0;
    (__stackOp629_95_0)[2] = "smooth_red_sandstone";
    __call629_97(spill629_56, spill629_57, __call629_96(spill629_60));
    spill629_61 = __fieldRead629_98(receiver);
    spill629_62 = __call629_100(__fieldRead629_99());
    java.lang.String[] __stackOp629_101_0 = new java.lang.String[3];
    spill629_63 = __stackOp629_101_0;
    (__stackOp629_101_0)[0] = "dead_bush";
    java.lang.String[] __stackOp629_102_0 = spill629_63;
    spill629_64 = __stackOp629_102_0;
    (__stackOp629_102_0)[1] = "tall_grass";
    java.lang.String[] __stackOp629_103_0 = spill629_64;
    spill629_65 = __stackOp629_103_0;
    (__stackOp629_103_0)[2] = "fern";
    __call629_105(spill629_61, spill629_62, __call629_104(spill629_65));
    spill629_66 = __fieldRead629_106(receiver);
    spill629_67 = __call629_108(__fieldRead629_107());
    java.lang.String[] __stackOp629_109_0 = new java.lang.String[1];
    spill629_68 = __stackOp629_109_0;
    (__stackOp629_109_0)[0] = "dead_bush";
    __call629_111(spill629_66, spill629_67, __call629_110(spill629_68));
    spill629_69 = __fieldRead629_112(receiver);
    spill629_70 = __call629_114(__fieldRead629_113());
    java.lang.String[] __stackOp629_116_0 = new java.lang.String[__invokedynamic629_115(22830, (4344916522321308688L ^ life1_3))];
    spill629_71 = __stackOp629_116_0;
    (__stackOp629_116_0)[0] = "black_wool";
    java.lang.String[] __stackOp629_117_0 = spill629_71;
    spill629_72 = __stackOp629_117_0;
    (__stackOp629_117_0)[1] = "red_wool";
    java.lang.String[] __stackOp629_118_0 = spill629_72;
    spill629_73 = __stackOp629_118_0;
    (__stackOp629_118_0)[2] = "green_wool";
    java.lang.String[] __stackOp629_119_0 = spill629_73;
    spill629_74 = __stackOp629_119_0;
    (__stackOp629_119_0)[3] = "brown_wool";
    java.lang.String[] __stackOp629_120_0 = spill629_74;
    spill629_75 = __stackOp629_120_0;
    (__stackOp629_120_0)[4] = "blue_wool";
    java.lang.String[] __stackOp629_121_0 = spill629_75;
    spill629_76 = __stackOp629_121_0;
    (__stackOp629_121_0)[5] = "purple_wool";
    java.lang.String[] __stackOp629_122_0 = spill629_76;
    spill629_77 = __stackOp629_122_0;
    (__stackOp629_122_0)[__invokedynamic629_123(30242, (1681781847613981452L ^ life1_3))] = "cyan_wool";
    java.lang.String[] __stackOp629_124_0 = spill629_77;
    spill629_78 = __stackOp629_124_0;
    (__stackOp629_124_0)[__invokedynamic629_125(11141, (1872783907943423662L ^ life1_3))] = "silver_wool";
    java.lang.String[] __stackOp629_126_0 = spill629_78;
    spill629_79 = __stackOp629_126_0;
    (__stackOp629_126_0)[__invokedynamic629_127(14644, (6468569459961039885L ^ life1_3))] = "gray_wool";
    java.lang.String[] __stackOp629_128_0 = spill629_79;
    spill629_80 = __stackOp629_128_0;
    (__stackOp629_128_0)[__invokedynamic629_129(1765, (7729831655065596868L ^ life1_3))] = "pink_wool";
    java.lang.String[] __stackOp629_130_0 = spill629_80;
    spill629_81 = __stackOp629_130_0;
    (__stackOp629_130_0)[__invokedynamic629_131(11027, (7385747411007086140L ^ life1_3))] = "lime_wool";
    java.lang.String[] __stackOp629_132_0 = spill629_81;
    spill629_82 = __stackOp629_132_0;
    (__stackOp629_132_0)[__invokedynamic629_133(13812, (5125992202231546057L ^ life1_3))] = "yellow_wool";
    java.lang.String[] __stackOp629_134_0 = spill629_82;
    spill629_83 = __stackOp629_134_0;
    (__stackOp629_134_0)[__invokedynamic629_135(10604, (6360485757867269193L ^ life1_3))] = "light_blue_wool";
    java.lang.String[] __stackOp629_136_0 = spill629_83;
    spill629_84 = __stackOp629_136_0;
    (__stackOp629_136_0)[__invokedynamic629_137(20406, (736056252770417302L ^ life1_3))] = "magenta_wool";
    java.lang.String[] __stackOp629_138_0 = spill629_84;
    spill629_85 = __stackOp629_138_0;
    (__stackOp629_138_0)[__invokedynamic629_139(14233, (2848441380543365822L ^ life1_3))] = "orange_wool";
    java.lang.String[] __stackOp629_140_0 = spill629_85;
    spill629_86 = __stackOp629_140_0;
    (__stackOp629_140_0)[__invokedynamic629_141(25767, (4472782403275673998L ^ life1_3))] = "white_wool";
    __call629_143(spill629_69, spill629_70, __call629_142(spill629_86));
    spill629_87 = __fieldRead629_144(receiver);
    spill629_88 = __call629_146(__fieldRead629_145());
    java.lang.String[] __stackOp629_147_0 = new java.lang.String[1];
    spill629_89 = __stackOp629_147_0;
    (__stackOp629_147_0)[0] = "dandelion";
    __call629_149(spill629_87, spill629_88, __call629_148(spill629_89));
    spill629_90 = __fieldRead629_150(receiver);
    spill629_91 = __call629_152(__fieldRead629_151());
    java.lang.String[] __stackOp629_154_0 = new java.lang.String[__invokedynamic629_153(1765, (7729831655065596868L ^ life1_3))];
    spill629_92 = __stackOp629_154_0;
    (__stackOp629_154_0)[0] = "poppy";
    java.lang.String[] __stackOp629_155_0 = spill629_92;
    spill629_93 = __stackOp629_155_0;
    (__stackOp629_155_0)[1] = "blue_orchid";
    java.lang.String[] __stackOp629_156_0 = spill629_93;
    spill629_94 = __stackOp629_156_0;
    (__stackOp629_156_0)[2] = "allium";
    java.lang.String[] __stackOp629_157_0 = spill629_94;
    spill629_95 = __stackOp629_157_0;
    (__stackOp629_157_0)[3] = "houstonia";
    java.lang.String[] __stackOp629_158_0 = spill629_95;
    spill629_96 = __stackOp629_158_0;
    (__stackOp629_158_0)[4] = "red_tulip";
    java.lang.String[] __stackOp629_159_0 = spill629_96;
    spill629_97 = __stackOp629_159_0;
    (__stackOp629_159_0)[5] = "orange_tulip";
    java.lang.String[] __stackOp629_160_0 = spill629_97;
    spill629_98 = __stackOp629_160_0;
    (__stackOp629_160_0)[__invokedynamic629_161(30242, (1681781847613981452L ^ life1_3))] = "white_tulip";
    java.lang.String[] __stackOp629_162_0 = spill629_98;
    spill629_99 = __stackOp629_162_0;
    (__stackOp629_162_0)[__invokedynamic629_163(11141, (1872783907943423662L ^ life1_3))] = "pink_tulip";
    java.lang.String[] __stackOp629_164_0 = spill629_99;
    spill629_100 = __stackOp629_164_0;
    (__stackOp629_164_0)[__invokedynamic629_165(14644, (6468569459961039885L ^ life1_3))] = "oxeye_daisy";
    __call629_167(spill629_90, spill629_91, __call629_166(spill629_100));
    spill629_101 = __fieldRead629_168(receiver);
    spill629_102 = __call629_170(__fieldRead629_169());
    java.lang.String[] __stackOp629_172_0 = new java.lang.String[__invokedynamic629_171(11141, (1872783907943423662L ^ life1_3))];
    spill629_103 = __stackOp629_172_0;
    (__stackOp629_172_0)[0] = "stone_slab";
    java.lang.String[] __stackOp629_173_0 = spill629_103;
    spill629_104 = __stackOp629_173_0;
    (__stackOp629_173_0)[1] = "sandstone_slab";
    java.lang.String[] __stackOp629_174_0 = spill629_104;
    spill629_105 = __stackOp629_174_0;
    (__stackOp629_174_0)[2] = "cobblestone_slab";
    java.lang.String[] __stackOp629_175_0 = spill629_105;
    spill629_106 = __stackOp629_175_0;
    (__stackOp629_175_0)[3] = "brick_slab";
    java.lang.String[] __stackOp629_176_0 = spill629_106;
    spill629_107 = __stackOp629_176_0;
    (__stackOp629_176_0)[4] = "stone_brick_slab";
    java.lang.String[] __stackOp629_177_0 = spill629_107;
    spill629_108 = __stackOp629_177_0;
    (__stackOp629_177_0)[5] = "nether_brick_slab";
    java.lang.String[] __stackOp629_178_0 = spill629_108;
    spill629_109 = __stackOp629_178_0;
    (__stackOp629_178_0)[__invokedynamic629_179(30242, (1681781847613981452L ^ life1_3))] = "quartz_slab";
    __call629_181(spill629_101, spill629_102, __call629_180(spill629_109));
    spill629_110 = __fieldRead629_182(receiver);
    spill629_111 = __call629_184(__fieldRead629_183());
    java.lang.String[] __stackOp629_185_0 = new java.lang.String[1];
    spill629_112 = __stackOp629_185_0;
    (__stackOp629_185_0)[0] = "red_sandstone_slab";
    __call629_187(spill629_110, spill629_111, __call629_186(spill629_112));
    spill629_113 = __fieldRead629_188(receiver);
    spill629_114 = __call629_190(__fieldRead629_189());
    java.lang.String[] __stackOp629_192_0 = new java.lang.String[__invokedynamic629_191(22830, (4344916522321308688L ^ life1_3))];
    spill629_115 = __stackOp629_192_0;
    (__stackOp629_192_0)[0] = "black_stained_glass";
    java.lang.String[] __stackOp629_193_0 = spill629_115;
    spill629_116 = __stackOp629_193_0;
    (__stackOp629_193_0)[1] = "red_stained_glass";
    java.lang.String[] __stackOp629_194_0 = spill629_116;
    spill629_117 = __stackOp629_194_0;
    (__stackOp629_194_0)[2] = "green_stained_glass";
    java.lang.String[] __stackOp629_195_0 = spill629_117;
    spill629_118 = __stackOp629_195_0;
    (__stackOp629_195_0)[3] = "brown_stained_glass";
    java.lang.String[] __stackOp629_196_0 = spill629_118;
    spill629_119 = __stackOp629_196_0;
    (__stackOp629_196_0)[4] = "blue_stained_glass";
    java.lang.String[] __stackOp629_197_0 = spill629_119;
    spill629_120 = __stackOp629_197_0;
    (__stackOp629_197_0)[5] = "purple_stained_glass";
    java.lang.String[] __stackOp629_198_0 = spill629_120;
    spill629_121 = __stackOp629_198_0;
    (__stackOp629_198_0)[__invokedynamic629_199(30242, (1681781847613981452L ^ life1_3))] = "cyan_stained_glass";
    java.lang.String[] __stackOp629_200_0 = spill629_121;
    spill629_122 = __stackOp629_200_0;
    (__stackOp629_200_0)[__invokedynamic629_201(11141, (1872783907943423662L ^ life1_3))] = "silver_stained_glass";
    java.lang.String[] __stackOp629_202_0 = spill629_122;
    spill629_123 = __stackOp629_202_0;
    (__stackOp629_202_0)[__invokedynamic629_203(14644, (6468569459961039885L ^ life1_3))] = "gray_stained_glass";
    java.lang.String[] __stackOp629_204_0 = spill629_123;
    spill629_124 = __stackOp629_204_0;
    (__stackOp629_204_0)[__invokedynamic629_205(1765, (7729831655065596868L ^ life1_3))] = "pink_stained_glass";
    java.lang.String[] __stackOp629_206_0 = spill629_124;
    spill629_125 = __stackOp629_206_0;
    (__stackOp629_206_0)[__invokedynamic629_207(11027, (7385747411007086140L ^ life1_3))] = "lime_stained_glass";
    java.lang.String[] __stackOp629_208_0 = spill629_125;
    spill629_126 = __stackOp629_208_0;
    (__stackOp629_208_0)[__invokedynamic629_209(13812, (5125992202231546057L ^ life1_3))] = "yellow_stained_glass";
    java.lang.String[] __stackOp629_210_0 = spill629_126;
    spill629_127 = __stackOp629_210_0;
    (__stackOp629_210_0)[__invokedynamic629_211(10604, (6360485757867269193L ^ life1_3))] = "light_blue_stained_glass";
    java.lang.String[] __stackOp629_212_0 = spill629_127;
    spill629_128 = __stackOp629_212_0;
    (__stackOp629_212_0)[__invokedynamic629_213(20406, (736056252770417302L ^ life1_3))] = "magenta_stained_glass";
    java.lang.String[] __stackOp629_214_0 = spill629_128;
    spill629_129 = __stackOp629_214_0;
    (__stackOp629_214_0)[__invokedynamic629_215(14233, (2848441380543365822L ^ life1_3))] = "orange_stained_glass";
    java.lang.String[] __stackOp629_216_0 = spill629_129;
    spill629_130 = __stackOp629_216_0;
    (__stackOp629_216_0)[__invokedynamic629_217(25767, (4472782403275673998L ^ life1_3))] = "white_stained_glass";
    __call629_219(spill629_113, spill629_114, __call629_218(spill629_130));
    spill629_131 = __fieldRead629_220(receiver);
    spill629_132 = __call629_222(__fieldRead629_221());
    java.lang.String[] __stackOp629_224_0 = new java.lang.String[__invokedynamic629_223(30242, (1681781847613981452L ^ life1_3))];
    spill629_133 = __stackOp629_224_0;
    (__stackOp629_224_0)[0] = "stone_monster_egg";
    java.lang.String[] __stackOp629_225_0 = spill629_133;
    spill629_134 = __stackOp629_225_0;
    (__stackOp629_225_0)[1] = "cobblestone_monster_egg";
    java.lang.String[] __stackOp629_226_0 = spill629_134;
    spill629_135 = __stackOp629_226_0;
    (__stackOp629_226_0)[2] = "stone_brick_monster_egg";
    java.lang.String[] __stackOp629_227_0 = spill629_135;
    spill629_136 = __stackOp629_227_0;
    (__stackOp629_227_0)[3] = "mossy_brick_monster_egg";
    java.lang.String[] __stackOp629_228_0 = spill629_136;
    spill629_137 = __stackOp629_228_0;
    (__stackOp629_228_0)[4] = "cracked_brick_monster_egg";
    java.lang.String[] __stackOp629_229_0 = spill629_137;
    spill629_138 = __stackOp629_229_0;
    (__stackOp629_229_0)[5] = "chiseled_brick_monster_egg";
    __call629_231(spill629_131, spill629_132, __call629_230(spill629_138));
    spill629_139 = __fieldRead629_232(receiver);
    spill629_140 = __call629_234(__fieldRead629_233());
    java.lang.String[] __stackOp629_235_0 = new java.lang.String[4];
    spill629_141 = __stackOp629_235_0;
    (__stackOp629_235_0)[0] = "stonebrick";
    java.lang.String[] __stackOp629_236_0 = spill629_141;
    spill629_142 = __stackOp629_236_0;
    (__stackOp629_236_0)[1] = "mossy_stonebrick";
    java.lang.String[] __stackOp629_237_0 = spill629_142;
    spill629_143 = __stackOp629_237_0;
    (__stackOp629_237_0)[2] = "cracked_stonebrick";
    java.lang.String[] __stackOp629_238_0 = spill629_143;
    spill629_144 = __stackOp629_238_0;
    (__stackOp629_238_0)[3] = "chiseled_stonebrick";
    __call629_240(spill629_139, spill629_140, __call629_239(spill629_144));
    spill629_145 = __fieldRead629_241(receiver);
    spill629_146 = __call629_243(__fieldRead629_242());
    java.lang.String[] __stackOp629_245_0 = new java.lang.String[__invokedynamic629_244(30242, (1681781847613981452L ^ life1_3))];
    spill629_147 = __stackOp629_245_0;
    (__stackOp629_245_0)[0] = "oak_slab";
    java.lang.String[] __stackOp629_246_0 = spill629_147;
    spill629_148 = __stackOp629_246_0;
    (__stackOp629_246_0)[1] = "spruce_slab";
    java.lang.String[] __stackOp629_247_0 = spill629_148;
    spill629_149 = __stackOp629_247_0;
    (__stackOp629_247_0)[2] = "birch_slab";
    java.lang.String[] __stackOp629_248_0 = spill629_149;
    spill629_150 = __stackOp629_248_0;
    (__stackOp629_248_0)[3] = "jungle_slab";
    java.lang.String[] __stackOp629_249_0 = spill629_150;
    spill629_151 = __stackOp629_249_0;
    (__stackOp629_249_0)[4] = "acacia_slab";
    java.lang.String[] __stackOp629_250_0 = spill629_151;
    spill629_152 = __stackOp629_250_0;
    (__stackOp629_250_0)[5] = "dark_oak_slab";
    __call629_252(spill629_145, spill629_146, __call629_251(spill629_152));
    spill629_153 = __fieldRead629_253(receiver);
    spill629_154 = __call629_255(__fieldRead629_254());
    java.lang.String[] __stackOp629_256_0 = new java.lang.String[2];
    spill629_155 = __stackOp629_256_0;
    (__stackOp629_256_0)[0] = "cobblestone_wall";
    java.lang.String[] __stackOp629_257_0 = spill629_155;
    spill629_156 = __stackOp629_257_0;
    (__stackOp629_257_0)[1] = "mossy_cobblestone_wall";
    __call629_259(spill629_153, spill629_154, __call629_258(spill629_156));
    spill629_157 = __fieldRead629_260(receiver);
    spill629_158 = __call629_262(__fieldRead629_261());
    java.lang.String[] __stackOp629_263_0 = new java.lang.String[3];
    spill629_159 = __stackOp629_263_0;
    (__stackOp629_263_0)[0] = "anvil_intact";
    java.lang.String[] __stackOp629_264_0 = spill629_159;
    spill629_160 = __stackOp629_264_0;
    (__stackOp629_264_0)[1] = "anvil_slightly_damaged";
    java.lang.String[] __stackOp629_265_0 = spill629_160;
    spill629_161 = __stackOp629_265_0;
    (__stackOp629_265_0)[2] = "anvil_very_damaged";
    __call629_267(spill629_157, spill629_158, __call629_266(spill629_161));
    spill629_162 = __fieldRead629_268(receiver);
    spill629_163 = __call629_270(__fieldRead629_269());
    java.lang.String[] __stackOp629_271_0 = new java.lang.String[3];
    spill629_164 = __stackOp629_271_0;
    (__stackOp629_271_0)[0] = "quartz_block";
    java.lang.String[] __stackOp629_272_0 = spill629_164;
    spill629_165 = __stackOp629_272_0;
    (__stackOp629_272_0)[1] = "chiseled_quartz_block";
    java.lang.String[] __stackOp629_273_0 = spill629_165;
    spill629_166 = __stackOp629_273_0;
    (__stackOp629_273_0)[2] = "quartz_column";
    __call629_275(spill629_162, spill629_163, __call629_274(spill629_166));
    spill629_167 = __fieldRead629_276(receiver);
    spill629_168 = __call629_278(__fieldRead629_277());
    java.lang.String[] __stackOp629_280_0 = new java.lang.String[__invokedynamic629_279(22830, (4344916522321308688L ^ life1_3))];
    spill629_169 = __stackOp629_280_0;
    (__stackOp629_280_0)[0] = "black_stained_hardened_clay";
    java.lang.String[] __stackOp629_281_0 = spill629_169;
    spill629_170 = __stackOp629_281_0;
    (__stackOp629_281_0)[1] = "red_stained_hardened_clay";
    java.lang.String[] __stackOp629_282_0 = spill629_170;
    spill629_171 = __stackOp629_282_0;
    (__stackOp629_282_0)[2] = "green_stained_hardened_clay";
    java.lang.String[] __stackOp629_283_0 = spill629_171;
    spill629_172 = __stackOp629_283_0;
    (__stackOp629_283_0)[3] = "brown_stained_hardened_clay";
    java.lang.String[] __stackOp629_284_0 = spill629_172;
    spill629_173 = __stackOp629_284_0;
    (__stackOp629_284_0)[4] = "blue_stained_hardened_clay";
    java.lang.String[] __stackOp629_285_0 = spill629_173;
    spill629_174 = __stackOp629_285_0;
    (__stackOp629_285_0)[5] = "purple_stained_hardened_clay";
    java.lang.String[] __stackOp629_286_0 = spill629_174;
    spill629_175 = __stackOp629_286_0;
    (__stackOp629_286_0)[__invokedynamic629_287(30242, (1681781847613981452L ^ life1_3))] = "cyan_stained_hardened_clay";
    java.lang.String[] __stackOp629_288_0 = spill629_175;
    spill629_176 = __stackOp629_288_0;
    (__stackOp629_288_0)[__invokedynamic629_289(11141, (1872783907943423662L ^ life1_3))] = "silver_stained_hardened_clay";
    java.lang.String[] __stackOp629_290_0 = spill629_176;
    spill629_177 = __stackOp629_290_0;
    (__stackOp629_290_0)[__invokedynamic629_291(14644, (6468569459961039885L ^ life1_3))] = "gray_stained_hardened_clay";
    java.lang.String[] __stackOp629_292_0 = spill629_177;
    spill629_178 = __stackOp629_292_0;
    (__stackOp629_292_0)[__invokedynamic629_293(1765, (7729831655065596868L ^ life1_3))] = "pink_stained_hardened_clay";
    java.lang.String[] __stackOp629_294_0 = spill629_178;
    spill629_179 = __stackOp629_294_0;
    (__stackOp629_294_0)[__invokedynamic629_295(11027, (7385747411007086140L ^ life1_3))] = "lime_stained_hardened_clay";
    java.lang.String[] __stackOp629_296_0 = spill629_179;
    spill629_180 = __stackOp629_296_0;
    (__stackOp629_296_0)[__invokedynamic629_297(13812, (5125992202231546057L ^ life1_3))] = "yellow_stained_hardened_clay";
    java.lang.String[] __stackOp629_298_0 = spill629_180;
    spill629_181 = __stackOp629_298_0;
    (__stackOp629_298_0)[__invokedynamic629_299(10604, (6360485757867269193L ^ life1_3))] = "light_blue_stained_hardened_clay";
    java.lang.String[] __stackOp629_300_0 = spill629_181;
    spill629_182 = __stackOp629_300_0;
    (__stackOp629_300_0)[__invokedynamic629_301(20406, (736056252770417302L ^ life1_3))] = "magenta_stained_hardened_clay";
    java.lang.String[] __stackOp629_302_0 = spill629_182;
    spill629_183 = __stackOp629_302_0;
    (__stackOp629_302_0)[__invokedynamic629_303(14233, (2848441380543365822L ^ life1_3))] = "orange_stained_hardened_clay";
    java.lang.String[] __stackOp629_304_0 = spill629_183;
    spill629_184 = __stackOp629_304_0;
    (__stackOp629_304_0)[__invokedynamic629_305(25767, (4472782403275673998L ^ life1_3))] = "white_stained_hardened_clay";
    __call629_307(spill629_167, spill629_168, __call629_306(spill629_184));
    spill629_185 = __fieldRead629_308(receiver);
    spill629_186 = __call629_310(__fieldRead629_309());
    java.lang.String[] __stackOp629_312_0 = new java.lang.String[__invokedynamic629_311(22830, (4344916522321308688L ^ life1_3))];
    spill629_187 = __stackOp629_312_0;
    (__stackOp629_312_0)[0] = "black_stained_glass_pane";
    java.lang.String[] __stackOp629_313_0 = spill629_187;
    spill629_188 = __stackOp629_313_0;
    (__stackOp629_313_0)[1] = "red_stained_glass_pane";
    java.lang.String[] __stackOp629_314_0 = spill629_188;
    spill629_189 = __stackOp629_314_0;
    (__stackOp629_314_0)[2] = "green_stained_glass_pane";
    java.lang.String[] __stackOp629_315_0 = spill629_189;
    spill629_190 = __stackOp629_315_0;
    (__stackOp629_315_0)[3] = "brown_stained_glass_pane";
    java.lang.String[] __stackOp629_316_0 = spill629_190;
    spill629_191 = __stackOp629_316_0;
    (__stackOp629_316_0)[4] = "blue_stained_glass_pane";
    java.lang.String[] __stackOp629_317_0 = spill629_191;
    spill629_192 = __stackOp629_317_0;
    (__stackOp629_317_0)[5] = "purple_stained_glass_pane";
    java.lang.String[] __stackOp629_318_0 = spill629_192;
    spill629_193 = __stackOp629_318_0;
    (__stackOp629_318_0)[__invokedynamic629_319(30242, (1681781847613981452L ^ life1_3))] = "cyan_stained_glass_pane";
    java.lang.String[] __stackOp629_320_0 = spill629_193;
    spill629_194 = __stackOp629_320_0;
    (__stackOp629_320_0)[__invokedynamic629_321(11141, (1872783907943423662L ^ life1_3))] = "silver_stained_glass_pane";
    java.lang.String[] __stackOp629_322_0 = spill629_194;
    spill629_195 = __stackOp629_322_0;
    (__stackOp629_322_0)[__invokedynamic629_323(14644, (6468569459961039885L ^ life1_3))] = "gray_stained_glass_pane";
    java.lang.String[] __stackOp629_324_0 = spill629_195;
    spill629_196 = __stackOp629_324_0;
    (__stackOp629_324_0)[__invokedynamic629_325(1765, (7729831655065596868L ^ life1_3))] = "pink_stained_glass_pane";
    java.lang.String[] __stackOp629_326_0 = spill629_196;
    spill629_197 = __stackOp629_326_0;
    (__stackOp629_326_0)[__invokedynamic629_327(11027, (7385747411007086140L ^ life1_3))] = "lime_stained_glass_pane";
    java.lang.String[] __stackOp629_328_0 = spill629_197;
    spill629_198 = __stackOp629_328_0;
    (__stackOp629_328_0)[__invokedynamic629_329(13812, (5125992202231546057L ^ life1_3))] = "yellow_stained_glass_pane";
    java.lang.String[] __stackOp629_330_0 = spill629_198;
    spill629_199 = __stackOp629_330_0;
    (__stackOp629_330_0)[__invokedynamic629_331(10604, (6360485757867269193L ^ life1_3))] = "light_blue_stained_glass_pane";
    java.lang.String[] __stackOp629_332_0 = spill629_199;
    spill629_200 = __stackOp629_332_0;
    (__stackOp629_332_0)[__invokedynamic629_333(20406, (736056252770417302L ^ life1_3))] = "magenta_stained_glass_pane";
    java.lang.String[] __stackOp629_334_0 = spill629_200;
    spill629_201 = __stackOp629_334_0;
    (__stackOp629_334_0)[__invokedynamic629_335(14233, (2848441380543365822L ^ life1_3))] = "orange_stained_glass_pane";
    java.lang.String[] __stackOp629_336_0 = spill629_201;
    spill629_202 = __stackOp629_336_0;
    (__stackOp629_336_0)[__invokedynamic629_337(25767, (4472782403275673998L ^ life1_3))] = "white_stained_glass_pane";
    __call629_339(spill629_185, spill629_186, __call629_338(spill629_202));
    spill629_203 = __fieldRead629_340(receiver);
    spill629_204 = __call629_342(__fieldRead629_341());
    java.lang.String[] __stackOp629_343_0 = new java.lang.String[2];
    spill629_205 = __stackOp629_343_0;
    (__stackOp629_343_0)[0] = "acacia_leaves";
    java.lang.String[] __stackOp629_344_0 = spill629_205;
    spill629_206 = __stackOp629_344_0;
    (__stackOp629_344_0)[1] = "dark_oak_leaves";
    __call629_346(spill629_203, spill629_204, __call629_345(spill629_206));
    spill629_207 = __fieldRead629_347(receiver);
    spill629_208 = __call629_349(__fieldRead629_348());
    java.lang.String[] __stackOp629_350_0 = new java.lang.String[2];
    spill629_209 = __stackOp629_350_0;
    (__stackOp629_350_0)[0] = "acacia_log";
    java.lang.String[] __stackOp629_351_0 = spill629_209;
    spill629_210 = __stackOp629_351_0;
    (__stackOp629_351_0)[1] = "dark_oak_log";
    __call629_353(spill629_207, spill629_208, __call629_352(spill629_210));
    life3_1100 = spill629_40;
    spill629_211 = __fieldRead629_354(receiver);
    spill629_212 = __call629_356(__fieldRead629_355());
    java.lang.String[] __stackOp629_357_0 = new java.lang.String[3];
    spill629_213 = __stackOp629_357_0;
    (__stackOp629_357_0)[0] = "prismarine";
    java.lang.String[] __stackOp629_358_0 = spill629_213;
    spill629_214 = __stackOp629_358_0;
    (__stackOp629_358_0)[1] = "prismarine_bricks";
    java.lang.String[] __stackOp629_359_0 = spill629_214;
    spill629_215 = __stackOp629_359_0;
    (__stackOp629_359_0)[2] = "dark_prismarine";
    __call629_361(spill629_211, spill629_212, __call629_360(spill629_215));
    spill629_216 = __fieldRead629_362(receiver);
    spill629_217 = __call629_364(__fieldRead629_363());
    java.lang.String[] __stackOp629_366_0 = new java.lang.String[__invokedynamic629_365(22830, (4344916522321308688L ^ life1_3))];
    spill629_218 = __stackOp629_366_0;
    (__stackOp629_366_0)[0] = "black_carpet";
    java.lang.String[] __stackOp629_367_0 = spill629_218;
    spill629_219 = __stackOp629_367_0;
    (__stackOp629_367_0)[1] = "red_carpet";
    java.lang.String[] __stackOp629_368_0 = spill629_219;
    spill629_220 = __stackOp629_368_0;
    (__stackOp629_368_0)[2] = "green_carpet";
    java.lang.String[] __stackOp629_369_0 = spill629_220;
    spill629_221 = __stackOp629_369_0;
    (__stackOp629_369_0)[3] = "brown_carpet";
    java.lang.String[] __stackOp629_370_0 = spill629_221;
    spill629_222 = __stackOp629_370_0;
    (__stackOp629_370_0)[4] = "blue_carpet";
    java.lang.String[] __stackOp629_371_0 = spill629_222;
    spill629_223 = __stackOp629_371_0;
    (__stackOp629_371_0)[5] = "purple_carpet";
    java.lang.String[] __stackOp629_372_0 = spill629_223;
    spill629_224 = __stackOp629_372_0;
    (__stackOp629_372_0)[__invokedynamic629_373(30242, (1681781847613981452L ^ life1_3))] = "cyan_carpet";
    java.lang.String[] __stackOp629_374_0 = spill629_224;
    spill629_225 = __stackOp629_374_0;
    (__stackOp629_374_0)[__invokedynamic629_375(11141, (1872783907943423662L ^ life1_3))] = "silver_carpet";
    java.lang.String[] __stackOp629_376_0 = spill629_225;
    spill629_226 = __stackOp629_376_0;
    (__stackOp629_376_0)[__invokedynamic629_377(14644, (6468569459961039885L ^ life1_3))] = "gray_carpet";
    java.lang.String[] __stackOp629_378_0 = spill629_226;
    spill629_227 = __stackOp629_378_0;
    (__stackOp629_378_0)[__invokedynamic629_379(1765, (7729831655065596868L ^ life1_3))] = "pink_carpet";
    java.lang.String[] __stackOp629_380_0 = spill629_227;
    spill629_228 = __stackOp629_380_0;
    (__stackOp629_380_0)[__invokedynamic629_381(11027, (7385747411007086140L ^ life1_3))] = "lime_carpet";
    java.lang.String[] __stackOp629_382_0 = spill629_228;
    spill629_229 = __stackOp629_382_0;
    (__stackOp629_382_0)[__invokedynamic629_383(13812, (5125992202231546057L ^ life1_3))] = "yellow_carpet";
    java.lang.String[] __stackOp629_384_0 = spill629_229;
    spill629_230 = __stackOp629_384_0;
    (__stackOp629_384_0)[__invokedynamic629_385(10604, (6360485757867269193L ^ life1_3))] = "light_blue_carpet";
    java.lang.String[] __stackOp629_386_0 = spill629_230;
    spill629_231 = __stackOp629_386_0;
    (__stackOp629_386_0)[__invokedynamic629_387(20406, (736056252770417302L ^ life1_3))] = "magenta_carpet";
    java.lang.String[] __stackOp629_388_0 = spill629_231;
    spill629_232 = __stackOp629_388_0;
    (__stackOp629_388_0)[__invokedynamic629_389(14233, (2848441380543365822L ^ life1_3))] = "orange_carpet";
    java.lang.String[] __stackOp629_390_0 = spill629_232;
    spill629_233 = __stackOp629_390_0;
    (__stackOp629_390_0)[__invokedynamic629_391(25767, (4472782403275673998L ^ life1_3))] = "white_carpet";
    __call629_393(spill629_216, spill629_217, __call629_392(spill629_233));
    spill629_234 = __fieldRead629_394(receiver);
    spill629_235 = __call629_396(__fieldRead629_395());
    java.lang.String[] __stackOp629_398_0 = new java.lang.String[__invokedynamic629_397(30242, (1681781847613981452L ^ life1_3))];
    spill629_236 = __stackOp629_398_0;
    (__stackOp629_398_0)[0] = "sunflower";
    java.lang.String[] __stackOp629_399_0 = spill629_236;
    spill629_237 = __stackOp629_399_0;
    (__stackOp629_399_0)[1] = "syringa";
    java.lang.String[] __stackOp629_400_0 = spill629_237;
    spill629_238 = __stackOp629_400_0;
    (__stackOp629_400_0)[2] = "double_grass";
    java.lang.String[] __stackOp629_401_0 = spill629_238;
    spill629_239 = __stackOp629_401_0;
    (__stackOp629_401_0)[3] = "double_fern";
    java.lang.String[] __stackOp629_402_0 = spill629_239;
    spill629_240 = __stackOp629_402_0;
    (__stackOp629_402_0)[4] = "double_rose";
    java.lang.String[] __stackOp629_403_0 = spill629_240;
    spill629_241 = __stackOp629_403_0;
    (__stackOp629_403_0)[5] = "paeonia";
    __call629_405(spill629_234, spill629_235, __call629_404(spill629_241));
    spill629_242 = __fieldRead629_406(receiver);
    spill629_243 = __fieldRead629_407();
    java.lang.String[] __stackOp629_408_0 = new java.lang.String[4];
    spill629_244 = __stackOp629_408_0;
    (__stackOp629_408_0)[0] = "bow";
    java.lang.String[] __stackOp629_409_0 = spill629_244;
    spill629_245 = __stackOp629_409_0;
    (__stackOp629_409_0)[1] = "bow_pulling_0";
    java.lang.String[] __stackOp629_410_0 = spill629_245;
    spill629_246 = __stackOp629_410_0;
    (__stackOp629_410_0)[2] = "bow_pulling_1";
    java.lang.String[] __stackOp629_411_0 = spill629_246;
    spill629_247 = __stackOp629_411_0;
    (__stackOp629_411_0)[3] = "bow_pulling_2";
    __call629_413(spill629_242, spill629_243, __call629_412(spill629_247));
    spill629_248 = __fieldRead629_414(receiver);
    spill629_249 = __fieldRead629_415();
    java.lang.String[] __stackOp629_416_0 = new java.lang.String[2];
    spill629_250 = __stackOp629_416_0;
    (__stackOp629_416_0)[0] = "coal";
    java.lang.String[] __stackOp629_417_0 = spill629_250;
    spill629_251 = __stackOp629_417_0;
    (__stackOp629_417_0)[1] = "charcoal";
    __call629_419(spill629_248, spill629_249, __call629_418(spill629_251));
    spill629_252 = __fieldRead629_420(receiver);
    spill629_253 = __fieldRead629_421();
    java.lang.String[] __stackOp629_422_0 = new java.lang.String[2];
    spill629_254 = __stackOp629_422_0;
    (__stackOp629_422_0)[0] = "fishing_rod";
    java.lang.String[] __stackOp629_423_0 = spill629_254;
    spill629_255 = __stackOp629_423_0;
    (__stackOp629_423_0)[1] = "fishing_rod_cast";
    __call629_425(spill629_252, spill629_253, __call629_424(spill629_255));
    spill629_256 = __fieldRead629_426(receiver);
    spill629_257 = __fieldRead629_427();
    java.lang.String[] __stackOp629_428_0 = new java.lang.String[4];
    spill629_258 = __stackOp629_428_0;
    (__stackOp629_428_0)[0] = "cod";
    java.lang.String[] __stackOp629_429_0 = spill629_258;
    spill629_259 = __stackOp629_429_0;
    (__stackOp629_429_0)[1] = "salmon";
    java.lang.String[] __stackOp629_430_0 = spill629_259;
    spill629_260 = __stackOp629_430_0;
    (__stackOp629_430_0)[2] = "clownfish";
    java.lang.String[] __stackOp629_431_0 = spill629_260;
    spill629_261 = __stackOp629_431_0;
    (__stackOp629_431_0)[3] = "pufferfish";
    __call629_433(spill629_256, spill629_257, __call629_432(spill629_261));
    spill629_262 = __fieldRead629_434(receiver);
    spill629_263 = __fieldRead629_435();
    java.lang.String[] __stackOp629_436_0 = new java.lang.String[2];
    spill629_264 = __stackOp629_436_0;
    (__stackOp629_436_0)[0] = "cooked_cod";
    java.lang.String[] __stackOp629_437_0 = spill629_264;
    spill629_265 = __stackOp629_437_0;
    (__stackOp629_437_0)[1] = "cooked_salmon";
    __call629_439(spill629_262, spill629_263, __call629_438(spill629_265));
    spill629_266 = __fieldRead629_440(receiver);
    spill629_267 = __fieldRead629_441();
    java.lang.String[] __stackOp629_443_0 = new java.lang.String[__invokedynamic629_442(22830, (4344916522321308688L ^ life1_3))];
    spill629_268 = __stackOp629_443_0;
    (__stackOp629_443_0)[0] = "dye_black";
    java.lang.String[] __stackOp629_444_0 = spill629_268;
    spill629_269 = __stackOp629_444_0;
    (__stackOp629_444_0)[1] = "dye_red";
    java.lang.String[] __stackOp629_445_0 = spill629_269;
    spill629_270 = __stackOp629_445_0;
    (__stackOp629_445_0)[2] = "dye_green";
    java.lang.String[] __stackOp629_446_0 = spill629_270;
    spill629_271 = __stackOp629_446_0;
    (__stackOp629_446_0)[3] = "dye_brown";
    java.lang.String[] __stackOp629_447_0 = spill629_271;
    spill629_272 = __stackOp629_447_0;
    (__stackOp629_447_0)[4] = "dye_blue";
    java.lang.String[] __stackOp629_448_0 = spill629_272;
    spill629_273 = __stackOp629_448_0;
    (__stackOp629_448_0)[5] = "dye_purple";
    java.lang.String[] __stackOp629_449_0 = spill629_273;
    spill629_274 = __stackOp629_449_0;
    (__stackOp629_449_0)[__invokedynamic629_450(30242, (1681781847613981452L ^ life1_3))] = "dye_cyan";
    java.lang.String[] __stackOp629_451_0 = spill629_274;
    spill629_275 = __stackOp629_451_0;
    (__stackOp629_451_0)[__invokedynamic629_452(11141, (1872783907943423662L ^ life1_3))] = "dye_silver";
    java.lang.String[] __stackOp629_453_0 = spill629_275;
    spill629_276 = __stackOp629_453_0;
    (__stackOp629_453_0)[__invokedynamic629_454(14644, (6468569459961039885L ^ life1_3))] = "dye_gray";
    java.lang.String[] __stackOp629_455_0 = spill629_276;
    spill629_277 = __stackOp629_455_0;
    (__stackOp629_455_0)[__invokedynamic629_456(1765, (7729831655065596868L ^ life1_3))] = "dye_pink";
    java.lang.String[] __stackOp629_457_0 = spill629_277;
    spill629_278 = __stackOp629_457_0;
    (__stackOp629_457_0)[__invokedynamic629_458(11027, (7385747411007086140L ^ life1_3))] = "dye_lime";
    java.lang.String[] __stackOp629_459_0 = spill629_278;
    spill629_279 = __stackOp629_459_0;
    (__stackOp629_459_0)[__invokedynamic629_460(13812, (5125992202231546057L ^ life1_3))] = "dye_yellow";
    java.lang.String[] __stackOp629_461_0 = spill629_279;
    spill629_280 = __stackOp629_461_0;
    (__stackOp629_461_0)[__invokedynamic629_462(10604, (6360485757867269193L ^ life1_3))] = "dye_light_blue";
    java.lang.String[] __stackOp629_463_0 = spill629_280;
    spill629_281 = __stackOp629_463_0;
    (__stackOp629_463_0)[__invokedynamic629_464(20406, (736056252770417302L ^ life1_3))] = "dye_magenta";
    java.lang.String[] __stackOp629_465_0 = spill629_281;
    spill629_282 = __stackOp629_465_0;
    (__stackOp629_465_0)[__invokedynamic629_466(14233, (2848441380543365822L ^ life1_3))] = "dye_orange";
    java.lang.String[] __stackOp629_467_0 = spill629_282;
    spill629_283 = __stackOp629_467_0;
    (__stackOp629_467_0)[__invokedynamic629_468(25767, (4472782403275673998L ^ life1_3))] = "dye_white";
    __call629_470(spill629_266, spill629_267, __call629_469(spill629_283));
    spill629_284 = __fieldRead629_471(receiver);
    spill629_285 = __fieldRead629_472();
    java.lang.String[] __stackOp629_473_0 = new java.lang.String[2];
    spill629_286 = __stackOp629_473_0;
    (__stackOp629_473_0)[0] = "bottle_drinkable";
    java.lang.String[] __stackOp629_474_0 = spill629_286;
    spill629_287 = __stackOp629_474_0;
    (__stackOp629_474_0)[1] = "bottle_splash";
    __call629_476(spill629_284, spill629_285, __call629_475(spill629_287));
    spill629_288 = __fieldRead629_477(receiver);
    spill629_289 = __fieldRead629_478();
    java.lang.String[] __stackOp629_479_0 = new java.lang.String[5];
    spill629_290 = __stackOp629_479_0;
    (__stackOp629_479_0)[0] = "skull_skeleton";
    java.lang.String[] __stackOp629_480_0 = spill629_290;
    spill629_291 = __stackOp629_480_0;
    (__stackOp629_480_0)[1] = "skull_wither";
    java.lang.String[] __stackOp629_481_0 = spill629_291;
    spill629_292 = __stackOp629_481_0;
    (__stackOp629_481_0)[2] = "skull_zombie";
    java.lang.String[] __stackOp629_482_0 = spill629_292;
    spill629_293 = __stackOp629_482_0;
    (__stackOp629_482_0)[3] = "skull_char";
    java.lang.String[] __stackOp629_483_0 = spill629_293;
    spill629_294 = __stackOp629_483_0;
    (__stackOp629_483_0)[4] = "skull_creeper";
    __call629_485(spill629_288, spill629_289, __call629_484(spill629_294));
    spill629_295 = __fieldRead629_486(receiver);
    spill629_296 = __call629_488(__fieldRead629_487());
    java.lang.String[] __stackOp629_489_0 = new java.lang.String[1];
    spill629_297 = __stackOp629_489_0;
    (__stackOp629_489_0)[0] = "oak_fence_gate";
    __call629_491(spill629_295, spill629_296, __call629_490(spill629_297));
    spill629_298 = __fieldRead629_492(receiver);
    spill629_299 = __call629_494(__fieldRead629_493());
    java.lang.String[] __stackOp629_495_0 = new java.lang.String[1];
    spill629_300 = __stackOp629_495_0;
    (__stackOp629_495_0)[0] = "oak_fence";
    __call629_497(spill629_298, spill629_299, __call629_496(spill629_300));
    spill629_301 = __fieldRead629_498(receiver);
    spill629_302 = __fieldRead629_499();
    java.lang.String[] __stackOp629_500_0 = new java.lang.String[1];
    spill629_303 = __stackOp629_500_0;
    (__stackOp629_500_0)[0] = "oak_door";
    __call629_502(spill629_301, spill629_302, __call629_501(spill629_303));
    life4_1573 = __call629_505(__call629_504(__fieldRead629_503()));
    forest_cycle_1574: while (true) {
    if (!(__call629_506(life4_1573))) {
        break forest_join_1599;
    }
    life5_1580 = __cast629_508(__call629_507(life4_1573));
    __call629_518(__fieldRead629_509(receiver), __cast629_513(__call629_512(__cast629_511(__call629_510(life5_1580)))), __call629_517(__call629_516(__cast629_515(__call629_514(life5_1580)))));
    if (!((life3_1100 != 0))) {
        break forest_join_1602;
    }
    if (!((life3_1100 == 0))) {
        continue forest_cycle_1574;
    }
    break forest_cycle_1574;
    }
    }
    __call629_519();
    __call629_520(receiver);
    }
    return;
}
public static void h629_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062900_0(p0);
}
private static native long __fieldRead629_0() throws Throwable;
private static native java.util.Map __fieldRead629_1(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native void __call629_2(java.util.Map a0) throws Throwable;
private static native java.util.Map __fieldRead629_3(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_4() throws Throwable;
private static native net.minecraft.item.Item __call629_5(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic629_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_14(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_15(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_16(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_17(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_18() throws Throwable;
private static native net.minecraft.item.Item __call629_19(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_23(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_24(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_25(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_26() throws Throwable;
private static native net.minecraft.item.Item __call629_27(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic629_28(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_35(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_36(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_37(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_38() throws Throwable;
private static native net.minecraft.item.Item __call629_39(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic629_40(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_47(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_48(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_49(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.dx __fieldRead629_50() throws Throwable;
private static native net.minecraft.item.Item __call629_51(moom.dx a0) throws Throwable;
private static native java.util.ArrayList __call629_54(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_55(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_56(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_57() throws Throwable;
private static native net.minecraft.item.Item __call629_58(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_63(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_64(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native int __call629_65() throws Throwable;
private static native java.util.Map __fieldRead629_66(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.dH __fieldRead629_67() throws Throwable;
private static native net.minecraft.item.Item __call629_68(moom.dH a0) throws Throwable;
private static native java.util.ArrayList __call629_73(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_74(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_75(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_76() throws Throwable;
private static native net.minecraft.item.Item __call629_77(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_80(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_81(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_82(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_83() throws Throwable;
private static native net.minecraft.item.Item __call629_84(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_88(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_89(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_90(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_91() throws Throwable;
private static native net.minecraft.item.Item __call629_92(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_96(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_97(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_98(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.cI __fieldRead629_99() throws Throwable;
private static native net.minecraft.item.Item __call629_100(moom.cI a0) throws Throwable;
private static native java.util.ArrayList __call629_104(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_105(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_106(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.cy __fieldRead629_107() throws Throwable;
private static native net.minecraft.item.Item __call629_108(moom.cy a0) throws Throwable;
private static native java.util.ArrayList __call629_110(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_111(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_112(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_113() throws Throwable;
private static native net.minecraft.item.Item __call629_114(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic629_115(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_123(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_125(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_127(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_129(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_131(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_133(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_135(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_137(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_139(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_141(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_142(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_143(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_144(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.cA __fieldRead629_145() throws Throwable;
private static native net.minecraft.item.Item __call629_146(moom.cA a0) throws Throwable;
private static native java.util.ArrayList __call629_148(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_149(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_150(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.cA __fieldRead629_151() throws Throwable;
private static native net.minecraft.item.Item __call629_152(moom.cA a0) throws Throwable;
private static native int __invokedynamic629_153(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_161(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_163(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_165(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_166(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_167(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_168(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.ei __fieldRead629_169() throws Throwable;
private static native net.minecraft.item.Item __call629_170(moom.ei a0) throws Throwable;
private static native int __invokedynamic629_171(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_179(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_180(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_181(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_182(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.ei __fieldRead629_183() throws Throwable;
private static native net.minecraft.item.Item __call629_184(moom.ei a0) throws Throwable;
private static native java.util.ArrayList __call629_186(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_187(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_188(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.ct __fieldRead629_189() throws Throwable;
private static native net.minecraft.item.Item __call629_190(moom.ct a0) throws Throwable;
private static native int __invokedynamic629_191(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_199(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_201(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_203(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_205(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_207(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_209(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_211(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_213(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_215(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_217(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_218(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_219(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_220(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_221() throws Throwable;
private static native net.minecraft.item.Item __call629_222(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic629_223(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_230(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_231(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_232(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_233() throws Throwable;
private static native net.minecraft.item.Item __call629_234(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_239(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_240(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_241(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.ei __fieldRead629_242() throws Throwable;
private static native net.minecraft.item.Item __call629_243(moom.ei a0) throws Throwable;
private static native int __invokedynamic629_244(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_251(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_252(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_253(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_254() throws Throwable;
private static native net.minecraft.item.Item __call629_255(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_258(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_259(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_260(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_261() throws Throwable;
private static native net.minecraft.item.Item __call629_262(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_266(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_267(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_268(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_269() throws Throwable;
private static native net.minecraft.item.Item __call629_270(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_274(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_275(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_276(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_277() throws Throwable;
private static native net.minecraft.item.Item __call629_278(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic629_279(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_287(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_289(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_291(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_293(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_295(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_297(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_299(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_301(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_303(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_305(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_306(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_307(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_308(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.dW __fieldRead629_309() throws Throwable;
private static native net.minecraft.item.Item __call629_310(moom.dW a0) throws Throwable;
private static native int __invokedynamic629_311(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_319(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_321(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_323(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_325(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_327(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_329(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_331(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_333(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_335(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_337(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_338(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_339(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_340(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.dH __fieldRead629_341() throws Throwable;
private static native net.minecraft.item.Item __call629_342(moom.dH a0) throws Throwable;
private static native java.util.ArrayList __call629_345(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_346(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_347(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_348() throws Throwable;
private static native net.minecraft.item.Item __call629_349(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_352(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_353(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_354(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_355() throws Throwable;
private static native net.minecraft.item.Item __call629_356(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_360(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_361(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_362(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_363() throws Throwable;
private static native net.minecraft.item.Item __call629_364(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic629_365(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_373(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_375(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_377(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_379(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_381(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_383(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_385(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_387(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_389(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_391(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_392(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_393(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_394(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.cz __fieldRead629_395() throws Throwable;
private static native net.minecraft.item.Item __call629_396(moom.cz a0) throws Throwable;
private static native int __invokedynamic629_397(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_404(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_405(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_406(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.ItemBow __fieldRead629_407() throws Throwable;
private static native java.util.ArrayList __call629_412(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_413(java.util.Map a0, net.minecraft.item.ItemBow a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_414(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead629_415() throws Throwable;
private static native java.util.ArrayList __call629_418(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_419(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_420(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.xn __fieldRead629_421() throws Throwable;
private static native java.util.ArrayList __call629_424(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_425(java.util.Map a0, moom.xn a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_426(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead629_427() throws Throwable;
private static native java.util.ArrayList __call629_432(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_433(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_434(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead629_435() throws Throwable;
private static native java.util.ArrayList __call629_438(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_439(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_440(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead629_441() throws Throwable;
private static native int __invokedynamic629_442(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_450(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_452(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_454(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_456(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_458(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_460(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_462(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_464(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_466(int a0, long a1) throws Throwable;
private static native int __invokedynamic629_468(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call629_469(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_470(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_471(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.ItemPotion __fieldRead629_472() throws Throwable;
private static native java.util.ArrayList __call629_475(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_476(java.util.Map a0, net.minecraft.item.ItemPotion a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_477(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead629_478() throws Throwable;
private static native java.util.ArrayList __call629_484(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_485(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_486(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_487() throws Throwable;
private static native net.minecraft.item.Item __call629_488(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_490(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_491(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_492(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead629_493() throws Throwable;
private static native net.minecraft.item.Item __call629_494(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.ArrayList __call629_496(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_497(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_498(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead629_499() throws Throwable;
private static native java.util.ArrayList __call629_501(java.lang.String[] a0) throws Throwable;
private static native java.lang.Object __call629_502(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native java.util.Map __fieldRead629_503() throws Throwable;
private static native java.util.Set __call629_504(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call629_505(java.util.Set a0) throws Throwable;
private static native boolean __call629_506(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call629_507(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast629_508(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead629_509(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call629_510(java.util.Map.Entry a0) throws Throwable;
private static native moom.I7 __cast629_511(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call629_512(moom.I7 a0) throws Throwable;
private static native net.minecraft.item.Item __cast629_513(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call629_514(java.util.Map.Entry a0) throws Throwable;
private static native java.util.Set __cast629_515(java.lang.Object a0) throws Throwable;
private static native java.util.Iterator __call629_516(java.util.Set a0) throws Throwable;
private static native java.util.ArrayList __call629_517(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call629_518(java.util.Map a0, net.minecraft.item.Item a1, java.util.ArrayList a2) throws Throwable;
private static native void __call629_519() throws Throwable;
private static native void __call629_520(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Exception __call3062900_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_276bc08a234c1581a94f(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_276bc08a234c1581a94f {

public static void f1080(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1080_55_0;
    int forestValue1080_89_0;
    java.util.Iterator forestValue1080_111_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1080_142_0;
    int forestValue1080_151_0;
    net.minecraft.client.resources.model.ModelBakery forestValue1080_164_0;
    java.lang.Object forestValue1080_181_0;
    net.minecraft.client.renderer.block.model.ModelBlock forestValue1080_206_0;
    int forestValue1080_215_0;
    net.minecraft.client.resources.model.ModelBakery forestValue1080_228_0;
    int spill1080_0;
    java.util.Iterator spill1080_1;
    net.minecraft.client.renderer.block.model.ModelBlock spill1080_2;
    int spill1080_3;
    net.minecraft.client.renderer.block.model.ModelBlock spill1080_4;
    boolean spill1080_5;
    net.minecraft.client.resources.model.ModelBakery spill1080_6;
    net.minecraft.client.renderer.block.model.ModelBlock spill1080_7;
    boolean spill1080_8;
    net.minecraft.client.resources.model.ModelBakery spill1080_9;
    java.lang.Object spill1080_10;
    long life1_3;
    java.util.Iterator life4_9;
    int life3_10;
    moom.DE life5_19;
    net.minecraft.client.resources.model.WeightedBakedModel$Builder life6_23;
    int life7_25;
    java.util.Iterator life8_36;
    moom.l2 life9_45;
    net.minecraft.client.renderer.block.model.ModelBlock life10_52;
    java.util.Iterator life4_139;
    java.util.Map.Entry life5_149;
    moom.DD life6_153;
    moom.DE life7_161;
    net.minecraft.client.renderer.block.model.ModelBlock life8_167;
    java.util.Map.Entry life5_229;
    moom.DD life6_233;
    moom.DE life7_241;
    net.minecraft.client.renderer.block.model.ModelBlock life8_247;
    forest_join_251: {
    forest_join_181: {
    forest_join_111: {
    forest_join_107: {
    life1_3 = (__fieldRead1080_0() ^ 33066656496630L);
    spill1080_0 = __call1080_1();
    life4_9 = __call1080_4(__call1080_3(__fieldRead1080_2(receiver)));
    life3_10 = spill1080_0;
    forest_cycle_11: while (true) {
    forest_join_105: {
    forest_join_99: {
    forest_join_89: {
    forest_join_88: {
    forest_join_78: {
    if (!(__call1080_5(life4_9))) {
        break forest_join_107;
    }
    life5_19 = __cast1080_7(__call1080_6(life4_9));
    life6_23 = new net.minecraft.client.resources.model.WeightedBakedModel$Builder();
    life7_25 = 0;
    spill1080_1 = __call1080_12(__call1080_11(__cast1080_10(__call1080_9(__fieldRead1080_8(receiver), life5_19))));
    if (!((life3_10 == 0))) {
        forestValue1080_111_0 = spill1080_1;
        break forest_join_111;
    }
    life8_36 = spill1080_1;
    forest_cycle_34: while (true) {
    forest_join_76: {
    forest_join_72: {
    forest_join_55: {
    if (!(__call1080_13(life8_36))) {
        break forest_join_78;
    }
    life9_45 = __cast1080_15(__call1080_14(life8_36));
    life10_52 = __cast1080_19(__call1080_18(__fieldRead1080_16(receiver), __call1080_17(life9_45)));
    spill1080_2 = life10_52;
    if (!((life3_10 == 0))) {
        forestValue1080_181_0 = spill1080_2;
        break forest_join_181;
    }
    if (!((life3_10 == 0))) {
        forestValue1080_55_0 = spill1080_2;
        break forest_join_55;
    }
    if (!((spill1080_2 != null))) {
        break forest_join_72;
    }
    forestValue1080_55_0 = life10_52;
    }
    if (!(__call1080_20(forestValue1080_55_0))) {
        break forest_join_72;
    }
    life7_25 += 1;
    __call1080_25(life6_23, __call1080_23(receiver, life10_52, __call1080_21(life9_45), __call1080_22(life9_45)), __call1080_24(life9_45));
    if (!((life3_10 != 0))) {
        break forest_join_76;
    }
    }
    __call1080_28(__fieldRead1080_26(), __invokedynamic1080_27(life5_19));
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    }
    spill1080_3 = life7_25;
    if (!((life3_10 == 0))) {
        forestValue1080_89_0 = spill1080_3;
        break forest_join_89;
    }
    if (!((spill1080_3 == 0))) {
        break forest_join_88;
    }
    __call1080_31(__fieldRead1080_29(), __invokedynamic1080_30(life5_19));
    if (!((life3_10 != 0))) {
        break forest_join_105;
    }
    }
    forestValue1080_89_0 = life7_25;
    }
    if (!((forestValue1080_89_0 == 1))) {
        break forest_join_99;
    }
    __call1080_34(__fieldRead1080_32(receiver), life5_19, __call1080_33(life6_23));
    if (!((life3_10 != 0))) {
        break forest_join_105;
    }
    }
    __call1080_37(__fieldRead1080_35(receiver), life5_19, __call1080_36(life6_23));
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    forestValue1080_111_0 = __call1080_40(__call1080_39(__fieldRead1080_38(receiver)));
    }
    life4_139 = forestValue1080_111_0;
    forest_cycle_112: while (true) {
    forest_join_178: {
    forest_join_174: {
    forest_join_164: {
    forest_join_163: {
    forest_join_151: {
    forest_join_142: {
    if (!(__call1080_41(life4_139))) {
        break forest_join_251;
    }
    life5_149 = __cast1080_43(__call1080_42(life4_139));
    life6_153 = __cast1080_45(__call1080_44(life5_149));
    life7_161 = new moom.DE(__cast1080_47(__call1080_46(life5_149)), "inventory");
    life8_167 = __cast1080_50(__call1080_49(__fieldRead1080_48(receiver), life6_153));
    spill1080_4 = life8_167;
    if (!((life3_10 == 0))) {
        forestValue1080_142_0 = spill1080_4;
        break forest_join_142;
    }
    if (!((spill1080_4 != null))) {
        break forest_join_174;
    }
    forestValue1080_142_0 = life8_167;
    }
    spill1080_5 = __call1080_51(forestValue1080_142_0);
    if (!((life3_10 == 0))) {
        forestValue1080_151_0 = __integerCategory1080_52(spill1080_5);
        break forest_join_151;
    }
    if (!(spill1080_5)) {
        break forest_join_174;
    }
    spill1080_6 = receiver;
    if (!((life3_10 == 0))) {
        forestValue1080_164_0 = spill1080_6;
        break forest_join_164;
    }
    forestValue1080_151_0 = __integerCategory1080_54(__call1080_53(spill1080_6, life8_167));
    }
    if (!((forestValue1080_151_0 != 0))) {
        break forest_join_163;
    }
    __call1080_57(__fieldRead1080_55(receiver), life7_161, new net.minecraft.client.resources.model.BuiltInModel(__call1080_56(life8_167)));
    if (!((life3_10 != 0))) {
        break forest_join_178;
    }
    }
    forestValue1080_164_0 = receiver;
    }
    __call1080_61(__fieldRead1080_58(forestValue1080_164_0), life7_161, __call1080_60(receiver, life8_167, __fieldRead1080_59(), 0));
    if (!((life3_10 != 0))) {
        break forest_join_178;
    }
    }
    __call1080_64(__fieldRead1080_62(), __invokedynamic1080_63(life6_153));
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_112;
    }
    break forest_cycle_112;
    }
    break forest_join_251;
    }
    forest_cycle_181: while (true) {
    forest_join_245: {
    forest_join_242: {
    forest_join_238: {
    forest_join_228: {
    forest_join_227: {
    forest_join_215: {
    forest_join_206: {
    life5_229 = __cast1080_65(forestValue1080_181_0);
    life6_233 = __cast1080_67(__call1080_66(life5_229));
    life7_241 = new moom.DE(__cast1080_69(__call1080_68(life5_229)), "inventory");
    life8_247 = __cast1080_72(__call1080_71(__fieldRead1080_70(receiver), life6_233));
    spill1080_7 = life8_247;
    if (!((life3_10 == 0))) {
        forestValue1080_206_0 = spill1080_7;
        break forest_join_206;
    }
    if (!((spill1080_7 != null))) {
        break forest_join_238;
    }
    forestValue1080_206_0 = life8_247;
    }
    spill1080_8 = __call1080_73(forestValue1080_206_0);
    if (!((life3_10 == 0))) {
        forestValue1080_215_0 = __integerCategory1080_74(spill1080_8);
        break forest_join_215;
    }
    if (!(spill1080_8)) {
        break forest_join_238;
    }
    spill1080_9 = receiver;
    if (!((life3_10 == 0))) {
        forestValue1080_228_0 = spill1080_9;
        break forest_join_228;
    }
    forestValue1080_215_0 = __integerCategory1080_76(__call1080_75(spill1080_9, life8_247));
    }
    if (!((forestValue1080_215_0 != 0))) {
        break forest_join_227;
    }
    __call1080_79(__fieldRead1080_77(receiver), life7_241, new net.minecraft.client.resources.model.BuiltInModel(__call1080_78(life8_247)));
    if (!((life3_10 != 0))) {
        break forest_join_242;
    }
    }
    forestValue1080_228_0 = receiver;
    }
    __call1080_83(__fieldRead1080_80(forestValue1080_228_0), life7_241, __call1080_82(receiver, life8_247, __fieldRead1080_81(), 0));
    if (!((life3_10 != 0))) {
        break forest_join_242;
    }
    }
    __call1080_86(__fieldRead1080_84(), __invokedynamic1080_85(life6_233));
    }
    if (!((life3_10 != 0))) {
        break forest_join_245;
    }
    break forest_join_251;
    }
    if (!(__call1080_87(life4_9))) {
        break forest_join_251;
    }
    spill1080_10 = __call1080_88(life4_9);
    forestValue1080_181_0 = spill1080_10;
    continue forest_cycle_181;
    }
    }
    return;
}
public static void h1080_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108000_0(p0);
}
public static void h1080_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108001_0(p0);
}
public static void h1080_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108002_0(p0);
}
public static void h1080_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108003_0(p0);
}
public static void h1080_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108004_0(p0);
}
public static void h1080_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108005_0(p0);
}
public static void h1080_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108006_0(p0);
}
public static void h1080_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108007_0(p0);
}
public static void h1080_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108008_0(p0);
}
public static void h1080_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108009_0(p0);
}
public static void h1080_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108010_0(p0);
}
public static void h1080_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108011_0(p0);
}
public static void h1080_12(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108012_0(p0);
}
public static void h1080_13(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108013_0(p0);
}
public static void h1080_14(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108014_0(p0);
}
public static void h1080_15(java.lang.RuntimeException p0) throws Throwable {
    throw __call3108015_0(p0);
}
private static native long __fieldRead1080_0() throws Throwable;
private static native int __call1080_1() throws Throwable;
private static native java.util.Map __fieldRead1080_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Set __call1080_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1080_4(java.util.Set a0) throws Throwable;
private static native boolean __call1080_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1080_6(java.util.Iterator a0) throws Throwable;
private static native moom.DE __cast1080_7(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1080_8(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1080_9(java.util.Map a0, moom.DE a1) throws Throwable;
private static native moom.l4 __cast1080_10(java.lang.Object a0) throws Throwable;
private static native java.util.List __call1080_11(moom.l4 a0) throws Throwable;
private static native java.util.Iterator __call1080_12(java.util.List a0) throws Throwable;
private static native boolean __call1080_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1080_14(java.util.Iterator a0) throws Throwable;
private static native moom.l2 __cast1080_15(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1080_16(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.DD __call1080_17(moom.l2 a0) throws Throwable;
private static native java.lang.Object __call1080_18(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1080_19(java.lang.Object a0) throws Throwable;
private static native boolean __call1080_20(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.resources.model.ModelRotation __call1080_21(moom.l2 a0) throws Throwable;
private static native boolean __call1080_22(moom.l2 a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1080_23(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1, net.minecraft.client.resources.model.ModelRotation a2, boolean a3) throws Throwable;
private static native int __call1080_24(moom.l2 a0) throws Throwable;
private static native net.minecraft.client.resources.model.WeightedBakedModel$Builder __call1080_25(net.minecraft.client.resources.model.WeightedBakedModel$Builder a0, net.minecraft.client.resources.model.IBakedModel a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1080_26() throws Throwable;
private static native java.lang.String __invokedynamic1080_27(moom.DE a0) throws Throwable;
private static native void __call1080_28(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1080_29() throws Throwable;
private static native java.lang.String __invokedynamic1080_30(moom.DE a0) throws Throwable;
private static native void __call1080_31(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.Dy __fieldRead1080_32(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1080_33(net.minecraft.client.resources.model.WeightedBakedModel$Builder a0) throws Throwable;
private static native void __call1080_34(moom.Dy a0, moom.DE a1, net.minecraft.client.resources.model.IBakedModel a2) throws Throwable;
private static native moom.Dy __fieldRead1080_35(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.pu __call1080_36(net.minecraft.client.resources.model.WeightedBakedModel$Builder a0) throws Throwable;
private static native void __call1080_37(moom.Dy a0, moom.DE a1, moom.pu a2) throws Throwable;
private static native java.util.Map __fieldRead1080_38(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Set __call1080_39(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1080_40(java.util.Set a0) throws Throwable;
private static native boolean __call1080_41(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1080_42(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast1080_43(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1080_44(java.util.Map.Entry a0) throws Throwable;
private static native moom.DD __cast1080_45(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1080_46(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast1080_47(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1080_48(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1080_49(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1080_50(java.lang.Object a0) throws Throwable;
private static native boolean __call1080_51(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native int __integerCategory1080_52(boolean value) throws Throwable;
private static native boolean __call1080_53(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native int __integerCategory1080_54(boolean value) throws Throwable;
private static native moom.Dy __fieldRead1080_55(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.lP __call1080_56(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native void __call1080_57(moom.Dy a0, moom.DE a1, net.minecraft.client.resources.model.BuiltInModel a2) throws Throwable;
private static native moom.Dy __fieldRead1080_58(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.client.resources.model.ModelRotation __fieldRead1080_59() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1080_60(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1, net.minecraft.client.resources.model.ModelRotation a2, int a3) throws Throwable;
private static native void __call1080_61(moom.Dy a0, moom.DE a1, net.minecraft.client.resources.model.IBakedModel a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1080_62() throws Throwable;
private static native java.lang.String __invokedynamic1080_63(moom.DD a0) throws Throwable;
private static native void __call1080_64(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.Map.Entry __cast1080_65(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1080_66(java.util.Map.Entry a0) throws Throwable;
private static native moom.DD __cast1080_67(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1080_68(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast1080_69(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1080_70(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1080_71(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1080_72(java.lang.Object a0) throws Throwable;
private static native boolean __call1080_73(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native int __integerCategory1080_74(boolean value) throws Throwable;
private static native boolean __call1080_75(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native int __integerCategory1080_76(boolean value) throws Throwable;
private static native moom.Dy __fieldRead1080_77(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native moom.lP __call1080_78(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native void __call1080_79(moom.Dy a0, moom.DE a1, net.minecraft.client.resources.model.BuiltInModel a2) throws Throwable;
private static native moom.Dy __fieldRead1080_80(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native net.minecraft.client.resources.model.ModelRotation __fieldRead1080_81() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1080_82(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1, net.minecraft.client.resources.model.ModelRotation a2, int a3) throws Throwable;
private static native void __call1080_83(moom.Dy a0, moom.DE a1, net.minecraft.client.resources.model.IBakedModel a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1080_84() throws Throwable;
private static native java.lang.String __invokedynamic1080_85(moom.DD a0) throws Throwable;
private static native void __call1080_86(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call1080_87(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1080_88(java.util.Iterator a0) throws Throwable;
private static native java.lang.Exception __call3108000_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108001_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108002_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108003_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108004_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108005_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108006_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108007_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108008_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108009_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108010_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108011_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108012_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108013_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108014_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3108015_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9e35048239a6c9745cfe(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_9e35048239a6c9745cfe {

public static void f1443(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    int spill1443_0;
    long life1_3;
    int life3_7;
    java.util.Iterator life4_12;
    net.minecraft.client.renderer.block.model.ModelBlock life5_19;
    lexical_join_31: {
    lexical_join_28: {
    life1_3 = (__fieldRead1443_0() ^ 15973278535747L);
    spill1443_0 = __call1443_1();
    __call1443_2(receiver);
    life3_7 = spill1443_0;
    life4_12 = __call1443_5(__call1443_4(__fieldRead1443_3(receiver)));
    lexical_cycle_13: while (true) {
    if (!(__call1443_6(life4_12))) {
        break lexical_join_28;
    }
    life5_19 = __cast1443_8(__call1443_7(life4_12));
    __call1443_10(life5_19, __fieldRead1443_9(receiver));
    if (!((life3_7 == 0))) {
        break lexical_join_31;
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    __call1443_12(__fieldRead1443_11(receiver));
    }
    return;
}
public static void h1443_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1144300_0(p0);
}
private static native long __fieldRead1443_0() throws Throwable;
private static native int __call1443_1() throws Throwable;
private static native void __call1443_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Map __fieldRead1443_3(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Collection __call1443_4(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1443_5(java.util.Collection a0) throws Throwable;
private static native boolean __call1443_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1443_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1443_8(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1443_9(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native void __call1443_10(net.minecraft.client.renderer.block.model.ModelBlock a0, java.util.Map a1) throws Throwable;
private static native java.util.Map __fieldRead1443_11(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native void __call1443_12(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call1144300_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4fef8b5e31fbd99a69ea(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_4fef8b5e31fbd99a69ea {

public static void f100202(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    net.minecraft.client.resources.model.ModelBakery forestValue100202_60_0;
    int forestValue100202_83_0;
    moom.DD forestValue100202_91_0;
    net.minecraft.client.resources.model.ModelBakery forestValue100202_102_0;
    int forestValue100202_125_0;
    int spill100202_0;
    moom.DD spill100202_1;
    net.minecraft.client.resources.model.ModelBakery spill100202_2;
    boolean spill100202_3;
    net.minecraft.client.resources.model.ModelBakery spill100202_4;
    boolean spill100202_5;
    moom.DD spill100202_6;
    long life1_3;
    java.util.ArrayDeque life4_5;
    java.util.HashSet life5_7;
    java.util.Iterator life6_13;
    int life3_14;
    moom.DD life7_23;
    moom.DD life8_34;
    moom.DD life6_58;
    net.minecraft.client.renderer.block.model.ModelBlock life7_75;
    moom.DD life8_84;
    moom.DD life6_112;
    net.minecraft.client.renderer.block.model.ModelBlock life7_129;
    moom.DD life8_138;
    forest_join_140: {
    forest_join_91: {
    forest_join_43: {
    life1_3 = (__fieldRead100202_0() ^ 113574316453092L);
    life4_5 = __call100202_1();
    life5_7 = __call100202_2();
    spill100202_0 = __call100202_3();
    life6_13 = __call100202_6(__call100202_5(__fieldRead100202_4(receiver)));
    life3_14 = spill100202_0;
    forest_cycle_15: while (true) {
    forest_join_41: {
    if (!(__call100202_7(life6_13))) {
        break forest_join_43;
    }
    life7_23 = __cast100202_9(__call100202_8(life6_13));
    __call100202_10(life5_7, life7_23);
    life8_34 = __call100202_14(__cast100202_13(__call100202_12(__fieldRead100202_11(receiver), life7_23)));
    spill100202_1 = life8_34;
    if (!((life3_14 != 0))) {
        forestValue100202_91_0 = spill100202_1;
        break forest_join_91;
    }
    if (!((spill100202_1 != null))) {
        break forest_join_41;
    }
    __call100202_15(life4_5, life8_34);
    }
    if (!((life3_14 == 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    forest_cycle_43: while (true) {
    forest_join_84: {
    forest_join_83: {
    forest_join_60: {
    forest_join_59: {
    if (!((!__call100202_16(life4_5)))) {
        break forest_join_140;
    }
    life6_58 = __cast100202_18(__call100202_17(life4_5));
    spill100202_2 = receiver;
    if (!((life3_14 != 0))) {
        forestValue100202_60_0 = spill100202_2;
        break forest_join_60;
    }
    if (!((__call100202_20(__fieldRead100202_19(spill100202_2), life6_58) != null))) {
        break forest_join_59;
    }
    if (!((life3_14 == 0))) {
        continue forest_cycle_43;
    }
    }
    forestValue100202_60_0 = receiver;
    }
    life7_75 = __call100202_21(forestValue100202_60_0, life6_58);
    __call100202_23(__fieldRead100202_22(receiver), life6_58, life7_75);
    life8_84 = __call100202_24(life7_75);
    if (!((life8_84 != null))) {
        break forest_join_84;
    }
    spill100202_3 = __call100202_25(life5_7, life8_84);
    if (!((life3_14 != 0))) {
        forestValue100202_83_0 = __integerCategory100202_26(spill100202_3);
        break forest_join_83;
    }
    if (!((!spill100202_3))) {
        break forest_join_84;
    }
    forestValue100202_83_0 = __integerCategory100202_28(__call100202_27(life4_5, life8_84));
    }
    __discardScalar100202_29(forestValue100202_83_0);
    }
    __call100202_30(life5_7, life6_58);
    if (!((life3_14 == 0))) {
        continue forest_cycle_43;
    }
    break forest_cycle_43;
    }
    break forest_join_140;
    }
    forest_cycle_91: while (true) {
    forest_join_133: {
    forest_join_126: {
    forest_join_125: {
    forest_join_102: {
    forest_join_101: {
    life6_112 = forestValue100202_91_0;
    spill100202_4 = receiver;
    if (!((life3_14 != 0))) {
        forestValue100202_102_0 = spill100202_4;
        break forest_join_102;
    }
    if (!((__call100202_32(__fieldRead100202_31(spill100202_4), life6_112) != null))) {
        break forest_join_101;
    }
    if (!((life3_14 == 0))) {
        break forest_join_133;
    }
    }
    forestValue100202_102_0 = receiver;
    }
    life7_129 = __call100202_33(forestValue100202_102_0, life6_112);
    __call100202_35(__fieldRead100202_34(receiver), life6_112, life7_129);
    life8_138 = __call100202_36(life7_129);
    if (!((life8_138 != null))) {
        break forest_join_126;
    }
    spill100202_5 = __call100202_37(life5_7, life8_138);
    if (!((life3_14 != 0))) {
        forestValue100202_125_0 = __integerCategory100202_38(spill100202_5);
        break forest_join_125;
    }
    if (!((!spill100202_5))) {
        break forest_join_126;
    }
    forestValue100202_125_0 = __integerCategory100202_40(__call100202_39(life4_5, life8_138));
    }
    __discardScalar100202_41(forestValue100202_125_0);
    }
    __call100202_42(life5_7, life6_112);
    if (!((life3_14 == 0))) {
        break forest_join_133;
    }
    break forest_join_140;
    }
    if (!((!__call100202_43(life4_5)))) {
        break forest_join_140;
    }
    spill100202_6 = __cast100202_45(__call100202_44(life4_5));
    forestValue100202_91_0 = spill100202_6;
    continue forest_cycle_91;
    }
    }
    return;
}
public static void h100202_0(java.lang.Exception p0) throws Throwable {
    throw __call13020200_0(p0);
}
public static void h100202_1(java.lang.Exception p0) throws Throwable {
    throw __call13020201_0(p0);
}
public static void h100202_2(java.lang.Exception p0) throws Throwable {
    throw __call13020202_0(p0);
}
public static void h100202_3(java.lang.Exception p0) throws Throwable {
    throw __call13020203_0(p0);
}
public static void h100202_4(java.lang.Exception p0) throws Throwable {
    throw __call13020204_0(p0);
}
public static void h100202_5(java.lang.Exception p0, net.minecraft.client.resources.model.ModelBakery p1, int p2, java.util.ArrayDeque p3, java.util.HashSet p4, moom.DD p5) throws Throwable {
    net.minecraft.client.resources.model.ModelBakery forestValue13020205_35_0;
    int forestValue13020205_58_0;
    net.minecraft.client.resources.model.ModelBakery spill13020205_0;
    boolean spill13020205_1;
    java.lang.Exception life6_2;
    net.minecraft.client.renderer.block.model.ModelBlock life6_38;
    moom.DD life7_47;
    forest_join_60: {
    life6_2 = p0;
    __call13020205_5(__fieldRead13020205_0(), __invokedynamic13020205_4(__call13020205_3(__fieldRead13020205_1(), __call13020205_2(p1, p5)), p5));
    forest_cycle_11: while (true) {
    forest_join_59: {
    forest_join_58: {
    forest_join_35: {
    forest_join_34: {
    forest_join_18: {
    __call13020205_6(p4, p5);
    if (!((p2 == 0))) {
        break forest_join_18;
    }
    break forest_join_60;
    }
    forest_cycle_18: while (true) {
    if (!((!__call13020205_7(p3)))) {
        break forest_join_60;
    }
    p5 = __cast13020205_9(__call13020205_8(p3));
    spill13020205_0 = p1;
    if (!((p2 != 0))) {
        forestValue13020205_35_0 = spill13020205_0;
        break forest_join_35;
    }
    if (!((__call13020205_11(__fieldRead13020205_10(spill13020205_0), p5) != null))) {
        break forest_join_34;
    }
    if (!((p2 == 0))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    forestValue13020205_35_0 = p1;
    }
    life6_38 = __call13020205_12(forestValue13020205_35_0, p5);
    __call13020205_14(__fieldRead13020205_13(p1), p5, life6_38);
    life7_47 = __call13020205_15(life6_38);
    if (!((life7_47 != null))) {
        break forest_join_59;
    }
    spill13020205_1 = __call13020205_16(p4, life7_47);
    if (!((p2 != 0))) {
        forestValue13020205_58_0 = __integerCategory13020205_17(spill13020205_1);
        break forest_join_58;
    }
    if (!((!spill13020205_1))) {
        break forest_join_59;
    }
    forestValue13020205_58_0 = __integerCategory13020205_19(__call13020205_18(p3, life7_47));
    }
    __discardScalar13020205_20(forestValue13020205_58_0);
    }
    continue forest_cycle_11;
    }
    }
    return;
}
private static native long __fieldRead100202_0() throws Throwable;
private static native java.util.ArrayDeque __call100202_1() throws Throwable;
private static native java.util.HashSet __call100202_2() throws Throwable;
private static native int __call100202_3() throws Throwable;
private static native java.util.Map __fieldRead100202_4(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Set __call100202_5(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call100202_6(java.util.Set a0) throws Throwable;
private static native boolean __call100202_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100202_8(java.util.Iterator a0) throws Throwable;
private static native moom.DD __cast100202_9(java.lang.Object a0) throws Throwable;
private static native boolean __call100202_10(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead100202_11(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call100202_12(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast100202_13(java.lang.Object a0) throws Throwable;
private static native moom.DD __call100202_14(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native boolean __call100202_15(java.util.ArrayDeque a0, moom.DD a1) throws Throwable;
private static native boolean __call100202_16(java.util.ArrayDeque a0) throws Throwable;
private static native java.lang.Object __call100202_17(java.util.ArrayDeque a0) throws Throwable;
private static native moom.DD __cast100202_18(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead100202_19(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call100202_20(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call100202_21(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead100202_22(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call100202_23(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native moom.DD __call100202_24(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native boolean __call100202_25(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native int __integerCategory100202_26(boolean value) throws Throwable;
private static native boolean __call100202_27(java.util.ArrayDeque a0, moom.DD a1) throws Throwable;
private static native int __integerCategory100202_28(boolean value) throws Throwable;
private static native void __discardScalar100202_29(int a0) throws Throwable;
private static native boolean __call100202_30(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead100202_31(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call100202_32(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call100202_33(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead100202_34(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call100202_35(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native moom.DD __call100202_36(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native boolean __call100202_37(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native int __integerCategory100202_38(boolean value) throws Throwable;
private static native boolean __call100202_39(java.util.ArrayDeque a0, moom.DD a1) throws Throwable;
private static native int __integerCategory100202_40(boolean value) throws Throwable;
private static native void __discardScalar100202_41(int a0) throws Throwable;
private static native boolean __call100202_42(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native boolean __call100202_43(java.util.ArrayDeque a0) throws Throwable;
private static native java.lang.Object __call100202_44(java.util.ArrayDeque a0) throws Throwable;
private static native moom.DD __cast100202_45(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call13020200_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13020201_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13020202_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13020203_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13020204_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020205_0() throws Throwable;
private static native com.google.common.base.Joiner __fieldRead13020205_1() throws Throwable;
private static native java.util.List __call13020205_2(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call13020205_3(com.google.common.base.Joiner a0, java.util.List a1) throws Throwable;
private static native java.lang.String __invokedynamic13020205_4(java.lang.String a0, moom.DD a1) throws Throwable;
private static native void __call13020205_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call13020205_6(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native boolean __call13020205_7(java.util.ArrayDeque a0) throws Throwable;
private static native java.lang.Object __call13020205_8(java.util.ArrayDeque a0) throws Throwable;
private static native moom.DD __cast13020205_9(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead13020205_10(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call13020205_11(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call13020205_12(net.minecraft.client.resources.model.ModelBakery a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead13020205_13(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call13020205_14(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native moom.DD __call13020205_15(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native boolean __call13020205_16(java.util.HashSet a0, moom.DD a1) throws Throwable;
private static native int __integerCategory13020205_17(boolean value) throws Throwable;
private static native boolean __call13020205_18(java.util.ArrayDeque a0, moom.DD a1) throws Throwable;
private static native int __integerCategory13020205_19(boolean value) throws Throwable;
private static native void __discardScalar13020205_20(int a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cdb625e1cc9de9f7e2ae(net.minecraft.client.resources.model.ModelBakery a0) throws E;
private static final class __SourceHandler_cdb625e1cc9de9f7e2ae {

public static void f1077(net.minecraft.client.resources.model.ModelBakery receiver) throws Throwable {
    java.lang.Object forestValue1077_49_0;
    int forestValue1077_57_0;
    java.lang.Object forestValue1077_63_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forestValue1077_84_0;
    int forestValue1077_88_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forestValue1077_99_0;
    int spill1077_0;
    boolean spill1077_1;
    net.minecraft.client.renderer.block.model.ModelBlock spill1077_2;
    net.minecraft.client.resources.model.ModelBakery spill1077_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill1077_4;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill1077_5;
    boolean spill1077_6;
    long life1_3;
    java.util.Iterator life4_9;
    int life3_10;
    moom.DD life5_19;
    net.minecraft.client.renderer.block.model.ModelBlock life6_25;
    net.minecraft.client.renderer.block.model.ModelBlock life7_42;
    java.util.Iterator life4_90;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_100;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_121;
    forest_join_106: {
    forest_join_88: {
    forest_join_66: {
    life1_3 = (__fieldRead1077_0() ^ 42697543523330L);
    spill1077_0 = __call1077_1();
    life4_9 = __call1077_4(__call1077_3(__fieldRead1077_2(receiver)));
    life3_10 = spill1077_0;
    forest_cycle_11: while (true) {
    forest_join_64: {
    forest_join_63: {
    forest_join_57: {
    forest_join_52: {
    forest_join_49: {
    forest_join_44: {
    if (!(__call1077_5(life4_9))) {
        break forest_join_66;
    }
    life5_19 = __cast1077_7(__call1077_6(life4_9));
    life6_25 = __cast1077_10(__call1077_9(__fieldRead1077_8(receiver), life5_19));
    spill1077_1 = __call1077_11(receiver, life6_25);
    if (!((life3_10 == 0))) {
        forestValue1077_88_0 = __integerCategory1077_12(spill1077_1);
        break forest_join_88;
    }
    if (!((life3_10 == 0))) {
        forestValue1077_57_0 = __integerCategory1077_13(spill1077_1);
        break forest_join_57;
    }
    if (!(spill1077_1)) {
        break forest_join_52;
    }
    life7_42 = __call1077_14(receiver, life6_25);
    spill1077_2 = life7_42;
    if (!((life3_10 == 0))) {
        forestValue1077_49_0 = spill1077_2;
        break forest_join_49;
    }
    if (!((spill1077_2 != null))) {
        break forest_join_44;
    }
    __fieldWrite1077_16(life7_42, __call1077_15(life5_19));
    }
    forestValue1077_49_0 = __call1077_18(__fieldRead1077_17(receiver), life5_19, life7_42);
    }
    __discardScalar1077_19(forestValue1077_49_0);
    if (!((life3_10 != 0))) {
        break forest_join_64;
    }
    }
    spill1077_3 = receiver;
    if (!((life3_10 == 0))) {
        forestValue1077_63_0 = spill1077_3;
        break forest_join_63;
    }
    forestValue1077_57_0 = __integerCategory1077_21(__call1077_20(spill1077_3, life6_25));
    }
    if (!((forestValue1077_57_0 != 0))) {
        break forest_join_64;
    }
    forestValue1077_63_0 = __call1077_23(__fieldRead1077_22(receiver), life5_19, life6_25);
    }
    __discardScalar1077_24(forestValue1077_63_0);
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    life4_90 = __call1077_27(__call1077_26(__fieldRead1077_25(receiver)));
    forest_cycle_71: while (true) {
    forest_join_85: {
    forest_join_84: {
    if (!(__call1077_28(life4_90))) {
        break forest_join_106;
    }
    life5_100 = __cast1077_30(__call1077_29(life4_90));
    spill1077_4 = life5_100;
    if (!((life3_10 == 0))) {
        forestValue1077_84_0 = spill1077_4;
        break forest_join_84;
    }
    if (!((!__call1077_31(spill1077_4)))) {
        break forest_join_85;
    }
    forestValue1077_84_0 = life5_100;
    }
    __call1077_32(forestValue1077_84_0);
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    break forest_join_106;
    }
    forest_cycle_88: while (true) {
    forest_join_103: {
    forest_join_100: {
    forest_join_99: {
    if (!((forestValue1077_88_0 != 0))) {
        break forest_join_106;
    }
    life5_121 = __cast1077_34(__call1077_33(life4_9));
    spill1077_5 = life5_121;
    if (!((life3_10 == 0))) {
        forestValue1077_99_0 = spill1077_5;
        break forest_join_99;
    }
    if (!((!__call1077_35(spill1077_5)))) {
        break forest_join_100;
    }
    forestValue1077_99_0 = life5_121;
    }
    __call1077_36(forestValue1077_99_0);
    }
    if (!((life3_10 != 0))) {
        break forest_join_103;
    }
    break forest_join_106;
    }
    spill1077_6 = __call1077_37(life4_9);
    forestValue1077_88_0 = __integerCategory1077_38(spill1077_6);
    continue forest_cycle_88;
    }
    }
    return;
}
public static void h1077_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107700_0(p0);
}
public static void h1077_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107701_0(p0);
}
public static void h1077_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107702_0(p0);
}
public static void h1077_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107703_0(p0);
}
public static void h1077_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107704_0(p0);
}
public static void h1077_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107705_0(p0);
}
public static void h1077_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107706_0(p0);
}
public static void h1077_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107707_0(p0);
}
public static void h1077_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3107708_0(p0);
}
private static native long __fieldRead1077_0() throws Throwable;
private static native int __call1077_1() throws Throwable;
private static native java.util.Map __fieldRead1077_2(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Collection __call1077_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1077_4(java.util.Collection a0) throws Throwable;
private static native boolean __call1077_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1077_6(java.util.Iterator a0) throws Throwable;
private static native moom.DD __cast1077_7(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1077_8(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1077_9(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1077_10(java.lang.Object a0) throws Throwable;
private static native boolean __call1077_11(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native int __integerCategory1077_12(boolean value) throws Throwable;
private static native int __integerCategory1077_13(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __call1077_14(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native java.lang.String __call1077_15(moom.DD a0) throws Throwable;
private static native void __fieldWrite1077_16(net.minecraft.client.renderer.block.model.ModelBlock a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead1077_17(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1077_18(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native void __discardScalar1077_19(java.lang.Object a0) throws Throwable;
private static native boolean __call1077_20(net.minecraft.client.resources.model.ModelBakery a0, net.minecraft.client.renderer.block.model.ModelBlock a1) throws Throwable;
private static native int __integerCategory1077_21(boolean value) throws Throwable;
private static native java.util.Map __fieldRead1077_22(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.lang.Object __call1077_23(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.block.model.ModelBlock a2) throws Throwable;
private static native void __discardScalar1077_24(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1077_25(net.minecraft.client.resources.model.ModelBakery a0) throws Throwable;
private static native java.util.Collection __call1077_26(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1077_27(java.util.Collection a0) throws Throwable;
private static native boolean __call1077_28(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1077_29(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast1077_30(java.lang.Object a0) throws Throwable;
private static native boolean __call1077_31(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call1077_32(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call1077_33(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast1077_34(java.lang.Object a0) throws Throwable;
private static native boolean __call1077_35(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call1077_36(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call1077_37(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory1077_38(boolean value) throws Throwable;
private static native java.lang.Exception __call3107700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107701_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107702_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107703_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107704_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107705_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107706_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107707_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3107708_0(java.lang.RuntimeException a0) throws Throwable;

}


private void i() { __sourceHandlerCall_cdb625e1cc9de9f7e2ae(this); }


private moom.DD b(moom.DD p0) { return __sourceHandlerCall_6f92791b8f159fbf6787(this, p0); }


public net.minecraft.client.renderer.block.model.ModelBlock b__lX(moom.DD p0) {
return ((net.minecraft.client.renderer.block.model.ModelBlock)(((java.util.Map)(this.h)).get(((java.lang.Object)(p0)))));
}


private void b__Void() { __sourceHandlerCall_4fe4ad817a721b2addd9(this); }


private java.util.Set<moom.DD> b() { return __sourceHandlerCall_f02ebeb717d1618e5920(this); }


private boolean b(net.minecraft.client.renderer.block.model.ModelBlock p0) { return __sourceHandlerCall_28d7b71a18b94a89bd39(this, p0); }


private void e() { __sourceHandlerCall_276bc08a234c1581a94f(this); }


private moom.DD c(moom.DD p0) { return __sourceHandlerCall_d3a3e227eb06521f510b(this, p0); }


private void c() { __sourceHandlerCall_fcfc278b7563a39a6374(this); }


private void h() {
java.util.Set local1 = ((net.minecraft.client.resources.model.ModelBakery)(this)).a();
    ((java.util.Set)(local1)).addAll(((java.util.Collection)(((net.minecraft.client.resources.model.ModelBakery)(this)).b())));
    ((java.util.Set)(local1)).remove(((java.lang.Object)(net.minecraft.client.renderer.texture.TextureMap.j)));
    net.minecraft.client.renderer.texture.IIconCreator local2 = __sourceIntrinsic_a33ceaa00d22_originalDynamicSite1845_5(this, local1);
    ((net.minecraft.client.renderer.texture.TextureMap)(this.j)).a(((moom.oR)(this.f)), ((net.minecraft.client.renderer.texture.IIconCreator)(local2)));
    ((java.util.Map)(this.g)).put(((java.lang.Object)(new moom.DD("missingno"))), ((java.lang.Object)(((net.minecraft.client.renderer.texture.TextureMap)(this.j)).a__oh())));
    return;
}


private void f() { __sourceHandlerCall_9e35048239a6c9745cfe(this); }


private void d() { __sourceHandlerCall_de00b3b04cd40ad3e74b(this); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5304;
      if (y[var3] == null) {
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
         long var5 = x[var3];
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
         Object[] var9 = (Object[])z.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               z.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         y[var3] = var15;
      }

      return y[var3];
}


private boolean a__Boolean(net.minecraft.client.renderer.block.model.ModelBlock p0) { return __sourceHandlerCall_606d5994ebe8bb7d8353(this, p0); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_9daf922d550f99(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static moom.DD a(moom.DD p0, java.lang.String p1) { return __sourceHandlerCall_a4252fdf776043b8efd6(p0, p1); }


private java.util.Set<moom.DD> a(net.minecraft.client.renderer.block.model.ModelBlock p0) {
int spill1504_0;
    long life2_3;
    java.util.HashSet life5_6;
    java.util.Iterator life6_10;
    int life4_11;
    net.minecraft.client.renderer.block.model.BlockPart life7_18;
    java.util.Iterator life8_25;
    net.minecraft.client.renderer.block.model.BlockPartFace life9_32;
    moom.DD life10_40;
    lexical_join_60: {
    lexical_join_51: {
    life2_3 = (net.minecraft.client.resources.model.ModelBakery.w ^ 97190765424201L);
    spill1504_0 = moom.DE.c();
    life5_6 = com.google.common.collect.Sets.newHashSet();
    life6_10 = ((java.util.List)(((net.minecraft.client.renderer.block.model.ModelBlock)(p0)).a())).iterator();
    life4_11 = spill1504_0;
    lexical_cycle_12: while (true) {
    lexical_join_49: {
    if (!(((java.util.Iterator)(life6_10)).hasNext())) {
        break lexical_join_51;
    }
    life7_18 = ((net.minecraft.client.renderer.block.model.BlockPart)(((java.util.Iterator)(life6_10)).next()));
    if (!((life4_11 != 0))) {
        break lexical_join_60;
    }
    life8_25 = ((java.util.Collection)(((java.util.Map)(((net.minecraft.client.renderer.block.model.BlockPart)(life7_18)).c)).values())).iterator();
    lexical_cycle_26: while (true) {
    if (!(((java.util.Iterator)(life8_25)).hasNext())) {
        break lexical_join_49;
    }
    life9_32 = ((net.minecraft.client.renderer.block.model.BlockPartFace)(((java.util.Iterator)(life8_25)).next()));
    life10_40 = new moom.DD(((net.minecraft.client.renderer.block.model.ModelBlock)(p0)).a(((java.lang.String)(((net.minecraft.client.renderer.block.model.BlockPartFace)(life9_32)).d))));
    ((java.util.Set)(life5_6)).add(((java.lang.Object)(life10_40)));
    if (!((life4_11 != 0))) { continue lexical_cycle_12; }
    if (!((life4_11 == 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    if (!((life4_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    ((java.util.Set)(life5_6)).add(((java.lang.Object)(new moom.DD(((net.minecraft.client.renderer.block.model.ModelBlock)(p0)).a(((java.lang.String)("particle")))))));
    }
    return life5_6;
}


private static java.lang.String a(java.lang.String p0, java.lang.String p1) {
p0 = moom.Oc.a(((java.lang.String)(p0)), ((java.lang.String)(p1)));
    p0 = moom.Ob.c(((java.lang.String)(p0)), ((java.lang.String)(".json")));
    p0 = moom.Ob.c(((java.lang.String)(p0)), ((java.lang.String)(".png")));
    return p0;
}


public static void a(net.minecraft.client.renderer.block.model.ModelBlock p0, java.lang.String p1) { __sourceHandlerCall_4fd5c0a9d1db8991df93(p0, p1); }


public static void a(net.minecraft.item.Item p0, java.lang.String[] p1) {
return;
}


public static <T extends moom.DD> void a(net.minecraft.item.Item p0, T[] p1) {
return;
}


private net.minecraft.client.renderer.block.model.ModelBlock a__lX(net.minecraft.client.renderer.block.model.ModelBlock p0) {
return ((net.minecraft.client.renderer.block.model.ItemModelGenerator)(this.m)).a(((net.minecraft.client.renderer.texture.TextureMap)(this.j)), ((net.minecraft.client.renderer.block.model.ModelBlock)(p0)));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private net.minecraft.client.renderer.block.model.ModelBlockDefinition a__l0(moom.DD p0) { return __sourceHandlerCall_86273df2d3ce7b42c873(this, p0); }


private moom.DD a__DD(moom.DD p0) {
return new moom.DD(((moom.DD)(p0)).b(), __sourceIntrinsic_5eb81cf90733_originalDynamicSite1846_2(((moom.DD)(p0)).a()));
}


private net.minecraft.client.renderer.block.model.ModelBlock a__lX(moom.DD p0) throws java.io.IOException { return __sourceHandlerCall_6bcc0e01ca0e18761fce(this, p0); }


public void a(java.lang.String p0, moom.DD p1, moom.DD p2) { __sourceHandlerCall_15f3bc0da5850629bded(this, p0, p1, p2); }


private java.util.List<java.lang.String> a(net.minecraft.item.Item p0) { return __sourceHandlerCall_e78953c3f5939a37b9d3(this, p0); }


public net.minecraft.util.IRegistry<moom.DE, net.minecraft.client.resources.model.IBakedModel> a__C_() {
((net.minecraft.client.resources.model.ModelBakery)(this)).a__Void();
    ((net.minecraft.client.resources.model.ModelBakery)(this)).f();
    ((net.minecraft.client.resources.model.ModelBakery)(this)).h();
    ((net.minecraft.client.resources.model.ModelBakery)(this)).i();
    ((net.minecraft.client.resources.model.ModelBakery)(this)).e();
    return this.n;
}


private void a__Void() {
((net.minecraft.client.resources.model.ModelBakery)(this)).a(((java.util.Collection)(((java.util.Map)(((net.minecraft.client.renderer.block.statemap.BlockStateMapper)(((net.minecraft.client.renderer.BlockModelShapes)(this.k)).a())).a())).values())));
    ((java.util.Map)(this.i)).put(((java.lang.Object)(net.minecraft.client.resources.model.ModelBakery.c)), ((java.lang.Object)(new moom.l4(((moom.DE)(net.minecraft.client.resources.model.ModelBakery.c)).c__String(), com.google.common.collect.Lists.newArrayList(((new moom.l2[] {new moom.l2(new moom.DD(((moom.DE)(net.minecraft.client.resources.model.ModelBakery.c)).a()), net.minecraft.client.resources.model.ModelRotation.X0_Y0, false, 1)})))))));
    moom.DD local1 = new moom.DD("item_frame");
    net.minecraft.client.renderer.block.model.ModelBlockDefinition local2 = ((net.minecraft.client.resources.model.ModelBakery)(this)).a__l0(((moom.DD)(local1)));
    ((net.minecraft.client.resources.model.ModelBakery)(this)).a(((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(local2)), ((moom.DE)(new moom.DE(local1, "normal"))));
    ((net.minecraft.client.resources.model.ModelBakery)(this)).a(((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(local2)), ((moom.DE)(new moom.DE(local1, "map"))));
    ((net.minecraft.client.resources.model.ModelBakery)(this)).b__Void();
    ((net.minecraft.client.resources.model.ModelBakery)(this)).c();
    return;
}


private void a(java.util.Collection<moom.DE> p0) { __sourceHandlerCall_ba2f26bcca554c371b5a(this, p0); }


private void a(net.minecraft.client.renderer.block.model.ModelBlockDefinition p0, moom.DE p1) {
((java.util.Map)(this.i)).put(((java.lang.Object)(p1)), ((java.lang.Object)(((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(p0)).a(((java.lang.String)(((moom.DE)(p1)).c__String()))))));
    return;
}


private moom.lC a(net.minecraft.client.renderer.block.model.BlockPart p0, net.minecraft.client.renderer.block.model.BlockPartFace p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2, moom.bs p3, net.minecraft.client.resources.model.ModelRotation p4, boolean p5) {
return ((moom.lN)(this.l)).a(((org.lwjgl.util.vector.Vector3f)(((net.minecraft.client.renderer.block.model.BlockPart)(p0)).a)), ((org.lwjgl.util.vector.Vector3f)(((net.minecraft.client.renderer.block.model.BlockPart)(p0)).b)), ((net.minecraft.client.renderer.block.model.BlockPartFace)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)), ((moom.bs)(p3)), ((net.minecraft.client.resources.model.ModelRotation)(p4)), ((net.minecraft.client.renderer.block.model.BlockPartRotation)(((net.minecraft.client.renderer.block.model.BlockPart)(p0)).d)), ((boolean)(p5)), ((boolean)__sourceIntrinsic_integerToBoolean((((((net.minecraft.client.renderer.block.model.BlockPart)(p0)).e) ? 1 : 0)))));
}


protected moom.lC a(net.minecraft.client.renderer.block.model.BlockPart p0, net.minecraft.client.renderer.block.model.BlockPartFace p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2, moom.bs p3, moom.I2 p4, boolean p5) {
return ((moom.lN)(this.l)).a(((org.lwjgl.util.vector.Vector3f)(((net.minecraft.client.renderer.block.model.BlockPart)(p0)).a)), ((org.lwjgl.util.vector.Vector3f)(((net.minecraft.client.renderer.block.model.BlockPart)(p0)).b)), ((net.minecraft.client.renderer.block.model.BlockPartFace)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)), ((moom.bs)(p3)), ((moom.I2)(p4)), ((net.minecraft.client.renderer.block.model.BlockPartRotation)(((net.minecraft.client.renderer.block.model.BlockPart)(p0)).d)), ((boolean)(p5)), ((boolean)__sourceIntrinsic_integerToBoolean((((((net.minecraft.client.renderer.block.model.BlockPart)(p0)).e) ? 1 : 0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10911_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private java.util.List<moom.DD> a(moom.DD p0) { return __sourceHandlerCall_2f38ece7bb11384b852b(this, p0); }


private moom.DD a(java.lang.String p0) {
moom.DD local2 = new moom.DD(p0);
    return new moom.DD(((moom.DD)(local2)).b(), __sourceIntrinsic_c7b759ea0078_originalDynamicSite1847_2(((moom.DD)(local2)).a()));
}


public net.minecraft.client.resources.model.IBakedModel a(net.minecraft.client.renderer.block.model.ModelBlock p0, net.minecraft.client.resources.model.ModelRotation p1, boolean p2) {
return ((net.minecraft.client.resources.model.ModelBakery)(this)).a(((net.minecraft.client.renderer.block.model.ModelBlock)(p0)), ((moom.I2)(p1)), ((boolean)(p2)));
}


protected net.minecraft.client.resources.model.IBakedModel a(net.minecraft.client.renderer.block.model.ModelBlock p0, moom.I2 p1, boolean p2) { return __sourceHandlerCall_bed11baed749c4cf8537(this, p0, p1, p2); }


private java.util.Set<moom.DD> a() { return __sourceHandlerCall_a0bd0e8f35063dda6bf7(this); }


private void g() { __sourceHandlerCall_4fef8b5e31fbd99a69ea(this); }


private void lambda$loadSprites$0(java.util.Set p0, net.minecraft.client.renderer.texture.TextureMap p1) {
int spill1505_0;
    long life3_3;
    java.util.Iterator life6_7;
    int life5_8;
    moom.DD life7_15;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life8_19;
    lexical_join_28: {
    life3_3 = (net.minecraft.client.resources.model.ModelBakery.w ^ 113987038814779L);
    spill1505_0 = moom.DE.c();
    life6_7 = ((java.util.Set)(p0)).iterator();
    life5_8 = spill1505_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life6_7)).hasNext())) {
        break lexical_join_28;
    }
    life7_15 = ((moom.DD)(((java.util.Iterator)(life6_7)).next()));
    life8_19 = ((net.minecraft.client.renderer.texture.TextureMap)(p1)).a__oh(((moom.DD)(life7_15)));
    ((java.util.Map)(this.g)).put(((java.lang.Object)(life7_15)), ((java.lang.Object)(life8_19)));
    if (!((life5_8 == 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1829_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c7b759ea0078_originalDynamicSite1847_2(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10911_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5eb81cf90733_originalDynamicSite1846_2(java.lang.String a0) throws E;

private static native <E extends Throwable> net.minecraft.client.renderer.texture.IIconCreator __sourceIntrinsic_a33ceaa00d22_originalDynamicSite1845_5(net.minecraft.client.resources.model.ModelBakery a0, java.util.Set a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_9daf922d550f99(int p0, long p1);

private static native int __sourceExactCall_5c5d6a17b3677f();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
