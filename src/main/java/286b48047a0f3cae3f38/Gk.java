package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gk extends moom.FY {

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public Gk() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(2758788472357517317L)), ((long)(-1627829334676278684L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(23088481791749L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gk.c ^ 42040736156103L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill561_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill561_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill561_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill561_14 = new byte[8];
    (__sourceSpill561_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill561_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation561_16 = __sourceSpill561_14;
    ((javax.crypto.Cipher)(__sourceSpill561_11)).init(((int)(__sourceSpill561_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill561_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation561_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÿ)\fQÛ©¿0Ç%\nùØ~6\177AÊ¼x\020="))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill561_25 = local6_life21;
        int __sourceSpill561_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill561_25)).substring(((int)(__sourceSpill561_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill561_30 = local8_life19;
        int __sourceSpill561_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill561_33 = new byte[8];
        (__sourceSpill561_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill561_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill561_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill561_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill561_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill561_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill561_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill561_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill561_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill561_34)).doFinal(((byte[])(__sourceSpill561_33)));
        (__sourceSpill561_30)[__sourceSpill561_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4684_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5203;
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
                throw new RuntimeException("moom/Gk", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gk.e[n2] = n3;
        }
        return e[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
net.minecraft.world.World lexicalValue711_74_0;
    moom.DT lexicalValue711_74_1;
    int lexicalValue711_83_0;
    int[] spill711_0;
    boolean spill711_1;
    net.minecraft.world.World spill711_2;
    moom.DT spill711_3;
    long life4_3;
    int life7_6;
    int[] life6_7;
    moom.DT life8_54;
    lexical_join_83: {
    lexical_join_82: {
    life4_3 = (moom.Gk.c ^ 42724796113637L);
    spill711_0 = moom.FY.b();
    life7_6 = 0;
    life6_7 = spill711_0;
    lexical_cycle_8: while (true) {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_74: {
    if (!((life7_6 < __sourceIntrinsic_e7ba66b54646_invokedynamic711_2(19101, (9184537354226277856L ^ life4_3))))) {
        break lexical_join_82;
    }
    life8_54 = ((moom.DT)(p2)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic711_3(17258, (5856433335833859094L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic711_5(20687, (8852463079591741361L ^ life4_3)))))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic711_9(20687, (8852463079591741361L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic711_11(20687, (8852463079591741361L ^ life4_3)))))))));
    if (!((life6_7 != null))) {
        break lexical_join_80;
    }
    spill711_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life8_54)));
    if (!((life6_7 != null))) {
        lexicalValue711_83_0 = ((spill711_1) ? 1 : 0);
        break lexical_join_83;
    }
    if (!(spill711_1)) {
        break lexical_join_79;
    }
    spill711_2 = p0;
    spill711_3 = ((moom.DT)(life8_54)).b__DT();
    if (!((life6_7 != null))) {
        lexicalValue711_74_0 = spill711_2;
        lexicalValue711_74_1 = spill711_3;
        break lexical_join_74;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill711_2)).a__fE(((moom.DT)(spill711_3))))).a__ch() == net.minecraft.init.Blocks.aV))) {
        break lexical_join_79;
    }
    lexicalValue711_74_0 = p0;
    lexicalValue711_74_1 = life8_54;
    }
    ((net.minecraft.world.World)(lexicalValue711_74_0)).a(((moom.DT)(lexicalValue711_74_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())), ((int)(2)));
    }
    life7_6 += 1;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue711_83_0 = 1;
    }
    return ((lexicalValue711_83_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4684_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic711_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic711_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic711_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic711_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic711_11(int a0, long a1) throws E;
}
