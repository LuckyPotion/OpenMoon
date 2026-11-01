package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GB extends moom.FY {

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public GB() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(4487428542869212780L)), ((long)(-1584525992855635119L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122510075871661L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.GB.c ^ 36807283700285L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill547_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill547_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill547_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill547_14 = new byte[8];
    (__sourceSpill547_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill547_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation547_16 = __sourceSpill547_14;
    ((javax.crypto.Cipher)(__sourceSpill547_11)).init(((int)(__sourceSpill547_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill547_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation547_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "X\020çÜ\022ì2Yë\024!çÌ\017%\bzHÆ»mù"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill547_25 = local6_life21;
        int __sourceSpill547_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill547_25)).substring(((int)(__sourceSpill547_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill547_30 = local8_life19;
        int __sourceSpill547_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill547_33 = new byte[8];
        (__sourceSpill547_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill547_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill547_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill547_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill547_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill547_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill547_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill547_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill547_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill547_34)).doFinal(((byte[])(__sourceSpill547_33)));
        (__sourceSpill547_30)[__sourceSpill547_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4614_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x20CC;
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
                throw new RuntimeException("moom/GB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GB.e[n2] = n3;
        }
        return e[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue676_100_0;
    int lexicalValue676_105_0;
    int[] spill676_0;
    boolean spill676_1;
    boolean spill676_2;
    long life4_3;
    int life7_6;
    int[] life6_7;
    int life8_33;
    int life9_44;
    int life10_63;
    lexical_join_105: {
    lexical_join_104: {
    life4_3 = (moom.GB.c ^ 13845505245574L);
    spill676_0 = moom.FY.b();
    life7_6 = 0;
    life6_7 = spill676_0;
    lexical_cycle_8: while (true) {
    lexical_join_102: {
    lexical_join_101: {
    lexical_join_100: {
    if (!((life7_6 < __sourceIntrinsic_e7ba66b54646_invokedynamic676_2(915, (8845411125181785633L ^ life4_3))))) {
        break lexical_join_104;
    }
    life8_33 = ((((moom.DT)(p2)).a() + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic676_4(18119, (6308588972935766902L ^ life4_3)))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic676_6(31788, (3225269323324316063L ^ life4_3))))));
    life9_44 = ((((moom.DT)(p2)).b() + ((java.util.Random)(p1)).nextInt(((int)(4)))) - ((java.util.Random)(p1)).nextInt(((int)(4))));
    life10_63 = ((((moom.DT)(p2)).c() + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic676_12(31788, (3225269323324316063L ^ life4_3)))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic676_14(31788, (3225269323324316063L ^ life4_3))))));
    if (!((life6_7 != null))) {
        break lexical_join_102;
    }
    spill676_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(new moom.DT(life8_33, life9_44, life10_63))));
    if (!((life6_7 != null))) {
        lexicalValue676_105_0 = ((spill676_1) ? 1 : 0);
        break lexical_join_105;
    }
    if (!(spill676_1)) {
        break lexical_join_101;
    }
    spill676_2 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bm)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(new moom.DT(life8_33, life9_44, life10_63))));
    if (!((life6_7 != null))) {
        lexicalValue676_100_0 = ((spill676_2) ? 1 : 0);
        break lexical_join_100;
    }
    if (!(spill676_2)) {
        break lexical_join_101;
    }
    lexicalValue676_100_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(new moom.DT(life8_33, life9_44, life10_63))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bm)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue676_100_0);
    }
    life7_6 += 1;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue676_105_0 = 1;
    }
    return ((lexicalValue676_105_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4614_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic676_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic676_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic676_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic676_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic676_14(int a0, long a1) throws E;
}
