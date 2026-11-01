package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class eD extends net.minecraft.block.Block {

public static final moom.fv Q;

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

public static final moom.fv U;

public static final moom.fv V;

public static final moom.fv W;

public static final moom.fv X;

private static final long Y;

private static final long[] Z;

private static final java.lang.Integer[] bb;

private static final java.util.Map fb;

public eD() {
super(moom.fn.q);
    (this).a__Void((((((((((this.M).a__fE()).a__fE(moom.eD.Q, java.lang.Boolean.FALSE)).a__fE(moom.eD.R, java.lang.Boolean.FALSE)).a__fE(moom.eD.S, java.lang.Boolean.FALSE)).a__fE(moom.eD.T, java.lang.Boolean.FALSE)).a__fE(moom.eD.U, java.lang.Boolean.FALSE)).a__fE(moom.eD.V, java.lang.Boolean.FALSE)).a__fE(moom.eD.W, java.lang.Boolean.FALSE)).a__fE(moom.eD.X, java.lang.Boolean.FALSE));
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.4000000000000p-3f, 0x1.0000000000000p+0f);
    (this).a(true);
}


static {
Y = ((long)(((moom._a)(moom._c.a(((long)(-4261611923625078733L)), ((long)(-6655486336664020167L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(108848468335912L)))));
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.eD.Y ^ 48778996520322L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1176_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1176_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1176_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1176_14 = new byte[8];
    (__sourceSpill1176_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1176_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1176_16 = __sourceSpill1176_14;
    ((javax.crypto.Cipher)(__sourceSpill1176_11)).init(((int)(__sourceSpill1176_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1176_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1176_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ö»¨Âø@-\037ï9\n.\003íkq½x"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1176_25 = local6_life21;
        int __sourceSpill1176_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1176_25)).substring(((int)(__sourceSpill1176_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1176_30 = local8_life19;
        int __sourceSpill1176_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1176_33 = new byte[8];
        (__sourceSpill1176_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1176_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1176_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1176_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1176_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1176_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1176_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1176_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1176_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1176_34)).doFinal(((byte[])(__sourceSpill1176_33)));
        (__sourceSpill1176_30)[__sourceSpill1176_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "w>.¯C:ÍÉbÑoG\004\016"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1176_38 = local6_life21;
        int __sourceSpill1176_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1176_38)).substring(((int)(__sourceSpill1176_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1176_43 = local8_life19;
        int __sourceSpill1176_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1176_46 = new byte[8];
        (__sourceSpill1176_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1176_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1176_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1176_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1176_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1176_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1176_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1176_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1176_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1176_47)).doFinal(((byte[])(__sourceSpill1176_46)));
        (__sourceSpill1176_43)[__sourceSpill1176_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Z = ((long[])(local8_life19));
    bb = ((java.lang.Integer[])(new java.lang.Integer[5]));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("suspended")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("attached")))));
    T = ((moom.fv)(moom.fv.a(((java.lang.String)("disarmed")))));
    U = ((moom.fv)(moom.fv.a(((java.lang.String)("north")))));
    V = ((moom.fv)(moom.fv.a(((java.lang.String)("east")))));
    W = ((moom.fv)(moom.fv.a(((java.lang.String)("south")))));
    X = ((moom.fv)(moom.fv.a(((java.lang.String)("west")))));
}


private void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1140_84_0;
    int lexicalValue1140_90_0;
    int lexicalValue1140_112_0;
    int[] spill1140_0;
    boolean spill1140_1;
    boolean spill1140_2;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int life7_14;
    int life8_16;
    int[] life5_17;
    java.util.List life9_60;
    java.util.Iterator life10_71;
    net.minecraft.entity.Entity life11_78;
    net.minecraft.block.state.IBlockState life6_114;
    lexical_join_120: {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_90: {
    lexical_join_89: {
    life3_3 = (moom.eD.Y ^ 10769741187362L);
    spill1140_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life7_14 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.eD.Q))))))).booleanValue()) ? 1 : 0);
    life8_16 = 0;
    life5_17 = spill1140_0;
    life9_60 = ((net.minecraft.world.World)(p0)).b(((net.minecraft.entity.Entity)(null)), ((moom.CA)(new moom.CA((((double) ((moom.DT)(p1)).a()) + ((moom.eD)(this)).B), (((double) ((moom.DT)(p1)).b()) + ((moom.eD)(this)).C), (((double) ((moom.DT)(p1)).c()) + ((moom.eD)(this)).D), (((double) ((moom.DT)(p1)).a()) + ((moom.eD)(this)).E), (((double) ((moom.DT)(p1)).b()) + ((moom.eD)(this)).F), (((double) ((moom.DT)(p1)).c()) + ((moom.eD)(this)).G)))));
    spill1140_1 = ((java.util.List)(life9_60)).isEmpty();
    if (!((life5_17 != null))) {
        lexicalValue1140_90_0 = ((spill1140_1) ? 1 : 0);
        break lexical_join_90;
    }
    if (!((!spill1140_1))) {
        break lexical_join_89;
    }
    life10_71 = ((java.util.List)(life9_60)).iterator();
    lexical_cycle_69: while (true) {
    lexical_join_87: {
    lexical_join_84: {
    if (!(((java.util.Iterator)(life10_71)).hasNext())) {
        break lexical_join_89;
    }
    life11_78 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life10_71)).next()));
    spill1140_2 = ((net.minecraft.entity.Entity)(life11_78)).y();
    if (!((life5_17 != null))) {
        lexicalValue1140_90_0 = ((spill1140_2) ? 1 : 0);
        break lexical_join_90;
    }
    if (!((life5_17 != null))) {
        lexicalValue1140_84_0 = ((spill1140_2) ? 1 : 0);
        break lexical_join_84;
    }
    if (!((!spill1140_2))) {
        break lexical_join_87;
    }
    lexicalValue1140_84_0 = 1;
    }
    life8_16 = lexicalValue1140_84_0;
    if (!((life5_17 == null))) {
        break lexical_join_89;
    }
    }
    if (!((life5_17 == null))) { continue lexical_cycle_69; }
    break lexical_cycle_69;
    }
    }
    lexicalValue1140_90_0 = life8_16;
    }
    if (!((life5_17 != null))) {
        lexicalValue1140_112_0 = lexicalValue1140_90_0;
        break lexical_join_112;
    }
    if (!((lexicalValue1140_90_0 != life7_14))) {
        break lexical_join_111;
    }
    life6_114 = ((net.minecraft.block.state.IBlockState)(life6_8)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.Q)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life8_16)))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life6_114)), ((int)(3)));
    ((moom.eD)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life6_114)));
    }
    lexicalValue1140_112_0 = life8_16;
    }
    if (!((lexicalValue1140_112_0 != 0))) {
        break lexical_join_120;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.eD)(this)).a(((net.minecraft.world.World)(p0))))));
    }
    return;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3415_18_0;
    boolean spill3415_0;
    long life5_3;
    int[] life7_5;
    forward_join_23: {
    forward_join_18: {
    life5_3 = (moom.eD.Y ^ 119682896892860L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3415_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3415_18_0 = ((spill3415_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill3415_0))) {
        break forward_join_23;
    }
    forwardValue3415_18_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eD.Q))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue3415_18_0 != 0))) {
        break forward_join_23;
    }
    ((moom.eD)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.state.IBlockState forwardValue3416_16_0;
    moom.fv forwardValue3416_16_1;
    int forwardValue3416_16_2;
    net.minecraft.block.state.IBlockState forwardValue3416_17_0;
    moom.fv forwardValue3416_17_1;
    net.minecraft.block.state.IBlockState forwardValue3416_18_0;
    moom.fv forwardValue3416_18_1;
    int forwardValue3416_18_2;
    net.minecraft.block.state.IBlockState spill3416_0;
    moom.fv spill3416_1;
    boolean spill3416_2;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.state.IBlockState life3_23;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life4_3 = (moom.eD.Y ^ 106427918568573L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3416_0 = p2;
    spill3416_1 = moom.eD.R;
    spill3416_2 = __sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life6_5 != null))) {
        forwardValue3416_16_0 = spill3416_0;
        forwardValue3416_16_1 = spill3416_1;
        forwardValue3416_16_2 = ((spill3416_2) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3416_2))) {
        forwardValue3416_17_0 = spill3416_0;
        forwardValue3416_17_1 = spill3416_1;
        break forward_join_17;
    }
    forwardValue3416_16_0 = spill3416_0;
    forwardValue3416_16_1 = spill3416_1;
    forwardValue3416_16_2 = 1;
    }
    forwardValue3416_18_0 = forwardValue3416_16_0;
    forwardValue3416_18_1 = forwardValue3416_16_1;
    forwardValue3416_18_2 = forwardValue3416_16_2;
    break forward_join_18;
    }
    forwardValue3416_18_0 = forwardValue3416_17_0;
    forwardValue3416_18_1 = forwardValue3416_17_1;
    forwardValue3416_18_2 = 0;
    }
    life3_23 = ((net.minecraft.block.state.IBlockState)(forwardValue3416_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3416_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3416_18_2)))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_23)), ((int)(3)));
    ((moom.eD)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_23)));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7482_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/eD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_854ca8d6c5f94f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6483;
        if (bb[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = Z[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/eD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eD.bb[n2] = n3;
        }
        return bb[n2];
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3413_25_0;
    int forwardValue3413_37_0;
    int forwardValue3413_49_0;
    int forwardValue3413_61_0;
    int[] spill3413_0;
    boolean spill3413_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    forward_join_61: {
    forward_join_60: {
    forward_join_49: {
    forward_join_44: {
    forward_join_37: {
    forward_join_32: {
    forward_join_25: {
    forward_join_20: {
    life2_3 = (moom.eD.Y ^ 86432831572577L);
    spill3413_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3413_0;
    spill3413_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eD.Q))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue3413_25_0 = ((spill3413_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill3413_1)) {
        break forward_join_20;
    }
    life5_6 = (life5_6 | 1);
    }
    forwardValue3413_25_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eD.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue3413_37_0 = forwardValue3413_25_0;
        break forward_join_37;
    }
    if (!((forwardValue3413_25_0 != 0))) {
        break forward_join_32;
    }
    life5_6 = (life5_6 | 2);
    }
    forwardValue3413_37_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eD.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue3413_49_0 = forwardValue3413_37_0;
        break forward_join_49;
    }
    if (!((forwardValue3413_37_0 != 0))) {
        break forward_join_44;
    }
    life5_6 = (life5_6 | 4);
    }
    forwardValue3413_49_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eD.T))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue3413_61_0 = forwardValue3413_49_0;
        break forward_join_61;
    }
    if (!((forwardValue3413_49_0 != 0))) {
        break forward_join_60;
    }
    life5_6 = (life5_6 | __sourceIntrinsic_8db5871551d4_invokedynamic3413_22(26684, (4972312926486862969L ^ life2_3)));
    }
    forwardValue3413_61_0 = life5_6;
    }
    return forwardValue3413_61_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3417_16_0;
    moom.fv forwardValue3417_16_1;
    int forwardValue3417_16_2;
    net.minecraft.block.state.IBlockState forwardValue3417_17_0;
    moom.fv forwardValue3417_17_1;
    net.minecraft.block.state.IBlockState forwardValue3417_18_0;
    moom.fv forwardValue3417_18_1;
    int forwardValue3417_18_2;
    net.minecraft.block.state.IBlockState forwardValue3417_28_0;
    moom.fv forwardValue3417_28_1;
    int forwardValue3417_28_2;
    net.minecraft.block.state.IBlockState forwardValue3417_29_0;
    moom.fv forwardValue3417_29_1;
    net.minecraft.block.state.IBlockState forwardValue3417_30_0;
    moom.fv forwardValue3417_30_1;
    int forwardValue3417_30_2;
    net.minecraft.block.state.IBlockState forwardValue3417_40_0;
    moom.fv forwardValue3417_40_1;
    int forwardValue3417_40_2;
    net.minecraft.block.state.IBlockState forwardValue3417_41_0;
    moom.fv forwardValue3417_41_1;
    net.minecraft.block.state.IBlockState forwardValue3417_42_0;
    moom.fv forwardValue3417_42_1;
    int forwardValue3417_42_2;
    net.minecraft.block.state.IBlockState forwardValue3417_56_0;
    moom.fv forwardValue3417_56_1;
    int forwardValue3417_56_2;
    net.minecraft.block.state.IBlockState forwardValue3417_57_0;
    moom.fv forwardValue3417_57_1;
    net.minecraft.block.state.IBlockState forwardValue3417_58_0;
    moom.fv forwardValue3417_58_1;
    int forwardValue3417_58_2;
    net.minecraft.block.state.IBlockState spill3417_0;
    moom.fv spill3417_1;
    int spill3417_2;
    net.minecraft.block.state.IBlockState spill3417_3;
    moom.fv spill3417_4;
    int spill3417_5;
    net.minecraft.block.state.IBlockState spill3417_6;
    moom.fv spill3417_7;
    int spill3417_8;
    net.minecraft.block.state.IBlockState spill3417_9;
    moom.fv spill3417_10;
    int spill3417_11;
    long life2_3;
    int[] life4_5;
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.eD.Y ^ 72739959435627L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3417_0 = ((moom.eD)(this)).a__fE();
    spill3417_1 = moom.eD.Q;
    spill3417_2 = (p0 & 1);
    if (!((life4_5 != null))) {
        forwardValue3417_16_0 = spill3417_0;
        forwardValue3417_16_1 = spill3417_1;
        forwardValue3417_16_2 = spill3417_2;
        break forward_join_16;
    }
    if (!((spill3417_2 > 0))) {
        forwardValue3417_17_0 = spill3417_0;
        forwardValue3417_17_1 = spill3417_1;
        break forward_join_17;
    }
    forwardValue3417_16_0 = spill3417_0;
    forwardValue3417_16_1 = spill3417_1;
    forwardValue3417_16_2 = 1;
    }
    forwardValue3417_18_0 = forwardValue3417_16_0;
    forwardValue3417_18_1 = forwardValue3417_16_1;
    forwardValue3417_18_2 = forwardValue3417_16_2;
    break forward_join_18;
    }
    forwardValue3417_18_0 = forwardValue3417_17_0;
    forwardValue3417_18_1 = forwardValue3417_17_1;
    forwardValue3417_18_2 = 0;
    }
    spill3417_3 = ((net.minecraft.block.state.IBlockState)(forwardValue3417_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3417_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3417_18_2)))))));
    spill3417_4 = moom.eD.R;
    spill3417_5 = (p0 & 2);
    if (!((life4_5 != null))) {
        forwardValue3417_28_0 = spill3417_3;
        forwardValue3417_28_1 = spill3417_4;
        forwardValue3417_28_2 = spill3417_5;
        break forward_join_28;
    }
    if (!((spill3417_5 > 0))) {
        forwardValue3417_29_0 = spill3417_3;
        forwardValue3417_29_1 = spill3417_4;
        break forward_join_29;
    }
    forwardValue3417_28_0 = spill3417_3;
    forwardValue3417_28_1 = spill3417_4;
    forwardValue3417_28_2 = 1;
    }
    forwardValue3417_30_0 = forwardValue3417_28_0;
    forwardValue3417_30_1 = forwardValue3417_28_1;
    forwardValue3417_30_2 = forwardValue3417_28_2;
    break forward_join_30;
    }
    forwardValue3417_30_0 = forwardValue3417_29_0;
    forwardValue3417_30_1 = forwardValue3417_29_1;
    forwardValue3417_30_2 = 0;
    }
    spill3417_6 = ((net.minecraft.block.state.IBlockState)(forwardValue3417_30_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3417_30_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3417_30_2)))))));
    spill3417_7 = moom.eD.S;
    spill3417_8 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue3417_40_0 = spill3417_6;
        forwardValue3417_40_1 = spill3417_7;
        forwardValue3417_40_2 = spill3417_8;
        break forward_join_40;
    }
    if (!((spill3417_8 > 0))) {
        forwardValue3417_41_0 = spill3417_6;
        forwardValue3417_41_1 = spill3417_7;
        break forward_join_41;
    }
    forwardValue3417_40_0 = spill3417_6;
    forwardValue3417_40_1 = spill3417_7;
    forwardValue3417_40_2 = 1;
    }
    forwardValue3417_42_0 = forwardValue3417_40_0;
    forwardValue3417_42_1 = forwardValue3417_40_1;
    forwardValue3417_42_2 = forwardValue3417_40_2;
    break forward_join_42;
    }
    forwardValue3417_42_0 = forwardValue3417_41_0;
    forwardValue3417_42_1 = forwardValue3417_41_1;
    forwardValue3417_42_2 = 0;
    }
    spill3417_9 = ((net.minecraft.block.state.IBlockState)(forwardValue3417_42_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3417_42_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3417_42_2)))))));
    spill3417_10 = moom.eD.T;
    spill3417_11 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3417_13(2640, (1547530398457398556L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3417_56_0 = spill3417_9;
        forwardValue3417_56_1 = spill3417_10;
        forwardValue3417_56_2 = spill3417_11;
        break forward_join_56;
    }
    if (!((spill3417_11 > 0))) {
        forwardValue3417_57_0 = spill3417_9;
        forwardValue3417_57_1 = spill3417_10;
        break forward_join_57;
    }
    forwardValue3417_56_0 = spill3417_9;
    forwardValue3417_56_1 = spill3417_10;
    forwardValue3417_56_2 = 1;
    }
    forwardValue3417_58_0 = forwardValue3417_56_0;
    forwardValue3417_58_1 = forwardValue3417_56_1;
    forwardValue3417_58_2 = forwardValue3417_56_2;
    break forward_join_58;
    }
    forwardValue3417_58_0 = forwardValue3417_57_0;
    forwardValue3417_58_1 = forwardValue3417_57_1;
    forwardValue3417_58_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3417_58_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3417_58_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3417_58_2)))))));
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.eD)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    return;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.Block lexicalValue1141_75_0;
    net.minecraft.block.Block lexicalValue1141_75_1;
    int[] spill1141_0;
    net.minecraft.block.Block spill1141_1;
    moom.eE spill1141_2;
    long life4_3;
    moom.bs[] life7_15;
    int[] life6_16;
    int life8_19;
    int life9_21;
    moom.bs life10_28;
    int life11_30;
    moom.DT life12_42;
    net.minecraft.block.state.IBlockState life13_46;
    lexical_join_84: {
    life4_3 = (moom.eD.Y ^ 77433306120042L);
    spill1141_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_15 = new moom.bs[] {moom.bs.SOUTH, moom.bs.WEST};
    life6_16 = spill1141_0;
    life8_19 = (life7_15).length;
    life9_21 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_82: {
    lexical_join_81: {
    if (!((life9_21 < life8_19))) {
        break lexical_join_84;
    }
    life10_28 = (life7_15)[life9_21];
    life11_30 = 1;
    lexical_cycle_31: while (true) {
    lexical_join_78: {
    lexical_join_75: {
    lexical_join_72: {
    if (!((life11_30 < __sourceIntrinsic_48609344e626_invokedynamic1141_4(20572, (3253804954275008784L ^ life4_3))))) {
        break lexical_join_81;
    }
    life12_42 = ((moom.DT)(p1)).a(((moom.bs)(life10_28)), ((int)(life11_30)));
    life13_46 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_42)));
    if (!((life6_16 != null))) {
        break lexical_join_82;
    }
    spill1141_1 = ((net.minecraft.block.state.IBlockState)(life13_46)).a__ch();
    spill1141_2 = net.minecraft.init.Blocks.bG;
    if (!((life6_16 != null))) {
        lexicalValue1141_75_0 = spill1141_1;
        lexicalValue1141_75_1 = spill1141_2;
        break lexical_join_75;
    }
    if (!((spill1141_1 == spill1141_2))) {
        break lexical_join_72;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life13_46)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q))) == ((moom.bs)(life10_28)).a__bs()))) {
        break lexical_join_81;
    }
    ((moom.eE)(net.minecraft.init.Blocks.bG)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life12_42)), ((net.minecraft.block.state.IBlockState)(life13_46)), ((boolean)(false)), ((boolean)(true)), ((int)(life11_30)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_16 == null))) {
        break lexical_join_81;
    }
    }
    lexicalValue1141_75_0 = ((net.minecraft.block.state.IBlockState)(life13_46)).a__ch();
    lexicalValue1141_75_1 = net.minecraft.init.Blocks.bH;
    }
    if (!((lexicalValue1141_75_0 != lexicalValue1141_75_1))) {
        break lexical_join_78;
    }
    if (!((life6_16 == null))) {
        break lexical_join_81;
    }
    }
    life11_30 += 1;
    if (!((life6_16 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    life9_21 += 1;
    }
    if (!((life6_16 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return;
}


protected moom.fA a__fA() {
long life1_3;
    life1_3 = (moom.eD.Y ^ 140181009861555L);
    return new moom.fA(this, recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(new net.minecraft.block.properties.IProperty[__sourceIntrinsic_713a7e495fb6_invokedynamic400100_1(26684, (4972261653818121643L ^ life1_3))], 0, moom.eD.Q), 1, moom.eD.R), 2, moom.eD.S), 3, moom.eD.T), 4, moom.eD.U), 5, moom.eD.V), __sourceIntrinsic_713a7e495fb6_invokedynamic400100_14(20262, (7495840154271005365L ^ life1_3)), moom.eD.X), __sourceIntrinsic_713a7e495fb6_invokedynamic400100_17(18629, (6916873576602189139L ^ life1_3)), moom.eD.W));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT;
}


