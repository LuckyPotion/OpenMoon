package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class He extends moom.Hc {

private boolean f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public He() {
super();
}


public He(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }


private static void __sourceConstructorBody_0186fe6190ce546e(moom.He receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {

moom.He __initValue507_23_0;

    int __initValue507_23_1;

    moom.He __initValue507_24_0;

    moom.He __initValue507_25_0;

    int __initValue507_25_1;

    init_join_25: {

    init_join_24: {

    init_join_23: {

    long local5_life2 = (moom.He.g ^ 27550139884207L);

    net.minecraft.entity.Entity[] __sourceSpill507_4 = moom.G4.b();

    moom.He.__sourceConstructorInit_0186fe6190ce546e_0(((moom.He)(receiver)), ((int)(p0)));

    net.minecraft.entity.Entity[] local7_life6 = __sourceSpill507_4;

    ((moom.He)(receiver)).b = ((moom.bs)(p3));

    ((moom.He)(receiver)).a = ((moom.G2)(p2));

    moom.He __sourceSpill507_10 = receiver;

    int __sourceSpill507_11 = ((java.util.Random)(p1)).nextInt(((int)(3)));

    if (!((local7_life6 != null))) {

        __initValue507_23_0 = __sourceSpill507_10;

        __initValue507_23_1 = __sourceSpill507_11;

        break init_join_23;

    }

    if (!((__sourceSpill507_11 == 0))) {

        __initValue507_24_0 = __sourceSpill507_10;

        break init_join_24;

    }

    __initValue507_23_0 = __sourceSpill507_10;

    __initValue507_23_1 = 1;

    }

    __initValue507_25_0 = __initValue507_23_0;

    __initValue507_25_1 = __initValue507_23_1;

    break init_join_25;

    }

    __initValue507_25_0 = __initValue507_24_0;

    __initValue507_25_1 = 0;

    }

    ((moom.He)(__initValue507_25_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((__initValue507_25_1)));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(3806245768249259139L)), ((long)(-8979666458310700027L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(75477662964341L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.He.g ^ 67105294595245L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill574_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill574_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill574_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill574_14 = new byte[8];
    (__sourceSpill574_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill574_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation574_16 = __sourceSpill574_14;
    ((javax.crypto.Cipher)(__sourceSpill574_11)).init(((int)(__sourceSpill574_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill574_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation574_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\031\fbE\013<\017íXÎoiHØ^\006V.\034'Ó¾"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill574_25 = local6_life21;
        int __sourceSpill574_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill574_25)).substring(((int)(__sourceSpill574_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill574_30 = local8_life19;
        int __sourceSpill574_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill574_33 = new byte[8];
        (__sourceSpill574_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill574_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill574_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill574_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill574_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill574_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill574_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill574_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill574_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill574_34)).doFinal(((byte[])(__sourceSpill574_33)));
        (__sourceSpill574_30)[__sourceSpill574_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0186fe6190ce546e_0(moom.He a0, int a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4827_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/He"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5713;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = h[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/He", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.He.b(((int)(local4)), ((long)(local5)));
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
int lexicalValue759_207_0;
    int lexicalValue759_236_0;
    net.minecraft.entity.Entity[] spill759_0;
    boolean spill759_1;
    boolean spill759_2;
    int spill759_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_110;
    int life7_219;
    int life8_226;
    lexical_join_236: {
    lexical_join_235: {
    lexical_join_207: {
    lexical_join_183: {
    life4_3 = (moom.He.g ^ 20970108194621L);
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(4)), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(3)), ((int)(0)), ((int)(4)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(2)), ((int)(0)), ((int)(4)), ((int)(5)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    spill759_0 = moom.G4.b();
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(4)), ((int)(4)), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life6_110 = spill759_0;
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(4)), ((int)(1)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(3)), ((int)(4)), ((int)(3)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    spill759_1 = this.f;
    if (!((life6_110 != null))) {
        lexicalValue759_207_0 = ((spill759_1) ? 1 : 0);
        break lexical_join_207;
    }
    if (!(spill759_1)) {
        break lexical_join_183;
    }
    spill759_2 = ((moom.G2)(p2)).a(((moom.DS)(new moom.DT(((moom.He)(this)).a(((int)(1)), ((int)(3))), ((moom.He)(this)).a(((int)(2))), ((moom.He)(this)).b(((int)(1)), ((int)(3)))))));
    if (!((life6_110 != null))) {
        lexicalValue759_207_0 = ((spill759_2) ? 1 : 0);
        break lexical_join_207;
    }
    if (!(spill759_2)) {
        break lexical_join_183;
    }
    this.f = ((boolean)(false));
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(1)), ((int)(2)), ((int)(3)), ((java.util.List)(moom.He.e)), ((int)((2 + ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    }
    ((moom.He)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic759_58(6346, (4030739855030906289L ^ life4_3)))), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic759_59(6221, (1206181412219383095L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    lexicalValue759_207_0 = 0;
    }
    life7_219 = lexicalValue759_207_0;
    lexical_cycle_208: while (true) {
    lexical_join_233: {
    lexical_join_232: {
    if (!((life7_219 <= 4))) {
        break lexical_join_235;
    }
    spill759_3 = 0;
    if (!((life6_110 != null))) {
        lexicalValue759_236_0 = spill759_3;
        break lexical_join_236;
    }
    life8_226 = spill759_3;
    lexical_cycle_215: while (true) {
    if (!((life8_226 <= 4))) {
        break lexical_join_232;
    }
    ((moom.He)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_219)), ((int)(-1)), ((int)(life8_226)), ((moom.G2)(p2)));
    life8_226 += 1;
    if (!((life6_110 != null))) {
        break lexical_join_233;
    }
    if (!((life6_110 == null))) { continue lexical_cycle_215; }
    break lexical_cycle_215;
    }
    }
    life7_219 += 1;
    }
    if (!((life6_110 == null))) { continue lexical_cycle_208; }
    break lexical_cycle_208;
    }
    }
    lexicalValue759_236_0 = 1;
    }
    return ((lexicalValue759_236_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Chest")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    return;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
((moom.He)(this)).c(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(0)), ((int)(1)), ((boolean)(true)));
    return;
}


public static moom.He a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.He forwardValue2128_36_0;
    long life7_3;
    moom.G2 life9_19;
    forward_join_36: {
    forward_join_35: {
    life7_3 = (moom.He.g ^ 3358779537143L);
    life9_19 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_558180e0242f_invokedynamic2128_1(4813, (4614218075281399423L ^ life7_3)))), ((int)(5)), ((moom.bs)(p5)));
    if (!(moom.He.a(((moom.G2)(life9_19))))) {
        break forward_join_35;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_19))) == null))) {
        break forward_join_35;
    }
    forwardValue2128_36_0 = new moom.He(p6, p1, life9_19, p5);
    break forward_join_36;
    }
    forwardValue2128_36_0 = null;
    }
    return forwardValue2128_36_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_558180e0242f_invokedynamic2128_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic759_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic759_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4827_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
