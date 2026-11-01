package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class H7 extends moom.HT {

private boolean h;

private int i;

private static final long j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public H7() {
super();
}


public H7(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
    this.h = (p2).nextBoolean();
    this.i = (p2).nextInt(3);
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-618137654030674650L)), ((long)(-2951547127225002032L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(246600616064014L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.H7.j ^ 113797942315545L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill569_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill569_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill569_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill569_14 = new byte[8];
    (__sourceSpill569_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill569_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation569_16 = __sourceSpill569_14;
    ((javax.crypto.Cipher)(__sourceSpill569_11)).init(((int)(__sourceSpill569_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill569_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation569_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¸#Îèw\000uTþÒ\n%Qïl"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill569_25 = local6_life21;
        int __sourceSpill569_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill569_25)).substring(((int)(__sourceSpill569_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill569_30 = local8_life19;
        int __sourceSpill569_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill569_33 = new byte[8];
        (__sourceSpill569_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill569_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill569_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill569_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill569_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill569_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill569_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill569_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill569_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill569_34)).doFinal(((byte[])(__sourceSpill569_33)));
        (__sourceSpill569_30)[__sourceSpill569_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4722_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/H7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7319;
        if (H7.l[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/H7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            H7.l[n2] = n3;
        }
        return H7.l[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_1da1c1d31fd458(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.i = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("T")))));
    this.h = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("C")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.H7 lexicalValue730_25_0;
    int lexicalValue730_92_0;
    moom.H7 lexicalValue730_111_0;
    moom.H7 lexicalValue730_410_0;
    moom.fn lexicalValue730_434_0;
    moom.fn lexicalValue730_434_1;
    moom.H7 lexicalValue730_437_0;
    net.minecraft.world.World lexicalValue730_437_1;
    int lexicalValue730_497_0;
    int spill730_0;
    moom.H7 spill730_1;
    moom.H7 spill730_2;
    moom.H7 spill730_3;
    moom.fn spill730_4;
    moom.fn spill730_5;
    moom.H7 spill730_6;
    net.minecraft.world.World spill730_7;
    int spill730_8;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_487;
    int life8_494;
    lexical_join_497: {
    lexical_join_488: {
    lexical_join_448: {
    lexical_join_437: {
    lexical_join_434: {
    lexical_join_410: {
    lexical_join_378: {
    lexical_join_125: {
    lexical_join_111: {
    lexical_join_110: {
    lexical_join_92: {
    lexical_join_43: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.H7.j ^ 87937330969924L);
    life6_5 = moom.G4.b();
    spill730_0 = ((moom.H7)(this)).e;
    if (!((life6_5 != null))) {
        lexicalValue730_92_0 = spill730_0;
        break lexical_join_92;
    }
    if (!((spill730_0 < 0))) {
        break lexical_join_43;
    }
    ((moom.H7)(this)).e = ((int)(((moom.H7)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill730_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue730_25_0 = spill730_1;
        break lexical_join_25;
    }
    if (!((((moom.H7)(spill730_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue730_25_0 = this;
    }
    ((moom.G2)(((moom.H7)(lexicalValue730_25_0)).a)).a(((int)(0)), ((int)((((((moom.H7)(this)).e - ((moom.G2)(((moom.H7)(this)).a)).e) + __sourceIntrinsic_5ac1d031d896_invokedynamic730_11(21826, (2879458852397892976L ^ life4_3))) - 1))), ((int)(0)));
    }
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(3)), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())), ((boolean)(false)));
    spill730_2 = this;
    if (!((life6_5 != null))) {
        lexicalValue730_111_0 = spill730_2;
        break lexical_join_111;
    }
    lexicalValue730_92_0 = ((((moom.H7)(spill730_2)).h) ? 1 : 0);
    }
    if (!((lexicalValue730_92_0 != 0))) {
        break lexical_join_110;
    }
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(1)), ((int)(2)), ((int)(4)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break lexical_join_125;
    }
    }
    lexicalValue730_111_0 = this;
    }
    ((moom.H7)(lexicalValue730_111_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(1)), ((int)(2)), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    }
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(1)), ((int)(4)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(2)), ((int)(4)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(1)), ((int)(4)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(2)), ((int)(4)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(0)), ((int)(4)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(0)), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(0)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(3)), ((int)(4)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(3)), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(3)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(4)), ((int)(0)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(4)), ((int)(3)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(1)), ((int)(3)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(2)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(4)), ((int)(2)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(3)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    spill730_3 = this;
    if (!((life6_5 != null))) {
        lexicalValue730_410_0 = spill730_3;
        break lexical_join_410;
    }
    if (!((((moom.H7)(spill730_3)).i > 0))) {
        break lexical_join_378;
    }
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(this.i)), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aB)).a__fE())), ((int)(this.i)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    }
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(1)), ((int)(1)), ((int)(0)), ((moom.bs)(moom.bs.b(((int)(((moom.H7)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)), ((int)(1)))))))));
    lexicalValue730_410_0 = this;
    }
    spill730_4 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.H7)(lexicalValue730_410_0)).a(((net.minecraft.world.World)(p0)), ((int)(1)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    spill730_5 = moom.fn.a;
    if (!((life6_5 != null))) {
        lexicalValue730_434_0 = spill730_4;
        lexicalValue730_434_1 = spill730_5;
        break lexical_join_434;
    }
    if (!((spill730_4 == spill730_5))) {
        break lexical_join_448;
    }
    spill730_6 = this;
    spill730_7 = p0;
    if (!((life6_5 != null))) {
        lexicalValue730_437_0 = spill730_6;
        lexicalValue730_437_1 = spill730_7;
        break lexical_join_437;
    }
    lexicalValue730_434_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.H7)(spill730_6)).a(((net.minecraft.world.World)(spill730_7)), ((int)(1)), ((int)(-1)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    lexicalValue730_434_1 = moom.fn.a;
    }
    if (!((lexicalValue730_434_0 != lexicalValue730_434_1))) {
        break lexical_join_448;
    }
    lexicalValue730_437_0 = this;
    lexicalValue730_437_1 = p0;
    }
    ((moom.H7)(lexicalValue730_437_0)).a(((net.minecraft.world.World)(lexicalValue730_437_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.H7)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(1)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2)));
    }
    life7_487 = 0;
    lexical_cycle_450: while (true) {
    lexical_join_486: {
    lexical_join_485: {
    if (!((life7_487 < 5))) {
        break lexical_join_488;
    }
    spill730_8 = 0;
    if (!((life6_5 != null))) {
        lexicalValue730_497_0 = spill730_8;
        break lexical_join_497;
    }
    life8_494 = spill730_8;
    lexical_cycle_457: while (true) {
    if (!((life8_494 < 4))) {
        break lexical_join_485;
    }
    ((moom.H7)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life8_494)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic730_148(21826, (2879458852397892976L ^ life4_3)))), ((int)(life7_487)), ((moom.G2)(p2)));
    ((moom.H7)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life8_494)), ((int)(-1)), ((int)(life7_487)), ((moom.G2)(p2)));
    life8_494 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_486;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_457; }
    break lexical_cycle_457;
    }
    }
    life7_487 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_450; }
    break lexical_cycle_450;
    }
    }
    ((moom.H7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(2)), ((int)(1)));
    lexicalValue730_497_0 = 1;
    }
    return ((lexicalValue730_497_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("T")), ((int)(this.i)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("C")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.h) ? 1 : 0)))));
    return;
}


public static moom.H7 a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.H7 forwardValue2053_37_0;
    long life8_3;
    moom.G2 life10_19;
    forward_join_37: {
    forward_join_36: {
    life8_3 = (moom.H7.j ^ 102373203848705L);
    life10_19 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_51d7426592fd_invokedynamic2053_1(22390, (1221659268778628096L ^ life8_3)))), ((int)(5)), ((moom.bs)(p6)));
    if (!(__sourceExactCall_046a718f8680f5(((moom.G2)(life10_19))))) {
        break forward_join_36;
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p1)), ((moom.G2)(life10_19))) == null))) {
        break forward_join_36;
    }
    forwardValue2053_37_0 = new moom.H7(p0, p7, p2, life10_19, p6);
    break forward_join_37;
    }
    forwardValue2053_37_0 = null;
    }
    return forwardValue2053_37_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_51d7426592fd_invokedynamic2053_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic730_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic730_148(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4722_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_1da1c1d31fd458(int p0, long p1);
private static native boolean __sourceExactCall_046a718f8680f5(moom.G2 p0);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);
}
