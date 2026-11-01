package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
abstract class HT extends moom.G4 {

protected int e;

private int f;

private boolean g;

private static long p;

private static long[] r;

private static java.lang.Integer[] t;

private static java.util.Map u;

public HT() {
super();
    this.e = -1;
}


protected HT(moom.H6 p0, int p1) { super(0); }


private static void __sourceConstructorBody_43217ea1307830fd(moom.HT receiver, moom.H6 p0, int p1) throws Throwable {

moom.HT forwardValue394_17_0;

    net.minecraft.entity.Entity[] spill394_0;

    moom.H6 spill394_1;

    long life3_3;

    net.minecraft.entity.Entity[] life5_8;

    forward_join_20: {

    forward_join_17: {

    life3_3 = (moom.HT.p ^ 113793224363161L);

    spill394_0 = moom.G4.b();

    moom.HT.__sourceConstructorInit_43217ea1307830fd_0(((moom.HT)(receiver)), ((int)(p1)));

    life5_8 = spill394_0;

    ((moom.HT)(receiver)).e = ((int)(-1));

    spill394_1 = p0;

    if (!((life5_8 != null))) {

        forwardValue394_17_0 = spill394_1;

        break forward_join_17;

    }

    if (!((spill394_1 != null))) {

        break forward_join_20;

    }

    forwardValue394_17_0 = receiver;

    }

    ((moom.HT)(forwardValue394_17_0)).g = ((boolean)(((moom.H6)(p0)).i));

    }

    return;

}



static {
p = ((long)(((moom._a)(moom._c.a(((long)(5133852481070257768L)), ((long)(4628795112644277365L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175473907301679L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HT.p ^ 42547568812288L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill572_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill572_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill572_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill572_14 = new byte[8];
    (__sourceSpill572_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill572_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation572_16 = __sourceSpill572_14;
    ((javax.crypto.Cipher)(__sourceSpill572_11)).init(((int)(__sourceSpill572_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill572_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation572_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "æ\000»U¼?.¾õYª¼ð?"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill572_25 = local6_life21;
        int __sourceSpill572_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill572_25)).substring(((int)(__sourceSpill572_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill572_30 = local8_life19;
        int __sourceSpill572_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill572_33 = new byte[8];
        (__sourceSpill572_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill572_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill572_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill572_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill572_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill572_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill572_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill572_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill572_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill572_34)).doFinal(((byte[])(__sourceSpill572_33)));
        (__sourceSpill572_30)[__sourceSpill572_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    r = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_43217ea1307830fd_0(moom.HT a0, int a1) throws E;

protected moom.G4 b(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4) {
long life6_3;
    forward_join_59: {
    forward_join_36: {
    forward_join_13: {
    life6_3 = (moom.HT.p ^ 89150115705776L);
    if (!((this.b != null))) {
        break forward_join_59;
    }
    switch ((moom.IE.a)[((moom.bs)(this.b)).ordinal()]) {
case 1:
case 2:
{
        break forward_join_13;
    }
case 3:
case 4:
{
        break forward_join_36;
    }
default:
{
        break forward_join_59;
    }
}
    }
    return __sourceExactCall_20300103841ad8(((moom.H6)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)((((moom.G2)(this.a)).b + p3))), ((int)((((moom.G2)(this.a)).c + p4))), ((moom.bs)(moom.bs.EAST)), ((int)(__sourceExactCall_9db6867ac70f5c(((moom.HT)(this))))));
    }
    return __sourceExactCall_20300103841ad8(((moom.H6)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + p4))), ((int)((((moom.G2)(this.a)).b + p3))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(__sourceExactCall_9db6867ac70f5c(((moom.HT)(this))))));
    }
    return null;
}


protected void b(net.minecraft.world.World p0, net.minecraft.block.state.IBlockState p1, int p2, int p3, int p4, moom.G2 p5) {
java.lang.Object local7 = ((moom.HT)(this)).a(((net.minecraft.block.state.IBlockState)(p1)));
    super.b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(local7)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((moom.G2)(p5)));
    return;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
this.e = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("HPos")))));
    this.f = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("VCount")))));
    this.g = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Desert")))));
    return;
}


protected int c(int p0, int p1) {
return p1;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5, int p6, int p7, net.minecraft.block.state.IBlockState p8, net.minecraft.block.state.IBlockState p9, boolean p10) {
java.lang.Object local12 = ((moom.HT)(this)).a(((net.minecraft.block.state.IBlockState)(p8)));
    java.lang.Object local13 = ((moom.HT)(this)).a(((net.minecraft.block.state.IBlockState)(p9)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((int)(p7)), ((net.minecraft.block.state.IBlockState)(local12)), ((net.minecraft.block.state.IBlockState)(local13)), ((boolean)(p10)));
    return;
}


protected void a(boolean p0) {
this.g = ((boolean)(p0));
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x628F;
        if (t[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HT.t[n2] = n3;
        }
        return t[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_376d8c160f814a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4778_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected static boolean a(moom.G2 p0) {
moom.G2 forwardValue2092_11_0;
    int forwardValue2092_21_0;
    int forwardValue2092_23_0;
    moom.G2 spill2092_0;
    int spill2092_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_11: {
    life1_3 = (moom.HT.p ^ 59899768398073L);
    life3_5 = moom.G4.b();
    spill2092_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2092_11_0 = spill2092_0;
        break forward_join_11;
    }
    if (!((spill2092_0 != null))) {
        break forward_join_22;
    }
    forwardValue2092_11_0 = p0;
    }
    spill2092_1 = ((moom.G2)(forwardValue2092_11_0)).b;
    if (!((life3_5 != null))) {
        forwardValue2092_21_0 = spill2092_1;
        break forward_join_21;
    }
    if (!((spill2092_1 > __sourceIntrinsic_bf326bccd126_invokedynamic2092_3(17432, (6091202248520544737L ^ life1_3))))) {
        break forward_join_22;
    }
    forwardValue2092_21_0 = 1;
    }
    forwardValue2092_23_0 = forwardValue2092_21_0;
    break forward_join_23;
    }
    forwardValue2092_23_0 = 0;
    }
    return ((forwardValue2092_23_0) != 0);
}


protected int a__sourceReturn_6a83d276d7(net.minecraft.world.World p0, moom.G2 p1) {
int forestValue670_19_0;
    int forestValue670_71_0;
    int forestValue670_79_0;
    net.minecraft.entity.Entity[] spill670_0;
    int spill670_1;
    boolean spill670_2;
    long life3_3;
    int life6_5;
    int life7_8;
    net.minecraft.entity.Entity[] life5_9;
    moom.DU life8_13;
    int life9_17;
    int life10_28;
    forest_join_79: {
    forest_join_76: {
    forest_join_71: {
    forest_join_70: {
    life3_3 = (moom.HT.p ^ 16192190938292L);
    life6_5 = 0;
    spill670_0 = moom.G4.b();
    life7_8 = 0;
    life5_9 = spill670_0;
    life8_13 = new moom.DU();
    life9_17 = ((moom.G2)(this.a)).c;
    forest_cycle_18: while (true) {
    forest_join_67: {
    forestValue670_19_0 = life9_17;
    forest_cycle_19: while (true) {
    if (!((forestValue670_19_0 <= ((moom.G2)(this.a)).f))) {
        break forest_join_70;
    }
    spill670_1 = ((moom.G2)(this.a)).a;
    if (!((life5_9 != null))) {
        forestValue670_71_0 = spill670_1;
        break forest_join_71;
    }
    life10_28 = spill670_1;
    forest_cycle_29: while (true) {
    forest_join_65: {
    forest_join_64: {
    if (!((life10_28 <= ((moom.G2)(this.a)).d))) {
        break forest_join_67;
    }
    ((moom.DU)(life8_13)).a(((int)(life10_28)), ((int)(__sourceIntrinsic_1a9979d03dc9_invokedynamic670_10(317, (5673835184390531208L ^ life3_3)))), ((int)(life9_17)));
    if (!((life5_9 != null))) {
        break forest_join_65;
    }
    spill670_2 = ((moom.G2)(p1)).a(((moom.DS)(life8_13)));
    if (!((life5_9 != null))) {
        forestValue670_19_0 = ((spill670_2) ? 1 : 0);
        continue forest_cycle_19;
    }
    if (!(spill670_2)) {
        break forest_join_64;
    }
    life6_5 = (life6_5 + java.lang.Math.max(((int)(((moom.DT)(((net.minecraft.world.World)(p0)).c__DT(((moom.DT)(life8_13))))).b())), ((int)(((moom.EA)(((net.minecraft.world.World)(p0)).v)).a__Int()))));
    life7_8 += 1;
    }
    life10_28 += 1;
    }
    if (!((life5_9 == null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    break forest_cycle_19;
    }
    }
    life9_17 += 1;
    if (!((life5_9 == null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    forestValue670_71_0 = life7_8;
    }
    if (!((life5_9 != null))) {
        forestValue670_79_0 = forestValue670_71_0;
        break forest_join_79;
    }
    if (!((forestValue670_71_0 == 0))) {
        break forest_join_76;
    }
    return -1;
    }
    forestValue670_79_0 = (life6_5 / life7_8);
    }
    return forestValue670_79_0;
}


protected moom.G4 a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4) {
long life6_3;
    forward_join_59: {
    forward_join_36: {
    forward_join_13: {
    life6_3 = (moom.HT.p ^ 58009606242707L);
    if (!((this.b != null))) {
        break forward_join_59;
    }
    switch ((moom.IE.a)[((moom.bs)(this.b)).ordinal()]) {
case 1:
case 2:
{
        break forward_join_13;
    }
case 3:
case 4:
{
        break forward_join_36;
    }
default:
{
        break forward_join_59;
    }
}
    }
    return __sourceExactCall_20300103841ad8(((moom.H6)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)((((moom.G2)(this.a)).b + p3))), ((int)((((moom.G2)(this.a)).c + p4))), ((moom.bs)(moom.bs.WEST)), ((int)(__sourceExactCall_9db6867ac70f5c(((moom.HT)(this))))));
    }
    return __sourceExactCall_20300103841ad8(((moom.H6)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + p4))), ((int)((((moom.G2)(this.a)).b + p3))), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(__sourceExactCall_9db6867ac70f5c(((moom.HT)(this))))));
    }
    return null;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("HPos")), ((int)(this.e)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("VCount")), ((int)(this.f)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Desert")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5) {
int lexicalValue743_14_0;
    int spill743_0;
    long life7_3;
    net.minecraft.entity.Entity[] life9_5;
    int life10_20;
    int life11_30;
    int life12_34;
    int life13_41;
    net.minecraft.entity.passive.EntityVillager life14_74;
    lexical_join_98: {
    lexical_join_14: {
    life7_3 = (moom.HT.p ^ 58047506260525L);
    life9_5 = moom.G4.b();
    spill743_0 = this.f;
    if (!((life9_5 != null))) {
        lexicalValue743_14_0 = spill743_0;
        break lexical_join_14;
    }
    if (!((spill743_0 < p5))) {
        break lexical_join_98;
    }
    lexicalValue743_14_0 = this.f;
    }
    life10_20 = lexicalValue743_14_0;
    lexical_cycle_15: while (true) {
    lexical_join_55: {
    lexical_join_49: {
    if (!((life10_20 < p5))) {
        break lexical_join_98;
    }
    life11_30 = ((moom.HT)(this)).a(((int)((p2 + life10_20))), ((int)(p4)));
    life12_34 = ((moom.HT)(this)).a(((int)(p3)));
    life13_41 = ((moom.HT)(this)).b(((int)((p2 + life10_20))), ((int)(p4)));
    if (!((life9_5 != null))) {
        break lexical_join_55;
    }
    if (!((!((moom.G2)(p1)).a(((moom.DS)(new moom.DT(life11_30, life12_34, life13_41))))))) {
        break lexical_join_49;
    }
    if (!((life9_5 == null))) {
        break lexical_join_98;
    }
    }
    moom.HT __stackOp743_8_0 = this;
    ((moom.HT)(__stackOp743_8_0)).f = ((int)((((moom.HT)(__stackOp743_8_0)).f + 1)));
    }
    life14_74 = new net.minecraft.entity.passive.EntityVillager(p0);
    ((net.minecraft.entity.passive.EntityVillager)(life14_74)).c(((double)((((double) life11_30) + 0x1.0p-1d))), ((double)(((double) life12_34))), ((double)((((double) life13_41) + 0x1.0p-1d))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.passive.EntityVillager)(life14_74)).a(((moom.Eh)(((net.minecraft.world.World)(p0)).a__Eh(((moom.DT)(new moom.DT(life14_74)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.entity.passive.EntityVillager)(life14_74)).m(((int)(((moom.HT)(this)).c(((int)(life10_20)), ((int)(((net.minecraft.entity.passive.EntityVillager)(life14_74)).r__sourceReturn_8abf5c6871()))))));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life14_74)));
    life10_20 += 1;
    if (!((life9_5 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


protected net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.Block forwardValue2094_22_0;
    net.minecraft.block.Block forwardValue2094_27_0;
    net.minecraft.block.Block forwardValue2094_27_1;
    net.minecraft.block.Block forwardValue2094_38_0;
    net.minecraft.block.Block forwardValue2094_38_1;
    net.minecraft.block.Block forwardValue2094_49_0;
    net.minecraft.block.Block forwardValue2094_49_1;
    net.minecraft.block.Block forwardValue2094_64_0;
    net.minecraft.block.Block forwardValue2094_64_1;
    net.minecraft.block.Block forwardValue2094_81_0;
    net.minecraft.block.Block forwardValue2094_81_1;
    net.minecraft.block.state.IBlockState forwardValue2094_86_0;
    net.minecraft.block.Block spill2094_0;
    net.minecraft.block.Block spill2094_1;
    net.minecraft.block.Block spill2094_2;
    net.minecraft.block.state.IBlockState spill2094_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_86: {
    forward_join_85: {
    forward_join_81: {
    forward_join_76: {
    forward_join_64: {
    forward_join_61: {
    forward_join_49: {
    forward_join_46: {
    forward_join_38: {
    forward_join_35: {
    forward_join_27: {
    forward_join_24: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.HT.p ^ 23829084525292L);
    life4_5 = moom.G4.b();
    if (!(this.g)) {
        break forward_join_85;
    }
    spill2094_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    if (!((life4_5 != null))) {
        forwardValue2094_22_0 = spill2094_0;
        break forward_join_22;
    }
    if (!((spill2094_0 != net.minecraft.init.Blocks.r))) {
        break forward_join_21;
    }
    spill2094_1 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    spill2094_2 = net.minecraft.init.Blocks.s;
    if (!((life4_5 != null))) {
        forwardValue2094_27_0 = spill2094_1;
        forwardValue2094_27_1 = spill2094_2;
        break forward_join_27;
    }
    if (!((spill2094_1 == spill2094_2))) {
        break forward_join_24;
    }
    }
    forwardValue2094_22_0 = net.minecraft.init.Blocks.A;
    }
    return ((net.minecraft.block.Block)(forwardValue2094_22_0)).a__fE();
    }
    forwardValue2094_27_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue2094_27_1 = net.minecraft.init.Blocks.e;
    }
    if (!((life4_5 != null))) {
        forwardValue2094_38_0 = forwardValue2094_27_0;
        forwardValue2094_38_1 = forwardValue2094_27_1;
        break forward_join_38;
    }
    if (!((forwardValue2094_27_0 == forwardValue2094_27_1))) {
        break forward_join_35;
    }
    return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.DEFAULT)).a())));
    }
    forwardValue2094_38_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue2094_38_1 = net.minecraft.init.Blocks.f;
    }
    if (!((life4_5 != null))) {
        forwardValue2094_49_0 = forwardValue2094_38_0;
        forwardValue2094_49_1 = forwardValue2094_38_1;
        break forward_join_49;
    }
    if (!((forwardValue2094_38_0 == forwardValue2094_38_1))) {
        break forward_join_46;
    }
    return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a())));
    }
    forwardValue2094_49_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue2094_49_1 = net.minecraft.init.Blocks.ad;
    }
    if (!((life4_5 != null))) {
        forwardValue2094_64_0 = forwardValue2094_49_0;
        forwardValue2094_64_1 = forwardValue2094_49_1;
        break forward_join_64;
    }
    if (!((forwardValue2094_49_0 == forwardValue2094_49_1))) {
        break forward_join_61;
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q))))))));
    }
    forwardValue2094_64_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue2094_64_1 = net.minecraft.init.Blocks.aw;
    }
    if (!((life4_5 != null))) {
        forwardValue2094_81_0 = forwardValue2094_64_0;
        forwardValue2094_81_1 = forwardValue2094_64_1;
        break forward_join_81;
    }
    if (!((forwardValue2094_64_0 == forwardValue2094_64_1))) {
        break forward_join_76;
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q))))))));
    }
    spill2094_3 = p0;
    if (!((life4_5 != null))) {
        forwardValue2094_86_0 = spill2094_3;
        break forward_join_86;
    }
    forwardValue2094_81_0 = ((net.minecraft.block.state.IBlockState)(spill2094_3)).a__ch();
    forwardValue2094_81_1 = net.minecraft.init.Blocks.n;
    }
    if (!((forwardValue2094_81_0 == forwardValue2094_81_1))) {
        break forward_join_85;
    }
    return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE();
    }
    forwardValue2094_86_0 = p0;
    }
    return forwardValue2094_86_0;
}


protected void a(net.minecraft.world.World p0, net.minecraft.block.state.IBlockState p1, int p2, int p3, int p4, moom.G2 p5) {
java.lang.Object local7 = ((moom.HT)(this)).a(((net.minecraft.block.state.IBlockState)(p1)));
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(local7)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((moom.G2)(p5)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4778_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf326bccd126_invokedynamic2092_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a9979d03dc9_invokedynamic670_10(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_376d8c160f814a(int p0, long p1);

private static native moom.G4 __sourceExactCall_20300103841ad8(moom.H6 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
private static native int __sourceExactCall_9db6867ac70f5c(moom.HT p0);
}