public static boolean a__sourceReturn_9c9864ce6b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3408_33_0;
    net.minecraft.block.Block forwardValue3408_36_0;
    net.minecraft.block.Block forwardValue3408_36_1;
    int forwardValue3408_55_0;
    int forwardValue3408_57_0;
    int[] spill3408_0;
    net.minecraft.block.Block spill3408_1;
    moom.eE spill3408_2;
    int spill3408_3;
    long life4_3;
    moom.DT life7_8;
    int[] life6_9;
    net.minecraft.block.state.IBlockState life8_13;
    net.minecraft.block.Block life9_16;
    moom.bs life10_27;
    int life10_47;
    int life11_53;
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_36: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    life4_3 = (moom.eD.Y ^ 135648510724376L);
    spill3408_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((moom.DT)(p1)).a(((moom.bs)(p3)));
    life6_9 = spill3408_0;
    life8_13 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life7_8)));
    life9_16 = ((net.minecraft.block.state.IBlockState)(life8_13)).a__ch();
    spill3408_1 = life9_16;
    spill3408_2 = net.minecraft.init.Blocks.bG;
    if (!((life6_9 != null))) {
        forwardValue3408_36_0 = spill3408_1;
        forwardValue3408_36_1 = spill3408_2;
        break forward_join_36;
    }
    if (!((spill3408_1 == spill3408_2))) {
        break forward_join_34;
    }
    life10_27 = ((moom.bs)(p3)).a__bs();
    if (!((((net.minecraft.block.state.IBlockState)(life8_13)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q))) == life10_27))) {
        break forward_join_32;
    }
    forwardValue3408_33_0 = 1;
    break forward_join_33;
    }
    forwardValue3408_33_0 = 0;
    }
    return ((forwardValue3408_33_0) != 0);
    }
    forwardValue3408_36_0 = life9_16;
    forwardValue3408_36_1 = net.minecraft.init.Blocks.bH;
    }
    if (!((forwardValue3408_36_0 == forwardValue3408_36_1))) {
        break forward_join_58;
    }
    life10_47 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eD.R))))))).booleanValue()) ? 1 : 0);
    life11_53 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life8_13)).a(((net.minecraft.block.properties.IProperty)(moom.eD.R))))))).booleanValue()) ? 1 : 0);
    spill3408_3 = life10_47;
    if (!((life6_9 != null))) {
        forwardValue3408_55_0 = spill3408_3;
        break forward_join_55;
    }
    if (!((spill3408_3 == life11_53))) {
        break forward_join_56;
    }
    forwardValue3408_55_0 = 1;
    }
    forwardValue3408_57_0 = forwardValue3408_55_0;
    break forward_join_57;
    }
    forwardValue3408_57_0 = 0;
    }
    return ((forwardValue3408_57_0) != 0);
    }
    return ((0) != 0);
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.U)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(__sourceExactCall_e724aeca9056c8(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p0)), ((moom.bs)(moom.bs.NORTH))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.V)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(__sourceExactCall_e724aeca9056c8(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p0)), ((moom.bs)(moom.bs.EAST))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.W)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(__sourceExactCall_e724aeca9056c8(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p0)), ((moom.bs)(moom.bs.SOUTH))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.X)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(__sourceExactCall_e724aeca9056c8(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p0)), ((moom.bs)(moom.bs.WEST)))))))));
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue3412_37_0;
    int[] spill3412_0;
    int spill3412_1;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int life7_14;
    int[] life5_15;
    int life8_21;
    forward_join_56: {
    forward_join_48: {
    forward_join_37: {
    forward_join_36: {
    life3_3 = (moom.eD.Y ^ 82171815098852L);
    spill3412_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life7_14 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.eD.S))))))).booleanValue()) ? 1 : 0);
    life5_15 = spill3412_0;
    life8_21 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.eD.R))))))).booleanValue()) ? 1 : 0);
    spill3412_1 = life8_21;
    if (!((life5_15 != null))) {
        forwardValue3412_37_0 = spill3412_1;
        break forward_join_37;
    }
    if (!((spill3412_1 == 0))) {
        break forward_join_36;
    }
    ((moom.eD)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.8p-4f)), ((float)(0x1.0p0f)));
    if (!((life5_15 == null))) {
        break forward_join_56;
    }
    }
    forwardValue3412_37_0 = life7_14;
    }
    if (!((forwardValue3412_37_0 == 0))) {
        break forward_join_48;
    }
    ((moom.eD)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    if (!((life5_15 == null))) {
        break forward_join_56;
    }
    }
    ((moom.eD)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-3f)), ((float)(0x1.0p0f)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
int forwardValue3410_16_0;
    boolean spill3410_0;
    long life5_3;
    int[] life7_5;
    forward_join_21: {
    forward_join_16: {
    life5_3 = (moom.eD.Y ^ 29857374316874L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3410_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3410_16_0 = ((spill3410_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3410_0))) {
        break forward_join_21;
    }
    forwardValue3410_16_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eD.Q))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue3410_16_0 == 0))) {
        break forward_join_21;
    }
    ((moom.eD)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3409_20_0;
    int forwardValue3409_22_0;
    int forwardValue3409_37_0;
    int[] spill3409_0;
    boolean spill3409_1;
    int spill3409_2;
    long life5_3;
    int life8_10;
    int[] life7_11;
    int life9_25;
    forward_join_38: {
    forward_join_37: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life5_3 = (moom.eD.Y ^ 133787701538621L);
    spill3409_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eD.R))))))).booleanValue()) ? 1 : 0);
    life7_11 = spill3409_0;
    spill3409_1 = __sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life7_11 != null))) {
        forwardValue3409_20_0 = ((spill3409_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill3409_1))) {
        break forward_join_21;
    }
    forwardValue3409_20_0 = 1;
    }
    forwardValue3409_22_0 = forwardValue3409_20_0;
    break forward_join_22;
    }
    forwardValue3409_22_0 = 0;
    }
    life9_25 = forwardValue3409_22_0;
    spill3409_2 = life8_10;
    if (!((life7_11 != null))) {
        forwardValue3409_37_0 = spill3409_2;
        break forward_join_37;
    }
    if (!((spill3409_2 != life9_25))) {
        break forward_join_38;
    }
    ((moom.eD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3409_37_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3409_37_0);
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
net.minecraft.item.ItemStack forwardValue3411_16_0;
    net.minecraft.item.ItemStack spill3411_0;
    long life5_3;
    int[] life7_5;
    forward_join_28: {
    forward_join_16: {
    life5_3 = (moom.eD.Y ^ 30603322095641L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_28;
    }
    spill3411_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW();
    if (!((life7_5 != null))) {
        forwardValue3411_16_0 = spill3411_0;
        break forward_join_16;
    }
    if (!((spill3411_0 != null))) {
        break forward_join_28;
    }
    forwardValue3411_16_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3411_16_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_28;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.T)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(4)));
    }
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.F;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.F;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_713a7e495fb6_invokedynamic400100_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_713a7e495fb6_invokedynamic400100_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_713a7e495fb6_invokedynamic400100_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7482_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3413_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3417_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_48609344e626_invokedynamic1141_4(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native int __sourceExactCall_854ca8d6c5f94f(int p0, long p1);
private static native boolean __sourceExactCall_e724aeca9056c8(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3);
}
