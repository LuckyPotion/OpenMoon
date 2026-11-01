package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fs {

private int a;

private int b;

private int c;

private char[] d;

private moom.Fo e;

private moom.Fo f;

private static int g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public Fs(int p0, boolean p1) { super(); }


private static void __sourceConstructorBody_6d3b1d1e03015015(moom.Fs receiver, int p0, boolean p1) throws Throwable {

moom.Fs __initValue495_32_0;

    moom.Fo __initValue495_32_1;

    init_join_33: {

    init_join_32: {

    long local3_life2 = (moom.Fs.h ^ 71604283922791L);

    int __sourceSpill495_4 = moom.Fs.c();

    moom.Fs.__sourceConstructorInit_6d3b1d1e03015015_0(((moom.Fs)(receiver)));

    ((moom.Fs)(receiver)).a = ((int)(p0));

    int local5_life7 = __sourceSpill495_4;

    ((moom.Fs)(receiver)).d = ((char[])(new char[__sourceIntrinsic_6d3b1d1e03015015_originalDynamicSite495_9(27243, (5471567265628693259L ^ local3_life2))]));

    moom.Fs __sourceSpill495_11 = receiver;

    moom.Fo __sourceSpill495_12 = new moom.Fo();

    if (!((local5_life7 == 0))) {

        __initValue495_32_0 = __sourceSpill495_11;

        __initValue495_32_1 = __sourceSpill495_12;

        break init_join_32;

    }

    ((moom.Fs)(__sourceSpill495_11)).e = ((moom.Fo)(__sourceSpill495_12));

    if (!(p1)) {

        break init_join_33;

    }

    __initValue495_32_0 = receiver;

    __initValue495_32_1 = new moom.Fo();

    }

    ((moom.Fs)(__initValue495_32_0)).f = ((moom.Fo)(__initValue495_32_1));

    }

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(7712538945258104561L)), ((long)(-3091520239296952147L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204898424871799L)))));
    int __sourceSpill761_6 = 0;
    k = ((java.util.Map)(new java.util.HashMap(13)));
    moom.Fs.b(((int)(__sourceSpill761_6)));
    long local0_life9 = (moom.Fs.h ^ 103870762611867L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill761_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill761_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill761_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill761_16 = new byte[8];
    (__sourceSpill761_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill761_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation761_18 = __sourceSpill761_16;
    ((javax.crypto.Cipher)(__sourceSpill761_13)).init(((int)(__sourceSpill761_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill761_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation761_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[5];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "Ó1@µÞ°SóÝäõrK¬ÔE\003iô"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill761_27 = local6_life23;
        int __sourceSpill761_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill761_27)).substring(((int)(__sourceSpill761_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill761_32 = local8_life21;
        int __sourceSpill761_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill761_35 = new byte[8];
        (__sourceSpill761_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill761_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill761_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill761_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill761_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill761_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill761_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill761_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill761_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill761_36)).doFinal(((byte[])(__sourceSpill761_35)));
        (__sourceSpill761_32)[__sourceSpill761_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ØÇ°¯¬úmFÅ·ü³QV $"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill761_40 = local6_life23;
        int __sourceSpill761_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill761_40)).substring(((int)(__sourceSpill761_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill761_45 = local8_life21;
        int __sourceSpill761_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill761_48 = new byte[8];
        (__sourceSpill761_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill761_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill761_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill761_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill761_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill761_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill761_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill761_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill761_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill761_49)).doFinal(((byte[])(__sourceSpill761_48)));
        (__sourceSpill761_45)[__sourceSpill761_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    i = ((long[])(local8_life21));
    j = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_6d3b1d1e03015015_0(moom.Fs a0) throws E;

public void b(int p0, int p1, int p2, int p3) {
((moom.Fo)(this.e)).a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


public int b(int p0, int p1, int p2) {
return ((moom.Fo)(this.f)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
}


public moom.Fo b__Fo() {
return this.f;
}


public static void b(int p0) {
g = ((int)(p0));
    return;
}


public int b() {
return this.b;
}


public void b(moom.Fo p0) {
this.f = ((moom.Fo)(p0));
    return;
}


public boolean b__Boolean() {
int forwardValue1953_12_0;
    int forwardValue1953_14_0;
    int spill1953_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.Fs.h ^ 10020163226423L);
    life3_5 = moom.Fs.c();
    spill1953_0 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue1953_12_0 = spill1953_0;
        break forward_join_12;
    }
    if (!((spill1953_0 > 0))) {
        break forward_join_13;
    }
    forwardValue1953_12_0 = 1;
    }
    forwardValue1953_14_0 = forwardValue1953_12_0;
    break forward_join_14;
    }
    forwardValue1953_14_0 = 0;
    }
    return ((forwardValue1953_14_0) != 0);
}


public int c(int p0, int p1, int p2) {
return ((moom.Fo)(this.e)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
}


public static int c() {
return moom.Fs.g;
}


public static int d() {
int local0 = moom.Fs.c();
    if ((local0 == 0)) {
        return 11;
    }
    return 0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1B5A;
        if (j[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Fs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fs.j[n2] = n3;
        }
        return j[n2];
}


public void a(moom.Fo p0) {
this.e = ((moom.Fo)(p0));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4555_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fs.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.a;
}


public boolean a__Boolean() {
int forwardValue1950_12_0;
    int forwardValue1950_14_0;
    int spill1950_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.Fs.h ^ 42122576915126L);
    life3_5 = moom.Fs.d();
    spill1950_0 = this.b;
    if (!((life3_5 != 0))) {
        forwardValue1950_12_0 = spill1950_0;
        break forward_join_12;
    }
    if (!((spill1950_0 == 0))) {
        break forward_join_13;
    }
    forwardValue1950_12_0 = 1;
    }
    forwardValue1950_14_0 = forwardValue1950_12_0;
    break forward_join_14;
    }
    forwardValue1950_14_0 = 0;
    }
    return ((forwardValue1950_14_0) != 0);
}


public int a(int p0, int p1, int p2) {
java.lang.Object local4 = ((moom.Fs)(this)).a__fE(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local4)).a__ch())).b(((net.minecraft.block.state.IBlockState)(local4)));
}


