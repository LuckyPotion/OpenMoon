package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gv extends moom.FY {

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public Gv() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3116529085744398468L)), ((long)(3171849103013226736L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(84516332017369L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gv.c ^ 80616831465823L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill564_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill564_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill564_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill564_14 = new byte[8];
    (__sourceSpill564_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill564_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation564_16 = __sourceSpill564_14;
    ((javax.crypto.Cipher)(__sourceSpill564_11)).init(((int)(__sourceSpill564_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill564_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation564_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "OêbM×)t\026ý$\005î\026Óâ96W{!Eá\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill564_25 = local6_life21;
        int __sourceSpill564_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill564_25)).substring(((int)(__sourceSpill564_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill564_30 = local8_life19;
        int __sourceSpill564_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill564_33 = new byte[8];
        (__sourceSpill564_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill564_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill564_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill564_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill564_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill564_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill564_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill564_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill564_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill564_34)).doFinal(((byte[])(__sourceSpill564_33)));
        (__sourceSpill564_30)[__sourceSpill564_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4701_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xC68;
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
                throw new RuntimeException("moom/Gv", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gv.e[n2] = n3;
        }
        return e[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
net.minecraft.block.Block lexicalValue719_73_0;
    int lexicalValue719_90_0;
    int lexicalValue719_95_0;
    int[] spill719_0;
    boolean spill719_1;
    net.minecraft.block.Block spill719_2;
    boolean spill719_3;
    long life4_3;
    int life7_6;
    int[] life6_7;
    moom.DT life8_54;
    lexical_join_95: {
    lexical_join_94: {
    life4_3 = (moom.Gv.c ^ 134422257131927L);
    spill719_0 = moom.FY.b();
    life7_6 = 0;
    life6_7 = spill719_0;
    lexical_cycle_8: while (true) {
    lexical_join_92: {
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_73: {
    if (!((life7_6 < __sourceIntrinsic_e7ba66b54646_invokedynamic719_2(6451, (8891250330184388646L ^ life4_3))))) {
        break lexical_join_94;
    }
    life8_54 = ((moom.DT)(p2)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic719_3(4325, (7834713288190401010L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic719_5(7130, (3336599345872999116L ^ life4_3)))))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic719_9(7130, (3336599345872999116L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic719_11(7130, (3336599345872999116L ^ life4_3)))))))));
    if (!((life6_7 != null))) {
        break lexical_join_92;
    }
    spill719_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life8_54)));
    if (!((life6_7 != null))) {
        lexicalValue719_95_0 = ((spill719_1) ? 1 : 0);
        break lexical_join_95;
    }
    if (!(spill719_1)) {
        break lexical_join_91;
    }
    spill719_2 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life8_54)).b__DT()))))).a__ch();
    if (!((life6_7 != null))) {
        lexicalValue719_73_0 = spill719_2;
        break lexical_join_73;
    }
    if (!((spill719_2 == net.minecraft.init.Blocks.c))) {
        break lexical_join_91;
    }
    lexicalValue719_73_0 = net.minecraft.init.Blocks.aU;
    }
    spill719_3 = ((net.minecraft.block.Block)(lexicalValue719_73_0)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life8_54)));
    if (!((life6_7 != null))) {
        lexicalValue719_90_0 = ((spill719_3) ? 1 : 0);
        break lexical_join_90;
    }
    if (!(spill719_3)) {
        break lexical_join_91;
    }
    lexicalValue719_90_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life8_54)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dl.Q)), ((java.lang.Comparable)(((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p1)))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue719_90_0);
    }
    life7_6 += 1;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue719_95_0 = 1;
    }
    return ((lexicalValue719_95_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4701_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic719_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic719_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic719_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic719_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic719_11(int a0, long a1) throws E;
}
