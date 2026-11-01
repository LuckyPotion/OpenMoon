package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class E7 extends net.minecraft.world.biome.BiomeGenBase {

protected boolean aG;

private static final long cb;

private static final long[] gb;

private static final java.lang.Integer[] hb;

private static final java.util.Map ib;

protected E7(int p0) {
super(((int)(p0)));
    ((moom.E7)(this)).a(((float)(0x1.99999a0000000p-1F)), ((float)(0x1.99999a0000000p-2F)));
    ((moom.E7)(this)).a(((net.minecraft.world.biome.BiomeGenBase$Height)(moom.E7.f)));
    ((java.util.List)(this.aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityHorse.class, 5, 2, 6))));
    ((moom.EQ)(this.au)).A = ((int)(-999));
    ((moom.EQ)(this.au)).B = ((int)(4));
    ((moom.EQ)(this.au)).C = ((int)(10));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(6859084669750474580L)), ((long)(-2584709711179386028L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(139833063012544L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.E7.cb ^ 23787284842324L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill701_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill701_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill701_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill701_14 = new byte[8];
    (__sourceSpill701_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill701_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation701_16 = __sourceSpill701_14;
    ((javax.crypto.Cipher)(__sourceSpill701_11)).init(((int)(__sourceSpill701_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill701_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation701_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "(ÚZ\004¶\033\035T!é\004\031\036ì]z7Ó÷[\023ËN/ÅîX}\022\026£$\035?w»\036í~Òj^Ð­\fLH!±þ\\\nó\177ò\\¡\t¿Ú \021\f´»@\005Å\nþ,)ám¾åÝ|e"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill701_25 = local6_life21;
        int __sourceSpill701_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill701_25)).substring(((int)(__sourceSpill701_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill701_30 = local8_life19;
        int __sourceSpill701_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill701_33 = new byte[8];
        (__sourceSpill701_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill701_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill701_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill701_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill701_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill701_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill701_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill701_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill701_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill701_34)).doFinal(((byte[])(__sourceSpill701_33)));
        (__sourceSpill701_30)[__sourceSpill701_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\003Þ¡. ¬ÆQ\\©qéãG"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill701_38 = local6_life21;
        int __sourceSpill701_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill701_38)).substring(((int)(__sourceSpill701_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill701_43 = local8_life19;
        int __sourceSpill701_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill701_46 = new byte[8];
        (__sourceSpill701_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill701_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill701_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill701_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill701_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill701_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill701_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill701_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill701_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill701_47)).doFinal(((byte[])(__sourceSpill701_46)));
        (__sourceSpill701_43)[__sourceSpill701_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[14]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.E7.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6F2F;
        if (hb[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = gb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ib.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    ib.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/E7", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            E7.hb[n2] = n4;
        }
        return hb[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4285_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/E7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
long local2 = (moom.E7.cb ^ 72787978597344L);
    moom.E7 local4 = new moom.E7(p0);
    ((moom.E7)(local4)).a(((java.lang.String)("Sunflower Plains")));
    ((moom.E7)(local4)).aG = ((boolean)(true));
    ((moom.E7)(local4)).b(((int)(__sourceIntrinsic_69a026c4ca08_originalDynamicSite1123_3(12816, (7313423111487069649L ^ local2)))));
    ((moom.E7)(local4)).al = ((int)(__sourceIntrinsic_69a026c4ca08_originalDynamicSite1123_5(30110, (4423571262967077466L ^ local2))));
    return local4;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue572_75_0;
    moom.E7 lexicalValue572_221_0;
    java.lang.String spill572_0;
    int spill572_1;
    moom.E7 spill572_2;
    long life4_3;
    double life7_29;
    java.lang.String life6_30;
    int life9_84;
    int life10_105;
    int life11_119;
    int life12_136;
    int life9_167;
    int life10_188;
    int life11_202;
    int life12_219;
    lexical_join_225: {
    lexical_join_221: {
    lexical_join_220: {
    lexical_join_143: {
    lexical_join_75: {
    lexical_join_55: {
    life4_3 = (moom.E7.cb ^ 35657553701901L);
    spill572_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life7_29 = ((moom.FW)(moom.E7.ah)).a(((double)((((double) (((moom.DT)(p2)).a() + __sourceIntrinsic_83c0409717df_invokedynamic572_4(26152, (224576528519763466L ^ life4_3)))) / 0x1.9p7d))), ((double)((((double) (((moom.DT)(p2)).c() + __sourceIntrinsic_83c0409717df_invokedynamic572_6(15018, (207439962025773698L ^ life4_3)))) / 0x1.9p7d))));
    life6_30 = spill572_0;
    spill572_1 = recovery.source.CarrierOps.dcmpg(((double)(life7_29)), ((double)(-0x1.999999999999ap-1d)));
    if (!((life6_30 == null))) {
        lexicalValue572_75_0 = spill572_1;
        break lexical_join_75;
    }
    if (!((spill572_1 < 0))) {
        break lexical_join_55;
    }
    ((moom.EQ)(this.au)).B = ((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_10(24757, (5123091117903581334L ^ life4_3))));
    ((moom.EQ)(this.au)).C = ((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_13(8683, (8602137332963430853L ^ life4_3))));
    if (!((life6_30 != null))) {
        break lexical_join_143;
    }
    }
    ((moom.EQ)(this.au)).B = ((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_16(20157, (5179685869531479698L ^ life4_3))));
    ((moom.EQ)(this.au)).C = ((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_19(12717, (904842872261886336L ^ life4_3))));
    ((moom.Gi)(moom.E7.ai)).a(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS)));
    lexicalValue572_75_0 = 0;
    }
    life9_84 = lexicalValue572_75_0;
    lexical_cycle_76: while (true) {
    if (!((life9_84 < __sourceIntrinsic_83c0409717df_invokedynamic572_24(8540, (6203460674864402806L ^ life4_3))))) {
        break lexical_join_143;
    }
    life10_105 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_25(20651, (3108899613859061888L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic572_27(15018, (207439962025773698L ^ life4_3)));
    life11_119 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_28(32153, (1030371163913489852L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic572_30(15018, (207439962025773698L ^ life4_3)));
    life12_136 = ((java.util.Random)(p1)).nextInt(((int)((((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life10_105)), ((int)(0)), ((int)(life11_119)))))))).b() + __sourceIntrinsic_83c0409717df_invokedynamic572_34(9059, (1682455370329609031L ^ life4_3))))));
    ((moom.Gi)(moom.E7.ai)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life10_105)), ((int)(life12_136)), ((int)(life11_119))))));
    life9_84 += 1;
    if (!((life6_30 == null))) {
        break lexical_join_225;
    }
    if (!((life6_30 != null))) { continue lexical_cycle_76; }
    break lexical_cycle_76;
    }
    }
    spill572_2 = this;
    if (!((life6_30 == null))) {
        lexicalValue572_221_0 = spill572_2;
        break lexical_join_221;
    }
    if (!(((moom.E7)(spill572_2)).aG)) {
        break lexical_join_220;
    }
    ((moom.Gi)(moom.E7.ai)).a(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.SUNFLOWER)));
    life9_167 = 0;
    lexical_cycle_153: while (true) {
    if (!((life9_167 < __sourceIntrinsic_83c0409717df_invokedynamic572_43(31884, (3648243115898703020L ^ life4_3))))) {
        break lexical_join_220;
    }
    life10_188 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_44(32153, (1030371163913489852L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic572_46(15018, (207439962025773698L ^ life4_3)));
    life11_202 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic572_47(32153, (1030371163913489852L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic572_49(15018, (207439962025773698L ^ life4_3)));
    life12_219 = ((java.util.Random)(p1)).nextInt(((int)((((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life10_188)), ((int)(0)), ((int)(life11_202)))))))).b() + __sourceIntrinsic_83c0409717df_invokedynamic572_53(24757, (3462118551814738068L ^ life4_3))))));
    ((moom.Gi)(moom.E7.ai)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life10_188)), ((int)(life12_219)), ((int)(life11_202))))));
    life9_167 += 1;
    if (!((life6_30 == null))) {
        break lexical_join_225;
    }
    if (!((life6_30 != null))) { continue lexical_cycle_153; }
    break lexical_cycle_153;
    }
    }
    lexicalValue572_221_0 = this;
    }
    __sourceIntrinsic_83c0409717df_call572_58(lexicalValue572_221_0, p0, p1, p2);
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.BlockFlower$EnumFlowerType a(java.util.Random p0, moom.DT p1) {
int forwardValue179_42_0;
    int forwardValue179_48_0;
    int forwardValue179_56_0;
    net.minecraft.block.BlockFlower$EnumFlowerType forwardValue179_61_0;
    java.lang.String spill179_0;
    int spill179_1;
    int spill179_2;
    long life3_3;
    double life6_17;
    java.lang.String life5_18;
    int life8_31;
    int life8_59;
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_56: {
    forward_join_55: {
    forward_join_48: {
    forward_join_42: {
    forward_join_39: {
    forward_join_37: {
    forward_join_35: {
    forward_join_33: {
    forward_join_31: {
    life3_3 = (moom.E7.cb ^ 30706410456210L);
    spill179_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life6_17 = ((moom.FW)(moom.E7.ah)).a(((double)((((double) ((moom.DT)(p1)).a()) / 0x1.9p7d))), ((double)((((double) ((moom.DT)(p1)).c()) / 0x1.9p7d))));
    life5_18 = spill179_0;
    spill179_1 = recovery.source.CarrierOps.dcmpg(((double)(life6_17)), ((double)(-0x1.999999999999ap-1d)));
    if (!((life5_18 == null))) {
        forwardValue179_42_0 = spill179_1;
        break forward_join_42;
    }
    if (!((spill179_1 < 0))) {
        break forward_join_39;
    }
    life8_31 = ((java.util.Random)(p0)).nextInt(((int)(4)));
    switch (life8_31) {
case 0:
{
        break forward_join_31;
    }
case 1:
{
        break forward_join_33;
    }
case 2:
{
        break forward_join_35;
    }
case 3:
default:
{
        break forward_join_37;
    }
}
    }
    return net.minecraft.block.BlockFlower$EnumFlowerType.ORANGE_TULIP;
    }
    return net.minecraft.block.BlockFlower$EnumFlowerType.RED_TULIP;
    }
    return net.minecraft.block.BlockFlower$EnumFlowerType.PINK_TULIP;
    }
    return net.minecraft.block.BlockFlower$EnumFlowerType.WHITE_TULIP;
    }
    forwardValue179_42_0 = ((java.util.Random)(p0)).nextInt(((int)(3)));
    }
    if (!((life5_18 == null))) {
        forwardValue179_48_0 = forwardValue179_42_0;
        break forward_join_48;
    }
    if (!((forwardValue179_42_0 > 0))) {
        break forward_join_62;
    }
    forwardValue179_48_0 = ((java.util.Random)(p0)).nextInt(((int)(3)));
    }
    life8_59 = forwardValue179_48_0;
    spill179_2 = life8_59;
    if (!((life5_18 == null))) {
        forwardValue179_56_0 = spill179_2;
        break forward_join_56;
    }
    if (!((spill179_2 == 0))) {
        break forward_join_55;
    }
    forwardValue179_61_0 = net.minecraft.block.BlockFlower$EnumFlowerType.POPPY;
    break forward_join_61;
    }
    forwardValue179_56_0 = life8_59;
    }
    if (!((forwardValue179_56_0 == 1))) {
        break forward_join_60;
    }
    forwardValue179_61_0 = net.minecraft.block.BlockFlower$EnumFlowerType.HOUSTONIA;
    break forward_join_61;
    }
    forwardValue179_61_0 = net.minecraft.block.BlockFlower$EnumFlowerType.OXEYE_DAISY;
    }
    return forwardValue179_61_0;
    }
    return net.minecraft.block.BlockFlower$EnumFlowerType.DANDELION;
}


private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic572_53(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_83c0409717df_call572_58(moom.E7 a0, net.minecraft.world.World a1, java.util.Random a2, moom.DT a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4285_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69a026c4ca08_originalDynamicSite1123_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69a026c4ca08_originalDynamicSite1123_5(int a0, long a1) throws E;
}