public net.minecraft.block.Block a__ch(int p0, int p1, int p2) {
return ((net.minecraft.block.state.IBlockState)(((moom.Fs)(this)).a__fE(((int)(p0)), ((int)(p1)), ((int)(p2))))).a__ch();
}


public void a(int p0, int p1, int p2, net.minecraft.block.state.IBlockState p3) {
net.minecraft.block.Block forwardValue1949_41_0;
    net.minecraft.block.Block forwardValue1949_44_0;
    net.minecraft.block.Block forwardValue1949_44_1;
    net.minecraft.block.Block forwardValue1949_54_0;
    int spill1949_0;
    net.minecraft.block.Block spill1949_1;
    net.minecraft.block.Block spill1949_2;
    net.minecraft.block.Block spill1949_3;
    long life5_3;
    net.minecraft.block.state.IBlockState life8_10;
    int life7_11;
    net.minecraft.block.Block life9_14;
    net.minecraft.block.Block life10_17;
    forward_join_82: {
    forward_join_62: {
    forward_join_54: {
    forward_join_44: {
    forward_join_41: {
    forward_join_40: {
    life5_3 = (moom.Fs.h ^ 21591657773402L);
    spill1949_0 = moom.Fs.c();
    life8_10 = ((moom.Fs)(this)).a__fE(((int)(p0)), ((int)(p1)), ((int)(p2)));
    life7_11 = spill1949_0;
    life9_14 = ((net.minecraft.block.state.IBlockState)(life8_10)).a__ch();
    life10_17 = ((net.minecraft.block.state.IBlockState)(p3)).a__ch();
    spill1949_1 = life9_14;
    spill1949_2 = net.minecraft.init.Blocks.a;
    if (!((life7_11 == 0))) {
        forwardValue1949_44_0 = spill1949_1;
        forwardValue1949_44_1 = spill1949_2;
        break forward_join_44;
    }
    if (!((spill1949_1 != spill1949_2))) {
        break forward_join_40;
    }
    moom.Fs __stackOp1949_6_0 = this;
    ((moom.Fs)(__stackOp1949_6_0)).b = ((int)((((moom.Fs)(__stackOp1949_6_0)).b - 1)));
    spill1949_3 = life9_14;
    if (!((life7_11 == 0))) {
        forwardValue1949_41_0 = spill1949_3;
        break forward_join_41;
    }
    if (!(((net.minecraft.block.Block)(spill1949_3)).h())) {
        break forward_join_40;
    }
    moom.Fs __stackOp1949_10_0 = this;
    ((moom.Fs)(__stackOp1949_10_0)).c = ((int)((((moom.Fs)(__stackOp1949_10_0)).c - 1)));
    }
    forwardValue1949_41_0 = life10_17;
    }
    if (!((life7_11 == 0))) {
        forwardValue1949_54_0 = forwardValue1949_41_0;
        break forward_join_54;
    }
    forwardValue1949_44_0 = forwardValue1949_41_0;
    forwardValue1949_44_1 = net.minecraft.init.Blocks.a;
    }
    if (!((forwardValue1949_44_0 != forwardValue1949_44_1))) {
        break forward_join_62;
    }
    moom.Fs __stackOp1949_14_0 = this;
    ((moom.Fs)(__stackOp1949_14_0)).b = ((int)((((moom.Fs)(__stackOp1949_14_0)).b + 1)));
    if (!((life7_11 == 0))) {
        break forward_join_82;
    }
    forwardValue1949_54_0 = life10_17;
    }
    if (!(((net.minecraft.block.Block)(forwardValue1949_54_0)).h())) {
        break forward_join_62;
    }
    moom.Fs __stackOp1949_18_0 = this;
    ((moom.Fs)(__stackOp1949_18_0)).c = ((int)((((moom.Fs)(__stackOp1949_18_0)).c + 1)));
    }
    (this.d)[(((p1 << __sourceIntrinsic_50e9152e414a_invokedynamic1949_22(28923, (8758219112744950176L ^ life5_3))) | (p2 << 4)) | p0)] = ((char) ((moom.Dx)(net.minecraft.block.Block.c)).a(((java.lang.Object)(p3))));
    }
    return;
}


