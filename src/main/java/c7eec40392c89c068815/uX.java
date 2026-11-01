package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class uX extends moom.uV {

private net.minecraft.entity.player.EntityPlayer n;

private int o;

private int p;

private final net.minecraft.entity.monster.EntityEnderman q;

private static final long t;

private static final long[] y;

private static final java.lang.Integer[] z;

private static final java.util.Map A;

public uX(net.minecraft.entity.monster.EntityEnderman p0) {
super(p0, net.minecraft.entity.player.EntityPlayer.class, true);
    this.q = p0;
}


static {
t = ((long)(((moom._a)(moom._c.a(((long)(1083827500168120104L)), ((long)(4895081033036573861L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(162040072760344L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uX.t ^ 87547603941327L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1053_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1053_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1053_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1053_14 = new byte[8];
    (__sourceSpill1053_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1053_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1053_16 = __sourceSpill1053_14;
    ((javax.crypto.Cipher)(__sourceSpill1053_11)).init(((int)(__sourceSpill1053_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1053_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1053_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Â\024Su¯lîÎU¾KÜ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1053_25 = local6_life21;
        int __sourceSpill1053_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1053_25)).substring(((int)(__sourceSpill1053_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1053_30 = local8_life19;
        int __sourceSpill1053_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1053_33 = new byte[8];
        (__sourceSpill1053_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1053_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1053_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1053_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1053_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1053_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1053_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1053_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1053_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1053_34)).doFinal(((byte[])(__sourceSpill1053_33)));
        (__sourceSpill1053_30)[__sourceSpill1053_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    y = ((long[])(local8_life19));
    z = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9335_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7A2A;
        if (z[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = y[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])A.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/uX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            uX.z[n2] = n3;
        }
        return z[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uX.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean() {
int forwardValue4190_33_0;
    moom.uX forwardValue4190_35_0;
    moom.uX spill4190_0;
    boolean spill4190_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_21: {
    life1_3 = (moom.uX.t ^ 32273912955573L);
    life3_5 = moom.vN.b();
    spill4190_0 = this;
    if (!((life3_5 == null))) {
        forwardValue4190_35_0 = spill4190_0;
        break forward_join_35;
    }
    if (!((((moom.uX)(spill4190_0)).n != null))) {
        break forward_join_34;
    }
    spill4190_1 = __sourceExactCall_67522a1b61416f(((net.minecraft.entity.monster.EntityEnderman)(this.q)), ((net.minecraft.entity.player.EntityPlayer)(this.n)));
    if (!((life3_5 == null))) {
        forwardValue4190_33_0 = ((spill4190_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill4190_1))) {
        break forward_join_21;
    }
    return ((0) != 0);
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this.q)).b8 = ((boolean)(true));
    ((net.minecraft.entity.monster.EntityEnderman)(this.q)).a(((net.minecraft.entity.Entity)(this.n)), ((float)(0x1.4p3f)), ((float)(0x1.4p3f)));
    forwardValue4190_33_0 = 1;
    }
    return ((forwardValue4190_33_0) != 0);
    }
    forwardValue4190_35_0 = this;
    }
    return __sourceIntrinsic_74e88f4b4822_call4190_14(forwardValue4190_35_0);
}


public void b__Void() {
this.n = ((net.minecraft.entity.player.EntityPlayer)(null));
    ((net.minecraft.entity.monster.EntityEnderman)(this.q)).l(((boolean)(false)));
    java.lang.Object local1 = ((net.minecraft.entity.monster.EntityEnderman)(this.q)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(local1)).b(((moom.vB)(net.minecraft.entity.monster.EntityEnderman.b6)));
    super.b__Void();
    return;
}


public void c() {
moom.uX forestValue900091_23_0;
    moom.uX forestValue900091_23_1;
    net.minecraft.entity.EntityLivingBase forestValue900091_54_0;
    moom.uX forestValue900091_85_0;
    int forestValue900091_98_0;
    moom.uX forestValue900091_126_0;
    net.minecraft.entity.player.EntityPlayer spill900091_0;
    moom.uX spill900091_1;
    moom.uX spill900091_2;
    int spill900091_3;
    moom.uX spill900091_4;
    int spill900091_5;
    boolean spill900091_6;
    moom.uX spill900091_7;
    moom.uX spill900091_8;
    moom.uX spill900091_9;
    int spill900091_10;
    moom.uX spill900091_11;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.ai.attributes.IAttributeInstance life4_52;
    forest_join_127: {
    forest_join_126: {
    forest_join_125: {
    forest_join_98: {
    forest_join_89: {
    forest_join_85: {
    forest_join_84: {
    forest_join_54: {
    forest_join_50: {
    forest_join_23: {
    life1_3 = (moom.uX.t ^ 79446778961942L);
    life3_5 = moom.vN.b();
    spill900091_0 = this.n;
    if (!((life3_5 == null))) {
        forestValue900091_54_0 = spill900091_0;
        break forest_join_54;
    }
    if (!((spill900091_0 != null))) {
        break forest_join_50;
    }
    moom.uX __stackOp900091_3_0 = this;
    spill900091_1 = __stackOp900091_3_0;
    spill900091_2 = __stackOp900091_3_0;
    if (!((life3_5 == null))) {
        forestValue900091_23_0 = spill900091_1;
        forestValue900091_23_1 = spill900091_2;
        break forest_join_23;
    }
    moom.uX __stackOp900091_5_0 = spill900091_1;
    int __stackOp900091_5_1 = (((moom.uX)(spill900091_2)).o - 1);
    spill900091_3 = __stackOp900091_5_1;
    ((moom.uX)(__stackOp900091_5_0)).o = ((int)(__stackOp900091_5_1));
    if (!((spill900091_3 <= 0))) {
        break forest_join_127;
    }
    forestValue900091_23_0 = this;
    forestValue900091_23_1 = this;
    }
    ((moom.uX)(forestValue900091_23_0)).m = ((net.minecraft.entity.EntityLivingBase)(((moom.uX)(forestValue900091_23_1)).n));
    this.n = ((net.minecraft.entity.player.EntityPlayer)(null));
    super.a__Void();
    ((net.minecraft.entity.monster.EntityEnderman)(this.q)).a(((java.lang.String)("mob.endermen.stare")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.entity.monster.EntityEnderman)(this.q)).l(((boolean)(true)));
    life4_52 = ((net.minecraft.entity.monster.EntityEnderman)(this.q)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life4_52)).a(((moom.vB)(net.minecraft.entity.monster.EntityEnderman.b6)));
    if (!((life3_5 != null))) {
        break forest_join_127;
    }
    }
    spill900091_4 = this;
    if (!((life3_5 == null))) {
        forestValue900091_126_0 = spill900091_4;
        break forest_join_126;
    }
    forestValue900091_54_0 = ((moom.uX)(spill900091_4)).m;
    }
    if (!((forestValue900091_54_0 != null))) {
        break forest_join_125;
    }
    spill900091_5 = ((this.m instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_5 == null))) {
        forestValue900091_98_0 = spill900091_5;
        break forest_join_98;
    }
    if (!((spill900091_5 != 0))) {
        break forest_join_89;
    }
    spill900091_6 = __sourceExactCall_67522a1b61416f(((net.minecraft.entity.monster.EntityEnderman)(this.q)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(this.m)))));
    if (!((life3_5 == null))) {
        forestValue900091_98_0 = ((spill900091_6) ? 1 : 0);
        break forest_join_98;
    }
    if (!(spill900091_6)) {
        break forest_join_89;
    }
    spill900091_7 = this;
    if (!((life3_5 == null))) {
        forestValue900091_85_0 = spill900091_7;
        break forest_join_85;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.EntityLivingBase)(((moom.uX)(spill900091_7)).m)).a(((net.minecraft.entity.Entity)(this.q))))), ((double)(0x1.0p4d))) < 0))) {
        break forest_join_84;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this.q)).ac();
    }
    forestValue900091_85_0 = this;
    }
    ((moom.uX)(forestValue900091_85_0)).p = ((int)(0));
    if (!((life3_5 != null))) {
        break forest_join_125;
    }
    }
    spill900091_8 = this;
    if (!((life3_5 == null))) {
        forestValue900091_126_0 = spill900091_8;
        break forest_join_126;
    }
    forestValue900091_98_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(((moom.uX)(spill900091_8)).m)).a(((net.minecraft.entity.Entity)(this.q))))), ((double)(0x1.0p8d)));
    }
    if (!((forestValue900091_98_0 > 0))) {
        break forest_join_125;
    }
    spill900091_9 = this;
    if (!((life3_5 == null))) {
        forestValue900091_126_0 = spill900091_9;
        break forest_join_126;
    }
    moom.uX __stackOp900091_39_0 = spill900091_9;
    moom.uX __stackOp900091_41_0 = __stackOp900091_39_0;
    int __stackOp900091_41_1 = ((moom.uX)(__stackOp900091_39_0)).p;
    spill900091_10 = __stackOp900091_41_1;
    ((moom.uX)(__stackOp900091_41_0)).p = ((int)((__stackOp900091_41_1 + 1)));
    if (!((spill900091_10 >= __sourceIntrinsic_5b7380e7aa7c_invokedynamic900091_43(8434, (5655256154488776732L ^ life1_3))))) {
        break forest_join_125;
    }
    spill900091_11 = this;
    if (!((life3_5 == null))) {
        forestValue900091_126_0 = spill900091_11;
        break forest_join_126;
    }
    if (!(((net.minecraft.entity.monster.EntityEnderman)(((moom.uX)(spill900091_11)).q)).e__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(this.m))))) {
        break forest_join_125;
    }
    this.p = ((int)(0));
    }
    forestValue900091_126_0 = this;
    }
    __sourceIntrinsic_5b7380e7aa7c_call900091_48(forestValue900091_126_0);
    }
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4189_42_0;
    net.minecraft.entity.Entity[] spill4189_0;
    boolean spill4189_1;
    long life1_3;
    double life4_7;
    net.minecraft.entity.Entity[] life3_8;
    java.util.List life6_23;
    forward_join_42: {
    forward_join_35: {
    life1_3 = (moom.uX.t ^ 129644315601444L);
    spill4189_0 = moom.vN.b();
    life4_7 = ((moom.uX)(this)).a__sourceReturn_fedcb3e4d3();
    life3_8 = spill4189_0;
    life6_23 = ((net.minecraft.world.World)(((moom.sI)(this.c)).i)).a(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer.class)), ((moom.CA)(((moom.CA)(((moom.sI)(this.c)).b())).b(((double)(life4_7)), ((double)(0x1.0p2d)), ((double)(life4_7))))), ((com.google.common.base.Predicate)(this.l)));
    ((java.util.List)(life6_23)).sort(((java.util.Comparator)(this.k)));
    spill4189_1 = ((java.util.List)(life6_23)).isEmpty();
    if (!((life3_8 == null))) {
        forwardValue4189_42_0 = ((spill4189_1) ? 1 : 0);
        break forward_join_42;
    }
    if (!(spill4189_1)) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    this.n = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(((java.util.List)(life6_23)).get(((int)(0)))))));
    forwardValue4189_42_0 = 1;
    }
    return ((forwardValue4189_42_0) != 0);
}


public void a__Void() {
long local1 = (moom.uX.t ^ 127291366461976L);
    this.o = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1673_1(5161, (6538354628429131464L ^ local1))));
    this.p = ((int)(0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1673_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9335_0() throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_74e88f4b4822_call4190_14(moom.uX a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic900091_43(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_5b7380e7aa7c_call900091_48(moom.uX a0) throws E;

private static native boolean __sourceExactCall_67522a1b61416f(net.minecraft.entity.monster.EntityEnderman p0, net.minecraft.entity.player.EntityPlayer p1);
}
