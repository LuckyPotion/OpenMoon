package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hf extends moom.Hc {

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public Hf() {
super();
}


public Hf(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(8138600967407932142L)), ((long)(9138159769027620225L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(267844075530681L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hf.f ^ 90233504835249L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill833_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill833_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill833_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill833_14 = new byte[8];
    (__sourceSpill833_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill833_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation833_16 = __sourceSpill833_14;
    ((javax.crypto.Cipher)(__sourceSpill833_11)).init(((int)(__sourceSpill833_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill833_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation833_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Â8YF\020Ï\032wÕä4þHË B=4¼\005Z=º\rñúì£U?(Gþ$(¤Læ^¤Ý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill833_25 = local6_life21;
        int __sourceSpill833_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill833_25)).substring(((int)(__sourceSpill833_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill833_30 = local8_life19;
        int __sourceSpill833_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill833_33 = new byte[8];
        (__sourceSpill833_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill833_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill833_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill833_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill833_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill833_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill833_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill833_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill833_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill833_34)).doFinal(((byte[])(__sourceSpill833_33)));
        (__sourceSpill833_30)[__sourceSpill833_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "úkoO\r½þT¸/%²àÉ¤"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill833_38 = local6_life21;
        int __sourceSpill833_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill833_38)).substring(((int)(__sourceSpill833_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill833_43 = local8_life19;
        int __sourceSpill833_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill833_46 = new byte[8];
        (__sourceSpill833_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill833_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill833_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill833_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill833_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill833_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill833_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill833_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill833_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill833_47)).doFinal(((byte[])(__sourceSpill833_46)));
        (__sourceSpill833_43)[__sourceSpill833_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hf.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1DFE;
        if (h[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Hf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hf.h[n2] = n3;
        }
        return h[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4830_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static moom.Hf a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.Hf forwardValue2130_44_0;
    long life7_3;
    moom.G2 life9_27;
    forward_join_44: {
    forward_join_43: {
    life7_3 = (moom.Hf.f ^ 110975605129379L);
    life9_27 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(__sourceIntrinsic_33cc5cdf8185_invokedynamic2130_1(625, (6907147269361016821L ^ life7_3)))), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_33cc5cdf8185_invokedynamic2130_2(23907, (8481839281596743908L ^ life7_3)))), ((int)(__sourceIntrinsic_33cc5cdf8185_invokedynamic2130_3(9361, (2494139756605880592L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.Hf.a(((moom.G2)(life9_27))))) {
        break forward_join_43;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_27))) == null))) {
        break forward_join_43;
    }
    forwardValue2130_44_0 = new moom.Hf(p6, p1, life9_27, p5);
    break forward_join_44;
    }
    forwardValue2130_44_0 = null;
    }
    return forwardValue2130_44_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
((moom.Hf)(this)).a(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(0)), ((boolean)(true)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue760_184_0;
    int lexicalValue760_184_1;
    int lexicalValue760_227_0;
    int lexicalValue760_249_0;
    net.minecraft.entity.Entity[] spill760_0;
    int spill760_1;
    int spill760_2;
    int spill760_3;
    long life4_3;
    int life7_9;
    int life8_11;
    net.minecraft.entity.Entity[] life6_12;
    int life9_29;
    int life10_47;
    int life11_242;
    lexical_join_249: {
    lexical_join_248: {
    life4_3 = (moom.Hf.f ^ 33329631044593L);
    spill760_0 = moom.G4.b();
    life7_9 = ((moom.Hf)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)), ((int)(2)));
    life8_11 = 0;
    life6_12 = spill760_0;
    lexical_cycle_13: while (true) {
    lexical_join_246: {
    lexical_join_245: {
    lexical_join_227: {
    lexical_join_226: {
    lexical_join_184: {
    lexical_join_129: {
    if (!((life8_11 <= __sourceIntrinsic_5ac1d031d896_invokedynamic760_4(21709, (5648639950558243356L ^ life4_3))))) {
        break lexical_join_248;
    }
    life9_29 = java.lang.Math.max(((int)(1)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic760_5(24667, (5743952265406946959L ^ life4_3)) - life8_11))));
    life10_47 = java.lang.Math.min(((int)(java.lang.Math.max(((int)((life9_29 + 5))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic760_7(12378, (473404833712098952L ^ life4_3)) - life8_11)))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic760_9(20674, (1935664727290916373L ^ life4_3)))));
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(life8_11)), ((int)(4)), ((int)(life9_29)), ((int)(life8_11)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)((life9_29 + 1))), ((int)(life8_11)), ((int)(3)), ((int)((life10_47 - 1))), ((int)(life8_11)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    spill760_1 = life8_11;
    if (!((life6_12 != null))) {
        lexicalValue760_249_0 = spill760_1;
        break lexical_join_249;
    }
    spill760_2 = __sourceIntrinsic_5ac1d031d896_invokedynamic760_21(20961, (2889519632742854449L ^ life4_3));
    if (!((life6_12 != null))) {
        lexicalValue760_184_0 = spill760_1;
        lexicalValue760_184_1 = spill760_2;
        break lexical_join_184;
    }
    if (!((spill760_1 <= spill760_2))) {
        break lexical_join_129;
    }
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life7_9))))), ((int)(1)), ((int)((life9_29 + 1))), ((int)(life8_11)), ((moom.G2)(p2)));
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life7_9))))), ((int)(2)), ((int)((life9_29 + 1))), ((int)(life8_11)), ((moom.G2)(p2)));
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life7_9))))), ((int)(3)), ((int)((life9_29 + 1))), ((int)(life8_11)), ((moom.G2)(p2)));
    }
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(life10_47)), ((int)(life8_11)), ((int)(4)), ((int)(life10_47)), ((int)(life8_11)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)((life9_29 + 1))), ((int)(life8_11)), ((int)(0)), ((int)((life10_47 - 1))), ((int)(life8_11)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)((life9_29 + 1))), ((int)(life8_11)), ((int)(4)), ((int)((life10_47 - 1))), ((int)(life8_11)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    lexicalValue760_184_0 = life8_11;
    lexicalValue760_184_1 = 1;
    }
    spill760_3 = (lexicalValue760_184_0 & lexicalValue760_184_1);
    if (!((life6_12 != null))) {
        lexicalValue760_227_0 = spill760_3;
        break lexical_join_227;
    }
    if (!((spill760_3 == 0))) {
        break lexical_join_226;
    }
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)((life9_29 + 2))), ((int)(life8_11)), ((int)(0)), ((int)((life9_29 + 3))), ((int)(life8_11)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hf)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)((life9_29 + 2))), ((int)(life8_11)), ((int)(4)), ((int)((life9_29 + 3))), ((int)(life8_11)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    }
    lexicalValue760_227_0 = 0;
    }
    life11_242 = lexicalValue760_227_0;
    lexical_cycle_228: while (true) {
    if (!((life11_242 <= 4))) {
        break lexical_join_245;
    }
    ((moom.Hf)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life11_242)), ((int)(-1)), ((int)(life8_11)), ((moom.G2)(p2)));
    life11_242 += 1;
    if (!((life6_12 != null))) {
        break lexical_join_246;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_228; }
    break lexical_cycle_228;
    }
    }
    life8_11 += 1;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue760_249_0 = 1;
    }
    return ((lexicalValue760_249_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_33cc5cdf8185_invokedynamic2130_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_33cc5cdf8185_invokedynamic2130_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_33cc5cdf8185_invokedynamic2130_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic760_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic760_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic760_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic760_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic760_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4830_0() throws E;
}
