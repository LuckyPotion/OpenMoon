package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HV extends moom.HT {

private net.minecraft.block.Block h;

private net.minecraft.block.Block i;

private net.minecraft.block.Block j;

private net.minecraft.block.Block k;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public HV() {
super();
}


public HV(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
    this.h = (this).a(p2);
    this.i = (this).a(p2);
    this.j = (this).a(p2);
    this.k = (this).a(p2);
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-6326490517521061417L)), ((long)(470143744822659108L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47169171592886L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HV.l ^ 123999932231587L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill823_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill823_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill823_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill823_14 = new byte[8];
    (__sourceSpill823_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill823_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation823_16 = __sourceSpill823_14;
    ((javax.crypto.Cipher)(__sourceSpill823_11)).init(((int)(__sourceSpill823_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill823_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation823_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "²\026NYeg¦fQÞPï¯²y%M]ë#\035\036e&íÅâ2\034\037\t\rÎlZsÜ¨°yÄåômonªDd\005¢?ìýLf¹·èS×\rÃ×%­háüì\031wª[\023§6Y8§ÅHªR/XW½8P¦@p,h¯§"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill823_25 = local6_life21;
        int __sourceSpill823_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill823_25)).substring(((int)(__sourceSpill823_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill823_30 = local8_life19;
        int __sourceSpill823_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill823_33 = new byte[8];
        (__sourceSpill823_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill823_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill823_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill823_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill823_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill823_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill823_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill823_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill823_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill823_34)).doFinal(((byte[])(__sourceSpill823_33)));
        (__sourceSpill823_30)[__sourceSpill823_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\0215ãdÒöJ§õæË\0302\000"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill823_38 = local6_life21;
        int __sourceSpill823_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill823_38)).substring(((int)(__sourceSpill823_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill823_43 = local8_life19;
        int __sourceSpill823_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill823_46 = new byte[8];
        (__sourceSpill823_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill823_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill823_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill823_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill823_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill823_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill823_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill823_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill823_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill823_47)).doFinal(((byte[])(__sourceSpill823_46)));
        (__sourceSpill823_43)[__sourceSpill823_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[16]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4787_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3E01;
        if (HV.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HV.n[n2] = n3;
        }
        return HV.n[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_988739897a672c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.h = ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CA"))))))));
    this.i = ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CB"))))))));
    this.j = ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CC"))))))));
    this.k = ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CD"))))))));
    return;
}


public static moom.HV a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.HV forwardValue2100_41_0;
    long life8_3;
    moom.G2 life10_23;
    forward_join_41: {
    forward_join_40: {
    life8_3 = (moom.HV.l ^ 24014989878054L);
    life10_23 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_7ddb7cc5f5fe_invokedynamic2100_1(23437, (483089308073440916L ^ life8_3)))), ((int)(4)), ((int)(__sourceIntrinsic_7ddb7cc5f5fe_invokedynamic2100_2(11078, (6370233023503189591L ^ life8_3)))), ((moom.bs)(p6)));
    if (!(__sourceExactCall_c8fc51b6f48cf9(((moom.G2)(life10_23))))) {
        break forward_join_40;
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p1)), ((moom.G2)(life10_23))) == null))) {
        break forward_join_40;
    }
    forwardValue2100_41_0 = new moom.HV(p0, p7, p2, life10_23, p6);
    break forward_join_41;
    }
    forwardValue2100_41_0 = null;
    }
    return forwardValue2100_41_0;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CA")), ((int)(((moom.DC)(net.minecraft.block.Block.b)).a(((java.lang.Object)(this.h))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CB")), ((int)(((moom.DC)(net.minecraft.block.Block.b)).a(((java.lang.Object)(this.i))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CC")), ((int)(((moom.DC)(net.minecraft.block.Block.b)).a(((java.lang.Object)(this.j))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CD")), ((int)(((moom.DC)(net.minecraft.block.Block.b)).a(((java.lang.Object)(this.k))))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.HV lexicalValue745_25_0;
    int lexicalValue745_320_0;
    int lexicalValue745_538_0;
    int spill745_0;
    moom.HV spill745_1;
    int spill745_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_331;
    int life8_522;
    lexical_join_538: {
    lexical_join_537: {
    lexical_join_495: {
    lexical_join_493: {
    lexical_join_320: {
    lexical_join_39: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.HV.l ^ 1657998267157L);
    life6_5 = moom.G4.b();
    spill745_0 = ((moom.HV)(this)).e;
    if (!((life6_5 != null))) {
        lexicalValue745_320_0 = spill745_0;
        break lexical_join_320;
    }
    if (!((spill745_0 < 0))) {
        break lexical_join_39;
    }
    ((moom.HV)(this)).e = ((int)(((moom.HV)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill745_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue745_25_0 = spill745_1;
        break lexical_join_25;
    }
    if (!((((moom.HV)(spill745_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue745_25_0 = this;
    }
    ((moom.G2)(((moom.HV)(lexicalValue745_25_0)).a)).a(((int)(0)), ((int)((((((moom.HV)(this)).e - ((moom.G2)(((moom.HV)(this)).a)).e) + 4) - 1))), ((int)(0)));
    }
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_12(24265, (3469688756387611631L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_13(3758, (8031037212901856133L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_19(9336, (5498694852272748892L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(1)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_25(17302, (8271891326377565877L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_31(17302, (8271891326377565877L ^ life4_3)))), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_32(26215, (7295806885552208714L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_33(17302, (8271891326377565877L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_39(30706, (2398911661907487452L ^ life4_3)))), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_40(24912, (6458006021267176561L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_41(17302, (8271891326377565877L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_47(26215, (7295806885552208714L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_53(30834, (151733458935784791L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_54(9762, (183404928215382794L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_55(26215, (7295806885552208714L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_61(15431, (3544945669886468459L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_62(15431, (3544945669886468459L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_63(26215, (7295806885552208714L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_69(31135, (5581902856168121526L ^ life4_3)))), ((int)(0)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_75(26215, (7295806885552208714L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_76(31135, (5581902856168121526L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_77(26215, (7295806885552208714L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_83(17302, (8271891326377565877L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_654639a3f01247(((moom.dN)(net.minecraft.init.Blocks.j))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_654639a3f01247(((moom.dN)(net.minecraft.init.Blocks.j))))), ((boolean)(false)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_89(17111, (8702510084346322935L ^ life4_3)))), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_90(11078, (6370211356943840868L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_91(17302, (8271891326377565877L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_654639a3f01247(((moom.dN)(net.minecraft.init.Blocks.j))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_654639a3f01247(((moom.dN)(net.minecraft.init.Blocks.j))))), ((boolean)(false)));
    lexicalValue745_320_0 = 1;
    }
    life7_331 = lexicalValue745_320_0;
    lexical_cycle_321: while (true) {
    if (!((life7_331 <= __sourceIntrinsic_5ac1d031d896_invokedynamic745_97(17302, (8271891326377565877L ^ life4_3))))) {
        break lexical_join_493;
    }
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.h)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_99(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(1)), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.h)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_104(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(2)), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.i)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_109(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(4)), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.i)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_114(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(5)), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.j)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_119(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_122(17302, (8271891326377565877L ^ life4_3)))), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.j)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_125(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_128(26215, (7295806885552208714L ^ life4_3)))), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.k)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_131(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_134(22992, (1048868449010615551L ^ life4_3)))), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.k)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_137(17302, (8271891326377565877L ^ life4_3)))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic745_140(31135, (5581902856168121526L ^ life4_3)))), ((int)(1)), ((int)(life7_331)), ((moom.G2)(p2)));
    life7_331 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_495;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_321; }
    break lexical_cycle_321;
    }
    }
    life7_331 = 0;
    }
    lexical_cycle_495: while (true) {
    lexical_join_535: {
    lexical_join_534: {
    if (!((life7_331 < __sourceIntrinsic_5ac1d031d896_invokedynamic745_142(11078, (6370211356943840868L ^ life4_3))))) {
        break lexical_join_537;
    }
    spill745_2 = 0;
    if (!((life6_5 != null))) {
        lexicalValue745_538_0 = spill745_2;
        break lexical_join_538;
    }
    life8_522 = spill745_2;
    lexical_cycle_506: while (true) {
    if (!((life8_522 < __sourceIntrinsic_5ac1d031d896_invokedynamic745_143(6536, (3308871285411071151L ^ life4_3))))) {
        break lexical_join_534;
    }
    ((moom.HV)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life8_522)), ((int)(4)), ((int)(life7_331)), ((moom.G2)(p2)));
    ((moom.HV)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d))))), ((int)(life8_522)), ((int)(-1)), ((int)(life7_331)), ((moom.G2)(p2)));
    life8_522 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_535;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_506; }
    break lexical_cycle_506;
    }
    }
    life7_331 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_495; }
    break lexical_cycle_495;
    }
    }
    lexicalValue745_538_0 = 1;
    }
    return ((lexicalValue745_538_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private net.minecraft.block.Block a(java.util.Random p0) {
long local2 = (moom.HV.l ^ 48688997604725L);
    switch (((java.util.Random)(p0)).nextInt(((int)(5)))) {
case 0:
{
        return net.minecraft.init.Blocks.bQ;
    }
case 1:
{
        return net.minecraft.init.Blocks.bR;
    }
default:
{
        return net.minecraft.init.Blocks.aj;
    }
}
}


private static native <E extends Throwable> int __sourceIntrinsic_7ddb7cc5f5fe_invokedynamic2100_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddb7cc5f5fe_invokedynamic2100_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic745_143(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4787_0() throws E;

private static native int __sourceExactCall_988739897a672c(int p0, long p1);
private static native net.minecraft.block.Block __sourceExactCall_c520ab7951a8e1(int p0);
private static native boolean __sourceExactCall_c8fc51b6f48cf9(moom.G2 p0);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_7dba7f72a5b74e(net.minecraft.block.Block p0);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_654639a3f01247(moom.dN p0);
}
