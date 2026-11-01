package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Is extends moom.Ir {

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map j;

public Is() {
super();
}


public Is(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) { super(0, 0); }


private static void __sourceConstructorBody_9c9b00b15733bbfd(moom.Is receiver, net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) throws Throwable {

long local5_life2;

    moom.Hl local8_life6;

    net.minecraft.entity.Entity[] local7_life7;

    java.util.List local9_life13;

    int local10_life17;

    moom.G4 local11_life20;

    init_join_78: {

    init_join_62: {

    local5_life2 = (moom.Is.e ^ 8123485753918L);

    net.minecraft.entity.Entity[] __sourceSpill512_4 = moom.G4.b();

    moom.Is.__sourceConstructorInit_9c9b00b15733bbfd_0(((moom.Is)(receiver)), ((int)(p2)), ((int)(p3)));

    local8_life6 = new moom.Hl(p1, ((p2 << 4) + 2), ((p3 << 4) + 2));

    local7_life7 = __sourceSpill512_4;

    ((java.util.LinkedList)(((moom.Is)(receiver)).a)).add(((java.lang.Object)(local8_life6)));

    ((moom.Hl)(local8_life6)).a(((moom.G4)(local8_life6)), ((java.util.List)(((moom.Is)(receiver)).a)), ((java.util.Random)(p1)));

    local9_life13 = ((moom.Hl)(local8_life6)).i;

    init_cycle_39: while (true) {

    if (!((!((java.util.List)(local9_life13)).isEmpty()))) {

        break init_join_62;

    }

    local10_life17 = ((java.util.Random)(p1)).nextInt(((int)(((java.util.List)(local9_life13)).size())));

    local11_life20 = ((moom.G4)(((java.util.List)(local9_life13)).remove(((int)(local10_life17)))));

    ((moom.G4)(local11_life20)).a(((moom.G4)(local8_life6)), ((java.util.List)(((moom.Is)(receiver)).a)), ((java.util.Random)(p1)));

    if (!((local7_life7 != null))) {

        break init_join_78;

    }

    if (!((local7_life7 == null))) { continue init_cycle_39; }

    break init_cycle_39;

    }

    }

    ((moom.Is)(receiver)).a__Void();

    ((moom.Is)(receiver)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((int)(__sourceIntrinsic_9c9b00b15733bbfd_originalDynamicSite512_25(25164, (8492648534813366782L ^ local5_life2)))), ((int)(__sourceIntrinsic_9c9b00b15733bbfd_originalDynamicSite512_27(5056, (1685822305045063795L ^ local5_life2)))));

    }

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(-5665583635804971911L)), ((long)(7771288091495036696L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74164383152464L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Is.e ^ 79544563115438L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill583_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill583_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill583_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill583_14 = new byte[8];
    (__sourceSpill583_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill583_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation583_16 = __sourceSpill583_14;
    ((javax.crypto.Cipher)(__sourceSpill583_11)).init(((int)(__sourceSpill583_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill583_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation583_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "&kBÆã=&jÁY\001"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill583_25 = local6_life21;
        int __sourceSpill583_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill583_25)).substring(((int)(__sourceSpill583_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill583_30 = local8_life19;
        int __sourceSpill583_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill583_33 = new byte[8];
        (__sourceSpill583_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill583_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill583_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill583_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill583_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill583_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill583_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill583_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill583_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill583_34)).doFinal(((byte[])(__sourceSpill583_33)));
        (__sourceSpill583_30)[__sourceSpill583_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_9c9b00b15733bbfd_0(moom.Is a0, int a1, int a2) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3AEC;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Is", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Is.g[n2] = n3;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Is.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4968_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Is"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static native <E extends Throwable> int __sourceIntrinsic_9c9b00b15733bbfd_originalDynamicSite512_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9c9b00b15733bbfd_originalDynamicSite512_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4968_0() throws E;
}
