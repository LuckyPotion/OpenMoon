package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xL extends net.minecraft.item.Item {

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public xL() { super(); }


private static void __sourceConstructorBody_3b096d30af91f8df(moom.xL receiver) throws Throwable {

long local1 = (moom.xL.n ^ 38716655749857L);

    moom.xL.__sourceConstructorInit_3b096d30af91f8df_0(((moom.xL)(receiver)));

    ((moom.xL)(receiver)).f = ((int)(__sourceIntrinsic_3b096d30af91f8df_originalDynamicSite3532_2(31578, (8790739094057899779L ^ local1))));

    ((moom.xL)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.c)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3b096d30af91f8df_0(moom.xL a0) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(-5973354838492692551L)), ((long)(7188864308425456524L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191807154602039L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xL.n ^ 68062992147956L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1102_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1102_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1102_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1102_14 = new byte[8];
    (__sourceSpill1102_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1102_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1102_16 = __sourceSpill1102_14;
    ((javax.crypto.Cipher)(__sourceSpill1102_11)).init(((int)(__sourceSpill1102_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1102_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1102_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "wó\000´\033dté´M\t\bú#"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1102_25 = local6_life21;
        int __sourceSpill1102_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1102_25)).substring(((int)(__sourceSpill1102_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1102_30 = local8_life19;
        int __sourceSpill1102_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1102_33 = new byte[8];
        (__sourceSpill1102_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1102_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1102_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1102_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1102_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1102_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1102_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1102_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1102_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1102_34)).doFinal(((byte[])(__sourceSpill1102_33)));
        (__sourceSpill1102_30)[__sourceSpill1102_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xL.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1414;
        if (p[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/xL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xL.p[n2] = n3;
        }
        return p[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9696_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4494_31_0;
    int forwardValue4494_40_0;
    int forwardValue4494_47_0;
    int forwardValue4494_51_0;
    int forwardValue4494_125_0;
    boolean spill4494_0;
    int spill4494_1;
    boolean spill4494_2;
    long life9_3;
    int life11_5;
    int life12_93;
    net.minecraft.tileentity.TileEntity life12_129;
    forward_join_125: {
    forward_join_124: {
    forward_join_97: {
    forward_join_87: {
    forward_join_52: {
    forward_join_51: {
    forward_join_47: {
    forward_join_45: {
    forward_join_40: {
    forward_join_36: {
    forward_join_31: {
    forward_join_22: {
    forward_join_11: {
    life9_3 = (moom.xL.n ^ 114344898593481L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((p4 == moom.bs.DOWN))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    spill4494_0 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3))))).a__ch())).a__fn())).b__Boolean();
    if (!((life11_5 != 0))) {
        forwardValue4494_31_0 = ((spill4494_0) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill4494_0))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    forwardValue4494_31_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4494_40_0 = forwardValue4494_31_0;
        break forward_join_40;
    }
    if (!((forwardValue4494_31_0 == 0))) {
        break forward_join_36;
    }
    return ((0) != 0);
    }
    forwardValue4494_40_0 = ((((net.minecraft.block.Block)(net.minecraft.init.Blocks.an)).b__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4494_47_0 = forwardValue4494_40_0;
        break forward_join_47;
    }
    if (!((forwardValue4494_40_0 == 0))) {
        break forward_join_45;
    }
    return ((0) != 0);
    }
    forwardValue4494_47_0 = ((((net.minecraft.world.World)(p2)).G) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4494_51_0 = forwardValue4494_47_0;
        break forward_join_51;
    }
    if (!((forwardValue4494_47_0 != 0))) {
        break forward_join_52;
    }
    forwardValue4494_51_0 = 1;
    }
    return ((forwardValue4494_51_0) != 0);
    }
    if (!((p4 == moom.bs.UP))) {
        break forward_join_87;
    }
    life12_93 = (moom.Dr.b__Int(((double)((((double) (((((net.minecraft.entity.player.EntityPlayer)(p1)).w + 0x1.68p7f) * 0x1.0p4f) / 0x1.68p8f)) + 0x1.0p-1d)))) & __sourceIntrinsic_e8125218b12d_invokedynamic4494_25(10931, (6729112676349103811L ^ life9_3)));
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.an)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.de.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life12_93)))))))), ((int)(3)));
    if (!((life11_5 == 0))) {
        break forward_join_97;
    }
    }
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ax)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.df.R)), ((java.lang.Comparable)(p4))))), ((int)(3)));
    }
    net.minecraft.item.ItemStack __stackOp4494_37_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4494_37_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4494_37_0)).b - 1)));
    life12_129 = ((net.minecraft.world.World)(p2)).a__B9(((moom.DT)(p3)));
    spill4494_1 = ((life12_129 instanceof moom.Ct) ? 1 : 0);
    if (!((life11_5 != 0))) {
        forwardValue4494_125_0 = spill4494_1;
        break forward_join_125;
    }
    if (!((spill4494_1 != 0))) {
        break forward_join_124;
    }
    spill4494_2 = moom.wU.a(((net.minecraft.world.World)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p3)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 != 0))) {
        forwardValue4494_125_0 = ((spill4494_2) ? 1 : 0);
        break forward_join_125;
    }
    if (!((!spill4494_2))) {
        break forward_join_124;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.Ct)(((moom.Ct)(life12_129)))));
    }
    forwardValue4494_125_0 = 1;
    }
    return ((forwardValue4494_125_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_3b096d30af91f8df_originalDynamicSite3532_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9696_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic4494_25(int a0, long a1) throws E;
}
