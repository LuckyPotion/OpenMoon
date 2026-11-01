package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hd extends moom.Hc {

private boolean f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public Hd() {
super();
}


public Hd(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }


private static void __sourceConstructorBody_0e13804ad1db1962(moom.Hd receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {

moom.Hd __initValue506_23_0;

    int __initValue506_23_1;

    moom.Hd __initValue506_24_0;

    moom.Hd __initValue506_25_0;

    int __initValue506_25_1;

    init_join_25: {

    init_join_24: {

    init_join_23: {

    long local5_life2 = (moom.Hd.g ^ 37476430063523L);

    net.minecraft.entity.Entity[] __sourceSpill506_4 = moom.G4.b();

    moom.Hd.__sourceConstructorInit_0e13804ad1db1962_0(((moom.Hd)(receiver)), ((int)(p0)));

    ((moom.Hd)(receiver)).b = ((moom.bs)(p3));

    net.minecraft.entity.Entity[] local7_life7 = __sourceSpill506_4;

    ((moom.Hd)(receiver)).a = ((moom.G2)(p2));

    moom.Hd __sourceSpill506_10 = receiver;

    int __sourceSpill506_11 = ((java.util.Random)(p1)).nextInt(((int)(3)));

    if (!((local7_life7 != null))) {

        __initValue506_23_0 = __sourceSpill506_10;

        __initValue506_23_1 = __sourceSpill506_11;

        break init_join_23;

    }

    if (!((__sourceSpill506_11 == 0))) {

        __initValue506_24_0 = __sourceSpill506_10;

        break init_join_24;

    }

    __initValue506_23_0 = __sourceSpill506_10;

    __initValue506_23_1 = 1;

    }

    __initValue506_25_0 = __initValue506_23_0;

    __initValue506_25_1 = __initValue506_23_1;

    break init_join_25;

    }

    __initValue506_25_0 = __initValue506_24_0;

    __initValue506_25_1 = 0;

    }

    ((moom.Hd)(__initValue506_25_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((__initValue506_25_1)));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(1190879964239800970L)), ((long)(3234304288953719673L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(242939899699686L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hd.g ^ 57188649357054L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill573_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill573_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill573_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill573_14 = new byte[8];
    (__sourceSpill573_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill573_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation573_16 = __sourceSpill573_14;
    ((javax.crypto.Cipher)(__sourceSpill573_11)).init(((int)(__sourceSpill573_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill573_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation573_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "?Wôü\031:¯s§Tb\016Æ¦Ò[øþ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill573_25 = local6_life21;
        int __sourceSpill573_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill573_25)).substring(((int)(__sourceSpill573_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill573_30 = local8_life19;
        int __sourceSpill573_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill573_33 = new byte[8];
        (__sourceSpill573_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill573_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill573_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill573_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill573_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill573_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill573_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill573_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill573_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill573_34)).doFinal(((byte[])(__sourceSpill573_33)));
        (__sourceSpill573_30)[__sourceSpill573_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0e13804ad1db1962_0(moom.Hd a0, int a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4824_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5C78;
        if (i[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n2];
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
                throw new RuntimeException("moom/Hd", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hd.i[n2] = n3;
        }
        return i[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hd.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Chest")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue758_207_0;
    int lexicalValue758_236_0;
    net.minecraft.entity.Entity[] spill758_0;
    boolean spill758_1;
    boolean spill758_2;
    int spill758_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_80;
    int life7_219;
    int life8_226;
    lexical_join_236: {
    lexical_join_235: {
    lexical_join_207: {
    lexical_join_183: {
    life4_3 = (moom.Hd.g ^ 12248171434139L);
    spill758_0 = moom.G4.b();
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(4)), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(2)), ((int)(0)), ((int)(4)), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(3)), ((int)(1)), ((int)(4)), ((int)(4)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(3)), ((int)(3)), ((int)(4)), ((int)(4)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    life6_80 = spill758_0;
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(4)), ((int)(3)), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(4)), ((int)(1)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(3)), ((int)(4)), ((int)(3)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    spill758_1 = this.f;
    if (!((life6_80 != null))) {
        lexicalValue758_207_0 = ((spill758_1) ? 1 : 0);
        break lexical_join_207;
    }
    if (!(spill758_1)) {
        break lexical_join_183;
    }
    spill758_2 = ((moom.G2)(p2)).a(((moom.DS)(new moom.DT(((moom.Hd)(this)).a(((int)(3)), ((int)(3))), ((moom.Hd)(this)).a(((int)(2))), ((moom.Hd)(this)).b(((int)(3)), ((int)(3)))))));
    if (!((life6_80 != null))) {
        lexicalValue758_207_0 = ((spill758_2) ? 1 : 0);
        break lexical_join_207;
    }
    if (!(spill758_2)) {
        break lexical_join_183;
    }
    this.f = ((boolean)(false));
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(3)), ((int)(2)), ((int)(3)), ((java.util.List)(moom.Hd.e)), ((int)((2 + ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    }
    ((moom.Hd)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic758_58(8314, (2746268848209436457L ^ life4_3)))), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic758_59(10819, (3239015697525544210L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    lexicalValue758_207_0 = 0;
    }
    life7_219 = lexicalValue758_207_0;
    lexical_cycle_208: while (true) {
    lexical_join_233: {
    lexical_join_232: {
    if (!((life7_219 <= 4))) {
        break lexical_join_235;
    }
    spill758_3 = 0;
    if (!((life6_80 != null))) {
        lexicalValue758_236_0 = spill758_3;
        break lexical_join_236;
    }
    life8_226 = spill758_3;
    lexical_cycle_215: while (true) {
    if (!((life8_226 <= 4))) {
        break lexical_join_232;
    }
    ((moom.Hd)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_219)), ((int)(-1)), ((int)(life8_226)), ((moom.G2)(p2)));
    life8_226 += 1;
    if (!((life6_80 != null))) {
        break lexical_join_233;
    }
    if (!((life6_80 == null))) { continue lexical_cycle_215; }
    break lexical_cycle_215;
    }
    }
    life7_219 += 1;
    }
    if (!((life6_80 == null))) { continue lexical_cycle_208; }
    break lexical_cycle_208;
    }
    }
    lexicalValue758_236_0 = 1;
    }
    return ((lexicalValue758_236_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Chest")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    return;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
((moom.Hd)(this)).b(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(0)), ((int)(1)), ((boolean)(true)));
    return;
}


public static moom.Hd a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.Hd forwardValue2126_36_0;
    long life7_3;
    moom.G2 life9_19;
    forward_join_36: {
    forward_join_35: {
    life7_3 = (moom.Hd.g ^ 94727964996012L);
    life9_19 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ecaac745d3f_invokedynamic2126_1(10300, (9175320659715290713L ^ life7_3)))), ((int)(5)), ((moom.bs)(p5)));
    if (!(moom.Hd.a(((moom.G2)(life9_19))))) {
        break forward_join_35;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_19))) == null))) {
        break forward_join_35;
    }
    forwardValue2126_36_0 = new moom.Hd(p6, p1, life9_19, p5);
    break forward_join_36;
    }
    forwardValue2126_36_0 = null;
    }
    return forwardValue2126_36_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_5ecaac745d3f_invokedynamic2126_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic758_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic758_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4824_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