public net.minecraft.block.state.IBlockState a__fE(int p0, int p1, int p2) {
net.minecraft.block.state.IBlockState forwardValue1952_31_0;
    net.minecraft.block.state.IBlockState forwardValue1952_34_0;
    int spill1952_0;
    net.minecraft.block.state.IBlockState spill1952_1;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_24;
    int life6_25;
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    life4_3 = (moom.Fs.h ^ 6967578306565L);
    spill1952_0 = moom.Fs.c();
    life7_24 = ((net.minecraft.block.state.IBlockState)(((moom.Dx)(net.minecraft.block.Block.c)).a(((int)((this.d)[(((p1 << __sourceIntrinsic_3a7406489bde_invokedynamic1952_4(31705, (7723169899497243612L ^ life4_3))) | (p2 << 4)) | p0)])))));
    life6_25 = spill1952_0;
    spill1952_1 = life7_24;
    if (!((life6_25 == 0))) {
        forwardValue1952_31_0 = spill1952_1;
        break forward_join_31;
    }
    if (!((spill1952_1 != null))) {
        break forward_join_32;
    }
    forwardValue1952_31_0 = life7_24;
    }
    forwardValue1952_34_0 = forwardValue1952_31_0;
    break forward_join_34;
    }
    forwardValue1952_34_0 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    }
    return forwardValue1952_34_0;
}


public moom.Fo a__Fo() {
return this.e;
}


public void a(char[] p0) {
this.d = ((char[])(p0));
    return;
}


public char[] a__ArrayChar() {
return this.d;
}


public void a__Void() {
int forestValue627_16_0;
    int spill627_0;
    int spill627_1;
    long life1_3;
    net.minecraft.block.state.IBlockState life4_6;
    int life5_8;
    int life6_11;
    int life7_13;
    int life3_14;
    int life8_25;
    int life9_36;
    net.minecraft.block.Block life10_49;
    forest_join_79: {
    forest_join_73: {
    life1_3 = (moom.Fs.h ^ 96178831944797L);
    life4_6 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    life5_8 = 0;
    spill627_0 = moom.Fs.d();
    life6_11 = 0;
    life7_13 = 0;
    life3_14 = spill627_0;
    forest_cycle_15: while (true) {
    forest_join_70: {
    forestValue627_16_0 = life7_13;
    forest_cycle_16: while (true) {
    if (!((forestValue627_16_0 < __sourceIntrinsic_b82a5b29b709_invokedynamic627_4(13412, (708437099315447867L ^ life1_3))))) {
        break forest_join_73;
    }
    if (!((life3_14 != 0))) {
        break forest_join_79;
    }
    life8_25 = 0;
    forest_cycle_26: while (true) {
    forest_join_68: {
    forest_join_67: {
    if (!((life8_25 < __sourceIntrinsic_b82a5b29b709_invokedynamic627_5(19136, (2202620712282404510L ^ life1_3))))) {
        break forest_join_70;
    }
    spill627_1 = 0;
    if (!((life3_14 != 0))) {
        forestValue627_16_0 = spill627_1;
        continue forest_cycle_16;
    }
    life9_36 = spill627_1;
    forest_cycle_37: while (true) {
    forest_join_65: {
    forest_join_64: {
    if (!((life9_36 < __sourceIntrinsic_b82a5b29b709_invokedynamic627_6(19136, (2202620712282404510L ^ life1_3))))) {
        break forest_join_67;
    }
    life10_49 = ((moom.Fs)(this)).a__ch(((int)(life9_36)), ((int)(life7_13)), ((int)(life8_25)));
    if (!((life3_14 != 0))) {
        break forest_join_68;
    }
    if (!((life3_14 != 0))) {
        break forest_join_65;
    }
    if (!((life10_49 != net.minecraft.init.Blocks.a))) {
        break forest_join_64;
    }
    life5_8 += 1;
    if (!((life3_14 != 0))) {
        break forest_join_65;
    }
    if (!(((net.minecraft.block.Block)(life10_49)).h())) {
        break forest_join_64;
    }
    life6_11 += 1;
    }
    life9_36 += 1;
    }
    if (!((life3_14 == 0))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    }
    life8_25 += 1;
    }
    if (!((life3_14 == 0))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    break forest_cycle_16;
    }
    }
    life7_13 += 1;
    if (!((life3_14 == 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    this.b = ((int)(life5_8));
    this.c = ((int)(life6_11));
    }
    return;
}


public void a(int p0, int p1, int p2, int p3) {
((moom.Fo)(this.f)).a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_6d3b1d1e03015015_originalDynamicSite495_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e9152e414a_invokedynamic1949_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4555_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic627_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic627_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic627_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a7406489bde_invokedynamic1952_4(int a0, long a1) throws E;
}
