package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HE extends moom.Hs {

private int p;

private static final long q;

private static final long[] r;

private static final java.lang.Integer[] t;

private static final java.util.Map z;

public HE() {
super();
}


public HE(moom.bs p0, moom.G2 p1, int p2) {
super(p0, p1);
    this.p = (p2 & 1);
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(-4742487056828380433L)), ((long)(5903415362532131873L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(262711942352970L)))));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HE.q ^ 93766160750293L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill811_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill811_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill811_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill811_14 = new byte[8];
    (__sourceSpill811_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill811_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation811_16 = __sourceSpill811_14;
    ((javax.crypto.Cipher)(__sourceSpill811_11)).init(((int)(__sourceSpill811_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill811_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation811_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[28];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "&¶\023íç°ÿ\004JWv¢]ÕÙ°dó´W¸\177Mr«Ý9¹vy\023h#AÖ2º¹\020ª¶o]ÜI)·>Û\002p2EÙ\007ªÏ¸:¸cðc¼Ì\022ÑMøçI[\032.\021ýu\006$\016ñ\007 =Ú\017\034­éê\006Ç*\024æ{¶v©ô\033:¥Oðí\177\033\033\tAú\023\fñ ¦\bk\nNcüýÑ³\023kä4aûw\005ÝÍ×?æ³\032r]ÓçÂT3¶ÝmA(ëHGuòlYx¤).ñCK[íU]¯@\036»3W"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill811_25 = local6_life21;
        int __sourceSpill811_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill811_25)).substring(((int)(__sourceSpill811_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill811_30 = local8_life19;
        int __sourceSpill811_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill811_33 = new byte[8];
        (__sourceSpill811_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill811_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill811_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill811_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill811_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill811_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill811_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill811_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill811_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill811_34)).doFinal(((byte[])(__sourceSpill811_33)));
        (__sourceSpill811_30)[__sourceSpill811_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "·ö«T¯±r9k¡>%½c"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill811_38 = local6_life21;
        int __sourceSpill811_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill811_38)).substring(((int)(__sourceSpill811_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill811_43 = local8_life19;
        int __sourceSpill811_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill811_46 = new byte[8];
        (__sourceSpill811_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill811_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill811_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill811_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill811_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill811_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill811_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill811_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill811_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill811_47)).doFinal(((byte[])(__sourceSpill811_46)));
        (__sourceSpill811_43)[__sourceSpill811_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    r = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[28]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x31A2;
        if (t[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HE.t[n2] = n3;
        }
        return t[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HE.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4733_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue734_829_0;
    int lexicalValue734_1266_0;
    int spill734_0;
    int spill734_1;
    long spill734_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_15;
    int life7_440;
    int life7_940;
    int life8_946;
    int life9_948;
    int life10_950;
    int life10_1032;
    int life10_1155;
    lexical_join_1266: {
    lexical_join_1265: {
    lexical_join_1249: {
    lexical_join_1191: {
    lexical_join_1133: {
    lexical_join_1127: {
    lexical_join_1013: {
    lexical_join_978: {
    lexical_join_829: {
    lexical_join_827: {
    lexical_join_825: {
    lexical_join_471: {
    lexical_join_429: {
    lexical_join_60: {
    life4_3 = (moom.HE.q ^ 92738269033204L);
    life6_5 = moom.G4.b();
    spill734_0 = this.p;
    if (!((life6_5 != null))) {
        lexicalValue734_829_0 = spill734_0;
        break lexical_join_829;
    }
    if (!((spill734_0 == 0))) {
        break lexical_join_827;
    }
    life7_15 = 0;
    lexical_cycle_13: while (true) {
    if (!((life7_15 < 4))) {
        break lexical_join_60;
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic734_3(5453, (3956681083652392927L ^ life4_3)) - life7_15))), ((int)((3 - life7_15))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic734_4(4969, (8078758471458308594L ^ life4_3)) - life7_15))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic734_5(1888, (1604897993836779005L ^ life4_3)) + life7_15))), ((int)((3 - life7_15))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_6(22915, (3563953078636743452L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    life7_15 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_429;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_10(31985, (8876022737214385787L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_11(25422, (4339835999609336276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_12(26851, (5384389283787815546L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_13(2357, (3508322435192478652L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_17(13188, (608472100439351556L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_18(13188, (608472100439351556L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_19(13188, (608472100439351556L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_20(22915, (3563953078636743452L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_24(6641, (7159787231944985449L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_25(13188, (608472100439351556L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_26(6641, (7159787231944985449L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_27(22915, (3563953078636743452L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_31(30696, (4810550123683849582L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_32(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_33(30696, (4810550123683849582L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_34(22915, (3563953078636743452L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_38(16497, (1450809586154410740L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_39(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_40(16497, (1450809586154410740L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_41(22915, (3563953078636743452L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_45(30696, (4810550123683849582L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_46(13188, (608472100439351556L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_47(20036, (1644012783028116698L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_48(13188, (608472100439351556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_52(23129, (370509539106490584L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_53(13188, (608472100439351556L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_54(16497, (1450809586154410740L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_55(13188, (608472100439351556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_59(9461, (1491972237192918651L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_60(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_61(14100, (6583096185809036688L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_62(30696, (4810550123683849582L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_66(30256, (427091820525921463L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_67(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_68(12019, (529531406863006840L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_69(30696, (4810550123683849582L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_73(14100, (6583096185809036688L ^ life4_3)))), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_74(30256, (427091820525921463L ^ life4_3)))), ((int)(0)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_78(24864, (6246627329248179116L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_79(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_80(13968, (2649836989254362113L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_81(30696, (4810550123683849582L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_85(9175, (1058779558439743828L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_86(24864, (6246627329248179116L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_87(9175, (1058779558439743828L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_88(13968, (2649836989254362113L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_92(22725, (377141820250950233L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_93(24864, (6246627329248179116L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_94(22725, (377141820250950233L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_95(13968, (2649836989254362113L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((boolean)(false)));
    }
    life7_440 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_99(7051, (2362805234779048216L ^ life4_3));
    lexical_cycle_435: while (true) {
    if (!((life7_440 >= __sourceIntrinsic_5ac1d031d896_invokedynamic734_100(30696, (4810550123683849582L ^ life4_3))))) {
        break lexical_join_471;
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_102(13188, (608472100439351556L ^ life4_3)))), ((int)(3)), ((int)(life7_440)), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_105(6641, (7159787231944985449L ^ life4_3)))), ((int)(3)), ((int)(life7_440)), ((moom.G2)(p2)));
    life7_440 += -3;
    if (!((life6_5 != null))) {
        break lexical_join_825;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_435; }
    break lexical_cycle_435;
    }
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_108(24864, (6246627329248179116L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_109(24864, (6246627329248179116L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_112(13968, (2649836989254362113L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_113(24864, (6246627329248179116L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_116(24864, (6246627329248179116L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_117(13968, (2649836989254362113L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_120(13968, (2649836989254362113L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_121(13968, (2649836989254362113L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_124(9175, (1058779558439743828L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_125(13188, (608472100439351556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_128(22725, (377141820250950233L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_129(13188, (608472100439351556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(4)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(4)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(4)), ((int)(0)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_138(2169, (7336031800748530420L ^ life4_3)))), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_141(2169, (7336031800748530420L ^ life4_3)))), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_144(2169, (7336031800748530420L ^ life4_3)))), ((int)(0)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_147(2169, (7336031800748530420L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_150(2169, (7336031800748530420L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_153(2169, (7336031800748530420L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_156(2169, (7336031800748530420L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_157(2169, (7336031800748530420L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_160(2169, (7336031800748530420L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_161(2169, (7336031800748530420L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_164(2169, (7336031800748530420L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_165(2169, (7336031800748530420L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_168(14100, (6583096185809036688L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_169(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_170(22915, (3563953078636743452L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_173(30256, (427091820525921463L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_174(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_175(22915, (3563953078636743452L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_177(13188, (608472100439351556L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_178(8297, (7791528091404268257L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_179(30696, (4810550123683849582L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_180(22412, (4306742204108014862L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_184(16497, (1450809586154410740L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_185(22412, (4306742204108014862L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_186(6641, (7159787231944985449L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_187(22412, (4306742204108014862L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_191(31572, (8253331544082000324L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_192(6641, (7159787231944985449L ^ life4_3)))));
    }
    if (!((life6_5 == null))) {
        break lexical_join_1265;
    }
    }
    lexicalValue734_829_0 = this.p;
    }
    if (!((life6_5 != null))) {
        lexicalValue734_1266_0 = lexicalValue734_829_0;
        break lexical_join_1266;
    }
    if (!((lexicalValue734_829_0 == 1))) {
        break lexical_join_1265;
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_195(14100, (6583096185809036688L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_196(2169, (7336031800748530420L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_197(30256, (427091820525921463L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_198(22915, (3563953078636743452L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_202(14100, (6583096185809036688L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_203(2169, (7336031800748530420L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_204(14100, (6583096185809036688L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_205(2169, (7336031800748530420L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_209(30256, (427091820525921463L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_210(2169, (7336031800748530420L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_211(30256, (427091820525921463L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_212(2169, (7336031800748530420L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    life7_940 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_216(14100, (6583096185809036688L ^ life4_3));
    life8_946 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_217(22915, (3563953078636743452L ^ life4_3));
    life9_948 = 5;
    life10_950 = 0;
    lexical_cycle_936: while (true) {
    if (!((life10_950 < 2))) {
        break lexical_join_978;
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(life7_940)), ((int)((life9_948 + 1))), ((int)(life8_946)), ((moom.G2)(p2)));
    spill734_1 = 30256;
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(life7_940)), ((int)(life9_948)), ((int)(life8_946)), ((moom.G2)(p2)));
    spill734_2 = (427091820525921463L ^ life4_3);
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((int)(life7_940)), ((int)((life9_948 - 1))), ((int)(life8_946)), ((moom.G2)(p2)));
    life7_940 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_224(spill734_1, spill734_2);
    life10_950 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_1013;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_936; }
    break lexical_cycle_936;
    }
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_225(30696, (4810550123683849582L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_226(30696, (4810550123683849582L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_227(16497, (1450809586154410740L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_228(22725, (377141820250950233L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    life7_940 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_232(24864, (6246627329248179116L ^ life4_3));
    }
    life10_1032 = 0;
    lexical_cycle_1015: while (true) {
    if (!((life10_1032 < 2))) {
        break lexical_join_1127;
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_940)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_233(24864, (6246627329248179116L ^ life4_3)))), ((int)(life7_940)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_234(13188, (608472100439351556L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_235(24864, (6246627329248179116L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_940)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_239(13968, (2649836989254362113L ^ life4_3)))), ((int)(life7_940)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_240(13188, (608472100439351556L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_241(13968, (2649836989254362113L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(life7_940)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_246(24864, (6246627329248179116L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(life7_940)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_249(13968, (2649836989254362113L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(life7_940)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_252(24864, (6246627329248179116L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HE.i)), ((int)(life7_940)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_255(13968, (2649836989254362113L ^ life4_3)))), ((moom.G2)(p2)));
    life7_940 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_257(13968, (2649836989254362113L ^ life4_3));
    life10_1032 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_1133;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_1015; }
    break lexical_cycle_1015;
    }
    }
    life7_940 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_258(9175, (1058779558439743828L ^ life4_3));
    }
    life10_1155 = 0;
    lexical_cycle_1135: while (true) {
    if (!((life10_1155 < 2))) {
        break lexical_join_1191;
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_940)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_259(30696, (4810550123683849582L ^ life4_3)))), ((int)(life7_940)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_260(30696, (4810550123683849582L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_940)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_264(22725, (377141820250950233L ^ life4_3)))), ((int)(life7_940)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_265(22725, (377141820250950233L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((net.minecraft.block.state.IBlockState)(moom.HE.f)), ((boolean)(false)));
    life7_940 = __sourceIntrinsic_5ac1d031d896_invokedynamic734_269(22725, (377141820250950233L ^ life4_3));
    life10_1155 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_1249;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_1135; }
    break lexical_cycle_1135;
    }
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_270(9175, (1058779558439743828L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_271(9175, (1058779558439743828L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_272(9175, (1058779558439743828L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_273(30256, (427091820525921463L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((boolean)(false)));
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_277(22725, (377141820250950233L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_278(9175, (1058779558439743828L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_279(22725, (377141820250950233L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_280(30256, (427091820525921463L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((net.minecraft.block.state.IBlockState)(moom.HE.g)), ((boolean)(false)));
    }
    ((moom.HE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_284(12638, (4093423231807742929L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic734_285(30256, (427091820525921463L ^ life4_3)))));
    }
    lexicalValue734_1266_0 = 1;
    }
    return ((lexicalValue734_1266_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4733_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_216(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_252(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_255(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_257(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_258(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_259(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_260(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_264(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_265(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_269(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_270(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_271(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_272(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_273(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_277(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_278(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_279(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_280(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_284(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic734_285(int a0, long a1) throws E;
}
