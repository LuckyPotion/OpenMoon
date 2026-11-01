package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cN extends net.minecraft.block.Block {

public static final moom.fy Q;

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected cN() {
super(moom.fn.F);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cN.Q, java.lang.Integer.valueOf(0)));
    (this).a(true);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-7613375037257033403L)), ((long)(390771134223836333L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(66427287538881L)))));
    long local11_life6 = (moom.cN.R ^ 122699257807847L);
    U = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill787_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill787_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill787_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill787_14 = new byte[8];
    (__sourceSpill787_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill787_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation787_16 = __sourceSpill787_14;
    ((javax.crypto.Cipher)(__sourceSpill787_11)).init(((int)(__sourceSpill787_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill787_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation787_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[3];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "èLO¤ \001fCxò¿½\021Îès£R\\Hwò"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill787_25 = local4_life21;
        int __sourceSpill787_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill787_25)).substring(((int)(__sourceSpill787_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill787_30 = local6_life19;
        int __sourceSpill787_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill787_33 = new byte[8];
        (__sourceSpill787_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill787_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill787_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill787_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill787_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill787_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill787_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill787_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill787_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill787_34)).doFinal(((byte[])(__sourceSpill787_33)));
        (__sourceSpill787_30)[__sourceSpill787_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    S = ((long[])(local6_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[3]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("bites")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite787_39(22418, (1264277333784322588L ^ local11_life6)))))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cN)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cN.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7096_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
int forwardValue3078_25_0;
    int forwardValue3078_52_0;
    boolean spill3078_0;
    int spill3078_1;
    long life5_3;
    int[] life7_5;
    int life8_31;
    forward_join_53: {
    forward_join_52: {
    forward_join_49: {
    forward_join_25: {
    life5_3 = (moom.cN.R ^ 24603468383406L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3078_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).a__Boolean(((boolean)(false)));
    if (!((life7_5 != null))) {
        forwardValue3078_25_0 = ((spill3078_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill3078_0)) {
        break forward_join_53;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.H)));
    ((net.minecraft.util.FoodStats)(((net.minecraft.entity.player.EntityPlayer)(p3)).a__C2())).a(((int)(2)), ((float)(0x1.99999ap-4f)));
    forwardValue3078_25_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cN.Q))))))).intValue();
    }
    life8_31 = forwardValue3078_25_0;
    spill3078_1 = life8_31;
    if (!((life7_5 != null))) {
        forwardValue3078_52_0 = spill3078_1;
        break forward_join_52;
    }
    if (!((spill3078_1 < __sourceIntrinsic_8d8f2d0ebec8_invokedynamic3078_12(31557, (1622480387676768643L ^ life5_3))))) {
        break forward_join_49;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cN.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life8_31 + 1))))))))), ((int)(3)));
    if (!((life7_5 == null))) {
        break forward_join_53;
    }
    }
    forwardValue3078_52_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3078_52_0);
    }
    return;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3079_17_0;
    int forwardValue3079_21_0;
    int forwardValue3079_23_0;
    boolean spill3079_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.cN.R ^ 42774024964826L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3079_0 = super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3079_17_0 = ((spill3079_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill3079_0)) {
        break forward_join_22;
    }
    forwardValue3079_17_0 = ((((moom.cN)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3079_21_0 = forwardValue3079_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3079_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue3079_21_0 = 1;
    }
    forwardValue3079_23_0 = forwardValue3079_21_0;
    break forward_join_23;
    }
    forwardValue3079_23_0 = 0;
    }
    return ((forwardValue3079_23_0) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xE5D;
        if (T[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = S[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])U.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    U.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/cN", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cN.T[n2] = n4;
        }
        return T[n2];
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
long local3 = (moom.cN.R ^ 102118468775695L);
    return ((__sourceIntrinsic_ce0ab097a994_originalDynamicSite1402_1(31055, (5337621451537948715L ^ local3)) - ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.cN.Q))))))).intValue()) * 2);
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cN.Q))))))).intValue();
}


private boolean c(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch())).a__fn())).b__Boolean())) != 0);
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
float local4 = 0x1.0p-4f;
    float local5 = (((float) (1 + (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cN.Q))))))).intValue() * 2))) / 0x1.0p4f);
    float local6 = 0x1.0p-1f;
    return new moom.CA(((double) (((float) ((moom.DT)(p1)).a()) + local5)), ((double) ((moom.DT)(p1)).b()), ((double) (((float) ((moom.DT)(p1)).c()) + local4)), ((double) (((float) (((moom.DT)(p1)).a() + 1)) - local4)), ((double) (((float) ((moom.DT)(p1)).b()) + local6)), ((double) (((float) (((moom.DT)(p1)).c() + 1)) - local4)));
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
return ((moom.cN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))));
}


public int a(java.util.Random p0) {
return 0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cN.Q});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
float local1 = 0x1.0p-4f;
    float local2 = 0x1.0p-1f;
    ((moom.cN)(this)).a(((float)(local1)), ((float)(0x0.0p0f)), ((float)(local1)), ((float)((0x1.0p0f - local1))), ((float)(local2)), ((float)((0x1.0p0f - local1))));
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
float local3 = 0x1.0p-4f;
    float local4 = (((float) (1 + (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.cN.Q))))))).intValue() * 2))) / 0x1.0p4f);
    float local5 = 0x1.0p-1f;
    ((moom.cN)(this)).a(((float)(local4)), ((float)(0x0.0p0f)), ((float)(local3)), ((float)((0x1.0p0f - local3))), ((float)(local5)), ((float)((0x1.0p0f - local3))));
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
((moom.cN)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)));
    return ((1) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3077_16_0;
    boolean spill3077_0;
    long life5_3;
    int[] life7_5;
    forward_join_17: {
    forward_join_16: {
    life5_3 = (moom.cN.R ^ 18204693974446L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3077_0 = ((moom.cN)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3077_16_0 = ((spill3077_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3077_0))) {
        break forward_join_17;
    }
    forwardValue3077_16_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3077_16_0);
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.player.EntityPlayer p2) {
((moom.cN)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))), ((net.minecraft.entity.player.EntityPlayer)(p2)));
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.aZ;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


public boolean r() {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite787_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7096_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d8f2d0ebec8_invokedynamic3078_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ce0ab097a994_originalDynamicSite1402_1(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
