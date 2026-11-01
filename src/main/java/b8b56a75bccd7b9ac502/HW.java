package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HW extends moom.HT {

private net.minecraft.block.Block h;

private net.minecraft.block.Block i;

private static final long j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public HW() {
super();
}


public HW(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
    this.h = (this).a(p2);
    this.i = (this).a(p2);
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(5210638230333523450L)), ((long)(1819342323360776305L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37542672614020L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HW.j ^ 76645400353440L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill824_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill824_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill824_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill824_14 = new byte[8];
    (__sourceSpill824_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill824_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation824_16 = __sourceSpill824_14;
    ((javax.crypto.Cipher)(__sourceSpill824_11)).init(((int)(__sourceSpill824_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill824_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation824_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "AúµÔrê\007v\büÞÌ\031\022â\nÀ\"¯©v-µJ×`ö\031àÊj¨Lê3|\020\000´V­þd\n"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill824_25 = local6_life21;
        int __sourceSpill824_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill824_25)).substring(((int)(__sourceSpill824_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill824_30 = local8_life19;
        int __sourceSpill824_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill824_33 = new byte[8];
        (__sourceSpill824_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill824_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill824_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill824_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill824_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill824_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill824_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill824_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill824_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill824_34)).doFinal(((byte[])(__sourceSpill824_33)));
        (__sourceSpill824_30)[__sourceSpill824_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ï©z\t\031ºÊp~÷Ô/ g"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill824_38 = local6_life21;
        int __sourceSpill824_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill824_38)).substring(((int)(__sourceSpill824_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill824_43 = local8_life19;
        int __sourceSpill824_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill824_46 = new byte[8];
        (__sourceSpill824_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill824_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill824_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill824_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill824_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill824_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill824_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill824_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill824_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill824_47)).doFinal(((byte[])(__sourceSpill824_46)));
        (__sourceSpill824_43)[__sourceSpill824_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4791_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1D8;
        if (HW.l[n2] == null) {
            
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
                throw new RuntimeException("moom/HW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HW.l[n2] = n3;
        }
        return HW.l[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_16df0688de3159(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.h = ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CA"))))))));
    this.i = ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CB"))))))));
    return;
}


public static moom.HW a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.HW forwardValue2102_41_0;
    long life8_3;
    moom.G2 life10_23;
    forward_join_41: {
    forward_join_40: {
    life8_3 = (moom.HW.j ^ 67453539404545L);
    life10_23 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_915410982ada_invokedynamic2102_1(17408, (1810287346294790024L ^ life8_3)))), ((int)(4)), ((int)(__sourceIntrinsic_915410982ada_invokedynamic2102_2(14245, (2784681186787189800L ^ life8_3)))), ((moom.bs)(p6)));
    if (!(__sourceExactCall_f0d84374f93657(((moom.G2)(life10_23))))) {
        break forward_join_40;
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p1)), ((moom.G2)(life10_23))) == null))) {
        break forward_join_40;
    }
    forwardValue2102_41_0 = new moom.HW(p0, p7, p2, life10_23, p6);
    break forward_join_41;
    }
    forwardValue2102_41_0 = null;
    }
    return forwardValue2102_41_0;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CA")), ((int)(((moom.DC)(net.minecraft.block.Block.b)).a(((java.lang.Object)(this.h))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CB")), ((int)(((moom.DC)(net.minecraft.block.Block.b)).a(((java.lang.Object)(this.i))))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.HW lexicalValue746_25_0;
    int lexicalValue746_204_0;
    int lexicalValue746_334_0;
    int spill746_0;
    moom.HW spill746_1;
    int spill746_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_215;
    int life8_318;
    lexical_join_334: {
    lexical_join_333: {
    lexical_join_291: {
    lexical_join_289: {
    lexical_join_204: {
    lexical_join_39: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.HW.j ^ 20636674226809L);
    life6_5 = moom.G4.b();
    spill746_0 = ((moom.HW)(this)).e;
    if (!((life6_5 != null))) {
        lexicalValue746_204_0 = spill746_0;
        break lexical_join_204;
    }
    if (!((spill746_0 < 0))) {
        break lexical_join_39;
    }
    ((moom.HW)(this)).e = ((int)(((moom.HW)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill746_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue746_25_0 = spill746_1;
        break lexical_join_25;
    }
    if (!((((moom.HW)(spill746_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue746_25_0 = this;
    }
    ((moom.G2)(((moom.HW)(lexicalValue746_25_0)).a)).a(((int)(0)), ((int)((((((moom.HW)(this)).e - ((moom.G2)(((moom.HW)(this)).a)).e) + 4) - 1))), ((int)(0)));
    }
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_12(1611, (1171744425594807482L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_13(4224, (5907251268324684403L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((boolean)(false)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_19(20107, (8169834907426270332L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((boolean)(false)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(1)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_25(20107, (8169834907426270332L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak))))), ((boolean)(false)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_31(29073, (5988670864903344999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_37(24973, (7355118369505444729L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_38(24973, (7355118369505444729L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_39(29073, (5988670864903344999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_50(29073, (5988670864903344999L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_51(29073, (5988670864903344999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_57(20107, (8169834907426270332L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_654639a3f01247(((moom.dN)(net.minecraft.init.Blocks.j))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_654639a3f01247(((moom.dN)(net.minecraft.init.Blocks.j))))), ((boolean)(false)));
    lexicalValue746_204_0 = 1;
    }
    life7_215 = lexicalValue746_204_0;
    lexical_cycle_205: while (true) {
    if (!((life7_215 <= __sourceIntrinsic_5ac1d031d896_invokedynamic746_63(20107, (8169834907426270332L ^ life4_3))))) {
        break lexical_join_289;
    }
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.h)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_65(20107, (8169834907426270332L ^ life4_3)))))))))), ((int)(1)), ((int)(1)), ((int)(life7_215)), ((moom.G2)(p2)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.h)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_70(20107, (8169834907426270332L ^ life4_3)))))))))), ((int)(2)), ((int)(1)), ((int)(life7_215)), ((moom.G2)(p2)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.i)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_75(20107, (8169834907426270332L ^ life4_3)))))))))), ((int)(4)), ((int)(1)), ((int)(life7_215)), ((moom.G2)(p2)));
    ((moom.HW)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.i)).b__fE(((int)(moom.Dr.a(((java.util.Random)(p1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic746_80(20107, (8169834907426270332L ^ life4_3)))))))))), ((int)(5)), ((int)(1)), ((int)(life7_215)), ((moom.G2)(p2)));
    life7_215 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_291;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_205; }
    break lexical_cycle_205;
    }
    }
    life7_215 = 0;
    }
    lexical_cycle_291: while (true) {
    lexical_join_331: {
    lexical_join_330: {
    if (!((life7_215 < __sourceIntrinsic_5ac1d031d896_invokedynamic746_84(5938, (4570280377113146816L ^ life4_3))))) {
        break lexical_join_333;
    }
    spill746_2 = 0;
    if (!((life6_5 != null))) {
        lexicalValue746_334_0 = spill746_2;
        break lexical_join_334;
    }
    life8_318 = spill746_2;
    lexical_cycle_302: while (true) {
    if (!((life8_318 < __sourceIntrinsic_5ac1d031d896_invokedynamic746_85(20107, (8169834907426270332L ^ life4_3))))) {
        break lexical_join_330;
    }
    ((moom.HW)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life8_318)), ((int)(4)), ((int)(life7_215)), ((moom.G2)(p2)));
    ((moom.HW)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d))))), ((int)(life8_318)), ((int)(-1)), ((int)(life7_215)), ((moom.G2)(p2)));
    life8_318 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_331;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_302; }
    break lexical_cycle_302;
    }
    }
    life7_215 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_291; }
    break lexical_cycle_291;
    }
    }
    lexicalValue746_334_0 = 1;
    }
    return ((lexicalValue746_334_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private net.minecraft.block.Block a(java.util.Random p0) {
long local2 = (moom.HW.j ^ 127899209375859L);
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


private static native <E extends Throwable> int __sourceIntrinsic_915410982ada_invokedynamic2102_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_915410982ada_invokedynamic2102_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic746_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4791_0() throws E;

private static native int __sourceExactCall_16df0688de3159(int p0, long p1);
private static native net.minecraft.block.Block __sourceExactCall_c520ab7951a8e1(int p0);
private static native boolean __sourceExactCall_f0d84374f93657(moom.G2 p0);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_7dba7f72a5b74e(net.minecraft.block.Block p0);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_654639a3f01247(moom.dN p0);
}
