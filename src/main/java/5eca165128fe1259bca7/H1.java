package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class H1 extends moom.HT {

private boolean h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public H1() {
super();
}


public H1(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
    this.h = (p2).nextBoolean();
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(3108981931195743487L)), ((long)(3299650230513908469L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(127631103564275L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.H1.i ^ 118125460893153L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill568_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill568_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill568_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill568_14 = new byte[8];
    (__sourceSpill568_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill568_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation568_16 = __sourceSpill568_14;
    ((javax.crypto.Cipher)(__sourceSpill568_11)).init(((int)(__sourceSpill568_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill568_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation568_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "^xx%qF#DKæÄ¦j·"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill568_25 = local6_life21;
        int __sourceSpill568_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill568_25)).substring(((int)(__sourceSpill568_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill568_30 = local8_life19;
        int __sourceSpill568_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill568_33 = new byte[8];
        (__sourceSpill568_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill568_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill568_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill568_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill568_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill568_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill568_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill568_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill568_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill568_34)).doFinal(((byte[])(__sourceSpill568_33)));
        (__sourceSpill568_30)[__sourceSpill568_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4712_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/H1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5B00;
        if (k[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])H1.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    H1.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/H1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            H1.k[n2] = n3;
        }
        return k[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_faec48eaa43bbb(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.h = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Terrace")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.H1 lexicalValue725_25_0;
    moom.H1 lexicalValue725_332_0;
    moom.H1 lexicalValue725_372_0;
    net.minecraft.world.World lexicalValue725_372_1;
    int lexicalValue725_536_0;
    int lexicalValue725_598_0;
    int lexicalValue725_646_0;
    moom.H1 spill725_0;
    moom.H1 spill725_1;
    net.minecraft.world.World spill725_2;
    moom.H1 spill725_3;
    net.minecraft.world.World spill725_4;
    boolean spill725_5;
    int spill725_6;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_575;
    int life7_630;
    int life8_637;
    lexical_join_646: {
    lexical_join_637: {
    lexical_join_598: {
    lexical_join_584: {
    lexical_join_536: {
    lexical_join_534: {
    lexical_join_372: {
    lexical_join_370: {
    lexical_join_332: {
    lexical_join_43: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.H1.i ^ 1813431691628L);
    life6_5 = moom.G4.b();
    spill725_0 = this;
    if (!((life6_5 != null))) {
        lexicalValue725_332_0 = spill725_0;
        break lexical_join_332;
    }
    if (!((((moom.H1)(spill725_0)).e < 0))) {
        break lexical_join_43;
    }
    ((moom.H1)(this)).e = ((int)(((moom.H1)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill725_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue725_25_0 = spill725_1;
        break lexical_join_25;
    }
    if (!((((moom.H1)(spill725_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue725_25_0 = this;
    }
    ((moom.G2)(((moom.H1)(lexicalValue725_25_0)).a)).a(((int)(0)), ((int)((((((moom.H1)(this)).e - ((moom.G2)(((moom.H1)(this)).a)).e) + __sourceIntrinsic_5ac1d031d896_invokedynamic725_11(32422, (8506413196352210573L ^ life4_3))) - 1))), ((int)(0)));
    }
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(0)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(1)), ((int)(3)), ((int)(4)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(0)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(0)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(0)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(0)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(0)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(0)), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(1)), ((int)(4)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(4)), ((int)(3)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(1)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(1)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(1)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(2)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(3)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(3)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(3)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    lexicalValue725_332_0 = this;
    }
    spill725_2 = p0;
    if (!((life6_5 != null))) {
        lexicalValue725_372_0 = lexicalValue725_332_0;
        lexicalValue725_372_1 = spill725_2;
        break lexical_join_372;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.H1)(lexicalValue725_332_0)).a(((net.minecraft.world.World)(spill725_2)), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_370;
    }
    spill725_3 = this;
    spill725_4 = p0;
    if (!((life6_5 != null))) {
        lexicalValue725_372_0 = spill725_3;
        lexicalValue725_372_1 = spill725_4;
        break lexical_join_372;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.H1)(spill725_3)).a(((net.minecraft.world.World)(spill725_4)), ((int)(2)), ((int)(-1)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn() != moom.fn.a))) {
        break lexical_join_370;
    }
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.H1)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2)));
    }
    lexicalValue725_372_0 = this;
    lexicalValue725_372_1 = p0;
    }
    ((moom.H1)(lexicalValue725_372_0)).a(((net.minecraft.world.World)(lexicalValue725_372_1)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(3)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    spill725_5 = this.h;
    if (!((life6_5 != null))) {
        lexicalValue725_536_0 = ((spill725_5) ? 1 : 0);
        break lexical_join_536;
    }
    if (!(spill725_5)) {
        break lexical_join_534;
    }
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(0)), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(1)), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(2)), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(3)), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(4)), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(0)), ((int)(5)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(1)), ((int)(5)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(2)), ((int)(5)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(3)), ((int)(5)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(4)), ((int)(5)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(4)), ((int)(5)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(4)), ((int)(5)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(4)), ((int)(5)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(0)), ((int)(5)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(0)), ((int)(5)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(0)), ((int)(5)), ((int)(3)), ((moom.G2)(p2)));
    }
    lexicalValue725_536_0 = ((this.h) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue725_598_0 = lexicalValue725_536_0;
        break lexical_join_598;
    }
    if (!((lexicalValue725_536_0 != 0))) {
        break lexical_join_584;
    }
    life7_575 = ((moom.H1)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)), ((int)(3)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life7_575))))), ((int)(3)), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life7_575))))), ((int)(3)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life7_575))))), ((int)(3)), ((int)(3)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life7_575))))), ((int)(3)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    }
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.H1)(this)).b))))), ((int)(2)), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    lexicalValue725_598_0 = 0;
    }
    life7_630 = lexicalValue725_598_0;
    lexical_cycle_599: while (true) {
    lexical_join_635: {
    lexical_join_634: {
    if (!((life7_630 < 5))) {
        break lexical_join_637;
    }
    spill725_6 = 0;
    if (!((life6_5 != null))) {
        lexicalValue725_646_0 = spill725_6;
        break lexical_join_646;
    }
    life8_637 = spill725_6;
    lexical_cycle_606: while (true) {
    if (!((life8_637 < 5))) {
        break lexical_join_634;
    }
    ((moom.H1)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life8_637)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic725_199(32422, (8506413196352210573L ^ life4_3)))), ((int)(life7_630)), ((moom.G2)(p2)));
    ((moom.H1)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life8_637)), ((int)(-1)), ((int)(life7_630)), ((moom.G2)(p2)));
    life8_637 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_635;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_606; }
    break lexical_cycle_606;
    }
    }
    life7_630 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_599; }
    break lexical_cycle_599;
    }
    }
    ((moom.H1)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(2)), ((int)(1)));
    lexicalValue725_646_0 = 1;
    }
    return ((lexicalValue725_646_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Terrace")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.h) ? 1 : 0)))));
    return;
}


public static moom.H1 a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
long local8 = (moom.H1.i ^ 73404923304251L);
    moom.G2 local10 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_e338a6f7caa9_invokedynamic3995_1(4683, (7446621595911674422L ^ local8)))), ((int)(5)), ((moom.bs)(p6)));
    return ((__sourceExactCall_21e7c855759262(((java.util.List)(p1)), ((moom.G2)(local10))) != null) ? null : new moom.H1(p0, p7, p2, local10, p6));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4712_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic725_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic725_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e338a6f7caa9_invokedynamic3995_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_faec48eaa43bbb(int p0, long p1);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);
}
