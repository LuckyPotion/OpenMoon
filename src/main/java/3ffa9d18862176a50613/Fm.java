package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fm {

private short[] a;

private net.minecraft.block.state.IBlockState b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public Fm() { super(); }


private static void __sourceConstructorBody_6d75510513dd486c(moom.Fm receiver) throws Throwable {

long local1 = (moom.Fm.c ^ 32295306044599L);

    moom.Fm.__sourceConstructorInit_6d75510513dd486c_0(((moom.Fm)(receiver)));

    ((moom.Fm)(receiver)).a = ((short[])(new short[__sourceIntrinsic_6d75510513dd486c_originalDynamicSite2039_2(24120, (278937771125716830L ^ local1))]));

    ((moom.Fm)(receiver)).b = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6d75510513dd486c_0(moom.Fm a0) throws E;

static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3040180680308044680L)), ((long)(-4601665383113173992L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44494727641315L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Fm.c ^ 112149821874309L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill758_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill758_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill758_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill758_14 = new byte[8];
    (__sourceSpill758_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill758_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation758_16 = __sourceSpill758_14;
    ((javax.crypto.Cipher)(__sourceSpill758_11)).init(((int)(__sourceSpill758_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill758_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation758_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "½ùüË<ðL¼ò2A0>\005Våy+òÛ("))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill758_25 = local6_life21;
        int __sourceSpill758_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill758_25)).substring(((int)(__sourceSpill758_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill758_30 = local8_life19;
        int __sourceSpill758_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill758_33 = new byte[8];
        (__sourceSpill758_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill758_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill758_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill758_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill758_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill758_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill758_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill758_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill758_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill758_34)).doFinal(((byte[])(__sourceSpill758_33)));
        (__sourceSpill758_30)[__sourceSpill758_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "4\005TçZålÈQ\020Ãéì×"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill758_38 = local6_life21;
        int __sourceSpill758_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill758_38)).substring(((int)(__sourceSpill758_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill758_43 = local8_life19;
        int __sourceSpill758_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill758_46 = new byte[8];
        (__sourceSpill758_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill758_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill758_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill758_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill758_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill758_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill758_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill758_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill758_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill758_47)).doFinal(((byte[])(__sourceSpill758_46)));
        (__sourceSpill758_43)[__sourceSpill758_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static java.lang.IndexOutOfBoundsException a(java.lang.IndexOutOfBoundsException p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xE9D;
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
                throw new RuntimeException("moom/Fm", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fm.e[n2] = n3;
        }
        return e[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4544_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState a(int p0) {
int forwardValue1943_11_0;
    net.minecraft.block.state.IBlockState forwardValue1943_28_0;
    net.minecraft.block.state.IBlockState forwardValue1943_31_0;
    int spill1943_0;
    net.minecraft.block.state.IBlockState spill1943_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.block.state.IBlockState life5_25;
    forward_join_32: {
    forward_join_31: {
    forward_join_29: {
    forward_join_28: {
    forward_join_11: {
    life2_3 = (moom.Fm.c ^ 112799601797387L);
    life4_5 = net.minecraft.world.chunk.Chunk.b__String();
    spill1943_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1943_11_0 = spill1943_0;
        break forward_join_11;
    }
    if (!((spill1943_0 >= 0))) {
        break forward_join_32;
    }
    forwardValue1943_11_0 = p0;
    }
    if (!((forwardValue1943_11_0 < (this.a).length))) {
        break forward_join_32;
    }
    life5_25 = ((net.minecraft.block.state.IBlockState)(((moom.Dx)(net.minecraft.block.Block.c)).a(((int)((this.a)[p0])))));
    spill1943_1 = life5_25;
    if (!((life4_5 == null))) {
        forwardValue1943_28_0 = spill1943_1;
        break forward_join_28;
    }
    if (!((spill1943_1 != null))) {
        break forward_join_29;
    }
    forwardValue1943_28_0 = life5_25;
    }
    forwardValue1943_31_0 = forwardValue1943_28_0;
    break forward_join_31;
    }
    forwardValue1943_31_0 = this.b;
    }
    return forwardValue1943_31_0;
    }
    throw new java.lang.IndexOutOfBoundsException("The coordinate is out of range");
}


public void a(int p0, int p1, int p2, net.minecraft.block.state.IBlockState p3) {
long local5 = (moom.Fm.c ^ 125134414654328L);
    int local7 = (((p0 << __sourceIntrinsic_50e9152e414a_originalDynamicSite1151_1(32695, (5549305031428872479L ^ local5))) | (p2 << __sourceIntrinsic_50e9152e414a_originalDynamicSite1151_2(16947, (7120305552507151513L ^ local5)))) | p1);
    ((moom.Fm)(this)).a(((int)(local7)), ((net.minecraft.block.state.IBlockState)(p3)));
    return;
}


public void a(int p0, net.minecraft.block.state.IBlockState p1) {
int forwardValue1944_11_0;
    int spill1944_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_30: {
    forward_join_25: {
    forward_join_11: {
    life3_3 = (moom.Fm.c ^ 64237041600867L);
    life5_5 = net.minecraft.world.chunk.Chunk.b__String();
    spill1944_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue1944_11_0 = spill1944_0;
        break forward_join_11;
    }
    if (!((spill1944_0 >= 0))) {
        break forward_join_25;
    }
    forwardValue1944_11_0 = p0;
    }
    if (!((forwardValue1944_11_0 < (this.a).length))) {
        break forward_join_25;
    }
    (this.a)[p0] = ((short) ((moom.Dx)(net.minecraft.block.Block.c)).a(((java.lang.Object)(p1))));
    if (!((life5_5 != null))) {
        break forward_join_30;
    }
    }
    throw new java.lang.IndexOutOfBoundsException("The coordinate is out of range");
    }
    return;
}


public net.minecraft.block.state.IBlockState a(int p0, int p1, int p2) {
long local4 = (moom.Fm.c ^ 87629397870468L);
    int local6 = (((p0 << __sourceIntrinsic_6ee239b26731_originalDynamicSite1152_1(25617, (341402732787789382L ^ local4))) | (p2 << __sourceIntrinsic_6ee239b26731_originalDynamicSite1152_2(32550, (9123313491464484215L ^ local4)))) | p1);
    return ((moom.Fm)(this)).a(((int)(local6)));
}


private static native <E extends Throwable> int __sourceIntrinsic_6d75510513dd486c_originalDynamicSite2039_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4544_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e9152e414a_originalDynamicSite1151_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e9152e414a_originalDynamicSite1151_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6ee239b26731_originalDynamicSite1152_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6ee239b26731_originalDynamicSite1152_2(int a0, long a1) throws E;
}
