package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ed extends moom.Ec {

private static net.minecraft.block.state.IBlockState f;

private moom.DT g;

private int[] h;

private net.minecraft.block.state.IBlockState[] i;

private static java.util.ArrayDeque<int[]> j;

private static java.util.ArrayDeque<net.minecraft.block.state.IBlockState[]> k;

private static int l;

private static long m;

private static long[] r;

private static java.lang.Integer[] s;

private static java.util.Map t;

public Ed(net.minecraft.world.World p0, moom.DT p1, moom.DT p2, int p3) { super((net.minecraft.world.World)null, (moom.DT)null, (moom.DT)null, 0); }

private static void __sourceConstructorBody_25740fe26578efb9(moom.Ed receiver, net.minecraft.world.World p0, moom.DT p1, moom.DT p2, int p3) throws Throwable {
long local5 = (moom.Ed.m ^ 16583367568853L);
    moom.Ed.__sourceConstructorInit_25740fe26578efb9_0(((moom.Ed)(receiver)), ((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.DT)(p2)), ((int)(p3)));
    ((moom.Ed)(receiver)).g = ((moom.DT)(((moom.DT)(p1)).b(((moom.DS)(new moom.DS(p3, p3, p3))))));
    int local7 = __sourceIntrinsic_25740fe26578efb9_originalDynamicSite1970_4(28791, (5153196554597094647L ^ local5));
    ((moom.Ed)(receiver)).h = ((int[])(moom.Ed.a(((int)(__sourceIntrinsic_25740fe26578efb9_originalDynamicSite1970_5(9779, (1934463010890449584L ^ local5)))))));
    java.util.Arrays.fill(((int[])(((moom.Ed)(receiver)).h)), ((int)(-1)));
    ((moom.Ed)(receiver)).i = ((net.minecraft.block.state.IBlockState[])(moom.Ed.a__ArrayfE(((int)(__sourceIntrinsic_25740fe26578efb9_originalDynamicSite1970_10(9779, (1934463010890449584L ^ local5)))))));
    return;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-353907011178173396L)), ((long)(6048116380672831537L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215093415868395L)))));
    long local11_life6 = (moom.Ed.m ^ 65722789158984L);
    t = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill719_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill719_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill719_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill719_14 = new byte[8];
    (__sourceSpill719_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill719_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation719_16 = __sourceSpill719_14;
    ((javax.crypto.Cipher)(__sourceSpill719_11)).init(((int)(__sourceSpill719_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill719_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation719_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[5];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "®ÏÛ{æ~:\030\t>+Wájþ¦Ésêá\177E\""))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill719_25 = local4_life21;
        int __sourceSpill719_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill719_25)).substring(((int)(__sourceSpill719_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill719_30 = local6_life19;
        int __sourceSpill719_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill719_33 = new byte[8];
        (__sourceSpill719_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill719_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill719_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill719_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill719_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill719_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill719_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill719_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill719_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill719_34)).doFinal(((byte[])(__sourceSpill719_33)));
        (__sourceSpill719_30)[__sourceSpill719_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¿¯mHÃ\t\025\001{.´\0053\037(Ä"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill719_38 = local4_life21;
        int __sourceSpill719_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill719_38)).substring(((int)(__sourceSpill719_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill719_43 = local6_life19;
        int __sourceSpill719_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill719_46 = new byte[8];
        (__sourceSpill719_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill719_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill719_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill719_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill719_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill719_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill719_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill719_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill719_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill719_47)).doFinal(((byte[])(__sourceSpill719_46)));
        (__sourceSpill719_43)[__sourceSpill719_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    r = ((long[])(local6_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[5]));
    f = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE()));
    j = ((java.util.ArrayDeque)(new java.util.ArrayDeque()));
    k = ((java.util.ArrayDeque)(new java.util.ArrayDeque()));
    l = ((int)(moom.BU.a(((int)(((java.lang.Runtime)(java.lang.Runtime.getRuntime())).availableProcessors())), ((int)(1)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite719_59(7867, (1338722197848094631L ^ local11_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_25740fe26578efb9_0(moom.Ed a0, net.minecraft.world.World a1, moom.DT a2, moom.DT a3, int a4) throws E;
private static native <E extends Throwable> int[] __sourceHandlerCall_c38f6ebdecc9e98fae00(int a0) throws E;
private static final class __SourceHandler_c38f6ebdecc9e98fae00 {

public static int[] f241(int p0) throws Throwable {
    int[] spill241_0;
    java.util.ArrayDeque life1_2;
    int[] life2_7;
    forest_join_17: {
    forest_join_14: {
    __monitorEnter241_1((life1_2 = __fieldRead241_0()));
    life2_7 = __cast241_4(__call241_3(__fieldRead241_2()));
    if (!((life2_7 != null))) {
        break forest_join_14;
    }
    if (!(((life2_7).length < p0))) {
        break forest_join_17;
    }
    }
    life2_7 = new int[p0];
    }
    spill241_0 = life2_7;
    __monitorExit241_5(life1_2);
    return spill241_0;
}
public static int[] h241_0(moom.Oo p0) throws Throwable {
    throw __call3024100_0(p0);
}
public static int[] h241_1(java.lang.Throwable p0, java.util.ArrayDeque p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3024101_0(p1);
    throw life2_2;
}
private static native java.util.ArrayDeque __fieldRead241_0() throws Throwable;
private static native void __monitorEnter241_1(java.util.ArrayDeque a0) throws Throwable;
private static native java.util.ArrayDeque __fieldRead241_2() throws Throwable;
private static native java.lang.Object __call241_3(java.util.ArrayDeque a0) throws Throwable;
private static native int[] __cast241_4(java.lang.Object a0) throws Throwable;
private static native void __monitorExit241_5(java.util.ArrayDeque a0) throws Throwable;
private static native moom.Oo __call3024100_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3024101_0(java.util.ArrayDeque a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f97ac47f46e12a029a1b(int[] a0) throws E;
private static final class __SourceHandler_f97ac47f46e12a029a1b {

public static void f242(int[] p0) throws Throwable {
    java.util.ArrayDeque life1_2;
    forest_join_12: {
    __monitorEnter242_1((life1_2 = __fieldRead242_0()));
    if (!((__call242_3(__fieldRead242_2()) < __fieldRead242_4()))) {
        break forest_join_12;
    }
    __call242_6(__fieldRead242_5(), p0);
    }
    __monitorExit242_7(life1_2);
    return;
}
public static void h242_0(java.lang.Throwable p0, java.util.ArrayDeque p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3024200_0(p1);
    throw life2_2;
}
private static native java.util.ArrayDeque __fieldRead242_0() throws Throwable;
private static native void __monitorEnter242_1(java.util.ArrayDeque a0) throws Throwable;
private static native java.util.ArrayDeque __fieldRead242_2() throws Throwable;
private static native int __call242_3(java.util.ArrayDeque a0) throws Throwable;
private static native int __fieldRead242_4() throws Throwable;
private static native java.util.ArrayDeque __fieldRead242_5() throws Throwable;
private static native boolean __call242_6(java.util.ArrayDeque a0, int[] a1) throws Throwable;
private static native void __monitorExit242_7(java.util.ArrayDeque a0) throws Throwable;
private static native void __monitorExit3024200_0(java.util.ArrayDeque a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b3a1b0b98a744b9f009b(net.minecraft.block.state.IBlockState[] a0) throws E;
private static final class __SourceHandler_b3a1b0b98a744b9f009b {

public static void f243(net.minecraft.block.state.IBlockState[] p0) throws Throwable {
    java.util.ArrayDeque life1_2;
    forest_join_12: {
    __monitorEnter243_1((life1_2 = __fieldRead243_0()));
    if (!((__call243_3(__fieldRead243_2()) < __fieldRead243_4()))) {
        break forest_join_12;
    }
    __call243_6(__fieldRead243_5(), p0);
    }
    __monitorExit243_7(life1_2);
    return;
}
public static void h243_0(java.lang.Throwable p0, java.util.ArrayDeque p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3024300_0(p1);
    throw life2_2;
}
private static native java.util.ArrayDeque __fieldRead243_0() throws Throwable;
private static native void __monitorEnter243_1(java.util.ArrayDeque a0) throws Throwable;
private static native java.util.ArrayDeque __fieldRead243_2() throws Throwable;
private static native int __call243_3(java.util.ArrayDeque a0) throws Throwable;
private static native int __fieldRead243_4() throws Throwable;
private static native java.util.ArrayDeque __fieldRead243_5() throws Throwable;
private static native boolean __call243_6(java.util.ArrayDeque a0, net.minecraft.block.state.IBlockState[] a1) throws Throwable;
private static native void __monitorExit243_7(java.util.ArrayDeque a0) throws Throwable;
private static native void __monitorExit3024300_0(java.util.ArrayDeque a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.block.state.IBlockState[] __sourceHandlerCall_574b2f53c67c10d0c4d9(int a0) throws E;
private static final class __SourceHandler_574b2f53c67c10d0c4d9 {

public static net.minecraft.block.state.IBlockState[] f244(int p0) throws Throwable {
    net.minecraft.block.state.IBlockState[] spill244_0;
    java.util.ArrayDeque life1_2;
    net.minecraft.block.state.IBlockState[] life2_7;
    forest_join_21: {
    forest_join_18: {
    __monitorEnter244_1((life1_2 = __fieldRead244_0()));
    life2_7 = __cast244_4(__call244_3(__fieldRead244_2()));
    if (!((life2_7 != null))) {
        break forest_join_18;
    }
    if (!(((life2_7).length >= p0))) {
        break forest_join_18;
    }
    __call244_5(life2_7, null);
    break forest_join_21;
    }
    life2_7 = new net.minecraft.block.state.IBlockState[p0];
    }
    spill244_0 = life2_7;
    __monitorExit244_6(life1_2);
    return spill244_0;
}
public static net.minecraft.block.state.IBlockState[] h244_0(moom.Oo p0) throws Throwable {
    throw __call3024400_0(p0);
}
public static net.minecraft.block.state.IBlockState[] h244_1(moom.Oo p0) throws Throwable {
    throw __call3024401_0(p0);
}
public static net.minecraft.block.state.IBlockState[] h244_2(java.lang.Throwable p0, java.util.ArrayDeque p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3024402_0(p1);
    throw life2_2;
}
private static native java.util.ArrayDeque __fieldRead244_0() throws Throwable;
private static native void __monitorEnter244_1(java.util.ArrayDeque a0) throws Throwable;
private static native java.util.ArrayDeque __fieldRead244_2() throws Throwable;
private static native java.lang.Object __call244_3(java.util.ArrayDeque a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState[] __cast244_4(java.lang.Object a0) throws Throwable;
private static native void __call244_5(net.minecraft.block.state.IBlockState[] a0, java.lang.Object a1) throws Throwable;
private static native void __monitorExit244_6(java.util.ArrayDeque a0) throws Throwable;
private static native moom.Oo __call3024400_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3024401_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3024402_0(java.util.ArrayDeque a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4366_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ed"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4716;
        if (s[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ed", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ed.s[n2] = n4;
        }
        return s[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_ff65a2069b97b4(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private net.minecraft.block.state.IBlockState b(moom.DT p0) {
return super.a__fE(((moom.DT)(p0)));
}


public int a(moom.DT p0, int p1) {
int local3 = ((moom.Ed)(this)).a(((moom.DT)(p0)));
    int local4 = (this.h)[local3];
    if ((local4 == -1)) {
        local4 = super.a(((moom.DT)(p0)), ((int)(p1)));
        if ((__sourceIntrinsic_booleanComparison(moom.BU.ay()) != 0)) {
        if ((__sourceIntrinsic_booleanComparison(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.Ed)(this)).a__fE(((moom.DT)(p0))))).a__ch())).j()) == 0)) {
        local4 = moom.JF.a(((moom.DT)(p0)), ((int)(local4)));
    }
    }
        (this.h)[local3] = local4;
    }
    return local4;
}


public net.minecraft.block.state.IBlockState a__fE(moom.DT p0) {
int local2 = ((moom.Ed)(this)).a(((moom.DT)(p0)));
    java.lang.Object local3 = (this.i)[local2];
    if ((local3 == null)) {
        local3 = ((moom.Ed)(this)).b(((moom.DT)(p0)));
        (this.i)[local2] = ((net.minecraft.block.state.IBlockState)(local3));
    }
    return ((net.minecraft.block.state.IBlockState)(local3));
}


public void a() {
__sourceExactCall_b82700f11f48c4(((int[])(this.h)));
    __sourceExactCall_12c5cee111891b(((net.minecraft.block.state.IBlockState[])(this.i)));
    return;
}


public net.minecraft.tileentity.TileEntity a__B9(moom.DT p0) {
int local2 = ((((moom.DT)(p0)).a() >> 4) - this.a);
    int local3 = ((((moom.DT)(p0)).c() >> 4) - this.b);
    return ((net.minecraft.world.chunk.Chunk)(((this.c)[local2])[local3])).a(((moom.DT)(p0)), ((net.minecraft.world.chunk.Chunk$EnumCreateEntityType)(net.minecraft.world.chunk.Chunk$EnumCreateEntityType.QUEUED)));
}


public static void a(int[] p0) { __sourceHandlerCall_f97ac47f46e12a029a1b(p0); }


private static int[] a(int p0) { return __sourceHandlerCall_c38f6ebdecc9e98fae00(p0); }


private int a(moom.DT p0) {
long local2 = (moom.Ed.m ^ 135374046918159L);
    int local4 = (((moom.DT)(p0)).a() - ((moom.DT)(this.g)).a());
    int local5 = (((moom.DT)(p0)).b() - ((moom.DT)(this.g)).b());
    int local6 = (((moom.DT)(p0)).c() - ((moom.DT)(this.g)).c());
    return (((local4 * __sourceIntrinsic_d85576047056_originalDynamicSite1133_10(1956, (701320043271682299L ^ local2))) + (local6 * __sourceIntrinsic_d85576047056_originalDynamicSite1133_11(27015, (7931444689834677983L ^ local2)))) + local5);
}


private static net.minecraft.block.state.IBlockState[] a__ArrayfE(int p0) { return __sourceHandlerCall_574b2f53c67c10d0c4d9(p0); }


public static void a(net.minecraft.block.state.IBlockState[] p0) { __sourceHandlerCall_b3a1b0b98a744b9f009b(p0); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite719_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25740fe26578efb9_originalDynamicSite1970_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25740fe26578efb9_originalDynamicSite1970_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25740fe26578efb9_originalDynamicSite1970_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_originalDynamicSite1133_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_originalDynamicSite1133_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4366_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_ff65a2069b97b4(int p0, long p1);
private static native void __sourceExactCall_b82700f11f48c4(int[] p0);
private static native void __sourceExactCall_12c5cee111891b(net.minecraft.block.state.IBlockState[] p0);
}
