package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gg extends moom.FY {

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public Gg() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(4547374700998790162L)), ((long)(2598374798451818657L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(104979308464739L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gg.c ^ 93602729847893L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill559_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill559_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill559_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill559_14 = new byte[8];
    (__sourceSpill559_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill559_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation559_16 = __sourceSpill559_14;
    ((javax.crypto.Cipher)(__sourceSpill559_11)).init(((int)(__sourceSpill559_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill559_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation559_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "uîwñ0c\026ìíæ½¹ðDJ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill559_25 = local6_life21;
        int __sourceSpill559_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill559_25)).substring(((int)(__sourceSpill559_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill559_30 = local8_life19;
        int __sourceSpill559_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill559_33 = new byte[8];
        (__sourceSpill559_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill559_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill559_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill559_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill559_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill559_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill559_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill559_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill559_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill559_34)).doFinal(((byte[])(__sourceSpill559_33)));
        (__sourceSpill559_30)[__sourceSpill559_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4676_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gg.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x54EA;
        if (e[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Gg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gg.e[n2] = n3;
        }
        return e[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue707_30_0;
    int lexicalValue707_97_0;
    int lexicalValue707_102_0;
    int spill707_0;
    boolean spill707_1;
    boolean spill707_2;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_11;
    int life8_36;
    moom.DT life9_79;
    lexical_join_102: {
    lexical_join_101: {
    lexical_join_30: {
    lexical_join_29: {
    life4_3 = (moom.Gg.c ^ 15691762828634L);
    life6_5 = moom.FY.b();
    lexical_cycle_6: while (true) {
    lexical_join_19: {
    if (!((((net.minecraft.block.Block)((life7_11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch()))).a__fn() != moom.fn.a))) {
        break lexical_join_19;
    }
    if (!((((net.minecraft.block.Block)(life7_11)).a__fn() == moom.fn.j))) {
        break lexical_join_29;
    }
    }
    spill707_0 = ((moom.DT)(p2)).b();
    if (!((life6_5 != null))) {
        lexicalValue707_30_0 = spill707_0;
        break lexical_join_30;
    }
    if (!((spill707_0 > 0))) {
        break lexical_join_29;
    }
    p2 = ((moom.DT)(p2)).b__DT();
    if (!((life6_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexicalValue707_30_0 = 0;
    }
    life8_36 = lexicalValue707_30_0;
    lexical_cycle_31: while (true) {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_97: {
    if (!((life8_36 < 4))) {
        break lexical_join_101;
    }
    life9_79 = ((moom.DT)(p2)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic707_10(16101, (8189329377660301169L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic707_12(8029, (6867436643391557320L ^ life4_3)))))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic707_16(8029, (6867436643391557320L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic707_18(8029, (6867436643391557320L ^ life4_3)))))))));
    if (!((life6_5 != null))) {
        break lexical_join_99;
    }
    spill707_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life9_79)));
    if (!((life6_5 != null))) {
        lexicalValue707_102_0 = ((spill707_1) ? 1 : 0);
        break lexical_join_102;
    }
    if (!(spill707_1)) {
        break lexical_join_98;
    }
    spill707_2 = ((moom.cy)(net.minecraft.init.Blocks.I)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_79)), ((net.minecraft.block.state.IBlockState)(((moom.cy)(net.minecraft.init.Blocks.I)).a__fE())));
    if (!((life6_5 != null))) {
        lexicalValue707_97_0 = ((spill707_2) ? 1 : 0);
        break lexical_join_97;
    }
    if (!(spill707_2)) {
        break lexical_join_98;
    }
    lexicalValue707_97_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_79)), ((net.minecraft.block.state.IBlockState)(((moom.cy)(net.minecraft.init.Blocks.I)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue707_97_0);
    }
    life8_36 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    lexicalValue707_102_0 = 1;
    }
    return ((lexicalValue707_102_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4676_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic707_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic707_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic707_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic707_18(int a0, long a1) throws E;
}
