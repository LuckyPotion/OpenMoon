package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hr extends moom.Hc {

private boolean f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public Hr() {
super();
}


public Hr(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(5863718945349515603L)), ((long)(4388011859470977185L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18441746354765L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hr.g ^ 101972373354716L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill844_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill844_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill844_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill844_14 = new byte[8];
    (__sourceSpill844_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill844_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation844_16 = __sourceSpill844_14;
    ((javax.crypto.Cipher)(__sourceSpill844_11)).init(((int)(__sourceSpill844_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill844_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation844_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÎÉ\034\026ãô\005ÔÈi\007y¯@×¡PPÁÄÊ&\001åM»øÑ\r\0046ýÁõ±;\033Ü"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill844_25 = local6_life21;
        int __sourceSpill844_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill844_25)).substring(((int)(__sourceSpill844_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill844_30 = local8_life19;
        int __sourceSpill844_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill844_33 = new byte[8];
        (__sourceSpill844_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill844_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill844_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill844_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill844_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill844_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill844_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill844_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill844_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill844_34)).doFinal(((byte[])(__sourceSpill844_33)));
        (__sourceSpill844_30)[__sourceSpill844_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "95W¾}X\036È\n'{î\034ÛÚ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill844_38 = local6_life21;
        int __sourceSpill844_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill844_38)).substring(((int)(__sourceSpill844_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill844_43 = local8_life19;
        int __sourceSpill844_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill844_46 = new byte[8];
        (__sourceSpill844_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill844_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill844_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill844_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill844_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill844_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill844_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill844_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill844_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill844_47)).doFinal(((byte[])(__sourceSpill844_46)));
        (__sourceSpill844_43)[__sourceSpill844_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hr.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3FE7;
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
                throw new RuntimeException("moom/Hr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hr.i[n2] = n3;
        }
        return i[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4864_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Mob")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue771_439_0;
    int lexicalValue771_476_0;
    net.minecraft.entity.Entity[] spill771_0;
    boolean spill771_1;
    boolean spill771_2;
    int spill771_3;
    int spill771_4;
    long life4_3;
    net.minecraft.entity.Entity[] life6_325;
    moom.DT life7_410;
    net.minecraft.tileentity.TileEntity life8_433;
    int life7_451;
    int life8_462;
    lexical_join_476: {
    lexical_join_475: {
    lexical_join_439: {
    lexical_join_438: {
    life4_3 = (moom.Hr.g ^ 125281154655238L);
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_1(2731, (3486227092567414371L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_2(8160, (8607529157553406762L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_3(1948, (6908305120459479890L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_9(1948, (6908305120459479890L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(1)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_15(1948, (6908305120459479890L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(2)), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_21(1948, (6908305120459479890L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    spill771_0 = moom.G4.b();
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(3)), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_28(1948, (6908305120459479890L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(1)), ((int)(4)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(0)), ((int)(5)), ((int)(4)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(2)), ((int)(1)), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(2)), ((int)(5)), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(3)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_54(15733, (6417072372519854526L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_60(25936, (1167311722072914335L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_61(25936, (1167311722072914335L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_62(27782, (6568862774096212042L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_68(27782, (6568862774096212042L ^ life4_3)))), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_69(27782, (6568862774096212042L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_77(25936, (1167311722072914335L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_81(25936, (1167311722072914335L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_83(25936, (1167311722072914335L ^ life4_3)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_84(25936, (1167311722072914335L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_85(27782, (6568862774096212042L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_91(25936, (1167311722072914335L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_92(25936, (1167311722072914335L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_93(25936, (1167311722072914335L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_94(25936, (1167311722072914335L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_95(27782, (6568862774096212042L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    life6_325 = spill771_0;
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_101(25936, (1167311722072914335L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_102(27782, (6568862774096212042L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_103(1948, (6908305120459479890L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_104(27782, (6568862774096212042L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hr)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_110(27782, (6568862774096212042L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_111(27782, (6568862774096212042L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_112(27782, (6568862774096212042L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic771_113(27782, (6568862774096212042L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    spill771_1 = this.f;
    if (!((life6_325 != null))) {
        lexicalValue771_439_0 = ((spill771_1) ? 1 : 0);
        break lexical_join_439;
    }
    if (!((!spill771_1))) {
        break lexical_join_438;
    }
    life7_410 = new moom.DT(((moom.Hr)(this)).a(((int)(3)), ((int)(5))), ((moom.Hr)(this)).a(((int)(5))), ((moom.Hr)(this)).b(((int)(3)), ((int)(5))));
    spill771_2 = ((moom.G2)(p2)).a(((moom.DS)(life7_410)));
    if (!((life6_325 != null))) {
        lexicalValue771_439_0 = ((spill771_2) ? 1 : 0);
        break lexical_join_439;
    }
    if (!(spill771_2)) {
        break lexical_join_438;
    }
    this.f = ((boolean)(true));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life7_410)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ac)).a__fE())), ((int)(2)));
    life8_433 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life7_410)));
    spill771_3 = ((life8_433 instanceof moom.Cq) ? 1 : 0);
    if (!((life6_325 != null))) {
        lexicalValue771_439_0 = spill771_3;
        break lexical_join_439;
    }
    if (!((spill771_3 != 0))) {
        break lexical_join_438;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(((moom.Cq)(((moom.Cq)(life8_433)))).a__sourceReturn_30e49adebc())).a(((java.lang.String)("Blaze")));
    }
    lexicalValue771_439_0 = 0;
    }
    life7_451 = lexicalValue771_439_0;
    lexical_cycle_440: while (true) {
    lexical_join_473: {
    lexical_join_472: {
    if (!((life7_451 <= __sourceIntrinsic_5ac1d031d896_invokedynamic771_135(25936, (1167311722072914335L ^ life4_3))))) {
        break lexical_join_475;
    }
    spill771_4 = 0;
    if (!((life6_325 != null))) {
        lexicalValue771_476_0 = spill771_4;
        break lexical_join_476;
    }
    life8_462 = spill771_4;
    lexical_cycle_451: while (true) {
    if (!((life8_462 <= __sourceIntrinsic_5ac1d031d896_invokedynamic771_136(25936, (1167311722072914335L ^ life4_3))))) {
        break lexical_join_472;
    }
    ((moom.Hr)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_451)), ((int)(-1)), ((int)(life8_462)), ((moom.G2)(p2)));
    life8_462 += 1;
    if (!((life6_325 != null))) {
        break lexical_join_473;
    }
    if (!((life6_325 == null))) { continue lexical_cycle_451; }
    break lexical_cycle_451;
    }
    }
    life7_451 += 1;
    }
    if (!((life6_325 == null))) { continue lexical_cycle_440; }
    break lexical_cycle_440;
    }
    }
    lexicalValue771_476_0 = 1;
    }
    return ((lexicalValue771_476_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Mob")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    return;
}


public static moom.Hr a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, int p5, moom.bs p6) {
moom.Hr forwardValue2153_48_0;
    long life7_3;
    moom.G2 life9_31;
    forward_join_48: {
    forward_join_47: {
    life7_3 = (moom.Hr.g ^ 28267461255887L);
    life9_31 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_153a825eb806_invokedynamic2153_1(962, (8855311551285369282L ^ life7_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_153a825eb806_invokedynamic2153_2(1948, (6908331213673143707L ^ life7_3)))), ((int)(__sourceIntrinsic_153a825eb806_invokedynamic2153_3(27782, (6568818532791776899L ^ life7_3)))), ((int)(__sourceIntrinsic_153a825eb806_invokedynamic2153_4(4192, (1945845006481525348L ^ life7_3)))), ((moom.bs)(p6)));
    if (!(moom.Hr.a(((moom.G2)(life9_31))))) {
        break forward_join_47;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_31))) == null))) {
        break forward_join_47;
    }
    forwardValue2153_48_0 = new moom.Hr(p5, p1, life9_31, p6);
    break forward_join_48;
    }
    forwardValue2153_48_0 = null;
    }
    return forwardValue2153_48_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_153a825eb806_invokedynamic2153_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a825eb806_invokedynamic2153_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a825eb806_invokedynamic2153_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a825eb806_invokedynamic2153_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic771_136(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4864_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
